
import React from 'react'

import { useState } from 'react'

export default function Card(props) {
     const [count,setCount]=useState(props.age)
     const handleClick = () => {
          setCount(count + 1);
      }
     return (
          <div>
               <h1>name :{props.firstname}</h1>
               <h2>age :{count}</h2>
               <h2>haircolor:{props.haircolor}</h2>
               <button onClick={handleClick}>birthday button for {props.firstname} </button>
          </div>
     )
}
