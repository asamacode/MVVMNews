package com.androiddevs.mvvmnewsapp.db

import androidx.room.TypeConverter
import com.androiddevs.mvvmnewsapp.db.models.Source


/**
 * Created by A SaMa on 06/02/2021 at 17:04.
 * GGApp
 * tranhuuluong888@gmail.com
 */
class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}