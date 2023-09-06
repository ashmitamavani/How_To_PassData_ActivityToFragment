package com.example.how_to_passdata_activitytofragment;

public class Model_Class {

    String mobile;
    String email;

    public Model_Class(String mobile, String email) {
        this.mobile = mobile;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Model_Class{" +
                "mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
