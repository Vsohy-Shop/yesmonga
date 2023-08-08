package com.carrefour.fid.android.presentation.viewmodels.home.state;

import androidx.compose.runtime.internal.C8567o;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.state.e */
public interface C26494e {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.state.e$a */
    public static final class C26495a implements C26494e {

        /* renamed from: c */
        public static final int f64762c = 0;

        /* renamed from: a */
        public final float f64763a;

        /* renamed from: b */
        public final boolean f64764b;

        public C26495a(float f, boolean z) {
            this.f64763a = f;
            this.f64764b = z;
        }

        /* renamed from: d */
        public static /* synthetic */ C26495a m112900d(C26495a aVar, float f, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                f = aVar.f64763a;
            }
            if ((i & 2) != 0) {
                z = aVar.f64764b;
            }
            return aVar.mo77049c(f, z);
        }

        /* renamed from: a */
        public final float mo77047a() {
            return this.f64763a;
        }

        /* renamed from: b */
        public final boolean mo77048b() {
            return this.f64764b;
        }

        @C12579k
        /* renamed from: c */
        public final C26495a mo77049c(float f, boolean z) {
            return new C26495a(f, z);
        }

        /* renamed from: e */
        public final float mo77050e() {
            return this.f64763a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26495a)) {
                return false;
            }
            C26495a aVar = (C26495a) obj;
            return Float.compare(this.f64763a, aVar.f64763a) == 0 && this.f64764b == aVar.f64764b;
        }

        /* renamed from: f */
        public final boolean mo77052f() {
            return this.f64764b;
        }

        public int hashCode() {
            int hashCode = Float.hashCode(this.f64763a) * 31;
            boolean z = this.f64764b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        @C12579k
        public String toString() {
            float f = this.f64763a;
            boolean z = this.f64764b;
            return "InsetsData(topInset=" + f + ", isServiceSelected=" + z + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.state.e$b */
    public static final class C26496b implements C26494e {
        @C12579k

        /* renamed from: a */
        public static final C26496b f64765a = new C26496b();

        /* renamed from: b */
        public static final int f64766b = 0;
    }
}
