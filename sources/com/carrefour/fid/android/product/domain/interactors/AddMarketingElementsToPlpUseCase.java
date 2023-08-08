package com.carrefour.fid.android.product.domain.interactors;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.paging.C36328a;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.interactors.criteo.C37672j;
import com.carrefour.fid.android.domain.interactors.product.C37802t;
import com.carrefour.fid.android.domain.interactors.utilities.C37890c;
import com.carrefour.fid.android.domain.models.C38184v;
import com.carrefour.fid.android.domain.models.category.C37993b;
import com.carrefour.fid.android.domain.models.criteo.C38001c;
import com.carrefour.fid.android.domain.models.criteo.C38006h;
import com.carrefour.fid.android.domain.models.criteo.C38007i;
import com.carrefour.fid.android.domain.models.criteo.C38009k;
import com.carrefour.fid.android.domain.models.criteo.CriteoEventType;
import com.carrefour.fid.android.domain.models.criteo.CriteoPageType;
import com.carrefour.fid.android.domain.models.luckycart.C38047a;
import com.carrefour.fid.android.domain.models.luckycart.C38048b;
import com.carrefour.fid.android.domain.models.luckycart.LuckyCartPageType;
import com.carrefour.fid.android.domain.models.product.ProductListParam;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.domain.models.service.models.FacilityServiceId;
import com.carrefour.fid.android.domain.utilities.C38207a;
import com.carrefour.fid.android.shared.constant.C28607x;
import com.carrefour.fid.android.shared.extension.C28789y;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.collections.C10976s;
import kotlin.collections.C10978t;
import kotlin.collections.C10994x;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAddMarketingElementsToPlpUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddMarketingElementsToPlpUseCase.kt\ncom/carrefour/fid/android/product/domain/interactors/AddMarketingElementsToPlpUseCase\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,303:1\n11365#2:304\n11700#2,3:305\n11365#2:308\n11700#2,3:309\n1549#3:312\n1620#3,3:313\n1549#3:316\n1620#3,3:317\n1855#3:320\n1855#3,2:321\n1856#3:323\n1855#3,2:324\n1855#3,2:326\n1549#3:329\n1620#3,3:330\n1#4:328\n*S KotlinDebug\n*F\n+ 1 AddMarketingElementsToPlpUseCase.kt\ncom/carrefour/fid/android/product/domain/interactors/AddMarketingElementsToPlpUseCase\n*L\n124#1:304\n124#1:305,3\n126#1:308\n126#1:309,3\n128#1:312\n128#1:313,3\n130#1:316\n130#1:317,3\n84#1:320\n88#1:321,2\n84#1:323\n98#1:324,2\n107#1:326,2\n225#1:329\n225#1:330,3\n*E\n"})
public final class AddMarketingElementsToPlpUseCase implements C37679f<C27519a, List<? extends C38184v>> {
    @C12579k

    /* renamed from: a */
    public final C37890c f66804a;
    @C12579k

    /* renamed from: b */
    public final C37802t f66805b;
    @C12579k

    /* renamed from: c */
    public final C37672j f66806c;
    @C12579k

    /* renamed from: d */
    public final Map<C37890c.C37891a, C38207a> f66807d = new LinkedHashMap();
    @C12579k

    /* renamed from: e */
    public final List<Integer> f66808e;
    @C12579k

    /* renamed from: f */
    public final List<Integer> f66809f;
    @C12579k

    /* renamed from: g */
    public final List<Integer> f66810g;
    @C12579k

    /* renamed from: v */
    public final List<Integer> f66811v;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase$a */
    public static final class C27519a {

        /* renamed from: c */
        public static final int f66812c = 8;
        @C12579k

        /* renamed from: a */
        public final C36328a<C38114b> f66813a;
        @C12579k

        /* renamed from: b */
        public final ProductListParam f66814b;

        public C27519a(@C12579k C36328a<C38114b> aVar, @C12579k ProductListParam productListParam) {
            Intrinsics.checkNotNullParameter(aVar, "pagingData");
            Intrinsics.checkNotNullParameter(productListParam, "productListParam");
            this.f66813a = aVar;
            this.f66814b = productListParam;
        }

        /* renamed from: d */
        public static /* synthetic */ C27519a m115830d(C27519a aVar, C36328a<C38114b> aVar2, ProductListParam productListParam, int i, Object obj) {
            if ((i & 1) != 0) {
                aVar2 = aVar.f66813a;
            }
            if ((i & 2) != 0) {
                productListParam = aVar.f66814b;
            }
            return aVar.mo79937c(aVar2, productListParam);
        }

        @C12579k
        /* renamed from: a */
        public final C36328a<C38114b> mo79935a() {
            return this.f66813a;
        }

