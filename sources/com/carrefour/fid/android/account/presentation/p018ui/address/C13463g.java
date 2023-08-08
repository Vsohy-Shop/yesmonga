package com.carrefour.fid.android.account.presentation.p018ui.address;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.account.C13144b;
import com.carrefour.fid.android.domain.models.account.Address;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.account.presentation.ui.address.g */
public final class C13463g {
    @C12579k

    /* renamed from: a */
    public static final C13465b f32917a = new C13465b((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f32918b = 0;

    /* renamed from: com.carrefour.fid.android.account.presentation.ui.address.g$b */
    public static final class C13465b {
        public /* synthetic */ C13465b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19693b0 m57918b(C13465b bVar, Address address, String str, boolean z, boolean z2, int i, Object obj) {
            if ((i & 4) != 0) {
                z = true;
            }
            if ((i & 8) != 0) {
                z2 = true;
            }
            return bVar.mo31942a(address, str, z, z2);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo31942a(@C12579k Address address, @C12579k String str, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(address, "addressModel");
            Intrinsics.checkNotNullParameter(str, "telephone");
            return new C13464a(address, str, z, z2);
        }

        public C13465b() {
        }
    }

    /* renamed from: com.carrefour.fid.android.account.presentation.ui.address.g$a */
    public static final class C13464a implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final Address f32919a;
        @C12579k

        /* renamed from: b */
        public final String f32920b;

        /* renamed from: c */
        public final boolean f32921c;

        /* renamed from: d */
        public final boolean f32922d;

        /* renamed from: e */
        public final int f32923e;

        public C13464a(@C12579k Address address, @C12579k String str, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(address, "addressModel");
            Intrinsics.checkNotNullParameter(str, "telephone");
            this.f32919a = address;
            this.f32920b = str;
            this.f32921c = z;
            this.f32922d = z2;
            this.f32923e = C13144b.C13154j.action_updateUserAddressFragment_to_verifyUserAddressFragment;
        }

        /* renamed from: f */
        public static /* synthetic */ C13464a m57908f(C13464a aVar, Address address, String str, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                address = aVar.f32919a;
            }
            if ((i & 2) != 0) {
                str = aVar.f32920b;
            }
            if ((i & 4) != 0) {
                z = aVar.f32921c;
            }
            if ((i & 8) != 0) {
                z2 = aVar.f32922d;
            }
            return aVar.mo31934e(address, str, z, z2);
        }

        @C12579k
        /* renamed from: a */
        public final Address mo31930a() {
            return this.f32919a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo31931b() {
            return this.f32920b;
        }

        /* renamed from: c */
        public final boolean mo31932c() {
            return this.f32921c;
        }

        /* renamed from: d */
        public final boolean mo31933d() {
            return this.f32922d;
        }

        @C12579k
        /* renamed from: e */
        public final C13464a mo31934e(@C12579k Address address, @C12579k String str, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(address, "addressModel");
            Intrinsics.checkNotNullParameter(str, "telephone");
            return new C13464a(address, str, z, z2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13464a)) {
                return false;
            }
            C13464a aVar = (C13464a) obj;
            return Intrinsics.areEqual((Object) this.f32919a, (Object) aVar.f32919a) && Intrinsics.areEqual((Object) this.f32920b, (Object) aVar.f32920b) && this.f32921c == aVar.f32921c && this.f32922d == aVar.f32922d;
        }

        @C12579k
        /* renamed from: g */
        public final Address mo31936g() {
            return this.f32919a;
        }

        public int getActionId() {
            return this.f32923e;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<Address> cls = Address.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                Address address = this.f32919a;
                Intrinsics.checkNotNull(address, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("address_model", address);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                Address address2 = this.f32919a;
                Intrinsics.checkNotNull(address2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("address_model", (Serializable) address2);
            } else {
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putString("telephone", this.f32920b);
            bundle.putBoolean("isShowingKeepAddressOption", this.f32921c);
            bundle.putBoolean("autoSaveAddress", this.f32922d);
            return bundle;
        }

        /* renamed from: h */
        public final boolean mo31937h() {
            return this.f32922d;
        }

        public int hashCode() {
            int hashCode = ((this.f32919a.hashCode() * 31) + this.f32920b.hashCode()) * 31;
            boolean z = this.f32921c;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f32922d;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        @C12579k
        /* renamed from: i */
        public final String mo31939i() {
            return this.f32920b;
        }

        /* renamed from: j */
        public final boolean mo31940j() {
            return this.f32921c;
        }

        @C12579k
        public String toString() {
            Address address = this.f32919a;
            String str = this.f32920b;
            boolean z = this.f32921c;
            boolean z2 = this.f32922d;
            return "ActionUpdateUserAddressFragmentToVerifyUserAddressFragment(addressModel=" + address + ", telephone=" + str + ", isShowingKeepAddressOption=" + z + ", autoSaveAddress=" + z2 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C13464a(Address address, String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(address, str, (i & 4) != 0 ? true : z, (i & 8) != 0 ? true : z2);
        }
    }
}
