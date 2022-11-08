import './App.css';
import 'bootstrap/dist/css/bootstrap.css';
import * as React from 'react'
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Main from './pages/main';
import Signup from './pages/signup';
import Navbar from './components/navbar';

function App() {

  return (
    <div className="page">
      <Navbar />
      

      <div className="body">
        <Router>
          <Routes>
            <Route path='/' element={<Main/>} />
            <Route path='/signup' element={<Signup/>} />
          </Routes>
        </Router>

      </div>
    </div>
  );
}

export default App;
