package data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class User(
    val id: Int,
    @SerialName("first_name") val firstName: String?,
    @SerialName("last_name") val lastName: String?,
    val nickname: String?,
    val city: CityDto?,
    val country: CityDto?,
    @SerialName("home_town") val homeTown: String?,
    val sex: Int?,
    @SerialName("bdate") val birthdayDate: String?,
    val deactivated: String?
)

@Serializable
data class ResponseDTO (
    val response: List<User>
)

@Serializable
data class CityDto (
    val id: Int,
    val title: String?
)