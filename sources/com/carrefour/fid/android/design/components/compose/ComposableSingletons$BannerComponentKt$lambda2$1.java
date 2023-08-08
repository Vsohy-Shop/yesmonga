package com.carrefour.fid.android.design.components.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
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
import com.carrefour.fid.android.design.components.C36896b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;
import org.joda.time.C12590b;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nBannerComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannerComponent.kt\ncom/carrefour/fid/android/design/components/compose/ComposableSingletons$BannerComponentKt$lambda-2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,269:1\n154#2:270\n154#2:271\n154#2:301\n78#3,2:272\n80#3:300\n84#3:306\n75#4:274\n76#4,11:276\n89#4:305\n76#5:275\n460#6,13:287\n473#6,3:302\n*S KotlinDebug\n*F\n+ 1 BannerComponent.kt\ncom/carrefour/fid/android/design/components/compose/ComposableSingletons$BannerComponentKt$lambda-2$1\n*L\n195#1:270\n196#1:271\n202#1:301\n193#1:272,2\n193#1:300\n193#1:306\n193#1:274\n193#1:276,11\n193#1:305\n193#1:275\n193#1:287,13\n193#1:302,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.design.components.compose.ComposableSingletons$BannerComponentKt$lambda-2$1  reason: invalid class name */
public final class ComposableSingletons$BannerComponentKt$lambda2$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {

    /* renamed from: f */
    public static final ComposableSingletons$BannerComponentKt$lambda2$1 f92154f = new ComposableSingletons$BannerComponentKt$lambda2$1();

    public ComposableSingletons$BannerComponentKt$lambda2$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-2099050887, i2, -1, "com.carrefour.fid.android.design.components.compose.ComposableSingletons$BannerComponentKt.lambda-2.<anonymous> (BannerComponent.kt:191)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m d = BackgroundKt.m8825d(PaddingKt.m10024k(SizeKt.m10089E(aVar, C16483g.m74435M((float) 350), C16483g.m74435M((float) 210)), C16483g.m74435M((float) 15)), C15240j2.f37547b.mo42852w(), (C15218g4) null, 2, (Object) null);
            C8734c.C8736b m = C8734c.f23406a.mo17068m();
            Arrangement.C2271e f = Arrangement.f6010a.mo7625f();
            oVar.mo14918M(-483455358);
            C15560f0 b = ColumnKt.m9863b(f, m, oVar, 54);
            oVar.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(d);
            if (!(oVar.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            oVar.mo14938T();
            if (oVar.mo14997l()) {
                oVar.mo14947W(a);
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
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar, 0);
            oVar.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            BannerComponentKt.m151326b(SizeKt.m10092H(aVar, C16483g.m74435M((float) 250)), "Title", "Description", (String) null, C36896b.C36904h.ds_ic_card_fid_and_pass, (C36989i) null, C16009b.m71825a(C36896b.C36902f.ds_grey_blue, oVar, 0), 0.0f, ComposableSingletons$BannerComponentKt$lambda2$1$1$1.f92155f, oVar, 100663734, C12590b.f30836K);
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
