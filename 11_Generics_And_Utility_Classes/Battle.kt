package `11_Generics_And_Utility_Classes`

class Battle {
    var team1 = mutableListOf<AbstractWarrior>()
    var team2 = mutableListOf<AbstractWarrior>()

    fun iterationOfBattle() {
        var i = 1
team1.forEach{it.attack(team2[i])}
        println(BattleState.Progress.remainingWarrior)
    }
}