import { useState } from 'react'
import './App.css'
import Form from './components/Form'
import Display from './components/Display'
import {
  Routes,
  Route,
  Link
} from "react-router-dom";
function App() {
  const [data, setData] = useState({})

  return (
    <>
    <Form datafromform={setData} />
      <Routes>
        <Route path="/:category/:id" element={<Display dataTodisplay={data} />} />
      </Routes>

    </>
  )
}

export default App
