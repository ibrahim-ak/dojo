import React, { useState } from 'react'
import StyledBox from './StyledDev';

function Boxgenerator() {
     const [color, setColor] = useState("");
     const [colors, setColors] = useState([]);
     const [w, setWidth] = useState();
     const [h, setHeight] = useState();
     const saveColor = (e) => {
          setColor(e.target.value);

     }
     const saveHeight = (e) => {
          setHeight(e.target.value);

     }
     const saveWidth = (e) => {
          setWidth(e.target.value);

     }
     const handelsubmit = (e) => {
          e.preventDefault();
          // console.log(e);


          let obj = {
               c: color
               , w: w,
               h: h
          };

          setColors([...colors, obj]);
          setColor("");
          console.log(colors)
          setWidth("");
          setHeight("");
     }


     return (
          <>
               <div>
                    <form onSubmit={handelsubmit}>
                         <label htmlFor="batata">Color</label>
                         <input type="text" name="batata" value={color} onChange={saveColor} />
                         <label htmlFor="height">height</label>
                         <input type="text" name="height" value={h} onChange={saveHeight} />
                         <label htmlFor="width">width</label>
                         <input type="text" name="width" value={w} onChange={saveWidth} />
                         <button>add</button>
                    </form>
               </div>
               <div style={{ display: 'flex', justifyContent: 'center', maxWidth: '700px', flexWrap: 'wrap' }}>
                    {colors.map((obj, index) => <div key={index}  ><StyledBox bgColor={obj.c} width={obj.w} height={obj.h} /></div>)}

               </div>
          </>
     )
}

export default Boxgenerator