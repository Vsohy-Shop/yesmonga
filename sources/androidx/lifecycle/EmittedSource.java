package androidx.lifecycle;

import androidx.annotation.C0353k0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C11962g1;
import kotlinx.coroutines.C11965h;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class EmittedSource implements C11962g1 {
    @C12579k

    /* renamed from: a */
    public final LiveData<?> f49676a;
    @C12579k

    /* renamed from: b */
    public final C19406e0<?> f49677b;

    /* renamed from: c */
    public boolean f49678c;

    public EmittedSource(@C12579k LiveData<?> liveData, @C12579k C19406e0<?> e0Var) {
        Intrinsics.checkNotNullParameter(liveData, "source");
        Intrinsics.checkNotNullParameter(e0Var, "mediator");
        this.f49676a = liveData;
        this.f49677b = e0Var;
    }

    @C12580l
    /* renamed from: b */
    public final Object mo57452b(@C12579k C11045c<? super C11079d2> cVar) {
        Object h = C11965h.m47673h(C11768d1.m46783e().mo23706a0(), new EmittedSource$disposeNow$2(this, (C11045c<? super EmittedSource$disposeNow$2>) null), cVar);
        return h == C11063b.m42612h() ? h : C11079d2.f28267a;
    }

    @C0353k0
    /* renamed from: c */
    public final void mo57453c() {
        if (!this.f49678c) {
            this.f49677b.mo57571t(this.f49676a);
            this.f49678c = true;
        }
    }

    /* renamed from: g */
    public void mo23720g() {
        C11723c2 unused = C12038j.m48061f(C12079p0.m48260a(C11768d1.m46783e().mo23706a0()), (CoroutineContext) null, (CoroutineStart) null, new EmittedSource$dispose$1(this, (C11045c<? super EmittedSource$dispose$1>) null), 3, (Object) null);
    }
}
