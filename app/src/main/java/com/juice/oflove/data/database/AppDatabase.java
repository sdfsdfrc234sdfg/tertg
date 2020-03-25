package com.juice.oflove.data.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.juice.oflove.entities.dbData.ProfileInfo;
import com.juice.oflove.entities.dbData.UserInfo;

@Database(entities = {UserInfo.class, ProfileInfo.class}, version = 7)
public abstract class AppDatabase extends RoomDatabase {

    public abstract UserDao userDao();
}
