package com.carrefour.fid.android.product.presentation.p039ui.facet.facets;

import androidx.compose.foundation.lazy.grid.C2496k;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.domain.models.product.Sort;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo22516d2 = {"T", "Landroidx/compose/foundation/lazy/grid/k;", "", "it", "Lkotlin/d2;", "a", "(Landroidx/compose/foundation/lazy/grid/k;ILandroidx/compose/runtime/o;I)V", "androidx/compose/foundation/lazy/grid/LazyGridDslKt$items$5"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$5\n+ 2 FacetStateful.kt\ncom/carrefour/fid/android/product/presentation/ui/facet/facets/FacetStatefulKt$SortAndFilterList$1\n*L\n1#1,493:1\n214#2,3:494\n213#2,6:497\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.facets.FacetStatefulKt$SortAndFilterList$1$invoke$$inlined$items$default$5 */
public final class C27981x2195799d extends Lambda implements C11306r<C2496k, Integer, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty$inlined;
    final /* synthetic */ C11300l $actioner$inlined;
    final /* synthetic */ List $items;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27981x2195799d(List list, C11300l lVar, int i) {
        super(4);
        this.$items = list;
        this.$actioner$inlined = lVar;
        this.$$dirty$inlined = i;
    }

    @C8540g
    /* renamed from: a */
    public final void mo81436a(@C12579k C2496k kVar, int i, @C12580l C8592o oVar, int i2) {
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(kVar, "$this$items");
        if ((i2 & 14) == 0) {
            if (oVar.mo15006n0(kVar)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (oVar.mo14976f(i)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 731) != 146 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(699646206, i3, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:390)");
            }
            FacetStatefulKt.m117381i((Sort) this.$items.get(i), false, this.$actioner$inlined, oVar, (this.$$dirty$inlined & 896) | 56);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        mo81436a((C2496k) obj, ((Number) obj2).intValue(), (C8592o) obj3, ((Number) obj4).intValue());
        return C11079d2.f28267a;
    }
}
