package br.com.tguizelini.androidroom.room.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tasks")
data class Task(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "title") val taskTitle: String?,
    @ColumnInfo(name = "description") val taskDescription: String?
)