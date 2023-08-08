package com.carrefour.fid.android.service.domain.interactors;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository;
import com.carrefour.fid.android.service.presentation.model.DeliveryType;
import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.NavArgumentsKt;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0004\u001a\u00020\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/domain/interactors/GetMinimumOrderAmountUseCase;", "Lcom/carrefour/fid/android/domain/interactors/f;", "Lcom/carrefour/fid/android/service/domain/interactors/GetMinimumOrderAmountUseCase$Params;", "", "param", "Lkotlin/Result;", "invoke-gIAlu-s", "(Lcom/carrefour/fid/android/service/domain/interactors/GetMinimumOrderAmountUseCase$Params;Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/service/domain/repositories/StoreFacilityRepository;", "storeFacilityRepository", "Lcom/carrefour/fid/android/service/domain/repositories/StoreFacilityRepository;", "<init>", "(Lcom/carrefour/fid/android/service/domain/repositories/StoreFacilityRepository;)V", "Params", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nGetMinimumOrderAmountUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetMinimumOrderAmountUseCase.kt\ncom/carrefour/fid/android/service/domain/interactors/GetMinimumOrderAmountUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,23:1\n288#2,2:24\n*S KotlinDebug\n*F\n+ 1 GetMinimumOrderAmountUseCase.kt\ncom/carrefour/fid/android/service/domain/interactors/GetMinimumOrderAmountUseCase\n*L\n18#1:24,2\n*E\n"})
public final class GetMinimumOrderAmountUseCase implements C37679f<Params, String> {
    @C12579k
    private final StoreFacilityRepository storeFacilityRepository;

    @C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/domain/interactors/GetMinimumOrderAmountUseCase$Params;", "", "anabelKey", "", "deliveryType", "Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;", "(Ljava/lang/String;Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;)V", "getAnabelKey", "()Ljava/lang/String;", "getDeliveryType", "()Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    @C8567o(parameters = 0)
    public static final class Params {
        public static final int $stable = 0;
        @C12579k
        private final String anabelKey;
        @C12579k
        private final DeliveryType deliveryType;

        public Params(@C12579k String str, @C12579k DeliveryType deliveryType2) {
            Intrinsics.checkNotNullParameter(str, "anabelKey");
            Intrinsics.checkNotNullParameter(deliveryType2, NavArgumentsKt.DELIVERY_TYPE);
            this.anabelKey = str;
            this.deliveryType = deliveryType2;
        }

        public static /* synthetic */ Params copy$default(Params params, String str, DeliveryType deliveryType2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = params.anabelKey;
            }
            if ((i & 2) != 0) {
                deliveryType2 = params.deliveryType;
            }
            return params.copy(str, deliveryType2);
        }

        @C12579k
        public final String component1() {
            return this.anabelKey;
        }

        @C12579k
        public final DeliveryType component2() {
            return this.deliveryType;
        }

        @C12579k
        public final Params copy(@C12579k String str, @C12579k DeliveryType deliveryType2) {
            Intrinsics.checkNotNullParameter(str, "anabelKey");
            Intrinsics.checkNotNullParameter(deliveryType2, NavArgumentsKt.DELIVERY_TYPE);
            return new Params(str, deliveryType2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return Intrinsics.areEqual((Object) this.anabelKey, (Object) params.anabelKey) && this.deliveryType == params.deliveryType;
        }

        @C12579k
        public final String getAnabelKey() {
            return this.anabelKey;
        }

        @C12579k
        public final DeliveryType getDeliveryType() {
            return this.deliveryType;
        }

        public int hashCode() {
            return (this.anabelKey.hashCode() * 31) + this.deliveryType.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.anabelKey;
            DeliveryType deliveryType2 = this.deliveryType;
            return "Params(anabelKey=" + str + ", deliveryType=" + deliveryType2 + ")";
        }
    }

    @Inject
    public GetMinimumOrderAmountUseCase(@C12579k StoreFacilityRepository storeFacilityRepository2) {
        Intrinsics.checkNotNullParameter(storeFacilityRepository2, "storeFacilityRepository");
        this.storeFacilityRepository = storeFacilityRepository2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.carrefour.fid.android.domain.models.service.models.StoreService} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.carrefour.fid.android.domain.models.service.models.StoreService} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.carrefour.fid.android.domain.models.service.models.StoreService} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.carrefour.fid.android.domain.models.service.models.StoreService} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008e A[EDGE_INSN: B:35:0x008e->B:29:0x008e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172837invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.service.domain.interactors.GetMinimumOrderAmountUseCase.Params r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.service.domain.interactors.GetMinimumOrderAmountUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.service.domain.interactors.GetMinimumOrderAmountUseCase$invoke$1 r0 = (com.carrefour.fid.android.service.domain.interactors.GetMinimumOrderAmountUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.service.domain.interactors.GetMinimumOrderAmountUseCase$invoke$1 r0 = new com.carrefour.fid.android.service.domain.interactors.GetMinimumOrderAmountUseCase$invoke$1
            r0.<init>(r7, r9)
        L_0x0018:
            r4 = r0
            java.lang.Object r9 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L_0x003c
            if (r1 != r2) goto L_0x0034
            java.lang.Object r8 = r4.L$0
            com.carrefour.fid.android.service.domain.interactors.GetMinimumOrderAmountUseCase$Params r8 = (com.carrefour.fid.android.service.domain.interactors.GetMinimumOrderAmountUseCase.Params) r8
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x0054
        L_0x0034:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003c:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository r1 = r7.storeFacilityRepository
            java.lang.String r9 = r8.getAnabelKey()
            r3 = 0
            r5 = 2
            r6 = 0
            r4.L$0 = r8
            r4.label = r2
            r2 = r9
            java.lang.Object r9 = com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository.m172877getStoreByAnabelKey0E7RQCE$default(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L_0x0054
            return r0
        L_0x0054:
            boolean r0 = kotlin.Result.m38709i(r9)
            r1 = 0
            if (r0 == 0) goto L_0x005d
            r0 = r1
            goto L_0x005e
        L_0x005d:
            r0 = r9
        L_0x005e:
            com.carrefour.fid.android.domain.models.service.models.l r0 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r0
            if (r0 == 0) goto L_0x009e
            java.util.List r0 = r0.mo119367K()
            if (r0 == 0) goto L_0x009e
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x006e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x008e
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.carrefour.fid.android.domain.models.service.models.StoreService r3 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r3
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r3 = r3.mo119176T()
            com.carrefour.fid.android.service.presentation.model.DeliveryType r4 = r8.getDeliveryType()
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r4 = com.carrefour.fid.android.service.presentation.model.DeliveryTypeKt.toStoreServiceType(r4)
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r3 == 0) goto L_0x006e
            r1 = r2
        L_0x008e:
            com.carrefour.fid.android.domain.models.service.models.StoreService r1 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r1
            if (r1 != 0) goto L_0x0093
            goto L_0x009e
        L_0x0093:
            kotlin.Result$a r8 = kotlin.Result.f28060a
            java.lang.String r8 = r1.mo119168L()
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
            return r8
        L_0x009e:
            kotlin.Result$a r8 = kotlin.Result.f28060a
            java.lang.Throwable r8 = kotlin.Result.m38705e(r9)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.domain.interactors.GetMinimumOrderAmountUseCase.m172837invokegIAlus(com.carrefour.fid.android.service.domain.interactors.GetMinimumOrderAmountUseCase$Params, kotlin.coroutines.c):java.lang.Object");
    }
}
