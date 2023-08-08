package com.carrefour.fid.android.domain.interactors.coupons;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.repositories.CouponsRepository;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import java.util.Map;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPrintCouponsUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrintCouponsUseCase.kt\ncom/carrefour/fid/android/domain/interactors/coupons/PrintCouponsUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,94:1\n1963#2,14:95\n766#2:109\n857#2,2:110\n819#2:112\n847#2,2:113\n1549#2:115\n1620#2,3:116\n1549#2:120\n1620#2,3:121\n1549#2:124\n1620#2,3:125\n1549#2:128\n1620#2,3:129\n1477#2:132\n1502#2,3:133\n1505#2,3:143\n1#3:119\n361#4,7:136\n*S KotlinDebug\n*F\n+ 1 PrintCouponsUseCase.kt\ncom/carrefour/fid/android/domain/interactors/coupons/PrintCouponsUseCase\n*L\n22#1:95,14\n25#1:109\n25#1:110,2\n26#1:112\n26#1:113,2\n43#1:115\n43#1:116,3\n54#1:120\n54#1:121,3\n56#1:124\n56#1:125,3\n58#1:128\n58#1:129,3\n79#1:132\n79#1:133,3\n79#1:143,3\n79#1:136,7\n*E\n"})
public final class PrintCouponsUseCase implements C37679f<C37637a, C37643a> {
    @C12579k

    /* renamed from: a */
    public final C37878e f94440a;
    @C12579k

    /* renamed from: b */
    public final CouponsRepository f94441b;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.domain.interactors.coupons.PrintCouponsUseCase$a */
    public static final class C37637a {

        /* renamed from: c */
        public static final int f94442c = 8;
        @C12579k

        /* renamed from: a */
        public final C37643a f94443a;
        @C12579k

        /* renamed from: b */
        public final Map<String, Long> f94444b;

        public C37637a(@C12579k C37643a aVar, @C12579k Map<String, Long> map) {
            Intrinsics.checkNotNullParameter(aVar, "currentCoupons");
            Intrinsics.checkNotNullParameter(map, "couponsIds");
            this.f94443a = aVar;
            this.f94444b = map;
        }

        /* renamed from: d */
        public static /* synthetic */ C37637a m154286d(C37637a aVar, C37643a aVar2, Map<String, Long> map, int i, Object obj) {
            if ((i & 1) != 0) {
                aVar2 = aVar.f94443a;
            }
            if ((i & 2) != 0) {
                map = aVar.f94444b;
            }
            return aVar.mo114563c(aVar2, map);
        }

        @C12579k
        /* renamed from: a */
        public final C37643a mo114561a() {
            return this.f94443a;
        }

        @C12579k
        /* renamed from: b */
        public final Map<String, Long> mo114562b() {
            return this.f94444b;
        }

        @C12579k
        /* renamed from: c */
        public final C37637a mo114563c(@C12579k C37643a aVar, @C12579k Map<String, Long> map) {
            Intrinsics.checkNotNullParameter(aVar, "currentCoupons");
            Intrinsics.checkNotNullParameter(map, "couponsIds");
            return new C37637a(aVar, map);
        }

