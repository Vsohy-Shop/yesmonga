package com.carrefour.fid.android.account.data.entities.extentions;

import com.carrefour.fid.android.data.entities.DQEGeoLocationEntity;
import com.carrefour.fid.android.domain.models.LatLon;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11620r;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nDQEGeoLocationEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DQEGeoLocationEntity.kt\ncom/carrefour/fid/android/account/data/entities/extentions/DQEGeoLocationEntityKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,15:1\n1549#2:16\n1620#2,3:17\n*S KotlinDebug\n*F\n+ 1 DQEGeoLocationEntity.kt\ncom/carrefour/fid/android/account/data/entities/extentions/DQEGeoLocationEntityKt\n*L\n8#1:16\n8#1:17,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.account.data.entities.extentions.g */
public final class C13184g {
    @C12579k
    /* renamed from: a */
    public static final List<LatLon> m57152a(@C12579k List<DQEGeoLocationEntity> list) {
        double d;
        Double doubleOrNull;
        Double doubleOrNull2;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterable<DQEGeoLocationEntity> iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (DQEGeoLocationEntity dQEGeoLocationEntity : iterable) {
            String latitude = dQEGeoLocationEntity.getLatitude();
            double d2 = 0.0d;
            if (latitude == null || (doubleOrNull2 = C11620r.toDoubleOrNull(latitude)) == null) {
                d = 0.0d;
            } else {
                d = doubleOrNull2.doubleValue();
            }
            String longitude = dQEGeoLocationEntity.getLongitude();
            if (!(longitude == null || (doubleOrNull = C11620r.toDoubleOrNull(longitude)) == null)) {
                d2 = doubleOrNull.doubleValue();
            }
            arrayList.add(new LatLon(d, d2));
        }
        return arrayList;
    }
}
