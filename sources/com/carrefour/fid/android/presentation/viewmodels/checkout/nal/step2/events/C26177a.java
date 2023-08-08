package com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events;

import androidx.autofill.C0861a;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.AddressCategory;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import com.carrefour.fid.android.presentation.models.PaymentConfirmationModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.a */
public interface C26177a {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.a$a */
    public static final class C26178a implements C26177a {

        /* renamed from: b */
        public static final int f64019b = 0;
        @C12579k

        /* renamed from: a */
        public final String f64020a;

        public C26178a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            this.f64020a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C26178a m111889c(C26178a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f64020a;
            }
            return aVar.mo76077b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo76076a() {
            return this.f64020a;
        }

        @C12579k
        /* renamed from: b */
        public final C26178a mo76077b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            return new C26178a(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo76078d() {
            return this.f64020a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C26178a) && Intrinsics.areEqual((Object) this.f64020a, (Object) ((C26178a) obj).f64020a);
        }

        public int hashCode() {
            return this.f64020a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f64020a;
            return "FidCardBlocked(loyaltyCardNumber=" + str + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.a$b */
    public static final class C26179b implements C26177a {
        @C12579k

        /* renamed from: a */
        public static final C26179b f64021a = new C26179b();

        /* renamed from: b */
        public static final int f64022b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.a$c */
    public static final class C26180c implements C26177a {

        /* renamed from: e */
        public static final int f64023e = 8;
        @C12579k

        /* renamed from: a */
        public final Address f64024a;
        @C12579k

        /* renamed from: b */
        public final Address f64025b;
        @C12579k

        /* renamed from: c */
        public final AddressCategory f64026c;
        @C12579k

        /* renamed from: d */
        public final String f64027d;

        public C26180c(@C12579k Address address, @C12579k Address address2, @C12579k AddressCategory addressCategory, @C12579k String str) {
            Intrinsics.checkNotNullParameter(address, "billingAddress");
            Intrinsics.checkNotNullParameter(address2, "deliveryAddress");
            Intrinsics.checkNotNullParameter(addressCategory, "category");
            Intrinsics.checkNotNullParameter(str, C0861a.f2705e);
            this.f64024a = address;
            this.f64025b = address2;
            this.f64026c = addressCategory;
            this.f64027d = str;
        }

        /* renamed from: f */
        public static /* synthetic */ C26180c m111893f(C26180c cVar, Address address, Address address2, AddressCategory addressCategory, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                address = cVar.f64024a;
            }
            if ((i & 2) != 0) {
                address2 = cVar.f64025b;
            }
            if ((i & 4) != 0) {
                addressCategory = cVar.f64026c;
            }
            if ((i & 8) != 0) {
                str = cVar.f64027d;
            }
            return cVar.mo76086e(address, address2, addressCategory, str);
        }

        @C12579k
        /* renamed from: a */
        public final Address mo76082a() {
            return this.f64024a;
        }

        @C12579k
        /* renamed from: b */
        public final Address mo76083b() {
            return this.f64025b;
        }

        @C12579k
        /* renamed from: c */
        public final AddressCategory mo76084c() {
            return this.f64026c;
        }

        @C12579k
        /* renamed from: d */
        public final String mo76085d() {
            return this.f64027d;
        }

        @C12579k
        /* renamed from: e */
        public final C26180c mo76086e(@C12579k Address address, @C12579k Address address2, @C12579k AddressCategory addressCategory, @C12579k String str) {
            Intrinsics.checkNotNullParameter(address, "billingAddress");
            Intrinsics.checkNotNullParameter(address2, "deliveryAddress");
            Intrinsics.checkNotNullParameter(addressCategory, "category");
            Intrinsics.checkNotNullParameter(str, C0861a.f2705e);
            return new C26180c(address, address2, addressCategory, str);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26180c)) {
                return false;
            }
            C26180c cVar = (C26180c) obj;
            return Intrinsics.areEqual((Object) this.f64024a, (Object) cVar.f64024a) && Intrinsics.areEqual((Object) this.f64025b, (Object) cVar.f64025b) && this.f64026c == cVar.f64026c && Intrinsics.areEqual((Object) this.f64027d, (Object) cVar.f64027d);
        }

        @C12579k
        /* renamed from: g */
        public final Address mo76088g() {
            return this.f64024a;
        }

        @C12579k
        /* renamed from: h */
        public final AddressCategory mo76089h() {
            return this.f64026c;
        }

        public int hashCode() {
            return (((((this.f64024a.hashCode() * 31) + this.f64025b.hashCode()) * 31) + this.f64026c.hashCode()) * 31) + this.f64027d.hashCode();
        }

