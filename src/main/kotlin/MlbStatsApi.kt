import response.Award
import response.Conference

interface MlbStatsApi {
    fun getAwards(): List<Award>
    fun getConferences(): List<Conference>
}
