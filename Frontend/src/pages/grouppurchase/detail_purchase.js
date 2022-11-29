import './detail_purchase.css';

import React  from 'react';
import default_profile from '../../assets/img/default_profile.png';

function DetailPurchase() {
    return(
      <div>
       
            <div className='detail_Title'>
              <p id = "detail_title">제목</p>
            </div>
      
            <div className='userhelp_detail'>
              <button className = "modify">수정하기</button>
              <button className = "delete">삭제하기</button>
            </div>

        
            <div id = "nowTime">
              {/*{nowTime}*/} 
            </div>

            <div className = "profile">
              <img className = "profileImg"  src={default_profile}>
              </img>
            </div>


          <div className='component_purchase'>
            <div className='detailImg'></div>

            <div className='items_purchase'>

                <div className="category_purchase">
                <label className="detailform">카테고리</label>
                <div
                  className="categoryPurchase"
                  />
              </div>
              <div className="item_purchase">
                <label className="detailform">품목</label>
                <div
                  className="itemPurchase"
                  />
              </div>

              <div className="recruit_purchase">
                <label className="detailform">모집인원</label>
                <div
                  className="recruitPurchase"
                  />
              </div>

              <div className="cost_purchase">
                <label className="detailform">공동구매 비용</label>
                <div 
                  className="costPurchase"
                  />
                <p id='won'>원</p>
              </div>

              <div className="deadline_purchase">
                <label className="detailform">마감일</label>
                <div 
                  className="DeadlinePurchase"
                  />
            </div>
            </div>
        </div>

            <div className="ingredientStatus">
              <label id="IngredientStatus">재료상태</label>
              <br></br>
            <div className="IngredientStatus"/>
            </div>

            <div className="LowerUserHelp">
              <button className = "like">찜</button>
              <button className = "application">신청하기</button>
            </div>    
     
        </div>
        )
}

export default DetailPurchase;