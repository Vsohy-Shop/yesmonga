package com.carrefour.fid.android.service.p043di;

import com.carrefour.fid.android.domain.interactors.service.C37811a;
import com.carrefour.fid.android.domain.interactors.service.C37812b;
import com.carrefour.fid.android.domain.interactors.service.C37815d;
import com.carrefour.fid.android.domain.interactors.service.C37816e;
import com.carrefour.fid.android.domain.interactors.service.C37817f;
import com.carrefour.fid.android.domain.interactors.service.C37818g;
import com.carrefour.fid.android.domain.interactors.service.C37820h;
import com.carrefour.fid.android.domain.interactors.service.C37822j;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.interactors.service.C37824l;
import com.carrefour.fid.android.domain.interactors.service.C37825m;
import com.carrefour.fid.android.domain.interactors.service.C37826n;
import com.carrefour.fid.android.domain.interactors.service.C37827o;
import com.carrefour.fid.android.domain.interactors.service.C37828p;
import com.carrefour.fid.android.domain.interactors.service.C37834q;
import com.carrefour.fid.android.domain.interactors.service.C37835r;
import com.carrefour.fid.android.domain.interactors.service.C37836s;
import com.carrefour.fid.android.domain.interactors.service.C37838t;
import com.carrefour.fid.android.domain.interactors.service.C37839u;
import com.carrefour.fid.android.domain.interactors.service.C37841v;
import com.carrefour.fid.android.domain.interactors.service.physicalstore.C37829a;
import com.carrefour.fid.android.domain.interactors.service.physicalstore.C37830b;
import com.carrefour.fid.android.domain.interactors.service.physicalstore.C37832c;
import com.carrefour.fid.android.domain.interactors.service.physicalstore.C37833d;
import com.carrefour.fid.android.service.core.location.LocationProvider;
import com.carrefour.fid.android.service.core.location.LocationProviderImpl;
import com.carrefour.fid.android.service.data.api.datasource.FacilityDataSource;
import com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource;
import com.carrefour.fid.android.service.data.api.service.FacilityService;
import com.carrefour.fid.android.service.data.api.service.StoreFacilityService;
import com.carrefour.fid.android.service.data.datastore.PhysicalStoreDataStore;
import com.carrefour.fid.android.service.data.datastore.ServiceDataStore;
import com.carrefour.fid.android.service.domain.interactors.ServiceClearFavoritePhysicalStoreUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceClearServiceSelectionUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceFetchDeliveryStoresUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceFetchPhysicalStoresUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceFetchStoreServicesPictosUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceGetFacilityDetailsByAnabelKeyUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceGetFavoritePhysicalStoreUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceGetMirrorDriveServiceUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceGetPromiseUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceGetSelectedServiceUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceGetServiceSelectedUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceGetServiceSelectionUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceGetStoreRefUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceGetStoreServiceTypeSelectedUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceIsPreviousSelectedServiceDifferentUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceIsSelectedServiceDeliveryUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceIsServiceOpenUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceIsServiceSelectedUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceObserveServiceSelectionUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceSetFavoritePhysicalStoreUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceSetServiceSelectionUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceUpdateMinOrderAmountUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceUpdateStoreServiceUseCase;
import com.carrefour.fid.android.service.domain.repositories.PhysicalStoreRepository;
import com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository;
import com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository;
import com.carrefour.fid.android.shared.p045di.annotation.C28657a;
import com.carrefour.fid.android.shared.p045di.annotation.C28659c;
import dagger.C10147a;
import dagger.C10159h;
import dagger.C10315i;
import dagger.hilt.C10267e;
import dagger.hilt.components.C10265a;
import javax.inject.Singleton;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import retrofit2.C13092x;

