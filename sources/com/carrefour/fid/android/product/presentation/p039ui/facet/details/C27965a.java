package com.carrefour.fid.android.product.presentation.p039ui.facet.details;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.product.C38105d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.details.a */
public interface C27965a {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.details.a$a */
    public static final class C27966a implements C27965a {
        @C12579k

        /* renamed from: a */
        public static final C27966a f67801a = new C27966a();

        /* renamed from: b */
        public static final int f67802b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.details.a$b */
    public static final class C27967b implements C27965a {

        /* renamed from: b */
        public static final int f67803b = 8;
        @C12579k

        /* renamed from: a */
        public final C38105d f67804a;

        public C27967b(@C12579k C38105d dVar) {
            Intrinsics.checkNotNullParameter(dVar, "filterSelection");
            this.f67804a = dVar;
        }

        /* renamed from: c */
        public static /* synthetic */ C27967b m117357c(C27967b bVar, C38105d dVar, int i, Object obj) {
            if ((i & 1) != 0) {
                dVar = bVar.f67804a;
            }
            return bVar.mo81411b(dVar);
        }

        @C12579k
        /* renamed from: a */
        public final C38105d mo81410a() {
            return this.f67804a;
        }

        @C12579k
        /* renamed from: b */
        public final C27967b mo81411b(@C12579k C38105d dVar) {
            Intrinsics.checkNotNullParameter(dVar, "filterSelection");
            return new C27967b(dVar);
        }

        @C12579k
        /* renamed from: d */
        public final C38105d mo81412d() {
            return this.f67804a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27967b) && Intrinsics.areEqual((Object) this.f67804a, (Object) ((C27967b) obj).f67804a);
        }

        public int hashCode() {
            return this.f67804a.hashCode();
        }

        @C12579k
        public String toString() {
            C38105d dVar = this.f67804a;
            return "OnFilterClicked(filterSelection=" + dVar + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.details.a$c */
    public static final class C27968c implements C27965a {
        @C12579k

        /* renamed from: a */
        public static final C27968c f67805a = new C27968c();

        /* renamed from: b */
        public static final int f67806b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.details.a$d */
    public static final class C27969d implements C27965a {
        @C12579k

        /* renamed from: a */
        public static final C27969d f67807a = new C27969d();

        /* renamed from: b */
        public static final int f67808b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.details.a$e */
    public static final class C27970e implements C27965a {
        @C12579k

        /* renamed from: a */
        public static final C27970e f67809a = new C27970e();

        /* renamed from: b */
        public static final int f67810b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.details.a$f */
    public static final class C27971f implements C27965a {
        @C12579k

        /* renamed from: a */
        public static final C27971f f67811a = new C27971f();

        /* renamed from: b */
        public static final int f67812b = 0;
    }

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.details.a$g */
    public interface C27972g extends C27965a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.details.a$g$a */
        public static final class C27973a implements C27972g {

            /* renamed from: c */
            public static final int f67813c = 0;
            @C12579k

            /* renamed from: a */
            public final String f67814a;

            /* renamed from: b */
            public final int f67815b;

            public C27973a(@C12579k String str, int i) {
                Intrinsics.checkNotNullParameter(str, "traceName");
                this.f67814a = str;
                this.f67815b = i;
            }

            /* renamed from: d */
            public static /* synthetic */ C27973a m117361d(C27973a aVar, String str, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = aVar.f67814a;
                }
                if ((i2 & 2) != 0) {
                    i = aVar.f67815b;
                }
                return aVar.mo81418c(str, i);
            }

            @C12579k
            /* renamed from: a */
            public final String mo81416a() {
                return this.f67814a;
            }

            /* renamed from: b */
            public final int mo81417b() {
                return this.f67815b;
            }

            @C12579k
            /* renamed from: c */
            public final C27973a mo81418c(@C12579k String str, int i) {
                Intrinsics.checkNotNullParameter(str, "traceName");
                return new C27973a(str, i);
            }

            /* renamed from: e */
            public final int mo81419e() {
                return this.f67815b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C27973a)) {
                    return false;
                }
                C27973a aVar = (C27973a) obj;
                return Intrinsics.areEqual((Object) this.f67814a, (Object) aVar.f67814a) && this.f67815b == aVar.f67815b;
            }

            @C12579k
            /* renamed from: f */
            public final String mo81421f() {
                return this.f67814a;
            }

            public int hashCode() {
                return (this.f67814a.hashCode() * 31) + Integer.hashCode(this.f67815b);
            }

            @C12579k
            public String toString() {
                String str = this.f67814a;
                int i = this.f67815b;
                return "StartTrace(traceName=" + str + ", listSize=" + i + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.details.a$g$b */
        public static final class C27974b implements C27972g {
            @C12579k

            /* renamed from: a */
            public static final C27974b f67816a = new C27974b();

            /* renamed from: b */
            public static final int f67817b = 0;
        }
    }
}
