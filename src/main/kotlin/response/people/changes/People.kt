package response.people.changes


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class People(
    @Json(name = "active")
    val active: Boolean, // true
    @Json(name = "batSide")
    val batSide: BatSide?,
    @Json(name = "birthCity")
    val birthCity: String?, // Santo Domingo Centro
    @Json(name = "birthCountry")
    val birthCountry: String?, // Dominican Republic
    @Json(name = "birthDate")
    val birthDate: String?, // 1995-11-20
    @Json(name = "birthStateProvince")
    val birthStateProvince: String?, // CA
    @Json(name = "boxscoreName")
    val boxscoreName: String, // Rosario, A
    @Json(name = "currentAge")
    val currentAge: Int?, // 27
    @Json(name = "deathCity")
    val deathCity: String?, // Tampa
    @Json(name = "deathCountry")
    val deathCountry: String?, // USA
    @Json(name = "deathDate")
    val deathDate: String?, // 2022-02-08
    @Json(name = "deathStateProvince")
    val deathStateProvince: String?, // FL
    @Json(name = "draftYear")
    val draftYear: Int?, // 2015
    @Json(name = "firstLastName")
    val firstLastName: String, // Amed Rosario
    @Json(name = "firstName")
    val firstName: String, // German
    @Json(name = "fullFMLName")
    val fullFMLName: String, // German Amed Rosario
    @Json(name = "fullLFMName")
    val fullLFMName: String, // Rosario, German Amed
    @Json(name = "fullName")
    val fullName: String, // Amed Rosario
    @Json(name = "gender")
    val gender: String?, // M
    @Json(name = "height")
    val height: String?, // 6' 2"
    @Json(name = "id")
    val id: Int, // 642708
    @Json(name = "initLastName")
    val initLastName: String, // A Rosario
    @Json(name = "isPlayer")
    val isPlayer: Boolean, // true
    @Json(name = "isVerified")
    val isVerified: Boolean, // true
    @Json(name = "lastFirstName")
    val lastFirstName: String, // Rosario, Amed
    @Json(name = "lastInitName")
    val lastInitName: String, // Rosario, A
    @Json(name = "lastName")
    val lastName: String, // Rosario
    @Json(name = "lastPlayedDate")
    val lastPlayedDate: String?, // 2005-10-02
    @Json(name = "link")
    val link: String, // /api/v1/people/642708
    @Json(name = "middleName")
    val middleName: String?, // Amed
    @Json(name = "mlbDebutDate")
    val mlbDebutDate: String?, // 2017-08-01
    @Json(name = "nameFirstLast")
    val nameFirstLast: String, // Amed Rosario
    @Json(name = "nameMatrilineal")
    val nameMatrilineal: String?, // Valdez
    @Json(name = "nameSlug")
    val nameSlug: String, // amed-rosario-642708
    @Json(name = "nameSuffix")
    val nameSuffix: String?, // Jr.
    @Json(name = "nameTitle")
    val nameTitle: String?, // Jr.
    @Json(name = "nickName")
    val nickName: String?, // Rosie
    @Json(name = "pitchHand")
    val pitchHand: PitchHand?,
    @Json(name = "primaryNumber")
    val primaryNumber: String?, // 31
    @Json(name = "primaryPosition")
    val primaryPosition: PrimaryPosition,
    @Json(name = "pronunciation")
    val pronunciation: String?, // row-SAH-ree-oh
    @Json(name = "strikeZoneBottom")
    val strikeZoneBottom: Double?, // 1.57
    @Json(name = "strikeZoneTop")
    val strikeZoneTop: Double?, // 3.29
    @Json(name = "useLastName")
    val useLastName: String, // Rosario
    @Json(name = "useName")
    val useName: String, // Amed
    @Json(name = "weight")
    val weight: Int? // 190
)