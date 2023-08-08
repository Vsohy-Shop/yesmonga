package androidx.compose.material3;

import androidx.compose.foundation.layout.C2354e1;
import androidx.compose.foundation.layout.C2358f1;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p004ui.layout.C15562f1;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Integer $bottomBarHeight;
    final /* synthetic */ List<C15611w0> $bottomBarPlaceables;
    final /* synthetic */ C11305q<C2366i0, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C2354e1 $contentWindowInsets;
    final /* synthetic */ C15562f1 $this_SubcomposeLayout;
    final /* synthetic */ int $topBarHeight;
    final /* synthetic */ List<C15611w0> $topBarPlaceables;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1(C2354e1 e1Var, C15562f1 f1Var, List<? extends C15611w0> list, int i, List<? extends C15611w0> list2, Integer num, C11305q<? super C2366i0, ? super C8592o, ? super Integer, C11079d2> qVar, int i2) {
        super(2);
        this.$contentWindowInsets = e1Var;
        this.$this_SubcomposeLayout = f1Var;
        this.$topBarPlaceables = list;
        this.$topBarHeight = i;
        this.$bottomBarPlaceables = list2;
        this.$bottomBarHeight = num;
        this.$content = qVar;
        this.$$dirty = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    public final void invoke(@C12580l C8592o oVar, int i) {
        float f;
        float f2;
        Integer num;
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1643221465, i, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:220)");
            }
            C2366i0 h = C2358f1.m10395h(this.$contentWindowInsets, this.$this_SubcomposeLayout);
            if (this.$topBarPlaceables.isEmpty()) {
                f = h.mo8093d();
            } else {
                f = this.$this_SubcomposeLayout.mo7416L(this.$topBarHeight);
            }
            if (this.$bottomBarPlaceables.isEmpty() || (num = this.$bottomBarHeight) == null) {
                f2 = h.mo8090a();
            } else {
                f2 = this.$this_SubcomposeLayout.mo7416L(num.intValue());
            }
            this.$content.invoke(PaddingKt.m10017d(PaddingKt.m10022i(h, this.$this_SubcomposeLayout.getLayoutDirection()), f, PaddingKt.m10021h(h, this.$this_SubcomposeLayout.getLayoutDirection()), f2), oVar, Integer.valueOf((this.$$dirty >> 3) & 112));
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
