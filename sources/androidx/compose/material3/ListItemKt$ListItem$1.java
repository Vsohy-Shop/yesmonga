package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemKt$ListItem$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,447:1\n75#2,5:448\n80#2:479\n84#2:484\n75#3:453\n76#3,11:455\n89#3:483\n76#4:454\n460#5,13:466\n473#5,3:480\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemKt$ListItem$1\n*L\n166#1:448,5\n166#1:479\n166#1:484\n166#1:453\n166#1:455,11\n166#1:483\n166#1:454\n166#1:466,13\n166#1:480,3\n*E\n"})
public final class ListItemKt$ListItem$1 extends Lambda implements C11305q<C2411u0, C8592o, Integer, C11079d2> {
    final /* synthetic */ C8734c.C8737c $boxAlignment;
    final /* synthetic */ Arrangement.C2279l $columnArrangement;
    final /* synthetic */ C2366i0 $contentPaddingValues;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $decoratedHeadlineContent;
    final /* synthetic */ C11305q<C2411u0, C8592o, Integer, C11079d2> $decoratedLeadingContent;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $decoratedOverlineContent;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $decoratedSupportingContent;
    final /* synthetic */ C11305q<C2411u0, C8592o, Integer, C11079d2> $decoratedTrailingContent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListItemKt$ListItem$1(C11305q<? super C2411u0, ? super C8592o, ? super Integer, C11079d2> qVar, C2366i0 i0Var, C8734c.C8737c cVar, Arrangement.C2279l lVar, C11305q<? super C2411u0, ? super C8592o, ? super Integer, C11079d2> qVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3) {
        super(3);
        this.$decoratedLeadingContent = qVar;
        this.$contentPaddingValues = i0Var;
        this.$boxAlignment = cVar;
        this.$columnArrangement = lVar;
        this.$decoratedTrailingContent = qVar2;
        this.$decoratedOverlineContent = pVar;
        this.$decoratedHeadlineContent = pVar2;
        this.$decoratedSupportingContent = pVar3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2411u0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2411u0 u0Var, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(u0Var, "$this$ListItem");
        if ((i & 14) == 0) {
            i |= oVar.mo15006n0(u0Var) ? 4 : 2;
        }
        if ((i & 91) != 18 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1813277157, i, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:161)");
            }
            oVar.mo14918M(1316674963);
            C11305q<C2411u0, C8592o, Integer, C11079d2> qVar = this.$decoratedLeadingContent;
            if (qVar != null) {
                qVar.invoke(u0Var, oVar, Integer.valueOf(i & 14));
            }
            oVar.mo15002m0();
            C8767m f = u0Var.mo7845f(PaddingKt.m10023j(C2411u0.m10660e(u0Var, C8767m.f23478j, 1.0f, false, 2, (Object) null), this.$contentPaddingValues), this.$boxAlignment);
            Arrangement.C2279l lVar = this.$columnArrangement;
            C11304p<C8592o, Integer, C11079d2> pVar = this.$decoratedOverlineContent;
            C11304p<C8592o, Integer, C11079d2> pVar2 = this.$decoratedHeadlineContent;
            C11304p<C8592o, Integer, C11079d2> pVar3 = this.$decoratedSupportingContent;
            oVar.mo14918M(-483455358);
            C15560f0 b = ColumnKt.m9863b(lVar, C8734c.f23406a.mo17072u(), oVar, 0);
            oVar.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(f);
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
            oVar.mo14918M(984343928);
            if (pVar != null) {
                pVar.invoke(oVar, 0);
            }
            oVar.mo15002m0();
            pVar2.invoke(oVar, 6);
            oVar.mo14918M(1316675435);
            if (pVar3 != null) {
                pVar3.invoke(oVar, 0);
            }
            oVar.mo15002m0();
            oVar.mo15002m0();
            oVar.mo14896D();
            oVar.mo15002m0();
            oVar.mo15002m0();
            C11305q<C2411u0, C8592o, Integer, C11079d2> qVar2 = this.$decoratedTrailingContent;
            if (qVar2 != null) {
                qVar2.invoke(u0Var, oVar, Integer.valueOf(i & 14));
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
