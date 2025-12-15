package com.aspringsj;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class SoftwareEngineer {

    String name;
    Integer ID;
    List<String> techStack;

    public SoftwareEngineer() {
    }

    public SoftwareEngineer(String name,
                            Integer ID,
                            String techStack) {
        this.name = name;
        this.ID = ID;
        this.techStack = Collections.singletonList(techStack);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public List<String> getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = Collections.singletonList(techStack);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEngineer that = (SoftwareEngineer) o;
        return Objects.equals(name, that.name) && Objects.equals(ID, that.ID) && Objects.equals(techStack, that.techStack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ID, techStack);
    }
}
