package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.details;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19690a;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.cms.domain.models.LoyaltyBonus;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.OtpOrigination;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.details.j */
public final class C24481j {
    @C12579k

    /* renamed from: a */
    public static final C24488g f61006a = new C24488g((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f61007b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.details.j$a */
    public static final class C24482a implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f61008a;
        @C12579k

        /* renamed from: b */
        public final String f61009b;

        /* renamed from: c */
        public final int f61010c = R.id.action_loyaltyDetailViewFragment_to_challengeFidFragment;

        public C24482a(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "screenName");
            Intrinsics.checkNotNullParameter(str2, "screenTemplate");
            this.f61008a = str;
            this.f61009b = str2;
        }

        /* renamed from: d */
        public static /* synthetic */ C24482a m107301d(C24482a aVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f61008a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f61009b;
            }
            return aVar.mo71595c(str, str2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo71593a() {
            return this.f61008a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo71594b() {
            return this.f61009b;
        }

        @C12579k
        /* renamed from: c */
        public final C24482a mo71595c(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "screenName");
            Intrinsics.checkNotNullParameter(str2, "screenTemplate");
            return new C24482a(str, str2);
        }

        @C12579k
        /* renamed from: e */
        public final String mo71596e() {
            return this.f61008a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24482a)) {
                return false;
            }
            C24482a aVar = (C24482a) obj;
            return Intrinsics.areEqual((Object) this.f61008a, (Object) aVar.f61008a) && Intrinsics.areEqual((Object) this.f61009b, (Object) aVar.f61009b);
        }

        @C12579k
        /* renamed from: f */
        public final String mo71598f() {
            return this.f61009b;
        }

        public int getActionId() {
            return this.f61010c;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("screenName", this.f61008a);
            bundle.putString("screenTemplate", this.f61009b);
            return bundle;
        }

        public int hashCode() {
            return (this.f61008a.hashCode() * 31) + this.f61009b.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f61008a;
            String str2 = this.f61009b;
            return "ActionLoyaltyDetailViewFragmentToChallengeFidFragment(screenName=" + str + ", screenTemplate=" + str2 + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.details.j$b */
    public static final class C24483b implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f61011a;
        @C12579k

        /* renamed from: b */
        public final OtpOrigination f61012b;

        /* renamed from: c */
        public final int f61013c = R.id.action_loyaltyDetailViewFragment_to_channelsFidFragment;

        public C24483b(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            this.f61011a = str;
            this.f61012b = otpOrigination;
        }

        /* renamed from: d */
        public static /* synthetic */ C24483b m107307d(C24483b bVar, String str, OtpOrigination otpOrigination, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f61011a;
            }
            if ((i & 2) != 0) {
                otpOrigination = bVar.f61012b;
            }
            return bVar.mo71603c(str, otpOrigination);
        }

        @C12579k
        /* renamed from: a */
        public final String mo71601a() {
            return this.f61011a;
        }

        @C12579k
        /* renamed from: b */
        public final OtpOrigination mo71602b() {
            return this.f61012b;
        }

        @C12579k
        /* renamed from: c */
        public final C24483b mo71603c(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            return new C24483b(str, otpOrigination);
        }

