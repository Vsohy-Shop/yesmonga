package androidx.compose.animation;

import androidx.compose.animation.core.C1956d0;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.animation.s */
public final class C2043s {
    @C12579k

    /* renamed from: a */
    public final C11300l<C16500q, C16494m> f5688a;
    @C12579k

    /* renamed from: b */
    public final C1956d0<C16494m> f5689b;

    public C2043s(@C12579k C11300l<? super C16500q, C16494m> lVar, @C12579k C1956d0<C16494m> d0Var) {
        Intrinsics.checkNotNullParameter(lVar, "slideOffset");
        Intrinsics.checkNotNullParameter(d0Var, "animationSpec");
        this.f5688a = lVar;
        this.f5689b = d0Var;
    }

    /* renamed from: d */
    public static /* synthetic */ C2043s m8749d(C2043s sVar, C11300l<C16500q, C16494m> lVar, C1956d0<C16494m> d0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = sVar.f5688a;
        }
        if ((i & 2) != 0) {
            d0Var = sVar.f5689b;
        }
        return sVar.mo7079c(lVar, d0Var);
    }

    @C12579k
    /* renamed from: a */
    public final C11300l<C16500q, C16494m> mo7077a() {
        return this.f5688a;
    }

    @C12579k
    /* renamed from: b */
    public final C1956d0<C16494m> mo7078b() {
        return this.f5689b;
    }

    @C12579k
    /* renamed from: c */
    public final C2043s mo7079c(@C12579k C11300l<? super C16500q, C16494m> lVar, @C12579k C1956d0<C16494m> d0Var) {
        Intrinsics.checkNotNullParameter(lVar, "slideOffset");
        Intrinsics.checkNotNullParameter(d0Var, "animationSpec");
        return new C2043s(lVar, d0Var);
    }

    @C12579k
    /* renamed from: e */
    public final C1956d0<C16494m> mo7080e() {
        return this.f5689b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2043s)) {
            return false;
        }
        C2043s sVar = (C2043s) obj;
        return Intrinsics.areEqual((Object) this.f5688a, (Object) sVar.f5688a) && Intrinsics.areEqual((Object) this.f5689b, (Object) sVar.f5689b);
    }

    @C12579k
    /* renamed from: f */
    public final C11300l<C16500q, C16494m> mo7082f() {
        return this.f5688a;
    }

    public int hashCode() {
        return (this.f5688a.hashCode() * 31) + this.f5689b.hashCode();
    }

    @C12579k
    public String toString() {
        return "Slide(slideOffset=" + this.f5688a + ", animationSpec=" + this.f5689b + ')';
    }
}
