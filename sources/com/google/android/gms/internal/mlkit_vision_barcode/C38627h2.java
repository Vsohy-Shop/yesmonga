package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40808s;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.h2 */
public final class C38627h2 {

    /* renamed from: a */
    public final zzje f97881a;

    /* renamed from: b */
    public final Boolean f97882b = null;

    /* renamed from: c */
    public final Boolean f97883c;

    /* renamed from: d */
    public final C38658j7 f97884d;

    /* renamed from: e */
    public final C38725o9 f97885e;

    /* renamed from: f */
    public final zzcc<zzjq> f97886f;

    /* renamed from: g */
    public final zzcc<zzjr> f97887g;

    public /* synthetic */ C38627h2(C38601f2 f2Var, C38614g2 g2Var) {
        this.f97881a = f2Var.f97826a;
        this.f97883c = f2Var.f97827b;
        this.f97884d = null;
        this.f97885e = f2Var.f97828c;
        this.f97886f = f2Var.f97829d;
        this.f97887g = f2Var.f97830e;
    }

    @C0363p0
    @C38768s1(zza = 6)
    /* renamed from: a */
    public final zzcc<zzjq> mo122346a() {
        return this.f97886f;
    }

    @C0363p0
    @C38768s1(zza = 7)
    /* renamed from: b */
    public final zzcc<zzjr> mo122347b() {
        return this.f97887g;
    }

    @C0363p0
    @C38768s1(zza = 1)
    /* renamed from: c */
    public final zzje mo122348c() {
        return this.f97881a;
    }

    @C0363p0
    @C38768s1(zza = 5)
    /* renamed from: d */
    public final C38725o9 mo122349d() {
        return this.f97885e;
    }

    @C0363p0
    @C38768s1(zza = 3)
    /* renamed from: e */
    public final Boolean mo122350e() {
        return this.f97883c;
    }

    public final boolean equals(@C0363p0 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C38627h2)) {
            return false;
        }
        C38627h2 h2Var = (C38627h2) obj;
        if (!C40808s.m166010b(this.f97881a, h2Var.f97881a) || !C40808s.m166010b((Object) null, (Object) null) || !C40808s.m166010b(this.f97883c, h2Var.f97883c) || !C40808s.m166010b((Object) null, (Object) null) || !C40808s.m166010b(this.f97885e, h2Var.f97885e) || !C40808s.m166010b(this.f97886f, h2Var.f97886f) || !C40808s.m166010b(this.f97887g, h2Var.f97887g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C40808s.m166011c(this.f97881a, null, this.f97883c, null, this.f97885e, this.f97886f, this.f97887g);
    }
}
