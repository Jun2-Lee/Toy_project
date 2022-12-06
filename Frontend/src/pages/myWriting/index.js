import React from 'react';
import MyWritingList from '../../components/myWritingList';
import ShortcutBar from '../../components/shortcutBar';
import "./index.css";

function MyWriting() {
  return (
    <div className='myWriting_body'>
      <div className='shortcutBar'> <ShortcutBar /> </div>
      <div className='myWritingList'> <MyWritingList /> </div>
    </div>
  )
}

export default MyWriting;