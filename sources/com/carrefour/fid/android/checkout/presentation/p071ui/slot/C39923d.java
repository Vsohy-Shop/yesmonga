package com.carrefour.fid.android.checkout.presentation.p071ui.slot;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome;
import com.carrefour.fid.android.core.constants.C36178i;
import com.carrefour.fid.android.domain.models.basket.BasketSlot;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import java.io.Serializable;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.checkout.presentation.ui.slot.d */
public final class C39923d implements C19764l {
    @C12579k

    /* renamed from: i */
    public static final C39924a f101802i = new C39924a((DefaultConstructorMarker) null);

    /* renamed from: j */
    public static final int f101803j = 8;

    /* renamed from: a */
    public final boolean f101804a;

    /* renamed from: b */
    public final boolean f101805b;
    @C12580l

    /* renamed from: c */
    public final BasketSlot f101806c;
    @C12580l

    /* renamed from: d */
    public final Bundle f101807d;
    @C12580l

    /* renamed from: e */
    public final String f101808e;
    @C12580l

    /* renamed from: f */
    public final OrderType f101809f;
    @C12580l

    /* renamed from: g */
    public final String f101810g;
    @C12580l

    /* renamed from: h */
    public final SlotArgsHome f101811h;

    /* renamed from: com.carrefour.fid.android.checkout.presentation.ui.slot.d$a */
    public static final class C39924a {
        public /* synthetic */ C39924a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C39923d mo131627a(@C12579k Bundle bundle) {
            boolean z;
            BasketSlot basketSlot;
            Bundle bundle2;
            String str;
            OrderType orderType;
            String str2;
            SlotArgsHome slotArgsHome;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C39923d.class.getClassLoader());
            boolean z2 = false;
            if (bundle.containsKey("is_from_home_page")) {
                z = bundle.getBoolean("is_from_home_page");
            } else {
                z = false;
            }
            if (bundle.containsKey("is_from_checkout_step_3")) {
                z2 = bundle.getBoolean("is_from_checkout_step_3");
            }
            boolean z3 = z2;
            Class<Serializable> cls = Serializable.class;
            Class<Parcelable> cls2 = Parcelable.class;
            if (bundle.containsKey("basket_slot")) {
                Class<BasketSlot> cls3 = BasketSlot.class;
                if (cls2.isAssignableFrom(cls3) || cls.isAssignableFrom(cls3)) {
                    basketSlot = (BasketSlot) bundle.get("basket_slot");
                } else {
                    throw new UnsupportedOperationException(cls3.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                basketSlot = null;
            }
            if (bundle.containsKey(C38212b.f96795c)) {
                Class<Bundle> cls4 = Bundle.class;
                if (cls2.isAssignableFrom(cls4) || cls.isAssignableFrom(cls4)) {
                    bundle2 = (Bundle) bundle.get(C38212b.f96795c);
                } else {
                    throw new UnsupportedOperationException(cls4.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                bundle2 = null;
            }
            if (bundle.containsKey("order_id")) {
                str = bundle.getString("order_id");
            } else {
                str = null;
            }
            if (bundle.containsKey(C36178i.f89309d)) {
                Class<OrderType> cls5 = OrderType.class;
                if (cls2.isAssignableFrom(cls5) || cls.isAssignableFrom(cls5)) {
                    orderType = (OrderType) bundle.get(C36178i.f89309d);
                } else {
                    throw new UnsupportedOperationException(cls5.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                orderType = null;
            }
            if (bundle.containsKey("facility_store_id")) {
                str2 = bundle.getString("facility_store_id");
            } else {
                str2 = null;
            }
            if (bundle.containsKey("home_args")) {
                Class<SlotArgsHome> cls6 = SlotArgsHome.class;
                if (cls2.isAssignableFrom(cls6) || cls.isAssignableFrom(cls6)) {
                    slotArgsHome = (SlotArgsHome) bundle.get("home_args");
                } else {
                    throw new UnsupportedOperationException(cls6.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                slotArgsHome = null;
            }
            return new C39923d(z, z3, basketSlot, bundle2, str, orderType, str2, slotArgsHome);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome} */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.C12579k
        @kotlin.jvm.C11384m
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.carrefour.fid.android.checkout.presentation.p071ui.slot.C39923d mo131628b(@org.jetbrains.annotations.C12579k androidx.lifecycle.C19456p0 r19) {
            /*
                r18 = this;
                r0 = r19
                java.lang.String r1 = "savedStateHandle"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                java.lang.String r1 = "is_from_home_page"
                boolean r2 = r0.mo57647f(r1)
                if (r2 == 0) goto L_0x0020
                java.lang.Object r1 = r0.mo57648h(r1)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                if (r1 == 0) goto L_0x0018
                goto L_0x0022
            L_0x0018:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Argument \"is_from_home_page\" of type boolean does not support null values"
                r0.<init>(r1)
                throw r0
            L_0x0020:
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
            L_0x0022:
                java.lang.String r2 = "is_from_checkout_step_3"
                boolean r3 = r0.mo57647f(r2)
                if (r3 == 0) goto L_0x003b
                java.lang.Object r2 = r0.mo57648h(r2)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                if (r2 == 0) goto L_0x0033
                goto L_0x003d
            L_0x0033:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Argument \"is_from_checkout_step_3\" of type boolean does not support null values"
                r0.<init>(r1)
                throw r0
            L_0x003b:
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
            L_0x003d:
                java.lang.String r3 = "basket_slot"
                boolean r4 = r0.mo57647f(r3)
                java.lang.String r5 = " must implement Parcelable or Serializable or must be an Enum."
                java.lang.Class<java.io.Serializable> r6 = java.io.Serializable.class
                java.lang.Class<android.os.Parcelable> r7 = android.os.Parcelable.class
                r8 = 0
                if (r4 == 0) goto L_0x007c
                java.lang.Class<com.carrefour.fid.android.domain.models.basket.BasketSlot> r4 = com.carrefour.fid.android.domain.models.basket.BasketSlot.class
                boolean r9 = r7.isAssignableFrom(r4)
                if (r9 != 0) goto L_0x0074
                boolean r9 = r6.isAssignableFrom(r4)
                if (r9 == 0) goto L_0x005b
                goto L_0x0074
            L_0x005b:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = r4.getName()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                r2.append(r5)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
            L_0x0074:
                java.lang.Object r3 = r0.mo57648h(r3)
                com.carrefour.fid.android.domain.models.basket.BasketSlot r3 = (com.carrefour.fid.android.domain.models.basket.BasketSlot) r3
                r12 = r3
                goto L_0x007d
            L_0x007c:
                r12 = r8
            L_0x007d:
                java.lang.String r3 = "category_list_by_gtin"
                boolean r4 = r0.mo57647f(r3)
                if (r4 == 0) goto L_0x00b5
                java.lang.Class<android.os.Bundle> r4 = android.os.Bundle.class
                boolean r9 = r7.isAssignableFrom(r4)
                if (r9 != 0) goto L_0x00ad
                boolean r9 = r6.isAssignableFrom(r4)
                if (r9 == 0) goto L_0x0094
                goto L_0x00ad
            L_0x0094:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = r4.getName()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                r2.append(r5)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
            L_0x00ad:
                java.lang.Object r3 = r0.mo57648h(r3)
                android.os.Bundle r3 = (android.os.Bundle) r3
                r13 = r3
                goto L_0x00b6
            L_0x00b5:
                r13 = r8
            L_0x00b6:
                java.lang.String r3 = "order_id"
                boolean r4 = r0.mo57647f(r3)
                if (r4 == 0) goto L_0x00c6
                java.lang.Object r3 = r0.mo57648h(r3)
                java.lang.String r3 = (java.lang.String) r3
                r14 = r3
                goto L_0x00c7
            L_0x00c6:
                r14 = r8
            L_0x00c7:
                java.lang.String r3 = "order_type"
                boolean r4 = r0.mo57647f(r3)
                if (r4 == 0) goto L_0x00ff
                java.lang.Class<com.carrefour.fid.android.shared.domain.models.order.OrderType> r4 = com.carrefour.fid.android.shared.domain.models.order.OrderType.class
                boolean r9 = r7.isAssignableFrom(r4)
                if (r9 != 0) goto L_0x00f7
                boolean r9 = r6.isAssignableFrom(r4)
                if (r9 == 0) goto L_0x00de
                goto L_0x00f7
            L_0x00de:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = r4.getName()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                r2.append(r5)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
            L_0x00f7:
                java.lang.Object r3 = r0.mo57648h(r3)
                com.carrefour.fid.android.shared.domain.models.order.OrderType r3 = (com.carrefour.fid.android.shared.domain.models.order.OrderType) r3
                r15 = r3
                goto L_0x0100
            L_0x00ff:
                r15 = r8
            L_0x0100:
                java.lang.String r3 = "facility_store_id"
                boolean r4 = r0.mo57647f(r3)
                if (r4 == 0) goto L_0x0111
                java.lang.Object r3 = r0.mo57648h(r3)
                java.lang.String r3 = (java.lang.String) r3
                r16 = r3
                goto L_0x0113
            L_0x0111:
                r16 = r8
            L_0x0113:
                java.lang.String r3 = "home_args"
                boolean r4 = r0.mo57647f(r3)
                if (r4 == 0) goto L_0x014a
                java.lang.Class<com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome> r4 = com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome.class
                boolean r7 = r7.isAssignableFrom(r4)
                if (r7 != 0) goto L_0x0143
                boolean r6 = r6.isAssignableFrom(r4)
                if (r6 == 0) goto L_0x012a
                goto L_0x0143
            L_0x012a:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = r4.getName()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                r2.append(r5)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
            L_0x0143:
                java.lang.Object r0 = r0.mo57648h(r3)
                r8 = r0
                com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome r8 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome) r8
            L_0x014a:
                r17 = r8
                com.carrefour.fid.android.checkout.presentation.ui.slot.d r0 = new com.carrefour.fid.android.checkout.presentation.ui.slot.d
                boolean r10 = r1.booleanValue()
                boolean r11 = r2.booleanValue()
                r9 = r0
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.presentation.p071ui.slot.C39923d.C39924a.mo131628b(androidx.lifecycle.p0):com.carrefour.fid.android.checkout.presentation.ui.slot.d");
        }

        public C39924a() {
        }
    }

    public C39923d() {
        this(false, false, (BasketSlot) null, (Bundle) null, (String) null, (OrderType) null, (String) null, (SlotArgsHome) null, 255, (DefaultConstructorMarker) null);
    }

    @C12579k
    @C11384m
    public static final C39923d fromBundle(@C12579k Bundle bundle) {
        return f101802i.mo131627a(bundle);
    }

    /* renamed from: j */
    public static /* synthetic */ C39923d m162651j(C39923d dVar, boolean z, boolean z2, BasketSlot basketSlot, Bundle bundle, String str, OrderType orderType, String str2, SlotArgsHome slotArgsHome, int i, Object obj) {
        C39923d dVar2 = dVar;
        int i2 = i;
        return dVar.mo131615i((i2 & 1) != 0 ? dVar2.f101804a : z, (i2 & 2) != 0 ? dVar2.f101805b : z2, (i2 & 4) != 0 ? dVar2.f101806c : basketSlot, (i2 & 8) != 0 ? dVar2.f101807d : bundle, (i2 & 16) != 0 ? dVar2.f101808e : str, (i2 & 32) != 0 ? dVar2.f101809f : orderType, (i2 & 64) != 0 ? dVar2.f101810g : str2, (i2 & 128) != 0 ? dVar2.f101811h : slotArgsHome);
    }

    @C12579k
    @C11384m
    /* renamed from: k */
    public static final C39923d m162652k(@C12579k C19456p0 p0Var) {
        return f101802i.mo131628b(p0Var);
    }

    /* renamed from: a */
    public final boolean mo131605a() {
        return this.f101804a;
    }

    /* renamed from: b */
    public final boolean mo131606b() {
        return this.f101805b;
    }

    @C12580l
    /* renamed from: c */
    public final BasketSlot mo131607c() {
        return this.f101806c;
    }

    @C12580l
    /* renamed from: d */
    public final Bundle mo131608d() {
        return this.f101807d;
    }

    @C12580l
    /* renamed from: e */
    public final String mo131609e() {
        return this.f101808e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39923d)) {
            return false;
        }
        C39923d dVar = (C39923d) obj;
        return this.f101804a == dVar.f101804a && this.f101805b == dVar.f101805b && Intrinsics.areEqual((Object) this.f101806c, (Object) dVar.f101806c) && Intrinsics.areEqual((Object) this.f101807d, (Object) dVar.f101807d) && Intrinsics.areEqual((Object) this.f101808e, (Object) dVar.f101808e) && Intrinsics.areEqual((Object) this.f101809f, (Object) dVar.f101809f) && Intrinsics.areEqual((Object) this.f101810g, (Object) dVar.f101810g) && Intrinsics.areEqual((Object) this.f101811h, (Object) dVar.f101811h);
    }

    @C12580l
    /* renamed from: f */
    public final OrderType mo131611f() {
        return this.f101809f;
    }

    @C12580l
    /* renamed from: g */
    public final String mo131612g() {
        return this.f101810g;
    }

    @C12580l
    /* renamed from: h */
    public final SlotArgsHome mo131613h() {
        return this.f101811h;
    }

    public int hashCode() {
        boolean z = this.f101804a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f101805b;
        if (!z3) {
            z2 = z3;
        }
        int i2 = (i + (z2 ? 1 : 0)) * 31;
        BasketSlot basketSlot = this.f101806c;
        int i3 = 0;
        int hashCode = (i2 + (basketSlot == null ? 0 : basketSlot.hashCode())) * 31;
        Bundle bundle = this.f101807d;
        int hashCode2 = (hashCode + (bundle == null ? 0 : bundle.hashCode())) * 31;
        String str = this.f101808e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        OrderType orderType = this.f101809f;
        int hashCode4 = (hashCode3 + (orderType == null ? 0 : orderType.hashCode())) * 31;
        String str2 = this.f101810g;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SlotArgsHome slotArgsHome = this.f101811h;
        if (slotArgsHome != null) {
            i3 = slotArgsHome.hashCode();
        }
        return hashCode5 + i3;
    }

    @C12579k
    /* renamed from: i */
    public final C39923d mo131615i(boolean z, boolean z2, @C12580l BasketSlot basketSlot, @C12580l Bundle bundle, @C12580l String str, @C12580l OrderType orderType, @C12580l String str2, @C12580l SlotArgsHome slotArgsHome) {
        return new C39923d(z, z2, basketSlot, bundle, str, orderType, str2, slotArgsHome);
    }

    @C12580l
    /* renamed from: l */
    public final BasketSlot mo131616l() {
        return this.f101806c;
    }

    @C12580l
    /* renamed from: m */
    public final Bundle mo131617m() {
        return this.f101807d;
    }

    @C12580l
    /* renamed from: n */
    public final String mo131618n() {
        return this.f101810g;
    }

    @C12580l
    /* renamed from: o */
    public final SlotArgsHome mo131619o() {
        return this.f101811h;
    }

    @C12580l
    /* renamed from: p */
    public final String mo131620p() {
        return this.f101808e;
    }

    @C12580l
    /* renamed from: q */
    public final OrderType mo131621q() {
        return this.f101809f;
    }

    /* renamed from: r */
    public final boolean mo131622r() {
        return this.f101805b;
    }

    /* renamed from: s */
    public final boolean mo131623s() {
        return this.f101804a;
    }

    @C12579k
    /* renamed from: t */
    public final Bundle mo131624t() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_from_home_page", this.f101804a);
        bundle.putBoolean("is_from_checkout_step_3", this.f101805b);
        Class<Parcelable> cls = Parcelable.class;
        Class<BasketSlot> cls2 = BasketSlot.class;
        Class<Serializable> cls3 = Serializable.class;
        if (cls.isAssignableFrom(cls2)) {
            bundle.putParcelable("basket_slot", this.f101806c);
        } else if (cls3.isAssignableFrom(cls2)) {
            bundle.putSerializable("basket_slot", (Serializable) this.f101806c);
        }
        Class<Bundle> cls4 = Bundle.class;
        if (cls.isAssignableFrom(cls4)) {
            bundle.putParcelable(C38212b.f96795c, this.f101807d);
        } else if (cls3.isAssignableFrom(cls4)) {
            bundle.putSerializable(C38212b.f96795c, (Serializable) this.f101807d);
        }
        bundle.putString("order_id", this.f101808e);
        Class<OrderType> cls5 = OrderType.class;
        if (cls.isAssignableFrom(cls5)) {
            bundle.putParcelable(C36178i.f89309d, this.f101809f);
        } else if (cls3.isAssignableFrom(cls5)) {
            bundle.putSerializable(C36178i.f89309d, (Serializable) this.f101809f);
        }
        bundle.putString("facility_store_id", this.f101810g);
        Class<SlotArgsHome> cls6 = SlotArgsHome.class;
        if (cls.isAssignableFrom(cls6)) {
            bundle.putParcelable("home_args", this.f101811h);
        } else if (cls3.isAssignableFrom(cls6)) {
            bundle.putSerializable("home_args", (Serializable) this.f101811h);
        }
        return bundle;
    }

    @C12579k
    public String toString() {
        boolean z = this.f101804a;
        boolean z2 = this.f101805b;
        BasketSlot basketSlot = this.f101806c;
        Bundle bundle = this.f101807d;
        String str = this.f101808e;
        OrderType orderType = this.f101809f;
        String str2 = this.f101810g;
        SlotArgsHome slotArgsHome = this.f101811h;
        return "ServiceSlotFragmentArgs(isFromHomePage=" + z + ", isFromCheckoutStep3=" + z2 + ", basketSlot=" + basketSlot + ", categoryListByGtin=" + bundle + ", orderId=" + str + ", orderType=" + orderType + ", facilityStoreId=" + str2 + ", homeArgs=" + slotArgsHome + ")";
    }

    @C12579k
    /* renamed from: u */
    public final C19456p0 mo131626u() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("is_from_home_page", Boolean.valueOf(this.f101804a));
        p0Var.mo57656q("is_from_checkout_step_3", Boolean.valueOf(this.f101805b));
        Class<Parcelable> cls = Parcelable.class;
        Class<BasketSlot> cls2 = BasketSlot.class;
        Class<Serializable> cls3 = Serializable.class;
        if (cls.isAssignableFrom(cls2)) {
            p0Var.mo57656q("basket_slot", this.f101806c);
        } else if (cls3.isAssignableFrom(cls2)) {
            p0Var.mo57656q("basket_slot", (Serializable) this.f101806c);
        }
        Class<Bundle> cls4 = Bundle.class;
        if (cls.isAssignableFrom(cls4)) {
            p0Var.mo57656q(C38212b.f96795c, this.f101807d);
        } else if (cls3.isAssignableFrom(cls4)) {
            p0Var.mo57656q(C38212b.f96795c, (Serializable) this.f101807d);
        }
        p0Var.mo57656q("order_id", this.f101808e);
        Class<OrderType> cls5 = OrderType.class;
        if (cls.isAssignableFrom(cls5)) {
            p0Var.mo57656q(C36178i.f89309d, this.f101809f);
        } else if (cls3.isAssignableFrom(cls5)) {
            p0Var.mo57656q(C36178i.f89309d, (Serializable) this.f101809f);
        }
        p0Var.mo57656q("facility_store_id", this.f101810g);
        Class<SlotArgsHome> cls6 = SlotArgsHome.class;
        if (cls.isAssignableFrom(cls6)) {
            p0Var.mo57656q("home_args", this.f101811h);
        } else if (cls3.isAssignableFrom(cls6)) {
            p0Var.mo57656q("home_args", (Serializable) this.f101811h);
        }
        return p0Var;
    }

    public C39923d(boolean z, boolean z2, @C12580l BasketSlot basketSlot, @C12580l Bundle bundle, @C12580l String str, @C12580l OrderType orderType, @C12580l String str2, @C12580l SlotArgsHome slotArgsHome) {
        this.f101804a = z;
        this.f101805b = z2;
        this.f101806c = basketSlot;
        this.f101807d = bundle;
        this.f101808e = str;
        this.f101809f = orderType;
        this.f101810g = str2;
        this.f101811h = slotArgsHome;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C39923d(boolean r10, boolean r11, com.carrefour.fid.android.domain.models.basket.BasketSlot r12, android.os.Bundle r13, java.lang.String r14, com.carrefour.fid.android.shared.domain.models.order.OrderType r15, java.lang.String r16, com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r2 = r11
        L_0x0010:
            r3 = r0 & 4
            r4 = 0
            if (r3 == 0) goto L_0x0017
            r3 = r4
            goto L_0x0018
        L_0x0017:
            r3 = r12
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r4
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r4
            goto L_0x0026
        L_0x0025:
            r6 = r14
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r4
            goto L_0x002d
        L_0x002c:
            r7 = r15
        L_0x002d:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0033
            r8 = r4
            goto L_0x0035
        L_0x0033:
            r8 = r16
        L_0x0035:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r4 = r17
        L_0x003c:
            r10 = r9
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.presentation.p071ui.slot.C39923d.<init>(boolean, boolean, com.carrefour.fid.android.domain.models.basket.BasketSlot, android.os.Bundle, java.lang.String, com.carrefour.fid.android.shared.domain.models.order.OrderType, java.lang.String, com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
