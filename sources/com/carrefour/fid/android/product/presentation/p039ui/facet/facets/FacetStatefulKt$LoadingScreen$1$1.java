package com.carrefour.fid.android.product.presentation.p039ui.facet.facets;

import androidx.compose.foundation.lazy.grid.C2496k;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.domain.models.product.C38102a;
import com.carrefour.fid.android.domain.models.product.C38111e;
import com.carrefour.fid.android.domain.models.product.Filter;
import com.carrefour.fid.android.domain.models.product.Sort;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.facets.FacetStatefulKt$LoadingScreen$1$1 */
public final class FacetStatefulKt$LoadingScreen$1$1 extends Lambda implements C11300l<LazyGridScope, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C27998a, C11079d2> $actioner;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacetStatefulKt$LoadingScreen$1$1(C11300l<? super C27998a, C11079d2> lVar, int i) {
        super(1);
        this.$actioner = lVar;
        this.$$dirty = i;
    }

    /* renamed from: a */
    public final void mo81453a(@C12579k LazyGridScope lazyGridScope) {
        Intrinsics.checkNotNullParameter(lazyGridScope, "$this$LazyVerticalGrid");
        C279881 r3 = C279881.f67829f;
        final C11300l<C27998a, C11079d2> lVar = this.$actioner;
        final int i = this.$$dirty;
        LazyGridScope.m11051c(lazyGridScope, 8, r3, (C11304p) null, (C11300l) null, C8553b.m31049c(-2137746158, true, new C11306r<C2496k, Integer, C8592o, Integer, C11079d2>() {
            @C8540g
            @C8570j(applier = "androidx.compose.ui.UiComposable")
            /* renamed from: a */
            public final void mo81455a(@C12579k C2496k kVar, int i, @C12580l C8592o oVar, int i2) {
                Intrinsics.checkNotNullParameter(kVar, "$this$items");
                if ((i2 & 641) != 128 || !oVar.mo15011p()) {
                    if (ComposerKt.m29813g0()) {
                        ComposerKt.m29845w0(-2137746158, i2, -1, "com.carrefour.fid.android.product.presentation.ui.facet.facets.LoadingScreen.<anonymous>.<anonymous>.<anonymous> (FacetStateful.kt:358)");
                    }
                    FacetStatefulKt.m117381i(new Sort(C38111e.m157650b(""), "", false, (DefaultConstructorMarker) null), true, lVar, oVar, ((i << 3) & 896) | 56);
                    if (ComposerKt.m29813g0()) {
                        ComposerKt.m29843v0();
                        return;
                    }
                    return;
                }
                oVar.mo14958a0();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                mo81455a((C2496k) obj, ((Number) obj2).intValue(), (C8592o) obj3, ((Number) obj4).intValue());
                return C11079d2.f28267a;
            }
        }), 12, (Object) null);
        C279903 r32 = C279903.f67830f;
        C279914 r4 = C279914.f67831f;
        final C11300l<C27998a, C11079d2> lVar2 = this.$actioner;
        final int i2 = this.$$dirty;
        LazyGridScope.m11051c(lazyGridScope, 8, r32, r4, (C11300l) null, C8553b.m31049c(-1587918647, true, new C11306r<C2496k, Integer, C8592o, Integer, C11079d2>() {
            @C8540g
            @C8570j(applier = "androidx.compose.ui.UiComposable")
            /* renamed from: a */
            public final void mo81458a(@C12579k C2496k kVar, int i, @C12580l C8592o oVar, int i2) {
                Intrinsics.checkNotNullParameter(kVar, "$this$items");
                if ((i2 & 641) != 128 || !oVar.mo15011p()) {
                    if (ComposerKt.m29813g0()) {
                        ComposerKt.m29845w0(-1587918647, i2, -1, "com.carrefour.fid.android.product.presentation.ui.facet.facets.LoadingScreen.<anonymous>.<anonymous>.<anonymous> (FacetStateful.kt:366)");
                    }
                    FacetStatefulKt.m117376d(new Filter.CheckboxFilter(C38102a.m157521b(""), "", false, CollectionsKt__CollectionsKt.m40441E(), false, (DefaultConstructorMarker) null), true, lVar2, oVar, ((i2 << 3) & 896) | 56);
                    if (ComposerKt.m29813g0()) {
                        ComposerKt.m29843v0();
                        return;
                    }
                    return;
                }
                oVar.mo14958a0();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                mo81458a((C2496k) obj, ((Number) obj2).intValue(), (C8592o) obj3, ((Number) obj4).intValue());
                return C11079d2.f28267a;
            }
        }), 8, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo81453a((LazyGridScope) obj);
        return C11079d2.f28267a;
    }
}
