package com.dengjinwen.basetool.library.view.recyclerView.swipeMenu.interfaces;

import com.dengjinwen.basetool.library.view.recyclerView.swipeMenu.entity.SwipeMenu;

public interface SwipeMenuCreator {

    public void onCreateMenu(SwipeMenu leftMenu,SwipeMenu rightMenu,int position);
}
