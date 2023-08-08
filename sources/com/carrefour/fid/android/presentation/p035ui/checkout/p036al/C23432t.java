package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.domain.models.slot.SlotExpress;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26190a;
import java.io.Serializable;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.t */
public final class C23432t implements C19764l {
    @C12579k

    /* renamed from: e */
    public static final C23433a f59271e = new C23433a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final int f59272f = 8;
    @C12579k

    /* renamed from: a */
    public final String f59273a;
    @C12580l

    /* renamed from: b */
    public final Bundle f59274b;
    @C12580l

    /* renamed from: c */
    public final SlotExpress f59275c;
    @C12580l

    /* renamed from: d */
    public final Bundle f59276d;

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.t$a */
    public static final class C23433a {
        public /* synthetic */ C23433a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: android.os.Bundle} */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.C12579k
        @kotlin.jvm.C11384m
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.carrefour.fid.android.presentation.p035ui.checkout.p036al.C23432t mo68651a(@org.jetbrains.annotations.C12579k android.os.Bundle r11) {
            /*
                r10 = this;
                java.lang.String r0 = "bundle"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                java.lang.Class<com.carrefour.fid.android.presentation.ui.checkout.al.t> r0 = com.carrefour.fid.android.presentation.p035ui.checkout.p036al.C23432t.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                r11.setClassLoader(r0)
                java.lang.String r0 = "arguments_payment_confirmation"
                boolean r1 = r11.containsKey(r0)
                java.lang.String r2 = " must implement Parcelable or Serializable or must be an Enum."
                java.lang.Class<java.io.Serializable> r3 = java.io.Serializable.class
                java.lang.Class<android.os.Parcelable> r4 = android.os.Parcelable.class
                r5 = 0
                java.lang.Class<android.os.Bundle> r6 = android.os.Bundle.class
                if (r1 == 0) goto L_0x004c
                boolean r1 = r4.isAssignableFrom(r6)
                if (r1 != 0) goto L_0x0045
                boolean r1 = r3.isAssignableFrom(r6)
                if (r1 == 0) goto L_0x002c
                goto L_0x0045
            L_0x002c:
                java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = r6.getName()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = r1.toString()
                r11.<init>(r0)
                throw r11
            L_0x0045:
                java.lang.Object r0 = r11.get(r0)
                android.os.Bundle r0 = (android.os.Bundle) r0
                goto L_0x004d
            L_0x004c:
                r0 = r5
            L_0x004d:
                java.lang.String r1 = "basket_slot_express"
                boolean r7 = r11.containsKey(r1)
                if (r7 == 0) goto L_0x0084
                java.lang.Class<com.carrefour.fid.android.domain.models.slot.SlotExpress> r7 = com.carrefour.fid.android.domain.models.slot.SlotExpress.class
                boolean r8 = r4.isAssignableFrom(r7)
                if (r8 != 0) goto L_0x007d
                boolean r8 = r3.isAssignableFrom(r7)
                if (r8 == 0) goto L_0x0064
                goto L_0x007d
            L_0x0064:
                java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = r7.getName()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = r1.toString()
                r11.<init>(r0)
                throw r11
            L_0x007d:
                java.lang.Object r1 = r11.get(r1)
                com.carrefour.fid.android.domain.models.slot.SlotExpress r1 = (com.carrefour.fid.android.domain.models.slot.SlotExpress) r1
                goto L_0x0085
            L_0x0084:
                r1 = r5
            L_0x0085:
                java.lang.String r7 = "sub_basket_id"
                boolean r8 = r11.containsKey(r7)
                if (r8 == 0) goto L_0x00d6
                java.lang.String r7 = r11.getString(r7)
                if (r7 == 0) goto L_0x00ce
                java.lang.String r8 = "category_list_by_gtin"
                boolean r9 = r11.containsKey(r8)
                if (r9 == 0) goto L_0x00c8
                boolean r4 = r4.isAssignableFrom(r6)
                if (r4 != 0) goto L_0x00c1
                boolean r3 = r3.isAssignableFrom(r6)
                if (r3 == 0) goto L_0x00a8
                goto L_0x00c1
            L_0x00a8:
                java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = r6.getName()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = r1.toString()
                r11.<init>(r0)
                throw r11
            L_0x00c1:
                java.lang.Object r11 = r11.get(r8)
                r5 = r11
                android.os.Bundle r5 = (android.os.Bundle) r5
            L_0x00c8:
                com.carrefour.fid.android.presentation.ui.checkout.al.t r11 = new com.carrefour.fid.android.presentation.ui.checkout.al.t
                r11.<init>(r7, r0, r1, r5)
                return r11
            L_0x00ce:
                java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Argument \"sub_basket_id\" is marked as non-null but was passed a null value."
                r11.<init>(r0)
                throw r11
            L_0x00d6:
                java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Required argument \"sub_basket_id\" is missing and does not have an android:defaultValue"
                r11.<init>(r0)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.p036al.C23432t.C23433a.mo68651a(android.os.Bundle):com.carrefour.fid.android.presentation.ui.checkout.al.t");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: android.os.Bundle} */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.C12579k
        @kotlin.jvm.C11384m
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.carrefour.fid.android.presentation.p035ui.checkout.p036al.C23432t mo68652b(@org.jetbrains.annotations.C12579k androidx.lifecycle.C19456p0 r11) {
            /*
                r10 = this;
                java.lang.String r0 = "savedStateHandle"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                java.lang.String r0 = "arguments_payment_confirmation"
                boolean r1 = r11.mo57647f(r0)
                java.lang.String r2 = " must implement Parcelable or Serializable or must be an Enum."
                java.lang.Class<java.io.Serializable> r3 = java.io.Serializable.class
                java.lang.Class<android.os.Parcelable> r4 = android.os.Parcelable.class
                r5 = 0
                java.lang.Class<android.os.Bundle> r6 = android.os.Bundle.class
                if (r1 == 0) goto L_0x0043
                boolean r1 = r4.isAssignableFrom(r6)
                if (r1 != 0) goto L_0x003c
                boolean r1 = r3.isAssignableFrom(r6)
                if (r1 == 0) goto L_0x0023
                goto L_0x003c
            L_0x0023:
                java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = r6.getName()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = r1.toString()
                r11.<init>(r0)
                throw r11
            L_0x003c:
                java.lang.Object r0 = r11.mo57648h(r0)
                android.os.Bundle r0 = (android.os.Bundle) r0
                goto L_0x0044
            L_0x0043:
                r0 = r5
            L_0x0044:
                java.lang.String r1 = "basket_slot_express"
                boolean r7 = r11.mo57647f(r1)
                if (r7 == 0) goto L_0x007b
                java.lang.Class<com.carrefour.fid.android.domain.models.slot.SlotExpress> r7 = com.carrefour.fid.android.domain.models.slot.SlotExpress.class
                boolean r8 = r4.isAssignableFrom(r7)
                if (r8 != 0) goto L_0x0074
                boolean r8 = r3.isAssignableFrom(r7)
                if (r8 == 0) goto L_0x005b
                goto L_0x0074
            L_0x005b:
                java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = r7.getName()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = r1.toString()
                r11.<init>(r0)
                throw r11
            L_0x0074:
                java.lang.Object r1 = r11.mo57648h(r1)
                com.carrefour.fid.android.domain.models.slot.SlotExpress r1 = (com.carrefour.fid.android.domain.models.slot.SlotExpress) r1
                goto L_0x007c
            L_0x007b:
                r1 = r5
            L_0x007c:
                java.lang.String r7 = "sub_basket_id"
                boolean r8 = r11.mo57647f(r7)
                if (r8 == 0) goto L_0x00cf
                java.lang.Object r7 = r11.mo57648h(r7)
                java.lang.String r7 = (java.lang.String) r7
                if (r7 == 0) goto L_0x00c7
                java.lang.String r8 = "category_list_by_gtin"
                boolean r9 = r11.mo57647f(r8)
                if (r9 == 0) goto L_0x00c1
                boolean r4 = r4.isAssignableFrom(r6)
                if (r4 != 0) goto L_0x00ba
                boolean r3 = r3.isAssignableFrom(r6)
                if (r3 == 0) goto L_0x00a1
                goto L_0x00ba
            L_0x00a1:
                java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = r6.getName()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = r1.toString()
                r11.<init>(r0)
                throw r11
            L_0x00ba:
                java.lang.Object r11 = r11.mo57648h(r8)
                r5 = r11
                android.os.Bundle r5 = (android.os.Bundle) r5
            L_0x00c1:
                com.carrefour.fid.android.presentation.ui.checkout.al.t r11 = new com.carrefour.fid.android.presentation.ui.checkout.al.t
                r11.<init>(r7, r0, r1, r5)
                return r11
            L_0x00c7:
                java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Argument \"sub_basket_id\" is marked as non-null but was passed a null value"
                r11.<init>(r0)
                throw r11
            L_0x00cf:
                java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Required argument \"sub_basket_id\" is missing and does not have an android:defaultValue"
                r11.<init>(r0)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.p036al.C23432t.C23433a.mo68652b(androidx.lifecycle.p0):com.carrefour.fid.android.presentation.ui.checkout.al.t");
        }

        public C23433a() {
        }
    }

    public C23432t(@C12579k String str, @C12580l Bundle bundle, @C12580l SlotExpress slotExpress, @C12580l Bundle bundle2) {
        Intrinsics.checkNotNullParameter(str, "subBasketId");
        this.f59273a = str;
        this.f59274b = bundle;
        this.f59275c = slotExpress;
        this.f59276d = bundle2;
    }

    /* renamed from: f */
    public static /* synthetic */ C23432t m104475f(C23432t tVar, String str, Bundle bundle, SlotExpress slotExpress, Bundle bundle2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tVar.f59273a;
        }
        if ((i & 2) != 0) {
            bundle = tVar.f59274b;
        }
        if ((i & 4) != 0) {
            slotExpress = tVar.f59275c;
        }
        if ((i & 8) != 0) {
            bundle2 = tVar.f59276d;
        }
        return tVar.mo68641e(str, bundle, slotExpress, bundle2);
    }

    @C12579k
    @C11384m
    public static final C23432t fromBundle(@C12579k Bundle bundle) {
        return f59271e.mo68651a(bundle);
    }

    @C12579k
    @C11384m
    /* renamed from: g */
    public static final C23432t m104476g(@C12579k C19456p0 p0Var) {
        return f59271e.mo68652b(p0Var);
    }

    @C12579k
    /* renamed from: a */
    public final String mo68637a() {
        return this.f59273a;
    }

    @C12580l
    /* renamed from: b */
    public final Bundle mo68638b() {
        return this.f59274b;
    }

    @C12580l
    /* renamed from: c */
    public final SlotExpress mo68639c() {
        return this.f59275c;
    }

    @C12580l
    /* renamed from: d */
    public final Bundle mo68640d() {
        return this.f59276d;
    }

    @C12579k
    /* renamed from: e */
    public final C23432t mo68641e(@C12579k String str, @C12580l Bundle bundle, @C12580l SlotExpress slotExpress, @C12580l Bundle bundle2) {
        Intrinsics.checkNotNullParameter(str, "subBasketId");
        return new C23432t(str, bundle, slotExpress, bundle2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23432t)) {
            return false;
        }
        C23432t tVar = (C23432t) obj;
        return Intrinsics.areEqual((Object) this.f59273a, (Object) tVar.f59273a) && Intrinsics.areEqual((Object) this.f59274b, (Object) tVar.f59274b) && Intrinsics.areEqual((Object) this.f59275c, (Object) tVar.f59275c) && Intrinsics.areEqual((Object) this.f59276d, (Object) tVar.f59276d);
    }

