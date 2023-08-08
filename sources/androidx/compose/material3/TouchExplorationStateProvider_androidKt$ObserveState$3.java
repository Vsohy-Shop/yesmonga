package androidx.compose.material3;

import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import androidx.lifecycle.C19470t;
import androidx.lifecycle.Lifecycle;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nTouchExplorationStateProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchExplorationStateProvider.android.kt\nandroidx/compose/material3/TouchExplorationStateProvider_androidKt$ObserveState$3\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,107:1\n62#2,5:108\n*S KotlinDebug\n*F\n+ 1 TouchExplorationStateProvider.android.kt\nandroidx/compose/material3/TouchExplorationStateProvider_androidKt$ObserveState$3\n*L\n73#1:108,5\n*E\n"})
public final class TouchExplorationStateProvider_androidKt$ObserveState$3 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ C11300l<Lifecycle.C19372Event, C11079d2> $handleEvent;
    final /* synthetic */ C11289a<C11079d2> $onDispose;
    final /* synthetic */ Lifecycle $this_ObserveState;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 TouchExplorationStateProvider.android.kt\nandroidx/compose/material3/TouchExplorationStateProvider_androidKt$ObserveState$3\n*L\n1#1,484:1\n74#2,3:485\n*E\n"})
    /* renamed from: androidx.compose.material3.TouchExplorationStateProvider_androidKt$ObserveState$3$a */
    public static final class C8164a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ C11289a f19970a;

        /* renamed from: b */
        public final /* synthetic */ Lifecycle f19971b;

        /* renamed from: c */
        public final /* synthetic */ C19470t f19972c;

        public C8164a(C11289a aVar, Lifecycle lifecycle, C19470t tVar) {
            this.f19970a = aVar;
            this.f19971b = lifecycle;
            this.f19972c = tVar;
        }

        /* renamed from: g */
        public void mo791g() {
            this.f19970a.invoke();
            this.f19971b.mo57467d(this.f19972c);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TouchExplorationStateProvider_androidKt$ObserveState$3(Lifecycle lifecycle, C11300l<? super Lifecycle.C19372Event, C11079d2> lVar, C11289a<C11079d2> aVar) {
        super(1);
        this.$this_ObserveState = lifecycle;
        this.$handleEvent = lVar;
        this.$onDispose = aVar;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        C8165xa6af8b96 touchExplorationStateProvider_androidKt$ObserveState$3$observer$1 = new C8165xa6af8b96(this.$handleEvent);
        this.$this_ObserveState.mo57464a(touchExplorationStateProvider_androidKt$ObserveState$3$observer$1);
        return new C8164a(this.$onDispose, this.$this_ObserveState, touchExplorationStateProvider_androidKt$ObserveState$3$observer$1);
    }
}
