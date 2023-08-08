package com.carrefour.fid.android.design.components.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.profileinstaller.C20022q;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.theme.C37474a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nBannerComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannerComponent.kt\ncom/carrefour/fid/android/design/components/compose/BannerComponentKt$BannerSmall$2\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,269:1\n79#2,2:270\n81#2:298\n85#2:341\n75#3:272\n76#3,11:274\n75#3:305\n76#3,11:307\n89#3:335\n89#3:340\n76#4:273\n76#4:306\n460#5,13:285\n460#5,13:318\n473#5,3:332\n473#5,3:337\n74#6,6:299\n80#6:331\n84#6:336\n*S KotlinDebug\n*F\n+ 1 BannerComponent.kt\ncom/carrefour/fid/android/design/components/compose/BannerComponentKt$BannerSmall$2\n*L\n155#1:270,2\n155#1:298\n155#1:341\n155#1:272\n155#1:274,11\n163#1:305\n163#1:307,11\n163#1:335\n155#1:340\n155#1:273\n163#1:306\n155#1:285,13\n163#1:318,13\n163#1:332,3\n155#1:337,3\n163#1:299,6\n163#1:331\n163#1:336\n*E\n"})
public final class BannerComponentKt$BannerSmall$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ String $drawableDescription;
    final /* synthetic */ int $drawableId;
    final /* synthetic */ float $imageSize;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $subTitle;
    final /* synthetic */ String $title;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BannerComponentKt$BannerSmall$2(long j, float f, int i, int i2, String str, String str2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        super(2);
        this.$backgroundColor = j;
        this.$imageSize = f;
        this.$drawableId = i;
        this.$$dirty = i2;
        this.$drawableDescription = str;
        this.$title = str2;
        this.$subTitle = pVar;
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
                ComposerKt.m29845w0(-1009942564, i2, -1, "com.carrefour.fid.android.design.components.compose.BannerSmall.<anonymous> (BannerComponent.kt:153)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m d = BackgroundKt.m8825d(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), this.$backgroundColor, (C15218g4) null, 2, (Object) null);
            C37474a aVar2 = C37474a.f94133a;
            C8767m m = PaddingKt.m10026m(d, aVar2.mo114202y(), 0.0f, 2, (Object) null);
            C8734c.C8735a aVar3 = C8734c.f23406a;
            C8734c.C8737c q = aVar3.mo17070q();
            Arrangement arrangement = Arrangement.f6010a;
            Arrangement.C2271e l = arrangement.mo7628l();
            float f = this.$imageSize;
            int i3 = this.$drawableId;
            int i4 = this.$$dirty;
            String str = this.$drawableDescription;
            String str2 = this.$title;
            C11304p<C8592o, Integer, C11079d2> pVar = this.$subTitle;
            oVar2.mo14918M(693286680);
            C15560f0 d2 = RowKt.m10071d(l, q, oVar2, 54);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(m);
            C11304p<C8592o, Integer, C11079d2> pVar2 = pVar;
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
            Updater.m30188j(b, d2, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            oVar.mo14972e();
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            C11304p<C8592o, Integer, C11079d2> pVar3 = pVar2;
            String str3 = str2;
            String str4 = str;
            int i5 = i4;
            C8767m e = C2411u0.m10660e(RowScopeInstance.f6147a, aVar, 1.0f, false, 2, (Object) null);
            oVar2.mo14918M(-483455358);
            C15560f0 b2 = ColumnKt.m9863b(arrangement.mo7631r(), aVar3.mo17072u(), oVar2, 0);
            oVar2.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(e);
            if (!(oVar.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            oVar.mo14938T();
            if (oVar.mo14997l()) {
                oVar2.mo14947W(a2);
            } else {
                oVar.mo14888A();
            }
            oVar.mo14941U();
            C8592o b3 = Updater.m30180b(oVar);
            Updater.m30188j(b3, b2, companion.mo44588d());
            Updater.m30188j(b3, dVar2, companion.mo44586b());
            Updater.m30188j(b3, layoutDirection2, companion.mo44587c());
            Updater.m30188j(b3, c4Var2, companion.mo44590f());
            oVar.mo14972e();
            f3.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            long a3 = C16009b.m71825a(C36896b.C36902f.ds_grey_5, oVar2, 0);
            C16361p0 k = C7933t0.f19075a.mo11077c(oVar2, C7933t0.f19076b).mo11098k();
            C8767m.C8768a aVar4 = aVar;
            String str5 = str3;
            TextKt.m14196c(str5, (C8767m) null, a3, 0, (C16190e0) null, C16209i0.f40292b.mo46947c(), (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, k, oVar, ((i5 >> 3) & 14) | C20022q.C20025c.f51280k, 0, 65498);
            C8592o oVar3 = oVar;
            C2428y0.m10726a(SizeKt.m10115o(aVar4, aVar2.mo114175A()), oVar3, 0);
            pVar3.invoke(oVar3, Integer.valueOf((i5 >> 6) & 14));
            oVar.mo15002m0();
            oVar.mo14896D();
            oVar.mo15002m0();
            oVar.mo15002m0();
            C8767m C = SizeKt.m10087C(aVar4, f);
            int i6 = i5 >> 9;
            String str6 = str4;
            C8592o oVar4 = oVar;
            ImageKt.m8967b(C16015f.m71849d(i3, oVar3, i6 & 14), str6, C, (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, oVar4, (i6 & 112) | 8, 120);
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
