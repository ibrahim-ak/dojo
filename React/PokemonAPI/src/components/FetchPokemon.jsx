import React from 'react'
import { useState } from 'react';
function FetchPokemon() {
     const [pokemon, setPokemon] = useState([]);

     const batata = () => {
          fetch("https://pokeapi.co/api/v2/pokemon?limit=807&offset=0")
               .then(response => {
                    console.log(response);
                    return response.json();
               }).then(response => {
                    setPokemon(response.results);
                    console.log(response);
                    console.log(response.results);
               }).catch(err => {
                    console.log(err);
               });


     }

     return (
          <>
               <button onClick={() => batata()}>fetch data</button>

               <div>
                    {pokemon.map((pokemon, index) => {
                         return (<div key={index}>{pokemon.name}</div>)
                    })}
               </div>
          </>
     )
}

export default FetchPokemon