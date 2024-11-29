package com.jan

import adventofcode.day01.Day01
import com.jan.adventofcode.AdventSetup

const val title = "{--- Advent Of Code 2022 ---}"

val challengeList = ArrayList<AdventSetup>()
const val challengeDay = 1
fun main() {

    buildChallengeList()

    val currentDayChallenge = challengeList[challengeDay - 1]

    println("$title Day: $challengeDay")
    writeEmptyLine(2)

    println("(------ Part 1 ------)")
    writeEmptyLine(1)
    currentDayChallenge.startFirstPart()
    writeEmptyLine(2)

    println("(------ Part 2 ------)")
    writeEmptyLine(1)
    currentDayChallenge.startSecondPart()
}

/**
 * Add new classes here
 */
fun buildChallengeList() {
    challengeList.add(Day01())
}

fun writeEmptyLine(amount: Int) {
    for (i in 1..amount) {
        println()
    }
}