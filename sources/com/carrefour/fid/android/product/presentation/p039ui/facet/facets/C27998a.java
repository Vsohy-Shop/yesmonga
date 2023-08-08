package com.carrefour.fid.android.product.presentation.p039ui.facet.facets;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.product.Sort;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.facets.a */
public interface C27998a {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.facets.a$a */
    public static final class C27999a implements C27998a {
        @C12579k

        /* renamed from: a */
        public static final C27999a f67837a = new C27999a();

        /* renamed from: b */
        public static final int f67838b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.facets.a$b */
    public static final class C28000b implements C27998a {

        /* renamed from: b */
        public static final int f67839b = 0;
        @C12579k

        /* renamed from: a */
        public final String f67840a;

        public C28000b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "filterField");
            this.f67840a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C28000b m117408c(C28000b bVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f67840a;
            }
            return bVar.mo81471b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo81470a() {
            return this.f67840a;
        }

        @C12579k
        /* renamed from: b */
        public final C28000b mo81471b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "filterField");
            return new C28000b(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo81472d() {
            return this.f67840a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C28000b) && Intrinsics.areEqual((Object) this.f67840a, (Object) ((C28000b) obj).f67840a);
        }

        public int hashCode() {
            return this.f67840a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f67840a;
            return "OnNavigateToFilter(filterField=" + str + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.facets.a$c */
    public static final class C28001c implements C27998a {
        @C12579k

        /* renamed from: a */
        public static final C28001c f67841a = new C28001c();

        /* renamed from: b */
        public static final int f67842b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.facets.a$d */
    public static final class C28002d implements C27998a {
        @C12579k

        /* renamed from: a */
        public static final C28002d f67843a = new C28002d();

        /* renamed from: b */
        public static final int f67844b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.facets.a$e */
    public static final class C28003e implements C27998a {

        /* renamed from: b */
        public static final int f67845b = 8;
        @C12579k

        /* renamed from: a */
        public final Sort f67846a;

        public C28003e(@C12579k Sort sort) {
            Intrinsics.checkNotNullParameter(sort, "sort");
            this.f67846a = sort;
        }

        /* renamed from: c */
        public static /* synthetic */ C28003e m117412c(C28003e eVar, Sort sort, int i, Object obj) {
            if ((i & 1) != 0) {
                sort = eVar.f67846a;
            }
            return eVar.mo81477b(sort);
        }

        @C12579k
        /* renamed from: a */
        public final Sort mo81476a() {
            return this.f67846a;
        }

        @C12579k
        /* renamed from: b */
        public final C28003e mo81477b(@C12579k Sort sort) {
            Intrinsics.checkNotNullParameter(sort, "sort");
            return new C28003e(sort);
        }

        @C12579k
        /* renamed from: d */
        public final Sort mo81478d() {
            return this.f67846a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C28003e) && Intrinsics.areEqual((Object) this.f67846a, (Object) ((C28003e) obj).f67846a);
        }

        public int hashCode() {
            return this.f67846a.hashCode();
        }

        @C12579k
        public String toString() {
            Sort sort = this.f67846a;
            return "OnSortSelection(sort=" + sort + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.facets.a$f */
    public interface C28004f extends C27998a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.facets.a$f$a */
        public static final class C28005a implements C28004f {

            /* renamed from: c */
            public static final int f67847c = 0;
            @C12579k

            /* renamed from: a */
            public final String f67848a;

            /* renamed from: b */
            public final int f67849b;

            public C28005a(@C12579k String str, int i) {
                Intrinsics.checkNotNullParameter(str, "traceName");
                this.f67848a = str;
                this.f67849b = i;
            }

            /* renamed from: d */
            public static /* synthetic */ C28005a m117416d(C28005a aVar, String str, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = aVar.f67848a;
                }
                if ((i2 & 2) != 0) {
                    i = aVar.f67849b;
                }
                return aVar.mo81484c(str, i);
            }

            @C12579k
            /* renamed from: a */
            public final String mo81482a() {
                return this.f67848a;
            }

            /* renamed from: b */
            public final int mo81483b() {
                return this.f67849b;
            }

            @C12579k
            /* renamed from: c */
            public final C28005a mo81484c(@C12579k String str, int i) {
                Intrinsics.checkNotNullParameter(str, "traceName");
                return new C28005a(str, i);
            }

            /* renamed from: e */
            public final int mo81485e() {
                return this.f67849b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C28005a)) {
                    return false;
                }
                C28005a aVar = (C28005a) obj;
                return Intrinsics.areEqual((Object) this.f67848a, (Object) aVar.f67848a) && this.f67849b == aVar.f67849b;
            }

            @C12579k
            /* renamed from: f */
            public final String mo81487f() {
                return this.f67848a;
            }

            public int hashCode() {
                return (this.f67848a.hashCode() * 31) + Integer.hashCode(this.f67849b);
            }

            @C12579k
            public String toString() {
                String str = this.f67848a;
                int i = this.f67849b;
                return "StartTrace(traceName=" + str + ", listSize=" + i + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.facets.a$f$b */
        public static final class C28006b implements C28004f {
            @C12579k

            /* renamed from: a */
            public static final C28006b f67850a = new C28006b();

            /* renamed from: b */
            public static final int f67851b = 0;
        }
    }
}
