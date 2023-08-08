package androidx.camera.view.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.C1447e1;

/* renamed from: androidx.camera.view.internal.compat.quirk.c */
public class C1798c implements C1447e1 {

    /* renamed from: a */
    public static final String f4954a = "A3Y17LTE";

    /* renamed from: b */
    public static final String f4955b = "ON5XELTE";

    /* renamed from: b */
    public static boolean m7184b() {
        boolean z;
        String str = Build.DEVICE;
        if (!f4955b.equals(str.toUpperCase()) || Build.VERSION.SDK_INT < 26) {
            z = false;
        } else {
            z = true;
        }
        boolean equals = f4954a.equals(str.toUpperCase());
        if (z || equals) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public float mo5949a() {
        return 0.75f;
    }
}
