package com.carrefour.fid.android.shared.util.events;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19426h0;
import androidx.lifecycle.C19428i0;
import androidx.lifecycle.C19475v;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B-\u0012\u000e\u0010\t\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0005\u001a\u00020\u0004H\u0007R\u001c\u0010\t\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/util/events/EventLifecycleObserver;", "T", "Lcom/carrefour/fid/android/shared/util/events/a;", "Landroidx/lifecycle/v;", "Lkotlin/d2;", "onDestroy", "Landroidx/lifecycle/h0;", "c", "Landroidx/lifecycle/h0;", "observer", "Landroidx/lifecycle/w;", "d", "Landroidx/lifecycle/w;", "owner", "Lcom/carrefour/fid/android/shared/util/events/c;", "e", "Lcom/carrefour/fid/android/shared/util/events/c;", "liveData", "<init>", "(Landroidx/lifecycle/h0;Landroidx/lifecycle/w;Lcom/carrefour/fid/android/shared/util/events/c;)V", "shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class EventLifecycleObserver<T> extends C28926a<T> implements C19475v {

    /* renamed from: f */
    public static final int f70843f = 8;
    @C12579k

    /* renamed from: c */
    public final C19426h0<? super T> f70844c;
    @C12579k

    /* renamed from: d */
    public final C19499w f70845d;
    @C12579k

    /* renamed from: e */
    public final C28928c<T> f70846e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventLifecycleObserver(@C12579k C19426h0<? super T> h0Var, @C12579k C19499w wVar, @C12579k C28928c<T> cVar) {
        super(h0Var);
        Intrinsics.checkNotNullParameter(h0Var, "observer");
        Intrinsics.checkNotNullParameter(wVar, "owner");
        Intrinsics.checkNotNullParameter(cVar, "liveData");
        this.f70844c = h0Var;
        this.f70845d = wVar;
        this.f70846e = cVar;
    }

    @C19428i0(Lifecycle.C19372Event.ON_DESTROY)
    public final void onDestroy() {
        this.f70846e.mo57494p(this.f70844c);
        this.f70845d.getLifecycle().mo57467d(this);
    }
}
