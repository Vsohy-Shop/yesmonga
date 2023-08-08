package com.carrefour.fid.android.design.components.widgets;

import com.carrefour.fid.android.design.components.databinding.C37074r0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.design.components.widgets.SearchBarComponent$initView$1$1", mo22502f = "SearchBarComponent.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"", "input", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SearchBarComponent$initView$1$1 extends SuspendLambda implements C11304p<String, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C37074r0 $this_apply;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchBarComponent$initView$1$1(C37074r0 r0Var, C11045c<? super SearchBarComponent$initView$1$1> cVar) {
        super(2, cVar);
        this.$this_apply = r0Var;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        SearchBarComponent$initView$1$1 searchBarComponent$initView$1$1 = new SearchBarComponent$initView$1$1(this.$this_apply, cVar);
        searchBarComponent$initView$1$1.L$0 = obj;
        return searchBarComponent$initView$1$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k String str, @C12580l C11045c<? super C11079d2> cVar) {
        return ((SearchBarComponent$initView$1$1) create(str, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        boolean z;
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            if (((String) this.L$0).length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.$this_apply.f92799c.setVisibility(8);
                this.$this_apply.f92800d.setVisibility(0);
            } else {
                this.$this_apply.f92799c.setVisibility(0);
                this.$this_apply.f92800d.setVisibility(8);
            }
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
