package Presenter;

import java.util.List;

import ModelBean.BasicBean;

/**
 * Created by tinyzo on 2016-12-09.
 */

public interface DataPresenter  {
    interface View extends BaseView  {
        void refresh(List<BasicBean.ResultsEntity> datas);

        void load(List<BasicBean.ResultsEntity> datas);

        void showError();

        void showNormal();
    }

    interface Presenter extends BasePresenter {
        void getGirls(String page, String  size, boolean isRefresh);
    }
}
