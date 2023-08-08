package androidx.compose.foundation.layout;

import androidx.compose.p004ui.C8734c;
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

/* renamed from: androidx.compose.foundation.layout.d1 */
public final class C2350d1 extends C15988w0 implements C15605u0 {
    @C12579k

    /* renamed from: d */
    public final C8734c.C8737c f6255d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2350d1(@C12579k C8734c.C8737c cVar, @C12579k C11300l<? super C15983v0, C11079d2> lVar) {
        super(lVar);
        Intrinsics.checkNotNullParameter(cVar, "vertical");
        Intrinsics.checkNotNullParameter(lVar, "inspectorInfo");
        this.f6255d = cVar;
    }

    public boolean equals(@C12580l Object obj) {
        C2350d1 d1Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2350d1) {
            d1Var = (C2350d1) obj;
        } else {
            d1Var = null;
        }
        if (d1Var == null) {
            return false;
        }
        return Intrinsics.areEqual((Object) this.f6255d, (Object) d1Var.f6255d);
    }

    public int hashCode() {
        return this.f6255d.hashCode();
    }

    @C12579k
    /* renamed from: r */
    public final C8734c.C8737c mo8041r() {
        return this.f6255d;
    }

    @C12579k
    /* renamed from: s */
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
        t0Var.mo8191i(C2380m.f6293a.mo8127j(this.f6255d));
        return t0Var;
    }

    @C12579k
    public String toString() {
        return "VerticalAlignModifier(vertical=" + this.f6255d + ')';
    }
}
