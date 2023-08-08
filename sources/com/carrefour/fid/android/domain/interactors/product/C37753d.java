package com.carrefour.fid.android.domain.interactors.product;

import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
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

/* renamed from: com.carrefour.fid.android.domain.interactors.product.d */
public interface C37753d extends C11304p<C37754a, C11045c<? super C11907e<? extends Result<? extends List<? extends C38114b>>>>, Object>, C11074j {

    /* renamed from: com.carrefour.fid.android.domain.interactors.product.d$a */
    public static final class C37754a {
        @C12579k

        /* renamed from: a */
        public final String f94754a;

        public /* synthetic */ C37754a(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        /* renamed from: c */
        public static /* synthetic */ C37754a m154765c(C37754a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f94754a;
            }
            return aVar.mo115012b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo115011a() {
            return this.f94754a;
        }

        @C12579k
        /* renamed from: b */
        public final C37754a mo115012b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "gtin");
            return new C37754a(str, (DefaultConstructorMarker) null);
        }

        @C12579k
        /* renamed from: d */
        public final String mo115013d() {
            return this.f94754a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37754a) && Gtin.m157311e(this.f94754a, ((C37754a) obj).f94754a);
        }

        public int hashCode() {
            return Gtin.m157312g(this.f94754a);
        }

        @C12579k
        public String toString() {
            String h = Gtin.m157313h(this.f94754a);
            return "Param(gtin=" + h + ")";
        }

        public C37754a(String str) {
            Intrinsics.checkNotNullParameter(str, "gtin");
            this.f94754a = str;
        }
    }
}
