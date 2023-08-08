package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.core.constants.C36181l;
import com.carrefour.fid.android.domain.models.slot.SlotExpress;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import com.carrefour.fid.android.shared.constant.C28559l;
import java.io.Serializable;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.q */
public final class C23378q implements C19764l {
    @C12579k

    /* renamed from: e */
    public static final C23379a f59184e = new C23379a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final int f59185f = 8;

    /* renamed from: a */
    public final boolean f59186a;
    @C12580l

    /* renamed from: b */
    public final SlotExpress f59187b;

    /* renamed from: c */
    public final boolean f59188c;
    @C12580l

    /* renamed from: d */
    public final Bundle f59189d;

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.q$a */
    public static final class C23379a {
        public /* synthetic */ C23379a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: android.os.Bundle} */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.C12579k
        @kotlin.jvm.C11384m
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.carrefour.fid.android.presentation.p035ui.checkout.p036al.C23378q mo68500a(@org.jetbrains.annotations.C12579k android.os.Bundle r10) {
            /*
                r9 = this;
                java.lang.String r0 = "bundle"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                java.lang.Class<com.carrefour.fid.android.presentation.ui.checkout.al.q> r0 = com.carrefour.fid.android.presentation.p035ui.checkout.p036al.C23378q.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                r10.setClassLoader(r0)
                java.lang.String r0 = "is_express_pickup"
                boolean r1 = r10.containsKey(r0)
                if (r1 == 0) goto L_0x001b
                boolean r0 = r10.getBoolean(r0)
                goto L_0x001c
            L_0x001b:
                r0 = 0
            L_0x001c:
                java.lang.String r1 = "basket_slot_express"
                boolean r2 = r10.containsKey(r1)
                java.lang.String r3 = " must implement Parcelable or Serializable or must be an Enum."
                java.lang.Class<java.io.Serializable> r4 = java.io.Serializable.class
                java.lang.Class<android.os.Parcelable> r5 = android.os.Parcelable.class
                r6 = 0
                if (r2 == 0) goto L_0x005a
                java.lang.Class<com.carrefour.fid.android.domain.models.slot.SlotExpress> r2 = com.carrefour.fid.android.domain.models.slot.SlotExpress.class
                boolean r7 = r5.isAssignableFrom(r2)
                if (r7 != 0) goto L_0x0053
                boolean r7 = r4.isAssignableFrom(r2)
                if (r7 == 0) goto L_0x003a
                goto L_0x0053
            L_0x003a:
                java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = r2.getName()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r3)
                java.lang.String r0 = r1.toString()
                r10.<init>(r0)
                throw r10
            L_0x0053:
                java.lang.Object r1 = r10.get(r1)
                com.carrefour.fid.android.domain.models.slot.SlotExpress r1 = (com.carrefour.fid.android.domain.models.slot.SlotExpress) r1
                goto L_0x005b
            L_0x005a:
                r1 = r6
            L_0x005b:
                java.lang.String r2 = "is_post_order_substitution_enabled"
                boolean r7 = r10.containsKey(r2)
                if (r7 == 0) goto L_0x0068
                boolean r2 = r10.getBoolean(r2)
                goto L_0x0069
            L_0x0068:
                r2 = 1
            L_0x0069:
                java.lang.String r7 = "category_list_by_gtin"
                boolean r8 = r10.containsKey(r7)
                if (r8 == 0) goto L_0x00a0
                java.lang.Class<android.os.Bundle> r6 = android.os.Bundle.class
                boolean r5 = r5.isAssignableFrom(r6)
                if (r5 != 0) goto L_0x0099
                boolean r4 = r4.isAssignableFrom(r6)
                if (r4 == 0) goto L_0x0080
                goto L_0x0099
            L_0x0080:
                java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = r6.getName()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r3)
                java.lang.String r0 = r1.toString()
                r10.<init>(r0)
                throw r10
            L_0x0099:
                java.lang.Object r10 = r10.get(r7)
                r6 = r10
                android.os.Bundle r6 = (android.os.Bundle) r6
            L_0x00a0:
                com.carrefour.fid.android.presentation.ui.checkout.al.q r10 = new com.carrefour.fid.android.presentation.ui.checkout.al.q
                r10.<init>(r0, r1, r2, r6)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.p036al.C23378q.C23379a.mo68500a(android.os.Bundle):com.carrefour.fid.android.presentation.ui.checkout.al.q");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: android.os.Bundle} */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.C12579k
        @kotlin.jvm.C11384m
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.carrefour.fid.android.presentation.p035ui.checkout.p036al.C23378q mo68501b(@org.jetbrains.annotations.C12579k androidx.lifecycle.C19456p0 r10) {
            /*
                r9 = this;
                java.lang.String r0 = "savedStateHandle"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                java.lang.String r0 = "is_express_pickup"
                boolean r1 = r10.mo57647f(r0)
                if (r1 == 0) goto L_0x001e
                java.lang.Object r0 = r10.mo57648h(r0)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                if (r0 == 0) goto L_0x0016
                goto L_0x0020
            L_0x0016:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Argument \"is_express_pickup\" of type boolean does not support null values"
                r10.<init>(r0)
                throw r10
            L_0x001e:
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
            L_0x0020:
                java.lang.String r1 = "basket_slot_express"
                boolean r2 = r10.mo57647f(r1)
                java.lang.String r3 = " must implement Parcelable or Serializable or must be an Enum."
                java.lang.Class<java.io.Serializable> r4 = java.io.Serializable.class
                java.lang.Class<android.os.Parcelable> r5 = android.os.Parcelable.class
                r6 = 0
                if (r2 == 0) goto L_0x005e
                java.lang.Class<com.carrefour.fid.android.domain.models.slot.SlotExpress> r2 = com.carrefour.fid.android.domain.models.slot.SlotExpress.class
                boolean r7 = r5.isAssignableFrom(r2)
                if (r7 != 0) goto L_0x0057
                boolean r7 = r4.isAssignableFrom(r2)
                if (r7 == 0) goto L_0x003e
                goto L_0x0057
            L_0x003e:
                java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = r2.getName()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r3)
                java.lang.String r0 = r1.toString()
                r10.<init>(r0)
                throw r10
            L_0x0057:
                java.lang.Object r1 = r10.mo57648h(r1)
                com.carrefour.fid.android.domain.models.slot.SlotExpress r1 = (com.carrefour.fid.android.domain.models.slot.SlotExpress) r1
                goto L_0x005f
            L_0x005e:
                r1 = r6
            L_0x005f:
                java.lang.String r2 = "is_post_order_substitution_enabled"
                boolean r7 = r10.mo57647f(r2)
                if (r7 == 0) goto L_0x0078
                java.lang.Object r2 = r10.mo57648h(r2)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                if (r2 == 0) goto L_0x0070
                goto L_0x007a
            L_0x0070:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Argument \"is_post_order_substitution_enabled\" of type boolean does not support null values"
                r10.<init>(r0)
                throw r10
            L_0x0078:
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
            L_0x007a:
                java.lang.String r7 = "category_list_by_gtin"
                boolean r8 = r10.mo57647f(r7)
                if (r8 == 0) goto L_0x00b1
                java.lang.Class<android.os.Bundle> r6 = android.os.Bundle.class
                boolean r5 = r5.isAssignableFrom(r6)
                if (r5 != 0) goto L_0x00aa
                boolean r4 = r4.isAssignableFrom(r6)
                if (r4 == 0) goto L_0x0091
                goto L_0x00aa
            L_0x0091:
                java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = r6.getName()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r3)
                java.lang.String r0 = r1.toString()
                r10.<init>(r0)
                throw r10
            L_0x00aa:
                java.lang.Object r10 = r10.mo57648h(r7)
                r6 = r10
                android.os.Bundle r6 = (android.os.Bundle) r6
            L_0x00b1:
                com.carrefour.fid.android.presentation.ui.checkout.al.q r10 = new com.carrefour.fid.android.presentation.ui.checkout.al.q
                boolean r0 = r0.booleanValue()
                boolean r2 = r2.booleanValue()
                r10.<init>(r0, r1, r2, r6)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.p036al.C23378q.C23379a.mo68501b(androidx.lifecycle.p0):com.carrefour.fid.android.presentation.ui.checkout.al.q");
        }

        public C23379a() {
        }
    }

    public C23378q() {
        this(false, (SlotExpress) null, false, (Bundle) null, 15, (DefaultConstructorMarker) null);
    }

    /* renamed from: f */
    public static /* synthetic */ C23378q m104297f(C23378q qVar, boolean z, SlotExpress slotExpress, boolean z2, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            z = qVar.f59186a;
        }
        if ((i & 2) != 0) {
            slotExpress = qVar.f59187b;
        }
        if ((i & 4) != 0) {
            z2 = qVar.f59188c;
        }
        if ((i & 8) != 0) {
            bundle = qVar.f59189d;
        }
        return qVar.mo68490e(z, slotExpress, z2, bundle);
    }

    @C12579k
    @C11384m
    public static final C23378q fromBundle(@C12579k Bundle bundle) {
        return f59184e.mo68500a(bundle);
    }

    @C12579k
    @C11384m
    /* renamed from: g */
    public static final C23378q m104298g(@C12579k C19456p0 p0Var) {
        return f59184e.mo68501b(p0Var);
    }

    /* renamed from: a */
    public final boolean mo68486a() {
        return this.f59186a;
    }

    @C12580l
    /* renamed from: b */
    public final SlotExpress mo68487b() {
        return this.f59187b;
    }

    /* renamed from: c */
    public final boolean mo68488c() {
        return this.f59188c;
    }

    @C12580l
    /* renamed from: d */
    public final Bundle mo68489d() {
        return this.f59189d;
    }

    @C12579k
    /* renamed from: e */
    public final C23378q mo68490e(boolean z, @C12580l SlotExpress slotExpress, boolean z2, @C12580l Bundle bundle) {
        return new C23378q(z, slotExpress, z2, bundle);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23378q)) {
            return false;
        }
        C23378q qVar = (C23378q) obj;
        return this.f59186a == qVar.f59186a && Intrinsics.areEqual((Object) this.f59187b, (Object) qVar.f59187b) && this.f59188c == qVar.f59188c && Intrinsics.areEqual((Object) this.f59189d, (Object) qVar.f59189d);
    }

    @C12580l
    /* renamed from: h */
    public final SlotExpress mo68492h() {
        return this.f59187b;
    }

    public int hashCode() {
        boolean z = this.f59186a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        SlotExpress slotExpress = this.f59187b;
        int i2 = 0;
        int hashCode = (i + (slotExpress == null ? 0 : slotExpress.hashCode())) * 31;
        boolean z3 = this.f59188c;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (hashCode + (z2 ? 1 : 0)) * 31;
        Bundle bundle = this.f59189d;
        if (bundle != null) {
            i2 = bundle.hashCode();
        }
        return i3 + i2;
    }

    @C12580l
    /* renamed from: i */
    public final Bundle mo68494i() {
        return this.f59189d;
    }

    /* renamed from: j */
    public final boolean mo68495j() {
        return this.f59186a;
    }

    /* renamed from: k */
    public final boolean mo68496k() {
        return this.f59188c;
    }

    @C12579k
    /* renamed from: l */
    public final Bundle mo68497l() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(C28559l.f69485a, this.f59186a);
        Class<Parcelable> cls = Parcelable.class;
        Class<SlotExpress> cls2 = SlotExpress.class;
        Class<Serializable> cls3 = Serializable.class;
        if (cls.isAssignableFrom(cls2)) {
            bundle.putParcelable("basket_slot_express", this.f59187b);
        } else if (cls3.isAssignableFrom(cls2)) {
            bundle.putSerializable("basket_slot_express", (Serializable) this.f59187b);
        }
        bundle.putBoolean(C36181l.f89333a, this.f59188c);
        Class<Bundle> cls4 = Bundle.class;
        if (cls.isAssignableFrom(cls4)) {
            bundle.putParcelable(C38212b.f96795c, this.f59189d);
        } else if (cls3.isAssignableFrom(cls4)) {
            bundle.putSerializable(C38212b.f96795c, (Serializable) this.f59189d);
        }
        return bundle;
    }

    @C12579k
    /* renamed from: m */
    public final C19456p0 mo68498m() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q(C28559l.f69485a, Boolean.valueOf(this.f59186a));
        Class<Parcelable> cls = Parcelable.class;
        Class<SlotExpress> cls2 = SlotExpress.class;
        Class<Serializable> cls3 = Serializable.class;
        if (cls.isAssignableFrom(cls2)) {
            p0Var.mo57656q("basket_slot_express", this.f59187b);
        } else if (cls3.isAssignableFrom(cls2)) {
            p0Var.mo57656q("basket_slot_express", (Serializable) this.f59187b);
        }
        p0Var.mo57656q(C36181l.f89333a, Boolean.valueOf(this.f59188c));
        Class<Bundle> cls4 = Bundle.class;
        if (cls.isAssignableFrom(cls4)) {
            p0Var.mo57656q(C38212b.f96795c, this.f59189d);
        } else if (cls3.isAssignableFrom(cls4)) {
            p0Var.mo57656q(C38212b.f96795c, (Serializable) this.f59189d);
        }
        return p0Var;
    }

    @C12579k
    public String toString() {
        boolean z = this.f59186a;
        SlotExpress slotExpress = this.f59187b;
        boolean z2 = this.f59188c;
        Bundle bundle = this.f59189d;
        return "CheckoutStep3FragmentArgs(isExpressPickup=" + z + ", basketSlotExpress=" + slotExpress + ", isPostOrderSubstitutionEnabled=" + z2 + ", categoryListByGtin=" + bundle + ")";
    }

    public C23378q(boolean z, @C12580l SlotExpress slotExpress, boolean z2, @C12580l Bundle bundle) {
        this.f59186a = z;
        this.f59187b = slotExpress;
        this.f59188c = z2;
        this.f59189d = bundle;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C23378q(boolean z, SlotExpress slotExpress, boolean z2, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : slotExpress, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? null : bundle);
    }
}
