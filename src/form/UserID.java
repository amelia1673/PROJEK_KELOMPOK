package form;

public class UserID {

    private static String id;
    private static String nama;

    static void setIdTeknisi(String idTek) {
        UserID.id = idTek;
    }

    public static String getIdTeknisi() {
        return id;
    }

    public static void setNamaTeknisi(String namaTeknisi) {
        UserID.nama = namaTeknisi;
    }

    public static String getNamaTeknisi() {
        return nama;
    }
}
