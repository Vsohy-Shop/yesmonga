package androidx.compose.material;

import androidx.compose.p004ui.graphics.C15205e4;
import androidx.compose.p004ui.text.C16051a0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.C16402q0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16194f0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.intl.C16342f;
import androidx.compose.p004ui.text.style.C16410a;
import androidx.compose.p004ui.text.style.C16415e;
import androidx.compose.p004ui.text.style.C16417f;
import androidx.compose.p004ui.text.style.C16426h;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16436k;
import androidx.compose.p004ui.text.style.C16439m;
import androidx.compose.p004ui.text.style.C16442o;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.bumptech.glide.load.data.mediastore.C22132b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $it;
    final /* synthetic */ long $labelContentColor;
    final /* synthetic */ float $labelProgress;
    final /* synthetic */ long $labelTextStyleColor;
    final /* synthetic */ boolean $shouldOverrideTextStyleColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1(float f, long j, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, int i, boolean z, long j2) {
        super(2);
        this.$labelProgress = f;
        this.$labelContentColor = j;
        this.$it = pVar;
        this.$$dirty = i;
        this.$shouldOverrideTextStyleColor = z;
        this.$labelTextStyleColor = j2;
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
                ComposerKt.m29845w0(362863774, i2, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:121)");
            }
            C7933t0 t0Var = C7933t0.f19075a;
            C16361p0 c = C16402q0.m73988c(t0Var.mo11077c(oVar2, 6).mo11101n(), t0Var.mo11077c(oVar2, 6).mo11092f(), this.$labelProgress);
            TextFieldImplKt.m14136b(this.$labelContentColor, this.$shouldOverrideTextStyleColor ? C16361p0.m73795c(c, this.$labelTextStyleColor, 0, (C16209i0) null, (C16190e0) null, (C16194f0) null, (C16242u) null, (String) null, 0, (C16410a) null, (C16439m) null, (C16342f) null, 0, (C16434j) null, (C15205e4) null, (C16432i) null, (C16436k) null, 0, (C16442o) null, (C16051a0) null, (C16426h) null, (C16417f) null, (C16415e) null, 4194302, (Object) null) : c, (Float) null, this.$it, oVar, ((this.$$dirty >> 6) & 14) | C22132b.f56831b, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
