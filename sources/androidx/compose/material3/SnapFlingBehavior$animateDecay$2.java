package androidx.compose.material3;

import androidx.compose.animation.core.C1964f;
import androidx.compose.animation.core.C1983k;
import androidx.compose.foundation.gestures.C2201l;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Landroidx/compose/animation/core/f;", "", "Landroidx/compose/animation/core/k;", "Lkotlin/d2;", "a", "(Landroidx/compose/animation/core/f;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SnapFlingBehavior$animateDecay$2 extends Lambda implements C11300l<C1964f<Float, C1983k>, C11079d2> {
    final /* synthetic */ Ref.FloatRef $previousValue;
    final /* synthetic */ float $targetOffset;
    final /* synthetic */ C2201l $this_animateDecay;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$animateDecay$2(float f, SnapFlingBehavior snapFlingBehavior, Ref.FloatRef floatRef, C2201l lVar) {
        super(1);
        this.$targetOffset = f;
        this.this$0 = snapFlingBehavior;
        this.$previousValue = floatRef;
        this.$this_animateDecay = lVar;
    }

    /* renamed from: a */
    public final void mo11984a(@C12579k C1964f<Float, C1983k> fVar) {
        Intrinsics.checkNotNullParameter(fVar, "$this$animateDecay");
        if (Math.abs(fVar.mo6828g().floatValue()) >= Math.abs(this.$targetOffset)) {
            SnapFlingBehavior.m26309m(fVar, this.$this_animateDecay, this.this$0.mo11975p(fVar.mo6828g().floatValue(), this.$targetOffset) - this.$previousValue.element);
            fVar.mo6822a();
            return;
        }
        SnapFlingBehavior.m26309m(fVar, this.$this_animateDecay, fVar.mo6828g().floatValue() - this.$previousValue.element);
        this.$previousValue.element = fVar.mo6828g().floatValue();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11984a((C1964f) obj);
        return C11079d2.f28267a;
    }
}
