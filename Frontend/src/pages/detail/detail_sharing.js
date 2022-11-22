
import './detail_sharing.css';

import React  from 'react';
import default_profile from '../../assets/img/default_profile.png';
//import moment from 'moment';
//import 'moment/locale/ko';

import { useRef, useEffect } from "react";


function DetailSharing() {
  //const nowTime = moment().format('YYYY-MM-DD');
  return(
  <div className='App'>
    <div className='main'>
      <p id = "title">제목</p>
      
      <button id = "modify">수정하기</button>
      <button id = "delete">삭제하기</button>
    </div>
   <div id = "nowTime">
   {/*{nowTime}*/} 
   </div>
   <div className = "profile">
    <img className = "profileImg"  src={default_profile}>

    </img>

    <div className='main2'></div>
    <div>
      <table>
        <tr>
          <td style={{lineHeight:"580%"}} id ="name">
            카테고리<br/>품목<br/>유통기한<br/>마감일<br/>
          </td>
        </tr>
      </table>
      <p id = "state">재료 상태</p>
      <div className="showState"></div>
      <div>
        <button id = "like">찜</button>
        <button id = "application">신청하기</button>
      </div>
      </div>
      

      
    </div>
   </div>


    
  
  )
}

export default DetailSharing;
