package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.C1447e1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.m */
public class C1145m implements C1447e1 {

    /* renamed from: a */
    public static final List<String> f3360a = new ArrayList(Arrays.asList(new String[]{"sunfish", "bramble", "redfin"}));

    /* renamed from: a */
    public static boolean m4851a() {
        if (!"Google".equals(Build.MANUFACTURER) || !f3360a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()))) {
            return false;
        }
        return true;
    }
}
