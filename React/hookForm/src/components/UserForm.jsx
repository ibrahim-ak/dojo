import React, { useState } from 'react';

const UserForm = (props) => {
     const [firstname, setFirstname] = useState("");
     const [lastname, setLastname] = useState("");
     const [email, setEmail] = useState("");
     const [password, setPassword] = useState("");
     const [confirmpass, setConfirmpassowrd] = useState("");

     const createUser = (e) => {
          // we must prevent the default refresh of the browser to keep our state from being reset
          e.preventDefault();

          // shorthand ES6 syntax for building an object - see notes above
          const newUser = { firstname, lastname, email, password, confirmpass };
          console.log("Welcome", newUser);
          setFirstname("");
          setLastname("");
          setEmail("");
          setPassword("");
          setConfirmpassowrd("");
     };

     return (
          <>
          <form onSubmit={createUser}>
               <div>
                    <label>first Name: </label>
                    <input type="text" value={firstname} onChange={(e) => setFirstname(e.target.value)} />
               </div>
               <div>
                    <label>last Name: </label>
                    <input type="text" value={lastname} onChange={(e) => setLastname(e.target.value)} />
               </div>
               <div>
                    <label>Email Address: </label>
                    <input type="text" value={email} onChange={(e) => setEmail(e.target.value)} />
               </div>
               <div>
                    <label>Password: </label>
                    <input type="text" value={password} onChange={(e) => setPassword(e.target.value)} />
                    
               </div>
               <div>
                    <label>Confirm password: </label>
                    <input type="text" value={confirmpass} onChange={(e) => setConfirmpassowrd(e.target.value)} />
                    <input type="submit" value="Create User" />
               </div>
          </form>

          <div>
               <h3>your first name {firstname}</h3>
               <h3>your last name {lastname}</h3>
               <h3>eamil: {email}</h3>
               <h3>password {password}</h3>
               <h3>Confirm password {confirmpass}</h3>
          </div>
          </>
     );

};

export default UserForm;


