package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.concurrent.CancellationException;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C11968h2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0004\u001a\u00020\u0003J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\u000e\u001a\u00020\n8\u0010X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, mo22516d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/LifecycleCoroutineScope;", "Landroidx/lifecycle/t;", "Lkotlin/d2;", "e", "Landroidx/lifecycle/w;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "i", "Landroidx/lifecycle/Lifecycle;", "a", "Landroidx/lifecycle/Lifecycle;", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lkotlin/coroutines/CoroutineContext;", "b", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Landroidx/lifecycle/Lifecycle;Lkotlin/coroutines/CoroutineContext;)V", "lifecycle-common"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class LifecycleCoroutineScopeImpl extends LifecycleCoroutineScope implements C19470t {
    @C12579k

    /* renamed from: a */
    public final Lifecycle f49692a;
    @C12579k

    /* renamed from: b */
    public final CoroutineContext f49693b;

    public LifecycleCoroutineScopeImpl(@C12579k Lifecycle lifecycle, @C12579k CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f49692a = lifecycle;
        this.f49693b = coroutineContext;
        if (mo57475a().mo57465b() == Lifecycle.State.DESTROYED) {
            C11968h2.m47689i(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        }
    }

    @C12579k
    /* renamed from: a */
    public Lifecycle mo57475a() {
        return this.f49692a;
    }

    /* renamed from: e */
    public final void mo57482e() {
        C11723c2 unused = C12038j.m48061f(this, C11768d1.m46783e().mo23706a0(), (CoroutineStart) null, new LifecycleCoroutineScopeImpl$register$1(this, (C11045c<? super LifecycleCoroutineScopeImpl$register$1>) null), 2, (Object) null);
    }

    @C12579k
    public CoroutineContext getCoroutineContext() {
        return this.f49693b;
    }

    /* renamed from: i */
    public void mo750i(@C12579k C19499w wVar, @C12579k Lifecycle.C19372Event event) {
        Intrinsics.checkNotNullParameter(wVar, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (mo57475a().mo57465b().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            mo57475a().mo57467d(this);
            C11968h2.m47689i(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        }
    }
}
