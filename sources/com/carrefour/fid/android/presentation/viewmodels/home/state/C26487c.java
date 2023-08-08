package com.carrefour.fid.android.presentation.viewmodels.home.state;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.C37974c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.state.c */
public interface C26487c {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.state.c$a */
    public static final class C26488a implements C26487c {
        @C12579k

        /* renamed from: a */
        public static final C26488a f64752a = new C26488a();

        /* renamed from: b */
        public static final int f64753b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.state.c$b */
    public static final class C26489b implements C26487c {

        /* renamed from: b */
        public static final int f64754b = 8;
        @C12579k

        /* renamed from: a */
        public final C37974c f64755a;

        public C26489b(@C12579k C37974c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "couponContentDomain");
            this.f64755a = cVar;
        }

        /* renamed from: c */
        public static /* synthetic */ C26489b m112892c(C26489b bVar, C37974c cVar, int i, Object obj) {
            if ((i & 1) != 0) {
                cVar = bVar.f64755a;
            }
            return bVar.mo77036b(cVar);
        }

        @C12579k
        /* renamed from: a */
        public final C37974c mo77035a() {
            return this.f64755a;
        }

        @C12579k
        /* renamed from: b */
        public final C26489b mo77036b(@C12579k C37974c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "couponContentDomain");
            return new C26489b(cVar);
        }

        @C12579k
        /* renamed from: d */
        public final C37974c mo77037d() {
            return this.f64755a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C26489b) && Intrinsics.areEqual((Object) this.f64755a, (Object) ((C26489b) obj).f64755a);
        }

        public int hashCode() {
            return this.f64755a.hashCode();
        }

        @C12579k
        public String toString() {
            C37974c cVar = this.f64755a;
            return "CouponsInfo(couponContentDomain=" + cVar + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.state.c$c */
    public static final class C26490c implements C26487c {
        @C12579k

        /* renamed from: a */
        public static final C26490c f64756a = new C26490c();

        /* renamed from: b */
        public static final int f64757b = 0;
    }
}
