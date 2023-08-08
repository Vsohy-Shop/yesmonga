package androidx.compose.foundation.layout;

import androidx.compose.p004ui.layout.C15605u0;
import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.platform.C15988w0;
import androidx.compose.p004ui.unit.C16479d;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.layout.a0 */
public final class C2338a0 extends C15988w0 implements C15605u0 {

    /* renamed from: d */
    public final float f6234d;

    /* renamed from: e */
    public final boolean f6235e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2338a0(float f, boolean z, @C12579k C11300l<? super C15983v0, C11079d2> lVar) {
        super(lVar);
        Intrinsics.checkNotNullParameter(lVar, "inspectorInfo");
        this.f6234d = f;
        this.f6235e = z;
    }

    public boolean equals(@C12580l Object obj) {
        C2338a0 a0Var;
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2338a0) {
            a0Var = (C2338a0) obj;
        } else {
            a0Var = null;
        }
        if (a0Var == null) {
            return false;
        }
        if (this.f6234d == a0Var.f6234d) {
            z = true;
        } else {
            z = false;
        }
        if (!z || this.f6235e != a0Var.f6235e) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Float.hashCode(this.f6234d) * 31) + Boolean.hashCode(this.f6235e);
    }

    /* renamed from: r */
    public final boolean mo7993r() {
        return this.f6235e;
    }

    /* renamed from: s */
    public final float mo7994s() {
        return this.f6234d;
    }

    @C12579k
    /* renamed from: t */
    public C2409t0 mo6431N(@C12579k C16479d dVar, @C12580l Object obj) {
        C2409t0 t0Var;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (obj instanceof C2409t0) {
            t0Var = (C2409t0) obj;
        } else {
            t0Var = null;
        }
        if (t0Var == null) {
            t0Var = new C2409t0(0.0f, false, (C2380m) null, 7, (DefaultConstructorMarker) null);
        }
        t0Var.mo8193k(this.f6234d);
        t0Var.mo8192j(this.f6235e);
        return t0Var;
    }

    @C12579k
    public String toString() {
        return "LayoutWeightImpl(weight=" + this.f6234d + ", fill=" + this.f6235e + ')';
    }
}
