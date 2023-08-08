package com.carrefour.fid.android.cms.domain.extension;

import com.carrefour.fid.android.cms.data.entities.FuelPricePojo;
import com.carrefour.fid.android.cms.data.entities.GasStation;
import com.carrefour.fid.android.cms.data.entities.StorePetrolInfoPojo;
import com.carrefour.fid.android.cms.domain.models.FuelPriceDomain;
import com.carrefour.fid.android.cms.domain.models.GasStationDomain;
import com.carrefour.fid.android.cms.domain.models.StorePetrolInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, mo22516d2 = {"toDomain", "Lcom/carrefour/fid/android/cms/domain/models/StorePetrolInfo;", "Lcom/carrefour/fid/android/cms/data/entities/StorePetrolInfoPojo;", "cms_release"}, mo22517k = 2, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nStorePetrolInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StorePetrolInfo.kt\ncom/carrefour/fid/android/cms/domain/extension/StorePetrolInfoKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,26:1\n1549#2:27\n1620#2,3:28\n*S KotlinDebug\n*F\n+ 1 StorePetrolInfo.kt\ncom/carrefour/fid/android/cms/domain/extension/StorePetrolInfoKt\n*L\n14#1:27\n14#1:28,3\n*E\n"})
public final class StorePetrolInfoKt {
    @C12579k
    public static final StorePetrolInfo toDomain(@C12579k StorePetrolInfoPojo storePetrolInfoPojo) {
        GasStationDomain gasStationDomain;
        List list;
        Intrinsics.checkNotNullParameter(storePetrolInfoPojo, "<this>");
        long id = storePetrolInfoPojo.getId();
        GasStation gasStation = storePetrolInfoPojo.getGasStation();
        if (gasStation != null) {
            String idGasStation = gasStation.getIdGasStation();
            List<FuelPricePojo> fuelPrices = gasStation.getFuelPrices();
            if (fuelPrices != null) {
                Iterable<FuelPricePojo> iterable = fuelPrices;
                list = new ArrayList(C10978t.m41495Y(iterable, 10));
                for (FuelPricePojo fuelPricePojo : iterable) {
                    list.add(new FuelPriceDomain(fuelPricePojo.getName(), fuelPricePojo.getCode(), fuelPricePojo.getFuelId(), fuelPricePojo.getPrice(), fuelPricePojo.getUpdateDate()));
                }
            } else {
                list = CollectionsKt__CollectionsKt.m40441E();
            }
            gasStationDomain = new GasStationDomain(idGasStation, list);
        } else {
            gasStationDomain = null;
        }
        return new StorePetrolInfo(id, gasStationDomain);
    }
}
