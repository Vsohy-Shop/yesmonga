package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2;

import androidx.autofill.C0861a;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.AddressCategory;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.delivery.C38017b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.b */
public interface C23617b {

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.b$a */
    public interface C23618a extends C23617b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.b$a$a */
        public static final class C23619a implements C23618a {

            /* renamed from: b */
            public static final int f59570b = 0;
            @C12579k

            /* renamed from: a */
            public final String f59571a;

            public C23619a(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "amount");
                this.f59571a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C23619a m104932c(C23619a aVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.f59571a;
                }
                return aVar.mo69153b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo69152a() {
                return this.f59571a;
            }

            @C12579k
            /* renamed from: b */
            public final C23619a mo69153b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "amount");
                return new C23619a(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo69154d() {
                return this.f59571a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C23619a) && Intrinsics.areEqual((Object) this.f59571a, (Object) ((C23619a) obj).f59571a);
            }

            public int hashCode() {
                return this.f59571a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f59571a;
                return "OnCardFidValidated(amount=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.b$a$b */
        public static final class C23620b implements C23618a {
            @C12579k

            /* renamed from: a */
            public static final C23620b f59572a = new C23620b();

            /* renamed from: b */
            public static final int f59573b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.b$a$c */
        public static final class C23621c implements C23618a {
            @C12579k

            /* renamed from: a */
            public static final C23621c f59574a = new C23621c();

            /* renamed from: b */
            public static final int f59575b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.b$a$d */
        public static final class C23622d implements C23618a {

            /* renamed from: b */
            public static final int f59576b = 0;

            /* renamed from: a */
            public final boolean f59577a;

            public C23622d(boolean z) {
                this.f59577a = z;
            }

            /* renamed from: c */
            public static /* synthetic */ C23622d m104936c(C23622d dVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = dVar.f59577a;
                }
                return dVar.mo69159b(z);
            }

            /* renamed from: a */
            public final boolean mo69158a() {
                return this.f59577a;
            }

            @C12579k
            /* renamed from: b */
            public final C23622d mo69159b(boolean z) {
                return new C23622d(z);
            }

            /* renamed from: d */
            public final boolean mo69160d() {
                return this.f59577a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C23622d) && this.f59577a == ((C23622d) obj).f59577a;
            }

            public int hashCode() {
                boolean z = this.f59577a;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C12579k
            public String toString() {
                boolean z = this.f59577a;
                return "OnUseAllCardFid(useAll=" + z + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.b$b */
    public interface C23623b extends C23617b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.b$b$a */
        public static final class C23624a implements C23623b {

            /* renamed from: b */
            public static final int f59578b = 8;
            @C12579k

            /* renamed from: a */
            public final C38017b f59579a;

            public C23624a(@C12579k C38017b bVar) {
                Intrinsics.checkNotNullParameter(bVar, "deliveryOption");
                this.f59579a = bVar;
            }

            /* renamed from: c */
            public static /* synthetic */ C23624a m104940c(C23624a aVar, C38017b bVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    bVar = aVar.f59579a;
                }
                return aVar.mo69165b(bVar);
            }

            @C12579k
            /* renamed from: a */
            public final C38017b mo69164a() {
                return this.f59579a;
            }

            @C12579k
            /* renamed from: b */
            public final C23624a mo69165b(@C12579k C38017b bVar) {
                Intrinsics.checkNotNullParameter(bVar, "deliveryOption");
                return new C23624a(bVar);
            }

            @C12579k
            /* renamed from: d */
            public final C38017b mo69166d() {
                return this.f59579a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C23624a) && Intrinsics.areEqual((Object) this.f59579a, (Object) ((C23624a) obj).f59579a);
            }

            public int hashCode() {
                return this.f59579a.hashCode();
            }

            @C12579k
            public String toString() {
                C38017b bVar = this.f59579a;
                return "OnDeliveryChoiceChanged(deliveryOption=" + bVar + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.b$b$b */
        public static final class C23625b implements C23623b {

            /* renamed from: f */
            public static final int f59580f = 8;
            @C12579k

            /* renamed from: a */
            public final Address f59581a;
            @C12579k

            /* renamed from: b */
            public final Address f59582b;
            @C12579k

            /* renamed from: c */
            public final AddressCategory f59583c;
            @C12579k

            /* renamed from: d */
            public final String f59584d;

            /* renamed from: e */
            public final boolean f59585e;

            public C23625b(@C12579k Address address, @C12579k Address address2, @C12579k AddressCategory addressCategory, @C12579k String str, boolean z) {
                Intrinsics.checkNotNullParameter(address, "billingAddress");
                Intrinsics.checkNotNullParameter(address2, "deliveryAddress");
                Intrinsics.checkNotNullParameter(addressCategory, "category");
                Intrinsics.checkNotNullParameter(str, C0861a.f2705e);
                this.f59581a = address;
                this.f59582b = address2;
                this.f59583c = addressCategory;
                this.f59584d = str;
                this.f59585e = z;
            }

            /* renamed from: g */
            public static /* synthetic */ C23625b m104944g(C23625b bVar, Address address, Address address2, AddressCategory addressCategory, String str, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    address = bVar.f59581a;
                }
                if ((i & 2) != 0) {
                    address2 = bVar.f59582b;
                }
                Address address3 = address2;
                if ((i & 4) != 0) {
                    addressCategory = bVar.f59583c;
                }
                AddressCategory addressCategory2 = addressCategory;
                if ((i & 8) != 0) {
                    str = bVar.f59584d;
                }
                String str2 = str;
                if ((i & 16) != 0) {
                    z = bVar.f59585e;
                }
                return bVar.mo69176f(address, address3, addressCategory2, str2, z);
            }

            @C12579k
            /* renamed from: a */
            public final Address mo69170a() {
                return this.f59581a;
            }

            @C12579k
            /* renamed from: b */
            public final Address mo69171b() {
                return this.f59582b;
            }

            @C12579k
            /* renamed from: c */
            public final AddressCategory mo69172c() {
                return this.f59583c;
            }

            @C12579k
            /* renamed from: d */
            public final String mo69173d() {
                return this.f59584d;
            }

            /* renamed from: e */
            public final boolean mo69174e() {
                return this.f59585e;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C23625b)) {
                    return false;
                }
                C23625b bVar = (C23625b) obj;
                return Intrinsics.areEqual((Object) this.f59581a, (Object) bVar.f59581a) && Intrinsics.areEqual((Object) this.f59582b, (Object) bVar.f59582b) && this.f59583c == bVar.f59583c && Intrinsics.areEqual((Object) this.f59584d, (Object) bVar.f59584d) && this.f59585e == bVar.f59585e;
            }

            @C12579k
            /* renamed from: f */
            public final C23625b mo69176f(@C12579k Address address, @C12579k Address address2, @C12579k AddressCategory addressCategory, @C12579k String str, boolean z) {
                Intrinsics.checkNotNullParameter(address, "billingAddress");
                Intrinsics.checkNotNullParameter(address2, "deliveryAddress");
                Intrinsics.checkNotNullParameter(addressCategory, "category");
                Intrinsics.checkNotNullParameter(str, C0861a.f2705e);
                return new C23625b(address, address2, addressCategory, str, z);
            }

            @C12579k
            /* renamed from: h */
            public final Address mo69177h() {
                return this.f59581a;
            }

            public int hashCode() {
                int hashCode = ((((((this.f59581a.hashCode() * 31) + this.f59582b.hashCode()) * 31) + this.f59583c.hashCode()) * 31) + this.f59584d.hashCode()) * 31;
                boolean z = this.f59585e;
                if (z) {
                    z = true;
                }
                return hashCode + (z ? 1 : 0);
            }

            @C12579k
            /* renamed from: i */
            public final AddressCategory mo69179i() {
                return this.f59583c;
            }

            @C12579k
            /* renamed from: j */
            public final Address mo69180j() {
                return this.f59582b;
            }

            @C12579k
            /* renamed from: k */
            public final String mo69181k() {
                return this.f59584d;
            }

            /* renamed from: l */
            public final boolean mo69182l() {
                return this.f59585e;
            }

            @C12579k
            public String toString() {
                Address address = this.f59581a;
                Address address2 = this.f59582b;
                AddressCategory addressCategory = this.f59583c;
                String str = this.f59584d;
                boolean z = this.f59585e;
                return "OnEditAddressPressed(billingAddress=" + address + ", deliveryAddress=" + address2 + ", category=" + addressCategory + ", phone=" + str + ", isEditingAddress=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.b$b$c */
        public static final class C23626c implements C23623b {

            /* renamed from: b */
            public static final int f59586b = 0;
            @C12579k

            /* renamed from: a */
            public final String f59587a;

            public C23626c(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, C0861a.f2705e);
                this.f59587a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C23626c m104956c(C23626c cVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = cVar.f59587a;
                }
                return cVar.mo69185b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo69184a() {
                return this.f59587a;
            }

            @C12579k
            /* renamed from: b */
            public final C23626c mo69185b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, C0861a.f2705e);
                return new C23626c(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo69186d() {
                return this.f59587a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C23626c) && Intrinsics.areEqual((Object) this.f59587a, (Object) ((C23626c) obj).f59587a);
            }

            public int hashCode() {
                return this.f59587a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f59587a;
                return "OnPhoneChanged(phone=" + str + ")";
            }
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.b$c */
    public static final class C23627c implements C23617b {

        /* renamed from: b */
        public static final int f59588b = 0;

        /* renamed from: a */
        public final double f59589a;

        public C23627c(double d) {
            this.f59589a = d;
        }

        /* renamed from: c */
        public static /* synthetic */ C23627c m104960c(C23627c cVar, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                d = cVar.f59589a;
            }
            return cVar.mo69191b(d);
        }

        /* renamed from: a */
        public final double mo69190a() {
            return this.f59589a;
        }

        @C12579k
        /* renamed from: b */
        public final C23627c mo69191b(double d) {
            return new C23627c(d);
        }

        /* renamed from: d */
        public final double mo69192d() {
            return this.f59589a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23627c) && Double.compare(this.f59589a, ((C23627c) obj).f59589a) == 0;
        }

        public int hashCode() {
            return Double.hashCode(this.f59589a);
        }

        @C12579k
        public String toString() {
            double d = this.f59589a;
            return "OnAddPickup(externalPickupPrice=" + d + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.b$d */
    public static final class C23628d implements C23617b {
        @C12579k

        /* renamed from: a */
        public static final C23628d f59590a = new C23628d();

        /* renamed from: b */
        public static final int f59591b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.b$e */
    public static final class C23629e implements C23617b {
        @C12579k

        /* renamed from: a */
        public static final C23629e f59592a = new C23629e();

        /* renamed from: b */
        public static final int f59593b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.b$f */
    public static final class C23630f implements C23617b {
        @C12579k

        /* renamed from: a */
        public static final C23630f f59594a = new C23630f();

        /* renamed from: b */
        public static final int f59595b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.b$g */
    public static final class C23631g implements C23617b {
        @C12579k

        /* renamed from: a */
        public static final C23631g f59596a = new C23631g();

        /* renamed from: b */
        public static final int f59597b = 0;
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.b$h */
    public interface C23632h extends C23617b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.b$h$a */
        public static final class C23633a implements C23632h {
            @C12579k

            /* renamed from: a */
            public static final C23633a f59598a = new C23633a();

            /* renamed from: b */
            public static final int f59599b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.b$h$b */
        public static final class C23634b implements C23632h {

            /* renamed from: b */
            public static final int f59600b = 0;

            /* renamed from: a */
            public final int f59601a;

            public C23634b(int i) {
                this.f59601a = i;
            }

            /* renamed from: c */
            public static /* synthetic */ C23634b m104964c(C23634b bVar, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = bVar.f59601a;
                }
                return bVar.mo69197b(i);
            }

            /* renamed from: a */
            public final int mo69196a() {
                return this.f59601a;
            }

            @C12579k
            /* renamed from: b */
            public final C23634b mo69197b(int i) {
                return new C23634b(i);
            }

            /* renamed from: d */
            public final int mo69198d() {
                return this.f59601a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C23634b) && this.f59601a == ((C23634b) obj).f59601a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f59601a);
            }

            @C12579k
            public String toString() {
                int i = this.f59601a;
                return "OnFocusTextField(index=" + i + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.b$h$c */
        public static final class C23635c implements C23632h {
            @C12579k

            /* renamed from: a */
            public static final C23635c f59602a = new C23635c();

            /* renamed from: b */
            public static final int f59603b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.b$h$d */
        public static final class C23636d implements C23632h {

            /* renamed from: b */
            public static final int f59604b = 0;
            @C12579k

            /* renamed from: a */
            public final String f59605a;

            public C23636d(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "promoCode");
                this.f59605a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C23636d m104968c(C23636d dVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = dVar.f59605a;
                }
                return dVar.mo69203b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo69202a() {
                return this.f59605a;
            }

            @C12579k
            /* renamed from: b */
            public final C23636d mo69203b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "promoCode");
                return new C23636d(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo69204d() {
                return this.f59605a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C23636d) && Intrinsics.areEqual((Object) this.f59605a, (Object) ((C23636d) obj).f59605a);
            }

            public int hashCode() {
                return this.f59605a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f59605a;
                return "OnValidatePromoCode(promoCode=" + str + ")";
            }
        }
    }
}
