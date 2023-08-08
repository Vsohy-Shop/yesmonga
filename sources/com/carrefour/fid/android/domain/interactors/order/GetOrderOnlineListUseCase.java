package com.carrefour.fid.android.domain.interactors.order;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.repositories.OrderOnlineRepository;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.domain.models.OrdersOnlineResultDomain;
import com.carrefour.fid.android.performance.C38328d;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nGetOrderOnlineListUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetOrderOnlineListUseCase.kt\ncom/carrefour/fid/android/domain/interactors/order/GetOrderOnlineListUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n766#2:62\n857#2,2:63\n*S KotlinDebug\n*F\n+ 1 GetOrderOnlineListUseCase.kt\ncom/carrefour/fid/android/domain/interactors/order/GetOrderOnlineListUseCase\n*L\n32#1:62\n32#1:63,2\n*E\n"})
public final class GetOrderOnlineListUseCase implements C37679f<C37724a, OrdersOnlineResultDomain> {

    /* renamed from: d */
    public static final int f94687d = 8;
    @C12579k

    /* renamed from: a */
    public final OrderOnlineRepository f94688a;
    @C12579k

    /* renamed from: b */
    public final C37807b f94689b;
    @C12579k

    /* renamed from: c */
    public final C38328d f94690c;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase$a */
    public static final class C37724a {

        /* renamed from: c */
        public static final int f94691c = 0;
        @C12580l

        /* renamed from: a */
        public final String f94692a;
        @C12580l

        /* renamed from: b */
        public final String f94693b;

        public C37724a() {
            this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        }

        /* renamed from: d */
        public static /* synthetic */ C37724a m154645d(C37724a aVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f94692a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f94693b;
            }
            return aVar.mo114869c(str, str2);
        }

        @C12580l
        /* renamed from: a */
        public final String mo114867a() {
            return this.f94692a;
        }

        @C12580l
        /* renamed from: b */
        public final String mo114868b() {
            return this.f94693b;
        }

        @C12579k
        /* renamed from: c */
        public final C37724a mo114869c(@C12580l String str, @C12580l String str2) {
            return new C37724a(str, str2);
        }

