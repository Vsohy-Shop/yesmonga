package com.carrefour.fid.android.basket.data.api.entities.p022v4.response;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/OfferPictureResponse;", "", "order", "", "path", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPath", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/OfferPictureResponse;", "equals", "", "other", "hashCode", "toString", "basket_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
/* renamed from: com.carrefour.fid.android.basket.data.api.entities.v4.response.OfferPictureResponse */
public final class OfferPictureResponse {
    @C33608c("order")
    @C12580l
    private final Integer order;
    @C33608c("path")
    @C12580l
    private final String path;

    public OfferPictureResponse() {
        this((Integer) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ OfferPictureResponse copy$default(OfferPictureResponse offerPictureResponse, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = offerPictureResponse.order;
        }
        if ((i & 2) != 0) {
            str = offerPictureResponse.path;
        }
        return offerPictureResponse.copy(num, str);
    }

    @C12580l
    public final Integer component1() {
        return this.order;
    }

    @C12580l
    public final String component2() {
        return this.path;
    }

    @C12579k
    public final OfferPictureResponse copy(@C12580l Integer num, @C12580l String str) {
        return new OfferPictureResponse(num, str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferPictureResponse)) {
            return false;
        }
        OfferPictureResponse offerPictureResponse = (OfferPictureResponse) obj;
        return Intrinsics.areEqual((Object) this.order, (Object) offerPictureResponse.order) && Intrinsics.areEqual((Object) this.path, (Object) offerPictureResponse.path);
    }

    @C12580l
    public final Integer getOrder() {
        return this.order;
    }

    @C12580l
    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        Integer num = this.order;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.path;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        Integer num = this.order;
        String str = this.path;
        return "OfferPictureResponse(order=" + num + ", path=" + str + ")";
    }

    public OfferPictureResponse(@C12580l Integer num, @C12580l String str) {
        this.order = num;
        this.path = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OfferPictureResponse(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
