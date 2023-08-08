package com.carrefour.fid.android.product.presentation.viewmodel.list;

import com.carrefour.fid.android.core.paging.C36328a;
import com.carrefour.fid.android.core.paging.C36334b;
import com.carrefour.fid.android.product.presentation.models.C27670g;
import com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11911i;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$launchGetProductFlow$2", mo22502f = "PlpViewModel.kt", mo22503i = {}, mo22504l = {264, 266}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class PlpViewModel$launchGetProductFlow$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11911i<C36334b> $eventFlow;
    final /* synthetic */ ProductListSource $source;
    Object L$0;
    int label;
    final /* synthetic */ PlpViewModel this$0;

    /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$launchGetProductFlow$2$a */
    public static final class C28192a implements C11908f<C36328a<C27670g>> {

        /* renamed from: a */
        public final /* synthetic */ PlpViewModel f68290a;

        public C28192a(PlpViewModel plpViewModel) {
            this.f68290a = plpViewModel;
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(@C12579k C36328a<C27670g> aVar, @C12579k C11045c<? super C11079d2> cVar) {
            int i;
            if (!this.f68290a.mo81925v0(aVar)) {
                if (aVar.mo108395h().isEmpty()) {
                    this.f68290a.publishState(PlpViewModel.C28174b.C28176b.f68247b);
                } else {
                    PlpViewModel plpViewModel = this.f68290a;
                    List<C27670g> h = aVar.mo108395h();
                    boolean areEqual = Intrinsics.areEqual((Object) aVar.mo108397i(), (Object) C36328a.C36330b.C36332b.f89752a);
                    Integer k = aVar.mo108399k();
                    int i2 = 0;
                    if (k != null) {
                        i = k.intValue();
                    } else {
                        i = 0;
                    }
                    Integer l = aVar.mo108400l();
                    if (l != null) {
                        i2 = l.intValue();
                    }
                    plpViewModel.publishState(new PlpViewModel.C28174b.C28180f(h, areEqual, i, i2));
                }
            }
            return C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlpViewModel$launchGetProductFlow$2(PlpViewModel plpViewModel, ProductListSource productListSource, C11911i<C36334b> iVar, C11045c<? super PlpViewModel$launchGetProductFlow$2> cVar) {
        super(2, cVar);
        this.this$0 = plpViewModel;
        this.$source = productListSource;
        this.$eventFlow = iVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new PlpViewModel$launchGetProductFlow$2(this.this$0, this.$source, this.$eventFlow, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        PlpViewModel plpViewModel;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            plpViewModel = this.this$0;
            ProductListSource productListSource = this.$source;
            C11911i<C36334b> iVar = this.$eventFlow;
            this.L$0 = plpViewModel;
            this.label = 1;
            obj = plpViewModel.mo81923t0(productListSource, iVar, this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            plpViewModel = (PlpViewModel) this.L$0;
            C11661u0.m45747n(obj);
        } else if (i == 2) {
            C11661u0.m45747n(obj);
            return C11079d2.f28267a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C11907e s0 = plpViewModel.mo81922N0((C11907e) obj);
        C28192a aVar = new C28192a(this.this$0);
        this.L$0 = null;
        this.label = 2;
        if (s0.collect(aVar, this) == h) {
            return h;
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((PlpViewModel$launchGetProductFlow$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
