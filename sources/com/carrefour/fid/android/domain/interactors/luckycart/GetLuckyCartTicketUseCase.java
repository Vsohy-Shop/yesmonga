package com.carrefour.fid.android.domain.interactors.luckycart;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.domain.models.CategoryModel;
import com.carrefour.fid.android.domain.models.LuckyCartTicketDomain;
import com.carrefour.fid.android.domain.models.OrderConfirmationModel;
import com.carrefour.fid.android.domain.repositories.C38196e;
import com.carrefour.fid.android.performance.C38328d;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nGetLuckyCartTicketUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetLuckyCartTicketUseCase.kt\ncom/carrefour/fid/android/domain/interactors/luckycart/GetLuckyCartTicketUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
public final class GetLuckyCartTicketUseCase implements C37679f<C37704a, LuckyCartTicketDomain> {

    /* renamed from: d */
    public static final int f94569d = 8;
    @C12579k

    /* renamed from: a */
    public final C38196e f94570a;
    @C12579k

    /* renamed from: b */
    public final C37807b f94571b;
    @C12579k

    /* renamed from: c */
    public final C38328d f94572c;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartTicketUseCase$a */
    public static final class C37704a {

        /* renamed from: c */
        public static final int f94573c = 8;
        @C12580l

        /* renamed from: a */
        public final OrderConfirmationModel f94574a;
        @C12579k

        /* renamed from: b */
        public final HashMap<String, CategoryModel> f94575b;

        public C37704a(@C12580l OrderConfirmationModel orderConfirmationModel, @C12579k HashMap<String, CategoryModel> hashMap) {
            Intrinsics.checkNotNullParameter(hashMap, "categoryListByGtin");
            this.f94574a = orderConfirmationModel;
            this.f94575b = hashMap;
        }

        /* renamed from: d */
        public static /* synthetic */ C37704a m154494d(C37704a aVar, OrderConfirmationModel orderConfirmationModel, HashMap<String, CategoryModel> hashMap, int i, Object obj) {
            if ((i & 1) != 0) {
                orderConfirmationModel = aVar.f94574a;
            }
            if ((i & 2) != 0) {
                hashMap = aVar.f94575b;
            }
            return aVar.mo114749c(orderConfirmationModel, hashMap);
        }

        @C12580l
        /* renamed from: a */
        public final OrderConfirmationModel mo114747a() {
            return this.f94574a;
        }

        @C12579k
        /* renamed from: b */
        public final HashMap<String, CategoryModel> mo114748b() {
            return this.f94575b;
        }

        @C12579k
        /* renamed from: c */
        public final C37704a mo114749c(@C12580l OrderConfirmationModel orderConfirmationModel, @C12579k HashMap<String, CategoryModel> hashMap) {
            Intrinsics.checkNotNullParameter(hashMap, "categoryListByGtin");
            return new C37704a(orderConfirmationModel, hashMap);
        }

