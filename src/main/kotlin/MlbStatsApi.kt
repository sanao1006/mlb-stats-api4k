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
import response.sports.SportsResponse
import response.teams.TeamsResponse

interface MlbStatsApi {
    /**
     * Endpoint `/attendance`
     */
    fun getAttendanceResponse(
        attendanceRequiredQueryParams: AttendanceRequiredQueryParams,
        attendanceOptionalQueryParams: AttendanceOptionalQueryParams = AttendanceOptionalQueryParams()
    ): AttendanceResponse

    /**
     * Endpoint `/awards`
     */
    fun getAwardsResponse(awardsOptionalQueryParams: AwardsOptionalQueryParams = AwardsOptionalQueryParams()): AwardsResponse

    /**
     * Endpoint `/conferences`
     */
    fun getConferencesResponse(conferencesOptionalQueryParams: ConferencesOptionalQueryParams = ConferencesOptionalQueryParams()): ConferencesResponse

    /**
     * Endpoint `/divisions`
     */
    fun getDivisionsResponse(divisionsOptionalQueryParams: DivisionsOptionalQueryParams = DivisionsOptionalQueryParams()): DivisionsResponse

    /**
     * Endpoint `game/{gamePk}/feed/live`
     */
    fun getGameFeedResponse(
        gameFeedRequiredQueryParams: GameFeedRequiredQueryParams,
        gameFeedOptionalQueryParams: GameFeedOptionalQueryParams = GameFeedOptionalQueryParams()
    ): GameResponse

    /**
     * Endpoint `/sports`
     */
    fun getSportsResponse(sportsOptionalQueryParams: SportsOptionalQueryParams = SportsOptionalQueryParams()): SportsResponse

    /**
     * Endpoint `/teams`
     */
    fun getTeamsResponse(teamsOptionalQueryParams: TeamsOptionalQueryParams = TeamsOptionalQueryParams()): TeamsResponse

    /**
     * Endpoint `/schedule/postseason/series`
     */
    fun getSchedulePostseasonSeriesResponse(schedulePostseasonSeriesOptionalQueryParams: SchedulePostseasonSeriesOptionalQueryParams = SchedulePostseasonSeriesOptionalQueryParams()): SchedulePostseasonSeriesResponse

    /**
     * Endpoint `/schedule/postseason`
     */
    fun getSchedulePostseasonResponse(schedulePostseasonOptionalQueryParams: SchedulePostseasonOptionalQueryParams = SchedulePostseasonOptionalQueryParams()): SchedulePostseasonResponse

    /**
     * Endpoint `/jobs/umpires`
     */
    fun getJobsUmpiresResponse(jobsUmpiresOptionalQueryParams: JobsUmpiresOptionalQueryParams = JobsUmpiresOptionalQueryParams()): JobsUmpiresResponse

    /**
     * Endpoint `/jobs/datacasters`
     */
    fun getJobsDatacastersResponse(jobsDatacastersOptionalQueryParams: JobsDatacastersOptionalQueryParams = JobsDatacastersOptionalQueryParams()): JobsDatacastersResponse

    /**
     * Endpoint `/jobs/officialScorers`
     */
    fun getJobsOfficialScorersResponse(jobsOfficialScorersOptionalQueryParams: JobsOfficialScorersOptionalQueryParams = JobsOfficialScorersOptionalQueryParams()): JobsOfficialScorersResponse
}
