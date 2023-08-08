package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogContent$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,221:1\n74#2,6:222\n80#2:254\n84#2:297\n75#3:228\n76#3,11:230\n75#3:261\n76#3,11:263\n89#3:291\n89#3:296\n76#4:229\n76#4:262\n460#5,13:241\n460#5,13:274\n473#5,3:288\n473#5,3:293\n67#6,6:255\n73#6:287\n77#6:292\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogContent$1\n*L\n58#1:222,6\n58#1:254\n58#1:297\n58#1:228\n58#1:230,11\n109#1:261\n109#1:263,11\n109#1:291\n58#1:296\n58#1:229\n109#1:262\n58#1:241,13\n109#1:274,13\n109#1:288,3\n58#1:293,3\n109#1:255,6\n109#1:287\n109#1:292\n*E\n"})
public final class AlertDialogKt$AlertDialogContent$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $buttonContentColor;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $buttons;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $icon;
    final /* synthetic */ long $iconContentColor;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $text;
    final /* synthetic */ long $textContentColor;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $title;
    final /* synthetic */ long $titleContentColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$AlertDialogContent$1(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, long j, int i, long j2, long j3, long j4, C11304p<? super C8592o, ? super Integer, C11079d2> pVar4) {
        super(2);
        this.$icon = pVar;
        this.$title = pVar2;
        this.$text = pVar3;
        this.$iconContentColor = j;
        this.$$dirty = i;
        this.$titleContentColor = j2;
        this.$textContentColor = j3;
        this.$buttonContentColor = j4;
        this.$buttons = pVar4;
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
                ComposerKt.m29845w0(-2126308228, i2, -1, "androidx.compose.material3.AlertDialogContent.<anonymous> (AlertDialog.kt:56)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m j = PaddingKt.m10023j(aVar, AlertDialogKt.f19147c);
            C11304p<C8592o, Integer, C11079d2> pVar = this.$icon;
            C11304p<C8592o, Integer, C11079d2> pVar2 = this.$title;
            C11304p<C8592o, Integer, C11079d2> pVar3 = this.$text;
            long j2 = this.$iconContentColor;
            int i3 = this.$$dirty;
            long j3 = this.$titleContentColor;
            long j4 = this.$textContentColor;
            long j5 = this.$buttonContentColor;
            C11304p<C8592o, Integer, C11079d2> pVar4 = this.$buttons;
            oVar2.mo14918M(-483455358);
            Arrangement.C2279l r = Arrangement.f6010a.mo7631r();
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C11304p<C8592o, Integer, C11079d2> pVar5 = pVar4;
            C15560f0 b = ColumnKt.m9863b(r, aVar2.mo17072u(), oVar2, 0);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C8767m.C8768a aVar3 = aVar;
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            long j6 = j4;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(j);
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
            oVar2.mo14918M(76440732);
            if (pVar != null) {
                CompositionLocalKt.m29856b(new C8572j1[]{ContentColorKt.m25558a().mo16141f(C15240j2.m66071n(j2))}, C8553b.m31048b(oVar2, 934657765, true, new AlertDialogKt$AlertDialogContent$1$1$1$1(columnScopeInstance, pVar, i3)), oVar2, 56);
            }
            oVar.mo15002m0();
            oVar2.mo14918M(76441127);
            if (pVar2 != null) {
                CompositionLocalKt.m29856b(new C8572j1[]{ContentColorKt.m25558a().mo16141f(C15240j2.m66071n(j3))}, C8553b.m31048b(oVar2, 1845262876, true, new AlertDialogKt$AlertDialogContent$1$1$2$1(columnScopeInstance, pVar, pVar2, i3)), oVar2, 56);
            }
            oVar.mo15002m0();
            oVar2.mo14918M(76442077);
            if (pVar3 != null) {
                CompositionLocalKt.m29856b(new C8572j1[]{ContentColorKt.m25558a().mo16141f(C15240j2.m66071n(j6))}, C8553b.m31048b(oVar2, 613970333, true, new AlertDialogKt$AlertDialogContent$1$1$3$1(columnScopeInstance, pVar3, i3)), oVar2, 56);
            }
            oVar.mo15002m0();
            C8767m e = columnScopeInstance.mo7714e(aVar3, aVar2.mo17071s());
            oVar2.mo14918M(733328855);
            C15560f0 k = BoxKt.m9849k(aVar2.mo17061C(), false, oVar2, 0);
            oVar2.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(e);
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
            Updater.m30188j(b3, k, companion.mo44588d());
            Updater.m30188j(b3, dVar2, companion.mo44586b());
            Updater.m30188j(b3, layoutDirection2, companion.mo44587c());
            Updater.m30188j(b3, c4Var2, companion.mo44590f());
            oVar.mo14972e();
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
            CompositionLocalKt.m29856b(new C8572j1[]{ContentColorKt.m25558a().mo16141f(C15240j2.m66071n(j5))}, C8553b.m31048b(oVar2, -433542216, true, new AlertDialogKt$AlertDialogContent$1$1$4$1(pVar5, i3)), oVar2, 56);
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
