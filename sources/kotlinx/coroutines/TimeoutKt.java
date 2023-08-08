package kotlinx.coroutines;

import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.intrinsics.C12037b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class TimeoutKt {
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r4 == null) goto L_0x0018;
     */
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlinx.coroutines.TimeoutCancellationException m46060a(long r2, @org.jetbrains.annotations.C12579k kotlinx.coroutines.C12164w0 r4, @org.jetbrains.annotations.C12579k kotlinx.coroutines.C11723c2 r5) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.C12171x0
            if (r0 == 0) goto L_0x0007
            kotlinx.coroutines.x0 r4 = (kotlinx.coroutines.C12171x0) r4
            goto L_0x0008
        L_0x0007:
            r4 = 0
        L_0x0008:
            if (r4 == 0) goto L_0x0018
            kotlin.time.e$a r0 = kotlin.time.C11636e.f28954b
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            long r0 = kotlin.time.C11639g.m45640n0(r2, r0)
            java.lang.String r4 = r4.mo24791I(r0)
            if (r4 != 0) goto L_0x002e
        L_0x0018:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Timed out waiting for "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = " ms"
            r4.append(r2)
            java.lang.String r4 = r4.toString()
        L_0x002e:
            kotlinx.coroutines.TimeoutCancellationException r2 = new kotlinx.coroutines.TimeoutCancellationException
            r2.<init>(r4, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.TimeoutKt.m46060a(long, kotlinx.coroutines.w0, kotlinx.coroutines.c2):kotlinx.coroutines.TimeoutCancellationException");
    }

    /* renamed from: b */
    public static final <U, T extends U> Object m46061b(C12049k3<U, ? super T> k3Var, C11304p<? super C12074o0, ? super C11045c<? super T>, ? extends Object> pVar) {
        C11804f2.m46977y(k3Var, DelayKt.m45927d(k3Var.f29603d.getContext()).mo23705C(k3Var.f29692e, k3Var, k3Var.getContext()));
        return C12037b.m48054f(k3Var, k3Var, pVar);
    }

    @C12580l
    /* renamed from: c */
    public static final <T> Object m46062c(long j, @C12579k C11304p<? super C12074o0, ? super C11045c<? super T>, ? extends Object> pVar, @C12579k C11045c<? super T> cVar) {
        if (j > 0) {
            Object b = m46061b(new C12049k3(j, cVar), pVar);
            if (b == C11063b.m42612h()) {
                C11069f.m42638c(cVar);
            }
            return b;
        }
        throw new TimeoutCancellationException("Timed out immediately");
    }

    @C12580l
    /* renamed from: d */
    public static final <T> Object m46063d(long j, @C12579k C11304p<? super C12074o0, ? super C11045c<? super T>, ? extends Object> pVar, @C12579k C11045c<? super T> cVar) {
        return m46062c(DelayKt.m45928e(j), pVar, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m46064e(long r7, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super kotlinx.coroutines.C12074o0, ? super kotlin.coroutines.C11045c<? super T>, ? extends java.lang.Object> r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super T> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = (kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = new kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
            java.lang.Object r8 = r0.L$0
            kotlin.jvm.functions.p r8 = (kotlin.jvm.functions.C11304p) r8
            kotlin.C11661u0.m45747n(r10)     // Catch:{ TimeoutCancellationException -> 0x0032 }
            goto L_0x006b
        L_0x0032:
            r8 = move-exception
            goto L_0x006e
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003c:
            kotlin.C11661u0.m45747n(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L_0x0046
            return r3
        L_0x0046:
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            r0.L$0 = r9     // Catch:{ TimeoutCancellationException -> 0x006c }
            r0.L$1 = r10     // Catch:{ TimeoutCancellationException -> 0x006c }
            r0.J$0 = r7     // Catch:{ TimeoutCancellationException -> 0x006c }
            r0.label = r4     // Catch:{ TimeoutCancellationException -> 0x006c }
            kotlinx.coroutines.k3 r2 = new kotlinx.coroutines.k3     // Catch:{ TimeoutCancellationException -> 0x006c }
            r2.<init>(r7, r0)     // Catch:{ TimeoutCancellationException -> 0x006c }
            r10.element = r2     // Catch:{ TimeoutCancellationException -> 0x006c }
            java.lang.Object r7 = m46061b(r2, r9)     // Catch:{ TimeoutCancellationException -> 0x006c }
            java.lang.Object r8 = kotlin.coroutines.intrinsics.C11063b.m42612h()     // Catch:{ TimeoutCancellationException -> 0x006c }
            if (r7 != r8) goto L_0x0067
            kotlin.coroutines.jvm.internal.C11069f.m42638c(r0)     // Catch:{ TimeoutCancellationException -> 0x006c }
        L_0x0067:
            if (r7 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r10 = r7
        L_0x006b:
            return r10
        L_0x006c:
            r8 = move-exception
            r7 = r10
        L_0x006e:
            kotlinx.coroutines.c2 r9 = r8.f29035a
            T r7 = r7.element
            if (r9 != r7) goto L_0x0075
            return r3
        L_0x0075:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.TimeoutKt.m46064e(long, kotlin.jvm.functions.p, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: f */
    public static final <T> Object m46065f(long j, @C12579k C11304p<? super C12074o0, ? super C11045c<? super T>, ? extends Object> pVar, @C12579k C11045c<? super T> cVar) {
        return m46064e(DelayKt.m45928e(j), pVar, cVar);
    }
}
