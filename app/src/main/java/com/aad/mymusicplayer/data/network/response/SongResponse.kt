package com.aad.mymusicplayer.data.network.response

import com.google.gson.annotations.SerializedName

data class SongResponse(

	@field:SerializedName("artworkUrl100")
	val artworkUrl100: String,

	@field:SerializedName("trackTimeMillis")
	val trackTimeMillis: Int,

	@field:SerializedName("country")
	val country: String,

	@field:SerializedName("previewUrl")
	val previewUrl: String,

	@field:SerializedName("artistId")
	val artistId: Int,

	@field:SerializedName("trackName")
	val trackName: String,

	@field:SerializedName("collectionName")
	val collectionName: String,

	@field:SerializedName("artistViewUrl")
	val artistViewUrl: String,

	@field:SerializedName("discNumber")
	val discNumber: Int,

	@field:SerializedName("trackCount")
	val trackCount: Int,

	@field:SerializedName("artworkUrl30")
	val artworkUrl30: String,

	@field:SerializedName("wrapperType")
	val wrapperType: String,

	@field:SerializedName("currency")
	val currency: String,

	@field:SerializedName("collectionId")
	val collectionId: Int,

	@field:SerializedName("isStreamable")
	val isStreamable: Boolean,

	@field:SerializedName("trackExplicitness")
	val trackExplicitness: String,

	@field:SerializedName("collectionViewUrl")
	val collectionViewUrl: String,

	@field:SerializedName("trackNumber")
	val trackNumber: Int,

	@field:SerializedName("releaseDate")
	val releaseDate: String,

	@field:SerializedName("kind")
	val kind: String,

	@field:SerializedName("trackId")
	val trackId: Int,

	@field:SerializedName("collectionPrice")
	val collectionPrice: Double,

	@field:SerializedName("discCount")
	val discCount: Int,

	@field:SerializedName("primaryGenreName")
	val primaryGenreName: String,

	@field:SerializedName("trackPrice")
	val trackPrice: Double,

	@field:SerializedName("collectionExplicitness")
	val collectionExplicitness: String,

	@field:SerializedName("trackViewUrl")
	val trackViewUrl: String,

	@field:SerializedName("artworkUrl60")
	val artworkUrl60: String,

	@field:SerializedName("trackCensoredName")
	val trackCensoredName: String,

	@field:SerializedName("artistName")
	val artistName: String,

	@field:SerializedName("collectionCensoredName")
	val collectionCensoredName: String
)
