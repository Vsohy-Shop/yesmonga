package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.SnackBarComponentKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nNonFoodProductDetailsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonFoodProductDetailsScreen.kt\ncom/carrefour/fid/android/product/presentation/ui/details/nal/NonFoodProductDetailsScreenKt$NonFoodProductDetailsScreen$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1095:1\n154#2:1096\n*S KotlinDebug\n*F\n+ 1 NonFoodProductDetailsScreen.kt\ncom/carrefour/fid/android/product/presentation/ui/details/nal/NonFoodProductDetailsScreenKt$NonFoodProductDetailsScreen$1\n*L\n350#1:1096\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetailsScreen$1 */
public final class NonFoodProductDetailsScreenKt$NonFoodProductDetailsScreen$1 extends Lambda implements C11305q<SnackbarHostState, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C27906t $errorVariant;
    final /* synthetic */ SnackbarHostState $snackbarHostState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodProductDetailsScreenKt$NonFoodProductDetailsScreen$1(C27906t tVar, SnackbarHostState snackbarHostState, int i) {
        super(3);
        this.$errorVariant = tVar;
        this.$snackbarHostState = snackbarHostState;
        this.$$dirty = i;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo80863a(@C12579k SnackbarHostState snackbarHostState, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(snackbarHostState, "it");
        if ((i & 81) != 16 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1572992261, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreen.<anonymous> (NonFoodProductDetailsScreen.kt:344)");
            }
            C27906t tVar = this.$errorVariant;
            if (tVar != null) {
                C8592o oVar2 = oVar;
                SnackBarComponentKt.m117278a(this.$snackbarHostState, tVar, PaddingKt.m10024k(C8767m.f23478j, C16483g.m74435M((float) 16)), oVar2, ((this.$$dirty >> 18) & 14) | C22132b.f56831b, 0);
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo80863a((SnackbarHostState) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
