package androidx.compose.material3;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;
import org.jsoup.parser.C12888a;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ChipKt$Chip$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ C8366x $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $label;
    final /* synthetic */ long $labelColor;
    final /* synthetic */ C16361p0 $labelTextStyle;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $leadingIcon;
    final /* synthetic */ float $minHeight;
    final /* synthetic */ C2366i0 $paddingValues;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $trailingIcon;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChipKt$Chip$2(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C16361p0 p0Var, long j, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C8366x xVar, boolean z, int i, float f, C2366i0 i0Var, int i2) {
        super(2);
        this.$label = pVar;
        this.$labelTextStyle = p0Var;
        this.$labelColor = j;
        this.$leadingIcon = pVar2;
        this.$trailingIcon = pVar3;
        this.$colors = xVar;
        this.$enabled = z;
        this.$$dirty = i;
        this.$minHeight = f;
        this.$paddingValues = i0Var;
        this.$$dirty1 = i2;
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
                ComposerKt.m29845w0(-1985962652, i2, -1, "androidx.compose.material3.Chip.<anonymous> (Chip.kt:1328)");
            }
            C11304p<C8592o, Integer, C11079d2> pVar = this.$label;
            C16361p0 p0Var = this.$labelTextStyle;
            long j = this.$labelColor;
            C11304p<C8592o, Integer, C11079d2> pVar2 = this.$leadingIcon;
            C11304p<C8592o, Integer, C11079d2> pVar3 = this.$trailingIcon;
            C8366x xVar = this.$colors;
            boolean z = this.$enabled;
            int i3 = this.$$dirty;
            long M = xVar.mo14765c(z, oVar2, ((i3 >> 24) & 112) | ((i3 >> 6) & 14)).getValue().mo42833M();
            C8366x xVar2 = this.$colors;
            boolean z2 = this.$enabled;
            int i4 = this.$$dirty;
            long M2 = xVar2.mo14766d(z2, oVar2, ((i4 >> 24) & 112) | ((i4 >> 6) & 14)).getValue().mo42833M();
            float f = this.$minHeight;
            C2366i0 i0Var = this.$paddingValues;
            int i5 = this.$$dirty;
            int i6 = ((i5 >> 9) & 14) | C12888a.f31808q | ((i5 >> 9) & 112) | ((i5 >> 9) & 896) | ((i5 >> 9) & 7168) | (458752 & (i5 >> 6));
            int i7 = this.$$dirty1;
            ChipKt.m25499c(pVar, p0Var, j, pVar2, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, pVar3, M, M2, f, i0Var, oVar, i6 | ((i7 << 18) & 234881024) | ((i7 << 18) & 1879048192));
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
