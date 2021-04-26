package com.app.javaprog;

public class ChildModel implements ProgramsActivity.ListItem{

    String child;

    public void setChild(String child) {
        this.child = child;
    }

    @Override
    public boolean isHeader() {
        return false;
    }

    @Override
    public boolean isChild() {
        return true;
    }

    @Override
    public String getName() {
        return child;
    }

}