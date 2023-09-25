package za.ac.stocksensei.tools.helpers
import android.app.Activity
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class PermissionHelper(private val activity: Activity) {
    private val requestCode = 100 // Change this to any unique value

    fun requestPermission(permission: String, onPermissionGranted: () -> Unit) {
        if (isPermissionGranted(permission)) {
            // Permission is already granted
            onPermissionGranted.invoke()
        } else {
            // Permission is not granted, request it
            ActivityCompat.requestPermissions(activity, arrayOf(permission), requestCode)
        }
    }

    fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray,
        onPermissionGranted: () -> Unit,
        onPermissionDenied: () -> Unit
    ) {
        if (requestCode == this.requestCode) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Permission granted
                onPermissionGranted.invoke()
            } else {
                // Permission denied
                onPermissionDenied.invoke()
            }
        }
    }

    private fun isPermissionGranted(permission: String): Boolean {
        return ContextCompat.checkSelfPermission(activity, permission) == PackageManager.PERMISSION_GRANTED
    }
}
