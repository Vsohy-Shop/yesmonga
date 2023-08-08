package com.carrefour.fid.android.domain.interactors.product;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.basket.BasketReference;
import kotlin.C11079d2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.product.a */
public interface C37748a extends C37679f<C37749a, C11079d2> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.product.a$a */
    public static final class C37749a {
        @C12579k

        /* renamed from: a */
        public final String f94751a;

        public /* synthetic */ C37749a(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        /* renamed from: c */
        public static /* synthetic */ C37749a m154755c(C37749a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f94751a;
            }
            return aVar.mo114998b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo114997a() {
            return this.f94751a;
        }

        @C12579k
        /* renamed from: b */
        public final C37749a mo114998b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "basketReference");
            return new C37749a(str, (DefaultConstructorMarker) null);
        }

        @C12579k
        /* renamed from: d */
        public final String mo114999d() {
            return this.f94751a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37749a) && BasketReference.m156097f(this.f94751a, ((C37749a) obj).f94751a);
        }

        public int hashCode() {
            return BasketReference.m156098h(this.f94751a);
        }

        @C12579k
        public String toString() {
            String i = BasketReference.m156099i(this.f94751a);
            return "Param(basketReference=" + i + ")";
        }

        public C37749a(String str) {
            Intrinsics.checkNotNullParameter(str, "basketReference");
            this.f94751a = str;
        }
    }
}
