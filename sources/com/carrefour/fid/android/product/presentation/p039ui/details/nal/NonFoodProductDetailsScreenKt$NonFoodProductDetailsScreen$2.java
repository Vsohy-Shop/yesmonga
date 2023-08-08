package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.foundation.layout.C2373k;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetailsScreen$2 */
public final class NonFoodProductDetailsScreenKt$NonFoodProductDetailsScreen$2 extends Lambda implements C11305q<C2373k, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C27870j, C11079d2> $actioner;
    final /* synthetic */ C27864i $modalBottomSheetType;
    final /* synthetic */ C27899o $productData;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodProductDetailsScreenKt$NonFoodProductDetailsScreen$2(C27864i iVar, int i, C27899o oVar, C11300l<? super C27870j, C11079d2> lVar) {
        super(3);
        this.$modalBottomSheetType = iVar;
        this.$$dirty = i;
        this.$productData = oVar;
        this.$actioner = lVar;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo80864a(@C12579k C2373k kVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(kVar, "$this$ModalBottomSheetComponent");
        if ((i & 81) != 16 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-602813882, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreen.<anonymous> (NonFoodProductDetailsScreen.kt:331)");
            }
            C27864i iVar = this.$modalBottomSheetType;
            final C27899o oVar2 = this.$productData;
            final C11300l<C27870j, C11079d2> lVar = this.$actioner;
            ModalBottomSheetContentKt.m116821a(iVar, (C8767m) null, new C11300l<C27864i, C11079d2>() {
                /* renamed from: a */
                public final void mo80865a(@C12579k C27864i iVar) {
                    Intrinsics.checkNotNullParameter(iVar, "it");
                    NonFoodProductDetailsScreenKt.m116849L(iVar, oVar2.mo81088h(), oVar2.mo81091j(), lVar);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo80865a((C27864i) obj);
                    return C11079d2.f28267a;
                }
            }, oVar, (this.$$dirty >> 6) & 14, 2);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo80864a((C2373k) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
