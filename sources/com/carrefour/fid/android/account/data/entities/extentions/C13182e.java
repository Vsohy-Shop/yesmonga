package com.carrefour.fid.android.account.data.entities.extentions;

import com.carrefour.fid.android.account.domain.models.DQEAddressDomain;
import com.carrefour.fid.android.data.entities.DQEAddressSuggestionEntity;
import com.carrefour.fid.android.shared.extension.StringKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nDQEAddressesSuggestionsEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DQEAddressesSuggestionsEntity.kt\ncom/carrefour/fid/android/account/data/entities/extentions/DQEAddressesSuggestionsEntityKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,21:1\n1549#2:22\n1620#2,3:23\n*S KotlinDebug\n*F\n+ 1 DQEAddressesSuggestionsEntity.kt\ncom/carrefour/fid/android/account/data/entities/extentions/DQEAddressesSuggestionsEntityKt\n*L\n8#1:22\n8#1:23,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.account.data.entities.extentions.e */
public final class C13182e {
    @C12579k
    /* renamed from: a */
    public static final List<DQEAddressDomain> m57148a(@C12579k List<DQEAddressSuggestionEntity> list) {
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterable<DQEAddressSuggestionEntity> iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (DQEAddressSuggestionEntity dQEAddressSuggestionEntity : iterable) {
            String number = dQEAddressSuggestionEntity.getNumber();
            if (number == null || (str = StringKt.m118933m(number, dQEAddressSuggestionEntity.getStreet())) == null) {
                str = new String();
            }
            String str4 = str;
            String enterAddress = dQEAddressSuggestionEntity.getEnterAddress();
            if (enterAddress == null) {
                enterAddress = new String();
            }
            String str5 = enterAddress;
            String postalCode = dQEAddressSuggestionEntity.getPostalCode();
            if (postalCode == null) {
                str2 = "";
            } else {
                str2 = postalCode;
            }
            String city = dQEAddressSuggestionEntity.getCity();
            if (city == null) {
                str3 = "";
            } else {
                str3 = city;
            }
            String country = dQEAddressSuggestionEntity.getCountry();
            if (country == null) {
                country = "";
            }
            arrayList.add(new DQEAddressDomain(str4, str5, str2, str3, country, 0.0d, 0.0d, new String()));
        }
        return arrayList;
    }
}
