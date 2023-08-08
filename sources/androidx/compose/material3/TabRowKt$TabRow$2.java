package androidx.compose.material3;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.SubcomposeLayoutKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$TabRow$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,505:1\n67#2,3:506\n66#2:509\n1114#3,6:510\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$TabRow$2\n*L\n148#1:506,3\n148#1:509\n148#1:510,6\n*E\n"})
public final class TabRowKt$TabRow$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $divider;
    final /* synthetic */ C11305q<List<C8184c3>, C8592o, Integer, C11079d2> $indicator;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $tabs;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabRowKt$TabRow$2(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11305q<? super List<C8184c3>, ? super C8592o, ? super Integer, C11079d2> qVar, int i) {
        super(2);
        this.$tabs = pVar;
        this.$divider = pVar2;
        this.$indicator = qVar;
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
                ComposerKt.m29845w0(1273256619, i, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:146)");
            }
            C8767m n = SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null);
            C11304p<C8592o, Integer, C11079d2> pVar = this.$tabs;
            C11304p<C8592o, Integer, C11079d2> pVar2 = this.$divider;
            C11305q<List<C8184c3>, C8592o, Integer, C11079d2> qVar = this.$indicator;
            int i2 = this.$$dirty;
            oVar.mo14918M(1618982084);
            boolean n0 = oVar.mo15006n0(pVar) | oVar.mo15006n0(pVar2) | oVar.mo15006n0(qVar);
            Object N = oVar.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new TabRowKt$TabRow$2$1$1(pVar, pVar2, qVar, i2);
                oVar.mo14893C(N);
            }
            oVar.mo15002m0();
            SubcomposeLayoutKt.m69021a(n, (C11304p) N, oVar, 6, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
