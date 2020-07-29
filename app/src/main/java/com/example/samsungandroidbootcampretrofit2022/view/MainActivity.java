package com.example.samsungandroidbootcampretrofit2022.view;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.example.samsungandroidbootcampretrofit2022.R;
import com.example.samsungandroidbootcampretrofit2022.databinding.ActivityMainBinding;
import com.example.samsungandroidbootcampretrofit2022.model.CountryData;
import com.example.samsungandroidbootcampretrofit2022.presenter.MainPresenter;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends MvpAppCompatActivity implements IMainView {

    @InjectPresenter
    public MainPresenter presenter;

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setPresenter(presenter);

    }

    @Override
    public void loading() {
    }

    @Override
    public void success(CountryData countryData) {
    }

    @Override
    public void error() {
        Snackbar.make(binding.getRoot(), "Что-то пошло не так =((((",
                Snackbar.LENGTH_LONG).show();
    }
}