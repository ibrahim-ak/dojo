import axios from 'axios'
import React, { useState } from 'react'


function AxsiosPokemon() {
     const [pokemon, setPokemon] = useState([]);


     const batata = () => {

          axios.get('https://pokeapi.co/api/v2/pokemon?limit=807&offset=0')
               .then(response => {
                    console.log(response);
                    setPokemon(response.data.results)
               })
               .catch(err => {
                    console.error(err)
               })
     }

     return (
          <>
               <button onClick={batata}>Fetch by axios</button>
               <div>
                    {pokemon.map((pokemon, index) => {
                         return (
                         <div key={index}>{pokemon.name}</div>
                    )
                    })}
               </div>
          </>
     )






}

export default AxsiosPokemon;