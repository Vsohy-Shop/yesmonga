package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Landroidx/compose/foundation/lazy/grid/k;", "", "it", "Lkotlin/d2;", "a", "(Landroidx/compose/foundation/lazy/grid/k;ILandroidx/compose/runtime/o;I)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class LazyGridScopeImpl$item$4 extends Lambda implements C11306r<C2496k, Integer, C8592o, Integer, C11079d2> {
    final /* synthetic */ C11305q<C2496k, C8592o, Integer, C11079d2> $content;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridScopeImpl$item$4(C11305q<? super C2496k, ? super C8592o, ? super Integer, C11079d2> qVar) {
        super(4);
        this.$content = qVar;
    }

    @C8540g
    /* renamed from: a */
    public final void mo8475a(@C12579k C2496k kVar, int i, @C12580l C8592o oVar, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(kVar, "$this$$receiver");
        if ((i2 & 14) == 0) {
            if (oVar.mo15006n0(kVar)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 |= i3;
        }
        if ((i2 & 651) != 130 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1504808184, i2, -1, "androidx.compose.foundation.lazy.grid.LazyGridScopeImpl.item.<anonymous> (LazyGridScopeImpl.kt:42)");
            }
            this.$content.invoke(kVar, oVar, Integer.valueOf(i2 & 14));
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        mo8475a((C2496k) obj, ((Number) obj2).intValue(), (C8592o) obj3, ((Number) obj4).intValue());
        return C11079d2.f28267a;
    }
}
