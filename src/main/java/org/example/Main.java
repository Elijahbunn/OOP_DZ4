package org.example;

public class Main {
    public static void main(String[] args) {
        Team <Swordman> team1 = new Team<>();
        team1.addWarrior(new Swordman("Grisha", new Sword(25), 56, new IronShield(78)))
                .addWarrior(new Swordman("Sergay", new Sword(80), 200, new IronShield(90)));
        for(Swordman swordman : team1){
            System.out.println(swordman);
        }
        Team <Archer>team2 = new Team<>();
        team2.addWarrior(new Archer("Kolya", new Bow(67, 90), new MagicShild(98, 32), 100))
                .addWarrior(new Archer("Vasya", new Bow(45, 78), new MagicShild(93, 16), 30));
        for (Archer archer:team2) {
            System.out.println(archer);
        }
        System.out.println(team1.maxTeamRange());
        System.out.println(team2.maxTeamRange());
        System.out.println(team1.maxTeamDefends());
        System.out.println(team2.maxTeamDefends());
        System.out.println(team1.minTeamDefends());
        System.out.println(team2.minTeamDefends());
    }
}