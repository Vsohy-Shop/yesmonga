package com.carrefour.fid.android.domain.models.slot;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/slot/BasketSlotBookedMessageType;", "Landroid/os/Parcelable;", "()V", "Error", "NoneBecauseOfExpressPickup", "QuantitiesHasChanged", "Success", "Lcom/carrefour/fid/android/domain/models/slot/BasketSlotBookedMessageType$Error;", "Lcom/carrefour/fid/android/domain/models/slot/BasketSlotBookedMessageType$NoneBecauseOfExpressPickup;", "Lcom/carrefour/fid/android/domain/models/slot/BasketSlotBookedMessageType$QuantitiesHasChanged;", "Lcom/carrefour/fid/android/domain/models/slot/BasketSlotBookedMessageType$Success;", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public abstract class BasketSlotBookedMessageType implements Parcelable {

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/slot/BasketSlotBookedMessageType$Error;", "Lcom/carrefour/fid/android/domain/models/slot/BasketSlotBookedMessageType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class Error extends BasketSlotBookedMessageType {
        @C12579k
        public static final Parcelable.Creator<Error> CREATOR = new C38171a();
        @C12579k

        /* renamed from: a */
        public static final Error f96699a = new Error();

        /* renamed from: com.carrefour.fid.android.domain.models.slot.BasketSlotBookedMessageType$Error$a */
        public static final class C38171a implements Parcelable.Creator<Error> {
            @C12579k
            /* renamed from: a */
            public final Error createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Error.f96699a;
            }

            @C12579k
            /* renamed from: b */
            public final Error[] newArray(int i) {
                return new Error[i];
            }
        }

        public Error() {
            super((DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/slot/BasketSlotBookedMessageType$NoneBecauseOfExpressPickup;", "Lcom/carrefour/fid/android/domain/models/slot/BasketSlotBookedMessageType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class NoneBecauseOfExpressPickup extends BasketSlotBookedMessageType {
        @C12579k
        public static final Parcelable.Creator<NoneBecauseOfExpressPickup> CREATOR = new C38172a();
        @C12579k

        /* renamed from: a */
        public static final NoneBecauseOfExpressPickup f96700a = new NoneBecauseOfExpressPickup();

        /* renamed from: com.carrefour.fid.android.domain.models.slot.BasketSlotBookedMessageType$NoneBecauseOfExpressPickup$a */
        public static final class C38172a implements Parcelable.Creator<NoneBecauseOfExpressPickup> {
            @C12579k
            /* renamed from: a */
            public final NoneBecauseOfExpressPickup createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NoneBecauseOfExpressPickup.f96700a;
            }

            @C12579k
            /* renamed from: b */
            public final NoneBecauseOfExpressPickup[] newArray(int i) {
                return new NoneBecauseOfExpressPickup[i];
            }
        }

        public NoneBecauseOfExpressPickup() {
            super((DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/slot/BasketSlotBookedMessageType$QuantitiesHasChanged;", "Lcom/carrefour/fid/android/domain/models/slot/BasketSlotBookedMessageType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class QuantitiesHasChanged extends BasketSlotBookedMessageType {
        @C12579k
        public static final Parcelable.Creator<QuantitiesHasChanged> CREATOR = new C38173a();
        @C12579k

        /* renamed from: a */
        public static final QuantitiesHasChanged f96701a = new QuantitiesHasChanged();

        /* renamed from: com.carrefour.fid.android.domain.models.slot.BasketSlotBookedMessageType$QuantitiesHasChanged$a */
        public static final class C38173a implements Parcelable.Creator<QuantitiesHasChanged> {
            @C12579k
            /* renamed from: a */
            public final QuantitiesHasChanged createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return QuantitiesHasChanged.f96701a;
            }

            @C12579k
            /* renamed from: b */
            public final QuantitiesHasChanged[] newArray(int i) {
                return new QuantitiesHasChanged[i];
            }
        }

        public QuantitiesHasChanged() {
            super((DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/slot/BasketSlotBookedMessageType$Success;", "Lcom/carrefour/fid/android/domain/models/slot/BasketSlotBookedMessageType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class Success extends BasketSlotBookedMessageType {
        @C12579k
        public static final Parcelable.Creator<Success> CREATOR = new C38174a();
        @C12579k

        /* renamed from: a */
        public static final Success f96702a = new Success();

        /* renamed from: com.carrefour.fid.android.domain.models.slot.BasketSlotBookedMessageType$Success$a */
        public static final class C38174a implements Parcelable.Creator<Success> {
            @C12579k
            /* renamed from: a */
            public final Success createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Success.f96702a;
            }

            @C12579k
            /* renamed from: b */
            public final Success[] newArray(int i) {
                return new Success[i];
            }
        }

        public Success() {
            super((DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ BasketSlotBookedMessageType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public BasketSlotBookedMessageType() {
    }
}
