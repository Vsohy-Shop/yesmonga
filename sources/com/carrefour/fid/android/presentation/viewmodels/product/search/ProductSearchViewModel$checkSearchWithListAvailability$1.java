package com.carrefour.fid.android.presentation.viewmodels.product.search;

import com.carrefour.fid.android.domain.interactors.product.search.SearchWithListRemoteConfigUseCase;
import com.carrefour.fid.android.shared.p046io.RemoteConfigThrowable;
import com.carrefour.fid.android.shared.util.C28947q;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchViewModel$checkSearchWithListAvailability$1", mo22502f = "ProductSearchViewModel.kt", mo22503i = {}, mo22504l = {157}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ProductSearchViewModel$checkSearchWithListAvailability$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ ProductSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductSearchViewModel$checkSearchWithListAvailability$1(ProductSearchViewModel productSearchViewModel, C11045c<? super ProductSearchViewModel$checkSearchWithListAvailability$1> cVar) {
        super(2, cVar);
        this.this$0 = productSearchViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new ProductSearchViewModel$checkSearchWithListAvailability$1(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object obj3;
        boolean z;
        Object h = C11063b.m42612h();
        int i = this.label;
        boolean z2 = true;
        if (i == 0) {
            C11661u0.m45747n(obj);
            SearchWithListRemoteConfigUseCase l0 = this.this$0.f66206h;
            this.label = 1;
            obj2 = l0.m173000invokeIoAF18A(this);
            if (obj2 == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ProductSearchViewModel productSearchViewModel = this.this$0;
        if (Result.m38710j(obj2)) {
            ((Boolean) obj2).booleanValue();
            C28947q n0 = productSearchViewModel.f66210l;
            if (Result.m38709i(obj2)) {
                obj3 = null;
            } else {
                obj3 = obj2;
            }
            Boolean bool = (Boolean) obj3;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            if (!z || !productSearchViewModel.mo79239C0()) {
                z2 = false;
            }
            n0.mo57493o(C11064a.m42615a(z2));
        }
        if (Result.m38705e(obj2) != null) {
            productSearchViewModel.mo83420e0().mo57493o(new RemoteConfigThrowable());
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ProductSearchViewModel$checkSearchWithListAvailability$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