    @C12580l
    /* renamed from: h */
    public final Bundle mo68643h() {
        return this.f59274b;
    }

    public int hashCode() {
        int hashCode = this.f59273a.hashCode() * 31;
        Bundle bundle = this.f59274b;
        int i = 0;
        int hashCode2 = (hashCode + (bundle == null ? 0 : bundle.hashCode())) * 31;
        SlotExpress slotExpress = this.f59275c;
        int hashCode3 = (hashCode2 + (slotExpress == null ? 0 : slotExpress.hashCode())) * 31;
        Bundle bundle2 = this.f59276d;
        if (bundle2 != null) {
            i = bundle2.hashCode();
        }
        return hashCode3 + i;
    }

    @C12580l
    /* renamed from: i */
    public final SlotExpress mo68645i() {
        return this.f59275c;
    }

    @C12580l
    /* renamed from: j */
    public final Bundle mo68646j() {
        return this.f59276d;
    }

    @C12579k
    /* renamed from: k */
    public final String mo68647k() {
        return this.f59273a;
    }

    @C12579k
    /* renamed from: l */
    public final Bundle mo68648l() {
        Bundle bundle = new Bundle();
        Class<Parcelable> cls = Parcelable.class;
        Class<Bundle> cls2 = Bundle.class;
        Class<Serializable> cls3 = Serializable.class;
        if (cls.isAssignableFrom(cls2)) {
            bundle.putParcelable("arguments_payment_confirmation", this.f59274b);
        } else if (cls3.isAssignableFrom(cls2)) {
            bundle.putSerializable("arguments_payment_confirmation", (Serializable) this.f59274b);
        }
        Class<SlotExpress> cls4 = SlotExpress.class;
        if (cls.isAssignableFrom(cls4)) {
            bundle.putParcelable("basket_slot_express", this.f59275c);
        } else if (cls3.isAssignableFrom(cls4)) {
            bundle.putSerializable("basket_slot_express", (Serializable) this.f59275c);
        }
        bundle.putString(C26190a.f64037a, this.f59273a);
        if (cls.isAssignableFrom(cls2)) {
            bundle.putParcelable(C38212b.f96795c, this.f59276d);
        } else if (cls3.isAssignableFrom(cls2)) {
            bundle.putSerializable(C38212b.f96795c, (Serializable) this.f59276d);
        }
        return bundle;
    }

