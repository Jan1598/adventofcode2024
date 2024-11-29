package adventofcode.day01

import adventofcode.day01.common.Elf
import com.jan.adventofcode.AdventSetup

class Day01 : AdventSetup() {

    private var elfList = ArrayList<Elf>()

    private var inputList: List<String> = getFileInputListFromDay(this)

    override fun startFirstPart() {

        var elf = Elf("elf " + 1, 0)
        for (i in inputList) {
            if (i.isEmpty()) {
                elfList.add(elf)
                elf = Elf("elf " + (elfList.size + 1), 0)
            } else {
                elf.addCalories(i.toInt())
            }
        }

        elfList.sort()

        println("Highest")
        displayStatsOfElf( elfList[elfList.size - 1] )

    }

    override fun startSecondPart() {
        val sumOfFirst = sumOfFirst(buildElfCaloriesCollection(inputList))
        println("Sum of first 3: $sumOfFirst")
    }

    fun buildElfCaloriesCollection(valueList: List<String>): ArrayList<Elf> {
        val elfList = ArrayList<Elf>()

        var elf = Elf("elf " + 1, 0)
        for (i in valueList) {
            if (i.isEmpty()) {
                elfList.add(elf)
                elf = Elf("elf " + (elfList.size + 1), 0)
            } else {
                elf.addCalories(i.toInt())
            }
        }

        elfList.add(elf)

        return elfList
    }

    fun sumOfFirst( elfList: ArrayList<Elf>, amount: Int = 3 ): Int {
        elfList.sortDescending()
        return elfList.take(amount).sumOf { it.amountOfCalories }
    }

    private fun displayStatsOfElf(elf: Elf )
    {
        println("name = ${elf.name}")
        println("amountOfCalories = ${elf.amountOfCalories}")
    }

}