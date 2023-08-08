package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.C1447e1;
import androidx.camera.view.internal.compat.quirk.C1799d;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.e */
public class C1137e implements C1447e1 {
    /* renamed from: a */
    public static boolean m4834a() {
        if (!C1799d.f4956a.equals(Build.MANUFACTURER.toUpperCase()) || !Build.MODEL.toUpperCase().startsWith("SM-A300")) {
            return false;
        }
        return true;
    }
}
