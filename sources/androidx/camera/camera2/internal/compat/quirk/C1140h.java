package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import androidx.annotation.C0359n0;
import androidx.camera.core.C1417i2;
import androidx.camera.core.impl.C1447e1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p009io.github.aakira.napier.C10848c;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.h */
public class C1140h implements C1447e1 {

    /* renamed from: a */
    public static final String f3355a = "ExcludedSupportedSizesQuirk";

    /* renamed from: d */
    public static boolean m4838d() {
        if (!"OnePlus".equalsIgnoreCase(Build.BRAND) || !"OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m4839e() {
        if (!"OnePlus".equalsIgnoreCase(Build.BRAND) || !"OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m4840f() {
        return m4838d() || m4839e();
    }

    @C0359n0
    /* renamed from: a */
    public List<Size> mo4433a(@C0359n0 String str, int i) {
        if (m4838d()) {
            return mo4434b(str, i);
        }
        if (m4839e()) {
            return mo4435c(str, i);
        }
        C1417i2.m5924n(f3355a, "Cannot retrieve list of supported sizes to exclude on this device.");
        return Collections.emptyList();
    }

    @C0359n0
    /* renamed from: b */
    public final List<Size> mo4434b(@C0359n0 String str, int i) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(C10848c.f28038c, 3000));
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: c */
    public final List<Size> mo4435c(@C0359n0 String str, int i) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(C10848c.f28038c, 3000));
        }
        return arrayList;
    }
}
