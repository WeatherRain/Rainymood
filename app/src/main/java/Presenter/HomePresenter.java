package Presenter;

import android.util.Log;

import ModelBean.BasicBean;
import Sourse.DataSourse;
import Sourse.Remote.DataResonse;

/**
 * Created by tinyzo on 2016-12-09.
 */

public class HomePresenter implements DataPresenter.Presenter {
    private  DataPresenter.View  mView;
     private DataResonse mResponse;
    public HomePresenter(DataPresenter.View view) {
        mView = view;
        mResponse = new DataResonse();
    }


    @Override
    public void getGirls(String city, String key,final boolean isRefresh) {
        mResponse.getData(city, key, new DataSourse.DataLoadCallBack() {

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
      getGirls("北京","86590feb4d9f43a790cf49666c410d53",true);
    }
}
