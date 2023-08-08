package androidx.camera.view.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.C1447e1;

/* renamed from: androidx.camera.view.internal.compat.quirk.d */
public class C1799d implements C1447e1 {

    /* renamed from: a */
    public static final String f4956a = "SAMSUNG";

    /* renamed from: b */
    public static final String f4957b = "F2Q";

    /* renamed from: a */
    public static boolean m7186a() {
        if (!f4956a.equals(Build.MANUFACTURER.toUpperCase()) || !f4957b.equals(Build.DEVICE.toUpperCase())) {
            return false;
        }
        return true;
    }
}
