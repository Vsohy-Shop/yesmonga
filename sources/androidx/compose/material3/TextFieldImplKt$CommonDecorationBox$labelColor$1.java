package androidx.compose.material3;

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
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ C8189d3 $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2241e $interactionSource;
    final /* synthetic */ boolean $isError;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$labelColor$1(C8189d3 d3Var, boolean z, boolean z2, C2241e eVar, int i) {
        super(3);
        this.$colors = d3Var;
        this.$enabled = z;
        this.$isError = z2;
        this.$interactionSource = eVar;
        this.$$dirty1 = i;
    }

    @C8540g
    /* renamed from: a */
    public final long mo12229a(@C12579k InputPhase inputPhase, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(inputPhase, "it");
        oVar.mo14918M(-502832279);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-502832279, i, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:92)");
        }
        C8189d3 d3Var = this.$colors;
        boolean z = this.$enabled;
        boolean z2 = this.$isError;
        C2241e eVar = this.$interactionSource;
        int i2 = this.$$dirty1;
        long M = d3Var.mo12543h(z, z2, eVar, oVar, ((i2 >> 6) & 14) | ((i2 >> 6) & 112) | ((i2 >> 6) & 896) | ((i2 >> 9) & 7168)).getValue().mo42833M();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return M;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return C15240j2.m66071n(mo12229a((InputPhase) obj, (C8592o) obj2, ((Number) obj3).intValue()));
    }
}
