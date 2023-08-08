package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.map;

import android.location.Address;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.domain.models.LatLon;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.PickupPointsMapViewModel;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C11965h;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointsMapFragment$performSearch$1", mo22502f = "PickupPointsMapFragment.kt", mo22503i = {}, mo22504l = {467, 476}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointsMapFragment$performSearch$1 */
public final class PickupPointsMapFragment$performSearch$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ String $search;
    int label;
    final /* synthetic */ PickupPointsMapFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PickupPointsMapFragment$performSearch$1(PickupPointsMapFragment pickupPointsMapFragment, String str, C11045c<? super PickupPointsMapFragment$performSearch$1> cVar) {
        super(2, cVar);
        this.this$0 = pickupPointsMapFragment;
        this.$search = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new PickupPointsMapFragment$performSearch$1(this.this$0, this.$search, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            CoroutineDispatcher c = C11768d1.m46781c();
            PickupPointsMapFragment$performSearch$1$addressList$1 pickupPointsMapFragment$performSearch$1$addressList$1 = new PickupPointsMapFragment$performSearch$1$addressList$1(this.this$0, this.$search, (C11045c<? super PickupPointsMapFragment$performSearch$1$addressList$1>) null);
            this.label = 1;
            obj2 = C11965h.m47673h(c, pickupPointsMapFragment$performSearch$1$addressList$1, this);
            if (obj2 == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = obj;
        } else if (i == 2) {
            C11661u0.m45747n(obj);
            return C11079d2.f28267a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List list = (List) obj2;
        if (list == null || !(!list.isEmpty())) {
            PickupPointsMapFragment pickupPointsMapFragment = this.this$0;
            NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
            String string = pickupPointsMapFragment.getString(R.string.general_error_parameters_server_not_responding_03);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.gener…server_not_responding_03)");
            FragmentKt.m118811B(pickupPointsMapFragment, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
            return C11079d2.f28267a;
        }
        Address address = (Address) CollectionsKt___CollectionsKt.m40706w2(list);
        PickupPointsMapViewModel T0 = this.this$0.mo69439i1();
        LatLon latLon = new LatLon(address.getLatitude(), address.getLongitude());
        this.label = 2;
        if (T0.mo76067c0(latLon, true, this) == h) {
            return h;
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((PickupPointsMapFragment$performSearch$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
