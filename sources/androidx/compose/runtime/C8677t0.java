package androidx.compose.runtime;

import java.util.concurrent.CancellationException;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11968h2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.t0 */
public final class C8677t0 implements C8616s1 {
    @C12579k

    /* renamed from: a */
    public final C11304p<C12074o0, C11045c<? super C11079d2>, Object> f23240a;
    @C12579k

    /* renamed from: b */
    public final C12074o0 f23241b;
    @C12580l

    /* renamed from: c */
    public C11723c2 f23242c;

    public C8677t0(@C12579k CoroutineContext coroutineContext, @C12579k C11304p<? super C12074o0, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        Intrinsics.checkNotNullParameter(coroutineContext, "parentCoroutineContext");
        Intrinsics.checkNotNullParameter(pVar, "task");
        this.f23240a = pVar;
        this.f23241b = C12079p0.m48260a(coroutineContext);
    }

    /* renamed from: d */
    public void mo8797d() {
        C11723c2 c2Var = this.f23242c;
        if (c2Var != null) {
            C11968h2.m47690j(c2Var, "Old job was still running!", (Throwable) null, 2, (Object) null);
        }
        this.f23242c = C12038j.m48061f(this.f23241b, (CoroutineContext) null, (CoroutineStart) null, this.f23240a, 3, (Object) null);
    }

    /* renamed from: e */
    public void mo8799e() {
        C11723c2 c2Var = this.f23242c;
        if (c2Var != null) {
            C11723c2.C11724a.m46184b(c2Var, (CancellationException) null, 1, (Object) null);
        }
        this.f23242c = null;
    }

    /* renamed from: g */
    public void mo8800g() {
        C11723c2 c2Var = this.f23242c;
        if (c2Var != null) {
            C11723c2.C11724a.m46184b(c2Var, (CancellationException) null, 1, (Object) null);
        }
        this.f23242c = null;
    }
}
