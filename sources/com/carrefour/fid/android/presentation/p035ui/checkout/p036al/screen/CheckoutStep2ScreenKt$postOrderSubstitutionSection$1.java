package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.C2455e;
import androidx.compose.material.C3027a1;
import androidx.compose.material.C7933t0;
import androidx.compose.material.RadioButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
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
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.presentation.p035ui.checkout.common.BlockDividerKt;
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

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/foundation/lazy/e;", "Lkotlin/d2;", "invoke", "(Landroidx/compose/foundation/lazy/e;Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCheckoutStep2Screen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStep2Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/screen/CheckoutStep2ScreenKt$postOrderSubstitutionSection$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,739:1\n74#2,6:740\n80#2:772\n84#2:819\n75#3:746\n76#3,11:748\n75#3:782\n76#3,11:784\n89#3:813\n89#3:818\n76#4:747\n76#4:783\n460#5,13:759\n460#5,13:795\n473#5,3:810\n473#5,3:815\n154#6:773\n154#6:774\n154#6:809\n74#7,7:775\n81#7:808\n85#7:814\n*S KotlinDebug\n*F\n+ 1 CheckoutStep2Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/screen/CheckoutStep2ScreenKt$postOrderSubstitutionSection$1\n*L\n439#1:740,6\n439#1:772\n439#1:819\n439#1:746\n439#1:748,11\n457#1:782\n457#1:784,11\n457#1:813\n439#1:818\n439#1:747\n457#1:783\n439#1:759,13\n457#1:795,13\n457#1:810,3\n439#1:815,3\n444#1:773\n452#1:774\n465#1:809\n457#1:775,7\n457#1:808\n457#1:814\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep2ScreenKt$postOrderSubstitutionSection$1 */
public final class CheckoutStep2ScreenKt$postOrderSubstitutionSection$1 extends Lambda implements C11305q<C2455e, C8592o, Integer, C11079d2> {
    final /* synthetic */ boolean $isPostOrderSubstitution;
    final /* synthetic */ C11289a<C11079d2> $onDisablePostOrder;
    final /* synthetic */ C11289a<C11079d2> $onEnablePostOrder;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep2ScreenKt$postOrderSubstitutionSection$1(boolean z, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2) {
        super(3);
        this.$isPostOrderSubstitution = z;
        this.$onEnablePostOrder = aVar;
        this.$onDisablePostOrder = aVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2455e) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2455e eVar, @C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        int i2 = i;
        Intrinsics.checkNotNullParameter(eVar, "$this$item");
        if ((i2 & 81) != 16 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(262674910, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.screen.postOrderSubstitutionSection.<anonymous> (CheckoutStep2Screen.kt:435)");
            }
            BlockDividerKt.m104587a(oVar2, 0);
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m n = SizeKt.m10114n(aVar, 0.0f, 1, (Object) null);
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C8734c.C8736b m = aVar2.mo17068m();
            boolean z = this.$isPostOrderSubstitution;
            C11289a<C11079d2> aVar3 = this.$onEnablePostOrder;
            C11289a<C11079d2> aVar4 = this.$onDisablePostOrder;
            oVar2.mo14918M(-483455358);
            Arrangement arrangement = Arrangement.f6010a;
            C15560f0 b = ColumnKt.m9863b(arrangement.mo7631r(), m, oVar2, 48);
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
            C8592o b2 = Updater.m30180b(oVar);
            Updater.m30188j(b2, b, companion.mo44588d());
            Updater.m30188j(b2, dVar, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection, companion.mo44587c());
            Updater.m30188j(b2, c4Var, companion.mo44590f());
            oVar.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            float f2 = (float) 16;
            C11289a<C11079d2> aVar5 = aVar4;
            C11289a<C11079d2> aVar6 = aVar3;
            boolean z2 = z;
            float f3 = f2;
            ImageKt.m8967b(C16015f.m71849d(R.drawable.ic_substit_product_woman, oVar2, 0), (String) null, PaddingKt.m10028o(aVar, 0.0f, C16483g.m74435M(f2), 0.0f, 0.0f, 13, (Object) null), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, oVar, 440, 120);
            C8767m.C8768a aVar7 = aVar;
            TextKt.m14196c(C16018i.m71858d(R.string.order_post_substitution_description, oVar2, 0), PaddingKt.m10024k(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), C16483g.m74435M(f3)), 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153890b(C7933t0.f19075a.mo11077c(oVar2, C7933t0.f19076b)), oVar, 48, 0, 65532);
            C8734c.C8737c q = aVar2.mo17070q();
            C8592o oVar3 = oVar;
            oVar3.mo14918M(693286680);
            C15560f0 d = RowKt.m10071d(arrangement.mo7630p(), q, oVar3, 48);
            oVar3.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) oVar3.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) oVar3.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) oVar3.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f4 = LayoutKt.m68908f(aVar7);
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
            C8592o b3 = Updater.m30180b(oVar);
            Updater.m30188j(b3, d, companion.mo44588d());
            Updater.m30188j(b3, dVar2, companion.mo44586b());
            Updater.m30188j(b3, layoutDirection2, companion.mo44587c());
            Updater.m30188j(b3, c4Var2, companion.mo44590f());
            oVar.mo14972e();
            f4.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar3, 0);
            oVar3.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            RadioButtonKt.m13736a(z2, aVar6, (C8767m) null, false, (C2243g) null, (C3027a1) null, oVar, 0, 60);
            TextKt.m14196c(C16018i.m71858d(R.string.yes, oVar3, 0), ClickableKt.m8878e(aVar7, false, (String) null, (C16031g) null, aVar6, 7, (Object) null), 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar, 0, 0, 131068);
            C8767m.C8768a aVar8 = aVar7;
            C8592o oVar4 = oVar;
            C2428y0.m10726a(SizeKt.m10092H(aVar8, C16483g.m74435M(f3)), oVar4, 6);
            RadioButtonKt.m13736a(!z2, aVar5, (C8767m) null, false, (C2243g) null, (C3027a1) null, oVar, 0, 60);
            TextKt.m14196c(C16018i.m71858d(R.string.no, oVar4, 0), ClickableKt.m8878e(aVar8, false, (String) null, (C16031g) null, aVar5, 7, (Object) null), 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar, 0, 0, 131068);
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
}
