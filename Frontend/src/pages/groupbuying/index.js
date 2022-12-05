import React from 'react';
import Search from '../../components/search';
import CategoryBar from '../../components/categoryBar';
import GroupbuyingList from '../../components/groupbuyingList';
import "./index.css";


function Groupbuying() {
  return (
    <div className='groupbuying_body'>
      <div className='search'> <Search/> </div>
      <div className='categoryBar'> <CategoryBar/> </div>
      <div className='groupbuyingList'> <GroupbuyingList /> </div>
    </div>
  )
}

export default Groupbuying;