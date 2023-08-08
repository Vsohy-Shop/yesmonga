package com.carrefour.fid.android.product.data.api.mapper;

import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAdditionalInformations;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAdvancedSearch;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonProduct;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFacetsObject;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFullMetadata;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPdpProducts;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPdpResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPlpData;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPlpProduct;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPlpResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPlpResponseV2;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductMetrics;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSortsObject;
import com.carrefour.fid.android.bff_data_shared.data.api.mapper.BffSharedMapperKt;
import com.carrefour.fid.android.domain.models.criteo.C38012n;
import com.carrefour.fid.android.domain.models.product.C38111e;
import com.carrefour.fid.android.domain.models.product.Facet;
import com.carrefour.fid.android.domain.models.product.Filter;
import com.carrefour.fid.android.domain.models.product.Sort;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.product.data.api.datasource.C27460a;
import com.carrefour.fid.android.product.domain.model.C27583a;
import com.carrefour.fid.android.product.domain.model.C27584b;
import com.carrefour.fid.android.shared.data.parsing.C28646a;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPlpToDomainMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlpToDomainMapper.kt\ncom/carrefour/fid/android/product/data/api/mapper/PlpToDomainMapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1549#2:166\n1620#2,3:167\n1549#2:170\n1620#2,3:171\n1603#2,9:174\n1855#2:183\n1856#2:185\n1612#2:186\n1603#2,9:187\n1855#2:196\n1856#2:198\n1612#2:199\n1549#2:200\n1620#2,2:201\n766#2:203\n857#2,2:204\n1622#2:206\n766#2:207\n857#2,2:208\n1#3:184\n1#3:197\n*S KotlinDebug\n*F\n+ 1 PlpToDomainMapper.kt\ncom/carrefour/fid/android/product/data/api/mapper/PlpToDomainMapperKt\n*L\n30#1:166\n30#1:167,3\n46#1:170\n46#1:171,3\n64#1:174,9\n64#1:183\n64#1:185\n64#1:186\n92#1:187,9\n92#1:196\n92#1:198\n92#1:199\n123#1:200\n123#1:201,2\n125#1:203\n125#1:204,2\n123#1:206\n150#1:207\n150#1:208,2\n64#1:184\n92#1:197\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.data.api.mapper.b */
public final class C27473b {

