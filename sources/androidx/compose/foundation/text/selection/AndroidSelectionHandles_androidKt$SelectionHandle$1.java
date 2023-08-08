package androidx.compose.foundation.text.selection;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$SelectionHandle$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,331:1\n50#2:332\n49#2:333\n1114#3,6:334\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$SelectionHandle$1\n*L\n74#1:332\n74#1:333\n74#1:334,6\n*E\n"})
public final class AndroidSelectionHandles_androidKt$SelectionHandle$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $content;
    final /* synthetic */ ResolvedTextDirection $direction;
    final /* synthetic */ boolean $handlesCrossed;
    final /* synthetic */ boolean $isStartHandle;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ long $position;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$SelectionHandle$1(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C8767m mVar, boolean z, long j, int i, ResolvedTextDirection resolvedTextDirection, boolean z2) {
        super(2);
        this.$content = pVar;
        this.$modifier = mVar;
        this.$isStartHandle = z;
        this.$position = j;
        this.$$dirty = i;
        this.$direction = resolvedTextDirection;
        this.$handlesCrossed = z2;
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
                ComposerKt.m29845w0(732099485, i, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:69)");
            }
            if (this.$content == null) {
                oVar.mo14918M(386443790);
                C8767m mVar = this.$modifier;
                Boolean valueOf = Boolean.valueOf(this.$isStartHandle);
                C15094f d = C15094f.m64868d(this.$position);
                boolean z = this.$isStartHandle;
                long j = this.$position;
                oVar.mo14918M(511388516);
                boolean n0 = oVar.mo15006n0(valueOf) | oVar.mo15006n0(d);
                Object N = oVar.mo14921N();
                if (n0 || N == C8592o.f23032a.mo16277a()) {
                    N = new AndroidSelectionHandles_androidKt$SelectionHandle$1$1$1(z, j);
                    oVar.mo14893C(N);
                }
                oVar.mo15002m0();
                C8767m c = SemanticsModifierKt.m71868c(mVar, false, (C11300l) N, 1, (Object) null);
                boolean z2 = this.$isStartHandle;
                ResolvedTextDirection resolvedTextDirection = this.$direction;
                boolean z3 = this.$handlesCrossed;
                int i2 = this.$$dirty;
                AndroidSelectionHandles_androidKt.m12664a(c, z2, resolvedTextDirection, z3, oVar, (i2 & 112) | (i2 & 896) | (i2 & 7168));
                oVar.mo15002m0();
            } else {
                oVar.mo14918M(386444465);
                this.$content.invoke(oVar, Integer.valueOf((this.$$dirty >> 15) & 14));
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
