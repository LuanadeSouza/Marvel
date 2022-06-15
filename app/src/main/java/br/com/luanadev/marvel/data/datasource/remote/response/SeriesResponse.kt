package br.com.luanadev.marvel.data.datasource.remote.response

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SeriesResponse(
    val id: String,
    val title: String,
    val description: String,
    val thumbnail: SeriesThumbnail
)

@JsonClass(generateAdapter = true)
data class SeriesThumbnail(val path: String, val extension: String)