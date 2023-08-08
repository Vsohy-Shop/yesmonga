package com.carrefour.fid.android.presentation.p035ui.account.menu.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8744d;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
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
import com.carrefour.fid.android.design.components.compose.HeaderComponentKt;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.domain.models.accountmenu.C37950a;
import com.carrefour.fid.android.shared.extension.C28759i;
import com.carrefour.fid.android.shared.type.C28892e;
import com.carrefour.fid.android.shared.type.C28897f;
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
@C11363r0({"SMAP\nAccountMenuComponentStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountMenuComponentStateful.kt\ncom/carrefour/fid/android/presentation/ui/account/menu/compose/AccountMenuComponentStatefulKt$AccountMenuHeader$2\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,460:1\n66#2,7:461\n73#2:494\n77#2:501\n75#3:468\n76#3,11:470\n89#3:500\n76#4:469\n460#5,13:481\n473#5,3:497\n154#6:495\n154#6:496\n*S KotlinDebug\n*F\n+ 1 AccountMenuComponentStateful.kt\ncom/carrefour/fid/android/presentation/ui/account/menu/compose/AccountMenuComponentStatefulKt$AccountMenuHeader$2\n*L\n291#1:461,7\n291#1:494\n291#1:501\n291#1:468\n291#1:470,11\n291#1:500\n291#1:469\n291#1:481,13\n291#1:497,3\n306#1:495\n308#1:496\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuHeader$2 */
public final class AccountMenuComponentStatefulKt$AccountMenuHeader$2 extends Lambda implements C11305q<C2411u0, C8592o, Integer, C11079d2> {
    final /* synthetic */ C11300l<C23130a, C11079d2> $actioner;
    final /* synthetic */ C28892e<C37950a> $airshipInbox;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountMenuComponentStatefulKt$AccountMenuHeader$2(C28892e<C37950a> eVar, C11300l<? super C23130a, C11079d2> lVar) {
        super(3);
        this.$airshipInbox = eVar;
        this.$actioner = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2411u0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2411u0 u0Var, @C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        int i2 = i;
        Intrinsics.checkNotNullParameter(u0Var, "$this$NavigationActionHeader");
        if ((i2 & 81) != 16 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-593977862, i2, -1, "com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuHeader.<anonymous> (AccountMenuComponentStateful.kt:289)");
            }
            C8734c.C8735a aVar = C8734c.f23406a;
            C8734c A = aVar.mo17060A();
            C28892e eVar = this.$airshipInbox;
            C11300l<C23130a, C11079d2> lVar = this.$actioner;
            oVar2.mo14918M(733328855);
            C8767m.C8768a aVar2 = C8767m.f23478j;
            C15560f0 k = BoxKt.m9849k(A, false, oVar2, 6);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(aVar2);
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
            HeaderComponentKt.m151496a(C16015f.m71849d(R.drawable.ds_ic_notification, oVar2, 0), false, 0, (String) null, new AccountMenuComponentStatefulKt$AccountMenuHeader$2$1$1(eVar, boxScopeInstance, lVar), oVar, 3080, 6);
            oVar2.mo14918M(-763075542);
            C37950a aVar3 = (C37950a) C28897f.m119478b(eVar);
            if (C28759i.m119064a(aVar3 != null ? Integer.valueOf(aVar3.mo116789f()) : null, 0)) {
                float f2 = (float) 10;
                BoxKt.m9839a(BackgroundKt.m8825d(C8744d.m32514a(SizeKt.m10087C(boxScopeInstance.mo7701c(PaddingKt.m10024k(aVar2, C16483g.m74435M(f2)), aVar.mo17060A()), C16483g.m74435M(f2)), C2694o.m12169k()), C37475b.f94185a.mo114228Y(), (C15218g4) null, 2, (Object) null), oVar2, 0);
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
