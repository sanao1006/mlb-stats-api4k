package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Matchup(
    @Json(name = "batSide")
    val batSide: BatSide,
    @Json(name = "batter")
    val batter: Batter,
    @Json(name = "batterHotColdZones")
    val batterHotColdZones: List<Any>,
    @Json(name = "pitchHand")
    val pitchHand: PitchHand,
    @Json(name = "pitcher")
    val pitcher: Pitcher,
    @Json(name = "pitcherHotColdZones")
    val pitcherHotColdZones: List<Any>,
    @Json(name = "postOnFirst")
    val postOnFirst: PostOnFirst?,
    @Json(name = "postOnSecond")
    val postOnSecond: PostOnSecond?,
    @Json(name = "postOnThird")
    val postOnThird: PostOnThird?,
    @Json(name = "splits")
    val splits: Splits
)