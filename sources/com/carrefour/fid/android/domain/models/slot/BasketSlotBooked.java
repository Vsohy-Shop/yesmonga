package com.carrefour.fid.android.domain.models.slot;

import android.os.Parcel;
import android.os.Parcelable;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.presentation.p035ui.home.shop.OnlineStoreShopFragment;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000eHÖ\u0001R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/slot/BasketSlotBooked;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/domain/models/slot/Slot;", "a", "Lcom/carrefour/fid/android/domain/models/basket/Basket;", "b", "Lcom/carrefour/fid/android/domain/models/slot/BasketSlotBookedMessageType;", "c", "slot", "basket", "basketSlotBookedMessageType", "d", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/domain/models/slot/Slot;", "h", "()Lcom/carrefour/fid/android/domain/models/slot/Slot;", "Lcom/carrefour/fid/android/domain/models/basket/Basket;", "f", "()Lcom/carrefour/fid/android/domain/models/basket/Basket;", "Lcom/carrefour/fid/android/domain/models/slot/BasketSlotBookedMessageType;", "g", "()Lcom/carrefour/fid/android/domain/models/slot/BasketSlotBookedMessageType;", "<init>", "(Lcom/carrefour/fid/android/domain/models/slot/Slot;Lcom/carrefour/fid/android/domain/models/basket/Basket;Lcom/carrefour/fid/android/domain/models/slot/BasketSlotBookedMessageType;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class BasketSlotBooked implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<BasketSlotBooked> CREATOR = new C38170a();
    @C12579k

    /* renamed from: a */
    public final Slot f96696a;
    @C12580l

    /* renamed from: b */
    public final Basket f96697b;
    @C12580l

    /* renamed from: c */
    public final BasketSlotBookedMessageType f96698c;

    /* renamed from: com.carrefour.fid.android.domain.models.slot.BasketSlotBooked$a */
    public static final class C38170a implements Parcelable.Creator<BasketSlotBooked> {
        @C12579k
        /* renamed from: a */
        public final BasketSlotBooked createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BasketSlotBooked(Slot.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Basket.CREATOR.createFromParcel(parcel), (BasketSlotBookedMessageType) parcel.readParcelable(BasketSlotBooked.class.getClassLoader()));
        }

        @C12579k
        /* renamed from: b */
        public final BasketSlotBooked[] newArray(int i) {
            return new BasketSlotBooked[i];
        }
    }

    public BasketSlotBooked(@C12579k Slot slot, @C12580l Basket basket, @C12580l BasketSlotBookedMessageType basketSlotBookedMessageType) {
        Intrinsics.checkNotNullParameter(slot, OnlineStoreShopFragment.f60516Z);
        this.f96696a = slot;
        this.f96697b = basket;
        this.f96698c = basketSlotBookedMessageType;
    }

    /* renamed from: e */
    public static /* synthetic */ BasketSlotBooked m158243e(BasketSlotBooked basketSlotBooked, Slot slot, Basket basket, BasketSlotBookedMessageType basketSlotBookedMessageType, int i, Object obj) {
        if ((i & 1) != 0) {
            slot = basketSlotBooked.f96696a;
        }
        if ((i & 2) != 0) {
            basket = basketSlotBooked.f96697b;
        }
        if ((i & 4) != 0) {
            basketSlotBookedMessageType = basketSlotBooked.f96698c;
        }
        return basketSlotBooked.mo119437d(slot, basket, basketSlotBookedMessageType);
    }

    @C12579k
    /* renamed from: a */
    public final Slot mo119434a() {
        return this.f96696a;
    }

    @C12580l
    /* renamed from: b */
    public final Basket mo119435b() {
        return this.f96697b;
    }

    @C12580l
    /* renamed from: c */
    public final BasketSlotBookedMessageType mo119436c() {
        return this.f96698c;
    }

    @C12579k
    /* renamed from: d */
    public final BasketSlotBooked mo119437d(@C12579k Slot slot, @C12580l Basket basket, @C12580l BasketSlotBookedMessageType basketSlotBookedMessageType) {
        Intrinsics.checkNotNullParameter(slot, OnlineStoreShopFragment.f60516Z);
        return new BasketSlotBooked(slot, basket, basketSlotBookedMessageType);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasketSlotBooked)) {
            return false;
        }
        BasketSlotBooked basketSlotBooked = (BasketSlotBooked) obj;
        return Intrinsics.areEqual((Object) this.f96696a, (Object) basketSlotBooked.f96696a) && Intrinsics.areEqual((Object) this.f96697b, (Object) basketSlotBooked.f96697b) && Intrinsics.areEqual((Object) this.f96698c, (Object) basketSlotBooked.f96698c);
    }

    @C12580l
    /* renamed from: f */
    public final Basket mo119440f() {
        return this.f96697b;
    }

    @C12580l
    /* renamed from: g */
    public final BasketSlotBookedMessageType mo119441g() {
        return this.f96698c;
    }

    @C12579k
    /* renamed from: h */
    public final Slot mo119442h() {
        return this.f96696a;
    }

    public int hashCode() {
        int hashCode = this.f96696a.hashCode() * 31;
        Basket basket = this.f96697b;
        int i = 0;
        int hashCode2 = (hashCode + (basket == null ? 0 : basket.hashCode())) * 31;
        BasketSlotBookedMessageType basketSlotBookedMessageType = this.f96698c;
        if (basketSlotBookedMessageType != null) {
            i = basketSlotBookedMessageType.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        Slot slot = this.f96696a;
        Basket basket = this.f96697b;
        BasketSlotBookedMessageType basketSlotBookedMessageType = this.f96698c;
        return "BasketSlotBooked(slot=" + slot + ", basket=" + basket + ", basketSlotBookedMessageType=" + basketSlotBookedMessageType + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.f96696a.writeToParcel(parcel, i);
        Basket basket = this.f96697b;
        if (basket == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            basket.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.f96698c, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BasketSlotBooked(Slot slot, Basket basket, BasketSlotBookedMessageType basketSlotBookedMessageType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(slot, (i & 2) != 0 ? null : basket, (i & 4) != 0 ? null : basketSlotBookedMessageType);
    }
}
