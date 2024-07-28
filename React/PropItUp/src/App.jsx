
import './App.css'
import PersonCard from './component/PersonCard'

function App() {
  

  return (
    <>
  <PersonCard firstname ={"ibrahim"} lastname = {"khalil"} age={30} haircolor="Bold" />
  <PersonCard  firstname ={"batata"} lastname = {"poteto"} age={3} haircolor="Bold"/>
  <PersonCard firstname ={"tobaco"} lastname = {"scobar"} age={493} haircolor="black"/>
    </>
  )
}

export default App
