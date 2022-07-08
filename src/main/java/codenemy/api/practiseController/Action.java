package codenemy.api.practiseController;

import java.util.HashMap;

public class Action {
    private String name;
    private HashMap<String,String> parameters;

    public Action(String name, HashMap<String, String> parameters) {
        this.name = name;
        this.parameters = parameters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(HashMap<String, String> parameters) {
        this.parameters = parameters;
    }
}
