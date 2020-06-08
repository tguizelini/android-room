package br.com.tguizelini.androidroom.config

import android.app.Application
import androidx.room.Room
import br.com.tguizelini.androidroom.data.AppDatabase

class MyApplication: Application() {
    companion object{
        var db: AppDatabase? = null
    }

    override fun onCreate() {
        super.onCreate()

        db = Room.databaseBuilder(
            this@MyApplication,
            AppDatabase::class.java,
            "database_name"
        ).build()
    }
}