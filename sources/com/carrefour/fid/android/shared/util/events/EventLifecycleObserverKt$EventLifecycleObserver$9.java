package com.carrefour.fid.android.shared.util.events;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import androidx.lifecycle.C19499w;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class EventLifecycleObserverKt$EventLifecycleObserver$9 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11289a<C11079d2> $onAny;
    final /* synthetic */ C11289a<C11079d2> $onCreate;
    final /* synthetic */ C11289a<C11079d2> $onDestroy;
    final /* synthetic */ C11289a<C11079d2> $onPause;
    final /* synthetic */ C11289a<C11079d2> $onResume;
    final /* synthetic */ C11289a<C11079d2> $onStart;
    final /* synthetic */ C11289a<C11079d2> $onStop;
    final /* synthetic */ C19499w $owner;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventLifecycleObserverKt$EventLifecycleObserver$9(C19499w wVar, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, C11289a<C11079d2> aVar4, C11289a<C11079d2> aVar5, C11289a<C11079d2> aVar6, C11289a<C11079d2> aVar7, int i, int i2) {
        super(2);
        this.$owner = wVar;
        this.$onCreate = aVar;
        this.$onStart = aVar2;
        this.$onResume = aVar3;
        this.$onPause = aVar4;
        this.$onStop = aVar5;
        this.$onDestroy = aVar6;
        this.$onAny = aVar7;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        EventLifecycleObserverKt.m119612a(this.$owner, this.$onCreate, this.$onStart, this.$onResume, this.$onPause, this.$onStop, this.$onDestroy, this.$onAny, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
