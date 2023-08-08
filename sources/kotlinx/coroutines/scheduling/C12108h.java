package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.scheduling.h */
public class C12108h extends ExecutorCoroutineDispatcher {

    /* renamed from: d */
    public final int f29812d;

    /* renamed from: e */
    public final int f29813e;

    /* renamed from: f */
    public final long f29814f;
    @C12579k

    /* renamed from: g */
    public final String f29815g;
    @C12579k

    /* renamed from: v */
    public CoroutineScheduler f29816v;

    public C12108h() {
        this(0, 0, 0, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* renamed from: O */
    public void mo23563O(@C12579k CoroutineContext coroutineContext, @C12579k Runnable runnable) {
        CoroutineScheduler.m48331o(this.f29816v, runnable, (C12111k) null, false, 6, (Object) null);
    }

    /* renamed from: T */
    public void mo23564T(@C12579k CoroutineContext coroutineContext, @C12579k Runnable runnable) {
        CoroutineScheduler.m48331o(this.f29816v, runnable, (C12111k) null, true, 2, (Object) null);
    }

    @C12579k
    /* renamed from: a0 */
    public Executor mo23573a0() {
        return this.f29816v;
    }

    /* renamed from: b0 */
    public final CoroutineScheduler mo24662b0() {
        return new CoroutineScheduler(this.f29812d, this.f29813e, this.f29814f, this.f29815g);
    }

    /* renamed from: c0 */
    public final void mo24663c0(@C12579k Runnable runnable, @C12579k C12111k kVar, boolean z) {
        this.f29816v.mo24611n(runnable, kVar, z);
    }

    public void close() {
        this.f29816v.close();
    }

    /* renamed from: d0 */
    public final void mo24664d0() {
        mo24666n0();
    }

    /* renamed from: e0 */
    public final synchronized void mo24665e0(long j) {
        this.f29816v.mo24592B(j);
    }

    /* renamed from: n0 */
    public final synchronized void mo24666n0() {
        this.f29816v.mo24592B(1000);
        this.f29816v = mo24662b0();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C12108h(int r4, int r5, long r6, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0006
            int r4 = kotlinx.coroutines.scheduling.C12114n.f29823c
        L_0x0006:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000c
            int r5 = kotlinx.coroutines.scheduling.C12114n.f29824d
        L_0x000c:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0013
            long r6 = kotlinx.coroutines.scheduling.C12114n.f29825e
        L_0x0013:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001a
            java.lang.String r8 = "CoroutineScheduler"
        L_0x001a:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r10 = r2
            r5.<init>(r6, r7, r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.C12108h.<init>(int, int, long, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public C12108h(int i, int i2, long j, @C12579k String str) {
        this.f29812d = i;
        this.f29813e = i2;
        this.f29814f = j;
        this.f29815g = str;
        this.f29816v = mo24662b0();
    }
}
