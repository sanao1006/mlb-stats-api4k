package response.person


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class People(
    @Json(name = "active")
    val active: Boolean, // true
    @Json(name = "batSide")
    val batSide: BatSide,
    @Json(name = "birthCity")
    val birthCity: String, // Oshu
    @Json(name = "birthCountry")
    val birthCountry: String, // Japan
    @Json(name = "birthDate")
    val birthDate: String, // 1994-07-05
    @Json(name = "boxscoreName")
    val boxscoreName: String, // Ohtani
    @Json(name = "currentAge")
    val currentAge: Int, // 29
    @Json(name = "firstLastName")
    val firstLastName: String, // Shohei Ohtani
    @Json(name = "firstName")
    val firstName: String, // Shohei
    @Json(name = "fullFMLName")
    val fullFMLName: String, // Shohei Ohtani
    @Json(name = "fullLFMName")
    val fullLFMName: String, // Ohtani, Shohei
    @Json(name = "fullName")
    val fullName: String, // Shohei Ohtani
    @Json(name = "gender")
    val gender: String, // M
    @Json(name = "height")
    val height: String, // 6' 4"
    @Json(name = "id")
    val id: Int, // 660271
    @Json(name = "initLastName")
    val initLastName: String, // S Ohtani
    @Json(name = "isPlayer")
    val isPlayer: Boolean, // true
    @Json(name = "isVerified")
    val isVerified: Boolean, // false
    @Json(name = "lastFirstName")
    val lastFirstName: String, // Ohtani, Shohei
    @Json(name = "lastInitName")
    val lastInitName: String, // Ohtani, S
    @Json(name = "lastName")
    val lastName: String, // Ohtani
    @Json(name = "link")
    val link: String, // /api/v1/people/660271
    @Json(name = "mlbDebutDate")
    val mlbDebutDate: String, // 2018-03-29
    @Json(name = "nameFirstLast")
    val nameFirstLast: String, // Shohei Ohtani
    @Json(name = "nameSlug")
    val nameSlug: String, // shohei-ohtani-660271
    @Json(name = "nickName")
    val nickName: String, // Showtime
    @Json(name = "pitchHand")
    val pitchHand: PitchHand,
    @Json(name = "primaryNumber")
    val primaryNumber: String, // 17
    @Json(name = "primaryPosition")
    val primaryPosition: PrimaryPosition,
    @Json(name = "pronunciation")
    val pronunciation: String, // show-HEY oh-TAWN-ee
    @Json(name = "strikeZoneBottom")
    val strikeZoneBottom: Double, // 1.61
    @Json(name = "strikeZoneTop")
    val strikeZoneTop: Double, // 3.48
    @Json(name = "useLastName")
    val useLastName: String, // Ohtani
    @Json(name = "useName")
    val useName: String, // Shohei
    @Json(name = "weight")
    val weight: Int // 210
)