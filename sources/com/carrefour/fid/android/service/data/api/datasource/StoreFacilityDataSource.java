package com.carrefour.fid.android.service.data.api.datasource;

import com.carrefour.fid.android.domain.models.LatLon;
import com.carrefour.fid.android.service.data.api.service.StoreFacilityService;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11368t0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00106\u001a\u000205¢\u0006\u0004\b=\u0010>J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002Jn\u0010\u0011\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u001a\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\r2\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\r2\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\rH\u0002J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0002J\u0016\u0010\u0017\u001a\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015H\u0002J*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0018\u001a\u00020\u0006H@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0001\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u001a\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\r2\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\r2\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\rH@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u001e\u0010\u001fJb\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\nH@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b&\u0010'J0\u0010,\u001a\b\u0012\u0004\u0012\u00020)0\u00192\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015H@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b*\u0010+J4\u00101\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010-\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010\u0006H@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b/\u00100R\u0014\u00103\u001a\u0002028\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001b\u0010<\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006?"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/data/api/datasource/StoreFacilityDataSource;", "", "", "withLadServices", "withH1h3Services", "withDriveServices", "", "formatServiceTypes", "Lcom/carrefour/fid/android/domain/models/LatLon;", "geoCoordinates", "", "radius", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "bannerItems", "openingsItems", "servicesItems", "createUrlForStoreSearch", "hostUrl", "parameterUrl", "getUrl", "", "list", "buildServiceParameter", "metiRef", "Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/service/models/m;", "fetchStoreByMetiRef-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "fetchStoreByMetiRef", "fetchStoreByCoordinatesFromWS-hUnOzRk", "(Lcom/carrefour/fid/android/domain/models/LatLon;ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Lkotlin/coroutines/c;)Ljava/lang/Object;", "fetchStoreByCoordinatesFromWS", "", "latitude", "longitude", "size", "page", "fetchStoreFacilitiesByCoordinates-tZkwj4A", "(DDIZZZIILkotlin/coroutines/c;)Ljava/lang/Object;", "fetchStoreFacilitiesByCoordinates", "Lcom/carrefour/fid/android/domain/models/service/models/o;", "fetchServicesPicto-gIAlu-s", "(Ljava/util/List;Lkotlin/coroutines/c;)Ljava/lang/Object;", "fetchServicesPicto", "postalCode", "cityName", "getEligibilityPostalCode-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "getEligibilityPostalCode", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "appEnvironment", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "Lcom/carrefour/fid/android/service/data/api/service/StoreFacilityService;", "storeFacilityService", "Lcom/carrefour/fid/android/service/data/api/service/StoreFacilityService;", "hostName$delegate", "Lkotlin/z;", "getHostName", "()Ljava/lang/String;", "hostName", "<init>", "(Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;Lcom/carrefour/fid/android/service/data/api/service/StoreFacilityService;)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class StoreFacilityDataSource {
    /* access modifiers changed from: private */
    @C12579k
    public final AppEnvironment appEnvironment;
    @C12579k
    private final C11677z hostName$delegate = C10864b0.m38748c(new StoreFacilityDataSource$hostName$2(this));
    @C12579k
    private final StoreFacilityService storeFacilityService;

    @Inject
    public StoreFacilityDataSource(@C12579k AppEnvironment appEnvironment2, @C12579k StoreFacilityService storeFacilityService2) {
        Intrinsics.checkNotNullParameter(appEnvironment2, "appEnvironment");
        Intrinsics.checkNotNullParameter(storeFacilityService2, "storeFacilityService");
        this.appEnvironment = appEnvironment2;
        this.storeFacilityService = storeFacilityService2;
    }

    private final String buildServiceParameter(List<String> list) {
        return CollectionsKt___CollectionsKt.m40639h3(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 62, (Object) null);
    }

    private final String createUrlForStoreSearch(LatLon latLon, int i, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3) {
        Double d;
        String str = getHostName() + "retail/v2/mof/facilities_geolocation/facilities?";
        Double d2 = null;
        if (latLon != null) {
            d = Double.valueOf(latLon.getLatitude());
        } else {
            d = null;
        }
        String str2 = str + "latitude=" + d + "&";
        if (latLon != null) {
            d2 = Double.valueOf(latLon.getLongitude());
        }
        String str3 = (str2 + "longitude=" + d2 + "&") + "radius=" + i;
        if (arrayList != null && (!arrayList.isEmpty())) {
            str3 = str3 + C11622t.replace$default("&banner=" + CollectionsKt___CollectionsKt.m40639h3(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 62, (Object) null), " ", "%20", false, 4, (Object) null);
        }
        if (arrayList2 != null && (!arrayList2.isEmpty())) {
            str3 = str3 + "&opening_day=" + CollectionsKt___CollectionsKt.m40639h3(arrayList2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 62, (Object) null);
        }
        if (arrayList3 != null && (!arrayList3.isEmpty())) {
            str3 = str3 + "&services=" + CollectionsKt___CollectionsKt.m40639h3(arrayList3, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 62, (Object) null);
        }
        return str3 + "&size=200";
    }

    private final String formatServiceTypes(boolean z, boolean z2, boolean z3) {
        List i = C10976s.m41417i();
        if (z) {
            i.add("LAD");
        }
        if (z2) {
            i.add("H1H3");
        }
        if (z3) {
            i.add("DRIVE");
        }
        return CollectionsKt___CollectionsKt.m40639h3(C10976s.m41409a(i), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 62, (Object) null);
    }

    private final String getHostName() {
        return (String) this.hostName$delegate.getValue();
    }

    private final String getUrl(String str, String str2) {
        C11368t0 t0Var = C11368t0.f28504a;
        String format = String.format("%s%s%s", Arrays.copyOf(new Object[]{getHostName(), str, str2}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        return format;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: fetchServicesPicto-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m172828fetchServicesPictogIAlus(@org.jetbrains.annotations.C12579k java.util.List<java.lang.String> r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.service.models.C38168o>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource$fetchServicesPicto$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource$fetchServicesPicto$1 r0 = (com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource$fetchServicesPicto$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource$fetchServicesPicto$1 r0 = new com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource$fetchServicesPicto$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r6)     // Catch:{ all -> 0x0056 }
            goto L_0x004b
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result$a r6 = kotlin.Result.f28060a     // Catch:{ all -> 0x0056 }
            com.carrefour.fid.android.service.data.api.service.StoreFacilityService r6 = r4.storeFacilityService     // Catch:{ all -> 0x0056 }
            java.lang.String r2 = "retail/v1/mof/content_management/services?code="
            java.lang.String r5 = r4.buildServiceParameter(r5)     // Catch:{ all -> 0x0056 }
            java.lang.String r5 = r4.getUrl(r2, r5)     // Catch:{ all -> 0x0056 }
            r0.label = r3     // Catch:{ all -> 0x0056 }
            java.lang.Object r6 = r6.getServicePicto(r5, r0)     // Catch:{ all -> 0x0056 }
            if (r6 != r1) goto L_0x004b
            return r1
        L_0x004b:
            com.carrefour.fid.android.service.data.api.entities.StoreServicesPictosResponse r6 = (com.carrefour.fid.android.service.data.api.entities.StoreServicesPictosResponse) r6     // Catch:{ all -> 0x0056 }
            com.carrefour.fid.android.domain.models.service.models.o r5 = com.carrefour.fid.android.service.data.api.extension.DataToDomainKt.toDomain((com.carrefour.fid.android.service.data.api.entities.StoreServicesPictosResponse) r6)     // Catch:{ all -> 0x0056 }
            java.lang.Object r5 = kotlin.Result.m38702b(r5)     // Catch:{ all -> 0x0056 }
            goto L_0x0061
        L_0x0056:
            r5 = move-exception
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x0061:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource.m172828fetchServicesPictogIAlus(java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: fetchStoreByCoordinatesFromWS-hUnOzRk  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m172829fetchStoreByCoordinatesFromWShUnOzRk(@org.jetbrains.annotations.C12580l com.carrefour.fid.android.domain.models.LatLon r5, int r6, @org.jetbrains.annotations.C12580l java.util.ArrayList<java.lang.String> r7, @org.jetbrains.annotations.C12580l java.util.ArrayList<java.lang.String> r8, @org.jetbrains.annotations.C12580l java.util.ArrayList<java.lang.String> r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.service.models.C38166m>> r10) {
        /*
            r4 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource$fetchStoreByCoordinatesFromWS$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource$fetchStoreByCoordinatesFromWS$1 r0 = (com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource$fetchStoreByCoordinatesFromWS$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource$fetchStoreByCoordinatesFromWS$1 r0 = new com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource$fetchStoreByCoordinatesFromWS$1
            r0.<init>(r4, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x0050 }
            goto L_0x0045
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result$a r10 = kotlin.Result.f28060a     // Catch:{ all -> 0x0050 }
            com.carrefour.fid.android.service.data.api.service.StoreFacilityService r10 = r4.storeFacilityService     // Catch:{ all -> 0x0050 }
            java.lang.String r5 = r4.createUrlForStoreSearch(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0050 }
            r0.label = r3     // Catch:{ all -> 0x0050 }
            java.lang.Object r10 = r10.getFacilities(r5, r0)     // Catch:{ all -> 0x0050 }
            if (r10 != r1) goto L_0x0045
            return r1
        L_0x0045:
            com.carrefour.fid.android.service.data.api.entities.StoreFacilityResponse r10 = (com.carrefour.fid.android.service.data.api.entities.StoreFacilityResponse) r10     // Catch:{ all -> 0x0050 }
            com.carrefour.fid.android.domain.models.service.models.m r5 = com.carrefour.fid.android.service.data.api.extension.DataToDomainKt.toDomain((com.carrefour.fid.android.service.data.api.entities.StoreFacilityResponse) r10)     // Catch:{ all -> 0x0050 }
            java.lang.Object r5 = kotlin.Result.m38702b(r5)     // Catch:{ all -> 0x0050 }
            goto L_0x005b
        L_0x0050:
            r5 = move-exception
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x005b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource.m172829fetchStoreByCoordinatesFromWShUnOzRk(com.carrefour.fid.android.domain.models.LatLon, int, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: fetchStoreByMetiRef-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m172830fetchStoreByMetiRefgIAlus(@org.jetbrains.annotations.C12579k java.lang.String r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.service.models.C38166m>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource$fetchStoreByMetiRef$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource$fetchStoreByMetiRef$1 r0 = (com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource$fetchStoreByMetiRef$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource$fetchStoreByMetiRef$1 r0 = new com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource$fetchStoreByMetiRef$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r7)     // Catch:{ all -> 0x005d }
            goto L_0x0052
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result$a r7 = kotlin.Result.f28060a     // Catch:{ all -> 0x005d }
            com.carrefour.fid.android.service.data.api.service.StoreFacilityService r7 = r5.storeFacilityService     // Catch:{ all -> 0x005d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
            r2.<init>()     // Catch:{ all -> 0x005d }
            java.lang.String r4 = "retail/v2/mof/facilities_geolocation/facilities/?meti_reference="
            r2.append(r4)     // Catch:{ all -> 0x005d }
            r2.append(r6)     // Catch:{ all -> 0x005d }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x005d }
            r0.label = r3     // Catch:{ all -> 0x005d }
            java.lang.Object r7 = r7.getFacilities(r6, r0)     // Catch:{ all -> 0x005d }
            if (r7 != r1) goto L_0x0052
            return r1
        L_0x0052:
            com.carrefour.fid.android.service.data.api.entities.StoreFacilityResponse r7 = (com.carrefour.fid.android.service.data.api.entities.StoreFacilityResponse) r7     // Catch:{ all -> 0x005d }
            com.carrefour.fid.android.domain.models.service.models.m r6 = com.carrefour.fid.android.service.data.api.extension.DataToDomainKt.toDomain((com.carrefour.fid.android.service.data.api.entities.StoreFacilityResponse) r7)     // Catch:{ all -> 0x005d }
            java.lang.Object r6 = kotlin.Result.m38702b(r6)     // Catch:{ all -> 0x005d }
            goto L_0x0068
        L_0x005d:
            r6 = move-exception
            kotlin.Result$a r7 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
        L_0x0068:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource.m172830fetchStoreByMetiRefgIAlus(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e A[Catch:{ all -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0073 A[Catch:{ all -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: fetchStoreFacilitiesByCoordinates-tZkwj4A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m172831fetchStoreFacilitiesByCoordinatestZkwj4A(double r5, double r7, int r9, boolean r10, boolean r11, boolean r12, int r13, int r14, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.service.models.C38166m>> r15) {
        /*
            r4 = this;
            boolean r0 = r15 instanceof com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource$fetchStoreFacilitiesByCoordinates$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource$fetchStoreFacilitiesByCoordinates$1 r0 = (com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource$fetchStoreFacilitiesByCoordinates$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource$fetchStoreFacilitiesByCoordinates$1 r0 = new com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource$fetchStoreFacilitiesByCoordinates$1
            r0.<init>(r4, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r15)     // Catch:{ all -> 0x007d }
            goto L_0x0066
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r15)
            kotlin.Result$a r15 = kotlin.Result.f28060a     // Catch:{ all -> 0x007d }
            com.carrefour.fid.android.service.data.api.service.StoreFacilityService r15 = r4.storeFacilityService     // Catch:{ all -> 0x007d }
            if (r12 == 0) goto L_0x003c
            r12 = r3
            goto L_0x003d
        L_0x003c:
            r12 = 0
        L_0x003d:
            java.lang.String r10 = r4.formatServiceTypes(r10, r11, r12)     // Catch:{ all -> 0x007d }
            java.lang.Double r7 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r7)     // Catch:{ all -> 0x007d }
            java.lang.Double r8 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r5)     // Catch:{ all -> 0x007d }
            java.lang.Integer r9 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r9)     // Catch:{ all -> 0x007d }
            java.lang.Integer r11 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r13)     // Catch:{ all -> 0x007d }
            java.lang.Integer r12 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r14)     // Catch:{ all -> 0x007d }
            r0.label = r3     // Catch:{ all -> 0x007d }
            r5 = r15
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r0
            java.lang.Object r15 = r5.getFacilitiesGeolocation(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x007d }
            if (r15 != r1) goto L_0x0066
            return r1
        L_0x0066:
            com.carrefour.fid.android.service.data.api.entities.FacilitiesGeolocationResponse r15 = (com.carrefour.fid.android.service.data.api.entities.FacilitiesGeolocationResponse) r15     // Catch:{ all -> 0x007d }
            com.carrefour.fid.android.service.data.api.entities.FacilitiesGeolocationDataResponse r5 = r15.getData()     // Catch:{ all -> 0x007d }
            if (r5 == 0) goto L_0x0073
            java.util.List r5 = r5.getStoreResponseList()     // Catch:{ all -> 0x007d }
            goto L_0x0074
        L_0x0073:
            r5 = 0
        L_0x0074:
            com.carrefour.fid.android.domain.models.service.models.m r5 = com.carrefour.fid.android.service.data.api.extension.DataToDomainKt.toDomain((java.util.List<com.carrefour.fid.android.service.data.api.entities.StoreResponse>) r5)     // Catch:{ all -> 0x007d }
            java.lang.Object r5 = kotlin.Result.m38702b(r5)     // Catch:{ all -> 0x007d }
            goto L_0x0088
        L_0x007d:
            r5 = move-exception
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x0088:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource.m172831fetchStoreFacilitiesByCoordinatestZkwj4A(double, double, int, boolean, boolean, boolean, int, int, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: getEligibilityPostalCode-0E7RQCE  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m172832getEligibilityPostalCode0E7RQCE(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12580l java.lang.String r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.service.models.C38166m>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource$getEligibilityPostalCode$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource$getEligibilityPostalCode$1 r0 = (com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource$getEligibilityPostalCode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource$getEligibilityPostalCode$1 r0 = new com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource$getEligibilityPostalCode$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r7)     // Catch:{ all -> 0x004c }
            goto L_0x0041
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result$a r7 = kotlin.Result.f28060a     // Catch:{ all -> 0x004c }
            com.carrefour.fid.android.service.data.api.service.StoreFacilityService r7 = r4.storeFacilityService     // Catch:{ all -> 0x004c }
            r0.label = r3     // Catch:{ all -> 0x004c }
            java.lang.Object r7 = r7.getEligibilityPostalCode(r5, r6, r0)     // Catch:{ all -> 0x004c }
            if (r7 != r1) goto L_0x0041
            return r1
        L_0x0041:
            com.carrefour.fid.android.service.data.api.entities.StoreFacilityResponse r7 = (com.carrefour.fid.android.service.data.api.entities.StoreFacilityResponse) r7     // Catch:{ all -> 0x004c }
            com.carrefour.fid.android.domain.models.service.models.m r5 = com.carrefour.fid.android.service.data.api.extension.DataToDomainKt.toDomain((com.carrefour.fid.android.service.data.api.entities.StoreFacilityResponse) r7)     // Catch:{ all -> 0x004c }
            java.lang.Object r5 = kotlin.Result.m38702b(r5)     // Catch:{ all -> 0x004c }
            goto L_0x0057
        L_0x004c:
            r5 = move-exception
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x0057:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource.m172832getEligibilityPostalCode0E7RQCE(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
