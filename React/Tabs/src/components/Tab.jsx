import React, { useState, useTransition } from 'react'

function Tab() {
     const tabs = ["tab1", "tab2", "tab3"]
     const [content, setcontent] = useState("")

     const showContent = (e) => {
          if (e.target.id === "tab1") {
               setcontent("tab1 batata")
          }
          else if (e.target.id === "tab2") {
               setcontent("tab2 batata batata")
          }
          else if (e.target.id === "tab3") {
               setcontent("tab3 batata batata batata")
          }
          else {
               setcontent("");
          }

     }
     return (
          <div className='border' onClick={showContent}>
               <header>
                    {tabs.map((index, key) => (
                         <h1 key={key} id={index} onClick={showContent}>{index}</h1>
                    ))}
               </header>
               <div>
                    {content}
               </div>
          </div>
     )
}

export default Tab