package com.example.ailatrieuphu.Model;

public class LoginModel {

    private String currentName;
    private String currentPassword;

    public LoginModel() {

    }

    public String getCurrentName() {
        return currentName;
    }

    public void setCurrentName(String currentName) {
        this.currentName = currentName;
    }

    public String getCurrentPassword() {
        return currentPassword;
    }

    public void setCurrentPassword(String currentPassword) { this.currentPassword = currentPassword; }

    public void addUserAccount(){
        // add user account into database
    }
}
