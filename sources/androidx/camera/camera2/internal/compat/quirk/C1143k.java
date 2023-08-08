package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.camera.camera2.internal.compat.C1073h;
import androidx.camera.core.internal.compat.quirk.C1604f;
import androidx.core.util.C18001r;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.k */
public final class C1143k implements C1604f {

    /* renamed from: a */
    public static final Set<String> f3357a = new HashSet(Arrays.asList(new String[]{"heroqltevzw", "heroqltetmo"}));

    /* renamed from: b */
    public static final Set<Integer> f3358b;

    static {
        HashSet hashSet = new HashSet();
        f3358b = hashSet;
        hashSet.add(1);
        hashSet.add(3);
    }

    /* renamed from: a */
    public static boolean m4848a(@C0359n0 C1073h hVar) {
        int intValue = ((Integer) C18001r.m81775l((Integer) hVar.mo4323a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL))).intValue();
        if (!f3357a.contains(Build.DEVICE.toLowerCase(Locale.US)) || !f3358b.contains(Integer.valueOf(intValue))) {
            return false;
        }
        return true;
    }
}
