import React from 'react'
import { useParams } from "react-router";
function RenderPara() {
     const { para } = useParams();
     return (
          isNaN(para) ?

               <h1>hello this is word {para}</h1>
               :
               <h1>this is number {para}</h1>

     )
}

export default RenderPara