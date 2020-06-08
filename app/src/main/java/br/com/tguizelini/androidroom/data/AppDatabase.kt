package br.com.tguizelini.androidroom.data

import androidx.room.Database
import androidx.room.RoomDatabase
import br.com.tguizelini.androidroom.data.daos.TaskDao
import br.com.tguizelini.androidroom.data.entities.Task

@Database(entities = [Task::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}