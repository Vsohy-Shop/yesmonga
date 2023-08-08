package androidx.compose.material3;

import androidx.compose.foundation.interaction.C2241e;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.profileinstaller.C20022q;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TextFieldDefaults$DecorationBox$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ C8189d3 $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2241e $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ C15218g4 $shape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDefaults$DecorationBox$1(boolean z, boolean z2, C2241e eVar, C8189d3 d3Var, C15218g4 g4Var, int i, int i2) {
        super(2);
        this.$enabled = z;
        this.$isError = z2;
        this.$interactionSource = eVar;
        this.$colors = d3Var;
        this.$shape = g4Var;
        this.$$dirty = i;
        this.$$dirty1 = i2;
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
                ComposerKt.m29845w0(-435523791, i, -1, "androidx.compose.material3.TextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:433)");
            }
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f19839a;
            boolean z = this.$enabled;
            boolean z2 = this.$isError;
            C2241e eVar = this.$interactionSource;
            C8189d3 d3Var = this.$colors;
            C15218g4 g4Var = this.$shape;
            int i2 = this.$$dirty;
            int i3 = ((i2 >> 9) & 896) | ((i2 >> 6) & 14) | C20022q.C20025c.f51280k | ((i2 >> 15) & 112);
            int i4 = this.$$dirty1;
            textFieldDefaults.mo12180a(z, z2, eVar, d3Var, g4Var, oVar, i3 | ((i4 >> 6) & 7168) | (i4 & 57344), 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
