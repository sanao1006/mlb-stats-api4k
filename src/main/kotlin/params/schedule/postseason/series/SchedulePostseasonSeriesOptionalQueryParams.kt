package params.schedule.postseason.series

data class SchedulePostseasonSeriesOptionalQueryParams(
    val ver: String? = "v1",
    val gameTypes: String? = null,
    val seriesNumber: String? = null,
    val teamId: String? = null,
    val sportId: String? = null,
    val season: String? = null,
    val fields: String? = null,
) {
    fun toMap(): Map<String, String?> {
        return mapOf(
            "ver" to ver,
            "gameTypes" to gameTypes,
            "seriesNumber" to seriesNumber,
            "teamId" to teamId,
            "sportId" to sportId,
            "season" to season,
            "fields" to fields,
        )
    }
}
