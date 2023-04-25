import User from "./User";

const UserList = ({ users }) => {
  const userComponents = users.map((user, index) => {
    return <User user={user} key={index} />;
    // key is a way to uniquely indefity that its a list 
  });

  return <ul>{userComponents}</ul>;
  // list returns the object above 
};

export default UserList;
