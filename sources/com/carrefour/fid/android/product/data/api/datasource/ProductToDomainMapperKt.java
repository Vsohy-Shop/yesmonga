package com.carrefour.fid.android.product.data.api.datasource;

import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonCategory;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonProduct;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDeals;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDiscount;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffNonFoodAttributes;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPdpProducts;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPdpResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPrices;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.ProductPicture;
import com.carrefour.fid.android.domain.models.product.detail.C38107b;
import com.carrefour.fid.android.domain.models.product.detail.C38108c;
import com.carrefour.fid.android.domain.models.product.detail.C38110e;
import com.carrefour.fid.android.domain.models.product.detail.PictureSize;
import com.carrefour.fid.android.product.data.api.mapper.C27469a;
import com.carrefour.fid.android.product.domain.model.C27586d;
import com.carrefour.fid.android.shared.data.parsing.C28646a;
import com.carrefour.fid.android.shared.extension.StringKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C11661u0;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.C11622t;
import kotlin.text.Regex;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nProductToDomainMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductToDomainMapper.kt\ncom/carrefour/fid/android/product/data/api/datasource/ProductToDomainMapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1549#2:154\n1620#2,3:155\n1549#2:159\n1620#2,3:160\n1549#2:163\n1620#2,3:164\n766#2:167\n857#2,2:168\n1549#2:170\n1620#2,3:171\n288#2,2:174\n766#2:176\n857#2,2:177\n1#3:158\n*S KotlinDebug\n*F\n+ 1 ProductToDomainMapper.kt\ncom/carrefour/fid/android/product/data/api/datasource/ProductToDomainMapperKt\n*L\n33#1:154\n33#1:155,3\n57#1:159\n57#1:160,3\n72#1:163\n72#1:164,3\n74#1:167\n74#1:168,2\n77#1:170\n77#1:171,3\n80#1:174,2\n136#1:176\n136#1:177,2\n*E\n"})
public final class ProductToDomainMapperKt {
    @C12579k

    /* renamed from: a */
    public static final String f66590a = "energy_label";

