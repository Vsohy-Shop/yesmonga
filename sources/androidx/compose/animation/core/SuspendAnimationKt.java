package androidx.compose.animation.core;

import androidx.compose.p004ui.C8773n;
import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11377x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSuspendAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendAnimation.kt\nandroidx/compose/animation/core/SuspendAnimationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,363:1\n1#2:364\n*E\n"})
public final class SuspendAnimationKt {
    @C12580l
    /* renamed from: c */
    public static final Object m8076c(float f, float f2, float f3, @C12579k C1968g<Float> gVar, @C12579k C11304p<? super Float, ? super Float, C11079d2> pVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object e = m8078e(VectorConvertersKt.m8224i(C11377x.f28521a), C11064a.m42619e(f), C11064a.m42619e(f2), C11064a.m42619e(f3), gVar, pVar, cVar);
        if (e == C11063b.m42612h()) {
            return e;
        }
        return C11079d2.f28267a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: kotlin.jvm.internal.Ref$ObjectRef} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: kotlin.jvm.internal.Ref$ObjectRef} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ee A[Catch:{ CancellationException -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0118 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, V extends androidx.compose.animation.core.C1997o> java.lang.Object m8077d(@org.jetbrains.annotations.C12579k androidx.compose.animation.core.C1976i<T, V> r25, @org.jetbrains.annotations.C12579k androidx.compose.animation.core.C1950c<T, V> r26, long r27, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super androidx.compose.animation.core.C1964f<T, V>, kotlin.C11079d2> r29, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r30) {
        /*
            r9 = r25
            r0 = r26
            r1 = r30
            boolean r2 = r1 instanceof androidx.compose.animation.core.SuspendAnimationKt$animate$4
            if (r2 == 0) goto L_0x0019
            r2 = r1
            androidx.compose.animation.core.SuspendAnimationKt$animate$4 r2 = (androidx.compose.animation.core.SuspendAnimationKt$animate$4) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0019
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001e
        L_0x0019:
            androidx.compose.animation.core.SuspendAnimationKt$animate$4 r2 = new androidx.compose.animation.core.SuspendAnimationKt$animate$4
            r2.<init>(r1)
        L_0x001e:
            r10 = r2
            java.lang.Object r1 = r10.result
            java.lang.Object r11 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r10.label
            r12 = 2
            r13 = 1
            if (r2 == 0) goto L_0x0065
            if (r2 == r13) goto L_0x0049
            if (r2 != r12) goto L_0x0041
            java.lang.Object r0 = r10.L$3
            r2 = r0
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            java.lang.Object r0 = r10.L$2
            kotlin.jvm.functions.l r0 = (kotlin.jvm.functions.C11300l) r0
            java.lang.Object r3 = r10.L$1
            androidx.compose.animation.core.c r3 = (androidx.compose.animation.core.C1950c) r3
            java.lang.Object r4 = r10.L$0
            androidx.compose.animation.core.i r4 = (androidx.compose.animation.core.C1976i) r4
            goto L_0x005a
        L_0x0041:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0049:
            java.lang.Object r0 = r10.L$3
            r2 = r0
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            java.lang.Object r0 = r10.L$2
            kotlin.jvm.functions.l r0 = (kotlin.jvm.functions.C11300l) r0
            java.lang.Object r3 = r10.L$1
            androidx.compose.animation.core.c r3 = (androidx.compose.animation.core.C1950c) r3
            java.lang.Object r4 = r10.L$0
            androidx.compose.animation.core.i r4 = (androidx.compose.animation.core.C1976i) r4
        L_0x005a:
            kotlin.C11661u0.m45747n(r1)     // Catch:{ CancellationException -> 0x0061 }
            r8 = r0
            r0 = r3
            goto L_0x00e1
        L_0x0061:
            r0 = move-exception
            r9 = r4
            goto L_0x0120
        L_0x0065:
            kotlin.C11661u0.m45747n(r1)
            r1 = 0
            java.lang.Object r15 = r0.mo6799f(r1)
            androidx.compose.animation.core.o r17 = r0.mo6795b(r1)
            kotlin.jvm.internal.Ref$ObjectRef r14 = new kotlin.jvm.internal.Ref$ObjectRef
            r14.<init>()
            r1 = -9223372036854775808
            int r1 = (r27 > r1 ? 1 : (r27 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00a9
            kotlin.coroutines.CoroutineContext r1 = r10.getContext()     // Catch:{ CancellationException -> 0x011e }
            float r7 = m8090q(r1)     // Catch:{ CancellationException -> 0x011e }
            androidx.compose.animation.core.SuspendAnimationKt$animate$6 r8 = new androidx.compose.animation.core.SuspendAnimationKt$animate$6     // Catch:{ CancellationException -> 0x011e }
            r1 = r8
            r2 = r14
            r3 = r15
            r4 = r26
            r5 = r17
            r6 = r25
            r15 = r8
            r8 = r29
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ CancellationException -> 0x011e }
            r10.L$0 = r9     // Catch:{ CancellationException -> 0x011e }
            r10.L$1 = r0     // Catch:{ CancellationException -> 0x011e }
            r8 = r29
            r10.L$2 = r8     // Catch:{ CancellationException -> 0x011e }
            r10.L$3 = r14     // Catch:{ CancellationException -> 0x011e }
            r10.label = r13     // Catch:{ CancellationException -> 0x011e }
            java.lang.Object r1 = m8087n(r0, r15, r10)     // Catch:{ CancellationException -> 0x011e }
            if (r1 != r11) goto L_0x00df
            return r11
        L_0x00a9:
            r8 = r29
            androidx.compose.animation.core.f r7 = new androidx.compose.animation.core.f     // Catch:{ CancellationException -> 0x011e }
            androidx.compose.animation.core.a1 r16 = r26.mo6798e()     // Catch:{ CancellationException -> 0x011e }
            java.lang.Object r20 = r26.mo6800g()     // Catch:{ CancellationException -> 0x011e }
            r23 = 1
            androidx.compose.animation.core.SuspendAnimationKt$animate$7 r1 = new androidx.compose.animation.core.SuspendAnimationKt$animate$7     // Catch:{ CancellationException -> 0x011e }
            r1.<init>(r9)     // Catch:{ CancellationException -> 0x011e }
            r6 = r14
            r14 = r7
            r18 = r27
            r21 = r27
            r24 = r1
            r14.<init>(r15, r16, r17, r18, r20, r21, r23, r24)     // Catch:{ CancellationException -> 0x011b }
            kotlin.coroutines.CoroutineContext r1 = r10.getContext()     // Catch:{ CancellationException -> 0x011b }
            float r4 = m8090q(r1)     // Catch:{ CancellationException -> 0x011b }
            r1 = r7
            r2 = r27
            r5 = r26
            r14 = r6
            r6 = r25
            r15 = r7
            r7 = r29
            m8089p(r1, r2, r4, r5, r6, r7)     // Catch:{ CancellationException -> 0x011e }
            r14.element = r15     // Catch:{ CancellationException -> 0x011e }
        L_0x00df:
            r4 = r9
            r2 = r14
        L_0x00e1:
            T r1 = r2.element     // Catch:{ CancellationException -> 0x0061 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch:{ CancellationException -> 0x0061 }
            androidx.compose.animation.core.f r1 = (androidx.compose.animation.core.C1964f) r1     // Catch:{ CancellationException -> 0x0061 }
            boolean r1 = r1.mo6831j()     // Catch:{ CancellationException -> 0x0061 }
            if (r1 == 0) goto L_0x0118
            kotlin.coroutines.CoroutineContext r1 = r10.getContext()     // Catch:{ CancellationException -> 0x0061 }
            float r1 = m8090q(r1)     // Catch:{ CancellationException -> 0x0061 }
            androidx.compose.animation.core.SuspendAnimationKt$animate$9 r3 = new androidx.compose.animation.core.SuspendAnimationKt$animate$9     // Catch:{ CancellationException -> 0x0061 }
            r25 = r3
            r26 = r2
            r27 = r1
            r28 = r0
            r29 = r4
            r30 = r8
            r25.<init>(r26, r27, r28, r29, r30)     // Catch:{ CancellationException -> 0x0061 }
            r10.L$0 = r4     // Catch:{ CancellationException -> 0x0061 }
            r10.L$1 = r0     // Catch:{ CancellationException -> 0x0061 }
            r10.L$2 = r8     // Catch:{ CancellationException -> 0x0061 }
            r10.L$3 = r2     // Catch:{ CancellationException -> 0x0061 }
            r10.label = r12     // Catch:{ CancellationException -> 0x0061 }
            java.lang.Object r1 = m8087n(r0, r3, r10)     // Catch:{ CancellationException -> 0x0061 }
            if (r1 != r11) goto L_0x00e1
            return r11
        L_0x0118:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            return r0
        L_0x011b:
            r0 = move-exception
            r14 = r6
            goto L_0x011f
        L_0x011e:
            r0 = move-exception
        L_0x011f:
            r2 = r14
        L_0x0120:
            T r1 = r2.element
            androidx.compose.animation.core.f r1 = (androidx.compose.animation.core.C1964f) r1
            r3 = 0
            if (r1 != 0) goto L_0x0128
            goto L_0x012b
        L_0x0128:
            r1.mo6834m(r3)
        L_0x012b:
            T r1 = r2.element
            androidx.compose.animation.core.f r1 = (androidx.compose.animation.core.C1964f) r1
            if (r1 == 0) goto L_0x013e
            long r1 = r1.mo6824c()
            long r4 = r9.mo6846g()
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x013e
            goto L_0x013f
        L_0x013e:
            r13 = r3
        L_0x013f:
            if (r13 == 0) goto L_0x0144
            r9.mo6853o(r3)
        L_0x0144:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SuspendAnimationKt.m8077d(androidx.compose.animation.core.i, androidx.compose.animation.core.c, long, kotlin.jvm.functions.l, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: e */
    public static final <T, V extends C1997o> Object m8078e(@C12579k C1945a1<T, V> a1Var, T t, T t2, @C12580l T t3, @C12579k C1968g<T> gVar, @C12579k C11304p<? super T, ? super T, C11079d2> pVar, @C12579k C11045c<? super C11079d2> cVar) {
        C1997o oVar;
        T t4 = t3;
        if (t4 == null || (oVar = (C1997o) a1Var.mo6792a().invoke(t4)) == null) {
            oVar = C2000p.m8571g((C1997o) a1Var.mo6792a().invoke(t));
        } else {
            T t5 = t;
        }
        C2021y0 y0Var = new C2021y0(gVar, a1Var, t, t2, oVar);
        C1976i iVar = new C1976i(a1Var, t, oVar, 0, 0, false, 56, (DefaultConstructorMarker) null);
        C1945a1<T, V> a1Var2 = a1Var;
        Object g = m8080g(iVar, y0Var, 0, new SuspendAnimationKt$animate$3(pVar, a1Var), cVar, 2, (Object) null);
        if (g == C11063b.m42612h()) {
            return g;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: f */
    public static /* synthetic */ Object m8079f(float f, float f2, float f3, C1968g gVar, C11304p pVar, C11045c cVar, int i, Object obj) {
        float f4;
        if ((i & 4) != 0) {
            f4 = 0.0f;
        } else {
            f4 = f3;
        }
        if ((i & 8) != 0) {
            gVar = C1972h.m8390o(0.0f, 0.0f, (Object) null, 7, (Object) null);
        }
        return m8076c(f, f2, f4, gVar, pVar, cVar);
    }

    /* renamed from: g */
    public static /* synthetic */ Object m8080g(C1976i iVar, C1950c cVar, long j, C11300l lVar, C11045c cVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            j = Long.MIN_VALUE;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            lVar = SuspendAnimationKt$animate$5.f5337f;
        }
        return m8077d(iVar, cVar, j2, lVar, cVar2);
    }

    /* renamed from: h */
    public static /* synthetic */ Object m8081h(C1945a1 a1Var, Object obj, Object obj2, Object obj3, C1968g gVar, C11304p pVar, C11045c cVar, int i, Object obj4) {
        Object obj5;
        C2014v0 v0Var;
        if ((i & 8) != 0) {
            obj5 = null;
        } else {
            obj5 = obj3;
        }
        if ((i & 16) != 0) {
            v0Var = C1972h.m8390o(0.0f, 0.0f, (Object) null, 7, (Object) null);
        } else {
            v0Var = gVar;
        }
        return m8078e(a1Var, obj, obj2, obj5, v0Var, pVar, cVar);
    }

    @C12580l
    /* renamed from: i */
    public static final Object m8082i(float f, float f2, @C12579k C1965f0 f0Var, @C12579k C11304p<? super Float, ? super Float, C11079d2> pVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object g = m8080g(C1980j.m8428c(f, f2, 0, 0, false, 28, (Object) null), AnimationKt.m7990a(f0Var, f, f2), 0, new SuspendAnimationKt$animateDecay$2(pVar), cVar, 2, (Object) null);
        if (g == C11063b.m42612h()) {
            return g;
        }
        return C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: j */
    public static final <T, V extends C1997o> Object m8083j(@C12579k C1976i<T, V> iVar, @C12579k C2013v<T> vVar, boolean z, @C12579k C11300l<? super C1964f<T, V>, C11079d2> lVar, @C12579k C11045c<? super C11079d2> cVar) {
        long j;
        C2011u uVar = new C2011u(vVar, iVar.mo6847h(), iVar.getValue(), iVar.mo6849k());
        if (z) {
            j = iVar.mo6846g();
        } else {
            j = Long.MIN_VALUE;
        }
        Object d = m8077d(iVar, uVar, j, lVar, cVar);
        if (d == C11063b.m42612h()) {
            return d;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: k */
    public static /* synthetic */ Object m8084k(C1976i iVar, C2013v vVar, boolean z, C11300l lVar, C11045c cVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            lVar = SuspendAnimationKt$animateDecay$4.f5338f;
        }
        return m8083j(iVar, vVar, z, lVar, cVar);
    }

    @C12580l
    /* renamed from: l */
    public static final <T, V extends C1997o> Object m8085l(@C12579k C1976i<T, V> iVar, T t, @C12579k C1968g<T> gVar, boolean z, @C12579k C11300l<? super C1964f<T, V>, C11079d2> lVar, @C12579k C11045c<? super C11079d2> cVar) {
        long j;
        C1968g<T> gVar2 = gVar;
        C2021y0 y0Var = new C2021y0(gVar2, iVar.mo6847h(), iVar.getValue(), t, iVar.mo6849k());
        if (z) {
            j = iVar.mo6846g();
        } else {
            j = Long.MIN_VALUE;
        }
        Object d = m8077d(iVar, y0Var, j, lVar, cVar);
        if (d == C11063b.m42612h()) {
            return d;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: m */
    public static /* synthetic */ Object m8086m(C1976i iVar, Object obj, C1968g gVar, boolean z, C11300l lVar, C11045c cVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            gVar = C1972h.m8390o(0.0f, 0.0f, (Object) null, 7, (Object) null);
        }
        C1968g gVar2 = gVar;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            lVar = SuspendAnimationKt$animateTo$2.f5339f;
        }
        return m8085l(iVar, obj, gVar2, z2, lVar, cVar);
    }

    /* renamed from: n */
    public static final <R, T, V extends C1997o> Object m8087n(C1950c<T, V> cVar, C11300l<? super Long, ? extends R> lVar, C11045c<? super R> cVar2) {
        if (cVar.mo6794a()) {
            return InfiniteAnimationPolicyKt.m8000c(lVar, cVar2);
        }
        return MonotonicFrameClockKt.m29919f(new SuspendAnimationKt$callWithFrameNanos$2(lVar), cVar2);
    }

    /* renamed from: o */
    public static final <T, V extends C1997o> void m8088o(C1964f<T, V> fVar, long j, long j2, C1950c<T, V> cVar, C1976i<T, V> iVar, C11300l<? super C1964f<T, V>, C11079d2> lVar) {
        fVar.mo6833l(j);
        fVar.mo6835n(cVar.mo6799f(j2));
        fVar.mo6836o(cVar.mo6795b(j2));
        if (cVar.mo6796c(j2)) {
            fVar.mo6832k(fVar.mo6824c());
            fVar.mo6834m(false);
        }
        m8091r(fVar, iVar);
        lVar.invoke(fVar);
    }

    /* renamed from: p */
    public static final <T, V extends C1997o> void m8089p(C1964f<T, V> fVar, long j, float f, C1950c<T, V> cVar, C1976i<T, V> iVar, C11300l<? super C1964f<T, V>, C11079d2> lVar) {
        boolean z;
        long j2;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            j2 = cVar.mo6797d();
        } else {
            j2 = (long) (((float) (j - fVar.mo6825d())) / f);
        }
        m8088o(fVar, j, j2, cVar, iVar, lVar);
    }

    /* renamed from: q */
    public static final float m8090q(@C12579k CoroutineContext coroutineContext) {
        float f;
        boolean z;
        Intrinsics.checkNotNullParameter(coroutineContext, "<this>");
        C8773n nVar = (C8773n) coroutineContext.mo7444b(C8773n.f23491k);
        if (nVar != null) {
            f = nVar.mo7447w();
        } else {
            f = 1.0f;
        }
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return f;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: r */
    public static final <T, V extends C1997o> void m8091r(@C12579k C1964f<T, V> fVar, @C12579k C1976i<T, V> iVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(iVar, "state");
        iVar.mo6854p(fVar.mo6828g());
        C2000p.m8570f(iVar.mo6849k(), fVar.mo6830i());
        iVar.mo6851m(fVar.mo6823b());
        iVar.mo6852n(fVar.mo6824c());
        iVar.mo6853o(fVar.mo6831j());
    }
}
