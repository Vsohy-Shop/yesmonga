package com.carrefour.fid.android.presentation.p035ui.product.list.adapter;

import androidx.recyclerview.widget.RecyclerView;
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

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.product.list.adapter.CriteoFlagshipViewHolder$initView$1$1", mo22502f = "OfferListViewHolder.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"", "it", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.list.adapter.CriteoFlagshipViewHolder$initView$1$1 */
public final class CriteoFlagshipViewHolder$initView$1$1 extends SuspendLambda implements C11304p<Integer, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ RecyclerView $this_apply;
    /* synthetic */ int I$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CriteoFlagshipViewHolder$initView$1$1(RecyclerView recyclerView, C11045c<? super CriteoFlagshipViewHolder$initView$1$1> cVar) {
        super(2, cVar);
        this.$this_apply = recyclerView;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        CriteoFlagshipViewHolder$initView$1$1 criteoFlagshipViewHolder$initView$1$1 = new CriteoFlagshipViewHolder$initView$1$1(this.$this_apply, cVar);
        criteoFlagshipViewHolder$initView$1$1.I$0 = ((Number) obj).intValue();
        return criteoFlagshipViewHolder$initView$1$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object mo74163g(int i, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CriteoFlagshipViewHolder$initView$1$1) create(Integer.valueOf(i), cVar)).invokeSuspend(C11079d2.f28267a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo74163g(((Number) obj).intValue(), (C11045c) obj2);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            if (this.I$0 == 1) {
                this.$this_apply.setFocusableInTouchMode(true);
            }
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
