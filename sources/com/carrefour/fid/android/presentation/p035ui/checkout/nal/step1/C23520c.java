package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.product.Product;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.c */
public interface C23520c {

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.c$a */
    public interface C23521a extends C23520c {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.c$a$a */
        public static final class C23522a implements C23521a {
            @C12579k

            /* renamed from: a */
            public static final C23522a f59441a = new C23522a();

            /* renamed from: b */
            public static final int f59442b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.c$a$b */
        public static final class C23523b implements C23521a {
            @C12579k

            /* renamed from: a */
            public static final C23523b f59443a = new C23523b();

            /* renamed from: b */
            public static final int f59444b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.c$a$c */
        public static final class C23524c implements C23521a {
            @C12579k

            /* renamed from: a */
            public static final C23524c f59445a = new C23524c();

            /* renamed from: b */
            public static final int f59446b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.c$a$d */
        public static final class C23525d implements C23521a {
            @C12579k

            /* renamed from: a */
            public static final C23525d f59447a = new C23525d();

            /* renamed from: b */
            public static final int f59448b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.c$a$e */
        public static final class C23526e implements C23521a {
            @C12579k

            /* renamed from: a */
            public static final C23526e f59449a = new C23526e();

            /* renamed from: b */
            public static final int f59450b = 0;
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.c$b */
    public static final class C23527b implements C23520c {
        @C12579k

        /* renamed from: a */
        public static final C23527b f59451a = new C23527b();

        /* renamed from: b */
        public static final int f59452b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.c$c */
    public static final class C23528c implements C23520c {

        /* renamed from: b */
        public static final int f59453b = 0;

        /* renamed from: a */
        public final boolean f59454a;

        public C23528c(boolean z) {
            this.f59454a = z;
        }

        /* renamed from: c */
        public static /* synthetic */ C23528c m104708c(C23528c cVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = cVar.f59454a;
            }
            return cVar.mo68906b(z);
        }

        /* renamed from: a */
        public final boolean mo68905a() {
            return this.f59454a;
        }

        @C12579k
        /* renamed from: b */
        public final C23528c mo68906b(boolean z) {
            return new C23528c(z);
        }

        /* renamed from: d */
        public final boolean mo68907d() {
            return this.f59454a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23528c) && this.f59454a == ((C23528c) obj).f59454a;
        }

