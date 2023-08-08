package kotlinx.coroutines;

import kotlin.C11414o;
import kotlin.C11532s0;
import kotlin.coroutines.C11045c;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.scheduling.C12110j;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nDispatchedTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 6 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n*L\n1#1,222:1\n1#2:223\n107#3,10:224\n118#3,2:238\n220#4:234\n221#4:237\n61#5,2:235\n75#6:240\n*S KotlinDebug\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTask\n*L\n90#1:224,10\n90#1:238,2\n103#1:234\n103#1:237\n103#1:235,2\n142#1:240\n*E\n"})
@C11532s0
/* renamed from: kotlinx.coroutines.a1 */
public abstract class C11704a1<T> extends C12110j {
    @C11287e

    /* renamed from: c */
    public int f29037c;

    public C11704a1(int i) {
        this.f29037c = i;
    }

    /* renamed from: e */
    public void mo23698e(@C12580l Object obj, @C12579k Throwable th) {
    }

    @C12579k
    /* renamed from: f */
    public abstract C11045c<T> mo23699f();

    @C12580l
    /* renamed from: g */
    public Throwable mo23700g(@C12580l Object obj) {
        C11721c0 c0Var = obj instanceof C11721c0 ? (C11721c0) obj : null;
        if (c0Var != null) {
            return c0Var.f29065a;
        }
        return null;
    }

    /* renamed from: h */
    public <T> T mo23701h(@C12580l Object obj) {
        return obj;
    }

