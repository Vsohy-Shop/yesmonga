package androidx.compose.foundation.layout;

import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8547h2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
/* renamed from: androidx.compose.foundation.layout.l0 */
public final class C2378l0 implements C2354e1 {
    @C12579k

    /* renamed from: b */
    public final C2366i0 f6292b;

    public C2378l0(@C12579k C2366i0 i0Var) {
        Intrinsics.checkNotNullParameter(i0Var, "paddingValues");
        this.f6292b = i0Var;
    }

    /* renamed from: a */
    public int mo7984a(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        return dVar.mo7429n2(this.f6292b.mo8093d());
    }

    /* renamed from: b */
    public int mo7985b(@C12579k C16479d dVar, @C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return dVar.mo7429n2(this.f6292b.mo8092c(layoutDirection));
    }

    /* renamed from: c */
    public int mo7986c(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        return dVar.mo7429n2(this.f6292b.mo8090a());
    }

    /* renamed from: d */
    public int mo7987d(@C12579k C16479d dVar, @C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return dVar.mo7429n2(this.f6292b.mo8091b(layoutDirection));
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2378l0)) {
            return false;
        }
        return Intrinsics.areEqual((Object) ((C2378l0) obj).f6292b, (Object) this.f6292b);
    }

    public int hashCode() {
        return this.f6292b.hashCode();
    }

    @C12579k
    public String toString() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        float b = this.f6292b.mo8091b(layoutDirection);
        float d = this.f6292b.mo8093d();
        float c = this.f6292b.mo8092c(layoutDirection);
        float a = this.f6292b.mo8090a();
        return "PaddingValues(" + C16483g.m74447o0(b) + ", " + C16483g.m74447o0(d) + ", " + C16483g.m74447o0(c) + ", " + C16483g.m74447o0(a) + ')';
    }
}
