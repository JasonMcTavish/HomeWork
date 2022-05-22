package Generics_And_Utility_Classes

class Team(val name:String, number:Int) {
    val team = mutableListOf<AbstractWarrior>()
    private var chanceToGeneral = 10
    private var chanceToCaptain = 30
    private var chanceToGrenadier = 60
    private var general = General()
    private var captain = Captain()
    private var grenadier = Grenadier()
    private var soldier = Soldier()
init {
    for (j in 0 until number)
        team.add(addWarrior())
}
   private fun addWarrior(): AbstractWarrior {
        return if (chanceToGeneral.chance()) {
            (general)
        } else if (chanceToCaptain.chance()) {
            (captain)
        } else if (chanceToGrenadier.chance()) {
            (grenadier)
        } else (soldier)
    }
}