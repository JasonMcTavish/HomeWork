package `11_Generics_And_Utility_Classes`

sealed class BattleState {
    object Progress : BattleState() {
        var remainingWarrior = "Осталось воинов в команде 1: ${Battle().team1.size}" + "\n" +
                "Осталось воинов в команде 2: ${Battle().team2.size}"
    }

    object WinOfFirstTeam : BattleState() {
        var endOfBattle = "Победила первая команда"
    }

    object WinOfSecondTeam : BattleState() {
        var endOfBattle = "Победила вторая команда"
    }

    object Draw : BattleState() {
        var endOfBattle = "Ничья"
    }
}