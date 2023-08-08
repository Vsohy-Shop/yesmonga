package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.map;

import android.content.Context;
import com.carrefour.fid.android.shared.util.C28951s;
import com.contentsquare.android.api.C14092c;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointsMapFragment$bottomPadding$2 */
public final class PickupPointsMapFragment$bottomPadding$2 extends Lambda implements C11289a<Integer> {
    final /* synthetic */ PickupPointsMapFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PickupPointsMapFragment$bottomPadding$2(PickupPointsMapFragment pickupPointsMapFragment) {
        super(0);
        this.this$0 = pickupPointsMapFragment;
    }

    @C12579k
    public final Integer invoke() {
        C28951s sVar = C28951s.f70964a;
        Context applicationContext = this.this$0.getApplication().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "application.applicationContext");
        return Integer.valueOf(sVar.mo84277c(C14092c.f34554S, applicationContext));
    }
}
