package com.carrefour.fid.android.presentation.models;

import androidx.compose.runtime.internal.C8567o;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.models.g */
public interface C38486g {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.models.g$a */
    public static final class C38487a implements C38486g {

        /* renamed from: b */
        public static final int f97597b = 0;

        /* renamed from: a */
        public final double f97598a;

        public C38487a(double d) {
            this.f97598a = d;
        }

        /* renamed from: c */
        public static /* synthetic */ C38487a m159665c(C38487a aVar, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                d = aVar.f97598a;
            }
            return aVar.mo122050b(d);
        }

        /* renamed from: a */
        public final double mo122049a() {
            return this.f97598a;
        }

        @C12579k
        /* renamed from: b */
        public final C38487a mo122050b(double d) {
            return new C38487a(d);
        }

        /* renamed from: d */
        public final double mo122051d() {
            return this.f97598a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C38487a) && Double.compare(this.f97598a, ((C38487a) obj).f97598a) == 0;
        }

        public int hashCode() {
            return Double.hashCode(this.f97598a);
        }

        @C12579k
        public String toString() {
            double d = this.f97598a;
            return "Step1(amountInEuro=" + d + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.models.g$b */
    public static final class C38488b implements C38486g {

        /* renamed from: b */
        public static final int f97599b = 0;

        /* renamed from: a */
        public final double f97600a;

        public C38488b(double d) {
            this.f97600a = d;
        }

        /* renamed from: c */
        public static /* synthetic */ C38488b m159669c(C38488b bVar, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                d = bVar.f97600a;
            }
            return bVar.mo122056b(d);
        }

        /* renamed from: a */
        public final double mo122055a() {
            return this.f97600a;
        }

        @C12579k
        /* renamed from: b */
        public final C38488b mo122056b(double d) {
            return new C38488b(d);
        }

        /* renamed from: d */
        public final double mo122057d() {
            return this.f97600a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C38488b) && Double.compare(this.f97600a, ((C38488b) obj).f97600a) == 0;
        }

        public int hashCode() {
            return Double.hashCode(this.f97600a);
        }

        @C12579k
        public String toString() {
            double d = this.f97600a;
            return "Step2(amountInEuro=" + d + ")";
        }
    }
}
