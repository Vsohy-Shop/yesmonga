package com.carrefour.fid.android.presentation.p035ui.physicalstore;

import android.os.Bundle;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19690a;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.storelocator.configurations.C28958a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.b */
public final class C25331b {
    @C12579k

    /* renamed from: a */
    public static final C25337f f62389a = new C25337f((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f62390b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.b$a */
    public static final class C25332a implements C19693b0 {

        /* renamed from: a */
        public final boolean f62391a;

        /* renamed from: b */
        public final int f62392b;

        public C25332a() {
            this(false, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C25332a m109481c(C25332a aVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.f62391a;
            }
            return aVar.mo73855b(z);
        }

        /* renamed from: a */
        public final boolean mo73854a() {
            return this.f62391a;
        }

        @C12579k
        /* renamed from: b */
        public final C25332a mo73855b(boolean z) {
            return new C25332a(z);
        }

        /* renamed from: d */
        public final boolean mo73856d() {
            return this.f62391a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C25332a) && this.f62391a == ((C25332a) obj).f62391a;
        }

        public int getActionId() {
            return this.f62392b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean(C28958a.f70992g, this.f62391a);
            return bundle;
        }

        public int hashCode() {
            boolean z = this.f62391a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @C12579k
        public String toString() {
            boolean z = this.f62391a;
            return "ActionHomePageFragmentToCatalogs(forceStoreIfExist=" + z + ")";
        }

        public C25332a(boolean z) {
            this.f62391a = z;
            this.f62392b = R.id.action_homePageFragment_to_catalogs;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C25332a(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.b$b */
    public static final class C25333b implements C19693b0 {

        /* renamed from: a */
        public final boolean f62393a;

        /* renamed from: b */
        public final int f62394b;

        public C25333b() {
            this(false, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C25333b m109485c(C25333b bVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = bVar.f62393a;
            }
            return bVar.mo73861b(z);
        }

        /* renamed from: a */
        public final boolean mo73860a() {
            return this.f62393a;
        }

        @C12579k
        /* renamed from: b */
        public final C25333b mo73861b(boolean z) {
            return new C25333b(z);
        }

        /* renamed from: d */
        public final boolean mo73862d() {
            return this.f62393a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C25333b) && this.f62393a == ((C25333b) obj).f62393a;
        }

        public int getActionId() {
            return this.f62394b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean(C28958a.f70992g, this.f62393a);
            return bundle;
        }

        public int hashCode() {
            boolean z = this.f62393a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @C12579k
        public String toString() {
            boolean z = this.f62393a;
            return "ActionHomePageFragmentToStorePage(forceStoreIfExist=" + z + ")";
        }

        public C25333b(boolean z) {
            this.f62393a = z;
            this.f62394b = R.id.action_homePageFragment_to_storePage;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C25333b(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.b$c */
    public static final class C25334c implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f62395a;
        @C12579k

        /* renamed from: b */
        public final String f62396b;

        /* renamed from: c */
        public final int f62397c = R.id.action_physical_store_fragment_to_challengeFidFragment;

        public C25334c(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "screenName");
            Intrinsics.checkNotNullParameter(str2, "screenTemplate");
            this.f62395a = str;
            this.f62396b = str2;
        }

        /* renamed from: d */
        public static /* synthetic */ C25334c m109489d(C25334c cVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.f62395a;
            }
            if ((i & 2) != 0) {
                str2 = cVar.f62396b;
            }
            return cVar.mo73868c(str, str2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo73866a() {
            return this.f62395a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo73867b() {
            return this.f62396b;
        }

        @C12579k
        /* renamed from: c */
        public final C25334c mo73868c(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "screenName");
            Intrinsics.checkNotNullParameter(str2, "screenTemplate");
            return new C25334c(str, str2);
        }

        @C12579k
        /* renamed from: e */
        public final String mo73869e() {
            return this.f62395a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25334c)) {
                return false;
            }
            C25334c cVar = (C25334c) obj;
            return Intrinsics.areEqual((Object) this.f62395a, (Object) cVar.f62395a) && Intrinsics.areEqual((Object) this.f62396b, (Object) cVar.f62396b);
        }

        @C12579k
        /* renamed from: f */
        public final String mo73871f() {
            return this.f62396b;
        }

        public int getActionId() {
            return this.f62397c;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("screenName", this.f62395a);
            bundle.putString("screenTemplate", this.f62396b);
            return bundle;
        }

        public int hashCode() {
            return (this.f62395a.hashCode() * 31) + this.f62396b.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f62395a;
            String str2 = this.f62396b;
            return "ActionPhysicalStoreFragmentToChallengeFidFragment(screenName=" + str + ", screenTemplate=" + str2 + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.b$d */
    public static final class C25335d implements C19693b0 {

        /* renamed from: a */
        public final boolean f62398a;

        /* renamed from: b */
        public final int f62399b;

        public C25335d() {
            this(false, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C25335d m109495c(C25335d dVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = dVar.f62398a;
            }
            return dVar.mo73875b(z);
        }

        /* renamed from: a */
        public final boolean mo73874a() {
            return this.f62398a;
        }

        @C12579k
        /* renamed from: b */
        public final C25335d mo73875b(boolean z) {
            return new C25335d(z);
        }

        /* renamed from: d */
        public final boolean mo73876d() {
            return this.f62398a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C25335d) && this.f62398a == ((C25335d) obj).f62398a;
        }

        public int getActionId() {
            return this.f62399b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("isInStoreOnly", this.f62398a);
            return bundle;
        }

        public int hashCode() {
            boolean z = this.f62398a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @C12579k
        public String toString() {
            boolean z = this.f62398a;
            return "ActionPhysicalStoreFragmentToCouponsFragment(isInStoreOnly=" + z + ")";
        }

        public C25335d(boolean z) {
            this.f62398a = z;
            this.f62399b = R.id.action_physical_store_fragment_to_couponsFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C25335d(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.b$e */
    public static final class C25336e implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f62400a;

        /* renamed from: b */
        public final int f62401b = R.id.action_physical_store_fragment_to_loyaltyAmountHistoryFragment;

        public C25336e(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "loyaltyBalance");
            this.f62400a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C25336e m109499c(C25336e eVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = eVar.f62400a;
            }
            return eVar.mo73881b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo73880a() {
            return this.f62400a;
        }

        @C12579k
        /* renamed from: b */
        public final C25336e mo73881b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "loyaltyBalance");
            return new C25336e(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo73882d() {
            return this.f62400a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C25336e) && Intrinsics.areEqual((Object) this.f62400a, (Object) ((C25336e) obj).f62400a);
        }

        public int getActionId() {
            return this.f62401b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("loyaltyBalance", this.f62400a);
            return bundle;
        }

        public int hashCode() {
            return this.f62400a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f62400a;
            return "ActionPhysicalStoreFragmentToLoyaltyAmountHistoryFragment(loyaltyBalance=" + str + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.b$f */
    public static final class C25337f {
        public /* synthetic */ C25337f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19693b0 m109503b(C25337f fVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = true;
            }
            return fVar.mo73886a(z);
        }

        /* renamed from: d */
        public static /* synthetic */ C19693b0 m109504d(C25337f fVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return fVar.mo73887c(z);
        }

        /* renamed from: g */
        public static /* synthetic */ C19693b0 m109505g(C25337f fVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return fVar.mo73889f(z);
        }

        /* renamed from: k */
        public static /* synthetic */ C19693b0 m109506k(C25337f fVar, String str, String str2, String str3, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            return fVar.mo73892j(str, str2, str3);
        }

        /* renamed from: m */
        public static /* synthetic */ C19693b0 m109507m(C25337f fVar, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                str4 = null;
            }
            return fVar.mo73893l(str, str2, str3, str4);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo73886a(boolean z) {
            return new C25332a(z);
        }

        @C12579k
        /* renamed from: c */
        public final C19693b0 mo73887c(boolean z) {
            return new C25333b(z);
        }

        @C12579k
        /* renamed from: e */
        public final C19693b0 mo73888e(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "screenName");
            Intrinsics.checkNotNullParameter(str2, "screenTemplate");
            return new C25334c(str, str2);
        }

        @C12579k
        /* renamed from: f */
        public final C19693b0 mo73889f(boolean z) {
            return new C25335d(z);
        }

        @C12579k
        /* renamed from: h */
        public final C19693b0 mo73890h(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "loyaltyBalance");
            return new C25336e(str);
        }

        @C12579k
        /* renamed from: i */
        public final C19693b0 mo73891i() {
            return new C19690a(R.id.action_physical_store_fragment_to_loyaltyCardFragment);
        }

        @C12579k
        /* renamed from: j */
        public final C19693b0 mo73892j(@C12579k String str, @C12580l String str2, @C12580l String str3) {
            Intrinsics.checkNotNullParameter(str, "webviewUrl");
            return new C25338g(str, str2, str3);
        }

        @C12579k
        /* renamed from: l */
        public final C19693b0 mo73893l(@C12579k String str, @C12580l String str2, @C12580l String str3, @C12580l String str4) {
            Intrinsics.checkNotNullParameter(str, "webviewUrl");
            return new C25339h(str, str2, str3, str4);
        }

        public C25337f() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.b$g */
    public static final class C25338g implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f62402a;
        @C12580l

        /* renamed from: b */
        public final String f62403b;
        @C12580l

        /* renamed from: c */
        public final String f62404c;

        /* renamed from: d */
        public final int f62405d;

        public C25338g(@C12579k String str, @C12580l String str2, @C12580l String str3) {
            Intrinsics.checkNotNullParameter(str, "webviewUrl");
            this.f62402a = str;
            this.f62403b = str2;
            this.f62404c = str3;
            this.f62405d = R.id.to_catalog_webView;
        }

        /* renamed from: e */
        public static /* synthetic */ C25338g m109516e(C25338g gVar, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gVar.f62402a;
            }
            if ((i & 2) != 0) {
                str2 = gVar.f62403b;
            }
            if ((i & 4) != 0) {
                str3 = gVar.f62404c;
            }
            return gVar.mo73897d(str, str2, str3);
        }

        @C12579k
        /* renamed from: a */
        public final String mo73894a() {
            return this.f62402a;
        }

        @C12580l
        /* renamed from: b */
        public final String mo73895b() {
            return this.f62403b;
        }

        @C12580l
        /* renamed from: c */
        public final String mo73896c() {
            return this.f62404c;
        }

        @C12579k
        /* renamed from: d */
        public final C25338g mo73897d(@C12579k String str, @C12580l String str2, @C12580l String str3) {
            Intrinsics.checkNotNullParameter(str, "webviewUrl");
            return new C25338g(str, str2, str3);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25338g)) {
                return false;
            }
            C25338g gVar = (C25338g) obj;
            return Intrinsics.areEqual((Object) this.f62402a, (Object) gVar.f62402a) && Intrinsics.areEqual((Object) this.f62403b, (Object) gVar.f62403b) && Intrinsics.areEqual((Object) this.f62404c, (Object) gVar.f62404c);
        }

        @C12580l
        /* renamed from: f */
        public final String mo73899f() {
            return this.f62403b;
        }

        @C12580l
        /* renamed from: g */
        public final String mo73900g() {
            return this.f62404c;
        }

        public int getActionId() {
            return this.f62405d;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("webviewUrl", this.f62402a);
            bundle.putString("webViewHeaderKey", this.f62403b);
            bundle.putString("webViewHeaderValue", this.f62404c);
            return bundle;
        }

        @C12579k
        /* renamed from: h */
        public final String mo73901h() {
            return this.f62402a;
        }

        public int hashCode() {
            int hashCode = this.f62402a.hashCode() * 31;
            String str = this.f62403b;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f62404c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        @C12579k
        public String toString() {
            String str = this.f62402a;
            String str2 = this.f62403b;
            String str3 = this.f62404c;
            return "ToCatalogWebView(webviewUrl=" + str + ", webViewHeaderKey=" + str2 + ", webViewHeaderValue=" + str3 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C25338g(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.b$h */
    public static final class C25339h implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f62406a;
        @C12580l

        /* renamed from: b */
        public final String f62407b;
        @C12580l

        /* renamed from: c */
        public final String f62408c;
        @C12580l

        /* renamed from: d */
        public final String f62409d;

        /* renamed from: e */
        public final int f62410e;

        public C25339h(@C12579k String str, @C12580l String str2, @C12580l String str3, @C12580l String str4) {
            Intrinsics.checkNotNullParameter(str, "webviewUrl");
            this.f62406a = str;
            this.f62407b = str2;
            this.f62408c = str3;
            this.f62409d = str4;
            this.f62410e = R.id.to_webView;
        }

        /* renamed from: f */
        public static /* synthetic */ C25339h m109524f(C25339h hVar, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = hVar.f62406a;
            }
            if ((i & 2) != 0) {
                str2 = hVar.f62407b;
            }
            if ((i & 4) != 0) {
                str3 = hVar.f62408c;
            }
            if ((i & 8) != 0) {
                str4 = hVar.f62409d;
            }
            return hVar.mo73908e(str, str2, str3, str4);
        }

        @C12579k
        /* renamed from: a */
        public final String mo73904a() {
            return this.f62406a;
        }

        @C12580l
        /* renamed from: b */
        public final String mo73905b() {
            return this.f62407b;
        }

        @C12580l
        /* renamed from: c */
        public final String mo73906c() {
            return this.f62408c;
        }

        @C12580l
        /* renamed from: d */
        public final String mo73907d() {
            return this.f62409d;
        }

        @C12579k
        /* renamed from: e */
        public final C25339h mo73908e(@C12579k String str, @C12580l String str2, @C12580l String str3, @C12580l String str4) {
            Intrinsics.checkNotNullParameter(str, "webviewUrl");
            return new C25339h(str, str2, str3, str4);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25339h)) {
                return false;
            }
            C25339h hVar = (C25339h) obj;
            return Intrinsics.areEqual((Object) this.f62406a, (Object) hVar.f62406a) && Intrinsics.areEqual((Object) this.f62407b, (Object) hVar.f62407b) && Intrinsics.areEqual((Object) this.f62408c, (Object) hVar.f62408c) && Intrinsics.areEqual((Object) this.f62409d, (Object) hVar.f62409d);
        }

        @C12580l
        /* renamed from: g */
        public final String mo73910g() {
            return this.f62408c;
        }

        public int getActionId() {
            return this.f62410e;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("webviewUrl", this.f62406a);
            bundle.putString("webViewTitle", this.f62407b);
            bundle.putString("webViewHeaderKey", this.f62408c);
            bundle.putString("webViewHeaderValue", this.f62409d);
            return bundle;
        }

        @C12580l
        /* renamed from: h */
        public final String mo73911h() {
            return this.f62409d;
        }

        public int hashCode() {
            int hashCode = this.f62406a.hashCode() * 31;
            String str = this.f62407b;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f62408c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f62409d;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode3 + i;
        }

        @C12580l
        /* renamed from: i */
        public final String mo73913i() {
            return this.f62407b;
        }

        @C12579k
        /* renamed from: j */
        public final String mo73914j() {
            return this.f62406a;
        }

        @C12579k
        public String toString() {
            String str = this.f62406a;
            String str2 = this.f62407b;
            String str3 = this.f62408c;
            String str4 = this.f62409d;
            return "ToWebView(webviewUrl=" + str + ", webViewTitle=" + str2 + ", webViewHeaderKey=" + str3 + ", webViewHeaderValue=" + str4 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C25339h(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
        }
    }
}
