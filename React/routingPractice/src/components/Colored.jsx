import React from 'react'
import { useParams } from "react-router";

function Colored() {
     const { para, color, background } = useParams();
     return (
          <div style={{
               color: color,
               backgroundColor: background
          }}>
               this text is color according to what you route "{para}"
          </div>
     )
}

export default Colored