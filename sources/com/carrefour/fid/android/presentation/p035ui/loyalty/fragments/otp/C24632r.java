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
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.r */
public final class C24632r {
    @C12579k

    /* renamed from: a */
    public static final C24634b f61212a = new C24634b((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f61213b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.r$b */
    public static final class C24634b {
        public /* synthetic */ C24634b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19693b0 m107674b(C24634b bVar, String str, OtpOrigination otpOrigination, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            return bVar.mo72023a(str, otpOrigination, str2);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo72023a(@C12579k String str, @C12579k OtpOrigination otpOrigination, @C12580l String str2) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            return new C24633a(str, otpOrigination, str2);
        }

        public C24634b() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.r$a */
    public static final class C24633a implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f61214a;
        @C12579k

        /* renamed from: b */
        public final OtpOrigination f61215b;
        @C12580l

        /* renamed from: c */
        public final String f61216c;

        /* renamed from: d */
        public final int f61217d;

        public C24633a(@C12579k String str, @C12579k OtpOrigination otpOrigination, @C12580l String str2) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            this.f61214a = str;
            this.f61215b = otpOrigination;
            this.f61216c = str2;
            this.f61217d = R.id.action_validateOtpFragment_to_secretCodeFragment;
        }

        /* renamed from: e */
        public static /* synthetic */ C24633a m107666e(C24633a aVar, String str, OtpOrigination otpOrigination, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f61214a;
            }
            if ((i & 2) != 0) {
                otpOrigination = aVar.f61215b;
            }
            if ((i & 4) != 0) {
                str2 = aVar.f61216c;
            }
            return aVar.mo72016d(str, otpOrigination, str2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo72013a() {
            return this.f61214a;
        }

        @C12579k
        /* renamed from: b */
        public final OtpOrigination mo72014b() {
            return this.f61215b;
        }

        @C12580l
        /* renamed from: c */
        public final String mo72015c() {
            return this.f61216c;
        }

        @C12579k
        /* renamed from: d */
        public final C24633a mo72016d(@C12579k String str, @C12579k OtpOrigination otpOrigination, @C12580l String str2) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            return new C24633a(str, otpOrigination, str2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24633a)) {
                return false;
            }
            C24633a aVar = (C24633a) obj;
            return Intrinsics.areEqual((Object) this.f61214a, (Object) aVar.f61214a) && Intrinsics.areEqual((Object) this.f61215b, (Object) aVar.f61215b) && Intrinsics.areEqual((Object) this.f61216c, (Object) aVar.f61216c);
        }

        @C12579k
        /* renamed from: f */
        public final String mo72018f() {
            return this.f61214a;
        }

        @C12579k
        /* renamed from: g */
        public final OtpOrigination mo72019g() {
            return this.f61215b;
        }

        public int getActionId() {
            return this.f61217d;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, this.f61214a);
            bundle.putString("validationOtpCode", this.f61216c);
            Class<OtpOrigination> cls = OtpOrigination.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                OtpOrigination otpOrigination = this.f61215b;
                Intrinsics.checkNotNull(otpOrigination, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("origination", otpOrigination);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                OtpOrigination otpOrigination2 = this.f61215b;
                Intrinsics.checkNotNull(otpOrigination2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("origination", (Serializable) otpOrigination2);
            } else {
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            return bundle;
        }

        @C12580l
        /* renamed from: h */
        public final String mo72020h() {
            return this.f61216c;
        }

        public int hashCode() {
            int hashCode = ((this.f61214a.hashCode() * 31) + this.f61215b.hashCode()) * 31;
            String str = this.f61216c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @C12579k
        public String toString() {
            String str = this.f61214a;
            OtpOrigination otpOrigination = this.f61215b;
            String str2 = this.f61216c;
            return "ActionValidateOtpFragmentToSecretCodeFragment(loyaltyCardNumber=" + str + ", origination=" + otpOrigination + ", validationOtpCode=" + str2 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C24633a(String str, OtpOrigination otpOrigination, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, otpOrigination, (i & 4) != 0 ? null : str2);
        }
    }
}
