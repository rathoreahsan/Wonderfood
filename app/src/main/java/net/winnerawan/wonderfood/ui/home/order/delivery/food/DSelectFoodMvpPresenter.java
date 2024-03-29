package net.winnerawan.wonderfood.ui.home.order.delivery.food;

import net.winnerawan.wonderfood.ui.base.MvpPresenter;

/**
 * Copyright 2017 Winnerawan T
 * Unauthorized copying of this file, via any medium is strictly
 * prohibited Proprietary and confidential
 * Written by Winnerawan T <winnerawan@gmail.com>, September 2017
 */
public interface DSelectFoodMvpPresenter<V extends DSelectFoodView> extends MvpPresenter<V> {

    void onViewPrepared();

    void storeOrder(int menu_id, int qty, double price);
}
