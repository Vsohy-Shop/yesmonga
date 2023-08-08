package androidx.compose.material3;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.profileinstaller.C20022q;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SliderKt$Slider$3 extends Lambda implements C11305q<C8264p2, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C8258o2 $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2243g $interactionSource;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$Slider$3(C2243g gVar, C8258o2 o2Var, boolean z, int i) {
        super(3);
        this.$interactionSource = gVar;
        this.$colors = o2Var;
        this.$enabled = z;
        this.$$dirty = i;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo11907a(@C12579k C8264p2 p2Var, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(p2Var, "it");
        if ((i & 81) != 16 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1522452856, i, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:169)");
            }
            SliderDefaults sliderDefaults = SliderDefaults.f19660a;
            C2243g gVar = this.$interactionSource;
            C8258o2 o2Var = this.$colors;
            boolean z = this.$enabled;
            int i2 = this.$$dirty;
            sliderDefaults.mo11876a(gVar, (C8767m) null, o2Var, z, 0, oVar, ((i2 >> 24) & 14) | C20022q.C20025c.f51280k | ((i2 >> 15) & 896) | (i2 & 7168), 18);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo11907a((C8264p2) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