        @C12579k
        /* renamed from: b */
        public final ProductListParam mo79936b() {
            return this.f66814b;
        }

        @C12579k
        /* renamed from: c */
        public final C27519a mo79937c(@C12579k C36328a<C38114b> aVar, @C12579k ProductListParam productListParam) {
            Intrinsics.checkNotNullParameter(aVar, "pagingData");
            Intrinsics.checkNotNullParameter(productListParam, "productListParam");
            return new C27519a(aVar, productListParam);
        }

        @C12579k
        /* renamed from: e */
        public final C36328a<C38114b> mo79938e() {
            return this.f66813a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27519a)) {
                return false;
            }
            C27519a aVar = (C27519a) obj;
            return Intrinsics.areEqual((Object) this.f66813a, (Object) aVar.f66813a) && Intrinsics.areEqual((Object) this.f66814b, (Object) aVar.f66814b);
        }

        @C12579k
        /* renamed from: f */
        public final ProductListParam mo79940f() {
            return this.f66814b;
        }

        public int hashCode() {
            return (this.f66813a.hashCode() * 31) + this.f66814b.hashCode();
        }

        @C12579k
        public String toString() {
            C36328a<C38114b> aVar = this.f66813a;
            ProductListParam productListParam = this.f66814b;
            return "Param(pagingData=" + aVar + ", productListParam=" + productListParam + ")";
        }
    }

    @Inject
    public AddMarketingElementsToPlpUseCase(@C12579k C37890c cVar, @C12579k C37802t tVar, @C12579k C37672j jVar) {
        Intrinsics.checkNotNullParameter(cVar, "getSponsoredItemsUseCase");
        Intrinsics.checkNotNullParameter(tVar, "shouldClearSponsoredItemsCacheUseCase");
        Intrinsics.checkNotNullParameter(jVar, "criteoTrackingUseCase");
        this.f66804a = cVar;
        this.f66805b = tVar;
        this.f66806c = jVar;
        int[] a = C28607x.m118508a();
        ArrayList arrayList = new ArrayList(a.length);
        int length = a.length;
        for (int i = 0; i < length; i++) {
            arrayList.add(Integer.valueOf(a[i] - 1));
        }
        this.f66808e = arrayList;
        int[] b = C28607x.m118509b();
        ArrayList arrayList2 = new ArrayList(b.length);
        int length2 = b.length;
        for (int i2 = 0; i2 < length2; i2++) {
            arrayList2.add(Integer.valueOf(b[i2] - 1));
        }
        this.f66809f = arrayList2;
        Iterable<Number> k = C10976s.m41419k(9);
        ArrayList arrayList3 = new ArrayList(C10978t.m41495Y(k, 10));
        for (Number intValue : k) {
            arrayList3.add(Integer.valueOf(intValue.intValue() - 1));
        }
        this.f66810g = arrayList3;
        Iterable<Number> k2 = C10976s.m41419k(7);
        ArrayList arrayList4 = new ArrayList(C10978t.m41495Y(k2, 10));
        for (Number intValue2 : k2) {
            arrayList4.add(Integer.valueOf(intValue2.intValue() - 1));
        }
        this.f66811v = arrayList4;
    }

    /* renamed from: c */
    public final List<C38184v> mo79922c(List<? extends C38184v> list, C38001c cVar, C38047a aVar) {
        List list2;
        C38047a i;
        if (cVar == null && aVar == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        for (Object next : list) {
            int i4 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            C38184v vVar = (C38184v) next;
            int i5 = i2 + i3;
            if (cVar != null) {
                C38007i f = mo79925f(cVar, i5);
                if (f != null) {
                    i3++;
                    list2 = CollectionsKt__CollectionsKt.m40448L(f, vVar);
                } else {
                    C38114b g = mo79926g(cVar, i5);
                    if (g != null) {
                        i3++;
                        list2 = CollectionsKt__CollectionsKt.m40448L(g, vVar);
                    } else {
                        C38009k h = mo79927h(cVar, i5);
                        if (h != null) {
                            i3++;
                            list2 = CollectionsKt__CollectionsKt.m40448L(h, vVar);
                        }
                    }
                }
                C10994x.m42360n0(arrayList, list2);
                i2 = i4;
            }
            if (aVar == null || (i = mo79928i(aVar, i5)) == null) {
                list2 = C10976s.m41419k(vVar);
                C10994x.m42360n0(arrayList, list2);
                i2 = i4;
            } else {
                i3++;
                list2 = CollectionsKt__CollectionsKt.m40448L(i, vVar);
                C10994x.m42360n0(arrayList, list2);
                i2 = i4;
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final List<C38184v> mo79923d(List<? extends C38184v> list, C38207a aVar) {
        C38001c e = aVar.mo119628e();
        C38047a aVar2 = null;
        if (e == null || !mo79931l(e)) {
            e = null;
        }
        C38047a f = aVar.mo119630f();
        if (f != null && mo79932m(f)) {
            aVar2 = f;
        }
        return mo79922c(list, e, aVar2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79924e(com.carrefour.fid.android.domain.interactors.utilities.C37890c.C37891a r11, kotlin.coroutines.C11045c<? super com.carrefour.fid.android.domain.utilities.C38207a> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.carrefour.fid.android.product.domain.interactors.C27520x1564ad9
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase$getAndSaveSponsoredItemsResult$1 r0 = (com.carrefour.fid.android.product.domain.interactors.C27520x1564ad9) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase$getAndSaveSponsoredItemsResult$1 r0 = new com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase$getAndSaveSponsoredItemsResult$1
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0052
            if (r2 == r4) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r11 = r0.L$2
            com.carrefour.fid.android.domain.utilities.a r11 = (com.carrefour.fid.android.domain.utilities.C38207a) r11
            java.lang.Object r1 = r0.L$1
            com.carrefour.fid.android.domain.interactors.utilities.c$a r1 = (com.carrefour.fid.android.domain.interactors.utilities.C37890c.C37891a) r1
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase r0 = (com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase) r0
            kotlin.C11661u0.m45747n(r12)
            goto L_0x007f
        L_0x0038:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0040:
            java.lang.Object r11 = r0.L$1
            com.carrefour.fid.android.domain.interactors.utilities.c$a r11 = (com.carrefour.fid.android.domain.interactors.utilities.C37890c.C37891a) r11
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase r2 = (com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase) r2
            kotlin.C11661u0.m45747n(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.mo21858l()
            goto L_0x0065
        L_0x0052:
            kotlin.C11661u0.m45747n(r12)
            com.carrefour.fid.android.domain.interactors.utilities.c r12 = r10.f66804a
            r0.L$0 = r10
            r0.L$1 = r11
            r0.label = r4
            java.lang.Object r12 = r12.m172966invokegIAlus(r11, r0)
            if (r12 != r1) goto L_0x0064
            return r1
        L_0x0064:
            r2 = r10
        L_0x0065:
            java.lang.Throwable r6 = kotlin.Result.m38705e(r12)
            if (r6 != 0) goto L_0x0085
            com.carrefour.fid.android.domain.utilities.a r12 = (com.carrefour.fid.android.domain.utilities.C38207a) r12
            r0.L$0 = r2
            r0.L$1 = r11
            r0.L$2 = r12
            r0.label = r3
            java.lang.Object r0 = r2.mo79934o(r12, r0)
            if (r0 != r1) goto L_0x007c
            return r1
        L_0x007c:
            r1 = r11
            r11 = r12
            r0 = r2
        L_0x007f:
            java.util.Map<com.carrefour.fid.android.domain.interactors.utilities.c$a, com.carrefour.fid.android.domain.utilities.a> r12 = r0.f66807d
            r12.put(r1, r11)
            goto L_0x009b
        L_0x0085:
            com.carrefour.fid.android.shared.util.i r4 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r5 = "getSponsoredItemsUseCase has failed"
            r7 = 0
            r8 = 4
            r9 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119706i(r4, r5, r6, r7, r8, r9)
            com.carrefour.fid.android.domain.utilities.a r12 = new com.carrefour.fid.android.domain.utilities.a
            r0 = 0
            r12.<init>(r0, r0)
            java.util.Map<com.carrefour.fid.android.domain.interactors.utilities.c$a, com.carrefour.fid.android.domain.utilities.a> r0 = r2.f66807d
            r0.put(r11, r12)
            r11 = r12
        L_0x009b:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase.mo79924e(com.carrefour.fid.android.domain.interactors.utilities.c$a, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: f */
    public final C38007i mo79925f(C38001c cVar, int i) {
        int indexOf = this.f66808e.indexOf(Integer.valueOf(i));
        if (indexOf >= 0) {
            return (C38007i) CollectionsKt___CollectionsKt.m40559R2(cVar.mo117413h(), indexOf);
        }
        return null;
    }

    /* renamed from: g */
    public final C38114b mo79926g(C38001c cVar, int i) {
        C38115c cVar2;
        int indexOf = this.f66809f.indexOf(Integer.valueOf(i));
        if (indexOf < 0 || (cVar2 = (C38115c) CollectionsKt___CollectionsKt.m40559R2(cVar.mo117416j().mo117543d(), indexOf)) == null) {
            return null;
        }
        return new C38114b(cVar2, 0, false, false, false, true, false, 94, (DefaultConstructorMarker) null);
    }

    /* renamed from: h */
    public final C38009k mo79927h(C38001c cVar, int i) {
        if (this.f66810g.indexOf(Integer.valueOf(i)) >= 0) {
            return cVar.mo117415i();
        }
        return null;
    }

    /* renamed from: i */
    public final C38047a mo79928i(C38047a aVar, int i) {
        if (this.f66811v.indexOf(Integer.valueOf(i)) >= 0) {
            return aVar;
        }
        return null;
    }

    /* renamed from: j */
    public final C38048b mo79929j(C27519a aVar) {
        ProductListParam f = aVar.mo79940f();
        if (f instanceof ProductListParam.Promo) {
            return new C38048b((String) null, LuckyCartPageType.PROMOTIONS, "banner", ((ProductListParam.Promo) aVar.mo79940f()).mo118510g(), ((ProductListParam.Promo) aVar.mo79940f()).mo118511h(), false, 33, (DefaultConstructorMarker) null);
        }
        if (f instanceof ProductListParam.Department) {
            LuckyCartPageType luckyCartPageType = LuckyCartPageType.CATEGORIES;
            String k = ((ProductListParam.Department) aVar.mo79940f()).mo118479k();
            return new C38048b((String) null, luckyCartPageType, "banner_" + k, ((ProductListParam.Department) aVar.mo79940f()).mo118480l(), ((ProductListParam.Department) aVar.mo79940f()).mo118482n(), false, 33, (DefaultConstructorMarker) null);
        } else if (!(f instanceof ProductListParam.Search)) {
            return null;
        } else {
            LuckyCartPageType luckyCartPageType2 = LuckyCartPageType.CATEGORIES;
            Integer j = aVar.mo79938e().mo108398j();
            return new C38048b((String) null, luckyCartPageType2, "banner_" + j, ((ProductListParam.Search) aVar.mo79940f()).mo118539h(), ((ProductListParam.Search) aVar.mo79940f()).mo118542j(), false, 33, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: k */
    public final C37890c.C37891a mo79930k(C27519a aVar) {
        C38006h hVar;
        Iterable<C38114b> E5 = CollectionsKt___CollectionsKt.m40497E5(aVar.mo79938e().mo108395h(), 10);
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(E5, 10));
        for (C38114b j : E5) {
            arrayList.add(j.mo118842j().mo118850A());
        }
        ProductListParam f = aVar.mo79940f();
        if (f instanceof ProductListParam.Search) {
            hVar = new C38006h(CriteoPageType.VIEW_SEARCH_RESULT, CriteoEventType.EVENT_TYPE_VIEW_SEARCH_RESULT, ((ProductListParam.Search) aVar.mo79940f()).mo118541i(), arrayList, (List) null, (List) null, (List) null, (List) null, aVar.mo79938e().mo108399k(), (Integer) null, (Boolean) null, (String) null, false, false, false, 32496, (DefaultConstructorMarker) null);
        } else if (f instanceof ProductListParam.Department) {
            hVar = new C38006h(CriteoPageType.VIEW_CATEGORY, CriteoEventType.EVENT_TYPE_VIEW_CATEGORY, (String) null, arrayList, ((ProductListParam.Department) aVar.mo79940f()).mo118478j(), (List) null, (List) null, (List) null, aVar.mo79938e().mo108399k(), (Integer) null, (Boolean) null, (String) null, false, false, false, 32484, (DefaultConstructorMarker) null);
        } else if (f instanceof ProductListParam.Promo) {
            hVar = new C38006h(CriteoPageType.VIEW_CATEGORY, CriteoEventType.EVENT_TYPE_VIEW_CATEGORY, (String) null, arrayList, C10976s.m41419k(C37993b.f95634a), (List) null, (List) null, (List) null, aVar.mo79938e().mo108399k(), (Integer) null, (Boolean) null, (String) null, false, false, false, 32484, (DefaultConstructorMarker) null);
        } else {
            hVar = new C38006h(CriteoPageType.VIEW_CATEGORY, CriteoEventType.EVENT_TYPE_VIEW_CATEGORY, (String) null, arrayList, (List) null, (List) null, (List) null, (List) null, aVar.mo79938e().mo108399k(), (Integer) null, (Boolean) null, (String) null, false, false, false, 32500, (DefaultConstructorMarker) null);
        }
        return new C37890c.C37891a(hVar, mo79929j(aVar), C28789y.m119118a(FacilityServiceId.m157958b(aVar.mo79940f().mo118467a())), aVar.mo79940f().mo118467a());
    }

    /* renamed from: l */
    public final boolean mo79931l(C38001c cVar) {
        return (cVar.mo117416j().mo117540a().isEmpty() ^ true) || (cVar.mo117413h().isEmpty() ^ true) || cVar.mo117415i() != null;
    }

    /* renamed from: m */
    public final boolean mo79932m(C38047a aVar) {
        return !C11622t.isBlank(aVar.mo117895g());
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172814invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase.C27519a r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<? extends com.carrefour.fid.android.domain.models.C38184v>>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase$invoke$1 r0 = (com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase$invoke$1 r0 = new com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase$invoke$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004e
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r7 = r0.L$1
            com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase$a r7 = (com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase.C27519a) r7
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase r0 = (com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase) r0
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0096
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003c:
            java.lang.Object r7 = r0.L$1
            com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase$a r7 = (com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase.C27519a) r7
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase r2 = (com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase) r2
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0061
        L_0x004e:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.domain.interactors.product.t r8 = r6.f66805b
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r8.m172965invokeIoAF18A(r0)
            if (r8 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r2 = r6
        L_0x0061:
            r4 = 0
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r4)
            boolean r5 = kotlin.Result.m38709i(r8)
            if (r5 == 0) goto L_0x006d
            r8 = r4
        L_0x006d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x007a
            java.util.Map<com.carrefour.fid.android.domain.interactors.utilities.c$a, com.carrefour.fid.android.domain.utilities.a> r8 = r2.f66807d
            r8.clear()
        L_0x007a:
            com.carrefour.fid.android.domain.interactors.utilities.c$a r8 = r2.mo79930k(r7)
            java.util.Map<com.carrefour.fid.android.domain.interactors.utilities.c$a, com.carrefour.fid.android.domain.utilities.a> r4 = r2.f66807d
            java.lang.Object r4 = r4.get(r8)
            com.carrefour.fid.android.domain.utilities.a r4 = (com.carrefour.fid.android.domain.utilities.C38207a) r4
            if (r4 != 0) goto L_0x009a
            r0.L$0 = r2
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = r2.mo79924e(r8, r0)
            if (r8 != r1) goto L_0x0095
            return r1
        L_0x0095:
            r0 = r2
        L_0x0096:
            r4 = r8
            com.carrefour.fid.android.domain.utilities.a r4 = (com.carrefour.fid.android.domain.utilities.C38207a) r4
            r2 = r0
        L_0x009a:
            kotlin.Result$a r8 = kotlin.Result.f28060a
            com.carrefour.fid.android.core.paging.a r7 = r7.mo79938e()
            java.util.List r7 = r7.mo108395h()
            java.util.List r7 = r2.mo79923d(r7, r4)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase.m172814invokegIAlus(com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c8, code lost:
        if (r2.hasNext() == false) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ca, code lost:
        r5 = (com.carrefour.fid.android.domain.models.criteo.C38007i) r2.next();
        r6 = r5.mo117516o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d4, code lost:
        if (r6 == null) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d6, code lost:
        r7 = r13.f66806c;
        r8 = new com.carrefour.fid.android.domain.interactors.criteo.C37672j.C37673a(r6, true);
        r0.L$0 = r13;
        r0.L$1 = r12;
        r0.L$2 = r2;
        r0.L$3 = r5;
        r0.label = 1;
        r6 = r7.m172966invokegIAlus(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00eb, code lost:
        if (r6 != r1) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ed, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ee, code lost:
        r9 = r5;
        r5 = r12;
        r12 = r9;
        r10 = r6;
        r6 = r13;
        r13 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f4, code lost:
        kotlin.Result.m38701a(r13);
        r13 = r6;
        r9 = r5;
        r5 = r12;
        r12 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00fb, code lost:
        r9 = r13;
        r13 = r12;
        r12 = r5.mo117513l().iterator();
        r5 = r2;
        r2 = r1;
        r1 = r0;
        r0 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0110, code lost:
        if (r12.hasNext() == false) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0112, code lost:
        r6 = ((com.carrefour.fid.android.domain.models.criteo.C38012n) r12.next()).mo117556l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x011c, code lost:
        if (r6 == null) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x011e, code lost:
        r7 = r0.f66806c;
        r8 = new com.carrefour.fid.android.domain.interactors.criteo.C37672j.C37673a(r6, true);
        r1.L$0 = r0;
        r1.L$1 = r13;
        r1.L$2 = r5;
        r1.L$3 = r12;
        r1.label = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0134, code lost:
        if (r7.m172966invokegIAlus(r8, r1) != r2) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0136, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0137, code lost:
        r6 = r0;
        r0 = r1;
        r1 = r2;
        r2 = r5;
        r5 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x013c, code lost:
        r13 = r5;
        r5 = r2;
        r2 = r1;
        r1 = r0;
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0142, code lost:
        r12 = r13;
        r13 = r0;
        r0 = r1;
        r1 = r2;
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0149, code lost:
        r2 = r12.mo117415i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x014d, code lost:
        if (r2 == null) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x014f, code lost:
        r2 = r2.mo117535m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0153, code lost:
        if (r2 == null) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0155, code lost:
        r5 = r13.f66806c;
        r6 = new com.carrefour.fid.android.domain.interactors.criteo.C37672j.C37673a(r2, true);
        r0.L$0 = r13;
        r0.L$1 = r12;
        r0.L$2 = null;
        r0.L$3 = null;
        r0.label = 3;
        r2 = r5.m172966invokegIAlus(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x016b, code lost:
        if (r2 != r1) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x016d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x016e, code lost:
        r9 = r2;
        r2 = r13;
        r13 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0171, code lost:
        kotlin.Result.m38701a(r13);
        r13 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0175, code lost:
        r2 = r12.mo117415i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0179, code lost:
        if (r2 == null) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x017b, code lost:
        r2 = r2.mo117532j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x017f, code lost:
        if (r2 == null) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0181, code lost:
        r5 = r13;
        r9 = r2.iterator();
        r2 = r12;
        r12 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x018f, code lost:
        if (r12.hasNext() == false) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0191, code lost:
        r13 = ((com.carrefour.fid.android.domain.models.criteo.C38012n) r12.next()).mo117556l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x019b, code lost:
        if (r13 == null) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x019d, code lost:
        r6 = r5.f66806c;
        r7 = new com.carrefour.fid.android.domain.interactors.criteo.C37672j.C37673a(r13, true);
        r0.L$0 = r5;
        r0.L$1 = r2;
        r0.L$2 = r12;
        r0.L$3 = null;
        r0.label = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01b3, code lost:
        if (r6.m172966invokegIAlus(r7, r0) != r1) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01b5, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01b6, code lost:
        r12 = r2;
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01b9, code lost:
        r2 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01ba, code lost:
        r13 = r12.mo117416j().mo117541b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01c2, code lost:
        if (r13 == null) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01c4, code lost:
        r5 = r2.f66806c;
        r6 = new com.carrefour.fid.android.domain.interactors.criteo.C37672j.C37673a(r13, true);
        r0.L$0 = r2;
        r0.L$1 = r12;
        r0.L$2 = null;
        r0.L$3 = null;
        r0.label = 5;
        r13 = r5.m172966invokegIAlus(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01da, code lost:
        if (r13 != r1) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01dc, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01dd, code lost:
        kotlin.Result.m38701a(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01e0, code lost:
        r12 = r12.mo117416j().mo117540a().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01f2, code lost:
        if (r12.hasNext() == false) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01f4, code lost:
        r13 = ((com.carrefour.fid.android.domain.models.criteo.C38012n) r12.next()).mo117556l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01fe, code lost:
        if (r13 == null) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0200, code lost:
        r5 = r2.f66806c;
        r6 = new com.carrefour.fid.android.domain.interactors.criteo.C37672j.C37673a(r13, true);
        r0.L$0 = r2;
        r0.L$1 = r12;
        r0.L$2 = null;
        r0.L$3 = null;
        r0.label = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0216, code lost:
        if (r5.m172966invokegIAlus(r6, r0) != r1) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0218, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x021b, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79934o(com.carrefour.fid.android.domain.utilities.C38207a r12, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase$sendCriteoBeaconTracking$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase$sendCriteoBeaconTracking$1 r0 = (com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase$sendCriteoBeaconTracking$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase$sendCriteoBeaconTracking$1 r0 = new com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase$sendCriteoBeaconTracking$1
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            switch(r2) {
                case 0: goto L_0x00af;
                case 1: goto L_0x0095;
                case 2: goto L_0x007b;
                case 3: goto L_0x0068;
                case 4: goto L_0x0052;
                case 5: goto L_0x003f;
                case 6: goto L_0x002d;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x002d:
            java.lang.Object r12 = r0.L$1
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase r2 = (com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase) r2
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result r13 = (kotlin.Result) r13
            r13.mo21858l()
            goto L_0x01ee
        L_0x003f:
            java.lang.Object r12 = r0.L$1
            com.carrefour.fid.android.domain.models.criteo.c r12 = (com.carrefour.fid.android.domain.models.criteo.C38001c) r12
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase r2 = (com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase) r2
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result r13 = (kotlin.Result) r13
            java.lang.Object r13 = r13.mo21858l()
            goto L_0x01dd
        L_0x0052:
            java.lang.Object r12 = r0.L$2
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.domain.models.criteo.c r2 = (com.carrefour.fid.android.domain.models.criteo.C38001c) r2
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase r5 = (com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase) r5
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result r13 = (kotlin.Result) r13
            r13.mo21858l()
            goto L_0x018b
        L_0x0068:
            java.lang.Object r12 = r0.L$1
            com.carrefour.fid.android.domain.models.criteo.c r12 = (com.carrefour.fid.android.domain.models.criteo.C38001c) r12
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase r2 = (com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase) r2
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result r13 = (kotlin.Result) r13
            java.lang.Object r13 = r13.mo21858l()
            goto L_0x0171
        L_0x007b:
            java.lang.Object r12 = r0.L$3
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r2 = r0.L$2
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r5 = r0.L$1
            com.carrefour.fid.android.domain.models.criteo.c r5 = (com.carrefour.fid.android.domain.models.criteo.C38001c) r5
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase r6 = (com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase) r6
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result r13 = (kotlin.Result) r13
            r13.mo21858l()
            goto L_0x013c
        L_0x0095:
            java.lang.Object r12 = r0.L$3
            com.carrefour.fid.android.domain.models.criteo.i r12 = (com.carrefour.fid.android.domain.models.criteo.C38007i) r12
            java.lang.Object r2 = r0.L$2
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r5 = r0.L$1
            com.carrefour.fid.android.domain.models.criteo.c r5 = (com.carrefour.fid.android.domain.models.criteo.C38001c) r5
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase r6 = (com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase) r6
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result r13 = (kotlin.Result) r13
            java.lang.Object r13 = r13.mo21858l()
            goto L_0x00f4
        L_0x00af:
            kotlin.C11661u0.m45747n(r13)
            com.carrefour.fid.android.domain.models.criteo.c r12 = r12.mo119628e()
            if (r12 == 0) goto L_0x0219
            java.util.List r13 = r12.mo117413h()
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Iterator r13 = r13.iterator()
            r2 = r13
            r13 = r11
        L_0x00c4:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0149
            java.lang.Object r5 = r2.next()
            com.carrefour.fid.android.domain.models.criteo.i r5 = (com.carrefour.fid.android.domain.models.criteo.C38007i) r5
            java.lang.String r6 = r5.mo117516o()
            if (r6 == 0) goto L_0x00fb
            com.carrefour.fid.android.domain.interactors.criteo.j r7 = r13.f66806c
            com.carrefour.fid.android.domain.interactors.criteo.j$a r8 = new com.carrefour.fid.android.domain.interactors.criteo.j$a
            r8.<init>(r6, r4)
            r0.L$0 = r13
            r0.L$1 = r12
            r0.L$2 = r2
            r0.L$3 = r5
            r0.label = r4
            java.lang.Object r6 = r7.m172966invokegIAlus(r8, r0)
            if (r6 != r1) goto L_0x00ee
            return r1
        L_0x00ee:
            r9 = r5
            r5 = r12
            r12 = r9
            r10 = r6
            r6 = r13
            r13 = r10
        L_0x00f4:
            kotlin.Result.m38701a(r13)
            r13 = r6
            r9 = r5
            r5 = r12
            r12 = r9
        L_0x00fb:
            java.util.List r5 = r5.mo117513l()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            r9 = r13
            r13 = r12
            r12 = r5
            r5 = r2
            r2 = r1
            r1 = r0
            r0 = r9
        L_0x010c:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto L_0x0142
            java.lang.Object r6 = r12.next()
            com.carrefour.fid.android.domain.models.criteo.n r6 = (com.carrefour.fid.android.domain.models.criteo.C38012n) r6
            java.lang.String r6 = r6.mo117556l()
            if (r6 == 0) goto L_0x010c
            com.carrefour.fid.android.domain.interactors.criteo.j r7 = r0.f66806c
            com.carrefour.fid.android.domain.interactors.criteo.j$a r8 = new com.carrefour.fid.android.domain.interactors.criteo.j$a
            r8.<init>(r6, r4)
            r1.L$0 = r0
            r1.L$1 = r13
            r1.L$2 = r5
            r1.L$3 = r12
            r6 = 2
            r1.label = r6
            java.lang.Object r6 = r7.m172966invokegIAlus(r8, r1)
            if (r6 != r2) goto L_0x0137
            return r2
        L_0x0137:
            r6 = r0
            r0 = r1
            r1 = r2
            r2 = r5
            r5 = r13
        L_0x013c:
            r13 = r5
            r5 = r2
            r2 = r1
            r1 = r0
            r0 = r6
            goto L_0x010c
        L_0x0142:
            r12 = r13
            r13 = r0
            r0 = r1
            r1 = r2
            r2 = r5
            goto L_0x00c4
        L_0x0149:
            com.carrefour.fid.android.domain.models.criteo.k r2 = r12.mo117415i()
            if (r2 == 0) goto L_0x0175
            java.lang.String r2 = r2.mo117535m()
            if (r2 == 0) goto L_0x0175
            com.carrefour.fid.android.domain.interactors.criteo.j r5 = r13.f66806c
            com.carrefour.fid.android.domain.interactors.criteo.j$a r6 = new com.carrefour.fid.android.domain.interactors.criteo.j$a
            r6.<init>(r2, r4)
            r0.L$0 = r13
            r0.L$1 = r12
            r0.L$2 = r3
            r0.L$3 = r3
            r2 = 3
            r0.label = r2
            java.lang.Object r2 = r5.m172966invokegIAlus(r6, r0)
            if (r2 != r1) goto L_0x016e
            return r1
        L_0x016e:
            r9 = r2
            r2 = r13
            r13 = r9
        L_0x0171:
            kotlin.Result.m38701a(r13)
            r13 = r2
        L_0x0175:
            com.carrefour.fid.android.domain.models.criteo.k r2 = r12.mo117415i()
            if (r2 == 0) goto L_0x01b9
            java.util.List r2 = r2.mo117532j()
            if (r2 == 0) goto L_0x01b9
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
            r5 = r13
            r9 = r2
            r2 = r12
            r12 = r9
        L_0x018b:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x01b6
            java.lang.Object r13 = r12.next()
            com.carrefour.fid.android.domain.models.criteo.n r13 = (com.carrefour.fid.android.domain.models.criteo.C38012n) r13
            java.lang.String r13 = r13.mo117556l()
            if (r13 == 0) goto L_0x018b
            com.carrefour.fid.android.domain.interactors.criteo.j r6 = r5.f66806c
            com.carrefour.fid.android.domain.interactors.criteo.j$a r7 = new com.carrefour.fid.android.domain.interactors.criteo.j$a
            r7.<init>(r13, r4)
            r0.L$0 = r5
            r0.L$1 = r2
            r0.L$2 = r12
            r0.L$3 = r3
            r13 = 4
            r0.label = r13
            java.lang.Object r13 = r6.m172966invokegIAlus(r7, r0)
            if (r13 != r1) goto L_0x018b
            return r1
        L_0x01b6:
            r12 = r2
            r2 = r5
            goto L_0x01ba
        L_0x01b9:
            r2 = r13
        L_0x01ba:
            com.carrefour.fid.android.domain.models.criteo.m r13 = r12.mo117416j()
            java.lang.String r13 = r13.mo117541b()
            if (r13 == 0) goto L_0x01e0
            com.carrefour.fid.android.domain.interactors.criteo.j r5 = r2.f66806c
            com.carrefour.fid.android.domain.interactors.criteo.j$a r6 = new com.carrefour.fid.android.domain.interactors.criteo.j$a
            r6.<init>(r13, r4)
            r0.L$0 = r2
            r0.L$1 = r12
            r0.L$2 = r3
            r0.L$3 = r3
            r13 = 5
            r0.label = r13
            java.lang.Object r13 = r5.m172966invokegIAlus(r6, r0)
            if (r13 != r1) goto L_0x01dd
            return r1
        L_0x01dd:
            kotlin.Result.m38701a(r13)
        L_0x01e0:
            com.carrefour.fid.android.domain.models.criteo.m r12 = r12.mo117416j()
            java.util.List r12 = r12.mo117540a()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
        L_0x01ee:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0219
            java.lang.Object r13 = r12.next()
            com.carrefour.fid.android.domain.models.criteo.n r13 = (com.carrefour.fid.android.domain.models.criteo.C38012n) r13
            java.lang.String r13 = r13.mo117556l()
            if (r13 == 0) goto L_0x01ee
            com.carrefour.fid.android.domain.interactors.criteo.j r5 = r2.f66806c
            com.carrefour.fid.android.domain.interactors.criteo.j$a r6 = new com.carrefour.fid.android.domain.interactors.criteo.j$a
            r6.<init>(r13, r4)
            r0.L$0 = r2
            r0.L$1 = r12
            r0.L$2 = r3
            r0.L$3 = r3
            r13 = 6
            r0.label = r13
            java.lang.Object r13 = r5.m172966invokegIAlus(r6, r0)
            if (r13 != r1) goto L_0x01ee
            return r1
        L_0x0219:
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase.mo79934o(com.carrefour.fid.android.domain.utilities.a, kotlin.coroutines.c):java.lang.Object");
    }
}
