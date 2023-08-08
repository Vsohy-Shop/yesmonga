package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.urbanairship.iam.C9259x;

/* renamed from: com.google.android.gms.maps.internal.n1 */
public final class C30513n1 {
    @C0363p0
    /* renamed from: a */
    public static <T extends Parcelable> T m122776a(@C0363p0 Bundle bundle, String str) {
        ClassLoader d = m122779d();
        bundle.setClassLoader(d);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(d);
        return bundle2.getParcelable(str);
    }

    /* renamed from: b */
    public static void m122777b(@C0363p0 Bundle bundle, @C0363p0 Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            Parcelable a = m122776a(bundle, "MapOptions");
            if (a != null) {
                m122778c(bundle2, "MapOptions", a);
            }
            Parcelable a2 = m122776a(bundle, "StreetViewPanoramaOptions");
            if (a2 != null) {
                m122778c(bundle2, "StreetViewPanoramaOptions", a2);
            }
            Parcelable a3 = m122776a(bundle, "camera");
            if (a3 != null) {
                m122778c(bundle2, "camera", a3);
            }
            if (bundle.containsKey(C9259x.f25239v)) {
                bundle2.putString(C9259x.f25239v, bundle.getString(C9259x.f25239v));
            }
            if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
                bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
            }
        }
    }

    /* renamed from: c */
    public static void m122778c(Bundle bundle, String str, @C0363p0 Parcelable parcelable) {
        ClassLoader d = m122779d();
        bundle.setClassLoader(d);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(d);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }

    /* renamed from: d */
    public static ClassLoader m122779d() {
        return (ClassLoader) C40843u.m166202l(C30513n1.class.getClassLoader());
    }
}
