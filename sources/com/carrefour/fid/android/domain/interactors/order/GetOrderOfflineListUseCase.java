package com.carrefour.fid.android.domain.interactors.order;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.repositories.OrderOfflineRepository;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.domain.interactors.service.C37816e;
import com.carrefour.fid.android.domain.models.OrdersOfflineResultDomain;
import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import com.carrefour.fid.android.performance.C38328d;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nGetOrderOfflineListUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetOrderOfflineListUseCase.kt\ncom/carrefour/fid/android/domain/interactors/order/GetOrderOfflineListUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,85:1\n1855#2,2:86\n*S KotlinDebug\n*F\n+ 1 GetOrderOfflineListUseCase.kt\ncom/carrefour/fid/android/domain/interactors/order/GetOrderOfflineListUseCase\n*L\n54#1:86,2\n*E\n"})
public final class GetOrderOfflineListUseCase implements C37679f<C37722a, OrdersOfflineResultDomain> {

    /* renamed from: e */
    public static final int f94669e = 8;
    @C12579k

    /* renamed from: a */
    public final C37816e f94670a;
    @C12579k

    /* renamed from: b */
    public final OrderOfflineRepository f94671b;
    @C12579k

    /* renamed from: c */
    public final C37807b f94672c;
    @C12579k

    /* renamed from: d */
    public final C38328d f94673d;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase$a */
    public static final class C37722a {

        /* renamed from: d */
        public static final int f94674d = 0;
        @C12579k

        /* renamed from: a */
        public final String f94675a;
        @C12580l

        /* renamed from: b */
        public final String f94676b;
        @C12580l

        /* renamed from: c */
        public final String f94677c;

        public C37722a(@C12579k String str, @C12580l String str2, @C12580l String str3) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            this.f94675a = str;
            this.f94676b = str2;
            this.f94677c = str3;
        }

