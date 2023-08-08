package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.presentation.models.DQEAddressModel;
import com.urbanairship.util.C9650g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.c */
public interface C24396c {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.c$a */
    public static final class C24397a implements C24396c {

        /* renamed from: b */
        public static final int f60859b = 0;

        /* renamed from: a */
        public final boolean f60860a;

        public C24397a(boolean z) {
            this.f60860a = z;
        }

        /* renamed from: c */
        public static /* synthetic */ C24397a m107093c(C24397a aVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.f60860a;
            }
            return aVar.mo71333b(z);
        }

        /* renamed from: a */
        public final boolean mo71332a() {
            return this.f60860a;
        }

        @C12579k
        /* renamed from: b */
        public final C24397a mo71333b(boolean z) {
            return new C24397a(z);
        }

        /* renamed from: d */
        public final boolean mo71334d() {
            return this.f60860a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24397a) && this.f60860a == ((C24397a) obj).f60860a;
        }

        public int hashCode() {
            boolean z = this.f60860a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @C12579k
        public String toString() {
            boolean z = this.f60860a;
            return "OnAddressSwitchChecked(isSwitchChecked=" + z + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.c$b */
    public static final class C24398b implements C24396c {

        /* renamed from: b */
        public static final int f60861b = 0;
        @C12579k

        /* renamed from: a */
        public final String f60862a;

        public C24398b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "address");
            this.f60862a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C24398b m107097c(C24398b bVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f60862a;
            }
            return bVar.mo71339b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo71338a() {
            return this.f60862a;
        }

        @C12579k
        /* renamed from: b */
        public final C24398b mo71339b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "address");
            return new C24398b(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo71340d() {
            return this.f60862a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24398b) && Intrinsics.areEqual((Object) this.f60862a, (Object) ((C24398b) obj).f60862a);
        }

        public int hashCode() {
            return this.f60862a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f60862a;
            return "OnAddressValueChanged(address=" + str + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.c$c */
    public static final class C24399c implements C24396c {

        /* renamed from: b */
        public static final int f60863b = 0;
        @C12579k

        /* renamed from: a */
        public final String f60864a;

        public C24399c(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, C9650g.f26444g);
            this.f60864a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C24399c m107101c(C24399c cVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.f60864a;
            }
            return cVar.mo71345b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo71344a() {
            return this.f60864a;
        }

        @C12579k
        /* renamed from: b */
        public final C24399c mo71345b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, C9650g.f26444g);
            return new C24399c(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo71346d() {
            return this.f60864a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24399c) && Intrinsics.areEqual((Object) this.f60864a, (Object) ((C24399c) obj).f60864a);
        }

        public int hashCode() {
            return this.f60864a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f60864a;
            return "OnCityValueChanged(city=" + str + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.c$d */
    public static final class C24400d implements C24396c {

        /* renamed from: b */
        public static final int f60865b = 0;
        @C12579k

        /* renamed from: a */
        public final String f60866a;

        public C24400d(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "country");
            this.f60866a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C24400d m107105c(C24400d dVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dVar.f60866a;
            }
            return dVar.mo71351b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo71350a() {
            return this.f60866a;
        }

        @C12579k
        /* renamed from: b */
        public final C24400d mo71351b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "country");
            return new C24400d(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo71352d() {
            return this.f60866a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24400d) && Intrinsics.areEqual((Object) this.f60866a, (Object) ((C24400d) obj).f60866a);
        }

        public int hashCode() {
            return this.f60866a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f60866a;
            return "OnCountryValueChanged(country=" + str + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.c$e */
    public static final class C24401e implements C24396c {

        /* renamed from: b */
        public static final int f60867b = 0;
        @C12579k

        /* renamed from: a */
        public final String f60868a;

        public C24401e(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "postCode");
            this.f60868a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C24401e m107109c(C24401e eVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = eVar.f60868a;
            }
            return eVar.mo71357b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo71356a() {
            return this.f60868a;
        }

        @C12579k
        /* renamed from: b */
        public final C24401e mo71357b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "postCode");
            return new C24401e(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo71358d() {
            return this.f60868a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24401e) && Intrinsics.areEqual((Object) this.f60868a, (Object) ((C24401e) obj).f60868a);
        }

        public int hashCode() {
            return this.f60868a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f60868a;
            return "OnPostCodeValueChanged(postCode=" + str + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.c$f */
    public static final class C24402f implements C24396c {

        /* renamed from: b */
        public static final int f60869b = DQEAddressModel.f32706v;
        @C12579k

        /* renamed from: a */
        public final DQEAddressModel f60870a;

        public C24402f(@C12579k DQEAddressModel dQEAddressModel) {
            Intrinsics.checkNotNullParameter(dQEAddressModel, "addressSuggested");
            this.f60870a = dQEAddressModel;
        }

        /* renamed from: c */
        public static /* synthetic */ C24402f m107113c(C24402f fVar, DQEAddressModel dQEAddressModel, int i, Object obj) {
            if ((i & 1) != 0) {
                dQEAddressModel = fVar.f60870a;
            }
            return fVar.mo71363b(dQEAddressModel);
        }

        @C12579k
        /* renamed from: a */
        public final DQEAddressModel mo71362a() {
            return this.f60870a;
        }

        @C12579k
        /* renamed from: b */
        public final C24402f mo71363b(@C12579k DQEAddressModel dQEAddressModel) {
            Intrinsics.checkNotNullParameter(dQEAddressModel, "addressSuggested");
            return new C24402f(dQEAddressModel);
        }

        @C12579k
        /* renamed from: d */
        public final DQEAddressModel mo71364d() {
            return this.f60870a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24402f) && Intrinsics.areEqual((Object) this.f60870a, (Object) ((C24402f) obj).f60870a);
        }

        public int hashCode() {
            return this.f60870a.hashCode();
        }

        @C12579k
        public String toString() {
            DQEAddressModel dQEAddressModel = this.f60870a;
            return "OnSuggestedAddressItemClicked(addressSuggested=" + dQEAddressModel + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.c$g */
    public static final class C24403g implements C24396c {

        /* renamed from: c */
        public static final int f60871c = 8;
        @C12579k

        /* renamed from: a */
        public final String f60872a;
        @C12579k

        /* renamed from: b */
        public final C24390b f60873b;

        public C24403g(@C12579k String str, @C12579k C24390b bVar) {
            Intrinsics.checkNotNullParameter(str, "key");
            Intrinsics.checkNotNullParameter(bVar, "value");
            this.f60872a = str;
            this.f60873b = bVar;
        }

        /* renamed from: d */
        public static /* synthetic */ C24403g m107117d(C24403g gVar, String str, C24390b bVar, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gVar.f60872a;
            }
            if ((i & 2) != 0) {
                bVar = gVar.f60873b;
            }
            return gVar.mo71370c(str, bVar);
        }

        @C12579k
        /* renamed from: a */
        public final String mo71368a() {
            return this.f60872a;
        }

        @C12579k
        /* renamed from: b */
        public final C24390b mo71369b() {
            return this.f60873b;
        }

        @C12579k
        /* renamed from: c */
        public final C24403g mo71370c(@C12579k String str, @C12579k C24390b bVar) {
            Intrinsics.checkNotNullParameter(str, "key");
            Intrinsics.checkNotNullParameter(bVar, "value");
            return new C24403g(str, bVar);
        }

        @C12579k
        /* renamed from: e */
        public final String mo71371e() {
            return this.f60872a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24403g)) {
                return false;
            }
            C24403g gVar = (C24403g) obj;
            return Intrinsics.areEqual((Object) this.f60872a, (Object) gVar.f60872a) && Intrinsics.areEqual((Object) this.f60873b, (Object) gVar.f60873b);
        }

        @C12579k
        /* renamed from: f */
        public final C24390b mo71373f() {
            return this.f60873b;
        }

        public int hashCode() {
            return (this.f60872a.hashCode() * 31) + this.f60873b.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f60872a;
            C24390b bVar = this.f60873b;
            return "OnTextFieldStateChanged(key=" + str + ", value=" + bVar + ")";
        }
    }
}
