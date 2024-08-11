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



  return (
    <>

      <Routes>
        <Route path="/products" element={<><Form addtolist={theFinallist} /> <List theList={listofproducts} /></>} />
        <Route path="/products/:id" element={<ListDetails />} />
      </Routes >
    </>
  )
}

export default App
