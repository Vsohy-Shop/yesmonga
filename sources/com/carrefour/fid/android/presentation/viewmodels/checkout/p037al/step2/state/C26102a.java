package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step2.state;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.service.models.StoreAddress;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step2.state.a */
public interface C26102a {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step2.state.a$a */
    public static final class C26103a implements C26102a {

        /* renamed from: c */
        public static final int f63785c = 8;
        @C12580l

        /* renamed from: a */
        public final Address f63786a;
        @C12580l

        /* renamed from: b */
        public final String f63787b;

        public C26103a(@C12580l Address address, @C12580l String str) {
            this.f63786a = address;
            this.f63787b = str;
        }

        /* renamed from: d */
        public static /* synthetic */ C26103a m111587d(C26103a aVar, Address address, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                address = aVar.f63786a;
            }
            if ((i & 2) != 0) {
                str = aVar.f63787b;
            }
            return aVar.mo75793c(address, str);
        }

        @C12580l
        /* renamed from: a */
        public final Address mo75791a() {
            return this.f63786a;
        }

        @C12580l
        /* renamed from: b */
        public final String mo75792b() {
            return this.f63787b;
        }

        @C12579k
        /* renamed from: c */
        public final C26103a mo75793c(@C12580l Address address, @C12580l String str) {
            return new C26103a(address, str);
        }

        @C12580l
        /* renamed from: e */
        public final Address mo75794e() {
            return this.f63786a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26103a)) {
                return false;
            }
            C26103a aVar = (C26103a) obj;
            return Intrinsics.areEqual((Object) this.f63786a, (Object) aVar.f63786a) && Intrinsics.areEqual((Object) this.f63787b, (Object) aVar.f63787b);
        }

        @C12580l
        /* renamed from: f */
        public final String mo75796f() {
            return this.f63787b;
        }

        public int hashCode() {
            Address address = this.f63786a;
            int i = 0;
            int hashCode = (address == null ? 0 : address.hashCode()) * 31;
            String str = this.f63787b;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        @C12579k
        public String toString() {
            Address address = this.f63786a;
            String str = this.f63787b;
            return "DeliveryService(address=" + address + ", phone=" + str + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step2.state.a$b */
    public static final class C26104b implements C26102a {

        /* renamed from: b */
        public static final int f63788b = 8;
        @C12580l

        /* renamed from: a */
        public final StoreAddress f63789a;

        public C26104b(@C12580l StoreAddress storeAddress) {
            this.f63789a = storeAddress;
        }

        /* renamed from: c */
        public static /* synthetic */ C26104b m111593c(C26104b bVar, StoreAddress storeAddress, int i, Object obj) {
            if ((i & 1) != 0) {
                storeAddress = bVar.f63789a;
            }
            return bVar.mo75800b(storeAddress);
        }

        @C12580l
        /* renamed from: a */
        public final StoreAddress mo75799a() {
            return this.f63789a;
        }

        @C12579k
        /* renamed from: b */
        public final C26104b mo75800b(@C12580l StoreAddress storeAddress) {
            return new C26104b(storeAddress);
        }

        @C12580l
        /* renamed from: d */
        public final StoreAddress mo75801d() {
            return this.f63789a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C26104b) && Intrinsics.areEqual((Object) this.f63789a, (Object) ((C26104b) obj).f63789a);
        }

        public int hashCode() {
            StoreAddress storeAddress = this.f63789a;
            if (storeAddress == null) {
                return 0;
            }
            return storeAddress.hashCode();
        }

        @C12579k
        public String toString() {
            StoreAddress storeAddress = this.f63789a;
            return "DriveService(storeAddress=" + storeAddress + ")";
        }
    }
}
