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
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.n */
public final class C24624n {
    @C12579k

    /* renamed from: a */
    public static final C24627c f61198a = new C24627c((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f61199b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.n$a */
    public static final class C24625a implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f61200a;
        @C12579k

        /* renamed from: b */
        public final OtpOrigination f61201b;

        /* renamed from: c */
        public final int f61202c = R.id.action_secretCodeFragment_to_blockedCardFragment;

        public C24625a(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            this.f61200a = str;
            this.f61201b = otpOrigination;
        }

        /* renamed from: d */
        public static /* synthetic */ C24625a m107635d(C24625a aVar, String str, OtpOrigination otpOrigination, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f61200a;
            }
            if ((i & 2) != 0) {
                otpOrigination = aVar.f61201b;
            }
            return aVar.mo71983c(str, otpOrigination);
        }

        @C12579k
        /* renamed from: a */
        public final String mo71981a() {
            return this.f61200a;
        }

        @C12579k
        /* renamed from: b */
        public final OtpOrigination mo71982b() {
            return this.f61201b;
        }

        @C12579k
        /* renamed from: c */
        public final C24625a mo71983c(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            return new C24625a(str, otpOrigination);
        }

        @C12579k
        /* renamed from: e */
        public final String mo71984e() {
            return this.f61200a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24625a)) {
                return false;
            }
            C24625a aVar = (C24625a) obj;
            return Intrinsics.areEqual((Object) this.f61200a, (Object) aVar.f61200a) && Intrinsics.areEqual((Object) this.f61201b, (Object) aVar.f61201b);
        }

        @C12579k
        /* renamed from: f */
        public final OtpOrigination mo71986f() {
            return this.f61201b;
        }

        public int getActionId() {
            return this.f61202c;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, this.f61200a);
            Class<OtpOrigination> cls = OtpOrigination.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                OtpOrigination otpOrigination = this.f61201b;
                Intrinsics.checkNotNull(otpOrigination, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("origination", otpOrigination);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                OtpOrigination otpOrigination2 = this.f61201b;
                Intrinsics.checkNotNull(otpOrigination2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("origination", (Serializable) otpOrigination2);
            } else {
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            return bundle;
        }

        public int hashCode() {
            return (this.f61200a.hashCode() * 31) + this.f61201b.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f61200a;
            OtpOrigination otpOrigination = this.f61201b;
            return "ActionSecretCodeFragmentToBlockedCardFragment(loyaltyCardNumber=" + str + ", origination=" + otpOrigination + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.n$b */
    public static final class C24626b implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f61203a;
        @C12579k

        /* renamed from: b */
        public final OtpOrigination f61204b;

        /* renamed from: c */
        public final int f61205c = R.id.action_secretCodeFragment_to_channelsFidFragment;

        public C24626b(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            this.f61203a = str;
            this.f61204b = otpOrigination;
        }

        /* renamed from: d */
        public static /* synthetic */ C24626b m107641d(C24626b bVar, String str, OtpOrigination otpOrigination, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f61203a;
            }
            if ((i & 2) != 0) {
                otpOrigination = bVar.f61204b;
            }
            return bVar.mo71991c(str, otpOrigination);
        }

        @C12579k
        /* renamed from: a */
        public final String mo71989a() {
            return this.f61203a;
        }

        @C12579k
        /* renamed from: b */
        public final OtpOrigination mo71990b() {
            return this.f61204b;
        }

        @C12579k
        /* renamed from: c */
        public final C24626b mo71991c(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            return new C24626b(str, otpOrigination);
        }

        @C12579k
        /* renamed from: e */
        public final String mo71992e() {
            return this.f61203a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24626b)) {
                return false;
            }
            C24626b bVar = (C24626b) obj;
            return Intrinsics.areEqual((Object) this.f61203a, (Object) bVar.f61203a) && Intrinsics.areEqual((Object) this.f61204b, (Object) bVar.f61204b);
        }

        @C12579k
        /* renamed from: f */
        public final OtpOrigination mo71994f() {
            return this.f61204b;
        }

        public int getActionId() {
            return this.f61205c;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, this.f61203a);
            Class<OtpOrigination> cls = OtpOrigination.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                OtpOrigination otpOrigination = this.f61204b;
                Intrinsics.checkNotNull(otpOrigination, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("origination", otpOrigination);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                OtpOrigination otpOrigination2 = this.f61204b;
                Intrinsics.checkNotNull(otpOrigination2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("origination", (Serializable) otpOrigination2);
            } else {
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            return bundle;
        }

        public int hashCode() {
            return (this.f61203a.hashCode() * 31) + this.f61204b.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f61203a;
            OtpOrigination otpOrigination = this.f61204b;
            return "ActionSecretCodeFragmentToChannelsFidFragment(loyaltyCardNumber=" + str + ", origination=" + otpOrigination + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.n$c */
    public static final class C24627c {
        public /* synthetic */ C24627c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo71997a(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            return new C24625a(str, otpOrigination);
        }

        @C12579k
        /* renamed from: b */
        public final C19693b0 mo71998b(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            return new C24626b(str, otpOrigination);
        }

        @C12579k
        /* renamed from: c */
        public final C19693b0 mo71999c() {
            return new C19690a(R.id.action_secretCodeFragment_to_homeLoyaltyFragment);
        }

        public C24627c() {
        }
    }
}
