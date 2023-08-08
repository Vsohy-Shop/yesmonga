package com.carrefour.fid.android.domain.interactors.coupons;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.coupons.CouponStatus;
import com.carrefour.fid.android.data.repositories.CouponsRepository;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.presentation.models.CouponModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nUpdateCouponsUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdateCouponsUseCase.kt\ncom/carrefour/fid/android/domain/interactors/coupons/UpdateCouponsUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1963#2,14:105\n819#2:119\n847#2,2:120\n766#2:122\n857#2,2:123\n1549#2:125\n1620#2,3:126\n1549#2:130\n1620#2,3:131\n1549#2:134\n1620#2,3:135\n1#3:129\n*S KotlinDebug\n*F\n+ 1 UpdateCouponsUseCase.kt\ncom/carrefour/fid/android/domain/interactors/coupons/UpdateCouponsUseCase\n*L\n25#1:105,14\n45#1:119\n45#1:120,2\n49#1:122\n49#1:123,2\n60#1:125\n60#1:126,3\n70#1:130\n70#1:131,3\n74#1:134\n74#1:135,3\n*E\n"})
public final class UpdateCouponsUseCase implements C37679f<C37642a, C37643a> {
    @C12579k

    /* renamed from: a */
    public final C37878e f94459a;
    @C12579k

    /* renamed from: b */
    public final CouponsRepository f94460b;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponsUseCase$a */
    public static final class C37642a {

        /* renamed from: d */
        public static final int f94461d = 8;
        @C12579k

        /* renamed from: a */
        public final C37643a f94462a;
        @C12579k

        /* renamed from: b */
        public final Map<String, Long> f94463b;

        /* renamed from: c */
        public final boolean f94464c;

        public C37642a(@C12579k C37643a aVar, @C12579k Map<String, Long> map, boolean z) {
            Intrinsics.checkNotNullParameter(aVar, "currentCoupons");
            Intrinsics.checkNotNullParameter(map, "couponsIds");
            this.f94462a = aVar;
            this.f94463b = map;
            this.f94464c = z;
        }

        /* renamed from: e */
        public static /* synthetic */ C37642a m154319e(C37642a aVar, C37643a aVar2, Map<String, Long> map, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                aVar2 = aVar.f94462a;
            }
            if ((i & 2) != 0) {
                map = aVar.f94463b;
            }
            if ((i & 4) != 0) {
                z = aVar.f94464c;
            }
            return aVar.mo114602d(aVar2, map, z);
        }

        @C12579k
        /* renamed from: a */
        public final C37643a mo114599a() {
            return this.f94462a;
        }

        @C12579k
        /* renamed from: b */
        public final Map<String, Long> mo114600b() {
            return this.f94463b;
        }

        /* renamed from: c */
        public final boolean mo114601c() {
            return this.f94464c;
        }

