package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C40843u;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.measurement.internal.p3 */
public final class C30839p3 {

    /* renamed from: b */
    public static final AtomicReference f73845b = new AtomicReference();

    /* renamed from: c */
    public static final AtomicReference f73846c = new AtomicReference();

    /* renamed from: d */
    public static final AtomicReference f73847d = new AtomicReference();

    /* renamed from: a */
    public final C30827o3 f73848a;

    public C30839p3(C30827o3 o3Var) {
        this.f73848a = o3Var;
    }

    /* renamed from: g */
    public static final String m124103g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        boolean z;
        String str2;
        C40843u.m166202l(strArr);
        C40843u.m166202l(strArr2);
        C40843u.m166202l(atomicReference);
        if (strArr.length == strArr2.length) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        for (int i = 0; i < strArr.length; i++) {
            String str3 = strArr[i];
            if (str == str3 || str.equals(str3)) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* renamed from: a */
    public final String mo87407a(Object[] objArr) {
        String str;
        if (objArr == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Bundle bundle : objArr) {
            if (bundle instanceof Bundle) {
                str = mo87408b(bundle);
            } else {
                str = String.valueOf(bundle);
            }
            if (str != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(str);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: b */
    public final String mo87408b(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        if (!this.f73848a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String next : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(mo87411e(next));
            sb.append("=");
            Object obj = bundle.get(next);
            if (obj instanceof Bundle) {
                str = mo87407a(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                str = mo87407a((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                str = mo87407a(((ArrayList) obj).toArray());
            } else {
                str = String.valueOf(obj);
            }
            sb.append(str);
        }
        sb.append("}]");
        return sb.toString();
    }

    /* renamed from: c */
    public final String mo87409c(zzaw zzaw) {
        String str;
        if (!this.f73848a.zza()) {
            return zzaw.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(zzaw.f74165c);
        sb.append(",name=");
        sb.append(mo87410d(zzaw.f74163a));
        sb.append(",params=");
        zzau zzau = zzaw.f74164b;
        if (zzau == null) {
            str = null;
        } else if (!this.f73848a.zza()) {
            str = zzau.toString();
        } else {
            str = mo87408b(zzau.mo87634W());
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: d */
    public final String mo87410d(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f73848a.zza()) {
            return str;
        }
        return m124103g(str, C30706e6.f73360c, C30706e6.f73358a, f73845b);
    }

    /* renamed from: e */
    public final String mo87411e(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f73848a.zza()) {
            return str;
        }
        return m124103g(str, C30719f6.f73386b, C30719f6.f73385a, f73846c);
    }

    /* renamed from: f */
    public final String mo87412f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f73848a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m124103g(str, C30732g6.f73459b, C30732g6.f73458a, f73847d);
        }
        return "experiment_id(" + str + ")";
    }
}
