package com.carrefour.fid.android.tracking.orders.online.additionalorder;

import kotlin.C11076d0;
import org.jetbrains.annotations.C12579k;

public interface CheckoutStepTwoTracking {

    @C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, mo22516d2 = {"Lcom/carrefour/fid/android/tracking/orders/online/additionalorder/CheckoutStepTwoTracking$LoyaltyStatus;", "", "", "key", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "b", "c", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum LoyaltyStatus {
        CARD("OK"),
        NO_LOYALTY("no-loyalty"),
        NO_CARD("no-carte");
        
        @C12579k
        private final String key;

        /* access modifiers changed from: public */
        LoyaltyStatus(String str) {
            this.key = str;
        }

        @C12579k
        /* renamed from: q */
        public final String mo84433q() {
            return this.key;
        }
    }

    /* renamed from: h */
    void mo77870h(@C12579k LoyaltyStatus loyaltyStatus);

    /* renamed from: m */
    void mo77871m();

    /* renamed from: s */
    void mo77872s();
}
