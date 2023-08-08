package com.carrefour.fid.android.loyalty.domain.interactors;

import com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.loyalty.data.models.entities.CardsResponse;
import com.carrefour.fid.android.loyalty.data.models.entities.PrimeMidFidBody;
import com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\t\u001a\u00020\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/domain/interactors/UpdateMidFidClubUseCase;", "Lcom/carrefour/fid/android/domain/interactors/f;", "Lcom/carrefour/fid/android/loyalty/domain/interactors/UpdateMidFidClubUseCase$Params;", "", "", "Lcom/carrefour/fid/android/cms/data/entities/DataPrimeCmsResponse;", "listPrimesSubscribe", "listPrimesUnsubscribe", "Lcom/carrefour/fid/android/loyalty/data/models/entities/PrimeMidFidBody;", "primeMidFidList", "param", "Lkotlin/Result;", "invoke-gIAlu-s", "(Lcom/carrefour/fid/android/loyalty/domain/interactors/UpdateMidFidClubUseCase$Params;Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/loyalty/data/repositories/LoyaltyRepository;", "repository", "Lcom/carrefour/fid/android/loyalty/data/repositories/LoyaltyRepository;", "<init>", "(Lcom/carrefour/fid/android/loyalty/data/repositories/LoyaltyRepository;)V", "Params", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nUpdateMidFidClubUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdateMidFidClubUseCase.kt\ncom/carrefour/fid/android/loyalty/domain/interactors/UpdateMidFidClubUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,38:1\n1549#2:39\n1620#2,3:40\n1549#2:43\n1620#2,3:44\n*S KotlinDebug\n*F\n+ 1 UpdateMidFidClubUseCase.kt\ncom/carrefour/fid/android/loyalty/domain/interactors/UpdateMidFidClubUseCase\n*L\n33#1:39\n33#1:40,3\n34#1:43\n34#1:44,3\n*E\n"})
public final class UpdateMidFidClubUseCase implements C37679f<Params, String> {
    @C12579k
    private LoyaltyRepository repository;

    @C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/domain/interactors/UpdateMidFidClubUseCase$Params;", "", "cardFidNumber", "", "listPrimesSubscribe", "", "Lcom/carrefour/fid/android/cms/data/entities/DataPrimeCmsResponse;", "listPrimesUnsubscribe", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getCardFidNumber", "()Ljava/lang/String;", "getListPrimesSubscribe", "()Ljava/util/List;", "getListPrimesUnsubscribe", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class Params {
        @C12579k
        private final String cardFidNumber;
        @C12579k
        private final List<DataPrimeCmsResponse> listPrimesSubscribe;
        @C12579k
        private final List<DataPrimeCmsResponse> listPrimesUnsubscribe;

        public Params(@C12579k String str, @C12579k List<DataPrimeCmsResponse> list, @C12579k List<DataPrimeCmsResponse> list2) {
            Intrinsics.checkNotNullParameter(str, "cardFidNumber");
            Intrinsics.checkNotNullParameter(list, "listPrimesSubscribe");
            Intrinsics.checkNotNullParameter(list2, "listPrimesUnsubscribe");
            this.cardFidNumber = str;
            this.listPrimesSubscribe = list;
            this.listPrimesUnsubscribe = list2;
        }

        public static /* synthetic */ Params copy$default(Params params, String str, List<DataPrimeCmsResponse> list, List<DataPrimeCmsResponse> list2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = params.cardFidNumber;
            }
            if ((i & 2) != 0) {
                list = params.listPrimesSubscribe;
            }
            if ((i & 4) != 0) {
                list2 = params.listPrimesUnsubscribe;
            }
            return params.copy(str, list, list2);
        }

        @C12579k
        public final String component1() {
            return this.cardFidNumber;
        }

        @C12579k
        public final List<DataPrimeCmsResponse> component2() {
            return this.listPrimesSubscribe;
        }

        @C12579k
        public final List<DataPrimeCmsResponse> component3() {
            return this.listPrimesUnsubscribe;
        }

