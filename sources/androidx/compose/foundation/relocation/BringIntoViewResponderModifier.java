package androidx.compose.foundation.relocation;

import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.modifier.C15634j;
import androidx.compose.p004ui.modifier.C15638m;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12079p0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBringIntoViewResponder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewResponder.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponderModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n1#2:200\n*E\n"})
public final class BringIntoViewResponderModifier extends C2670b implements C15634j<C2671c>, C2671c {

    /* renamed from: d */
    public C2673e f7036d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BringIntoViewResponderModifier(@C12579k C2671c cVar) {
        super(cVar);
        Intrinsics.checkNotNullParameter(cVar, "defaultParent");
    }

    /* renamed from: l */
    public static final C15098i m12035l(BringIntoViewResponderModifier bringIntoViewResponderModifier, C15588o oVar, C11289a<C15098i> aVar) {
        C15098i invoke;
        C15588o b = bringIntoViewResponderModifier.mo9143b();
        if (b == null) {
            return null;
        }
        if (!oVar.mo44436k()) {
            oVar = null;
        }
        if (oVar == null || (invoke = aVar.invoke()) == null) {
            return null;
        }
        return BringIntoViewResponderKt.m12031d(b, oVar, invoke);
    }

    @C12580l
    /* renamed from: a */
    public Object mo9134a(@C12579k C15588o oVar, @C12579k C11289a<C15098i> aVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object g = C12079p0.m48266g(new BringIntoViewResponderModifier$bringChildIntoView$2(this, oVar, aVar, new BringIntoViewResponderModifier$bringChildIntoView$parentRect$1(this, oVar, aVar), (C11045c<? super BringIntoViewResponderModifier$bringChildIntoView$2>) null), cVar);
        if (g == C11063b.m42612h()) {
            return g;
        }
        return C11079d2.f28267a;
    }

    @C12579k
    public C15638m<C2671c> getKey() {
        return BringIntoViewKt.m12015a();
    }

    @C12579k
    /* renamed from: m */
    public final C2673e mo9135m() {
        C2673e eVar = this.f7036d;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("responder");
        return null;
    }

    @C12579k
    /* renamed from: n */
    public C2671c getValue() {
        return this;
    }

    /* renamed from: o */
    public final void mo9137o(@C12579k C2673e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f7036d = eVar;
    }
}
