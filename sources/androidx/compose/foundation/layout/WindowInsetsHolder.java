package androidx.compose.foundation.layout;

import android.view.View;
import android.view.WindowInsets;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.snapshots.C8646f;
import androidx.core.graphics.C17616m0;
import androidx.core.view.C18140d0;
import androidx.core.view.C18147d4;
import androidx.core.view.C18196h2;
import androidx.core.view.C18414x1;
import androidx.core.view.C18436z4;
import com.google.android.gms.analytics.ecommerce.C40383c;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class WindowInsetsHolder {
    @C12579k

    /* renamed from: x */
    public static final Companion f6181x = new Companion((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: y */
    public static final WeakHashMap<View, WindowInsetsHolder> f6182y = new WeakHashMap<>();

    /* renamed from: z */
    public static boolean f6183z;
    @C12579k

    /* renamed from: a */
    public final C2356f f6184a;
    @C12579k

    /* renamed from: b */
    public final C2356f f6185b;
    @C12579k

    /* renamed from: c */
    public final C2356f f6186c;
    @C12579k

    /* renamed from: d */
    public final C2356f f6187d;
    @C12579k

    /* renamed from: e */
    public final C2356f f6188e;
    @C12579k

    /* renamed from: f */
    public final C2356f f6189f;
    @C12579k

    /* renamed from: g */
    public final C2356f f6190g;
    @C12579k

    /* renamed from: h */
    public final C2356f f6191h;
    @C12579k

    /* renamed from: i */
    public final C2356f f6192i;
    @C12579k

    /* renamed from: j */
    public final C2345c1 f6193j;
    @C12579k

    /* renamed from: k */
    public final C2354e1 f6194k;
    @C12579k

    /* renamed from: l */
    public final C2354e1 f6195l;
    @C12579k

    /* renamed from: m */
    public final C2354e1 f6196m;
    @C12579k

    /* renamed from: n */
    public final C2345c1 f6197n;
    @C12579k

    /* renamed from: o */
    public final C2345c1 f6198o;
    @C12579k

    /* renamed from: p */
    public final C2345c1 f6199p;
    @C12579k

    /* renamed from: q */
    public final C2345c1 f6200q;
    @C12579k

    /* renamed from: r */
    public final C2345c1 f6201r;
    @C12579k

    /* renamed from: s */
    public final C2345c1 f6202s;
    @C12579k

    /* renamed from: t */
    public final C2345c1 f6203t;

    /* renamed from: u */
    public final boolean f6204u;

    /* renamed from: v */
    public int f6205v;
    @C12579k

    /* renamed from: w */
    public final C2413v f6206w;

    @C11363r0({"SMAP\nWindowInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,767:1\n76#2:768\n361#3,7:769\n1#4:776\n*S KotlinDebug\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion\n*L\n610#1:768\n628#1:769,7\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C8540g
        @C12579k
        /* renamed from: c */
        public final WindowInsetsHolder mo7913c(@C12580l C8592o oVar, int i) {
            oVar.mo14918M(-1366542614);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1366542614, i, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:608)");
            }
            View view = (View) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70956k());
            WindowInsetsHolder d = mo7914d(view);
            EffectsKt.m29891c(d, new WindowInsetsHolder$Companion$current$1(d, view), oVar, 8);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            oVar.mo15002m0();
            return d;
        }

        /* renamed from: d */
        public final WindowInsetsHolder mo7914d(View view) {
            WindowInsetsHolder windowInsetsHolder;
            synchronized (WindowInsetsHolder.f6182y) {
                WeakHashMap a = WindowInsetsHolder.f6182y;
                Object obj = a.get(view);
                if (obj == null) {
                    obj = new WindowInsetsHolder((C18436z4) null, view, (DefaultConstructorMarker) null);
                    a.put(view, obj);
                }
                windowInsetsHolder = (WindowInsetsHolder) obj;
            }
            return windowInsetsHolder;
        }

        /* renamed from: e */
        public final void mo7915e(boolean z) {
            WindowInsetsHolder.f6183z = z;
        }

        /* renamed from: f */
        public final C2356f mo7916f(C18436z4 z4Var, int i, String str) {
            C2356f fVar = new C2356f(i, str);
            if (z4Var != null) {
                fVar.mo8057j(z4Var, i);
            }
            return fVar;
        }

        /* renamed from: g */
        public final C2345c1 mo7917g(C18436z4 z4Var, int i, String str) {
            C17616m0 m0Var;
            if (z4Var == null || (m0Var = z4Var.mo53137g(i)) == null) {
                m0Var = C17616m0.f45994e;
            }
            Intrinsics.checkNotNullExpressionValue(m0Var, "windowInsets?.getInsetsI…e) ?: AndroidXInsets.NONE");
            return C2405r1.m10599a(m0Var, str);
        }

        public Companion() {
        }
    }

    public /* synthetic */ WindowInsetsHolder(C18436z4 z4Var, View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4Var, view);
    }

    /* renamed from: A */
    public static /* synthetic */ void m10178A(WindowInsetsHolder windowInsetsHolder, C18436z4 z4Var, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        windowInsetsHolder.mo7912z(z4Var, i);
    }

    /* renamed from: B */
    public final void mo7887B(@C12579k C18436z4 z4Var) {
        Intrinsics.checkNotNullParameter(z4Var, "windowInsets");
        C2345c1 c1Var = this.f6203t;
        C17616m0 f = z4Var.mo53136f(C18436z4.C18449m.m83505d());
        Intrinsics.checkNotNullExpressionValue(f, "windowInsets.getInsets(W…wInsetsCompat.Type.ime())");
        c1Var.mo8023g(C2405r1.m10598Q(f));
    }

    /* renamed from: C */
    public final void mo7888C(@C12579k C18436z4 z4Var) {
        Intrinsics.checkNotNullParameter(z4Var, "windowInsets");
        C2345c1 c1Var = this.f6202s;
        C17616m0 f = z4Var.mo53136f(C18436z4.C18449m.m83505d());
        Intrinsics.checkNotNullExpressionValue(f, "windowInsets.getInsets(W…wInsetsCompat.Type.ime())");
        c1Var.mo8023g(C2405r1.m10598Q(f));
    }

    /* renamed from: c */
    public final void mo7889c(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        int i = this.f6205v - 1;
        this.f6205v = i;
        if (i == 0) {
            C18196h2.m82559a2(view, (C18414x1) null);
            C18196h2.m82655y2(view, (C18147d4.C18149b) null);
            view.removeOnAttachStateChangeListener(this.f6206w);
        }
    }

    @C12579k
    /* renamed from: d */
    public final C2356f mo7890d() {
        return this.f6184a;
    }

    @C12579k
    /* renamed from: e */
    public final C2345c1 mo7891e() {
        return this.f6197n;
    }

    /* renamed from: f */
    public final boolean mo7892f() {
        return this.f6204u;
    }

    @C12579k
    /* renamed from: g */
    public final C2356f mo7893g() {
        return this.f6185b;
    }

    @C12579k
    /* renamed from: h */
    public final C2356f mo7894h() {
        return this.f6186c;
    }

    @C12579k
    /* renamed from: i */
    public final C2345c1 mo7895i() {
        return this.f6203t;
    }

    @C12579k
    /* renamed from: j */
    public final C2345c1 mo7896j() {
        return this.f6202s;
    }

    @C12579k
    /* renamed from: k */
    public final C2356f mo7897k() {
        return this.f6187d;
    }

    @C12579k
    /* renamed from: l */
    public final C2356f mo7898l() {
        return this.f6188e;
    }

    @C12579k
    /* renamed from: m */
    public final C2345c1 mo7899m() {
        return this.f6198o;
    }

    @C12579k
    /* renamed from: n */
    public final C2354e1 mo7900n() {
        return this.f6196m;
    }

    @C12579k
    /* renamed from: o */
    public final C2354e1 mo7901o() {
        return this.f6194k;
    }

    @C12579k
    /* renamed from: p */
    public final C2354e1 mo7902p() {
        return this.f6195l;
    }

    @C12579k
    /* renamed from: q */
    public final C2356f mo7903q() {
        return this.f6189f;
    }

    @C12579k
    /* renamed from: r */
    public final C2345c1 mo7904r() {
        return this.f6199p;
    }

    @C12579k
    /* renamed from: s */
    public final C2356f mo7905s() {
        return this.f6190g;
    }

    @C12579k
    /* renamed from: t */
    public final C2345c1 mo7906t() {
        return this.f6200q;
    }

    @C12579k
    /* renamed from: u */
    public final C2356f mo7907u() {
        return this.f6191h;
    }

    @C12579k
    /* renamed from: v */
    public final C2356f mo7908v() {
        return this.f6192i;
    }

    @C12579k
    /* renamed from: w */
    public final C2345c1 mo7909w() {
        return this.f6201r;
    }

    @C12579k
    /* renamed from: x */
    public final C2345c1 mo7910x() {
        return this.f6193j;
    }

    /* renamed from: y */
    public final void mo7911y(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        if (this.f6205v == 0) {
            C18196h2.m82559a2(view, this.f6206w);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.f6206w);
            C18196h2.m82655y2(view, this.f6206w);
        }
        this.f6205v++;
    }

    /* renamed from: z */
    public final void mo7912z(@C12579k C18436z4 z4Var, int i) {
        Intrinsics.checkNotNullParameter(z4Var, "windowInsets");
        if (f6183z) {
            WindowInsets J = z4Var.mo53129J();
            Intrinsics.checkNotNull(J);
            z4Var = C18436z4.m83374K(J);
        }
        Intrinsics.checkNotNullExpressionValue(z4Var, "if (testInsets) {\n      …   windowInsets\n        }");
        this.f6184a.mo8057j(z4Var, i);
        this.f6186c.mo8057j(z4Var, i);
        this.f6185b.mo8057j(z4Var, i);
        this.f6188e.mo8057j(z4Var, i);
        this.f6189f.mo8057j(z4Var, i);
        this.f6190g.mo8057j(z4Var, i);
        this.f6191h.mo8057j(z4Var, i);
        this.f6192i.mo8057j(z4Var, i);
        this.f6187d.mo8057j(z4Var, i);
        if (i == 0) {
            C2345c1 c1Var = this.f6197n;
            C17616m0 g = z4Var.mo53137g(C18436z4.C18449m.m83503b());
            Intrinsics.checkNotNullExpressionValue(g, "insets.getInsetsIgnoring…aptionBar()\n            )");
            c1Var.mo8023g(C2405r1.m10598Q(g));
            C2345c1 c1Var2 = this.f6198o;
            C17616m0 g2 = z4Var.mo53137g(C18436z4.C18449m.m83508g());
            Intrinsics.checkNotNullExpressionValue(g2, "insets.getInsetsIgnoring…ationBars()\n            )");
            c1Var2.mo8023g(C2405r1.m10598Q(g2));
            C2345c1 c1Var3 = this.f6199p;
            C17616m0 g3 = z4Var.mo53137g(C18436z4.C18449m.m83509h());
            Intrinsics.checkNotNullExpressionValue(g3, "insets.getInsetsIgnoring…tatusBars()\n            )");
            c1Var3.mo8023g(C2405r1.m10598Q(g3));
            C2345c1 c1Var4 = this.f6200q;
            C17616m0 g4 = z4Var.mo53137g(C18436z4.C18449m.m83510i());
            Intrinsics.checkNotNullExpressionValue(g4, "insets.getInsetsIgnoring…ystemBars()\n            )");
            c1Var4.mo8023g(C2405r1.m10598Q(g4));
            C2345c1 c1Var5 = this.f6201r;
            C17616m0 g5 = z4Var.mo53137g(C18436z4.C18449m.m83512k());
            Intrinsics.checkNotNullExpressionValue(g5, "insets.getInsetsIgnoring…leElement()\n            )");
            c1Var5.mo8023g(C2405r1.m10598Q(g5));
            C18140d0 e = z4Var.mo53134e();
            if (e != null) {
                C17616m0 g6 = e.mo52801g();
                Intrinsics.checkNotNullExpressionValue(g6, "cutout.waterfallInsets");
                this.f6193j.mo8023g(C2405r1.m10598Q(g6));
            }
        }
        C8646f.f23196e.mo16631l();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0079, code lost:
        r7 = (r7 = r10.mo53134e()).mo52801g();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public WindowInsetsHolder(androidx.core.view.C18436z4 r10, android.view.View r11) {
        /*
            r9 = this;
            r9.<init>()
            androidx.compose.foundation.layout.WindowInsetsHolder$Companion r0 = f6181x
            int r1 = androidx.core.view.C18436z4.C18449m.m83503b()
            java.lang.String r2 = "captionBar"
            androidx.compose.foundation.layout.f r1 = r0.mo7916f(r10, r1, r2)
            r9.f6184a = r1
            int r1 = androidx.core.view.C18436z4.C18449m.m83504c()
            java.lang.String r2 = "displayCutout"
            androidx.compose.foundation.layout.f r1 = r0.mo7916f(r10, r1, r2)
            r9.f6185b = r1
            int r2 = androidx.core.view.C18436z4.C18449m.m83505d()
            java.lang.String r3 = "ime"
            androidx.compose.foundation.layout.f r2 = r0.mo7916f(r10, r2, r3)
            r9.f6186c = r2
            int r3 = androidx.core.view.C18436z4.C18449m.m83507f()
            java.lang.String r4 = "mandatorySystemGestures"
            androidx.compose.foundation.layout.f r3 = r0.mo7916f(r10, r3, r4)
            r9.f6187d = r3
            int r4 = androidx.core.view.C18436z4.C18449m.m83508g()
            java.lang.String r5 = "navigationBars"
            androidx.compose.foundation.layout.f r4 = r0.mo7916f(r10, r4, r5)
            r9.f6188e = r4
            int r4 = androidx.core.view.C18436z4.C18449m.m83509h()
            java.lang.String r5 = "statusBars"
            androidx.compose.foundation.layout.f r4 = r0.mo7916f(r10, r4, r5)
            r9.f6189f = r4
            int r4 = androidx.core.view.C18436z4.C18449m.m83510i()
            java.lang.String r5 = "systemBars"
            androidx.compose.foundation.layout.f r4 = r0.mo7916f(r10, r4, r5)
            r9.f6190g = r4
            int r5 = androidx.core.view.C18436z4.C18449m.m83511j()
            java.lang.String r6 = "systemGestures"
            androidx.compose.foundation.layout.f r5 = r0.mo7916f(r10, r5, r6)
            r9.f6191h = r5
            int r6 = androidx.core.view.C18436z4.C18449m.m83512k()
            java.lang.String r7 = "tappableElement"
            androidx.compose.foundation.layout.f r6 = r0.mo7916f(r10, r6, r7)
            r9.f6192i = r6
            if (r10 == 0) goto L_0x007f
            androidx.core.view.d0 r7 = r10.mo53134e()
            if (r7 == 0) goto L_0x007f
            androidx.core.graphics.m0 r7 = r7.mo52801g()
            if (r7 != 0) goto L_0x0081
        L_0x007f:
            androidx.core.graphics.m0 r7 = androidx.core.graphics.C17616m0.f45994e
        L_0x0081:
            java.lang.String r8 = "insets?.displayCutout?.w…ts ?: AndroidXInsets.NONE"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            java.lang.String r8 = "waterfall"
            androidx.compose.foundation.layout.c1 r7 = androidx.compose.foundation.layout.C2405r1.m10599a(r7, r8)
            r9.f6193j = r7
            androidx.compose.foundation.layout.e1 r2 = androidx.compose.foundation.layout.C2358f1.m10398k(r4, r2)
            androidx.compose.foundation.layout.e1 r1 = androidx.compose.foundation.layout.C2358f1.m10398k(r2, r1)
            r9.f6194k = r1
            androidx.compose.foundation.layout.e1 r2 = androidx.compose.foundation.layout.C2358f1.m10398k(r6, r3)
            androidx.compose.foundation.layout.e1 r2 = androidx.compose.foundation.layout.C2358f1.m10398k(r2, r5)
            androidx.compose.foundation.layout.e1 r2 = androidx.compose.foundation.layout.C2358f1.m10398k(r2, r7)
            r9.f6195l = r2
            androidx.compose.foundation.layout.e1 r1 = androidx.compose.foundation.layout.C2358f1.m10398k(r1, r2)
            r9.f6196m = r1
            int r1 = androidx.core.view.C18436z4.C18449m.m83503b()
            java.lang.String r2 = "captionBarIgnoringVisibility"
            androidx.compose.foundation.layout.c1 r1 = r0.mo7917g(r10, r1, r2)
            r9.f6197n = r1
            int r1 = androidx.core.view.C18436z4.C18449m.m83508g()
            java.lang.String r2 = "navigationBarsIgnoringVisibility"
            androidx.compose.foundation.layout.c1 r1 = r0.mo7917g(r10, r1, r2)
            r9.f6198o = r1
            int r1 = androidx.core.view.C18436z4.C18449m.m83509h()
            java.lang.String r2 = "statusBarsIgnoringVisibility"
            androidx.compose.foundation.layout.c1 r1 = r0.mo7917g(r10, r1, r2)
            r9.f6199p = r1
            int r1 = androidx.core.view.C18436z4.C18449m.m83510i()
            java.lang.String r2 = "systemBarsIgnoringVisibility"
            androidx.compose.foundation.layout.c1 r1 = r0.mo7917g(r10, r1, r2)
            r9.f6200q = r1
            int r1 = androidx.core.view.C18436z4.C18449m.m83512k()
            java.lang.String r2 = "tappableElementIgnoringVisibility"
            androidx.compose.foundation.layout.c1 r1 = r0.mo7917g(r10, r1, r2)
            r9.f6201r = r1
            int r1 = androidx.core.view.C18436z4.C18449m.m83505d()
            java.lang.String r2 = "imeAnimationTarget"
            androidx.compose.foundation.layout.c1 r1 = r0.mo7917g(r10, r1, r2)
            r9.f6202s = r1
            int r1 = androidx.core.view.C18436z4.C18449m.m83505d()
            java.lang.String r2 = "imeAnimationSource"
            androidx.compose.foundation.layout.c1 r10 = r0.mo7917g(r10, r1, r2)
            r9.f6203t = r10
            android.view.ViewParent r10 = r11.getParent()
            boolean r11 = r10 instanceof android.view.View
            r0 = 0
            if (r11 == 0) goto L_0x010c
            android.view.View r10 = (android.view.View) r10
            goto L_0x010d
        L_0x010c:
            r10 = r0
        L_0x010d:
            if (r10 == 0) goto L_0x0116
            int r11 = androidx.compose.p004ui.C8776o.C8778b.consume_window_insets_tag
            java.lang.Object r10 = r10.getTag(r11)
            goto L_0x0117
        L_0x0116:
            r10 = r0
        L_0x0117:
            boolean r11 = r10 instanceof java.lang.Boolean
            if (r11 == 0) goto L_0x011e
            r0 = r10
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L_0x011e:
            if (r0 == 0) goto L_0x0125
            boolean r10 = r0.booleanValue()
            goto L_0x0126
        L_0x0125:
            r10 = 1
        L_0x0126:
            r9.f6204u = r10
            androidx.compose.foundation.layout.v r10 = new androidx.compose.foundation.layout.v
            r10.<init>(r9)
            r9.f6206w = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.WindowInsetsHolder.<init>(androidx.core.view.z4, android.view.View):void");
    }
}
