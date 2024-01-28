package model;

public class User {
    int id;
    int roleId;
    String tokenId;
    String login;
    String passwordHash;
    String name;
    String avatar;
    String email;
    String registered;
    String note;


    public User(
            int id,
            int roleId,
            String tokenId,
            String login,
            String passwordHash,
            String name,
            String avatar,
            String email,
            String registered,
            String note) {

        this.id = id;
        this.roleId = roleId;
        this.tokenId = tokenId;
        this.login = login;
        this.passwordHash = passwordHash;
        this.name = name;
        this.avatar = avatar;
        this.email = email;
        this.registered = registered;
        this.note = note;
    }

    public User(){

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
