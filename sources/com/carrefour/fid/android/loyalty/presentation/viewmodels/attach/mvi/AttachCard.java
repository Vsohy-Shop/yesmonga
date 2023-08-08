package com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi;

import com.carrefour.fid.android.shared.base.C28505u;
import com.carrefour.fid.android.shared.data.datastore.pref.C28633g;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard;", "", "()V", "UiEvent", "UiState", "UserAction", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AttachCard {
    @C12579k
    public static final AttachCard INSTANCE = new AttachCard();

    @C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiEvent;", "Lcom/carrefour/fid/android/shared/base/u$a;", "ActiveFidCardError", "CardDetected", "NavigateToSecretCode", "NetworkError", "TerminalCardError", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiEvent$ActiveFidCardError;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiEvent$CardDetected;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiEvent$NavigateToSecretCode;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiEvent$NetworkError;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiEvent$TerminalCardError;", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public interface UiEvent extends C28505u.C28506a {

        @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiEvent$ActiveFidCardError;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiEvent;", "()V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class ActiveFidCardError implements UiEvent {
            @C12579k
            public static final ActiveFidCardError INSTANCE = new ActiveFidCardError();

            private ActiveFidCardError() {
            }
        }

        @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiEvent$CardDetected;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiEvent;", "()V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class CardDetected implements UiEvent {
            @C12579k
            public static final CardDetected INSTANCE = new CardDetected();

            private CardDetected() {
            }
        }

        @C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiEvent$NavigateToSecretCode;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiEvent;", "card", "", "(Ljava/lang/String;)V", "getCard", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class NavigateToSecretCode implements UiEvent {
            @C12579k
            private final String card;

            public NavigateToSecretCode(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "card");
                this.card = str;
            }

            public static /* synthetic */ NavigateToSecretCode copy$default(NavigateToSecretCode navigateToSecretCode, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = navigateToSecretCode.card;
                }
                return navigateToSecretCode.copy(str);
            }

            @C12579k
            public final String component1() {
                return this.card;
            }

            @C12579k
            public final NavigateToSecretCode copy(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "card");
                return new NavigateToSecretCode(str);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NavigateToSecretCode) && Intrinsics.areEqual((Object) this.card, (Object) ((NavigateToSecretCode) obj).card);
            }

            @C12579k
            public final String getCard() {
                return this.card;
            }

            public int hashCode() {
                return this.card.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.card;
                return "NavigateToSecretCode(card=" + str + ")";
            }
        }

        @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiEvent$NetworkError;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiEvent;", "()V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class NetworkError implements UiEvent {
            @C12579k
            public static final NetworkError INSTANCE = new NetworkError();

            private NetworkError() {
            }
        }

        @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiEvent$TerminalCardError;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiEvent;", "()V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class TerminalCardError implements UiEvent {
            @C12579k
            public static final TerminalCardError INSTANCE = new TerminalCardError();

            private TerminalCardError() {
            }
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiState;", "Lcom/carrefour/fid/android/shared/base/u$d;", "CardInfo", "InactivePassCard", "InitState", "IsValidCard", "Loading", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiState$CardInfo;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiState$InactivePassCard;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiState$InitState;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiState$IsValidCard;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiState$Loading;", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public interface UiState extends C28505u.C28509d {

        @C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiState$CardInfo;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiState;", "cardNumber", "", "isCardInvalid", "", "updateViewWithCardNumber", "enableValidateButton", "(Ljava/lang/String;ZZZ)V", "getCardNumber", "()Ljava/lang/String;", "getEnableValidateButton", "()Z", "getUpdateViewWithCardNumber", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class CardInfo implements UiState {
            @C12579k
            private final String cardNumber;
            private final boolean enableValidateButton;
            private final boolean isCardInvalid;
            private final boolean updateViewWithCardNumber;

            public CardInfo() {
                this((String) null, false, false, false, 15, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ CardInfo copy$default(CardInfo cardInfo, String str, boolean z, boolean z2, boolean z3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = cardInfo.cardNumber;
                }
                if ((i & 2) != 0) {
                    z = cardInfo.isCardInvalid;
                }
                if ((i & 4) != 0) {
                    z2 = cardInfo.updateViewWithCardNumber;
                }
                if ((i & 8) != 0) {
                    z3 = cardInfo.enableValidateButton;
                }
                return cardInfo.copy(str, z, z2, z3);
            }

            @C12579k
            public final String component1() {
                return this.cardNumber;
            }

            public final boolean component2() {
                return this.isCardInvalid;
            }

            public final boolean component3() {
                return this.updateViewWithCardNumber;
            }

            public final boolean component4() {
                return this.enableValidateButton;
            }

            @C12579k
            public final CardInfo copy(@C12579k String str, boolean z, boolean z2, boolean z3) {
                Intrinsics.checkNotNullParameter(str, C28633g.f70218b);
                return new CardInfo(str, z, z2, z3);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CardInfo)) {
                    return false;
                }
                CardInfo cardInfo = (CardInfo) obj;
                return Intrinsics.areEqual((Object) this.cardNumber, (Object) cardInfo.cardNumber) && this.isCardInvalid == cardInfo.isCardInvalid && this.updateViewWithCardNumber == cardInfo.updateViewWithCardNumber && this.enableValidateButton == cardInfo.enableValidateButton;
            }

            @C12579k
            public final String getCardNumber() {
                return this.cardNumber;
            }

            public final boolean getEnableValidateButton() {
                return this.enableValidateButton;
            }

            public final boolean getUpdateViewWithCardNumber() {
                return this.updateViewWithCardNumber;
            }

            public int hashCode() {
                int hashCode = this.cardNumber.hashCode() * 31;
                boolean z = this.isCardInvalid;
                boolean z2 = true;
                if (z) {
                    z = true;
                }
                int i = (hashCode + (z ? 1 : 0)) * 31;
                boolean z3 = this.updateViewWithCardNumber;
                if (z3) {
                    z3 = true;
                }
                int i2 = (i + (z3 ? 1 : 0)) * 31;
                boolean z4 = this.enableValidateButton;
                if (!z4) {
                    z2 = z4;
                }
                return i2 + (z2 ? 1 : 0);
            }

            public final boolean isCardInvalid() {
                return this.isCardInvalid;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return DefaultImpls.reset(this);
            }

            @C12579k
            public String toString() {
                String str = this.cardNumber;
                boolean z = this.isCardInvalid;
                boolean z2 = this.updateViewWithCardNumber;
                boolean z3 = this.enableValidateButton;
                return "CardInfo(cardNumber=" + str + ", isCardInvalid=" + z + ", updateViewWithCardNumber=" + z2 + ", enableValidateButton=" + z3 + ")";
            }

            public CardInfo(@C12579k String str, boolean z, boolean z2, boolean z3) {
                Intrinsics.checkNotNullParameter(str, C28633g.f70218b);
                this.cardNumber = str;
                this.isCardInvalid = z;
                this.updateViewWithCardNumber = z2;
                this.enableValidateButton = z3;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ CardInfo(String str, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? new String() : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
            }
        }

        @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class DefaultImpls {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public static C28505u.C28509d reset(@C12579k UiState uiState) {
                return C28505u.C28509d.C28510a.m118428a(uiState);
            }
        }

        @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiState$InactivePassCard;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiState;", "()V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class InactivePassCard implements UiState {
            @C12579k
            public static final InactivePassCard INSTANCE = new InactivePassCard();

            private InactivePassCard() {
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return DefaultImpls.reset(this);
            }
        }

        @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiState$InitState;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiState;", "()V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class InitState implements UiState {
            @C12579k
            public static final InitState INSTANCE = new InitState();

            private InitState() {
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return DefaultImpls.reset(this);
            }
        }

        @C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiState$IsValidCard;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiState;", "isCardInvalid", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class IsValidCard implements UiState {
            private final boolean isCardInvalid;

            public IsValidCard() {
                this(false, 1, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ IsValidCard copy$default(IsValidCard isValidCard, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = isValidCard.isCardInvalid;
                }
                return isValidCard.copy(z);
            }

            public final boolean component1() {
                return this.isCardInvalid;
            }

            @C12579k
            public final IsValidCard copy(boolean z) {
                return new IsValidCard(z);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof IsValidCard) && this.isCardInvalid == ((IsValidCard) obj).isCardInvalid;
            }

            public int hashCode() {
                boolean z = this.isCardInvalid;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            public final boolean isCardInvalid() {
                return this.isCardInvalid;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return DefaultImpls.reset(this);
            }

            @C12579k
            public String toString() {
                boolean z = this.isCardInvalid;
                return "IsValidCard(isCardInvalid=" + z + ")";
            }

            public IsValidCard(boolean z) {
                this.isCardInvalid = z;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ IsValidCard(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? false : z);
            }
        }

        @C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiState$Loading;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiState;", "isLoading", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class Loading implements UiState {
            private final boolean isLoading;

            public Loading() {
                this(false, 1, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Loading copy$default(Loading loading, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = loading.isLoading;
                }
                return loading.copy(z);
            }

            public final boolean component1() {
                return this.isLoading;
            }

            @C12579k
            public final Loading copy(boolean z) {
                return new Loading(z);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Loading) && this.isLoading == ((Loading) obj).isLoading;
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
                return DefaultImpls.reset(this);
            }

            @C12579k
            public String toString() {
                boolean z = this.isLoading;
                return "Loading(isLoading=" + z + ")";
            }

            public Loading(boolean z) {
                this.isLoading = z;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Loading(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? false : z);
            }
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UserAction;", "Lcom/carrefour/fid/android/shared/base/u$b;", "CheckCardValidity", "CheckExistingCard", "ProcessCardNumber", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UserAction$CheckCardValidity;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UserAction$CheckExistingCard;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UserAction$ProcessCardNumber;", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public interface UserAction extends C28505u.C28507b {

        @C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UserAction$CheckCardValidity;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UserAction;", "cardNumber", "", "(Ljava/lang/String;)V", "getCardNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class CheckCardValidity implements UserAction {
            @C12579k
            private final String cardNumber;

            public CheckCardValidity(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, C28633g.f70218b);
                this.cardNumber = str;
            }

            public static /* synthetic */ CheckCardValidity copy$default(CheckCardValidity checkCardValidity, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = checkCardValidity.cardNumber;
                }
                return checkCardValidity.copy(str);
            }

            @C12579k
            public final String component1() {
                return this.cardNumber;
            }

            @C12579k
            public final CheckCardValidity copy(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, C28633g.f70218b);
                return new CheckCardValidity(str);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CheckCardValidity) && Intrinsics.areEqual((Object) this.cardNumber, (Object) ((CheckCardValidity) obj).cardNumber);
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
                return "CheckCardValidity(cardNumber=" + str + ")";
            }
        }

        @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UserAction$CheckExistingCard;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UserAction;", "()V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class CheckExistingCard implements UserAction {
            @C12579k
            public static final CheckExistingCard INSTANCE = new CheckExistingCard();

            private CheckExistingCard() {
            }
        }

        @C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UserAction$ProcessCardNumber;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UserAction;", "card", "", "(Ljava/lang/String;)V", "getCard", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class ProcessCardNumber implements UserAction {
            @C12579k
            private final String card;

            public ProcessCardNumber(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "card");
                this.card = str;
            }

            public static /* synthetic */ ProcessCardNumber copy$default(ProcessCardNumber processCardNumber, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = processCardNumber.card;
                }
                return processCardNumber.copy(str);
            }

            @C12579k
            public final String component1() {
                return this.card;
            }

            @C12579k
            public final ProcessCardNumber copy(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "card");
                return new ProcessCardNumber(str);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ProcessCardNumber) && Intrinsics.areEqual((Object) this.card, (Object) ((ProcessCardNumber) obj).card);
            }

            @C12579k
            public final String getCard() {
                return this.card;
            }

            public int hashCode() {
                return this.card.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.card;
                return "ProcessCardNumber(card=" + str + ")";
            }
        }
    }

    private AttachCard() {
    }
}
