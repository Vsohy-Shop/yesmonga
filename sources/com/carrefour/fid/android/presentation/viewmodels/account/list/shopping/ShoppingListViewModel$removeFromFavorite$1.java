package com.carrefour.fid.android.presentation.viewmodels.account.list.shopping;

import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37684e;
import com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38032c;
import com.carrefour.fid.android.presentation.p035ui.account.list.shopping.C23081i;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.channels.C11744g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel$removeFromFavorite$1", mo22502f = "ShoppingListViewModel.kt", mo22503i = {}, mo22504l = {103, 104}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ShoppingListViewModel$removeFromFavorite$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ String $gtin;
    Object L$0;
    int label;
    final /* synthetic */ ShoppingListViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShoppingListViewModel$removeFromFavorite$1(ShoppingListViewModel shoppingListViewModel, String str, C11045c<? super ShoppingListViewModel$removeFromFavorite$1> cVar) {
        super(2, cVar);
        this.this$0 = shoppingListViewModel;
        this.$gtin = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new ShoppingListViewModel$removeFromFavorite$1(this.this$0, this.$gtin, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C37684e e0 = this.this$0.f63351b;
            C38032c cVar = new C38032c(this.$gtin, (String) null, (String) null, 6, (DefaultConstructorMarker) null);
            this.label = 1;
            obj2 = e0.m172966invokegIAlus(cVar, this);
            if (obj2 == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
        } else if (i == 2) {
            C11661u0.m45747n(obj);
            return C11079d2.f28267a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ShoppingListViewModel shoppingListViewModel = this.this$0;
        Throwable e = Result.m38705e(obj2);
        if (e != null) {
            C11744g g0 = shoppingListViewModel.f63356g;
            C23081i.C23082a aVar = new C23081i.C23082a(e);
            this.L$0 = obj2;
            this.label = 2;
            if (g0.mo23757h0(aVar, this) == h) {
                return h;
            }
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ShoppingListViewModel$removeFromFavorite$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