    /* renamed from: i */
    public final void mo23702i(@C12580l Throwable th, @C12580l Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                C11414o.m43942a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            Intrinsics.checkNotNull(th);
            C12051l0.m48104b(mo23699f().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    @C12580l
    /* renamed from: k */
    public abstract Object mo23703k();

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0086, code lost:
        if (r4.mo24520S1() != false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00af, code lost:
        if (r4.mo24520S1() != false) goto L_0x00b1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            kotlinx.coroutines.scheduling.k r0 = r10.f29818b
            kotlin.coroutines.c r1 = r10.mo23699f()     // Catch:{ all -> 0x00b5 }
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)     // Catch:{ all -> 0x00b5 }
            kotlinx.coroutines.internal.k r1 = (kotlinx.coroutines.internal.C12000k) r1     // Catch:{ all -> 0x00b5 }
            kotlin.coroutines.c<T> r2 = r1.f29600e     // Catch:{ all -> 0x00b5 }
            java.lang.Object r1 = r1.f29602g     // Catch:{ all -> 0x00b5 }
            kotlin.coroutines.CoroutineContext r3 = r2.getContext()     // Catch:{ all -> 0x00b5 }
            java.lang.Object r1 = kotlinx.coroutines.internal.ThreadContextKt.m47768c(r3, r1)     // Catch:{ all -> 0x00b5 }
            kotlinx.coroutines.internal.o0 r4 = kotlinx.coroutines.internal.ThreadContextKt.f29563a     // Catch:{ all -> 0x00b5 }
            r5 = 0
            if (r1 == r4) goto L_0x0023
            kotlinx.coroutines.m3 r4 = kotlinx.coroutines.CoroutineContextKt.m45903g(r2, r3, r1)     // Catch:{ all -> 0x00b5 }
            goto L_0x0024
        L_0x0023:
            r4 = r5
        L_0x0024:
            kotlin.coroutines.CoroutineContext r6 = r2.getContext()     // Catch:{ all -> 0x00a8 }
            java.lang.Object r7 = r10.mo23703k()     // Catch:{ all -> 0x00a8 }
            java.lang.Throwable r8 = r10.mo23700g(r7)     // Catch:{ all -> 0x00a8 }
            if (r8 != 0) goto L_0x0043
            int r9 = r10.f29037c     // Catch:{ all -> 0x00a8 }
            boolean r9 = kotlinx.coroutines.C11717b1.m46146c(r9)     // Catch:{ all -> 0x00a8 }
            if (r9 == 0) goto L_0x0043
            kotlinx.coroutines.c2$b r9 = kotlinx.coroutines.C11723c2.f29067w0     // Catch:{ all -> 0x00a8 }
            kotlin.coroutines.CoroutineContext$a r6 = r6.mo7444b(r9)     // Catch:{ all -> 0x00a8 }
            kotlinx.coroutines.c2 r6 = (kotlinx.coroutines.C11723c2) r6     // Catch:{ all -> 0x00a8 }
            goto L_0x0044
        L_0x0043:
            r6 = r5
        L_0x0044:
            if (r6 == 0) goto L_0x0061
            boolean r9 = r6.mo23627d()     // Catch:{ all -> 0x00a8 }
            if (r9 != 0) goto L_0x0061
            java.util.concurrent.CancellationException r6 = r6.mo23653u()     // Catch:{ all -> 0x00a8 }
            r10.mo23698e(r7, r6)     // Catch:{ all -> 0x00a8 }
            kotlin.Result$a r7 = kotlin.Result.f28060a     // Catch:{ all -> 0x00a8 }
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r6)     // Catch:{ all -> 0x00a8 }
            java.lang.Object r6 = kotlin.Result.m38702b(r6)     // Catch:{ all -> 0x00a8 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x00a8 }
            goto L_0x007e
        L_0x0061:
            if (r8 == 0) goto L_0x0071
            kotlin.Result$a r6 = kotlin.Result.f28060a     // Catch:{ all -> 0x00a8 }
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r8)     // Catch:{ all -> 0x00a8 }
            java.lang.Object r6 = kotlin.Result.m38702b(r6)     // Catch:{ all -> 0x00a8 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x00a8 }
            goto L_0x007e
        L_0x0071:
            kotlin.Result$a r6 = kotlin.Result.f28060a     // Catch:{ all -> 0x00a8 }
            java.lang.Object r6 = r10.mo23701h(r7)     // Catch:{ all -> 0x00a8 }
            java.lang.Object r6 = kotlin.Result.m38702b(r6)     // Catch:{ all -> 0x00a8 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x00a8 }
        L_0x007e:
            kotlin.d2 r2 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x0088
            boolean r4 = r4.mo24520S1()     // Catch:{ all -> 0x00b5 }
            if (r4 == 0) goto L_0x008b
        L_0x0088:
            kotlinx.coroutines.internal.ThreadContextKt.m47766a(r3, r1)     // Catch:{ all -> 0x00b5 }
        L_0x008b:
            kotlin.Result$a r1 = kotlin.Result.f28060a     // Catch:{ all -> 0x0095 }
            r0.mo24657K()     // Catch:{ all -> 0x0095 }
            java.lang.Object r0 = kotlin.Result.m38702b(r2)     // Catch:{ all -> 0x0095 }
            goto L_0x00a0
        L_0x0095:
            r0 = move-exception
            kotlin.Result$a r1 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x00a0:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r0)
            r10.mo23702i(r5, r0)
            goto L_0x00d4
        L_0x00a8:
            r2 = move-exception
            if (r4 == 0) goto L_0x00b1
            boolean r4 = r4.mo24520S1()     // Catch:{ all -> 0x00b5 }
            if (r4 == 0) goto L_0x00b4
        L_0x00b1:
            kotlinx.coroutines.internal.ThreadContextKt.m47766a(r3, r1)     // Catch:{ all -> 0x00b5 }
        L_0x00b4:
            throw r2     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            r1 = move-exception
            kotlin.Result$a r2 = kotlin.Result.f28060a     // Catch:{ all -> 0x00c2 }
            r0.mo24657K()     // Catch:{ all -> 0x00c2 }
            kotlin.d2 r0 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x00c2 }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x00c2 }
            goto L_0x00cd
        L_0x00c2:
            r0 = move-exception
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x00cd:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r0)
            r10.mo23702i(r1, r0)
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C11704a1.run():void");
    }
}
