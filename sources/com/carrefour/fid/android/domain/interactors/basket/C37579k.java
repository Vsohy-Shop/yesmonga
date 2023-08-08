package com.carrefour.fid.android.domain.interactors.basket;

import com.carrefour.fid.android.domain.models.basket.Basket;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11074j;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.basket.k */
public interface C37579k extends C11304p<C37580a, C11045c<? super Basket>, Object>, C11074j {

    /* renamed from: com.carrefour.fid.android.domain.interactors.basket.k$a */
    public static final class C37580a {
        @C12579k

        /* renamed from: a */
        public final String f94340a;

        public C37580a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "referenceId");
            this.f94340a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C37580a m154132c(C37580a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f94340a;
            }
            return aVar.mo114398b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo114397a() {
            return this.f94340a;
        }

        @C12579k
        /* renamed from: b */
        public final C37580a mo114398b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "referenceId");
            return new C37580a(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo114399d() {
            return this.f94340a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37580a) && Intrinsics.areEqual((Object) this.f94340a, (Object) ((C37580a) obj).f94340a);
        }

        public int hashCode() {
            return this.f94340a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f94340a;
            return "Param(referenceId=" + str + ")";
        }
    }
}
