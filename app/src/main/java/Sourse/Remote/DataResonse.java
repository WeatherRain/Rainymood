package Sourse.Remote;

import Sourse.DataSourse;

/**
 * Created by tinyzo on 2016-12-09.
 */

public class DataResonse implements DataSourse {
  /*  private RemoteDataResourse mRemoteDataResouse;
    public DataResonse()
    {
        mRemoteDataResouse=new RemoteDataResourse();
    }
    @Override
    public void getData(String city, String key, DataLoadCallBack callback) {
      mRemoteDataResouse.getData("北京","86590feb4d9f43a790cf49666c410d53",callback);
    }*/
    private RemoteDataResourse mRemoteGirlsDataSource;

    public DataResonse() {
        mRemoteGirlsDataSource = new RemoteDataResourse();
    }


    @Override
    public void getData(String city, String key, DataLoadCallBack callback) {
        mRemoteGirlsDataSource.getData("北京","86590feb4d9f43a790cf49666c410d53",callback);
    }
}
