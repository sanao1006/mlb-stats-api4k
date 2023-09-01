import params.attendance.AttendanceOptionalQueryParams
import params.attendance.AttendanceRequiredQueryParams
import params.awards.AwardsOptionalQueryParams
import params.conferences.ConferencesOptionalQueryParams
import params.divisions.DivisionsOptionalQueryParams
import params.game.GameFeedOptionalQueryParams
import params.game.GameFeedRequiredQueryParams
import params.jobs.datacasters.JobsDatacastersOptionalQueryParams
import params.jobs.officialScorers.JobsOfficialScorersOptionalQueryParams
import params.jobs.umpires.JobsUmpiresOptionalQueryParams
import params.schedule.postseason.SchedulePostseasonOptionalQueryParams
import params.schedule.postseason.series.SchedulePostseasonSeriesOptionalQueryParams
import params.sports.SportsOptionalQueryParams
import params.teams.TeamsOptionalQueryParams
import response.*
import response.attendance.AttendanceResponse
import response.awards.AwardsResponse
import response.conferences.ConferencesResponse
import response.divisions.DivisionsResponse
import response.game.GameResponse
import response.jobs.datacasters.JobsDatacastersResponse
import response.jobs.officialScorers.JobsOfficialScorersResponse
import response.jobs.umpires.JobsUmpiresResponse
import response.schedule.postseason.SchedulePostseasonResponse
import response.schedule.postseason.series.SchedulePostseasonSeriesResponse
import response.sports.Sports
import response.sports.SportsResponse

interface MlbStatsApi {
    /**
     * Endpoint `/attendance`
     */
    fun getAttendance(
        attendanceRequiredQueryParams: AttendanceRequiredQueryParams,
        attendanceOptionalQueryParams: AttendanceOptionalQueryParams = AttendanceOptionalQueryParams()
    ): AttendanceResponse

    /**
     * Endpoint `/awards`
     */
    fun getAwards(awardsOptionalQueryParams: AwardsOptionalQueryParams = AwardsOptionalQueryParams()): AwardsResponse

    /**
     * Endpoint `/conferences`
     */
    fun getConferences(conferencesOptionalQueryParams: ConferencesOptionalQueryParams = ConferencesOptionalQueryParams()): ConferencesResponse

    /**
     * Endpoint `/divisions`
     */
    fun getDivisions(divisionsOptionalQueryParams: DivisionsOptionalQueryParams = DivisionsOptionalQueryParams()): DivisionsResponse

    /**
     * Endpoint `game/{gamePk}/feed/live`
     */
    fun getGameFeed(
        gameFeedRequiredQueryParams: GameFeedRequiredQueryParams,
        gameFeedOptionalQueryParams: GameFeedOptionalQueryParams = GameFeedOptionalQueryParams()
    ): GameResponse

    /**
     * Endpoint `/sports`
     */
    fun getSports(sportsOptionalQueryParams: SportsOptionalQueryParams = SportsOptionalQueryParams()): SportsResponse

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
    fun getJobsOfficialScorers(jobsOfficialScorersOptionalQueryParams: JobsOfficialScorersOptionalQueryParams = JobsOfficialScorersOptionalQueryParams()): JobsOfficialScorersResponse
}
