package com.carrefour.fid.android.product.presentation.models;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.models.a */
public abstract class C27647a {

    /* renamed from: a */
    public final int f67170a;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.models.a$a */
    public static final class C27648a extends C27647a {

        /* renamed from: c */
        public static final int f67171c = 0;

        /* renamed from: b */
        public final int f67172b;

        public C27648a() {
            this(0, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: d */
        public static /* synthetic */ C27648a m116335d(C27648a aVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = aVar.f67172b;
            }
            return aVar.mo80336c(i);
        }

        /* renamed from: a */
        public int mo80334a() {
            return this.f67172b;
        }

        /* renamed from: b */
        public final int mo80335b() {
            return this.f67172b;
        }

        @C12579k
        /* renamed from: c */
        public final C27648a mo80336c(int i) {
            return new C27648a(i);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27648a) && this.f67172b == ((C27648a) obj).f67172b;
        }

        public int hashCode() {
            return Integer.hashCode(this.f67172b);
        }

        @C12579k
        public String toString() {
            int i = this.f67172b;
            return "AddToCart(quantity=" + i + ")";
        }

        public C27648a(int i) {
            super(i, (DefaultConstructorMarker) null);
            this.f67172b = i;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C27648a(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i);
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.models.a$b */
    public static final class C27649b extends C27647a {
        @C12579k

        /* renamed from: b */
        public static final C27649b f67173b = new C27649b();

        /* renamed from: c */
        public static final int f67174c = 0;

        public C27649b() {
            super(0, (DefaultConstructorMarker) null);
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.models.a$c */
    public static final class C27650c extends C27647a {

        /* renamed from: c */
        public static final int f67175c = 0;

        /* renamed from: b */
        public final int f67176b;

        public C27650c(int i) {
            super(i, (DefaultConstructorMarker) null);
            this.f67176b = i;
        }

        /* renamed from: d */
        public static /* synthetic */ C27650c m116339d(C27650c cVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = cVar.f67176b;
            }
            return cVar.mo80341c(i);
        }

        /* renamed from: a */
        public int mo80334a() {
            return this.f67176b;
        }

        /* renamed from: b */
        public final int mo80340b() {
            return this.f67176b;
        }

        @C12579k
        /* renamed from: c */
        public final C27650c mo80341c(int i) {
            return new C27650c(i);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27650c) && this.f67176b == ((C27650c) obj).f67176b;
        }

        public int hashCode() {
            return Integer.hashCode(this.f67176b);
        }

        @C12579k
        public String toString() {
            int i = this.f67176b;
            return "AddToCartWithQuantity(quantity=" + i + ")";
        }
    }

    public /* synthetic */ C27647a(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    /* renamed from: a */
    public int mo80334a() {
        return this.f67170a;
    }

    public C27647a(int i) {
        this.f67170a = i;
    }
}
