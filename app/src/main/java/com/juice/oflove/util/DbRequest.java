package com.juice.oflove.util;

import com.juice.oflove.App;
import com.juice.oflove.entities.dbData.ProfileInfo;
import com.juice.oflove.entities.dbData.UserInfo;

public class DbRequest {

    public static void addUser(UserInfo userInfo) {

        Thread newThread = new Thread(() -> {
            App.getInstance().getDatabase().userDao().addUser(userInfo);
        });
        newThread.start();
    }
    public static void delete(UserInfo userInfo) {

        Thread newThread = new Thread(() -> {
            App.getInstance().getDatabase().userDao().delete(userInfo);
        });
        newThread.start();
    }
    public static void update(UserInfo userInfo) {

        Thread newThread = new Thread(() -> {
            App.getInstance().getDatabase().userDao().updateUserInfo(userInfo);
        });
        newThread.start();
    }

    public static void addProfileInfo(ProfileInfo profileInfo) {

        Thread newThread = new Thread(() -> {
            App.getInstance().getDatabase().userDao().addProfileInfo(profileInfo);
        });
        newThread.start();
    }
    public static void deleteProfileInfo(ProfileInfo profileInfo) {

        Thread newThread = new Thread(() -> {
            App.getInstance().getDatabase().userDao().deleteProfileInfo(profileInfo);
        });
        newThread.start();
    }
    public static void updateProfileInfo(ProfileInfo profileInfo) {

        Thread newThread = new Thread(() -> {
            App.getInstance().getDatabase().userDao().updateProfileInfo(profileInfo);
        });
        newThread.start();
    }
}
