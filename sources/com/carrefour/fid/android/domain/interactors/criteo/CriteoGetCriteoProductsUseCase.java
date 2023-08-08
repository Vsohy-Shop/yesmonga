package com.carrefour.fid.android.domain.interactors.criteo;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.repositories.APIMProductDetailsRepository;
import com.carrefour.fid.android.data.repositories.CriteoRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37569f0;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37681b;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nCriteoGetCriteoProductsUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CriteoGetCriteoProductsUseCase.kt\ncom/carrefour/fid/android/domain/interactors/criteo/CriteoGetCriteoProductsUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,193:1\n1#2:194\n1549#3:195\n1620#3,3:196\n1549#3:199\n1620#3,3:200\n1549#3:203\n1620#3,3:204\n1549#3:207\n1620#3,3:208\n1549#3:211\n1620#3,3:212\n1549#3:215\n1620#3,3:216\n1549#3:219\n1620#3,3:220\n766#3:223\n857#3,2:224\n1549#3:226\n1620#3,3:227\n766#3:230\n857#3,2:231\n766#3:233\n857#3,2:234\n1549#3:236\n1620#3,3:237\n766#3:240\n857#3,2:241\n1855#3:243\n1864#3,3:244\n1856#3:247\n*S KotlinDebug\n*F\n+ 1 CriteoGetCriteoProductsUseCase.kt\ncom/carrefour/fid/android/domain/interactors/criteo/CriteoGetCriteoProductsUseCase\n*L\n56#1:195\n56#1:196,3\n57#1:199\n57#1:200,3\n59#1:203\n59#1:204,3\n92#1:207\n92#1:208,3\n97#1:211\n97#1:212,3\n99#1:215\n99#1:216,3\n99#1:219\n99#1:220,3\n111#1:223\n111#1:224,2\n116#1:226\n116#1:227,3\n118#1:230\n118#1:231,2\n130#1:233\n130#1:234,2\n137#1:236\n137#1:237,3\n140#1:240\n140#1:241,2\n149#1:243\n154#1:244,3\n149#1:247\n*E\n"})
public final class CriteoGetCriteoProductsUseCase implements C37666g {

    /* renamed from: f */
    public static final int f94493f = 8;
    @C12579k

    /* renamed from: a */
    public final CriteoRepository f94494a;
    @C12579k

    /* renamed from: b */
    public final APIMProductDetailsRepository f94495b;
    @C12579k

    /* renamed from: c */
    public final C37807b f94496c;
    @C12579k

    /* renamed from: d */
    public final C37681b f94497d;
    @C12579k

    /* renamed from: e */
    public final C37569f0 f94498e;