    /* renamed from: com.carrefour.fid.android.product.data.api.datasource.ProductToDomainMapperKt$a */
    public /* synthetic */ class C27459a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004c */
        static {
            /*
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer$BffChannelType[] r0 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer.BffChannelType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer$BffChannelType r2 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer.BffChannelType.hOMEDELIVERYNAL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer$BffChannelType r3 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer.BffChannelType.eXPRESSDELIVERY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer$BffChannelType r4 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer.BffChannelType.mARKETPLACE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer$BffChannelType r5 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer.BffChannelType.dRIVECLCV     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                com.carrefour.fid.android.domain.models.product.detail.OfferDetail$ChannelType[] r0 = com.carrefour.fid.android.domain.models.product.detail.OfferDetail.ChannelType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.product.detail.OfferDetail$ChannelType r5 = com.carrefour.fid.android.domain.models.product.detail.OfferDetail.ChannelType.HOME_DELIVERY_NAL     // Catch:{ NoSuchFieldError -> 0x003c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                com.carrefour.fid.android.domain.models.product.detail.OfferDetail$ChannelType r1 = com.carrefour.fid.android.domain.models.product.detail.OfferDetail.ChannelType.EXPRESS_DELIVERY     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                com.carrefour.fid.android.domain.models.product.detail.OfferDetail$ChannelType r1 = com.carrefour.fid.android.domain.models.product.detail.OfferDetail.ChannelType.MARKET_PLACE     // Catch:{ NoSuchFieldError -> 0x004c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                com.carrefour.fid.android.domain.models.product.detail.OfferDetail$ChannelType r1 = com.carrefour.fid.android.domain.models.product.detail.OfferDetail.ChannelType.DRIVE_CLCV     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                $EnumSwitchMapping$1 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.data.api.datasource.ProductToDomainMapperKt.C27459a.<clinit>():void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0058, code lost:
        if (r3 != false) goto L_0x005a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.carrefour.fid.android.domain.models.product.detail.C38107b m115574a(com.carrefour.fid.android.domain.models.product.detail.C38107b r18) {
        /*
            r0 = r18
            java.util.List r1 = r18.mo118720b()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0011:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x007d
            java.lang.Object r2 = r1.next()
            r3 = r2
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r3 = (com.carrefour.fid.android.domain.models.product.detail.OfferDetail) r3
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail$ChannelType r4 = r3.mo118700s()
            r5 = -1
            if (r4 != 0) goto L_0x0027
            r4 = r5
            goto L_0x002f
        L_0x0027:
            int[] r6 = com.carrefour.fid.android.product.data.api.datasource.ProductToDomainMapperKt.C27459a.$EnumSwitchMapping$1
            int r4 = r4.ordinal()
            r4 = r6[r4]
        L_0x002f:
            r6 = 0
            if (r4 == r5) goto L_0x0077
            r5 = 1
            if (r4 == r5) goto L_0x006d
            r7 = 2
            if (r4 == r7) goto L_0x0062
            r7 = 3
            if (r4 == r7) goto L_0x0077
            r7 = 4
            if (r4 != r7) goto L_0x005c
            java.lang.String r4 = r3.mo118705w()
            if (r4 == 0) goto L_0x0049
            boolean r4 = com.carrefour.fid.android.shared.extension.C28789y.m119122e(r4)
            goto L_0x004a
        L_0x0049:
            r4 = r6
        L_0x004a:
            if (r4 != 0) goto L_0x005a
            java.lang.String r3 = r3.mo118705w()
            if (r3 == 0) goto L_0x0057
            boolean r3 = com.carrefour.fid.android.shared.extension.C28789y.m119121d(r3)
            goto L_0x0058
        L_0x0057:
            r3 = r6
        L_0x0058:
            if (r3 == 0) goto L_0x0077
        L_0x005a:
            r6 = r5
            goto L_0x0077
        L_0x005c:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0062:
            java.lang.String r3 = r3.mo118705w()
            if (r3 == 0) goto L_0x0077
            boolean r6 = com.carrefour.fid.android.shared.extension.C28789y.m119123f(r3)
            goto L_0x0077
        L_0x006d:
            java.lang.String r3 = r3.mo118705w()
            if (r3 == 0) goto L_0x0077
            boolean r6 = com.carrefour.fid.android.shared.extension.C28789y.m119124g(r3)
        L_0x0077:
            if (r6 == 0) goto L_0x0011
            r10.add(r2)
            goto L_0x0011
        L_0x007d:
            boolean r1 = r0 instanceof com.carrefour.fid.android.domain.models.product.detail.C38108c
            if (r1 == 0) goto L_0x0098
            r2 = r0
            com.carrefour.fid.android.domain.models.product.detail.c r2 = (com.carrefour.fid.android.domain.models.product.detail.C38108c) r2
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 3967(0xf7f, float:5.559E-42)
            r16 = 0
            com.carrefour.fid.android.domain.models.product.detail.c r0 = com.carrefour.fid.android.domain.models.product.detail.C38108c.m157591u(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x00b3
        L_0x0098:
            boolean r1 = r0 instanceof com.carrefour.fid.android.domain.models.product.detail.C38110e
            if (r1 == 0) goto L_0x00b4
            r2 = r0
            com.carrefour.fid.android.domain.models.product.detail.e r2 = (com.carrefour.fid.android.domain.models.product.detail.C38110e) r2
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 8063(0x1f7f, float:1.1299E-41)
            r17 = 0
            com.carrefour.fid.android.domain.models.product.detail.e r0 = com.carrefour.fid.android.domain.models.product.detail.C38110e.m157625v(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x00b3:
            return r0
        L_0x00b4:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.data.api.datasource.ProductToDomainMapperKt.m115574a(com.carrefour.fid.android.domain.models.product.detail.b):com.carrefour.fid.android.domain.models.product.detail.b");
    }

    @C12580l
    /* renamed from: b */
    public static final Integer m115575b(@C12579k BffProductOffer bffProductOffer) {
        BffDiscount discount;
        List<BffDeals> deals;
        BffDeals bffDeals;
        Intrinsics.checkNotNullParameter(bffProductOffer, "<this>");
        BffPrices prices = bffProductOffer.getPrices();
        if (prices == null || (discount = prices.getDiscount()) == null || (deals = discount.getDeals()) == null || (bffDeals = (BffDeals) CollectionsKt___CollectionsKt.m40479B2(deals)) == null) {
            return null;
        }
        return bffDeals.getBundle();
    }

    /* renamed from: c */
    public static final List<String> m115576c(String str) {
        Object obj;
        try {
            Result.C10852a aVar = Result.f28060a;
            obj = Result.m38702b(SequencesKt___SequencesKt.m44731c3(SequencesKt___SequencesKt.m44761k1(Regex.m45043f(new Regex("<li>(.*?)</li>"), str, 0, 2, (Object) null), ProductToDomainMapperKt$parseKeyFeatures$1$1.f66591f)));
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            obj = Result.m38702b(C11661u0.m45734a(th));
        }
        if (Result.m38705e(obj) != null) {
            obj = CollectionsKt__CollectionsKt.m40441E();
        }
        return (List) obj;
    }

    @C12579k
    /* renamed from: d */
    public static final C38107b m115577d(@C12579k BffCommonProduct bffCommonProduct, @C12579k C28646a aVar) {
        boolean z;
        String str;
        String str2;
        String str3;
        List<String> list;
        List list2;
        List list3;
        String str4;
        String str5;
        Object obj;
        boolean z2;
        String str6;
        BffCommonCategory bffCommonCategory;
        boolean z3;
        String str7;
        String str8;
        String str9;
        List<String> list4;
        List list5;
        boolean z4;
        BffCommonCategory bffCommonCategory2;
        C28646a aVar2 = aVar;
        Intrinsics.checkNotNullParameter(bffCommonProduct, "<this>");
        Intrinsics.checkNotNullParameter(aVar2, "errorReporter");
        String gtin = bffCommonProduct.getGtin();
        if (gtin != null) {
            String b = Gtin.m157308b(gtin);
            if (Intrinsics.areEqual((Object) bffCommonProduct.getBffIsFood(), (Object) Boolean.TRUE)) {
                String name = bffCommonProduct.getName();
                if (name == null) {
                    name = "";
                }
                String bffDisplayBrand = bffCommonProduct.getBffDisplayBrand();
                if (bffDisplayBrand == null || C11622t.isBlank(bffDisplayBrand)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3 ? (str7 = bffCommonProduct.getBrandName()) == null : (str7 = bffCommonProduct.getBffDisplayBrand()) == null) {
                    str7 = "";
                }
                String fullDescription = bffCommonProduct.getFullDescription();
                if (fullDescription != null) {
                    str8 = StringKt.m118913V(fullDescription);
                } else {
                    str8 = null;
                }
                if (str8 == null) {
                    str8 = "";
                }
                String packaging = bffCommonProduct.getPackaging();
                if (packaging == null) {
                    packaging = "";
                }
                Map<PictureSize, List<ProductPicture>> a = C27469a.m115621a(bffCommonProduct.getPictures());
                List<BffCommonCategory> categories = bffCommonProduct.getCategories();
                if (categories == null || (bffCommonCategory2 = (BffCommonCategory) CollectionsKt___CollectionsKt.m40479B2(categories)) == null) {
                    str9 = null;
                } else {
                    str9 = bffCommonCategory2.getName();
                }
                String keyFeatures = bffCommonProduct.getKeyFeatures();
                if (keyFeatures == null || (list4 = m115576c(keyFeatures)) == null) {
                    list4 = CollectionsKt__CollectionsKt.m40441E();
                }
                List<String> list6 = list4;
                List<BffProductOffer> offers = bffCommonProduct.getOffers();
                if (offers != null) {
                    Iterable<BffProductOffer> iterable = offers;
                    list5 = new ArrayList(C10978t.m41495Y(iterable, 10));
                    for (BffProductOffer bffProductOffer : iterable) {
                        list5.add(m115578e(bffProductOffer, aVar2, m115575b(bffProductOffer)));
                    }
                } else {
                    list5 = CollectionsKt__CollectionsKt.m40441E();
                }
                String taxeMessage = bffCommonProduct.getTaxeMessage();
                if (taxeMessage == null) {
                    taxeMessage = "";
                }
                Double repairIndex = bffCommonProduct.getRepairIndex();
                Boolean isVariableWeight = bffCommonProduct.isVariableWeight();
                if (isVariableWeight != null) {
                    z4 = isVariableWeight.booleanValue();
                } else {
                    z4 = false;
                }
                return new C38108c(b, name, str7, packaging, a, str8, list6, list5, taxeMessage, str9, repairIndex, z4, (DefaultConstructorMarker) null);
            }
            String name2 = bffCommonProduct.getName();
            if (name2 == null) {
                name2 = "";
            }
            String bffDisplayBrand2 = bffCommonProduct.getBffDisplayBrand();
            if (bffDisplayBrand2 == null || C11622t.isBlank(bffDisplayBrand2)) {
                z = true;
            } else {
                z = false;
            }
            if (z ? (str = bffCommonProduct.getBrandName()) == null : (str = bffCommonProduct.getBffDisplayBrand()) == null) {
                str = "";
            }
            String fullDescription2 = bffCommonProduct.getFullDescription();
            if (fullDescription2 != null) {
                str2 = StringKt.m118913V(fullDescription2);
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
            String packaging2 = bffCommonProduct.getPackaging();
            if (packaging2 == null) {
                packaging2 = "";
            }
            Map<PictureSize, List<ProductPicture>> a2 = C27469a.m115621a(bffCommonProduct.getPictures());
            List<BffCommonCategory> categories2 = bffCommonProduct.getCategories();
            if (categories2 == null || (bffCommonCategory = (BffCommonCategory) CollectionsKt___CollectionsKt.m40479B2(categories2)) == null) {
                str3 = null;
            } else {
                str3 = bffCommonCategory.getName();
            }
            String keyFeatures2 = bffCommonProduct.getKeyFeatures();
            if (keyFeatures2 == null || (list = m115576c(keyFeatures2)) == null) {
                list = CollectionsKt__CollectionsKt.m40441E();
            }
            List<BffNonFoodAttributes> nonFoodAttributes = bffCommonProduct.getNonFoodAttributes();
            if (nonFoodAttributes != null) {
                Iterable<BffNonFoodAttributes> iterable2 = nonFoodAttributes;
                ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable2, 10));
                for (BffNonFoodAttributes bffNonFoodAttributes : iterable2) {
                    String customerLabel = bffNonFoodAttributes.getCustomerLabel();
                    if (customerLabel == null) {
                        str6 = "";
                    } else {
                        str6 = customerLabel;
                    }
                    String value = bffNonFoodAttributes.getValue();
                    if (value == null) {
                        value = "";
                    }
                    arrayList.add(new Pair(str6, value));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object next : arrayList) {
                    Pair pair = (Pair) next;
                    if (!(!C11622t.isBlank((CharSequence) pair.mo21849e())) || !(!C11622t.isBlank((CharSequence) pair.mo21851f()))) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        arrayList2.add(next);
                    }
                }
                list2 = CollectionsKt___CollectionsKt.m40557Q5(arrayList2);
            } else {
                list2 = null;
            }
            if (list2 == null) {
                list2 = CollectionsKt__CollectionsKt.m40441E();
            }
            List list7 = list2;
            List<BffProductOffer> offers2 = bffCommonProduct.getOffers();
            if (offers2 != null) {
                Iterable<BffProductOffer> iterable3 = offers2;
                ArrayList arrayList3 = new ArrayList(C10978t.m41495Y(iterable3, 10));
                for (BffProductOffer bffProductOffer2 : iterable3) {
                    arrayList3.add(m115578e(bffProductOffer2, aVar2, m115575b(bffProductOffer2)));
                }
                list3 = arrayList3;
            } else {
                list3 = CollectionsKt__CollectionsKt.m40441E();
            }
            String taxeMessage2 = bffCommonProduct.getTaxeMessage();
            if (taxeMessage2 == null) {
                str4 = "";
            } else {
                str4 = taxeMessage2;
            }
            Double repairIndex2 = bffCommonProduct.getRepairIndex();
            List<BffNonFoodAttributes> nonFoodAttributes2 = bffCommonProduct.getNonFoodAttributes();
            if (nonFoodAttributes2 != null) {
                Iterator it = nonFoodAttributes2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual((Object) ((BffNonFoodAttributes) obj).getTypeCode(), (Object) f66590a)) {
                        break;
                    }
                }
                BffNonFoodAttributes bffNonFoodAttributes2 = (BffNonFoodAttributes) obj;
                if (bffNonFoodAttributes2 != null) {
                    str5 = bffNonFoodAttributes2.getValue();
                    return new C38110e(b, name2, str, packaging2, a2, str2, list, list3, str4, str3, repairIndex2, list7, str5, (DefaultConstructorMarker) null);
                }
            }
            str5 = null;
            return new C38110e(b, name2, str, packaging2, a2, str2, list, list3, str4, str3, repairIndex2, list7, str5, (DefaultConstructorMarker) null);
        }
        throw new IllegalStateException("Product without gtin field!");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0123  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.carrefour.fid.android.domain.models.product.detail.OfferDetail m115578e(com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer r20, com.carrefour.fid.android.shared.data.parsing.C28646a r21, java.lang.Integer r22) {
        /*
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r1 = new com.carrefour.fid.android.domain.models.offer.OfferIdentifier
            java.lang.String r0 = r20.getGtin()
            if (r0 == 0) goto L_0x0133
            java.lang.String r0 = com.carrefour.fid.android.domain.models.product.Gtin.m157308b(r0)
            java.lang.String r2 = r20.getCdbase()
            if (r2 == 0) goto L_0x012b
            java.lang.String r2 = com.carrefour.fid.android.domain.models.product.ProductReference.m157466b(r2)
            r3 = 0
            r1.<init>(r0, r2, r3)
            java.lang.String r0 = r20.getFacilityServiceId()
            if (r0 == 0) goto L_0x0026
            java.lang.String r0 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r0)
            r2 = r0
            goto L_0x0027
        L_0x0026:
            r2 = r3
        L_0x0027:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer$BffChannelType r0 = r20.getBffChannelType()
            if (r0 != 0) goto L_0x002f
            r0 = -1
            goto L_0x0037
        L_0x002f:
            int[] r4 = com.carrefour.fid.android.product.data.api.datasource.ProductToDomainMapperKt.C27459a.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r4[r0]
        L_0x0037:
            r4 = 1
            if (r0 == r4) goto L_0x004e
            r5 = 2
            if (r0 == r5) goto L_0x004b
            r5 = 3
            if (r0 == r5) goto L_0x0048
            r5 = 4
            if (r0 == r5) goto L_0x0045
            r5 = r3
            goto L_0x0051
        L_0x0045:
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail$ChannelType r0 = com.carrefour.fid.android.domain.models.product.detail.OfferDetail.ChannelType.DRIVE_CLCV
            goto L_0x0050
        L_0x0048:
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail$ChannelType r0 = com.carrefour.fid.android.domain.models.product.detail.OfferDetail.ChannelType.MARKET_PLACE
            goto L_0x0050
        L_0x004b:
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail$ChannelType r0 = com.carrefour.fid.android.domain.models.product.detail.OfferDetail.ChannelType.EXPRESS_DELIVERY
            goto L_0x0050
        L_0x004e:
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail$ChannelType r0 = com.carrefour.fid.android.domain.models.product.detail.OfferDetail.ChannelType.HOME_DELIVERY_NAL
        L_0x0050:
            r5 = r0
        L_0x0051:
            java.lang.Integer r0 = r20.getPurchasingStep()
            if (r0 == 0) goto L_0x005c
            int r0 = r0.intValue()
            r4 = r0
        L_0x005c:
            java.lang.Integer r0 = r20.getPurchasingMin()
            r6 = 0
            if (r0 == 0) goto L_0x0069
            int r0 = r0.intValue()
            r7 = r0
            goto L_0x006a
        L_0x0069:
            r7 = r6
        L_0x006a:
            java.lang.Integer r0 = r20.getPurchasingMax()
            if (r0 == 0) goto L_0x0075
            int r0 = r0.intValue()
            goto L_0x0078
        L_0x0075:
            r0 = 2147483647(0x7fffffff, float:NaN)
        L_0x0078:
            r8 = r0
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAvailability r0 = r20.getAvailability()
            if (r0 == 0) goto L_0x0084
            java.lang.Boolean r0 = r0.getBffIsAvailable()
            goto L_0x0085
        L_0x0084:
            r0 = r3
        L_0x0085:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r9)
            if (r0 == 0) goto L_0x0090
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r0 = com.carrefour.fid.android.domain.models.offer.OfferAvailability.AVAILABLE
            goto L_0x0092
        L_0x0090:
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r0 = com.carrefour.fid.android.domain.models.offer.OfferAvailability.UNAVAILABLE
        L_0x0092:
            r9 = r0
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPrices r0 = r20.getPrices()
            if (r0 == 0) goto L_0x0123
            com.carrefour.fid.android.domain.models.offer.Prices r10 = com.carrefour.fid.android.product.data.api.datasource.C27461b.m115599h(r0)
            if (r10 == 0) goto L_0x0123
            java.util.List r0 = r20.getBffDiscounts()
            if (r0 == 0) goto L_0x00af
            r11 = r21
            r12 = r22
            java.util.List r0 = com.carrefour.fid.android.bff_data_shared.data.api.mapper.BffSharedMapperKt.toDomain((java.util.List<com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount>) r0, (com.carrefour.fid.android.shared.data.parsing.C28646a) r11, (java.lang.Integer) r12)
            if (r0 != 0) goto L_0x00b3
        L_0x00af:
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x00b3:
            r11 = r0
            java.lang.Boolean r0 = r20.getBffIsPurchasable()
            if (r0 == 0) goto L_0x00c0
            boolean r0 = r0.booleanValue()
            r12 = r0
            goto L_0x00c1
        L_0x00c0:
            r12 = r6
        L_0x00c1:
            java.lang.Boolean r0 = r20.isInAssortment()
            if (r0 == 0) goto L_0x00cd
            boolean r0 = r0.booleanValue()
            r13 = r0
            goto L_0x00ce
        L_0x00cd:
            r13 = r6
        L_0x00ce:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPrices r0 = r20.getPrices()
            if (r0 == 0) goto L_0x00e0
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDiscount r0 = r0.getDiscount()
            if (r0 == 0) goto L_0x00e0
            java.lang.String r0 = r0.getType()
            r14 = r0
            goto L_0x00e1
        L_0x00e0:
            r14 = r3
        L_0x00e1:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPrices r0 = r20.getPrices()
            if (r0 == 0) goto L_0x00f3
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDiscount r0 = r0.getDiscount()
            if (r0 == 0) goto L_0x00f3
            java.lang.String r0 = r0.getLabel()
            r15 = r0
            goto L_0x00f4
        L_0x00f3:
            r15 = r3
        L_0x00f4:
            java.lang.String r0 = r20.getLabelHighlight()
            if (r0 != 0) goto L_0x00fc
            java.lang.String r0 = ""
        L_0x00fc:
            r17 = r0
            java.lang.Boolean r0 = r20.isRelayPointEligible()
            if (r0 == 0) goto L_0x010b
            boolean r0 = r0.booleanValue()
            r18 = r0
            goto L_0x010d
        L_0x010b:
            r18 = r6
        L_0x010d:
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r19 = new com.carrefour.fid.android.domain.models.product.detail.OfferDetail
            r0 = r19
            r16 = 0
            r3 = r5
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r11
            r10 = r15
            r11 = r14
            r14 = r17
            r15 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r19
        L_0x0123:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Offer without price field!"
            r0.<init>(r1)
            throw r0
        L_0x012b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Offer without cdbase field!"
            r0.<init>(r1)
            throw r0
        L_0x0133:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Offer without gtin field!"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.data.api.datasource.ProductToDomainMapperKt.m115578e(com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer, com.carrefour.fid.android.shared.data.parsing.a, java.lang.Integer):com.carrefour.fid.android.domain.models.product.detail.OfferDetail");
    }

    @C12579k
    /* renamed from: f */
    public static final Object m115579f(@C12580l BffPdpResponse bffPdpResponse, @C12579k C28646a aVar) {
        BffCommonProduct product;
        List<BffCommonProduct> list;
        List list2;
        Intrinsics.checkNotNullParameter(aVar, "errorReporter");
        if (bffPdpResponse != null) {
            BffPdpProducts data = bffPdpResponse.getData();
            if (data == null || (product = data.getProduct()) == null) {
                Result.C10852a aVar2 = Result.f28060a;
                return Result.m38702b(C11661u0.m45734a(new Throwable("Can't find product")));
            }
            C38107b a = m115574a(m115577d(product, aVar));
            BffPdpProducts data2 = bffPdpResponse.getData();
            if (data2 != null) {
                list = data2.getMixedProducts();
            } else {
                list = null;
            }
            if (list != null) {
                Iterable<BffCommonProduct> iterable = list;
                list2 = new ArrayList(C10978t.m41495Y(iterable, 10));
                for (BffCommonProduct d : iterable) {
                    list2.add(m115574a(m115577d(d, aVar)));
                }
            } else {
                list2 = CollectionsKt__CollectionsKt.m40441E();
            }
            Result.C10852a aVar3 = Result.f28060a;
            return Result.m38702b(new C27586d(a, list2));
        }
        Result.C10852a aVar4 = Result.f28060a;
        return Result.m38702b(C11661u0.m45734a(new Throwable("Can't parse product from BffPdpResponse")));
    }
}
