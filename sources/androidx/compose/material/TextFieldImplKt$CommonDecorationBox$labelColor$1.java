package androidx.compose.material;

import androidx.compose.foundation.interaction.C2241e;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TextFieldImplKt$CommonDecorationBox$labelColor$1 extends Lambda implements C11305q<InputPhase, C8592o, Integer, C15240j2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ C7930s1 $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2241e $interactionSource;
    final /* synthetic */ boolean $isError;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$labelColor$1(C7930s1 s1Var, boolean z, boolean z2, C2241e eVar, int i, int i2) {
        super(3);
        this.$colors = s1Var;
        this.$enabled = z;
        this.$isError = z2;
        this.$interactionSource = eVar;
        this.$$dirty = i;
        this.$$dirty1 = i2;
    }

    @C8540g
    /* renamed from: a */
    public final long mo10658a(@C12579k InputPhase inputPhase, @C12580l C8592o oVar, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(inputPhase, "it");
        oVar.mo14918M(697243846);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(697243846, i, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:91)");
        }
        C7930s1 s1Var = this.$colors;
        boolean z2 = this.$enabled;
        if (inputPhase == InputPhase.UnfocusedEmpty) {
            z = false;
        } else {
            z = this.$isError;
        }
        C2241e eVar = this.$interactionSource;
        int i2 = this.$$dirty1;
        long M = s1Var.mo10710i(z2, z, eVar, oVar, ((this.$$dirty >> 27) & 14) | ((i2 << 3) & 896) | (i2 & 7168)).getValue().mo42833M();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return M;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return C15240j2.m66071n(mo10658a((InputPhase) obj, (C8592o) obj2, ((Number) obj3).intValue()));
    }
}
