package com.carrefour.fid.android.domain.interactors.order;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.repositories.OrderOfflineRepository;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.OrdersOfflineDetailsDomain;
import com.carrefour.fid.android.shared.data.headers.C28640a;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
public final class GetOrderOfflineDetailUseCase implements C37679f<C37721a, OrdersOfflineDetailsDomain> {

    /* renamed from: b */
    public static final int f94661b = C28640a.f70232g;
    @C12579k

    /* renamed from: a */
    public final OrderOfflineRepository f94662a;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineDetailUseCase$a */
    public static final class C37721a {

        /* renamed from: f */
        public static final int f94663f = 0;
        @C12579k

        /* renamed from: a */
        public final String f94664a;
        @C12579k

        /* renamed from: b */
        public final String f94665b;
        @C12579k

        /* renamed from: c */
        public final String f94666c;
        @C12579k

        /* renamed from: d */
        public final String f94667d;
        @C12579k

        /* renamed from: e */
        public final String f94668e;

        public C37721a(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5) {
            Intrinsics.checkNotNullParameter(str, "orderGln");
            Intrinsics.checkNotNullParameter(str2, "orderKey");
            Intrinsics.checkNotNullParameter(str3, "orderDate");
            Intrinsics.checkNotNullParameter(str4, "screenName");
            Intrinsics.checkNotNullParameter(str5, "downloadTicketButtonName");
            this.f94664a = str;
            this.f94665b = str2;
            this.f94666c = str3;
            this.f94667d = str4;
            this.f94668e = str5;
        }

        /* renamed from: g */
        public static /* synthetic */ C37721a m154615g(C37721a aVar, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f94664a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f94665b;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = aVar.f94666c;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = aVar.f94667d;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                str5 = aVar.f94668e;
            }
            return aVar.mo114840f(str, str6, str7, str8, str5);
        }

        @C12579k
        /* renamed from: a */
        public final String mo114834a() {
            return this.f94664a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo114835b() {
            return this.f94665b;
        }

        @C12579k
        /* renamed from: c */
        public final String mo114836c() {
            return this.f94666c;
        }

        @C12579k
        /* renamed from: d */
        public final String mo114837d() {
            return this.f94667d;
        }

        @C12579k
        /* renamed from: e */
        public final String mo114838e() {
            return this.f94668e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37721a)) {
                return false;
            }
            C37721a aVar = (C37721a) obj;
            return Intrinsics.areEqual((Object) this.f94664a, (Object) aVar.f94664a) && Intrinsics.areEqual((Object) this.f94665b, (Object) aVar.f94665b) && Intrinsics.areEqual((Object) this.f94666c, (Object) aVar.f94666c) && Intrinsics.areEqual((Object) this.f94667d, (Object) aVar.f94667d) && Intrinsics.areEqual((Object) this.f94668e, (Object) aVar.f94668e);
        }

        @C12579k
        /* renamed from: f */
        public final C37721a mo114840f(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5) {
            Intrinsics.checkNotNullParameter(str, "orderGln");
            Intrinsics.checkNotNullParameter(str2, "orderKey");
            Intrinsics.checkNotNullParameter(str3, "orderDate");
            Intrinsics.checkNotNullParameter(str4, "screenName");
            Intrinsics.checkNotNullParameter(str5, "downloadTicketButtonName");
            return new C37721a(str, str2, str3, str4, str5);
        }

        @C12579k
        /* renamed from: h */
        public final String mo114841h() {
            return this.f94668e;
        }

        public int hashCode() {
            return (((((((this.f94664a.hashCode() * 31) + this.f94665b.hashCode()) * 31) + this.f94666c.hashCode()) * 31) + this.f94667d.hashCode()) * 31) + this.f94668e.hashCode();
        }

        @C12579k
        /* renamed from: i */
        public final String mo114843i() {
            return this.f94666c;
        }

        @C12579k
        /* renamed from: j */
        public final String mo114844j() {
            return this.f94664a;
        }

        @C12579k
        /* renamed from: k */
        public final String mo114845k() {
            return this.f94665b;
        }

        @C12579k
        /* renamed from: l */
        public final String mo114846l() {
            return this.f94667d;
        }

        @C12579k
        public String toString() {
            String str = this.f94664a;
            String str2 = this.f94665b;
            String str3 = this.f94666c;
            String str4 = this.f94667d;
            String str5 = this.f94668e;
            return "Param(orderGln=" + str + ", orderKey=" + str2 + ", orderDate=" + str3 + ", screenName=" + str4 + ", downloadTicketButtonName=" + str5 + ")";
        }
    }

    @Inject
    public GetOrderOfflineDetailUseCase(@C12579k OrderOfflineRepository orderOfflineRepository) {
        Intrinsics.checkNotNullParameter(orderOfflineRepository, "orderOfflineRepository");
        this.f94662a = orderOfflineRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172978invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineDetailUseCase.C37721a r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.OrdersOfflineDetailsDomain>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineDetailUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineDetailUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineDetailUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineDetailUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineDetailUseCase$invoke$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineDetailUseCase$a r5 = (com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineDetailUseCase.C37721a) r5
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x004b
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.data.repositories.OrderOfflineRepository r6 = r4.f94662a
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.mo111533a(r5, r0)
            if (r6 != r1) goto L_0x004b
            return r1
        L_0x004b:
            boolean r0 = kotlin.Result.m38710j(r6)
            if (r0 == 0) goto L_0x0070
            kotlin.Result$a r0 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.models.OrdersOfflineDetailsDomain r6 = (com.carrefour.fid.android.domain.models.OrdersOfflineDetailsDomain) r6
            java.lang.String r0 = r5.mo114844j()
            java.lang.String r1 = r5.mo114845k()
            java.lang.String r2 = r5.mo114843i()
            java.lang.String r3 = r5.mo114846l()
            java.lang.String r5 = r5.mo114841h()
            java.lang.String r5 = com.carrefour.fid.android.domain.extension.C37508i.m153958a(r0, r1, r2, r3, r5)
            r6.setDownloadUrl(r5)
        L_0x0070:
            java.lang.Object r5 = kotlin.Result.m38702b(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineDetailUseCase.m172978invokegIAlus(com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineDetailUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }
}
