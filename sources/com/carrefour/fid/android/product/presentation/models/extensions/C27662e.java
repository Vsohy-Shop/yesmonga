package com.carrefour.fid.android.product.presentation.models.extensions;

import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13796h;
import com.carrefour.fid.android.design.components.widgets.NutriscoreComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.lozenge.C37382a;
import com.carrefour.fid.android.design.components.widgets.productcard.lozenge.LozengeListComponent;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.delivery.DeliveryMode;
import com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a;
import com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38033d;
import com.carrefour.fid.android.domain.models.favorites.shoppinglist.ShoppingListSyncState;
import com.carrefour.fid.android.domain.models.offer.Discount;
import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.domain.models.offer.OfferFlag;
import com.carrefour.fid.android.domain.models.offer.Prices;
import com.carrefour.fid.android.domain.models.offer.ProductNutriScore;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.UnitOfMeasure;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.domain.models.product.plp.PlpOffer;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.product.presentation.models.OfferAvailability;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11366s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlin.text.StringsKt__IndentKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPlpProductExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlpProductExtensions.kt\ncom/carrefour/fid/android/product/presentation/models/extensions/PlpProductExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,166:1\n288#2,2:167\n288#2,2:169\n288#2,2:171\n766#2:174\n857#2,2:175\n1549#2:177\n1620#2,3:178\n1549#2:183\n1620#2,3:184\n1747#2,3:187\n1747#2,3:190\n288#2,2:193\n288#2,2:195\n1#3:173\n37#4,2:181\n*S KotlinDebug\n*F\n+ 1 PlpProductExtensions.kt\ncom/carrefour/fid/android/product/presentation/models/extensions/PlpProductExtensionsKt\n*L\n32#1:167,2\n35#1:169,2\n37#1:171,2\n45#1:174\n45#1:175,2\n47#1:177\n47#1:178,3\n56#1:183\n56#1:184,3\n89#1:187,3\n150#1:190,3\n154#1:193,2\n160#1:195,2\n52#1:181,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.models.extensions.e */
public final class C27662e {