        @C12579k
        /* renamed from: e */
        public final HashMap<String, CategoryModel> mo114750e() {
            return this.f94575b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37704a)) {
                return false;
            }
            C37704a aVar = (C37704a) obj;
            return Intrinsics.areEqual((Object) this.f94574a, (Object) aVar.f94574a) && Intrinsics.areEqual((Object) this.f94575b, (Object) aVar.f94575b);
        }

        @C12580l
        /* renamed from: f */
        public final OrderConfirmationModel mo114752f() {
            return this.f94574a;
        }

        public int hashCode() {
            OrderConfirmationModel orderConfirmationModel = this.f94574a;
            return ((orderConfirmationModel == null ? 0 : orderConfirmationModel.hashCode()) * 31) + this.f94575b.hashCode();
        }

        @C12579k
        public String toString() {
            OrderConfirmationModel orderConfirmationModel = this.f94574a;
            HashMap<String, CategoryModel> hashMap = this.f94575b;
            return "Param(orderConfirmationModel=" + orderConfirmationModel + ", categoryListByGtin=" + hashMap + ")";
        }
    }

    @Inject
    public GetLuckyCartTicketUseCase(@C12579k C38196e eVar, @C12579k C37807b bVar, @C12579k C38328d dVar) {
        Intrinsics.checkNotNullParameter(eVar, "luckyCartRepository");
        Intrinsics.checkNotNullParameter(bVar, "remoteConfigRepository");
        Intrinsics.checkNotNullParameter(dVar, "performance");
        this.f94570a = eVar;
        this.f94571b = bVar;
        this.f94572c = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114745b(com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartTicketUseCase.C37704a r5, kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.LuckyCartTicketDomain>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartTicketUseCase$getLuckyCartTicket$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartTicketUseCase$getLuckyCartTicket$1 r0 = (com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartTicketUseCase$getLuckyCartTicket$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartTicketUseCase$getLuckyCartTicket$1 r0 = new com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartTicketUseCase$getLuckyCartTicket$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.mo21858l()
            goto L_0x004d
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.domain.repositories.e r6 = r4.f94570a
            com.carrefour.fid.android.domain.models.OrderConfirmationModel r2 = r5.mo114752f()
            java.util.HashMap r5 = r5.mo114750e()
            r0.label = r3
            java.lang.Object r5 = r6.mo111511b(r2, r5, r0)
            if (r5 != r1) goto L_0x004d
            return r1
        L_0x004d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartTicketUseCase.mo114745b(com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartTicketUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007f A[SYNTHETIC, Splitter:B:23:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172972invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartTicketUseCase.C37704a r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.LuckyCartTicketDomain>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartTicketUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartTicketUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartTicketUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartTicketUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartTicketUseCase$invoke$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0056
            if (r2 == r4) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r8 = r0.L$0
            com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartTicketUseCase r8 = (com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartTicketUseCase) r8
            kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x0036 }
            kotlin.Result r9 = (kotlin.Result) r9     // Catch:{ all -> 0x0036 }
            java.lang.Object r9 = r9.mo21858l()     // Catch:{ all -> 0x0036 }
            goto L_0x0094
        L_0x0036:
            r9 = move-exception
            goto L_0x009e
        L_0x0038:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0040:
            java.lang.Object r8 = r0.L$1
            com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartTicketUseCase$a r8 = (com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartTicketUseCase.C37704a) r8
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartTicketUseCase r2 = (com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartTicketUseCase) r2
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            r6 = r9
            r9 = r8
            r8 = r2
            r2 = r6
            goto L_0x0079
        L_0x0056:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.performance.d r9 = r7.f94572c
            java.lang.String r2 = "get_luckycart_ticket"
            r9.mo121195d(r2)
            com.carrefour.fid.android.domain.interactors.remoteconfig.b r9 = r7.f94571b
            com.carrefour.fid.android.domain.interactors.remoteconfig.b$a r2 = new com.carrefour.fid.android.domain.interactors.remoteconfig.b$a
            com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag r5 = com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag.LuckyCartProducts
            r2.<init>(r5)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r9 = r9.m172966invokegIAlus(r2, r0)
            if (r9 != r1) goto L_0x0076
            return r1
        L_0x0076:
            r2 = r9
            r9 = r8
            r8 = r7
        L_0x0079:
            boolean r4 = kotlin.Result.m38710j(r2)
            if (r4 == 0) goto L_0x00a9
            kotlin.Result$a r4 = kotlin.Result.f28060a     // Catch:{ all -> 0x0036 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x0036 }
            r2.booleanValue()     // Catch:{ all -> 0x0036 }
            r0.L$0 = r8     // Catch:{ all -> 0x0036 }
            r2 = 0
            r0.L$1 = r2     // Catch:{ all -> 0x0036 }
            r0.label = r3     // Catch:{ all -> 0x0036 }
            java.lang.Object r9 = r8.mo114745b(r9, r0)     // Catch:{ all -> 0x0036 }
            if (r9 != r1) goto L_0x0094
            return r1
        L_0x0094:
            kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x0036 }
            com.carrefour.fid.android.domain.models.LuckyCartTicketDomain r9 = (com.carrefour.fid.android.domain.models.LuckyCartTicketDomain) r9     // Catch:{ all -> 0x0036 }
            java.lang.Object r9 = kotlin.Result.m38702b(r9)     // Catch:{ all -> 0x0036 }
            goto L_0x00ad
        L_0x009e:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r9 = kotlin.C11661u0.m45734a(r9)
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
            goto L_0x00ad
        L_0x00a9:
            java.lang.Object r9 = kotlin.Result.m38702b(r2)
        L_0x00ad:
            com.carrefour.fid.android.performance.d r8 = r8.f94572c
            r8.mo121196e()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartTicketUseCase.m172972invokegIAlus(com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartTicketUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }
}