        @C12579k
        public final Params copy(@C12579k String str, @C12579k List<DataPrimeCmsResponse> list, @C12579k List<DataPrimeCmsResponse> list2) {
            Intrinsics.checkNotNullParameter(str, "cardFidNumber");
            Intrinsics.checkNotNullParameter(list, "listPrimesSubscribe");
            Intrinsics.checkNotNullParameter(list2, "listPrimesUnsubscribe");
            return new Params(str, list, list2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return Intrinsics.areEqual((Object) this.cardFidNumber, (Object) params.cardFidNumber) && Intrinsics.areEqual((Object) this.listPrimesSubscribe, (Object) params.listPrimesSubscribe) && Intrinsics.areEqual((Object) this.listPrimesUnsubscribe, (Object) params.listPrimesUnsubscribe);
        }

        @C12579k
        public final String getCardFidNumber() {
            return this.cardFidNumber;
        }

        @C12579k
        public final List<DataPrimeCmsResponse> getListPrimesSubscribe() {
            return this.listPrimesSubscribe;
        }

        @C12579k
        public final List<DataPrimeCmsResponse> getListPrimesUnsubscribe() {
            return this.listPrimesUnsubscribe;
        }

        public int hashCode() {
            return (((this.cardFidNumber.hashCode() * 31) + this.listPrimesSubscribe.hashCode()) * 31) + this.listPrimesUnsubscribe.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.cardFidNumber;
            List<DataPrimeCmsResponse> list = this.listPrimesSubscribe;
            List<DataPrimeCmsResponse> list2 = this.listPrimesUnsubscribe;
            return "Params(cardFidNumber=" + str + ", listPrimesSubscribe=" + list + ", listPrimesUnsubscribe=" + list2 + ")";
        }
    }

    @Inject
    public UpdateMidFidClubUseCase(@C12579k LoyaltyRepository loyaltyRepository) {
        Intrinsics.checkNotNullParameter(loyaltyRepository, "repository");
        this.repository = loyaltyRepository;
    }

    private final PrimeMidFidBody primeMidFidList(List<DataPrimeCmsResponse> list, List<DataPrimeCmsResponse> list2) {
        List[] listArr = new List[2];
        Iterable<DataPrimeCmsResponse> iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (DataPrimeCmsResponse primeId : iterable) {
            arrayList.add(new CardsResponse(primeId.getPrimeId(), "Y"));
        }
        listArr[0] = arrayList;
        Iterable<DataPrimeCmsResponse> iterable2 = list2;
        ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(iterable2, 10));
        for (DataPrimeCmsResponse primeId2 : iterable2) {
            arrayList2.add(new CardsResponse(primeId2.getPrimeId(), "N"));
        }
        listArr[1] = arrayList2;
        return new PrimeMidFidBody(C10978t.m41497a0(CollectionsKt__CollectionsKt.m40448L(listArr)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173068invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.loyalty.domain.interactors.UpdateMidFidClubUseCase.Params r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.loyalty.domain.interactors.UpdateMidFidClubUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.loyalty.domain.interactors.UpdateMidFidClubUseCase$invoke$1 r0 = (com.carrefour.fid.android.loyalty.domain.interactors.UpdateMidFidClubUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.domain.interactors.UpdateMidFidClubUseCase$invoke$1 r0 = new com.carrefour.fid.android.loyalty.domain.interactors.UpdateMidFidClubUseCase$invoke$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.mo21858l()
            goto L_0x0055
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository r7 = r5.repository
            java.lang.String r2 = r6.getCardFidNumber()
            java.util.List r4 = r6.getListPrimesSubscribe()
            java.util.List r6 = r6.getListPrimesUnsubscribe()
            com.carrefour.fid.android.loyalty.data.models.entities.PrimeMidFidBody r6 = r5.primeMidFidList(r4, r6)
            r0.label = r3
            java.lang.Object r6 = r7.m173026putMidFidClub0E7RQCE(r2, r6, r0)
            if (r6 != r1) goto L_0x0055
            return r1
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.domain.interactors.UpdateMidFidClubUseCase.m173068invokegIAlus(com.carrefour.fid.android.loyalty.domain.interactors.UpdateMidFidClubUseCase$Params, kotlin.coroutines.c):java.lang.Object");
    }
}
