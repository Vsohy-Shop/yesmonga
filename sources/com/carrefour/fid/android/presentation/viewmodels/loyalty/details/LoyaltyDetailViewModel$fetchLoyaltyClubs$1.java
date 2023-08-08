package com.carrefour.fid.android.presentation.viewmodels.loyalty.details;

import com.carrefour.fid.android.cms.domain.models.LoyaltyBonus;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$fetchLoyaltyClubs$1", mo22502f = "LoyaltyDetailViewModel.kt", mo22503i = {2}, mo22504l = {282, 284, 293, 287}, mo22505m = "invokeSuspend", mo22506n = {"listPrime"}, mo22507s = {"L$1"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nLoyaltyDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoyaltyDetailViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/loyalty/details/LoyaltyDetailViewModel$fetchLoyaltyClubs$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,409:1\n766#2:410\n857#2,2:411\n1747#2,3:413\n766#2:416\n857#2,2:417\n1747#2,3:419\n1747#2,3:422\n1747#2,3:425\n*S KotlinDebug\n*F\n+ 1 LoyaltyDetailViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/loyalty/details/LoyaltyDetailViewModel$fetchLoyaltyClubs$1\n*L\n291#1:410\n291#1:411,2\n293#1:413,3\n294#1:416\n294#1:417,2\n296#1:419,3\n298#1:422,3\n300#1:425,3\n*E\n"})
public final class LoyaltyDetailViewModel$fetchLoyaltyClubs$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ List<LoyaltyBonus> $cmsPrimeList;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ LoyaltyDetailViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyDetailViewModel$fetchLoyaltyClubs$1(LoyaltyDetailViewModel loyaltyDetailViewModel, List<LoyaltyBonus> list, C11045c<? super LoyaltyDetailViewModel$fetchLoyaltyClubs$1> cVar) {
        super(2, cVar);
        this.this$0 = loyaltyDetailViewModel;
        this.$cmsPrimeList = list;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new LoyaltyDetailViewModel$fetchLoyaltyClubs$1(this.this$0, this.$cmsPrimeList, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0192  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r9.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L_0x0041
            if (r1 == r5) goto L_0x003d
            if (r1 == r4) goto L_0x0033
            if (r1 == r3) goto L_0x0026
            if (r1 != r2) goto L_0x001e
            java.lang.Object r0 = r9.L$0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel) r0
            kotlin.C11661u0.m45747n(r10)
            goto L_0x019e
        L_0x001e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0026:
            java.lang.Object r0 = r9.L$1
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r9.L$0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel r1 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel) r1
            kotlin.C11661u0.m45747n(r10)
            goto L_0x00e3
        L_0x0033:
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            goto L_0x006e
        L_0x003d:
            kotlin.C11661u0.m45747n(r10)
            goto L_0x004f
        L_0x0041:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel r10 = r9.this$0
            r9.label = r5
            java.lang.Object r10 = r10.mo77224F0(r9)
            if (r10 != r0) goto L_0x004f
            return r0
        L_0x004f:
            com.carrefour.fid.android.domain.models.account.UserCards r10 = (com.carrefour.fid.android.domain.models.account.UserCards) r10
            if (r10 != 0) goto L_0x0056
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        L_0x0056:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel r1 = r9.this$0
            com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyClubsUseCase r1 = r1.f64877c
            com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyClubsUseCase$Params r7 = new com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyClubsUseCase$Params
            java.lang.String r10 = r10.mo116763k()
            r7.<init>(r10)
            r9.label = r4
            java.lang.Object r10 = r1.m173046invokegIAlus((com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyClubsUseCase.Params) r7, (kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.loyalty.data.models.entities.ClubsResponse>>>) r9)
            if (r10 != r0) goto L_0x006e
            return r0
        L_0x006e:
            java.util.List<com.carrefour.fid.android.cms.domain.models.LoyaltyBonus> r1 = r9.$cmsPrimeList
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel r4 = r9.this$0
            java.lang.Throwable r7 = kotlin.Result.m38705e(r10)
            if (r7 != 0) goto L_0x0192
            java.util.List r10 = (java.util.List) r10
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x0085:
            boolean r7 = r10.hasNext()
            if (r7 == 0) goto L_0x00a5
            java.lang.Object r7 = r10.next()
            r8 = r7
            com.carrefour.fid.android.loyalty.data.models.entities.ClubsResponse r8 = (com.carrefour.fid.android.loyalty.data.models.entities.ClubsResponse) r8
            java.lang.String r8 = r8.getUnsubscribeDate()
            int r8 = r8.length()
            if (r8 != 0) goto L_0x009e
            r8 = r5
            goto L_0x009f
        L_0x009e:
            r8 = r6
        L_0x009f:
            if (r8 == 0) goto L_0x0085
            r2.add(r7)
            goto L_0x0085
        L_0x00a5:
            com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils r10 = com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils.INSTANCE
            java.util.List r10 = r10.filterLoyaltyBonusList(r2, r1)
            r1 = r10
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto L_0x00bd
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x00bd
        L_0x00bb:
            r1 = r6
            goto L_0x00d4
        L_0x00bd:
            java.util.Iterator r1 = r1.iterator()
        L_0x00c1:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00bb
            java.lang.Object r2 = r1.next()
            com.carrefour.fid.android.cms.domain.models.LoyaltyBonus r2 = (com.carrefour.fid.android.cms.domain.models.LoyaltyBonus) r2
            boolean r2 = r2.isSelected()
            if (r2 == 0) goto L_0x00c1
            r1 = r5
        L_0x00d4:
            r9.L$0 = r4
            r9.L$1 = r10
            r9.label = r3
            java.lang.Object r1 = r4.mo77238T0(r1, r9)
            if (r1 != r0) goto L_0x00e1
            return r0
        L_0x00e1:
            r0 = r10
            r1 = r4
        L_0x00e3:
            r10 = r0
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x00ef:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x0106
            java.lang.Object r3 = r10.next()
            r4 = r3
            com.carrefour.fid.android.cms.domain.models.LoyaltyBonus r4 = (com.carrefour.fid.android.cms.domain.models.LoyaltyBonus) r4
            boolean r4 = r4.isSelected()
            if (r4 == 0) goto L_0x00ef
            r2.add(r3)
            goto L_0x00ef
        L_0x0106:
            boolean r10 = r2.isEmpty()
            if (r10 == 0) goto L_0x010e
        L_0x010c:
            r10 = r6
            goto L_0x0132
        L_0x010e:
            java.util.Iterator r10 = r2.iterator()
        L_0x0112:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x010c
            java.lang.Object r3 = r10.next()
            com.carrefour.fid.android.cms.domain.models.LoyaltyBonus r3 = (com.carrefour.fid.android.cms.domain.models.LoyaltyBonus) r3
            com.carrefour.fid.android.loyalty.core.type.LoyaltyPrimeType$Companion r4 = com.carrefour.fid.android.loyalty.core.type.LoyaltyPrimeType.Companion
            java.lang.String r3 = r3.getPrimeId()
            com.carrefour.fid.android.loyalty.core.type.LoyaltyPrimeType r3 = r4.getFromId(r3)
            com.carrefour.fid.android.loyalty.core.type.LoyaltyPrimeType r4 = com.carrefour.fid.android.loyalty.core.type.LoyaltyPrimeType.CLUB_MARCHE
            if (r3 != r4) goto L_0x012e
            r3 = r5
            goto L_0x012f
        L_0x012e:
            r3 = r6
        L_0x012f:
            if (r3 == 0) goto L_0x0112
            r10 = r5
        L_0x0132:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x013a
        L_0x0138:
            r3 = r6
            goto L_0x015e
        L_0x013a:
            java.util.Iterator r3 = r2.iterator()
        L_0x013e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0138
            java.lang.Object r4 = r3.next()
            com.carrefour.fid.android.cms.domain.models.LoyaltyBonus r4 = (com.carrefour.fid.android.cms.domain.models.LoyaltyBonus) r4
            com.carrefour.fid.android.loyalty.core.type.LoyaltyPrimeType$Companion r7 = com.carrefour.fid.android.loyalty.core.type.LoyaltyPrimeType.Companion
            java.lang.String r4 = r4.getPrimeId()
            com.carrefour.fid.android.loyalty.core.type.LoyaltyPrimeType r4 = r7.getFromId(r4)
            com.carrefour.fid.android.loyalty.core.type.LoyaltyPrimeType r7 = com.carrefour.fid.android.loyalty.core.type.LoyaltyPrimeType.CLUB_FAMILLE
            if (r4 != r7) goto L_0x015a
            r4 = r5
            goto L_0x015b
        L_0x015a:
            r4 = r6
        L_0x015b:
            if (r4 == 0) goto L_0x013e
            r3 = r5
        L_0x015e:
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L_0x0166
        L_0x0164:
            r5 = r6
            goto L_0x0189
        L_0x0166:
            java.util.Iterator r2 = r2.iterator()
        L_0x016a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0164
            java.lang.Object r4 = r2.next()
            com.carrefour.fid.android.cms.domain.models.LoyaltyBonus r4 = (com.carrefour.fid.android.cms.domain.models.LoyaltyBonus) r4
            com.carrefour.fid.android.loyalty.core.type.LoyaltyPrimeType$Companion r7 = com.carrefour.fid.android.loyalty.core.type.LoyaltyPrimeType.Companion
            java.lang.String r4 = r4.getPrimeId()
            com.carrefour.fid.android.loyalty.core.type.LoyaltyPrimeType r4 = r7.getFromId(r4)
            com.carrefour.fid.android.loyalty.core.type.LoyaltyPrimeType r7 = com.carrefour.fid.android.loyalty.core.type.LoyaltyPrimeType.CLUB_BIO
            if (r4 != r7) goto L_0x0186
            r4 = r5
            goto L_0x0187
        L_0x0186:
            r4 = r6
        L_0x0187:
            if (r4 == 0) goto L_0x016a
        L_0x0189:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j$j r2 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j$j
            r2.<init>(r0, r5, r3, r10)
            r1.publishState(r2)
            goto L_0x01a3
        L_0x0192:
            r9.L$0 = r4
            r9.label = r2
            java.lang.Object r10 = r4.mo77238T0(r6, r9)
            if (r10 != r0) goto L_0x019d
            return r0
        L_0x019d:
            r0 = r4
        L_0x019e:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j$f r10 = com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26590j.C26596f.f64974b
            r0.publishState(r10)
        L_0x01a3:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$fetchLoyaltyClubs$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((LoyaltyDetailViewModel$fetchLoyaltyClubs$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
