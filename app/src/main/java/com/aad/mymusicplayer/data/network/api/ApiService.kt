package com.aad.mymusicplayer.data.network.api

import com.aad.mymusicplayer.data.network.response.SongResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("search")
    fun getListSong(
        @Query("term") songsearch: String
    ): Call<SongResponse>
}