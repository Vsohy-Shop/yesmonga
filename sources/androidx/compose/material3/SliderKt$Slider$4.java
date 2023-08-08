package androidx.compose.material3;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.jsoup.parser.C12888a;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SliderKt$Slider$4 extends Lambda implements C11305q<C8264p2, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C8258o2 $colors;
    final /* synthetic */ boolean $enabled;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$Slider$4(C8258o2 o2Var, boolean z, int i) {
        super(3);
        this.$colors = o2Var;
        this.$enabled = z;
        this.$$dirty = i;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo11908a(@C12579k C8264p2 p2Var, @C12580l C8592o oVar, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(p2Var, "sliderPositions");
        if ((i & 14) == 0) {
            if (oVar.mo15006n0(p2Var)) {
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if ((i & 91) != 18 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(686671625, i, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:176)");
            }
            SliderDefaults sliderDefaults = SliderDefaults.f19660a;
            C8258o2 o2Var = this.$colors;
            boolean z = this.$enabled;
            int i3 = (i & 14) | C12888a.f31808q;
            int i4 = this.$$dirty;
            sliderDefaults.mo11877b(p2Var, (C8767m) null, o2Var, z, oVar, i3 | ((i4 >> 15) & 896) | (i4 & 7168), 2);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo11908a((C8264p2) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
