package edu.festu.ivankuznetsov.filmviewersample

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import edu.festu.ivankuznetsov.filmviewersample.network.Film
import edu.festu.ivankuznetsov.filmviewersample.network.FilmAPI
import edu.festu.ivankuznetsov.filmviewersample.network.RetrofitObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.BufferedInputStream
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.URL
import java.util.concurrent.Executors

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        Executors.newSingleThreadExecutor().execute{
//            val url = URL("http://www.android.com/")
//            val urlConnection: HttpURLConnection = url.openConnection() as HttpURLConnection
//            try {
//                val inp = BufferedInputStream(urlConnection.inputStream)
//                while(inp.available()>0) {
//                    val bytes = inp.readBytes()
//                    val string = bytes.decodeToString()
//                    Log.d(TAG, string)
//                }
//            } finally {
//                urlConnection.disconnect()
//            }
//        }
        /*
        * enqueue - асинхронный запрос к серверу
        * дожен принимать callback для обработки результата обращения к серверу
        * onResponse - успешное обращение
        * onFailure - ошибка
        *
        * для синхронного обращения используется метод execute (должна обеспечиваться многопоточность)
        * */
        RetrofitObject
            .getInstance()
            .create(FilmAPI::class.java)
            .getMovie("ZQQ8GMN-TN54SGK-NB3MKEC-ZKB8V06","326","id")
            .enqueue(object : Callback<Film>{
                override fun onResponse(call: Call<Film>, response: Response<Film>) {
                    Log.d(TAG,response.body()?.name.toString())
                }

                override fun onFailure(call: Call<Film>, t: Throwable) {
                    t.printStackTrace()
                    Toast.makeText(this@MainActivity,"FAIL",Toast.LENGTH_SHORT).show()
                }
            })
    }
    companion object{
        val TAG = MainActivity::class.java.simpleName
    }
}