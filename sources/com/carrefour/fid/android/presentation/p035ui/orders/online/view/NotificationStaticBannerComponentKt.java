package com.carrefour.fid.android.presentation.p035ui.orders.online.view;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.C7933t0;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.res.C16009b;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.Measurer;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.google.android.datatransport.cct.C40045d;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nNotificationStaticBannerComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationStaticBannerComponent.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/view/NotificationStaticBannerComponentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,253:1\n154#2:254\n154#2:255\n73#3,4:256\n77#3,20:267\n25#4:260\n955#5,6:261\n*S KotlinDebug\n*F\n+ 1 NotificationStaticBannerComponent.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/view/NotificationStaticBannerComponentKt\n*L\n40#1:254\n48#1:255\n37#1:256,4\n37#1:267,20\n37#1:260\n37#1:261,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.view.NotificationStaticBannerComponentKt */
public final class NotificationStaticBannerComponentKt {
    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m109333a(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1828541237);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1828541237, i, -1, "com.carrefour.fid.android.presentation.ui.orders.online.view.NotificationComponentActionPreview (NotificationStaticBannerComponent.kt:220)");
            }
            ThemeKt.m153788a(ComposableSingletons$NotificationStaticBannerComponentKt.f62289a.mo73617d(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C25256xf18a4ad0(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m109334b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1964337203);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1964337203, i, -1, "com.carrefour.fid.android.presentation.ui.orders.online.view.NotificationComponentEdgesPreview (NotificationStaticBannerComponent.kt:237)");
            }
            ThemeKt.m153788a(ComposableSingletons$NotificationStaticBannerComponentKt.f62289a.mo73618e(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C25257x4ec5b06e(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m109335c(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(417383085);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(417383085, i, -1, "com.carrefour.fid.android.presentation.ui.orders.online.view.NotificationComponentInfoPreview (NotificationStaticBannerComponent.kt:200)");
            }
            ThemeKt.m153788a(ComposableSingletons$NotificationStaticBannerComponentKt.f62289a.mo73616c(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C25258x1bf07b98(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m109336d(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1678722286);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1678722286, i, -1, "com.carrefour.fid.android.presentation.ui.orders.online.view.NotificationComponentNotColoredPreview (NotificationStaticBannerComponent.kt:181)");
            }
            ThemeKt.m153788a(ComposableSingletons$NotificationStaticBannerComponentKt.f62289a.mo73615b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C25259xfb59bfb7(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m109337e(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1046736351);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1046736351, i, -1, "com.carrefour.fid.android.presentation.ui.orders.online.view.NotificationComponentPreview (NotificationStaticBannerComponent.kt:163)");
            }
            ThemeKt.m153788a(ComposableSingletons$NotificationStaticBannerComponentKt.f62289a.mo73614a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C25260x216e2d26(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m109338f(@C12580l C8767m mVar, @C12579k NotificationConfig notificationConfig, @C12579k C25277a aVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        C8767m mVar2;
        C8767m mVar3;
        C8767m.C8768a aVar2;
        int i4;
        int i5;
        int i6;
        NotificationConfig notificationConfig2 = notificationConfig;
        C25277a aVar3 = aVar;
        int i7 = i;
        Intrinsics.checkNotNullParameter(notificationConfig2, C40045d.f102104u);
        Intrinsics.checkNotNullParameter(aVar3, "variant");
        C8592o o = oVar.mo15009o(-866917395);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i7 | 6;
            mVar2 = mVar;
        } else if ((i7 & 14) == 0) {
            mVar2 = mVar;
            if (o.mo15006n0(mVar2)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i7;
        } else {
            mVar2 = mVar;
            i3 = i7;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i7 & 112) == 0) {
            if (o.mo15006n0(notificationConfig2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= C22132b.f56831b;
        } else if ((i7 & 896) == 0) {
            if (o.mo15006n0(aVar3)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        int i9 = i3;
        if ((i9 & 731) != 146 || !o.mo15011p()) {
            if (i8 != 0) {
                aVar2 = C8767m.f23478j;
            } else {
                aVar2 = mVar2;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-866917395, i9, -1, "com.carrefour.fid.android.presentation.ui.orders.online.view.NotificationStaticBannerComponent (NotificationStaticBannerComponent.kt:31)");
            }
            float M = C16483g.m74435M((float) 1);
            long a = C16009b.m71825a(aVar.mo73727c(), o, 0);
            C7933t0 t0Var = C7933t0.f19075a;
            int i10 = C7933t0.f19076b;
            C8767m k = PaddingKt.m10024k(BackgroundKt.m8824c(BorderKt.m8852h(aVar2, M, a, t0Var.mo11076b(o, i10).mo10757d()), C16009b.m71825a(aVar.mo73725a(), o, 0), t0Var.mo11076b(o, i10).mo10757d()), C16483g.m74435M((float) 16));
            o.mo14918M(-270267587);
            o.mo14918M(-3687241);
            Object N = o.mo14921N();
            C8592o.C8593a aVar4 = C8592o.f23032a;
            if (N == aVar4.mo16277a()) {
                N = new Measurer();
                o.mo14893C(N);
            }
            o.mo15002m0();
            Measurer measurer = (Measurer) N;
            o.mo14918M(-3687241);
            Object N2 = o.mo14921N();
            if (N2 == aVar4.mo16277a()) {
                N2 = new ConstraintLayoutScope();
                o.mo14893C(N2);
            }
            o.mo15002m0();
            ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) N2;
            o.mo14918M(-3687241);
            Object N3 = o.mo14921N();
            if (N3 == aVar4.mo16277a()) {
                N3 = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
                o.mo14893C(N3);
            }
            o.mo15002m0();
            Pair<C15560f0, C11289a<C11079d2>> E = ConstraintLayoutKt.m75199E(257, constraintLayoutScope, (C8700z0) N3, measurer, o, 4544);
            LayoutKt.m68906d(SemanticsModifierKt.m71868c(k, false, new C25254xc2d91e82(measurer), 1, (Object) null), C8553b.m31048b(o, -819894182, true, new C25255xc2d91e83(constraintLayoutScope, 0, E.mo21847b(), aVar, notificationConfig, i9)), E.mo21846a(), o, 48, 0);
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            mVar3 = aVar2;
        } else {
            o.mo14958a0();
            mVar3 = mVar2;
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C25268x96150023(mVar3, notificationConfig, aVar, i, i2));
        }
    }
}
