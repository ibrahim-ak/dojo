import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Tab from './components/Tab';


function App() {
  const [color, setColor] = useState("");
  return (
    <>
      <Tab/>

    </>
  )
}

export default App
