package br.com.tguizelini.androidroom.base

import android.app.Application
import androidx.room.Room
import br.com.tguizelini.androidroom.data.AppDatabase

class BaseApplication: Application() {
    companion object{
        var db: AppDatabase? = null
    }

    override fun onCreate() {
        super.onCreate()

        db = Room.databaseBuilder(
            this@BaseApplication,
            AppDatabase::class.java,
            "database_name"
        ).build()
    }
}