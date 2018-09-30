package messaging.cloud.firebase.firebasecloudmessaging

import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService

class MyFirebaseInstanceIDService : FirebaseInstanceIdService() {
    override fun onTokenRefresh() {
        val refreshToken = FirebaseInstanceId.getInstance().token
        Log.d("ტოკენი",refreshToken)


    }
}