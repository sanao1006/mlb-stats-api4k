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
import params.people.PeopleOptionalQueryParams
import params.people.PeopleRequiredQueryParams
import params.person.PersonOptionalQueryParams
import params.person.PersonRequiredQueryParams
import params.person.stats.PersonStatsOptionalQueryParams
import params.person.stats.PersonStatsRequiredQueryParams
import params.schedule.postseason.SchedulePostseasonOptionalQueryParams
import params.schedule.postseason.series.SchedulePostseasonSeriesOptionalQueryParams
import params.schedule.tied.ScheduleTiedOptionalQueryParams
import params.schedule.tied.ScheduleTiedRequiredQueryParams
import params.season.SeasonOptionalQueryParams
import params.season.SeasonRequiredQueryParams
import params.sports.SportsOptionalQueryParams
import params.stats.StatsOptionalQueryParams
import params.stats.StatsRequiredQueryParams
import params.stats.leaders.StatsLeadersOptionalQueryParams
import params.stats.leaders.StatsLeadersRequiredQueryParams
import params.team.TeamOptionalQueryParams
import params.team.TeamRequiredQueryParams
import params.teams.TeamsOptionalQueryParams
import params.teams.affiliates.TeamsAffiliatesOptionalQueryParams
import params.teams.affiliates.TeamsAffiliatesRequiredQueryParams
import params.team.alumni.TeamAlumniOptionalQueryParams
import params.team.alumni.TeamAlumniRequiredQueryParams
import params.team.coaches.TeamCoachesOptionalQueryParams
import params.team.coaches.TeamCoachesRequiredQueryParams
import params.team.leaders.TeamLeadersOptionalQueryParams
import params.team.leaders.TeamLeadersRequiredQueryParams
import params.team.personnel.TeamPersonnelOptionalQueryParams
import params.team.personnel.TeamPersonnelRequiredQueryParams
import params.team.roster.TeamRosterOptionalQueryParams
import params.team.roster.TeamRosterRequiredQueryParams
import params.teams.history.TeamsHistoryRequiredQueryParams
import params.venue.VenueOptionalQueryParams
import params.venue.VenueRequiredQueryParams
import response.attendance.AttendanceResponse
import response.awards.AwardsResponse
import response.conferences.ConferencesResponse
import response.divisions.DivisionsResponse
import response.game.GameResponse
import response.jobs.datacasters.JobsDatacastersResponse
import response.jobs.officialScorers.JobsOfficialScorersResponse
import response.jobs.umpires.JobsUmpiresResponse
import response.pepple.PeopleResponse
import response.person.PersonResponse
import response.person.stats.PersonStatsResponse
import response.schedule.postseason.SchedulePostseasonResponse
import response.schedule.postseason.series.SchedulePostseasonSeriesResponse
import response.schedule.tied.ScheduleTiedResponse
import response.season.SeasonResponse
import response.sports.SportsResponse
import response.stats.StatsResponse
import response.stats.leaders.StatsLeadersResponse
import response.team.TeamResponse
import response.team.alumni.TeamAlumniResponse
import response.team.coaches.TeamCoachesResponse
import response.team.leaders.TeamLeadersResponse
import response.team.personnel.TeamPersonnelResponse
import response.team.roster.TeamRosterResponse
import response.teams.TeamsResponse
import response.teams.affiliates.TeamsAffiliatesResponse
import response.teams.history.TeamsHistoryResponse
import response.venue.VenueResponse

interface MlbStatsApi {
    /**
     * Endpoint "attendance"
     */
    fun getAttendanceResponse(
        attendanceRequiredQueryParams: AttendanceRequiredQueryParams,
        attendanceOptionalQueryParams: AttendanceOptionalQueryParams = AttendanceOptionalQueryParams()
    ): AttendanceResponse

    /**
     * Endpoint "awards"
     */
    fun getAwardsResponse(awardsOptionalQueryParams: AwardsOptionalQueryParams = AwardsOptionalQueryParams()): AwardsResponse

