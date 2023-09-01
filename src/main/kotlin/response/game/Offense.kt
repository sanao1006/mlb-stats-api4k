package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Offense(
    @Json(name = "batter")
    val batter: Batter,
    @Json(name = "battingOrder")
    val battingOrder: Int, // 8
    @Json(name = "inHole")
    val inHole: InHole,
    @Json(name = "onDeck")
    val onDeck: OnDeck,
    @Json(name = "pitcher")
    val pitcher: Pitcher,
    @Json(name = "team")
    val team: Team
)