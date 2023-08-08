package com.carrefour.fid.android.product.domain.repositories;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.product.domain.model.C27586d;
import com.carrefour.fid.android.shared.constant.C28547h2;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.inject.Singleton;
import kotlin.collections.C10927c1;
import kotlin.collections.C10930d1;
import kotlin.collections.C10933e1;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Singleton
@C11363r0({"SMAP\nProductDetailCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductDetailCache.kt\ncom/carrefour/fid/android/product/domain/repositories/ProductDetailCache\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,32:1\n288#2,2:33\n*S KotlinDebug\n*F\n+ 1 ProductDetailCache.kt\ncom/carrefour/fid/android/product/domain/repositories/ProductDetailCache\n*L\n25#1:33,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.domain.repositories.f */
public final class C27600f {
    @C12579k

    /* renamed from: a */
    public final Map<C27601a, Set<C27586d>> f67066a = new LinkedHashMap();

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.domain.repositories.f$a */
    public static final class C27601a {

        /* renamed from: b */
        public static final int f67067b = 0;
        @C12579k

        /* renamed from: a */
        public final String f67068a;

        public C27601a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
            this.f67068a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C27601a m116172c(C27601a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f67068a;
            }
            return aVar.mo80205b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo80204a() {
            return this.f67068a;
        }

        @C12579k
        /* renamed from: b */
        public final C27601a mo80205b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
            return new C27601a(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo80206d() {
            return this.f67068a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27601a) && Intrinsics.areEqual((Object) this.f67068a, (Object) ((C27601a) obj).f67068a);
        }

        public int hashCode() {
            return this.f67068a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f67068a;
            return "Identifier(facilityServiceId=" + str + ")";
        }
    }

    /* renamed from: a */
    public final void mo80201a() {
        this.f67066a.clear();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.carrefour.fid.android.product.domain.model.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.carrefour.fid.android.product.domain.model.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.carrefour.fid.android.product.domain.model.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.carrefour.fid.android.product.domain.model.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.carrefour.fid.android.product.domain.model.C27586d mo80202b(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.product.domain.repositories.C27600f.C27601a r4, @org.jetbrains.annotations.C12579k java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "gtin"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.Map<com.carrefour.fid.android.product.domain.repositories.f$a, java.util.Set<com.carrefour.fid.android.product.domain.model.d>> r0 = r3.f67066a
            java.lang.Object r4 = r0.get(r4)
            java.util.Set r4 = (java.util.Set) r4
            r0 = 0
            if (r4 == 0) goto L_0x0039
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x001b:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0037
            java.lang.Object r1 = r4.next()
            r2 = r1
            com.carrefour.fid.android.product.domain.model.d r2 = (com.carrefour.fid.android.product.domain.model.C27586d) r2
            com.carrefour.fid.android.domain.models.product.detail.b r2 = r2.mo80095f()
            java.lang.String r2 = r2.mo118719a()
            boolean r2 = com.carrefour.fid.android.domain.models.product.Gtin.m157311e(r2, r5)
            if (r2 == 0) goto L_0x001b
            r0 = r1
        L_0x0037:
            com.carrefour.fid.android.product.domain.model.d r0 = (com.carrefour.fid.android.product.domain.model.C27586d) r0
        L_0x0039:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.repositories.C27600f.mo80202b(com.carrefour.fid.android.product.domain.repositories.f$a, java.lang.String):com.carrefour.fid.android.product.domain.model.d");
    }

    /* renamed from: c */
    public final void mo80203c(@C12579k C27601a aVar, @C12579k C27586d dVar) {
        Intrinsics.checkNotNullParameter(aVar, "id");
        Intrinsics.checkNotNullParameter(dVar, "product");
        this.f67066a.put(aVar, C10933e1.m40911C(C10927c1.m40883f(dVar), this.f67066a.getOrDefault(aVar, C10930d1.m40892k())));
    }
}
