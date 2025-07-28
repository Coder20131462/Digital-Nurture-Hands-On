import React from 'react';
import Posts from './Posts'; 
import './App.css'; 
function App() {
  return (
    <div className="App">
      <header className="App-header">
        <h2>Check out the latest blog posts!</h2>
      </header>
      <main>
        <Posts />
      </main>
    </div>
  );
}

export default App;