    /* renamed from: com.carrefour.fid.android.product.data.api.mapper.b$a */
    public /* synthetic */ class C27474a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                com.carrefour.fid.android.domain.models.product.plp.PlpOffer$ChannelType[] r0 = com.carrefour.fid.android.domain.models.product.plp.PlpOffer.ChannelType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.product.plp.PlpOffer$ChannelType r1 = com.carrefour.fid.android.domain.models.product.plp.PlpOffer.ChannelType.HOME_DELIVERY_NAL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.domain.models.product.plp.PlpOffer$ChannelType r1 = com.carrefour.fid.android.domain.models.product.plp.PlpOffer.ChannelType.EXPRESS_DELIVERY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.domain.models.product.plp.PlpOffer$ChannelType r1 = com.carrefour.fid.android.domain.models.product.plp.PlpOffer.ChannelType.MARKET_PLACE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.carrefour.fid.android.domain.models.product.plp.PlpOffer$ChannelType r1 = com.carrefour.fid.android.domain.models.product.plp.PlpOffer.ChannelType.DRIVE_CLCV     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.data.api.mapper.C27473b.C27474a.<clinit>():void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        if (r2 != false) goto L_0x0058;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.carrefour.fid.android.domain.models.product.plp.C38115c m115622a(com.carrefour.fid.android.domain.models.product.plp.C38115c r22) {
        /*
            java.util.List r0 = r22.mo118855F()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x000f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x007b
            java.lang.Object r1 = r0.next()
            r2 = r1
            com.carrefour.fid.android.domain.models.product.plp.PlpOffer r2 = (com.carrefour.fid.android.domain.models.product.plp.PlpOffer) r2
            com.carrefour.fid.android.domain.models.product.plp.PlpOffer$ChannelType r3 = r2.mo118815s()
            r4 = -1
            if (r3 != 0) goto L_0x0025
            r3 = r4
            goto L_0x002d
        L_0x0025:
            int[] r5 = com.carrefour.fid.android.product.data.api.mapper.C27473b.C27474a.$EnumSwitchMapping$0
            int r3 = r3.ordinal()
            r3 = r5[r3]
        L_0x002d:
            r5 = 0
            if (r3 == r4) goto L_0x0075
            r4 = 1
            if (r3 == r4) goto L_0x006b
            r6 = 2
            if (r3 == r6) goto L_0x0060
            r6 = 3
            if (r3 == r6) goto L_0x0075
            r6 = 4
            if (r3 != r6) goto L_0x005a
            java.lang.String r3 = r2.mo118818u()
            if (r3 == 0) goto L_0x0047
            boolean r3 = com.carrefour.fid.android.shared.extension.C28789y.m119122e(r3)
            goto L_0x0048
        L_0x0047:
            r3 = r5
        L_0x0048:
            if (r3 != 0) goto L_0x0058
            java.lang.String r2 = r2.mo118818u()
            if (r2 == 0) goto L_0x0055
            boolean r2 = com.carrefour.fid.android.shared.extension.C28789y.m119121d(r2)
            goto L_0x0056
        L_0x0055:
            r2 = r5
        L_0x0056:
            if (r2 == 0) goto L_0x0075
        L_0x0058:
            r5 = r4
            goto L_0x0075
        L_0x005a:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0060:
            java.lang.String r2 = r2.mo118818u()
            if (r2 == 0) goto L_0x0075
            boolean r5 = com.carrefour.fid.android.shared.extension.C28789y.m119123f(r2)
            goto L_0x0075
        L_0x006b:
            java.lang.String r2 = r2.mo118818u()
            if (r2 == 0) goto L_0x0075
            boolean r5 = com.carrefour.fid.android.shared.extension.C28789y.m119124g(r2)
        L_0x0075:
            if (r5 == 0) goto L_0x000f
            r10.add(r1)
            goto L_0x000f
        L_0x007b:
            r2 = 0
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
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 261887(0x3feff, float:3.66982E-40)
            r21 = 0
            r1 = r22
            com.carrefour.fid.android.domain.models.product.plp.c r0 = com.carrefour.fid.android.domain.models.product.plp.C38115c.m157720t(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.data.api.mapper.C27473b.m115622a(com.carrefour.fid.android.domain.models.product.plp.c):com.carrefour.fid.android.domain.models.product.plp.c");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0082, code lost:
        if (r11 != false) goto L_0x0084;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.carrefour.fid.android.product.domain.model.C27584b m115623b(com.carrefour.fid.android.product.domain.model.C27584b r24) {
        /*
            java.util.List r0 = r24.mo80078p()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.C10978t.m41495Y(r0, r1)
            r2.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x0015:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00c7
            java.lang.Object r1 = r0.next()
            r3 = r1
            com.carrefour.fid.android.domain.models.product.plp.c r3 = (com.carrefour.fid.android.domain.models.product.plp.C38115c) r3
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            java.util.List r1 = r3.mo118855F()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0038:
            boolean r13 = r1.hasNext()
            if (r13 == 0) goto L_0x00a8
            java.lang.Object r13 = r1.next()
            r14 = r13
            com.carrefour.fid.android.domain.models.product.plp.PlpOffer r14 = (com.carrefour.fid.android.domain.models.product.plp.PlpOffer) r14
            com.carrefour.fid.android.domain.models.product.plp.PlpOffer$ChannelType r15 = r14.mo118815s()
            r11 = -1
            if (r15 != 0) goto L_0x004e
            r15 = r11
            goto L_0x0056
        L_0x004e:
            int[] r16 = com.carrefour.fid.android.product.data.api.mapper.C27473b.C27474a.$EnumSwitchMapping$0
            int r15 = r15.ordinal()
            r15 = r16[r15]
        L_0x0056:
            r16 = 0
            if (r15 == r11) goto L_0x00a2
            r11 = 1
            if (r15 == r11) goto L_0x0098
            r11 = 2
            if (r15 == r11) goto L_0x008d
            r11 = 3
            if (r15 == r11) goto L_0x00a2
            r11 = 4
            if (r15 != r11) goto L_0x0087
            java.lang.String r11 = r14.mo118818u()
            if (r11 == 0) goto L_0x0071
            boolean r11 = com.carrefour.fid.android.shared.extension.C28789y.m119122e(r11)
            goto L_0x0073
        L_0x0071:
            r11 = r16
        L_0x0073:
            if (r11 != 0) goto L_0x0084
            java.lang.String r11 = r14.mo118818u()
            if (r11 == 0) goto L_0x0080
            boolean r11 = com.carrefour.fid.android.shared.extension.C28789y.m119121d(r11)
            goto L_0x0082
        L_0x0080:
            r11 = r16
        L_0x0082:
            if (r11 == 0) goto L_0x00a2
        L_0x0084:
            r16 = 1
            goto L_0x00a2
        L_0x0087:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x008d:
            java.lang.String r11 = r14.mo118818u()
            if (r11 == 0) goto L_0x00a2
            boolean r16 = com.carrefour.fid.android.shared.extension.C28789y.m119123f(r11)
            goto L_0x00a2
        L_0x0098:
            java.lang.String r11 = r14.mo118818u()
            if (r11 == 0) goto L_0x00a2
            boolean r16 = com.carrefour.fid.android.shared.extension.C28789y.m119124g(r11)
        L_0x00a2:
            if (r16 == 0) goto L_0x0038
            r12.add(r13)
            goto L_0x0038
        L_0x00a8:
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 261887(0x3feff, float:3.66982E-40)
            r23 = 0
            r1 = 0
            r11 = r1
            com.carrefour.fid.android.domain.models.product.plp.c r1 = com.carrefour.fid.android.domain.models.product.plp.C38115c.m157720t(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r2.add(r1)
            goto L_0x0015
        L_0x00c7:
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 254(0xfe, float:3.56E-43)
            r11 = 0
            r1 = r24
            com.carrefour.fid.android.product.domain.model.b r0 = com.carrefour.fid.android.product.domain.model.C27584b.m116029j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.data.api.mapper.C27473b.m115623b(com.carrefour.fid.android.product.domain.model.b):com.carrefour.fid.android.product.domain.model.b");
    }

    @C12579k
    /* renamed from: c */
    public static final Object m115624c(@C12580l BffPdpResponse bffPdpResponse, @C12579k C28646a aVar) {
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
            C38115c a = m115622a(BffSharedMapperKt.toDomain$default(product, aVar, (C38012n) null, 2, (Object) null));
            BffPdpProducts data2 = bffPdpResponse.getData();
            if (data2 != null) {
                list = data2.getMixedProducts();
            } else {
                list = null;
            }
            if (list != null) {
                Iterable<BffCommonProduct> iterable = list;
                list2 = new ArrayList(C10978t.m41495Y(iterable, 10));
                for (BffCommonProduct domain$default : iterable) {
                    list2.add(m115622a(BffSharedMapperKt.toDomain$default(domain$default, aVar, (C38012n) null, 2, (Object) null)));
                }
            } else {
                list2 = CollectionsKt__CollectionsKt.m40441E();
            }
            Result.C10852a aVar3 = Result.f28060a;
            return Result.m38702b(new C27583a(a, list2));
        }
        Result.C10852a aVar4 = Result.f28060a;
        return Result.m38702b(C11661u0.m45734a(new Throwable("Can't parse product from BffPdpResponse")));
    }

