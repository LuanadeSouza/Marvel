package br.com.luanadev.marvel.data.datasource.remote.response

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.squareup.moshi.JsonClass
import retrofit2.http.Url

@JsonClass(generateAdapter = true)
data class CharacterResponse(
    @PrimaryKey
    var id: String = "",
    var name: String = "",
    var description: String = "",
    @Embedded
    var thumbnail: CharacterThumbnail = CharacterThumbnail("", ""),
    @Embedded
    var comics: CharacterComics = CharacterComics(""),
    @Embedded
    var series: CharacterSeries = CharacterSeries(""),
    @Ignore
    var urls: List<Url> = ArrayList(),
)

@JsonClass(generateAdapter = true)
data class CharacterThumbnail(val path: String, val extension: String)

@JsonClass(generateAdapter = true)
data class CharacterUrl(val type: String, val url: String)

@JsonClass(generateAdapter = true)
data class CharacterComics(@ColumnInfo(name = "comic_available") val available: String)

@JsonClass(generateAdapter = true)
data class CharacterSeries(@ColumnInfo(name = "series_available") val available: String)
