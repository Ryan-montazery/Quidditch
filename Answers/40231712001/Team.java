class Team {
    private int goals = 0;

    private Keeper keeper_0;
    private Seeker seeker_0;
    private Chaser chaser_0;
    private Chaser chaser_1;
    private Chaser chaser_2;
    private Beater beater_0;
    private Beater beater_1;

    public Team() {
        this.keeper_0 = new Keeper("Oliver Wood", 0, 70);
        this.seeker_0 = new Seeker("Harry Potter", 1, 5);
        this.chaser_0 = new Chaser("Angelina Johnson", 2, 30);
        this.chaser_1 = new Chaser("Katie Bell", 3, 30);
        this.chaser_2 = new Chaser("Alicia Spinnet", 4, 30);
        this.beater_0 = new Beater("Fred Weasley", 5, 40);
        this.beater_1 = new Beater("George Weasley", 6, 40);
        this.goals = 0;
    }

    public int getGoal() {
        return goals;
    }

    private void setGoal() {
        goals++;
    }

    // returns true if found golden snitch
    public boolean play() {
        if (seeker_0.isSuccessful()) {
            return true;
        }

        if (keeper_0.isSuccessful() && (beater_0.isSuccessful() || beater_1.isSuccessful()) &&
           ((chaser_0.isSuccessful() && chaser_1.isSuccessful()) || (chaser_2.isSuccessful() &&
           chaser_2.isSuccessful()) || (chaser_1.isSuccessful() && chaser_2.isSuccessful()))) 
        {
            setGoal();
        }
        return false;
    }
}
