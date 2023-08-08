package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.domain.models.basket.BasketSlot;
import com.carrefour.fid.android.domain.models.slot.BasketSlotBookedMessageType;
import com.carrefour.fid.android.domain.models.slot.Slot;
import com.carrefour.fid.android.domain.models.slot.SlotExpress;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.h */
public final class C23363h {
    @C12579k

    /* renamed from: a */
    public static final C23366c f59156a = new C23366c((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f59157b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.h$b */
    public static final class C23365b implements C19693b0 {
        @C12580l

        /* renamed from: a */
        public final BasketSlot f59163a;
        @C12580l

        /* renamed from: b */
        public final String f59164b;
        @C12580l

        /* renamed from: c */
        public final Bundle f59165c;

        /* renamed from: d */
        public final int f59166d;

        public C23365b() {
            this((BasketSlot) null, (String) null, (Bundle) null, 7, (DefaultConstructorMarker) null);
        }

        /* renamed from: e */
        public static /* synthetic */ C23365b m104245e(C23365b bVar, BasketSlot basketSlot, String str, Bundle bundle, int i, Object obj) {
            if ((i & 1) != 0) {
                basketSlot = bVar.f59163a;
            }
            if ((i & 2) != 0) {
                str = bVar.f59164b;
            }
            if ((i & 4) != 0) {
                bundle = bVar.f59165c;
            }
            return bVar.mo68445d(basketSlot, str, bundle);
        }

        @C12580l
        /* renamed from: a */
        public final BasketSlot mo68442a() {
            return this.f59163a;
        }

        @C12580l
        /* renamed from: b */
        public final String mo68443b() {
            return this.f59164b;
        }

        @C12580l
        /* renamed from: c */
        public final Bundle mo68444c() {
            return this.f59165c;
        }

        @C12579k
        /* renamed from: d */
        public final C23365b mo68445d(@C12580l BasketSlot basketSlot, @C12580l String str, @C12580l Bundle bundle) {
            return new C23365b(basketSlot, str, bundle);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23365b)) {
                return false;
            }
            C23365b bVar = (C23365b) obj;
            return Intrinsics.areEqual((Object) this.f59163a, (Object) bVar.f59163a) && Intrinsics.areEqual((Object) this.f59164b, (Object) bVar.f59164b) && Intrinsics.areEqual((Object) this.f59165c, (Object) bVar.f59165c);
        }

        @C12580l
        /* renamed from: f */
        public final BasketSlot mo68447f() {
            return this.f59163a;
        }

        @C12580l
        /* renamed from: g */
        public final Bundle mo68448g() {
            return this.f59165c;
        }

        public int getActionId() {
            return this.f59166d;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<Parcelable> cls = Parcelable.class;
            Class<BasketSlot> cls2 = BasketSlot.class;
            Class<Serializable> cls3 = Serializable.class;
            if (cls.isAssignableFrom(cls2)) {
                bundle.putParcelable("basket_slot", this.f59163a);
            } else if (cls3.isAssignableFrom(cls2)) {
                bundle.putSerializable("basket_slot", (Serializable) this.f59163a);
            }
            bundle.putString("facility_store_id", this.f59164b);
            Class<Bundle> cls4 = Bundle.class;
            if (cls.isAssignableFrom(cls4)) {
                bundle.putParcelable(C38212b.f96795c, this.f59165c);
            } else if (cls3.isAssignableFrom(cls4)) {
                bundle.putSerializable(C38212b.f96795c, (Serializable) this.f59165c);
            }
            return bundle;
        }

        @C12580l
        /* renamed from: h */
        public final String mo68449h() {
            return this.f59164b;
        }

        public int hashCode() {
            BasketSlot basketSlot = this.f59163a;
            int i = 0;
            int hashCode = (basketSlot == null ? 0 : basketSlot.hashCode()) * 31;
            String str = this.f59164b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Bundle bundle = this.f59165c;
            if (bundle != null) {
                i = bundle.hashCode();
            }
            return hashCode2 + i;
        }

        @C12579k
        public String toString() {
            BasketSlot basketSlot = this.f59163a;
            String str = this.f59164b;
            Bundle bundle = this.f59165c;
            return "ActionBasketToServiceSlot(basketSlot=" + basketSlot + ", facilityStoreId=" + str + ", categoryListByGtin=" + bundle + ")";
        }

        public C23365b(@C12580l BasketSlot basketSlot, @C12580l String str, @C12580l Bundle bundle) {
            this.f59163a = basketSlot;
            this.f59164b = str;
            this.f59165c = bundle;
            this.f59166d = R.id.action_basket_to_serviceSlot;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C23365b(BasketSlot basketSlot, String str, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : basketSlot, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bundle);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.h$c */
    public static final class C23366c {
        public /* synthetic */ C23366c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19693b0 m104253b(C23366c cVar, BasketSlotBookedMessageType basketSlotBookedMessageType, SlotExpress slotExpress, Slot slot, Bundle bundle, int i, Object obj) {
            if ((i & 2) != 0) {
                slotExpress = null;
            }
            if ((i & 4) != 0) {
                slot = null;
            }
            if ((i & 8) != 0) {
                bundle = null;
            }
            return cVar.mo68452a(basketSlotBookedMessageType, slotExpress, slot, bundle);
        }

        /* renamed from: d */
        public static /* synthetic */ C19693b0 m104254d(C23366c cVar, BasketSlot basketSlot, String str, Bundle bundle, int i, Object obj) {
            if ((i & 1) != 0) {
                basketSlot = null;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                bundle = null;
            }
            return cVar.mo68453c(basketSlot, str, bundle);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo68452a(@C12579k BasketSlotBookedMessageType basketSlotBookedMessageType, @C12580l SlotExpress slotExpress, @C12580l Slot slot, @C12580l Bundle bundle) {
            Intrinsics.checkNotNullParameter(basketSlotBookedMessageType, "basketSlotBookedMessageType");
            return new C23364a(basketSlotBookedMessageType, slotExpress, slot, bundle);
        }

        @C12579k
        /* renamed from: c */
        public final C19693b0 mo68453c(@C12580l BasketSlot basketSlot, @C12580l String str, @C12580l Bundle bundle) {
            return new C23365b(basketSlot, str, bundle);
        }

        public C23366c() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.h$a */
    public static final class C23364a implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final BasketSlotBookedMessageType f59158a;
        @C12580l

        /* renamed from: b */
        public final SlotExpress f59159b;
        @C12580l

        /* renamed from: c */
        public final Slot f59160c;
        @C12580l

        /* renamed from: d */
        public final Bundle f59161d;

        /* renamed from: e */
        public final int f59162e;

        public C23364a(@C12579k BasketSlotBookedMessageType basketSlotBookedMessageType, @C12580l SlotExpress slotExpress, @C12580l Slot slot, @C12580l Bundle bundle) {
            Intrinsics.checkNotNullParameter(basketSlotBookedMessageType, "basketSlotBookedMessageType");
            this.f59158a = basketSlotBookedMessageType;
            this.f59159b = slotExpress;
            this.f59160c = slot;
            this.f59161d = bundle;
            this.f59162e = R.id.action_basket_to_checkout;
        }

        /* renamed from: f */
        public static /* synthetic */ C23364a m104235f(C23364a aVar, BasketSlotBookedMessageType basketSlotBookedMessageType, SlotExpress slotExpress, Slot slot, Bundle bundle, int i, Object obj) {
            if ((i & 1) != 0) {
                basketSlotBookedMessageType = aVar.f59158a;
            }
            if ((i & 2) != 0) {
                slotExpress = aVar.f59159b;
            }
            if ((i & 4) != 0) {
                slot = aVar.f59160c;
            }
            if ((i & 8) != 0) {
                bundle = aVar.f59161d;
            }
            return aVar.mo68434e(basketSlotBookedMessageType, slotExpress, slot, bundle);
        }

        @C12579k
        /* renamed from: a */
        public final BasketSlotBookedMessageType mo68430a() {
            return this.f59158a;
        }

        @C12580l
        /* renamed from: b */
        public final SlotExpress mo68431b() {
            return this.f59159b;
        }

        @C12580l
        /* renamed from: c */
        public final Slot mo68432c() {
            return this.f59160c;
        }

        @C12580l
        /* renamed from: d */
        public final Bundle mo68433d() {
            return this.f59161d;
        }

        @C12579k
        /* renamed from: e */
        public final C23364a mo68434e(@C12579k BasketSlotBookedMessageType basketSlotBookedMessageType, @C12580l SlotExpress slotExpress, @C12580l Slot slot, @C12580l Bundle bundle) {
            Intrinsics.checkNotNullParameter(basketSlotBookedMessageType, "basketSlotBookedMessageType");
            return new C23364a(basketSlotBookedMessageType, slotExpress, slot, bundle);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23364a)) {
                return false;
            }
            C23364a aVar = (C23364a) obj;
            return Intrinsics.areEqual((Object) this.f59158a, (Object) aVar.f59158a) && Intrinsics.areEqual((Object) this.f59159b, (Object) aVar.f59159b) && Intrinsics.areEqual((Object) this.f59160c, (Object) aVar.f59160c) && Intrinsics.areEqual((Object) this.f59161d, (Object) aVar.f59161d);
        }

        @C12580l
        /* renamed from: g */
        public final Slot mo68436g() {
            return this.f59160c;
        }

        public int getActionId() {
            return this.f59162e;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<Parcelable> cls = Parcelable.class;
            Class<BasketSlotBookedMessageType> cls2 = BasketSlotBookedMessageType.class;
            Class<Serializable> cls3 = Serializable.class;
            if (cls.isAssignableFrom(cls2)) {
                BasketSlotBookedMessageType basketSlotBookedMessageType = this.f59158a;
                Intrinsics.checkNotNull(basketSlotBookedMessageType, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("basket_slot_booked_message_type", basketSlotBookedMessageType);
            } else if (cls3.isAssignableFrom(cls2)) {
                BasketSlotBookedMessageType basketSlotBookedMessageType2 = this.f59158a;
                Intrinsics.checkNotNull(basketSlotBookedMessageType2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("basket_slot_booked_message_type", (Serializable) basketSlotBookedMessageType2);
            } else {
                String name = cls2.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            Class<SlotExpress> cls4 = SlotExpress.class;
            if (cls.isAssignableFrom(cls4)) {
                bundle.putParcelable("basket_slot_express", this.f59159b);
            } else if (cls3.isAssignableFrom(cls4)) {
                bundle.putSerializable("basket_slot_express", (Serializable) this.f59159b);
            }
            Class<Slot> cls5 = Slot.class;
            if (cls.isAssignableFrom(cls5)) {
                bundle.putParcelable("basket_selected_slot", this.f59160c);
            } else if (cls3.isAssignableFrom(cls5)) {
                bundle.putSerializable("basket_selected_slot", (Serializable) this.f59160c);
            }
            Class<Bundle> cls6 = Bundle.class;
            if (cls.isAssignableFrom(cls6)) {
                bundle.putParcelable(C38212b.f96795c, this.f59161d);
            } else if (cls3.isAssignableFrom(cls6)) {
                bundle.putSerializable(C38212b.f96795c, (Serializable) this.f59161d);
            }
            return bundle;
        }

        @C12579k
        /* renamed from: h */
        public final BasketSlotBookedMessageType mo68437h() {
            return this.f59158a;
        }

        public int hashCode() {
            int hashCode = this.f59158a.hashCode() * 31;
            SlotExpress slotExpress = this.f59159b;
            int i = 0;
            int hashCode2 = (hashCode + (slotExpress == null ? 0 : slotExpress.hashCode())) * 31;
            Slot slot = this.f59160c;
            int hashCode3 = (hashCode2 + (slot == null ? 0 : slot.hashCode())) * 31;
            Bundle bundle = this.f59161d;
            if (bundle != null) {
                i = bundle.hashCode();
            }
            return hashCode3 + i;
        }

        @C12580l
        /* renamed from: i */
        public final SlotExpress mo68439i() {
            return this.f59159b;
        }

        @C12580l
        /* renamed from: j */
        public final Bundle mo68440j() {
            return this.f59161d;
        }

        @C12579k
        public String toString() {
            BasketSlotBookedMessageType basketSlotBookedMessageType = this.f59158a;
            SlotExpress slotExpress = this.f59159b;
            Slot slot = this.f59160c;
            Bundle bundle = this.f59161d;
            return "ActionBasketToCheckout(basketSlotBookedMessageType=" + basketSlotBookedMessageType + ", basketSlotExpress=" + slotExpress + ", basketSelectedSlot=" + slot + ", categoryListByGtin=" + bundle + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C23364a(BasketSlotBookedMessageType basketSlotBookedMessageType, SlotExpress slotExpress, Slot slot, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(basketSlotBookedMessageType, (i & 2) != 0 ? null : slotExpress, (i & 4) != 0 ? null : slot, (i & 8) != 0 ? null : bundle);
        }
    }
}
