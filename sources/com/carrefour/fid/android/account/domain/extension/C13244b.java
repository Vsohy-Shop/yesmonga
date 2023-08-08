package com.carrefour.fid.android.account.domain.extension;

import com.carrefour.fid.android.account.domain.models.DQEAddressDomain;
import com.carrefour.fid.android.account.presentation.models.DQEAddressModel;
import com.carrefour.fid.android.checkout.data.api.datasources.PaymentDataSource;
import com.carrefour.fid.android.shared.constant.C28561l1;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.account.domain.extension.b */
public final class C13244b {
    /* renamed from: a */
    public static final boolean m57380a(@C12580l DQEAddressDomain dQEAddressDomain) {
        String str;
        if (dQEAddressDomain != null) {
            str = dQEAddressDomain.getDqeCodeDetail();
        } else {
            str = null;
        }
        if (CollectionsKt___CollectionsKt.m40558R1(CollectionsKt__CollectionsKt.m40448L(C28561l1.f69523p, "20"), str)) {
            return false;
        }
        CollectionsKt___CollectionsKt.m40558R1(CollectionsKt__CollectionsKt.m40448L("21", PaymentDataSource.f101593c, "23", "24"), str);
        return true;
    }

    /* renamed from: b */
    public static final boolean m57381b(@C12580l DQEAddressDomain dQEAddressDomain) {
        String str;
        Iterable L = CollectionsKt__CollectionsKt.m40448L(C28561l1.f69523p, "20", "21", PaymentDataSource.f101593c, "23", "24");
        if (dQEAddressDomain != null) {
            str = dQEAddressDomain.getDqeCodeDetail();
        } else {
            str = null;
        }
        return CollectionsKt___CollectionsKt.m40558R1(L, str);
    }

    @C12579k
    /* renamed from: c */
    public static final DQEAddressModel m57382c(@C12579k DQEAddressDomain dQEAddressDomain) {
        Intrinsics.checkNotNullParameter(dQEAddressDomain, "<this>");
        return new DQEAddressModel(dQEAddressDomain.getAddress(), dQEAddressDomain.getPostalCode(), dQEAddressDomain.getCity(), dQEAddressDomain.getCountry(), dQEAddressDomain.getLatitude(), dQEAddressDomain.getLongitude(), dQEAddressDomain.getDqeCodeDetail());
    }
}
