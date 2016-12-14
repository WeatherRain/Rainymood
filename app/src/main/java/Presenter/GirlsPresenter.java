package Presenter;

import android.util.Log;

import ModelBean.BasicBean;
import Sourse.DataSourse;
import Sourse.Remote.DataResonse;

/**
 * Created by tinyzo on 2016-12-12.
 */

public class GirlsPresenter implements DataPresenter.Presenter {
    private DataPresenter.View mView;
    private DataResonse mGirlsResponsitory ;

    public GirlsPresenter(DataPresenter.View view) {
        mView = view;
        mGirlsResponsitory = new DataResonse();
    }





    @Override
    public void getGirls(String page, String size, final boolean isRefresh) {
        mGirlsResponsitory.getData(page, size, new DataSourse.DataLoadCallBack() {

            @Override
            public void OnDataLoadBack(BasicBean data) {
                if (isRefresh) {
                    mView.refresh(data.getResults());
                } else {
                    mView.load(data.getResults());
                }
                mView.showNormal();
            }

            @Override
            public void onDataNotAvailable() {
                if (isRefresh) {
                    mView.showError();
                }
            }
        });
    }

    @Override
    public void start() {

    }
}
