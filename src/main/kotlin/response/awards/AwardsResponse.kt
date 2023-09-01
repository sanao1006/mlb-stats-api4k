package response.awards


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AwardsResponse(
    @Json(name = "awards")
    val awards: List<Award>,
    @Json(name = "copyright")
    val copyright: String // Copyright 2023 MLB Advanced Media, L.P.  Use of any content on this page acknowledges agreement to the terms posted here http://gdx.mlb.com/components/copyright.txt
)