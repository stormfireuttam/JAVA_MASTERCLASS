package academy.learnprogramming;

class CheckIn {
    Ticket ticket;
    int weightOfLuggage;
    DateTime checkInTime;
    boolean valid = false;

    CheckIn(Ticket t, int w, DateTime ct) {
        this.ticket = t;
        this.weightOfLuggage = w;
        this.checkInTime = ct;
    }

    public void requestCheckIn() {

    }
}