        /* renamed from: e */
        public static /* synthetic */ C37722a m154630e(C37722a aVar, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f94675a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f94676b;
            }
            if ((i & 4) != 0) {
                str3 = aVar.f94677c;
            }
            return aVar.mo114853d(str, str2, str3);
        }

        @C12579k
        /* renamed from: a */
        public final String mo114850a() {
            return this.f94675a;
        }

        @C12580l
        /* renamed from: b */
        public final String mo114851b() {
            return this.f94676b;
        }

        @C12580l
        /* renamed from: c */
        public final String mo114852c() {
            return this.f94677c;
        }

        @C12579k
        /* renamed from: d */
        public final C37722a mo114853d(@C12579k String str, @C12580l String str2, @C12580l String str3) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            return new C37722a(str, str2, str3);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37722a)) {
                return false;
            }
            C37722a aVar = (C37722a) obj;
            return Intrinsics.areEqual((Object) this.f94675a, (Object) aVar.f94675a) && Intrinsics.areEqual((Object) this.f94676b, (Object) aVar.f94676b) && Intrinsics.areEqual((Object) this.f94677c, (Object) aVar.f94677c);
        }

        @C12579k
        /* renamed from: f */
        public final String mo114855f() {
            return this.f94675a;
        }

        @C12580l
        /* renamed from: g */
        public final String mo114856g() {
            return this.f94676b;
        }

        @C12580l
        /* renamed from: h */
        public final String mo114857h() {
            return this.f94677c;
        }

        public int hashCode() {
            int hashCode = this.f94675a.hashCode() * 31;
            String str = this.f94676b;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f94677c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        @C12579k
        public String toString() {
            String str = this.f94675a;
            String str2 = this.f94676b;
            String str3 = this.f94677c;
            return "Params(loyaltyCardNumber=" + str + ", scrollHash=" + str2 + ", scrollPaging=" + str3 + ")";
        }
    }

    @Inject
    public GetOrderOfflineListUseCase(@C12579k C37816e eVar, @C12579k OrderOfflineRepository orderOfflineRepository, @C12579k C37807b bVar, @C12579k C38328d dVar) {
        Intrinsics.checkNotNullParameter(eVar, "getFacilityDetailsByAnabelKeyUseCase");
        Intrinsics.checkNotNullParameter(orderOfflineRepository, "orderOfflineRepository");
        Intrinsics.checkNotNullParameter(bVar, "remoteConfigRepository");
        Intrinsics.checkNotNullParameter(dVar, "performance");
        this.f94670a = eVar;
        this.f94671b = orderOfflineRepository;
        this.f94672c = bVar;
        this.f94673d = dVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.carrefour.fid.android.domain.models.OrdersOfflineDomain} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114848b(com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase.C37722a r19, kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.OrdersOfflineResultDomain>> r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase$getOrderList$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase$getOrderList$1 r2 = (com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase$getOrderList$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase$getOrderList$1 r2 = new com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase$getOrderList$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L_0x005d
            if (r4 == r7) goto L_0x004f
            if (r4 != r6) goto L_0x0047
            java.lang.Object r4 = r2.L$3
            com.carrefour.fid.android.domain.models.OrdersOfflineDomain r4 = (com.carrefour.fid.android.domain.models.OrdersOfflineDomain) r4
            java.lang.Object r7 = r2.L$2
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r2.L$1
            com.carrefour.fid.android.domain.models.OrdersOfflineResultDomain r8 = (com.carrefour.fid.android.domain.models.OrdersOfflineResultDomain) r8
            java.lang.Object r9 = r2.L$0
            com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase r9 = (com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase) r9
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x00b0
        L_0x0047:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004f:
            java.lang.Object r4 = r2.L$0
            com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase r4 = (com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase) r4
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x0070
        L_0x005d:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.data.repositories.OrderOfflineRepository r1 = r0.f94671b
            r2.L$0 = r0
            r2.label = r7
            r4 = r19
            java.lang.Object r1 = r1.mo111534b(r4, r2)
            if (r1 != r3) goto L_0x006f
            return r3
        L_0x006f:
            r4 = r0
        L_0x0070:
            java.lang.Throwable r8 = kotlin.Result.m38705e(r1)
            if (r8 != 0) goto L_0x0101
            com.carrefour.fid.android.domain.models.OrdersOfflineResultDomain r1 = (com.carrefour.fid.android.domain.models.OrdersOfflineResultDomain) r1
            java.util.List r7 = r1.getOrders()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r8 = r1
            r9 = r4
        L_0x0084:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x00fa
            java.lang.Object r1 = r7.next()
            r4 = r1
            com.carrefour.fid.android.domain.models.OrdersOfflineDomain r4 = (com.carrefour.fid.android.domain.models.OrdersOfflineDomain) r4
            com.carrefour.fid.android.domain.interactors.service.e r1 = r9.f94670a
            java.lang.String r10 = r4.getFacilityId()
            java.lang.String r10 = com.carrefour.fid.android.domain.models.service.models.C38146a.m158072b(r10)
            com.carrefour.fid.android.domain.models.service.models.a r10 = com.carrefour.fid.android.domain.models.service.models.C38146a.m158071a(r10)
            r2.L$0 = r9
            r2.L$1 = r8
            r2.L$2 = r7
            r2.L$3 = r4
            r2.label = r6
            java.lang.Object r1 = r1.m172966invokegIAlus(r10, r2)
            if (r1 != r3) goto L_0x00b0
            return r3
        L_0x00b0:
            boolean r10 = kotlin.Result.m38710j(r1)
            java.lang.String r11 = ""
            if (r10 == 0) goto L_0x00e0
            r10 = r1
            com.carrefour.fid.android.domain.models.service.models.l r10 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r10
            java.lang.String r12 = r10.mo119361E()
            r4.setFacilityName(r12)
            com.carrefour.fid.android.domain.models.service.models.StoreAddress r10 = r10.mo119392v()
            if (r10 == 0) goto L_0x00d9
            java.lang.String r12 = r10.mo119126h()
            java.lang.String r13 = r10.mo119128i()
            java.lang.String r10 = r10.mo119129j()
            java.lang.String r10 = com.carrefour.fid.android.shared.extension.StringKt.m118932l(r12, r13, r10)
            goto L_0x00da
        L_0x00d9:
            r10 = r5
        L_0x00da:
            if (r10 != 0) goto L_0x00dd
            r10 = r11
        L_0x00dd:
            r4.setFacilityAddress(r10)
        L_0x00e0:
            java.lang.Throwable r14 = kotlin.Result.m38705e(r1)
            if (r14 == 0) goto L_0x0084
            com.carrefour.fid.android.shared.util.i r12 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r1 = r14.getMessage()
            if (r1 != 0) goto L_0x00f0
            r13 = r11
            goto L_0x00f1
        L_0x00f0:
            r13 = r1
        L_0x00f1:
            r15 = 0
            r16 = 4
            r17 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r12, r13, r14, r15, r16, r17)
            goto L_0x0084
        L_0x00fa:
            kotlin.Result$a r1 = kotlin.Result.f28060a
            java.lang.Object r1 = kotlin.Result.m38702b(r8)
            return r1
        L_0x0101:
            boolean r1 = r8 instanceof com.carrefour.fid.android.shared.p046io.ResponseThrowable
            if (r1 == 0) goto L_0x0108
            r5 = r8
            com.carrefour.fid.android.shared.io.ResponseThrowable r5 = (com.carrefour.fid.android.shared.p046io.ResponseThrowable) r5
        L_0x0108:
            r1 = 0
            if (r5 == 0) goto L_0x0114
            int r2 = r5.mo83810a()
            r3 = 1609(0x649, float:2.255E-42)
            if (r2 != r3) goto L_0x0114
            goto L_0x0115
        L_0x0114:
            r7 = r1
        L_0x0115:
            if (r7 == 0) goto L_0x0127
            kotlin.Result$a r1 = kotlin.Result.f28060a
            com.carrefour.fid.android.core.io.OrderHistoryIsUnavailableFromFidelityThrowable r1 = new com.carrefour.fid.android.core.io.OrderHistoryIsUnavailableFromFidelityThrowable
            r1.<init>()
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            goto L_0x0131
        L_0x0127:
            kotlin.Result$a r1 = kotlin.Result.f28060a
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r8)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
        L_0x0131:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase.mo114848b(com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172979invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase.C37722a r13, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.OrdersOfflineResultDomain>> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase$invoke$1
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0054
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r13 = r0.L$0
            com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase r13 = (com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase) r13
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.mo21858l()
            goto L_0x0093
        L_0x0036:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003e:
            java.lang.Object r13 = r0.L$1
            com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase$a r13 = (com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase.C37722a) r13
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase r2 = (com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase) r2
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.mo21858l()
            r11 = r14
            r14 = r13
            r13 = r2
            r2 = r11
            goto L_0x0077
        L_0x0054:
            kotlin.C11661u0.m45747n(r14)
            com.carrefour.fid.android.performance.d r14 = r12.f94673d
            java.lang.String r2 = "get_offline_order_list"
            r14.mo121195d(r2)
            com.carrefour.fid.android.domain.interactors.remoteconfig.b r14 = r12.f94672c
            com.carrefour.fid.android.domain.interactors.remoteconfig.b$a r2 = new com.carrefour.fid.android.domain.interactors.remoteconfig.b$a
            com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag r5 = com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag.OrderHistoryOffline
            r2.<init>(r5)
            r0.L$0 = r12
            r0.L$1 = r13
            r0.label = r4
            java.lang.Object r14 = r14.m172966invokegIAlus(r2, r0)
            if (r14 != r1) goto L_0x0074
            return r1
        L_0x0074:
            r2 = r14
            r14 = r13
            r13 = r12
        L_0x0077:
            java.lang.Throwable r10 = kotlin.Result.m38705e(r2)
            if (r10 != 0) goto L_0x00b9
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0099
            r0.L$0 = r13
            r2 = 0
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r14 = r13.mo114848b(r14, r0)
            if (r14 != r1) goto L_0x0093
            return r1
        L_0x0093:
            com.carrefour.fid.android.performance.d r13 = r13.f94673d
            r13.mo121196e()
            goto L_0x00b8
        L_0x0099:
            com.carrefour.fid.android.performance.d r13 = r13.f94673d
            r13.mo121196e()
            com.carrefour.fid.android.shared.util.i r0 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r1 = "Order history is disabled"
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119706i(r0, r1, r2, r3, r4, r5)
            kotlin.Result$a r13 = kotlin.Result.f28060a
            com.carrefour.fid.android.core.io.OrderHistoryIsUnavailableFromConfigThrowable r13 = new com.carrefour.fid.android.core.io.OrderHistoryIsUnavailableFromConfigThrowable
            r13.<init>()
            java.lang.Object r13 = kotlin.C11661u0.m45734a(r13)
            java.lang.Object r14 = kotlin.Result.m38702b(r13)
        L_0x00b8:
            return r14
        L_0x00b9:
            com.carrefour.fid.android.performance.d r13 = r13.f94673d
            r13.mo121196e()
            com.carrefour.fid.android.shared.util.i r4 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r13 = r10.getMessage()
            if (r13 != 0) goto L_0x00c8
            java.lang.String r13 = ""
        L_0x00c8:
            r5 = r13
            r7 = 0
            r8 = 4
            r9 = 0
            r6 = r10
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r4, r5, r6, r7, r8, r9)
            kotlin.Result$a r13 = kotlin.Result.f28060a
            java.lang.Object r13 = kotlin.C11661u0.m45734a(r10)
            java.lang.Object r13 = kotlin.Result.m38702b(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase.m172979invokegIAlus(com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }
}