    /**
     * Endpoint "conferences"
     */
    fun getConferencesResponse(conferencesOptionalQueryParams: ConferencesOptionalQueryParams = ConferencesOptionalQueryParams()): ConferencesResponse

    /**
     * Endpoint "divisions"
     */
    fun getDivisionsResponse(divisionsOptionalQueryParams: DivisionsOptionalQueryParams = DivisionsOptionalQueryParams()): DivisionsResponse

    /**
     * Endpoint "game"
     */
    fun getGameFeedResponse(
        gameFeedRequiredQueryParams: GameFeedRequiredQueryParams,
        gameFeedOptionalQueryParams: GameFeedOptionalQueryParams = GameFeedOptionalQueryParams()
    ): GameResponse

    /**
     * Endpoint "people"
     */
    fun getPeopleResponse(
        peopleRequiredQueryParams: PeopleRequiredQueryParams,
        peopleOptionalQueryParams: PeopleOptionalQueryParams = PeopleOptionalQueryParams()
    ): PeopleResponse

    /**
     * Endpoint "person"
     */
    fun getPersonResponse(
        personRequiredQueryParams: PersonRequiredQueryParams,
        personOptionalQueryParams: PersonOptionalQueryParams = PersonOptionalQueryParams()
    ): PersonResponse

    /**
     * Endpoint "person_stats"
     */
    fun getPersonStatsResponse(
        personStatsRequiredQueryParams: PersonStatsRequiredQueryParams,
        personStatsOptionalQueryParams: PersonStatsOptionalQueryParams = PersonStatsOptionalQueryParams()
    ): PersonStatsResponse

    /**
     * Endpoint "sports"
     */
    fun getSportsResponse(sportsOptionalQueryParams: SportsOptionalQueryParams = SportsOptionalQueryParams()): SportsResponse

    /**
     * Endpoint "stats"
     */
    fun getStatsResponse(
        statsRequiredQueryParams: StatsRequiredQueryParams,
        statsOptionalQueryParams: StatsOptionalQueryParams = StatsOptionalQueryParams()
    ): StatsResponse

    /**
     * Endpoint "stats_leaders"
     */
    fun getStatsLeadersResponse(
        statsLeadersRequiredQueryParams: StatsLeadersRequiredQueryParams,
        statsLeadersOptionalQueryParams: StatsLeadersOptionalQueryParams = StatsLeadersOptionalQueryParams()
    ): StatsLeadersResponse

    /**
     * Endpoint "teams"
     */
    fun getTeamsResponse(teamsOptionalQueryParams: TeamsOptionalQueryParams = TeamsOptionalQueryParams()): TeamsResponse

    /**
     * Endpoint "schedule_tied"
     */
    fun getScheduleTiedResponse(
        scheduleTiedRequiredQueryParams: ScheduleTiedRequiredQueryParams,
        scheduleTiedOptionalQueryParams: ScheduleTiedOptionalQueryParams = ScheduleTiedOptionalQueryParams()
    ): ScheduleTiedResponse

    /**
     * Endpoint "schedule_postseason"
     */
    fun getSchedulePostseasonResponse(schedulePostseasonOptionalQueryParams: SchedulePostseasonOptionalQueryParams = SchedulePostseasonOptionalQueryParams()): SchedulePostseasonResponse

    /**
     * Endpoint "schedule_postseason_series"
     */
    fun getSchedulePostseasonSeriesResponse(schedulePostseasonSeriesOptionalQueryParams: SchedulePostseasonSeriesOptionalQueryParams = SchedulePostseasonSeriesOptionalQueryParams()): SchedulePostseasonSeriesResponse

    /**
     * Endpoint "season"
     */
    fun getSeasonResponse(
        seasonRequiredQueryParams: SeasonRequiredQueryParams,
        seasonOptionalQueryParams: SeasonOptionalQueryParams = SeasonOptionalQueryParams()
    ): SeasonResponse