    @C12579k
    /* renamed from: m */
    public final C19456p0 mo68649m() {
        C19456p0 p0Var = new C19456p0();
        Class<Parcelable> cls = Parcelable.class;
        Class<Bundle> cls2 = Bundle.class;
        Class<Serializable> cls3 = Serializable.class;
        if (cls.isAssignableFrom(cls2)) {
            p0Var.mo57656q("arguments_payment_confirmation", this.f59274b);
        } else if (cls3.isAssignableFrom(cls2)) {
            p0Var.mo57656q("arguments_payment_confirmation", (Serializable) this.f59274b);
        }
        Class<SlotExpress> cls4 = SlotExpress.class;
        if (cls.isAssignableFrom(cls4)) {
            p0Var.mo57656q("basket_slot_express", this.f59275c);
        } else if (cls3.isAssignableFrom(cls4)) {
            p0Var.mo57656q("basket_slot_express", (Serializable) this.f59275c);
        }
        p0Var.mo57656q(C26190a.f64037a, this.f59273a);
        if (cls.isAssignableFrom(cls2)) {
            p0Var.mo57656q(C38212b.f96795c, this.f59276d);
        } else if (cls3.isAssignableFrom(cls2)) {
            p0Var.mo57656q(C38212b.f96795c, (Serializable) this.f59276d);
        }
        return p0Var;
    }

    @C12579k
    public String toString() {
        String str = this.f59273a;
        Bundle bundle = this.f59274b;
        SlotExpress slotExpress = this.f59275c;
        Bundle bundle2 = this.f59276d;
        return "CheckoutStep4FragmentArgs(subBasketId=" + str + ", argumentsPaymentConfirmation=" + bundle + ", basketSlotExpress=" + slotExpress + ", categoryListByGtin=" + bundle2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C23432t(String str, Bundle bundle, SlotExpress slotExpress, Bundle bundle2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : bundle, (i & 4) != 0 ? null : slotExpress, (i & 8) != 0 ? null : bundle2);
    }
}
