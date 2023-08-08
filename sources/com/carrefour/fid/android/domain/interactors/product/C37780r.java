package com.carrefour.fid.android.domain.interactors.product;

import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11074j;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.product.r */
public interface C37780r extends C11304p<C37781a, C11045c<? super C11907e<? extends Result<? extends C38115c>>>, Object>, C11074j {

    /* renamed from: com.carrefour.fid.android.domain.interactors.product.r$a */
    public static final class C37781a {
        @C12579k

        /* renamed from: a */
        public final String f94814a;
        @C12579k

        /* renamed from: b */
        public final String f94815b;

        public /* synthetic */ C37781a(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        /* renamed from: d */
        public static /* synthetic */ C37781a m154863d(C37781a aVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f94814a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f94815b;
            }
            return aVar.mo115111c(str, str2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo115109a() {
            return this.f94814a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo115110b() {
            return this.f94815b;
        }

        @C12579k
        /* renamed from: c */
        public final C37781a mo115111c(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "storeService");
            Intrinsics.checkNotNullParameter(str2, "gtin");
            return new C37781a(str, str2, (DefaultConstructorMarker) null);
        }

        @C12579k
        /* renamed from: e */
        public final String mo115112e() {
            return this.f94815b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37781a)) {
                return false;
            }
            C37781a aVar = (C37781a) obj;
            return Intrinsics.areEqual((Object) this.f94814a, (Object) aVar.f94814a) && Gtin.m157311e(this.f94815b, aVar.f94815b);
        }

        @C12579k
        /* renamed from: f */
        public final String mo115114f() {
            return this.f94814a;
        }

        public int hashCode() {
            return (this.f94814a.hashCode() * 31) + Gtin.m157312g(this.f94815b);
        }

        @C12579k
        public String toString() {
            String str = this.f94814a;
            String h = Gtin.m157313h(this.f94815b);
            return "Param(storeService=" + str + ", gtin=" + h + ")";
        }

        public C37781a(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "storeService");
            Intrinsics.checkNotNullParameter(str2, "gtin");
            this.f94814a = str;
            this.f94815b = str2;
        }
    }
}
