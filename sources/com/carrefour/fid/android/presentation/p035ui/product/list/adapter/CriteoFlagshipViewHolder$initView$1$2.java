package com.carrefour.fid.android.presentation.p035ui.product.list.adapter;

import com.carrefour.fid.android.presentation.models.CriteoFlagshipModel;
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

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.product.list.adapter.CriteoFlagshipViewHolder$initView$1$2", mo22502f = "OfferListViewHolder.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"", "position", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.list.adapter.CriteoFlagshipViewHolder$initView$1$2 */
public final class CriteoFlagshipViewHolder$initView$1$2 extends SuspendLambda implements C11304p<Integer, C11045c<? super C11079d2>, Object> {
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ CriteoFlagshipViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CriteoFlagshipViewHolder$initView$1$2(CriteoFlagshipViewHolder criteoFlagshipViewHolder, C11045c<? super CriteoFlagshipViewHolder$initView$1$2> cVar) {
        super(2, cVar);
        this.this$0 = criteoFlagshipViewHolder;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        CriteoFlagshipViewHolder$initView$1$2 criteoFlagshipViewHolder$initView$1$2 = new CriteoFlagshipViewHolder$initView$1$2(this.this$0, cVar);
        criteoFlagshipViewHolder$initView$1$2.I$0 = ((Number) obj).intValue();
        return criteoFlagshipViewHolder$initView$1$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object mo74164g(int i, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CriteoFlagshipViewHolder$initView$1$2) create(Integer.valueOf(i), cVar)).invokeSuspend(C11079d2.f28267a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo74164g(((Number) obj).intValue(), (C11045c) obj2);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            int i = this.I$0;
            CriteoFlagshipModel d = this.this$0.f62635h;
            if (d != null) {
                CriteoFlagshipViewHolder criteoFlagshipViewHolder = this.this$0;
                d.mo121470i(i);
                criteoFlagshipViewHolder.f62632e.invoke(d);
            }
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
