package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createDeferredAnimation$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1155:1\n62#2,5:1156\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createDeferredAnimation$1\n*L\n755#1:1156,5\n*E\n"})
public final class TransitionKt$createDeferredAnimation$1 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ Transition<S>.a<T, V> $lazyAnim;
    final /* synthetic */ Transition<S> $this_createDeferredAnimation;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createDeferredAnimation$1\n*L\n1#1,483:1\n756#2,2:484\n*E\n"})
    /* renamed from: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1$a */
    public static final class C1933a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ Transition f5387a;

        /* renamed from: b */
        public final /* synthetic */ Transition.C1925a f5388b;

        public C1933a(Transition transition, Transition.C1925a aVar) {
            this.f5387a = transition;
            this.f5388b = aVar;
        }

        /* renamed from: g */
        public void mo791g() {
            this.f5387a.mo6716z(this.f5388b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransitionKt$createDeferredAnimation$1(Transition<S> transition, Transition<S>.a<T, V> aVar) {
        super(1);
        this.$this_createDeferredAnimation = transition;
        this.$lazyAnim = aVar;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        return new C1933a(this.$this_createDeferredAnimation, this.$lazyAnim);
    }
}
