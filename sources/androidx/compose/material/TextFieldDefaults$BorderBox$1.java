package androidx.compose.material;

import androidx.compose.foundation.interaction.C2241e;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TextFieldDefaults$BorderBox$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C7930s1 $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ float $focusedBorderThickness;
    final /* synthetic */ C2241e $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ C15218g4 $shape;
    final /* synthetic */ TextFieldDefaults $tmp0_rcvr;
    final /* synthetic */ float $unfocusedBorderThickness;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDefaults$BorderBox$1(TextFieldDefaults textFieldDefaults, boolean z, boolean z2, C2241e eVar, C7930s1 s1Var, C15218g4 g4Var, float f, float f2, int i, int i2) {
        super(2);
        this.$tmp0_rcvr = textFieldDefaults;
        this.$enabled = z;
        this.$isError = z2;
        this.$interactionSource = eVar;
        this.$colors = s1Var;
        this.$shape = g4Var;
        this.$focusedBorderThickness = f;
        this.$unfocusedBorderThickness = f2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        this.$tmp0_rcvr.mo10627a(this.$enabled, this.$isError, this.$interactionSource, this.$colors, this.$shape, this.$focusedBorderThickness, this.$unfocusedBorderThickness, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
