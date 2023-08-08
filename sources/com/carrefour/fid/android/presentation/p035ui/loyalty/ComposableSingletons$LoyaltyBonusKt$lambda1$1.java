package com.carrefour.fid.android.presentation.p035ui.loyalty;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.IconKt;
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
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nLoyaltyBonus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoyaltyBonus.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/ComposableSingletons$LoyaltyBonusKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,404:1\n154#2:405\n154#2:438\n154#2:477\n154#2:478\n154#2:479\n154#2:480\n76#3,5:406\n81#3:437\n85#3:485\n75#4:411\n76#4,11:413\n75#4:445\n76#4,11:447\n89#4:475\n89#4:484\n76#5:412\n76#5:446\n460#6,13:424\n460#6,13:458\n473#6,3:472\n473#6,3:481\n74#7,6:439\n80#7:471\n84#7:476\n*S KotlinDebug\n*F\n+ 1 LoyaltyBonus.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/ComposableSingletons$LoyaltyBonusKt$lambda-1$1\n*L\n131#1:405\n145#1:438\n163#1:477\n169#1:478\n177#1:479\n179#1:480\n129#1:406,5\n129#1:437\n129#1:485\n129#1:411\n129#1:413,11\n142#1:445\n142#1:447,11\n142#1:475\n129#1:484\n129#1:412\n142#1:446\n129#1:424,13\n142#1:458,13\n142#1:472,3\n129#1:481,3\n142#1:439,6\n142#1:471\n142#1:476\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.ComposableSingletons$LoyaltyBonusKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$LoyaltyBonusKt$lambda1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {

    /* renamed from: f */
    public static final ComposableSingletons$LoyaltyBonusKt$lambda1$1 f60570f = new ComposableSingletons$LoyaltyBonusKt$lambda1$1();

    public ComposableSingletons$LoyaltyBonusKt$lambda1$1() {
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
                ComposerKt.m29845w0(321657560, i2, -1, "com.carrefour.fid.android.presentation.ui.loyalty.ComposableSingletons$LoyaltyBonusKt.lambda-1.<anonymous> (LoyaltyBonus.kt:127)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m n = SizeKt.m10114n(PaddingKt.m10024k(aVar, C16483g.m74435M((float) 8)), 0.0f, 1, (Object) null);
            Arrangement arrangement = Arrangement.f6010a;
            Arrangement.C2271e n2 = arrangement.mo7629n();
            oVar2.mo14918M(693286680);
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C15560f0 d = RowKt.m10071d(n2, aVar2.mo17073w(), oVar2, 6);
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
            Updater.m30188j(b, d, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            oVar.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            RowScopeInstance rowScopeInstance2 = rowScopeInstance;
            ImageKt.m8967b(C16015f.m71849d(R.drawable.ic_loyalty_bonus, oVar2, 0), (String) null, rowScopeInstance.mo7845f(aVar, aVar2.mo17070q()), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, oVar, 56, 120);
            float f2 = (float) 16;
            C8767m m = PaddingKt.m10026m(rowScopeInstance2.mo7845f(aVar, aVar2.mo17070q()), C16483g.m74435M(f2), 0.0f, 2, (Object) null);
            oVar2.mo14918M(-483455358);
            C15560f0 b2 = ColumnKt.m9863b(arrangement.mo7631r(), aVar2.mo17072u(), oVar2, 0);
            oVar2.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(m);
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
            String d2 = C16018i.m71858d(R.string.loyalty_bonus_ten_percent_discount, oVar2, 0);
            C37475b bVar = C37475b.f94185a;
            C8592o oVar3 = oVar;
            TextKt.m14196c(d2, (C8767m) null, bVar.mo114220Q(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153887N().mo11096i(), oVar3, 0, 0, 65530);
            TextKt.m14196c(C16018i.m71858d(R.string.loyalty_bonus_all_days, oVar, 0), (C8767m) null, bVar.mo114220Q(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153887N().mo11098k(), oVar3, 0, 0, 65530);
            oVar.mo15002m0();
            oVar.mo14896D();
            oVar.mo15002m0();
            oVar.mo15002m0();
            C8767m.C8768a aVar3 = aVar;
            DividerKt.m13428a(SizeKt.m10092H(SizeKt.m10110j(aVar3, 0.0f, 1, (Object) null), C16483g.m74435M((float) 1)), bVar.mo114206C(), 0.0f, 0.0f, oVar, 6, 12);
            RowScopeInstance rowScopeInstance3 = rowScopeInstance2;
            TextKt.m14196c(C16018i.m71858d(R.string.loyalty_bonus_activate_my_primes, oVar, 0), PaddingKt.m10026m(rowScopeInstance3.mo7845f(aVar3, aVar2.mo17070q()), C16483g.m74435M(f2), 0.0f, 2, (Object) null), bVar.mo114218O(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153900l(C37477d.m153887N()), oVar3, 0, 0, 65528);
            RowScopeInstance rowScopeInstance4 = rowScopeInstance3;
            IconKt.m13539b(C16015f.m71849d(R.drawable.ic_right_arrow, oVar, 0), (String) null, SizeKt.m10092H(rowScopeInstance4.mo7845f(PaddingKt.m10028o(aVar3, 0.0f, 0.0f, C16483g.m74435M((float) 5), 0.0f, 11, (Object) null), aVar2.mo17070q()), C16483g.m74435M((float) 10)), bVar.mo114218O(), oVar, 56, 0);
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
