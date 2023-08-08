package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.material.C3036d1;
import androidx.compose.material.C3052i1;
import androidx.compose.material.SnackbarDuration;
import androidx.compose.material.SnackbarHostState;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$ProductImage$3 */
public final class NonFoodProductDetailsScreenKt$ProductImage$3 extends Lambda implements C11300l<Integer, C11079d2> {
    final /* synthetic */ C3036d1 $scaffoldState;
    final /* synthetic */ C12074o0 $scope;

    @C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$ProductImage$3$1", mo22502f = "NonFoodProductDetailsScreen.kt", mo22503i = {}, mo22504l = {782}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$ProductImage$3$1 */
    public static final class C278461 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C278461(d1Var, i, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                C3052i1 b = d1Var.mo10747b().mo10434b();
                if (b != null) {
                    b.dismiss();
                }
                SnackbarHostState b2 = d1Var.mo10747b();
                String str = "Image " + i + " clicked";
                this.label = 1;
                if (SnackbarHostState.m13855e(b2, str, (String) null, (SnackbarDuration) null, this, 6, (Object) null) == h) {
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
            return ((C278461) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodProductDetailsScreenKt$ProductImage$3(C12074o0 o0Var, C3036d1 d1Var) {
        super(1);
        this.$scope = o0Var;
        this.$scaffoldState = d1Var;
    }

    /* renamed from: a */
    public final void mo80878a(final int i) {
        C12074o0 o0Var = this.$scope;
        final C3036d1 d1Var = this.$scaffoldState;
        C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new C278461((C11045c<? super C278461>) null), 3, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo80878a(((Number) obj).intValue());
        return C11079d2.f28267a;
    }
}
