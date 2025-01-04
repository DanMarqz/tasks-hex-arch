package com.danmarqz.tasks_hex_arch.domain.models;

public class AdditionalTaskInfo {

    private final int id;
    private final String userName;
    private final String userEmail;

    public AdditionalTaskInfo(int id, String userName, String userEmail) {
        this.id = id;
        this.userName = userName;
        this.userEmail = userEmail;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }
}
