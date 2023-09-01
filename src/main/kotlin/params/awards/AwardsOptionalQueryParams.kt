package params.awards

data class AwardsOptionalQueryParams(
    val ver: String? = null,
    val awardId: String? = null,
    val recipients: Boolean? = null,
    val sportId: String? = null,
    val leagueId: String? = null,
    val season: String? = null,
    val hydrate: String? = null,
    val fields: String? = null
) {
    fun toMap(): Map<String, String?> {
        return mapOf(
            "ver" to ver,
            "awardId" to awardId,
            "recipients" to recipients?.toString(),
            "sportId" to sportId,
            "leagueId" to leagueId,
            "season" to season,
            "hydrate" to hydrate,
            "fields" to fields
        )
    }
}
