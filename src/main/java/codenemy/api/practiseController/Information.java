package codenemy.api.practiseController;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Information {
    private long accountId;
    private long customerId;
    private int day;
    private ArrayList<Assertations> assertations;
    private ArrayList<Action> actions;

    public Information(long accountId, long customerId, int day, ArrayList<Assertations> assertations, ArrayList<Action> actions) {
        this.accountId = accountId;
        this.customerId = customerId;
        this.day = day;
        this.assertations = assertations;
        this.actions = actions;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public ArrayList<Assertations> getAssertations() {
        return assertations;
    }

    public void setAssertations(ArrayList<Assertations> assertations) {
        this.assertations = assertations;
    }

    public ArrayList<Action> getActions() {
        return actions;
    }

    public void setActions(ArrayList<Action> actions) {
        this.actions = actions;
    }
}
