import { useEffect, useState } from 'react'
import './App.css'
import Home from './components/Home'
import {
  Routes,
  Route,
  Link,
} from "react-router-dom";
import Form from './components/Form';
import axios from 'axios';
import Edit from './components/Edit';

function App() {
  const [authors, setAuthors] = useState([])

  useEffect(() => {
    fetchdata();
  }, [])


  const addAuthor = (newAuthor) => {
    setAuthors((authors) => [...authors, newAuthor]);
  };

const fetchdata=()=>{
  axios.get("http://localhost:8000/api/authors").then((res) => {

    console.log(res.data.Authors + "hello")
    setAuthors(res.data.Authors)
  }).catch((err) => {
    console.log(err);
  })
}
const removeFromDom = (authorid) => {
  setAuthors(authors.filter(author => author._id != authorid));
}

  return (
    <>
      <h1>Favorite authors</h1>
      <Routes>
        <Route path='/authors' element={<Home authors={authors} removeFromDom={removeFromDom} />} />
        <Route path='/author/new' element={<Form addAuthor={addAuthor} />} />
        <Route path='/author/:id/edit' element={<Edit fetchdata={fetchdata}/>} />
      </Routes>
    </>
  )
}

export default App
