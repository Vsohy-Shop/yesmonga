package com.carrefour.fid.android.loyalty.presentation.viewmodels.history.mvi;

import com.carrefour.fid.android.loyalty.presentation.models.OperationHistoryModel;
import com.carrefour.fid.android.loyalty.presentation.models.TransactionsModel;
import com.carrefour.fid.android.shared.base.C28505u;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u000b\f\r\u000eB\t\b\u0002¢\u0006\u0004\b\t\u0010\nR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/mvi/LoyaltyAmountHistory;", "", "Lcom/carrefour/fid/android/shared/base/u$c;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/mvi/LoyaltyAmountHistory$UIState;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/mvi/LoyaltyAmountHistory$PartialState;", "reducer", "Lcom/carrefour/fid/android/shared/base/u$c;", "getReducer", "()Lcom/carrefour/fid/android/shared/base/u$c;", "<init>", "()V", "PartialState", "UIState", "UiEvent", "UserAction", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class LoyaltyAmountHistory {
    @C12579k
    public static final LoyaltyAmountHistory INSTANCE = new LoyaltyAmountHistory();
    @C12579k
    private static final C28505u.C28508c<UIState, PartialState> reducer = new C38299a();

    @C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J9\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\n\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u000b\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/mvi/LoyaltyAmountHistory$UIState;", "Lcom/carrefour/fid/android/shared/base/u$d;", "", "component1", "component2", "Lcom/carrefour/fid/android/loyalty/presentation/models/TransactionsModel;", "component3", "", "Lcom/carrefour/fid/android/loyalty/presentation/models/OperationHistoryModel;", "component4", "isLoading", "isNegativeAmount", "transactionsModel", "operationHistoryModel", "copy", "", "toString", "", "hashCode", "", "other", "equals", "Z", "()Z", "Lcom/carrefour/fid/android/loyalty/presentation/models/TransactionsModel;", "getTransactionsModel", "()Lcom/carrefour/fid/android/loyalty/presentation/models/TransactionsModel;", "Ljava/util/List;", "getOperationHistoryModel", "()Ljava/util/List;", "<init>", "(ZZLcom/carrefour/fid/android/loyalty/presentation/models/TransactionsModel;Ljava/util/List;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class UIState implements C28505u.C28509d {
        private final boolean isLoading;
        private final boolean isNegativeAmount;
        @C12579k
        private final List<OperationHistoryModel> operationHistoryModel;
        @C12580l
        private final TransactionsModel transactionsModel;

        public UIState() {
            this(false, false, (TransactionsModel) null, (List) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ UIState copy$default(UIState uIState, boolean z, boolean z2, TransactionsModel transactionsModel2, List<OperationHistoryModel> list, int i, Object obj) {
            if ((i & 1) != 0) {
                z = uIState.isLoading;
            }
            if ((i & 2) != 0) {
                z2 = uIState.isNegativeAmount;
            }
            if ((i & 4) != 0) {
                transactionsModel2 = uIState.transactionsModel;
            }
            if ((i & 8) != 0) {
                list = uIState.operationHistoryModel;
            }
            return uIState.copy(z, z2, transactionsModel2, list);
        }

        public final boolean component1() {
            return this.isLoading;
        }

        public final boolean component2() {
            return this.isNegativeAmount;
        }

        @C12580l
        public final TransactionsModel component3() {
            return this.transactionsModel;
        }

        @C12579k
        public final List<OperationHistoryModel> component4() {
            return this.operationHistoryModel;
        }

        @C12579k
        public final UIState copy(boolean z, boolean z2, @C12580l TransactionsModel transactionsModel2, @C12579k List<OperationHistoryModel> list) {
            Intrinsics.checkNotNullParameter(list, "operationHistoryModel");
            return new UIState(z, z2, transactionsModel2, list);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UIState)) {
                return false;
            }
            UIState uIState = (UIState) obj;
            return this.isLoading == uIState.isLoading && this.isNegativeAmount == uIState.isNegativeAmount && Intrinsics.areEqual((Object) this.transactionsModel, (Object) uIState.transactionsModel) && Intrinsics.areEqual((Object) this.operationHistoryModel, (Object) uIState.operationHistoryModel);
        }

        @C12579k
        public final List<OperationHistoryModel> getOperationHistoryModel() {
            return this.operationHistoryModel;
        }

        @C12580l
        public final TransactionsModel getTransactionsModel() {
            return this.transactionsModel;
        }

        public int hashCode() {
            boolean z = this.isLoading;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.isNegativeAmount;
            if (!z3) {
                z2 = z3;
            }
            int i2 = (i + (z2 ? 1 : 0)) * 31;
            TransactionsModel transactionsModel2 = this.transactionsModel;
            return ((i2 + (transactionsModel2 == null ? 0 : transactionsModel2.hashCode())) * 31) + this.operationHistoryModel.hashCode();
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final boolean isNegativeAmount() {
            return this.isNegativeAmount;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            boolean z = this.isLoading;
            boolean z2 = this.isNegativeAmount;
            TransactionsModel transactionsModel2 = this.transactionsModel;
            List<OperationHistoryModel> list = this.operationHistoryModel;
            return "UIState(isLoading=" + z + ", isNegativeAmount=" + z2 + ", transactionsModel=" + transactionsModel2 + ", operationHistoryModel=" + list + ")";
        }

        public UIState(boolean z, boolean z2, @C12580l TransactionsModel transactionsModel2, @C12579k List<OperationHistoryModel> list) {
            Intrinsics.checkNotNullParameter(list, "operationHistoryModel");
            this.isLoading = z;
            this.isNegativeAmount = z2;
            this.transactionsModel = transactionsModel2;
            this.operationHistoryModel = list;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ UIState(boolean z, boolean z2, TransactionsModel transactionsModel2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : transactionsModel2, (i & 8) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0001\u0001\u0003¨\u0006\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/mvi/LoyaltyAmountHistory$UiEvent;", "Lcom/carrefour/fid/android/shared/base/u$a;", "ErrorHistory", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/mvi/LoyaltyAmountHistory$UiEvent$ErrorHistory;", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public interface UiEvent extends C28505u.C28506a {

        @C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/mvi/LoyaltyAmountHistory$UiEvent$ErrorHistory;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/mvi/LoyaltyAmountHistory$UiEvent;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class ErrorHistory implements UiEvent {
            @C12579k
            private final Throwable throwable;

            public ErrorHistory(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.throwable = th;
            }

            public static /* synthetic */ ErrorHistory copy$default(ErrorHistory errorHistory, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = errorHistory.throwable;
                }
                return errorHistory.copy(th);
            }

            @C12579k
            public final Throwable component1() {
                return this.throwable;
            }

            @C12579k
            public final ErrorHistory copy(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new ErrorHistory(th);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ErrorHistory) && Intrinsics.areEqual((Object) this.throwable, (Object) ((ErrorHistory) obj).throwable);
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
                return "ErrorHistory(throwable=" + th + ")";
            }
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/mvi/LoyaltyAmountHistory$UserAction;", "Lcom/carrefour/fid/android/shared/base/u$b;", "CheckBalanceReceived", "GetCardOperation", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/mvi/LoyaltyAmountHistory$UserAction$CheckBalanceReceived;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/mvi/LoyaltyAmountHistory$UserAction$GetCardOperation;", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public interface UserAction extends C28505u.C28507b {

        @C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/mvi/LoyaltyAmountHistory$UserAction$CheckBalanceReceived;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/mvi/LoyaltyAmountHistory$UserAction;", "balance", "", "(Ljava/lang/String;)V", "getBalance", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class CheckBalanceReceived implements UserAction {
            @C12579k
            private final String balance;

            public CheckBalanceReceived(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "balance");
                this.balance = str;
            }

            public static /* synthetic */ CheckBalanceReceived copy$default(CheckBalanceReceived checkBalanceReceived, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = checkBalanceReceived.balance;
                }
                return checkBalanceReceived.copy(str);
            }

            @C12579k
            public final String component1() {
                return this.balance;
            }

            @C12579k
            public final CheckBalanceReceived copy(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "balance");
                return new CheckBalanceReceived(str);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CheckBalanceReceived) && Intrinsics.areEqual((Object) this.balance, (Object) ((CheckBalanceReceived) obj).balance);
            }

            @C12579k
            public final String getBalance() {
                return this.balance;
            }

            public int hashCode() {
                return this.balance.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.balance;
                return "CheckBalanceReceived(balance=" + str + ")";
            }
        }

        @C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/mvi/LoyaltyAmountHistory$UserAction$GetCardOperation;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/mvi/LoyaltyAmountHistory$UserAction;", "date", "", "(Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class GetCardOperation implements UserAction {
            @C12580l
            private final String date;

            public GetCardOperation() {
                this((String) null, 1, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ GetCardOperation copy$default(GetCardOperation getCardOperation, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = getCardOperation.date;
                }
                return getCardOperation.copy(str);
            }

            @C12580l
            public final String component1() {
                return this.date;
            }

            @C12579k
            public final GetCardOperation copy(@C12580l String str) {
                return new GetCardOperation(str);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GetCardOperation) && Intrinsics.areEqual((Object) this.date, (Object) ((GetCardOperation) obj).date);
            }

            @C12580l
            public final String getDate() {
                return this.date;
            }

            public int hashCode() {
                String str = this.date;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.date;
                return "GetCardOperation(date=" + str + ")";
            }

            public GetCardOperation(@C12580l String str) {
                this.date = str;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ GetCardOperation(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }
        }
    }

    private LoyaltyAmountHistory() {
    }

    /* access modifiers changed from: private */
    public static final UIState reducer$lambda$0(UIState uIState, PartialState partialState) {
        Intrinsics.checkNotNullParameter(uIState, "state");
        Intrinsics.checkNotNullParameter(partialState, "partialState");
        if (partialState instanceof PartialState.CheckNegativeAmount) {
            return UIState.copy$default(uIState, false, ((PartialState.CheckNegativeAmount) partialState).isNegativeAmount(), (TransactionsModel) null, (List) null, 12, (Object) null);
        } else if (partialState instanceof PartialState.Loading) {
            PartialState.Loading loading = (PartialState.Loading) partialState;
            return UIState.copy$default(uIState, loading.isLoading(), false, loading.getTransactionsModel(), (List) null, 10, (Object) null);
        } else if (partialState instanceof PartialState.GetHistoryTransaction) {
            PartialState.GetHistoryTransaction getHistoryTransaction = (PartialState.GetHistoryTransaction) partialState;
            return UIState.copy$default(uIState, getHistoryTransaction.isLoading(), false, getHistoryTransaction.getTransactionsModel(), getHistoryTransaction.getOperationHistoryModel(), 2, (Object) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @C12579k
    public final C28505u.C28508c<UIState, PartialState> getReducer() {
        return reducer;
    }

    @C11076d0(mo22515d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/mvi/LoyaltyAmountHistory$PartialState;", "Lcom/carrefour/fid/android/shared/base/u$d;", "CheckNegativeAmount", "GetHistoryTransaction", "Loading", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/mvi/LoyaltyAmountHistory$PartialState$CheckNegativeAmount;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/mvi/LoyaltyAmountHistory$PartialState$GetHistoryTransaction;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/mvi/LoyaltyAmountHistory$PartialState$Loading;", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public interface PartialState extends C28505u.C28509d {

        @C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/mvi/LoyaltyAmountHistory$PartialState$CheckNegativeAmount;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/mvi/LoyaltyAmountHistory$PartialState;", "isNegativeAmount", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class CheckNegativeAmount implements PartialState {
            private final boolean isNegativeAmount;

            public CheckNegativeAmount(boolean z) {
                this.isNegativeAmount = z;
            }

            public static /* synthetic */ CheckNegativeAmount copy$default(CheckNegativeAmount checkNegativeAmount, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = checkNegativeAmount.isNegativeAmount;
                }
                return checkNegativeAmount.copy(z);
            }

            public final boolean component1() {
                return this.isNegativeAmount;
            }

            @C12579k
            public final CheckNegativeAmount copy(boolean z) {
                return new CheckNegativeAmount(z);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CheckNegativeAmount) && this.isNegativeAmount == ((CheckNegativeAmount) obj).isNegativeAmount;
            }

            public int hashCode() {
                boolean z = this.isNegativeAmount;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            public final boolean isNegativeAmount() {
                return this.isNegativeAmount;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return DefaultImpls.reset(this);
            }

            @C12579k
            public String toString() {
                boolean z = this.isNegativeAmount;
                return "CheckNegativeAmount(isNegativeAmount=" + z + ")";
            }
        }

        @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class DefaultImpls {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public static C28505u.C28509d reset(@C12579k PartialState partialState) {
                return C28505u.C28509d.C28510a.m118428a(partialState);
            }
        }

        @C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/mvi/LoyaltyAmountHistory$PartialState$Loading;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/mvi/LoyaltyAmountHistory$PartialState;", "isLoading", "", "transactionsModel", "Lcom/carrefour/fid/android/loyalty/presentation/models/TransactionsModel;", "(ZLcom/carrefour/fid/android/loyalty/presentation/models/TransactionsModel;)V", "()Z", "getTransactionsModel", "()Lcom/carrefour/fid/android/loyalty/presentation/models/TransactionsModel;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class Loading implements PartialState {
            private final boolean isLoading;
            @C12580l
            private final TransactionsModel transactionsModel;

            public Loading(boolean z, @C12580l TransactionsModel transactionsModel2) {
                this.isLoading = z;
                this.transactionsModel = transactionsModel2;
            }

            public static /* synthetic */ Loading copy$default(Loading loading, boolean z, TransactionsModel transactionsModel2, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = loading.isLoading;
                }
                if ((i & 2) != 0) {
                    transactionsModel2 = loading.transactionsModel;
                }
                return loading.copy(z, transactionsModel2);
            }

            public final boolean component1() {
                return this.isLoading;
            }

            @C12580l
            public final TransactionsModel component2() {
                return this.transactionsModel;
            }

            @C12579k
            public final Loading copy(boolean z, @C12580l TransactionsModel transactionsModel2) {
                return new Loading(z, transactionsModel2);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Loading)) {
                    return false;
                }
                Loading loading = (Loading) obj;
                return this.isLoading == loading.isLoading && Intrinsics.areEqual((Object) this.transactionsModel, (Object) loading.transactionsModel);
            }

            @C12580l
            public final TransactionsModel getTransactionsModel() {
                return this.transactionsModel;
            }

            public int hashCode() {
                boolean z = this.isLoading;
                if (z) {
                    z = true;
                }
                int i = (z ? 1 : 0) * true;
                TransactionsModel transactionsModel2 = this.transactionsModel;
                return i + (transactionsModel2 == null ? 0 : transactionsModel2.hashCode());
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
                TransactionsModel transactionsModel2 = this.transactionsModel;
                return "Loading(isLoading=" + z + ", transactionsModel=" + transactionsModel2 + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Loading(boolean z, TransactionsModel transactionsModel2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(z, (i & 2) != 0 ? null : transactionsModel2);
            }
        }

        @C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J/\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/mvi/LoyaltyAmountHistory$PartialState$GetHistoryTransaction;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/mvi/LoyaltyAmountHistory$PartialState;", "isLoading", "", "transactionsModel", "Lcom/carrefour/fid/android/loyalty/presentation/models/TransactionsModel;", "operationHistoryModel", "", "Lcom/carrefour/fid/android/loyalty/presentation/models/OperationHistoryModel;", "(ZLcom/carrefour/fid/android/loyalty/presentation/models/TransactionsModel;Ljava/util/List;)V", "()Z", "getOperationHistoryModel", "()Ljava/util/List;", "getTransactionsModel", "()Lcom/carrefour/fid/android/loyalty/presentation/models/TransactionsModel;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class GetHistoryTransaction implements PartialState {
            private final boolean isLoading;
            @C12579k
            private final List<OperationHistoryModel> operationHistoryModel;
            @C12580l
            private final TransactionsModel transactionsModel;

            public GetHistoryTransaction(boolean z, @C12580l TransactionsModel transactionsModel2, @C12579k List<OperationHistoryModel> list) {
                Intrinsics.checkNotNullParameter(list, "operationHistoryModel");
                this.isLoading = z;
                this.transactionsModel = transactionsModel2;
                this.operationHistoryModel = list;
            }

            public static /* synthetic */ GetHistoryTransaction copy$default(GetHistoryTransaction getHistoryTransaction, boolean z, TransactionsModel transactionsModel2, List<OperationHistoryModel> list, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = getHistoryTransaction.isLoading;
                }
                if ((i & 2) != 0) {
                    transactionsModel2 = getHistoryTransaction.transactionsModel;
                }
                if ((i & 4) != 0) {
                    list = getHistoryTransaction.operationHistoryModel;
                }
                return getHistoryTransaction.copy(z, transactionsModel2, list);
            }

            public final boolean component1() {
                return this.isLoading;
            }

            @C12580l
            public final TransactionsModel component2() {
                return this.transactionsModel;
            }

            @C12579k
            public final List<OperationHistoryModel> component3() {
                return this.operationHistoryModel;
            }

            @C12579k
            public final GetHistoryTransaction copy(boolean z, @C12580l TransactionsModel transactionsModel2, @C12579k List<OperationHistoryModel> list) {
                Intrinsics.checkNotNullParameter(list, "operationHistoryModel");
                return new GetHistoryTransaction(z, transactionsModel2, list);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof GetHistoryTransaction)) {
                    return false;
                }
                GetHistoryTransaction getHistoryTransaction = (GetHistoryTransaction) obj;
                return this.isLoading == getHistoryTransaction.isLoading && Intrinsics.areEqual((Object) this.transactionsModel, (Object) getHistoryTransaction.transactionsModel) && Intrinsics.areEqual((Object) this.operationHistoryModel, (Object) getHistoryTransaction.operationHistoryModel);
            }

            @C12579k
            public final List<OperationHistoryModel> getOperationHistoryModel() {
                return this.operationHistoryModel;
            }

            @C12580l
            public final TransactionsModel getTransactionsModel() {
                return this.transactionsModel;
            }

            public int hashCode() {
                boolean z = this.isLoading;
                if (z) {
                    z = true;
                }
                int i = (z ? 1 : 0) * true;
                TransactionsModel transactionsModel2 = this.transactionsModel;
                return ((i + (transactionsModel2 == null ? 0 : transactionsModel2.hashCode())) * 31) + this.operationHistoryModel.hashCode();
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
                TransactionsModel transactionsModel2 = this.transactionsModel;
                List<OperationHistoryModel> list = this.operationHistoryModel;
                return "GetHistoryTransaction(isLoading=" + z + ", transactionsModel=" + transactionsModel2 + ", operationHistoryModel=" + list + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ GetHistoryTransaction(boolean z, TransactionsModel transactionsModel2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(z, transactionsModel2, (i & 4) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list);
            }
        }
    }
}
