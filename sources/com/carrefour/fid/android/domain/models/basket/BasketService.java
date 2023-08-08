package com.carrefour.fid.android.domain.models.basket;

import android.os.Parcel;
import android.os.Parcelable;
import com.carrefour.fid.android.domain.models.delivery.DeliveryCode;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0001\u0001\u0004¨\u0006\u0005"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/basket/BasketService;", "Landroid/os/Parcelable;", "()V", "BasketDeliveryService", "Lcom/carrefour/fid/android/domain/models/basket/BasketService$BasketDeliveryService;", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public abstract class BasketService implements Parcelable {

    @C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u0010\u001a\u00020\nHÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/basket/BasketService$BasketDeliveryService;", "Lcom/carrefour/fid/android/domain/models/basket/BasketService;", "", "a", "Lcom/carrefour/fid/android/domain/models/delivery/DeliveryCode;", "b", "id", "deliveryCode", "c", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Lcom/carrefour/fid/android/domain/models/delivery/DeliveryCode;", "e", "()Lcom/carrefour/fid/android/domain/models/delivery/DeliveryCode;", "<init>", "(Ljava/lang/String;Lcom/carrefour/fid/android/domain/models/delivery/DeliveryCode;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class BasketDeliveryService extends BasketService {
        @C12579k
        public static final Parcelable.Creator<BasketDeliveryService> CREATOR = new C37963a();
        @C12579k

        /* renamed from: a */
        public final String f95508a;
        @C12579k

        /* renamed from: b */
        public final DeliveryCode f95509b;

        /* renamed from: com.carrefour.fid.android.domain.models.basket.BasketService$BasketDeliveryService$a */
        public static final class C37963a implements Parcelable.Creator<BasketDeliveryService> {
            @C12579k
            /* renamed from: a */
            public final BasketDeliveryService createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BasketDeliveryService(parcel.readString(), DeliveryCode.valueOf(parcel.readString()));
            }

            @C12579k
            /* renamed from: b */
            public final BasketDeliveryService[] newArray(int i) {
                return new BasketDeliveryService[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BasketDeliveryService(@C12579k String str, @C12579k DeliveryCode deliveryCode) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "id");
            Intrinsics.checkNotNullParameter(deliveryCode, "deliveryCode");
            this.f95508a = str;
            this.f95509b = deliveryCode;
        }

        /* renamed from: d */
        public static /* synthetic */ BasketDeliveryService m156113d(BasketDeliveryService basketDeliveryService, String str, DeliveryCode deliveryCode, int i, Object obj) {
            if ((i & 1) != 0) {
                str = basketDeliveryService.f95508a;
            }
            if ((i & 2) != 0) {
                deliveryCode = basketDeliveryService.f95509b;
            }
            return basketDeliveryService.mo116974c(str, deliveryCode);
        }

        @C12579k
        /* renamed from: a */
        public final String mo116972a() {
            return this.f95508a;
        }

        @C12579k
        /* renamed from: b */
        public final DeliveryCode mo116973b() {
            return this.f95509b;
        }

        @C12579k
        /* renamed from: c */
        public final BasketDeliveryService mo116974c(@C12579k String str, @C12579k DeliveryCode deliveryCode) {
            Intrinsics.checkNotNullParameter(str, "id");
            Intrinsics.checkNotNullParameter(deliveryCode, "deliveryCode");
            return new BasketDeliveryService(str, deliveryCode);
        }

        public int describeContents() {
            return 0;
        }

        @C12579k
        /* renamed from: e */
        public final DeliveryCode mo116976e() {
            return this.f95509b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BasketDeliveryService)) {
                return false;
            }
            BasketDeliveryService basketDeliveryService = (BasketDeliveryService) obj;
            return Intrinsics.areEqual((Object) this.f95508a, (Object) basketDeliveryService.f95508a) && this.f95509b == basketDeliveryService.f95509b;
        }

        @C12579k
        /* renamed from: f */
        public final String mo116978f() {
            return this.f95508a;
        }

        public int hashCode() {
            return (this.f95508a.hashCode() * 31) + this.f95509b.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f95508a;
            DeliveryCode deliveryCode = this.f95509b;
            return "BasketDeliveryService(id=" + str + ", deliveryCode=" + deliveryCode + ")";
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.f95508a);
            parcel.writeString(this.f95509b.name());
        }
    }

    public /* synthetic */ BasketService(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public BasketService() {
    }
}
