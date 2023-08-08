package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.f */
public final class C24613f {
    @C12579k

    /* renamed from: a */
    public static final C24615b f61166a = new C24615b((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f61167b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.f$a */
    public static final class C24614a implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f61168a;
        @C12579k

        /* renamed from: b */
        public final OtpOrigination f61169b;

        /* renamed from: c */
        public final int f61170c = R.id.action_channelsFidFragment_to_validateOtpFragment;

        public C24614a(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            this.f61168a = str;
            this.f61169b = otpOrigination;
        }

        /* renamed from: d */
        public static /* synthetic */ C24614a m107610d(C24614a aVar, String str, OtpOrigination otpOrigination, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f61168a;
            }
            if ((i & 2) != 0) {
                otpOrigination = aVar.f61169b;
            }
            return aVar.mo71947c(str, otpOrigination);
        }

        @C12579k
        /* renamed from: a */
        public final String mo71945a() {
            return this.f61168a;
        }

        @C12579k
        /* renamed from: b */
        public final OtpOrigination mo71946b() {
            return this.f61169b;
        }

        @C12579k
        /* renamed from: c */
        public final C24614a mo71947c(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            return new C24614a(str, otpOrigination);
        }

        @C12579k
        /* renamed from: e */
        public final String mo71948e() {
            return this.f61168a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24614a)) {
                return false;
            }
            C24614a aVar = (C24614a) obj;
            return Intrinsics.areEqual((Object) this.f61168a, (Object) aVar.f61168a) && Intrinsics.areEqual((Object) this.f61169b, (Object) aVar.f61169b);
        }

        @C12579k
        /* renamed from: f */
        public final OtpOrigination mo71950f() {
            return this.f61169b;
        }

        public int getActionId() {
            return this.f61170c;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, this.f61168a);
            Class<OtpOrigination> cls = OtpOrigination.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                OtpOrigination otpOrigination = this.f61169b;
                Intrinsics.checkNotNull(otpOrigination, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("origination", otpOrigination);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                OtpOrigination otpOrigination2 = this.f61169b;
                Intrinsics.checkNotNull(otpOrigination2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("origination", (Serializable) otpOrigination2);
            } else {
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            return bundle;
        }

        public int hashCode() {
            return (this.f61168a.hashCode() * 31) + this.f61169b.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f61168a;
            OtpOrigination otpOrigination = this.f61169b;
            return "ActionChannelsFidFragmentToValidateOtpFragment(loyaltyCardNumber=" + str + ", origination=" + otpOrigination + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.f$b */
    public static final class C24615b {
        public /* synthetic */ C24615b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo71953a(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            return new C24614a(str, otpOrigination);
        }

        public C24615b() {
        }
    }
}
