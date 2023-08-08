package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.C1447e1;
import androidx.camera.view.internal.compat.quirk.C1799d;
import java.util.Locale;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.o */
public class C1147o implements C1447e1 {
    /* renamed from: a */
    public static boolean m4854a() {
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        if (!C1799d.f4956a.equals(str.toUpperCase(locale)) || !Build.MODEL.toUpperCase(locale).startsWith("SM-A716")) {
            return false;
        }
        return true;
    }
}
