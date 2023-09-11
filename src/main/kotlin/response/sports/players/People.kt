package response.sports.players


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class People(
    @Json(name = "active")
    val active: Boolean?, // true
    @Json(name = "batSide")
    val batSide: BatSide?,
    @Json(name = "birthCity")
    val birthCity: String?, // La Romana
    @Json(name = "birthCountry")
    val birthCountry: String?, // Dominican Republic
    @Json(name = "birthDate")
    val birthDate: String?, // 1985-12-17
    @Json(name = "birthStateProvince")
    val birthStateProvince: String?, // VA
    @Json(name = "boxscoreName")
    val boxscoreName: String?, // Abad
    @Json(name = "currentAge")
    val currentAge: Int?, // 37
    @Json(name = "currentTeam")
    val currentTeam: CurrentTeam?,
    @Json(name = "draftYear")
    val draftYear: Int?, // 2021
    @Json(name = "firstLastName")
    val firstLastName: String?, // Fernando Abad
    @Json(name = "firstName")
    val firstName: String?, // Fernando
    @Json(name = "fullFMLName")
    val fullFMLName: String?, // Fernando Antonio Abad
    @Json(name = "fullLFMName")
    val fullLFMName: String?, // Abad, Fernando Antonio
    @Json(name = "fullName")
    val fullName: String?, // Fernando Abad
    @Json(name = "gender")
    val gender: String?, // M
    @Json(name = "height")
    val height: String?, // 6' 2"
    @Json(name = "id")
    val id: Int?, // 472551
    @Json(name = "initLastName")
    val initLastName: String?, // F Abad
    @Json(name = "isPlayer")
    val isPlayer: Boolean?, // true
    @Json(name = "isVerified")
    val isVerified: Boolean?, // true
    @Json(name = "lastFirstName")
    val lastFirstName: String?, // Abad, Fernando
    @Json(name = "lastInitName")
    val lastInitName: String?, // Abad, F
    @Json(name = "lastName")
    val lastName: String?, // Abad
    @Json(name = "link")
    val link: String?, // /api/v1/people/472551
    @Json(name = "middleName")
    val middleName: String?, // Antonio
    @Json(name = "mlbDebutDate")
    val mlbDebutDate: String?, // 2010-07-28
    @Json(name = "nameFirstLast")
    val nameFirstLast: String?, // Fernando Abad
    @Json(name = "nameMatrilineal")
    val nameMatrilineal: String?, // Dias
    @Json(name = "nameSlug")
    val nameSlug: String?, // fernando-abad-472551
    @Json(name = "nameSuffix")
    val nameSuffix: String?, // Jr.
    @Json(name = "nameTitle")
    val nameTitle: String?, // Jr.
    @Json(name = "nickName")
    val nickName: String?, // Nandito
    @Json(name = "pitchHand")
    val pitchHand: PitchHand?,
    @Json(name = "primaryNumber")
    val primaryNumber: String?, // 41
    @Json(name = "primaryPosition")
    val primaryPosition: PrimaryPosition?,
    @Json(name = "pronunciation")
    val pronunciation: String?, // uh-BAWD
    @Json(name = "strikeZoneBottom")
    val strikeZoneBottom: Double?, // 1.589
    @Json(name = "strikeZoneTop")
    val strikeZoneTop: Double?, // 3.467
    @Json(name = "useLastName")
    val useLastName: String?, // Abad
    @Json(name = "useName")
    val useName: String?, // Fernando
    @Json(name = "weight")
    val weight: Int? // 235
)