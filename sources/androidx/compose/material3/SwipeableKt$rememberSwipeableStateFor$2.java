package androidx.compose.material3;

import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material3/SwipeableKt$rememberSwipeableStateFor$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,886:1\n62#2,5:887\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material3/SwipeableKt$rememberSwipeableStateFor$2\n*L\n520#1:887,5\n*E\n"})
public final class SwipeableKt$rememberSwipeableStateFor$2 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ C8700z0<Boolean> $forceAnimationCheck;
    final /* synthetic */ C11300l<T, C11079d2> $onValueChange;
    final /* synthetic */ SwipeableState<T> $swipeableState;
    final /* synthetic */ T $value;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Swipeable.kt\nandroidx/compose/material3/SwipeableKt$rememberSwipeableStateFor$2\n*L\n1#1,484:1\n520#2:485\n*E\n"})
    /* renamed from: androidx.compose.material3.SwipeableKt$rememberSwipeableStateFor$2$a */
    public static final class C8115a implements C8430d0 {
        /* renamed from: g */
        public void mo791g() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableKt$rememberSwipeableStateFor$2(T t, SwipeableState<T> swipeableState, C11300l<? super T, C11079d2> lVar, C8700z0<Boolean> z0Var) {
        super(1);
        this.$value = t;
        this.$swipeableState = swipeableState;
        this.$onValueChange = lVar;
        this.$forceAnimationCheck = z0Var;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        if (!Intrinsics.areEqual((Object) this.$value, (Object) this.$swipeableState.mo12058p())) {
            this.$onValueChange.invoke(this.$swipeableState.mo12058p());
            C8700z0<Boolean> z0Var = this.$forceAnimationCheck;
            z0Var.setValue(Boolean.valueOf(!z0Var.getValue().booleanValue()));
        }
        return new C8115a();
    }
}
