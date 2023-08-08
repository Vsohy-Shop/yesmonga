package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.C1447e1;
import androidx.camera.view.internal.compat.quirk.C1799d;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: androidx.camera.core.internal.compat.quirk.d */
public class C1602d implements C1447e1 {

    /* renamed from: a */
    public static final List<String> f4534a = Arrays.asList(new String[]{"SM-G9300", "SM-G930R", "SM-G930A", "SM-G930V", "SM-G930T", "SM-G930U", "SM-G930P", "SM-SC02H", "SM-SCV33", "SM-G9350", "SM-G935R", "SM-G935A", "SM-G935V", "SM-G935T", "SM-G935U", "SM-G935P"});

    /* renamed from: a */
    public static boolean m6629a() {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        if (!C1799d.f4956a.equals(str.toUpperCase(locale)) || !f4534a.contains(Build.MODEL.toUpperCase(locale))) {
            return false;
        }
        return true;
    }
}
