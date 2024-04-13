class Match {
    Team t1 = new Team();
    Team t2 = new Team();

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (t1.play()) {
                System.out.println("Golden Snitch Found by team 1!");
                return;
            } else if (t2.play()) {
                System.out.println("Golden Snitch Found by team 2!");
                return;
            }
        }

        if (t1.getGoal() > t2.getGoal()) {
            System.out.println("Team 1 Win!");
        } else if (t2.getGoal() > t1.getGoal()) {
            System.out.println("Team 2 Win!");
        } else {
            System.out.println("Equal");
        }
    }
}
