package kitapsatis.kitapsatis.form.request;

public class UserRequest {

    private String name;
    private String email;
    private String password;
    private String address;
    private String gsm;

    public String getAddress() {return address;}

    public void setAddress(String address) {this.address = address;}

    public String getGsm() {return gsm;}

    public void setGsm(String gsm) {this.gsm = gsm;}

    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public String getEmail(){return email;}
    public void setEmail(String email){this.email=email;}
}
