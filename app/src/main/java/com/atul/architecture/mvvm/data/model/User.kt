package com.atul.architecture.mvvm.data.model

import com.google.gson.annotations.SerializedName

/**
 * our API response will be of the form:
 * [
        {
            "id": "1",
            "name": "Mrs. Nedra Gerhold",
            "avatar": "https://s3.amazonaws.com/uifaces/faces/twitter/to_soham/128.jpg",
            "email": "Lonzo6@hotmail.com"
        },
    ]
 * Therefore there will be 4 parameters for User to get from
 * So, this class represents that.
 */

data class User (
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("name")
    val name: String = "",
    @SerializedName("email")
    val email: String = "",
    @SerializedName("avatar")
    val avatar: String = ""
)
