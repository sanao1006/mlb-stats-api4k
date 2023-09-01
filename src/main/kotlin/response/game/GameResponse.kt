package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GameResponse(
    @Json(name = "copyright")
    val copyright: String, // Copyright 2023 MLB Advanced Media, L.P.  Use of any content on this page acknowledges agreement to the terms posted here http://gdx.mlb.com/components/copyright.txt
    @Json(name = "gameData")
    val gameData: GameData,
    @Json(name = "gamePk")
    val gamePk: Int, // 324707
    @Json(name = "link")
    val link: String, // /api/v1.1/game/324707/feed/live
    @Json(name = "liveData")
    val liveData: LiveData,
    @Json(name = "metaData")
    val metaData: MetaData
)