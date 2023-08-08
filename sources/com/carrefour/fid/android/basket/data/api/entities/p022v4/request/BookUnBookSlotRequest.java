package com.carrefour.fid.android.basket.data.api.entities.p022v4.request;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/basket/data/api/entities/v4/request/BookUnBookSlotRequest;", "", "action", "", "slotId", "subBasketId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getSlotId", "getSubBasketId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "basket_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
/* renamed from: com.carrefour.fid.android.basket.data.api.entities.v4.request.BookUnBookSlotRequest */
public final class BookUnBookSlotRequest {
    @C33608c("action")
    @C12580l
    private final String action;
    @C33608c("slot_id")
    @C12580l
    private final String slotId;
    @C33608c("sub_basket_id")
    @C12580l
    private final String subBasketId;

    public BookUnBookSlotRequest(@C12580l String str, @C12580l String str2, @C12580l String str3) {
        this.action = str;
        this.slotId = str2;
        this.subBasketId = str3;
    }

    public static /* synthetic */ BookUnBookSlotRequest copy$default(BookUnBookSlotRequest bookUnBookSlotRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bookUnBookSlotRequest.action;
        }
        if ((i & 2) != 0) {
            str2 = bookUnBookSlotRequest.slotId;
        }
        if ((i & 4) != 0) {
            str3 = bookUnBookSlotRequest.subBasketId;
        }
        return bookUnBookSlotRequest.copy(str, str2, str3);
    }

    @C12580l
    public final String component1() {
        return this.action;
    }

    @C12580l
    public final String component2() {
        return this.slotId;
    }

    @C12580l
    public final String component3() {
        return this.subBasketId;
    }

    @C12579k
    public final BookUnBookSlotRequest copy(@C12580l String str, @C12580l String str2, @C12580l String str3) {
        return new BookUnBookSlotRequest(str, str2, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookUnBookSlotRequest)) {
            return false;
        }
        BookUnBookSlotRequest bookUnBookSlotRequest = (BookUnBookSlotRequest) obj;
        return Intrinsics.areEqual((Object) this.action, (Object) bookUnBookSlotRequest.action) && Intrinsics.areEqual((Object) this.slotId, (Object) bookUnBookSlotRequest.slotId) && Intrinsics.areEqual((Object) this.subBasketId, (Object) bookUnBookSlotRequest.subBasketId);
    }

    @C12580l
    public final String getAction() {
        return this.action;
    }

    @C12580l
    public final String getSlotId() {
        return this.slotId;
    }

    @C12580l
    public final String getSubBasketId() {
        return this.subBasketId;
    }

    public int hashCode() {
        String str = this.action;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.slotId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subBasketId;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        String str = this.action;
        String str2 = this.slotId;
        String str3 = this.subBasketId;
        return "BookUnBookSlotRequest(action=" + str + ", slotId=" + str2 + ", subBasketId=" + str3 + ")";
    }
}
