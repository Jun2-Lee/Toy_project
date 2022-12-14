import React from "react";
import Search from "../../components/search";
import CategoryBar from "../../components/categoryBar";
import GroupbuyingList from "../../components/groupbuyingList";
import "./index.css";

function Groupbuying() {
  return (
    <div className="groupbuying_body">
      <section className="groupbuying_search">
        <Search />
      </section>
      <section className="groupbuying_categoryBar">
        <CategoryBar />
      </section>
      <section className="groupbuyingList">
        <GroupbuyingList />
      </section>
    </div>
  );
}

export default Groupbuying;