    /**
     * Endpoint "jobs_umpires"
     */
    fun getJobsUmpiresResponse(jobsUmpiresOptionalQueryParams: JobsUmpiresOptionalQueryParams = JobsUmpiresOptionalQueryParams()): JobsUmpiresResponse

    /**
     * Endpoint "jobs_datacasters"
     */
    fun getJobsDatacastersResponse(jobsDatacastersOptionalQueryParams: JobsDatacastersOptionalQueryParams = JobsDatacastersOptionalQueryParams()): JobsDatacastersResponse

    /**
     * Endpoint "jobs_officialScorers"
     */
    fun getJobsOfficialScorersResponse(jobsOfficialScorersOptionalQueryParams: JobsOfficialScorersOptionalQueryParams = JobsOfficialScorersOptionalQueryParams()): JobsOfficialScorersResponse

    /**
     * Endpoint "teams_history"
     */
    fun getTeamsHistoryResponse(
        teamsHistoryRequiredQueryParams: TeamsHistoryRequiredQueryParams,
        teamsOptionalQueryParams: TeamsOptionalQueryParams = TeamsOptionalQueryParams(),
    ): TeamsHistoryResponse

    /**
     * Endpoint "teams_affiliates"
     */
    fun getTeamsAffiliatesResponse(
        teamsAffiliatesRequiredQueryParams: TeamsAffiliatesRequiredQueryParams,
        teamsAffiliatesOptionalQueryParams: TeamsAffiliatesOptionalQueryParams = TeamsAffiliatesOptionalQueryParams()
    ): TeamsAffiliatesResponse

    /**
     * Endpoint "team"
     */
    fun getTeamResponse(
        teamRequiredQueryParams: TeamRequiredQueryParams,
        teamOptionalQueryParams: TeamOptionalQueryParams = TeamOptionalQueryParams()
    ): TeamResponse

    /**
     * Endpoint "team_alumni"
     */
    fun getTeamAlumniResponse(
        teamAlumniRequiredQueryParams: TeamAlumniRequiredQueryParams,
        teamAlumniOptionalQueryParams: TeamAlumniOptionalQueryParams = TeamAlumniOptionalQueryParams()
    ): TeamAlumniResponse

    /**
     * Endpoint "team_coaches"
     */
    fun getTeamCoaches(
        teamCoachesRequiredQueryParams: TeamCoachesRequiredQueryParams,
        teamCoachesOptionalQueryParams: TeamCoachesOptionalQueryParams = TeamCoachesOptionalQueryParams()
    ): TeamCoachesResponse

    /**
     * Endpoint "team_personnel"
     */
    fun getTeamPersonnelResponse(
        teamPersonnelRequiredQueryParams: TeamPersonnelRequiredQueryParams,
        teamPersonnelOptionalQueryParams: TeamPersonnelOptionalQueryParams = TeamPersonnelOptionalQueryParams()
    ): TeamPersonnelResponse

    /**
     * Endpoint "team_leaders"
     */
    fun getTeamLeaders(
        teamLeadersRequiredQueryParams: TeamLeadersRequiredQueryParams,
        teamLeadersOptionalQueryParams: TeamLeadersOptionalQueryParams = TeamLeadersOptionalQueryParams()
    ): TeamLeadersResponse

    /**
     * Endpoint "team_roster"
     */
    fun getTeamRoster(
        teamRosterRequiredQueryParams: TeamRosterRequiredQueryParams,
        teamRosterOptionalQueryParams: TeamRosterOptionalQueryParams = TeamRosterOptionalQueryParams()
    ): TeamRosterResponse

    /**
     * Endpoint "venue"
     */
    fun getVenueResponse(
        venueRequiredQueryParams: VenueRequiredQueryParams,
        venueOptionalQueryParams: VenueOptionalQueryParams = VenueOptionalQueryParams()
    ): VenueResponse
}
