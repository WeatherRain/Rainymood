package ModelBean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by tinyzo on 2016-12-08.
 */

public class BasicBean {

private List<ResultsEntity> results;

    public List<ResultsEntity> getResults() {
        return results;
    }

    public void setResults(List<ResultsEntity> results) {
        this.results = results;
    }

    public static class  ResultsEntity implements Parcelable
  {
      private String name;
      private String passworld;
      public String getName() {
          return name;
      }
      public void setName(String name) {
          this.name = name;
      }
      public String getPassworld() {
          return passworld;
      }
      public void setPassworld(String passworld) {
          this.passworld = passworld;
      }

      @Override
      public int describeContents() {
          return 0;
      }

      @Override
      public void writeToParcel(Parcel dest, int flags) {
          dest.writeString(this.getName());
          dest.writeString(this.getPassworld());

      }
      protected ResultsEntity(Parcel in) {
          this.name = in.readString();
          this.passworld = in.readString();
      }
      public static final Parcelable.Creator<ResultsEntity> CREATOR = new Parcelable.Creator<ResultsEntity>() {
          @Override
          public ResultsEntity createFromParcel(Parcel source) {
              return new ResultsEntity(source);
          }

          @Override
          public ResultsEntity[] newArray(int size) {
              return new ResultsEntity[size];
          }
      };
  }

  }






