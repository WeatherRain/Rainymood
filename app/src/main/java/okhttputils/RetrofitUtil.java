package okhttputils;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.fastjson.FastJsonConverterFactory;
import zoloandgong.rainymood.AppConstans;

/**
 * Created by tinyzo on 2016-12-08.
 */

public class RetrofitUtil  {
      private static Retrofit mRetrofit;
    private static OkHttpClient mOkHttpClient;

    /**
     * 获取Retrofit对象
     *
     * @return
     */
    protected static Retrofit getRetrofit() {

        if (mRetrofit == null) {

            if (mOkHttpClient == null) {
                mOkHttpClient = OkHttpUtil.getmOkHttpClient();
            }
          mRetrofit=new Retrofit.Builder()
                  .baseUrl(AppConstans.ApiUrl + "/")
                  //添加转化库，采用fastjson
                  .addConverterFactory(FastJsonConverterFactory.create())
                  //添加回调库采用rxjava
                  .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                  .client(mOkHttpClient)
                  .build();
        }

        return mRetrofit;
    }
}
