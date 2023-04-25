import { useState } from "react";
import UserList from "../components/UserList";
import Register from "../components/Register";

const UserContainer = () => {
  const [users, setUsers] = useState([]);
  // start value is an empty array, so users (piece of state) is an array

  return (
    // things returned in order - one after the other 
    <>
      <UserList users={users} />
      <Register users={users} setUsers={setUsers} />
    </>
  );
};

export default UserContainer;
