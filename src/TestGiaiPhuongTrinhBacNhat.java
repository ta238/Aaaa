import jdk.jshell.execution.Util;

import javax.swing.text.DefaultEditorKit;

public class TestGiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        PhuongTrinhBacNhat[] pt = new PhuongTrinhBacNhat[5];
        for (PhuongTrinhBacNhat a : pt) {

            PhuongTrinhBacNhat s = new PhuongTrinhBacNhat();

            s.nhapThongTin();
            s.hienThiThongTin();
        }

    }
}
