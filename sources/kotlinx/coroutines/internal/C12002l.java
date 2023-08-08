package kotlinx.coroutines.internal;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.C11287e;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C11800e3;
import kotlinx.coroutines.C12047k1;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nDispatchedContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n+ 2 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,317:1\n297#1,5:325\n302#1,12:331\n314#1:387\n301#1:389\n302#1,12:391\n314#1:420\n217#2,7:318\n224#2:346\n243#2,8:347\n225#2:355\n255#2:356\n256#2,2:367\n258#2:371\n227#2:372\n229#2:388\n1#3:330\n1#3:390\n1#3:421\n200#4,3:343\n203#4,14:373\n200#4,17:403\n200#4,17:422\n107#5,10:357\n118#5,2:369\n*S KotlinDebug\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n*L\n282#1:325,5\n282#1:331,12\n282#1:387\n287#1:389\n287#1:391,12\n287#1:420\n282#1:318,7\n282#1:346\n282#1:347,8\n282#1:355\n282#1:356\n282#1:367,2\n282#1:371\n282#1:372\n282#1:388\n282#1:330\n287#1:390\n282#1:343,3\n282#1:373,14\n287#1:403,17\n313#1:422,17\n282#1:357,10\n282#1:369,2\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.l */
public final class C12002l {
    @C12579k

    /* renamed from: a */
    public static final C12009o0 f29604a = new C12009o0("UNDEFINED");
    @C12579k
    @C11287e

    /* renamed from: b */
    public static final C12009o0 f29605b = new C12009o0("REUSABLE_CLAIMED");

