package response.teams.alumni


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TeamsAlumniResponse(
    @Json(name = "copyright")
    val copyright: String, // Copyright 2023 MLB Advanced Media, L.P.  Use of any content on this page acknowledges agreement to the terms posted here http://gdx.mlb.com/components/copyright.txt
    @Json(name = "people")
    val people: List<People>
)