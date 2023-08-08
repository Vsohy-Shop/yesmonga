package androidx.camera.view;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

/* renamed from: androidx.camera.view.g */
public final class C1788g {
    @C0359n0
    /* renamed from: a */
    public static String m7156a(int i) {
        if (i == 0) {
            return "AUTO";
        }
        if (i == 1) {
            return "ON";
        }
        if (i == 2) {
            return "OFF";
        }
        throw new IllegalArgumentException("Unknown flash mode " + i);
    }

    /* renamed from: b */
    public static int m7157b(@C0363p0 String str) {
        if (str != null) {
            char c = 65535;
            switch (str.hashCode()) {
                case 2527:
                    if (str.equals("ON")) {
                        c = 0;
                        break;
                    }
                    break;
                case 78159:
                    if (str.equals("OFF")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2020783:
                    if (str.equals("AUTO")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return 1;
                case 1:
                    return 2;
                case 2:
                    return 0;
                default:
                    throw new IllegalArgumentException("Unknown flash mode name " + str);
            }
        } else {
            throw new NullPointerException("name cannot be null");
        }
    }
}
