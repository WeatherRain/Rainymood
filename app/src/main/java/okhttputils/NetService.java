package okhttputils;

import ModelBean.BasicBean;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by tinyzo on 2016-12-08.
 */

public interface NetService {

    //http://gank.io/api/data/api/data/{type}/{count}/{page}
    @GET("/now/{city}/{key}")
    Observable<BasicBean> getData(
            @Path("city") String city,
            @Path("key") String key
           // @Path("page") int page
    );
}
