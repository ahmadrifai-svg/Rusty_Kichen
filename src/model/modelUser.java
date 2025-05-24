package model;

public class modelUser {
    private String idUser;
    private String username;
    private String password;
    private String role;
    private String rfid;

    public modelUser() {
    }

    public modelUser(String idUser, String username, String role) {
        this.idUser = idUser;
        this.username = username;
        this.role = role;
    }

    public modelUser(String idUser, String username, String password, String role, String rfid) {
        this.idUser = idUser;
        this.username = username;
        this.password = password;
        this.role = role;
        this.rfid = rfid;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRfid() {
        return rfid;
    }

    public void setRfid(String rfid) {
        this.rfid = rfid;
    }
}
