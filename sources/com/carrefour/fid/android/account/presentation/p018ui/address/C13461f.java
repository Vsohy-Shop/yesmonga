package com.carrefour.fid.android.account.presentation.p018ui.address;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.domain.models.AddressCategory;
import com.carrefour.fid.android.domain.models.account.Address;
import java.io.Serializable;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.account.presentation.ui.address.f */
public final class C13461f implements C19764l {
    @C12579k

    /* renamed from: g */
    public static final C13462a f32909g = new C13462a((DefaultConstructorMarker) null);

    /* renamed from: h */
    public static final int f32910h = 8;
    @C12579k

    /* renamed from: a */
    public final AddressCategory f32911a;
    @C12580l

    /* renamed from: b */
    public final Address f32912b;
    @C12580l

    /* renamed from: c */
    public final Address f32913c;
    @C12580l

    /* renamed from: d */
    public final String f32914d;

    /* renamed from: e */
    public final boolean f32915e;

    /* renamed from: f */
    public final boolean f32916f;

    /* renamed from: com.carrefour.fid.android.account.presentation.ui.address.f$a */
    public static final class C13462a {
        public /* synthetic */ C13462a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C13461f mo31928a(@C12579k Bundle bundle) {
            Address address;
            Address address2;
            String str;
            boolean z;
            boolean z2;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C13461f.class.getClassLoader());
            if (bundle.containsKey("address_category")) {
                Class<Parcelable> cls = Parcelable.class;
                Class<AddressCategory> cls2 = AddressCategory.class;
                Class<Serializable> cls3 = Serializable.class;
                if (cls.isAssignableFrom(cls2) || cls3.isAssignableFrom(cls2)) {
                    AddressCategory addressCategory = (AddressCategory) bundle.get("address_category");
                    if (addressCategory != null) {
                        Class<Address> cls4 = Address.class;
                        if (!bundle.containsKey("filled_delivery_address")) {
                            address = null;
                        } else if (cls.isAssignableFrom(cls4) || cls3.isAssignableFrom(cls4)) {
                            address = (Address) bundle.get("filled_delivery_address");
                        } else {
                            throw new UnsupportedOperationException(cls4.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                        }
                        if (!bundle.containsKey("filled_billing_address")) {
                            address2 = null;
                        } else if (cls.isAssignableFrom(cls4) || cls3.isAssignableFrom(cls4)) {
                            address2 = (Address) bundle.get("filled_billing_address");
                        } else {
                            throw new UnsupportedOperationException(cls4.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                        }
                        if (bundle.containsKey("fill_phone")) {
                            str = bundle.getString("fill_phone");
                        } else {
                            str = null;
                        }
                        if (bundle.containsKey("pop_back_stack_on_dismiss")) {
                            z = bundle.getBoolean("pop_back_stack_on_dismiss");
                        } else {
                            z = false;
                        }
                        boolean z3 = z;
                        if (bundle.containsKey("autoSaveAddress")) {
                            z2 = bundle.getBoolean("autoSaveAddress");
                        } else {
                            z2 = true;
                        }
                        return new C13461f(addressCategory, address, address2, str, z3, z2);
                    }
                    throw new IllegalArgumentException("Argument \"address_category\" is marked as non-null but was passed a null value.");
                }
                throw new UnsupportedOperationException(cls2.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"address_category\" is missing and does not have an android:defaultValue");
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C13461f mo31929b(@C12579k C19456p0 p0Var) {
            Address address;
            Address address2;
            String str;
            Boolean bool;
            Boolean bool2;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("address_category")) {
                Class<Parcelable> cls = Parcelable.class;
                Class<AddressCategory> cls2 = AddressCategory.class;
                Class<Serializable> cls3 = Serializable.class;
                if (cls.isAssignableFrom(cls2) || cls3.isAssignableFrom(cls2)) {
                    AddressCategory addressCategory = (AddressCategory) p0Var.mo57648h("address_category");
                    if (addressCategory != null) {
                        Class<Address> cls4 = Address.class;
                        if (!p0Var.mo57647f("filled_delivery_address")) {
                            address = null;
                        } else if (cls.isAssignableFrom(cls4) || cls3.isAssignableFrom(cls4)) {
                            address = (Address) p0Var.mo57648h("filled_delivery_address");
                        } else {
                            throw new UnsupportedOperationException(cls4.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                        }
                        if (!p0Var.mo57647f("filled_billing_address")) {
                            address2 = null;
                        } else if (cls.isAssignableFrom(cls4) || cls3.isAssignableFrom(cls4)) {
                            address2 = (Address) p0Var.mo57648h("filled_billing_address");
                        } else {
                            throw new UnsupportedOperationException(cls4.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                        }
                        if (p0Var.mo57647f("fill_phone")) {
                            str = (String) p0Var.mo57648h("fill_phone");
                        } else {
                            str = null;
                        }
                        if (p0Var.mo57647f("pop_back_stack_on_dismiss")) {
                            bool = (Boolean) p0Var.mo57648h("pop_back_stack_on_dismiss");
                            if (bool == null) {
                                throw new IllegalArgumentException("Argument \"pop_back_stack_on_dismiss\" of type boolean does not support null values");
                            }
                        } else {
                            bool = Boolean.FALSE;
                        }
                        if (p0Var.mo57647f("autoSaveAddress")) {
                            bool2 = (Boolean) p0Var.mo57648h("autoSaveAddress");
                            if (bool2 == null) {
                                throw new IllegalArgumentException("Argument \"autoSaveAddress\" of type boolean does not support null values");
                            }
                        } else {
                            bool2 = Boolean.TRUE;
                        }
                        return new C13461f(addressCategory, address, address2, str, bool.booleanValue(), bool2.booleanValue());
                    }
                    throw new IllegalArgumentException("Argument \"address_category\" is marked as non-null but was passed a null value");
                }
                throw new UnsupportedOperationException(cls2.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"address_category\" is missing and does not have an android:defaultValue");
        }

        public C13462a() {
        }
    }

    public C13461f(@C12579k AddressCategory addressCategory, @C12580l Address address, @C12580l Address address2, @C12580l String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(addressCategory, "addressCategory");
        this.f32911a = addressCategory;
        this.f32912b = address;
        this.f32913c = address2;
        this.f32914d = str;
        this.f32915e = z;
        this.f32916f = z2;
    }

    @C12579k
    @C11384m
    public static final C13461f fromBundle(@C12579k Bundle bundle) {
        return f32909g.mo31928a(bundle);
    }

    /* renamed from: h */
    public static /* synthetic */ C13461f m57889h(C13461f fVar, AddressCategory addressCategory, Address address, Address address2, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            addressCategory = fVar.f32911a;
        }
        if ((i & 2) != 0) {
            address = fVar.f32912b;
        }
        Address address3 = address;
        if ((i & 4) != 0) {
            address2 = fVar.f32913c;
        }
        Address address4 = address2;
        if ((i & 8) != 0) {
            str = fVar.f32914d;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            z = fVar.f32915e;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = fVar.f32916f;
        }
        return fVar.mo31917g(addressCategory, address3, address4, str2, z3, z2);
    }

    @C12579k
    @C11384m
    /* renamed from: i */
    public static final C13461f m57890i(@C12579k C19456p0 p0Var) {
        return f32909g.mo31929b(p0Var);
    }

    @C12579k
    /* renamed from: a */
    public final AddressCategory mo31910a() {
        return this.f32911a;
    }

    @C12580l
    /* renamed from: b */
    public final Address mo31911b() {
        return this.f32912b;
    }

    @C12580l
    /* renamed from: c */
    public final Address mo31912c() {
        return this.f32913c;
    }

    @C12580l
    /* renamed from: d */
    public final String mo31913d() {
        return this.f32914d;
    }

    /* renamed from: e */
    public final boolean mo31914e() {
        return this.f32915e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13461f)) {
            return false;
        }
        C13461f fVar = (C13461f) obj;
        return this.f32911a == fVar.f32911a && Intrinsics.areEqual((Object) this.f32912b, (Object) fVar.f32912b) && Intrinsics.areEqual((Object) this.f32913c, (Object) fVar.f32913c) && Intrinsics.areEqual((Object) this.f32914d, (Object) fVar.f32914d) && this.f32915e == fVar.f32915e && this.f32916f == fVar.f32916f;
    }

    /* renamed from: f */
    public final boolean mo31916f() {
        return this.f32916f;
    }

    @C12579k
    /* renamed from: g */
    public final C13461f mo31917g(@C12579k AddressCategory addressCategory, @C12580l Address address, @C12580l Address address2, @C12580l String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(addressCategory, "addressCategory");
        return new C13461f(addressCategory, address, address2, str, z, z2);
    }

    public int hashCode() {
        int hashCode = this.f32911a.hashCode() * 31;
        Address address = this.f32912b;
        int i = 0;
        int hashCode2 = (hashCode + (address == null ? 0 : address.hashCode())) * 31;
        Address address2 = this.f32913c;
        int hashCode3 = (hashCode2 + (address2 == null ? 0 : address2.hashCode())) * 31;
        String str = this.f32914d;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z = this.f32915e;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f32916f;
        if (!z3) {
            z2 = z3;
        }
        return i3 + (z2 ? 1 : 0);
    }

    @C12579k
    /* renamed from: j */
    public final AddressCategory mo31919j() {
        return this.f32911a;
    }

    /* renamed from: k */
    public final boolean mo31920k() {
        return this.f32916f;
    }

    @C12580l
    /* renamed from: l */
    public final String mo31921l() {
        return this.f32914d;
    }

    @C12580l
    /* renamed from: m */
    public final Address mo31922m() {
        return this.f32913c;
    }

    @C12580l
    /* renamed from: n */
    public final Address mo31923n() {
        return this.f32912b;
    }

    /* renamed from: o */
    public final boolean mo31924o() {
        return this.f32915e;
    }

    @C12579k
    /* renamed from: p */
    public final Bundle mo31925p() {
        Bundle bundle = new Bundle();
        Class<Parcelable> cls = Parcelable.class;
        Class<AddressCategory> cls2 = AddressCategory.class;
        Class<Serializable> cls3 = Serializable.class;
        if (cls.isAssignableFrom(cls2)) {
            AddressCategory addressCategory = this.f32911a;
            Intrinsics.checkNotNull(addressCategory, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("address_category", (Parcelable) addressCategory);
        } else if (cls3.isAssignableFrom(cls2)) {
            AddressCategory addressCategory2 = this.f32911a;
            Intrinsics.checkNotNull(addressCategory2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("address_category", addressCategory2);
        } else {
            String name = cls2.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        Class<Address> cls4 = Address.class;
        if (cls.isAssignableFrom(cls4)) {
            bundle.putParcelable("filled_delivery_address", this.f32912b);
        } else if (cls3.isAssignableFrom(cls4)) {
            bundle.putSerializable("filled_delivery_address", (Serializable) this.f32912b);
        }
        if (cls.isAssignableFrom(cls4)) {
            bundle.putParcelable("filled_billing_address", this.f32913c);
        } else if (cls3.isAssignableFrom(cls4)) {
            bundle.putSerializable("filled_billing_address", (Serializable) this.f32913c);
        }
        bundle.putString("fill_phone", this.f32914d);
        bundle.putBoolean("pop_back_stack_on_dismiss", this.f32915e);
        bundle.putBoolean("autoSaveAddress", this.f32916f);
        return bundle;
    }

    @C12579k
    /* renamed from: q */
    public final C19456p0 mo31926q() {
        C19456p0 p0Var = new C19456p0();
        Class<Parcelable> cls = Parcelable.class;
        Class<AddressCategory> cls2 = AddressCategory.class;
        Class<Serializable> cls3 = Serializable.class;
        if (cls.isAssignableFrom(cls2)) {
            AddressCategory addressCategory = this.f32911a;
            Intrinsics.checkNotNull(addressCategory, "null cannot be cast to non-null type android.os.Parcelable");
            p0Var.mo57656q("address_category", (Parcelable) addressCategory);
        } else if (cls3.isAssignableFrom(cls2)) {
            AddressCategory addressCategory2 = this.f32911a;
            Intrinsics.checkNotNull(addressCategory2, "null cannot be cast to non-null type java.io.Serializable");
            p0Var.mo57656q("address_category", addressCategory2);
        } else {
            String name = cls2.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        Class<Address> cls4 = Address.class;
        if (cls.isAssignableFrom(cls4)) {
            p0Var.mo57656q("filled_delivery_address", this.f32912b);
        } else if (cls3.isAssignableFrom(cls4)) {
            p0Var.mo57656q("filled_delivery_address", (Serializable) this.f32912b);
        }
        if (cls.isAssignableFrom(cls4)) {
            p0Var.mo57656q("filled_billing_address", this.f32913c);
        } else if (cls3.isAssignableFrom(cls4)) {
            p0Var.mo57656q("filled_billing_address", (Serializable) this.f32913c);
        }
        p0Var.mo57656q("fill_phone", this.f32914d);
        p0Var.mo57656q("pop_back_stack_on_dismiss", Boolean.valueOf(this.f32915e));
        p0Var.mo57656q("autoSaveAddress", Boolean.valueOf(this.f32916f));
        return p0Var;
    }

    @C12579k
    public String toString() {
        AddressCategory addressCategory = this.f32911a;
        Address address = this.f32912b;
        Address address2 = this.f32913c;
        String str = this.f32914d;
        boolean z = this.f32915e;
        boolean z2 = this.f32916f;
        return "UpdateUserAddressFragmentArgs(addressCategory=" + addressCategory + ", filledDeliveryAddress=" + address + ", filledBillingAddress=" + address2 + ", fillPhone=" + str + ", popBackStackOnDismiss=" + z + ", autoSaveAddress=" + z2 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C13461f(com.carrefour.fid.android.domain.models.AddressCategory r6, com.carrefour.fid.android.domain.models.account.Address r7, com.carrefour.fid.android.domain.models.account.Address r8, java.lang.String r9, boolean r10, boolean r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r5 = this;
            r0 = r12 & 2
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r0 = r1
            goto L_0x0008
        L_0x0007:
            r0 = r7
        L_0x0008:
            r2 = r12 & 4
            if (r2 == 0) goto L_0x000e
            r2 = r1
            goto L_0x000f
        L_0x000e:
            r2 = r8
        L_0x000f:
            r3 = r12 & 8
            if (r3 == 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = r9
        L_0x0015:
            r3 = r12 & 16
            if (r3 == 0) goto L_0x001b
            r3 = 0
            goto L_0x001c
        L_0x001b:
            r3 = r10
        L_0x001c:
            r4 = r12 & 32
            if (r4 == 0) goto L_0x0022
            r4 = 1
            goto L_0x0023
        L_0x0022:
            r4 = r11
        L_0x0023:
            r7 = r5
            r8 = r6
            r9 = r0
            r10 = r2
            r11 = r1
            r12 = r3
            r13 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.p018ui.address.C13461f.<init>(com.carrefour.fid.android.domain.models.AddressCategory, com.carrefour.fid.android.domain.models.account.Address, com.carrefour.fid.android.domain.models.account.Address, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
