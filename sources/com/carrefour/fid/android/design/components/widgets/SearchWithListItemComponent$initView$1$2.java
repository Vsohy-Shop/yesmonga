package com.carrefour.fid.android.design.components.widgets;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C11965h;
import kotlinx.coroutines.C12064m2;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.design.components.widgets.SearchWithListItemComponent$initView$1$2", mo22502f = "SearchWithListItemComponent.kt", mo22503i = {}, mo22504l = {76}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"", "it", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SearchWithListItemComponent$initView$1$2 extends SuspendLambda implements C11304p<String, C11045c<? super C11079d2>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SearchWithListItemComponent this$0;

    @C11067d(mo22501c = "com.carrefour.fid.android.design.components.widgets.SearchWithListItemComponent$initView$1$2$1", mo22502f = "SearchWithListItemComponent.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.design.components.widgets.SearchWithListItemComponent$initView$1$2$1 */
    public static final class C371651 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C371651(searchWithListItemComponent, str, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            C11063b.m42612h();
            if (this.label == 0) {
                C11661u0.m45747n(obj);
                C11300l<String, C11079d2> onEditTextEditionFinishedListener = searchWithListItemComponent.getOnEditTextEditionFinishedListener();
                if (onEditTextEditionFinishedListener == null) {
                    return null;
                }
                onEditTextEditionFinishedListener.invoke(str);
                return C11079d2.f28267a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @C12580l
        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C371651) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchWithListItemComponent$initView$1$2(SearchWithListItemComponent searchWithListItemComponent, C11045c<? super SearchWithListItemComponent$initView$1$2> cVar) {
        super(2, cVar);
        this.this$0 = searchWithListItemComponent;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        SearchWithListItemComponent$initView$1$2 searchWithListItemComponent$initView$1$2 = new SearchWithListItemComponent$initView$1$2(this.this$0, cVar);
        searchWithListItemComponent$initView$1$2.L$0 = obj;
        return searchWithListItemComponent$initView$1$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k String str, @C12580l C11045c<? super C11079d2> cVar) {
        return ((SearchWithListItemComponent$initView$1$2) create(str, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            final String str = (String) this.L$0;
            C12064m2 e = C11768d1.m46783e();
            final SearchWithListItemComponent searchWithListItemComponent = this.this$0;
            C371651 r3 = new C371651((C11045c<? super C371651>) null);
            this.label = 1;
            obj = C11965h.m47673h(e, r3, this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
