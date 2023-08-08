package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class InfiniteTransitionKt$animateValue$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C1984k0<T> $animationSpec;
    final /* synthetic */ T $initialValue;
    final /* synthetic */ T $targetValue;
    final /* synthetic */ InfiniteTransition.C1918a<T, V> $transitionAnimation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfiniteTransitionKt$animateValue$1(T t, InfiniteTransition.C1918a<T, V> aVar, T t2, C1984k0<T> k0Var) {
        super(0);
        this.$initialValue = t;
        this.$transitionAnimation = aVar;
        this.$targetValue = t2;
        this.$animationSpec = k0Var;
    }

    public final void invoke() {
        if (!Intrinsics.areEqual((Object) this.$initialValue, (Object) this.$transitionAnimation.mo6643h()) || !Intrinsics.areEqual((Object) this.$targetValue, (Object) this.$transitionAnimation.mo6645k())) {
            this.$transitionAnimation.mo6656v(this.$initialValue, this.$targetValue, this.$animationSpec);
        }
    }
}
