package com.carrefour.fid.android.basket.data.api.entities.p022v4.response;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, mo22516d2 = {"Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketServiceInfo;", "", "id", "", "label", "items", "", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketServiceInfoItem;", "serviceAmount", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;)V", "getId", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "getLabel", "getServiceAmount", "()Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "basket_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
/* renamed from: com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketServiceInfo */
public final class BasketServiceInfo {
    @C33608c("id")
    @C12580l

    /* renamed from: id */
    private final String f33837id;
    @C33608c("items")
    @C12579k
    private final List<BasketServiceInfoItem> items;
    @C33608c("label")
    @C12580l
    private final String label;
    @C33608c("service_amount")
    @C12580l
    private final BasketAmountResponse serviceAmount;

    public BasketServiceInfo() {
        this((String) null, (String) null, (List) null, (BasketAmountResponse) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BasketServiceInfo copy$default(BasketServiceInfo basketServiceInfo, String str, String str2, List<BasketServiceInfoItem> list, BasketAmountResponse basketAmountResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            str = basketServiceInfo.f33837id;
        }
        if ((i & 2) != 0) {
            str2 = basketServiceInfo.label;
        }
        if ((i & 4) != 0) {
            list = basketServiceInfo.items;
        }
        if ((i & 8) != 0) {
            basketAmountResponse = basketServiceInfo.serviceAmount;
        }
        return basketServiceInfo.copy(str, str2, list, basketAmountResponse);
    }

    @C12580l
    public final String component1() {
        return this.f33837id;
    }

    @C12580l
    public final String component2() {
        return this.label;
    }

    @C12579k
    public final List<BasketServiceInfoItem> component3() {
        return this.items;
    }

    @C12580l
    public final BasketAmountResponse component4() {
        return this.serviceAmount;
    }

    @C12579k
    public final BasketServiceInfo copy(@C12580l String str, @C12580l String str2, @C12579k List<BasketServiceInfoItem> list, @C12580l BasketAmountResponse basketAmountResponse) {
        Intrinsics.checkNotNullParameter(list, "items");
        return new BasketServiceInfo(str, str2, list, basketAmountResponse);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasketServiceInfo)) {
            return false;
        }
        BasketServiceInfo basketServiceInfo = (BasketServiceInfo) obj;
        return Intrinsics.areEqual((Object) this.f33837id, (Object) basketServiceInfo.f33837id) && Intrinsics.areEqual((Object) this.label, (Object) basketServiceInfo.label) && Intrinsics.areEqual((Object) this.items, (Object) basketServiceInfo.items) && Intrinsics.areEqual((Object) this.serviceAmount, (Object) basketServiceInfo.serviceAmount);
    }

    @C12580l
    public final String getId() {
        return this.f33837id;
    }

    @C12579k
    public final List<BasketServiceInfoItem> getItems() {
        return this.items;
    }

    @C12580l
    public final String getLabel() {
        return this.label;
    }

    @C12580l
    public final BasketAmountResponse getServiceAmount() {
        return this.serviceAmount;
    }

    public int hashCode() {
        String str = this.f33837id;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.label;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.items.hashCode()) * 31;
        BasketAmountResponse basketAmountResponse = this.serviceAmount;
        if (basketAmountResponse != null) {
            i = basketAmountResponse.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        String str = this.f33837id;
        String str2 = this.label;
        List<BasketServiceInfoItem> list = this.items;
        BasketAmountResponse basketAmountResponse = this.serviceAmount;
        return "BasketServiceInfo(id=" + str + ", label=" + str2 + ", items=" + list + ", serviceAmount=" + basketAmountResponse + ")";
    }

    public BasketServiceInfo(@C12580l String str, @C12580l String str2, @C12579k List<BasketServiceInfoItem> list, @C12580l BasketAmountResponse basketAmountResponse) {
        Intrinsics.checkNotNullParameter(list, "items");
        this.f33837id = str;
        this.label = str2;
        this.items = list;
        this.serviceAmount = basketAmountResponse;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BasketServiceInfo(String str, String str2, List list, BasketAmountResponse basketAmountResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, (i & 8) != 0 ? null : basketAmountResponse);
    }
}
