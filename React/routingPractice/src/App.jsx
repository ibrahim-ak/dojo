import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import {
  Routes,
  Route,
  Link
} from "react-router-dom";
import Home from './components/Home';
import RenderPara from './components/RenderPara';
import Colored from './components/Colored';

function App() {

  return (
    <>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/:para" element={<RenderPara/>}/>
        <Route path="/:para/:color/:background" element={<Colored/>}/>
      </Routes>
    </>
  )
}

export default App
