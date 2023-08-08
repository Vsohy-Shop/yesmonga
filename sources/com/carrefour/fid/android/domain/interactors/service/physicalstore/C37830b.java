package com.carrefour.fid.android.domain.interactors.service.physicalstore;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.service.models.C38166m;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.service.physicalstore.b */
public interface C37830b extends C37679f<C37831a, C38166m> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.service.physicalstore.b$a */
    public static final class C37831a {

        /* renamed from: a */
        public final double f94912a;

        /* renamed from: b */
        public final double f94913b;

        public C37831a(double d, double d2) {
            this.f94912a = d;
            this.f94913b = d2;
        }

        /* renamed from: d */
        public static /* synthetic */ C37831a m155007d(C37831a aVar, double d, double d2, int i, Object obj) {
            if ((i & 1) != 0) {
                d = aVar.f94912a;
            }
            if ((i & 2) != 0) {
                d2 = aVar.f94913b;
            }
            return aVar.mo115244c(d, d2);
        }

        /* renamed from: a */
        public final double mo115242a() {
            return this.f94912a;
        }

        /* renamed from: b */
        public final double mo115243b() {
            return this.f94913b;
        }

        @C12579k
        /* renamed from: c */
        public final C37831a mo115244c(double d, double d2) {
            return new C37831a(d, d2);
        }

        /* renamed from: e */
        public final double mo115245e() {
            return this.f94912a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37831a)) {
                return false;
            }
            C37831a aVar = (C37831a) obj;
            return Double.compare(this.f94912a, aVar.f94912a) == 0 && Double.compare(this.f94913b, aVar.f94913b) == 0;
        }

        /* renamed from: f */
        public final double mo115247f() {
            return this.f94913b;
        }

        public int hashCode() {
            return (Double.hashCode(this.f94912a) * 31) + Double.hashCode(this.f94913b);
        }

        @C12579k
        public String toString() {
            double d = this.f94912a;
            double d2 = this.f94913b;
            return "Param(latitude=" + d + ", longitude=" + d2 + ")";
        }
    }
}
