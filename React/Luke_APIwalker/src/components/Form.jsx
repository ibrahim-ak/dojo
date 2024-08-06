import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { useNavigate } from "react-router-dom";
const Form = (props) => {
     const navigate = useNavigate();
     const [categories, setCategories] = useState([])
     const [category, setCategory] = useState('people')
     const [id, setId] = useState(1);
     const [newdata, setNewdata] = useState({});

     useEffect(() => {
          axios.get('https://swapi.dev/api/').then(response => {
               setCategories(Object.keys(response.data))

          })
     }, [])
     useEffect(() => {
          axios.get('https://swapi.dev/api/' + category + "/" + id).then(response => {
               setNewdata(response.data);

          }).catch(err => {
               console.error(err);
               
          });
     }, [category, id])
     const handelSubmit = (e) => {
          e.preventDefault();
          props.datafromform(newdata)
          navigate("/" + category + "/" + id)

     }
     return (
          <>
               <form onSubmit={handelSubmit} >
                    <h4>search for :</h4>
                    <select onChange={(e) => setCategory(e.target.value)}>
                         {categories.map((category, index) => (

                              <option key={index}  >
                                   {category}
                              </option>
                         ))}
                    </select>
                    <div>
                         <input name='id' type="number" min="1" onChange={(e) => setId(e.target.value)} />
                         <label htmlFor="id" > ID</label>
                    </div>
                    <button>search</button>
               </form>

          </>

     )
}

export default Form