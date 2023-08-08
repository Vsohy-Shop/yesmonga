package androidx.compose.foundation.layout;

import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8547h2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
/* renamed from: androidx.compose.foundation.layout.a1 */
public final class C2339a1 implements C2354e1 {
    @C12579k

    /* renamed from: b */
    public final C2354e1 f6236b;
    @C12579k

    /* renamed from: c */
    public final C2354e1 f6237c;

    public C2339a1(@C12579k C2354e1 e1Var, @C12579k C2354e1 e1Var2) {
        Intrinsics.checkNotNullParameter(e1Var, "first");
        Intrinsics.checkNotNullParameter(e1Var2, "second");
        this.f6236b = e1Var;
        this.f6237c = e1Var2;
    }

    /* renamed from: a */
    public int mo7984a(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        return Math.max(this.f6236b.mo7984a(dVar), this.f6237c.mo7984a(dVar));
    }

    /* renamed from: b */
    public int mo7985b(@C12579k C16479d dVar, @C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return Math.max(this.f6236b.mo7985b(dVar, layoutDirection), this.f6237c.mo7985b(dVar, layoutDirection));
    }

    /* renamed from: c */
    public int mo7986c(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        return Math.max(this.f6236b.mo7986c(dVar), this.f6237c.mo7986c(dVar));
    }

    /* renamed from: d */
    public int mo7987d(@C12579k C16479d dVar, @C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return Math.max(this.f6236b.mo7987d(dVar, layoutDirection), this.f6237c.mo7987d(dVar, layoutDirection));
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2339a1)) {
            return false;
        }
        C2339a1 a1Var = (C2339a1) obj;
        if (!Intrinsics.areEqual((Object) a1Var.f6236b, (Object) this.f6236b) || !Intrinsics.areEqual((Object) a1Var.f6237c, (Object) this.f6237c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f6236b.hashCode() + (this.f6237c.hashCode() * 31);
    }

    @C12579k
    public String toString() {
        return '(' + this.f6236b + " ∪ " + this.f6237c + ')';
    }
}
