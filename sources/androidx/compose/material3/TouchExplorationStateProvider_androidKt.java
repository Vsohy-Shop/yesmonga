package androidx.compose.material3;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nTouchExplorationStateProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchExplorationStateProvider.android.kt\nandroidx/compose/material3/TouchExplorationStateProvider_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,107:1\n76#2:108\n76#2:123\n25#3:109\n25#3:116\n25#3:124\n1114#4,6:110\n1114#4,6:117\n1114#4,6:125\n*S KotlinDebug\n*F\n+ 1 TouchExplorationStateProvider.android.kt\nandroidx/compose/material3/TouchExplorationStateProvider_androidKt\n*L\n42#1:108\n49#1:123\n43#1:109\n47#1:116\n60#1:124\n43#1:110,6\n47#1:117,6\n60#1:125,6\n*E\n"})
public final class TouchExplorationStateProvider_androidKt {
    @C8540g
    /* renamed from: a */
    public static final void m26906a(Lifecycle lifecycle, C11300l<? super Lifecycle.C19372Event, C11079d2> lVar, C11289a<C11079d2> aVar, C8592o oVar, int i, int i2) {
        C8592o o = oVar.mo15009o(-1703772404);
        if ((i2 & 1) != 0) {
            lVar = TouchExplorationStateProvider_androidKt$ObserveState$1.f19968f;
        }
        C11300l<? super Lifecycle.C19372Event, C11079d2> lVar2 = lVar;
        if ((i2 & 2) != 0) {
            aVar = TouchExplorationStateProvider_androidKt$ObserveState$2.f19969f;
        }
        C11289a<C11079d2> aVar2 = aVar;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1703772404, i, -1, "androidx.compose.material3.ObserveState (TouchExplorationStateProvider.android.kt:63)");
        }
        EffectsKt.m29891c(lifecycle, new TouchExplorationStateProvider_androidKt$ObserveState$3(lifecycle, lVar2, aVar2), o, 8);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new TouchExplorationStateProvider_androidKt$ObserveState$4(lifecycle, lVar2, aVar2, i, i2));
        }
    }

    @C8540g
    @C12579k
    /* renamed from: c */
    public static final C8578k2<Boolean> m26908c(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-906157724);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-906157724, i, -1, "androidx.compose.material3.touchExplorationState (TouchExplorationStateProvider.android.kt:40)");
        }
        Context context = (Context) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70952g());
        oVar.mo14918M(-492369756);
        Object N = oVar.mo14921N();
        C8592o.C8593a aVar = C8592o.f23032a;
        if (N == aVar.mo16277a()) {
            Object systemService = context.getSystemService("accessibility");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
            N = (AccessibilityManager) systemService;
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        AccessibilityManager accessibilityManager = (AccessibilityManager) N;
        oVar.mo14918M(-492369756);
        Object N2 = oVar.mo14921N();
        if (N2 == aVar.mo16277a()) {
            N2 = new C8204g1();
            oVar.mo14893C(N2);
        }
        oVar.mo15002m0();
        C8204g1 g1Var = (C8204g1) N2;
        m26906a(((C19499w) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70954i())).getLifecycle(), new TouchExplorationStateProvider_androidKt$touchExplorationState$1(g1Var, accessibilityManager), new TouchExplorationStateProvider_androidKt$touchExplorationState$2(g1Var, accessibilityManager), oVar, 8, 0);
        oVar.mo14918M(-492369756);
        Object N3 = oVar.mo14921N();
        if (N3 == aVar.mo16277a()) {
            N3 = C8415c2.m30235d(new C8166x188f61bc(g1Var));
            oVar.mo14893C(N3);
        }
        oVar.mo15002m0();
        C8578k2<Boolean> k2Var = (C8578k2) N3;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return k2Var;
    }
}
