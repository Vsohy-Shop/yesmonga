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
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import java.io.Serializable;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.checkout.presentation.ui.slot.i */
public final class C39931i implements C19764l {
    @C12579k

    /* renamed from: h */
    public static final C39932a f101826h = new C39932a((DefaultConstructorMarker) null);

    /* renamed from: i */
    public static final int f101827i = 8;
    @C12579k

    /* renamed from: a */
    public final String f101828a;

    /* renamed from: b */
    public final boolean f101829b;
    @C12580l

    /* renamed from: c */
    public final BasketSlot f101830c;
    @C12580l

    /* renamed from: d */
    public final Bundle f101831d;
    @C12580l

    /* renamed from: e */
    public final SlotArgsHome f101832e;
    @C12580l

    /* renamed from: f */
    public final String f101833f;
    @C12580l

    /* renamed from: g */
    public final OrderType f101834g;

    /* renamed from: com.carrefour.fid.android.checkout.presentation.ui.slot.i$a */
    public static final class C39932a {
        public /* synthetic */ C39932a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C39931i mo131670a(@C12579k Bundle bundle) {
            boolean z;
            BasketSlot basketSlot;
            Bundle bundle2;
            SlotArgsHome slotArgsHome;
            String str;
            OrderType orderType;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C39931i.class.getClassLoader());
            if (bundle.containsKey("is_from_home_page")) {
                z = bundle.getBoolean("is_from_home_page");
            } else {
                z = false;
            }
            boolean z2 = z;
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
            if (bundle.containsKey("home_args")) {
                Class<SlotArgsHome> cls5 = SlotArgsHome.class;
                if (cls2.isAssignableFrom(cls5) || cls.isAssignableFrom(cls5)) {
                    slotArgsHome = (SlotArgsHome) bundle.get("home_args");
                } else {
                    throw new UnsupportedOperationException(cls5.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                slotArgsHome = null;
            }
            if (bundle.containsKey("order_id")) {
                str = bundle.getString("order_id");
            } else {
                str = null;
            }
            if (bundle.containsKey(C36178i.f89309d)) {
                Class<OrderType> cls6 = OrderType.class;
                if (cls2.isAssignableFrom(cls6) || cls.isAssignableFrom(cls6)) {
                    orderType = (OrderType) bundle.get(C36178i.f89309d);
                } else {
                    throw new UnsupportedOperationException(cls6.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                orderType = null;
            }
            if (bundle.containsKey("facility_service_id")) {
                String string = bundle.getString("facility_service_id");
                if (string != null) {
                    return new C39931i(string, z2, basketSlot, bundle2, slotArgsHome, str, orderType);
                }
                throw new IllegalArgumentException("Argument \"facility_service_id\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Required argument \"facility_service_id\" is missing and does not have an android:defaultValue");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: com.carrefour.fid.android.shared.domain.models.order.OrderType} */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.C12579k
        @kotlin.jvm.C11384m
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.carrefour.fid.android.checkout.presentation.p071ui.slot.C39931i mo131671b(@org.jetbrains.annotations.C12579k androidx.lifecycle.C19456p0 r17) {
            /*
                r16 = this;
                r0 = r17
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
                java.lang.String r2 = "basket_slot"
                boolean r3 = r0.mo57647f(r2)
                java.lang.String r4 = " must implement Parcelable or Serializable or must be an Enum."
                java.lang.Class<java.io.Serializable> r5 = java.io.Serializable.class
                java.lang.Class<android.os.Parcelable> r6 = android.os.Parcelable.class
                r7 = 0
                if (r3 == 0) goto L_0x0061
                java.lang.Class<com.carrefour.fid.android.domain.models.basket.BasketSlot> r3 = com.carrefour.fid.android.domain.models.basket.BasketSlot.class
                boolean r8 = r6.isAssignableFrom(r3)
                if (r8 != 0) goto L_0x0059
                boolean r8 = r5.isAssignableFrom(r3)
                if (r8 == 0) goto L_0x0040
                goto L_0x0059
            L_0x0040:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = r3.getName()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                r2.append(r4)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
            L_0x0059:
                java.lang.Object r2 = r0.mo57648h(r2)
                com.carrefour.fid.android.domain.models.basket.BasketSlot r2 = (com.carrefour.fid.android.domain.models.basket.BasketSlot) r2
                r11 = r2
                goto L_0x0062
            L_0x0061:
                r11 = r7
            L_0x0062:
                java.lang.String r2 = "category_list_by_gtin"
                boolean r3 = r0.mo57647f(r2)
                if (r3 == 0) goto L_0x009a
                java.lang.Class<android.os.Bundle> r3 = android.os.Bundle.class
                boolean r8 = r6.isAssignableFrom(r3)
                if (r8 != 0) goto L_0x0092
                boolean r8 = r5.isAssignableFrom(r3)
                if (r8 == 0) goto L_0x0079
                goto L_0x0092
            L_0x0079:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = r3.getName()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                r2.append(r4)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
            L_0x0092:
                java.lang.Object r2 = r0.mo57648h(r2)
                android.os.Bundle r2 = (android.os.Bundle) r2
                r12 = r2
                goto L_0x009b
            L_0x009a:
                r12 = r7
            L_0x009b:
                java.lang.String r2 = "home_args"
                boolean r3 = r0.mo57647f(r2)
                if (r3 == 0) goto L_0x00d3
                java.lang.Class<com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome> r3 = com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome.class
                boolean r8 = r6.isAssignableFrom(r3)
                if (r8 != 0) goto L_0x00cb
                boolean r8 = r5.isAssignableFrom(r3)
                if (r8 == 0) goto L_0x00b2
                goto L_0x00cb
            L_0x00b2:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = r3.getName()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                r2.append(r4)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
            L_0x00cb:
                java.lang.Object r2 = r0.mo57648h(r2)
                com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome r2 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome) r2
                r13 = r2
                goto L_0x00d4
            L_0x00d3:
                r13 = r7
            L_0x00d4:
                java.lang.String r2 = "order_id"
                boolean r3 = r0.mo57647f(r2)
                if (r3 == 0) goto L_0x00e4
                java.lang.Object r2 = r0.mo57648h(r2)
                java.lang.String r2 = (java.lang.String) r2
                r14 = r2
                goto L_0x00e5
            L_0x00e4:
                r14 = r7
            L_0x00e5:
                java.lang.String r2 = "order_type"
                boolean r3 = r0.mo57647f(r2)
                if (r3 == 0) goto L_0x011c
                java.lang.Class<com.carrefour.fid.android.shared.domain.models.order.OrderType> r3 = com.carrefour.fid.android.shared.domain.models.order.OrderType.class
                boolean r6 = r6.isAssignableFrom(r3)
                if (r6 != 0) goto L_0x0115
                boolean r5 = r5.isAssignableFrom(r3)
                if (r5 == 0) goto L_0x00fc
                goto L_0x0115
            L_0x00fc:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = r3.getName()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                r2.append(r4)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
            L_0x0115:
                java.lang.Object r2 = r0.mo57648h(r2)
                r7 = r2
                com.carrefour.fid.android.shared.domain.models.order.OrderType r7 = (com.carrefour.fid.android.shared.domain.models.order.OrderType) r7
            L_0x011c:
                r15 = r7
                java.lang.String r2 = "facility_service_id"
                boolean r3 = r0.mo57647f(r2)
                if (r3 == 0) goto L_0x0141
                java.lang.Object r0 = r0.mo57648h(r2)
                r9 = r0
                java.lang.String r9 = (java.lang.String) r9
                if (r9 == 0) goto L_0x0139
                com.carrefour.fid.android.checkout.presentation.ui.slot.i r0 = new com.carrefour.fid.android.checkout.presentation.ui.slot.i
                boolean r10 = r1.booleanValue()
                r8 = r0
                r8.<init>(r9, r10, r11, r12, r13, r14, r15)
                return r0
            L_0x0139:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Argument \"facility_service_id\" is marked as non-null but was passed a null value"
                r0.<init>(r1)
                throw r0
            L_0x0141:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Required argument \"facility_service_id\" is missing and does not have an android:defaultValue"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.presentation.p071ui.slot.C39931i.C39932a.mo131671b(androidx.lifecycle.p0):com.carrefour.fid.android.checkout.presentation.ui.slot.i");
        }

        public C39932a() {
        }
    }

    public C39931i(@C12579k String str, boolean z, @C12580l BasketSlot basketSlot, @C12580l Bundle bundle, @C12580l SlotArgsHome slotArgsHome, @C12580l String str2, @C12580l OrderType orderType) {
        Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
        this.f101828a = str;
        this.f101829b = z;
        this.f101830c = basketSlot;
        this.f101831d = bundle;
        this.f101832e = slotArgsHome;
        this.f101833f = str2;
        this.f101834g = orderType;
    }

    @C12579k
    @C11384m
    public static final C39931i fromBundle(@C12579k Bundle bundle) {
        return f101826h.mo131670a(bundle);
    }

    /* renamed from: i */
    public static /* synthetic */ C39931i m162698i(C39931i iVar, String str, boolean z, BasketSlot basketSlot, Bundle bundle, SlotArgsHome slotArgsHome, String str2, OrderType orderType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iVar.f101828a;
        }
        if ((i & 2) != 0) {
            z = iVar.f101829b;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            basketSlot = iVar.f101830c;
        }
        BasketSlot basketSlot2 = basketSlot;
        if ((i & 8) != 0) {
            bundle = iVar.f101831d;
        }
        Bundle bundle2 = bundle;
        if ((i & 16) != 0) {
            slotArgsHome = iVar.f101832e;
        }
        SlotArgsHome slotArgsHome2 = slotArgsHome;
        if ((i & 32) != 0) {
            str2 = iVar.f101833f;
        }
        String str3 = str2;
        if ((i & 64) != 0) {
            orderType = iVar.f101834g;
        }
        return iVar.mo131658h(str, z2, basketSlot2, bundle2, slotArgsHome2, str3, orderType);
    }

    @C12579k
    @C11384m
    /* renamed from: j */
    public static final C39931i m162699j(@C12579k C19456p0 p0Var) {
        return f101826h.mo131671b(p0Var);
    }

    @C12579k
    /* renamed from: a */
    public final String mo131650a() {
        return this.f101828a;
    }

    /* renamed from: b */
    public final boolean mo131651b() {
        return this.f101829b;
    }

    @C12580l
    /* renamed from: c */
    public final BasketSlot mo131652c() {
        return this.f101830c;
    }

    @C12580l
    /* renamed from: d */
    public final Bundle mo131653d() {
        return this.f101831d;
    }

    @C12580l
    /* renamed from: e */
    public final SlotArgsHome mo131654e() {
        return this.f101832e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39931i)) {
            return false;
        }
        C39931i iVar = (C39931i) obj;
        return Intrinsics.areEqual((Object) this.f101828a, (Object) iVar.f101828a) && this.f101829b == iVar.f101829b && Intrinsics.areEqual((Object) this.f101830c, (Object) iVar.f101830c) && Intrinsics.areEqual((Object) this.f101831d, (Object) iVar.f101831d) && Intrinsics.areEqual((Object) this.f101832e, (Object) iVar.f101832e) && Intrinsics.areEqual((Object) this.f101833f, (Object) iVar.f101833f) && Intrinsics.areEqual((Object) this.f101834g, (Object) iVar.f101834g);
    }

    @C12580l
    /* renamed from: f */
    public final String mo131656f() {
        return this.f101833f;
    }

    @C12580l
    /* renamed from: g */
    public final OrderType mo131657g() {
        return this.f101834g;
    }

    @C12579k
    /* renamed from: h */
    public final C39931i mo131658h(@C12579k String str, boolean z, @C12580l BasketSlot basketSlot, @C12580l Bundle bundle, @C12580l SlotArgsHome slotArgsHome, @C12580l String str2, @C12580l OrderType orderType) {
        Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
        return new C39931i(str, z, basketSlot, bundle, slotArgsHome, str2, orderType);
    }

    public int hashCode() {
        int hashCode = this.f101828a.hashCode() * 31;
        boolean z = this.f101829b;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        BasketSlot basketSlot = this.f101830c;
        int i2 = 0;
        int hashCode2 = (i + (basketSlot == null ? 0 : basketSlot.hashCode())) * 31;
        Bundle bundle = this.f101831d;
        int hashCode3 = (hashCode2 + (bundle == null ? 0 : bundle.hashCode())) * 31;
        SlotArgsHome slotArgsHome = this.f101832e;
        int hashCode4 = (hashCode3 + (slotArgsHome == null ? 0 : slotArgsHome.hashCode())) * 31;
        String str = this.f101833f;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        OrderType orderType = this.f101834g;
        if (orderType != null) {
            i2 = orderType.hashCode();
        }
        return hashCode5 + i2;
    }

    @C12580l
    /* renamed from: k */
    public final BasketSlot mo131660k() {
        return this.f101830c;
    }

    @C12580l
    /* renamed from: l */
    public final Bundle mo131661l() {
        return this.f101831d;
    }

    @C12579k
    /* renamed from: m */
    public final String mo131662m() {
        return this.f101828a;
    }

    @C12580l
    /* renamed from: n */
    public final SlotArgsHome mo131663n() {
        return this.f101832e;
    }

    @C12580l
    /* renamed from: o */
    public final String mo131664o() {
        return this.f101833f;
    }

    @C12580l
    /* renamed from: p */
    public final OrderType mo131665p() {
        return this.f101834g;
    }

    /* renamed from: q */
    public final boolean mo131666q() {
        return this.f101829b;
    }

    @C12579k
    /* renamed from: r */
    public final Bundle mo131667r() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_from_home_page", this.f101829b);
        Class<Parcelable> cls = Parcelable.class;
        Class<BasketSlot> cls2 = BasketSlot.class;
        Class<Serializable> cls3 = Serializable.class;
        if (cls.isAssignableFrom(cls2)) {
            bundle.putParcelable("basket_slot", this.f101830c);
        } else if (cls3.isAssignableFrom(cls2)) {
            bundle.putSerializable("basket_slot", (Serializable) this.f101830c);
        }
        Class<Bundle> cls4 = Bundle.class;
        if (cls.isAssignableFrom(cls4)) {
            bundle.putParcelable(C38212b.f96795c, this.f101831d);
        } else if (cls3.isAssignableFrom(cls4)) {
            bundle.putSerializable(C38212b.f96795c, (Serializable) this.f101831d);
        }
        Class<SlotArgsHome> cls5 = SlotArgsHome.class;
        if (cls.isAssignableFrom(cls5)) {
            bundle.putParcelable("home_args", this.f101832e);
        } else if (cls3.isAssignableFrom(cls5)) {
            bundle.putSerializable("home_args", (Serializable) this.f101832e);
        }
        bundle.putString("order_id", this.f101833f);
        Class<OrderType> cls6 = OrderType.class;
        if (cls.isAssignableFrom(cls6)) {
            bundle.putParcelable(C36178i.f89309d, this.f101834g);
        } else if (cls3.isAssignableFrom(cls6)) {
            bundle.putSerializable(C36178i.f89309d, (Serializable) this.f101834g);
        }
        bundle.putString("facility_service_id", this.f101828a);
        return bundle;
    }

    @C12579k
    /* renamed from: s */
    public final C19456p0 mo131668s() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("is_from_home_page", Boolean.valueOf(this.f101829b));
        Class<Parcelable> cls = Parcelable.class;
        Class<BasketSlot> cls2 = BasketSlot.class;
        Class<Serializable> cls3 = Serializable.class;
        if (cls.isAssignableFrom(cls2)) {
            p0Var.mo57656q("basket_slot", this.f101830c);
        } else if (cls3.isAssignableFrom(cls2)) {
            p0Var.mo57656q("basket_slot", (Serializable) this.f101830c);
        }
        Class<Bundle> cls4 = Bundle.class;
        if (cls.isAssignableFrom(cls4)) {
            p0Var.mo57656q(C38212b.f96795c, this.f101831d);
        } else if (cls3.isAssignableFrom(cls4)) {
            p0Var.mo57656q(C38212b.f96795c, (Serializable) this.f101831d);
        }
        Class<SlotArgsHome> cls5 = SlotArgsHome.class;
        if (cls.isAssignableFrom(cls5)) {
            p0Var.mo57656q("home_args", this.f101832e);
        } else if (cls3.isAssignableFrom(cls5)) {
            p0Var.mo57656q("home_args", (Serializable) this.f101832e);
        }
        p0Var.mo57656q("order_id", this.f101833f);
        Class<OrderType> cls6 = OrderType.class;
        if (cls.isAssignableFrom(cls6)) {
            p0Var.mo57656q(C36178i.f89309d, this.f101834g);
        } else if (cls3.isAssignableFrom(cls6)) {
            p0Var.mo57656q(C36178i.f89309d, (Serializable) this.f101834g);
        }
        p0Var.mo57656q("facility_service_id", this.f101828a);
        return p0Var;
    }

