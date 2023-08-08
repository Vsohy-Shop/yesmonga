package androidx.compose.runtime;

import androidx.compose.runtime.C8686v0;
import androidx.compose.runtime.internal.C8567o;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
public final class PausableMonotonicFrameClock implements C8686v0 {

    /* renamed from: c */
    public static final int f22691c = 8;
    @C12579k

    /* renamed from: a */
    public final C8686v0 f22692a;
    @C12579k

    /* renamed from: b */
    public final Latch f22693b = new Latch();

    public PausableMonotonicFrameClock(@C12579k C8686v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "frameClock");
        this.f22692a = v0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063 A[PHI: r7 
      PHI: (r7v2 java.lang.Object) = (r7v4 java.lang.Object), (r7v1 java.lang.Object) binds: [B:19:0x0060, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <R> java.lang.Object mo14872B(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.Long, ? extends R> r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super R> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1 r0 = (androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1 r0 = new androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0063
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.L$1
            kotlin.jvm.functions.l r6 = (kotlin.jvm.functions.C11300l) r6
            java.lang.Object r2 = r0.L$0
            androidx.compose.runtime.PausableMonotonicFrameClock r2 = (androidx.compose.runtime.PausableMonotonicFrameClock) r2
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0053
        L_0x0040:
            kotlin.C11661u0.m45747n(r7)
            androidx.compose.runtime.Latch r7 = r5.f22693b
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r7.mo15138c(r0)
            if (r7 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r2 = r5
        L_0x0053:
            androidx.compose.runtime.v0 r7 = r2.f22692a
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r7 = r7.mo14872B(r6, r0)
            if (r7 != r1) goto L_0x0063
            return r1
        L_0x0063:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.PausableMonotonicFrameClock.mo14872B(kotlin.jvm.functions.l, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: Q */
    public CoroutineContext mo7443Q(@C12579k CoroutineContext coroutineContext) {
        return C8686v0.C8687a.m31921e(this, coroutineContext);
    }

    @C12580l
    /* renamed from: b */
    public <E extends CoroutineContext.C11040a> E mo7444b(@C12579k CoroutineContext.C11042b<E> bVar) {
        return C8686v0.C8687a.m31918b(this, bVar);
    }

    /* renamed from: e */
    public final boolean mo15170e() {
        return !this.f22693b.mo15140e();
    }

    @C12579k
    /* renamed from: f */
    public CoroutineContext mo7445f(@C12579k CoroutineContext.C11042b<?> bVar) {
        return C8686v0.C8687a.m31920d(this, bVar);
    }

    /* renamed from: g */
    public final void mo15171g() {
        this.f22693b.mo15139d();
    }

    /* renamed from: h */
    public final void mo15172h() {
        this.f22693b.mo15141f();
    }

    /* renamed from: l */
    public <R> R mo7446l(R r, @C12579k C11304p<? super R, ? super CoroutineContext.C11040a, ? extends R> pVar) {
        return C8686v0.C8687a.m31917a(this, r, pVar);
    }
}
