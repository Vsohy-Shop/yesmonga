package com.carrefour.fid.android.account.data.entities.extentions;

import com.carrefour.fid.android.account.core.type.CivilityTitle;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.ProfileResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.UserCardsResponse;
import com.carrefour.fid.android.domain.models.account.UserCards;
import com.carrefour.fid.android.shared.extension.StringKt;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nProfileResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfileResponse.kt\ncom/carrefour/fid/android/account/data/entities/extentions/ProfileResponseKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,62:1\n288#2,2:63\n1864#2,3:65\n1864#2,3:68\n*S KotlinDebug\n*F\n+ 1 ProfileResponse.kt\ncom/carrefour/fid/android/account/data/entities/extentions/ProfileResponseKt\n*L\n14#1:63,2\n29#1:65,3\n48#1:68,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.account.data.entities.extentions.j */
public final class C13187j {
    @C12580l
    /* renamed from: a */
    public static final UserCardsResponse m57156a(@C12579k ProfileResponse profileResponse) {
        Intrinsics.checkNotNullParameter(profileResponse, "<this>");
        return m57158c(profileResponse.getListCards());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.AddressUserResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.AddressUserResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.AddressUserResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.AddressUserResponse} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.carrefour.fid.android.bff_data_shared.data.api.entities.AddressUserResponse m57157b(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.bff_data_shared.data.api.entities.ProfileResponse r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.List r5 = r5.getListAddress()
            r0 = 0
            if (r5 == 0) goto L_0x003d
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x0012:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x003b
            java.lang.Object r1 = r5.next()
            r2 = r1
            com.carrefour.fid.android.bff_data_shared.data.api.entities.AddressUserResponse r2 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.AddressUserResponse) r2
            java.lang.String r3 = r2.getCategory()
            com.carrefour.fid.android.domain.models.AddressCategory r4 = com.carrefour.fid.android.domain.models.AddressCategory.DELIVERY
            java.lang.String r4 = r4.name()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r3 == 0) goto L_0x0037
            boolean r2 = r2.getPreference()
            if (r2 == 0) goto L_0x0037
            r2 = 1
            goto L_0x0038
        L_0x0037:
            r2 = 0
        L_0x0038:
            if (r2 == 0) goto L_0x0012
            r0 = r1
        L_0x003b:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.AddressUserResponse r0 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.AddressUserResponse) r0
        L_0x003d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.entities.extentions.C13187j.m57157b(com.carrefour.fid.android.bff_data_shared.data.api.entities.ProfileResponse):com.carrefour.fid.android.bff_data_shared.data.api.entities.AddressUserResponse");
    }

    @C12580l
    /* renamed from: c */
    public static final UserCardsResponse m57158c(@C12580l List<UserCardsResponse> list) {
        boolean z;
        Collection collection = list;
        int i = 0;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        Object w2 = CollectionsKt___CollectionsKt.m40706w2(list);
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            UserCardsResponse userCardsResponse = (UserCardsResponse) next;
            if (i > 0 && StringKt.m118928h(userCardsResponse.getDate()) > StringKt.m118928h(((UserCardsResponse) w2).getDate())) {
                w2 = userCardsResponse;
            }
            i = i2;
        }
        return (UserCardsResponse) w2;
    }

    @C12580l
    /* renamed from: d */
    public static final UserCards m57159d(@C12580l List<UserCards> list) {
        boolean z;
        Collection collection = list;
        int i = 0;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        Object w2 = CollectionsKt___CollectionsKt.m40706w2(list);
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            UserCards userCards = (UserCards) next;
            if (i > 0 && StringKt.m118928h(userCards.mo116761i()) > StringKt.m118928h(((UserCards) w2).mo116761i())) {
                w2 = userCards;
            }
            i = i2;
        }
        return (UserCards) w2;
    }

    /* renamed from: e */
    public static final boolean m57160e(@C12579k ProfileResponse profileResponse) {
        Intrinsics.checkNotNullParameter(profileResponse, "<this>");
        if (Intrinsics.areEqual((Object) profileResponse.getCivility(), (Object) CivilityTitle.MR.getValue())) {
            return true;
        }
        return false;
    }
}
