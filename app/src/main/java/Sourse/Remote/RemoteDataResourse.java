package Sourse.Remote;

import ModelBean.BasicBean;
import Sourse.DataSourse;
import okhttputils.NetService;
import okhttputils.RetrofitUtil;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by tinyzo on 2016-12-09.
 */

public class RemoteDataResourse implements DataSourse {

    @Override
    public void getData(String city, String key, final DataLoadCallBack callback) {
                  RetrofitUtil.getRetrofit()
                          .create(NetService.class)
                          .getData("北京","86590feb4d9f43a790cf49666c410d53")
                          .subscribeOn(Schedulers.io())
                          .observeOn(AndroidSchedulers.mainThread())
                          .subscribe(new Observer<BasicBean>() {
                              @Override
                              public void onCompleted() {

                              }

                              @Override
                              public void onError(Throwable e) {
                                     callback.onDataNotAvailable();
                              }

                              @Override
                              public void onNext(BasicBean basicBean) {
                                       callback.OnDataLoadBack(basicBean);
                              }
                          });

    }
}
