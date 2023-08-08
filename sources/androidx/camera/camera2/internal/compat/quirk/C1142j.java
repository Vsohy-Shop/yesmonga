package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.camera.camera2.internal.compat.C1073h;
import androidx.camera.core.internal.compat.quirk.C1605g;
import androidx.camera.view.internal.compat.quirk.C1799d;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.j */
public class C1142j implements C1605g {

    /* renamed from: a */
    public static final List<String> f3356a = Arrays.asList(new String[]{"SM-G9300", "SM-G930R", "SM-G930A", "SM-G930V", "SM-G930T", "SM-G930U", "SM-G930P", "SM-SC02H", "SM-SCV33", "SM-G9350", "SM-G935R", "SM-G935A", "SM-G935V", "SM-G935T", "SM-G935U", "SM-G935P"});

    /* renamed from: a */
    public static boolean m4847a(@C0359n0 C1073h hVar) {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        if (!C1799d.f4956a.equals(str.toUpperCase(locale)) || !f3356a.contains(Build.MODEL.toUpperCase(locale)) || ((Integer) hVar.mo4323a(CameraCharacteristics.LENS_FACING)).intValue() != 1) {
            return false;
        }
        return true;
    }
}
