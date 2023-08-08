package com.google.android.gms.internal.mlkit_vision_text_common;

import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40808s;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.c7 */
public final class C30017c7 {

    /* renamed from: a */
    public final zzih f71774a;

    /* renamed from: b */
    public final Integer f71775b;

    /* renamed from: c */
    public final Integer f71776c = null;

    /* renamed from: d */
    public final Boolean f71777d = null;

    public /* synthetic */ C30017c7(C29992a7 a7Var, C30005b7 b7Var) {
        this.f71774a = a7Var.f71734a;
        this.f71775b = a7Var.f71735b;
    }

    @C0363p0
    @C30071h1(zza = 1)
    /* renamed from: a */
    public final zzih mo85046a() {
        return this.f71774a;
    }

    @C0363p0
    @C30071h1(zza = 2)
    /* renamed from: b */
    public final Integer mo85047b() {
        return this.f71775b;
    }

    public final boolean equals(@C0363p0 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C30017c7)) {
            return false;
        }
        C30017c7 c7Var = (C30017c7) obj;
        if (!C40808s.m166010b(this.f71774a, c7Var.f71774a) || !C40808s.m166010b(this.f71775b, c7Var.f71775b) || !C40808s.m166010b((Object) null, (Object) null) || !C40808s.m166010b((Object) null, (Object) null)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C40808s.m166011c(this.f71774a, this.f71775b, null, null);
    }
}
