import params.awards.AwardsOptionalQueryParams
import params.conferences.ConferencesOptionalQueryParams
import params.divisions.DivisionsOptionalQueryParams
import params.jobs.datacasters.JobsDatacastersOptionalQueryParams
import params.jobs.umpires.JobsUmpiresOptionalQueryParams
import params.schedule.postseason.SchedulePostseasonOptionalQueryParams
import params.schedule.postseason.series.SchedulePostseasonSeriesOptionalQueryParams
import params.sports.SportsOptionalQueryParams
import params.teams.TeamsOptionalQueryParams
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
    fun getConferences(conferencesOptionalQueryParams: ConferencesOptionalQueryParams = ConferencesOptionalQueryParams()): List<Conference>

    /**
     * Endpoint `/divisions`
     */
    fun getDivisions(divisionsOptionalQueryParams: DivisionsOptionalQueryParams = DivisionsOptionalQueryParams()): List<Division>

    /**
     * Endpoint `/sports`
     */
    fun getSports(sportsOptionalQueryParams: SportsOptionalQueryParams = SportsOptionalQueryParams()): List<Sports>

    /**
     * Endpoint `/teams`
     */
    fun getTeams(teamsOptionalQueryParams: TeamsOptionalQueryParams = TeamsOptionalQueryParams()): List<Team>

    /**
     * Endpoint `/schedule/postseason/series`
     */
    fun getSchedulePostseasonSeries(schedulePostseasonSeriesOptionalQueryParams: SchedulePostseasonSeriesOptionalQueryParams = SchedulePostseasonSeriesOptionalQueryParams()): SchedulePostseasonSeriesResponse

    /**
     * Endpoint `/schedule/postseason`
     */
    fun getSchedulePostseason(schedulePostseasonOptionalQueryParams: SchedulePostseasonOptionalQueryParams = SchedulePostseasonOptionalQueryParams()): SchedulePostseasonResponse

    /**
     * Endpoint `/jobs/umpires`
     */
    fun getJobsUmpires(jobsUmpiresOptionalQueryParams: JobsUmpiresOptionalQueryParams = JobsUmpiresOptionalQueryParams()): JobsUmpiresResponse

    /**
     * Endpoint `/jobs/datacasters`
     */
    fun getJobsDatacasters(jobsDatacastersOptionalQueryParams: JobsDatacastersOptionalQueryParams = JobsDatacastersOptionalQueryParams()): JobsDatacastersResponse

    /**
     * Endpoint `/jobs/officialScorers`
     */
    fun getJobsOfficialScorers(): JobsOfficialScorersResponse
}
