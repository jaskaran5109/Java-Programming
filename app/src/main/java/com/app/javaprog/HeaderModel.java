package com.app.javaprog;

public class HeaderModel implements ProgramsActivity.ListItem{

    String header;

    public void setheader(String header) {
        this.header = header;
    }

    @Override
    public boolean isHeader() {
        return true;
    }

    @Override
    public boolean isChild() {
        return false;
    }

    @Override
    public String getName() {
        return header;
    }
}