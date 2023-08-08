package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.domain.models.slot.BasketSlotBookedMessageType;
import com.carrefour.fid.android.domain.models.slot.Slot;
import com.carrefour.fid.android.domain.models.slot.SlotExpress;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import java.io.Serializable;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.k */
public final class C23369k implements C19764l {
    @C12579k

    /* renamed from: e */
    public static final C23370a f59169e = new C23370a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final int f59170f = 8;
    @C12579k

    /* renamed from: a */
    public final BasketSlotBookedMessageType f59171a;
    @C12580l

    /* renamed from: b */
    public final SlotExpress f59172b;
    @C12580l

    /* renamed from: c */
    public final Slot f59173c;
    @C12580l

    /* renamed from: d */
    public final Bundle f59174d;

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.k$a */
    public static final class C23370a {
        public /* synthetic */ C23370a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: android.os.Bundle} */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.C12579k
        @kotlin.jvm.C11384m
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.carrefour.fid.android.presentation.p035ui.checkout.p036al.C23369k mo68469a(@org.jetbrains.annotations.C12579k android.os.Bundle r10) {
            /*
                r9 = this;
                java.lang.String r0 = "bundle"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                java.lang.Class<com.carrefour.fid.android.presentation.ui.checkout.al.k> r0 = com.carrefour.fid.android.presentation.p035ui.checkout.p036al.C23369k.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                r10.setClassLoader(r0)
                java.lang.String r0 = "basket_slot_booked_message_type"
                boolean r1 = r10.containsKey(r0)
                if (r1 == 0) goto L_0x0102
                java.lang.Class<android.os.Parcelable> r1 = android.os.Parcelable.class
                java.lang.Class<com.carrefour.fid.android.domain.models.slot.BasketSlotBookedMessageType> r2 = com.carrefour.fid.android.domain.models.slot.BasketSlotBookedMessageType.class
                boolean r3 = r1.isAssignableFrom(r2)
                java.lang.String r4 = " must implement Parcelable or Serializable or must be an Enum."
                java.lang.Class<java.io.Serializable> r5 = java.io.Serializable.class
                if (r3 != 0) goto L_0x0044
                boolean r3 = r5.isAssignableFrom(r2)
                if (r3 == 0) goto L_0x002b
                goto L_0x0044
            L_0x002b:
                java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = r2.getName()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r4)
                java.lang.String r0 = r1.toString()
                r10.<init>(r0)
                throw r10
            L_0x0044:
                java.lang.Object r0 = r10.get(r0)
                com.carrefour.fid.android.domain.models.slot.BasketSlotBookedMessageType r0 = (com.carrefour.fid.android.domain.models.slot.BasketSlotBookedMessageType) r0
                if (r0 == 0) goto L_0x00fa
                java.lang.String r2 = "basket_slot_express"
                boolean r3 = r10.containsKey(r2)
                r6 = 0
                if (r3 == 0) goto L_0x0084
                java.lang.Class<com.carrefour.fid.android.domain.models.slot.SlotExpress> r3 = com.carrefour.fid.android.domain.models.slot.SlotExpress.class
                boolean r7 = r1.isAssignableFrom(r3)
                if (r7 != 0) goto L_0x007d
                boolean r7 = r5.isAssignableFrom(r3)
                if (r7 == 0) goto L_0x0064
                goto L_0x007d
            L_0x0064:
                java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = r3.getName()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r4)
                java.lang.String r0 = r1.toString()
                r10.<init>(r0)
                throw r10
            L_0x007d:
                java.lang.Object r2 = r10.get(r2)
                com.carrefour.fid.android.domain.models.slot.SlotExpress r2 = (com.carrefour.fid.android.domain.models.slot.SlotExpress) r2
                goto L_0x0085
            L_0x0084:
                r2 = r6
            L_0x0085:
                java.lang.String r3 = "basket_selected_slot"
                boolean r7 = r10.containsKey(r3)
                if (r7 == 0) goto L_0x00bc
                java.lang.Class<com.carrefour.fid.android.domain.models.slot.Slot> r7 = com.carrefour.fid.android.domain.models.slot.Slot.class
                boolean r8 = r1.isAssignableFrom(r7)
                if (r8 != 0) goto L_0x00b5
                boolean r8 = r5.isAssignableFrom(r7)
                if (r8 == 0) goto L_0x009c
                goto L_0x00b5
            L_0x009c:
                java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = r7.getName()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r4)
                java.lang.String r0 = r1.toString()
                r10.<init>(r0)
                throw r10
            L_0x00b5:
                java.lang.Object r3 = r10.get(r3)
                com.carrefour.fid.android.domain.models.slot.Slot r3 = (com.carrefour.fid.android.domain.models.slot.Slot) r3
                goto L_0x00bd
            L_0x00bc:
                r3 = r6
            L_0x00bd:
                java.lang.String r7 = "category_list_by_gtin"
                boolean r8 = r10.containsKey(r7)
                if (r8 == 0) goto L_0x00f4
                java.lang.Class<android.os.Bundle> r6 = android.os.Bundle.class
                boolean r1 = r1.isAssignableFrom(r6)
                if (r1 != 0) goto L_0x00ed
                boolean r1 = r5.isAssignableFrom(r6)
                if (r1 == 0) goto L_0x00d4
                goto L_0x00ed
            L_0x00d4:
                java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = r6.getName()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r4)
                java.lang.String r0 = r1.toString()
                r10.<init>(r0)
                throw r10
            L_0x00ed:
                java.lang.Object r10 = r10.get(r7)
                r6 = r10
                android.os.Bundle r6 = (android.os.Bundle) r6
            L_0x00f4:
                com.carrefour.fid.android.presentation.ui.checkout.al.k r10 = new com.carrefour.fid.android.presentation.ui.checkout.al.k
                r10.<init>(r0, r2, r3, r6)
                return r10
            L_0x00fa:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Argument \"basket_slot_booked_message_type\" is marked as non-null but was passed a null value."
                r10.<init>(r0)
                throw r10
            L_0x0102:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Required argument \"basket_slot_booked_message_type\" is missing and does not have an android:defaultValue"
                r10.<init>(r0)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.p036al.C23369k.C23370a.mo68469a(android.os.Bundle):com.carrefour.fid.android.presentation.ui.checkout.al.k");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: android.os.Bundle} */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.C12579k
        @kotlin.jvm.C11384m
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.carrefour.fid.android.presentation.p035ui.checkout.p036al.C23369k mo68470b(@org.jetbrains.annotations.C12579k androidx.lifecycle.C19456p0 r10) {
            /*
                r9 = this;
                java.lang.String r0 = "savedStateHandle"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                java.lang.String r0 = "basket_slot_booked_message_type"
                boolean r1 = r10.mo57647f(r0)
                if (r1 == 0) goto L_0x00f9
                java.lang.Class<android.os.Parcelable> r1 = android.os.Parcelable.class
                java.lang.Class<com.carrefour.fid.android.domain.models.slot.BasketSlotBookedMessageType> r2 = com.carrefour.fid.android.domain.models.slot.BasketSlotBookedMessageType.class
                boolean r3 = r1.isAssignableFrom(r2)
                java.lang.String r4 = " must implement Parcelable or Serializable or must be an Enum."
                java.lang.Class<java.io.Serializable> r5 = java.io.Serializable.class
                if (r3 != 0) goto L_0x003b
                boolean r3 = r5.isAssignableFrom(r2)
                if (r3 == 0) goto L_0x0022
                goto L_0x003b
            L_0x0022:
                java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = r2.getName()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r4)
                java.lang.String r0 = r1.toString()
                r10.<init>(r0)
                throw r10
            L_0x003b:
                java.lang.Object r0 = r10.mo57648h(r0)
                com.carrefour.fid.android.domain.models.slot.BasketSlotBookedMessageType r0 = (com.carrefour.fid.android.domain.models.slot.BasketSlotBookedMessageType) r0
                if (r0 == 0) goto L_0x00f1
                java.lang.String r2 = "basket_slot_express"
                boolean r3 = r10.mo57647f(r2)
                r6 = 0
                if (r3 == 0) goto L_0x007b
                java.lang.Class<com.carrefour.fid.android.domain.models.slot.SlotExpress> r3 = com.carrefour.fid.android.domain.models.slot.SlotExpress.class
                boolean r7 = r1.isAssignableFrom(r3)
                if (r7 != 0) goto L_0x0074
                boolean r7 = r5.isAssignableFrom(r3)
                if (r7 == 0) goto L_0x005b
                goto L_0x0074
            L_0x005b:
                java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = r3.getName()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r4)
                java.lang.String r0 = r1.toString()
                r10.<init>(r0)
                throw r10
            L_0x0074:
                java.lang.Object r2 = r10.mo57648h(r2)
                com.carrefour.fid.android.domain.models.slot.SlotExpress r2 = (com.carrefour.fid.android.domain.models.slot.SlotExpress) r2
                goto L_0x007c
            L_0x007b:
                r2 = r6
            L_0x007c:
                java.lang.String r3 = "basket_selected_slot"
                boolean r7 = r10.mo57647f(r3)
                if (r7 == 0) goto L_0x00b3
                java.lang.Class<com.carrefour.fid.android.domain.models.slot.Slot> r7 = com.carrefour.fid.android.domain.models.slot.Slot.class
                boolean r8 = r1.isAssignableFrom(r7)
                if (r8 != 0) goto L_0x00ac
                boolean r8 = r5.isAssignableFrom(r7)
                if (r8 == 0) goto L_0x0093
                goto L_0x00ac
            L_0x0093:
                java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = r7.getName()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r4)
                java.lang.String r0 = r1.toString()
                r10.<init>(r0)
                throw r10
            L_0x00ac:
                java.lang.Object r3 = r10.mo57648h(r3)
                com.carrefour.fid.android.domain.models.slot.Slot r3 = (com.carrefour.fid.android.domain.models.slot.Slot) r3
                goto L_0x00b4
            L_0x00b3:
                r3 = r6
            L_0x00b4:
                java.lang.String r7 = "category_list_by_gtin"
                boolean r8 = r10.mo57647f(r7)
                if (r8 == 0) goto L_0x00eb
                java.lang.Class<android.os.Bundle> r6 = android.os.Bundle.class
                boolean r1 = r1.isAssignableFrom(r6)
                if (r1 != 0) goto L_0x00e4
                boolean r1 = r5.isAssignableFrom(r6)
                if (r1 == 0) goto L_0x00cb
                goto L_0x00e4
            L_0x00cb:
                java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = r6.getName()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r4)
                java.lang.String r0 = r1.toString()
                r10.<init>(r0)
                throw r10
            L_0x00e4:
                java.lang.Object r10 = r10.mo57648h(r7)
                r6 = r10
                android.os.Bundle r6 = (android.os.Bundle) r6
            L_0x00eb:
                com.carrefour.fid.android.presentation.ui.checkout.al.k r10 = new com.carrefour.fid.android.presentation.ui.checkout.al.k
                r10.<init>(r0, r2, r3, r6)
                return r10
            L_0x00f1:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Argument \"basket_slot_booked_message_type\" is marked as non-null but was passed a null value"
                r10.<init>(r0)
                throw r10
            L_0x00f9:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Required argument \"basket_slot_booked_message_type\" is missing and does not have an android:defaultValue"
                r10.<init>(r0)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.p036al.C23369k.C23370a.mo68470b(androidx.lifecycle.p0):com.carrefour.fid.android.presentation.ui.checkout.al.k");
        }

        public C23370a() {
        }
    }

    public C23369k(@C12579k BasketSlotBookedMessageType basketSlotBookedMessageType, @C12580l SlotExpress slotExpress, @C12580l Slot slot, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(basketSlotBookedMessageType, "basketSlotBookedMessageType");
        this.f59171a = basketSlotBookedMessageType;
        this.f59172b = slotExpress;
        this.f59173c = slot;
        this.f59174d = bundle;
    }

    /* renamed from: f */
    public static /* synthetic */ C23369k m104262f(C23369k kVar, BasketSlotBookedMessageType basketSlotBookedMessageType, SlotExpress slotExpress, Slot slot, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            basketSlotBookedMessageType = kVar.f59171a;
        }
        if ((i & 2) != 0) {
            slotExpress = kVar.f59172b;
        }
        if ((i & 4) != 0) {
            slot = kVar.f59173c;
        }
        if ((i & 8) != 0) {
            bundle = kVar.f59174d;
        }
        return kVar.mo68459e(basketSlotBookedMessageType, slotExpress, slot, bundle);
    }

    @C12579k
    @C11384m
    public static final C23369k fromBundle(@C12579k Bundle bundle) {
        return f59169e.mo68469a(bundle);
    }

    @C12579k
    @C11384m
    /* renamed from: g */
    public static final C23369k m104263g(@C12579k C19456p0 p0Var) {
        return f59169e.mo68470b(p0Var);
    }

    @C12579k
    /* renamed from: a */
    public final BasketSlotBookedMessageType mo68455a() {
        return this.f59171a;
    }

    @C12580l
    /* renamed from: b */
    public final SlotExpress mo68456b() {
        return this.f59172b;
    }

    @C12580l
    /* renamed from: c */
    public final Slot mo68457c() {
        return this.f59173c;
    }

    @C12580l
    /* renamed from: d */
    public final Bundle mo68458d() {
        return this.f59174d;
    }

    @C12579k
    /* renamed from: e */
    public final C23369k mo68459e(@C12579k BasketSlotBookedMessageType basketSlotBookedMessageType, @C12580l SlotExpress slotExpress, @C12580l Slot slot, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(basketSlotBookedMessageType, "basketSlotBookedMessageType");
        return new C23369k(basketSlotBookedMessageType, slotExpress, slot, bundle);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23369k)) {
            return false;
        }
        C23369k kVar = (C23369k) obj;
        return Intrinsics.areEqual((Object) this.f59171a, (Object) kVar.f59171a) && Intrinsics.areEqual((Object) this.f59172b, (Object) kVar.f59172b) && Intrinsics.areEqual((Object) this.f59173c, (Object) kVar.f59173c) && Intrinsics.areEqual((Object) this.f59174d, (Object) kVar.f59174d);
    }

    @C12580l
    /* renamed from: h */
    public final Slot mo68461h() {
        return this.f59173c;
    }

    public int hashCode() {
        int hashCode = this.f59171a.hashCode() * 31;
        SlotExpress slotExpress = this.f59172b;
        int i = 0;
        int hashCode2 = (hashCode + (slotExpress == null ? 0 : slotExpress.hashCode())) * 31;
        Slot slot = this.f59173c;
        int hashCode3 = (hashCode2 + (slot == null ? 0 : slot.hashCode())) * 31;
        Bundle bundle = this.f59174d;
        if (bundle != null) {
            i = bundle.hashCode();
        }
        return hashCode3 + i;
    }

    @C12579k
    /* renamed from: i */
    public final BasketSlotBookedMessageType mo68463i() {
        return this.f59171a;
    }

    @C12580l
    /* renamed from: j */
    public final SlotExpress mo68464j() {
        return this.f59172b;
    }

    @C12580l
    /* renamed from: k */
    public final Bundle mo68465k() {
        return this.f59174d;
    }

    @C12579k
    /* renamed from: l */
    public final Bundle mo68466l() {
        Bundle bundle = new Bundle();
        Class<Parcelable> cls = Parcelable.class;
        Class<BasketSlotBookedMessageType> cls2 = BasketSlotBookedMessageType.class;
        Class<Serializable> cls3 = Serializable.class;
        if (cls.isAssignableFrom(cls2)) {
            BasketSlotBookedMessageType basketSlotBookedMessageType = this.f59171a;
            Intrinsics.checkNotNull(basketSlotBookedMessageType, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("basket_slot_booked_message_type", basketSlotBookedMessageType);
        } else if (cls3.isAssignableFrom(cls2)) {
            BasketSlotBookedMessageType basketSlotBookedMessageType2 = this.f59171a;
            Intrinsics.checkNotNull(basketSlotBookedMessageType2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("basket_slot_booked_message_type", (Serializable) basketSlotBookedMessageType2);
        } else {
            String name = cls2.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        Class<SlotExpress> cls4 = SlotExpress.class;
        if (cls.isAssignableFrom(cls4)) {
            bundle.putParcelable("basket_slot_express", this.f59172b);
        } else if (cls3.isAssignableFrom(cls4)) {
            bundle.putSerializable("basket_slot_express", (Serializable) this.f59172b);
        }
        Class<Slot> cls5 = Slot.class;
        if (cls.isAssignableFrom(cls5)) {
            bundle.putParcelable("basket_selected_slot", this.f59173c);
        } else if (cls3.isAssignableFrom(cls5)) {
            bundle.putSerializable("basket_selected_slot", (Serializable) this.f59173c);
        }
        Class<Bundle> cls6 = Bundle.class;
        if (cls.isAssignableFrom(cls6)) {
            bundle.putParcelable(C38212b.f96795c, this.f59174d);
        } else if (cls3.isAssignableFrom(cls6)) {
            bundle.putSerializable(C38212b.f96795c, (Serializable) this.f59174d);
        }
        return bundle;
    }

    @C12579k
    /* renamed from: m */
    public final C19456p0 mo68467m() {
        C19456p0 p0Var = new C19456p0();
        Class<Parcelable> cls = Parcelable.class;
        Class<BasketSlotBookedMessageType> cls2 = BasketSlotBookedMessageType.class;
        Class<Serializable> cls3 = Serializable.class;
        if (cls.isAssignableFrom(cls2)) {
            BasketSlotBookedMessageType basketSlotBookedMessageType = this.f59171a;
            Intrinsics.checkNotNull(basketSlotBookedMessageType, "null cannot be cast to non-null type android.os.Parcelable");
            p0Var.mo57656q("basket_slot_booked_message_type", basketSlotBookedMessageType);
        } else if (cls3.isAssignableFrom(cls2)) {
            BasketSlotBookedMessageType basketSlotBookedMessageType2 = this.f59171a;
            Intrinsics.checkNotNull(basketSlotBookedMessageType2, "null cannot be cast to non-null type java.io.Serializable");
            p0Var.mo57656q("basket_slot_booked_message_type", (Serializable) basketSlotBookedMessageType2);
        } else {
            String name = cls2.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        Class<SlotExpress> cls4 = SlotExpress.class;
        if (cls.isAssignableFrom(cls4)) {
            p0Var.mo57656q("basket_slot_express", this.f59172b);
        } else if (cls3.isAssignableFrom(cls4)) {
            p0Var.mo57656q("basket_slot_express", (Serializable) this.f59172b);
        }
        Class<Slot> cls5 = Slot.class;
        if (cls.isAssignableFrom(cls5)) {
            p0Var.mo57656q("basket_selected_slot", this.f59173c);
        } else if (cls3.isAssignableFrom(cls5)) {
            p0Var.mo57656q("basket_selected_slot", (Serializable) this.f59173c);
        }
        Class<Bundle> cls6 = Bundle.class;
        if (cls.isAssignableFrom(cls6)) {
            p0Var.mo57656q(C38212b.f96795c, this.f59174d);
        } else if (cls3.isAssignableFrom(cls6)) {
            p0Var.mo57656q(C38212b.f96795c, (Serializable) this.f59174d);
        }
        return p0Var;
    }

    @C12579k
    public String toString() {
        BasketSlotBookedMessageType basketSlotBookedMessageType = this.f59171a;
        SlotExpress slotExpress = this.f59172b;
        Slot slot = this.f59173c;
        Bundle bundle = this.f59174d;
        return "CheckoutStep2FragmentArgs(basketSlotBookedMessageType=" + basketSlotBookedMessageType + ", basketSlotExpress=" + slotExpress + ", basketSelectedSlot=" + slot + ", categoryListByGtin=" + bundle + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C23369k(BasketSlotBookedMessageType basketSlotBookedMessageType, SlotExpress slotExpress, Slot slot, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(basketSlotBookedMessageType, (i & 2) != 0 ? null : slotExpress, (i & 4) != 0 ? null : slot, (i & 8) != 0 ? null : bundle);
    }
}
