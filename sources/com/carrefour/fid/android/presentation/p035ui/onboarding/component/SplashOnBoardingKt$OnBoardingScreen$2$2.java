package com.carrefour.fid.android.presentation.p035ui.onboarding.component;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16506u;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import com.carrefour.fid.android.design.libs.pager.C37465b;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nSplashOnBoarding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplashOnBoarding.kt\ncom/carrefour/fid/android/presentation/ui/onboarding/component/SplashOnBoardingKt$OnBoardingScreen$2$2\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,180:1\n75#2,5:181\n80#2:212\n84#2:217\n75#3:186\n76#3,11:188\n89#3:216\n76#4:187\n460#5,13:199\n473#5,3:213\n*S KotlinDebug\n*F\n+ 1 SplashOnBoarding.kt\ncom/carrefour/fid/android/presentation/ui/onboarding/component/SplashOnBoardingKt$OnBoardingScreen$2$2\n*L\n109#1:181,5\n109#1:212\n109#1:217\n109#1:186\n109#1:188,11\n109#1:216\n109#1:187\n109#1:199,13\n109#1:213,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.onboarding.component.SplashOnBoardingKt$OnBoardingScreen$2$2 */
public final class SplashOnBoardingKt$OnBoardingScreen$2$2 extends Lambda implements C11306r<C37465b, Integer, C8592o, Integer, C11079d2> {
    final /* synthetic */ List<C24662a> $steps;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplashOnBoardingKt$OnBoardingScreen$2$2(List<C24662a> list) {
        super(4);
        this.$steps = list;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo72057a(@C12579k C37465b bVar, int i, @C12580l C8592o oVar, int i2) {
        int i3;
        int i4;
        int i5 = i;
        C8592o oVar2 = oVar;
        int i6 = i2;
        Intrinsics.checkNotNullParameter(bVar, "$this$HorizontalPager");
        if ((i6 & 112) == 0) {
            if (oVar2.mo14976f(i5)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 = i4 | i6;
        } else {
            i3 = i6;
        }
        if ((i3 & 721) != 144 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1376873884, i6, -1, "com.carrefour.fid.android.presentation.ui.onboarding.component.OnBoardingScreen.<anonymous>.<anonymous> (SplashOnBoarding.kt:106)");
            }
            Painter d = C16015f.m71849d(this.$steps.get(i5).mo72060b(), oVar2, 0);
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m j = SizeKt.m10110j(aVar, 0.0f, 1, (Object) null);
            Arrangement.C2271e j2 = Arrangement.f6010a.mo7627j();
            List<C24662a> list = this.$steps;
            oVar2.mo14918M(-483455358);
            C15560f0 b = ColumnKt.m9863b(j2, C8734c.f23406a.mo17072u(), oVar2, 6);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(j);
            if (!(oVar.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            oVar.mo14938T();
            if (oVar.mo14997l()) {
                oVar2.mo14947W(a);
            } else {
                oVar.mo14888A();
            }
            oVar.mo14941U();
            C8592o b2 = Updater.m30180b(oVar);
            Updater.m30188j(b2, b, companion.mo44588d());
            Updater.m30188j(b2, dVar, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection, companion.mo44587c());
            Updater.m30188j(b2, c4Var, companion.mo44590f());
            oVar.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            ImageKt.m8967b(C16015f.m71849d(list.get(i5).mo72060b(), oVar2, 0), (String) null, SizeKt.m10114n(AspectRatioKt.m9820b(aVar, C15104m.m65023t(d.mo42949l()) / C15104m.m65016m(d.mo42949l()), false, 2, (Object) null), 0.0f, 1, (Object) null), (C8734c) null, C15541c.f38696a.mo44373i(), 0.0f, (C15249k2) null, oVar, 24632, 104);
            String d2 = C16018i.m71858d(list.get(i5).mo72061c(), oVar2, 0);
            long m = C16506u.m74712m(28);
            C16209i0.C16210a aVar2 = C16209i0.f40292b;
            C16209i0 F = aVar2.mo46943F();
            C16432i.C16433a aVar3 = C16432i.f40718b;
            TextKt.m14196c(d2, (C8767m) null, 0, m, (C16190e0) null, F, (C16242u) null, 0, (C16434j) null, C16432i.m74172g(aVar3.mo47667a()), 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar, 199680, 0, 130518);
            TextKt.m14196c(C16018i.m71858d(list.get(i5).mo72059a(), oVar, 0), (C8767m) null, 0, C16506u.m74712m(16), (C16190e0) null, aVar2.mo46959z(), (C16242u) null, 0, (C16434j) null, C16432i.m74172g(aVar3.mo47667a()), 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar, 199680, 0, 130518);
            oVar.mo15002m0();
            oVar.mo14896D();
            oVar.mo15002m0();
            oVar.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        mo72057a((C37465b) obj, ((Number) obj2).intValue(), (C8592o) obj3, ((Number) obj4).intValue());
        return C11079d2.f28267a;
    }
}
