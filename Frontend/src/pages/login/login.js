
import './login.css';
import {useState} from 'react';
import {BrowserRouter as Router, Route,  Link} from "react-router-dom";


function Login() {
  
  

  return (
    <div className="App">
      <div className='main'>
      
        <p  id ="txtid">아이디</p>
        <input type  = "text" id = "ID"/><br/>

        <p id ="txtpassword">비밀번호</p>
        <input type = "text" id ="password"/><br/>
        
        <button id ='btn' >저장하기</button>
        
        <div id = "find">비밀번호 찾기 </div>
        
        <div id = "Join"> 회원가입 </div>

        <button id = 'naverlog'> 네이버로 로그인 </button>
        <button id = 'kakaolog'> 카카오로 로그인 </button>
        <button id = 'ggllog'> 구글로 로그인 </button>
      </div>
    </div>
    

  )
} 



export default Login;
