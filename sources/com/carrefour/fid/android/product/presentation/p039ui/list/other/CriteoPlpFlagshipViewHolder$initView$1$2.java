package com.carrefour.fid.android.product.presentation.p039ui.list.other;

import com.carrefour.fid.android.domain.models.criteo.C38004f;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.ui.list.other.CriteoPlpFlagshipViewHolder$initView$1$2", mo22502f = "CriteoPlpFlagshipViewHolder.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"", "position", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.other.CriteoPlpFlagshipViewHolder$initView$1$2 */
public final class CriteoPlpFlagshipViewHolder$initView$1$2 extends SuspendLambda implements C11304p<Integer, C11045c<? super C11079d2>, Object> {
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ CriteoPlpFlagshipViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CriteoPlpFlagshipViewHolder$initView$1$2(CriteoPlpFlagshipViewHolder criteoPlpFlagshipViewHolder, C11045c<? super CriteoPlpFlagshipViewHolder$initView$1$2> cVar) {
        super(2, cVar);
        this.this$0 = criteoPlpFlagshipViewHolder;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        CriteoPlpFlagshipViewHolder$initView$1$2 criteoPlpFlagshipViewHolder$initView$1$2 = new CriteoPlpFlagshipViewHolder$initView$1$2(this.this$0, cVar);
        criteoPlpFlagshipViewHolder$initView$1$2.I$0 = ((Number) obj).intValue();
        return criteoPlpFlagshipViewHolder$initView$1$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object mo81637g(int i, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CriteoPlpFlagshipViewHolder$initView$1$2) create(Integer.valueOf(i), cVar)).invokeSuspend(C11079d2.f28267a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo81637g(((Number) obj).intValue(), (C11045c) obj2);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            int i = this.I$0;
            C38004f d = this.this$0.f67988g;
            if (d != null) {
                this.this$0.f67985d.invoke(d, C11064a.m42620f(i));
            }
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
