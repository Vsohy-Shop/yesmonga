package com.google.android.gms.internal.mlkit_vision_text_common;

import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40808s;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.i2 */
public final class C30084i2 {

    /* renamed from: a */
    public final zziu f71914a;

    /* renamed from: b */
    public final Boolean f71915b = null;

    /* renamed from: c */
    public final Boolean f71916c;

    /* renamed from: d */
    public final C30017c7 f71917d;

    /* renamed from: e */
    public final C30294z8 f71918e;

    public /* synthetic */ C30084i2(C30060g2 g2Var, C30072h2 h2Var) {
        this.f71914a = g2Var.f71870a;
        this.f71916c = g2Var.f71871b;
        this.f71917d = null;
        this.f71918e = g2Var.f71872c;
    }

    @C0363p0
    @C30071h1(zza = 1)
    /* renamed from: a */
    public final zziu mo85149a() {
        return this.f71914a;
    }

    @C0363p0
    @C30071h1(zza = 5)
    /* renamed from: b */
    public final C30294z8 mo85150b() {
        return this.f71918e;
    }

    @C0363p0
    @C30071h1(zza = 3)
    /* renamed from: c */
    public final Boolean mo85151c() {
        return this.f71916c;
    }

    public final boolean equals(@C0363p0 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C30084i2)) {
            return false;
        }
        C30084i2 i2Var = (C30084i2) obj;
        if (!C40808s.m166010b(this.f71914a, i2Var.f71914a) || !C40808s.m166010b((Object) null, (Object) null) || !C40808s.m166010b(this.f71916c, i2Var.f71916c) || !C40808s.m166010b((Object) null, (Object) null) || !C40808s.m166010b(this.f71918e, i2Var.f71918e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C40808s.m166011c(this.f71914a, null, this.f71916c, null, this.f71918e);
    }
}
