package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.C11395k;
import kotlin.C11532s0;
import kotlin.DeprecationLevel;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C12094s0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/scheduling/ExperimentalCoroutineDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,213:1\n1#2:214\n*E\n"})
@C11532s0
/* renamed from: kotlinx.coroutines.scheduling.d */
public class C12104d extends ExecutorCoroutineDispatcher {

    /* renamed from: d */
    public final int f29800d;

    /* renamed from: e */
    public final int f29801e;

    /* renamed from: f */
    public final long f29802f;
    @C12579k

    /* renamed from: g */
    public final String f29803g;
    @C12579k

    /* renamed from: v */
    public CoroutineScheduler f29804v;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12104d(int i, int i2, long j, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, j, (i3 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    /* renamed from: c0 */
    public static /* synthetic */ CoroutineDispatcher m48397c0(C12104d dVar, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = 16;
            }
            return dVar.mo24653b0(i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: blocking");
    }

    /* renamed from: O */
    public void mo23563O(@C12579k CoroutineContext coroutineContext, @C12579k Runnable runnable) {
        try {
            CoroutineScheduler.m48331o(this.f29804v, runnable, (C12111k) null, false, 6, (Object) null);
        } catch (RejectedExecutionException unused) {
            C12094s0.f29753w.mo23563O(coroutineContext, runnable);
        }
    }

    /* renamed from: T */
    public void mo23564T(@C12579k CoroutineContext coroutineContext, @C12579k Runnable runnable) {
        try {
            CoroutineScheduler.m48331o(this.f29804v, runnable, (C12111k) null, true, 2, (Object) null);
        } catch (RejectedExecutionException unused) {
            C12094s0.f29753w.mo23564T(coroutineContext, runnable);
        }
    }

    @C12579k
    /* renamed from: a0 */
    public Executor mo23573a0() {
        return this.f29804v;
    }

    @C12579k
    /* renamed from: b0 */
    public final CoroutineDispatcher mo24653b0(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C12106f(this, i, (String) null, 1);
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but have " + i).toString());
    }

    public void close() {
        this.f29804v.close();
    }

    /* renamed from: d0 */
    public final CoroutineScheduler mo24654d0() {
        return new CoroutineScheduler(this.f29800d, this.f29801e, this.f29802f, this.f29803g);
    }

    /* renamed from: e0 */
    public final void mo24655e0(@C12579k Runnable runnable, @C12579k C12111k kVar, boolean z) {
        try {
            this.f29804v.mo24611n(runnable, kVar, z);
        } catch (RejectedExecutionException unused) {
            C12094s0.f29753w.mo24492U0(this.f29804v.mo24605i(runnable, kVar));
        }
    }

    @C12579k
    /* renamed from: n0 */
    public final CoroutineDispatcher mo24656n0(int i) {
        boolean z;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i > this.f29800d) {
                z2 = false;
            }
            if (z2) {
                return new C12106f(this, i, (String) null, 0);
            }
            throw new IllegalArgumentException(("Expected parallelism level lesser than core pool size (" + this.f29800d + "), but have " + i).toString());
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but have " + i).toString());
    }

    @C12579k
    public String toString() {
        return super.toString() + "[scheduler = " + this.f29804v + C12361b.f30261l;
    }

    public C12104d(int i, int i2, long j, @C12579k String str) {
        this.f29800d = i;
        this.f29801e = i2;
        this.f29802f = j;
        this.f29803g = str;
        this.f29804v = mo24654d0();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12104d(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? C12114n.f29823c : i, (i3 & 2) != 0 ? C12114n.f29824d : i2, (i3 & 4) != 0 ? C12114n.f29821a : str);
    }

    public C12104d(int i, int i2, @C12579k String str) {
        this(i, i2, C12114n.f29825e, str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12104d(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? C12114n.f29823c : i, (i3 & 2) != 0 ? C12114n.f29824d : i2);
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "Binary compatibility for Ktor 1.0-beta")
    public /* synthetic */ C12104d(int i, int i2) {
        this(i, i2, C12114n.f29825e, (String) null, 8, (DefaultConstructorMarker) null);
    }
}
