package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Defense(
    @Json(name = "batter")
    val batter: Batter,
    @Json(name = "battingOrder")
    val battingOrder: Int, // 3
    @Json(name = "catcher")
    val catcher: Catcher,
    @Json(name = "center")
    val center: Center,
    @Json(name = "first")
    val first: First,
    @Json(name = "inHole")
    val inHole: InHole,
    @Json(name = "left")
    val left: Left,
    @Json(name = "onDeck")
    val onDeck: OnDeck,
    @Json(name = "pitcher")
    val pitcher: Pitcher,
    @Json(name = "right")
    val right: Right,
    @Json(name = "second")
    val second: Second,
    @Json(name = "shortstop")
    val shortstop: Shortstop,
    @Json(name = "team")
    val team: Team,
    @Json(name = "third")
    val third: Third
)