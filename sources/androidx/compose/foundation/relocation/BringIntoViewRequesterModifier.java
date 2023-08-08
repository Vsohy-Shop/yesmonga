package androidx.compose.foundation.relocation;

import androidx.compose.foundation.C2855v;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.layout.C15588o;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C2855v
public final class BringIntoViewRequesterModifier extends C2670b {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BringIntoViewRequesterModifier(@C12579k C2671c cVar) {
        super(cVar);
        Intrinsics.checkNotNullParameter(cVar, "defaultParent");
    }

    @C12580l
    /* renamed from: g */
    public final Object mo9130g(@C12580l C15098i iVar, @C12579k C11045c<? super C11079d2> cVar) {
        C2671c e = mo9144e();
        C15588o b = mo9143b();
        if (b == null) {
            return C11079d2.f28267a;
        }
        Object a = e.mo9134a(b, new BringIntoViewRequesterModifier$bringIntoView$2(iVar, this), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }
}
