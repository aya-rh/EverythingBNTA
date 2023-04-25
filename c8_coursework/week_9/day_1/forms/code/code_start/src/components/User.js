const User = ({ user }) => {
  // takes in a key but isn't passed here as its something that react uses
  return (
    // user is stored as a li as userComponents is a declared ul
    <li>
      {user.username} - {user.email}
    </li>
  );
};

export default User;
