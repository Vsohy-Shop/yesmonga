package com.carrefour.fid.android.domain.interactors.product.list;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.OfferProductDomain;
import com.carrefour.fid.android.domain.repositories.C38199h;
import java.util.List;
import javax.inject.Inject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
public final class GetOfferProductListUseCase implements C37679f<C37765a, List<? extends OfferProductDomain>> {

    /* renamed from: b */
    public static final int f94759b = 8;
    @C12579k

    /* renamed from: a */
    public final C38199h f94760a;

    @Inject
    public GetOfferProductListUseCase(@C12579k C38199h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "productsRepository");
        this.f94760a = hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172988invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase.C37765a r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.OfferProductDomain>>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase$invoke$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.mo21858l()
            goto L_0x0051
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.domain.repositories.h r7 = r5.f94760a
            java.util.List r2 = r6.mo115040g()
            boolean r4 = r6.mo115041h()
            java.lang.String r6 = r6.mo115039f()
            r0.label = r3
            java.lang.Object r6 = r7.mo111474c(r2, r4, r6, r0)
            if (r6 != r1) goto L_0x0051
            return r1
        L_0x0051:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase.m172988invokegIAlus(com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase$a */
    public static final class C37765a {

        /* renamed from: d */
        public static final int f94761d = 8;
        @C12579k

        /* renamed from: a */
        public final List<String> f94762a;

        /* renamed from: b */
        public final boolean f94763b;
        @C12580l

        /* renamed from: c */
        public final String f94764c;

        public C37765a(@C12579k List<String> list, boolean z, @C12580l String str) {
            Intrinsics.checkNotNullParameter(list, "gtinList");
            this.f94762a = list;
            this.f94763b = z;
            this.f94764c = str;
        }

        /* renamed from: e */
        public static /* synthetic */ C37765a m154782e(C37765a aVar, List<String> list, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = aVar.f94762a;
            }
            if ((i & 2) != 0) {
                z = aVar.f94763b;
            }
            if ((i & 4) != 0) {
                str = aVar.f94764c;
            }
            return aVar.mo115037d(list, z, str);
        }

        @C12579k
        /* renamed from: a */
        public final List<String> mo115034a() {
            return this.f94762a;
        }

        /* renamed from: b */
        public final boolean mo115035b() {
            return this.f94763b;
        }

        @C12580l
        /* renamed from: c */
        public final String mo115036c() {
            return this.f94764c;
        }

        @C12579k
        /* renamed from: d */
        public final C37765a mo115037d(@C12579k List<String> list, boolean z, @C12580l String str) {
            Intrinsics.checkNotNullParameter(list, "gtinList");
            return new C37765a(list, z, str);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37765a)) {
                return false;
            }
            C37765a aVar = (C37765a) obj;
            return Intrinsics.areEqual((Object) this.f94762a, (Object) aVar.f94762a) && this.f94763b == aVar.f94763b && Intrinsics.areEqual((Object) this.f94764c, (Object) aVar.f94764c);
        }

        @C12580l
        /* renamed from: f */
        public final String mo115039f() {
            return this.f94764c;
        }

        @C12579k
        /* renamed from: g */
        public final List<String> mo115040g() {
            return this.f94762a;
        }

        /* renamed from: h */
        public final boolean mo115041h() {
            return this.f94763b;
        }

        public int hashCode() {
            int hashCode = this.f94762a.hashCode() * 31;
            boolean z = this.f94763b;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            String str = this.f94764c;
            return i + (str == null ? 0 : str.hashCode());
        }

        @C12579k
        public String toString() {
            List<String> list = this.f94762a;
            boolean z = this.f94763b;
            String str = this.f94764c;
            return "Param(gtinList=" + list + ", hasFidCard=" + z + ", facilityServiceId=" + str + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37765a(List list, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, z, (i & 4) != 0 ? null : str);
        }
    }
}
