package com.carrefour.fid.android.domain.interactors.order;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.repositories.OrderOnlineRepository;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.interactors.service.C37816e;
import com.carrefour.fid.android.domain.models.C38120r;
import javax.inject.Inject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
public final class GetOrderOnlineDetailUseCase implements C37679f<C37723a, C38120r> {

    /* renamed from: c */
    public static final int f94678c = 8;
    @C12579k

    /* renamed from: a */
    public final C37816e f94679a;
    @C12579k

    /* renamed from: b */
    public final OrderOnlineRepository f94680b;

    @Inject
    public GetOrderOnlineDetailUseCase(@C12579k C37816e eVar, @C12579k OrderOnlineRepository orderOnlineRepository) {
        Intrinsics.checkNotNullParameter(eVar, "getFacilityDetailsByAnabelKeyUseCase");
        Intrinsics.checkNotNullParameter(orderOnlineRepository, "orderOnlineRepository");
        this.f94679a = eVar;
        this.f94680b = orderOnlineRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172980invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase.C37723a r10, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.C38120r>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase$invoke$1
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0059
            if (r2 == r4) goto L_0x0047
            if (r2 != r3) goto L_0x003f
            java.lang.Object r10 = r0.L$2
            com.carrefour.fid.android.domain.models.r r10 = (com.carrefour.fid.android.domain.models.C38120r) r10
            java.lang.Object r1 = r0.L$1
            com.carrefour.fid.android.domain.models.r r1 = (com.carrefour.fid.android.domain.models.C38120r) r1
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.domain.models.r r0 = (com.carrefour.fid.android.domain.models.C38120r) r0
            kotlin.C11661u0.m45747n(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.mo21858l()
            goto L_0x00eb
        L_0x003f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0047:
            java.lang.Object r10 = r0.L$1
            com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase$a r10 = (com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase.C37723a) r10
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase r2 = (com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase) r2
            kotlin.C11661u0.m45747n(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.mo21858l()
            goto L_0x0070
        L_0x0059:
            kotlin.C11661u0.m45747n(r11)
            com.carrefour.fid.android.data.repositories.OrderOnlineRepository r11 = r9.f94680b
            java.lang.String r2 = r10.mo114864d()
            r0.L$0 = r9
            r0.L$1 = r10
            r0.label = r4
            java.lang.Object r11 = r11.mo111537i(r2, r0)
            if (r11 != r1) goto L_0x006f
            return r1
        L_0x006f:
            r2 = r9
        L_0x0070:
            boolean r4 = kotlin.Result.m38710j(r11)
            if (r4 == 0) goto L_0x0142
            kotlin.Result$a r4 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.models.r r11 = (com.carrefour.fid.android.domain.models.C38120r) r11
            java.lang.String r4 = r10.mo114865e()
            if (r4 == 0) goto L_0x00bf
            java.lang.String r4 = r10.mo114862b()
            if (r4 == 0) goto L_0x0091
            java.lang.String r5 = r10.mo114865e()
            java.lang.String r4 = com.carrefour.fid.android.domain.extension.C37509j.m153967i(r11, r5, r4)
            r11.mo118984n0(r4)
        L_0x0091:
            java.lang.String r4 = r10.mo114863c()
            if (r4 == 0) goto L_0x00a2
            java.lang.String r5 = r10.mo114865e()
            java.lang.String r4 = com.carrefour.fid.android.domain.extension.C37509j.m153966h(r11, r5, r4)
            r11.mo118988p0(r4)
        L_0x00a2:
            java.lang.String r4 = r10.mo114861a()
            if (r4 == 0) goto L_0x00bf
            com.carrefour.fid.android.shared.domain.models.order.OrderType r5 = r11.mo118958b0()
            com.carrefour.fid.android.shared.domain.models.order.OrderType$DriveExpressPickup r6 = com.carrefour.fid.android.shared.domain.models.order.OrderType.DriveExpressPickup.f70284e
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 != 0) goto L_0x00bf
            java.lang.String r10 = r10.mo114865e()
            java.lang.String r10 = com.carrefour.fid.android.domain.extension.C37509j.m153969k(r11, r10, r4)
            r11.mo119005x0(r10)
        L_0x00bf:
            com.carrefour.fid.android.shared.domain.models.order.OrderType r10 = r11.mo118958b0()
            boolean r10 = r10 instanceof com.carrefour.fid.android.shared.domain.models.order.OrderType.C28690b
            if (r10 == 0) goto L_0x0134
            com.carrefour.fid.android.domain.interactors.service.e r10 = r2.f94679a
            java.lang.String r2 = r11.mo118944P()
            java.lang.String r2 = com.carrefour.fid.android.shared.extension.StringKt.m118931k(r2)
            java.lang.String r2 = com.carrefour.fid.android.domain.models.service.models.C38146a.m158072b(r2)
            com.carrefour.fid.android.domain.models.service.models.a r2 = com.carrefour.fid.android.domain.models.service.models.C38146a.m158071a(r2)
            r0.L$0 = r11
            r0.L$1 = r11
            r0.L$2 = r11
            r0.label = r3
            java.lang.Object r10 = r10.m172966invokegIAlus(r2, r0)
            if (r10 != r1) goto L_0x00e8
            return r1
        L_0x00e8:
            r0 = r11
            r11 = r10
            r10 = r0
        L_0x00eb:
            boolean r1 = kotlin.Result.m38710j(r11)
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x011b
            r1 = r11
            com.carrefour.fid.android.domain.models.service.models.l r1 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r1
            java.lang.String r3 = r1.mo119361E()
            r10.mo119007y0(r3)
            com.carrefour.fid.android.domain.models.service.models.StoreAddress r1 = r1.mo119392v()
            if (r1 == 0) goto L_0x0114
            java.lang.String r3 = r1.mo119126h()
            java.lang.String r4 = r1.mo119128i()
            java.lang.String r1 = r1.mo119129j()
            java.lang.String r1 = com.carrefour.fid.android.shared.extension.StringKt.m118932l(r3, r4, r1)
            goto L_0x0115
        L_0x0114:
            r1 = 0
        L_0x0115:
            if (r1 != 0) goto L_0x0118
            r1 = r2
        L_0x0118:
            r10.mo118982m0(r1)
        L_0x011b:
            java.lang.Throwable r5 = kotlin.Result.m38705e(r11)
            if (r5 == 0) goto L_0x0132
            com.carrefour.fid.android.shared.util.i r3 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r10 = r5.getMessage()
            if (r10 != 0) goto L_0x012b
            r4 = r2
            goto L_0x012c
        L_0x012b:
            r4 = r10
        L_0x012c:
            r6 = 0
            r7 = 4
            r8 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r3, r4, r5, r6, r7, r8)
        L_0x0132:
            r11 = r0
            goto L_0x013b
        L_0x0134:
            java.lang.String r10 = com.carrefour.fid.android.domain.extension.C37509j.m153965g(r11)
            r11.mo118982m0(r10)
        L_0x013b:
            kotlin.Result$a r10 = kotlin.Result.f28060a
            java.lang.Object r10 = kotlin.Result.m38702b(r11)
            return r10
        L_0x0142:
            java.lang.Object r10 = kotlin.Result.m38702b(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase.m172980invokegIAlus(com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase$a */
    public static final class C37723a {

        /* renamed from: f */
        public static final int f94681f = 0;
        @C12579k

        /* renamed from: a */
        public final String f94682a;
        @C12580l

        /* renamed from: b */
        public final String f94683b;
        @C12580l

        /* renamed from: c */
        public final String f94684c;
        @C12580l

        /* renamed from: d */
        public final String f94685d;
        @C12580l

        /* renamed from: e */
        public final String f94686e;

        public C37723a(@C12579k String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5) {
            Intrinsics.checkNotNullParameter(str, "orderId");
            this.f94682a = str;
            this.f94683b = str2;
            this.f94684c = str3;
            this.f94685d = str4;
            this.f94686e = str5;
        }

        @C12580l
        /* renamed from: a */
        public final String mo114861a() {
            return this.f94686e;
        }

        @C12580l
        /* renamed from: b */
        public final String mo114862b() {
            return this.f94685d;
        }

        @C12580l
        /* renamed from: c */
        public final String mo114863c() {
            return this.f94684c;
        }

        @C12579k
        /* renamed from: d */
        public final String mo114864d() {
            return this.f94682a;
        }

        @C12580l
        /* renamed from: e */
        public final String mo114865e() {
            return this.f94683b;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37723a(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
        }
    }
}
