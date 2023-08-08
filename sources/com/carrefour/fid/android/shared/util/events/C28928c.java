package com.carrefour.fid.android.shared.util.events;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0353k0;
import androidx.annotation.C0363p0;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19423g0;
import androidx.lifecycle.C19426h0;
import androidx.lifecycle.C19499w;
import com.carrefour.fid.android.shared.util.C28935i;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nSingleBroadCastEventLiveData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleBroadCastEventLiveData.kt\ncom/carrefour/fid/android/shared/util/events/SingleBroadCastEventLiveData\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,77:1\n361#2,7:78\n32#3,2:85\n*S KotlinDebug\n*F\n+ 1 SingleBroadCastEventLiveData.kt\ncom/carrefour/fid/android/shared/util/events/SingleBroadCastEventLiveData\n*L\n27#1:78,7\n47#1:85,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.shared.util.events.c */
public final class C28928c<T> extends C19423g0<T> {

    /* renamed from: q */
    public static final int f70879q = 8;
    @C12579k

    /* renamed from: m */
    public final String f70880m;
    @C12579k

    /* renamed from: n */
    public final Map<C19426h0<? super T>, C28926a<T>> f70881n = new LinkedHashMap();
    @C12579k

    /* renamed from: o */
    public final AtomicBoolean f70882o = new AtomicBoolean(false);
    @C12579k

    /* renamed from: p */
    public final Handler f70883p = new Handler(Looper.getMainLooper());

    public C28928c(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        this.f70880m = str;
    }

    /* renamed from: t */
    public static final void m119629t(C28928c cVar, Object obj) {
        Intrinsics.checkNotNullParameter(cVar, "this$0");
        cVar.mo57496r(obj);
    }

    @C0353k0
    /* renamed from: k */
    public void mo57491k(@C12579k C19499w wVar, @C12579k C19426h0<? super T> h0Var) {
        Intrinsics.checkNotNullParameter(wVar, "owner");
        Intrinsics.checkNotNullParameter(h0Var, "observer");
        if (mo57488h()) {
            C28935i.m119704b(C28935i.f70940a, "Multiple observers registered but only one will be notified of changes.", (Throwable) null, 0, 6, (Object) null);
        }
        Map<C19426h0<? super T>, C28926a<T>> map = this.f70881n;
        C28926a<T> aVar = map.get(h0Var);
        EventLifecycleObserver eventLifecycleObserver = aVar;
        if (aVar == null) {
            EventLifecycleObserver eventLifecycleObserver2 = new EventLifecycleObserver(h0Var, wVar, this);
            this.f70881n.put(h0Var, eventLifecycleObserver2);
            wVar.getLifecycle().mo57464a(eventLifecycleObserver2);
            map.put(h0Var, eventLifecycleObserver2);
            eventLifecycleObserver = eventLifecycleObserver2;
        }
        super.mo57491k(wVar, eventLifecycleObserver);
        C28935i iVar = C28935i.f70940a;
        C28935i.m119704b(iVar, "observe() called with: owner = [" + wVar + "], observer = [" + h0Var + "]", (Throwable) null, 0, 6, (Object) null);
    }

    @C0353k0
    /* renamed from: n */
    public void mo57445n() {
        super.mo57445n();
        if (!mo57489i()) {
            EventLiveData.f70863b.mo84200c().mo84198d().remove(this.f70880m);
        }
        C28935i.m119704b(C28935i.f70940a, "onInactive() called", (Throwable) null, 0, 6, (Object) null);
    }

    /* renamed from: o */
    public void mo57493o(T t) {
        this.f70883p.post(new C28927b(this, t));
    }

    @C0353k0
    /* renamed from: p */
    public void mo57494p(@C12579k C19426h0<? super T> h0Var) {
        Intrinsics.checkNotNullParameter(h0Var, "observer");
        C19426h0<? super T> remove = this.f70881n.remove(h0Var);
        if (remove == null) {
            remove = h0Var;
        }
        super.mo57494p(remove);
        C28935i iVar = C28935i.f70940a;
        C28935i.m119704b(iVar, "removeObserver() called with: observer = [" + h0Var + "]", (Throwable) null, 0, 6, (Object) null);
    }

    @C0353k0
    /* renamed from: q */
    public void mo57495q(@C12579k C19499w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "owner");
        for (Map.Entry next : this.f70881n.entrySet()) {
            if (((C28926a) next.getValue()).mo84204b(wVar)) {
                this.f70881n.remove(next.getKey());
            }
        }
        super.mo57495q(wVar);
        C28935i iVar = C28935i.f70940a;
        C28935i.m119704b(iVar, "removeObservers() called with: owner = [" + wVar + "]", (Throwable) null, 0, 6, (Object) null);
    }

    @C0353k0
    /* renamed from: r */
    public void mo57496r(@C0363p0 @C12580l T t) {
        this.f70882o.set(true);
        super.mo57496r(t);
    }
}
