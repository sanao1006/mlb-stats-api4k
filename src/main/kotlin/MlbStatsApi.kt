import response.*
import response.jobs.umpires.JobsUmpiresResponse
import response.schedule.postseason.SchedulePostseasonResponse
import response.schedule.postseason.series.SchedulePostseasonSeriesResponse

interface MlbStatsApi {
    fun getAwards(): List<Award>
    fun getConferences(): List<Conference>
    fun getDivisions(): List<Division>
    fun getSports(): List<Sports>
    fun getTeams(): List<Team>
    fun getSchedulePostseasonSeries(): SchedulePostseasonSeriesResponse
    fun getSchedulePostseason(): SchedulePostseasonResponse
    fun getJobsUmpires(): JobsUmpiresResponse
}
