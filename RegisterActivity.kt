import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        registerButton.setOnClickListener {
            if (usernameEditText.text.toString().isEmpty()) {
                usernameEditText.error = "Please enter your username"
            } else if (passwordEditText.text.toString().isEmpty()) {
                passwordEditText.error = "Please enter your password"
            } else {
                //TODO: Create a user account
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
