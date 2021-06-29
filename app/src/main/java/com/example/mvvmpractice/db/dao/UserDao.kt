package com.example.mvvmpractice.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mvvmpractice.db.entity.UserEntity

@Dao
interface UserDao {

    @Query("SELECT * from user_table ORDER BY name ASC")
    fun getAlphabetizedUsers(): LiveData<List<UserEntity>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(userEntity: UserEntity)

    @Query("DELETE FROM user_table")
    fun deleteAll()

}