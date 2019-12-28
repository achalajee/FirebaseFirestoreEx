package com.example.firebasefirestoreex;

import android.os.Parcel;
import android.os.Parcelable;

public class Event  implements Parcelable {
    private String id;
    private String name;
    private String type;
    private String place;
    private String startTime;
    private String endTime;

    public Event() {
    }

    // Parcelling part
    public Event(Parcel in){
        this.id = in.readString();
        this.name = in.readString();
        this.type =  in.readString();
        this.place =  in.readString();
        this.startTime =  in.readString();
        this.endTime =  in.readString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeString(this.type);
        dest.writeString(this.place);
        dest.writeString(this.startTime);
        dest.writeString(this.endTime);
    }
}
