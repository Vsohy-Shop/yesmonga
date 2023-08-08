package com.carrefour.fid.android.loyalty.presentation.viewmodels.create.mvi;

import com.carrefour.fid.android.loyalty.presentation.models.CardTypeModel;
import com.carrefour.fid.android.loyalty.presentation.models.HomeLoyaltyModel;
import com.carrefour.fid.android.shared.base.C28505u;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\f"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/CreateLoyaltyCard;", "", "()V", "AttachCard", "CheckAttachCard", "GetCardType", "NavigateToCreateFidCard", "NavigateToDiscoverPassCard", "NavigateToInitSecretCode", "UIState", "UiEvent", "UserAction", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CreateLoyaltyCard {
    @C12579k
    public static final CreateLoyaltyCard INSTANCE = new CreateLoyaltyCard();

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/CreateLoyaltyCard$AttachCard;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/CreateLoyaltyCard$UiEvent;", "()V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class AttachCard implements UiEvent {
        @C12579k
        public static final AttachCard INSTANCE = new AttachCard();

        private AttachCard() {
        }
    }

    @C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/CreateLoyaltyCard$CheckAttachCard;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/CreateLoyaltyCard$UserAction;", "errorBalance", "", "(Z)V", "getErrorBalance", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class CheckAttachCard implements UserAction {
        private final boolean errorBalance;

        public CheckAttachCard(boolean z) {
            this.errorBalance = z;
        }

        public static /* synthetic */ CheckAttachCard copy$default(CheckAttachCard checkAttachCard, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = checkAttachCard.errorBalance;
            }
            return checkAttachCard.copy(z);
        }

        public final boolean component1() {
            return this.errorBalance;
        }

        @C12579k
        public final CheckAttachCard copy(boolean z) {
            return new CheckAttachCard(z);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CheckAttachCard) && this.errorBalance == ((CheckAttachCard) obj).errorBalance;
        }

        public final boolean getErrorBalance() {
            return this.errorBalance;
        }

        public int hashCode() {
            boolean z = this.errorBalance;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @C12579k
        public String toString() {
            boolean z = this.errorBalance;
            return "CheckAttachCard(errorBalance=" + z + ")";
        }
    }

    @C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/CreateLoyaltyCard$GetCardType;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/CreateLoyaltyCard$UserAction;", "position", "", "(I)V", "getPosition", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class GetCardType implements UserAction {
        private final int position;

        public GetCardType() {
            this(0, 1, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ GetCardType copy$default(GetCardType getCardType, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = getCardType.position;
            }
            return getCardType.copy(i);
        }

        public final int component1() {
            return this.position;
        }

        @C12579k
        public final GetCardType copy(int i) {
            return new GetCardType(i);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GetCardType) && this.position == ((GetCardType) obj).position;
        }

        public final int getPosition() {
            return this.position;
        }

        public int hashCode() {
            return Integer.hashCode(this.position);
        }

        @C12579k
        public String toString() {
            int i = this.position;
            return "GetCardType(position=" + i + ")";
        }

        public GetCardType(int i) {
            this.position = i;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GetCardType(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/CreateLoyaltyCard$NavigateToCreateFidCard;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/CreateLoyaltyCard$UiEvent;", "()V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class NavigateToCreateFidCard implements UiEvent {
        @C12579k
        public static final NavigateToCreateFidCard INSTANCE = new NavigateToCreateFidCard();

        private NavigateToCreateFidCard() {
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/CreateLoyaltyCard$NavigateToDiscoverPassCard;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/CreateLoyaltyCard$UiEvent;", "()V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class NavigateToDiscoverPassCard implements UiEvent {
        @C12579k
        public static final NavigateToDiscoverPassCard INSTANCE = new NavigateToDiscoverPassCard();

        private NavigateToDiscoverPassCard() {
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/CreateLoyaltyCard$NavigateToInitSecretCode;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/CreateLoyaltyCard$UiEvent;", "()V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class NavigateToInitSecretCode implements UiEvent {
        @C12579k
        public static final NavigateToInitSecretCode INSTANCE = new NavigateToInitSecretCode();

        private NavigateToInitSecretCode() {
        }
    }

    @C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J%\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/CreateLoyaltyCard$UIState;", "Lcom/carrefour/fid/android/shared/base/u$d;", "", "Lcom/carrefour/fid/android/loyalty/presentation/models/CardTypeModel;", "component1", "Lcom/carrefour/fid/android/loyalty/presentation/models/HomeLoyaltyModel;", "component2", "cards", "loyaltyCardInfo", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/util/List;", "getCards", "()Ljava/util/List;", "Lcom/carrefour/fid/android/loyalty/presentation/models/HomeLoyaltyModel;", "getLoyaltyCardInfo", "()Lcom/carrefour/fid/android/loyalty/presentation/models/HomeLoyaltyModel;", "<init>", "(Ljava/util/List;Lcom/carrefour/fid/android/loyalty/presentation/models/HomeLoyaltyModel;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class UIState implements C28505u.C28509d {
        @C12579k
        private final List<CardTypeModel> cards;
        @C12580l
        private final HomeLoyaltyModel loyaltyCardInfo;

        public UIState() {
            this((List) null, (HomeLoyaltyModel) null, 3, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ UIState copy$default(UIState uIState, List<CardTypeModel> list, HomeLoyaltyModel homeLoyaltyModel, int i, Object obj) {
            if ((i & 1) != 0) {
                list = uIState.cards;
            }
            if ((i & 2) != 0) {
                homeLoyaltyModel = uIState.loyaltyCardInfo;
            }
            return uIState.copy(list, homeLoyaltyModel);
        }

        @C12579k
        public final List<CardTypeModel> component1() {
            return this.cards;
        }

        @C12580l
        public final HomeLoyaltyModel component2() {
            return this.loyaltyCardInfo;
        }

        @C12579k
        public final UIState copy(@C12579k List<CardTypeModel> list, @C12580l HomeLoyaltyModel homeLoyaltyModel) {
            Intrinsics.checkNotNullParameter(list, "cards");
            return new UIState(list, homeLoyaltyModel);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UIState)) {
                return false;
            }
            UIState uIState = (UIState) obj;
            return Intrinsics.areEqual((Object) this.cards, (Object) uIState.cards) && Intrinsics.areEqual((Object) this.loyaltyCardInfo, (Object) uIState.loyaltyCardInfo);
        }

        @C12579k
        public final List<CardTypeModel> getCards() {
            return this.cards;
        }

        @C12580l
        public final HomeLoyaltyModel getLoyaltyCardInfo() {
            return this.loyaltyCardInfo;
        }

        public int hashCode() {
            int hashCode = this.cards.hashCode() * 31;
            HomeLoyaltyModel homeLoyaltyModel = this.loyaltyCardInfo;
            return hashCode + (homeLoyaltyModel == null ? 0 : homeLoyaltyModel.hashCode());
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            List<CardTypeModel> list = this.cards;
            HomeLoyaltyModel homeLoyaltyModel = this.loyaltyCardInfo;
            return "UIState(cards=" + list + ", loyaltyCardInfo=" + homeLoyaltyModel + ")";
        }

        public UIState(@C12579k List<CardTypeModel> list, @C12580l HomeLoyaltyModel homeLoyaltyModel) {
            Intrinsics.checkNotNullParameter(list, "cards");
            this.cards = list;
            this.loyaltyCardInfo = homeLoyaltyModel;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ UIState(List list, HomeLoyaltyModel homeLoyaltyModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, (i & 2) != 0 ? null : homeLoyaltyModel);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0001\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/CreateLoyaltyCard$UiEvent;", "Lcom/carrefour/fid/android/shared/base/u$a;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/CreateLoyaltyCard$AttachCard;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/CreateLoyaltyCard$NavigateToCreateFidCard;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/CreateLoyaltyCard$NavigateToDiscoverPassCard;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/CreateLoyaltyCard$NavigateToInitSecretCode;", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public interface UiEvent extends C28505u.C28506a {
    }

    @C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0001\u0002\u0002\u0003¨\u0006\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/CreateLoyaltyCard$UserAction;", "Lcom/carrefour/fid/android/shared/base/u$b;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/CreateLoyaltyCard$CheckAttachCard;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/CreateLoyaltyCard$GetCardType;", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public interface UserAction extends C28505u.C28507b {
    }

    private CreateLoyaltyCard() {
    }
}
