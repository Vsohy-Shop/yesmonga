package com.carrefour.fid.android.product.presentation.viewmodel.list;

import com.carrefour.fid.android.core.paging.C36328a;
import com.carrefour.fid.android.domain.models.C38184v;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.product.presentation.models.C27670g;
import com.carrefour.fid.android.shared.paging.C28851c;
import java.util.Map;
import java.util.Set;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$toPresentationModel$1", mo22502f = "PlpViewModel.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00002\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/paging/a;", "Lcom/carrefour/fid/android/domain/models/v;", "pagingData", "", "", "criteoPositions", "", "Lcom/carrefour/fid/android/domain/models/product/Gtin;", "mixingOverlays", "Lcom/carrefour/fid/android/product/presentation/models/g;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class PlpViewModel$toPresentationModel$1 extends SuspendLambda implements C11306r<C36328a<? extends C38184v>, Map<Integer, ? extends Integer>, Set<? extends Gtin>, C11045c<? super C36328a<C27670g>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ PlpViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlpViewModel$toPresentationModel$1(PlpViewModel plpViewModel, C11045c<? super PlpViewModel$toPresentationModel$1> cVar) {
        super(4, cVar);
        this.this$0 = plpViewModel;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C36328a<? extends C38184v> aVar, @C12579k Map<Integer, Integer> map, @C12579k Set<Gtin> set, @C12580l C11045c<? super C36328a<C27670g>> cVar) {
        PlpViewModel$toPresentationModel$1 plpViewModel$toPresentationModel$1 = new PlpViewModel$toPresentationModel$1(this.this$0, cVar);
        plpViewModel$toPresentationModel$1.L$0 = aVar;
        plpViewModel$toPresentationModel$1.L$1 = map;
        plpViewModel$toPresentationModel$1.L$2 = set;
        return plpViewModel$toPresentationModel$1.invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            final Map map = (Map) this.L$1;
            final Set set = (Set) this.L$2;
            final PlpViewModel plpViewModel = this.this$0;
            return C28851c.m119328a((C36328a) this.L$0, new C11300l<?, C27670g>() {
                @C12579k
                /* renamed from: a */
                public final C27670g invoke(@C12579k C38184v vVar) {
                    Intrinsics.checkNotNullParameter(vVar, "it");
                    return plpViewModel.mo81921M0(vVar, map, set);
                }
            });
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