    @C12579k
    public String toString() {
        String str = this.f101828a;
        boolean z = this.f101829b;
        BasketSlot basketSlot = this.f101830c;
        Bundle bundle = this.f101831d;
        SlotArgsHome slotArgsHome = this.f101832e;
        String str2 = this.f101833f;
        OrderType orderType = this.f101834g;
        return "ServiceSlotOmrFragmentArgs(facilityServiceId=" + str + ", isFromHomePage=" + z + ", basketSlot=" + basketSlot + ", categoryListByGtin=" + bundle + ", homeArgs=" + slotArgsHome + ", orderId=" + str2 + ", orderType=" + orderType + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C39931i(java.lang.String r8, boolean r9, com.carrefour.fid.android.domain.models.basket.BasketSlot r10, android.os.Bundle r11, com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome r12, java.lang.String r13, com.carrefour.fid.android.shared.domain.models.order.OrderType r14, int r15, kotlin.jvm.internal.DefaultConstructorMarker r16) {
        /*
            r7 = this;
            r0 = r15 & 2
            if (r0 == 0) goto L_0x0006
            r0 = 0
            goto L_0x0007
        L_0x0006:
            r0 = r9
        L_0x0007:
            r1 = r15 & 4
            r2 = 0
            if (r1 == 0) goto L_0x000e
            r1 = r2
            goto L_0x000f
        L_0x000e:
            r1 = r10
        L_0x000f:
            r3 = r15 & 8
            if (r3 == 0) goto L_0x0015
            r3 = r2
            goto L_0x0016
        L_0x0015:
            r3 = r11
        L_0x0016:
            r4 = r15 & 16
            if (r4 == 0) goto L_0x001c
            r4 = r2
            goto L_0x001d
        L_0x001c:
            r4 = r12
        L_0x001d:
            r5 = r15 & 32
            if (r5 == 0) goto L_0x0023
            r5 = r2
            goto L_0x0024
        L_0x0023:
            r5 = r13
        L_0x0024:
            r6 = r15 & 64
            if (r6 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r2 = r14
        L_0x002a:
            r9 = r7
            r10 = r8
            r11 = r0
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.presentation.p071ui.slot.C39931i.<init>(java.lang.String, boolean, com.carrefour.fid.android.domain.models.basket.BasketSlot, android.os.Bundle, com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome, java.lang.String, com.carrefour.fid.android.shared.domain.models.order.OrderType, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
