package com.carrefour.fid.android.presentation.models.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.BasketDomain;
import com.carrefour.fid.android.domain.models.C37954b0;
import com.carrefour.fid.android.domain.models.C38185w;
import com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38033d;
import com.carrefour.fid.android.presentation.models.ProductListResultModel;
import com.carrefour.fid.android.shared.base.C28486g;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.comparisons.C11006g;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nProductsResultModelDataMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductsResultModelDataMapper.kt\ncom/carrefour/fid/android/presentation/models/mapper/ProductsResultModelDataMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1549#2:66\n1620#2,2:67\n1045#2:69\n1549#2:70\n1620#2,3:71\n1622#2:74\n1549#2:75\n1620#2,2:76\n1747#2,3:78\n1622#2:82\n1#3:81\n*S KotlinDebug\n*F\n+ 1 ProductsResultModelDataMapper.kt\ncom/carrefour/fid/android/presentation/models/mapper/ProductsResultModelDataMapper\n*L\n23#1:66\n23#1:67,2\n28#1:69\n28#1:70\n28#1:71,3\n23#1:74\n40#1:75\n40#1:76,2\n42#1:78,3\n40#1:82\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.models.mapper.l */
public final class C38514l extends C28486g<C38515a, ProductListResultModel> {

    /* renamed from: b */
    public static final int f97645b = 0;

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ProductsResultModelDataMapper.kt\ncom/carrefour/fid/android/presentation/models/mapper/ProductsResultModelDataMapper\n*L\n1#1,328:1\n28#2:329\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.models.mapper.l$b */
    public static final class C38516b<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C11006g.m42424l(((C37954b0) t).mo116813h(), ((C37954b0) t2).mo116813h());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c2, code lost:
        if (r1 != null) goto L_0x01ca;
     */
    @org.jetbrains.annotations.C12579k
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.presentation.models.ProductListResultModel mo72340a(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.models.mapper.C38514l.C38515a r17) {
        /*
            r16 = this;
            java.lang.String r0 = "entity"
            r1 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            com.carrefour.fid.android.presentation.models.PageModel r0 = new com.carrefour.fid.android.presentation.models.PageModel
            com.carrefour.fid.android.domain.models.w r2 = r17.mo122130g()
            com.carrefour.fid.android.domain.models.t r2 = r2.mo119581h()
            int r2 = r2.mo119562e()
            com.carrefour.fid.android.domain.models.w r3 = r17.mo122130g()
            com.carrefour.fid.android.domain.models.t r3 = r3.mo119581h()
            int r3 = r3.mo119564f()
            com.carrefour.fid.android.domain.models.w r4 = r17.mo122130g()
            java.util.List r4 = r4.mo119580g()
            r5 = 0
            if (r4 == 0) goto L_0x0031
            int r4 = r4.size()
            goto L_0x0032
        L_0x0031:
            r4 = r5
        L_0x0032:
            int r3 = java.lang.Integer.max(r3, r4)
            r0.<init>(r2, r3)
            com.carrefour.fid.android.domain.models.w r2 = r17.mo122130g()
            java.util.List r2 = r2.mo119579f()
            r3 = 10
            if (r2 == 0) goto L_0x00bd
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            int r6 = kotlin.collections.C10978t.m41495Y(r2, r3)
            r4.<init>(r6)
            java.util.Iterator r2 = r2.iterator()
        L_0x0054:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x00c1
            java.lang.Object r6 = r2.next()
            com.carrefour.fid.android.domain.models.j r6 = (com.carrefour.fid.android.domain.models.C38040j) r6
            java.lang.String r8 = r6.mo117774j()
            java.lang.String r9 = r6.mo117778n()
            int r10 = r6.mo117777m()
            java.util.List r7 = r6.mo117776l()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            com.carrefour.fid.android.presentation.models.mapper.l$b r11 = new com.carrefour.fid.android.presentation.models.mapper.l$b
            r11.<init>()
            java.util.List r7 = kotlin.collections.CollectionsKt___CollectionsKt.m40675p5(r7, r11)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = kotlin.collections.C10978t.m41495Y(r7, r3)
            r11.<init>(r12)
            java.util.Iterator r7 = r7.iterator()
        L_0x008a:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L_0x00ab
            java.lang.Object r12 = r7.next()
            com.carrefour.fid.android.domain.models.b0 r12 = (com.carrefour.fid.android.domain.models.C37954b0) r12
            com.carrefour.fid.android.presentation.models.TermModel r13 = new com.carrefour.fid.android.presentation.models.TermModel
            java.lang.String r14 = r12.mo116813h()
            java.lang.String r15 = r12.mo116811f()
            boolean r12 = r12.mo116812g()
            r13.<init>(r14, r15, r12)
            r11.add(r13)
            goto L_0x008a
        L_0x00ab:
            java.lang.String r12 = r6.mo117773i()
            boolean r13 = r6.mo117775k()
            com.carrefour.fid.android.presentation.models.FacetModel r6 = new com.carrefour.fid.android.presentation.models.FacetModel
            r7 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r4.add(r6)
            goto L_0x0054
        L_0x00bd:
            java.util.List r4 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x00c1:
            com.carrefour.fid.android.domain.models.w r2 = r17.mo122130g()
            java.util.List r2 = r2.mo119580g()
            if (r2 == 0) goto L_0x01c5
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r6 = new java.util.ArrayList
            int r3 = kotlin.collections.C10978t.m41495Y(r2, r3)
            r6.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x00da:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01be
            java.lang.Object r3 = r2.next()
            com.carrefour.fid.android.domain.models.OfferProductDomain r3 = (com.carrefour.fid.android.domain.models.OfferProductDomain) r3
            java.util.List r7 = r17.mo122131h()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r8 = r7 instanceof java.util.Collection
            r9 = 1
            r10 = 0
            if (r8 == 0) goto L_0x00fd
            r8 = r7
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x00fd
        L_0x00fb:
            r7 = r5
            goto L_0x0124
        L_0x00fd:
            java.util.Iterator r7 = r7.iterator()
        L_0x0101:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00fb
            java.lang.Object r8 = r7.next()
            com.carrefour.fid.android.domain.models.favorites.shoppinglist.d r8 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38033d) r8
            java.lang.String r8 = r8.mo117724a()
            com.carrefour.fid.android.domain.models.ProductDomain r11 = r3.mo116032Q()
            if (r11 == 0) goto L_0x011c
            java.lang.String r11 = r11.mo116544s()
            goto L_0x011d
        L_0x011c:
            r11 = r10
        L_0x011d:
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r11)
            if (r8 == 0) goto L_0x0101
            r7 = r9
        L_0x0124:
            r3.mo116043a0(r7)
            com.carrefour.fid.android.domain.models.BasketDomain r7 = r17.mo122129f()
            if (r7 == 0) goto L_0x0169
            java.util.List r7 = r7.mo115459B()
            if (r7 == 0) goto L_0x0169
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x0139:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0165
            java.lang.Object r8 = r7.next()
            r11 = r8
            com.carrefour.fid.android.domain.models.BasketOfferDomain r11 = (com.carrefour.fid.android.domain.models.BasketOfferDomain) r11
            com.carrefour.fid.android.domain.models.ProductDomain r11 = r11.mo115540A()
            if (r11 == 0) goto L_0x0151
            java.lang.String r11 = r11.mo116544s()
            goto L_0x0152
        L_0x0151:
            r11 = r10
        L_0x0152:
            com.carrefour.fid.android.domain.models.ProductDomain r12 = r3.mo116032Q()
            if (r12 == 0) goto L_0x015d
            java.lang.String r12 = r12.mo116544s()
            goto L_0x015e
        L_0x015d:
            r12 = r10
        L_0x015e:
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r12)
            if (r11 == 0) goto L_0x0139
            goto L_0x0166
        L_0x0165:
            r8 = r10
        L_0x0166:
            com.carrefour.fid.android.domain.models.BasketOfferDomain r8 = (com.carrefour.fid.android.domain.models.BasketOfferDomain) r8
            goto L_0x016a
        L_0x0169:
            r8 = r10
        L_0x016a:
            if (r8 == 0) goto L_0x0171
            int r7 = r8.mo115541B()
            goto L_0x0172
        L_0x0171:
            r7 = r5
        L_0x0172:
            r3.mo116057g0(r7)
            if (r8 == 0) goto L_0x017d
            java.lang.Integer r7 = r8.mo115572w()
            if (r7 != 0) goto L_0x0181
        L_0x017d:
            java.lang.Integer r7 = r3.mo116028M()
        L_0x0181:
            r3.mo116052e0(r7)
            if (r8 == 0) goto L_0x018c
            java.lang.Integer r7 = r8.mo115570u()
            if (r7 != 0) goto L_0x0190
        L_0x018c:
            java.lang.Integer r7 = r3.mo116027L()
        L_0x0190:
            r3.mo116049d0(r7)
            if (r8 == 0) goto L_0x019b
            java.lang.Integer r7 = r8.mo115568t()
            if (r7 != 0) goto L_0x01a9
        L_0x019b:
            java.lang.Integer r7 = r3.mo116025J()
            if (r7 == 0) goto L_0x01a5
            int r9 = r7.intValue()
        L_0x01a5:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
        L_0x01a9:
            r3.mo116045b0(r7)
            if (r8 == 0) goto L_0x01b2
            java.lang.Double r10 = r8.mo115576z()
        L_0x01b2:
            r3.mo116055f0(r10)
            com.carrefour.fid.android.presentation.models.OfferProductModel r3 = com.carrefour.fid.android.domain.extension.C37507h.m153956h(r3)
            r6.add(r3)
            goto L_0x00da
        L_0x01be:
            java.util.List r1 = kotlin.collections.CollectionsKt___CollectionsKt.m40572T5(r6)
            if (r1 == 0) goto L_0x01c5
            goto L_0x01ca
        L_0x01c5:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x01ca:
            com.carrefour.fid.android.presentation.models.ProductListResultModel r2 = new com.carrefour.fid.android.presentation.models.ProductListResultModel
            r2.<init>(r0, r4, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.models.mapper.C38514l.mo72340a(com.carrefour.fid.android.presentation.models.mapper.l$a):com.carrefour.fid.android.presentation.models.ProductListResultModel");
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.models.mapper.l$a */
    public static final class C38515a {

        /* renamed from: d */
        public static final int f97646d = 8;
        @C12579k

        /* renamed from: a */
        public final C38185w f97647a;
        @C12579k

        /* renamed from: b */
        public final List<C38033d> f97648b;
        @C12580l

        /* renamed from: c */
        public final BasketDomain f97649c;

        public C38515a(@C12579k C38185w wVar, @C12579k List<? extends C38033d> list, @C12580l BasketDomain basketDomain) {
            Intrinsics.checkNotNullParameter(wVar, "productsResultDomain");
            Intrinsics.checkNotNullParameter(list, "shoppingListProduct");
            this.f97647a = wVar;
            this.f97648b = list;
            this.f97649c = basketDomain;
        }

        /* renamed from: e */
        public static /* synthetic */ C38515a m159785e(C38515a aVar, C38185w wVar, List<C38033d> list, BasketDomain basketDomain, int i, Object obj) {
            if ((i & 1) != 0) {
                wVar = aVar.f97647a;
            }
            if ((i & 2) != 0) {
                list = aVar.f97648b;
            }
            if ((i & 4) != 0) {
                basketDomain = aVar.f97649c;
            }
            return aVar.mo122127d(wVar, list, basketDomain);
        }

        @C12579k
        /* renamed from: a */
        public final C38185w mo122124a() {
            return this.f97647a;
        }

        @C12579k
        /* renamed from: b */
        public final List<C38033d> mo122125b() {
            return this.f97648b;
        }

        @C12580l
        /* renamed from: c */
        public final BasketDomain mo122126c() {
            return this.f97649c;
        }

        @C12579k
        /* renamed from: d */
        public final C38515a mo122127d(@C12579k C38185w wVar, @C12579k List<? extends C38033d> list, @C12580l BasketDomain basketDomain) {
            Intrinsics.checkNotNullParameter(wVar, "productsResultDomain");
            Intrinsics.checkNotNullParameter(list, "shoppingListProduct");
            return new C38515a(wVar, list, basketDomain);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C38515a)) {
                return false;
            }
            C38515a aVar = (C38515a) obj;
            return Intrinsics.areEqual((Object) this.f97647a, (Object) aVar.f97647a) && Intrinsics.areEqual((Object) this.f97648b, (Object) aVar.f97648b) && Intrinsics.areEqual((Object) this.f97649c, (Object) aVar.f97649c);
        }

        @C12580l
        /* renamed from: f */
        public final BasketDomain mo122129f() {
            return this.f97649c;
        }

        @C12579k
        /* renamed from: g */
        public final C38185w mo122130g() {
            return this.f97647a;
        }

        @C12579k
        /* renamed from: h */
        public final List<C38033d> mo122131h() {
            return this.f97648b;
        }

        public int hashCode() {
            int hashCode = ((this.f97647a.hashCode() * 31) + this.f97648b.hashCode()) * 31;
            BasketDomain basketDomain = this.f97649c;
            return hashCode + (basketDomain == null ? 0 : basketDomain.hashCode());
        }

        @C12579k
        public String toString() {
            C38185w wVar = this.f97647a;
            List<C38033d> list = this.f97648b;
            BasketDomain basketDomain = this.f97649c;
            return "Params(productsResultDomain=" + wVar + ", shoppingListProduct=" + list + ", basket=" + basketDomain + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C38515a(C38185w wVar, List list, BasketDomain basketDomain, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(wVar, (i & 2) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, (i & 4) != 0 ? null : basketDomain);
        }
    }
}
