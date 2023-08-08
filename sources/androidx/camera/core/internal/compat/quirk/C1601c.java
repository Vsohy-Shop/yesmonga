package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.camera.core.impl.C1447e1;
import androidx.camera.core.impl.C1583y;
import androidx.camera.core.impl.Config;

/* renamed from: androidx.camera.core.internal.compat.quirk.c */
public final class C1601c implements C1447e1 {
    /* renamed from: a */
    public static boolean m6625a() {
        if (!"HONOR".equalsIgnoreCase(Build.BRAND) || !"STK-LX1".equalsIgnoreCase(Build.MODEL)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m6626b() {
        if (!"HUAWEI".equalsIgnoreCase(Build.BRAND) || !"SNE-LX1".equalsIgnoreCase(Build.MODEL)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m6627d() {
        return m6626b() || m6625a();
    }

    /* renamed from: c */
    public boolean mo5596c(@C0359n0 Config.C1421a<?> aVar) {
        return aVar != C1583y.f4496g;
    }
}
