package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27864i;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$handleProductActions$1", mo22502f = "NonFoodProductDetailsScreen.kt", mo22503i = {}, mo22504l = {632}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$handleProductActions$1 */
public final class NonFoodProductDetailsScreenKt$handleProductActions$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ ModalBottomSheetState $modalBottomSheetState;
    final /* synthetic */ C8700z0<C27864i> $modalBottomSheetType;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodProductDetailsScreenKt$handleProductActions$1(C8700z0<C27864i> z0Var, ModalBottomSheetState modalBottomSheetState, C11045c<? super NonFoodProductDetailsScreenKt$handleProductActions$1> cVar) {
        super(2, cVar);
        this.$modalBottomSheetType = z0Var;
        this.$modalBottomSheetState = modalBottomSheetState;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new NonFoodProductDetailsScreenKt$handleProductActions$1(this.$modalBottomSheetType, this.$modalBottomSheetState, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            this.$modalBottomSheetType.setValue(C27864i.C27869e.f67491a);
            ModalBottomSheetState modalBottomSheetState = this.$modalBottomSheetState;
            this.label = 1;
            if (modalBottomSheetState.mo10296p(this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((NonFoodProductDetailsScreenKt$handleProductActions$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
