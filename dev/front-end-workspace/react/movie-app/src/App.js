import React from "react";
import './App.css';

function LikeFood(props) {
    return (
        <div>
            <h2> I like {props.name}</h2>
            <img src={props.image} alt={props.name} />
        </div>
    );
}

const foods = [
    {
        name: 'hamburger',
        image: 'https://place-hold.it/100x200'
    },
    {
        name: 'pizza',
        image: 'https://place-hold.it/100x200'
    },
    {
        name: 'pasta',
        image: 'https://place-hold.it/100x200'
    },
    {
        name: 'chicken',
        image: 'https://place-hold.it/100x200'
    }
];

function App() {
    return (
        <div className="App">
            <header className="App-header">
                <div>
                    <h1>Hello React</h1>
                    {foods.map((food) => (
                        <LikeFood name={food.name} image={food.image} />
                    ))}
                </div>
            </header>
        </div>
    );
}

export default App;
