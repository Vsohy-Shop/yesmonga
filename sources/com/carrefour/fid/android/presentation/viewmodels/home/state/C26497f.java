package com.carrefour.fid.android.presentation.viewmodels.home.state;

import androidx.compose.runtime.internal.C8567o;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.state.f */
public interface C26497f {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.state.f$a */
    public static final class C26498a implements C26497f {
        @C12579k

        /* renamed from: a */
        public static final C26498a f64767a = new C26498a();

        /* renamed from: b */
        public static final int f64768b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.state.f$b */
    public static final class C26499b implements C26497f {

        /* renamed from: b */
        public static final int f64769b = 0;

        /* renamed from: a */
        public final double f64770a;

        public C26499b(double d) {
            this.f64770a = d;
        }

        /* renamed from: c */
        public static /* synthetic */ C26499b m112906c(C26499b bVar, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                d = bVar.f64770a;
            }
            return bVar.mo77056b(d);
        }

        /* renamed from: a */
        public final double mo77055a() {
            return this.f64770a;
        }

        @C12579k
        /* renamed from: b */
        public final C26499b mo77056b(double d) {
            return new C26499b(d);
        }

        /* renamed from: d */
        public final double mo77057d() {
            return this.f64770a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C26499b) && Double.compare(this.f64770a, ((C26499b) obj).f64770a) == 0;
        }

        public int hashCode() {
            return Double.hashCode(this.f64770a);
        }

        @C12579k
        public String toString() {
            double d = this.f64770a;
            return "LoyaltyBalance(value=" + d + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.state.f$c */
    public static final class C26500c implements C26497f {
        @C12579k

        /* renamed from: a */
        public static final C26500c f64771a = new C26500c();

        /* renamed from: b */
        public static final int f64772b = 0;
    }
}
