package com.carrefour.fid.android.account.data.entities.extentions;

import com.carrefour.fid.android.bff_data_shared.data.api.entities.AddressUserResponse;
import com.carrefour.fid.android.domain.models.account.Address;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.account.data.entities.extentions.a */
public final class C13178a {
    @C12579k
    /* renamed from: a */
    public static final AddressUserResponse m57137a(@C12579k Address address) {
        Intrinsics.checkNotNullParameter(address, "<this>");
        String B = address.mo116677B();
        String C = address.mo116678C();
        String D = address.mo116679D();
        String I = address.mo116684I();
        String S = address.mo116694S();
        String name = address.mo116683H().name();
        return new AddressUserResponse(address.mo116685J(), I, B, C, D, (String) null, address.mo116695T(), S, false, name, address.mo116690O(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Double) null, (Double) null, (Boolean) null, (String) null, 4192544, (DefaultConstructorMarker) null);
    }
}
