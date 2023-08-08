package androidx.compose.material3;

import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ListItemKt$ListItem$decoratedLeadingContent$1$1 extends Lambda implements C11305q<C2411u0, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C8187d1 $colors;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $it;
    final /* synthetic */ int $listItemType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListItemKt$ListItem$decoratedLeadingContent$1$1(C8187d1 d1Var, int i, int i2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        super(3);
        this.$colors = d1Var;
        this.$$dirty = i;
        this.$listItemType = i2;
        this.$it = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2411u0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2411u0 u0Var, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(u0Var, "$this$null");
        if ((i & 14) == 0) {
            i |= oVar.mo15006n0(u0Var) ? 4 : 2;
        }
        if ((i & 91) != 18 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1673725255, i, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:116)");
            }
            ListItemKt.m25851a(u0Var, this.$colors.mo12528c(true, oVar, ((this.$$dirty >> 15) & 112) | 6).getValue().mo42833M(), C8198f1.m27092W(this.$listItemType, C8198f1.f20129b.mo12598c()), this.$it, oVar, i & 14);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
