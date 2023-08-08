package com.carrefour.fid.android.data.entities.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.OHMDeliveryAddress;
import com.carrefour.fid.android.domain.models.C38119q;
import com.carrefour.fid.android.shared.base.C28486g;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.entities.mapper.o0 */
public final class C36513o0 extends C28486g<OHMDeliveryAddress, C38119q> {

    /* renamed from: b */
    public static final int f90206b = 0;

    @C12580l
    /* renamed from: d */
    public C38119q mo72340a(@C12580l OHMDeliveryAddress oHMDeliveryAddress) {
        String str;
        String str2;
        String str3;
        if (oHMDeliveryAddress == null) {
            return null;
        }
        String streetAddressOne = oHMDeliveryAddress.getStreetAddressOne();
        String streetAddressTwo = oHMDeliveryAddress.getStreetAddressTwo();
        if (streetAddressTwo == null) {
            str = "";
        } else {
            str = streetAddressTwo;
        }
        String streetAddressThree = oHMDeliveryAddress.getStreetAddressThree();
        if (streetAddressThree == null) {
            str2 = "";
        } else {
            str2 = streetAddressThree;
        }
        String cityCode = oHMDeliveryAddress.getCityCode();
        if (cityCode == null) {
            str3 = "";
        } else {
            str3 = cityCode;
        }
        return new C38119q(streetAddressOne, str, str2, str3, oHMDeliveryAddress.getCity());
    }
}
