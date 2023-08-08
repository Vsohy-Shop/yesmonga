package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.camera.core.impl.C1444d1;
import androidx.camera.core.impl.C1447e1;
import androidx.camera.core.impl.Config;
import androidx.camera.view.internal.compat.quirk.C1799d;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.n */
public class C1146n implements C1447e1 {

    /* renamed from: a */
    public static final List<String> f3361a = Arrays.asList(new String[]{"SM-J710MN", "SM-T580"});

    /* renamed from: a */
    public static boolean m4852a() {
        if (!C1799d.f4956a.equals(Build.BRAND.toUpperCase()) || !f3361a.contains(Build.MODEL.toUpperCase())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo4437b(@C0359n0 Config config) {
        return config instanceof C1444d1;
    }
}
