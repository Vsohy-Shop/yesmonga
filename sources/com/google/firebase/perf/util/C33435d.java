package com.google.firebase.perf.util;

import android.os.Bundle;
import com.google.firebase.perf.logging.C33363a;

/* renamed from: com.google.firebase.perf.util.d */
public final class C33435d {

    /* renamed from: b */
    public static final C33363a f81329b = C33363a.m134449e();

    /* renamed from: a */
    public final Bundle f81330a;

    public C33435d() {
        this(new Bundle());
    }

    /* renamed from: a */
    public boolean mo96906a(String str) {
        return str != null && this.f81330a.containsKey(str);
    }

    /* renamed from: b */
    public C33436e<Boolean> mo96907b(String str) {
        if (!mo96906a(str)) {
            return C33436e.m134825a();
        }
        try {
            return C33436e.m134826b((Boolean) this.f81330a.get(str));
        } catch (ClassCastException e) {
            f81329b.mo96430b("Metadata key %s contains type other than boolean: %s", str, e.getMessage());
            return C33436e.m134825a();
        }
    }

    /* renamed from: c */
    public C33436e<Float> mo96908c(String str) {
        if (!mo96906a(str)) {
            return C33436e.m134825a();
        }
        try {
            return C33436e.m134826b((Float) this.f81330a.get(str));
        } catch (ClassCastException e) {
            f81329b.mo96430b("Metadata key %s contains type other than float: %s", str, e.getMessage());
            return C33436e.m134825a();
        }
    }

    /* renamed from: d */
    public final C33436e<Integer> mo96909d(String str) {
        if (!mo96906a(str)) {
            return C33436e.m134825a();
        }
        try {
            return C33436e.m134826b((Integer) this.f81330a.get(str));
        } catch (ClassCastException e) {
            f81329b.mo96430b("Metadata key %s contains type other than int: %s", str, e.getMessage());
            return C33436e.m134825a();
        }
    }

    /* renamed from: e */
    public C33436e<Long> mo96910e(String str) {
        C33436e<Integer> d = mo96909d(str);
        if (d.mo96912d()) {
            return C33436e.m134827e(Long.valueOf((long) d.mo96911c().intValue()));
        }
        return C33436e.m134825a();
    }

    public C33435d(Bundle bundle) {
        this.f81330a = (Bundle) bundle.clone();
    }
}
