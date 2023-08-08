package androidx.compose.material3;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.input.nestedscroll.C15446a;

public final class ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 implements C15446a {

    /* renamed from: a */
    public final /* synthetic */ ExitUntilCollapsedScrollBehavior f19406a;

    public ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1(ExitUntilCollapsedScrollBehavior exitUntilCollapsedScrollBehavior) {
        this.f19406a = exitUntilCollapsedScrollBehavior;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo7455a(long r10, long r12, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super androidx.compose.p004ui.unit.C16509w> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof androidx.compose.material3.C8019x78ae0263
            if (r0 == 0) goto L_0x0013
            r0 = r14
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 r0 = (androidx.compose.material3.C8019x78ae0263) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 r0 = new androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1
            r0.<init>(r9, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r0.label
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L_0x0040
            if (r1 == r2) goto L_0x0036
            if (r1 != r8) goto L_0x002e
            long r10 = r0.J$0
            kotlin.C11661u0.m45747n(r14)
            goto L_0x0080
        L_0x002e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0036:
            long r12 = r0.J$0
            java.lang.Object r10 = r0.L$0
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 r10 = (androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1) r10
            kotlin.C11661u0.m45747n(r14)
            goto L_0x0055
        L_0x0040:
            kotlin.C11661u0.m45747n(r14)
            r0.L$0 = r9
            r0.J$0 = r12
            r0.label = r2
            r1 = r9
            r2 = r10
            r4 = r12
            r6 = r0
            java.lang.Object r14 = super.mo7455a(r2, r4, r6)
            if (r14 != r7) goto L_0x0054
            return r7
        L_0x0054:
            r10 = r9
        L_0x0055:
            androidx.compose.ui.unit.w r14 = (androidx.compose.p004ui.unit.C16509w) r14
            long r1 = r14.mo47914v()
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior r11 = r10.f19406a
            androidx.compose.material3.TopAppBarState r11 = r11.getState()
            float r12 = androidx.compose.p004ui.unit.C16509w.m74752n(r12)
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior r13 = r10.f19406a
            androidx.compose.animation.core.v r13 = r13.mo11537c()
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior r10 = r10.f19406a
            androidx.compose.animation.core.g r10 = r10.mo11538d()
            r14 = 0
            r0.L$0 = r14
            r0.J$0 = r1
            r0.label = r8
            java.lang.Object r14 = androidx.compose.material3.AppBarKt.m25404x(r11, r12, r13, r10, r0)
            if (r14 != r7) goto L_0x007f
            return r7
        L_0x007f:
            r10 = r1
        L_0x0080:
            androidx.compose.ui.unit.w r14 = (androidx.compose.p004ui.unit.C16509w) r14
            long r12 = r14.mo47914v()
            long r10 = androidx.compose.p004ui.unit.C16509w.m74755q(r10, r12)
            androidx.compose.ui.unit.w r10 = androidx.compose.p004ui.unit.C16509w.m74740b(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1.mo7455a(long, long, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: g */
    public long mo7456g(long j, long j2, int i) {
        boolean z;
        if (!this.f19406a.mo11542e().invoke().booleanValue()) {
            return C15094f.f37256b.mo42248e();
        }
        TopAppBarState state = this.f19406a.getState();
        state.mo12416g(state.mo12412c() + C15094f.m64882r(j));
        if (C15094f.m64882r(j2) < 0.0f || C15094f.m64882r(j) < 0.0f) {
            float d = this.f19406a.getState().mo12413d();
            this.f19406a.getState().mo12417h(this.f19406a.getState().mo12413d() + C15094f.m64882r(j));
            return C15096g.m64898a(0.0f, this.f19406a.getState().mo12413d() - d);
        }
        if (C15094f.m64882r(j) == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z && C15094f.m64882r(j2) > 0.0f) {
            this.f19406a.getState().mo12416g(0.0f);
        }
        if (C15094f.m64882r(j2) <= 0.0f) {
            return C15094f.f37256b.mo42248e();
        }
        float d2 = this.f19406a.getState().mo12413d();
        this.f19406a.getState().mo12417h(this.f19406a.getState().mo12413d() + C15094f.m64882r(j2));
        return C15096g.m64898a(0.0f, this.f19406a.getState().mo12413d() - d2);
    }

    /* renamed from: m */
    public long mo7457m(long j, int i) {
        boolean z;
        if (!this.f19406a.mo11542e().invoke().booleanValue() || C15094f.m64882r(j) > 0.0f) {
            return C15094f.f37256b.mo42248e();
        }
        float d = this.f19406a.getState().mo12413d();
        this.f19406a.getState().mo12417h(this.f19406a.getState().mo12413d() + C15094f.m64882r(j));
        if (d == this.f19406a.getState().mo12413d()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return C15094f.m64873i(j, 0.0f, 0.0f, 2, (Object) null);
        }
        return C15094f.f37256b.mo42248e();
    }
}
