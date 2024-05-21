package Policy;

import java.util.List;

public class PolicyList {
    private static PolicyList instance;
    private List<Policy> policies;

    public static PolicyList getInstance() {
        if (instance == null) {
            instance = new PolicyList();
        }
        return instance;
    }

    public List<Policy> getPolicies() {
        return policies;
    }

    public void addPolicy(Policy policy) {
        policies.add(policy);
        return;
    }

    public void deletePolicy(Policy policy) {
        policies.remove(policy);
        return;
    }

}
