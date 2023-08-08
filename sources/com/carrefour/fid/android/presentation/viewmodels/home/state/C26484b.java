package com.carrefour.fid.android.presentation.viewmodels.home.state;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.ArsenalJOBanner;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.state.b */
public interface C26484b {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.state.b$a */
    public static final class C26485a implements C26484b {

        /* renamed from: b */
        public static final int f64748b = 0;
        @C12579k

        /* renamed from: a */
        public final ArsenalJOBanner f64749a;

        public C26485a(@C12579k ArsenalJOBanner arsenalJOBanner) {
            Intrinsics.checkNotNullParameter(arsenalJOBanner, "banner");
            this.f64749a = arsenalJOBanner;
        }

        /* renamed from: c */
        public static /* synthetic */ C26485a m112888c(C26485a aVar, ArsenalJOBanner arsenalJOBanner, int i, Object obj) {
            if ((i & 1) != 0) {
                arsenalJOBanner = aVar.f64749a;
            }
            return aVar.mo77030b(arsenalJOBanner);
        }

        @C12579k
        /* renamed from: a */
        public final ArsenalJOBanner mo77029a() {
            return this.f64749a;
        }

        @C12579k
        /* renamed from: b */
        public final C26485a mo77030b(@C12579k ArsenalJOBanner arsenalJOBanner) {
            Intrinsics.checkNotNullParameter(arsenalJOBanner, "banner");
            return new C26485a(arsenalJOBanner);
        }

        @C12579k
        /* renamed from: d */
        public final ArsenalJOBanner mo77031d() {
            return this.f64749a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C26485a) && Intrinsics.areEqual((Object) this.f64749a, (Object) ((C26485a) obj).f64749a);
        }

        public int hashCode() {
            return this.f64749a.hashCode();
        }

        @C12579k
        public String toString() {
            ArsenalJOBanner arsenalJOBanner = this.f64749a;
            return "Available(banner=" + arsenalJOBanner + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.state.b$b */
    public static final class C26486b implements C26484b {
        @C12579k

        /* renamed from: a */
        public static final C26486b f64750a = new C26486b();

        /* renamed from: b */
        public static final int f64751b = 0;
    }
}
