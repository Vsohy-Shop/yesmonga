package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
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
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemKt$LeadingContent$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,447:1\n67#2,6:448\n73#2:480\n77#2:485\n75#3:454\n76#3,11:456\n89#3:484\n76#4:455\n460#5,13:467\n473#5,3:481\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemKt$LeadingContent$1\n*L\n238#1:448,6\n238#1:480\n238#1:485\n238#1:454\n238#1:456,11\n238#1:484\n238#1:455\n238#1:467,13\n238#1:481,3\n*E\n"})
public final class ListItemKt$LeadingContent$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C2411u0 $this_LeadingContent;
    final /* synthetic */ boolean $topAlign;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListItemKt$LeadingContent$1(boolean z, C2411u0 u0Var, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, int i) {
        super(2);
        this.$topAlign = z;
        this.$this_LeadingContent = u0Var;
        this.$content = pVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(315166618, i, -1, "androidx.compose.material3.LeadingContent.<anonymous> (ListItem.kt:236)");
            }
            C8767m mVar = C8767m.f23478j;
            C8767m o = PaddingKt.m10028o(mVar, 0.0f, 0.0f, ListItemKt.f19462d, 0.0f, 11, (Object) null);
            if (!this.$topAlign) {
                mVar = this.$this_LeadingContent.mo7845f(mVar, C8734c.f23406a.mo17070q());
            }
            C8767m k3 = o.mo17224k3(mVar);
            C11304p<C8592o, Integer, C11079d2> pVar = this.$content;
            int i2 = this.$$dirty;
            oVar.mo14918M(733328855);
            C15560f0 k = BoxKt.m9849k(C8734c.f23406a.mo17061C(), false, oVar, 0);
            oVar.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(k3);
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
            C8592o b = Updater.m30180b(oVar);
            Updater.m30188j(b, k, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            oVar.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar, 0);
            oVar.mo14918M(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
            pVar.invoke(oVar, Integer.valueOf((i2 >> 9) & 14));
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
