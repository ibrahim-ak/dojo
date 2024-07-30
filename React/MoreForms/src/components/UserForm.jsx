import React, { useState } from 'react';

const UserForm = (props) => {
     const [username, setUsername] = useState("");
     const [email, setEmail] = useState("");
     const [password, setPassword] = useState("");
     const [hasBeenSubmitted, setHasBeenSubmitted] = useState(false);
     const [usernameerror, setUsernameError] = useState("");
     const [emailerror, setemailError] = useState("");
     const [passworderror, setpasswordError] = useState("");
     const createUser = (e) => {
          // we must prevent the default refresh of the browser to keep our state from being reset
          e.preventDefault();

          // shorthand ES6 syntax for building an object - see notes above

          const newUser = { username, email, password };
          console.log("Welcome", newUser);
          setHasBeenSubmitted(true);
          setEmail("");
          setPassword("");
          setUsername("");


     };
     const nerror = (u, number) => {
          u.preventDefault();
          if (number == 1) {

               setUsername(u.target.value);

               if (u.target.value.length < 3) {
                    setUsernameError("the user name should be at leaset 3 char");
               }
               else {
                    setUsernameError("");

               }
          }
          else if (number == 2) {
               setEmail(u.target.value);

               if (u.target.value.length < 3) {
                    setemailError("the email should be at leaset 5 char");
               }
               else {
                    setemailError("");

               }
          }
          else if (number == 3) {
               setPassword(u.target.value);

               if (u.target.value.length < 3) {
                    setpasswordError("the pass should be at leaset 5 char");
               }
               else {
                    setpasswordError("");
                    
               }
          }
     };
     const formMessage = () => {
          return hasBeenSubmitted ? "Thank you for submitting the form!" : "Welcome, please submit the form";
     };
     return (
          <>
               <h3>{formMessage()}</h3>
               <form onSubmit={createUser}>
                    <div>
                         <label>Username: </label>
                         <input type="text" value={username} onChange={(u) => nerror(u, 1)} />
                         {
                              usernameerror ?
                                   <p>{usernameerror}</p> :
                                   ''
                         }
                    </div>
                    <div>
                         <label>Email Address: </label>
                         <input type="text" value={email} onChange={(u) => nerror(u, 2)} />
                    </div>
                    {
                         emailerror ?
                              <p>{emailerror}</p> :
                              ''
                    }
                    <div>
                         <label>Password: </label>
                         <input type="text" value={password} onChange={(u) => nerror(u, 3)} />
                         {
                              passworderror ?
                                   <p>{passworderror}</p> :
                                   ''
                         }



                         <input type="submit" value="Create User" />
                    </div >
               </form>
               <h3>{username}</h3>
               <h3>{email}</h3>
               <h3>{password}</h3>
          </>
     );
};

export default UserForm;
