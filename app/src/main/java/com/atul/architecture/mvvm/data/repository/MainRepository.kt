package com.atul.architecture.mvvm.data.repository

import com.atul.architecture.mvvm.data.api.ApiHelper
import com.atul.architecture.mvvm.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {
    fun getUsers():Single<List<User>>{
        return apiHelper.getUsers()
    }
}