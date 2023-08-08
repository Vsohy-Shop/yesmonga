package com.carrefour.fid.android.product.presentation.p039ui.details.views;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.C3052i1;
import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16009b;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.semantics.C16031g;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
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
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27906t;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nSnackBarComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackBarComponent.kt\ncom/carrefour/fid/android/product/presentation/ui/details/views/SnackBarComponentKt$SnackBarComponent$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,99:1\n154#2:100\n154#2:101\n154#2:135\n154#2:136\n154#2:171\n154#2:204\n75#3,6:102\n81#3:134\n85#3:219\n75#4:108\n76#4,11:110\n75#4:144\n76#4,11:146\n75#4:177\n76#4,11:179\n89#4:208\n89#4:213\n89#4:218\n76#5:109\n76#5:145\n76#5:178\n460#6,13:121\n460#6,13:157\n460#6,13:190\n473#6,3:205\n473#6,3:210\n473#6,3:215\n66#7,7:137\n73#7:170\n68#7,5:172\n73#7:203\n77#7:209\n77#7:214\n*S KotlinDebug\n*F\n+ 1 SnackBarComponent.kt\ncom/carrefour/fid/android/product/presentation/ui/details/views/SnackBarComponentKt$SnackBarComponent$1\n*L\n45#1:100\n49#1:101\n54#1:135\n63#1:136\n70#1:171\n77#1:204\n40#1:102,6\n40#1:134\n40#1:219\n40#1:108\n40#1:110,11\n66#1:144\n66#1:146,11\n67#1:177\n67#1:179,11\n67#1:208\n66#1:213\n40#1:218\n40#1:109\n66#1:145\n67#1:178\n40#1:121,13\n66#1:157,13\n67#1:190,13\n67#1:205,3\n66#1:210,3\n40#1:215,3\n66#1:137,7\n66#1:170\n67#1:172,5\n67#1:203\n67#1:209\n66#1:214\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.views.SnackBarComponentKt$SnackBarComponent$1 */
public final class SnackBarComponentKt$SnackBarComponent$1 extends Lambda implements C11305q<C3052i1, C8592o, Integer, C11079d2> {
    final /* synthetic */ C27906t $variant;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackBarComponentKt$SnackBarComponent$1(C27906t tVar) {
        super(3);
        this.$variant = tVar;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo81320a(@C12579k C3052i1 i1Var, @C12580l C8592o oVar, int i) {
        C3052i1 i1Var2 = i1Var;
        C8592o oVar2 = oVar;
        Intrinsics.checkNotNullParameter(i1Var2, "it");
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1869531658, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.views.SnackBarComponent.<anonymous> (SnackBarComponent.kt:38)");
        }
        C8734c.C8735a aVar = C8734c.f23406a;
        C8734c.C8737c q = aVar.mo17070q();
        C8767m.C8768a aVar2 = C8767m.f23478j;
        C8767m k = PaddingKt.m10024k(BorderKt.m8852h(BackgroundKt.m8825d(aVar2, C37475b.f94185a.mo114231a0(), (C15218g4) null, 2, (Object) null), C16483g.m74435M((float) 1), C16009b.m71825a(this.$variant.mo81104b(), oVar2, 0), C7933t0.f19075a.mo11076b(oVar2, C7933t0.f19076b).mo10757d()), C16483g.m74435M((float) 16));
        C27906t tVar = this.$variant;
        oVar2.mo14918M(693286680);
        C15560f0 d = RowKt.m10071d(Arrangement.f6010a.mo7630p(), q, oVar2, 48);
        oVar2.mo14918M(-1323940314);
        C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(k);
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
        Updater.m30188j(b, d, companion.mo44588d());
        Updater.m30188j(b, dVar, companion.mo44586b());
        Updater.m30188j(b, layoutDirection, companion.mo44587c());
        Updater.m30188j(b, c4Var, companion.mo44590f());
        oVar.mo14972e();
        f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
        oVar2.mo14918M(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
        ImageKt.m8967b(C16015f.m71849d(tVar.mo81103a(), oVar2, 0), (String) null, SizeKt.m10087C(aVar2, C16483g.m74435M((float) 24)), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, oVar, 440, 120);
        String c = tVar.mo81105c();
        C16209i0 c2 = C16209i0.f40292b.mo46947c();
        C16242u O = C37477d.m153888O();
        long m = C16506u.m74712m(14);
        C8767m.C8768a aVar3 = aVar2;
        TextKt.m14196c(c, C2411u0.m10660e(rowScopeInstance, PaddingKt.m10026m(aVar2, C16483g.m74435M((float) 8), 0.0f, 2, (Object) null), 1.0f, false, 2, (Object) null), C16009b.m71825a(tVar.mo81106d(), oVar2, 0), m, (C16190e0) null, c2, O, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar, 199680, 0, 130960);
        C8592o oVar3 = oVar;
        oVar3.mo14918M(733328855);
        C15560f0 k2 = BoxKt.m9849k(aVar.mo17061C(), false, oVar3, 0);
        oVar3.mo14918M(-1323940314);
        C16479d dVar2 = (C16479d) oVar3.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection2 = (LayoutDirection) oVar3.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var2 = (C15863c4) oVar3.mo15032w(CompositionLocalsKt.m71025w());
        C11289a<ComposeUiNode> a2 = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(aVar3);
        if (!(oVar.mo15017r() instanceof C8428d)) {
            ComposablesKt.m29519n();
        }
        oVar.mo14938T();
        if (oVar.mo14997l()) {
            oVar3.mo14947W(a2);
        } else {
            oVar.mo14888A();
        }
        oVar.mo14941U();
        C8592o b2 = Updater.m30180b(oVar);
        Updater.m30188j(b2, k2, companion.mo44588d());
        Updater.m30188j(b2, dVar2, companion.mo44586b());
        Updater.m30188j(b2, layoutDirection2, companion.mo44587c());
        Updater.m30188j(b2, c4Var2, companion.mo44590f());
        oVar.mo14972e();
        f2.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar3, 0);
        oVar3.mo14918M(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
        C8734c C = aVar.mo17061C();
        C8767m.C8768a aVar4 = aVar3;
        C8767m o = SizeKt.m10115o(aVar4, C16483g.m74435M((float) 50));
        oVar3.mo14918M(733328855);
        C15560f0 k3 = BoxKt.m9849k(C, false, oVar3, 6);
        oVar3.mo14918M(-1323940314);
        C16479d dVar3 = (C16479d) oVar3.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection3 = (LayoutDirection) oVar3.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var3 = (C15863c4) oVar3.mo15032w(CompositionLocalsKt.m71025w());
        C11289a<ComposeUiNode> a3 = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(o);
        if (!(oVar.mo15017r() instanceof C8428d)) {
            ComposablesKt.m29519n();
        }
        oVar.mo14938T();
        if (oVar.mo14997l()) {
            oVar3.mo14947W(a3);
        } else {
            oVar.mo14888A();
        }
        oVar.mo14941U();
        C8592o b3 = Updater.m30180b(oVar);
        Updater.m30188j(b3, k3, companion.mo44588d());
        Updater.m30188j(b3, dVar3, companion.mo44586b());
        Updater.m30188j(b3, layoutDirection3, companion.mo44587c());
        Updater.m30188j(b3, c4Var3, companion.mo44590f());
        oVar.mo14972e();
        f3.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar3, 0);
        oVar3.mo14918M(2058660585);
        ImageKt.m8967b(C16015f.m71849d(C27609f.C27617h.ds_ic_close, oVar3, 0), (String) null, ClickableKt.m8878e(SizeKt.m10087C(aVar4, C16483g.m74435M((float) 15)), false, (String) null, (C16031g) null, new SnackBarComponentKt$SnackBarComponent$1$1$1$1$1(i1Var2), 7, (Object) null), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, oVar, 56, 120);
        oVar.mo15002m0();
        oVar.mo14896D();
        oVar.mo15002m0();
        oVar.mo15002m0();
        oVar.mo15002m0();
        oVar.mo14896D();
        oVar.mo15002m0();
        oVar.mo15002m0();
        oVar.mo15002m0();
        oVar.mo14896D();
        oVar.mo15002m0();
        oVar.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo81320a((C3052i1) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
