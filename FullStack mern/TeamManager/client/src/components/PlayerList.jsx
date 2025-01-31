import React from 'react'
import { Routes, Route, Link } from "react-router-dom";
const PlayerList = () => {
     return (
          <div>
               <h1>batata</h1>
               <Link to={"players/list"} >List</Link>
               <br />
               <Link to={"/players/add"} >Add player</Link>
          </div>
     )
}

export default PlayerList