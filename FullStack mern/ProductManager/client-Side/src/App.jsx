import { useEffect, useState } from 'react'
import './App.css'
import ListDetails from './components/ListDetails'
import Form from './components/Form'
import List from './components/List'
import {
  Routes,
  Route,
  Link
} from "react-router-dom";
import axios from 'axios'
import Edit from './components/Edit'
function App() {
  const [listofproducts, setListOfProducts] = useState([])


  const theFinallist = (product) => {

    setListOfProducts([...listofproducts, product])
  }

  useEffect(() => {
    axios.get("http://localhost:8000/api/product").then((res) => {
      setListOfProducts(res.data.product)
      console.log(res.data.product)

    }).catch((err) => {
      console.log(err);
    })


  }, [])

  const removeFromDom = productId => {
    setListOfProducts(listofproducts.filter(product => product._id != productId));
}

  return (
    <>

      <Routes>
        <Route path="/products" element={<><Form addtolist={theFinallist} /> <List theList={listofproducts} removeFromDom={removeFromDom} /></>} />
        <Route path="/products/:id" element={<ListDetails  />} />
        <Route path='/products/:id/edit' element={<Edit   />}/>
      </Routes >
    </>
  )
}

export default App
