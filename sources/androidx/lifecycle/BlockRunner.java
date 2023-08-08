package androidx.lifecycle;

import androidx.annotation.C0353k0;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.concurrent.CancellationException;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class BlockRunner<T> {
    @C12579k

    /* renamed from: a */
    public final CoroutineLiveData<T> f49662a;
    @C12579k

    /* renamed from: b */
    public final C11304p<C19403d0<T>, C11045c<? super C11079d2>, Object> f49663b;

    /* renamed from: c */
    public final long f49664c;
    @C12579k

    /* renamed from: d */
    public final C12074o0 f49665d;
    @C12579k

    /* renamed from: e */
    public final C11289a<C11079d2> f49666e;
    @C12580l

    /* renamed from: f */
    public C11723c2 f49667f;
    @C12580l

    /* renamed from: g */
    public C11723c2 f49668g;

    public BlockRunner(@C12579k CoroutineLiveData<T> coroutineLiveData, @C12579k C11304p<? super C19403d0<T>, ? super C11045c<? super C11079d2>, ? extends Object> pVar, long j, @C12579k C12074o0 o0Var, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(coroutineLiveData, "liveData");
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        Intrinsics.checkNotNullParameter(o0Var, "scope");
        Intrinsics.checkNotNullParameter(aVar, "onDone");
        this.f49662a = coroutineLiveData;
        this.f49663b = pVar;
        this.f49664c = j;
        this.f49665d = o0Var;
        this.f49666e = aVar;
    }

    @C0353k0
    /* renamed from: g */
    public final void mo57440g() {
        if (this.f49668g == null) {
            this.f49668g = C12038j.m48061f(this.f49665d, C11768d1.m46783e().mo23706a0(), (CoroutineStart) null, new BlockRunner$cancel$1(this, (C11045c<? super BlockRunner$cancel$1>) null), 2, (Object) null);
            return;
        }
        throw new IllegalStateException("Cancel call cannot happen without a maybeRun".toString());
    }

    @C0353k0
    /* renamed from: h */
    public final void mo57441h() {
        C11723c2 c2Var = this.f49668g;
        if (c2Var != null) {
            C11723c2.C11724a.m46184b(c2Var, (CancellationException) null, 1, (Object) null);
        }
        this.f49668g = null;
        if (this.f49667f == null) {
            this.f49667f = C12038j.m48061f(this.f49665d, (CoroutineContext) null, (CoroutineStart) null, new BlockRunner$maybeRun$1(this, (C11045c<? super BlockRunner$maybeRun$1>) null), 3, (Object) null);
        }
    }
}
