package `11_Generics_And_Utility_Classes`

class Team {
    private var chanceToGeneral = 10
    private var chanceToCaptain = 30
    private var chanceToGrenadier = 60
    private var general = General()
    private var captain = Captain()
    private var grenadier = Grenadier()
    private var soldier = Soldier()

    fun addWarrior(): AbstractWarrior {
        return if (chanceToGeneral.chance()) {
            (general)
        } else if (chanceToCaptain.chance()) {
            (captain)
        } else if (chanceToGrenadier.chance()) {
            (grenadier)
        } else (soldier)
    }
}