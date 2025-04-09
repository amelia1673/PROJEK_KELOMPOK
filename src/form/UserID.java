package form;

public class UserID {

    private static String kd;

    static void setUserLogin(String kode) {
        UserID.kd = kode;
    }

    public static String getUserLogin() {
        return kd;
    }
}
