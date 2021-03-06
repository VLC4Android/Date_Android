package com.mredrock.date.model.bean;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;
import com.mredrock.date.config.Api;

/**
 * Created by Lecion on 5/5/15.
 */
public class Letter implements Parcelable{

    @SerializedName(Api.Key.Letter.LETTER_ID)
    private int letterId;
    @SerializedName(Api.Key.Letter.USER_ID)
    private int userId;
    @SerializedName(Api.Key.Letter.USER_NAME)
    private String userName;
    @SerializedName(Api.Key.Letter.USER_SIGNATURE)
    private String userSignature;
    @SerializedName(Api.Key.Letter.USER_AVATAR)
    private String userAvatar;
    @SerializedName(Api.Key.Letter.USER_GENDER)
    private int userGender;
    @SerializedName(Api.Key.Letter.CONTENT)
    private String content;
    @SerializedName(Api.Key.Letter.DATA_ID)
    private int dateId;
    @SerializedName(Api.Key.Letter.LETTER_STATUS)
    private int letterStatus;
    @SerializedName(Api.Key.Letter.USER_DATE_STATUS)
    private int userDateStatus;
    @SerializedName(Api.Key.Letter.USER_SCORE)
    private double userScore;

    public Letter(Parcel in) {
        letterId = in.readInt();
        userId = in.readInt();
        userName = in.readString();
        userSignature = in.readString();
        userAvatar = in.readString();
        userGender = in.readInt();
        content = in.readString();
        dateId = in.readInt();
        letterStatus = in.readInt();
        userDateStatus = in.readInt();
        userScore = in.readDouble();
    }

    public int getLetterId() {
        return letterId;
    }

    public void setLetterId(int letterId) {
        this.letterId = letterId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSignature() {
        return userSignature;
    }

    public void setUserSignature(String userSignature) {
        this.userSignature = userSignature;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public int getUserGender() {
        return userGender;
    }

    public void setUserGender(int userGender) {
        this.userGender = userGender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getDateId() {
        return dateId;
    }

    public void setDateId(int dateId) {
        this.dateId = dateId;
    }

    public int getLetterStatus() {
        return letterStatus;
    }

    public void setLetterStatus(int letterStatus) {
        this.letterStatus = letterStatus;
    }

    public int getUserDateStatus() {
        return userDateStatus;
    }

    public void setUserDateStatus(int userDateStatus) {
        this.userDateStatus = userDateStatus;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(letterId);
        dest.writeInt(userId);
        dest.writeString(userName);
        dest.writeString(userSignature);
        dest.writeString(userAvatar);
        dest.writeInt(userGender);
        dest.writeString(content);
        dest.writeInt(dateId);
        dest.writeInt(letterStatus);
        dest.writeInt(userDateStatus);
        dest.writeDouble(userScore);
    }

    public static final Parcelable.Creator<Letter> CREATOR = new Parcelable.Creator<Letter>() {
        public Letter createFromParcel(Parcel in) {
            return new Letter(in);
        }

        public Letter[] newArray(int size) {
            return new Letter[size];
        }
    };

    public double getUserScore() {
        return userScore;
    }

    public void setUserScore(double userScore) {
        this.userScore = userScore;
    }

    public class LetterStatus {
        public static final int UNREAD = 1;
        public static final int READ = 2;
    }

    public class UserDataStatus {
        public static final int REJECT = 0;
        public static final int RECEIVE = 1;
        public static final int DEFAULT = 2;
    }

    public class Gender {
        public static final int MALE = 1;
        public static final int FEMALE = 2;

    }

    @Override
    public String toString() {
        return String.format("letterId: %s, userId: %s, userName: %s, userSignature: %s, userAvatar: %s, userGender: %s, " +
                "content: %s, dateId: %s, letterStatus: %s, userDateStatus: %s",
                letterId, userId, userName, userSignature, userAvatar, userGender, content, dateId, letterStatus, userDateStatus);
    }
}