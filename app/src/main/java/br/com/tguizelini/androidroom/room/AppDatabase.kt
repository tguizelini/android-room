package br.com.tguizelini.androidroom.room

import androidx.room.Database
import androidx.room.RoomDatabase
import br.com.tguizelini.androidroom.room.daos.TaskDao
import br.com.tguizelini.androidroom.room.entities.Task

@Database(entities = [Task::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}