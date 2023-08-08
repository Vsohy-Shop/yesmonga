package com.carrefour.fid.android.shared.util.events;

import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import androidx.lifecycle.C19470t;
import androidx.lifecycle.C19499w;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nEventLifecycleObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLifecycleObserver.kt\ncom/carrefour/fid/android/shared/util/events/EventLifecycleObserverKt$EventLifecycleObserver$8\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,49:1\n62#2,5:50\n*S KotlinDebug\n*F\n+ 1 EventLifecycleObserver.kt\ncom/carrefour/fid/android/shared/util/events/EventLifecycleObserverKt$EventLifecycleObserver$8\n*L\n44#1:50,5\n*E\n"})
public final class EventLifecycleObserverKt$EventLifecycleObserver$8 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ C11289a<C11079d2> $onAny;
    final /* synthetic */ C11289a<C11079d2> $onCreate;
    final /* synthetic */ C11289a<C11079d2> $onDestroy;
    final /* synthetic */ C11289a<C11079d2> $onPause;
    final /* synthetic */ C11289a<C11079d2> $onResume;
    final /* synthetic */ C11289a<C11079d2> $onStart;
    final /* synthetic */ C11289a<C11079d2> $onStop;
    final /* synthetic */ C19499w $owner;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 EventLifecycleObserver.kt\ncom/carrefour/fid/android/shared/util/events/EventLifecycleObserverKt$EventLifecycleObserver$8\n*L\n1#1,484:1\n45#2,2:485\n*E\n"})
    /* renamed from: com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt$EventLifecycleObserver$8$a */
    public static final class C28918a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ C19499w f70854a;

        /* renamed from: b */
        public final /* synthetic */ C19470t f70855b;

        public C28918a(C19499w wVar, C19470t tVar) {
            this.f70854a = wVar;
            this.f70855b = tVar;
        }

        /* renamed from: g */
        public void mo791g() {
            this.f70854a.getLifecycle().mo57467d(this.f70855b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventLifecycleObserverKt$EventLifecycleObserver$8(C19499w wVar, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, C11289a<C11079d2> aVar4, C11289a<C11079d2> aVar5, C11289a<C11079d2> aVar6, C11289a<C11079d2> aVar7) {
        super(1);
        this.$owner = wVar;
        this.$onCreate = aVar;
        this.$onStart = aVar2;
        this.$onResume = aVar3;
        this.$onPause = aVar4;
        this.$onStop = aVar5;
        this.$onDestroy = aVar6;
        this.$onAny = aVar7;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        EventLifecycleObserverKt$EventLifecycleObserver$8$observer$1 eventLifecycleObserverKt$EventLifecycleObserver$8$observer$1 = new EventLifecycleObserverKt$EventLifecycleObserver$8$observer$1(this.$onCreate, this.$onStart, this.$onResume, this.$onPause, this.$onStop, this.$onDestroy, this.$onAny);
        this.$owner.getLifecycle().mo57464a(eventLifecycleObserverKt$EventLifecycleObserver$8$observer$1);
        return new C28918a(this.$owner, eventLifecycleObserverKt$EventLifecycleObserver$8$observer$1);
    }
}
