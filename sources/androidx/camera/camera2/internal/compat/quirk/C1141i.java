package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.C1447e1;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.i */
public class C1141i implements C1447e1 {
    /* renamed from: a */
    public static boolean m4844a() {
        if (!"Google".equals(Build.MANUFACTURER) || !"Pixel 2".equals(Build.MODEL)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m4845b() {
        if (!"Google".equals(Build.MANUFACTURER) || !"Pixel 3".equals(Build.MODEL)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m4846c() {
        return (m4844a() || m4845b()) && Build.VERSION.SDK_INT >= 26;
    }
}
