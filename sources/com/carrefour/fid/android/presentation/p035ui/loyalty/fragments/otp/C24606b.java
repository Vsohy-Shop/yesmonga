package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19690a;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.b */
public final class C24606b {
    @C12579k

    /* renamed from: a */
    public static final C24608b f61156a = new C24608b((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f61157b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.b$a */
    public static final class C24607a implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f61158a;
        @C12579k

        /* renamed from: b */
        public final OtpOrigination f61159b;

        /* renamed from: c */
        public final int f61160c = R.id.blockedCardFragment_to_channelsFidFragment;

        public C24607a(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            this.f61158a = str;
            this.f61159b = otpOrigination;
        }

        /* renamed from: d */
        public static /* synthetic */ C24607a m107587d(C24607a aVar, String str, OtpOrigination otpOrigination, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f61158a;
            }
            if ((i & 2) != 0) {
                otpOrigination = aVar.f61159b;
            }
            return aVar.mo71924c(str, otpOrigination);
        }

        @C12579k
        /* renamed from: a */
        public final String mo71922a() {
            return this.f61158a;
        }

        @C12579k
        /* renamed from: b */
        public final OtpOrigination mo71923b() {
            return this.f61159b;
        }

        @C12579k
        /* renamed from: c */
        public final C24607a mo71924c(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            return new C24607a(str, otpOrigination);
        }

        @C12579k
        /* renamed from: e */
        public final String mo71925e() {
            return this.f61158a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24607a)) {
                return false;
            }
            C24607a aVar = (C24607a) obj;
            return Intrinsics.areEqual((Object) this.f61158a, (Object) aVar.f61158a) && Intrinsics.areEqual((Object) this.f61159b, (Object) aVar.f61159b);
        }

        @C12579k
        /* renamed from: f */
        public final OtpOrigination mo71927f() {
            return this.f61159b;
        }

        public int getActionId() {
            return this.f61160c;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, this.f61158a);
            Class<OtpOrigination> cls = OtpOrigination.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                OtpOrigination otpOrigination = this.f61159b;
                Intrinsics.checkNotNull(otpOrigination, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("origination", otpOrigination);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                OtpOrigination otpOrigination2 = this.f61159b;
                Intrinsics.checkNotNull(otpOrigination2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("origination", (Serializable) otpOrigination2);
            } else {
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            return bundle;
        }

        public int hashCode() {
            return (this.f61158a.hashCode() * 31) + this.f61159b.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f61158a;
            OtpOrigination otpOrigination = this.f61159b;
            return "BlockedCardFragmentToChannelsFidFragment(loyaltyCardNumber=" + str + ", origination=" + otpOrigination + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.b$b */
    public static final class C24608b {
        public /* synthetic */ C24608b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo71930a(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            return new C24607a(str, otpOrigination);
        }

        @C12579k
        /* renamed from: b */
        public final C19693b0 mo71931b() {
            return new C19690a(R.id.blockedCardFragment_to_homeLoyaltyFragment);
        }

        public C24608b() {
        }
    }
}