    /* renamed from: com.carrefour.fid.android.product.presentation.models.extensions.e$a */
    public /* synthetic */ class C27663a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|25) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|25) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004c */
        static {
            /*
                com.carrefour.fid.android.domain.models.delivery.DeliveryMode[] r0 = com.carrefour.fid.android.domain.models.delivery.DeliveryMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                com.carrefour.fid.android.domain.models.delivery.DeliveryMode r2 = com.carrefour.fid.android.domain.models.delivery.DeliveryMode.DELIVERY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                com.carrefour.fid.android.domain.models.delivery.DeliveryMode r3 = com.carrefour.fid.android.domain.models.delivery.DeliveryMode.WITHDRAWAL_EXPRESS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                com.carrefour.fid.android.domain.models.delivery.DeliveryMode r4 = com.carrefour.fid.android.domain.models.delivery.DeliveryMode.WITHDRAWAL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                com.carrefour.fid.android.domain.models.offer.ProductNutriScore[] r0 = com.carrefour.fid.android.domain.models.offer.ProductNutriScore.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.offer.ProductNutriScore r4 = com.carrefour.fid.android.domain.models.offer.ProductNutriScore.A     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.carrefour.fid.android.domain.models.offer.ProductNutriScore r1 = com.carrefour.fid.android.domain.models.offer.ProductNutriScore.B     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                com.carrefour.fid.android.domain.models.offer.ProductNutriScore r1 = com.carrefour.fid.android.domain.models.offer.ProductNutriScore.C     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                com.carrefour.fid.android.domain.models.offer.ProductNutriScore r1 = com.carrefour.fid.android.domain.models.offer.ProductNutriScore.D     // Catch:{ NoSuchFieldError -> 0x004c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                com.carrefour.fid.android.domain.models.offer.ProductNutriScore r1 = com.carrefour.fid.android.domain.models.offer.ProductNutriScore.E     // Catch:{ NoSuchFieldError -> 0x0055 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0055 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0055 }
            L_0x0055:
                $EnumSwitchMapping$1 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.models.extensions.C27662e.C27663a.<clinit>():void");
        }
    }

    @C12579k
    /* renamed from: a */
    public static final C38114b m116381a(@C12579k C38115c cVar, @C12580l C38030a aVar, @C12580l Basket basket, @C12579k Set<Gtin> set, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(set, "syncingInBasket");
        return new C38114b(cVar, m116390j(cVar, basket), m116394n(cVar, aVar), m116396p(cVar, aVar), m116395o(cVar, set), z, z2);
    }

    /* renamed from: b */
    public static /* synthetic */ C38114b m116382b(C38115c cVar, C38030a aVar, Basket basket, Set set, boolean z, boolean z2, int i, Object obj) {
        return m116381a(cVar, aVar, basket, set, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }

    /* renamed from: c */
    public static final int m116383c(@C12579k C38115c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (cVar.mo118860K()) {
            return 1;
        }
        return 2;
    }

    @C12579k
    /* renamed from: d */
    public static final String m116384d(@C12579k C38115c cVar) {
        String str;
        Prices y;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String G = cVar.mo118856G();
        PlpOffer i = m116389i(cVar);
        String str2 = null;
        if (i == null || (y = i.mo118822y()) == null) {
            str = null;
        } else {
            str = y.mo118170k();
        }
        String str3 = "";
        if (str == null) {
            str = str3;
        }
        PlpOffer i2 = m116389i(cVar);
        if (i2 != null) {
            str2 = i2.mo118821x();
        }
        if (str2 != null) {
            str3 = str2;
        }
        return StringsKt__IndentKt.trimIndent("\n        " + G + "\n        " + str + "\n        " + str3 + "\n    ");
    }

    @C12579k
    /* renamed from: e */
    public static final LozengeListComponent.C37381a m116385e(@C12579k C38115c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        C11366s0 s0Var = new C11366s0(2);
        String B = cVar.mo118851B();
        C37382a.C37383a aVar = null;
        if (!(!C11622t.isBlank(B))) {
            B = null;
        }
        if (B != null) {
            aVar = new C37382a.C37383a(B);
        }
        s0Var.mo22855a(aVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = cVar.mo118889z().iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((OfferFlag) next).mo118127w() != 0) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        Iterable<OfferFlag> E5 = CollectionsKt___CollectionsKt.m40497E5(arrayList, 3);
        ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(E5, 10));
        for (OfferFlag offerFlag : E5) {
            arrayList2.add(new C37382a.C37384b(offerFlag.mo118127w(), offerFlag.mo118128y()));
        }
        s0Var.mo22856b(arrayList2.toArray(new C37382a.C37384b[0]));
        return new LozengeListComponent.C37381a(CollectionsKt__CollectionsKt.m40450N(s0Var.mo22858d(new C37382a[s0Var.mo22857c()])));
    }

    @C12579k
    /* renamed from: f */
    public static final List<Integer> m116386f(@C12579k C38115c cVar) {
        int i;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Iterable<DeliveryMode> x = cVar.mo118887x();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(x, 10));
        for (DeliveryMode ordinal : x) {
            int i2 = C27663a.$EnumSwitchMapping$0[ordinal.ordinal()];
            if (i2 == 1) {
                i = C27609f.C27627r.delivery_type_delivery;
            } else if (i2 == 2) {
                i = C27609f.C27627r.delivery_type_withdrawal_express;
            } else if (i2 == 3) {
                i = C27609f.C27627r.delivery_type_withdrawal;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    @C12580l
    /* renamed from: g */
    public static final NutriscoreComponent.C37157a m116387g(@C12579k C38115c cVar, boolean z, @C12580l NutriscoreComponent.Size size) {
        int i;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        ProductNutriScore E = cVar.mo118854E();
        if (E == null) {
            return null;
        }
        int i2 = C27663a.$EnumSwitchMapping$1[E.ordinal()];
        if (i2 == 1) {
            i = C27609f.C27617h.ds_pa_nutriscorea;
        } else if (i2 == 2) {
            i = C27609f.C27617h.ds_pa_nutriscoreb;
        } else if (i2 == 3) {
            i = C27609f.C27617h.ds_pa_nutriscorec;
        } else if (i2 == 4) {
            i = C27609f.C27617h.ds_pa_nutriscored;
        } else if (i2 == 5) {
            i = C27609f.C27617h.ds_pa_nutriscoree;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return new NutriscoreComponent.C37157a(E.mo118184q(), i, z, size);
    }

    /* renamed from: h */
    public static /* synthetic */ NutriscoreComponent.C37157a m116388h(C38115c cVar, boolean z, NutriscoreComponent.Size size, int i, Object obj) {
        if ((i & 2) != 0) {
            size = null;
        }
        return m116387g(cVar, z, size);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.carrefour.fid.android.domain.models.product.plp.PlpOffer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.carrefour.fid.android.domain.models.product.plp.PlpOffer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.carrefour.fid.android.domain.models.product.plp.PlpOffer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.carrefour.fid.android.domain.models.product.plp.PlpOffer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.carrefour.fid.android.domain.models.product.plp.PlpOffer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: com.carrefour.fid.android.domain.models.product.plp.PlpOffer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.carrefour.fid.android.domain.models.product.plp.PlpOffer} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12580l
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.carrefour.fid.android.domain.models.product.plp.PlpOffer m116389i(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.product.plp.C38115c r8) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            boolean r0 = r8.mo118860K()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L_0x0069
            java.util.List r0 = r8.mo118855F()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x003b
            java.lang.Object r4 = r0.next()
            r5 = r4
            com.carrefour.fid.android.domain.models.product.plp.PlpOffer r5 = (com.carrefour.fid.android.domain.models.product.plp.PlpOffer) r5
            com.carrefour.fid.android.domain.models.product.plp.PlpOffer$ChannelType r6 = r5.mo118815s()
            com.carrefour.fid.android.domain.models.product.plp.PlpOffer$ChannelType r7 = com.carrefour.fid.android.domain.models.product.plp.PlpOffer.ChannelType.HOME_DELIVERY_NAL
            if (r6 == r7) goto L_0x0037
            com.carrefour.fid.android.product.presentation.models.OfferAvailability r5 = com.carrefour.fid.android.product.presentation.models.extensions.C27661d.m116374a(r5)
            com.carrefour.fid.android.product.presentation.models.OfferAvailability r6 = com.carrefour.fid.android.product.presentation.models.OfferAvailability.Available
            if (r5 != r6) goto L_0x0037
            r5 = r1
            goto L_0x0038
        L_0x0037:
            r5 = r2
        L_0x0038:
            if (r5 == 0) goto L_0x0018
            goto L_0x003c
        L_0x003b:
            r4 = r3
        L_0x003c:
            com.carrefour.fid.android.domain.models.product.plp.PlpOffer r4 = (com.carrefour.fid.android.domain.models.product.plp.PlpOffer) r4
            if (r4 != 0) goto L_0x0091
            java.util.List r0 = r8.mo118855F()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x004a:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0065
            java.lang.Object r4 = r0.next()
            r5 = r4
            com.carrefour.fid.android.domain.models.product.plp.PlpOffer r5 = (com.carrefour.fid.android.domain.models.product.plp.PlpOffer) r5
            com.carrefour.fid.android.product.presentation.models.OfferAvailability r5 = com.carrefour.fid.android.product.presentation.models.extensions.C27661d.m116374a(r5)
            com.carrefour.fid.android.product.presentation.models.OfferAvailability r6 = com.carrefour.fid.android.product.presentation.models.OfferAvailability.Available
            if (r5 != r6) goto L_0x0061
            r5 = r1
            goto L_0x0062
        L_0x0061:
            r5 = r2
        L_0x0062:
            if (r5 == 0) goto L_0x004a
            r3 = r4
        L_0x0065:
            r4 = r3
            com.carrefour.fid.android.domain.models.product.plp.PlpOffer r4 = (com.carrefour.fid.android.domain.models.product.plp.PlpOffer) r4
            goto L_0x0091
        L_0x0069:
            java.util.List r0 = r8.mo118855F()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0073:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x008e
            java.lang.Object r4 = r0.next()
            r5 = r4
            com.carrefour.fid.android.domain.models.product.plp.PlpOffer r5 = (com.carrefour.fid.android.domain.models.product.plp.PlpOffer) r5
            com.carrefour.fid.android.product.presentation.models.OfferAvailability r5 = com.carrefour.fid.android.product.presentation.models.extensions.C27661d.m116374a(r5)
            com.carrefour.fid.android.product.presentation.models.OfferAvailability r6 = com.carrefour.fid.android.product.presentation.models.OfferAvailability.Available
            if (r5 != r6) goto L_0x008a
            r5 = r1
            goto L_0x008b
        L_0x008a:
            r5 = r2
        L_0x008b:
            if (r5 == 0) goto L_0x0073
            r3 = r4
        L_0x008e:
            r4 = r3
            com.carrefour.fid.android.domain.models.product.plp.PlpOffer r4 = (com.carrefour.fid.android.domain.models.product.plp.PlpOffer) r4
        L_0x0091:
            if (r4 != 0) goto L_0x009e
            java.util.List r8 = r8.mo118855F()
            java.lang.Object r8 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r8)
            r4 = r8
            com.carrefour.fid.android.domain.models.product.plp.PlpOffer r4 = (com.carrefour.fid.android.domain.models.product.plp.PlpOffer) r4
        L_0x009e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.models.extensions.C27662e.m116389i(com.carrefour.fid.android.domain.models.product.plp.c):com.carrefour.fid.android.domain.models.product.plp.PlpOffer");
    }

    /* renamed from: j */
    public static final int m116390j(@C12579k C38115c cVar, @C12580l Basket basket) {
        List<Offer> B;
        Object obj;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (!(basket == null || (B = basket.mo116817B()) == null)) {
            Iterator it = B.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Gtin.m157311e(((Offer) obj).mo118010S().mo118415P(), cVar.mo118850A())) {
                    break;
                }
            }
            Offer offer = (Offer) obj;
            if (offer != null) {
                return offer.mo118012U();
            }
        }
        return 0;
    }

    @C12579k
    /* renamed from: k */
    public static final UnitOfMeasure m116391k(@C12579k C38115c cVar) {
        UnitOfMeasure unitOfMeasure;
        Prices y;
        String k;
        String substringAfter;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        PlpOffer i = m116389i(cVar);
        String str = "";
        if (!(i == null || (y = i.mo118822y()) == null || (k = y.mo118170k()) == null || (substringAfter = StringsKt__StringsKt.substringAfter(k, "/", str)) == null)) {
            str = substringAfter;
        }
        UnitOfMeasure[] values = UnitOfMeasure.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                unitOfMeasure = null;
                break;
            }
            unitOfMeasure = values[i2];
            if (Intrinsics.areEqual((Object) unitOfMeasure.mo118653q(), (Object) str)) {
                break;
            }
            i2++;
        }
        if (unitOfMeasure == null) {
            return UnitOfMeasure.Unknown;
        }
        return unitOfMeasure;
    }

    /* renamed from: l */
    public static final boolean m116392l(@C12579k C38115c cVar) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (cVar.mo118860K()) {
            return false;
        }
        Iterable F = cVar.mo118855F();
        if (!(F instanceof Collection) || !((Collection) F).isEmpty()) {
            Iterator it = F.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PlpOffer plpOffer = (PlpOffer) it.next();
                if (plpOffer.mo118815s() == PlpOffer.ChannelType.HOME_DELIVERY_NAL && C27661d.m116374a(plpOffer) == OfferAvailability.Available) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static final boolean m116393m(@C12579k C38115c cVar) {
        boolean z;
        Discount discount;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        PlpOffer i = m116389i(cVar);
        if (i != null) {
            z = i.mo118793D();
        } else {
            z = false;
        }
        PlpOffer i2 = m116389i(cVar);
        if (i2 != null) {
            discount = C27661d.m116375b(i2);
        } else {
            discount = null;
        }
        if (!z || discount != null) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public static final boolean m116394n(@C12579k C38115c cVar, @C12580l C38030a aVar) {
        List<C38033d> e;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (aVar == null || (e = aVar.mo117697e()) == null) {
            return false;
        }
        Iterable<C38033d> iterable = e;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (C38033d a : iterable) {
            if (Intrinsics.areEqual((Object) a.mo117724a(), (Object) cVar.mo118850A())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public static final boolean m116395o(@C12579k C38115c cVar, @C12579k Set<Gtin> set) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(set, "basket");
        return set.contains(Gtin.m157307a(cVar.mo118850A()));
    }

    /* renamed from: p */
    public static final boolean m116396p(@C12579k C38115c cVar, @C12580l C38030a aVar) {
        List<C38033d> e;
        Object obj;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        ShoppingListSyncState shoppingListSyncState = null;
        if (!(aVar == null || (e = aVar.mo117697e()) == null)) {
            Iterator it = e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual((Object) ((C38033d) obj).mo117724a(), (Object) cVar.mo118850A())) {
                    break;
                }
            }
            C38033d dVar = (C38033d) obj;
            if (dVar != null) {
                shoppingListSyncState = dVar.mo117725b();
            }
        }
        if (shoppingListSyncState == ShoppingListSyncState.SYNCING) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: q */
    public static final C13796h m116397q(@C12579k C38115c cVar, @C12580l PlpOffer plpOffer) {
        boolean z;
        boolean z2;
        PlpOffer.ChannelType channelType;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        boolean z3 = false;
        if (cVar.mo118855F().size() > 1) {
            z = true;
        } else {
            z = false;
        }
        if (cVar.mo118855F().size() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (plpOffer != null) {
            channelType = plpOffer.mo118815s();
        } else {
            channelType = null;
        }
        if (channelType == PlpOffer.ChannelType.HOME_DELIVERY_NAL) {
            z3 = true;
        }
        if (z) {
            return C13796h.C13801e.f33603b;
        }
        if (!z2 || !z3) {
            return C13796h.C13798b.f33600b;
        }
        return C13796h.C13799c.f33601b;
    }
}
