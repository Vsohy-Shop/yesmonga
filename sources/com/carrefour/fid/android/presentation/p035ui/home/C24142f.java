package com.carrefour.fid.android.presentation.p035ui.home;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19690a;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome;
import com.carrefour.fid.android.core.type.AccountListType;
import com.carrefour.fid.android.domain.models.basket.BasketSlot;
import com.carrefour.fid.android.presentation.models.BasketBuilderType;
import com.carrefour.fid.android.presentation.viewmodels.basketbuilder.C25980u;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.storelocator.configurations.C28958a;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.home.f */
public final class C24142f {
    @C12579k

    /* renamed from: a */
    public static final C24153k f60384a = new C24153k((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f60385b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.home.f$a */
    public static final class C24143a implements C19693b0 {
        @C12580l

        /* renamed from: a */
        public final AccountListType f60386a;

        /* renamed from: b */
        public final int f60387b;

        public C24143a() {
            this((AccountListType) null, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C24143a m106287c(C24143a aVar, AccountListType accountListType, int i, Object obj) {
            if ((i & 1) != 0) {
                accountListType = aVar.f60386a;
            }
            return aVar.mo70544b(accountListType);
        }

        @C12580l
        /* renamed from: a */
        public final AccountListType mo70543a() {
            return this.f60386a;
        }

        @C12579k
        /* renamed from: b */
        public final C24143a mo70544b(@C12580l AccountListType accountListType) {
            return new C24143a(accountListType);
        }

        @C12580l
        /* renamed from: d */
        public final AccountListType mo70545d() {
            return this.f60386a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24143a) && Intrinsics.areEqual((Object) this.f60386a, (Object) ((C24143a) obj).f60386a);
        }

        public int getActionId() {
            return this.f60387b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<AccountListType> cls = AccountListType.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                bundle.putParcelable("account_list_type", this.f60386a);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                bundle.putSerializable("account_list_type", (Serializable) this.f60386a);
            }
            return bundle;
        }

        public int hashCode() {
            AccountListType accountListType = this.f60386a;
            if (accountListType == null) {
                return 0;
            }
            return accountListType.hashCode();
        }

        @C12579k
        public String toString() {
            AccountListType accountListType = this.f60386a;
            return "ActionHomePageFragmentToAccountList(accountListType=" + accountListType + ")";
        }

        public C24143a(@C12580l AccountListType accountListType) {
            this.f60386a = accountListType;
            this.f60387b = R.id.action_homePageFragment_to_accountList;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C24143a(AccountListType accountListType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : accountListType);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.home.f$b */
    public static final class C24144b implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final BasketBuilderType f60388a;

        /* renamed from: b */
        public final int f60389b = R.id.action_homePageFragment_to_basketBuilderFragment;

        public C24144b(@C12579k BasketBuilderType basketBuilderType) {
            Intrinsics.checkNotNullParameter(basketBuilderType, C25980u.f63504a);
            this.f60388a = basketBuilderType;
        }

        /* renamed from: c */
        public static /* synthetic */ C24144b m106291c(C24144b bVar, BasketBuilderType basketBuilderType, int i, Object obj) {
            if ((i & 1) != 0) {
                basketBuilderType = bVar.f60388a;
            }
            return bVar.mo70550b(basketBuilderType);
        }

        @C12579k
        /* renamed from: a */
        public final BasketBuilderType mo70549a() {
            return this.f60388a;
        }

        @C12579k
        /* renamed from: b */
        public final C24144b mo70550b(@C12579k BasketBuilderType basketBuilderType) {
            Intrinsics.checkNotNullParameter(basketBuilderType, C25980u.f63504a);
            return new C24144b(basketBuilderType);
        }

        @C12579k
        /* renamed from: d */
        public final BasketBuilderType mo70551d() {
            return this.f60388a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24144b) && this.f60388a == ((C24144b) obj).f60388a;
        }

        public int getActionId() {
            return this.f60389b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<BasketBuilderType> cls = BasketBuilderType.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                BasketBuilderType basketBuilderType = this.f60388a;
                Intrinsics.checkNotNull(basketBuilderType, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable(C25980u.f63504a, (Parcelable) basketBuilderType);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                BasketBuilderType basketBuilderType2 = this.f60388a;
                Intrinsics.checkNotNull(basketBuilderType2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable(C25980u.f63504a, basketBuilderType2);
            } else {
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            return bundle;
        }

        public int hashCode() {
            return this.f60388a.hashCode();
        }

        @C12579k
        public String toString() {
            BasketBuilderType basketBuilderType = this.f60388a;
            return "ActionHomePageFragmentToBasketBuilderFragment(basketBuilderType=" + basketBuilderType + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.home.f$c */
    public static final class C24145c implements C19693b0 {

        /* renamed from: a */
        public final boolean f60390a;

        /* renamed from: b */
        public final int f60391b;

        public C24145c() {
            this(false, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C24145c m106295c(C24145c cVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = cVar.f60390a;
            }
            return cVar.mo70556b(z);
        }

        /* renamed from: a */
        public final boolean mo70555a() {
            return this.f60390a;
        }

        @C12579k
        /* renamed from: b */
        public final C24145c mo70556b(boolean z) {
            return new C24145c(z);
        }

        /* renamed from: d */
        public final boolean mo70557d() {
            return this.f60390a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24145c) && this.f60390a == ((C24145c) obj).f60390a;
        }

        public int getActionId() {
            return this.f60391b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean(C28958a.f70992g, this.f60390a);
            return bundle;
        }

        public int hashCode() {
            boolean z = this.f60390a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @C12579k
        public String toString() {
            boolean z = this.f60390a;
            return "ActionHomePageFragmentToCatalogs(forceStoreIfExist=" + z + ")";
        }

        public C24145c(boolean z) {
            this.f60390a = z;
            this.f60391b = R.id.action_homePageFragment_to_catalogs;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C24145c(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.home.f$d */
    public static final class C24146d implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f60392a;
        @C12579k

        /* renamed from: b */
        public final String f60393b;

        /* renamed from: c */
        public final int f60394c = R.id.action_homePageFragment_to_challengeFidFragment;

        public C24146d(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "screenName");
            Intrinsics.checkNotNullParameter(str2, "screenTemplate");
            this.f60392a = str;
            this.f60393b = str2;
        }

        /* renamed from: d */
        public static /* synthetic */ C24146d m106299d(C24146d dVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dVar.f60392a;
            }
            if ((i & 2) != 0) {
                str2 = dVar.f60393b;
            }
            return dVar.mo70563c(str, str2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo70561a() {
            return this.f60392a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo70562b() {
            return this.f60393b;
        }

        @C12579k
        /* renamed from: c */
        public final C24146d mo70563c(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "screenName");
            Intrinsics.checkNotNullParameter(str2, "screenTemplate");
            return new C24146d(str, str2);
        }

        @C12579k
        /* renamed from: e */
        public final String mo70564e() {
            return this.f60392a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24146d)) {
                return false;
            }
            C24146d dVar = (C24146d) obj;
            return Intrinsics.areEqual((Object) this.f60392a, (Object) dVar.f60392a) && Intrinsics.areEqual((Object) this.f60393b, (Object) dVar.f60393b);
        }

        @C12579k
        /* renamed from: f */
        public final String mo70566f() {
            return this.f60393b;
        }

        public int getActionId() {
            return this.f60394c;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("screenName", this.f60392a);
            bundle.putString("screenTemplate", this.f60393b);
            return bundle;
        }

        public int hashCode() {
            return (this.f60392a.hashCode() * 31) + this.f60393b.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f60392a;
            String str2 = this.f60393b;
            return "ActionHomePageFragmentToChallengeFidFragment(screenName=" + str + ", screenTemplate=" + str2 + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.home.f$e */
    public static final class C24147e implements C19693b0 {

        /* renamed from: a */
        public final boolean f60395a;

        /* renamed from: b */
        public final int f60396b;

        public C24147e() {
            this(false, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C24147e m106305c(C24147e eVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = eVar.f60395a;
            }
            return eVar.mo70570b(z);
        }

        /* renamed from: a */
        public final boolean mo70569a() {
            return this.f60395a;
        }

        @C12579k
        /* renamed from: b */
        public final C24147e mo70570b(boolean z) {
            return new C24147e(z);
        }

        /* renamed from: d */
        public final boolean mo70571d() {
            return this.f60395a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24147e) && this.f60395a == ((C24147e) obj).f60395a;
        }

        public int getActionId() {
            return this.f60396b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("isInStoreOnly", this.f60395a);
            return bundle;
        }

        public int hashCode() {
            boolean z = this.f60395a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @C12579k
        public String toString() {
            boolean z = this.f60395a;
            return "ActionHomePageFragmentToCouponsFragment(isInStoreOnly=" + z + ")";
        }

        public C24147e(boolean z) {
            this.f60395a = z;
            this.f60396b = R.id.action_homePageFragment_to_couponsFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C24147e(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.home.f$f */
    public static final class C24148f implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f60397a;

        /* renamed from: b */
        public final int f60398b = R.id.action_homePageFragment_to_loyaltyAmountHistoryFragment;

        public C24148f(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "loyaltyBalance");
            this.f60397a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C24148f m106309c(C24148f fVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fVar.f60397a;
            }
            return fVar.mo70576b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo70575a() {
            return this.f60397a;
        }

        @C12579k
        /* renamed from: b */
        public final C24148f mo70576b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "loyaltyBalance");
            return new C24148f(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo70577d() {
            return this.f60397a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24148f) && Intrinsics.areEqual((Object) this.f60397a, (Object) ((C24148f) obj).f60397a);
        }

        public int getActionId() {
            return this.f60398b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("loyaltyBalance", this.f60397a);
            return bundle;
        }

        public int hashCode() {
            return this.f60397a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f60397a;
            return "ActionHomePageFragmentToLoyaltyAmountHistoryFragment(loyaltyBalance=" + str + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.home.f$g */
    public static final class C24149g implements C19693b0 {
        @C12580l

        /* renamed from: a */
        public final String f60399a;
        @C12580l

        /* renamed from: b */
        public final String f60400b;

        /* renamed from: c */
        public final int f60401c;

        public C24149g() {
            this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        }

        /* renamed from: d */
        public static /* synthetic */ C24149g m106313d(C24149g gVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gVar.f60399a;
            }
            if ((i & 2) != 0) {
                str2 = gVar.f60400b;
            }
            return gVar.mo70583c(str, str2);
        }

        @C12580l
        /* renamed from: a */
        public final String mo70581a() {
            return this.f60399a;
        }

        @C12580l
        /* renamed from: b */
        public final String mo70582b() {
            return this.f60400b;
        }

        @C12579k
        /* renamed from: c */
        public final C24149g mo70583c(@C12580l String str, @C12580l String str2) {
            return new C24149g(str, str2);
        }

        @C12580l
        /* renamed from: e */
        public final String mo70584e() {
            return this.f60400b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24149g)) {
                return false;
            }
            C24149g gVar = (C24149g) obj;
            return Intrinsics.areEqual((Object) this.f60399a, (Object) gVar.f60399a) && Intrinsics.areEqual((Object) this.f60400b, (Object) gVar.f60400b);
        }

        @C12580l
        /* renamed from: f */
        public final String mo70586f() {
            return this.f60399a;
        }

        public int getActionId() {
            return this.f60401c;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString(C28547h2.f69319g, this.f60399a);
            bundle.putString(C28547h2.f69320h, this.f60400b);
            return bundle;
        }

        public int hashCode() {
            String str = this.f60399a;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f60400b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        @C12579k
        public String toString() {
            String str = this.f60399a;
            String str2 = this.f60400b;
            return "ActionHomePageFragmentToScanBarCodeFragment(slotId=" + str + ", facilityServiceId=" + str2 + ")";
        }

        public C24149g(@C12580l String str, @C12580l String str2) {
            this.f60399a = str;
            this.f60400b = str2;
            this.f60401c = R.id.action_homePageFragment_to_scanBarCodeFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C24149g(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.home.f$h */
    public static final class C24150h implements C19693b0 {

        /* renamed from: a */
        public final boolean f60402a;

        /* renamed from: b */
        public final int f60403b;

        public C24150h() {
            this(false, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C24150h m106319c(C24150h hVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = hVar.f60402a;
            }
            return hVar.mo70590b(z);
        }

        /* renamed from: a */
        public final boolean mo70589a() {
            return this.f60402a;
        }

        @C12579k
        /* renamed from: b */
        public final C24150h mo70590b(boolean z) {
            return new C24150h(z);
        }

        /* renamed from: d */
        public final boolean mo70591d() {
            return this.f60402a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24150h) && this.f60402a == ((C24150h) obj).f60402a;
        }

        public int getActionId() {
            return this.f60403b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("should_animate_transition", this.f60402a);
            return bundle;
        }

        public int hashCode() {
            boolean z = this.f60402a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @C12579k
        public String toString() {
            boolean z = this.f60402a;
            return "ActionHomePageFragmentToSearchFragment(shouldAnimateTransition=" + z + ")";
        }

        public C24150h(boolean z) {
            this.f60402a = z;
            this.f60403b = R.id.action_homePageFragment_to_search_fragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C24150h(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.home.f$i */
    public static final class C24151i implements C19693b0 {

        /* renamed from: a */
        public final boolean f60404a;

        /* renamed from: b */
        public final int f60405b;

        public C24151i() {
            this(false, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C24151i m106323c(C24151i iVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = iVar.f60404a;
            }
            return iVar.mo70596b(z);
        }

        /* renamed from: a */
        public final boolean mo70595a() {
            return this.f60404a;
        }

        @C12579k
        /* renamed from: b */
        public final C24151i mo70596b(boolean z) {
            return new C24151i(z);
        }

        /* renamed from: d */
        public final boolean mo70597d() {
            return this.f60404a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24151i) && this.f60404a == ((C24151i) obj).f60404a;
        }

        public int getActionId() {
            return this.f60405b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean(C28958a.f70992g, this.f60404a);
            return bundle;
        }

        public int hashCode() {
            boolean z = this.f60404a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @C12579k
        public String toString() {
            boolean z = this.f60404a;
            return "ActionHomePageFragmentToStorePage(forceStoreIfExist=" + z + ")";
        }

        public C24151i(boolean z) {
            this.f60404a = z;
            this.f60405b = R.id.action_homePageFragment_to_storePage;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C24151i(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.home.f$j */
    public static final class C24152j implements C19693b0 {

        /* renamed from: a */
        public final boolean f60406a;
        @C12580l

        /* renamed from: b */
        public final SlotArgsHome f60407b;
        @C12580l

        /* renamed from: c */
        public final BasketSlot f60408c;
        @C12580l

        /* renamed from: d */
        public final String f60409d;

        /* renamed from: e */
        public final int f60410e;

        public C24152j() {
            this(false, (SlotArgsHome) null, (BasketSlot) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        /* renamed from: f */
        public static /* synthetic */ C24152j m106327f(C24152j jVar, boolean z, SlotArgsHome slotArgsHome, BasketSlot basketSlot, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = jVar.f60406a;
            }
            if ((i & 2) != 0) {
                slotArgsHome = jVar.f60407b;
            }
            if ((i & 4) != 0) {
                basketSlot = jVar.f60408c;
            }
            if ((i & 8) != 0) {
                str = jVar.f60409d;
            }
            return jVar.mo70605e(z, slotArgsHome, basketSlot, str);
        }

        /* renamed from: a */
        public final boolean mo70601a() {
            return this.f60406a;
        }

        @C12580l
        /* renamed from: b */
        public final SlotArgsHome mo70602b() {
            return this.f60407b;
        }

        @C12580l
        /* renamed from: c */
        public final BasketSlot mo70603c() {
            return this.f60408c;
        }

        @C12580l
        /* renamed from: d */
        public final String mo70604d() {
            return this.f60409d;
        }

        @C12579k
        /* renamed from: e */
        public final C24152j mo70605e(boolean z, @C12580l SlotArgsHome slotArgsHome, @C12580l BasketSlot basketSlot, @C12580l String str) {
            return new C24152j(z, slotArgsHome, basketSlot, str);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24152j)) {
                return false;
            }
            C24152j jVar = (C24152j) obj;
            return this.f60406a == jVar.f60406a && Intrinsics.areEqual((Object) this.f60407b, (Object) jVar.f60407b) && Intrinsics.areEqual((Object) this.f60408c, (Object) jVar.f60408c) && Intrinsics.areEqual((Object) this.f60409d, (Object) jVar.f60409d);
        }

        @C12580l
        /* renamed from: g */
        public final BasketSlot mo70607g() {
            return this.f60408c;
        }

        public int getActionId() {
            return this.f60410e;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_from_home_page", this.f60406a);
            Class<Parcelable> cls = Parcelable.class;
            Class<SlotArgsHome> cls2 = SlotArgsHome.class;
            Class<Serializable> cls3 = Serializable.class;
            if (cls.isAssignableFrom(cls2)) {
                bundle.putParcelable("home_args", this.f60407b);
            } else if (cls3.isAssignableFrom(cls2)) {
                bundle.putSerializable("home_args", (Serializable) this.f60407b);
            }
            Class<BasketSlot> cls4 = BasketSlot.class;
            if (cls.isAssignableFrom(cls4)) {
                bundle.putParcelable("basket_slot", this.f60408c);
            } else if (cls3.isAssignableFrom(cls4)) {
                bundle.putSerializable("basket_slot", (Serializable) this.f60408c);
            }
            bundle.putString("facility_store_id", this.f60409d);
            return bundle;
        }

        @C12580l
        /* renamed from: h */
        public final String mo70608h() {
            return this.f60409d;
        }

        public int hashCode() {
            boolean z = this.f60406a;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            SlotArgsHome slotArgsHome = this.f60407b;
            int i2 = 0;
            int hashCode = (i + (slotArgsHome == null ? 0 : slotArgsHome.hashCode())) * 31;
            BasketSlot basketSlot = this.f60408c;
            int hashCode2 = (hashCode + (basketSlot == null ? 0 : basketSlot.hashCode())) * 31;
            String str = this.f60409d;
            if (str != null) {
                i2 = str.hashCode();
            }
            return hashCode2 + i2;
        }

        @C12580l
        /* renamed from: i */
        public final SlotArgsHome mo70610i() {
            return this.f60407b;
        }

        /* renamed from: j */
        public final boolean mo70611j() {
            return this.f60406a;
        }

        @C12579k
        public String toString() {
            boolean z = this.f60406a;
            SlotArgsHome slotArgsHome = this.f60407b;
            BasketSlot basketSlot = this.f60408c;
            String str = this.f60409d;
            return "ActionHomeToSlot(isFromHomePage=" + z + ", homeArgs=" + slotArgsHome + ", basketSlot=" + basketSlot + ", facilityStoreId=" + str + ")";
        }

        public C24152j(boolean z, @C12580l SlotArgsHome slotArgsHome, @C12580l BasketSlot basketSlot, @C12580l String str) {
            this.f60406a = z;
            this.f60407b = slotArgsHome;
            this.f60408c = basketSlot;
            this.f60409d = str;
            this.f60410e = R.id.action_home_to_Slot;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C24152j(boolean z, SlotArgsHome slotArgsHome, BasketSlot basketSlot, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : slotArgsHome, (i & 4) != 0 ? null : basketSlot, (i & 8) != 0 ? null : str);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.home.f$k */
    public static final class C24153k {
        public /* synthetic */ C24153k(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: D */
        public static /* synthetic */ C19693b0 m106337D(C24153k kVar, String str, String str2, String str3, String str4, boolean z, boolean z2, int i, Object obj) {
            String str5 = null;
            String str6 = (i & 2) != 0 ? null : str2;
            String str7 = (i & 4) != 0 ? null : str3;
            if ((i & 8) == 0) {
                str5 = str4;
            }
            return kVar.mo70615C(str, str6, str7, str5, (i & 16) != 0 ? true : z, (i & 32) != 0 ? false : z2);
        }

        /* renamed from: c */
        public static /* synthetic */ C19693b0 m106338c(C24153k kVar, AccountListType accountListType, int i, Object obj) {
            if ((i & 1) != 0) {
                accountListType = null;
            }
            return kVar.mo70618b(accountListType);
        }

        /* renamed from: f */
        public static /* synthetic */ C19693b0 m106339f(C24153k kVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = true;
            }
            return kVar.mo70620e(z);
        }

        /* renamed from: i */
        public static /* synthetic */ C19693b0 m106340i(C24153k kVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return kVar.mo70622h(z);
        }

        /* renamed from: o */
        public static /* synthetic */ C19693b0 m106341o(C24153k kVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return kVar.mo70627n(str, str2);
        }

        /* renamed from: q */
        public static /* synthetic */ C19693b0 m106342q(C24153k kVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return kVar.mo70628p(z);
        }

        /* renamed from: s */
        public static /* synthetic */ C19693b0 m106343s(C24153k kVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return kVar.mo70629r(z);
        }

        /* renamed from: u */
        public static /* synthetic */ C19693b0 m106344u(C24153k kVar, boolean z, SlotArgsHome slotArgsHome, BasketSlot basketSlot, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                slotArgsHome = null;
            }
            if ((i & 4) != 0) {
                basketSlot = null;
            }
            if ((i & 8) != 0) {
                str = null;
            }
            return kVar.mo70630t(z, slotArgsHome, basketSlot, str);
        }

        /* renamed from: w */
        public static /* synthetic */ C19693b0 m106345w(C24153k kVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = R.id.homePageFragment;
            }
            return kVar.mo70631v(i);
        }

        /* renamed from: z */
        public static /* synthetic */ C19693b0 m106346z(C24153k kVar, String str, String str2, String str3, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            return kVar.mo70633y(str, str2, str3);
        }

        @C12579k
        /* renamed from: A */
        public final C19693b0 mo70613A() {
            return new C19690a(R.id.to_storeFragment);
        }

        @C12579k
        /* renamed from: B */
        public final C19693b0 mo70614B() {
            return new C19690a(R.id.to_subscribeToNewsNotification);
        }

        @C12579k
        /* renamed from: C */
        public final C19693b0 mo70615C(@C12579k String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "webviewUrl");
            return new C24156n(str, str2, str3, str4, z, z2);
        }

        @C12579k
        /* renamed from: E */
        public final C19693b0 mo70616E(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "orderId");
            return new C24157o(str);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo70617a() {
            return new C19690a(R.id.action_homePageFragment_to_account);
        }

        @C12579k
        /* renamed from: b */
        public final C19693b0 mo70618b(@C12580l AccountListType accountListType) {
            return new C24143a(accountListType);
        }

        @C12579k
        /* renamed from: d */
        public final C19693b0 mo70619d(@C12579k BasketBuilderType basketBuilderType) {
            Intrinsics.checkNotNullParameter(basketBuilderType, C25980u.f63504a);
            return new C24144b(basketBuilderType);
        }

        @C12579k
        /* renamed from: e */
        public final C19693b0 mo70620e(boolean z) {
            return new C24145c(z);
        }

        @C12579k
        /* renamed from: g */
        public final C19693b0 mo70621g(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "screenName");
            Intrinsics.checkNotNullParameter(str2, "screenTemplate");
            return new C24146d(str, str2);
        }

        @C12579k
        /* renamed from: h */
        public final C19693b0 mo70622h(boolean z) {
            return new C24147e(z);
        }

        @C12579k
        /* renamed from: j */
        public final C19693b0 mo70623j() {
            return new C19690a(R.id.action_homePageFragment_to_delivery_graph);
        }

        @C12579k
        /* renamed from: k */
        public final C19693b0 mo70624k() {
            return new C19690a(R.id.action_homePageFragment_to_driveMapPage);
        }

        @C12579k
        /* renamed from: l */
        public final C19693b0 mo70625l(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "loyaltyBalance");
            return new C24148f(str);
        }

        @C12579k
        /* renamed from: m */
        public final C19693b0 mo70626m() {
            return new C19690a(R.id.action_homePageFragment_to_loyaltyCardFragment);
        }

        @C12579k
        /* renamed from: n */
        public final C19693b0 mo70627n(@C12580l String str, @C12580l String str2) {
            return new C24149g(str, str2);
        }

        @C12579k
        /* renamed from: p */
        public final C19693b0 mo70628p(boolean z) {
            return new C24150h(z);
        }

        @C12579k
        /* renamed from: r */
        public final C19693b0 mo70629r(boolean z) {
            return new C24151i(z);
        }

        @C12579k
        /* renamed from: t */
        public final C19693b0 mo70630t(boolean z, @C12580l SlotArgsHome slotArgsHome, @C12580l BasketSlot basketSlot, @C12580l String str) {
            return new C24152j(z, slotArgsHome, basketSlot, str);
        }

        @C12579k
        /* renamed from: v */
        public final C19693b0 mo70631v(int i) {
            return new C24154l(i);
        }

        @C12579k
        /* renamed from: x */
        public final C19693b0 mo70632x() {
            return new C19690a(R.id.to_basketBuilder);
        }

        @C12579k
        /* renamed from: y */
        public final C19693b0 mo70633y(@C12579k String str, @C12580l String str2, @C12580l String str3) {
            Intrinsics.checkNotNullParameter(str, "webviewUrl");
            return new C24155m(str, str2, str3);
        }

        public C24153k() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.home.f$l */
    public static final class C24154l implements C19693b0 {

        /* renamed from: a */
        public final int f60411a;

        /* renamed from: b */
        public final int f60412b;

        public C24154l() {
            this(0, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C24154l m106368c(C24154l lVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = lVar.f60411a;
            }
            return lVar.mo70635b(i);
        }

        /* renamed from: a */
        public final int mo70634a() {
            return this.f60411a;
        }

        @C12579k
        /* renamed from: b */
        public final C24154l mo70635b(int i) {
            return new C24154l(i);
        }

        /* renamed from: d */
        public final int mo70636d() {
            return this.f60411a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24154l) && this.f60411a == ((C24154l) obj).f60411a;
        }

        public int getActionId() {
            return this.f60412b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putInt("sourceGraphId", this.f60411a);
            return bundle;
        }

        public int hashCode() {
            return Integer.hashCode(this.f60411a);
        }

        @C12579k
        public String toString() {
            int i = this.f60411a;
            return "ToAdditionalOrders(sourceGraphId=" + i + ")";
        }

        public C24154l(int i) {
            this.f60411a = i;
            this.f60412b = R.id.to_additional_orders;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C24154l(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? R.id.homePageFragment : i);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.home.f$o */
    public static final class C24157o implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f60424a;

        /* renamed from: b */
        public final int f60425b = R.id.to_withdrawalOrderDriveFragment;

        public C24157o(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "orderId");
            this.f60424a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C24157o m106394c(C24157o oVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = oVar.f60424a;
            }
            return oVar.mo70667b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo70666a() {
            return this.f60424a;
        }

        @C12579k
        /* renamed from: b */
        public final C24157o mo70667b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "orderId");
            return new C24157o(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo70668d() {
            return this.f60424a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24157o) && Intrinsics.areEqual((Object) this.f60424a, (Object) ((C24157o) obj).f60424a);
        }

        public int getActionId() {
            return this.f60425b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("order_id", this.f60424a);
            return bundle;
        }

        public int hashCode() {
            return this.f60424a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f60424a;
            return "ToWithdrawalOrderDriveFragment(orderId=" + str + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.home.f$m */
    public static final class C24155m implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f60413a;
        @C12580l

        /* renamed from: b */
        public final String f60414b;
        @C12580l

        /* renamed from: c */
        public final String f60415c;

        /* renamed from: d */
        public final int f60416d;

        public C24155m(@C12579k String str, @C12580l String str2, @C12580l String str3) {
            Intrinsics.checkNotNullParameter(str, "webviewUrl");
            this.f60413a = str;
            this.f60414b = str2;
            this.f60415c = str3;
            this.f60416d = R.id.to_catalog_webView;
        }

        /* renamed from: e */
        public static /* synthetic */ C24155m m106372e(C24155m mVar, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mVar.f60413a;
            }
            if ((i & 2) != 0) {
                str2 = mVar.f60414b;
            }
            if ((i & 4) != 0) {
                str3 = mVar.f60415c;
            }
            return mVar.mo70643d(str, str2, str3);
        }

        @C12579k
        /* renamed from: a */
        public final String mo70640a() {
            return this.f60413a;
        }

        @C12580l
        /* renamed from: b */
        public final String mo70641b() {
            return this.f60414b;
        }

        @C12580l
        /* renamed from: c */
        public final String mo70642c() {
            return this.f60415c;
        }

        @C12579k
        /* renamed from: d */
        public final C24155m mo70643d(@C12579k String str, @C12580l String str2, @C12580l String str3) {
            Intrinsics.checkNotNullParameter(str, "webviewUrl");
            return new C24155m(str, str2, str3);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24155m)) {
                return false;
            }
            C24155m mVar = (C24155m) obj;
            return Intrinsics.areEqual((Object) this.f60413a, (Object) mVar.f60413a) && Intrinsics.areEqual((Object) this.f60414b, (Object) mVar.f60414b) && Intrinsics.areEqual((Object) this.f60415c, (Object) mVar.f60415c);
        }

        @C12580l
        /* renamed from: f */
        public final String mo70645f() {
            return this.f60414b;
        }

        @C12580l
        /* renamed from: g */
        public final String mo70646g() {
            return this.f60415c;
        }

        public int getActionId() {
            return this.f60416d;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("webviewUrl", this.f60413a);
            bundle.putString("webViewHeaderKey", this.f60414b);
            bundle.putString("webViewHeaderValue", this.f60415c);
            return bundle;
        }

        @C12579k
        /* renamed from: h */
        public final String mo70647h() {
            return this.f60413a;
        }

        public int hashCode() {
            int hashCode = this.f60413a.hashCode() * 31;
            String str = this.f60414b;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f60415c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        @C12579k
        public String toString() {
            String str = this.f60413a;
            String str2 = this.f60414b;
            String str3 = this.f60415c;
            return "ToCatalogWebView(webviewUrl=" + str + ", webViewHeaderKey=" + str2 + ", webViewHeaderValue=" + str3 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C24155m(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.home.f$n */
    public static final class C24156n implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f60417a;
        @C12580l

        /* renamed from: b */
        public final String f60418b;
        @C12580l

        /* renamed from: c */
        public final String f60419c;
        @C12580l

        /* renamed from: d */
        public final String f60420d;

        /* renamed from: e */
        public final boolean f60421e;

        /* renamed from: f */
        public final boolean f60422f;

        /* renamed from: g */
        public final int f60423g;

        public C24156n(@C12579k String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "webviewUrl");
            this.f60417a = str;
            this.f60418b = str2;
            this.f60419c = str3;
            this.f60420d = str4;
            this.f60421e = z;
            this.f60422f = z2;
            this.f60423g = R.id.to_webView;
        }

        /* renamed from: h */
        public static /* synthetic */ C24156n m106380h(C24156n nVar, String str, String str2, String str3, String str4, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = nVar.f60417a;
            }
            if ((i & 2) != 0) {
                str2 = nVar.f60418b;
            }
            String str5 = str2;
            if ((i & 4) != 0) {
                str3 = nVar.f60419c;
            }
            String str6 = str3;
            if ((i & 8) != 0) {
                str4 = nVar.f60420d;
            }
            String str7 = str4;
            if ((i & 16) != 0) {
                z = nVar.f60421e;
            }
            boolean z3 = z;
            if ((i & 32) != 0) {
                z2 = nVar.f60422f;
            }
            return nVar.mo70657g(str, str5, str6, str7, z3, z2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo70650a() {
            return this.f60417a;
        }

        @C12580l
        /* renamed from: b */
        public final String mo70651b() {
            return this.f60418b;
        }

        @C12580l
        /* renamed from: c */
        public final String mo70652c() {
            return this.f60419c;
        }

        @C12580l
        /* renamed from: d */
        public final String mo70653d() {
            return this.f60420d;
        }

        /* renamed from: e */
        public final boolean mo70654e() {
            return this.f60421e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24156n)) {
                return false;
            }
            C24156n nVar = (C24156n) obj;
            return Intrinsics.areEqual((Object) this.f60417a, (Object) nVar.f60417a) && Intrinsics.areEqual((Object) this.f60418b, (Object) nVar.f60418b) && Intrinsics.areEqual((Object) this.f60419c, (Object) nVar.f60419c) && Intrinsics.areEqual((Object) this.f60420d, (Object) nVar.f60420d) && this.f60421e == nVar.f60421e && this.f60422f == nVar.f60422f;
        }

        /* renamed from: f */
        public final boolean mo70656f() {
            return this.f60422f;
        }

        @C12579k
        /* renamed from: g */
        public final C24156n mo70657g(@C12579k String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "webviewUrl");
            return new C24156n(str, str2, str3, str4, z, z2);
        }

        public int getActionId() {
            return this.f60423g;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("webviewUrl", this.f60417a);
            bundle.putString("webViewTitle", this.f60418b);
            bundle.putString("webViewHeaderKey", this.f60419c);
            bundle.putString("webViewHeaderValue", this.f60420d);
            bundle.putBoolean("showToolBar", this.f60421e);
            bundle.putBoolean("shouldInterceptDeeplink", this.f60422f);
            return bundle;
        }

        public int hashCode() {
            int hashCode = this.f60417a.hashCode() * 31;
            String str = this.f60418b;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f60419c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f60420d;
            if (str3 != null) {
                i = str3.hashCode();
            }
            int i2 = (hashCode3 + i) * 31;
            boolean z = this.f60421e;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i3 = (i2 + (z ? 1 : 0)) * 31;
            boolean z3 = this.f60422f;
            if (!z3) {
                z2 = z3;
            }
            return i3 + (z2 ? 1 : 0);
        }

        /* renamed from: i */
        public final boolean mo70659i() {
            return this.f60422f;
        }

        /* renamed from: j */
        public final boolean mo70660j() {
            return this.f60421e;
        }

        @C12580l
        /* renamed from: k */
        public final String mo70661k() {
            return this.f60419c;
        }

        @C12580l
        /* renamed from: l */
        public final String mo70662l() {
            return this.f60420d;
        }

        @C12580l
        /* renamed from: m */
        public final String mo70663m() {
            return this.f60418b;
        }

        @C12579k
        /* renamed from: n */
        public final String mo70664n() {
            return this.f60417a;
        }

        @C12579k
        public String toString() {
            String str = this.f60417a;
            String str2 = this.f60418b;
            String str3 = this.f60419c;
            String str4 = this.f60420d;
            boolean z = this.f60421e;
            boolean z2 = this.f60422f;
            return "ToWebView(webviewUrl=" + str + ", webViewTitle=" + str2 + ", webViewHeaderKey=" + str3 + ", webViewHeaderValue=" + str4 + ", showToolBar=" + z + ", shouldInterceptDeeplink=" + z2 + ")";
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C24156n(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, boolean r10, boolean r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            /*
                r5 = this;
                r0 = r12 & 2
                r1 = 0
                if (r0 == 0) goto L_0x0007
                r0 = r1
                goto L_0x0008
            L_0x0007:
                r0 = r7
            L_0x0008:
                r2 = r12 & 4
                if (r2 == 0) goto L_0x000e
                r2 = r1
                goto L_0x000f
            L_0x000e:
                r2 = r8
            L_0x000f:
                r3 = r12 & 8
                if (r3 == 0) goto L_0x0014
                goto L_0x0015
            L_0x0014:
                r1 = r9
            L_0x0015:
                r3 = r12 & 16
                if (r3 == 0) goto L_0x001b
                r3 = 1
                goto L_0x001c
            L_0x001b:
                r3 = r10
            L_0x001c:
                r4 = r12 & 32
                if (r4 == 0) goto L_0x0022
                r4 = 0
                goto L_0x0023
            L_0x0022:
                r4 = r11
            L_0x0023:
                r7 = r5
                r8 = r6
                r9 = r0
                r10 = r2
                r11 = r1
                r12 = r3
                r13 = r4
                r7.<init>(r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.home.C24142f.C24156n.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
