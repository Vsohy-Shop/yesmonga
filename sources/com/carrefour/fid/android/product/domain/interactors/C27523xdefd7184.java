package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11305q;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.domain.interactors.ProductGetAntiInflationProductsFlowUseCase$combineProductsUseCaseFlowsAndEmitResult$2", mo22502f = "ProductGetAntiInflationProductsFlowUseCase.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00030\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/product/plp/b;", "initialProductResult", "", "alternativeProductResult", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.product.domain.interactors.ProductGetAntiInflationProductsFlowUseCase$combineProductsUseCaseFlowsAndEmitResult$2 */
public final class C27523xdefd7184 extends SuspendLambda implements C11305q<Result<? extends C38114b>, Result<? extends List<? extends C38114b>>, C11045c<? super Result<? extends List<? extends C38114b>>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public C27523xdefd7184(C11045c<? super C27523xdefd7184> cVar) {
        super(3, cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object mo79945g(@C12579k Object obj, @C12579k Object obj2, @C12580l C11045c<? super Result<? extends List<C38114b>>> cVar) {
        C27523xdefd7184 productGetAntiInflationProductsFlowUseCase$combineProductsUseCaseFlowsAndEmitResult$2 = new C27523xdefd7184(cVar);
        productGetAntiInflationProductsFlowUseCase$combineProductsUseCaseFlowsAndEmitResult$2.L$0 = Result.m38701a(obj);
        productGetAntiInflationProductsFlowUseCase$combineProductsUseCaseFlowsAndEmitResult$2.L$1 = Result.m38701a(obj2);
        return productGetAntiInflationProductsFlowUseCase$combineProductsUseCaseFlowsAndEmitResult$2.invokeSuspend(C11079d2.f28267a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo79945g(((Result) obj).mo21858l(), ((Result) obj2).mo21858l(), (C11045c) obj3);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            Object l = ((Result) this.L$0).mo21858l();
            Object l2 = ((Result) this.L$1).mo21858l();
            if (Result.m38710j(l) && Result.m38710j(l2)) {
                C11661u0.m45747n(l);
                C11661u0.m45747n(l2);
                List y4 = CollectionsKt___CollectionsKt.m40718y4(C10976s.m41419k(l), (Iterable) l2);
                Result.C10852a aVar = Result.f28060a;
                obj2 = Result.m38702b(y4);
            } else if (Result.m38709i(l)) {
                Result.C10852a aVar2 = Result.f28060a;
                obj2 = Result.m38702b(C11661u0.m45734a(new Throwable("Can not get initial product")));
            } else {
                Result.C10852a aVar3 = Result.f28060a;
                obj2 = Result.m38702b(C11661u0.m45734a(new Throwable("Can not get alternative products")));
            }
            return Result.m38701a(obj2);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
