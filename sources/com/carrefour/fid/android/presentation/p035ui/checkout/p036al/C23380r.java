package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19690a;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.domain.models.slot.SlotExpress;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.OtpOrigination;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26190a;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.r */
public final class C23380r {
    @C12579k

    /* renamed from: a */
    public static final C23385e f59190a = new C23385e((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f59191b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.r$a */
    public static final class C23381a implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f59192a;
        @C12579k

        /* renamed from: b */
        public final OtpOrigination f59193b;

        /* renamed from: c */
        public final int f59194c = R.id.action_checkoutStep3Fragment_to_blockedCard;

        public C23381a(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            this.f59192a = str;
            this.f59193b = otpOrigination;
        }

        /* renamed from: d */
        public static /* synthetic */ C23381a m104312d(C23381a aVar, String str, OtpOrigination otpOrigination, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f59192a;
            }
            if ((i & 2) != 0) {
                otpOrigination = aVar.f59193b;
            }
            return aVar.mo68504c(str, otpOrigination);
        }

        @C12579k
        /* renamed from: a */
        public final String mo68502a() {
            return this.f59192a;
        }

        @C12579k
        /* renamed from: b */
        public final OtpOrigination mo68503b() {
            return this.f59193b;
        }

        @C12579k
        /* renamed from: c */
        public final C23381a mo68504c(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            return new C23381a(str, otpOrigination);
        }

        @C12579k
        /* renamed from: e */
        public final String mo68505e() {
            return this.f59192a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23381a)) {
                return false;
            }
            C23381a aVar = (C23381a) obj;
            return Intrinsics.areEqual((Object) this.f59192a, (Object) aVar.f59192a) && Intrinsics.areEqual((Object) this.f59193b, (Object) aVar.f59193b);
        }

        @C12579k
        /* renamed from: f */
        public final OtpOrigination mo68507f() {
            return this.f59193b;
        }

        public int getActionId() {
            return this.f59194c;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, this.f59192a);
            Class<OtpOrigination> cls = OtpOrigination.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                OtpOrigination otpOrigination = this.f59193b;
                Intrinsics.checkNotNull(otpOrigination, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("origination", otpOrigination);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                OtpOrigination otpOrigination2 = this.f59193b;
                Intrinsics.checkNotNull(otpOrigination2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("origination", (Serializable) otpOrigination2);
            } else {
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            return bundle;
        }

        public int hashCode() {
            return (this.f59192a.hashCode() * 31) + this.f59193b.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f59192a;
            OtpOrigination otpOrigination = this.f59193b;
            return "ActionCheckoutStep3FragmentToBlockedCard(loyaltyCardNumber=" + str + ", origination=" + otpOrigination + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.r$c */
    public static final class C23383c implements C19693b0 {

        /* renamed from: a */
        public final boolean f59200a;

        /* renamed from: b */
        public final int f59201b;

        public C23383c() {
            this(false, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C23383c m104328c(C23383c cVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = cVar.f59200a;
            }
            return cVar.mo68523b(z);
        }

        /* renamed from: a */
        public final boolean mo68522a() {
            return this.f59200a;
        }

        @C12579k
        /* renamed from: b */
        public final C23383c mo68523b(boolean z) {
            return new C23383c(z);
        }

        /* renamed from: d */
        public final boolean mo68524d() {
            return this.f59200a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23383c) && this.f59200a == ((C23383c) obj).f59200a;
        }

        public int getActionId() {
            return this.f59201b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_from_checkout_step_3", this.f59200a);
            return bundle;
        }

        public int hashCode() {
            boolean z = this.f59200a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @C12579k
        public String toString() {
            boolean z = this.f59200a;
            return "ActionCheckoutStep3FragmentToServiceSlot(isFromCheckoutStep3=" + z + ")";
        }

        public C23383c(boolean z) {
            this.f59200a = z;
            this.f59201b = R.id.action_checkoutStep3Fragment_to_serviceSlot;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C23383c(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.r$d */
    public static final class C23384d implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f59202a;
        @C12579k

        /* renamed from: b */
        public final OtpOrigination f59203b;

        /* renamed from: c */
        public final int f59204c = R.id.checkoutStep3_to_channelsFidFromCheckoutAl;

        public C23384d(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            this.f59202a = str;
            this.f59203b = otpOrigination;
        }

        /* renamed from: d */
        public static /* synthetic */ C23384d m104332d(C23384d dVar, String str, OtpOrigination otpOrigination, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dVar.f59202a;
            }
            if ((i & 2) != 0) {
                otpOrigination = dVar.f59203b;
            }
            return dVar.mo68530c(str, otpOrigination);
        }

        @C12579k
        /* renamed from: a */
        public final String mo68528a() {
            return this.f59202a;
        }

        @C12579k
        /* renamed from: b */
        public final OtpOrigination mo68529b() {
            return this.f59203b;
        }

        @C12579k
        /* renamed from: c */
        public final C23384d mo68530c(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            return new C23384d(str, otpOrigination);
        }

        @C12579k
        /* renamed from: e */
        public final String mo68531e() {
            return this.f59202a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23384d)) {
                return false;
            }
            C23384d dVar = (C23384d) obj;
            return Intrinsics.areEqual((Object) this.f59202a, (Object) dVar.f59202a) && Intrinsics.areEqual((Object) this.f59203b, (Object) dVar.f59203b);
        }

        @C12579k
        /* renamed from: f */
        public final OtpOrigination mo68533f() {
            return this.f59203b;
        }

        public int getActionId() {
            return this.f59204c;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, this.f59202a);
            Class<OtpOrigination> cls = OtpOrigination.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                OtpOrigination otpOrigination = this.f59203b;
                Intrinsics.checkNotNull(otpOrigination, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("origination", otpOrigination);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                OtpOrigination otpOrigination2 = this.f59203b;
                Intrinsics.checkNotNull(otpOrigination2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("origination", (Serializable) otpOrigination2);
            } else {
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            return bundle;
        }

        public int hashCode() {
            return (this.f59202a.hashCode() * 31) + this.f59203b.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f59202a;
            OtpOrigination otpOrigination = this.f59203b;
            return "CheckoutStep3ToChannelsFidFromCheckoutAl(loyaltyCardNumber=" + str + ", origination=" + otpOrigination + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.r$e */
    public static final class C23385e {
        public /* synthetic */ C23385e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        public static /* synthetic */ C19693b0 m104338d(C23385e eVar, String str, Bundle bundle, SlotExpress slotExpress, Bundle bundle2, int i, Object obj) {
            if ((i & 2) != 0) {
                bundle = null;
            }
            if ((i & 4) != 0) {
                slotExpress = null;
            }
            if ((i & 8) != 0) {
                bundle2 = null;
            }
            return eVar.mo68538c(str, bundle, slotExpress, bundle2);
        }

        /* renamed from: f */
        public static /* synthetic */ C19693b0 m104339f(C23385e eVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return eVar.mo68539e(z);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo68536a(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            return new C23381a(str, otpOrigination);
        }

        @C12579k
        /* renamed from: b */
        public final C19693b0 mo68537b() {
            return new C19690a(R.id.action_checkoutStep3Fragment_to_checkoutStep3CgvFragment);
        }

        @C12579k
        /* renamed from: c */
        public final C19693b0 mo68538c(@C12579k String str, @C12580l Bundle bundle, @C12580l SlotExpress slotExpress, @C12580l Bundle bundle2) {
            Intrinsics.checkNotNullParameter(str, "subBasketId");
            return new C23382b(str, bundle, slotExpress, bundle2);
        }

        @C12579k
        /* renamed from: e */
        public final C19693b0 mo68539e(boolean z) {
            return new C23383c(z);
        }

        @C12579k
        /* renamed from: g */
        public final C19693b0 mo68540g(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            return new C23384d(str, otpOrigination);
        }

        public C23385e() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.r$b */
    public static final class C23382b implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f59195a;
        @C12580l

        /* renamed from: b */
        public final Bundle f59196b;
        @C12580l

        /* renamed from: c */
        public final SlotExpress f59197c;
        @C12580l

        /* renamed from: d */
        public final Bundle f59198d;

        /* renamed from: e */
        public final int f59199e;

        public C23382b(@C12579k String str, @C12580l Bundle bundle, @C12580l SlotExpress slotExpress, @C12580l Bundle bundle2) {
            Intrinsics.checkNotNullParameter(str, "subBasketId");
            this.f59195a = str;
            this.f59196b = bundle;
            this.f59197c = slotExpress;
            this.f59198d = bundle2;
            this.f59199e = R.id.action_checkoutStep3Fragment_to_checkoutStep4Fragment;
        }

        /* renamed from: f */
        public static /* synthetic */ C23382b m104318f(C23382b bVar, String str, Bundle bundle, SlotExpress slotExpress, Bundle bundle2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f59195a;
            }
            if ((i & 2) != 0) {
                bundle = bVar.f59196b;
            }
            if ((i & 4) != 0) {
                slotExpress = bVar.f59197c;
            }
            if ((i & 8) != 0) {
                bundle2 = bVar.f59198d;
            }
            return bVar.mo68514e(str, bundle, slotExpress, bundle2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo68510a() {
            return this.f59195a;
        }

        @C12580l
        /* renamed from: b */
        public final Bundle mo68511b() {
            return this.f59196b;
        }

        @C12580l
        /* renamed from: c */
        public final SlotExpress mo68512c() {
            return this.f59197c;
        }

        @C12580l
        /* renamed from: d */
        public final Bundle mo68513d() {
            return this.f59198d;
        }

        @C12579k
        /* renamed from: e */
        public final C23382b mo68514e(@C12579k String str, @C12580l Bundle bundle, @C12580l SlotExpress slotExpress, @C12580l Bundle bundle2) {
            Intrinsics.checkNotNullParameter(str, "subBasketId");
            return new C23382b(str, bundle, slotExpress, bundle2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23382b)) {
                return false;
            }
            C23382b bVar = (C23382b) obj;
            return Intrinsics.areEqual((Object) this.f59195a, (Object) bVar.f59195a) && Intrinsics.areEqual((Object) this.f59196b, (Object) bVar.f59196b) && Intrinsics.areEqual((Object) this.f59197c, (Object) bVar.f59197c) && Intrinsics.areEqual((Object) this.f59198d, (Object) bVar.f59198d);
        }

        @C12580l
        /* renamed from: g */
        public final Bundle mo68516g() {
            return this.f59196b;
        }

        public int getActionId() {
            return this.f59199e;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<Parcelable> cls = Parcelable.class;
            Class<Bundle> cls2 = Bundle.class;
            Class<Serializable> cls3 = Serializable.class;
            if (cls.isAssignableFrom(cls2)) {
                bundle.putParcelable("arguments_payment_confirmation", this.f59196b);
            } else if (cls3.isAssignableFrom(cls2)) {
                bundle.putSerializable("arguments_payment_confirmation", (Serializable) this.f59196b);
            }
            Class<SlotExpress> cls4 = SlotExpress.class;
            if (cls.isAssignableFrom(cls4)) {
                bundle.putParcelable("basket_slot_express", this.f59197c);
            } else if (cls3.isAssignableFrom(cls4)) {
                bundle.putSerializable("basket_slot_express", (Serializable) this.f59197c);
            }
            bundle.putString(C26190a.f64037a, this.f59195a);
            if (cls.isAssignableFrom(cls2)) {
                bundle.putParcelable(C38212b.f96795c, this.f59198d);
            } else if (cls3.isAssignableFrom(cls2)) {
                bundle.putSerializable(C38212b.f96795c, (Serializable) this.f59198d);
            }
            return bundle;
        }

        @C12580l
        /* renamed from: h */
        public final SlotExpress mo68517h() {
            return this.f59197c;
        }

        public int hashCode() {
            int hashCode = this.f59195a.hashCode() * 31;
            Bundle bundle = this.f59196b;
            int i = 0;
            int hashCode2 = (hashCode + (bundle == null ? 0 : bundle.hashCode())) * 31;
            SlotExpress slotExpress = this.f59197c;
            int hashCode3 = (hashCode2 + (slotExpress == null ? 0 : slotExpress.hashCode())) * 31;
            Bundle bundle2 = this.f59198d;
            if (bundle2 != null) {
                i = bundle2.hashCode();
            }
            return hashCode3 + i;
        }

        @C12580l
        /* renamed from: i */
        public final Bundle mo68519i() {
            return this.f59198d;
        }

        @C12579k
        /* renamed from: j */
        public final String mo68520j() {
            return this.f59195a;
        }

        @C12579k
        public String toString() {
            String str = this.f59195a;
            Bundle bundle = this.f59196b;
            SlotExpress slotExpress = this.f59197c;
            Bundle bundle2 = this.f59198d;
            return "ActionCheckoutStep3FragmentToCheckoutStep4Fragment(subBasketId=" + str + ", argumentsPaymentConfirmation=" + bundle + ", basketSlotExpress=" + slotExpress + ", categoryListByGtin=" + bundle2 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C23382b(String str, Bundle bundle, SlotExpress slotExpress, Bundle bundle2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : bundle, (i & 4) != 0 ? null : slotExpress, (i & 8) != 0 ? null : bundle2);
        }
    }
}
