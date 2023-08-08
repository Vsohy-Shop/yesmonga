package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.C1447e1;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.l */
public class C1144l implements C1447e1 {

    /* renamed from: a */
    public static final List<String> f3359a = Arrays.asList(new String[]{"NEXUS 4"});

    /* renamed from: b */
    public static boolean m4849b() {
        "GOOGLE".equals(Build.BRAND.toUpperCase());
        return false;
    }

    /* renamed from: a */
    public int mo4436a() {
        return 2;
    }
}
