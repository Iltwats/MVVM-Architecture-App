package com.atul.architecture.mvvm.data.api

import com.atul.architecture.mvvm.data.model.User
import io.reactivex.Single

interface ApiService {
    fun getUsers() : Single<List<User>>
}