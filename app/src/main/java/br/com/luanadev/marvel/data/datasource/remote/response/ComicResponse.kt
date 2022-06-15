package br.com.luanadev.marvel.data.datasource.remote.response

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComicResponse(
    val id: String,
    val title: String,
    val description: String,
    val thumbnail: ComicThumbnail
)

@JsonClass(generateAdapter = true)
data class ComicThumbnail(val path: String, val extension: String)
