package com.example.recyclerdatabind.database

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Aluno::class], version = 1, exportSchema = false)
abstract class MeuDatabase : RoomDatabase() {




    val database = Room.databaseBuilder(
        this,
        MeuDatabase::class.java,
        "recyclerdatabse-database")
        .build()

    abstract fun alunoDao() : AlunoDao


    // rest of the code
}