package com.carrefour.fid.android.account.presentation.p018ui.address;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.domain.models.account.Address;
import java.io.Serializable;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.account.presentation.ui.address.k */
public final class C13469k implements C19764l {
    @C12579k

    /* renamed from: e */
    public static final C13470a f32926e = new C13470a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final int f32927f = 8;
    @C12579k

    /* renamed from: a */
    public final Address f32928a;
    @C12579k

    /* renamed from: b */
    public final String f32929b;

    /* renamed from: c */
    public final boolean f32930c;

    /* renamed from: d */
    public final boolean f32931d;

    /* renamed from: com.carrefour.fid.android.account.presentation.ui.address.k$a */
    public static final class C13470a {
        public /* synthetic */ C13470a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C13469k mo31960a(@C12579k Bundle bundle) {
            boolean z;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C13469k.class.getClassLoader());
            if (bundle.containsKey("address_model")) {
                Class<Address> cls = Address.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    Address address = (Address) bundle.get("address_model");
                    if (address == null) {
                        throw new IllegalArgumentException("Argument \"address_model\" is marked as non-null but was passed a null value.");
                    } else if (bundle.containsKey("telephone")) {
                        String string = bundle.getString("telephone");
                        if (string != null) {
                            boolean z2 = true;
                            if (bundle.containsKey("isShowingKeepAddressOption")) {
                                z = bundle.getBoolean("isShowingKeepAddressOption");
                            } else {
                                z = true;
                            }
                            if (bundle.containsKey("autoSaveAddress")) {
                                z2 = bundle.getBoolean("autoSaveAddress");
                            }
                            return new C13469k(address, string, z, z2);
                        }
                        throw new IllegalArgumentException("Argument \"telephone\" is marked as non-null but was passed a null value.");
                    } else {
                        throw new IllegalArgumentException("Required argument \"telephone\" is missing and does not have an android:defaultValue");
                    }
                } else {
                    throw new UnsupportedOperationException(cls.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                throw new IllegalArgumentException("Required argument \"address_model\" is missing and does not have an android:defaultValue");
            }
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C13469k mo31961b(@C12579k C19456p0 p0Var) {
            Boolean bool;
            Boolean bool2;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("address_model")) {
                Class<Address> cls = Address.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    Address address = (Address) p0Var.mo57648h("address_model");
                    if (address == null) {
                        throw new IllegalArgumentException("Argument \"address_model\" is marked as non-null but was passed a null value");
                    } else if (p0Var.mo57647f("telephone")) {
                        String str = (String) p0Var.mo57648h("telephone");
                        if (str != null) {
                            if (p0Var.mo57647f("isShowingKeepAddressOption")) {
                                bool = (Boolean) p0Var.mo57648h("isShowingKeepAddressOption");
                                if (bool == null) {
                                    throw new IllegalArgumentException("Argument \"isShowingKeepAddressOption\" of type boolean does not support null values");
                                }
                            } else {
                                bool = Boolean.TRUE;
                            }
                            if (p0Var.mo57647f("autoSaveAddress")) {
                                bool2 = (Boolean) p0Var.mo57648h("autoSaveAddress");
                                if (bool2 == null) {
                                    throw new IllegalArgumentException("Argument \"autoSaveAddress\" of type boolean does not support null values");
                                }
                            } else {
                                bool2 = Boolean.TRUE;
                            }
                            return new C13469k(address, str, bool.booleanValue(), bool2.booleanValue());
                        }
                        throw new IllegalArgumentException("Argument \"telephone\" is marked as non-null but was passed a null value");
                    } else {
                        throw new IllegalArgumentException("Required argument \"telephone\" is missing and does not have an android:defaultValue");
                    }
                } else {
                    String name = cls.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                throw new IllegalArgumentException("Required argument \"address_model\" is missing and does not have an android:defaultValue");
            }
        }

        public C13470a() {
        }
    }

    public C13469k(@C12579k Address address, @C12579k String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(address, "addressModel");
        Intrinsics.checkNotNullParameter(str, "telephone");
        this.f32928a = address;
        this.f32929b = str;
        this.f32930c = z;
        this.f32931d = z2;
    }

