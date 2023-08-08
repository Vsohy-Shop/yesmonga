package com.carrefour.fid.android.presentation.p035ui.coupons.scanBarcode;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.c */
public interface C23970c {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.c$a */
    public static final class C23971a implements C23970c {
        @C12579k

        /* renamed from: a */
        public static final C23971a f60163a = new C23971a();

        /* renamed from: b */
        public static final int f60164b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.c$b */
    public static final class C23972b implements C23970c {

        /* renamed from: b */
        public static final int f60165b = 0;
        @C12579k

        /* renamed from: a */
        public final String f60166a;

        public C23972b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "productEan");
            this.f60166a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C23972b m105884c(C23972b bVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f60166a;
            }
            return bVar.mo70140b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo70139a() {
            return this.f60166a;
        }

        @C12579k
        /* renamed from: b */
        public final C23972b mo70140b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "productEan");
            return new C23972b(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo70141d() {
            return this.f60166a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23972b) && Intrinsics.areEqual((Object) this.f60166a, (Object) ((C23972b) obj).f60166a);
        }

        public int hashCode() {
            return this.f60166a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f60166a;
            return "verifyProductEligibility(productEan=" + str + ")";
        }
    }
}