        @C12579k
        /* renamed from: i */
        public final Address mo76091i() {
            return this.f64025b;
        }

        @C12579k
        /* renamed from: j */
        public final String mo76092j() {
            return this.f64027d;
        }

        @C12579k
        public String toString() {
            Address address = this.f64024a;
            Address address2 = this.f64025b;
            AddressCategory addressCategory = this.f64026c;
            String str = this.f64027d;
            return "NavigateToAddressInput(billingAddress=" + address + ", deliveryAddress=" + address2 + ", category=" + addressCategory + ", phone=" + str + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.a$d */
    public static final class C26181d implements C26177a {

        /* renamed from: b */
        public static final int f64028b = 0;
        @C12579k

        /* renamed from: a */
        public final String f64029a;

        public C26181d(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            this.f64029a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C26181d m111903c(C26181d dVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dVar.f64029a;
            }
            return dVar.mo76095b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo76094a() {
            return this.f64029a;
        }

        @C12579k
        /* renamed from: b */
        public final C26181d mo76095b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            return new C26181d(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo76096d() {
            return this.f64029a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C26181d) && Intrinsics.areEqual((Object) this.f64029a, (Object) ((C26181d) obj).f64029a);
        }

        public int hashCode() {
            return this.f64029a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f64029a;
            return "NavigateToCheckLoyaltyCode(loyaltyCardNumber=" + str + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.a$e */
    public static final class C26182e implements C26177a {
        @C12579k

        /* renamed from: a */
        public static final C26182e f64030a = new C26182e();

        /* renamed from: b */
        public static final int f64031b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.a$f */
    public static final class C26183f implements C26177a {

        /* renamed from: b */
        public static final int f64032b = 0;
        @C12579k

        /* renamed from: a */
        public final PaymentConfirmationModel f64033a;

        public C26183f(@C12579k PaymentConfirmationModel paymentConfirmationModel) {
            Intrinsics.checkNotNullParameter(paymentConfirmationModel, "data");
            this.f64033a = paymentConfirmationModel;
        }

        /* renamed from: c */
        public static /* synthetic */ C26183f m111907c(C26183f fVar, PaymentConfirmationModel paymentConfirmationModel, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentConfirmationModel = fVar.f64033a;
            }
            return fVar.mo76101b(paymentConfirmationModel);
        }

        @C12579k
        /* renamed from: a */
        public final PaymentConfirmationModel mo76100a() {
            return this.f64033a;
        }

        @C12579k
        /* renamed from: b */
        public final C26183f mo76101b(@C12579k PaymentConfirmationModel paymentConfirmationModel) {
            Intrinsics.checkNotNullParameter(paymentConfirmationModel, "data");
            return new C26183f(paymentConfirmationModel);
        }

        @C12579k
        /* renamed from: d */
        public final PaymentConfirmationModel mo76102d() {
            return this.f64033a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C26183f) && Intrinsics.areEqual((Object) this.f64033a, (Object) ((C26183f) obj).f64033a);
        }

        public int hashCode() {
            return this.f64033a.hashCode();
        }

        @C12579k
        public String toString() {
            PaymentConfirmationModel paymentConfirmationModel = this.f64033a;
            return "PaymentValidationEvent(data=" + paymentConfirmationModel + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.a$g */
    public static final class C26184g implements C26177a {

        /* renamed from: b */
        public static final int f64034b = 8;
        @C12579k

        /* renamed from: a */
        public final Throwable f64035a;

        public C26184g(@C12579k Throwable th) {
            Intrinsics.checkNotNullParameter(th, "error");
            this.f64035a = th;
        }

        /* renamed from: c */
        public static /* synthetic */ C26184g m111911c(C26184g gVar, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = gVar.f64035a;
            }
            return gVar.mo76107b(th);
        }

        @C12579k
        /* renamed from: a */
        public final Throwable mo76106a() {
            return this.f64035a;
        }

        @C12579k
        /* renamed from: b */
        public final C26184g mo76107b(@C12579k Throwable th) {
            Intrinsics.checkNotNullParameter(th, "error");
            return new C26184g(th);
        }

        @C12579k
        /* renamed from: d */
        public final Throwable mo76108d() {
            return this.f64035a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C26184g) && Intrinsics.areEqual((Object) this.f64035a, (Object) ((C26184g) obj).f64035a);
        }

        public int hashCode() {
            return this.f64035a.hashCode();
        }

        @C12579k
        public String toString() {
            Throwable th = this.f64035a;
            return "RemovePromoCodeError(error=" + th + ")";
        }
    }
}
