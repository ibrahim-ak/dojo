import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from "react-router-dom";

const ListDetails = () => {
  const [d,setD]=useState({})
  const { id } = useParams();

  const navigate = useNavigate();
  const getBack=(event)=>{
    event.preventDefault();;
    navigate('/products');
  }
console.log(id);


  useEffect(() => {
    axios.get("http://localhost:8000/api/product/"+id).then((res) => {
      setD(res.data.product)
      console.log(res.data.product+"hello")

    }).catch((err) => {
      console.log(err);
    })


  }, [])



  return (
    <div>
      <h1>prduct id : {d.title}</h1>
      <h1>prduct price : {d.price}</h1>
      <h1>prduct description : {d.description}</h1>

        <button onClick={()=>navigate(`/products/${d._id}/edit`) } >edit</button>
        <button onClick={getBack}>Back</button>
      
    </div>
  )
}

export default ListDetails