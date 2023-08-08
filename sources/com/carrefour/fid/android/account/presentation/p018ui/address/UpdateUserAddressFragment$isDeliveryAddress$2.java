package com.carrefour.fid.android.account.presentation.p018ui.address;

import com.carrefour.fid.android.domain.models.AddressCategory;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.account.presentation.ui.address.UpdateUserAddressFragment$isDeliveryAddress$2 */
public final class UpdateUserAddressFragment$isDeliveryAddress$2 extends Lambda implements C11289a<Boolean> {
    final /* synthetic */ UpdateUserAddressFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateUserAddressFragment$isDeliveryAddress$2(UpdateUserAddressFragment updateUserAddressFragment) {
        super(0);
        this.this$0 = updateUserAddressFragment;
    }

    @C12579k
    public final Boolean invoke() {
        return Boolean.valueOf(this.this$0.mo31820m1().mo31919j() == AddressCategory.DELIVERY);
    }
}
