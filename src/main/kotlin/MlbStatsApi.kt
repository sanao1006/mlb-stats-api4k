import params.awards.AwardsOptionalQueryParams
import response.*
import response.jobs.datacasters.JobsDatacastersResponse
import response.jobs.officialScorers.JobsOfficialScorersResponse
import response.jobs.umpires.JobsUmpiresResponse
import response.schedule.postseason.SchedulePostseasonResponse
import response.schedule.postseason.series.SchedulePostseasonSeriesResponse

interface MlbStatsApi {
    /**
     * Endpoint `/awards`
     */
    fun getAwards(awardsOptionalQueryParams: AwardsOptionalQueryParams = AwardsOptionalQueryParams()): List<Award>

    /**
     * Endpoint `/conferences`
     */
    fun getConferences(): List<Conference>

    /**
     * Endpoint `/divisions`
     */
    fun getDivisions(): List<Division>

    /**
     * Endpoint `/sports`
     */
    fun getSports(): List<Sports>

    /**
     * Endpoint `/teams`
     */
    fun getTeams(): List<Team>

    /**
     * Endpoint `/schedule/postseason/series`
     */
    fun getSchedulePostseasonSeries(): SchedulePostseasonSeriesResponse

    /**
     * Endpoint `/schedule/postseason`
     */
    fun getSchedulePostseason(): SchedulePostseasonResponse

    /**
     * Endpoint `/jobs/umpires`
     */
    fun getJobsUmpires(): JobsUmpiresResponse

    /**
     * Endpoint `/jobs/datacasters`
     */
    fun getJobsDatacasters(): JobsDatacastersResponse

    /**
     * Endpoint `/jobs/officialScorers`
     */
    fun getJobsOfficialScorers(): JobsOfficialScorersResponse
}
