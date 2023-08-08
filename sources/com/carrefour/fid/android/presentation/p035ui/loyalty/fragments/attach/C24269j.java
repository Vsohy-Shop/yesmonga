package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.attach;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19690a;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.OtpOrigination;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.attach.j */
public final class C24269j {
    @C12579k

    /* renamed from: a */
    public static final C24272c f60667a = new C24272c((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f60668b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.attach.j$a */
    public static final class C24270a implements C19693b0 {

        /* renamed from: a */
        public final boolean f60669a;

        /* renamed from: b */
        public final boolean f60670b;
        @C12580l

        /* renamed from: c */
        public final String f60671c;

        /* renamed from: d */
        public final int f60672d;

        public C24270a() {
            this(false, false, (String) null, 7, (DefaultConstructorMarker) null);
        }

        /* renamed from: e */
        public static /* synthetic */ C24270a m106755e(C24270a aVar, boolean z, boolean z2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.f60669a;
            }
            if ((i & 2) != 0) {
                z2 = aVar.f60670b;
            }
            if ((i & 4) != 0) {
                str = aVar.f60671c;
            }
            return aVar.mo71005d(z, z2, str);
        }

        /* renamed from: a */
        public final boolean mo71002a() {
            return this.f60669a;
        }

        /* renamed from: b */
        public final boolean mo71003b() {
            return this.f60670b;
        }

        @C12580l
        /* renamed from: c */
        public final String mo71004c() {
            return this.f60671c;
        }

        @C12579k
        /* renamed from: d */
        public final C24270a mo71005d(boolean z, boolean z2, @C12580l String str) {
            return new C24270a(z, z2, str);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24270a)) {
                return false;
            }
            C24270a aVar = (C24270a) obj;
            return this.f60669a == aVar.f60669a && this.f60670b == aVar.f60670b && Intrinsics.areEqual((Object) this.f60671c, (Object) aVar.f60671c);
        }

        @C12580l
        /* renamed from: f */
        public final String mo71007f() {
            return this.f60671c;
        }

        /* renamed from: g */
        public final boolean mo71008g() {
            return this.f60669a;
        }

        public int getActionId() {
            return this.f60672d;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("isFromActiveFid", this.f60669a);
            bundle.putBoolean("isFromAttachCard", this.f60670b);
            bundle.putString(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, this.f60671c);
            return bundle;
        }

        /* renamed from: h */
        public final boolean mo71009h() {
            return this.f60670b;
        }

        public int hashCode() {
            boolean z = this.f60669a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.f60670b;
            if (!z3) {
                z2 = z3;
            }
            int i2 = (i + (z2 ? 1 : 0)) * 31;
            String str = this.f60671c;
            return i2 + (str == null ? 0 : str.hashCode());
        }

        @C12579k
        public String toString() {
            boolean z = this.f60669a;
            boolean z2 = this.f60670b;
            String str = this.f60671c;
            return "ActionAttachCardFragmentToAcceptLoyaltyCguFragment(isFromActiveFid=" + z + ", isFromAttachCard=" + z2 + ", loyaltyCardNumber=" + str + ")";
        }

        public C24270a(boolean z, boolean z2, @C12580l String str) {
            this.f60669a = z;
            this.f60670b = z2;
            this.f60671c = str;
            this.f60672d = R.id.action_attachCardFragment_to_acceptLoyaltyCguFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C24270a(boolean z, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : str);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.attach.j$c */
    public static final class C24272c {
        public /* synthetic */ C24272c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19693b0 m106771b(C24272c cVar, boolean z, boolean z2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            if ((i & 4) != 0) {
                str = null;
            }
            return cVar.mo71022a(z, z2, str);
        }

        /* renamed from: e */
        public static /* synthetic */ C19693b0 m106772e(C24272c cVar, String str, OtpOrigination otpOrigination, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            return cVar.mo71024d(str, otpOrigination, str2);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo71022a(boolean z, boolean z2, @C12580l String str) {
            return new C24270a(z, z2, str);
        }

        @C12579k
        /* renamed from: c */
        public final C19693b0 mo71023c() {
            return new C19690a(R.id.action_attachCardFragment_to_infoCardsFragment);
        }

        @C12579k
        /* renamed from: d */
        public final C19693b0 mo71024d(@C12579k String str, @C12579k OtpOrigination otpOrigination, @C12580l String str2) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            return new C24271b(str, otpOrigination, str2);
        }

        public C24272c() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.attach.j$b */
    public static final class C24271b implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f60673a;
        @C12579k

        /* renamed from: b */
        public final OtpOrigination f60674b;
        @C12580l

        /* renamed from: c */
        public final String f60675c;

        /* renamed from: d */
        public final int f60676d;

        public C24271b(@C12579k String str, @C12579k OtpOrigination otpOrigination, @C12580l String str2) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            this.f60673a = str;
            this.f60674b = otpOrigination;
            this.f60675c = str2;
            this.f60676d = R.id.action_attachCardFragment_to_secretCodeFragment;
        }

        /* renamed from: e */
        public static /* synthetic */ C24271b m106763e(C24271b bVar, String str, OtpOrigination otpOrigination, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f60673a;
            }
            if ((i & 2) != 0) {
                otpOrigination = bVar.f60674b;
            }
            if ((i & 4) != 0) {
                str2 = bVar.f60675c;
            }
            return bVar.mo71015d(str, otpOrigination, str2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo71012a() {
            return this.f60673a;
        }

        @C12579k
        /* renamed from: b */
        public final OtpOrigination mo71013b() {
            return this.f60674b;
        }

        @C12580l
        /* renamed from: c */
        public final String mo71014c() {
            return this.f60675c;
        }

        @C12579k
        /* renamed from: d */
        public final C24271b mo71015d(@C12579k String str, @C12579k OtpOrigination otpOrigination, @C12580l String str2) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            return new C24271b(str, otpOrigination, str2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24271b)) {
                return false;
            }
            C24271b bVar = (C24271b) obj;
            return Intrinsics.areEqual((Object) this.f60673a, (Object) bVar.f60673a) && Intrinsics.areEqual((Object) this.f60674b, (Object) bVar.f60674b) && Intrinsics.areEqual((Object) this.f60675c, (Object) bVar.f60675c);
        }

        @C12579k
        /* renamed from: f */
        public final String mo71017f() {
            return this.f60673a;
        }

        @C12579k
        /* renamed from: g */
        public final OtpOrigination mo71018g() {
            return this.f60674b;
        }

        public int getActionId() {
            return this.f60676d;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, this.f60673a);
            bundle.putString("validationOtpCode", this.f60675c);
            Class<OtpOrigination> cls = OtpOrigination.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                OtpOrigination otpOrigination = this.f60674b;
                Intrinsics.checkNotNull(otpOrigination, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("origination", otpOrigination);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                OtpOrigination otpOrigination2 = this.f60674b;
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
        public final String mo71019h() {
            return this.f60675c;
        }

        public int hashCode() {
            int hashCode = ((this.f60673a.hashCode() * 31) + this.f60674b.hashCode()) * 31;
            String str = this.f60675c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @C12579k
        public String toString() {
            String str = this.f60673a;
            OtpOrigination otpOrigination = this.f60674b;
            String str2 = this.f60675c;
            return "ActionAttachCardFragmentToSecretCodeFragment(loyaltyCardNumber=" + str + ", origination=" + otpOrigination + ", validationOtpCode=" + str2 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C24271b(String str, OtpOrigination otpOrigination, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, otpOrigination, (i & 4) != 0 ? null : str2);
        }
    }
}
