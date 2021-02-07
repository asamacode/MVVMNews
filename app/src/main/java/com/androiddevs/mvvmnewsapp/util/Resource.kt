package com.androiddevs.mvvmnewsapp.util


/**
 * Created by A SaMa on 07/02/2021 at 07:52.
 * GGApp
 * tranhuuluong888@gmail.com
 */
sealed class Resource<T>(
    val data: T? = null,
    val message: String? = null
) {
    class Success<T>(data: T?) : Resource<T>(data)
    class Error<T>(message: String?, data: T? = null) : Resource<T>(data, message)
    class Loading<T> : Resource<T>()
}