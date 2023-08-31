import response.*
import response.shedule.postseason.series.SchedulePostseasonSeriesResponse

interface MlbStatsApi {
    fun getAwards(): List<Award>
    fun getConferences(): List<Conference>
    fun getDivisions(): List<Division>
    fun getSports(): List<Sports>
    fun getTeams(): List<Team>

    fun getSchedulePostseasonSeries(): SchedulePostseasonSeriesResponse
}
