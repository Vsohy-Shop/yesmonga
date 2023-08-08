package androidx.camera.core.impl;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

/* renamed from: androidx.camera.core.impl.u0 */
public class C1507u0 {
    @C0359n0
    /* renamed from: a */
    public static String m6314a(int i) {
        if (i == 0) {
            return "FRONT";
        }
        if (i == 1) {
            return "BACK";
        }
        throw new IllegalArgumentException("Unknown lens facing " + i);
    }

    /* renamed from: b */
    public static int m6315b(@C0363p0 String str) {
        if (str == null) {
            throw new NullPointerException("name cannot be null");
        } else if (str.equals("BACK")) {
            return 1;
        } else {
            if (str.equals("FRONT")) {
                return 0;
            }
            throw new IllegalArgumentException("Unknown len facing name " + str);
        }
    }

    @C0359n0
    /* renamed from: c */
    public static Integer[] m6316c() {
        return new Integer[]{0, 1};
    }
}
