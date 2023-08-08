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
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.design.components.widgets.SearchBarComponent$initView$1$2", mo22502f = "SearchBarComponent.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"", "it", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SearchBarComponent$initView$1$2 extends SuspendLambda implements C11304p<String, C11045c<? super C11079d2>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SearchBarComponent this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchBarComponent$initView$1$2(SearchBarComponent searchBarComponent, C11045c<? super SearchBarComponent$initView$1$2> cVar) {
        super(2, cVar);
        this.this$0 = searchBarComponent;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        SearchBarComponent$initView$1$2 searchBarComponent$initView$1$2 = new SearchBarComponent$initView$1$2(this.this$0, cVar);
        searchBarComponent$initView$1$2.L$0 = obj;
        return searchBarComponent$initView$1$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k String str, @C12580l C11045c<? super C11079d2> cVar) {
        return ((SearchBarComponent$initView$1$2) create(str, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            String str = (String) this.L$0;
            C11300l<String, C11079d2> onInputChangeListener = this.this$0.getOnInputChangeListener();
            if (onInputChangeListener == null) {
                return null;
            }
            onInputChangeListener.invoke(str);
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
