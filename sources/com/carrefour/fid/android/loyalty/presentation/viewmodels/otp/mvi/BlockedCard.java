package com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi;

import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import com.carrefour.fid.android.shared.base.C28505u;
import com.carrefour.fid.android.shared.data.datastore.pref.C28633g;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/BlockedCard;", "", "()V", "UIState", "UiEvent", "UserAction", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BlockedCard {
    @C12579k
    public static final BlockedCard INSTANCE = new BlockedCard();

    @C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0004\u0010\u000e¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/BlockedCard$UIState;", "Lcom/carrefour/fid/android/shared/base/u$d;", "", "component1", "isLoading", "copy", "", "toString", "", "hashCode", "", "other", "equals", "Z", "()Z", "<init>", "(Z)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class UIState implements C28505u.C28509d {
        private final boolean isLoading;

        public UIState() {
            this(false, 1, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ UIState copy$default(UIState uIState, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = uIState.isLoading;
            }
            return uIState.copy(z);
        }

        public final boolean component1() {
            return this.isLoading;
        }

        @C12579k
        public final UIState copy(boolean z) {
            return new UIState(z);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UIState) && this.isLoading == ((UIState) obj).isLoading;
        }

        public int hashCode() {
            boolean z = this.isLoading;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            boolean z = this.isLoading;
            return "UIState(isLoading=" + z + ")";
        }

        public UIState(boolean z) {
            this.isLoading = z;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ UIState(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/BlockedCard$UiEvent;", "Lcom/carrefour/fid/android/shared/base/u$a;", "ErrorDisplayChannels", "ShowDisplayChannels", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/BlockedCard$UiEvent$ErrorDisplayChannels;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/BlockedCard$UiEvent$ShowDisplayChannels;", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public interface UiEvent extends C28505u.C28506a {

        @C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/BlockedCard$UiEvent$ErrorDisplayChannels;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/BlockedCard$UiEvent;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class ErrorDisplayChannels implements UiEvent {
            @C12579k
            private final Throwable throwable;

            public ErrorDisplayChannels(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.throwable = th;
            }

            public static /* synthetic */ ErrorDisplayChannels copy$default(ErrorDisplayChannels errorDisplayChannels, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = errorDisplayChannels.throwable;
                }
                return errorDisplayChannels.copy(th);
            }

            @C12579k
            public final Throwable component1() {
                return this.throwable;
            }

            @C12579k
            public final ErrorDisplayChannels copy(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new ErrorDisplayChannels(th);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ErrorDisplayChannels) && Intrinsics.areEqual((Object) this.throwable, (Object) ((ErrorDisplayChannels) obj).throwable);
            }

            @C12579k
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.throwable;
                return "ErrorDisplayChannels(throwable=" + th + ")";
            }
        }

        @C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/BlockedCard$UiEvent$ShowDisplayChannels;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/BlockedCard$UiEvent;", "cardNumber", "", "(Ljava/lang/String;)V", "getCardNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class ShowDisplayChannels implements UiEvent {
            @C12579k
            private final String cardNumber;

            public ShowDisplayChannels(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, C28633g.f70218b);
                this.cardNumber = str;
            }

            public static /* synthetic */ ShowDisplayChannels copy$default(ShowDisplayChannels showDisplayChannels, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = showDisplayChannels.cardNumber;
                }
                return showDisplayChannels.copy(str);
            }

            @C12579k
            public final String component1() {
                return this.cardNumber;
            }

            @C12579k
            public final ShowDisplayChannels copy(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, C28633g.f70218b);
                return new ShowDisplayChannels(str);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowDisplayChannels) && Intrinsics.areEqual((Object) this.cardNumber, (Object) ((ShowDisplayChannels) obj).cardNumber);
            }

            @C12579k
            public final String getCardNumber() {
                return this.cardNumber;
            }

            public int hashCode() {
                return this.cardNumber.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.cardNumber;
                return "ShowDisplayChannels(cardNumber=" + str + ")";
            }
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0001\u0001\u0003¨\u0006\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/BlockedCard$UserAction;", "Lcom/carrefour/fid/android/shared/base/u$b;", "FetchUserChannels", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/BlockedCard$UserAction$FetchUserChannels;", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public interface UserAction extends C28505u.C28507b {

        @C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/BlockedCard$UserAction$FetchUserChannels;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/BlockedCard$UserAction;", "loyaltyCardNumber", "", "(Ljava/lang/String;)V", "getLoyaltyCardNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class FetchUserChannels implements UserAction {
            @C12579k
            private final String loyaltyCardNumber;

            public FetchUserChannels(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
                this.loyaltyCardNumber = str;
            }

            public static /* synthetic */ FetchUserChannels copy$default(FetchUserChannels fetchUserChannels, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = fetchUserChannels.loyaltyCardNumber;
                }
                return fetchUserChannels.copy(str);
            }

            @C12579k
            public final String component1() {
                return this.loyaltyCardNumber;
            }

            @C12579k
            public final FetchUserChannels copy(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
                return new FetchUserChannels(str);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FetchUserChannels) && Intrinsics.areEqual((Object) this.loyaltyCardNumber, (Object) ((FetchUserChannels) obj).loyaltyCardNumber);
            }

            @C12579k
            public final String getLoyaltyCardNumber() {
                return this.loyaltyCardNumber;
            }

            public int hashCode() {
                return this.loyaltyCardNumber.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.loyaltyCardNumber;
                return "FetchUserChannels(loyaltyCardNumber=" + str + ")";
            }
        }
    }

    private BlockedCard() {
    }
}
