package com.carrefour.fid.android.presentation.p035ui.product.search;

import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListViewModel;
import com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.C27323c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12088q3;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.product.search.ProductSearchWithListFragment$onViewCreated$1", mo22502f = "ProductSearchWithListFragment.kt", mo22503i = {}, mo22504l = {142}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nProductSearchWithListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductSearchWithListFragment.kt\ncom/carrefour/fid/android/presentation/ui/product/search/ProductSearchWithListFragment$onViewCreated$1\n+ 2 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n*L\n1#1,390:1\n168#2,7:391\n183#2,6:398\n*S KotlinDebug\n*F\n+ 1 ProductSearchWithListFragment.kt\ncom/carrefour/fid/android/presentation/ui/product/search/ProductSearchWithListFragment$onViewCreated$1\n*L\n138#1:391,7\n139#1:398,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.search.ProductSearchWithListFragment$onViewCreated$1 */
public final class ProductSearchWithListFragment$onViewCreated$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ ProductSearchWithListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductSearchWithListFragment$onViewCreated$1(ProductSearchWithListFragment productSearchWithListFragment, C11045c<? super ProductSearchWithListFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.this$0 = productSearchWithListFragment;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new ProductSearchWithListFragment$onViewCreated$1(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            ProductSearchWithListFragment productSearchWithListFragment = this.this$0;
            ProductSearchWithListViewModel X0 = productSearchWithListFragment.mo74371o1();
            ProductSearchWithListFragment productSearchWithListFragment2 = this.this$0;
            C19499w viewLifecycleOwner = productSearchWithListFragment.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
            C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new C25543x20349a40(productSearchWithListFragment, X0, (C11045c) null, productSearchWithListFragment2), 3, (Object) null);
            ProductSearchWithListFragment productSearchWithListFragment3 = this.this$0;
            ProductSearchWithListViewModel X02 = productSearchWithListFragment3.mo74371o1();
            ProductSearchWithListFragment productSearchWithListFragment4 = this.this$0;
            C19499w viewLifecycleOwner2 = productSearchWithListFragment3.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
            C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new C25538x3f3cea09(productSearchWithListFragment3, X02, (C11045c) null, productSearchWithListFragment4), 3, (Object) null);
            this.label = 1;
            if (C12088q3.m48293a(this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.mo74371o1().sendIntent(C27323c.C27332d.C27333a.f66375b);
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ProductSearchWithListFragment$onViewCreated$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
