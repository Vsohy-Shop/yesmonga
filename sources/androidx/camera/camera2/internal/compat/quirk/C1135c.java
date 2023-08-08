package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.camera.camera2.internal.compat.C1073h;
import androidx.camera.core.internal.compat.quirk.C1605g;
import androidx.camera.view.internal.compat.quirk.C1799d;
import java.util.Locale;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.c */
public class C1135c implements C1605g {
    /* renamed from: a */
    public static boolean m4832a(@C0359n0 C1073h hVar) {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        if (!C1799d.f4956a.equals(str.toUpperCase(locale)) || !Build.MODEL.toUpperCase(locale).startsWith("SM-N920") || ((Integer) hVar.mo4323a(CameraCharacteristics.LENS_FACING)).intValue() != 1) {
            return false;
        }
        return true;
    }
}
