package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt$animateValue$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,364:1\n62#2,5:365\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt$animateValue$2\n*L\n283#1:365,5\n*E\n"})
public final class InfiniteTransitionKt$animateValue$2 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ InfiniteTransition $this_animateValue;
    final /* synthetic */ InfiniteTransition.C1918a<T, V> $transitionAnimation;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt$animateValue$2\n*L\n1#1,483:1\n284#2,2:484\n*E\n"})
    /* renamed from: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$2$a */
    public static final class C1922a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ InfiniteTransition f5322a;

        /* renamed from: b */
        public final /* synthetic */ InfiniteTransition.C1918a f5323b;

        public C1922a(InfiniteTransition infiniteTransition, InfiniteTransition.C1918a aVar) {
            this.f5322a = infiniteTransition;
            this.f5323b = aVar;
        }

        /* renamed from: g */
        public void mo791g() {
            this.f5322a.mo6636l(this.f5323b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfiniteTransitionKt$animateValue$2(InfiniteTransition infiniteTransition, InfiniteTransition.C1918a<T, V> aVar) {
        super(1);
        this.$this_animateValue = infiniteTransition;
        this.$transitionAnimation = aVar;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        this.$this_animateValue.mo6630f(this.$transitionAnimation);
        return new C1922a(this.$this_animateValue, this.$transitionAnimation);
    }
}
