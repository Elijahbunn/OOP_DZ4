package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<E extends Warrior> implements Iterable<E> {
    private List<E> team = new ArrayList<>();

    public Team addWarrior(E perdon){
        team.add(perdon);
        return this;
    }

    @Override
    public Iterator<E> iterator() {
        return team.iterator();
    }
    public int maxTeamRange(){
        int maxRange = 0;
        for (E item : team){
            if(item instanceof Archer){
                if (((Archer)item).shotRange()> maxRange) maxRange = ((Archer)item).shotRange();
            }
        }
        return maxRange;
    }
    public int maxTeamDefends(){
        int maxDef = 0;
        for(E item : team){
            if(item instanceof  Warrior){
                if(((Warrior)item).shotDefends() > maxDef){
                    maxDef = ((Warrior)item).shotDefends();
                }
            }
        }
        return maxDef;
    }
    public int minTeamDefends(){
        int minDef = 999;
        for(E item : team){
            if(item instanceof  Warrior){
                if(((Warrior)item).shotDefends() < minDef){
                    minDef = ((Warrior)item).shotDefends();
                }
            }
        }
        return minDef;
    }
}
