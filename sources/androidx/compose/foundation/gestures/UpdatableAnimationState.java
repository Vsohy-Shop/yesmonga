package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.C1983k;
import androidx.compose.animation.core.C1996n1;
import androidx.compose.animation.core.VectorConvertersKt;
import kotlin.jvm.internal.C11377x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

public final class UpdatableAnimationState {
    @C12579k

    /* renamed from: e */
    public static final C2183a f5913e = new C2183a((DefaultConstructorMarker) null);
    @Deprecated

    /* renamed from: f */
    public static final float f5914f = 0.01f;
    @Deprecated
    @C12579k

    /* renamed from: g */
    public static final C1983k f5915g = new C1983k(0.0f);
    @Deprecated
    @C12579k

    /* renamed from: h */
    public static final C1996n1<C1983k> f5916h = C1972h.m8390o(0.0f, 0.0f, (Object) null, 7, (Object) null).m8637a(VectorConvertersKt.m8224i(C11377x.f28521a));

    /* renamed from: a */
    public long f5917a = Long.MIN_VALUE;
    @C12579k

    /* renamed from: b */
    public C1983k f5918b = f5915g;

    /* renamed from: c */
    public boolean f5919c;

    /* renamed from: d */
    public float f5920d;

    /* renamed from: androidx.compose.foundation.gestures.UpdatableAnimationState$a */
    public static final class C2183a {
        public /* synthetic */ C2183a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C1996n1<C1983k> mo7528a() {
            return UpdatableAnimationState.f5916h;
        }

        @C12579k
        /* renamed from: b */
        public final C1983k mo7529b() {
            return UpdatableAnimationState.f5915g;
        }

        /* renamed from: c */
        public final boolean mo7530c(float f) {
            return Math.abs(f) < 0.01f;
        }

