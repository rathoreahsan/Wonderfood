package net.winnerawan.wonderfood.ui.home.search;

import net.winnerawan.wonderfood.data.db.model.Menu;
import net.winnerawan.wonderfood.ui.base.MvpView;

import java.util.List;

/**
 * Copyright 2017 Winnerawan T
 * Unauthorized copying of this file, via any medium is strictly
 * prohibited Proprietary and confidential
 * Written by Winnerawan T <winnerawan@gmail.com>, September 2017
 */
public interface SearchView extends MvpView {

    void showMenus(List<Menu> menus);
    List<Menu> filterMenu(List<Menu> menus, String query);
}
