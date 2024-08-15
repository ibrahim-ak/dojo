import React from 'react'
import { Link } from 'react-router-dom'
import axios from 'axios';

const Home = (props) => {

     const deleteAuthor = (Authorid) => {
          axios.delete('http://localhost:8000/api/author/' + Authorid)
               .then(res => {
                    props.removeFromDom(Authorid)
               })
               .catch(err => console.error(err));
     }
     return (
          <>
               <Link to={"/author/new"}>Add new author</Link>
               <p>We have Quots by :</p>
               <table>
                    <thead>
                         <tr>
                              <th >Author Name</th>
                              <th >Action avaliable</th>

                         </tr>
                    </thead>
                    <tbody>
                         {props.authors.map((author, index) => (
                              <tr key={index}>
                                   <td  > {author.name}</td>
                                   <td  ><Link to={`/author/${author._id}/edit`}><button> edit</button></Link>
                                        <button onClick={()=>deleteAuthor(author._id)}>delete</button> 
                                        </td>

                              </tr>
                         ))}

                    </tbody>

               </table>


          </>
     )
}

export default Home