import './App.css';
import 'bootstrap/dist/css/bootstrap.css';
import * as React from 'react'
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Navbar from './components/navbar';
import Main from './pages/main';
import Signup from './pages/signup';
import PostSharing from './pages/post/post_sharing'
import SharingPage from './pages/sharing';
import DutchPayPage from './pages/dutchpay';
import GroupBuyingPage from './pages/groupbuying';

function App() {

  return (
    <div className="page">
      <Navbar />
      <div className="body">
        <Router>
          <Routes>
            <Route path='/' element={<Main/>} />
            <Route path='/signup' element={<Signup/>} />
            <Route path='/postSharing' element={<PostSharing/>} />
            <Route path='/sharing' element={<SharingPage/>} />
            <Route path='/dutchPay' element={<DutchPayPage/>} />
            <Route path='/groupBuying' element={<GroupBuyingPage/>} />
          </Routes>
        </Router>
      </div>
    </div>
  );
}

export default App;
