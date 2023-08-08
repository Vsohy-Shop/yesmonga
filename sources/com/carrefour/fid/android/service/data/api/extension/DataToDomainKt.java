package com.carrefour.fid.android.service.data.api.extension;

import androidx.profileinstaller.C20022q;
import com.carrefour.fid.android.bff_data_shared.data.api.mapper.BffSharedMapperKt;
import com.carrefour.fid.android.domain.models.service.models.C38147b;
import com.carrefour.fid.android.domain.models.service.models.C38151d;
import com.carrefour.fid.android.domain.models.service.models.C38154g;
import com.carrefour.fid.android.domain.models.service.models.C38157h;
import com.carrefour.fid.android.domain.models.service.models.C38161j;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.domain.models.service.models.C38166m;
import com.carrefour.fid.android.domain.models.service.models.C38167n;
import com.carrefour.fid.android.domain.models.service.models.C38168o;
import com.carrefour.fid.android.domain.models.service.models.DeliveryFee;
import com.carrefour.fid.android.domain.models.service.models.StoreAddress;
import com.carrefour.fid.android.domain.models.service.models.StoreCoordinates;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import com.carrefour.fid.android.domain.models.service.models.StoreServiceType;
import com.carrefour.fid.android.service.data.api.entities.Address;
import com.carrefour.fid.android.service.data.api.entities.DayTimeRangeResponse;
import com.carrefour.fid.android.service.data.api.entities.DeliveryFeeResponse;
import com.carrefour.fid.android.service.data.api.entities.DetailedFacilityResponse;
import com.carrefour.fid.android.service.data.api.entities.OpeningExceptionalPatternResponse;
import com.carrefour.fid.android.service.data.api.entities.OpeningPatternResponse;
import com.carrefour.fid.android.service.data.api.entities.ServicePictoResponse;
import com.carrefour.fid.android.service.data.api.entities.StoreAddressResponse;
import com.carrefour.fid.android.service.data.api.entities.StoreCoordinatesResponse;
import com.carrefour.fid.android.service.data.api.entities.StoreFacilityResponse;
import com.carrefour.fid.android.service.data.api.entities.StoreResponse;
import com.carrefour.fid.android.service.data.api.entities.StoreServiceResponse;
import com.carrefour.fid.android.service.data.api.entities.StoreServiceWithUrlResponse;
import com.carrefour.fid.android.service.data.api.entities.StoreServicesPictosResponse;
import com.carrefour.fid.android.service.data.api.entities.UpdateStoreResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.C11076d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000p\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0004H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0006*\u00020\u0005H\u0000\u001a\f\u0010\u0003\u001a\u00020\b*\u00020\u0007H\u0002\u001a\f\u0010\u0003\u001a\u00020\n*\u00020\tH\u0000\u001a\f\u0010\u0003\u001a\u00020\f*\u00020\u000bH\u0002\u001a\f\u0010\u0003\u001a\u00020\u000e*\u00020\rH\u0002\u001a\f\u0010\u0003\u001a\u00020\u0010*\u00020\u000fH\u0002\u001a\f\u0010\u0003\u001a\u00020\u0012*\u00020\u0011H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0014*\u00020\u0013H\u0002\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0016*\u00020\u0015H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0016*\u00020\u0001H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0016*\u00020\u0017H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0019*\u00020\u0018H\u0002\u001a\f\u0010\u0003\u001a\u00020\u001b*\u00020\u001aH\u0002¨\u0006\u001c"}, mo22516d2 = {"", "Lcom/carrefour/fid/android/service/data/api/entities/StoreResponse;", "Lcom/carrefour/fid/android/domain/models/service/models/m;", "toDomain", "Lcom/carrefour/fid/android/service/data/api/entities/StoreFacilityResponse;", "Lcom/carrefour/fid/android/service/data/api/entities/StoreServicesPictosResponse;", "Lcom/carrefour/fid/android/domain/models/service/models/o;", "Lcom/carrefour/fid/android/service/data/api/entities/StoreServiceWithUrlResponse;", "Lcom/carrefour/fid/android/domain/models/service/models/n;", "Lcom/carrefour/fid/android/service/data/api/entities/StoreServiceResponse;", "Lcom/carrefour/fid/android/domain/models/service/models/StoreService;", "Lcom/carrefour/fid/android/service/data/api/entities/StoreAddressResponse;", "Lcom/carrefour/fid/android/domain/models/service/models/StoreAddress;", "Lcom/carrefour/fid/android/service/data/api/entities/StoreCoordinatesResponse;", "Lcom/carrefour/fid/android/domain/models/service/models/StoreCoordinates;", "Lcom/carrefour/fid/android/service/data/api/entities/OpeningPatternResponse;", "Lcom/carrefour/fid/android/domain/models/service/models/h;", "Lcom/carrefour/fid/android/service/data/api/entities/DayTimeRangeResponse;", "Lcom/carrefour/fid/android/domain/models/service/models/b;", "Lcom/carrefour/fid/android/service/data/api/entities/OpeningExceptionalPatternResponse;", "Lcom/carrefour/fid/android/domain/models/service/models/g;", "Lcom/carrefour/fid/android/service/data/api/entities/UpdateStoreResponse;", "Lcom/carrefour/fid/android/domain/models/service/models/l;", "Lcom/carrefour/fid/android/service/data/api/entities/DetailedFacilityResponse;", "Lcom/carrefour/fid/android/service/data/api/entities/Address;", "Lcom/carrefour/fid/android/domain/models/service/models/d;", "Lcom/carrefour/fid/android/service/data/api/entities/DeliveryFeeResponse;", "Lcom/carrefour/fid/android/domain/models/service/models/DeliveryFee;", "service_release"}, mo22517k = 2, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDataToDomain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataToDomain.kt\ncom/carrefour/fid/android/service/data/api/extension/DataToDomainKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,247:1\n1549#2:248\n1620#2,2:249\n1549#2:252\n1620#2,3:253\n1549#2:256\n1620#2,3:257\n1549#2:260\n1620#2,3:261\n1622#2:264\n1549#2:265\n1620#2,3:266\n1549#2:269\n1620#2,3:270\n1549#2:273\n1620#2,3:274\n1549#2:277\n1620#2,3:278\n1549#2:281\n1620#2,3:282\n1549#2:285\n1620#2,3:286\n1549#2:289\n1620#2,3:290\n1549#2:293\n1620#2,3:294\n1549#2:297\n1620#2,3:298\n1549#2:301\n1620#2,3:302\n1549#2:305\n1620#2,3:306\n1549#2:309\n1620#2,3:310\n1549#2:313\n1620#2,3:314\n1549#2:317\n1620#2,3:318\n1549#2:321\n1620#2,3:322\n1549#2:325\n1620#2,3:326\n1#3:251\n*S KotlinDebug\n*F\n+ 1 DataToDomain.kt\ncom/carrefour/fid/android/service/data/api/extension/DataToDomainKt\n*L\n36#1:248\n36#1:249,2\n46#1:252\n46#1:253,3\n49#1:256\n49#1:257,3\n52#1:260\n52#1:261,3\n36#1:264\n72#1:265\n72#1:266,3\n114#1:269\n114#1:270,3\n140#1:273\n140#1:274,3\n141#1:277\n141#1:278,3\n142#1:281\n142#1:282,3\n143#1:285\n143#1:286,3\n144#1:289\n144#1:290,3\n145#1:293\n145#1:294,3\n146#1:297\n146#1:298,3\n163#1:301\n163#1:302,3\n181#1:305\n181#1:306,3\n182#1:309\n182#1:310,3\n183#1:313\n183#1:314,3\n201#1:317\n201#1:318,3\n202#1:321\n202#1:322,3\n205#1:325\n205#1:326,3\n*E\n"})
public final class DataToDomainKt {

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.service.data.api.entities.FeeType[] r0 = com.carrefour.fid.android.service.data.api.entities.FeeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.service.data.api.entities.FeeType r1 = com.carrefour.fid.android.service.data.api.entities.FeeType.Amount     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.service.data.api.entities.FeeType r1 = com.carrefour.fid.android.service.data.api.entities.FeeType.Pregnancy     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.data.api.extension.DataToDomainKt.WhenMappings.<clinit>():void");
        }
    }

    @C12579k
    public static final C38166m toDomain(@C12580l List<StoreResponse> list) {
        List list2;
        if (list != null) {
            Iterable iterable = list;
            list2 = new ArrayList(C10978t.m41495Y(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                StoreResponse storeResponse = (StoreResponse) it.next();
                String name = storeResponse.getName();
                String banner = storeResponse.getBanner();
                String phoneNumber = storeResponse.getPhoneNumber();
                String format = storeResponse.getFormat();
                String type = storeResponse.getType();
                List<Boolean> passDays = storeResponse.getPassDays();
                String id = storeResponse.getId();
                StoreAddressResponse address = storeResponse.getAddress();
                StoreAddress domain = address != null ? toDomain(address) : null;
                Iterable<OpeningPatternResponse> openingPattern = storeResponse.getOpeningPattern();
                ArrayList arrayList = new ArrayList(C10978t.m41495Y(openingPattern, 10));
                for (OpeningPatternResponse domain2 : openingPattern) {
                    arrayList.add(toDomain(domain2));
                }
                Iterable<OpeningExceptionalPatternResponse> openingExceptionalPattern = storeResponse.getOpeningExceptionalPattern();
                ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(openingExceptionalPattern, 10));
                for (OpeningExceptionalPatternResponse domain3 : openingExceptionalPattern) {
                    arrayList2.add(toDomain(domain3));
                }
                Iterable<StoreServiceResponse> storeServices = storeResponse.getStoreServices();
                Iterator it2 = it;
                ArrayList arrayList3 = new ArrayList(C10978t.m41495Y(storeServices, 10));
                for (StoreServiceResponse domain4 : storeServices) {
                    arrayList3.add(toDomain(domain4));
                }
                list2.add(new C38163l(name, banner, phoneNumber, format, type, (List) passDays, id, domain, (List) arrayList, (List) arrayList2, (List) arrayList3, storeResponse.getGln(), storeResponse.getAnabelKey(), storeResponse.getDistance(), storeResponse.getMinOrderAmount(), storeResponse.getPaymentOnSiteActivated(), storeResponse.isLoyaltyActivated(), (List) null, 131072, (DefaultConstructorMarker) null));
                it = it2;
            }
        } else {
            list2 = CollectionsKt__CollectionsKt.m40441E();
        }
        return new C38166m(list2);
    }

    @C12579k
    public static final C38166m toDomain(@C12579k StoreFacilityResponse storeFacilityResponse) {
        Intrinsics.checkNotNullParameter(storeFacilityResponse, "<this>");
        return toDomain(storeFacilityResponse.getStoreResponseList());
    }

    @C12579k
    public static final C38168o toDomain(@C12579k StoreServicesPictosResponse storeServicesPictosResponse) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(storeServicesPictosResponse, "<this>");
        List<StoreServiceWithUrlResponse> servicesPictos = storeServicesPictosResponse.getServicesPictos();
        if (servicesPictos != null) {
            Iterable<StoreServiceWithUrlResponse> iterable = servicesPictos;
            arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (StoreServiceWithUrlResponse domain : iterable) {
                arrayList.add(toDomain(domain));
            }
        } else {
            arrayList = null;
        }
        return new C38168o(arrayList, storeServicesPictosResponse.getCount());
    }

    private static final C38167n toDomain(StoreServiceWithUrlResponse storeServiceWithUrlResponse) {
        String id = storeServiceWithUrlResponse.getId();
        String label = storeServiceWithUrlResponse.getLabel();
        String description = storeServiceWithUrlResponse.getDescription();
        String code = storeServiceWithUrlResponse.getCode();
        ServicePictoResponse picto = storeServiceWithUrlResponse.getPicto();
        String url = picto != null ? picto.getUrl() : null;
        if (url == null) {
            url = "";
        }
        return new C38167n(id, label, description, code, new C38161j(url));
    }

    @C12579k
    public static final StoreService toDomain(@C12579k StoreServiceResponse storeServiceResponse) {
        ArrayList arrayList;
        String str;
        Intrinsics.checkNotNullParameter(storeServiceResponse, "<this>");
        String id = storeServiceResponse.getId();
        String name = storeServiceResponse.getName();
        String label = storeServiceResponse.getLabel();
        List<Boolean> passDays = storeServiceResponse.getPassDays();
        String wording = storeServiceResponse.getWording();
        String description = storeServiceResponse.getDescription();
        String weight = storeServiceResponse.getWeight();
        String category = storeServiceResponse.getCategory();
        String lowerCase = storeServiceResponse.getStatus().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        boolean z = false;
        boolean contains$default = StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "open", false, 2, (Object) null);
        String type = storeServiceResponse.getType();
        String format = storeServiceResponse.getFormat();
        String wlecService = storeServiceResponse.getWlecService();
        String facilityServiceId = storeServiceResponse.getFacilityServiceId();
        String minefiCode = storeServiceResponse.getMinefiCode();
        String metiReference = storeServiceResponse.getMetiReference();
        String openingDate = storeServiceResponse.getOpeningDate();
        String url = storeServiceResponse.getUrl();
        String minOrderAmount = storeServiceResponse.getMinOrderAmount();
        StoreServiceType storeServiceTypeFromId = BffSharedMapperKt.getStoreServiceTypeFromId(storeServiceResponse.getId());
        boolean paymentOnSiteActivated = storeServiceResponse.getPaymentOnSiteActivated();
        boolean isLoyaltyActivated = storeServiceResponse.isLoyaltyActivated();
        boolean yieldEligible = storeServiceResponse.getYieldEligible();
        boolean returnableShoppingBag = storeServiceResponse.getReturnableShoppingBag();
        Boolean isExpress = storeServiceResponse.isExpress();
        boolean booleanValue = isExpress != null ? isExpress.booleanValue() : false;
        Boolean isMirror = storeServiceResponse.isMirror();
        if (isMirror != null) {
            z = isMirror.booleanValue();
        }
        boolean z2 = z;
        List<DeliveryFeeResponse> deliveryFees = storeServiceResponse.getDeliveryFees();
        if (deliveryFees != null) {
            Iterable<DeliveryFeeResponse> iterable = deliveryFees;
            str = minefiCode;
            ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (DeliveryFeeResponse domain : iterable) {
                arrayList2.add(toDomain(domain));
            }
            arrayList = arrayList2;
        } else {
            str = minefiCode;
            arrayList = CollectionsKt__CollectionsKt.m40441E();
        }
        return new StoreService(id, name, label, passDays, wording, description, weight, category, contains$default, type, format, wlecService, facilityServiceId, str, metiReference, openingDate, url, minOrderAmount, paymentOnSiteActivated, isLoyaltyActivated, returnableShoppingBag, yieldEligible, storeServiceTypeFromId, booleanValue, z2, arrayList);
    }

    private static final StoreAddress toDomain(StoreAddressResponse storeAddressResponse) {
        StoreCoordinatesResponse coordinatesPojo = storeAddressResponse.getCoordinatesPojo();
        return new StoreAddress(coordinatesPojo != null ? toDomain(coordinatesPojo) : null, storeAddressResponse.getAdressOne(), storeAddressResponse.getAdressTwo(), storeAddressResponse.getCityName(), storeAddressResponse.getPostcode());
    }

    private static final StoreCoordinates toDomain(StoreCoordinatesResponse storeCoordinatesResponse) {
        return new StoreCoordinates(storeCoordinatesResponse.getLatitude(), storeCoordinatesResponse.getLongitude());
    }

    private static final C38157h toDomain(OpeningPatternResponse openingPatternResponse) {
        int patternId = openingPatternResponse.getPatternId();
        String beginDate = openingPatternResponse.getBeginDate();
        String endDate = openingPatternResponse.getEndDate();
        Iterable<DayTimeRangeResponse> mondayTimeRange = openingPatternResponse.getMondayTimeRange();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(mondayTimeRange, 10));
        for (DayTimeRangeResponse domain : mondayTimeRange) {
            arrayList.add(toDomain(domain));
        }
        Iterable<DayTimeRangeResponse> tuesayTimeRange = openingPatternResponse.getTuesayTimeRange();
        ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(tuesayTimeRange, 10));
        for (DayTimeRangeResponse domain2 : tuesayTimeRange) {
            arrayList2.add(toDomain(domain2));
        }
        Iterable<DayTimeRangeResponse> wednesdayTimeRange = openingPatternResponse.getWednesdayTimeRange();
        ArrayList arrayList3 = new ArrayList(C10978t.m41495Y(wednesdayTimeRange, 10));
        for (DayTimeRangeResponse domain3 : wednesdayTimeRange) {
            arrayList3.add(toDomain(domain3));
        }
        Iterable<DayTimeRangeResponse> thursdayTimeRange = openingPatternResponse.getThursdayTimeRange();
        ArrayList arrayList4 = new ArrayList(C10978t.m41495Y(thursdayTimeRange, 10));
        for (DayTimeRangeResponse domain4 : thursdayTimeRange) {
            arrayList4.add(toDomain(domain4));
        }
        Iterable<DayTimeRangeResponse> fridayTimeRange = openingPatternResponse.getFridayTimeRange();
        ArrayList arrayList5 = new ArrayList(C10978t.m41495Y(fridayTimeRange, 10));
        for (DayTimeRangeResponse domain5 : fridayTimeRange) {
            arrayList5.add(toDomain(domain5));
        }
        Iterable<DayTimeRangeResponse> saturdayTimeRange = openingPatternResponse.getSaturdayTimeRange();
        ArrayList arrayList6 = new ArrayList(C10978t.m41495Y(saturdayTimeRange, 10));
        for (DayTimeRangeResponse domain6 : saturdayTimeRange) {
            arrayList6.add(toDomain(domain6));
        }
        Iterable<DayTimeRangeResponse> sundayTimeRange = openingPatternResponse.getSundayTimeRange();
        ArrayList arrayList7 = new ArrayList(C10978t.m41495Y(sundayTimeRange, 10));
        for (DayTimeRangeResponse domain7 : sundayTimeRange) {
            arrayList7.add(toDomain(domain7));
        }
        return new C38157h(patternId, beginDate, endDate, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7);
    }

    private static final C38147b toDomain(DayTimeRangeResponse dayTimeRangeResponse) {
        return new C38147b(dayTimeRangeResponse.getBeginTime(), dayTimeRangeResponse.getEndTime());
    }

    private static final C38154g toDomain(OpeningExceptionalPatternResponse openingExceptionalPatternResponse) {
        String description = openingExceptionalPatternResponse.getDescription();
        String statusCode = openingExceptionalPatternResponse.getStatusCode();
        String typeCode = openingExceptionalPatternResponse.getTypeCode();
        String date = openingExceptionalPatternResponse.getDate();
        Iterable<DayTimeRangeResponse> dayTimeRange = openingExceptionalPatternResponse.getDayTimeRange();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(dayTimeRange, 10));
        for (DayTimeRangeResponse domain : dayTimeRange) {
            arrayList.add(toDomain(domain));
        }
        return new C38154g(description, statusCode, typeCode, date, arrayList);
    }

    @C12580l
    public static final C38163l toDomain(@C12579k UpdateStoreResponse updateStoreResponse) {
        Intrinsics.checkNotNullParameter(updateStoreResponse, "<this>");
        StoreResponse storeResponse = updateStoreResponse.getStoreResponse();
        if (storeResponse != null) {
            return toDomain(storeResponse);
        }
        return null;
    }

    private static final C38163l toDomain(StoreResponse storeResponse) {
        String name = storeResponse.getName();
        String banner = storeResponse.getBanner();
        String phoneNumber = storeResponse.getPhoneNumber();
        String format = storeResponse.getFormat();
        String type = storeResponse.getType();
        List<Boolean> passDays = storeResponse.getPassDays();
        String id = storeResponse.getId();
        StoreAddressResponse address = storeResponse.getAddress();
        StoreAddress domain = address != null ? toDomain(address) : null;
        Iterable<OpeningPatternResponse> openingPattern = storeResponse.getOpeningPattern();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(openingPattern, 10));
        for (OpeningPatternResponse domain2 : openingPattern) {
            arrayList.add(toDomain(domain2));
        }
        Iterable<OpeningExceptionalPatternResponse> openingExceptionalPattern = storeResponse.getOpeningExceptionalPattern();
        ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(openingExceptionalPattern, 10));
        for (OpeningExceptionalPatternResponse domain3 : openingExceptionalPattern) {
            arrayList2.add(toDomain(domain3));
        }
        Iterable<StoreServiceResponse> storeServices = storeResponse.getStoreServices();
        ArrayList arrayList3 = new ArrayList(C10978t.m41495Y(storeServices, 10));
        for (StoreServiceResponse domain4 : storeServices) {
            arrayList3.add(toDomain(domain4));
        }
        return new C38163l(name, banner, phoneNumber, format, type, (List) passDays, id, domain, (List) arrayList, (List) arrayList2, (List) arrayList3, storeResponse.getGln(), storeResponse.getAnabelKey(), storeResponse.getDistance(), storeResponse.getMinOrderAmount(), storeResponse.getPaymentOnSiteActivated(), false, (List) null, (int) C20022q.C20025c.f51280k, (DefaultConstructorMarker) null);
    }

    @C12579k
    public static final C38163l toDomain(@C12579k DetailedFacilityResponse detailedFacilityResponse) {
        StoreAddress storeAddress;
        Intrinsics.checkNotNullParameter(detailedFacilityResponse, "<this>");
        if (detailedFacilityResponse.getDetailedFacility() != null) {
            String id = detailedFacilityResponse.getDetailedFacility().getId();
            String name = detailedFacilityResponse.getDetailedFacility().getName();
            String format = detailedFacilityResponse.getDetailedFacility().getFormat();
            String gln = detailedFacilityResponse.getDetailedFacility().getGln();
            String phoneNumber = detailedFacilityResponse.getDetailedFacility().getPhoneNumber();
            List<Boolean> passDays = detailedFacilityResponse.getDetailedFacility().getPassDays();
            Iterable<OpeningPatternResponse> openingPattern = detailedFacilityResponse.getDetailedFacility().getOpeningPattern();
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(openingPattern, 10));
            for (OpeningPatternResponse domain : openingPattern) {
                arrayList.add(toDomain(domain));
            }
            Iterable<OpeningExceptionalPatternResponse> openingExceptionalPattern = detailedFacilityResponse.getDetailedFacility().getOpeningExceptionalPattern();
            ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(openingExceptionalPattern, 10));
            for (OpeningExceptionalPatternResponse domain2 : openingExceptionalPattern) {
                arrayList2.add(toDomain(domain2));
            }
            StoreAddressResponse address = detailedFacilityResponse.getDetailedFacility().getAddress();
            if (address == null || (storeAddress = toDomain(address)) == null) {
                storeAddress = new StoreAddress((StoreCoordinates) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
            }
            StoreAddress storeAddress2 = storeAddress;
            String banner = detailedFacilityResponse.getDetailedFacility().getBanner();
            Iterable<StoreServiceResponse> storeServices = detailedFacilityResponse.getDetailedFacility().getStoreServices();
            ArrayList arrayList3 = new ArrayList(C10978t.m41495Y(storeServices, 10));
            for (StoreServiceResponse domain3 : storeServices) {
                arrayList3.add(toDomain(domain3));
            }
            return new C38163l(name, banner, phoneNumber, format, detailedFacilityResponse.getDetailedFacility().getType(), (List) passDays, id, storeAddress2, (List) arrayList, (List) arrayList2, (List) arrayList3, gln, detailedFacilityResponse.getDetailedFacility().getAnabelKey(), detailedFacilityResponse.getDetailedFacility().getDistance(), detailedFacilityResponse.getDetailedFacility().getMinOrderAmount(), detailedFacilityResponse.getDetailedFacility().getPaymentOnSiteActivated(), detailedFacilityResponse.getDetailedFacility().isLoyaltyActivated(), (List) null, 131072, (DefaultConstructorMarker) null);
        }
        throw new IllegalStateException("No DetailedFacility field in DetailedFacilityResponse!");
    }

    private static final C38151d toDomain(Address address) {
        return new C38151d(address.getStreetAddressOne(), address.getStreetAddressTwo(), address.getCity());
    }

    private static final DeliveryFee toDomain(DeliveryFeeResponse deliveryFeeResponse) {
        DeliveryFee.FeeType feeType;
        DeliveryFee.FeeAmount feeAmount;
        DeliveryFee.FeeAmount feeAmount2;
        int i = WhenMappings.$EnumSwitchMapping$0[deliveryFeeResponse.getFeeType().ordinal()];
        if (i == 1) {
            feeType = DeliveryFee.FeeType.Amount;
        } else if (i == 2) {
            feeType = DeliveryFee.FeeType.Pregnancy;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        DeliveryFeeResponse.FeeAmount minAmount = deliveryFeeResponse.getMinAmount();
        DeliveryFee.FeeAmount feeAmount3 = null;
        if (minAmount != null) {
            feeAmount = new DeliveryFee.FeeAmount(minAmount.getUnscaledAmount(), minAmount.getScale(), minAmount.getCurrency());
        } else {
            feeAmount = null;
        }
        DeliveryFeeResponse.FeeAmount maxAmount = deliveryFeeResponse.getMaxAmount();
        if (maxAmount != null) {
            feeAmount2 = new DeliveryFee.FeeAmount(maxAmount.getUnscaledAmount(), maxAmount.getScale(), maxAmount.getCurrency());
        } else {
            feeAmount2 = null;
        }
        DeliveryFeeResponse.FeeAmount feesAmount = deliveryFeeResponse.getFeesAmount();
        if (feesAmount != null) {
            feeAmount3 = new DeliveryFee.FeeAmount(feesAmount.getUnscaledAmount(), feesAmount.getScale(), feesAmount.getCurrency());
        }
        return new DeliveryFee(feeType, feeAmount, feeAmount2, feeAmount3);
    }
}
