package response.team.alumni


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class People(
    @Json(name = "active")
    val active: Boolean, // true
    @Json(name = "alumniLastSeason")
    val alumniLastSeason: String, // 2022
    @Json(name = "batSide")
    val batSide: BatSide,
    @Json(name = "birthCity")
    val birthCity: String, // Yorba Linda
    @Json(name = "birthCountry")
    val birthCountry: String, // USA
    @Json(name = "birthDate")
    val birthDate: String, // 1994-09-11
    @Json(name = "birthStateProvince")
    val birthStateProvince: String?, // CA
    @Json(name = "boxscoreName")
    val boxscoreName: String, // Aguilar, R
    @Json(name = "currentAge")
    val currentAge: Int, // 28
    @Json(name = "draftYear")
    val draftYear: Int?, // 2016
    @Json(name = "firstLastName")
    val firstLastName: String, // Ryan Aguilar
    @Json(name = "firstName")
    val firstName: String, // Ryan
    @Json(name = "fullFMLName")
    val fullFMLName: String, // Ryan Aguilar
    @Json(name = "fullLFMName")
    val fullLFMName: String, // Aguilar, Ryan
    @Json(name = "fullName")
    val fullName: String, // Ryan Aguilar
    @Json(name = "gender")
    val gender: String, // M
    @Json(name = "height")
    val height: String, // 6' 2"
    @Json(name = "id")
    val id: Int, // 666922
    @Json(name = "initLastName")
    val initLastName: String, // R Aguilar
    @Json(name = "isPlayer")
    val isPlayer: Boolean, // true
    @Json(name = "isVerified")
    val isVerified: Boolean, // false
    @Json(name = "lastFirstName")
    val lastFirstName: String, // Aguilar, Ryan
    @Json(name = "lastInitName")
    val lastInitName: String, // Aguilar, R
    @Json(name = "lastName")
    val lastName: String, // Aguilar
    @Json(name = "link")
    val link: String, // /api/v1/people/666922
    @Json(name = "middleName")
    val middleName: String?, // Antonio
    @Json(name = "mlbDebutDate")
    val mlbDebutDate: String, // 2022-08-26
    @Json(name = "nameFirstLast")
    val nameFirstLast: String, // Ryan Aguilar
    @Json(name = "nameMatrilineal")
    val nameMatrilineal: String?, // Rojas
    @Json(name = "nameSlug")
    val nameSlug: String, // ryan-aguilar-666922
    @Json(name = "nickName")
    val nickName: String?, // Frankie
    @Json(name = "pitchHand")
    val pitchHand: PitchHand,
    @Json(name = "primaryNumber")
    val primaryNumber: String?, // 39
    @Json(name = "primaryPosition")
    val primaryPosition: PrimaryPosition,
    @Json(name = "pronunciation")
    val pronunciation: String?, // bree-SEN-yo
    @Json(name = "strikeZoneBottom")
    val strikeZoneBottom: Double, // 1.589
    @Json(name = "strikeZoneTop")
    val strikeZoneTop: Double, // 3.467
    @Json(name = "useLastName")
    val useLastName: String, // Aguilar
    @Json(name = "useName")
    val useName: String, // Ryan
    @Json(name = "weight")
    val weight: Int // 168
)