        @C12579k
        /* renamed from: d */
        public final C37642a mo114602d(@C12579k C37643a aVar, @C12579k Map<String, Long> map, boolean z) {
            Intrinsics.checkNotNullParameter(aVar, "currentCoupons");
            Intrinsics.checkNotNullParameter(map, "couponsIds");
            return new C37642a(aVar, map, z);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37642a)) {
                return false;
            }
            C37642a aVar = (C37642a) obj;
            return Intrinsics.areEqual((Object) this.f94462a, (Object) aVar.f94462a) && Intrinsics.areEqual((Object) this.f94463b, (Object) aVar.f94463b) && this.f94464c == aVar.f94464c;
        }

        @C12579k
        /* renamed from: f */
        public final Map<String, Long> mo114604f() {
            return this.f94463b;
        }

        @C12579k
        /* renamed from: g */
        public final C37643a mo114605g() {
            return this.f94462a;
        }

        /* renamed from: h */
        public final boolean mo114606h() {
            return this.f94464c;
        }

        public int hashCode() {
            int hashCode = ((this.f94462a.hashCode() * 31) + this.f94463b.hashCode()) * 31;
            boolean z = this.f94464c;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        @C12579k
        public String toString() {
            C37643a aVar = this.f94462a;
            Map<String, Long> map = this.f94463b;
            boolean z = this.f94464c;
            return "Params(currentCoupons=" + aVar + ", couponsIds=" + map + ", isAnActivation=" + z + ")";
        }
    }

    @Inject
    public UpdateCouponsUseCase(@C12579k C37878e eVar, @C12579k CouponsRepository couponsRepository) {
        Intrinsics.checkNotNullParameter(eVar, "getUserInfoUseCase");
        Intrinsics.checkNotNullParameter(couponsRepository, "couponsRepository");
        this.f94459a = eVar;
        this.f94460b = couponsRepository;
    }

    /* renamed from: b */
    public final List<CouponModel> mo114596b(List<CouponModel> list, boolean z, Set<String> set) {
        boolean z2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z3 = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            CouponModel couponModel = (CouponModel) next;
            if (couponModel.mo121403S() == CouponStatus.INBASKET || !CouponStatus.Companion.mo110929a().contains(couponModel.mo121403S()) || couponModel.mo121395K()) {
                z3 = true;
            }
            if (!z3) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : arrayList) {
            CouponModel couponModel2 = (CouponModel) next2;
            if (!set.contains(couponModel2.mo121396L()) || couponModel2.isSelected() == z) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                arrayList2.add(next2);
            }
        }
        return arrayList2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172956invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponsUseCase.C37642a r13, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.interactors.coupons.C37643a>> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponsUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponsUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponsUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponsUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponsUseCase$invoke$1
            r0.<init>(r12, r14)
        L_0x0018:
            r6 = r0
            java.lang.Object r14 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x004e
            if (r1 == r3) goto L_0x003c
            if (r1 != r2) goto L_0x0034
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r13 = r14.mo21858l()
            goto L_0x0102
        L_0x0034:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003c:
            java.lang.Object r13 = r6.L$1
            com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponsUseCase$a r13 = (com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponsUseCase.C37642a) r13
            java.lang.Object r1 = r6.L$0
            com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponsUseCase r1 = (com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponsUseCase) r1
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.mo21858l()
            goto L_0x0063
        L_0x004e:
            kotlin.C11661u0.m45747n(r14)
            com.carrefour.fid.android.domain.interactors.user.e r14 = r12.f94459a
            com.carrefour.fid.android.domain.interactors.user.e$a r1 = com.carrefour.fid.android.domain.interactors.user.C37878e.C37879a.f94997a
            r6.L$0 = r12
            r6.L$1 = r13
            r6.label = r3
            java.lang.Object r14 = r14.m172966invokegIAlus(r1, r6)
            if (r14 != r0) goto L_0x0062
            return r0
        L_0x0062:
            r1 = r12
        L_0x0063:
            boolean r3 = kotlin.Result.m38709i(r14)
            r4 = 0
            if (r3 == 0) goto L_0x006b
            r14 = r4
        L_0x006b:
            com.carrefour.fid.android.domain.models.account.AccountInfo r14 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r14
            if (r14 == 0) goto L_0x0103
            java.util.List r14 = r14.mo116669w()
            if (r14 == 0) goto L_0x0103
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.Iterator r14 = r14.iterator()
            boolean r3 = r14.hasNext()
            if (r3 != 0) goto L_0x0083
            r3 = r4
            goto L_0x00b4
        L_0x0083:
            java.lang.Object r3 = r14.next()
            boolean r5 = r14.hasNext()
            if (r5 != 0) goto L_0x008e
            goto L_0x00b4
        L_0x008e:
            r5 = r3
            com.carrefour.fid.android.domain.models.account.UserCards r5 = (com.carrefour.fid.android.domain.models.account.UserCards) r5
            java.lang.String r5 = r5.mo116761i()
            long r7 = com.carrefour.fid.android.shared.extension.StringKt.m118928h(r5)
        L_0x0099:
            java.lang.Object r5 = r14.next()
            r9 = r5
            com.carrefour.fid.android.domain.models.account.UserCards r9 = (com.carrefour.fid.android.domain.models.account.UserCards) r9
            java.lang.String r9 = r9.mo116761i()
            long r9 = com.carrefour.fid.android.shared.extension.StringKt.m118928h(r9)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x00ae
            r3 = r5
            r7 = r9
        L_0x00ae:
            boolean r5 = r14.hasNext()
            if (r5 != 0) goto L_0x0099
        L_0x00b4:
            com.carrefour.fid.android.domain.models.account.UserCards r3 = (com.carrefour.fid.android.domain.models.account.UserCards) r3
            if (r3 == 0) goto L_0x0103
            java.lang.String r14 = r3.mo116763k()
            if (r14 != 0) goto L_0x00bf
            goto L_0x0103
        L_0x00bf:
            com.carrefour.fid.android.domain.interactors.coupons.a r3 = r13.mo114605g()
            java.util.List r3 = r3.mo114618i()
            boolean r5 = r13.mo114606h()
            java.util.Map r7 = r13.mo114604f()
            java.util.Set r7 = r7.keySet()
            java.util.List r5 = r1.mo114596b(r3, r5, r7)
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L_0x00ea
            kotlin.Result$a r13 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.NoCouponToUpdateException r13 = com.carrefour.fid.android.shared.p046io.NoCouponToUpdateException.f70497a
            java.lang.Object r13 = kotlin.C11661u0.m45734a(r13)
            java.lang.Object r13 = kotlin.Result.m38702b(r13)
            return r13
        L_0x00ea:
            boolean r3 = r13.mo114606h()
            com.carrefour.fid.android.domain.interactors.coupons.a r13 = r13.mo114605g()
            r6.L$0 = r4
            r6.L$1 = r4
            r6.label = r2
            r2 = r14
            r4 = r5
            r5 = r13
            java.lang.Object r13 = r1.mo114598d(r2, r3, r4, r5, r6)
            if (r13 != r0) goto L_0x0102
            return r0
        L_0x0102:
            return r13
        L_0x0103:
            kotlin.Result$a r13 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.NoFidCardException r13 = com.carrefour.fid.android.shared.p046io.NoFidCardException.f70499a
            java.lang.Object r13 = kotlin.C11661u0.m45734a(r13)
            java.lang.Object r13 = kotlin.Result.m38702b(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponsUseCase.m172956invokegIAlus(com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponsUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114598d(java.lang.String r37, boolean r38, java.util.List<com.carrefour.fid.android.presentation.models.CouponModel> r39, com.carrefour.fid.android.domain.interactors.coupons.C37643a r40, kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.interactors.coupons.C37643a>> r41) {
        /*
            r36 = this;
            r0 = r36
            r1 = r41
            boolean r2 = r1 instanceof com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponsUseCase$updateCoupons$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponsUseCase$updateCoupons$1 r2 = (com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponsUseCase$updateCoupons$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponsUseCase$updateCoupons$1 r2 = new com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponsUseCase$updateCoupons$1
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
            r6 = r2
            goto L_0x0087
        L_0x003a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0042:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.data.repositories.CouponsRepository r1 = r0.f94460b
            if (r38 == 0) goto L_0x004c
            com.carrefour.fid.android.data.entities.coupons.CouponAction r4 = com.carrefour.fid.android.data.entities.coupons.CouponAction.LOADTOCARD
            goto L_0x004e
        L_0x004c:
            com.carrefour.fid.android.data.entities.coupons.CouponAction r4 = com.carrefour.fid.android.data.entities.coupons.CouponAction.UNLOADTOCARD
        L_0x004e:
            r7 = r39
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = kotlin.collections.C10978t.m41495Y(r7, r5)
            r8.<init>(r9)
            java.util.Iterator r7 = r7.iterator()
        L_0x005f:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0077
            java.lang.Object r9 = r7.next()
            com.carrefour.fid.android.presentation.models.CouponModel r9 = (com.carrefour.fid.android.presentation.models.CouponModel) r9
            long r9 = r9.mo121392H()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r8.add(r9)
            goto L_0x005f
        L_0x0077:
            r9 = r40
            r2.L$0 = r9
            r2.label = r6
            r6 = r37
            java.lang.Object r1 = r1.mo111489d(r6, r4, r8, r2)
            if (r1 != r3) goto L_0x0086
            return r3
        L_0x0086:
            r6 = r9
        L_0x0087:
            java.lang.Throwable r2 = kotlin.Result.m38705e(r1)
            if (r2 != 0) goto L_0x0092
            java.util.List r1 = (java.util.List) r1
            kotlin.Result$a r2 = kotlin.Result.f28060a
            goto L_0x0098
        L_0x0092:
            kotlin.Result$a r1 = kotlin.Result.f28060a
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r2)
        L_0x0098:
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            boolean r2 = kotlin.Result.m38709i(r1)
            if (r2 == 0) goto L_0x00b8
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.lang.Throwable r1 = kotlin.Result.m38705e(r1)
            if (r1 != 0) goto L_0x00af
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>()
        L_0x00af:
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        L_0x00b8:
            boolean r2 = kotlin.Result.m38709i(r1)
            if (r2 == 0) goto L_0x00bf
            r1 = 0
        L_0x00bf:
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L_0x00d0
            kotlin.Result$a r1 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.UpdatingCouponsException r1 = com.carrefour.fid.android.shared.p046io.UpdatingCouponsException.f70564a
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        L_0x00d0:
            java.util.List r2 = r6.mo114618i()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            int r7 = kotlin.collections.C10978t.m41495Y(r2, r5)
            r4.<init>(r7)
            java.util.Iterator r2 = r2.iterator()
        L_0x00e3:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0139
            java.lang.Object r7 = r2.next()
            r8 = r7
            com.carrefour.fid.android.presentation.models.CouponModel r8 = (com.carrefour.fid.android.presentation.models.CouponModel) r8
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
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
            com.carrefour.fid.android.data.entities.coupons.CouponStatus$a r7 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.Companion
            java.util.EnumSet r7 = r7.mo110931c()
            com.carrefour.fid.android.data.entities.coupons.CouponStatus r3 = r8.mo121403S()
            boolean r3 = r7.contains(r3)
            if (r3 == 0) goto L_0x0126
            com.carrefour.fid.android.presentation.models.CouponModel$State r3 = com.carrefour.fid.android.presentation.models.CouponModel.State.ACTIVATED
            goto L_0x0128
        L_0x0126:
            com.carrefour.fid.android.presentation.models.CouponModel$State r3 = com.carrefour.fid.android.presentation.models.CouponModel.State.NEUTRAL
        L_0x0128:
            r31 = r3
            r32 = 0
            r33 = 3145727(0x2fffff, float:4.408102E-39)
            r34 = 0
            com.carrefour.fid.android.presentation.models.CouponModel r3 = com.carrefour.fid.android.presentation.models.CouponModel.m159022x(r8, r9, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r4.add(r3)
            goto L_0x00e3
        L_0x0139:
            kotlin.Result$a r2 = kotlin.Result.f28060a
            r7 = 0
            java.util.ArrayList r8 = new java.util.ArrayList
            int r2 = kotlin.collections.C10978t.m41495Y(r4, r5)
            r8.<init>(r2)
            java.util.Iterator r2 = r4.iterator()
        L_0x0149:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0252
            java.lang.Object r3 = r2.next()
            r9 = r3
            com.carrefour.fid.android.presentation.models.CouponModel r9 = (com.carrefour.fid.android.presentation.models.CouponModel) r9
            r3 = r1
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x015d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01a7
            java.lang.Object r4 = r3.next()
            r5 = r4
            com.carrefour.fid.android.data.entities.f r5 = (com.carrefour.fid.android.data.entities.C36454f) r5
            com.carrefour.fid.android.data.entities.a r10 = r5.mo111075i()
            if (r10 == 0) goto L_0x0194
            java.lang.String r10 = r5.mo111073h()
            com.carrefour.fid.android.data.entities.a r5 = r5.mo111075i()
            java.lang.String r5 = r5.mo110856i()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            java.lang.String r10 = r9.mo121396L()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r10)
            goto L_0x01a4
        L_0x0194:
            java.lang.String r5 = r5.mo111073h()
            long r10 = r9.mo121392H()
            java.lang.String r10 = java.lang.String.valueOf(r10)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r10)
        L_0x01a4:
            if (r5 == 0) goto L_0x015d
            goto L_0x01a8
        L_0x01a7:
            r4 = 0
        L_0x01a8:
            com.carrefour.fid.android.data.entities.f r4 = (com.carrefour.fid.android.data.entities.C36454f) r4
            if (r4 != 0) goto L_0x01ae
            goto L_0x024d
        L_0x01ae:
            com.carrefour.fid.android.data.entities.e r3 = r4.mo111076j()
            if (r3 == 0) goto L_0x01e7
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
            com.carrefour.fid.android.presentation.models.CouponModel r3 = com.carrefour.fid.android.presentation.models.CouponModel.m159022x(r9, r10, r12, r13, r14, r15, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
        L_0x01e5:
            r9 = r3
            goto L_0x024d
        L_0x01e7:
            com.carrefour.fid.android.data.entities.coupons.CouponStatus[] r3 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.values()
            int r5 = r3.length
            r10 = 0
        L_0x01ed:
            if (r10 >= r5) goto L_0x0203
            r11 = r3[r10]
            java.lang.String r12 = r11.getType()
            java.lang.String r13 = r4.mo111077k()
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r13)
            if (r12 == 0) goto L_0x0200
            goto L_0x0204
        L_0x0200:
            int r10 = r10 + 1
            goto L_0x01ed
        L_0x0203:
            r11 = 0
        L_0x0204:
            if (r11 != 0) goto L_0x0209
            com.carrefour.fid.android.data.entities.coupons.CouponStatus r3 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.UNKNOWN
            goto L_0x020a
        L_0x0209:
            r3 = r11
        L_0x020a:
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
            com.carrefour.fid.android.data.entities.coupons.CouponStatus$a r4 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.Companion
            java.util.EnumSet r4 = r4.mo110931c()
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L_0x023b
            com.carrefour.fid.android.presentation.models.CouponModel$State r4 = com.carrefour.fid.android.presentation.models.CouponModel.State.ACTIVATED
            goto L_0x023d
        L_0x023b:
            com.carrefour.fid.android.presentation.models.CouponModel$State r4 = com.carrefour.fid.android.presentation.models.CouponModel.State.NEUTRAL
        L_0x023d:
            r32 = r4
            r33 = 0
            r34 = 3129343(0x2fbfff, float:4.385144E-39)
            r35 = 0
            r26 = r3
            com.carrefour.fid.android.presentation.models.CouponModel r3 = com.carrefour.fid.android.presentation.models.CouponModel.m159022x(r9, r10, r12, r13, r14, r15, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x01e5
        L_0x024d:
            r8.add(r9)
            goto L_0x0149
        L_0x0252:
            r9 = 0
            r10 = 0
            r11 = 13
            r12 = 0
            com.carrefour.fid.android.domain.interactors.coupons.a r1 = com.carrefour.fid.android.domain.interactors.coupons.C37643a.m154327f(r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponsUseCase.mo114598d(java.lang.String, boolean, java.util.List, com.carrefour.fid.android.domain.interactors.coupons.a, kotlin.coroutines.c):java.lang.Object");
    }
}
