package com.carrefour.fid.android.presentation.p035ui.physicalstore;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.SurfaceKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15421z1;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16009b;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27101a;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27127e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nPhysicalStoreScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalStoreScreen.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/PhysicalStoreScreenKt$PhysicalStoreScreen$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,452:1\n67#2,6:453\n73#2:485\n77#2:492\n75#3:459\n76#3,11:461\n89#3:491\n76#4:460\n460#5,13:472\n473#5,3:488\n154#6:486\n154#6:487\n*S KotlinDebug\n*F\n+ 1 PhysicalStoreScreen.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/PhysicalStoreScreenKt$PhysicalStoreScreen$1\n*L\n205#1:453,6\n205#1:485\n205#1:492\n205#1:459\n205#1:461,11\n205#1:491\n205#1:460\n205#1:472,13\n205#1:488,3\n209#1:486\n329#1:487\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreScreen$1 */
public final class PhysicalStoreScreenKt$PhysicalStoreScreen$1 extends Lambda implements C11305q<C2366i0, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C27101a, C11079d2> $actioner;
    final /* synthetic */ boolean $hasLoyaltyCard;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C27127e $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhysicalStoreScreenKt$PhysicalStoreScreen$1(boolean z, C8767m mVar, C27127e eVar, C11300l<? super C27101a, C11079d2> lVar, int i) {
        super(3);
        this.$hasLoyaltyCard = z;
        this.$modifier = mVar;
        this.$state = eVar;
        this.$actioner = lVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2366i0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2366i0 i0Var, @C12580l C8592o oVar, int i) {
        int i2;
        C2366i0 i0Var2 = i0Var;
        C8592o oVar2 = oVar;
        int i3 = i;
        Intrinsics.checkNotNullParameter(i0Var2, "paddingValues");
        if ((i3 & 14) == 0) {
            i2 = (oVar2.mo15006n0(i0Var2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i2 & 91) != 18 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-767949257, i3, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreen.<anonymous> (PhysicalStoreScreen.kt:203)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m n = SizeKt.m10114n(aVar, 0.0f, 1, (Object) null);
            boolean z = this.$hasLoyaltyCard;
            C8767m mVar = this.$modifier;
            C27127e eVar = this.$state;
            C11300l<C27101a, C11079d2> lVar = this.$actioner;
            int i4 = this.$$dirty;
            oVar2.mo14918M(733328855);
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C15560f0 k = BoxKt.m9849k(aVar2.mo17061C(), false, oVar2, 0);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(n);
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
            C8592o b = Updater.m30180b(oVar);
            Updater.m30188j(b, k, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            oVar.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
            int i5 = i4;
            C11300l<C27101a, C11079d2> lVar2 = lVar;
            boolean z2 = z;
            LazyDslKt.m10737b(SizeKt.m10112l(PaddingKt.m10023j(BackgroundKt.m8823b(mVar, C15421z1.C15422a.m67320s(C15421z1.f38108b, CollectionsKt__CollectionsKt.m40448L(C15240j2.m66071n(C16009b.m71825a(R.color.physical_store_gradient_start, oVar2, 0)), C15240j2.m66071n(C15240j2.f37547b.mo42852w())), 0.0f, 0.0f, 0, 14, (Object) null), (C15218g4) null, 0.0f, 6, (Object) null), i0Var2), 0.0f, 1, (Object) null), (LazyListState) null, PaddingKt.m10018e(0.0f, 0.0f, 0.0f, C16483g.m74435M((float) (z ? 96 : 24)), 7, (Object) null), false, (Arrangement.C2279l) null, (C8734c.C8736b) null, (C2195g) null, false, new PhysicalStoreScreenKt$PhysicalStoreScreen$1$1$1(eVar, mVar, lVar, i4), oVar, 0, 250);
            oVar2.mo14918M(1319022762);
            if (z2) {
                SurfaceKt.m13879b(boxScopeInstance.mo7701c(SizeKt.m10115o(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), C16483g.m74435M((float) 72)), aVar2.mo17065g()), (C15218g4) null, 0, 0, (C2223i) null, 0.0f, C8553b.m31048b(oVar2, 322156346, true, new PhysicalStoreScreenKt$PhysicalStoreScreen$1$1$2(lVar2, i5)), oVar, 1572864, 62);
            }
            oVar.mo15002m0();
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
}
