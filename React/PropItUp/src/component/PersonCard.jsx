
import React from 'react'

export default function PersonCard(props) {
     return (
          <div>
               <h1>{props.firstname}, {props.lastname}</h1>
               <h2>Age :{props.age}</h2>
               <h2>hair color:{props.haircolor}</h2>
          </div>
     )
}
