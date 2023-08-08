package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
@C11363r0({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$backLayer$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,522:1\n73#2,7:523\n80#2:556\n84#2:561\n75#3:530\n76#3,11:532\n89#3:560\n76#4:531\n460#5,13:543\n473#5,3:557\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$backLayer$1\n*L\n281#1:523,7\n281#1:556\n281#1:561\n281#1:530\n281#1:532,11\n281#1:560\n281#1:531\n281#1:543,13\n281#1:557,3\n*E\n"})
public final class BackdropScaffoldKt$BackdropScaffold$backLayer$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $appBar;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $backLayerContent;
    final /* synthetic */ boolean $persistentAppBar;
    final /* synthetic */ BackdropScaffoldState $scaffoldState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropScaffold$backLayer$1(boolean z, BackdropScaffoldState backdropScaffoldState, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, int i) {
        super(2);
        this.$persistentAppBar = z;
        this.$scaffoldState = backdropScaffoldState;
        this.$appBar = pVar;
        this.$backLayerContent = pVar2;
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
                ComposerKt.m29845w0(1744778315, i, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:278)");
            }
            if (this.$persistentAppBar) {
                oVar.mo14918M(-1017265331);
                C11304p<C8592o, Integer, C11079d2> pVar = this.$appBar;
                int i2 = this.$$dirty;
                C11304p<C8592o, Integer, C11079d2> pVar2 = this.$backLayerContent;
                oVar.mo14918M(-483455358);
                C8767m.C8768a aVar = C8767m.f23478j;
                C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), oVar, 0);
                oVar.mo14918M(-1323940314);
                C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection = (LayoutDirection) oVar.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var = (C15863c4) oVar.mo15032w(CompositionLocalsKt.m71025w());
                ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
                C11289a<ComposeUiNode> a = companion.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(aVar);
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
                f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar, 0);
                oVar.mo14918M(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
                pVar.invoke(oVar, Integer.valueOf(i2 & 14));
                pVar2.invoke(oVar, Integer.valueOf((i2 >> 3) & 14));
                oVar.mo15002m0();
                oVar.mo14896D();
                oVar.mo15002m0();
                oVar.mo15002m0();
                oVar.mo15002m0();
            } else {
                oVar.mo14918M(-1017265219);
                C11304p<C8592o, Integer, C11079d2> pVar3 = this.$appBar;
                C11304p<C8592o, Integer, C11079d2> pVar4 = this.$backLayerContent;
                int i3 = this.$$dirty;
                BackdropScaffoldKt.m13220a((BackdropValue) this.$scaffoldState.mo10490A(), pVar3, pVar4, oVar, ((i3 << 3) & 896) | ((i3 << 3) & 112));
                oVar.mo15002m0();
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
