package androidx.compose.foundation;

import androidx.compose.p004ui.draw.C8749h;
import androidx.compose.p004ui.graphics.drawscope.C15184c;
import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.platform.C15988w0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.p */
public final class C2633p extends C15988w0 implements C8749h {
    @C12579k

    /* renamed from: d */
    public final AndroidEdgeEffectOverscrollEffect f6971d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2633p(@C12579k AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, @C12579k C11300l<? super C15983v0, C11079d2> lVar) {
        super(lVar);
        Intrinsics.checkNotNullParameter(androidEdgeEffectOverscrollEffect, "overscrollEffect");
        Intrinsics.checkNotNullParameter(lVar, "inspectorInfo");
        this.f6971d = androidEdgeEffectOverscrollEffect;
    }

    /* renamed from: C */
    public void mo7212C(@C12579k C15184c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        cVar.mo42716g6();
        this.f6971d.mo7113w(cVar);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2633p)) {
            return false;
        }
        return Intrinsics.areEqual((Object) this.f6971d, (Object) ((C2633p) obj).f6971d);
    }

    public int hashCode() {
        return this.f6971d.hashCode();
    }

    @C12579k
    public String toString() {
        return "DrawOverscrollModifier(overscrollEffect=" + this.f6971d + ')';
    }
}
