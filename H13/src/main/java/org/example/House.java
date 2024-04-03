package org.example;

public class House <T extends Human> {

    private T resident;

    public House(T resident) {
        this.resident = resident;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("This house is owned by ");
        sb.append(resident.toString());
        sb.append(" and it says ");
        sb.append(resident.greet());
        return sb.toString();
    }
}
