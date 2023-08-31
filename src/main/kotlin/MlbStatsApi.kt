import response.Award
import response.Conference
import response.Division
import response.Sports

interface MlbStatsApi {
    fun getAwards(): List<Award>
    fun getConferences(): List<Conference>
    fun getDivisions(): List<Division>
    fun getSports(): List<Sports>
}
