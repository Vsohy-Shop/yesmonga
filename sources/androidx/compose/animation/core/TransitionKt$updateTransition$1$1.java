package androidx.compose.animation.core;

import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$updateTransition$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1155:1\n62#2,5:1156\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$updateTransition$1$1\n*L\n74#1:1156,5\n*E\n"})
public final class TransitionKt$updateTransition$1$1 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ Transition<T> $transition;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt$updateTransition$1$1\n*L\n1#1,483:1\n77#2,2:484\n*E\n"})
    /* renamed from: androidx.compose.animation.core.TransitionKt$updateTransition$1$1$a */
    public static final class C1935a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ Transition f5391a;

        public C1935a(Transition transition) {
            this.f5391a = transition;
        }

        /* renamed from: g */
        public void mo791g() {
            this.f5391a.mo6714x();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransitionKt$updateTransition$1$1(Transition<T> transition) {
        super(1);
        this.$transition = transition;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        return new C1935a(this.$transition);
    }
}
