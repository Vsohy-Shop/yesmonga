package com.carrefour.fid.android.account.presentation.p018ui.account;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19690a;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.account.C13144b;
import com.carrefour.fid.android.domain.models.AddressCategory;
import com.carrefour.fid.android.domain.models.account.Address;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.account.presentation.ui.account.f */
public final class C13384f {
    @C12579k

    /* renamed from: a */
    public static final C13386b f32774a = new C13386b((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f32775b = 0;

    /* renamed from: com.carrefour.fid.android.account.presentation.ui.account.f$b */
    public static final class C13386b {
        public /* synthetic */ C13386b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19693b0 m57751b(C13386b bVar, AddressCategory addressCategory, int i, Address address, Address address2, String str, int i2, Object obj) {
            return bVar.mo31754a(addressCategory, i, (i2 & 4) != 0 ? null : address, (i2 & 8) != 0 ? null : address2, (i2 & 16) != 0 ? null : str);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo31754a(@C12579k AddressCategory addressCategory, int i, @C12580l Address address, @C12580l Address address2, @C12580l String str) {
            Intrinsics.checkNotNullParameter(addressCategory, "addressCategory");
            return new C13385a(addressCategory, i, address, address2, str);
        }

        @C12579k
        /* renamed from: c */
        public final C19693b0 mo31755c() {
            return new C19690a(C13144b.C13154j.action_accountInfoFragment_to_updateUserEmailFragment);
        }

        @C12579k
        /* renamed from: d */
        public final C19693b0 mo31756d() {
            return new C19690a(C13144b.C13154j.action_accountInfoFragment_to_updateUserInfoFragment);
        }

        @C12579k
        /* renamed from: e */
        public final C19693b0 mo31757e() {
            return new C19690a(C13144b.C13154j.action_accountInfoFragment_to_updateUserPasswordFragment);
        }

        public C13386b() {
        }
    }

    /* renamed from: com.carrefour.fid.android.account.presentation.ui.account.f$a */
    public static final class C13385a implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final AddressCategory f32776a;

        /* renamed from: b */
        public final int f32777b;
        @C12580l

        /* renamed from: c */
        public final Address f32778c;
        @C12580l

        /* renamed from: d */
        public final Address f32779d;
        @C12580l

        /* renamed from: e */
        public final String f32780e;

        /* renamed from: f */
        public final int f32781f;

        public C13385a(@C12579k AddressCategory addressCategory, int i, @C12580l Address address, @C12580l Address address2, @C12580l String str) {
            Intrinsics.checkNotNullParameter(addressCategory, "addressCategory");
            this.f32776a = addressCategory;
            this.f32777b = i;
            this.f32778c = address;
            this.f32779d = address2;
            this.f32780e = str;
            this.f32781f = C13144b.C13154j.action_accountInfoFragment_to_updateUserAddressFragment;
        }

        /* renamed from: g */
        public static /* synthetic */ C13385a m57739g(C13385a aVar, AddressCategory addressCategory, int i, Address address, Address address2, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                addressCategory = aVar.f32776a;
            }
            if ((i2 & 2) != 0) {
                i = aVar.f32777b;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                address = aVar.f32778c;
            }
            Address address3 = address;
            if ((i2 & 8) != 0) {
                address2 = aVar.f32779d;
            }
            Address address4 = address2;
            if ((i2 & 16) != 0) {
                str = aVar.f32780e;
            }
            return aVar.mo31744f(addressCategory, i3, address3, address4, str);
        }

        @C12579k
        /* renamed from: a */
        public final AddressCategory mo31738a() {
            return this.f32776a;
        }

        /* renamed from: b */
        public final int mo31739b() {
            return this.f32777b;
        }

        @C12580l
        /* renamed from: c */
        public final Address mo31740c() {
            return this.f32778c;
        }

        @C12580l
        /* renamed from: d */
        public final Address mo31741d() {
            return this.f32779d;
        }

        @C12580l
        /* renamed from: e */
        public final String mo31742e() {
            return this.f32780e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13385a)) {
                return false;
            }
            C13385a aVar = (C13385a) obj;
            return this.f32776a == aVar.f32776a && this.f32777b == aVar.f32777b && Intrinsics.areEqual((Object) this.f32778c, (Object) aVar.f32778c) && Intrinsics.areEqual((Object) this.f32779d, (Object) aVar.f32779d) && Intrinsics.areEqual((Object) this.f32780e, (Object) aVar.f32780e);
        }

