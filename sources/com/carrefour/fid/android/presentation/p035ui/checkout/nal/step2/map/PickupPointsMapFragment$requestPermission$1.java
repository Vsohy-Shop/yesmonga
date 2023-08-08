package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.map;

import android.os.Looper;
import com.google.android.gms.location.C30327e;
import com.google.android.gms.location.C30362m;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointsMapFragment$requestPermission$1 */
public final class PickupPointsMapFragment$requestPermission$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ PickupPointsMapFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PickupPointsMapFragment$requestPermission$1(PickupPointsMapFragment pickupPointsMapFragment) {
        super(0);
        this.this$0 = pickupPointsMapFragment;
    }

    public final void invoke() {
        PickupPointsMapFragment pickupPointsMapFragment = this.this$0;
        C30327e b = C30362m.m122188b(pickupPointsMapFragment.getApplication().getApplicationContext());
        PickupPointsMapFragment pickupPointsMapFragment2 = this.this$0;
        b.mo85679N(pickupPointsMapFragment2.f59739K0, pickupPointsMapFragment2.f59741M0, (Looper) null);
        pickupPointsMapFragment.f59738J0 = b;
        this.this$0.f59743O0 = true;
        this.this$0.enableLocationButtonOnMap();
        this.this$0.initGoogleMap();
    }
}
