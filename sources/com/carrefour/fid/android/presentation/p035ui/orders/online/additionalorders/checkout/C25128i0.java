package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.OtpOrigination;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.i0 */
public final class C25128i0 {
    @C12579k

    /* renamed from: a */
    public static final C25132d f61929a = new C25132d((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f61930b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.i0$b */
    public static final class C25130b implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f61934a;
        @C12579k

        /* renamed from: b */
        public final OtpOrigination f61935b;

        /* renamed from: c */
        public final int f61936c = R.id.checkoutStep2AdditionalOder_to_channelsFid;

        public C25130b(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            this.f61934a = str;
            this.f61935b = otpOrigination;
        }

        /* renamed from: d */
        public static /* synthetic */ C25130b m108736d(C25130b bVar, String str, OtpOrigination otpOrigination, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f61934a;
            }
            if ((i & 2) != 0) {
                otpOrigination = bVar.f61935b;
            }
            return bVar.mo73031c(str, otpOrigination);
        }

        @C12579k
        /* renamed from: a */
        public final String mo73029a() {
            return this.f61934a;
        }

        @C12579k
        /* renamed from: b */
        public final OtpOrigination mo73030b() {
            return this.f61935b;
        }

        @C12579k
        /* renamed from: c */
        public final C25130b mo73031c(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            return new C25130b(str, otpOrigination);
        }

        @C12579k
        /* renamed from: e */
        public final String mo73032e() {
            return this.f61934a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25130b)) {
                return false;
            }
            C25130b bVar = (C25130b) obj;
            return Intrinsics.areEqual((Object) this.f61934a, (Object) bVar.f61934a) && Intrinsics.areEqual((Object) this.f61935b, (Object) bVar.f61935b);
        }

        @C12579k
        /* renamed from: f */
        public final OtpOrigination mo73034f() {
            return this.f61935b;
        }

        public int getActionId() {
            return this.f61936c;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, this.f61934a);
            Class<OtpOrigination> cls = OtpOrigination.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                OtpOrigination otpOrigination = this.f61935b;
                Intrinsics.checkNotNull(otpOrigination, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("origination", otpOrigination);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                OtpOrigination otpOrigination2 = this.f61935b;
                Intrinsics.checkNotNull(otpOrigination2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("origination", (Serializable) otpOrigination2);
            } else {
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            return bundle;
        }

        public int hashCode() {
            return (this.f61934a.hashCode() * 31) + this.f61935b.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f61934a;
            OtpOrigination otpOrigination = this.f61935b;
            return "CheckoutStep2AdditionalOderToChannelsFid(loyaltyCardNumber=" + str + ", origination=" + otpOrigination + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.i0$c */
    public static final class C25131c implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f61937a;
        @C12579k

        /* renamed from: b */
        public final OtpOrigination f61938b;

        /* renamed from: c */
        public final int f61939c = R.id.checkoutStepTwoAdditionalOder_to_blockedCard;

        public C25131c(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            this.f61937a = str;
            this.f61938b = otpOrigination;
        }

        /* renamed from: d */
        public static /* synthetic */ C25131c m108742d(C25131c cVar, String str, OtpOrigination otpOrigination, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.f61937a;
            }
            if ((i & 2) != 0) {
                otpOrigination = cVar.f61938b;
            }
            return cVar.mo73039c(str, otpOrigination);
        }

        @C12579k
        /* renamed from: a */
        public final String mo73037a() {
            return this.f61937a;
        }

        @C12579k
        /* renamed from: b */
        public final OtpOrigination mo73038b() {
            return this.f61938b;
        }

        @C12579k
        /* renamed from: c */
        public final C25131c mo73039c(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            return new C25131c(str, otpOrigination);
        }

        @C12579k
        /* renamed from: e */
        public final String mo73040e() {
            return this.f61937a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25131c)) {
                return false;
            }
            C25131c cVar = (C25131c) obj;
            return Intrinsics.areEqual((Object) this.f61937a, (Object) cVar.f61937a) && Intrinsics.areEqual((Object) this.f61938b, (Object) cVar.f61938b);
        }

        @C12579k
        /* renamed from: f */
        public final OtpOrigination mo73042f() {
            return this.f61938b;
        }

        public int getActionId() {
            return this.f61939c;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, this.f61937a);
            Class<OtpOrigination> cls = OtpOrigination.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                OtpOrigination otpOrigination = this.f61938b;
                Intrinsics.checkNotNull(otpOrigination, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("origination", otpOrigination);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                OtpOrigination otpOrigination2 = this.f61938b;
                Intrinsics.checkNotNull(otpOrigination2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("origination", (Serializable) otpOrigination2);
            } else {
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            return bundle;
        }

        public int hashCode() {
            return (this.f61937a.hashCode() * 31) + this.f61938b.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f61937a;
            OtpOrigination otpOrigination = this.f61938b;
            return "CheckoutStepTwoAdditionalOderToBlockedCard(loyaltyCardNumber=" + str + ", origination=" + otpOrigination + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.i0$d */
    public static final class C25132d {
        public /* synthetic */ C25132d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19693b0 m108748b(C25132d dVar, String str, Bundle bundle, int i, Object obj) {
            if ((i & 2) != 0) {
                bundle = null;
            }
            return dVar.mo73045a(str, bundle);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo73045a(@C12580l String str, @C12580l Bundle bundle) {
            return new C25129a(str, bundle);
        }

        @C12579k
        /* renamed from: c */
        public final C19693b0 mo73046c(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            return new C25130b(str, otpOrigination);
        }

        @C12579k
        /* renamed from: d */
        public final C19693b0 mo73047d(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            return new C25131c(str, otpOrigination);
        }

        public C25132d() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.i0$a */
    public static final class C25129a implements C19693b0 {
        @C12580l

        /* renamed from: a */
        public final String f61931a;
        @C12580l

        /* renamed from: b */
        public final Bundle f61932b;

        /* renamed from: c */
        public final int f61933c;

        public C25129a(@C12580l String str, @C12580l Bundle bundle) {
            this.f61931a = str;
            this.f61932b = bundle;
            this.f61933c = R.id.action_checkoutStepTwoAdditionalOderFragment_to_checkoutAdditionalOrderPaymentFragment;
        }

        /* renamed from: d */
        public static /* synthetic */ C25129a m108730d(C25129a aVar, String str, Bundle bundle, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f61931a;
            }
            if ((i & 2) != 0) {
                bundle = aVar.f61932b;
            }
            return aVar.mo73023c(str, bundle);
        }

        @C12580l
        /* renamed from: a */
        public final String mo73021a() {
            return this.f61931a;
        }

        @C12580l
        /* renamed from: b */
        public final Bundle mo73022b() {
            return this.f61932b;
        }

        @C12579k
        /* renamed from: c */
        public final C25129a mo73023c(@C12580l String str, @C12580l Bundle bundle) {
            return new C25129a(str, bundle);
        }

        @C12580l
        /* renamed from: e */
        public final Bundle mo73024e() {
            return this.f61932b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25129a)) {
                return false;
            }
            C25129a aVar = (C25129a) obj;
            return Intrinsics.areEqual((Object) this.f61931a, (Object) aVar.f61931a) && Intrinsics.areEqual((Object) this.f61932b, (Object) aVar.f61932b);
        }

        @C12580l
        /* renamed from: f */
        public final String mo73026f() {
            return this.f61931a;
        }

        public int getActionId() {
            return this.f61933c;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<Bundle> cls = Bundle.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                bundle.putParcelable("arguments_payment_confirmation", this.f61932b);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                bundle.putSerializable("arguments_payment_confirmation", (Serializable) this.f61932b);
            }
            bundle.putString(C38212b.f96799g, this.f61931a);
            return bundle;
        }

        public int hashCode() {
            String str = this.f61931a;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Bundle bundle = this.f61932b;
            if (bundle != null) {
                i = bundle.hashCode();
            }
            return hashCode + i;
        }

        @C12579k
        public String toString() {
            String str = this.f61931a;
            Bundle bundle = this.f61932b;
            return "ActionCheckoutStepTwoAdditionalOderFragmentToCheckoutAdditionalOrderPaymentFragment(initialOrderId=" + str + ", argumentsPaymentConfirmation=" + bundle + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C25129a(String str, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : bundle);
        }
    }
}