        @C12580l
        /* renamed from: e */
        public final String mo114870e() {
            return this.f94692a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37724a)) {
                return false;
            }
            C37724a aVar = (C37724a) obj;
            return Intrinsics.areEqual((Object) this.f94692a, (Object) aVar.f94692a) && Intrinsics.areEqual((Object) this.f94693b, (Object) aVar.f94693b);
        }

        @C12580l
        /* renamed from: f */
        public final String mo114872f() {
            return this.f94693b;
        }

        public int hashCode() {
            String str = this.f94692a;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f94693b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        @C12579k
        public String toString() {
            String str = this.f94692a;
            String str2 = this.f94693b;
            return "Params(scrollHash=" + str + ", scrollPaging=" + str2 + ")";
        }

        public C37724a(@C12580l String str, @C12580l String str2) {
            this.f94692a = str;
            this.f94693b = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37724a(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }
    }

    @Inject
    public GetOrderOnlineListUseCase(@C12579k OrderOnlineRepository orderOnlineRepository, @C12579k C37807b bVar, @C12579k C38328d dVar) {
        Intrinsics.checkNotNullParameter(orderOnlineRepository, "orderOnlineRepository");
        Intrinsics.checkNotNullParameter(bVar, "remoteConfigRepository");
        Intrinsics.checkNotNullParameter(dVar, "performance");
        this.f94688a = orderOnlineRepository;
        this.f94689b = bVar;
        this.f94690c = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172981invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase.C37724a r17, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.OrdersOnlineResultDomain>> r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase$invoke$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase$invoke$1 r2 = (com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase$invoke$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase$invoke$1 r2 = new com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase$invoke$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L_0x0055
            if (r4 == r7) goto L_0x0043
            if (r4 != r6) goto L_0x003b
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase r2 = (com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase) r2
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x009f
        L_0x003b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0043:
            java.lang.Object r4 = r2.L$1
            com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase$a r4 = (com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase.C37724a) r4
            java.lang.Object r8 = r2.L$0
            com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase r8 = (com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase) r8
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x0079
        L_0x0055:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.performance.d r1 = r0.f94690c
            java.lang.String r4 = "get_online_order_list"
            r1.mo121195d(r4)
            com.carrefour.fid.android.domain.interactors.remoteconfig.b r1 = r0.f94689b
            com.carrefour.fid.android.domain.interactors.remoteconfig.b$a r4 = new com.carrefour.fid.android.domain.interactors.remoteconfig.b$a
            com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag r8 = com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag.OrderHistoryOnline
            r4.<init>(r8)
            r2.L$0 = r0
            r8 = r17
            r2.L$1 = r8
            r2.label = r7
            java.lang.Object r1 = r1.m172966invokegIAlus(r4, r2)
            if (r1 != r3) goto L_0x0077
            return r3
        L_0x0077:
            r4 = r8
            r8 = r0
        L_0x0079:
            java.lang.Throwable r15 = kotlin.Result.m38705e(r1)
            if (r15 != 0) goto L_0x011a
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00fa
            com.carrefour.fid.android.data.repositories.OrderOnlineRepository r1 = r8.f94688a
            java.lang.String r9 = r4.mo114870e()
            java.lang.String r4 = r4.mo114872f()
            r2.L$0 = r8
            r2.L$1 = r5
            r2.label = r6
            java.lang.Object r1 = r1.mo111538j(r9, r4, r2)
            if (r1 != r3) goto L_0x009e
            return r3
        L_0x009e:
            r2 = r8
        L_0x009f:
            boolean r3 = kotlin.Result.m38710j(r1)
            if (r3 == 0) goto L_0x00f0
            kotlin.Result$a r3 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.models.OrdersOnlineResultDomain r1 = (com.carrefour.fid.android.domain.models.OrdersOnlineResultDomain) r1
            java.util.List r3 = r1.getOrders()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x00b8:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x00ec
            java.lang.Object r8 = r3.next()
            r9 = r8
            com.carrefour.fid.android.domain.models.OrdersOnlineDomain r9 = (com.carrefour.fid.android.domain.models.OrdersOnlineDomain) r9
            com.carrefour.fid.android.shared.domain.models.order.OrderType r10 = r9.getOrderType()
            if (r10 == 0) goto L_0x00e5
            com.carrefour.fid.android.shared.domain.models.order.OrderType r10 = r9.getOrderType()
            boolean r10 = r10 instanceof com.carrefour.fid.android.shared.domain.models.order.OrderType.Unknown
            if (r10 != 0) goto L_0x00e5
            com.carrefour.fid.android.shared.domain.models.order.OrderType r10 = r9.getOrderType()
            boolean r10 = r10 instanceof com.carrefour.fid.android.shared.domain.models.order.OrderType.Mktp
            if (r10 != 0) goto L_0x00e5
            com.carrefour.fid.android.shared.domain.models.order.OrderType r9 = r9.getOrderType()
            boolean r9 = r9 instanceof com.carrefour.fid.android.shared.domain.models.order.OrderType.R2h
            if (r9 != 0) goto L_0x00e5
            r9 = r7
            goto L_0x00e6
        L_0x00e5:
            r9 = 0
        L_0x00e6:
            if (r9 == 0) goto L_0x00b8
            r4.add(r8)
            goto L_0x00b8
        L_0x00ec:
            com.carrefour.fid.android.domain.models.OrdersOnlineResultDomain r1 = com.carrefour.fid.android.domain.models.OrdersOnlineResultDomain.copy$default(r1, r4, r5, r6, r5)
        L_0x00f0:
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            com.carrefour.fid.android.performance.d r2 = r2.f94690c
            r2.mo121196e()
            goto L_0x0119
        L_0x00fa:
            com.carrefour.fid.android.performance.d r1 = r8.f94690c
            r1.mo121196e()
            com.carrefour.fid.android.shared.util.i r2 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r3 = "Order history is disabled"
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119706i(r2, r3, r4, r5, r6, r7)
            kotlin.Result$a r1 = kotlin.Result.f28060a
            com.carrefour.fid.android.core.io.OrderHistoryIsUnavailableFromConfigThrowable r1 = new com.carrefour.fid.android.core.io.OrderHistoryIsUnavailableFromConfigThrowable
            r1.<init>()
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
        L_0x0119:
            return r1
        L_0x011a:
            com.carrefour.fid.android.performance.d r1 = r8.f94690c
            r1.mo121196e()
            com.carrefour.fid.android.shared.util.i r9 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r1 = r15.getMessage()
            if (r1 != 0) goto L_0x0129
            java.lang.String r1 = ""
        L_0x0129:
            r10 = r1
            r12 = 0
            r13 = 4
            r14 = 0
            r11 = r15
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r9, r10, r11, r12, r13, r14)
            kotlin.Result$a r1 = kotlin.Result.f28060a
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r15)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase.m172981invokegIAlus(com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }
}
