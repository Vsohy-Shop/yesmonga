package com.carrefour.fid.android.presentation.p035ui.checkout.basketslist;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.b */
public interface C23460b {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.b$a */
    public static final class C23461a implements C23460b {
        @C12579k

        /* renamed from: a */
        public static final C23461a f59317a = new C23461a();

        /* renamed from: b */
        public static final int f59318b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.b$b */
    public static final class C23462b implements C23460b {
        @C12579k

        /* renamed from: a */
        public static final C23462b f59319a = new C23462b();

        /* renamed from: b */
        public static final int f59320b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.b$c */
    public static final class C23463c implements C23460b {
        @C12579k

        /* renamed from: a */
        public static final C23463c f59321a = new C23463c();

        /* renamed from: b */
        public static final int f59322b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.b$d */
    public static final class C23464d implements C23460b {

        /* renamed from: e */
        public static final int f59323e = 0;

        /* renamed from: a */
        public final boolean f59324a;
        @C12579k

        /* renamed from: b */
        public final BasketType f59325b;
        @C12580l

        /* renamed from: c */
        public final String f59326c;

        /* renamed from: d */
        public final boolean f59327d;

        public C23464d(boolean z, @C12579k BasketType basketType, @C12580l String str, boolean z2) {
            Intrinsics.checkNotNullParameter(basketType, "basketType");
            this.f59324a = z;
            this.f59325b = basketType;
            this.f59326c = str;
            this.f59327d = z2;
        }

        /* renamed from: f */
        public static /* synthetic */ C23464d m104547f(C23464d dVar, boolean z, BasketType basketType, String str, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = dVar.f59324a;
            }
            if ((i & 2) != 0) {
                basketType = dVar.f59325b;
            }
            if ((i & 4) != 0) {
                str = dVar.f59326c;
            }
            if ((i & 8) != 0) {
                z2 = dVar.f59327d;
            }
            return dVar.mo68710e(z, basketType, str, z2);
        }

        /* renamed from: a */
        public final boolean mo68706a() {
            return this.f59324a;
        }

        @C12579k
        /* renamed from: b */
        public final BasketType mo68707b() {
            return this.f59325b;
        }

        @C12580l
        /* renamed from: c */
        public final String mo68708c() {
            return this.f59326c;
        }

        /* renamed from: d */
        public final boolean mo68709d() {
            return this.f59327d;
        }

        @C12579k
        /* renamed from: e */
        public final C23464d mo68710e(boolean z, @C12579k BasketType basketType, @C12580l String str, boolean z2) {
            Intrinsics.checkNotNullParameter(basketType, "basketType");
            return new C23464d(z, basketType, str, z2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23464d)) {
                return false;
            }
            C23464d dVar = (C23464d) obj;
            return this.f59324a == dVar.f59324a && this.f59325b == dVar.f59325b && Intrinsics.areEqual((Object) this.f59326c, (Object) dVar.f59326c) && this.f59327d == dVar.f59327d;
        }

        @C12579k
        /* renamed from: g */
        public final BasketType mo68712g() {
            return this.f59325b;
        }

        @C12580l
        /* renamed from: h */
        public final String mo68713h() {
            return this.f59326c;
        }

        public int hashCode() {
            boolean z = this.f59324a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int hashCode = (((z ? 1 : 0) * true) + this.f59325b.hashCode()) * 31;
            String str = this.f59326c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            boolean z3 = this.f59327d;
            if (!z3) {
                z2 = z3;
            }
            return hashCode2 + (z2 ? 1 : 0);
        }

        /* renamed from: i */
        public final boolean mo68715i() {
            return this.f59327d;
        }

        /* renamed from: j */
        public final boolean mo68716j() {
            return this.f59324a;
        }

        @C12579k
        public String toString() {
            boolean z = this.f59324a;
            BasketType basketType = this.f59325b;
            String str = this.f59326c;
            boolean z2 = this.f59327d;
            return "OnScreenSuccessfullyLoaded(isTransitionAnimated=" + z + ", basketType=" + basketType + ", referenceId=" + str + ", isBasketFullNonFood=" + z2 + ")";
        }
    }
}
