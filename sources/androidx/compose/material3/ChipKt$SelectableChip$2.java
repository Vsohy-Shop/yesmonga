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

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ChipKt$SelectableChip$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $avatar;
    final /* synthetic */ C8229j2 $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $label;
    final /* synthetic */ C16361p0 $labelTextStyle;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $leadingIcon;
    final /* synthetic */ float $minHeight;
    final /* synthetic */ C2366i0 $paddingValues;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $trailingIcon;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChipKt$SelectableChip$2(C8229j2 j2Var, boolean z, boolean z2, int i, int i2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C16361p0 p0Var, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C11304p<? super C8592o, ? super Integer, C11079d2> pVar4, float f, C2366i0 i0Var) {
        super(2);
        this.$colors = j2Var;
        this.$enabled = z;
        this.$selected = z2;
        this.$$dirty = i;
        this.$$dirty1 = i2;
        this.$label = pVar;
        this.$labelTextStyle = p0Var;
        this.$leadingIcon = pVar2;
        this.$avatar = pVar3;
        this.$trailingIcon = pVar4;
        this.$minHeight = f;
        this.$paddingValues = i0Var;
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
                ComposerKt.m29845w0(-577614814, i2, -1, "androidx.compose.material3.SelectableChip.<anonymous> (Chip.kt:1378)");
            }
            C8229j2 j2Var = this.$colors;
            boolean z = this.$enabled;
            boolean z2 = this.$selected;
            int i3 = this.$$dirty;
            long M = j2Var.mo12718b(z, z2, oVar2, ((i3 << 3) & 112) | ((i3 >> 9) & 14) | ((this.$$dirty1 << 6) & 896)).getValue().mo42833M();
            C8229j2 j2Var2 = this.$colors;
            boolean z3 = this.$enabled;
            boolean z4 = this.$selected;
            int i4 = this.$$dirty;
            long M2 = j2Var2.mo12719c(z3, z4, oVar2, ((i4 << 3) & 112) | ((i4 >> 9) & 14) | ((this.$$dirty1 << 6) & 896)).getValue().mo42833M();
            C8229j2 j2Var3 = this.$colors;
            boolean z5 = this.$enabled;
            boolean z6 = this.$selected;
            int i5 = this.$$dirty;
            long M3 = j2Var3.mo12720d(z5, z6, oVar2, ((i5 << 3) & 112) | ((i5 >> 9) & 14) | ((this.$$dirty1 << 6) & 896)).getValue().mo42833M();
            C11304p<C8592o, Integer, C11079d2> pVar = this.$label;
            C16361p0 p0Var = this.$labelTextStyle;
            C11304p<C8592o, Integer, C11079d2> pVar2 = this.$leadingIcon;
            C11304p<C8592o, Integer, C11079d2> pVar3 = this.$avatar;
            C11304p<C8592o, Integer, C11079d2> pVar4 = this.$trailingIcon;
            float f = this.$minHeight;
            C2366i0 i0Var = this.$paddingValues;
            int i6 = this.$$dirty;
            int i7 = ((i6 >> 12) & 14) | ((i6 >> 12) & 112) | ((i6 >> 9) & 7168) | ((i6 >> 9) & 57344) | ((i6 >> 9) & 458752);
            int i8 = this.$$dirty1;
            ChipKt.m25499c(pVar, p0Var, M, pVar2, pVar3, pVar4, M2, M3, f, i0Var, oVar, ((i8 << 15) & 1879048192) | i7 | ((i8 << 15) & 234881024));
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
