import './App.css';
import 'bootstrap/dist/css/bootstrap.css';
import * as React from 'react'
import { useState } from 'react';
import logo from './assets/img/logo.png'
import default_profile from './assets/img/default_profile.png'
import chatting_icon from './assets/img/chatting_icon.png'

function App() {
  const [nickName, setNickName] = useState("");
  
  const handleChange = ({ target: { value } }) => setNickName(value);

  const handleSubmit = (event) => {
    event.preventDefault();
  };

  return (
    <div className="page">
      <div className="header">
        <div className="inner">
          <div className="logo"><img className="logoImg" src={logo}/></div>
          <div className="nav_bar">
            <a href="#">공지사항</a>
            <a href="#">재료 나눔</a>
            <a href="#">n빵</a>
            <a href="#">공동구매</a>
            <a href="#">마이페이지</a>
          </div>
          <div className="sub-menu">
            <div className="default_profile"><img className="defaultImg" src={default_profile}/></div>
            <div className="user-menu">
              <a href="#"><span>뭐먹지</span>님</a>
              <span>|</span>
              <a href="#">마이페이지</a>
              <span>|</span>
              <a href="#">로그아웃</a>
            </div>
            <div className="chatting_icon"><img className="chattingImg" src={chatting_icon}/></div>
          </div>
        </div>
      </div>

      <div className="body">
        <form onSubmit={handleSubmit}>
          <div className="ID">
            <label className="form-label">아이디</label>
            <input className="id"/>
          </div>
          
          <div className="PASSWORD">
            <label className="form-label">비밀번호</label>
            <input className="password"/>
          </div>

          <div className="PASSWORD_CHECK">
            <label className="form-label">비밀번호 확인</label>
            <input className="password_check"/>
          </div>

          <div className="nick_name">
            <label className="form-label">닉네임</label>
            <input 
              className="nickName"
              value={nickName}
              onChange={handleChange}
              />
            <button type="submit" className="overlap_check">중복 확인</button>
          </div>

          <div className="profile_upload">
            <label className="form-label">프로필 사진</label>
            <input 
              className="profileUpload"
              />
            {/*<input type="file" accept="image/*"></input>*/}
          </div>

          <div className="address">
            <label className="form-label">사는 동네</label>
            <select className="gu">
              <option value="">구</option>
              <option value="금정">금정구</option>
              <option value="해운대">해운대구</option>
              <option value="동래">동래구</option>
              <option value="연제">연제구</option>
            </select>
            <select className="dong">
            <option value="">동</option>
              <option value="금정">장전동</option>
              <option value="해운대">부곡동</option>
              <option value="동래">구서동</option>
              <option value="연제">노포동</option>
            </select>
          </div>
          
          <div className="submit">
            <input type="submit" className="submit_user_info" value="회원가입"></input>
          </div>
        </form>

      </div>
    </div>
  );
}

export default App;
