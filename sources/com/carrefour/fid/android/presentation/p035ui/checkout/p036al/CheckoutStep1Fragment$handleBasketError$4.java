package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import androidx.navigation.NavController;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.core.p057io.BasketValidationForAddressThrowable;
import com.carrefour.fid.android.domain.models.AddressCategory;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.shared.navigation.C28796c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1Fragment$handleBasketError$4 */
public final class CheckoutStep1Fragment$handleBasketError$4 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ Throwable $throwable;
    final /* synthetic */ CheckoutStep1Fragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep1Fragment$handleBasketError$4(CheckoutStep1Fragment checkoutStep1Fragment, Throwable th) {
        super(0);
        this.this$0 = checkoutStep1Fragment;
        this.$throwable = th;
    }

    public final void invoke() {
        C28796c navigator = this.this$0.getNavigator();
        NavController a = C19736g.m91827a(this.this$0);
        Address a2 = ((BasketValidationForAddressThrowable) this.$throwable).mo108319a();
        C28796c.C28797a.m119188b(navigator, a, false, false, a2 == null ? new Address((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, AddressCategory.BILLING, 0, false, 0.0d, 0.0d, (Boolean) null, (String) null, 1040383, (DefaultConstructorMarker) null) : a2, (String) null, 22, (Object) null);
    }
}
