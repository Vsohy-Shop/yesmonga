package com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.a */
public interface C23939a {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.a$a */
    public static final class C23940a implements C23939a {

        /* renamed from: b */
        public static final int f60107b = 0;
        @C12579k

        /* renamed from: a */
        public final String f60108a;

        public C23940a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "couponStatus");
            this.f60108a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C23940a m105806c(C23940a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f60108a;
            }
            return aVar.mo70072b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo70071a() {
            return this.f60108a;
        }

        @C12579k
        /* renamed from: b */
        public final C23940a mo70072b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "couponStatus");
            return new C23940a(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo70073d() {
            return this.f60108a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23940a) && Intrinsics.areEqual((Object) this.f60108a, (Object) ((C23940a) obj).f60108a);
        }

        public int hashCode() {
            return this.f60108a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f60108a;
            return "EditCouponDetailStatus(couponStatus=" + str + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.a$b */
    public static final class C23941b implements C23939a {
        @C12579k

        /* renamed from: a */
        public static final C23941b f60109a = new C23941b();

        /* renamed from: b */
        public static final int f60110b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.a$c */
    public static final class C23942c implements C23939a {
        @C12579k

        /* renamed from: a */
        public static final C23942c f60111a = new C23942c();

        /* renamed from: b */
        public static final int f60112b = 0;
    }
}
