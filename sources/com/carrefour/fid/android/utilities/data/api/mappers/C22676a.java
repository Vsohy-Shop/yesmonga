package com.carrefour.fid.android.utilities.data.api.mappers;

import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPickupPoint;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTimeRange;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffWeekPattern;
import com.carrefour.fid.android.domain.models.pickup.C38080a;
import com.carrefour.fid.android.domain.models.pickup.C38082c;
import com.carrefour.fid.android.domain.models.pickup.C38083d;
import com.carrefour.fid.android.shared.extension.C28782t;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPickupPointMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickupPointMapper.kt\ncom/carrefour/fid/android/utilities/data/api/mappers/PickupPointMapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n1549#2:50\n1620#2,3:51\n1549#2:54\n1620#2,3:55\n*S KotlinDebug\n*F\n+ 1 PickupPointMapper.kt\ncom/carrefour/fid/android/utilities/data/api/mappers/PickupPointMapperKt\n*L\n18#1:50\n18#1:51,3\n45#1:54\n45#1:55,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.utilities.data.api.mappers.a */
public final class C22676a {
    @C12580l
    /* renamed from: a */
    public static final C38080a m102695a(@C12579k BffPickupPoint bffPickupPoint) {
        String str;
        Double d;
        Double d2;
        List list;
        String str2;
        float f;
        String str3;
        String str4;
        String str5;
        boolean z;
        Intrinsics.checkNotNullParameter(bffPickupPoint, "<this>");
        List list2 = null;
        if (bffPickupPoint.getLatitude() == null || bffPickupPoint.getLongitude() == null) {
            return null;
        }
        String pickupPointName = bffPickupPoint.getPickupPointName();
        if (pickupPointName == null) {
            str = "";
        } else {
            str = pickupPointName;
        }
        BigDecimal latitude = bffPickupPoint.getLatitude();
        if (latitude != null) {
            d = Double.valueOf(latitude.doubleValue());
        } else {
            d = null;
        }
        double h = C28782t.m119111h(d);
        BigDecimal longitude = bffPickupPoint.getLongitude();
        if (longitude != null) {
            d2 = Double.valueOf(longitude.doubleValue());
        } else {
            d2 = null;
        }
        double h2 = C28782t.m119111h(d2);
        List<BffWeekPattern> openingWeekPattern = bffPickupPoint.getOpeningWeekPattern();
        if (openingWeekPattern != null) {
            Iterable<BffWeekPattern> iterable = openingWeekPattern;
            list2 = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (BffWeekPattern b : iterable) {
                list2.add(m102696b(b));
            }
        }
        if (list2 == null) {
            list = CollectionsKt__CollectionsKt.m40441E();
        } else {
            list = list2;
        }
        String pickupPointProviderId = bffPickupPoint.getPickupPointProviderId();
        if (pickupPointProviderId == null) {
            str2 = "";
        } else {
            str2 = pickupPointProviderId;
        }
        BigDecimal distance = bffPickupPoint.getDistance();
        if (distance != null) {
            f = distance.floatValue();
        } else {
            f = 0.0f;
        }
        float f2 = f;
        String streetAddressOne = bffPickupPoint.getStreetAddressOne();
        if (streetAddressOne == null) {
            str3 = "";
        } else {
            str3 = streetAddressOne;
        }
        String streetAddressTwo = bffPickupPoint.getStreetAddressTwo();
        if (streetAddressTwo == null) {
            str4 = "";
        } else {
            str4 = streetAddressTwo;
        }
        String postalCode = bffPickupPoint.getPostalCode();
        if (postalCode == null) {
            str5 = "";
        } else {
            str5 = postalCode;
        }
        Boolean isCarrefour = bffPickupPoint.isCarrefour();
        if (isCarrefour != null) {
            z = isCarrefour.booleanValue();
        } else {
            z = true;
        }
        return new C38080a(str, h, h2, list, str2, f2, str3, str4, str5, z);
    }

    /* renamed from: b */
    public static final C38083d m102696b(BffWeekPattern bffWeekPattern) {
        String str;
        String str2;
        List<C38082c> list;
        List<C38082c> list2;
        List<C38082c> list3;
        List<C38082c> list4;
        List<C38082c> list5;
        List<C38082c> list6;
        List<C38082c> list7;
        String begDate = bffWeekPattern.getBegDate();
        if (begDate == null) {
            str = "";
        } else {
            str = begDate;
        }
        String endDate = bffWeekPattern.getEndDate();
        if (endDate == null) {
            str2 = "";
        } else {
            str2 = endDate;
        }
        List<BffTimeRange> mondayTimeRanges = bffWeekPattern.getMondayTimeRanges();
        List<C38082c> list8 = null;
        if (mondayTimeRanges != null) {
            list = m102697c(mondayTimeRanges);
        } else {
            list = null;
        }
        if (list == null) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        List<C38082c> list9 = list;
        List<BffTimeRange> tuesdayTimeRanges = bffWeekPattern.getTuesdayTimeRanges();
        if (tuesdayTimeRanges != null) {
            list2 = m102697c(tuesdayTimeRanges);
        } else {
            list2 = null;
        }
        if (list2 == null) {
            list2 = CollectionsKt__CollectionsKt.m40441E();
        }
        List<C38082c> list10 = list2;
        List<BffTimeRange> wednesdayTimeRanges = bffWeekPattern.getWednesdayTimeRanges();
        if (wednesdayTimeRanges != null) {
            list3 = m102697c(wednesdayTimeRanges);
        } else {
            list3 = null;
        }
        if (list3 == null) {
            list3 = CollectionsKt__CollectionsKt.m40441E();
        }
        List<C38082c> list11 = list3;
        List<BffTimeRange> tuesdayTimeRanges2 = bffWeekPattern.getTuesdayTimeRanges();
        if (tuesdayTimeRanges2 != null) {
            list4 = m102697c(tuesdayTimeRanges2);
        } else {
            list4 = null;
        }
        if (list4 == null) {
            list4 = CollectionsKt__CollectionsKt.m40441E();
        }
        List<C38082c> list12 = list4;
        List<BffTimeRange> fridayTimeRanges = bffWeekPattern.getFridayTimeRanges();
        if (fridayTimeRanges != null) {
            list5 = m102697c(fridayTimeRanges);
        } else {
            list5 = null;
        }
        if (list5 == null) {
            list5 = CollectionsKt__CollectionsKt.m40441E();
        }
        List<C38082c> list13 = list5;
        List<BffTimeRange> saturdayTimeRanges = bffWeekPattern.getSaturdayTimeRanges();
        if (saturdayTimeRanges != null) {
            list6 = m102697c(saturdayTimeRanges);
        } else {
            list6 = null;
        }
        if (list6 == null) {
            list6 = CollectionsKt__CollectionsKt.m40441E();
        }
        List<C38082c> list14 = list6;
        List<BffTimeRange> sundayTimeRanges = bffWeekPattern.getSundayTimeRanges();
        if (sundayTimeRanges != null) {
            list8 = m102697c(sundayTimeRanges);
        }
        if (list8 == null) {
            list7 = CollectionsKt__CollectionsKt.m40441E();
        } else {
            list7 = list8;
        }
        return new C38083d(str, str2, list9, list10, list11, list12, list13, list14, list7);
    }

    /* renamed from: c */
    public static final List<C38082c> m102697c(List<BffTimeRange> list) {
        Iterable<BffTimeRange> iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (BffTimeRange bffTimeRange : iterable) {
            arrayList.add(new C38082c(bffTimeRange.getBegTime(), bffTimeRange.getEndTime()));
        }
        return arrayList;
    }
}
