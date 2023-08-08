package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40808s;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.j7 */
public final class C38658j7 {

    /* renamed from: a */
    public final zzir f97972a;

    /* renamed from: b */
    public final Integer f97973b;

    /* renamed from: c */
    public final Integer f97974c = null;

    /* renamed from: d */
    public final Boolean f97975d = null;

    public /* synthetic */ C38658j7(C38632h7 h7Var, C38645i7 i7Var) {
        this.f97972a = h7Var.f97911a;
        this.f97973b = h7Var.f97912b;
    }

    @C0363p0
    @C38768s1(zza = 1)
    /* renamed from: a */
    public final zzir mo122387a() {
        return this.f97972a;
    }

    @C0363p0
    @C38768s1(zza = 2)
    /* renamed from: b */
    public final Integer mo122388b() {
        return this.f97973b;
    }

    public final boolean equals(@C0363p0 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C38658j7)) {
            return false;
        }
        C38658j7 j7Var = (C38658j7) obj;
        if (!C40808s.m166010b(this.f97972a, j7Var.f97972a) || !C40808s.m166010b(this.f97973b, j7Var.f97973b) || !C40808s.m166010b((Object) null, (Object) null) || !C40808s.m166010b((Object) null, (Object) null)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C40808s.m166011c(this.f97972a, this.f97973b, null, null);
    }
}
