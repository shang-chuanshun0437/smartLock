package mutong.com.mtaj.repository;

/**
 * Created by Administrator on 2018/5/28.
 */

public class User
{
    private String userName;

    private String userToken ;

    private String refreshToken ;

    private String password;

    private String nickName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userToken='" + userToken + '\'' +
                ", refreshToken='" + refreshToken + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
