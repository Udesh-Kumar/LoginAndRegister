package com.example.cc.uidesing;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginModel {

    @SerializedName("success")
    @Expose
    private String success;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("details")
    @Expose
    private Details details;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    public class Details {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("password")
        @Expose
        private String password;
        @SerializedName("phone")
        @Expose
        private String phone;
        @SerializedName("parents_relation")
        @Expose
        private String parentsRelation;
        @SerializedName("language")
        @Expose
        private String language;
        @SerializedName("image")
        @Expose
        private String image;
        @SerializedName("verified_status")
        @Expose
        private String verifiedStatus;
        @SerializedName("token")
        @Expose
        private String token;
        @SerializedName("device_type")
        @Expose
        private String deviceType;
        @SerializedName("reg_id")
        @Expose
        private String regId;
        @SerializedName("login_type")
        @Expose
        private String loginType;
        @SerializedName("social_id")
        @Expose
        private String socialId;
        @SerializedName("is_contact")
        @Expose
        private String isContact;
        @SerializedName("is_location")
        @Expose
        private String isLocation;
        @SerializedName("is_app")
        @Expose
        private String isApp;
        @SerializedName("is_plasealert")
        @Expose
        private String isPlasealert;
        @SerializedName("is_sos")
        @Expose
        private String isSos;
        @SerializedName("is_pickmealert")
        @Expose
        private String isPickmealert;
        @SerializedName("is_speed")
        @Expose
        private String isSpeed;
        @SerializedName("created")
        @Expose
        private String created;
        @SerializedName("updated")
        @Expose
        private String updated;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getParentsRelation() {
            return parentsRelation;
        }

        public void setParentsRelation(String parentsRelation) {
            this.parentsRelation = parentsRelation;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getVerifiedStatus() {
            return verifiedStatus;
        }

        public void setVerifiedStatus(String verifiedStatus) {
            this.verifiedStatus = verifiedStatus;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getDeviceType() {
            return deviceType;
        }

        public void setDeviceType(String deviceType) {
            this.deviceType = deviceType;
        }

        public String getRegId() {
            return regId;
        }

        public void setRegId(String regId) {
            this.regId = regId;
        }

        public String getLoginType() {
            return loginType;
        }

        public void setLoginType(String loginType) {
            this.loginType = loginType;
        }

        public String getSocialId() {
            return socialId;
        }

        public void setSocialId(String socialId) {
            this.socialId = socialId;
        }

        public String getIsContact() {
            return isContact;
        }

        public void setIsContact(String isContact) {
            this.isContact = isContact;
        }

        public String getIsLocation() {
            return isLocation;
        }

        public void setIsLocation(String isLocation) {
            this.isLocation = isLocation;
        }

        public String getIsApp() {
            return isApp;
        }

        public void setIsApp(String isApp) {
            this.isApp = isApp;
        }

        public String getIsPlasealert() {
            return isPlasealert;
        }

        public void setIsPlasealert(String isPlasealert) {
            this.isPlasealert = isPlasealert;
        }

        public String getIsSos() {
            return isSos;
        }

        public void setIsSos(String isSos) {
            this.isSos = isSos;
        }

        public String getIsPickmealert() {
            return isPickmealert;
        }

        public void setIsPickmealert(String isPickmealert) {
            this.isPickmealert = isPickmealert;
        }

        public String getIsSpeed() {
            return isSpeed;
        }

        public void setIsSpeed(String isSpeed) {
            this.isSpeed = isSpeed;
        }

        public String getCreated() {
            return created;
        }

        public void setCreated(String created) {
            this.created = created;
        }

        public String getUpdated() {
            return updated;
        }

        public void setUpdated(String updated) {
            this.updated = updated;
        }

    }

}
