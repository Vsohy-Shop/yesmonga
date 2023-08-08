package androidx.compose.material3;

import androidx.lifecycle.C19470t;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.material3.TouchExplorationStateProvider_androidKt$ObserveState$3$observer$1 */
public final class C8165xa6af8b96 implements C19470t {

    /* renamed from: a */
    public final /* synthetic */ C11300l<Lifecycle.C19372Event, C11079d2> f19973a;

    public C8165xa6af8b96(C11300l<? super Lifecycle.C19372Event, C11079d2> lVar) {
        this.f19973a = lVar;
    }

    /* renamed from: i */
    public final void mo750i(@C12579k C19499w wVar, @C12579k Lifecycle.C19372Event event) {
        Intrinsics.checkNotNullParameter(wVar, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        this.f19973a.invoke(event);
    }
}
