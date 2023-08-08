package com.carrefour.fid.android.domain.interactors.basket;

import com.carrefour.fid.android.domain.interactors.C37679f;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.basket.f */
public interface C37567f extends C37679f<C37568a, C11079d2> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.basket.f$a */
    public static final class C37568a {
        @C12579k

        /* renamed from: a */
        public final String f94335a;

        public C37568a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "basketReferenceId");
            this.f94335a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C37568a m154117c(C37568a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f94335a;
            }
            return aVar.mo114381b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo114380a() {
            return this.f94335a;
        }

        @C12579k
        /* renamed from: b */
        public final C37568a mo114381b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "basketReferenceId");
            return new C37568a(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo114382d() {
            return this.f94335a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37568a) && Intrinsics.areEqual((Object) this.f94335a, (Object) ((C37568a) obj).f94335a);
        }

        public int hashCode() {
            return this.f94335a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f94335a;
            return "Param(basketReferenceId=" + str + ")";
        }
    }
}
