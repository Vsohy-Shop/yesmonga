package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import androidx.annotation.C0376v0;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.nestedscroll.C15446a;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16509w;
import com.google.android.gms.analytics.ecommerce.C40383c;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import kotlin.ranges.C11479u;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.C12078p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C0376v0(30)
@C11363r0({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,708:1\n314#2,11:709\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection\n*L\n197#1:709,11\n*E\n"})
public final class WindowInsetsNestedScrollConnection implements C15446a, WindowInsetsAnimationControlListener {
    @C12579k

    /* renamed from: a */
    public final C2356f f6209a;
    @C12579k

    /* renamed from: b */
    public final View f6210b;
    @C12579k

    /* renamed from: c */
    public final C2420x0 f6211c;
    @C12579k

    /* renamed from: d */
    public final C16479d f6212d;
    @C12580l

    /* renamed from: e */
    public WindowInsetsAnimationController f6213e;

    /* renamed from: f */
    public boolean f6214f;
    @C12579k

    /* renamed from: g */
    public final CancellationSignal f6215g = new CancellationSignal();

    /* renamed from: v */
    public float f6216v;
    @C12580l

    /* renamed from: w */
    public C11723c2 f6217w;
    @C12580l

    /* renamed from: x */
    public C12072o<? super WindowInsetsAnimationController> f6218x;

    public WindowInsetsNestedScrollConnection(@C12579k C2356f fVar, @C12579k View view, @C12579k C2420x0 x0Var, @C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(fVar, "windowInsets");
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(x0Var, "sideCalculator");
        Intrinsics.checkNotNullParameter(dVar, "density");
        this.f6209a = fVar;
        this.f6210b = view;
        this.f6211c = x0Var;
        this.f6212d = dVar;
    }

    @C12579k
    /* renamed from: A */
    public final C2356f mo7919A() {
        return this.f6209a;
    }

    /* renamed from: B */
    public final void mo7920B() {
        if (!this.f6214f) {
            this.f6214f = true;
            WindowInsetsController a = this.f6210b.getWindowInsetsController();
            if (a != null) {
                a.controlWindowInsetsAnimation(this.f6209a.mo8052f(), -1, (Interpolator) null, this.f6215g, C2395o1.m10525a(this));
            }
        }
    }

    /* renamed from: C */
    public final long mo7921C(long j, float f) {
        boolean z;
        int i;
        C11723c2 c2Var = this.f6217w;
        boolean z2 = true;
        if (c2Var != null) {
            C11723c2.C11724a.m46184b(c2Var, (CancellationException) null, 1, (Object) null);
            this.f6217w = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.f6213e;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            boolean g = this.f6209a.mo8053g();
            int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i2 <= 0) {
                z2 = false;
            }
            if (!(g == z2 && windowInsetsAnimationController == null)) {
                if (windowInsetsAnimationController == null) {
                    this.f6216v = 0.0f;
                    mo7920B();
                    return this.f6211c.mo8236f(j);
                }
                C2420x0 x0Var = this.f6211c;
                Insets a = windowInsetsAnimationController.getHiddenStateInsets();
                Intrinsics.checkNotNullExpressionValue(a, "animationController.hiddenStateInsets");
                int e = x0Var.mo8235e(a);
                C2420x0 x0Var2 = this.f6211c;
                Insets a2 = windowInsetsAnimationController.getShownStateInsets();
                Intrinsics.checkNotNullExpressionValue(a2, "animationController.shownStateInsets");
                int e2 = x0Var2.mo8235e(a2);
                Insets a3 = windowInsetsAnimationController.getCurrentInsets();
                Intrinsics.checkNotNullExpressionValue(a3, "animationController.currentInsets");
                int e3 = this.f6211c.mo8235e(a3);
                if (i2 > 0) {
                    i = e2;
                } else {
                    i = e;
                }
                if (e3 == i) {
                    this.f6216v = 0.0f;
                    return C15094f.f37256b.mo42248e();
                }
                float f2 = ((float) e3) + f + this.f6216v;
                int I = C11479u.m44334I(C11409d.m43851L0(f2), e, e2);
                this.f6216v = f2 - ((float) C11409d.m43851L0(f2));
                if (I != e3) {
                    windowInsetsAnimationController.setInsetsAndAlpha(this.f6211c.mo8233c(a3, I), 1.0f, 0.0f);
                }
                return this.f6211c.mo8236f(j);
            }
        }
        return C15094f.f37256b.mo42248e();
    }

    @C12580l
    /* renamed from: a */
    public Object mo7455a(long j, long j2, @C12579k C11045c<? super C16509w> cVar) {
        return mo7929v(j2, this.f6211c.mo8231a(C16509w.m74750l(j2), C16509w.m74752n(j2)), true, cVar);
    }

    /* renamed from: g */
    public long mo7456g(long j, long j2, int i) {
        return mo7921C(j2, this.f6211c.mo8231a(C15094f.m64880p(j2), C15094f.m64882r(j2)));
    }

    /* renamed from: m */
    public long mo7457m(long j, int i) {
        return mo7921C(j, this.f6211c.mo8234d(C15094f.m64880p(j), C15094f.m64882r(j)));
    }

    @C12580l
    /* renamed from: o */
    public Object mo7922o(long j, @C12579k C11045c<? super C16509w> cVar) {
        return mo7929v(j, this.f6211c.mo8234d(C16509w.m74750l(j), C16509w.m74752n(j)), false, cVar);
    }

    public void onCancelled(@C12580l WindowInsetsAnimationController windowInsetsAnimationController) {
        mo7927t();
    }

    public void onFinished(@C12579k WindowInsetsAnimationController windowInsetsAnimationController) {
        Intrinsics.checkNotNullParameter(windowInsetsAnimationController, "controller");
        mo7927t();
    }

    public void onReady(@C12579k WindowInsetsAnimationController windowInsetsAnimationController, int i) {
        Intrinsics.checkNotNullParameter(windowInsetsAnimationController, "controller");
        this.f6213e = windowInsetsAnimationController;
        this.f6214f = false;
        C12072o<? super WindowInsetsAnimationController> oVar = this.f6218x;
        if (oVar != null) {
            oVar.mo24532O(windowInsetsAnimationController, WindowInsetsNestedScrollConnection$onReady$1.f6221f);
        }
        this.f6218x = null;
    }

    /* renamed from: s */
    public final void mo7926s(float f) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.f6213e;
        if (windowInsetsAnimationController != null) {
            Insets a = windowInsetsAnimationController.getCurrentInsets();
            Intrinsics.checkNotNullExpressionValue(a, "it.currentInsets");
            windowInsetsAnimationController.setInsetsAndAlpha(this.f6211c.mo8233c(a, C11409d.m43851L0(f)), 1.0f, 0.0f);
        }
    }

    /* renamed from: t */
    public final void mo7927t() {
        boolean z;
        WindowInsetsAnimationController windowInsetsAnimationController;
        WindowInsetsAnimationController windowInsetsAnimationController2 = this.f6213e;
        if (windowInsetsAnimationController2 == null || !windowInsetsAnimationController2.isReady()) {
            z = false;
        } else {
            z = true;
        }
        if (z && (windowInsetsAnimationController = this.f6213e) != null) {
            windowInsetsAnimationController.finish(this.f6209a.mo8053g());
        }
        this.f6213e = null;
        C12072o<? super WindowInsetsAnimationController> oVar = this.f6218x;
        if (oVar != null) {
            oVar.mo24532O(null, WindowInsetsNestedScrollConnection$animationEnded$1.f6219f);
        }
        this.f6218x = null;
        C11723c2 c2Var = this.f6217w;
        if (c2Var != null) {
            C11723c2.C11724a.m46184b(c2Var, (CancellationException) null, 1, (Object) null);
        }
        this.f6217w = null;
        this.f6216v = 0.0f;
        this.f6214f = false;
    }

    /* renamed from: u */
    public final void mo7928u() {
        C12072o<? super WindowInsetsAnimationController> oVar = this.f6218x;
        if (oVar != null) {
            oVar.mo24532O(null, WindowInsetsNestedScrollConnection$dispose$1.f6220f);
        }
        C11723c2 c2Var = this.f6217w;
        if (c2Var != null) {
            C11723c2.C11724a.m46184b(c2Var, (CancellationException) null, 1, (Object) null);
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.f6213e;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.finish(!Intrinsics.areEqual((Object) windowInsetsAnimationController.getCurrentInsets(), (Object) windowInsetsAnimationController.getHiddenStateInsets()));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo7929v(long r27, float r29, boolean r30, kotlin.coroutines.C11045c<? super androidx.compose.p004ui.unit.C16509w> r31) {
        /*
            r26 = this;
            r0 = r26
            r1 = r29
            r2 = r30
            r3 = r31
            boolean r4 = r3 instanceof androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$1
            if (r4 == 0) goto L_0x001b
            r4 = r3
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$1 r4 = (androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$1) r4
            int r5 = r4.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.label = r5
            goto L_0x0020
        L_0x001b:
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$1 r4 = new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$1
            r4.<init>(r0, r3)
        L_0x0020:
            java.lang.Object r3 = r4.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r6 = r4.label
            r7 = 3
            r8 = 2
            r10 = 0
            r11 = 0
            r12 = 1
            if (r6 == 0) goto L_0x0063
            if (r6 == r12) goto L_0x0057
            if (r6 == r8) goto L_0x0048
            if (r6 != r7) goto L_0x0040
            long r1 = r4.J$0
            java.lang.Object r4 = r4.L$0
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection r4 = (androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection) r4
            kotlin.C11661u0.m45747n(r3)
            goto L_0x0159
        L_0x0040:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0048:
            long r1 = r4.J$0
            java.lang.Object r5 = r4.L$1
            kotlin.jvm.internal.Ref$FloatRef r5 = (kotlin.jvm.internal.Ref.FloatRef) r5
            java.lang.Object r4 = r4.L$0
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection r4 = (androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection) r4
            kotlin.C11661u0.m45747n(r3)
            goto L_0x0195
        L_0x0057:
            float r1 = r4.F$0
            long r13 = r4.J$0
            java.lang.Object r2 = r4.L$0
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection r2 = (androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection) r2
            kotlin.C11661u0.m45747n(r3)
            goto L_0x00a7
        L_0x0063:
            kotlin.C11661u0.m45747n(r3)
            kotlinx.coroutines.c2 r3 = r0.f6217w
            if (r3 == 0) goto L_0x006d
            kotlinx.coroutines.C11723c2.C11724a.m46184b(r3, r10, r12, r10)
        L_0x006d:
            r0.f6217w = r10
            r0.f6216v = r11
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0077
            r3 = r12
            goto L_0x0078
        L_0x0077:
            r3 = 0
        L_0x0078:
            if (r3 == 0) goto L_0x007c
            if (r2 == 0) goto L_0x0088
        L_0x007c:
            android.view.WindowInsetsAnimationController r3 = r0.f6213e
            if (r3 != 0) goto L_0x0093
            androidx.compose.foundation.layout.f r3 = r0.f6209a
            boolean r3 = r3.mo8053g()
            if (r3 != r2) goto L_0x0093
        L_0x0088:
            androidx.compose.ui.unit.w$a r1 = androidx.compose.p004ui.unit.C16509w.f40916b
            long r1 = r1.mo47915a()
            androidx.compose.ui.unit.w r1 = androidx.compose.p004ui.unit.C16509w.m74740b(r1)
            return r1
        L_0x0093:
            r4.L$0 = r0
            r2 = r27
            r4.J$0 = r2
            r4.F$0 = r1
            r4.label = r12
            java.lang.Object r6 = r0.mo7930w(r4)
            if (r6 != r5) goto L_0x00a4
            return r5
        L_0x00a4:
            r13 = r2
            r3 = r6
            r2 = r0
        L_0x00a7:
            android.view.WindowInsetsAnimationController r3 = androidx.compose.foundation.layout.C2361g1.m10411a(r3)
            if (r3 != 0) goto L_0x00b8
            androidx.compose.ui.unit.w$a r1 = androidx.compose.p004ui.unit.C16509w.f40916b
            long r1 = r1.mo47915a()
            androidx.compose.ui.unit.w r1 = androidx.compose.p004ui.unit.C16509w.m74740b(r1)
            return r1
        L_0x00b8:
            androidx.compose.foundation.layout.x0 r6 = r2.f6211c
            android.graphics.Insets r15 = r3.getHiddenStateInsets()
            java.lang.String r9 = "animationController.hiddenStateInsets"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r9)
            int r6 = r6.mo8235e(r15)
            androidx.compose.foundation.layout.x0 r9 = r2.f6211c
            android.graphics.Insets r15 = r3.getShownStateInsets()
            java.lang.String r12 = "animationController.shownStateInsets"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r12)
            int r9 = r9.mo8235e(r15)
            android.graphics.Insets r12 = r3.getCurrentInsets()
            java.lang.String r15 = "animationController.currentInsets"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r15)
            androidx.compose.foundation.layout.x0 r15 = r2.f6211c
            int r12 = r15.mo8235e(r12)
            int r15 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r15 > 0) goto L_0x00eb
            if (r12 == r6) goto L_0x00f1
        L_0x00eb:
            int r15 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r15 < 0) goto L_0x0106
            if (r12 != r9) goto L_0x0106
        L_0x00f1:
            if (r12 != r9) goto L_0x00f5
            r9 = 1
            goto L_0x00f6
        L_0x00f5:
            r9 = 0
        L_0x00f6:
            r3.finish(r9)
            r2.f6213e = r10
            androidx.compose.ui.unit.w$a r1 = androidx.compose.p004ui.unit.C16509w.f40916b
            long r1 = r1.mo47915a()
            androidx.compose.ui.unit.w r1 = androidx.compose.p004ui.unit.C16509w.m74740b(r1)
            return r1
        L_0x0106:
            androidx.compose.foundation.layout.z0 r10 = new androidx.compose.foundation.layout.z0
            androidx.compose.ui.unit.d r15 = r2.f6212d
            r10.<init>(r15)
            float r15 = (float) r12
            float r17 = r10.mo8239f(r1)
            float r15 = r15 + r17
            float r8 = (float) r6
            float r17 = r15 - r8
            int r11 = r9 - r6
            float r11 = (float) r11
            float r17 = r17 / r11
            r11 = 1056964608(0x3f000000, float:0.5)
            int r11 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x0125
            r24 = 1
            goto L_0x0127
        L_0x0125:
            r24 = 0
        L_0x0127:
            if (r24 == 0) goto L_0x012c
            r18 = r9
            goto L_0x012e
        L_0x012c:
            r18 = r6
        L_0x012e:
            float r11 = (float) r9
            int r11 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r11 > 0) goto L_0x0165
            int r8 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x0138
            goto L_0x0165
        L_0x0138:
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3 r6 = new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3
            r22 = 0
            r15 = r6
            r16 = r2
            r17 = r12
            r19 = r1
            r20 = r3
            r21 = r24
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r4.L$0 = r2
            r4.J$0 = r13
            r4.label = r7
            java.lang.Object r1 = kotlinx.coroutines.C12079p0.m48266g(r6, r4)
            if (r1 != r5) goto L_0x0157
            return r5
        L_0x0157:
            r4 = r2
            r1 = r13
        L_0x0159:
            androidx.compose.foundation.layout.x0 r3 = r4.f6211c
            r4 = 0
            long r1 = r3.mo8237g(r1, r4)
            androidx.compose.ui.unit.w r1 = androidx.compose.p004ui.unit.C16509w.m74740b(r1)
            return r1
        L_0x0165:
            kotlin.jvm.internal.Ref$FloatRef r7 = new kotlin.jvm.internal.Ref$FloatRef
            r7.<init>()
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2 r8 = new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2
            r25 = 0
            r15 = r8
            r16 = r2
            r17 = r12
            r18 = r1
            r19 = r10
            r20 = r6
            r21 = r9
            r22 = r7
            r23 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r4.L$0 = r2
            r4.L$1 = r7
            r4.J$0 = r13
            r1 = 2
            r4.label = r1
            java.lang.Object r1 = kotlinx.coroutines.C12079p0.m48266g(r8, r4)
            if (r1 != r5) goto L_0x0192
            return r5
        L_0x0192:
            r4 = r2
            r5 = r7
            r1 = r13
        L_0x0195:
            androidx.compose.foundation.layout.x0 r3 = r4.f6211c
            float r4 = r5.element
            long r1 = r3.mo8237g(r1, r4)
            androidx.compose.ui.unit.w r1 = androidx.compose.p004ui.unit.C16509w.m74740b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.mo7929v(long, float, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: w */
    public final Object mo7930w(C11045c<? super WindowInsetsAnimationController> cVar) {
        Object obj = this.f6213e;
        if (obj == null) {
            C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
            pVar.mo24537e0();
            this.f6218x = pVar;
            mo7920B();
            obj = pVar.mo24572y();
            if (obj == C11063b.m42612h()) {
                C11069f.m42638c(cVar);
            }
        }
        return obj;
    }

    @C12579k
    /* renamed from: x */
    public final C16479d mo7931x() {
        return this.f6212d;
    }

    @C12579k
    /* renamed from: y */
    public final C2420x0 mo7932y() {
        return this.f6211c;
    }

    @C12579k
    /* renamed from: z */
    public final View mo7933z() {
        return this.f6210b;
    }
}