        @C12579k
        /* renamed from: e */
        public final Map<String, Long> mo114564e() {
            return this.f94444b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37637a)) {
                return false;
            }
            C37637a aVar = (C37637a) obj;
            return Intrinsics.areEqual((Object) this.f94443a, (Object) aVar.f94443a) && Intrinsics.areEqual((Object) this.f94444b, (Object) aVar.f94444b);
        }

        @C12579k
        /* renamed from: f */
        public final C37643a mo114566f() {
            return this.f94443a;
        }

        public int hashCode() {
            return (this.f94443a.hashCode() * 31) + this.f94444b.hashCode();
        }

        @C12579k
        public String toString() {
            C37643a aVar = this.f94443a;
            Map<String, Long> map = this.f94444b;
            return "Params(currentCoupons=" + aVar + ", couponsIds=" + map + ")";
        }
    }

    @Inject
    public PrintCouponsUseCase(@C12579k C37878e eVar, @C12579k CouponsRepository couponsRepository) {
        Intrinsics.checkNotNullParameter(eVar, "getUserInfoUseCase");
        Intrinsics.checkNotNullParameter(couponsRepository, "couponsRepository");
        this.f94440a = eVar;
        this.f94441b = couponsRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172953invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.coupons.PrintCouponsUseCase.C37637a r14, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.interactors.coupons.C37643a>> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.carrefour.fid.android.domain.interactors.coupons.PrintCouponsUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.carrefour.fid.android.domain.interactors.coupons.PrintCouponsUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.coupons.PrintCouponsUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.coupons.PrintCouponsUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.coupons.PrintCouponsUseCase$invoke$1
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004d
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            kotlin.C11661u0.m45747n(r15)
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r14 = r15.mo21858l()
            goto L_0x0147
        L_0x0033:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x003b:
            java.lang.Object r14 = r0.L$1
            com.carrefour.fid.android.domain.interactors.coupons.PrintCouponsUseCase$a r14 = (com.carrefour.fid.android.domain.interactors.coupons.PrintCouponsUseCase.C37637a) r14
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.coupons.PrintCouponsUseCase r2 = (com.carrefour.fid.android.domain.interactors.coupons.PrintCouponsUseCase) r2
            kotlin.C11661u0.m45747n(r15)
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r15 = r15.mo21858l()
            goto L_0x0062
        L_0x004d:
            kotlin.C11661u0.m45747n(r15)
            com.carrefour.fid.android.domain.interactors.user.e r15 = r13.f94440a
            com.carrefour.fid.android.domain.interactors.user.e$a r2 = com.carrefour.fid.android.domain.interactors.user.C37878e.C37879a.f94997a
            r0.L$0 = r13
            r0.L$1 = r14
            r0.label = r4
            java.lang.Object r15 = r15.m172966invokegIAlus(r2, r0)
            if (r15 != r1) goto L_0x0061
            return r1
        L_0x0061:
            r2 = r13
        L_0x0062:
            boolean r5 = kotlin.Result.m38709i(r15)
            r6 = 0
            if (r5 == 0) goto L_0x006a
            r15 = r6
        L_0x006a:
            com.carrefour.fid.android.domain.models.account.AccountInfo r15 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r15
            if (r15 == 0) goto L_0x0148
            java.util.List r15 = r15.mo116669w()
            if (r15 == 0) goto L_0x0148
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.Iterator r15 = r15.iterator()
            boolean r5 = r15.hasNext()
            if (r5 != 0) goto L_0x0082
            r5 = r6
            goto L_0x00b3
        L_0x0082:
            java.lang.Object r5 = r15.next()
            boolean r7 = r15.hasNext()
            if (r7 != 0) goto L_0x008d
            goto L_0x00b3
        L_0x008d:
            r7 = r5
            com.carrefour.fid.android.domain.models.account.UserCards r7 = (com.carrefour.fid.android.domain.models.account.UserCards) r7
            java.lang.String r7 = r7.mo116761i()
            long r7 = com.carrefour.fid.android.shared.extension.StringKt.m118928h(r7)
        L_0x0098:
            java.lang.Object r9 = r15.next()
            r10 = r9
            com.carrefour.fid.android.domain.models.account.UserCards r10 = (com.carrefour.fid.android.domain.models.account.UserCards) r10
            java.lang.String r10 = r10.mo116761i()
            long r10 = com.carrefour.fid.android.shared.extension.StringKt.m118928h(r10)
            int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x00ad
            r5 = r9
            r7 = r10
        L_0x00ad:
            boolean r9 = r15.hasNext()
            if (r9 != 0) goto L_0x0098
        L_0x00b3:
            com.carrefour.fid.android.domain.models.account.UserCards r5 = (com.carrefour.fid.android.domain.models.account.UserCards) r5
            if (r5 == 0) goto L_0x0148
            java.lang.String r15 = r5.mo116763k()
            if (r15 != 0) goto L_0x00bf
            goto L_0x0148
        L_0x00bf:
            com.carrefour.fid.android.domain.interactors.coupons.a r5 = r14.mo114566f()
            java.util.List r5 = r5.mo114618i()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x00d2:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x00f5
            java.lang.Object r8 = r5.next()
            r9 = r8
            com.carrefour.fid.android.presentation.models.CouponModel r9 = (com.carrefour.fid.android.presentation.models.CouponModel) r9
            java.util.Map r10 = r14.mo114564e()
            java.util.Set r10 = r10.keySet()
            java.lang.String r9 = r9.mo121396L()
            boolean r9 = r10.contains(r9)
            if (r9 == 0) goto L_0x00d2
            r7.add(r8)
            goto L_0x00d2
        L_0x00f5:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x00fe:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0123
            java.lang.Object r8 = r7.next()
            r9 = r8
            com.carrefour.fid.android.presentation.models.CouponModel r9 = (com.carrefour.fid.android.presentation.models.CouponModel) r9
            com.carrefour.fid.android.data.entities.coupons.CouponStatus r10 = r9.mo121403S()
            com.carrefour.fid.android.data.entities.coupons.CouponStatus r11 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.PRINTED
            if (r10 == r11) goto L_0x011c
            boolean r9 = r9.mo121395K()
            if (r9 == 0) goto L_0x011a
            goto L_0x011c
        L_0x011a:
            r9 = 0
            goto L_0x011d
        L_0x011c:
            r9 = r4
        L_0x011d:
            if (r9 != 0) goto L_0x00fe
            r5.add(r8)
            goto L_0x00fe
        L_0x0123:
            boolean r4 = r5.isEmpty()
            if (r4 == 0) goto L_0x0136
            kotlin.Result$a r14 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.NoCouponToUpdateException r14 = com.carrefour.fid.android.shared.p046io.NoCouponToUpdateException.f70497a
            java.lang.Object r14 = kotlin.C11661u0.m45734a(r14)
            java.lang.Object r14 = kotlin.Result.m38702b(r14)
            return r14
        L_0x0136:
            com.carrefour.fid.android.domain.interactors.coupons.a r14 = r14.mo114566f()
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r14 = r2.mo114560c(r15, r5, r14, r0)
            if (r14 != r1) goto L_0x0147
            return r1
        L_0x0147:
            return r14
        L_0x0148:
            kotlin.Result$a r14 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.NoFidCardException r14 = com.carrefour.fid.android.shared.p046io.NoFidCardException.f70499a
            java.lang.Object r14 = kotlin.C11661u0.m45734a(r14)
            java.lang.Object r14 = kotlin.Result.m38702b(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.coupons.PrintCouponsUseCase.m172953invokegIAlus(com.carrefour.fid.android.domain.interactors.coupons.PrintCouponsUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114560c(java.lang.String r37, java.util.List<com.carrefour.fid.android.presentation.models.CouponModel> r38, com.carrefour.fid.android.domain.interactors.coupons.C37643a r39, kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.interactors.coupons.C37643a>> r40) {
        /*
            r36 = this;
            r0 = r36
            r1 = r40
            boolean r2 = r1 instanceof com.carrefour.fid.android.domain.interactors.coupons.PrintCouponsUseCase$printCoupons$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.domain.interactors.coupons.PrintCouponsUseCase$printCoupons$1 r2 = (com.carrefour.fid.android.domain.interactors.coupons.PrintCouponsUseCase$printCoupons$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.domain.interactors.coupons.PrintCouponsUseCase$printCoupons$1 r2 = new com.carrefour.fid.android.domain.interactors.coupons.PrintCouponsUseCase$printCoupons$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 10
            r6 = 1
            if (r4 == 0) goto L_0x0042
            if (r4 != r6) goto L_0x003a
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.domain.interactors.coupons.a r2 = (com.carrefour.fid.android.domain.interactors.coupons.C37643a) r2
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            r7 = r2
            goto L_0x0082
        L_0x003a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0042:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.data.repositories.CouponsRepository r1 = r0.f94441b
            com.carrefour.fid.android.data.entities.coupons.CouponAction r4 = com.carrefour.fid.android.data.entities.coupons.CouponAction.PRINT
            r7 = r38
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = kotlin.collections.C10978t.m41495Y(r7, r5)
            r8.<init>(r9)
            java.util.Iterator r7 = r7.iterator()
        L_0x005a:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0072
            java.lang.Object r9 = r7.next()
            com.carrefour.fid.android.presentation.models.CouponModel r9 = (com.carrefour.fid.android.presentation.models.CouponModel) r9
            long r9 = r9.mo121392H()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r8.add(r9)
            goto L_0x005a
        L_0x0072:
            r9 = r39
            r2.L$0 = r9
            r2.label = r6
            r7 = r37
            java.lang.Object r1 = r1.mo111489d(r7, r4, r8, r2)
            if (r1 != r3) goto L_0x0081
            return r3
        L_0x0081:
            r7 = r9
        L_0x0082:
            java.lang.Throwable r2 = kotlin.Result.m38705e(r1)
            if (r2 != 0) goto L_0x008d
            java.util.List r1 = (java.util.List) r1
            kotlin.Result$a r2 = kotlin.Result.f28060a
            goto L_0x0093
        L_0x008d:
            kotlin.Result$a r1 = kotlin.Result.f28060a
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r2)
        L_0x0093:
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            boolean r2 = kotlin.Result.m38709i(r1)
            if (r2 == 0) goto L_0x00b3
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.lang.Throwable r1 = kotlin.Result.m38705e(r1)
            if (r1 != 0) goto L_0x00aa
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>()
        L_0x00aa:
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        L_0x00b3:
            boolean r2 = kotlin.Result.m38709i(r1)
            if (r2 == 0) goto L_0x00ba
            r1 = 0
        L_0x00ba:
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L_0x00cb
            kotlin.Result$a r1 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.UpdatingCouponsException r1 = com.carrefour.fid.android.shared.p046io.UpdatingCouponsException.f70564a
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        L_0x00cb:
            java.util.List r2 = r7.mo114618i()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            int r8 = kotlin.collections.C10978t.m41495Y(r2, r5)
            r4.<init>(r8)
            java.util.Iterator r2 = r2.iterator()
        L_0x00de:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x0135
            java.lang.Object r8 = r2.next()
            r9 = r8
            com.carrefour.fid.android.presentation.models.CouponModel r9 = (com.carrefour.fid.android.presentation.models.CouponModel) r9
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
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
            com.carrefour.fid.android.data.entities.coupons.CouponStatus$a r8 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.Companion
            java.util.EnumSet r8 = r8.mo110931c()
            com.carrefour.fid.android.data.entities.coupons.CouponStatus r3 = r9.mo121403S()
            boolean r3 = r8.contains(r3)
            if (r3 == 0) goto L_0x0122
            com.carrefour.fid.android.presentation.models.CouponModel$State r3 = com.carrefour.fid.android.presentation.models.CouponModel.State.ACTIVATED
            goto L_0x0124
        L_0x0122:
            com.carrefour.fid.android.presentation.models.CouponModel$State r3 = com.carrefour.fid.android.presentation.models.CouponModel.State.NEUTRAL
        L_0x0124:
            r32 = r3
            r33 = 0
            r34 = 3145727(0x2fffff, float:4.408102E-39)
            r35 = 0
            com.carrefour.fid.android.presentation.models.CouponModel r3 = com.carrefour.fid.android.presentation.models.CouponModel.m159022x(r9, r10, r12, r13, r14, r15, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r4.add(r3)
            goto L_0x00de
        L_0x0135:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = kotlin.collections.C10978t.m41495Y(r1, r5)
            r2.<init>(r3)
            java.util.Iterator r3 = r1.iterator()
        L_0x0144:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x0177
            java.lang.Object r8 = r3.next()
            com.carrefour.fid.android.data.entities.f r8 = (com.carrefour.fid.android.data.entities.C36454f) r8
            java.lang.String r9 = r8.mo111073h()
            com.carrefour.fid.android.data.entities.a r8 = r8.mo111075i()
            if (r8 == 0) goto L_0x015f
            java.lang.String r8 = r8.mo110856i()
            goto L_0x0160
        L_0x015f:
            r8 = 0
        L_0x0160:
            if (r8 != 0) goto L_0x0164
            java.lang.String r8 = ""
        L_0x0164:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r2.add(r8)
            goto L_0x0144
        L_0x0177:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = kotlin.collections.C10978t.m41495Y(r4, r5)
            r3.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x0184:
            boolean r5 = r4.hasNext()
            r8 = 0
            if (r5 == 0) goto L_0x028a
            java.lang.Object r5 = r4.next()
            r9 = r5
            com.carrefour.fid.android.presentation.models.CouponModel r9 = (com.carrefour.fid.android.presentation.models.CouponModel) r9
            java.util.Iterator r5 = r1.iterator()
        L_0x0196:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x01e0
            java.lang.Object r10 = r5.next()
            r11 = r10
            com.carrefour.fid.android.data.entities.f r11 = (com.carrefour.fid.android.data.entities.C36454f) r11
            com.carrefour.fid.android.data.entities.a r12 = r11.mo111075i()
            if (r12 == 0) goto L_0x01cd
            java.lang.String r12 = r11.mo111073h()
            com.carrefour.fid.android.data.entities.a r11 = r11.mo111075i()
            java.lang.String r11 = r11.mo110856i()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r12)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            java.lang.String r12 = r9.mo121396L()
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r12)
            goto L_0x01dd
        L_0x01cd:
            java.lang.String r11 = r11.mo111073h()
            long r12 = r9.mo121392H()
            java.lang.String r12 = java.lang.String.valueOf(r12)
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r12)
        L_0x01dd:
            if (r11 == 0) goto L_0x0196
            goto L_0x01e1
        L_0x01e0:
            r10 = 0
        L_0x01e1:
            com.carrefour.fid.android.data.entities.f r10 = (com.carrefour.fid.android.data.entities.C36454f) r10
            if (r10 != 0) goto L_0x01e7
            goto L_0x0285
        L_0x01e7:
            com.carrefour.fid.android.data.entities.e r5 = r10.mo111076j()
            if (r5 == 0) goto L_0x0220
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
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
            com.carrefour.fid.android.presentation.models.CouponModel$State r32 = com.carrefour.fid.android.presentation.models.CouponModel.State.ERROR
            r33 = 0
            r34 = 3145727(0x2fffff, float:4.408102E-39)
            r35 = 0
            com.carrefour.fid.android.presentation.models.CouponModel r5 = com.carrefour.fid.android.presentation.models.CouponModel.m159022x(r9, r10, r12, r13, r14, r15, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
        L_0x021e:
            r9 = r5
            goto L_0x0285
        L_0x0220:
            com.carrefour.fid.android.data.entities.coupons.CouponStatus[] r5 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.values()
            int r11 = r5.length
        L_0x0225:
            if (r8 >= r11) goto L_0x023b
            r12 = r5[r8]
            java.lang.String r13 = r12.getType()
            java.lang.String r14 = r10.mo111077k()
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r14)
            if (r13 == 0) goto L_0x0238
            goto L_0x023c
        L_0x0238:
            int r8 = r8 + 1
            goto L_0x0225
        L_0x023b:
            r12 = 0
        L_0x023c:
            if (r12 != 0) goto L_0x0241
            com.carrefour.fid.android.data.entities.coupons.CouponStatus r5 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.UNKNOWN
            goto L_0x0242
        L_0x0241:
            r5 = r12
        L_0x0242:
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            com.carrefour.fid.android.data.entities.coupons.CouponStatus$a r8 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.Companion
            java.util.EnumSet r8 = r8.mo110931c()
            boolean r8 = r8.contains(r5)
            if (r8 == 0) goto L_0x0273
            com.carrefour.fid.android.presentation.models.CouponModel$State r8 = com.carrefour.fid.android.presentation.models.CouponModel.State.ACTIVATED
            goto L_0x0275
        L_0x0273:
            com.carrefour.fid.android.presentation.models.CouponModel$State r8 = com.carrefour.fid.android.presentation.models.CouponModel.State.NEUTRAL
        L_0x0275:
            r32 = r8
            r33 = 0
            r34 = 3129343(0x2fbfff, float:4.385144E-39)
            r35 = 0
            r26 = r5
            com.carrefour.fid.android.presentation.models.CouponModel r5 = com.carrefour.fid.android.presentation.models.CouponModel.m159022x(r9, r10, r12, r13, r14, r15, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x021e
        L_0x0285:
            r3.add(r9)
            goto L_0x0184
        L_0x028a:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0293:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x02c0
            java.lang.Object r4 = r3.next()
            r5 = r4
            com.carrefour.fid.android.presentation.models.CouponModel r5 = (com.carrefour.fid.android.presentation.models.CouponModel) r5
            java.lang.String r5 = r5.mo121396L()
            boolean r5 = r2.contains(r5)
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r5)
            java.lang.Object r9 = r1.get(r5)
            if (r9 != 0) goto L_0x02ba
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r1.put(r5, r9)
        L_0x02ba:
            java.util.List r9 = (java.util.List) r9
            r9.add(r4)
            goto L_0x0293
        L_0x02c0:
            kotlin.Result$a r2 = kotlin.Result.f28060a
            r2 = 0
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r8)
            java.lang.Object r3 = r1.get(r3)
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L_0x02d3
            java.util.List r3 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x02d3:
            r9 = r3
            java.util.List r3 = r7.mo114615g()
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r6)
            java.lang.Object r1 = r1.get(r4)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x02e7
            goto L_0x02eb
        L_0x02e7:
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x02eb:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r10 = kotlin.collections.CollectionsKt___CollectionsKt.m40718y4(r3, r1)
            r11 = 0
            r12 = 9
            r13 = 0
            r8 = r2
            com.carrefour.fid.android.domain.interactors.coupons.a r1 = com.carrefour.fid.android.domain.interactors.coupons.C37643a.m154327f(r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.coupons.PrintCouponsUseCase.mo114560c(java.lang.String, java.util.List, com.carrefour.fid.android.domain.interactors.coupons.a, kotlin.coroutines.c):java.lang.Object");
    }
}
