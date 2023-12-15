package data

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val id: Int,
    val first_name: String?,
    val last_name: String?,
    val nickname: String?,
    val city: CityDto?,
    val country: CityDto?,
    val home_town: String?,
    val sex: Int?,
    val bdate: String?,
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