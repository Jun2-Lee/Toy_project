import React from 'react';
import CategoryBar from '../../components/categoryBar';
import Search from '../../components/search';
import SharingList from '../../components/sharingList';
import "./index.css";

function SharingPage() {
  return (
    <div className='sharing_body'>
      <div className='search'> <Search/> </div>
      <div className='categoryBar'> <CategoryBar/> </div>
      <div className='sharingList'> <SharingList/> </div>
    </div>
  )
}

export default SharingPage;