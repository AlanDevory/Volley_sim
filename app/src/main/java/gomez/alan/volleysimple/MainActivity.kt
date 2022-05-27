package gomez.alan.volleysimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import kotlin.math.log
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Instantiate the RequestQueue.
        val queue = Volley.newRequestQueue(this)
        val url = "http://www.google.com"

        val StringRequest= StringRequest(Request.Method.GET,url,Response.Listener { respuesta ->
            Log.d("peticion", "${respuesta.substring(0,500)} ")

        },Response.ErrorListener {
            Log.e("peticion", "Hubo error ")

        })

    }
}