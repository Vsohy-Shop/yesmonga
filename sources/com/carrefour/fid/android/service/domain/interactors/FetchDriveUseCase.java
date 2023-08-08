package com.carrefour.fid.android.service.domain.interactors;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.service.models.C38166m;
import com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\u000fB\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0004\u001a\u00020\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/domain/interactors/FetchDriveUseCase;", "Lcom/carrefour/fid/android/domain/interactors/f;", "Lcom/carrefour/fid/android/service/domain/interactors/FetchDriveUseCase$Param;", "Lcom/carrefour/fid/android/domain/models/service/models/m;", "param", "Lkotlin/Result;", "invoke-gIAlu-s", "(Lcom/carrefour/fid/android/service/domain/interactors/FetchDriveUseCase$Param;Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/service/domain/repositories/StoreFacilityRepository;", "storeFacilityRepository", "Lcom/carrefour/fid/android/service/domain/repositories/StoreFacilityRepository;", "<init>", "(Lcom/carrefour/fid/android/service/domain/repositories/StoreFacilityRepository;)V", "Companion", "Param", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nFetchDriveUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FetchDriveUseCase.kt\ncom/carrefour/fid/android/service/domain/interactors/FetchDriveUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n766#2:41\n857#2:42\n1747#2,3:43\n858#2:46\n*S KotlinDebug\n*F\n+ 1 FetchDriveUseCase.kt\ncom/carrefour/fid/android/service/domain/interactors/FetchDriveUseCase\n*L\n29#1:41\n29#1:42\n30#1:43,3\n29#1:46\n*E\n"})
public final class FetchDriveUseCase implements C37679f<Param, C38166m> {
    @C12579k
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int RADIUS = 15000;
    @C12579k
    private final StoreFacilityRepository storeFacilityRepository;

    @C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/domain/interactors/FetchDriveUseCase$Companion;", "", "()V", "RADIUS", "", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/domain/interactors/FetchDriveUseCase$Param;", "", "latitude", "", "longitude", "(DD)V", "getLatitude", "()D", "getLongitude", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    @C8567o(parameters = 0)
    public static final class Param {
        public static final int $stable = 0;
        private final double latitude;
        private final double longitude;

        public Param(double d, double d2) {
            this.latitude = d;
            this.longitude = d2;
        }

        public static /* synthetic */ Param copy$default(Param param, double d, double d2, int i, Object obj) {
            if ((i & 1) != 0) {
                d = param.latitude;
            }
            if ((i & 2) != 0) {
                d2 = param.longitude;
            }
            return param.copy(d, d2);
        }

        public final double component1() {
            return this.latitude;
        }

        public final double component2() {
            return this.longitude;
        }

        @C12579k
        public final Param copy(double d, double d2) {
            return new Param(d, d2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Param)) {
                return false;
            }
            Param param = (Param) obj;
            return Double.compare(this.latitude, param.latitude) == 0 && Double.compare(this.longitude, param.longitude) == 0;
        }

        public final double getLatitude() {
            return this.latitude;
        }

        public final double getLongitude() {
            return this.longitude;
        }

        public int hashCode() {
            return (Double.hashCode(this.latitude) * 31) + Double.hashCode(this.longitude);
        }

        @C12579k
        public String toString() {
            double d = this.latitude;
            double d2 = this.longitude;
            return "Param(latitude=" + d + ", longitude=" + d2 + ")";
        }
    }

    @Inject
    public FetchDriveUseCase(@C12579k StoreFacilityRepository storeFacilityRepository2) {
        Intrinsics.checkNotNullParameter(storeFacilityRepository2, "storeFacilityRepository");
        this.storeFacilityRepository = storeFacilityRepository2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172835invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.service.domain.interactors.FetchDriveUseCase.Param r17, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.service.models.C38166m>> r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof com.carrefour.fid.android.service.domain.interactors.FetchDriveUseCase$invoke$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.service.domain.interactors.FetchDriveUseCase$invoke$1 r2 = (com.carrefour.fid.android.service.domain.interactors.FetchDriveUseCase$invoke$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.service.domain.interactors.FetchDriveUseCase$invoke$1 r2 = new com.carrefour.fid.android.service.domain.interactors.FetchDriveUseCase$invoke$1
            r2.<init>(r0, r1)
        L_0x001c:
            r14 = r2
            java.lang.Object r1 = r14.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r14.label
            r15 = 1
            if (r3 == 0) goto L_0x003c
            if (r3 != r15) goto L_0x0034
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x005a
        L_0x0034:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003c:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository r3 = r0.storeFacilityRepository
            double r4 = r17.getLatitude()
            double r6 = r17.getLongitude()
            r8 = 15000(0x3a98, float:2.102E-41)
            r9 = 0
            r10 = 0
            r11 = 1
            r12 = 200(0xc8, float:2.8E-43)
            r13 = 0
            r14.label = r15
            java.lang.Object r1 = r3.m172881fetchStoreFacilitiesByCoordinatestZkwj4A(r4, r6, r8, r9, r10, r11, r12, r13, r14)
            if (r1 != r2) goto L_0x005a
            return r2
        L_0x005a:
            boolean r2 = kotlin.Result.m38710j(r1)
            if (r2 == 0) goto L_0x00b7
            kotlin.Result$a r2 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.models.service.models.m r1 = (com.carrefour.fid.android.domain.models.service.models.C38166m) r1
            java.util.List r1 = r1.mo119402d()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0073:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00b2
            java.lang.Object r3 = r1.next()
            r4 = r3
            com.carrefour.fid.android.domain.models.service.models.l r4 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r4
            java.util.List r4 = r4.mo119367K()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            boolean r5 = r4 instanceof java.util.Collection
            r6 = 0
            if (r5 == 0) goto L_0x0095
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0095
            goto L_0x00ac
        L_0x0095:
            java.util.Iterator r4 = r4.iterator()
        L_0x0099:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00ac
            java.lang.Object r5 = r4.next()
            com.carrefour.fid.android.domain.models.service.models.StoreService r5 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r5
            boolean r5 = com.carrefour.fid.android.service.domain.extension.StoreServiceKt.isDrive(r5)
            if (r5 == 0) goto L_0x0099
            r6 = r15
        L_0x00ac:
            if (r6 == 0) goto L_0x0073
            r2.add(r3)
            goto L_0x0073
        L_0x00b2:
            com.carrefour.fid.android.domain.models.service.models.m r1 = new com.carrefour.fid.android.domain.models.service.models.m
            r1.<init>(r2)
        L_0x00b7:
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.domain.interactors.FetchDriveUseCase.m172835invokegIAlus(com.carrefour.fid.android.service.domain.interactors.FetchDriveUseCase$Param, kotlin.coroutines.c):java.lang.Object");
    }
}