        @C12579k
        /* renamed from: f */
        public final C13385a mo31744f(@C12579k AddressCategory addressCategory, int i, @C12580l Address address, @C12580l Address address2, @C12580l String str) {
            Intrinsics.checkNotNullParameter(addressCategory, "addressCategory");
            return new C13385a(addressCategory, i, address, address2, str);
        }

        public int getActionId() {
            return this.f32781f;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<Parcelable> cls = Parcelable.class;
            Class<AddressCategory> cls2 = AddressCategory.class;
            Class<Serializable> cls3 = Serializable.class;
            if (cls.isAssignableFrom(cls2)) {
                AddressCategory addressCategory = this.f32776a;
                Intrinsics.checkNotNull(addressCategory, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("address_category", (Parcelable) addressCategory);
            } else if (cls3.isAssignableFrom(cls2)) {
                AddressCategory addressCategory2 = this.f32776a;
                Intrinsics.checkNotNull(addressCategory2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("address_category", addressCategory2);
            } else {
                String name = cls2.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            Class<Address> cls4 = Address.class;
            if (cls.isAssignableFrom(cls4)) {
                bundle.putParcelable("filled_delivery_address", this.f32778c);
            } else if (cls3.isAssignableFrom(cls4)) {
                bundle.putSerializable("filled_delivery_address", (Serializable) this.f32778c);
            }
            if (cls.isAssignableFrom(cls4)) {
                bundle.putParcelable("filled_billing_address", this.f32779d);
            } else if (cls3.isAssignableFrom(cls4)) {
                bundle.putSerializable("filled_billing_address", (Serializable) this.f32779d);
            }
            bundle.putString("fill_phone", this.f32780e);
            bundle.putInt("back_stack_destination_id", this.f32777b);
            return bundle;
        }

        @C12579k
        /* renamed from: h */
        public final AddressCategory mo31747h() {
            return this.f32776a;
        }

        public int hashCode() {
            int hashCode = ((this.f32776a.hashCode() * 31) + Integer.hashCode(this.f32777b)) * 31;
            Address address = this.f32778c;
            int i = 0;
            int hashCode2 = (hashCode + (address == null ? 0 : address.hashCode())) * 31;
            Address address2 = this.f32779d;
            int hashCode3 = (hashCode2 + (address2 == null ? 0 : address2.hashCode())) * 31;
            String str = this.f32780e;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode3 + i;
        }

        /* renamed from: i */
        public final int mo31749i() {
            return this.f32777b;
        }

        @C12580l
        /* renamed from: j */
        public final String mo31750j() {
            return this.f32780e;
        }

        @C12580l
        /* renamed from: k */
        public final Address mo31751k() {
            return this.f32779d;
        }

        @C12580l
        /* renamed from: l */
        public final Address mo31752l() {
            return this.f32778c;
        }

        @C12579k
        public String toString() {
            AddressCategory addressCategory = this.f32776a;
            int i = this.f32777b;
            Address address = this.f32778c;
            Address address2 = this.f32779d;
            String str = this.f32780e;
            return "ActionAccountInfoFragmentToUpdateUserAddressFragment(addressCategory=" + addressCategory + ", backStackDestinationId=" + i + ", filledDeliveryAddress=" + address + ", filledBillingAddress=" + address2 + ", fillPhone=" + str + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C13385a(AddressCategory addressCategory, int i, Address address, Address address2, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(addressCategory, i, (i2 & 4) != 0 ? null : address, (i2 & 8) != 0 ? null : address2, (i2 & 16) != 0 ? null : str);
        }
    }
}
