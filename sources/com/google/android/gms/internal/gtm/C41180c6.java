package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.common.util.C40974d0;
import java.util.Map;

@C40974d0
/* renamed from: com.google.android.gms.internal.gtm.c6 */
public final class C41180c6 {

    /* renamed from: a */
    public final long f104488a;

    /* renamed from: b */
    public final long f104489b;

    /* renamed from: c */
    public String f104490c;

    /* renamed from: d */
    public String f104491d;

    /* renamed from: e */
    public Map<String, String> f104492e;

    /* renamed from: f */
    public String f104493f;

    public C41180c6(long j, long j2, long j3) {
        this.f104488a = j;
        this.f104489b = j3;
    }

    /* renamed from: a */
    public final long mo135160a() {
        return this.f104489b;
    }

    /* renamed from: b */
    public final long mo135161b() {
        return this.f104488a;
    }

    /* renamed from: c */
    public final String mo135162c() {
        return this.f104493f;
    }

    /* renamed from: d */
    public final String mo135163d() {
        return this.f104491d;
    }

    /* renamed from: e */
    public final String mo135164e() {
        return this.f104490c;
    }

    /* renamed from: f */
    public final Map<String, String> mo135165f() {
        return this.f104492e;
    }

    /* renamed from: g */
    public final void mo135166g(String str) {
        this.f104493f = str;
    }

    /* renamed from: h */
    public final void mo135167h(Map<String, String> map) {
        this.f104492e = map;
    }

    /* renamed from: i */
    public final void mo135168i(String str) {
        this.f104491d = str;
    }

    /* renamed from: j */
    public final void mo135169j(String str) {
        if (str != null && !TextUtils.isEmpty(str.trim())) {
            this.f104490c = str;
        }
    }
}