        public C2183a() {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00af, code lost:
        if (r9 == false) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008f A[Catch:{ all -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c3 A[Catch:{ all -> 0x0039 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c4 A[Catch:{ all -> 0x0039 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c7 A[Catch:{ all -> 0x0039 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo7525h(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.Float, kotlin.C11079d2> r13, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r14, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1 r0 = (androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1 r0 = new androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = -9223372036854775808
            r6 = 2
            r7 = 0
            r8 = 1
            if (r2 == 0) goto L_0x0060
            if (r2 == r8) goto L_0x0044
            if (r2 != r6) goto L_0x003c
            java.lang.Object r13 = r0.L$1
            kotlin.jvm.functions.a r13 = (kotlin.jvm.functions.C11289a) r13
            java.lang.Object r14 = r0.L$0
            androidx.compose.foundation.gestures.UpdatableAnimationState r14 = (androidx.compose.foundation.gestures.UpdatableAnimationState) r14
            kotlin.C11661u0.m45747n(r15)     // Catch:{ all -> 0x0039 }
            goto L_0x00dc
        L_0x0039:
            r13 = move-exception
            goto L_0x00ea
        L_0x003c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0044:
            float r13 = r0.F$0
            java.lang.Object r14 = r0.L$2
            kotlin.jvm.functions.a r14 = (kotlin.jvm.functions.C11289a) r14
            java.lang.Object r2 = r0.L$1
            kotlin.jvm.functions.l r2 = (kotlin.jvm.functions.C11300l) r2
            java.lang.Object r9 = r0.L$0
            androidx.compose.foundation.gestures.UpdatableAnimationState r9 = (androidx.compose.foundation.gestures.UpdatableAnimationState) r9
            kotlin.C11661u0.m45747n(r15)     // Catch:{ all -> 0x005c }
            r15 = r9
            r11 = r0
            r0 = r14
            r14 = r2
            r2 = r1
            r1 = r11
            goto L_0x00a5
        L_0x005c:
            r13 = move-exception
            r14 = r9
            goto L_0x00ea
        L_0x0060:
            kotlin.C11661u0.m45747n(r15)
            boolean r15 = r12.f5919c
            r15 = r15 ^ r8
            if (r15 == 0) goto L_0x00f3
            kotlin.coroutines.CoroutineContext r15 = r0.getContext()
            androidx.compose.ui.n$b r2 = androidx.compose.p004ui.C8773n.f23491k
            kotlin.coroutines.CoroutineContext$a r15 = r15.mo7444b(r2)
            androidx.compose.ui.n r15 = (androidx.compose.p004ui.C8773n) r15
            if (r15 == 0) goto L_0x007b
            float r15 = r15.mo7447w()
            goto L_0x007d
        L_0x007b:
            r15 = 1065353216(0x3f800000, float:1.0)
        L_0x007d:
            r12.f5919c = r8
            r2 = r1
            r1 = r0
            r0 = r14
            r14 = r13
            r13 = r15
            r15 = r12
        L_0x0085:
            androidx.compose.foundation.gestures.UpdatableAnimationState$a r9 = f5913e     // Catch:{ all -> 0x00b6 }
            float r10 = r15.f5920d     // Catch:{ all -> 0x00b6 }
            boolean r9 = r9.mo7530c(r10)     // Catch:{ all -> 0x00b6 }
            if (r9 != 0) goto L_0x00b1
            androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$3 r9 = new androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$3     // Catch:{ all -> 0x00b6 }
            r9.<init>(r15, r13, r14)     // Catch:{ all -> 0x00b6 }
            r1.L$0 = r15     // Catch:{ all -> 0x00b6 }
            r1.L$1 = r14     // Catch:{ all -> 0x00b6 }
            r1.L$2 = r0     // Catch:{ all -> 0x00b6 }
            r1.F$0 = r13     // Catch:{ all -> 0x00b6 }
            r1.label = r8     // Catch:{ all -> 0x00b6 }
            java.lang.Object r9 = androidx.compose.runtime.MonotonicFrameClockKt.m29919f(r9, r1)     // Catch:{ all -> 0x00b6 }
            if (r9 != r2) goto L_0x00a5
            return r2
        L_0x00a5:
            r0.invoke()     // Catch:{ all -> 0x00b6 }
            int r9 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r9 != 0) goto L_0x00ae
            r9 = r8
            goto L_0x00af
        L_0x00ae:
            r9 = r7
        L_0x00af:
            if (r9 == 0) goto L_0x0085
        L_0x00b1:
            r13 = r0
            r11 = r15
            r15 = r14
            r14 = r11
            goto L_0x00b9
        L_0x00b6:
            r13 = move-exception
            r14 = r15
            goto L_0x00ea
        L_0x00b9:
            float r0 = r14.f5920d     // Catch:{ all -> 0x0039 }
            float r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0039 }
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00c4
            goto L_0x00c5
        L_0x00c4:
            r8 = r7
        L_0x00c5:
            if (r8 != 0) goto L_0x00df
            androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$4 r0 = new androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$4     // Catch:{ all -> 0x0039 }
            r0.<init>(r14, r15)     // Catch:{ all -> 0x0039 }
            r1.L$0 = r14     // Catch:{ all -> 0x0039 }
            r1.L$1 = r13     // Catch:{ all -> 0x0039 }
            r15 = 0
            r1.L$2 = r15     // Catch:{ all -> 0x0039 }
            r1.label = r6     // Catch:{ all -> 0x0039 }
            java.lang.Object r15 = androidx.compose.runtime.MonotonicFrameClockKt.m29919f(r0, r1)     // Catch:{ all -> 0x0039 }
            if (r15 != r2) goto L_0x00dc
            return r2
        L_0x00dc:
            r13.invoke()     // Catch:{ all -> 0x0039 }
        L_0x00df:
            r14.f5917a = r4
            androidx.compose.animation.core.k r13 = f5915g
            r14.f5918b = r13
            r14.f5919c = r7
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            return r13
        L_0x00ea:
            r14.f5917a = r4
            androidx.compose.animation.core.k r15 = f5915g
            r14.f5918b = r15
            r14.f5919c = r7
            throw r13
        L_0x00f3:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Check failed."
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.UpdatableAnimationState.mo7525h(kotlin.jvm.functions.l, kotlin.jvm.functions.a, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: i */
    public final float mo7526i() {
        return this.f5920d;
    }

    /* renamed from: j */
    public final void mo7527j(float f) {
        this.f5920d = f;
    }
}
