import React from 'react'
import {
     Link
} from "react-router-dom";
import axios from 'axios'

const List = (props) => {

     const { removeFromDom } = props;

     const deletePerson = (personId) => {
          axios.delete('http://localhost:8000/api/product/' + personId)
               .then(res => {
                    removeFromDom(personId)
               })
               .catch(err => console.error(err));
     }
     return (
          <div>
               <h1>batata</h1>
               <ul>
                    {props.theList.map((product, key) => (
                         <li key={key}> <Link to={`/products/${product._id}`}>{product.title} </Link> <button onClick={() => { deletePerson(product._id) }}>
                              Delete
                         </button></li>
                    ))}
               </ul>
          </div>
     )
}

export default List
