package br.com.luanadev.marvel.data.datasource.remote.api

import br.com.luanadev.marvel.data.datasource.remote.response.CharacterResponse
import br.com.luanadev.marvel.data.datasource.remote.response.ComicResponse
import br.com.luanadev.marvel.data.datasource.remote.response.SeriesResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MarvelApi {
    @GET("characters")
    suspend fun getAllCharacters(
        @Query("offset") offset: Int? = 0,
        @Query("limit") limit: Int? = 20
    ): CharacterResponse

    @GET("characters")
    suspend fun searchCharacter(
        @Query("nameStartsWith") query: String,
        @Query("offset") offset: Int? = 0,
        @Query("limit") limit: Int? = 20
    ): CharacterResponse

    @GET("characters/{characterId}/comics")
    suspend fun getCharacterComics(
        @Path("characterId") characterId: String,
        @Query("offset") offset: Int? = 0,
        @Query("limit") limit: Int? = 20
    ): ComicResponse

    @GET("characters/{characterId}/series")
    suspend fun getCharacterSeries(
        @Path("characterId") characterId: String,
        @Query("offset") offset: Int? = 0,
        @Query("limit") limit: Int? = 20
    ): SeriesResponse

}