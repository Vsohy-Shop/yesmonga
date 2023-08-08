package com.carrefour.fid.android.loyalty.presentation.viewmodels.create.mvi;

import com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse;
import com.carrefour.fid.android.loyalty.presentation.models.DataPrimeCmsModel;
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

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/SuccessCreateCard;", "", "()V", "GetUserInformation", "UIState", "UserAction", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SuccessCreateCard {
    @C12579k
    public static final SuccessCreateCard INSTANCE = new SuccessCreateCard();

    @C11076d0(mo22515d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/SuccessCreateCard$GetUserInformation;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/SuccessCreateCard$UserAction;", "primeList", "", "Lcom/carrefour/fid/android/cms/data/entities/DataPrimeCmsResponse;", "(Ljava/util/List;)V", "getPrimeList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class GetUserInformation implements UserAction {
        @C12579k
        private final List<DataPrimeCmsResponse> primeList;

        public GetUserInformation(@C12579k List<DataPrimeCmsResponse> list) {
            Intrinsics.checkNotNullParameter(list, "primeList");
            this.primeList = list;
        }

        public static /* synthetic */ GetUserInformation copy$default(GetUserInformation getUserInformation, List<DataPrimeCmsResponse> list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = getUserInformation.primeList;
            }
            return getUserInformation.copy(list);
        }

        @C12579k
        public final List<DataPrimeCmsResponse> component1() {
            return this.primeList;
        }

        @C12579k
        public final GetUserInformation copy(@C12579k List<DataPrimeCmsResponse> list) {
            Intrinsics.checkNotNullParameter(list, "primeList");
            return new GetUserInformation(list);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GetUserInformation) && Intrinsics.areEqual((Object) this.primeList, (Object) ((GetUserInformation) obj).primeList);
        }

        @C12579k
        public final List<DataPrimeCmsResponse> getPrimeList() {
            return this.primeList;
        }

        public int hashCode() {
            return this.primeList.hashCode();
        }

        @C12579k
        public String toString() {
            List<DataPrimeCmsResponse> list = this.primeList;
            return "GetUserInformation(primeList=" + list + ")";
        }
    }

    @C11076d0(mo22515d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J#\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/SuccessCreateCard$UIState;", "Lcom/carrefour/fid/android/shared/base/u$d;", "", "component1", "", "Lcom/carrefour/fid/android/loyalty/presentation/models/DataPrimeCmsModel;", "component2", "firstName", "listPrimesSubscribe", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getFirstName", "()Ljava/lang/String;", "Ljava/util/List;", "getListPrimesSubscribe", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class UIState implements C28505u.C28509d {
        @C12579k
        private final String firstName;
        @C12579k
        private final List<DataPrimeCmsModel> listPrimesSubscribe;

        public UIState() {
            this((String) null, (List) null, 3, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ UIState copy$default(UIState uIState, String str, List<DataPrimeCmsModel> list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uIState.firstName;
            }
            if ((i & 2) != 0) {
                list = uIState.listPrimesSubscribe;
            }
            return uIState.copy(str, list);
        }

        @C12579k
        public final String component1() {
            return this.firstName;
        }

        @C12579k
        public final List<DataPrimeCmsModel> component2() {
            return this.listPrimesSubscribe;
        }

        @C12579k
        public final UIState copy(@C12579k String str, @C12579k List<DataPrimeCmsModel> list) {
            Intrinsics.checkNotNullParameter(str, "firstName");
            Intrinsics.checkNotNullParameter(list, "listPrimesSubscribe");
            return new UIState(str, list);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UIState)) {
                return false;
            }
            UIState uIState = (UIState) obj;
            return Intrinsics.areEqual((Object) this.firstName, (Object) uIState.firstName) && Intrinsics.areEqual((Object) this.listPrimesSubscribe, (Object) uIState.listPrimesSubscribe);
        }

        @C12579k
        public final String getFirstName() {
            return this.firstName;
        }

        @C12579k
        public final List<DataPrimeCmsModel> getListPrimesSubscribe() {
            return this.listPrimesSubscribe;
        }

        public int hashCode() {
            return (this.firstName.hashCode() * 31) + this.listPrimesSubscribe.hashCode();
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            String str = this.firstName;
            List<DataPrimeCmsModel> list = this.listPrimesSubscribe;
            return "UIState(firstName=" + str + ", listPrimesSubscribe=" + list + ")";
        }

        public UIState(@C12579k String str, @C12579k List<DataPrimeCmsModel> list) {
            Intrinsics.checkNotNullParameter(str, "firstName");
            Intrinsics.checkNotNullParameter(list, "listPrimesSubscribe");
            this.firstName = str;
            this.listPrimesSubscribe = list;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ UIState(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new String() : str, (i & 2) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0001\u0001\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/SuccessCreateCard$UserAction;", "Lcom/carrefour/fid/android/shared/base/u$b;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/SuccessCreateCard$GetUserInformation;", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public interface UserAction extends C28505u.C28507b {
    }

    private SuccessCreateCard() {
    }
}
