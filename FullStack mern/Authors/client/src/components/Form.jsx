import React, { useEffect, useState } from 'react'
import axios from 'axios'
import { useNavigate, Link } from 'react-router-dom';

const Form = (props) => {
     const [name, setName] = useState();
     const navigate = useNavigate();
     const [errors, setErrors] = useState([]);

     const handelSubmit = (e) => {
          e.preventDefault();
          axios.post('http://localhost:8000/api/author', {
               name,


          }).then((res) => {
               console.log(res.data)
               props.addAuthor(res.data.Author)
               navigate(-1)


          })
               .catch(err => {
                    console.log("batata")
                    const errorResponse = err.response.data.errors; // Get the errors from err.response.data
                    const errorArr = []; // Define a temp error array to push the messages in
                    for (const key of Object.keys(errorResponse)) { // Loop through all errors and get the messages
                         errorArr.push(errorResponse[key].message)
                    }
                    // Set Errors
                    setErrors(errorArr);
               });


          setName('');
     }
     const handelCancel = (e) => {
          e.preventDefault();
          navigate("/authors")
     }

     return (
          <>
               <Link to={"/authors"}>Home</Link>
               <p>Add a new author:</p>
               <form onSubmit={handelSubmit}>
               {errors.map((err, index) => <p key={index}>{err}</p>)}

                    <label htmlFor="Name">Name:</label>
                    <input type="text" name="Name" onChange={(e) => setName(e.target.value)} />
                    <button>submit</button>
                    <button onClick={handelCancel}>Cancel</button>


               </form>
          </>
     )
}

export default Form