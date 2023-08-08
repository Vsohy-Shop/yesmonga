package kotlinx.coroutines;

import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C12177y1
/* renamed from: kotlinx.coroutines.a */
public abstract class C11701a<T> extends JobSupport implements C11723c2, C11045c<T>, C12074o0 {
    @C12579k

    /* renamed from: c */
    public final CoroutineContext f29036c;

    public C11701a(@C12579k CoroutineContext coroutineContext, boolean z, boolean z2) {
        super(z2);
        if (z) {
            mo23625c1((C11723c2) coroutineContext.mo7444b(C11723c2.f29067w0));
        }
        this.f29036c = coroutineContext.mo7443Q(this);
    }

    /* renamed from: O1 */
    public static /* synthetic */ void m46066O1() {
    }

    @C12579k
    /* renamed from: E0 */
    public String mo23592E0() {
        return C12090r0.m48300a(this) + " was cancelled";
    }

    /* renamed from: N1 */
    public void mo23692N1(@C12580l Object obj) {
        mo23658w0(obj);
    }

    /* renamed from: P1 */
    public void mo23693P1(@C12579k Throwable th, boolean z) {
    }

    /* renamed from: Q1 */
    public void mo23694Q1(T t) {
    }

    /* renamed from: R1 */
    public final <R> void mo23695R1(@C12579k CoroutineStart coroutineStart, R r, @C12579k C11304p<? super R, ? super C11045c<? super T>, ? extends Object> pVar) {
        coroutineStart.mo23571r(pVar, r, this);
    }

    /* renamed from: b1 */
    public final void mo23623b1(@C12579k Throwable th) {
        C12051l0.m48104b(this.f29036c, th);
    }

    /* renamed from: d */
    public boolean mo23627d() {
        return super.mo23627d();
    }

    @C12579k
    public final CoroutineContext getContext() {
        return this.f29036c;
    }

    @C12579k
    public CoroutineContext getCoroutineContext() {
        return this.f29036c;
    }

    @C12579k
    /* renamed from: o1 */
    public String mo23642o1() {
        String b = CoroutineContextKt.m45898b(this.f29036c);
        if (b == null) {
            return super.mo23642o1();
        }
        return '\"' + b + "\":" + super.mo23642o1();
    }

    public final void resumeWith(@C12579k Object obj) {
        Object m1 = mo23640m1(C11966h0.m47677d(obj, (C11300l) null, 1, (Object) null));
        if (m1 != C12041j2.f29672b) {
            mo23692N1(m1);
        }
    }

    /* renamed from: w1 */
    public final void mo23659w1(@C12580l Object obj) {
        if (obj instanceof C11721c0) {
            C11721c0 c0Var = (C11721c0) obj;
            mo23693P1(c0Var.f29065a, c0Var.mo23744a());
            return;
        }
        mo23694Q1(obj);
    }
}