@C10267e({C10265a.class})
@C10159h
@C11076d0(mo22515d1 = {"\u0000Ì\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u0000 \u00012\u00020\u0001:\u0002\u0001R\u0018\u0010\u0006\u001a\u00020\u0003*\u00020\u00028gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u000b\u001a\u00020\b*\u00020\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0010\u001a\u00020\r*\u00020\f8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0015\u001a\u00020\u0012*\u00020\u00118gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u001a\u001a\u00020\u0017*\u00020\u00168gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001f\u001a\u00020\u001c*\u00020\u001b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010$\u001a\u00020!*\u00020 8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0018\u0010)\u001a\u00020&*\u00020%8gX¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0018\u0010.\u001a\u00020+*\u00020*8gX¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0018\u00103\u001a\u000200*\u00020/8gX¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0018\u00108\u001a\u000205*\u0002048gX¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0018\u0010=\u001a\u00020:*\u0002098gX¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0018\u0010B\u001a\u00020?*\u00020>8gX¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0018\u0010G\u001a\u00020D*\u00020C8gX¦\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0018\u0010L\u001a\u00020I*\u00020H8gX¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0018\u0010Q\u001a\u00020N*\u00020M8gX¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0018\u0010V\u001a\u00020S*\u00020R8gX¦\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0018\u0010[\u001a\u00020X*\u00020W8gX¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0018\u0010`\u001a\u00020]*\u00020\\8gX¦\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0018\u0010e\u001a\u00020b*\u00020a8gX¦\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u001b\u0010j\u001a\u00020g*\u00020f8gX¦\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0018\u0010o\u001a\u00020l*\u00020k8gX¦\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0018\u0010t\u001a\u00020q*\u00020p8gX¦\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u0018\u0010y\u001a\u00020v*\u00020u8gX¦\u0004¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0018\u0010~\u001a\u00020{*\u00020z8gX¦\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}R\u001c\u0010\u0001\u001a\u00030\u0001*\u000208gX¦\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u001d\u0010\u0001\u001a\u00030\u0001*\u00030\u00018gX¦\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001\u0002\u0004\n\u0002\b\u0019¨\u0006\u0001"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/di/ServiceModule;", "", "Lcom/carrefour/fid/android/service/core/location/LocationProviderImpl;", "Lcom/carrefour/fid/android/service/core/location/LocationProvider;", "getBindLocationProvider", "(Lcom/carrefour/fid/android/service/core/location/LocationProviderImpl;)Lcom/carrefour/fid/android/service/core/location/LocationProvider;", "bindLocationProvider", "Lcom/carrefour/fid/android/service/domain/interactors/ServiceIsServiceSelectedUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/q;", "getBindIsServiceSelectedUseCase", "(Lcom/carrefour/fid/android/service/domain/interactors/ServiceIsServiceSelectedUseCase;)Lcom/carrefour/fid/android/domain/interactors/service/q;", "bindIsServiceSelectedUseCase", "Lcom/carrefour/fid/android/service/domain/interactors/ServiceGetStoreRefUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/l;", "getBindGetStoreRefUseCase", "(Lcom/carrefour/fid/android/service/domain/interactors/ServiceGetStoreRefUseCase;)Lcom/carrefour/fid/android/domain/interactors/service/l;", "bindGetStoreRefUseCase", "Lcom/carrefour/fid/android/service/domain/interactors/ServiceGetFacilityDetailsByAnabelKeyUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/e;", "getBindGetFacilityByAnabelKeyUseCase", "(Lcom/carrefour/fid/android/service/domain/interactors/ServiceGetFacilityDetailsByAnabelKeyUseCase;)Lcom/carrefour/fid/android/domain/interactors/service/e;", "bindGetFacilityByAnabelKeyUseCase", "Lcom/carrefour/fid/android/service/domain/interactors/ServiceClearServiceSelectionUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/a;", "getBindClearServiceSelectionUseCase", "(Lcom/carrefour/fid/android/service/domain/interactors/ServiceClearServiceSelectionUseCase;)Lcom/carrefour/fid/android/domain/interactors/service/a;", "bindClearServiceSelectionUseCase", "Lcom/carrefour/fid/android/service/domain/interactors/ServiceGetServiceSelectionUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/k;", "getBindGetServiceSelectionUseCase", "(Lcom/carrefour/fid/android/service/domain/interactors/ServiceGetServiceSelectionUseCase;)Lcom/carrefour/fid/android/domain/interactors/service/k;", "bindGetServiceSelectionUseCase", "Lcom/carrefour/fid/android/service/domain/interactors/ServiceUpdateMinOrderAmountUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/u;", "getBindUpdateMinOrderAmountUseCase", "(Lcom/carrefour/fid/android/service/domain/interactors/ServiceUpdateMinOrderAmountUseCase;)Lcom/carrefour/fid/android/domain/interactors/service/u;", "bindUpdateMinOrderAmountUseCase", "Lcom/carrefour/fid/android/service/domain/interactors/ServiceUpdateStoreServiceUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/v;", "getBindUpdateStoreServiceUseCase", "(Lcom/carrefour/fid/android/service/domain/interactors/ServiceUpdateStoreServiceUseCase;)Lcom/carrefour/fid/android/domain/interactors/service/v;", "bindUpdateStoreServiceUseCase", "Lcom/carrefour/fid/android/service/domain/interactors/ServiceIsServiceOpenUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/p;", "getBindIsServiceOpenUseCase", "(Lcom/carrefour/fid/android/service/domain/interactors/ServiceIsServiceOpenUseCase;)Lcom/carrefour/fid/android/domain/interactors/service/p;", "bindIsServiceOpenUseCase", "Lcom/carrefour/fid/android/service/domain/interactors/ServiceFetchDeliveryStoresUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/b;", "getBindFetchDeliveryStoresUseCase", "(Lcom/carrefour/fid/android/service/domain/interactors/ServiceFetchDeliveryStoresUseCase;)Lcom/carrefour/fid/android/domain/interactors/service/b;", "bindFetchDeliveryStoresUseCase", "Lcom/carrefour/fid/android/service/domain/interactors/ServiceIsSelectedServiceDeliveryUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/o;", "getBindIsSelectedServiceDelivery", "(Lcom/carrefour/fid/android/service/domain/interactors/ServiceIsSelectedServiceDeliveryUseCase;)Lcom/carrefour/fid/android/domain/interactors/service/o;", "bindIsSelectedServiceDelivery", "Lcom/carrefour/fid/android/service/domain/interactors/ServiceFetchPhysicalStoresUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/b;", "getBindFetchPhysicalStoresUseCase", "(Lcom/carrefour/fid/android/service/domain/interactors/ServiceFetchPhysicalStoresUseCase;)Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/b;", "bindFetchPhysicalStoresUseCase", "Lcom/carrefour/fid/android/service/domain/interactors/ServiceSetFavoritePhysicalStoreUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/d;", "getBindSetFavoritePhysicalStoreUseCase", "(Lcom/carrefour/fid/android/service/domain/interactors/ServiceSetFavoritePhysicalStoreUseCase;)Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/d;", "bindSetFavoritePhysicalStoreUseCase", "Lcom/carrefour/fid/android/service/domain/interactors/ServiceGetFavoritePhysicalStoreUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/c;", "getBindGetFavoritePhysicalStoreUseCase", "(Lcom/carrefour/fid/android/service/domain/interactors/ServiceGetFavoritePhysicalStoreUseCase;)Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/c;", "bindGetFavoritePhysicalStoreUseCase", "Lcom/carrefour/fid/android/service/domain/interactors/ServiceClearFavoritePhysicalStoreUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/a;", "getBindClearFavoritePhysicalStoreUseCase", "(Lcom/carrefour/fid/android/service/domain/interactors/ServiceClearFavoritePhysicalStoreUseCase;)Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/a;", "bindClearFavoritePhysicalStoreUseCase", "Lcom/carrefour/fid/android/service/domain/interactors/ServiceFetchStoreServicesPictosUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/d;", "getBindFetchStoreServicesPictosUseCase", "(Lcom/carrefour/fid/android/service/domain/interactors/ServiceFetchStoreServicesPictosUseCase;)Lcom/carrefour/fid/android/domain/interactors/service/d;", "bindFetchStoreServicesPictosUseCase", "Lcom/carrefour/fid/android/service/domain/interactors/ServiceIsPreviousSelectedServiceDifferentUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/n;", "getBindIsPreviousSelectedServiceDifferentUseCase", "(Lcom/carrefour/fid/android/service/domain/interactors/ServiceIsPreviousSelectedServiceDifferentUseCase;)Lcom/carrefour/fid/android/domain/interactors/service/n;", "bindIsPreviousSelectedServiceDifferentUseCase", "Lcom/carrefour/fid/android/service/domain/interactors/ServiceGetServiceSelectedUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/j;", "getBindGetServiceSelectedIdUseCase", "(Lcom/carrefour/fid/android/service/domain/interactors/ServiceGetServiceSelectedUseCase;)Lcom/carrefour/fid/android/domain/interactors/service/j;", "bindGetServiceSelectedIdUseCase", "Lcom/carrefour/fid/android/service/data/datastore/ServiceDataStore;", "Lcom/carrefour/fid/android/service/domain/repositories/ServiceSelectionRepository$ServicePersistence;", "getBindServicePersistence", "(Lcom/carrefour/fid/android/service/data/datastore/ServiceDataStore;)Lcom/carrefour/fid/android/service/domain/repositories/ServiceSelectionRepository$ServicePersistence;", "bindServicePersistence", "Lcom/carrefour/fid/android/service/data/datastore/PhysicalStoreDataStore;", "Lcom/carrefour/fid/android/service/domain/repositories/PhysicalStoreRepository$PhysicalStorePersistence;", "getBindPhysicalStorePersistence", "(Lcom/carrefour/fid/android/service/data/datastore/PhysicalStoreDataStore;)Lcom/carrefour/fid/android/service/domain/repositories/PhysicalStoreRepository$PhysicalStorePersistence;", "bindPhysicalStorePersistence", "Lcom/carrefour/fid/android/service/domain/interactors/ServiceObserveServiceSelectionUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/r;", "getProvideServiceObserveServiceSelectionUseCase", "(Lcom/carrefour/fid/android/service/domain/interactors/ServiceObserveServiceSelectionUseCase;)Lcom/carrefour/fid/android/domain/interactors/service/r;", "provideServiceObserveServiceSelectionUseCase", "Lcom/carrefour/fid/android/service/domain/interactors/ServiceGetStoreServiceTypeSelectedUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/m;", "getProvideServiceGetStoreServiceTypeSelectedUseCase", "(Lcom/carrefour/fid/android/service/domain/interactors/ServiceGetStoreServiceTypeSelectedUseCase;)Lcom/carrefour/fid/android/domain/interactors/service/m;", "provideServiceGetStoreServiceTypeSelectedUseCase", "Lcom/carrefour/fid/android/service/domain/interactors/ServiceGetSelectedServiceUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/h;", "getBindServiceGetSelectedServiceUseCase", "(Lcom/carrefour/fid/android/service/domain/interactors/ServiceGetSelectedServiceUseCase;)Lcom/carrefour/fid/android/domain/interactors/service/h;", "bindServiceGetSelectedServiceUseCase", "Lcom/carrefour/fid/android/service/domain/interactors/ServiceGetPromiseUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/g;", "getProvideGetPromiseUseCase", "(Lcom/carrefour/fid/android/service/domain/interactors/ServiceGetPromiseUseCase;)Lcom/carrefour/fid/android/domain/interactors/service/g;", "provideGetPromiseUseCase", "Lcom/carrefour/fid/android/service/domain/interactors/ServiceGetMirrorDriveServiceUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/f;", "getBindGetMirrorDrive", "(Lcom/carrefour/fid/android/service/domain/interactors/ServiceGetMirrorDriveServiceUseCase;)Lcom/carrefour/fid/android/domain/interactors/service/f;", "bindGetMirrorDrive", "Lcom/carrefour/fid/android/service/domain/interactors/ServiceSetServiceSelectionUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/s;", "getProvideSetServiceSelectionUseCase", "(Lcom/carrefour/fid/android/service/domain/interactors/ServiceSetServiceSelectionUseCase;)Lcom/carrefour/fid/android/domain/interactors/service/s;", "provideSetServiceSelectionUseCase", "Lcom/carrefour/fid/android/service/domain/interactors/ServiceSwitchToStandardPromiseUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/t;", "getProvideSwitchToStdPromise", "(Lcom/carrefour/fid/android/service/domain/interactors/ServiceSwitchToStandardPromiseUseCase;)Lcom/carrefour/fid/android/domain/interactors/service/t;", "provideSwitchToStdPromise", "Companion", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.service.di.ServiceModule */
public interface ServiceModule {
    @C12579k
    public static final Companion Companion = Companion.$$INSTANCE;

    @C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0007J\"\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\fH\u0007¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/di/ServiceModule$Companion;", "", "Lretrofit2/x;", "retrofit", "Lcom/carrefour/fid/android/service/data/api/service/StoreFacilityService;", "provideStoreFacilityDataSource", "Lcom/carrefour/fid/android/service/data/api/service/FacilityService;", "provideFacilityService", "Lcom/carrefour/fid/android/service/data/api/datasource/StoreFacilityDataSource;", "storeFacilityDataSource", "Lcom/carrefour/fid/android/service/data/api/datasource/FacilityDataSource;", "facilityDataSource", "Lkotlinx/coroutines/o0;", "scope", "Lcom/carrefour/fid/android/service/domain/repositories/StoreFacilityRepository;", "provideFacilityServiceRepository", "<init>", "()V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.service.di.ServiceModule$Companion */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @C10315i
        @C12579k
        public final FacilityService provideFacilityService(@C12579k @C28657a C13092x xVar) {
            Intrinsics.checkNotNullParameter(xVar, "retrofit");
            Object g = xVar.mo30586g(FacilityService.class);
            Intrinsics.checkNotNullExpressionValue(g, "retrofit.create(FacilityService::class.java)");
            return (FacilityService) g;
        }

        @Singleton
        @C10315i
        @C12579k
        public final StoreFacilityRepository provideFacilityServiceRepository(@C12579k StoreFacilityDataSource storeFacilityDataSource, @C12579k FacilityDataSource facilityDataSource, @C28659c @C12579k C12074o0 o0Var) {
            Intrinsics.checkNotNullParameter(storeFacilityDataSource, "storeFacilityDataSource");
            Intrinsics.checkNotNullParameter(facilityDataSource, "facilityDataSource");
            Intrinsics.checkNotNullParameter(o0Var, "scope");
            return new StoreFacilityRepository(storeFacilityDataSource, facilityDataSource, o0Var);
        }

        @C10315i
        @C12579k
        public final StoreFacilityService provideStoreFacilityDataSource(@C12579k @C28657a C13092x xVar) {
            Intrinsics.checkNotNullParameter(xVar, "retrofit");
            Object g = xVar.mo30586g(StoreFacilityService.class);
            Intrinsics.checkNotNullExpressionValue(g, "retrofit.create(StoreFacilityService::class.java)");
            return (StoreFacilityService) g;
        }
    }

    @C10147a
    @C12579k
    C37829a getBindClearFavoritePhysicalStoreUseCase(@C12579k ServiceClearFavoritePhysicalStoreUseCase serviceClearFavoritePhysicalStoreUseCase);

    @C10147a
    @C12579k
    C37811a getBindClearServiceSelectionUseCase(@C12579k ServiceClearServiceSelectionUseCase serviceClearServiceSelectionUseCase);

    @C10147a
    @C12579k
    C37812b getBindFetchDeliveryStoresUseCase(@C12579k ServiceFetchDeliveryStoresUseCase serviceFetchDeliveryStoresUseCase);

    @C10147a
    @C12579k
    C37830b getBindFetchPhysicalStoresUseCase(@C12579k ServiceFetchPhysicalStoresUseCase serviceFetchPhysicalStoresUseCase);

    @C10147a
    @C12579k
    C37815d getBindFetchStoreServicesPictosUseCase(@C12579k ServiceFetchStoreServicesPictosUseCase serviceFetchStoreServicesPictosUseCase);

    @C10147a
    @C12579k
    C37816e getBindGetFacilityByAnabelKeyUseCase(@C12579k ServiceGetFacilityDetailsByAnabelKeyUseCase serviceGetFacilityDetailsByAnabelKeyUseCase);

    @C10147a
    @C12579k
    C37832c getBindGetFavoritePhysicalStoreUseCase(@C12579k ServiceGetFavoritePhysicalStoreUseCase serviceGetFavoritePhysicalStoreUseCase);

    @C10147a
    @C12579k
    C37817f getBindGetMirrorDrive(@C12579k ServiceGetMirrorDriveServiceUseCase serviceGetMirrorDriveServiceUseCase);

    @C10147a
    @C12579k
    C37822j getBindGetServiceSelectedIdUseCase(@C12579k ServiceGetServiceSelectedUseCase serviceGetServiceSelectedUseCase);

    @C10147a
    @C12579k
    C37823k getBindGetServiceSelectionUseCase(@C12579k ServiceGetServiceSelectionUseCase serviceGetServiceSelectionUseCase);

    @C10147a
    @C12579k
    C37824l getBindGetStoreRefUseCase(@C12579k ServiceGetStoreRefUseCase serviceGetStoreRefUseCase);

    @C10147a
    @C12579k
    C37826n getBindIsPreviousSelectedServiceDifferentUseCase(@C12579k ServiceIsPreviousSelectedServiceDifferentUseCase serviceIsPreviousSelectedServiceDifferentUseCase);

    @C10147a
    @C12579k
    C37827o getBindIsSelectedServiceDelivery(@C12579k ServiceIsSelectedServiceDeliveryUseCase serviceIsSelectedServiceDeliveryUseCase);

    @C10147a
    @C12579k
    C37828p getBindIsServiceOpenUseCase(@C12579k ServiceIsServiceOpenUseCase serviceIsServiceOpenUseCase);

    @C10147a
    @C12579k
    C37834q getBindIsServiceSelectedUseCase(@C12579k ServiceIsServiceSelectedUseCase serviceIsServiceSelectedUseCase);

    @C10147a
    @C12579k
    LocationProvider getBindLocationProvider(@C12579k LocationProviderImpl locationProviderImpl);

    @C10147a
    @C12579k
    PhysicalStoreRepository.PhysicalStorePersistence getBindPhysicalStorePersistence(@C12579k PhysicalStoreDataStore physicalStoreDataStore);

    @C10147a
    @C12579k
    C37820h getBindServiceGetSelectedServiceUseCase(@C12579k ServiceGetSelectedServiceUseCase serviceGetSelectedServiceUseCase);

    @C10147a
    @C12579k
    ServiceSelectionRepository.ServicePersistence getBindServicePersistence(@C12579k ServiceDataStore serviceDataStore);

    @C10147a
    @C12579k
    C37833d getBindSetFavoritePhysicalStoreUseCase(@C12579k ServiceSetFavoritePhysicalStoreUseCase serviceSetFavoritePhysicalStoreUseCase);

    @C10147a
    @C12579k
    C37839u getBindUpdateMinOrderAmountUseCase(@C12579k ServiceUpdateMinOrderAmountUseCase serviceUpdateMinOrderAmountUseCase);

    @C10147a
    @C12579k
    C37841v getBindUpdateStoreServiceUseCase(@C12579k ServiceUpdateStoreServiceUseCase serviceUpdateStoreServiceUseCase);

    @C10147a
    @C12579k
    C37818g getProvideGetPromiseUseCase(@C12579k ServiceGetPromiseUseCase serviceGetPromiseUseCase);

    @C10147a
    @C12579k
    C37825m getProvideServiceGetStoreServiceTypeSelectedUseCase(@C12579k ServiceGetStoreServiceTypeSelectedUseCase serviceGetStoreServiceTypeSelectedUseCase);

    @C10147a
    @C12579k
    C37835r getProvideServiceObserveServiceSelectionUseCase(@C12579k ServiceObserveServiceSelectionUseCase serviceObserveServiceSelectionUseCase);

    @C10147a
    @C12579k
    C37836s getProvideSetServiceSelectionUseCase(@C12579k ServiceSetServiceSelectionUseCase serviceSetServiceSelectionUseCase);

    @C10147a
    @C12579k
    C37838t getProvideSwitchToStdPromise(@C12579k ServiceSwitchToStandardPromiseUseCase serviceSwitchToStandardPromiseUseCase);
}
