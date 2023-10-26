package za.ac.stocksensei

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Function to start the ZXing barcode scanner
    private fun startBarcodeScanner() {
        /*val integrator = IntentIntegrator(this)
        integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE) // You can specify other formats as needed
        integrator.setPrompt("Scan a barcode")
        integrator.setCameraId(0) // Use the device's default camera
        integrator.initiateScan()*/
    }
}