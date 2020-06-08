package br.com.tguizelini.androidroom.data.daos

import androidx.lifecycle.LiveData
import androidx.room.*
import br.com.tguizelini.androidroom.data.entities.Task

@Dao
interface TaskDao {
    @Query("SELECT * FROM tasks")
    fun getAll(): LiveData<List<Task>>

    @Query("SELECT * FROM tasks WHERE id = :id")
    fun findById(id: Int): LiveData<Task>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun save(task: Task)

    @Delete
    fun delete(task: Task)
}