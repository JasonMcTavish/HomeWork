package `11_Generics_And_Utility_Classes`

class Team {
    var chanceToGeneral = 10
    var chanceToCaptain = 30
    var chanceToGrenadier = 60
    var general = General()
    var captain = Captain()
    var grenadier = Grenadier()
    var soldier = Soldier()

    fun addWarrior(n: Int): MutableList<AbstractWarrior> {
        var team = mutableListOf<AbstractWarrior>()
        var i = 1
        do {
            if (chanceToGeneral.chance()) {
                team.add(general)
            } else if (chanceToCaptain.chance()) {
                team.add(captain)
            } else if (chanceToGrenadier.chance()) {
                team.add(grenadier)
            } else team.add(soldier)
            i++
        } while (i != n)
        return team
    }
}