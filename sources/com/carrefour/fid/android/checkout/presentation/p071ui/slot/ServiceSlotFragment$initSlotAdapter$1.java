package com.carrefour.fid.android.checkout.presentation.p071ui.slot;

import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.checkout.presentation.p071ui.slot.adapter.C39913a;
import com.carrefour.fid.android.checkout.presentation.p071ui.slot.model.C39936b;
import com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.checkout.presentation.ui.slot.ServiceSlotFragment$initSlotAdapter$1", mo22502f = "ServiceSlotFragment.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.checkout.presentation.ui.slot.ServiceSlotFragment$initSlotAdapter$1 */
public final class ServiceSlotFragment$initSlotAdapter$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ boolean $isProductThresholdExceeded;
    final /* synthetic */ boolean $isYieldEligible;
    final /* synthetic */ String $startHour;
    int label;
    final /* synthetic */ ServiceSlotFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceSlotFragment$initSlotAdapter$1(ServiceSlotFragment serviceSlotFragment, boolean z, String str, boolean z2, C11045c<? super ServiceSlotFragment$initSlotAdapter$1> cVar) {
        super(2, cVar);
        this.this$0 = serviceSlotFragment;
        this.$isProductThresholdExceeded = z;
        this.$startHour = str;
        this.$isYieldEligible = z2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new ServiceSlotFragment$initSlotAdapter$1(this.this$0, this.$isProductThresholdExceeded, this.$startHour, this.$isYieldEligible, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            RecyclerView recyclerView = ServiceSlotFragment.m162567R0(this.this$0).f101617e;
            boolean z = this.$isProductThresholdExceeded;
            String str = this.$startHour;
            Intrinsics.checkNotNullExpressionValue(str, "startHour");
            C39936b bVar = new C39936b(0, z, str, 1, (DefaultConstructorMarker) null);
            boolean z2 = this.$isYieldEligible;
            boolean s = this.this$0.mo131506Z0().mo131623s();
            final ServiceSlotFragment serviceSlotFragment = this.this$0;
            recyclerView.setAdapter(new C39913a((List) null, bVar, z2, s, new C11300l<Integer, C11079d2>() {
                /* renamed from: a */
                public final void mo131542a(int i) {
                    serviceSlotFragment.mo131508b1().sendIntent(new C39964a.C39977d.C39981d(i));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo131542a(((Number) obj).intValue());
                    return C11079d2.f28267a;
                }
            }, 1, (DefaultConstructorMarker) null));
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ServiceSlotFragment$initSlotAdapter$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
