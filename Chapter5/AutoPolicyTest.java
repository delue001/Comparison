package Chapter5;

import Chapter5.AutoPolicy;

public class AutoPolicyTest {
    public static void main(String [] args) {
        AutoPolicy Policy1 = new AutoPolicy(1111111,"Toyota Camry","NJ");
        AutoPolicy Policy2 = new AutoPolicy(706116763,"Bentley Model","ME");
        policyIsNoFaultState(Policy1);
        policyIsNoFaultState(Policy2);
    }
    public static void policyIsNoFaultState(AutoPolicy policy) {
        System.out.println("The auto policy: ");
        System.out.printf("Account #: %d; Car: %s; State %s %s a no-fault state%n%n",
                policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(),
                (policy.isNoFaultState() ? "is": "is not"));
    }
}
