package androidx.compose.foundation.gestures;

import androidx.compose.foundation.C2253k0;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p004ui.unit.C16509w;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class ScrollingLogic {
    @C12579k

    /* renamed from: a */
    public final Orientation f5903a;

    /* renamed from: b */
    public final boolean f5904b;
    @C12579k

    /* renamed from: c */
    public final C8578k2<NestedScrollDispatcher> f5905c;
    @C12579k

    /* renamed from: d */
    public final C2203n f5906d;
    @C12579k

    /* renamed from: e */
    public final C2195g f5907e;
    @C12580l

    /* renamed from: f */
    public final C2253k0 f5908f;
    @C12579k

    /* renamed from: g */
    public final C8700z0<Boolean> f5909g = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);

    public ScrollingLogic(@C12579k Orientation orientation, boolean z, @C12579k C8578k2<NestedScrollDispatcher> k2Var, @C12579k C2203n nVar, @C12579k C2195g gVar, @C12580l C2253k0 k0Var) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(k2Var, "nestedScrollDispatcher");
        Intrinsics.checkNotNullParameter(nVar, "scrollableState");
        Intrinsics.checkNotNullParameter(gVar, "flingBehavior");
        this.f5903a = orientation;
        this.f5904b = z;
        this.f5905c = k2Var;
        this.f5906d = nVar;
        this.f5907e = gVar;
        this.f5908f = k0Var;
    }

    /* renamed from: a */
    public final long mo7459a(@C12579k C2201l lVar, long j, int i) {
        Intrinsics.checkNotNullParameter(lVar, "$this$dispatchScroll");
        long p = mo7474p(j);
        ScrollingLogic$dispatchScroll$performScroll$1 scrollingLogic$dispatchScroll$performScroll$1 = new ScrollingLogic$dispatchScroll$performScroll$1(this, i, lVar);
        if (this.f5908f == null || !mo7467i()) {
            return ((C15094f) scrollingLogic$dispatchScroll$performScroll$1.invoke(C15094f.m64868d(p))).mo42242A();
        }
        return this.f5908f.mo7108c(p, i, scrollingLogic$dispatchScroll$performScroll$1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo7460b(long r13, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super androidx.compose.p004ui.unit.C16509w> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            r0.<init>(r12, r15)
        L_0x0018:
            r4 = r0
            java.lang.Object r15 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 != r2) goto L_0x002e
            java.lang.Object r13 = r4.L$0
            kotlin.jvm.internal.Ref$LongRef r13 = (kotlin.jvm.internal.Ref.LongRef) r13
            kotlin.C11661u0.m45747n(r15)
            goto L_0x005d
        L_0x002e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0036:
            kotlin.C11661u0.m45747n(r15)
            kotlin.jvm.internal.Ref$LongRef r15 = new kotlin.jvm.internal.Ref$LongRef
            r15.<init>()
            r15.element = r13
            androidx.compose.foundation.gestures.n r1 = r12.f5906d
            r3 = 0
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r11 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2
            r10 = 0
            r5 = r11
            r6 = r12
            r7 = r15
            r8 = r13
            r5.<init>(r6, r7, r8, r10)
            r5 = 1
            r6 = 0
            r4.L$0 = r15
            r4.label = r2
            r2 = r3
            r3 = r11
            java.lang.Object r13 = androidx.compose.foundation.gestures.C2203n.m9563c(r1, r2, r3, r4, r5, r6)
            if (r13 != r0) goto L_0x005c
            return r0
        L_0x005c:
            r13 = r15
        L_0x005d:
            long r13 = r13.element
            androidx.compose.ui.unit.w r13 = androidx.compose.p004ui.unit.C16509w.m74740b(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.mo7460b(long, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: c */
    public final C2195g mo7461c() {
        return this.f5907e;
    }

    @C12579k
    /* renamed from: d */
    public final C8578k2<NestedScrollDispatcher> mo7462d() {
        return this.f5905c;
    }

    @C12579k
    /* renamed from: e */
    public final Orientation mo7463e() {
        return this.f5903a;
    }

    @C12580l
    /* renamed from: f */
    public final C2253k0 mo7464f() {
        return this.f5908f;
    }

    /* renamed from: g */
    public final boolean mo7465g() {
        return this.f5904b;
    }

    @C12579k
    /* renamed from: h */
    public final C2203n mo7466h() {
        return this.f5906d;
    }

    /* renamed from: i */
    public final boolean mo7467i() {
        return this.f5906d.mo7249a() || this.f5906d.mo7252f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo7468j(long r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 == r4) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            goto L_0x0031
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            java.lang.Object r6 = r0.L$0
            androidx.compose.foundation.gestures.ScrollingLogic r6 = (androidx.compose.foundation.gestures.ScrollingLogic) r6
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0071
        L_0x0039:
            kotlin.C11661u0.m45747n(r8)
            r5.mo7470l(r4)
            long r6 = r5.mo7475q(r6)
            androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1 r8 = new androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1
            r2 = 0
            r8.<init>(r5, r2)
            androidx.compose.foundation.k0 r2 = r5.f5908f
            if (r2 == 0) goto L_0x0062
            boolean r2 = r5.mo7467i()
            if (r2 == 0) goto L_0x0062
            androidx.compose.foundation.k0 r2 = r5.f5908f
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r2.mo7109d(r6, r8, r0)
            if (r6 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r6 = r5
            goto L_0x0071
        L_0x0062:
            androidx.compose.ui.unit.w r6 = androidx.compose.p004ui.unit.C16509w.m74740b(r6)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r8.invoke(r6, r0)
            if (r6 != r1) goto L_0x0060
            return r1
        L_0x0071:
            r7 = 0
            r6.mo7470l(r7)
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.mo7468j(long, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: k */
    public final long mo7469k(long j) {
        if (this.f5906d.mo7251e()) {
            return C15094f.f37256b.mo42248e();
        }
        return mo7478t(mo7471m(this.f5906d.mo7250b(mo7471m(mo7477s(j)))));
    }

    /* renamed from: l */
    public final void mo7470l(boolean z) {
        this.f5909g.setValue(Boolean.valueOf(z));
    }

    /* renamed from: m */
    public final float mo7471m(float f) {
        return this.f5904b ? f * ((float) -1) : f;
    }

    /* renamed from: n */
    public final long mo7472n(long j) {
        return this.f5904b ? C15094f.m64888x(j, -1.0f) : j;
    }

    /* renamed from: o */
    public final boolean mo7473o() {
        boolean z;
        if (!this.f5906d.mo7251e() && !this.f5909g.getValue().booleanValue()) {
            C2253k0 k0Var = this.f5908f;
            if (k0Var != null) {
                z = k0Var.mo7106a();
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public final long mo7474p(long j) {
        return this.f5903a == Orientation.Horizontal ? C15094f.m64873i(j, 0.0f, 0.0f, 1, (Object) null) : C15094f.m64873i(j, 0.0f, 0.0f, 2, (Object) null);
    }

    /* renamed from: q */
    public final long mo7475q(long j) {
        return this.f5903a == Orientation.Horizontal ? C16509w.m74745g(j, 0.0f, 0.0f, 1, (Object) null) : C16509w.m74745g(j, 0.0f, 0.0f, 2, (Object) null);
    }

    /* renamed from: r */
    public final float mo7476r(long j) {
        return this.f5903a == Orientation.Horizontal ? C16509w.m74750l(j) : C16509w.m74752n(j);
    }

    /* renamed from: s */
    public final float mo7477s(long j) {
        return this.f5903a == Orientation.Horizontal ? C15094f.m64880p(j) : C15094f.m64882r(j);
    }

    /* renamed from: t */
    public final long mo7478t(float f) {
        boolean z;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C15094f.f37256b.mo42248e();
        }
        if (this.f5903a == Orientation.Horizontal) {
            return C15096g.m64898a(f, 0.0f);
        }
        return C15096g.m64898a(0.0f, f);
    }

    /* renamed from: u */
    public final long mo7479u(long j, float f) {
        return this.f5903a == Orientation.Horizontal ? C16509w.m74745g(j, f, 0.0f, 2, (Object) null) : C16509w.m74745g(j, 0.0f, f, 1, (Object) null);
    }
}
