package com.example.samsungandroidbootcampretrofit2022.view;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy;
import com.arellomobile.mvp.viewstate.strategy.SingleStateStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;
import com.example.samsungandroidbootcampretrofit2022.model.CountryData;

public interface IMainView extends MvpView {

    @StateStrategyType(value = OneExecutionStateStrategy.class)
    void loading();

    @StateStrategyType(value = SingleStateStrategy.class)
    void success(CountryData countryData);

    @StateStrategyType(value = OneExecutionStateStrategy.class)
    void error();

}
