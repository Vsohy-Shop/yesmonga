package androidx.compose.material3;

import androidx.compose.animation.core.C1964f;
import androidx.compose.animation.core.C1983k;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Landroidx/compose/animation/core/f;", "", "Landroidx/compose/animation/core/k;", "Lkotlin/d2;", "a", "(Landroidx/compose/animation/core/f;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class AppBarKt$settleAppBar$2 extends Lambda implements C11300l<C1964f<Float, C1983k>, C11079d2> {
    final /* synthetic */ Ref.FloatRef $lastValue;
    final /* synthetic */ Ref.FloatRef $remainingVelocity;
    final /* synthetic */ TopAppBarState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarKt$settleAppBar$2(Ref.FloatRef floatRef, TopAppBarState topAppBarState, Ref.FloatRef floatRef2) {
        super(1);
        this.$lastValue = floatRef;
        this.$state = topAppBarState;
        this.$remainingVelocity = floatRef2;
    }

    /* renamed from: a */
    public final void mo11163a(@C12579k C1964f<Float, C1983k> fVar) {
        Intrinsics.checkNotNullParameter(fVar, "$this$animateDecay");
        float floatValue = fVar.mo6828g().floatValue() - this.$lastValue.element;
        float d = this.$state.mo12413d();
        this.$state.mo12417h(d + floatValue);
        float abs = Math.abs(d - this.$state.mo12413d());
        this.$lastValue.element = fVar.mo6828g().floatValue();
        this.$remainingVelocity.element = fVar.mo6829h().floatValue();
        if (Math.abs(floatValue - abs) > 0.5f) {
            fVar.mo6822a();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11163a((C1964f) obj);
        return C11079d2.f28267a;
    }
}
