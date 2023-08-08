package com.carrefour.fid.android.shared.base;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19427i;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import java.util.concurrent.CancellationException;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BD\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR3\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f8\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/base/ObserverWhileResumedImpl;", "T", "Landroidx/lifecycle/i;", "Landroidx/lifecycle/w;", "owner", "Lkotlin/d2;", "v", "y", "Lkotlinx/coroutines/flow/e;", "a", "Lkotlinx/coroutines/flow/e;", "flow", "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "", "b", "Lkotlin/jvm/functions/p;", "collector", "Lkotlinx/coroutines/c2;", "c", "Lkotlinx/coroutines/c2;", "job", "lifecycleOwner", "<init>", "(Landroidx/lifecycle/w;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/p;)V", "shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class ObserverWhileResumedImpl<T> implements C19427i {

    /* renamed from: d */
    public static final int f68574d = 8;
    @C12579k

    /* renamed from: a */
    public final C11907e<T> f68575a;
    @C12579k

    /* renamed from: b */
    public final C11304p<T, C11045c<? super C11079d2>, Object> f68576b;
    @C12580l

    /* renamed from: c */
    public C11723c2 f68577c;

    public ObserverWhileResumedImpl(@C12579k C19499w wVar, @C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        Intrinsics.checkNotNullParameter(wVar, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(eVar, "flow");
        Intrinsics.checkNotNullParameter(pVar, "collector");
        this.f68575a = eVar;
        this.f68576b = pVar;
        wVar.getLifecycle().mo57464a(this);
    }

    /* renamed from: v */
    public void mo34383v(@C12579k C19499w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "owner");
        this.f68577c = C12038j.m48061f(C19501x.m90847a(wVar), (CoroutineContext) null, (CoroutineStart) null, new ObserverWhileResumedImpl$onResume$1(this, (C11045c<? super ObserverWhileResumedImpl$onResume$1>) null), 3, (Object) null);
    }

    /* renamed from: y */
    public void mo34384y(@C12579k C19499w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "owner");
        C11723c2 c2Var = this.f68577c;
        if (c2Var != null) {
            C11723c2.C11724a.m46184b(c2Var, (CancellationException) null, 1, (Object) null);
        }
        this.f68577c = null;
    }
}
