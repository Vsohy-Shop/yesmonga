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
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
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
import com.carrefour.fid.android.design.theme.C37474a;
import com.carrefour.fid.android.design.theme.C37477d;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nBannerComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannerComponent.kt\ncom/carrefour/fid/android/design/components/compose/BannerComponentKt$BannerMedium$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,269:1\n36#2:270\n460#2,13:293\n460#2,13:326\n473#2,3:340\n473#2,3:346\n1114#3,6:271\n154#4:277\n154#4:345\n79#5,2:278\n81#5:306\n85#5:350\n75#6:280\n76#6,11:282\n75#6:313\n76#6,11:315\n89#6:343\n89#6:349\n76#7:281\n76#7:314\n74#8,6:307\n80#8:339\n84#8:344\n*S KotlinDebug\n*F\n+ 1 BannerComponent.kt\ncom/carrefour/fid/android/design/components/compose/BannerComponentKt$BannerMedium$2\n*L\n70#1:270\n78#1:293,13\n88#1:326,13\n88#1:340,3\n78#1:346,3\n70#1:271,6\n83#1:277\n111#1:345\n78#1:278,2\n78#1:306\n78#1:350\n78#1:280\n78#1:282,11\n88#1:313\n88#1:315,11\n88#1:343\n78#1:349\n78#1:281\n88#1:314\n88#1:307,6\n88#1:339\n88#1:344\n*E\n"})
public final class BannerComponentKt$BannerMedium$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ String $bannerContentDescription;
    final /* synthetic */ String $description;
    final /* synthetic */ int $drawableId;
    final /* synthetic */ C36989i $imageFormat;
    final /* synthetic */ Ref.ObjectRef<C8767m> $modifier;
    final /* synthetic */ String $title;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BannerComponentKt$BannerMedium$2(String str, Ref.ObjectRef<C8767m> objectRef, int i, long j, C36989i iVar, int i2, String str2, String str3) {
        super(2);
        this.$bannerContentDescription = str;
        this.$modifier = objectRef;
        this.$$dirty = i;
        this.$backgroundColor = j;
        this.$imageFormat = iVar;
        this.$drawableId = i2;
        this.$title = str2;
        this.$description = str3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        float f;
        C8767m.C8768a aVar;
        C8767m C;
        C8592o oVar2 = oVar;
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1286519874, i2, -1, "com.carrefour.fid.android.design.components.compose.BannerMedium.<anonymous> (BannerComponent.kt:66)");
            }
            oVar2.mo14918M(548884960);
            String str = this.$bannerContentDescription;
            if (!(str == null || C11622t.isBlank(str))) {
                C8767m mVar = (C8767m) this.$modifier.element;
                C8767m.C8768a aVar2 = C8767m.f23478j;
                String str2 = this.$bannerContentDescription;
                oVar2.mo14918M(1157296644);
                boolean n0 = oVar2.mo15006n0(str2);
                Object N = oVar.mo14921N();
                if (n0 || N == C8592o.f23032a.mo16277a()) {
                    N = new BannerComponentKt$BannerMedium$2$1$1(str2);
                    oVar2.mo14893C(N);
                }
                oVar.mo15002m0();
                mVar.mo17224k3(SemanticsModifierKt.m71866a(aVar2, (C11300l) N));
            }
            oVar.mo15002m0();
            C8767m.C8768a aVar3 = C8767m.f23478j;
            C8767m d = BackgroundKt.m8825d(aVar3, this.$backgroundColor, (C15218g4) null, 2, (Object) null);
            C37474a aVar4 = C37474a.f94133a;
            float y = aVar4.mo114202y();
            C36989i iVar = this.$imageFormat;
            C36987g gVar = C36987g.f92392a;
            if (Intrinsics.areEqual((Object) iVar, (Object) gVar)) {
                f = aVar4.mo114201x();
            } else {
                f = C16483g.m74435M((float) 30);
            }
            C8767m o = PaddingKt.m10028o(d, y, 0.0f, f, 0.0f, 10, (Object) null);
            C8734c.C8735a aVar5 = C8734c.f23406a;
            C8734c.C8737c q = aVar5.mo17070q();
            Arrangement arrangement = Arrangement.f6010a;
            Arrangement.C2271e l = arrangement.mo7628l();
            C36989i iVar2 = this.$imageFormat;
            int i3 = this.$drawableId;
            int i4 = this.$$dirty;
            String str3 = this.$title;
            String str4 = this.$description;
            oVar2.mo14918M(693286680);
            C15560f0 d2 = RowKt.m10071d(l, q, oVar2, 54);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(o);
            String str5 = str4;
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
            String str6 = str5;
            String str7 = str3;
            int i5 = i4;
            int i6 = i3;
            C8767m o2 = PaddingKt.m10028o(C2411u0.m10660e(RowScopeInstance.f6147a, aVar3, 1.0f, false, 2, (Object) null), 0.0f, 0.0f, Intrinsics.areEqual((Object) iVar2, (Object) gVar) ? aVar4.mo114201x() : aVar4.mo114200w(), 0.0f, 11, (Object) null);
            oVar2.mo14918M(-483455358);
            C15560f0 b2 = ColumnKt.m9863b(arrangement.mo7631r(), aVar5.mo17072u(), oVar2, 0);
            oVar2.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(o2);
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
            long a3 = C16009b.m71825a(C36896b.C36902f.ds_main_primary, oVar2, 0);
            C36987g gVar2 = gVar;
            C8767m.C8768a aVar6 = aVar3;
            int i7 = i6;
            C7933t0 t0Var = C7933t0.f19075a;
            int i8 = C7933t0.f19076b;
            C36989i iVar3 = iVar2;
            C7933t0 t0Var2 = t0Var;
            int i9 = i8;
            C8592o oVar3 = oVar2;
            TextKt.m14196c(str7, (C8767m) null, a3, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, t0Var.mo11077c(oVar2, i8).mo11098k(), oVar, (i5 >> 3) & 14, 0, 65530);
            oVar3.mo14918M(906519896);
            if (!(str6 == null || C11622t.isBlank(str6))) {
                C8767m.C8768a aVar7 = aVar6;
                C2428y0.m10726a(SizeKt.m10115o(aVar7, aVar4.mo114175A()), oVar3, 0);
                aVar = aVar7;
                TextKt.m14196c(str6, (C8767m) null, C16009b.m71825a(C36896b.C36902f.ds_grey_10, oVar3, 0), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153892d(t0Var2.mo11077c(oVar3, i9)), oVar, (i5 >> 6) & 14, 0, 65530);
            } else {
                aVar = aVar6;
            }
            oVar.mo15002m0();
            oVar.mo15002m0();
            oVar.mo14896D();
            oVar.mo15002m0();
            oVar.mo15002m0();
            C36989i iVar4 = iVar3;
            if (Intrinsics.areEqual((Object) iVar4, (Object) gVar2)) {
                C = SizeKt.m10110j(SizeKt.m10092H(aVar, C16483g.m74435M((float) 164)), 0.0f, 1, (Object) null);
            } else if (iVar4 instanceof C36994k) {
                C = SizeKt.m10087C(aVar, ((C36994k) iVar4).mo112430d());
            } else {
                throw new NoWhenBranchMatchedException();
            }
            ImageKt.m8967b(C16015f.m71849d(i7, oVar, (i5 >> 12) & 14), (String) null, C, (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, oVar, 56, 120);
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
