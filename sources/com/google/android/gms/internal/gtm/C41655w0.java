package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.w0 */
public final class C41655w0 {

    /* renamed from: a */
    public final String f105181a;

    /* renamed from: b */
    public final String f105182b;

    /* renamed from: c */
    public final boolean f105183c;

    /* renamed from: d */
    public long f105184d;

    /* renamed from: e */
    public final Map<String, String> f105185e;

    public C41655w0(long j, String str, String str2, boolean z, long j2, Map<String, String> map) {
        C40843u.m166198h(str);
        C40843u.m166198h(str2);
        this.f105181a = str;
        this.f105182b = str2;
        this.f105183c = z;
        this.f105184d = j2;
        if (map != null) {
            this.f105185e = new HashMap(map);
        } else {
            this.f105185e = Collections.emptyMap();
        }
    }

    /* renamed from: a */
    public final long mo136008a() {
        return this.f105184d;
    }

    /* renamed from: b */
    public final String mo136009b() {
        return this.f105181a;
    }

    /* renamed from: c */
    public final String mo136010c() {
        return this.f105182b;
    }

    /* renamed from: d */
    public final Map<String, String> mo136011d() {
        return this.f105185e;
    }

    /* renamed from: e */
    public final void mo136012e(long j) {
        this.f105184d = j;
    }

    /* renamed from: f */
    public final boolean mo136013f() {
        return this.f105183c;
    }
}
