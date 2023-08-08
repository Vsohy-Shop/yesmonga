package com.carrefour.fid.android.presentation.p035ui.splash;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.C2022z;
import androidx.compose.foundation.ImageKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15320t2;
import androidx.compose.p004ui.graphics.C15329u3;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSplashscreenJoComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplashscreenJoComponent.kt\ncom/carrefour/fid/android/presentation/ui/splash/SplashscreenJoComponentKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,39:1\n25#2:40\n36#2:47\n1114#3,6:41\n1114#3,6:48\n76#4:54\n102#4,2:55\n76#4:57\n*S KotlinDebug\n*F\n+ 1 SplashscreenJoComponent.kt\ncom/carrefour/fid/android/presentation/ui/splash/SplashscreenJoComponentKt\n*L\n21#1:40\n27#1:47\n21#1:41,6\n27#1:48,6\n21#1:54\n21#1:55,2\n22#1:57\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.splash.SplashscreenJoComponentKt */
public final class SplashscreenJoComponentKt {
    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m110481a(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-522435892);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-522435892, i, -1, "com.carrefour.fid.android.presentation.ui.splash.LoadingPreview (SplashscreenJoComponent.kt:33)");
            }
            ThemeKt.m153788a(ComposableSingletons$SplashscreenJoComponentKt.f63049a.mo74719a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new SplashscreenJoComponentKt$LoadingPreview$1(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m110482b(@C12580l C8592o oVar, int i) {
        float f;
        int i2 = i;
        C8592o o = oVar.mo15009o(1658838671);
        if (i2 != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1658838671, i2, -1, "com.carrefour.fid.android.presentation.ui.splash.SplashscreenJoComponent (SplashscreenJoComponent.kt:19)");
            }
            o.mo14918M(-492369756);
            Object N = o.mo14921N();
            C8592o.C8593a aVar = C8592o.f23032a;
            if (N == aVar.mo16277a()) {
                N = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
                o.mo14893C(N);
            }
            o.mo15002m0();
            C8700z0 z0Var = (C8700z0) N;
            if (m110483c(z0Var)) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            C8578k2<Float> e = AnimateAsStateKt.m7971e(f, C1972h.m8392q(2000, 0, (C2022z) null, 6, (Object) null), 0.0f, (String) null, (C11300l<? super Float, C11079d2>) null, o, 48, 28);
            ImageKt.m8967b(C16015f.m71849d(R.drawable.ds_splash, o, 0), (String) null, C15320t2.m66561e(C8767m.f23478j, 0.0f, 0.0f, m110485e(e), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, (C15218g4) null, false, (C15329u3) null, 0, 0, 0, 131067, (Object) null), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, o, 56, 120);
            Boolean valueOf = Boolean.valueOf(m110483c(z0Var));
            o.mo14918M(1157296644);
            boolean n0 = o.mo15006n0(z0Var);
            Object N2 = o.mo14921N();
            if (n0 || N2 == aVar.mo16277a()) {
                N2 = new SplashscreenJoComponentKt$SplashscreenJoComponent$1$1(z0Var, (C11045c<? super SplashscreenJoComponentKt$SplashscreenJoComponent$1$1>) null);
                o.mo14893C(N2);
            }
            o.mo15002m0();
            EffectsKt.m29896h(valueOf, (C11304p) N2, o, 64);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new SplashscreenJoComponentKt$SplashscreenJoComponent$2(i2));
        }
    }

    /* renamed from: c */
    public static final boolean m110483c(C8700z0<Boolean> z0Var) {
        return z0Var.getValue().booleanValue();
    }

    /* renamed from: d */
    public static final void m110484d(C8700z0<Boolean> z0Var, boolean z) {
        z0Var.setValue(Boolean.valueOf(z));
    }

    /* renamed from: e */
    public static final float m110485e(C8578k2<Float> k2Var) {
        return k2Var.getValue().floatValue();
    }
}
