package com.carrefour.fid.android.presentation.viewmodels.physicalstore.info;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.h */
public interface C27156h {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.h$a */
    public static final class C27157a implements C27156h {
        @C12579k

        /* renamed from: a */
        public static final C27157a f66026a = new C27157a();

        /* renamed from: b */
        public static final int f66027b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.h$b */
    public static final class C27158b implements C27156h {
        @C12579k

        /* renamed from: a */
        public static final C27158b f66028a = new C27158b();

        /* renamed from: b */
        public static final int f66029b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.h$c */
    public static final class C27159c implements C27156h {

        /* renamed from: c */
        public static final int f66030c = 0;

        /* renamed from: a */
        public final double f66031a;

        /* renamed from: b */
        public final int f66032b;

        public C27159c(double d, int i) {
            this.f66031a = d;
            this.f66032b = i;
        }

        /* renamed from: d */
        public static /* synthetic */ C27159c m114728d(C27159c cVar, double d, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                d = cVar.f66031a;
            }
            if ((i2 & 2) != 0) {
                i = cVar.f66032b;
            }
            return cVar.mo78944c(d, i);
        }

        /* renamed from: a */
        public final double mo78942a() {
            return this.f66031a;
        }

        /* renamed from: b */
        public final int mo78943b() {
            return this.f66032b;
        }

        @C12579k
        /* renamed from: c */
        public final C27159c mo78944c(double d, int i) {
            return new C27159c(d, i);
        }

        /* renamed from: e */
        public final int mo78945e() {
            return this.f66032b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27159c)) {
                return false;
            }
            C27159c cVar = (C27159c) obj;
            return Double.compare(this.f66031a, cVar.f66031a) == 0 && this.f66032b == cVar.f66032b;
        }

        /* renamed from: f */
        public final double mo78947f() {
            return this.f66031a;
        }

        public int hashCode() {
            return (Double.hashCode(this.f66031a) * 31) + Integer.hashCode(this.f66032b);
        }

        @C12579k
        public String toString() {
            double d = this.f66031a;
            int i = this.f66032b;
            return "Ready(rating=" + d + ", numberOfReview=" + i + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C27159c(double d, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(d, (i2 & 2) != 0 ? 0 : i);
        }
    }
}