    @C12579k
    /* renamed from: d */
    public static final Object m115625d(@C12580l BffPlpResponse bffPlpResponse, @C12579k C28646a aVar) {
        ArrayList arrayList;
        int i;
        int i2;
        int i3;
        Integer num;
        Integer totalResults;
        Integer totalPages;
        Integer currentPage;
        C38115c cVar;
        Intrinsics.checkNotNullParameter(aVar, "errorReporter");
        if (bffPlpResponse != null) {
            List<BffPlpProduct> data = bffPlpResponse.getData();
            Integer num2 = null;
            if (data != null) {
                ArrayList arrayList2 = new ArrayList();
                for (BffPlpProduct product : data) {
                    BffCommonProduct product2 = product.getProduct();
                    if (product2 != null) {
                        cVar = BffSharedMapperKt.toDomain$default(product2, aVar, (C38012n) null, 2, (Object) null);
                    } else {
                        cVar = null;
                    }
                    if (cVar != null) {
                        arrayList2.add(cVar);
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                Result.C10852a aVar2 = Result.f28060a;
                return Result.m38702b(C11661u0.m45734a(new Throwable("Can't find products in response")));
            }
            Result.C10852a aVar3 = Result.f28060a;
            BffFullMetadata metadata = bffPlpResponse.getMetadata();
            if (metadata == null || (currentPage = metadata.getCurrentPage()) == null) {
                i = 0;
            } else {
                i = currentPage.intValue();
            }
            BffFullMetadata metadata2 = bffPlpResponse.getMetadata();
            if (metadata2 == null || (totalPages = metadata2.getTotalPages()) == null) {
                i2 = 0;
            } else {
                i2 = totalPages.intValue();
            }
            BffFullMetadata metadata3 = bffPlpResponse.getMetadata();
            if (metadata3 == null || (totalResults = metadata3.getTotalResults()) == null) {
                i3 = 0;
            } else {
                i3 = totalResults.intValue();
            }
            BffFullMetadata metadata4 = bffPlpResponse.getMetadata();
            if (metadata4 != null) {
                num = metadata4.getNextPage();
            } else {
                num = null;
            }
            BffFullMetadata metadata5 = bffPlpResponse.getMetadata();
            if (metadata5 != null) {
                num2 = metadata5.getPreviousPage();
            }
            return Result.m38702b(m115623b(new C27584b(arrayList, i, i2, i3, num, num2, (Facet) null, (Integer) null)));
        }
        Result.C10852a aVar4 = Result.f28060a;
        return Result.m38702b(C11661u0.m45734a(new Throwable("Can't parse product from BffPlpResponse")));
    }

    @C12579k
    /* renamed from: e */
    public static final Object m115626e(@C12580l BffPlpResponseV2 bffPlpResponseV2, @C12579k C28646a aVar) {
        ArrayList arrayList;
        int i;
        int i2;
        int i3;
        Integer num;
        Integer num2;
        Facet facet;
        BffAdditionalInformations bffAdditionalInformations;
        BffAdvancedSearch bffAdvancedSearch;
        BffFacetsObject facets;
        Integer totalResults;
        Integer totalPages;
        Integer currentPage;
        List<BffPlpProduct> products;
        C38115c cVar;
        Intrinsics.checkNotNullParameter(aVar, "errorReporter");
        if (bffPlpResponseV2 != null) {
            BffPlpData data = bffPlpResponseV2.getData();
            Integer num3 = null;
            if (data == null || (products = data.getProducts()) == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (BffPlpProduct product : products) {
                    BffCommonProduct product2 = product.getProduct();
                    if (product2 != null) {
                        cVar = BffSharedMapperKt.toDomain$default(product2, aVar, (C38012n) null, 2, (Object) null);
                    } else {
                        cVar = null;
                    }
                    if (cVar != null) {
                        arrayList2.add(cVar);
                    }
                }
                arrayList = arrayList2;
            }
            if (arrayList == null) {
                Result.C10852a aVar2 = Result.f28060a;
                return Result.m38702b(C11661u0.m45734a(new Throwable("Can't find products in response")));
            }
            Result.C10852a aVar3 = Result.f28060a;
            BffFullMetadata metadata = bffPlpResponseV2.getMetadata();
            if (metadata == null || (currentPage = metadata.getCurrentPage()) == null) {
                i = 0;
            } else {
                i = currentPage.intValue();
            }
            BffFullMetadata metadata2 = bffPlpResponseV2.getMetadata();
            if (metadata2 == null || (totalPages = metadata2.getTotalPages()) == null) {
                i2 = 0;
            } else {
                i2 = totalPages.intValue();
            }
            BffFullMetadata metadata3 = bffPlpResponseV2.getMetadata();
            if (metadata3 == null || (totalResults = metadata3.getTotalResults()) == null) {
                i3 = 0;
            } else {
                i3 = totalResults.intValue();
            }
            BffFullMetadata metadata4 = bffPlpResponseV2.getMetadata();
            if (metadata4 != null) {
                num = metadata4.getNextPage();
            } else {
                num = null;
            }
            BffFullMetadata metadata5 = bffPlpResponseV2.getMetadata();
            if (metadata5 != null) {
                num2 = metadata5.getPreviousPage();
            } else {
                num2 = null;
            }
            BffPlpData data2 = bffPlpResponseV2.getData();
            if (data2 == null || (bffAdvancedSearch = data2.getBffAdvancedSearch()) == null || (facets = bffAdvancedSearch.getFacets()) == null) {
                facet = null;
            } else {
                facet = C27460a.m115587b(facets, aVar);
            }
            BffPlpData data3 = bffPlpResponseV2.getData();
            if (!(data3 == null || (bffAdditionalInformations = data3.getBffAdditionalInformations()) == null)) {
                num3 = bffAdditionalInformations.getTopResultsCategoryId();
            }
            return Result.m38702b(m115623b(new C27584b(arrayList, i, i2, i3, num, num2, facet, num3)));
        }
        Result.C10852a aVar4 = Result.f28060a;
        return Result.m38702b(C11661u0.m45734a(new Throwable("Can't parse product from BffPlpResponse")));
    }

    @C12579k
    /* renamed from: f */
    public static final Object m115627f(@C12580l BffPlpResponseV2 bffPlpResponseV2) {
        BffPlpData data;
        BffAdvancedSearch bffAdvancedSearch;
        BffFacetsObject facets;
        ArrayList arrayList;
        int i;
        Integer totalResult;
        if (bffPlpResponseV2 == null || (data = bffPlpResponseV2.getData()) == null || (bffAdvancedSearch = data.getBffAdvancedSearch()) == null || (facets = bffAdvancedSearch.getFacets()) == null) {
            Result.C10852a aVar = Result.f28060a;
            return Result.m38702b(C11661u0.m45734a(new Throwable("Can't parse response from BffPlpResponse")));
        }
        Result.C10852a aVar2 = Result.f28060a;
        List<Filter.CheckboxFilter> c = C27460a.m115588c(facets.getFilters());
        List<BffSortsObject> sorts = facets.getSorts();
        if (sorts != null) {
            Iterable<BffSortsObject> iterable = sorts;
            ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (BffSortsObject bffSortsObject : iterable) {
                String field = bffSortsObject.getField();
                String str = "";
                if (field == null) {
                    field = str;
                }
                String b = C38111e.m157650b(field);
                String label = bffSortsObject.getLabel();
                if (label != null) {
                    str = label;
                }
                arrayList2.add(new Sort(b, str, Intrinsics.areEqual((Object) bffSortsObject.getSelected(), (Object) Boolean.TRUE), (DefaultConstructorMarker) null));
            }
            arrayList = arrayList2;
        } else {
            arrayList = CollectionsKt__CollectionsKt.m40441E();
        }
        BffProductMetrics productsMetrics = facets.getProductsMetrics();
        if (productsMetrics == null || (totalResult = productsMetrics.getTotalResult()) == null) {
            i = 0;
        } else {
            i = totalResult.intValue();
        }
        return Result.m38702b(new Facet(c, arrayList, i, false, false));
    }
}