    /* renamed from: f */
    public static /* synthetic */ C13469k m57924f(C13469k kVar, Address address, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            address = kVar.f32928a;
        }
        if ((i & 2) != 0) {
            str = kVar.f32929b;
        }
        if ((i & 4) != 0) {
            z = kVar.f32930c;
        }
        if ((i & 8) != 0) {
            z2 = kVar.f32931d;
        }
        return kVar.mo31950e(address, str, z, z2);
    }

    @C12579k
    @C11384m
    public static final C13469k fromBundle(@C12579k Bundle bundle) {
        return f32926e.mo31960a(bundle);
    }

    @C12579k
    @C11384m
    /* renamed from: g */
    public static final C13469k m57925g(@C12579k C19456p0 p0Var) {
        return f32926e.mo31961b(p0Var);
    }

    @C12579k
    /* renamed from: a */
    public final Address mo31946a() {
        return this.f32928a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo31947b() {
        return this.f32929b;
    }

    /* renamed from: c */
    public final boolean mo31948c() {
        return this.f32930c;
    }

    /* renamed from: d */
    public final boolean mo31949d() {
        return this.f32931d;
    }

    @C12579k
    /* renamed from: e */
    public final C13469k mo31950e(@C12579k Address address, @C12579k String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(address, "addressModel");
        Intrinsics.checkNotNullParameter(str, "telephone");
        return new C13469k(address, str, z, z2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13469k)) {
            return false;
        }
        C13469k kVar = (C13469k) obj;
        return Intrinsics.areEqual((Object) this.f32928a, (Object) kVar.f32928a) && Intrinsics.areEqual((Object) this.f32929b, (Object) kVar.f32929b) && this.f32930c == kVar.f32930c && this.f32931d == kVar.f32931d;
    }

    @C12579k
    /* renamed from: h */
    public final Address mo31952h() {
        return this.f32928a;
    }

    public int hashCode() {
        int hashCode = ((this.f32928a.hashCode() * 31) + this.f32929b.hashCode()) * 31;
        boolean z = this.f32930c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f32931d;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean mo31954i() {
        return this.f32931d;
    }

    @C12579k
    /* renamed from: j */
    public final String mo31955j() {
        return this.f32929b;
    }

    /* renamed from: k */
    public final boolean mo31956k() {
        return this.f32930c;
    }

    @C12579k
    /* renamed from: l */
    public final Bundle mo31957l() {
        Bundle bundle = new Bundle();
        Class<Address> cls = Address.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            Address address = this.f32928a;
            Intrinsics.checkNotNull(address, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("address_model", address);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            Address address2 = this.f32928a;
            Intrinsics.checkNotNull(address2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("address_model", (Serializable) address2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        bundle.putString("telephone", this.f32929b);
        bundle.putBoolean("isShowingKeepAddressOption", this.f32930c);
        bundle.putBoolean("autoSaveAddress", this.f32931d);
        return bundle;
    }

    @C12579k
    /* renamed from: m */
    public final C19456p0 mo31958m() {
        C19456p0 p0Var = new C19456p0();
        Class<Address> cls = Address.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            Address address = this.f32928a;
            Intrinsics.checkNotNull(address, "null cannot be cast to non-null type android.os.Parcelable");
            p0Var.mo57656q("address_model", address);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            Address address2 = this.f32928a;
            Intrinsics.checkNotNull(address2, "null cannot be cast to non-null type java.io.Serializable");
            p0Var.mo57656q("address_model", (Serializable) address2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        p0Var.mo57656q("telephone", this.f32929b);
        p0Var.mo57656q("isShowingKeepAddressOption", Boolean.valueOf(this.f32930c));
        p0Var.mo57656q("autoSaveAddress", Boolean.valueOf(this.f32931d));
        return p0Var;
    }

    @C12579k
    public String toString() {
        Address address = this.f32928a;
        String str = this.f32929b;
        boolean z = this.f32930c;
        boolean z2 = this.f32931d;
        return "VerifyUserAddressFragmentArgs(addressModel=" + address + ", telephone=" + str + ", isShowingKeepAddressOption=" + z + ", autoSaveAddress=" + z2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13469k(Address address, String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(address, str, (i & 4) != 0 ? true : z, (i & 8) != 0 ? true : z2);
    }
}
