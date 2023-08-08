package com.carrefour.fid.android.domain.interactors.product;

import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.shared.constant.C28547h2;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11074j;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.product.f */
public interface C37756f extends C11304p<C37757a, C11045c<? super C11907e<? extends Result<? extends List<? extends C38114b>>>>, Object>, C11074j {

    /* renamed from: com.carrefour.fid.android.domain.interactors.product.f$a */
    public static final class C37757a {
        @C12579k

        /* renamed from: a */
        public final String f94755a;
        @C12579k

        /* renamed from: b */
        public final String f94756b;

        public /* synthetic */ C37757a(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        /* renamed from: d */
        public static /* synthetic */ C37757a m154769d(C37757a aVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f94755a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f94756b;
            }
            return aVar.mo115019c(str, str2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo115017a() {
            return this.f94755a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo115018b() {
            return this.f94756b;
        }

        @C12579k
        /* renamed from: c */
        public final C37757a mo115019c(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "gtin");
            Intrinsics.checkNotNullParameter(str2, C28547h2.f69320h);
            return new C37757a(str, str2, (DefaultConstructorMarker) null);
        }

        @C12579k
        /* renamed from: e */
        public final String mo115020e() {
            return this.f94756b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37757a)) {
                return false;
            }
            C37757a aVar = (C37757a) obj;
            return Gtin.m157311e(this.f94755a, aVar.f94755a) && Intrinsics.areEqual((Object) this.f94756b, (Object) aVar.f94756b);
        }

        @C12579k
        /* renamed from: f */
        public final String mo115022f() {
            return this.f94755a;
        }

        public int hashCode() {
            return (Gtin.m157312g(this.f94755a) * 31) + this.f94756b.hashCode();
        }

        @C12579k
        public String toString() {
            String h = Gtin.m157313h(this.f94755a);
            String str = this.f94756b;
            return "Param(gtin=" + h + ", facilityServiceId=" + str + ")";
        }

        public C37757a(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "gtin");
            Intrinsics.checkNotNullParameter(str2, C28547h2.f69320h);
            this.f94755a = str;
            this.f94756b = str2;
        }
    }
}
