package messaging.cloud.firebase.firebasecloudmessaging

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.messaging.FirebaseMessaging

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FirebaseMessaging.getInstance().subscribeToTopic("default")
                .addOnCompleteListener {
                    if (it.isSuccessful) {
                        Log.d("subscription status","subscribed to default successfully!")
                    } else {
                        Log.d("subscription status","subscription failed!")
                    }
                }
    }
}
