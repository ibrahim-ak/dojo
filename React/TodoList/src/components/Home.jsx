import React, { useState } from 'react'

const Home = () => {
     const [item, setItem] = useState('')
     const [list, setList] = useState([])
    
     const handelSubmit = (e) => {
          e.preventDefault();
          setList((current) => {
               return [...current,item]
          })
          
          setItem('')
          
     }
     return (
          <>
               <form onSubmit={handelSubmit}>
                    <input type="text" value={item} onChange={(e) => setItem(e.target.value)} />
                    <button >add</button>
               </form>
               <h1>Todo list</h1>
               <ul>
                    {list.map((todo,key)=>(
                         <li key={key}>
                         <label>
                              <input type="checkbox" value={item}  onChange={e=>e.target.value}/>
                              {todo}
                              
                         </label>
                         <button>delete</button>
                    </li>
                    ))}
                    

               </ul>
          </>


     )
}

export default Home