    @Inject
    public CriteoGetCriteoProductsUseCase(@C12579k CriteoRepository criteoRepository, @C12579k APIMProductDetailsRepository aPIMProductDetailsRepository, @C12579k C37807b bVar, @C12579k C37681b bVar2, @C12579k C37569f0 f0Var) {
        Intrinsics.checkNotNullParameter(criteoRepository, "criteoRepository");
        Intrinsics.checkNotNullParameter(aPIMProductDetailsRepository, "productsRepository");
        Intrinsics.checkNotNullParameter(bVar, "remoteConfigRepository");
        Intrinsics.checkNotNullParameter(bVar2, "getShoppingListUseCase");
        Intrinsics.checkNotNullParameter(f0Var, "retrieveBasketUseCase");
        this.f94494a = criteoRepository;
        this.f94495b = aPIMProductDetailsRepository;
        this.f94496c = bVar;
        this.f94497d = bVar2;
        this.f94498e = f0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:134:0x0407  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0156 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01c4 A[LOOP:2: B:57:0x01be->B:59:0x01c4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114642c(java.lang.Object r52, java.util.List<java.lang.String> r53, com.carrefour.fid.android.domain.models.criteo.C38014p r54, java.util.List<java.lang.String> r55, java.util.List<java.lang.String> r56, boolean r57, com.carrefour.fid.android.domain.models.criteo.C38002d r58, com.carrefour.fid.android.domain.interactors.criteo.C37666g.C37667a r59, kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.criteo.C38014p>> r60) {
        /*
            r51 = this;
            r0 = r51
            r1 = r60
            boolean r2 = r1 instanceof com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCriteoProductsUseCase$consolidate$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCriteoProductsUseCase$consolidate$1 r2 = (com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCriteoProductsUseCase$consolidate$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCriteoProductsUseCase$consolidate$1 r2 = new com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCriteoProductsUseCase$consolidate$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 2
            r6 = 10
            r8 = 1
            if (r4 == 0) goto L_0x00a9
            if (r4 == r8) goto L_0x0067
            if (r4 != r5) goto L_0x005f
            boolean r3 = r2.Z$0
            java.lang.Object r4 = r2.L$8
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r2.L$7
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r9 = r2.L$6
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r2.L$5
            com.carrefour.fid.android.domain.interactors.criteo.g$a r10 = (com.carrefour.fid.android.domain.interactors.criteo.C37666g.C37667a) r10
            java.lang.Object r11 = r2.L$4
            com.carrefour.fid.android.domain.models.criteo.d r11 = (com.carrefour.fid.android.domain.models.criteo.C38002d) r11
            java.lang.Object r12 = r2.L$3
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r13 = r2.L$2
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r14 = r2.L$1
            com.carrefour.fid.android.domain.models.criteo.p r14 = (com.carrefour.fid.android.domain.models.criteo.C38014p) r14
            java.lang.Object r2 = r2.L$0
            java.util.List r2 = (java.util.List) r2
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x0164
        L_0x005f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0067:
            boolean r4 = r2.Z$0
            java.lang.Object r9 = r2.L$8
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r2.L$7
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r2.L$6
            com.carrefour.fid.android.domain.interactors.criteo.g$a r11 = (com.carrefour.fid.android.domain.interactors.criteo.C37666g.C37667a) r11
            java.lang.Object r12 = r2.L$5
            com.carrefour.fid.android.domain.models.criteo.d r12 = (com.carrefour.fid.android.domain.models.criteo.C38002d) r12
            java.lang.Object r13 = r2.L$4
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r14 = r2.L$3
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r15 = r2.L$2
            com.carrefour.fid.android.domain.models.criteo.p r15 = (com.carrefour.fid.android.domain.models.criteo.C38014p) r15
            java.lang.Object r7 = r2.L$1
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r5 = r2.L$0
            com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCriteoProductsUseCase r5 = (com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCriteoProductsUseCase) r5
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            r48 = r15
            r15 = r4
            r4 = r5
            r5 = r9
            r9 = r10
            r10 = r48
            r49 = r14
            r14 = r11
            r11 = r49
            r50 = r13
            r13 = r12
            r12 = r50
            goto L_0x00ef
        L_0x00a9:
            kotlin.C11661u0.m45747n(r1)
            java.lang.Throwable r1 = kotlin.Result.m38705e(r52)
            if (r1 != 0) goto L_0x04e2
            r1 = r52
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.b r5 = r0.f94497d
            com.carrefour.fid.android.core.types.RequestType r7 = com.carrefour.fid.android.core.types.RequestType.OFFLINE
            r2.L$0 = r0
            r9 = r53
            r2.L$1 = r9
            r10 = r54
            r2.L$2 = r10
            r11 = r55
            r2.L$3 = r11
            r12 = r56
            r2.L$4 = r12
            r13 = r58
            r2.L$5 = r13
            r14 = r59
            r2.L$6 = r14
            r2.L$7 = r1
            r2.L$8 = r4
            r15 = r57
            r2.Z$0 = r15
            r2.label = r8
            java.lang.Object r5 = r5.m172966invokegIAlus(r7, r2)
            if (r5 != r3) goto L_0x00ea
            return r3
        L_0x00ea:
            r7 = r9
            r9 = r1
            r1 = r5
            r5 = r4
            r4 = r0
        L_0x00ef:
            boolean r17 = kotlin.Result.m38710j(r1)
            if (r17 == 0) goto L_0x0132
            boolean r17 = kotlin.Result.m38709i(r1)
            if (r17 == 0) goto L_0x00fc
            r1 = 0
        L_0x00fc:
            com.carrefour.fid.android.domain.models.favorites.shoppinglist.a r1 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a) r1
            if (r1 == 0) goto L_0x0105
            java.util.List r1 = r1.mo117697e()
            goto L_0x0106
        L_0x0105:
            r1 = 0
        L_0x0106:
            if (r1 != 0) goto L_0x010c
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x010c:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r8 = new java.util.ArrayList
            int r0 = kotlin.collections.C10978t.m41495Y(r1, r6)
            r8.<init>(r0)
            java.util.Iterator r0 = r1.iterator()
        L_0x011b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x012f
            java.lang.Object r1 = r0.next()
            com.carrefour.fid.android.domain.models.favorites.shoppinglist.d r1 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38033d) r1
            java.lang.String r1 = r1.mo117724a()
            r8.add(r1)
            goto L_0x011b
        L_0x012f:
            r5.addAll(r8)
        L_0x0132:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.carrefour.fid.android.domain.interactors.basket.f0 r1 = r4.f94498e
            r2.L$0 = r7
            r2.L$1 = r10
            r2.L$2 = r11
            r2.L$3 = r12
            r2.L$4 = r13
            r2.L$5 = r14
            r2.L$6 = r9
            r2.L$7 = r5
            r2.L$8 = r0
            r2.Z$0 = r15
            r4 = 2
            r2.label = r4
            java.lang.Object r1 = r1.m172965invokeIoAF18A(r2)
            if (r1 != r3) goto L_0x0157
            return r3
        L_0x0157:
            r4 = r0
            r2 = r7
            r3 = r15
            r48 = r14
            r14 = r10
            r10 = r48
            r49 = r13
            r13 = r11
            r11 = r49
        L_0x0164:
            boolean r0 = kotlin.Result.m38710j(r1)
            if (r0 == 0) goto L_0x01af
            boolean r0 = kotlin.Result.m38709i(r1)
            if (r0 == 0) goto L_0x0171
            r1 = 0
        L_0x0171:
            com.carrefour.fid.android.domain.models.basket.Basket r1 = (com.carrefour.fid.android.domain.models.basket.Basket) r1
            if (r1 == 0) goto L_0x017a
            java.util.List r0 = r1.mo116817B()
            goto L_0x017b
        L_0x017a:
            r0 = 0
        L_0x017b:
            if (r0 != 0) goto L_0x0181
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x0181:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            int r7 = kotlin.collections.C10978t.m41495Y(r0, r6)
            r1.<init>(r7)
            java.util.Iterator r0 = r0.iterator()
        L_0x0190:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x01ac
            java.lang.Object r7 = r0.next()
            com.carrefour.fid.android.domain.models.offer.Offer r7 = (com.carrefour.fid.android.domain.models.offer.Offer) r7
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r7 = r7.mo118001J()
            java.lang.String r7 = r7.mo118136f()
            com.carrefour.fid.android.domain.models.product.Gtin r7 = com.carrefour.fid.android.domain.models.product.Gtin.m157307a(r7)
            r1.add(r7)
            goto L_0x0190
        L_0x01ac:
            r4.addAll(r1)
        L_0x01af:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.collections.C10978t.m41495Y(r9, r6)
            r0.<init>(r1)
            java.util.Iterator r1 = r9.iterator()
        L_0x01be:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x01d2
            java.lang.Object r7 = r1.next()
            com.carrefour.fid.android.domain.models.OfferProductDomain r7 = (com.carrefour.fid.android.domain.models.OfferProductDomain) r7
            com.carrefour.fid.android.domain.models.offer.Offer r7 = com.carrefour.fid.android.domain.extension.C37507h.m153955g(r7)
            r0.add(r7)
            goto L_0x01be
        L_0x01d2:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r7 = kotlin.collections.C10978t.m41495Y(r0, r6)
            r1.<init>(r7)
            java.util.Iterator r0 = r0.iterator()
        L_0x01df:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0269
            java.lang.Object r7 = r0.next()
            r18 = r7
            com.carrefour.fid.android.domain.models.offer.Offer r18 = (com.carrefour.fid.android.domain.models.offer.Offer) r18
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r7 = r18.mo118001J()
            java.lang.String r7 = r7.mo118136f()
            boolean r34 = r5.contains(r7)
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r7 = r18.mo118001J()
            java.lang.String r7 = r7.mo118136f()
            com.carrefour.fid.android.domain.models.product.Gtin r7 = com.carrefour.fid.android.domain.models.product.Gtin.m157307a(r7)
            boolean r33 = r4.contains(r7)
            com.carrefour.fid.android.domain.models.product.Product r7 = r18.mo118010S()
            java.lang.String r7 = r7.mo118415P()
            boolean r7 = r12.contains(r7)
            if (r7 != 0) goto L_0x0229
            com.carrefour.fid.android.domain.models.product.Product r7 = r18.mo118010S()
            java.lang.String r7 = r7.mo118415P()
            boolean r7 = r13.contains(r7)
            if (r7 == 0) goto L_0x0226
            goto L_0x0229
        L_0x0226:
            r42 = 0
            goto L_0x022b
        L_0x0229:
            r42 = 1
        L_0x022b:
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 125779967(0x77f3fff, float:1.9202875E-34)
            r47 = 0
            com.carrefour.fid.android.domain.models.offer.Offer r7 = com.carrefour.fid.android.domain.models.offer.Offer.m156999C(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            r1.add(r7)
            goto L_0x01df
        L_0x0269:
            int r0 = r2.size()
            int r2 = r1.size()
            if (r0 == r2) goto L_0x0285
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Throwable r0 = new java.lang.Throwable
            java.lang.String r1 = "Error fetching offers"
            r0.<init>(r1)
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
            return r0
        L_0x0285:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r1.iterator()
        L_0x028e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x02ba
            java.lang.Object r4 = r2.next()
            r5 = r4
            com.carrefour.fid.android.domain.models.offer.Offer r5 = (com.carrefour.fid.android.domain.models.offer.Offer) r5
            com.carrefour.fid.android.domain.models.product.Product r7 = r5.mo118010S()
            java.lang.String r7 = r7.mo118415P()
            boolean r7 = r13.contains(r7)
            if (r7 == 0) goto L_0x02b3
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r5 = r5.mo117995D()
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r7 = com.carrefour.fid.android.domain.models.offer.OfferAvailability.AVAILABLE
            if (r5 != r7) goto L_0x02b3
            r5 = 1
            goto L_0x02b4
        L_0x02b3:
            r5 = 0
        L_0x02b4:
            if (r5 == 0) goto L_0x028e
            r0.add(r4)
            goto L_0x028e
        L_0x02ba:
            int r2 = r10.mo114673k()
            java.util.List r0 = kotlin.collections.CollectionsKt___CollectionsKt.m40497E5(r0, r2)
            r2 = r0
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = kotlin.collections.C10978t.m41495Y(r2, r6)
            r4.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
        L_0x02d2:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x02ea
            java.lang.Object r5 = r2.next()
            com.carrefour.fid.android.domain.models.offer.Offer r5 = (com.carrefour.fid.android.domain.models.offer.Offer) r5
            com.carrefour.fid.android.domain.models.product.Product r5 = r5.mo118010S()
            java.lang.String r5 = r5.mo118415P()
            r4.add(r5)
            goto L_0x02d2
        L_0x02ea:
            com.carrefour.fid.android.domain.models.criteo.o r2 = r14.mo117573j()
            java.util.List r2 = r2.mo117385a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x02fd:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0318
            java.lang.Object r7 = r2.next()
            r10 = r7
            com.carrefour.fid.android.domain.models.criteo.n r10 = (com.carrefour.fid.android.domain.models.criteo.C38012n) r10
            java.lang.String r10 = r10.mo117559o()
            boolean r10 = r4.contains(r10)
            if (r10 == 0) goto L_0x02fd
            r5.add(r7)
            goto L_0x02fd
        L_0x0318:
            com.carrefour.fid.android.domain.models.criteo.o r2 = new com.carrefour.fid.android.domain.models.criteo.o
            com.carrefour.fid.android.domain.models.criteo.o r4 = r14.mo117573j()
            java.lang.String r4 = r4.mo117387c()
            com.carrefour.fid.android.domain.models.criteo.o r7 = r14.mo117573j()
            java.lang.String r7 = r7.mo117388d()
            r2.<init>(r5, r0, r4, r7)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0336:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0362
            java.lang.Object r4 = r1.next()
            r5 = r4
            com.carrefour.fid.android.domain.models.offer.Offer r5 = (com.carrefour.fid.android.domain.models.offer.Offer) r5
            com.carrefour.fid.android.domain.models.product.Product r7 = r5.mo118010S()
            java.lang.String r7 = r7.mo118415P()
            boolean r7 = r12.contains(r7)
            if (r7 == 0) goto L_0x035b
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r5 = r5.mo117995D()
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r7 = com.carrefour.fid.android.domain.models.offer.OfferAvailability.AVAILABLE
            if (r5 != r7) goto L_0x035b
            r5 = 1
            goto L_0x035c
        L_0x035b:
            r5 = 0
        L_0x035c:
            if (r5 == 0) goto L_0x0336
            r0.add(r4)
            goto L_0x0336
        L_0x0362:
            r1 = 4
            java.util.List r20 = kotlin.collections.CollectionsKt___CollectionsKt.m40497E5(r0, r1)
            if (r3 == 0) goto L_0x03f1
            r0 = r20
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x03f1
            r0 = r20
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = kotlin.collections.C10978t.m41495Y(r0, r6)
            r1.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x0386:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x039e
            java.lang.Object r3 = r0.next()
            com.carrefour.fid.android.domain.models.offer.Offer r3 = (com.carrefour.fid.android.domain.models.offer.Offer) r3
            com.carrefour.fid.android.domain.models.product.Product r3 = r3.mo118010S()
            java.lang.String r3 = r3.mo118415P()
            r1.add(r3)
            goto L_0x0386
        L_0x039e:
            com.carrefour.fid.android.domain.models.criteo.d r18 = r14.mo117572i()
            if (r18 == 0) goto L_0x03f1
            if (r11 == 0) goto L_0x03d2
            java.util.List r0 = r11.mo117385a()
            if (r0 == 0) goto L_0x03d2
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x03b7:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x03d3
            java.lang.Object r4 = r0.next()
            r5 = r4
            com.carrefour.fid.android.domain.models.criteo.n r5 = (com.carrefour.fid.android.domain.models.criteo.C38012n) r5
            java.lang.String r5 = r5.mo117559o()
            boolean r5 = r1.contains(r5)
            if (r5 == 0) goto L_0x03b7
            r3.add(r4)
            goto L_0x03b7
        L_0x03d2:
            r3 = 0
        L_0x03d3:
            if (r3 != 0) goto L_0x03dc
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r19 = r0
            goto L_0x03de
        L_0x03dc:
            r19 = r3
        L_0x03de:
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 124(0x7c, float:1.74E-43)
            r27 = 0
            com.carrefour.fid.android.domain.models.criteo.d r0 = com.carrefour.fid.android.domain.models.criteo.C38002d.m156499n(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x03f2
        L_0x03f1:
            r0 = 0
        L_0x03f2:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r3 = r14.mo117570h()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0401:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04d2
            java.lang.Object r4 = r3.next()
            com.carrefour.fid.android.domain.models.criteo.b r4 = (com.carrefour.fid.android.domain.models.criteo.C38000b) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List r10 = r4.mo117385a()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r11 = 0
        L_0x0427:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x04a4
            java.lang.Object r12 = r10.next()
            int r13 = r11 + 1
            if (r11 >= 0) goto L_0x0438
            kotlin.collections.CollectionsKt__CollectionsKt.m40459W()
        L_0x0438:
            com.carrefour.fid.android.domain.models.criteo.n r12 = (com.carrefour.fid.android.domain.models.criteo.C38012n) r12
            java.util.Iterator r15 = r9.iterator()
        L_0x043e:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x0479
            java.lang.Object r16 = r15.next()
            r18 = r16
            com.carrefour.fid.android.domain.models.OfferProductDomain r18 = (com.carrefour.fid.android.domain.models.OfferProductDomain) r18
            com.carrefour.fid.android.domain.models.ProductDomain r19 = r18.mo116032Q()
            if (r19 == 0) goto L_0x045b
            java.lang.String r19 = r19.mo116544s()
            r53 = r3
            r8 = r19
            goto L_0x045e
        L_0x045b:
            r53 = r3
            r8 = 0
        L_0x045e:
            java.lang.String r3 = r12.mo117559o()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r3)
            if (r3 == 0) goto L_0x0472
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r3 = r18.mo116016A()
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r8 = com.carrefour.fid.android.domain.models.offer.OfferAvailability.AVAILABLE
            if (r3 != r8) goto L_0x0472
            r3 = 1
            goto L_0x0473
        L_0x0472:
            r3 = 0
        L_0x0473:
            if (r3 == 0) goto L_0x0476
            goto L_0x047d
        L_0x0476:
            r3 = r53
            goto L_0x043e
        L_0x0479:
            r53 = r3
            r16 = 0
        L_0x047d:
            com.carrefour.fid.android.domain.models.OfferProductDomain r16 = (com.carrefour.fid.android.domain.models.OfferProductDomain) r16
            if (r16 == 0) goto L_0x04a0
            com.carrefour.fid.android.domain.models.offer.Offer r3 = com.carrefour.fid.android.domain.extension.C37507h.m153955g(r16)
            r5.add(r3)
            java.util.List r3 = r4.mo117385a()
            java.lang.Object r3 = r3.get(r11)
            r6.add(r3)
            java.util.List r3 = r4.mo117400p()
            java.lang.Object r3 = r3.get(r11)
            r7.add(r3)
            kotlin.d2 r3 = kotlin.C11079d2.f28267a
        L_0x04a0:
            r3 = r53
            r11 = r13
            goto L_0x0427
        L_0x04a4:
            r53 = r3
            boolean r3 = r5.isEmpty()
            r8 = 1
            r3 = r3 ^ r8
            if (r3 == 0) goto L_0x04ce
            r4.mo117404t(r7)
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 252(0xfc, float:3.53E-43)
            r28 = 0
            r18 = r4
            r19 = r6
            r20 = r5
            com.carrefour.fid.android.domain.models.criteo.b r3 = com.carrefour.fid.android.domain.models.criteo.C38000b.m156470o(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r1.add(r3)
        L_0x04ce:
            r3 = r53
            goto L_0x0401
        L_0x04d2:
            kotlin.Result$a r3 = kotlin.Result.f28060a
            java.util.List r3 = r14.mo117569g()
            com.carrefour.fid.android.domain.models.criteo.p r4 = new com.carrefour.fid.android.domain.models.criteo.p
            r4.<init>(r2, r1, r3, r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r4)
            goto L_0x04ec
        L_0x04e2:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x04ec:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCriteoProductsUseCase.mo114642c(java.lang.Object, java.util.List, com.carrefour.fid.android.domain.models.criteo.p, java.util.List, java.util.List, boolean, com.carrefour.fid.android.domain.models.criteo.d, com.carrefour.fid.android.domain.interactors.criteo.g$a, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01fd, code lost:
        if (r6 == null) goto L_0x01ff;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01c1 A[LOOP:2: B:54:0x01bb->B:56:0x01c1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0248 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0271 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114643d(com.carrefour.fid.android.domain.interactors.criteo.C37666g.C37667a r23, kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.criteo.C38014p>> r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            boolean r2 = r1 instanceof com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCriteoProductsUseCase$fetchCriteoProducts$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCriteoProductsUseCase$fetchCriteoProducts$1 r2 = (com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCriteoProductsUseCase$fetchCriteoProducts$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCriteoProductsUseCase$fetchCriteoProducts$1 r2 = new com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCriteoProductsUseCase$fetchCriteoProducts$1
            r2.<init>(r0, r1)
        L_0x001c:
            r12 = r2
            java.lang.Object r1 = r12.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r12.label
            r10 = 4
            r4 = 3
            r5 = 2
            r11 = 0
            r13 = 1
            if (r3 == 0) goto L_0x00b4
            if (r3 == r13) goto L_0x00a1
            if (r3 == r5) goto L_0x007e
            if (r3 == r4) goto L_0x0047
            if (r3 != r10) goto L_0x003f
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x0272
        L_0x003f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0047:
            int r3 = r12.I$0
            java.lang.Object r4 = r12.L$6
            com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCriteoProductsUseCase r4 = (com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCriteoProductsUseCase) r4
            java.lang.Object r5 = r12.L$5
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r12.L$4
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r12.L$3
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r12.L$2
            com.carrefour.fid.android.domain.models.criteo.d r8 = (com.carrefour.fid.android.domain.models.criteo.C38002d) r8
            java.lang.Object r9 = r12.L$1
            com.carrefour.fid.android.domain.models.criteo.p r9 = (com.carrefour.fid.android.domain.models.criteo.C38014p) r9
            java.lang.Object r15 = r12.L$0
            com.carrefour.fid.android.domain.interactors.criteo.g$a r15 = (com.carrefour.fid.android.domain.interactors.criteo.C37666g.C37667a) r15
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            r10 = r8
            r18 = r11
            r17 = r13
            r11 = r15
            r8 = r6
            r6 = r9
            r21 = r4
            r4 = r1
            r1 = r3
            r3 = r21
            goto L_0x0252
        L_0x007e:
            java.lang.Object r3 = r12.L$5
            com.carrefour.fid.android.domain.models.criteo.d r3 = (com.carrefour.fid.android.domain.models.criteo.C38002d) r3
            java.lang.Object r6 = r12.L$4
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r12.L$3
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r12.L$2
            com.carrefour.fid.android.domain.models.criteo.p r8 = (com.carrefour.fid.android.domain.models.criteo.C38014p) r8
            java.lang.Object r9 = r12.L$1
            com.carrefour.fid.android.domain.interactors.criteo.g$a r9 = (com.carrefour.fid.android.domain.interactors.criteo.C37666g.C37667a) r9
            java.lang.Object r15 = r12.L$0
            com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCriteoProductsUseCase r15 = (com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCriteoProductsUseCase) r15
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x013b
        L_0x00a1:
            java.lang.Object r3 = r12.L$1
            com.carrefour.fid.android.domain.interactors.criteo.g$a r3 = (com.carrefour.fid.android.domain.interactors.criteo.C37666g.C37667a) r3
            java.lang.Object r6 = r12.L$0
            com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCriteoProductsUseCase r6 = (com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCriteoProductsUseCase) r6
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            r15 = r6
            goto L_0x00ce
        L_0x00b4:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.data.repositories.CriteoRepository r1 = r0.f94494a
            com.carrefour.fid.android.domain.models.criteo.h r3 = r23.mo114672j()
            r12.L$0 = r0
            r6 = r23
            r12.L$1 = r6
            r12.label = r13
            java.lang.Object r1 = r1.mo111492i(r3, r12)
            if (r1 != r2) goto L_0x00cc
            return r2
        L_0x00cc:
            r15 = r0
            r3 = r6
        L_0x00ce:
            boolean r6 = kotlin.Result.m38710j(r1)
            if (r6 == 0) goto L_0x0273
            kotlin.Result$a r6 = kotlin.Result.f28060a
            r8 = r1
            com.carrefour.fid.android.domain.models.criteo.p r8 = (com.carrefour.fid.android.domain.models.criteo.C38014p) r8
            com.carrefour.fid.android.domain.models.criteo.o r1 = r8.mo117573j()
            java.util.List r7 = r1.mo117385a()
            java.util.List r1 = r8.mo117570h()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            int r6 = r3.mo114669h()
            java.util.List r6 = kotlin.collections.CollectionsKt___CollectionsKt.m40497E5(r1, r6)
            com.carrefour.fid.android.domain.models.criteo.d r1 = r8.mo117572i()
            boolean r9 = r7.isEmpty()
            if (r9 == 0) goto L_0x0111
            boolean r9 = r6.isEmpty()
            if (r9 == 0) goto L_0x0111
            if (r1 != 0) goto L_0x0111
            java.lang.Throwable r1 = new java.lang.Throwable
            java.lang.String r2 = "Criteo products not found"
            r1.<init>(r2)
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        L_0x0111:
            boolean r9 = r3.mo114671i()
            if (r9 == 0) goto L_0x0159
            com.carrefour.fid.android.domain.interactors.remoteconfig.b r9 = r15.f94496c
            com.carrefour.fid.android.domain.interactors.remoteconfig.b$a r10 = new com.carrefour.fid.android.domain.interactors.remoteconfig.b$a
            com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag r14 = com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag.CriteoFlagship
            r10.<init>(r14)
            r12.L$0 = r15
            r12.L$1 = r3
            r12.L$2 = r8
            r12.L$3 = r7
            r12.L$4 = r6
            r12.L$5 = r1
            r12.label = r5
            java.lang.Object r9 = r9.m172966invokegIAlus(r10, r12)
            if (r9 != r2) goto L_0x0135
            return r2
        L_0x0135:
            r21 = r3
            r3 = r1
            r1 = r9
            r9 = r21
        L_0x013b:
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r11)
            boolean r14 = kotlin.Result.m38709i(r1)
            if (r14 == 0) goto L_0x0146
            r1 = r10
        L_0x0146:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0157
            r10 = r3
            r14 = r8
            r1 = r13
            r21 = r15
            r15 = r9
            r9 = r21
            goto L_0x015e
        L_0x0157:
            r1 = r3
            r3 = r9
        L_0x0159:
            r10 = r1
            r14 = r8
            r1 = r11
            r9 = r15
            r15 = r3
        L_0x015e:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r3 = new java.util.ArrayList
            r8 = 10
            int r5 = kotlin.collections.C10978t.m41495Y(r6, r8)
            r3.<init>(r5)
            java.util.Iterator r5 = r6.iterator()
        L_0x016f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x01a8
            java.lang.Object r6 = r5.next()
            com.carrefour.fid.android.domain.models.criteo.b r6 = (com.carrefour.fid.android.domain.models.criteo.C38000b) r6
            java.util.List r6 = r6.mo117385a()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r13 = new java.util.ArrayList
            int r11 = kotlin.collections.C10978t.m41495Y(r6, r8)
            r13.<init>(r11)
            java.util.Iterator r6 = r6.iterator()
        L_0x018e:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L_0x01a2
            java.lang.Object r11 = r6.next()
            com.carrefour.fid.android.domain.models.criteo.n r11 = (com.carrefour.fid.android.domain.models.criteo.C38012n) r11
            java.lang.String r11 = r11.mo117559o()
            r13.add(r11)
            goto L_0x018e
        L_0x01a2:
            r3.add(r13)
            r11 = 0
            r13 = 1
            goto L_0x016f
        L_0x01a8:
            java.util.List r3 = kotlin.collections.C10978t.m41497a0(r3)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r11 = new java.util.ArrayList
            int r5 = kotlin.collections.C10978t.m41495Y(r7, r8)
            r11.<init>(r5)
            java.util.Iterator r5 = r7.iterator()
        L_0x01bb:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x01cf
            java.lang.Object r6 = r5.next()
            com.carrefour.fid.android.domain.models.criteo.n r6 = (com.carrefour.fid.android.domain.models.criteo.C38012n) r6
            java.lang.String r6 = r6.mo117559o()
            r11.add(r6)
            goto L_0x01bb
        L_0x01cf:
            if (r1 == 0) goto L_0x01ff
            if (r10 == 0) goto L_0x01fc
            java.util.List r5 = r10.mo117385a()
            if (r5 == 0) goto L_0x01fc
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.C10978t.m41495Y(r5, r8)
            r6.<init>(r7)
            java.util.Iterator r5 = r5.iterator()
        L_0x01e8:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x01fd
            java.lang.Object r7 = r5.next()
            com.carrefour.fid.android.domain.models.criteo.n r7 = (com.carrefour.fid.android.domain.models.criteo.C38012n) r7
            java.lang.String r7 = r7.mo117559o()
            r6.add(r7)
            goto L_0x01e8
        L_0x01fc:
            r6 = 0
        L_0x01fd:
            if (r6 != 0) goto L_0x0203
        L_0x01ff:
            java.util.List r6 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x0203:
            r13 = r6
            java.util.List[] r5 = new java.util.List[r4]
            r18 = 0
            r5[r18] = r11
            r17 = 1
            r5[r17] = r3
            r3 = 2
            r5[r3] = r13
            java.util.List r3 = kotlin.collections.CollectionsKt__CollectionsKt.m40448L(r5)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r8 = kotlin.collections.C10978t.m41497a0(r3)
            com.carrefour.fid.android.data.repositories.APIMProductDetailsRepository r3 = r9.f94495b
            boolean r5 = r15.mo114674l()
            r6 = 0
            r16 = 4
            r19 = 0
            r12.L$0 = r15
            r12.L$1 = r14
            r12.L$2 = r10
            r12.L$3 = r11
            r12.L$4 = r13
            r12.L$5 = r8
            r12.L$6 = r9
            r12.I$0 = r1
            r12.label = r4
            r4 = r8
            r7 = r12
            r20 = r8
            r8 = r16
            r16 = r9
            r9 = r19
            java.lang.Object r3 = com.carrefour.fid.android.domain.repositories.C38199h.C38200a.m158424a(r3, r4, r5, r6, r7, r8, r9)
            if (r3 != r2) goto L_0x0249
            return r2
        L_0x0249:
            r4 = r3
            r7 = r11
            r8 = r13
            r6 = r14
            r11 = r15
            r3 = r16
            r5 = r20
        L_0x0252:
            if (r1 == 0) goto L_0x0257
            r9 = r17
            goto L_0x0259
        L_0x0257:
            r9 = r18
        L_0x0259:
            r1 = 0
            r12.L$0 = r1
            r12.L$1 = r1
            r12.L$2 = r1
            r12.L$3 = r1
            r12.L$4 = r1
            r12.L$5 = r1
            r12.L$6 = r1
            r1 = 4
            r12.label = r1
            java.lang.Object r1 = r3.mo114642c(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r1 != r2) goto L_0x0272
            return r2
        L_0x0272:
            return r1
        L_0x0273:
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCriteoProductsUseCase.mo114643d(com.carrefour.fid.android.domain.interactors.criteo.g$a, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006e A[SYNTHETIC, Splitter:B:22:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172959invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.criteo.C37666g.C37667a r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.criteo.C38014p>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCriteoProductsUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCriteoProductsUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCriteoProductsUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCriteoProductsUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCriteoProductsUseCase$invoke$1
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
            kotlin.C11661u0.m45747n(r8)     // Catch:{ all -> 0x0032 }
            kotlin.Result r8 = (kotlin.Result) r8     // Catch:{ all -> 0x0032 }
            java.lang.Object r7 = r8.mo21858l()     // Catch:{ all -> 0x0032 }
            goto L_0x0083
        L_0x0032:
            r7 = move-exception
            goto L_0x008d
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003c:
            java.lang.Object r7 = r0.L$1
            com.carrefour.fid.android.domain.interactors.criteo.g$a r7 = (com.carrefour.fid.android.domain.interactors.criteo.C37666g.C37667a) r7
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCriteoProductsUseCase r2 = (com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCriteoProductsUseCase) r2
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0068
        L_0x004e:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.domain.interactors.remoteconfig.b r8 = r6.f94496c
            com.carrefour.fid.android.domain.interactors.remoteconfig.b$a r2 = new com.carrefour.fid.android.domain.interactors.remoteconfig.b$a
            com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag r5 = com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag.Criteo
            r2.<init>(r5)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r8.m172966invokegIAlus(r2, r0)
            if (r8 != r1) goto L_0x0067
            return r1
        L_0x0067:
            r2 = r6
        L_0x0068:
            boolean r4 = kotlin.Result.m38710j(r8)
            if (r4 == 0) goto L_0x0098
            kotlin.Result$a r4 = kotlin.Result.f28060a     // Catch:{ all -> 0x0032 }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0032 }
            r8.booleanValue()     // Catch:{ all -> 0x0032 }
            r8 = 0
            r0.L$0 = r8     // Catch:{ all -> 0x0032 }
            r0.L$1 = r8     // Catch:{ all -> 0x0032 }
            r0.label = r3     // Catch:{ all -> 0x0032 }
            java.lang.Object r7 = r2.mo114643d(r7, r0)     // Catch:{ all -> 0x0032 }
            if (r7 != r1) goto L_0x0083
            return r1
        L_0x0083:
            kotlin.C11661u0.m45747n(r7)     // Catch:{ all -> 0x0032 }
            com.carrefour.fid.android.domain.models.criteo.p r7 = (com.carrefour.fid.android.domain.models.criteo.C38014p) r7     // Catch:{ all -> 0x0032 }
            java.lang.Object r7 = kotlin.Result.m38702b(r7)     // Catch:{ all -> 0x0032 }
            goto L_0x009c
        L_0x008d:
            kotlin.Result$a r8 = kotlin.Result.f28060a
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            goto L_0x009c
        L_0x0098:
            java.lang.Object r7 = kotlin.Result.m38702b(r8)
        L_0x009c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCriteoProductsUseCase.m172959invokegIAlus(com.carrefour.fid.android.domain.interactors.criteo.g$a, kotlin.coroutines.c):java.lang.Object");
    }
}
