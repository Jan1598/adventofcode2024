package com.jan.adventofcode

import adventofcode.eventlistener.EventManager
import com.jan.tools.FileReader


abstract class AdventSetup {

   private val fileReader = FileReader()
   //val readPath = Paths.get("src/main/kotlin/adventofcode").toAbsolutePath().toString()

   val eventManager = EventManager()

   fun writeEmptyLine( amount: Int )
   {
      for ( i in 1..amount )
      {
         println()
      }
   }

   fun getFileInputListFromDay(dayClass: Any, value: String = "input.txt"): List<String>  {
      return fileReader.readFileAsLinesUsingUseLines(dayClass::class.java.getResource(value)!!.file)
   }

   abstract fun startFirstPart()
   abstract fun startSecondPart()

   open fun registerEvents()
   {

   }

}