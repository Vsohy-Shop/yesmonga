package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.C2250j;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.C2365i;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15258l2;
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
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.theme.C37475b;
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
@C11363r0({"SMAP\nCheckoutStep3Screen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStep3Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/screen/CheckoutStep3ScreenKt$PaymentTypeComponent$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,650:1\n154#2:651\n154#2:652\n154#2:692\n154#2:731\n67#3,6:653\n73#3:685\n77#3:690\n68#3,5:693\n73#3:724\n77#3:729\n68#3,5:732\n73#3:763\n77#3:768\n75#4:659\n76#4,11:661\n89#4:689\n75#4:698\n76#4,11:700\n89#4:728\n75#4:737\n76#4,11:739\n89#4:767\n76#5:660\n76#5:699\n76#5:738\n460#6,13:672\n473#6,3:686\n460#6,13:711\n473#6,3:725\n460#6,13:750\n473#6,3:764\n75#7:691\n75#7:730\n*S KotlinDebug\n*F\n+ 1 CheckoutStep3Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/screen/CheckoutStep3ScreenKt$PaymentTypeComponent$1$1\n*L\n474#1:651\n476#1:652\n482#1:692\n498#1:731\n471#1:653,6\n471#1:685\n471#1:690\n479#1:693,5\n479#1:724\n479#1:729\n495#1:732,5\n495#1:763\n495#1:768\n471#1:659\n471#1:661,11\n471#1:689\n479#1:698\n479#1:700,11\n479#1:728\n495#1:737\n495#1:739,11\n495#1:767\n471#1:660\n479#1:699\n495#1:738\n471#1:672,13\n471#1:686,3\n479#1:711,13\n479#1:725,3\n495#1:750,13\n495#1:764,3\n481#1:691\n497#1:730\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$PaymentTypeComponent$1$1 */
public final class CheckoutStep3ScreenKt$PaymentTypeComponent$1$1 extends Lambda implements C11305q<C2365i, C8592o, Integer, C11079d2> {
    final /* synthetic */ boolean $isOnline;
    final /* synthetic */ C11289a<C11079d2> $onChoiceOnline;
    final /* synthetic */ C11289a<C11079d2> $onChoiceOnsite;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep3ScreenKt$PaymentTypeComponent$1$1(boolean z, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2) {
        super(3);
        this.$isOnline = z;
        this.$onChoiceOnline = aVar;
        this.$onChoiceOnsite = aVar2;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo68594a(@C12579k C2365i iVar, @C12580l C8592o oVar, int i) {
        int i2;
        long j;
        long j2;
        C16209i0 i0Var;
        long j3;
        long j4;
        C16209i0 i0Var2;
        int i3;
        C2365i iVar2 = iVar;
        C8592o oVar2 = oVar;
        int i4 = i;
        Intrinsics.checkNotNullParameter(iVar2, "$this$BoxWithConstraints");
        if ((i4 & 14) == 0) {
            if (oVar2.mo15006n0(iVar2)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i4;
        } else {
            i2 = i4;
        }
        if ((i2 & 91) != 18 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-48836054, i4, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.screen.PaymentTypeComponent.<anonymous>.<anonymous> (CheckoutStep3Screen.kt:468)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            float f = (float) 50;
            C8767m o = SizeKt.m10115o(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), C16483g.m74435M(f));
            C15240j2.C15241a aVar2 = C15240j2.f37547b;
            C8767m f2 = BorderKt.m8850f(BackgroundKt.m8825d(o, aVar2.mo42852w(), (C15218g4) null, 2, (Object) null), C2250j.m9695a(C16483g.m74435M((float) 1), C15258l2.m66179d(4291480783L)), C2694o.m12166h(C16483g.m74435M((float) 5)));
            oVar2.mo14918M(733328855);
            C8734c.C8735a aVar3 = C8734c.f23406a;
            C15560f0 k = BoxKt.m9849k(aVar3.mo17061C(), false, oVar2, 0);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(f2);
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
            f3.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
            oVar.mo15002m0();
            oVar.mo14896D();
            oVar.mo15002m0();
            oVar.mo15002m0();
            float f4 = (float) 2;
            C8767m c = iVar2.mo7701c(SizeKt.m10115o(SizeKt.m10092H(aVar, C16483g.m74435M(iVar.mo8085a() / f4)), C16483g.m74435M(f)), aVar3.mo17069o());
            if (this.$isOnline) {
                j = C37475b.f94185a.mo114218O();
            } else {
                j = aVar2.mo42850s();
            }
            C8767m e = ClickableKt.m8878e(BackgroundKt.m8825d(c, j, (C15218g4) null, 2, (Object) null), false, (String) null, (C16031g) null, this.$onChoiceOnline, 7, (Object) null);
            C8734c i5 = aVar3.mo17066i();
            boolean z = this.$isOnline;
            oVar2.mo14918M(733328855);
            C15560f0 k2 = BoxKt.m9849k(i5, false, oVar2, 6);
            oVar2.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f5 = LayoutKt.m68908f(e);
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
            C8592o b2 = Updater.m30180b(oVar);
            Updater.m30188j(b2, k2, companion.mo44588d());
            Updater.m30188j(b2, dVar2, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection2, companion.mo44587c());
            Updater.m30188j(b2, c4Var2, companion.mo44590f());
            oVar.mo14972e();
            f5.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            String d = C16018i.m71858d(R.string.checkout_payment_online, oVar2, 0);
            if (z) {
                j2 = aVar2.mo42852w();
            } else {
                j2 = C37475b.f94185a.mo114258z();
            }
            long j5 = j2;
            C16209i0.C16210a aVar4 = C16209i0.f40292b;
            if (z) {
                i0Var = aVar4.mo46947c();
            } else {
                i0Var = aVar4.mo46952m();
            }
            TextKt.m14196c(d, (C8767m) null, j5, C16506u.m74712m(14), (C16190e0) null, i0Var, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar, 3072, 0, 131026);
            oVar.mo15002m0();
            oVar.mo14896D();
            oVar.mo15002m0();
            oVar.mo15002m0();
            C8767m.C8768a aVar5 = aVar;
            C8767m c2 = iVar2.mo7701c(SizeKt.m10115o(SizeKt.m10092H(aVar5, C16483g.m74435M(iVar.mo8085a() / f4)), C16483g.m74435M(f)), aVar3.mo17067k());
            if (this.$isOnline) {
                j3 = aVar2.mo42850s();
            } else {
                j3 = C37475b.f94185a.mo114218O();
            }
            C8767m e2 = ClickableKt.m8878e(BackgroundKt.m8825d(c2, j3, (C15218g4) null, 2, (Object) null), false, (String) null, (C16031g) null, this.$onChoiceOnsite, 7, (Object) null);
            C8734c i6 = aVar3.mo17066i();
            boolean z2 = this.$isOnline;
            C8592o oVar3 = oVar;
            oVar3.mo14918M(733328855);
            C15560f0 k3 = BoxKt.m9849k(i6, false, oVar3, 6);
            oVar3.mo14918M(-1323940314);
            C16479d dVar3 = (C16479d) oVar3.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection3 = (LayoutDirection) oVar3.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var3 = (C15863c4) oVar3.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a3 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f6 = LayoutKt.m68908f(e2);
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
            f6.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar3, 0);
            oVar3.mo14918M(2058660585);
            String d2 = C16018i.m71858d(R.string.checkout_payment_on_site, oVar3, 0);
            if (z2) {
                j4 = C37475b.f94185a.mo114258z();
            } else {
                j4 = aVar2.mo42852w();
            }
            long j6 = j4;
            C16209i0.C16210a aVar6 = C16209i0.f40292b;
            if (z2) {
                i0Var2 = aVar6.mo46952m();
            } else {
                i0Var2 = aVar6.mo46947c();
            }
            TextKt.m14196c(d2, (C8767m) null, j6, C16506u.m74712m(14), (C16190e0) null, i0Var2, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar, 3072, 0, 131026);
            oVar.mo15002m0();
            oVar.mo14896D();
            oVar.mo15002m0();
            oVar.mo15002m0();
            C8592o oVar4 = oVar;
            ImageKt.m8967b(C16015f.m71849d(R.drawable.ic_switch, oVar4, 0), (String) null, iVar2.mo7701c(aVar5, aVar3.mo17066i()), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, oVar4, 56, 120);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo68594a((C2365i) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
