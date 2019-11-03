package de.unihd.isw.zwack_pfeil_a3.data;

public class Competition extends Swap {

    private double helpfunction1(Pokemon p1) {
        double pok1 = Math.random();

        if (p1.getType() == Type.POISON) {
            pok1 *= 3;
        }
        else if (p1.getType() == Type.WATER) {
            pok1 *= 2;
        }
        else if (p1.getType() == Type.FIRE) {
            pok1 *= 1;
        }

        return pok1;
    }
    private double helpfunction2(Pokemon p2) {
        double pok2 = Math.random();

        if (p2.getType() == Type.POISON) {
            pok2 *= 3;
        }
        else if (p2.getType() == Type.WATER) {
            pok2 *= 2;
        }
        else if (p2.getType() == Type.FIRE) {
            pok2 *= 1;
        }
        return pok2;
    }



    @Override
    public void execute(Pokemon p1, Pokemon p2) {
        if (p1.getTrainer().equals(p2.getTrainer())) {
            System.err.println("Pokemon " + p1.getName() + " kann nicht gegen " + p2.getName() +
                    " antreten, da beide den gleichen "+ p1.getTrainer() + "haben.");
        }
        else {
            if (p1.getTrainer() != null && p2.getTrainer() != null) {
                p1.addCompetition(p1);
                p2.addCompetition(p2);

                double pok1 = helpfunction1(p1);
                double pok2 = helpfunction2(p2);

                if (pok1 == pok2) {
                    pok1 += Math.random();
                    pok2 += Math.random();

                }
                if (pok1 < pok2) {
                    System.out.println(p1.getName() + " ist der Gewinner!");
                } else if (pok1 > pok2) {
                    System.out.println(p2.getName() + " ist der Gewinner!");
                } else {
                    System.out.println("Unentschieden!");
                }
            }
        }
    }

}
