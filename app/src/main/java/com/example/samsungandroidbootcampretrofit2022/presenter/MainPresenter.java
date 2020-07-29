package com.example.samsungandroidbootcampretrofit2022.presenter;

import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableList;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.example.samsungandroidbootcampretrofit2022.API.APIConfig;
import com.example.samsungandroidbootcampretrofit2022.API.APIService;
import com.example.samsungandroidbootcampretrofit2022.API.APIServiceConstructor;
import com.example.samsungandroidbootcampretrofit2022.API.ResponseData;
import com.example.samsungandroidbootcampretrofit2022.model.CountryData;
import com.example.samsungandroidbootcampretrofit2022.view.IMainView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@InjectViewState
public class MainPresenter extends MvpPresenter<IMainView> {

    private APIService service;
    public ObservableList<CountryData> countryData = new ObservableArrayList<>();
    public ObservableBoolean isLoading = new ObservableBoolean();

    public MainPresenter() {
        service = APIServiceConstructor.CreateService(APIService.class);
        loadData();
    }

    public void loadData() {
        isLoading.set(true);
        Call<ResponseData> call = service.getDataCountry(APIConfig.COUNTRY);
        call.enqueue(new Callback<ResponseData>() {
            @Override
            public void onResponse(Call<ResponseData> call, Response<ResponseData> response) {
                if (response.body() != null) {
                    countryData.clear();
                    countryData.addAll(response.body().getCountryData());
                }
                isLoading.set(false);
            }

            @Override
            public void onFailure(Call<ResponseData> call, Throwable t) {
                getViewState().error();
                isLoading.set(false);
            }
        });
    }
}