    /* renamed from: b */
    public static final boolean m47868b(C12000k<?> kVar, Object obj, int i, boolean z, C11289a<C11079d2> aVar) {
        C12047k1 b = C11800e3.f29268a.mo24076b();
        if (z && b.mo24477C0()) {
            return false;
        }
        if (b.mo24476A0()) {
            kVar.f29601f = obj;
            kVar.f29037c = i;
            b.mo24484d0(kVar);
            return true;
        }
        b.mo24486n0(true);
        try {
            aVar.invoke();
            do {
            } while (b.mo24479E0());
            C11322b0.m43481d(1);
        } catch (Throwable th) {
            C11322b0.m43481d(1);
            b.mo24481a0(true);
            C11322b0.m43480c(1);
            throw th;
        }
        b.mo24481a0(true);
        C11322b0.m43480c(1);
        return false;
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m47869c(C12000k kVar, Object obj, int i, boolean z, C11289a aVar, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        C12047k1 b = C11800e3.f29268a.mo24076b();
        if (z && b.mo24477C0()) {
            return false;
        }
        if (b.mo24476A0()) {
            kVar.f29601f = obj;
            kVar.f29037c = i;
            b.mo24484d0(kVar);
            return true;
        }
        b.mo24486n0(true);
        try {
            aVar.invoke();
            do {
            } while (b.mo24479E0());
            C11322b0.m43481d(1);
        } catch (Throwable th) {
            C11322b0.m43481d(1);
            b.mo24481a0(true);
            C11322b0.m43480c(1);
            throw th;
        }
        b.mo24481a0(true);
        C11322b0.m43480c(1);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        if (r8.mo24520S1() != false) goto L_0x0091;
     */
    @kotlinx.coroutines.C12177y1
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void m47870d(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super T> r6, @org.jetbrains.annotations.C12579k java.lang.Object r7, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super java.lang.Throwable, kotlin.C11079d2> r8) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.internal.C12000k
            if (r0 == 0) goto L_0x00b6
            kotlinx.coroutines.internal.k r6 = (kotlinx.coroutines.internal.C12000k) r6
            java.lang.Object r8 = kotlinx.coroutines.C11966h0.m47675b(r7, r8)
            kotlinx.coroutines.CoroutineDispatcher r0 = r6.f29599d
            kotlin.coroutines.CoroutineContext r1 = r6.getContext()
            boolean r0 = r0.mo23565U(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0026
            r6.f29601f = r8
            r6.f29037c = r1
            kotlinx.coroutines.CoroutineDispatcher r7 = r6.f29599d
            kotlin.coroutines.CoroutineContext r8 = r6.getContext()
            r7.mo23563O(r8, r6)
            goto L_0x00b9
        L_0x0026:
            kotlinx.coroutines.e3 r0 = kotlinx.coroutines.C11800e3.f29268a
            kotlinx.coroutines.k1 r0 = r0.mo24076b()
            boolean r2 = r0.mo24476A0()
            if (r2 == 0) goto L_0x003b
            r6.f29601f = r8
            r6.f29037c = r1
            r0.mo24484d0(r6)
            goto L_0x00b9
        L_0x003b:
            r0.mo24486n0(r1)
            r2 = 0
            kotlin.coroutines.CoroutineContext r3 = r6.getContext()     // Catch:{ all -> 0x00a9 }
            kotlinx.coroutines.c2$b r4 = kotlinx.coroutines.C11723c2.f29067w0     // Catch:{ all -> 0x00a9 }
            kotlin.coroutines.CoroutineContext$a r3 = r3.mo7444b(r4)     // Catch:{ all -> 0x00a9 }
            kotlinx.coroutines.c2 r3 = (kotlinx.coroutines.C11723c2) r3     // Catch:{ all -> 0x00a9 }
            if (r3 == 0) goto L_0x0069
            boolean r4 = r3.mo23627d()     // Catch:{ all -> 0x00a9 }
            if (r4 != 0) goto L_0x0069
            java.util.concurrent.CancellationException r3 = r3.mo23653u()     // Catch:{ all -> 0x00a9 }
            r6.mo23698e(r8, r3)     // Catch:{ all -> 0x00a9 }
            kotlin.Result$a r8 = kotlin.Result.f28060a     // Catch:{ all -> 0x00a9 }
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r3)     // Catch:{ all -> 0x00a9 }
            java.lang.Object r8 = kotlin.Result.m38702b(r8)     // Catch:{ all -> 0x00a9 }
            r6.resumeWith(r8)     // Catch:{ all -> 0x00a9 }
            r8 = r1
            goto L_0x006a
        L_0x0069:
            r8 = 0
        L_0x006a:
            if (r8 != 0) goto L_0x00a2
            kotlin.coroutines.c<T> r8 = r6.f29600e     // Catch:{ all -> 0x00a9 }
            java.lang.Object r3 = r6.f29602g     // Catch:{ all -> 0x00a9 }
            kotlin.coroutines.CoroutineContext r4 = r8.getContext()     // Catch:{ all -> 0x00a9 }
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.m47768c(r4, r3)     // Catch:{ all -> 0x00a9 }
            kotlinx.coroutines.internal.o0 r5 = kotlinx.coroutines.internal.ThreadContextKt.f29563a     // Catch:{ all -> 0x00a9 }
            if (r3 == r5) goto L_0x0081
            kotlinx.coroutines.m3 r8 = kotlinx.coroutines.CoroutineContextKt.m45903g(r8, r4, r3)     // Catch:{ all -> 0x00a9 }
            goto L_0x0082
        L_0x0081:
            r8 = r2
        L_0x0082:
            kotlin.coroutines.c<T> r5 = r6.f29600e     // Catch:{ all -> 0x0095 }
            r5.resumeWith(r7)     // Catch:{ all -> 0x0095 }
            kotlin.d2 r7 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0095 }
            if (r8 == 0) goto L_0x0091
            boolean r7 = r8.mo24520S1()     // Catch:{ all -> 0x00a9 }
            if (r7 == 0) goto L_0x00a2
        L_0x0091:
            kotlinx.coroutines.internal.ThreadContextKt.m47766a(r4, r3)     // Catch:{ all -> 0x00a9 }
            goto L_0x00a2
        L_0x0095:
            r7 = move-exception
            if (r8 == 0) goto L_0x009e
            boolean r8 = r8.mo24520S1()     // Catch:{ all -> 0x00a9 }
            if (r8 == 0) goto L_0x00a1
        L_0x009e:
            kotlinx.coroutines.internal.ThreadContextKt.m47766a(r4, r3)     // Catch:{ all -> 0x00a9 }
        L_0x00a1:
            throw r7     // Catch:{ all -> 0x00a9 }
        L_0x00a2:
            boolean r7 = r0.mo24479E0()     // Catch:{ all -> 0x00a9 }
            if (r7 != 0) goto L_0x00a2
            goto L_0x00ad
        L_0x00a9:
            r7 = move-exception
            r6.mo23702i(r7, r2)     // Catch:{ all -> 0x00b1 }
        L_0x00ad:
            r0.mo24481a0(r1)
            goto L_0x00b9
        L_0x00b1:
            r6 = move-exception
            r0.mo24481a0(r1)
            throw r6
        L_0x00b6:
            r6.resumeWith(r7)
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C12002l.m47870d(kotlin.coroutines.c, java.lang.Object, kotlin.jvm.functions.l):void");
    }

    /* renamed from: e */
    public static /* synthetic */ void m47871e(C11045c cVar, Object obj, C11300l lVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            lVar = null;
        }
        m47870d(cVar, obj, lVar);
    }

    /* renamed from: f */
    public static final boolean m47872f(@C12579k C12000k<? super C11079d2> kVar) {
        C11079d2 d2Var = C11079d2.f28267a;
        C12047k1 b = C11800e3.f29268a.mo24076b();
        if (b.mo24477C0()) {
            return false;
        }
        if (b.mo24476A0()) {
            kVar.f29601f = d2Var;
            kVar.f29037c = 1;
            b.mo24484d0(kVar);
            return true;
        }
        b.mo24486n0(true);
        try {
            kVar.run();
            do {
            } while (b.mo24479E0());
        } catch (Throwable th) {
            b.mo24481a0(true);
            throw th;
        }
        b.mo24481a0(true);
        return false;
    }
}
