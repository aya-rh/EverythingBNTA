import { useState } from "react";

const Register = ({ users, setUsers }) => {
  const [username, setUsername] = useState("");
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [confirmPassword, setConfirmPassword] = useState("");

  const [error, setError] = useState("");

  const handleValidation = () => {
    let errorMessage = ""

    // let failedValidation = false;

    // check username - if it finds one with the same username it will fail
    if (users.find((user)=> user.username === username)) {
      // failedValidation = true;
      errorMessage = "This username already exists"
    }
    // check password = confirm password
    if (password != confirmPassword) {
      // failedValidation = true;
      errorMessage = "Passwords do not match"
    }

    // chech none of them are blank
    if (username === '' || email === '' || password === ''){
      // failedValidation = true; 
      errorMessage = "Please fill in all fields"
    }
    // order matters, go from least important to most important

    // return failedValidation;
    setError(errorMessage)
    return  errorMessage !== ""
    // even though error message is a string, we are still returning a boolean (true if message is not empty and false otherwise)
  }

  const handleSubmit = (event) => {
    // stop the page refresh default on submit 
    event.preventDefault();

    if (!handleValidation()) {
      let updatedUsers = [...users]; 
      
      updatedUsers.push(
        {
          username, email, password, confirmPassword
        }
      )

      setUsers(updatedUsers);
    }
  }
  
  return (
    // can return anything without brackets if it was only one line
    // value = the input of the box - can't be changed 
    // onChange = allows us to now change above value - have to use event (e)

    // value and onchange allow us to chnage the state and allows us to block certain characters etc

    // submit refreshes page on default but we can turn off later via prevent default
    <>
      <h2>Sign up</h2>

      <form onSubmit={handleSubmit}>
        <input 
          type="text" 
          name="username" 
          placeholder="Username" 
          value={username}
          onChange={(e)=>{setUsername(e.target.value)}}
        />

        <input type="text" name="email" placeholder="Email" value={email} onChange={(e)=>{setEmail(e.target.value)}} />
        <input type="password" name="password" placeholder="Password" value={password} onChange={(e)=>{setPassword(e.target.value)}} />
        <input type="password" name="confirmPassword" placeholder="Confirm Password" value={confirmPassword} onChange={(e)=>{setConfirmPassword(e.target.value)}} />
        <input type="submit" value='Submit' />

      </form>
      
      {/* <p>{error}</p> */}
      {error !== "" ? <p>{error}</p> : <></>}
    </>
    // this turnary operator above for error makes it disappear from the console but still does what its supposed to do
    // translates to "is the error not an empty string, if it is empty show/carry out the error, otherwise make it disappear from the console
  )
};
// turnary operator - a simplified if statement tells you if something is true or not

export default Register;
