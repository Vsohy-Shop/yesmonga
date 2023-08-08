package com.carrefour.fid.android.service.domain.repositories;

import com.carrefour.fid.android.service.data.api.datasource.FacilityDataSource;
import com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource;
import com.carrefour.fid.android.shared.util.cache.MemCache;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001?B\u001f\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u000e2\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u000e2\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u000eH@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u0013Jb\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000bH@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ0\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020!H@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b$\u0010%J4\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010'\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\u0002H@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b)\u0010*J6\u00101\u001a\b\u0012\u0004\u0012\u00020.0\u00042\u0006\u0010,\u001a\u00020\u00022\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0018H@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b/\u00100R\u0014\u00103\u001a\u0002028\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006@"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/domain/repositories/StoreFacilityRepository;", "", "", "metiRef", "Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/service/models/m;", "fetchStoreByMetiRef-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "fetchStoreByMetiRef", "Lcom/carrefour/fid/android/domain/models/LatLon;", "geoCoordinates", "", "radius", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "bannerItems", "openingsItems", "servicesItems", "fetchStoreByCoordinatesFromWS-hUnOzRk", "(Lcom/carrefour/fid/android/domain/models/LatLon;ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Lkotlin/coroutines/c;)Ljava/lang/Object;", "fetchStoreByCoordinatesFromWS", "", "latitude", "longitude", "", "withLadServices", "withH1h3Services", "withDriveServices", "size", "page", "fetchStoreFacilitiesByCoordinates-tZkwj4A", "(DDIZZZIILkotlin/coroutines/c;)Ljava/lang/Object;", "fetchStoreFacilitiesByCoordinates", "", "list", "Lcom/carrefour/fid/android/domain/models/service/models/o;", "fetchServicesPicto-gIAlu-s", "(Ljava/util/List;Lkotlin/coroutines/c;)Ljava/lang/Object;", "fetchServicesPicto", "postalCode", "cityName", "getEligibilityPostalCode-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "getEligibilityPostalCode", "anabelKey", "isMirror", "Lcom/carrefour/fid/android/domain/models/service/models/l;", "getStoreByAnabelKey-0E7RQCE", "(Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/c;)Ljava/lang/Object;", "getStoreByAnabelKey", "Lcom/carrefour/fid/android/service/data/api/datasource/StoreFacilityDataSource;", "storeFacilityDataSource", "Lcom/carrefour/fid/android/service/data/api/datasource/StoreFacilityDataSource;", "Lcom/carrefour/fid/android/service/data/api/datasource/FacilityDataSource;", "facilityDataSource", "Lcom/carrefour/fid/android/service/data/api/datasource/FacilityDataSource;", "Lcom/carrefour/fid/android/shared/util/cache/MemCache;", "cache", "Lcom/carrefour/fid/android/shared/util/cache/MemCache;", "Lkotlinx/coroutines/o0;", "appScope", "<init>", "(Lcom/carrefour/fid/android/service/data/api/datasource/StoreFacilityDataSource;Lcom/carrefour/fid/android/service/data/api/datasource/FacilityDataSource;Lkotlinx/coroutines/o0;)V", "ByCoordinatesKey", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class StoreFacilityRepository {
    /* access modifiers changed from: private */
    @C12579k
    public final MemCache cache;
    /* access modifiers changed from: private */
    @C12579k
    public final FacilityDataSource facilityDataSource;
    /* access modifiers changed from: private */
    @C12579k
    public final StoreFacilityDataSource storeFacilityDataSource;

    @C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\"\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0006HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016¨\u0006'"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/domain/repositories/StoreFacilityRepository$ByCoordinatesKey;", "", "latitude", "", "longitude", "radius", "", "withLadServices", "", "withH1h3Services", "withDriveServices", "size", "page", "(DDIZZZII)V", "getLatitude", "()D", "getLongitude", "getPage", "()I", "getRadius", "getSize", "getWithDriveServices", "()Z", "getWithH1h3Services", "getWithLadServices", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class ByCoordinatesKey {
        private final double latitude;
        private final double longitude;
        private final int page;
        private final int radius;
        private final int size;
        private final boolean withDriveServices;
        private final boolean withH1h3Services;
        private final boolean withLadServices;

        public ByCoordinatesKey(double d, double d2, int i, boolean z, boolean z2, boolean z3, int i2, int i3) {
            this.latitude = d;
            this.longitude = d2;
            this.radius = i;
            this.withLadServices = z;
            this.withH1h3Services = z2;
            this.withDriveServices = z3;
            this.size = i2;
            this.page = i3;
        }

        public static /* synthetic */ ByCoordinatesKey copy$default(ByCoordinatesKey byCoordinatesKey, double d, double d2, int i, boolean z, boolean z2, boolean z3, int i2, int i3, int i4, Object obj) {
            ByCoordinatesKey byCoordinatesKey2 = byCoordinatesKey;
            int i5 = i4;
            return byCoordinatesKey.copy((i5 & 1) != 0 ? byCoordinatesKey2.latitude : d, (i5 & 2) != 0 ? byCoordinatesKey2.longitude : d2, (i5 & 4) != 0 ? byCoordinatesKey2.radius : i, (i5 & 8) != 0 ? byCoordinatesKey2.withLadServices : z, (i5 & 16) != 0 ? byCoordinatesKey2.withH1h3Services : z2, (i5 & 32) != 0 ? byCoordinatesKey2.withDriveServices : z3, (i5 & 64) != 0 ? byCoordinatesKey2.size : i2, (i5 & 128) != 0 ? byCoordinatesKey2.page : i3);
        }

        public final double component1() {
            return this.latitude;
        }

        public final double component2() {
            return this.longitude;
        }

        public final int component3() {
            return this.radius;
        }

        public final boolean component4() {
            return this.withLadServices;
        }

        public final boolean component5() {
            return this.withH1h3Services;
        }

        public final boolean component6() {
            return this.withDriveServices;
        }

        public final int component7() {
            return this.size;
        }

        public final int component8() {
            return this.page;
        }

        @C12579k
        public final ByCoordinatesKey copy(double d, double d2, int i, boolean z, boolean z2, boolean z3, int i2, int i3) {
            return new ByCoordinatesKey(d, d2, i, z, z2, z3, i2, i3);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ByCoordinatesKey)) {
                return false;
            }
            ByCoordinatesKey byCoordinatesKey = (ByCoordinatesKey) obj;
            return Double.compare(this.latitude, byCoordinatesKey.latitude) == 0 && Double.compare(this.longitude, byCoordinatesKey.longitude) == 0 && this.radius == byCoordinatesKey.radius && this.withLadServices == byCoordinatesKey.withLadServices && this.withH1h3Services == byCoordinatesKey.withH1h3Services && this.withDriveServices == byCoordinatesKey.withDriveServices && this.size == byCoordinatesKey.size && this.page == byCoordinatesKey.page;
        }

        public final double getLatitude() {
            return this.latitude;
        }

        public final double getLongitude() {
            return this.longitude;
        }

        public final int getPage() {
            return this.page;
        }

        public final int getRadius() {
            return this.radius;
        }

        public final int getSize() {
            return this.size;
        }

        public final boolean getWithDriveServices() {
            return this.withDriveServices;
        }

        public final boolean getWithH1h3Services() {
            return this.withH1h3Services;
        }

        public final boolean getWithLadServices() {
            return this.withLadServices;
        }

        public int hashCode() {
            int hashCode = ((((Double.hashCode(this.latitude) * 31) + Double.hashCode(this.longitude)) * 31) + Integer.hashCode(this.radius)) * 31;
            boolean z = this.withLadServices;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.withH1h3Services;
            if (z3) {
                z3 = true;
            }
            int i2 = (i + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.withDriveServices;
            if (!z4) {
                z2 = z4;
            }
            return ((((i2 + (z2 ? 1 : 0)) * 31) + Integer.hashCode(this.size)) * 31) + Integer.hashCode(this.page);
        }

        @C12579k
        public String toString() {
            double d = this.latitude;
            double d2 = this.longitude;
            int i = this.radius;
            boolean z = this.withLadServices;
            boolean z2 = this.withH1h3Services;
            boolean z3 = this.withDriveServices;
            int i2 = this.size;
            int i3 = this.page;
            return "ByCoordinatesKey(latitude=" + d + ", longitude=" + d2 + ", radius=" + i + ", withLadServices=" + z + ", withH1h3Services=" + z2 + ", withDriveServices=" + z3 + ", size=" + i2 + ", page=" + i3 + ")";
        }
    }

    public StoreFacilityRepository(@C12579k StoreFacilityDataSource storeFacilityDataSource2, @C12579k FacilityDataSource facilityDataSource2, @C12579k C12074o0 o0Var) {
        Intrinsics.checkNotNullParameter(storeFacilityDataSource2, "storeFacilityDataSource");
        Intrinsics.checkNotNullParameter(facilityDataSource2, "facilityDataSource");
        Intrinsics.checkNotNullParameter(o0Var, "appScope");
        this.storeFacilityDataSource = storeFacilityDataSource2;
        this.facilityDataSource = facilityDataSource2;
        this.cache = new MemCache(o0Var);
    }

    /* renamed from: getStoreByAnabelKey-0E7RQCE$default  reason: not valid java name */
    public static /* synthetic */ Object m172877getStoreByAnabelKey0E7RQCE$default(StoreFacilityRepository storeFacilityRepository, String str, Boolean bool, C11045c cVar, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        return storeFacilityRepository.m172883getStoreByAnabelKey0E7RQCE(str, bool, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: fetchServicesPicto-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m172878fetchServicesPictogIAlus(@org.jetbrains.annotations.C12579k java.util.List<java.lang.String> r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.service.models.C38168o>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$fetchServicesPicto$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$fetchServicesPicto$1 r0 = (com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$fetchServicesPicto$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$fetchServicesPicto$1 r0 = new com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$fetchServicesPicto$1
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
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$fetchServicesPicto$2 r6 = new com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$fetchServicesPicto$2
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r6, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository.m172878fetchServicesPictogIAlus(java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: fetchStoreByCoordinatesFromWS-hUnOzRk  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m172879fetchStoreByCoordinatesFromWShUnOzRk(@org.jetbrains.annotations.C12580l com.carrefour.fid.android.domain.models.LatLon r14, int r15, @org.jetbrains.annotations.C12580l java.util.ArrayList<java.lang.String> r16, @org.jetbrains.annotations.C12580l java.util.ArrayList<java.lang.String> r17, @org.jetbrains.annotations.C12580l java.util.ArrayList<java.lang.String> r18, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.service.models.C38166m>> r19) {
        /*
            r13 = this;
            r0 = r19
            boolean r1 = r0 instanceof com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$fetchStoreByCoordinatesFromWS$1
            if (r1 == 0) goto L_0x0016
            r1 = r0
            com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$fetchStoreByCoordinatesFromWS$1 r1 = (com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$fetchStoreByCoordinatesFromWS$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0016
            int r2 = r2 - r3
            r1.label = r2
            r10 = r13
            goto L_0x001c
        L_0x0016:
            com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$fetchStoreByCoordinatesFromWS$1 r1 = new com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$fetchStoreByCoordinatesFromWS$1
            r10 = r13
            r1.<init>(r13, r0)
        L_0x001c:
            java.lang.Object r0 = r1.result
            java.lang.Object r11 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r1.label
            r12 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r12) goto L_0x0033
            kotlin.C11661u0.m45747n(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.mo21858l()
            goto L_0x0057
        L_0x0033:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003b:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$fetchStoreByCoordinatesFromWS$2 r0 = new com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$fetchStoreByCoordinatesFromWS$2
            r9 = 0
            r2 = r0
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1.label = r12
            java.lang.Object r0 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r0, r1)
            if (r0 != r11) goto L_0x0057
            return r11
        L_0x0057:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository.m172879fetchStoreByCoordinatesFromWShUnOzRk(com.carrefour.fid.android.domain.models.LatLon, int, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: fetchStoreByMetiRef-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m172880fetchStoreByMetiRefgIAlus(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.service.models.C38166m>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$fetchStoreByMetiRef$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$fetchStoreByMetiRef$1 r0 = (com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$fetchStoreByMetiRef$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$fetchStoreByMetiRef$1 r0 = new com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$fetchStoreByMetiRef$1
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
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$fetchStoreByMetiRef$2 r6 = new com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$fetchStoreByMetiRef$2
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r6, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository.m172880fetchStoreByMetiRefgIAlus(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: fetchStoreFacilitiesByCoordinates-tZkwj4A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m172881fetchStoreFacilitiesByCoordinatestZkwj4A(double r19, double r21, int r23, boolean r24, boolean r25, boolean r26, int r27, int r28, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.service.models.C38166m>> r29) {
        /*
            r18 = this;
            r0 = r29
            boolean r1 = r0 instanceof com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$fetchStoreFacilitiesByCoordinates$1
            if (r1 == 0) goto L_0x0017
            r1 = r0
            com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$fetchStoreFacilitiesByCoordinates$1 r1 = (com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$fetchStoreFacilitiesByCoordinates$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.label = r2
            r15 = r18
            goto L_0x001e
        L_0x0017:
            com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$fetchStoreFacilitiesByCoordinates$1 r1 = new com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$fetchStoreFacilitiesByCoordinates$1
            r15 = r18
            r1.<init>(r15, r0)
        L_0x001e:
            java.lang.Object r0 = r1.result
            java.lang.Object r14 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r1.label
            r13 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 != r13) goto L_0x0035
            kotlin.C11661u0.m45747n(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.mo21858l()
            goto L_0x006a
        L_0x0035:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003d:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$fetchStoreFacilitiesByCoordinates$2 r0 = new com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$fetchStoreFacilitiesByCoordinates$2
            r16 = 0
            r2 = r0
            r3 = r19
            r5 = r21
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r15 = r13
            r13 = r18
            r17 = r14
            r14 = r16
            r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12, r13, r14)
            r1.label = r15
            java.lang.Object r0 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r0, r1)
            r1 = r17
            if (r0 != r1) goto L_0x006a
            return r1
        L_0x006a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository.m172881fetchStoreFacilitiesByCoordinatestZkwj4A(double, double, int, boolean, boolean, boolean, int, int, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: getEligibilityPostalCode-0E7RQCE  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m172882getEligibilityPostalCode0E7RQCE(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12580l java.lang.String r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.service.models.C38166m>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$getEligibilityPostalCode$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$getEligibilityPostalCode$1 r0 = (com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$getEligibilityPostalCode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$getEligibilityPostalCode$1 r0 = new com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$getEligibilityPostalCode$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r5 = r7.mo21858l()
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$getEligibilityPostalCode$2 r7 = new com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$getEligibilityPostalCode$2
            r2 = 0
            r7.<init>(r4, r5, r6, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r7, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository.m172882getEligibilityPostalCode0E7RQCE(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: getStoreByAnabelKey-0E7RQCE  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m172883getStoreByAnabelKey0E7RQCE(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12580l java.lang.Boolean r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.service.models.C38163l>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$getStoreByAnabelKey$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$getStoreByAnabelKey$1 r0 = (com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$getStoreByAnabelKey$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$getStoreByAnabelKey$1 r0 = new com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$getStoreByAnabelKey$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r5 = r7.mo21858l()
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$getStoreByAnabelKey$2 r7 = new com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$getStoreByAnabelKey$2
            r2 = 0
            r7.<init>(r5, r6, r4, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r7, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository.m172883getStoreByAnabelKey0E7RQCE(java.lang.String, java.lang.Boolean, kotlin.coroutines.c):java.lang.Object");
    }
}
