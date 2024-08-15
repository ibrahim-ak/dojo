import React, { useEffect, useState } from 'react'
import axios from 'axios'
import { useNavigate, Link, useParams } from 'react-router-dom';

const Edit = (props) => {
     const [name, setName] = useState();
     const navigate = useNavigate();
     const { id } = useParams();
     const [errors, setErrors] = useState([]);



     useEffect(() => {
          axios.get('http://localhost:8000/api/author/' + id)
               .then(res => {
                    console.log(res.data)
                    setName(res.data.Author.name)
               })
     }, []);

     const handelSubmit = (e) => {
          e.preventDefault();
          axios.patch('http://localhost:8000/api/author/' + id, {
               name,


          }).then((res) => {
               console.log(res.data)
               props.fetchdata()
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
                    <input type="text" name="Name" value={name} onChange={(e) => setName(e.target.value)} />
                    <button onClick={handelCancel}>Cancel</button>
                    <button>submit</button>


               </form>
          </>
     )
}

export default Edit