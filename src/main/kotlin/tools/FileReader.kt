package com.jan.tools

import java.io.File

class FileReader {

    fun readFileAsLinesUsingUseLines(fileName: String): List<String>
            = File(fileName).useLines { it.toList() }

}