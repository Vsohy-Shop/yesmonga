package com.carrefour.fid.android.presentation.p035ui.splash;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.BottomSheetState;
import androidx.compose.material.C7933t0;
import androidx.compose.material.DividerKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8744d;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.res.C16018i;
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
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nBottomSheetLoyaltyComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetLoyaltyComponent.kt\ncom/carrefour/fid/android/presentation/ui/splash/BottomSheetLoyaltyComponentKt$BottomSheetLoyaltyComponent$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,346:1\n78#2,2:347\n80#2:375\n78#2,2:450\n80#2:478\n84#2:484\n84#2:494\n75#3:349\n76#3,11:351\n75#3:382\n76#3,11:384\n89#3:413\n75#3:422\n76#3,11:424\n75#3:452\n76#3,11:454\n89#3:483\n89#3:488\n89#3:493\n76#4:350\n76#4:383\n76#4:423\n76#4:453\n460#5,13:362\n460#5,13:395\n473#5,3:410\n460#5,13:435\n460#5,13:465\n473#5,3:480\n473#5,3:485\n473#5,3:490\n154#6:376\n154#6:377\n154#6:378\n154#6:379\n154#6:409\n154#6:449\n154#6:479\n79#7,2:380\n81#7:408\n85#7:414\n66#8,7:415\n73#8:448\n77#8:489\n*S KotlinDebug\n*F\n+ 1 BottomSheetLoyaltyComponent.kt\ncom/carrefour/fid/android/presentation/ui/splash/BottomSheetLoyaltyComponentKt$BottomSheetLoyaltyComponent$1\n*L\n96#1:347,2\n96#1:375\n142#1:450,2\n142#1:478\n142#1:484\n96#1:494\n96#1:349\n96#1:351,11\n114#1:382\n114#1:384,11\n114#1:413\n136#1:422\n136#1:424,11\n142#1:452\n142#1:454,11\n142#1:483\n136#1:488\n96#1:493\n96#1:350\n114#1:383\n136#1:423\n142#1:453\n96#1:362,13\n114#1:395,13\n114#1:410,3\n136#1:435,13\n142#1:465,13\n142#1:480,3\n136#1:485,3\n96#1:490,3\n107#1:376\n108#1:377\n109#1:378\n115#1:379\n132#1:409\n145#1:449\n156#1:479\n114#1:380,2\n114#1:408\n114#1:414\n136#1:415,7\n136#1:448\n136#1:489\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.splash.BottomSheetLoyaltyComponentKt$BottomSheetLoyaltyComponent$1 */
public final class BottomSheetLoyaltyComponentKt$BottomSheetLoyaltyComponent$1 extends Lambda implements C11305q<C2373k, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ BottomSheetState $bottomSheetState;
    final /* synthetic */ String $cardNumber;
    final /* synthetic */ C12074o0 $coroutineScope;
    final /* synthetic */ String $customerName;
    final /* synthetic */ boolean $isPassCard;
    final /* synthetic */ float $maxHeight;
    final /* synthetic */ String $titleCardType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetLoyaltyComponentKt$BottomSheetLoyaltyComponent$1(float f, BottomSheetState bottomSheetState, C12074o0 o0Var, String str, String str2, String str3, boolean z, int i) {
        super(3);
        this.$maxHeight = f;
        this.$bottomSheetState = bottomSheetState;
        this.$coroutineScope = o0Var;
        this.$titleCardType = str;
        this.$cardNumber = str2;
        this.$customerName = str3;
        this.$isPassCard = z;
        this.$$dirty = i;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo74696a(@C12579k C2373k kVar, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        C8592o oVar2 = oVar;
        int i4 = i;
        Intrinsics.checkNotNullParameter(kVar, "$this$BottomSheetScaffold");
        if ((i4 & 81) != 16 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1174398186, i4, -1, "com.carrefour.fid.android.presentation.ui.splash.BottomSheetLoyaltyComponent.<anonymous> (BottomSheetLoyaltyComponent.kt:94)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m o = SizeKt.m10115o(aVar, this.$maxHeight);
            C37475b bVar = C37475b.f94185a;
            C8767m d = BackgroundKt.m8825d(o, bVar.mo114238f(), (C15218g4) null, 2, (Object) null);
            final BottomSheetState bottomSheetState = this.$bottomSheetState;
            final C12074o0 o0Var = this.$coroutineScope;
            C8767m e = ClickableKt.m8878e(d, false, (String) null, (C16031g) null, new C11289a<C11079d2>() {
                public final void invoke() {
                    BottomSheetLoyaltyComponentKt.m110432m(bottomSheetState, o0Var);
                }
            }, 7, (Object) null);
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C8734c.C8736b m = aVar2.mo17068m();
            Arrangement arrangement = Arrangement.f6010a;
            Arrangement.C2279l r = arrangement.mo7631r();
            BottomSheetState bottomSheetState2 = this.$bottomSheetState;
            String str = this.$titleCardType;
            String str2 = this.$cardNumber;
            String str3 = this.$customerName;
            boolean z = this.$isPassCard;
            int i5 = this.$$dirty;
            oVar2.mo14918M(-483455358);
            C15560f0 b = ColumnKt.m9863b(r, m, oVar2, 54);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(e);
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
            float f2 = (float) 8;
            int i6 = i5;
            boolean z2 = z;
            String str4 = str3;
            String str5 = str2;
            float f3 = f2;
            DividerKt.m13428a(C8744d.m32514a(SizeKt.m10092H(SizeKt.m10115o(PaddingKt.m10028o(aVar, 0.0f, C16483g.m74435M(f2), 0.0f, 0.0f, 13, (Object) null), C16483g.m74435M((float) 5)), C16483g.m74435M((float) 55)), C2694o.m12161c(50)), bVar.mo114237e(), 0.0f, 0.0f, oVar, 0, 12);
            C8767m o2 = PaddingKt.m10028o(aVar, 0.0f, C16483g.m74435M((float) 26), 0.0f, C16483g.m74435M((float) 32), 5, (Object) null);
            Arrangement.C2271e f4 = arrangement.mo7625f();
            C8734c.C8737c q = aVar2.mo17070q();
            oVar2.mo14918M(693286680);
            C15560f0 d2 = RowKt.m10071d(f4, q, oVar2, 54);
            oVar2.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f5 = LayoutKt.m68908f(o2);
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
            Updater.m30188j(b3, d2, companion.mo44588d());
            Updater.m30188j(b3, dVar2, companion.mo44586b());
            Updater.m30188j(b3, layoutDirection2, companion.mo44587c());
            Updater.m30188j(b3, c4Var2, companion.mo44590f());
            oVar.mo14972e();
            f5.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            Painter d3 = C16015f.m71849d(R.drawable.ds_ic_scan_2, oVar2, 0);
            C15240j2.C15241a aVar3 = C15240j2.f37547b;
            IconKt.m13539b(d3, C16018i.m71858d(R.string.splash_icon_scan_content_description, oVar2, 0), (C8767m) null, aVar3.mo42852w(), oVar, 3080, 4);
            if (bottomSheetState2.mo10070l()) {
                i2 = R.string.splash_card_fid_title_hide;
            } else {
                i2 = R.string.splash_card_fid_title_show;
            }
            String e2 = C16018i.m71859e(i2, new Object[]{str}, oVar2, 64);
            C7933t0 t0Var = C7933t0.f19075a;
            int i7 = C7933t0.f19076b;
            C16361p0 l = C37477d.m153900l(t0Var.mo11077c(oVar2, i7));
            int i8 = i7;
            C7933t0 t0Var2 = t0Var;
            C8592o oVar3 = oVar2;
            C8767m.C8768a aVar4 = aVar;
            TextKt.m14196c(e2, PaddingKt.m10028o(aVar, C16483g.m74435M((float) 9), 0.0f, 0.0f, 0.0f, 14, (Object) null), aVar3.mo42852w(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, l, oVar, 432, 0, 65528);
            oVar.mo15002m0();
            oVar.mo14896D();
            oVar.mo15002m0();
            oVar.mo15002m0();
            oVar3.mo14918M(733328855);
            C15560f0 k = BoxKt.m9849k(aVar2.mo17061C(), false, oVar3, 0);
            oVar3.mo14918M(-1323940314);
            C16479d dVar3 = (C16479d) oVar3.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection3 = (LayoutDirection) oVar3.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var3 = (C15863c4) oVar3.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a3 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f6 = LayoutKt.m68908f(aVar4);
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
            C8592o b4 = Updater.m30180b(oVar);
            Updater.m30188j(b4, k, companion.mo44588d());
            Updater.m30188j(b4, dVar3, companion.mo44586b());
            Updater.m30188j(b4, layoutDirection3, companion.mo44587c());
            Updater.m30188j(b4, c4Var3, companion.mo44590f());
            oVar.mo14972e();
            f6.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar3, 0);
            oVar3.mo14918M(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
            int i9 = i6 << 3;
            BottomSheetLoyaltyComponentKt.m110421b((C8767m) null, str5, str4, z2, oVar, (i9 & 896) | (i9 & 112) | ((i6 >> 3) & 7168), 1);
            C8767m.C8768a aVar5 = aVar4;
            C8767m n = SizeKt.m10114n(aVar5, 0.0f, 1, (Object) null);
            if (z2) {
                i3 = 360;
            } else {
                i3 = 320;
            }
            C8767m o3 = PaddingKt.m10028o(n, 0.0f, C16483g.m74435M((float) i3), 0.0f, 0.0f, 13, (Object) null);
            C8734c.C8736b m2 = aVar2.mo17068m();
            Arrangement.C2271e f7 = arrangement.mo7625f();
            oVar3.mo14918M(-483455358);
            C15560f0 b5 = ColumnKt.m9863b(f7, m2, oVar3, 54);
            oVar3.mo14918M(-1323940314);
            C16479d dVar4 = (C16479d) oVar3.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection4 = (LayoutDirection) oVar3.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var4 = (C15863c4) oVar3.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a4 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f8 = LayoutKt.m68908f(o3);
            if (!(oVar.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            oVar.mo14938T();
            if (oVar.mo14997l()) {
                oVar3.mo14947W(a4);
            } else {
                oVar.mo14888A();
            }
            oVar.mo14941U();
            C8592o b6 = Updater.m30180b(oVar);
            Updater.m30188j(b6, b5, companion.mo44588d());
            Updater.m30188j(b6, dVar4, companion.mo44586b());
            Updater.m30188j(b6, layoutDirection4, companion.mo44587c());
            Updater.m30188j(b6, c4Var4, companion.mo44590f());
            oVar.mo14972e();
            f8.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar3, 0);
            oVar3.mo14918M(2058660585);
            int i10 = i8;
            C7933t0 t0Var3 = t0Var2;
            C8592o oVar4 = oVar;
            TextKt.m14196c(C16018i.m71858d(R.string.splash_card_fid_scan_title, oVar3, 0), (C8767m) null, aVar3.mo42852w(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, t0Var3.mo11077c(oVar3, i10).mo11096i(), oVar4, C22132b.f56831b, 0, 65530);
            TextKt.m14196c(C16018i.m71858d(R.string.splash_card_fid_scan_sub_title, oVar3, 0), PaddingKt.m10028o(aVar5, 0.0f, C16483g.m74435M(f3), 0.0f, 0.0f, 13, (Object) null), aVar3.mo42852w(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, t0Var3.mo11077c(oVar3, i10).mo11098k(), oVar4, 432, 0, 65528);
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
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo74696a((C2373k) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
