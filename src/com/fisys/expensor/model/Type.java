package com.fisys.expensor.model;

public enum Type{
    INCOME("INCOME"),
    EXPENSE("EXPENSE"),
    TRANSFER("TRANSFER");

    private String type;

    Type(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }

    public static Type fromString(String type){

        if (type != null) {
            for (Type t : Type.values()) {
                if (type.equalsIgnoreCase(t.type)) {
                    return t;
                }
            }
        }
        return null;

    }

    public static String[] names() {
        Type[] types = values();
        String[] names = new String[types.length];

        for (int i = 0; i < types.length; i++) {
            names[i] = types[i].name();
        }

        return names;
    }
}
