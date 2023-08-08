package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40808s;

/* renamed from: com.google.android.gms.internal.mlkit_common.h6 */
public final class C42387h6 {

    /* renamed from: a */
    public final String f107079a;

    /* renamed from: b */
    public final String f107080b = null;

    /* renamed from: c */
    public final zzhj f107081c;

    /* renamed from: d */
    public final String f107082d;

    /* renamed from: e */
    public final String f107083e;

    /* renamed from: f */
    public final zzhi f107084f;

    /* renamed from: g */
    public final Long f107085g;

    /* renamed from: h */
    public final Boolean f107086h;

    /* renamed from: i */
    public final Boolean f107087i;

    public /* synthetic */ C42387h6(C42365f6 f6Var, C42376g6 g6Var) {
        this.f107079a = f6Var.f107029a;
        this.f107081c = f6Var.f107030b;
        this.f107082d = null;
        this.f107083e = f6Var.f107031c;
        this.f107084f = f6Var.f107032d;
        this.f107085g = null;
        this.f107086h = null;
        this.f107087i = null;
    }

    @C0363p0
    @C42544w(zza = 6)
    /* renamed from: a */
    public final zzhi mo137701a() {
        return this.f107084f;
    }

    @C0363p0
    @C42544w(zza = 3)
    /* renamed from: b */
    public final zzhj mo137702b() {
        return this.f107081c;
    }

    @C0363p0
    @C42544w(zza = 5)
    /* renamed from: c */
    public final String mo137703c() {
        return this.f107083e;
    }

    @C0363p0
    @C42544w(zza = 1)
    /* renamed from: d */
    public final String mo137704d() {
        return this.f107079a;
    }

    public final boolean equals(@C0363p0 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C42387h6)) {
            return false;
        }
        C42387h6 h6Var = (C42387h6) obj;
        if (!C40808s.m166010b(this.f107079a, h6Var.f107079a) || !C40808s.m166010b((Object) null, (Object) null) || !C40808s.m166010b(this.f107081c, h6Var.f107081c) || !C40808s.m166010b((Object) null, (Object) null) || !C40808s.m166010b(this.f107083e, h6Var.f107083e) || !C40808s.m166010b(this.f107084f, h6Var.f107084f) || !C40808s.m166010b((Object) null, (Object) null) || !C40808s.m166010b((Object) null, (Object) null) || !C40808s.m166010b((Object) null, (Object) null)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C40808s.m166011c(this.f107079a, null, this.f107081c, null, this.f107083e, this.f107084f, null, null, null);
    }
}
