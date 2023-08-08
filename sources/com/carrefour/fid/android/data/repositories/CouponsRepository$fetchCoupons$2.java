package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.domain.models.C37974c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.CouponsRepository$fetchCoupons$2", mo22502f = "CouponsRepository.kt", mo22503i = {}, mo22504l = {26}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/c;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCouponsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponsRepository.kt\ncom/carrefour/fid/android/data/repositories/CouponsRepository$fetchCoupons$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n766#2:115\n857#2:116\n858#2:118\n1549#2:119\n1620#2,3:120\n766#2:123\n857#2,2:124\n1549#2:126\n1620#2,3:127\n766#2:130\n857#2,2:131\n1549#2:133\n1620#2,3:134\n1#3:117\n*S KotlinDebug\n*F\n+ 1 CouponsRepository.kt\ncom/carrefour/fid/android/data/repositories/CouponsRepository$fetchCoupons$2\n*L\n35#1:115\n35#1:116\n35#1:118\n42#1:119\n42#1:120,3\n45#1:123\n45#1:124,2\n52#1:126\n52#1:127,3\n55#1:130\n55#1:131,2\n63#1:133\n63#1:134,3\n*E\n"})
public final class CouponsRepository$fetchCoupons$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends C37974c>>, Object> {
    final /* synthetic */ String $loyaltyCardId;
    int label;
    final /* synthetic */ CouponsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponsRepository$fetchCoupons$2(CouponsRepository couponsRepository, String str, C11045c<? super CouponsRepository$fetchCoupons$2> cVar) {
        super(1, cVar);
        this.this$0 = couponsRepository;
        this.$loyaltyCardId = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new CouponsRepository$fetchCoupons$2(this.this$0, this.$loyaltyCardId, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0064 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0101 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x019d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x016a  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r17) {
        /*
            r16 = this;
            r6 = r16
            java.lang.Object r7 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r0 = r6.label
            r8 = 1
            if (r0 == 0) goto L_0x001b
            if (r0 != r8) goto L_0x0013
            kotlin.C11661u0.m45747n(r17)
            r0 = r17
            goto L_0x0042
        L_0x0013:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x001b:
            kotlin.C11661u0.m45747n(r17)
            com.carrefour.fid.android.data.repositories.CouponsRepository r0 = r6.this$0
            com.carrefour.fid.android.data.service.e r0 = r0.f90365a
            com.carrefour.fid.android.data.repositories.CouponsRepository r1 = r6.this$0
            com.carrefour.fid.android.data.provider.headers.c r9 = r1.f90366b
            java.lang.String r10 = r6.$loyaltyCardId
            r11 = 1
            r12 = 0
            r13 = 4
            r14 = 0
            java.util.HashMap r1 = com.carrefour.fid.android.data.provider.headers.C36560c.m149898b(r9, r10, r11, r12, r13, r14)
            r2 = 0
            r4 = 2
            r5 = 0
            r6.label = r8
            r3 = r16
            java.lang.Object r0 = com.carrefour.fid.android.data.service.C36625e.C36626a.m150247a(r0, r1, r2, r3, r4, r5)
            if (r0 != r7) goto L_0x0042
            return r7
        L_0x0042:
            java.lang.String r1 = r6.$loyaltyCardId
            retrofit2.w r0 = (retrofit2.C13091w) r0
            boolean r2 = r0.mo30576g()
            if (r2 == 0) goto L_0x0240
            java.lang.Object r0 = r0.mo30572a()
            java.util.List r0 = (java.util.List) r0
            kotlin.Result$a r1 = kotlin.Result.f28060a
            r1 = 10
            if (r0 == 0) goto L_0x00f2
            r4 = r0
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0064:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x00d1
            java.lang.Object r7 = r4.next()
            r9 = r7
            com.carrefour.fid.android.data.entities.coupons.CouponEntity r9 = (com.carrefour.fid.android.data.entities.coupons.CouponEntity) r9
            com.carrefour.fid.android.data.entities.coupons.CouponType[] r10 = com.carrefour.fid.android.data.entities.coupons.CouponType.values()
            int r11 = r10.length
            r12 = 0
        L_0x0077:
            if (r12 >= r11) goto L_0x008d
            r13 = r10[r12]
            java.lang.String r14 = r13.getType()
            java.lang.String r15 = r9.mo110873B()
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r15)
            if (r14 == 0) goto L_0x008a
            goto L_0x008e
        L_0x008a:
            int r12 = r12 + 1
            goto L_0x0077
        L_0x008d:
            r13 = 0
        L_0x008e:
            if (r13 != 0) goto L_0x0092
        L_0x0090:
            r2 = 0
            goto L_0x00cb
        L_0x0092:
            com.carrefour.fid.android.data.entities.coupons.CouponStatus[] r10 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.values()
            int r11 = r10.length
            r12 = 0
        L_0x0098:
            if (r12 >= r11) goto L_0x00ae
            r14 = r10[r12]
            java.lang.String r15 = r14.getType()
            java.lang.String r2 = r9.mo110885N()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r15, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x00ab
            goto L_0x00af
        L_0x00ab:
            int r12 = r12 + 1
            goto L_0x0098
        L_0x00ae:
            r14 = 0
        L_0x00af:
            if (r14 != 0) goto L_0x00b2
            goto L_0x0090
        L_0x00b2:
            com.carrefour.fid.android.data.entities.coupons.CouponType$a r2 = com.carrefour.fid.android.data.entities.coupons.CouponType.Companion
            java.util.EnumSet r2 = r2.mo110934b()
            boolean r2 = r2.contains(r13)
            if (r2 == 0) goto L_0x0090
            com.carrefour.fid.android.data.entities.coupons.CouponStatus$a r2 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.Companion
            java.util.EnumSet r2 = r2.mo110929a()
            boolean r2 = r2.contains(r14)
            if (r2 == 0) goto L_0x0090
            r2 = r8
        L_0x00cb:
            if (r2 == 0) goto L_0x0064
            r5.add(r7)
            goto L_0x0064
        L_0x00d1:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = kotlin.collections.C10978t.m41495Y(r5, r1)
            r2.<init>(r4)
            java.util.Iterator r4 = r5.iterator()
        L_0x00de:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00f3
            java.lang.Object r5 = r4.next()
            com.carrefour.fid.android.data.entities.coupons.CouponEntity r5 = (com.carrefour.fid.android.data.entities.coupons.CouponEntity) r5
            com.carrefour.fid.android.domain.models.d r5 = com.carrefour.fid.android.domain.extension.C37500b.m153939c(r5)
            r2.add(r5)
            goto L_0x00de
        L_0x00f2:
            r2 = 0
        L_0x00f3:
            if (r0 == 0) goto L_0x018f
            r4 = r0
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0101:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x016e
            java.lang.Object r7 = r4.next()
            r9 = r7
            com.carrefour.fid.android.data.entities.coupons.CouponEntity r9 = (com.carrefour.fid.android.data.entities.coupons.CouponEntity) r9
            com.carrefour.fid.android.data.entities.coupons.CouponType[] r10 = com.carrefour.fid.android.data.entities.coupons.CouponType.values()
            int r11 = r10.length
            r12 = 0
        L_0x0114:
            if (r12 >= r11) goto L_0x012a
            r13 = r10[r12]
            java.lang.String r14 = r13.getType()
            java.lang.String r15 = r9.mo110873B()
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r15)
            if (r14 == 0) goto L_0x0127
            goto L_0x012b
        L_0x0127:
            int r12 = r12 + 1
            goto L_0x0114
        L_0x012a:
            r13 = 0
        L_0x012b:
            if (r13 != 0) goto L_0x012f
        L_0x012d:
            r3 = 0
            goto L_0x0168
        L_0x012f:
            com.carrefour.fid.android.data.entities.coupons.CouponStatus[] r10 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.values()
            int r11 = r10.length
            r12 = 0
        L_0x0135:
            if (r12 >= r11) goto L_0x014b
            r14 = r10[r12]
            java.lang.String r15 = r14.getType()
            java.lang.String r3 = r9.mo110885N()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r15, (java.lang.Object) r3)
            if (r3 == 0) goto L_0x0148
            goto L_0x014c
        L_0x0148:
            int r12 = r12 + 1
            goto L_0x0135
        L_0x014b:
            r14 = 0
        L_0x014c:
            if (r14 != 0) goto L_0x014f
            goto L_0x012d
        L_0x014f:
            com.carrefour.fid.android.data.entities.coupons.CouponType$a r3 = com.carrefour.fid.android.data.entities.coupons.CouponType.Companion
            java.util.EnumSet r3 = r3.mo110933a()
            boolean r3 = r3.contains(r13)
            if (r3 == 0) goto L_0x012d
            com.carrefour.fid.android.data.entities.coupons.CouponStatus$a r3 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.Companion
            java.util.EnumSet r3 = r3.mo110929a()
            boolean r3 = r3.contains(r14)
            if (r3 == 0) goto L_0x012d
            r3 = r8
        L_0x0168:
            if (r3 == 0) goto L_0x0101
            r5.add(r7)
            goto L_0x0101
        L_0x016e:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = kotlin.collections.C10978t.m41495Y(r5, r1)
            r3.<init>(r4)
            java.util.Iterator r4 = r5.iterator()
        L_0x017b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0190
            java.lang.Object r5 = r4.next()
            com.carrefour.fid.android.data.entities.coupons.CouponEntity r5 = (com.carrefour.fid.android.data.entities.coupons.CouponEntity) r5
            com.carrefour.fid.android.domain.models.d r5 = com.carrefour.fid.android.domain.extension.C37500b.m153939c(r5)
            r3.add(r5)
            goto L_0x017b
        L_0x018f:
            r3 = 0
        L_0x0190:
            if (r0 == 0) goto L_0x0235
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x019d:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0214
            java.lang.Object r5 = r0.next()
            r7 = r5
            com.carrefour.fid.android.data.entities.coupons.CouponEntity r7 = (com.carrefour.fid.android.data.entities.coupons.CouponEntity) r7
            com.carrefour.fid.android.data.entities.coupons.CouponType[] r9 = com.carrefour.fid.android.data.entities.coupons.CouponType.values()
            int r10 = r9.length
            r11 = 0
        L_0x01b0:
            if (r11 >= r10) goto L_0x01c6
            r12 = r9[r11]
            java.lang.String r13 = r12.getType()
            java.lang.String r14 = r7.mo110873B()
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r14)
            if (r13 == 0) goto L_0x01c3
            goto L_0x01c7
        L_0x01c3:
            int r11 = r11 + 1
            goto L_0x01b0
        L_0x01c6:
            r12 = 0
        L_0x01c7:
            if (r12 != 0) goto L_0x01cb
        L_0x01c9:
            r7 = 0
            goto L_0x020e
        L_0x01cb:
            com.carrefour.fid.android.data.entities.coupons.CouponStatus[] r9 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.values()
            int r10 = r9.length
            r11 = 0
        L_0x01d1:
            if (r11 >= r10) goto L_0x01e7
            r13 = r9[r11]
            java.lang.String r14 = r13.getType()
            java.lang.String r15 = r7.mo110885N()
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r15)
            if (r14 == 0) goto L_0x01e4
            goto L_0x01e8
        L_0x01e4:
            int r11 = r11 + 1
            goto L_0x01d1
        L_0x01e7:
            r13 = 0
        L_0x01e8:
            if (r13 != 0) goto L_0x01eb
            goto L_0x01c9
        L_0x01eb:
            com.carrefour.fid.android.data.entities.coupons.CouponType$a r7 = com.carrefour.fid.android.data.entities.coupons.CouponType.Companion
            java.util.EnumSet r9 = r7.mo110934b()
            boolean r9 = r9.contains(r12)
            if (r9 != 0) goto L_0x0201
            java.util.EnumSet r7 = r7.mo110933a()
            boolean r7 = r7.contains(r12)
            if (r7 == 0) goto L_0x01c9
        L_0x0201:
            com.carrefour.fid.android.data.entities.coupons.CouponStatus$a r7 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.Companion
            java.util.EnumSet r7 = r7.mo110930b()
            boolean r7 = r7.contains(r13)
            if (r7 == 0) goto L_0x01c9
            r7 = r8
        L_0x020e:
            if (r7 == 0) goto L_0x019d
            r4.add(r5)
            goto L_0x019d
        L_0x0214:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.collections.C10978t.m41495Y(r4, r1)
            r0.<init>(r1)
            java.util.Iterator r1 = r4.iterator()
        L_0x0221:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0236
            java.lang.Object r4 = r1.next()
            com.carrefour.fid.android.data.entities.coupons.CouponEntity r4 = (com.carrefour.fid.android.data.entities.coupons.CouponEntity) r4
            com.carrefour.fid.android.domain.models.d r4 = com.carrefour.fid.android.domain.extension.C37500b.m153939c(r4)
            r0.add(r4)
            goto L_0x0221
        L_0x0235:
            r0 = 0
        L_0x0236:
            com.carrefour.fid.android.domain.models.c r1 = new com.carrefour.fid.android.domain.models.c
            r1.<init>(r2, r3, r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r1)
            goto L_0x0264
        L_0x0240:
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error fetching coupons for id-card : '"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "'"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.carrefour.fid.android.shared.io.ResponseThrowable r0 = com.carrefour.fid.android.core.extension.C36311i.m148971g(r0, r1)
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x0264:
            kotlin.Result r0 = kotlin.Result.m38701a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.CouponsRepository$fetchCoupons$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<C37974c>> cVar) {
        return ((CouponsRepository$fetchCoupons$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
