package com.carrefour.fid.android.loyalty.presentation.viewmodels.details.mvi;

import com.carrefour.fid.android.shared.base.C28505u;
import com.carrefour.fid.android.shared.data.datastore.pref.C28633g;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/details/mvi/LoyaltyMyCard;", "", "()V", "UIState", "UserAction", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class LoyaltyMyCard {
    @C12579k
    public static final LoyaltyMyCard INSTANCE = new LoyaltyMyCard();

    @C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/details/mvi/LoyaltyMyCard$UIState;", "Lcom/carrefour/fid/android/shared/base/u$d;", "", "component1", "cardNumber", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getCardNumber", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class UIState implements C28505u.C28509d {
        @C12579k
        private final String cardNumber;

        public UIState() {
            this((String) null, 1, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ UIState copy$default(UIState uIState, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uIState.cardNumber;
            }
            return uIState.copy(str);
        }

        @C12579k
        public final String component1() {
            return this.cardNumber;
        }

        @C12579k
        public final UIState copy(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, C28633g.f70218b);
            return new UIState(str);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UIState) && Intrinsics.areEqual((Object) this.cardNumber, (Object) ((UIState) obj).cardNumber);
        }

        @C12579k
        public final String getCardNumber() {
            return this.cardNumber;
        }

        public int hashCode() {
            return this.cardNumber.hashCode();
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            String str = this.cardNumber;
            return "UIState(cardNumber=" + str + ")";
        }

        public UIState(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, C28633g.f70218b);
            this.cardNumber = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ UIState(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new String() : str);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0001\u0001\u0003¨\u0006\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/details/mvi/LoyaltyMyCard$UserAction;", "Lcom/carrefour/fid/android/shared/base/u$b;", "FetchLoyaltyCard", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/details/mvi/LoyaltyMyCard$UserAction$FetchLoyaltyCard;", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public interface UserAction extends C28505u.C28507b {

        @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/details/mvi/LoyaltyMyCard$UserAction$FetchLoyaltyCard;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/details/mvi/LoyaltyMyCard$UserAction;", "()V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class FetchLoyaltyCard implements UserAction {
            @C12579k
            public static final FetchLoyaltyCard INSTANCE = new FetchLoyaltyCard();

            private FetchLoyaltyCard() {
            }
        }
    }

    private LoyaltyMyCard() {
    }
}
