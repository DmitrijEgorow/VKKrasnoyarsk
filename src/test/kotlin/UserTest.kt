import data.User
import org.junit.Test
import kotlin.test.assertEquals

class UserTest {

    @Test
    fun `create user and check properties`() {
        val user = User(
            100,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        )
        assertEquals(100, user.id)
    }
}