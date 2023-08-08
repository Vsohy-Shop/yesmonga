package com.carrefour.fid.android.product.presentation.viewmodel.details;

import com.carrefour.fid.android.domain.interactors.service.C37835r;
import com.carrefour.fid.android.domain.models.service.models.C38162k;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.viewmodel.details.NonFoodProductDetailsViewModel$observeServiceSelection$1", mo22502f = "NonFoodProductDetailsViewModel.kt", mo22503i = {}, mo22504l = {127, 127}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class NonFoodProductDetailsViewModel$observeServiceSelection$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ NonFoodProductDetailsViewModel this$0;

    /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.NonFoodProductDetailsViewModel$observeServiceSelection$1$a */
    public static final class C28111a implements C11908f<C38162k> {

        /* renamed from: a */
        public final /* synthetic */ NonFoodProductDetailsViewModel f68091a;

        public C28111a(NonFoodProductDetailsViewModel nonFoodProductDetailsViewModel) {
            this.f68091a = nonFoodProductDetailsViewModel;
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(@C12580l C38162k kVar, @C12579k C11045c<? super C11079d2> cVar) {
            this.f68091a.mo81701k0();
            return C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodProductDetailsViewModel$observeServiceSelection$1(NonFoodProductDetailsViewModel nonFoodProductDetailsViewModel, C11045c<? super NonFoodProductDetailsViewModel$observeServiceSelection$1> cVar) {
        super(2, cVar);
        this.this$0 = nonFoodProductDetailsViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new NonFoodProductDetailsViewModel$observeServiceSelection$1(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C37835r f0 = this.this$0.f68081b;
            this.label = 1;
            obj = f0.invoke(this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else if (i == 2) {
            C11661u0.m45747n(obj);
            return C11079d2.f28267a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C28111a aVar = new C28111a(this.this$0);
        this.label = 2;
        if (((C11907e) obj).collect(aVar, this) == h) {
            return h;
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((NonFoodProductDetailsViewModel$observeServiceSelection$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