        public int hashCode() {
            boolean z = this.f59454a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @C12579k
        public String toString() {
            boolean z = this.f59454a;
            return "OnDigitalCardErrorValidation(okClicked=" + z + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.c$d */
    public static final class C23529d implements C23520c {
        @C12579k

        /* renamed from: a */
        public static final C23529d f59455a = new C23529d();

        /* renamed from: b */
        public static final int f59456b = 0;
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.c$e */
    public interface C23530e extends C23520c {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.c$e$a */
        public static final class C23531a implements C23530e {

            /* renamed from: c */
            public static final int f59457c = 0;
            @C12579k

            /* renamed from: a */
            public final String f59458a;

            /* renamed from: b */
            public final int f59459b;

            public C23531a(@C12579k String str, int i) {
                Intrinsics.checkNotNullParameter(str, "traceName");
                this.f59458a = str;
                this.f59459b = i;
            }

            /* renamed from: d */
            public static /* synthetic */ C23531a m104712d(C23531a aVar, String str, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = aVar.f59458a;
                }
                if ((i2 & 2) != 0) {
                    i = aVar.f59459b;
                }
                return aVar.mo68913c(str, i);
            }

            @C12579k
            /* renamed from: a */
            public final String mo68911a() {
                return this.f59458a;
            }

            /* renamed from: b */
            public final int mo68912b() {
                return this.f59459b;
            }

            @C12579k
            /* renamed from: c */
            public final C23531a mo68913c(@C12579k String str, int i) {
                Intrinsics.checkNotNullParameter(str, "traceName");
                return new C23531a(str, i);
            }

            /* renamed from: e */
            public final int mo68914e() {
                return this.f59459b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C23531a)) {
                    return false;
                }
                C23531a aVar = (C23531a) obj;
                return Intrinsics.areEqual((Object) this.f59458a, (Object) aVar.f59458a) && this.f59459b == aVar.f59459b;
            }

            @C12579k
            /* renamed from: f */
            public final String mo68916f() {
                return this.f59458a;
            }

            public int hashCode() {
                return (this.f59458a.hashCode() * 31) + Integer.hashCode(this.f59459b);
            }

            @C12579k
            public String toString() {
                String str = this.f59458a;
                int i = this.f59459b;
                return "StartTrace(traceName=" + str + ", listSize=" + i + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.c$e$b */
        public static final class C23532b implements C23530e {
            @C12579k

            /* renamed from: a */
            public static final C23532b f59460a = new C23532b();

            /* renamed from: b */
            public static final int f59461b = 0;
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.c$f */
    public interface C23533f extends C23520c {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.c$f$a */
        public static final class C23534a implements C23533f {

            /* renamed from: f */
            public static final int f59462f = 8;

            /* renamed from: a */
            public final int f59463a;

            /* renamed from: b */
            public final int f59464b;

            /* renamed from: c */
            public final int f59465c;

            /* renamed from: d */
            public final int f59466d;
            @C12579k

            /* renamed from: e */
            public final Product f59467e;

            public C23534a(int i, int i2, int i3, int i4, @C12579k Product product) {
                Intrinsics.checkNotNullParameter(product, "product");
                this.f59463a = i;
                this.f59464b = i2;
                this.f59465c = i3;
                this.f59466d = i4;
                this.f59467e = product;
            }

            /* renamed from: g */
            public static /* synthetic */ C23534a m104718g(C23534a aVar, int i, int i2, int i3, int i4, Product product, int i5, Object obj) {
                if ((i5 & 1) != 0) {
                    i = aVar.f59463a;
                }
                if ((i5 & 2) != 0) {
                    i2 = aVar.f59464b;
                }
                int i6 = i2;
                if ((i5 & 4) != 0) {
                    i3 = aVar.f59465c;
                }
                int i7 = i3;
                if ((i5 & 8) != 0) {
                    i4 = aVar.f59466d;
                }
                int i8 = i4;
                if ((i5 & 16) != 0) {
                    product = aVar.f59467e;
                }
                return aVar.mo68925f(i, i6, i7, i8, product);
            }

            /* renamed from: a */
            public final int mo68919a() {
                return this.f59463a;
            }

            /* renamed from: b */
            public final int mo68920b() {
                return this.f59464b;
            }

            /* renamed from: c */
            public final int mo68921c() {
                return this.f59465c;
            }

            /* renamed from: d */
            public final int mo68922d() {
                return this.f59466d;
            }

            @C12579k
            /* renamed from: e */
            public final Product mo68923e() {
                return this.f59467e;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C23534a)) {
                    return false;
                }
                C23534a aVar = (C23534a) obj;
                return this.f59463a == aVar.f59463a && this.f59464b == aVar.f59464b && this.f59465c == aVar.f59465c && this.f59466d == aVar.f59466d && Intrinsics.areEqual((Object) this.f59467e, (Object) aVar.f59467e);
            }

            @C12579k
            /* renamed from: f */
            public final C23534a mo68925f(int i, int i2, int i3, int i4, @C12579k Product product) {
                Intrinsics.checkNotNullParameter(product, "product");
                return new C23534a(i, i2, i3, i4, product);
            }

            /* renamed from: h */
            public final int mo68926h() {
                return this.f59463a;
            }

            public int hashCode() {
                return (((((((Integer.hashCode(this.f59463a) * 31) + Integer.hashCode(this.f59464b)) * 31) + Integer.hashCode(this.f59465c)) * 31) + Integer.hashCode(this.f59466d)) * 31) + this.f59467e.hashCode();
            }

            /* renamed from: i */
            public final int mo68928i() {
                return this.f59466d;
            }

            /* renamed from: j */
            public final int mo68929j() {
                return this.f59464b;
            }

            /* renamed from: k */
            public final int mo68930k() {
                return this.f59465c;
            }

            @C12579k
            /* renamed from: l */
            public final Product mo68931l() {
                return this.f59467e;
            }

            @C12579k
            public String toString() {
                int i = this.f59463a;
                int i2 = this.f59464b;
                int i3 = this.f59465c;
                int i4 = this.f59466d;
                Product product = this.f59467e;
                return "OnAtcPressed(currentQuantity=" + i + ", maxQuantity=" + i2 + ", minQuantity=" + i3 + ", incrementQuantity=" + i4 + ", product=" + product + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.c$f$b */
        public static final class C23535b implements C23533f {

            /* renamed from: b */
            public static final int f59468b = 8;
            @C12579k

            /* renamed from: a */
            public final Product f59469a;

            public C23535b(@C12579k Product product) {
                Intrinsics.checkNotNullParameter(product, "product");
                this.f59469a = product;
            }

            /* renamed from: c */
            public static /* synthetic */ C23535b m104730c(C23535b bVar, Product product, int i, Object obj) {
                if ((i & 1) != 0) {
                    product = bVar.f59469a;
                }
                return bVar.mo68934b(product);
            }

            @C12579k
            /* renamed from: a */
            public final Product mo68933a() {
                return this.f59469a;
            }

            @C12579k
            /* renamed from: b */
            public final C23535b mo68934b(@C12579k Product product) {
                Intrinsics.checkNotNullParameter(product, "product");
                return new C23535b(product);
            }

            @C12579k
            /* renamed from: d */
            public final Product mo68935d() {
                return this.f59469a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C23535b) && Intrinsics.areEqual((Object) this.f59469a, (Object) ((C23535b) obj).f59469a);
            }

            public int hashCode() {
                return this.f59469a.hashCode();
            }

            @C12579k
            public String toString() {
                Product product = this.f59469a;
                return "OnDeletePressed(product=" + product + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.c$f$c */
        public static final class C23536c implements C23533f {

            /* renamed from: c */
            public static final int f59470c = 8;
            @C12579k

            /* renamed from: a */
            public final Product f59471a;

            /* renamed from: b */
            public final int f59472b;

            public C23536c(@C12579k Product product, int i) {
                Intrinsics.checkNotNullParameter(product, "product");
                this.f59471a = product;
                this.f59472b = i;
            }

            /* renamed from: d */
            public static /* synthetic */ C23536c m104734d(C23536c cVar, Product product, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    product = cVar.f59471a;
                }
                if ((i2 & 2) != 0) {
                    i = cVar.f59472b;
                }
                return cVar.mo68941c(product, i);
            }

            @C12579k
            /* renamed from: a */
            public final Product mo68939a() {
                return this.f59471a;
            }

            /* renamed from: b */
            public final int mo68940b() {
                return this.f59472b;
            }

            @C12579k
            /* renamed from: c */
            public final C23536c mo68941c(@C12579k Product product, int i) {
                Intrinsics.checkNotNullParameter(product, "product");
                return new C23536c(product, i);
            }

            /* renamed from: e */
            public final int mo68942e() {
                return this.f59472b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C23536c)) {
                    return false;
                }
                C23536c cVar = (C23536c) obj;
                return Intrinsics.areEqual((Object) this.f59471a, (Object) cVar.f59471a) && this.f59472b == cVar.f59472b;
            }

            @C12579k
            /* renamed from: f */
            public final Product mo68944f() {
                return this.f59471a;
            }

            public int hashCode() {
                return (this.f59471a.hashCode() * 31) + Integer.hashCode(this.f59472b);
            }

            @C12579k
            public String toString() {
                Product product = this.f59471a;
                int i = this.f59472b;
                return "OnNewQuantitySelected(product=" + product + ", newQuantity=" + i + ")";
            }
        }
    }
}
