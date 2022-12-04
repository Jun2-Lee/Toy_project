import React from 'react';
import 'bootstrap/dist/css/bootstrap.css';
import './navbar.css';

function navbar() {
  return (
    <div>
      <div className="header">
        <div className="inner">
          <div className="logo"><img className="logoImg" src='assets/img/logo.png'/></div>
          <div className="nav_bar">
            <a href="#">공지사항</a>
            <a href="#">재료 나눔</a>
            <a href="#">n빵</a>
            <a href="#">공동구매</a>
            <a href="#">마이페이지</a>
          </div>
          <div className="sub-menu">
            <div className="default_profile"><img className="defaultImg" src='assets/img/default_profile.png'/></div>
            <div className="user-menu">
              <a href="#"><span>뭐먹지</span>님</a>
              <span>|</span>
              <a href="#">마이페이지</a>
              <span>|</span>
              <a href="#">로그아웃</a>
            </div>
            <div className="chatting_icon"><img className="chattingImg" src='assets/img/chatting_icon.png'/></div>
          </div>
        </div>
      </div>
    </div>
  )
}

export default navbar;