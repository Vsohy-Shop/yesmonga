package com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.catalog.Catalog;
import com.carrefour.fid.android.shared.base.C28505u;
import java.util.List;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.e */
public final class C39692e {

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.e$a */
    public interface C39693a extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.e$a$a */
        public static final class C39694a implements C39693a {
            @C12579k

            /* renamed from: a */
            public static final C39694a f101324a = new C39694a();

            /* renamed from: b */
            public static final int f101325b = 0;
        }
    }

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.e$b */
    public interface C39695b extends C28505u.C28509d {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.e$b$a */
        public static final class C39696a implements C39695b {

            /* renamed from: c */
            public static final int f101326c = 8;
            @C12580l

            /* renamed from: b */
            public final List<Catalog> f101327b;

            public C39696a() {
                this((List) null, 1, (DefaultConstructorMarker) null);
            }

            /* renamed from: g */
            public static /* synthetic */ C39696a m162142g(C39696a aVar, List<Catalog> list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = aVar.f101327b;
                }
                return aVar.mo131000f(list);
            }

            @C12580l
            /* renamed from: e */
            public final List<Catalog> mo130998e() {
                return this.f101327b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C39696a) && Intrinsics.areEqual((Object) this.f101327b, (Object) ((C39696a) obj).f101327b);
            }

            @C12579k
            /* renamed from: f */
            public final C39696a mo131000f(@C12580l List<Catalog> list) {
                return new C39696a(list);
            }

            @C12580l
            /* renamed from: h */
            public final List<Catalog> mo131001h() {
                return this.f101327b;
            }

            public int hashCode() {
                List<Catalog> list = this.f101327b;
                if (list == null) {
                    return 0;
                }
                return list.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C39697b.m162146a(this);
            }

            @C12579k
            public String toString() {
                List<Catalog> list = this.f101327b;
                return "CatalogsContentPage(catalogList=" + list + ")";
            }

            public C39696a(@C12580l List<Catalog> list) {
                this.f101327b = list;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C39696a(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : list);
            }
        }

        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.e$b$b */
        public static final class C39697b {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m162146a(@C12579k C39695b bVar) {
                return C28505u.C28509d.C28510a.m118428a(bVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.e$b$c */
        public static final class C39698c implements C39695b {
            @C12579k

            /* renamed from: b */
            public static final C39698c f101328b = new C39698c();

            /* renamed from: c */
            public static final int f101329c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C39697b.m162146a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.e$b$d */
        public static final class C39699d implements C39695b {

            /* renamed from: c */
            public static final int f101330c = 0;

            /* renamed from: b */
            public final boolean f101331b;

            public C39699d() {
                this(false, 1, (DefaultConstructorMarker) null);
            }

            /* renamed from: g */
            public static /* synthetic */ C39699d m162147g(C39699d dVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = dVar.f101331b;
                }
                return dVar.mo131006f(z);
            }

            /* renamed from: e */
            public final boolean mo131004e() {
                return this.f101331b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C39699d) && this.f101331b == ((C39699d) obj).f101331b;
            }

            @C12579k
            /* renamed from: f */
            public final C39699d mo131006f(boolean z) {
                return new C39699d(z);
            }

            public int hashCode() {
                boolean z = this.f101331b;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            public final boolean isLoading() {
                return this.f101331b;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C39697b.m162146a(this);
            }

            @C12579k
            public String toString() {
                boolean z = this.f101331b;
                return "Loading(isLoading=" + z + ")";
            }

            public C39699d(boolean z) {
                this.f101331b = z;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C39699d(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? true : z);
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.e$c */
    public interface C39700c extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.e$c$a */
        public static final class C39701a implements C39700c {
            @C12579k

            /* renamed from: a */
            public static final C39701a f101332a = new C39701a();

            /* renamed from: b */
            public static final int f101333b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.e$c$b */
        public static final class C39702b implements C39700c {

            /* renamed from: b */
            public static final int f101334b = 0;
            @C12579k

            /* renamed from: a */
            public final String f101335a;

            public C39702b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "storeId");
                this.f101335a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C39702b m162150c(C39702b bVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bVar.f101335a;
                }
                return bVar.mo131011b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo131010a() {
                return this.f101335a;
            }

            @C12579k
            /* renamed from: b */
            public final C39702b mo131011b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "storeId");
                return new C39702b(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo131012d() {
                return this.f101335a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C39702b) && Intrinsics.areEqual((Object) this.f101335a, (Object) ((C39702b) obj).f101335a);
            }

            public int hashCode() {
                return this.f101335a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f101335a;
                return "InitContent(storeId=" + str + ")";
            }
        }
    }
}
