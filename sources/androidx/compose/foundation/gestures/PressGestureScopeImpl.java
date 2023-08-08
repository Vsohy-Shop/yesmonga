package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16489j;
import androidx.compose.runtime.C8547h2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.C12139a;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.C12579k;

public final class PressGestureScopeImpl implements C2198j, C16479d {

    /* renamed from: a */
    public final /* synthetic */ C16479d f5889a;

    /* renamed from: b */
    public boolean f5890b;

    /* renamed from: c */
    public boolean f5891c;
    @C12579k

    /* renamed from: d */
    public final C12139a f5892d = MutexKt.m48605a(false);

    public PressGestureScopeImpl(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        this.f5889a = dVar;
    }

    @C8547h2
    /* renamed from: C2 */
    public float mo7415C2(long j) {
        return this.f5889a.mo7415C2(j);
    }

    @C8547h2
    /* renamed from: L */
    public float mo7416L(int i) {
        return this.f5889a.mo7416L(i);
    }

    @C8547h2
    @C12579k
    /* renamed from: L4 */
    public C15098i mo7417L4(@C12579k C16489j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return this.f5889a.mo7417L4(jVar);
    }

    @C8547h2
    /* renamed from: M */
    public float mo7418M(float f) {
        return this.f5889a.mo7418M(f);
    }

    /* renamed from: R4 */
    public float mo7419R4() {
        return this.f5889a.mo7419R4();
    }

    @C8547h2
    /* renamed from: V */
    public long mo7420V(long j) {
        return this.f5889a.mo7420V(j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: W3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo7421W3(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r5)
            goto L_0x003d
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r5)
            r0.label = r3
            java.lang.Object r5 = r4.mo7434x2(r0)
            if (r5 != r1) goto L_0x003d
            return r1
        L_0x003d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0048
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        L_0x0048:
            androidx.compose.foundation.gestures.GestureCancellationException r5 = new androidx.compose.foundation.gestures.GestureCancellationException
            java.lang.String r0 = "The press gesture was canceled."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.mo7421W3(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: c */
    public final void mo7422c() {
        this.f5891c = true;
        C12139a.C12140a.m48650d(this.f5892d, (Object) null, 1, (Object) null);
    }

    /* renamed from: d */
    public final void mo7423d() {
        this.f5890b = true;
        C12139a.C12140a.m48650d(this.f5892d, (Object) null, 1, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo7424f(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r0
            kotlin.C11661u0.m45747n(r5)
            goto L_0x0047
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            kotlin.C11661u0.m45747n(r5)
            kotlinx.coroutines.sync.a r5 = r4.f5892d
            r0.L$0 = r4
            r0.label = r3
            r2 = 0
            java.lang.Object r5 = kotlinx.coroutines.sync.C12139a.C12140a.m48648b(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L_0x0046
            return r1
        L_0x0046:
            r0 = r4
        L_0x0047:
            r5 = 0
            r0.f5890b = r5
            r0.f5891c = r5
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.mo7424f(kotlin.coroutines.c):java.lang.Object");
    }

    @C8547h2
    /* renamed from: g5 */
    public float mo7425g5(float f) {
        return this.f5889a.mo7425g5(f);
    }

    public float getDensity() {
        return this.f5889a.getDensity();
    }

    @C8547h2
    /* renamed from: m */
    public long mo7427m(float f) {
        return this.f5889a.mo7427m(f);
    }

    @C8547h2
    /* renamed from: n */
    public long mo7428n(long j) {
        return this.f5889a.mo7428n(j);
    }

    @C8547h2
    /* renamed from: n2 */
    public int mo7429n2(float f) {
        return this.f5889a.mo7429n2(f);
    }

    @C8547h2
    /* renamed from: q */
    public float mo7430q(long j) {
        return this.f5889a.mo7430q(j);
    }

    @C8547h2
    /* renamed from: t */
    public long mo7431t(int i) {
        return this.f5889a.mo7431t(i);
    }

    @C8547h2
    /* renamed from: u */
    public long mo7432u(float f) {
        return this.f5889a.mo7432u(f);
    }

    @C8547h2
    /* renamed from: u5 */
    public int mo7433u5(long j) {
        return this.f5889a.mo7433u5(j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: x2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo7434x2(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r0
            kotlin.C11661u0.m45747n(r6)
            goto L_0x004f
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0036:
            kotlin.C11661u0.m45747n(r6)
            boolean r6 = r5.f5890b
            if (r6 != 0) goto L_0x0055
            boolean r6 = r5.f5891c
            if (r6 != 0) goto L_0x0055
            kotlinx.coroutines.sync.a r6 = r5.f5892d
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = kotlinx.coroutines.sync.C12139a.C12140a.m48648b(r6, r3, r0, r4, r3)
            if (r6 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r0 = r5
        L_0x004f:
            kotlinx.coroutines.sync.a r6 = r0.f5892d
            kotlinx.coroutines.sync.C12139a.C12140a.m48650d(r6, r3, r4, r3)
            goto L_0x0056
        L_0x0055:
            r0 = r5
        L_0x0056:
            boolean r6 = r0.f5890b
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.mo7434x2(kotlin.coroutines.c):java.lang.Object");
    }
}
