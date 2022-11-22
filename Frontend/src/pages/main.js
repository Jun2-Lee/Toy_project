import React from 'react';
import "./main.css";
import sharingPicture from '../assets/img/sharing.png';
import groupBuyingPicture from '../assets/img/groupBuying.png';
import dutchPayPicture from '../assets/img/dutchpay.png';
import { Link } from "react-router-dom";



function Main() {
  return (
    <div className='main_container'>
      <div className='pictureArea'>
        picture area
      </div>
      <Link to="/sharing" className='main_link'>
        <button className='main_sharingBtn'>
          <h1 className='main_pagemoving_head'>재료나눔</h1>
          <h2 className='main_pagemoving_body'>냉장고 속 남은 재료 버리지마시고 나누세요!</h2>
          <img className='main_pagemoving_img' id='sharingPicture' src={sharingPicture}></img>
        </button>
      </Link>
      <Link to="/dutchpay" className='main_link'>
        <button className='main_dutchPayBtn'>
          <h1 className='main_pagemoving_head'>배달비 n빵</h1>
          <h2 className='main_pagemoving_body'>배달비 부담된다면 주변사람들과 n빵 하세요!</h2>
          <img className='main_pagemoving_img' id='dutchPayPicture' src={dutchPayPicture}></img>
        </button>
      </Link>
      <Link to="/groupbuying" className='main_link'>
        <button className='main_groupBuyingBtn'>
          <h1 className='main_pagemoving_head'>공동구매</h1>
          <h2 className='main_pagemoving_body'>혼자 사기에 양이 많다면 공동 구매하세요!</h2>
          <img className='main_pagemoving_img' id='groupBuyingPicture' src={groupBuyingPicture}></img>
        </button>
      </Link>
    </div>
  )
}

export default Main;