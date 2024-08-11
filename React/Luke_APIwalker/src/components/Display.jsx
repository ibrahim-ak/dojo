import React, { useState } from 'react'

const Display = (props) => {


     return (

          <ul>
               {Object.keys(props.dataTodisplay).slice(0,4).map((index, key) =>
                    <li key={key} ><h4>{index}</h4>{props.dataTodisplay[index]}</li>)}

          </ul>
     )
}

export default Display