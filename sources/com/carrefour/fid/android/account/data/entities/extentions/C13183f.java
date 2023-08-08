package com.carrefour.fid.android.account.data.entities.extentions;

import com.carrefour.fid.android.account.domain.models.DQEAddressDomain;
import com.carrefour.fid.android.data.entities.DQEAddressVerificationEntity;
import com.carrefour.fid.android.domain.models.LatLon;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11620r;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nDQEAddressesVerificationEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DQEAddressesVerificationEntity.kt\ncom/carrefour/fid/android/account/data/entities/extentions/DQEAddressesVerificationEntityKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,31:1\n1549#2:32\n1620#2,3:33\n*S KotlinDebug\n*F\n+ 1 DQEAddressesVerificationEntity.kt\ncom/carrefour/fid/android/account/data/entities/extentions/DQEAddressesVerificationEntityKt\n*L\n9#1:32\n9#1:33,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.account.data.entities.extentions.f */
public final class C13183f {
    @C12579k
    /* renamed from: a */
    public static final DQEAddressDomain m57149a(@C12579k DQEAddressVerificationEntity dQEAddressVerificationEntity) {
        String str;
        String str2;
        String str3;
        double d;
        String str4;
        Double doubleOrNull;
        Double doubleOrNull2;
        Intrinsics.checkNotNullParameter(dQEAddressVerificationEntity, "<this>");
        String address = dQEAddressVerificationEntity.getAddress();
        if (address == null) {
            str = "";
        } else {
            str = address;
        }
        String str5 = new String();
        String postalCode = dQEAddressVerificationEntity.getPostalCode();
        if (postalCode == null) {
            str2 = "";
        } else {
            str2 = postalCode;
        }
        String city = dQEAddressVerificationEntity.getCity();
        if (city == null) {
            str3 = "";
        } else {
            str3 = city;
        }
        String latitude = dQEAddressVerificationEntity.getLatitude();
        double d2 = 0.0d;
        if (latitude == null || (doubleOrNull2 = C11620r.toDoubleOrNull(latitude)) == null) {
            d = 0.0d;
        } else {
            d = doubleOrNull2.doubleValue();
        }
        String longitude = dQEAddressVerificationEntity.getLongitude();
        if (!(longitude == null || (doubleOrNull = C11620r.toDoubleOrNull(longitude)) == null)) {
            d2 = doubleOrNull.doubleValue();
        }
        double d3 = d2;
        String dqeCodeDetail = dQEAddressVerificationEntity.getDqeCodeDetail();
        if (dqeCodeDetail == null) {
            dqeCodeDetail = "";
        }
        String country = dQEAddressVerificationEntity.getCountry();
        if (country == null) {
            str4 = "";
        } else {
            str4 = country;
        }
        return new DQEAddressDomain(str, str5, str2, str3, str4, d, d3, dqeCodeDetail);
    }

    @C12579k
    /* renamed from: b */
    public static final List<DQEAddressDomain> m57150b(@C12579k List<DQEAddressVerificationEntity> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterable<DQEAddressVerificationEntity> iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (DQEAddressVerificationEntity a : iterable) {
            arrayList.add(m57149a(a));
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: c */
    public static final LatLon m57151c(@C12579k DQEAddressVerificationEntity dQEAddressVerificationEntity) {
        double d;
        Double doubleOrNull;
        Double doubleOrNull2;
        Intrinsics.checkNotNullParameter(dQEAddressVerificationEntity, "<this>");
        String latitude = dQEAddressVerificationEntity.getLatitude();
        double d2 = 0.0d;
        if (latitude == null || (doubleOrNull2 = C11620r.toDoubleOrNull(latitude)) == null) {
            d = 0.0d;
        } else {
            d = doubleOrNull2.doubleValue();
        }
        String longitude = dQEAddressVerificationEntity.getLongitude();
        if (!(longitude == null || (doubleOrNull = C11620r.toDoubleOrNull(longitude)) == null)) {
            d2 = doubleOrNull.doubleValue();
        }
        return new LatLon(d, d2);
    }
}
