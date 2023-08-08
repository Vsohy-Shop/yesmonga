package androidx.camera.view.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.C1447e1;

/* renamed from: androidx.camera.view.internal.compat.quirk.e */
public class C1800e implements C1447e1 {

    /* renamed from: a */
    public static final String f4958a = "Fairphone";

    /* renamed from: b */
    public static final String f4959b = "FP2";

    /* renamed from: b */
    public static boolean m7187b() {
        if (!f4958a.equalsIgnoreCase(Build.MANUFACTURER) || !f4959b.equalsIgnoreCase(Build.MODEL)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m7188c() {
        return m7187b();
    }

    /* renamed from: a */
    public int mo5950a(boolean z) {
        return (!m7187b() || !z) ? 0 : 180;
    }
}