        @C12579k
        /* renamed from: e */
        public final String mo71604e() {
            return this.f61011a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24483b)) {
                return false;
            }
            C24483b bVar = (C24483b) obj;
            return Intrinsics.areEqual((Object) this.f61011a, (Object) bVar.f61011a) && Intrinsics.areEqual((Object) this.f61012b, (Object) bVar.f61012b);
        }

        @C12579k
        /* renamed from: f */
        public final OtpOrigination mo71606f() {
            return this.f61012b;
        }

        public int getActionId() {
            return this.f61013c;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, this.f61011a);
            Class<OtpOrigination> cls = OtpOrigination.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                OtpOrigination otpOrigination = this.f61012b;
                Intrinsics.checkNotNull(otpOrigination, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("origination", otpOrigination);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                OtpOrigination otpOrigination2 = this.f61012b;
                Intrinsics.checkNotNull(otpOrigination2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("origination", (Serializable) otpOrigination2);
            } else {
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            return bundle;
        }

        public int hashCode() {
            return (this.f61011a.hashCode() * 31) + this.f61012b.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f61011a;
            OtpOrigination otpOrigination = this.f61012b;
            return "ActionLoyaltyDetailViewFragmentToChannelsFidFragment(loyaltyCardNumber=" + str + ", origination=" + otpOrigination + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.details.j$c */
    public static final class C24484c implements C19693b0 {

        /* renamed from: a */
        public final boolean f61014a;

        /* renamed from: b */
        public final int f61015b;

        public C24484c() {
            this(false, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C24484c m107313c(C24484c cVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = cVar.f61014a;
            }
            return cVar.mo71610b(z);
        }

        /* renamed from: a */
        public final boolean mo71609a() {
            return this.f61014a;
        }

        @C12579k
        /* renamed from: b */
        public final C24484c mo71610b(boolean z) {
            return new C24484c(z);
        }

        /* renamed from: d */
        public final boolean mo71611d() {
            return this.f61014a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24484c) && this.f61014a == ((C24484c) obj).f61014a;
        }

        public int getActionId() {
            return this.f61015b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("isInStoreOnly", this.f61014a);
            return bundle;
        }

        public int hashCode() {
            boolean z = this.f61014a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @C12579k
        public String toString() {
            boolean z = this.f61014a;
            return "ActionLoyaltyDetailViewFragmentToCouponsFragment(isInStoreOnly=" + z + ")";
        }

        public C24484c(boolean z) {
            this.f61014a = z;
            this.f61015b = R.id.action_loyaltyDetailViewFragment_to_couponsFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C24484c(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.details.j$d */
    public static final class C24485d implements C19693b0 {

        /* renamed from: a */
        public final boolean f61016a;

        /* renamed from: b */
        public final int f61017b;

        public C24485d() {
            this(false, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C24485d m107317c(C24485d dVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = dVar.f61016a;
            }
            return dVar.mo71616b(z);
        }

        /* renamed from: a */
        public final boolean mo71615a() {
            return this.f61016a;
        }

        @C12579k
        /* renamed from: b */
        public final C24485d mo71616b(boolean z) {
            return new C24485d(z);
        }

        /* renamed from: d */
        public final boolean mo71617d() {
            return this.f61016a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24485d) && this.f61016a == ((C24485d) obj).f61016a;
        }

        public int getActionId() {
            return this.f61017b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean(C38212b.f96814v, this.f61016a);
            return bundle;
        }

        public int hashCode() {
            boolean z = this.f61016a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @C12579k
        public String toString() {
            boolean z = this.f61016a;
            return "ActionLoyaltyDetailViewFragmentToHomeLoyaltyFragment(errorBalance=" + z + ")";
        }

        public C24485d(boolean z) {
            this.f61016a = z;
            this.f61017b = R.id.action_loyaltyDetailViewFragment_to_homeLoyaltyFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C24485d(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.details.j$e */
    public static final class C24486e implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f61018a;

        /* renamed from: b */
        public final int f61019b = R.id.action_loyaltyDetailViewFragment_to_loyaltyAmountHistoryFragment;

        public C24486e(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "loyaltyBalance");
            this.f61018a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C24486e m107321c(C24486e eVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = eVar.f61018a;
            }
            return eVar.mo71622b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo71621a() {
            return this.f61018a;
        }

        @C12579k
        /* renamed from: b */
        public final C24486e mo71622b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "loyaltyBalance");
            return new C24486e(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo71623d() {
            return this.f61018a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24486e) && Intrinsics.areEqual((Object) this.f61018a, (Object) ((C24486e) obj).f61018a);
        }

        public int getActionId() {
            return this.f61019b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("loyaltyBalance", this.f61018a);
            return bundle;
        }

        public int hashCode() {
            return this.f61018a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f61018a;
            return "ActionLoyaltyDetailViewFragmentToLoyaltyAmountHistoryFragment(loyaltyBalance=" + str + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.details.j$g */
    public static final class C24488g {
        public /* synthetic */ C24488g(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        public static /* synthetic */ C19693b0 m107331d(C24488g gVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return gVar.mo71637c(z);
        }

        /* renamed from: f */
        public static /* synthetic */ C19693b0 m107332f(C24488g gVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return gVar.mo71638e(z);
        }

        /* renamed from: j */
        public static /* synthetic */ C19693b0 m107333j(C24488g gVar, LoyaltyBonus[] loyaltyBonusArr, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return gVar.mo71641i(loyaltyBonusArr, z);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo71635a(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "screenName");
            Intrinsics.checkNotNullParameter(str2, "screenTemplate");
            return new C24482a(str, str2);
        }

        @C12579k
        /* renamed from: b */
        public final C19693b0 mo71636b(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            return new C24483b(str, otpOrigination);
        }

        @C12579k
        /* renamed from: c */
        public final C19693b0 mo71637c(boolean z) {
            return new C24484c(z);
        }

        @C12579k
        /* renamed from: e */
        public final C19693b0 mo71638e(boolean z) {
            return new C24485d(z);
        }

        @C12579k
        /* renamed from: g */
        public final C19693b0 mo71639g(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "loyaltyBalance");
            return new C24486e(str);
        }

        @C12579k
        /* renamed from: h */
        public final C19693b0 mo71640h() {
            return new C19690a(R.id.action_loyaltyDetailViewFragment_to_loyaltyCardFragment);
        }

        @C12579k
        /* renamed from: i */
        public final C19693b0 mo71641i(@C12579k LoyaltyBonus[] loyaltyBonusArr, boolean z) {
            Intrinsics.checkNotNullParameter(loyaltyBonusArr, "primeList");
            return new C24487f(loyaltyBonusArr, z);
        }

        public C24488g() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.details.j$f */
    public static final class C24487f implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final LoyaltyBonus[] f61020a;

        /* renamed from: b */
        public final boolean f61021b;

        /* renamed from: c */
        public final int f61022c;

        public C24487f(@C12579k LoyaltyBonus[] loyaltyBonusArr, boolean z) {
            Intrinsics.checkNotNullParameter(loyaltyBonusArr, "primeList");
            this.f61020a = loyaltyBonusArr;
            this.f61021b = z;
            this.f61022c = R.id.action_loyaltyDetailViewFragment_to_primeFidFragment;
        }

        /* renamed from: d */
        public static /* synthetic */ C24487f m107325d(C24487f fVar, LoyaltyBonus[] loyaltyBonusArr, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                loyaltyBonusArr = fVar.f61020a;
            }
            if ((i & 2) != 0) {
                z = fVar.f61021b;
            }
            return fVar.mo71629c(loyaltyBonusArr, z);
        }

        @C12579k
        /* renamed from: a */
        public final LoyaltyBonus[] mo71627a() {
            return this.f61020a;
        }

        /* renamed from: b */
        public final boolean mo71628b() {
            return this.f61021b;
        }

        @C12579k
        /* renamed from: c */
        public final C24487f mo71629c(@C12579k LoyaltyBonus[] loyaltyBonusArr, boolean z) {
            Intrinsics.checkNotNullParameter(loyaltyBonusArr, "primeList");
            return new C24487f(loyaltyBonusArr, z);
        }

        @C12579k
        /* renamed from: e */
        public final LoyaltyBonus[] mo71630e() {
            return this.f61020a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24487f)) {
                return false;
            }
            C24487f fVar = (C24487f) obj;
            return Intrinsics.areEqual((Object) this.f61020a, (Object) fVar.f61020a) && this.f61021b == fVar.f61021b;
        }

        /* renamed from: f */
        public final boolean mo71632f() {
            return this.f61021b;
        }

        public int getActionId() {
            return this.f61022c;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("primeList", (Parcelable[]) this.f61020a);
            bundle.putBoolean("isDeepLink", this.f61021b);
            return bundle;
        }

        public int hashCode() {
            int hashCode = Arrays.hashCode(this.f61020a) * 31;
            boolean z = this.f61021b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        @C12579k
        public String toString() {
            String arrays = Arrays.toString(this.f61020a);
            boolean z = this.f61021b;
            return "ActionLoyaltyDetailViewFragmentToPrimeFidFragment(primeList=" + arrays + ", isDeepLink=" + z + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C24487f(LoyaltyBonus[] loyaltyBonusArr, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(loyaltyBonusArr, (i & 2) != 0 ? false : z);
        }
    }
}
