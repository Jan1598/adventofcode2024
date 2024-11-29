package adventofcode.day01.common

class Elf(val name: String, var amountOfCalories: Int) : Comparable<Elf> {

    fun addCalories(calories: Int) {
        amountOfCalories += calories
    }

    override fun compareTo(other: Elf): Int {
        return if ( this.amountOfCalories > other.amountOfCalories )
            1
        else if ( this.amountOfCalories < other.amountOfCalories )
            -1
        else
            0
    }

}