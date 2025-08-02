import React from 'react';
import ListofPlayers from './ListOfPlayers';
import { OddPlayers, EvenPlayers, ListofIndianPlayers, IndianTeam } from './IndianPlayers';

function App() {
  const flag = false; // false to print Indian Players and true to print all players

  const players = [
    { name: 'Jack', score: 50 },
    { name: 'Michael', score: 70 },
    { name: 'John', score: 40 },
    { name: 'Ann', score: 61 },
    { name: 'Elisabeth', score: 61 },
    { name: 'Sachin', score: 95 },
    { name: 'Dhoni', score: 100 },
    { name: 'Virat', score: 84 },
    { name: 'Jadeja', score: 64 },
    { name: 'Raina', score: 75 },
    { name: 'Rohit', score: 80 },
  ];

  if (flag === true) {
    return (
      <div style={{ padding: '20px' }}>
        <ListofPlayers players={players} />
        <hr />
      </div>
    );
  } else {
    return (
      <div style={{ padding: '20px' }}>
        <h1>Indian Team</h1>
        <OddPlayers players={IndianTeam} />
        <hr />
        <EvenPlayers players={IndianTeam} />
        <hr />
        <ListofIndianPlayers IndianPlayers={IndianTeam} />
      </div>
    );
  }
}

export default App;