package Sourse;

import ModelBean.BasicBean;

/**
 * Created by tinyzo on 2016-12-09.
 */

public interface DataSourse {
    interface DataLoadCallBack
    {
         void OnDataLoadBack(BasicBean data);
        void onDataNotAvailable();
    }
    void getData(int page, int size, DataLoadCallBack callback);
}
