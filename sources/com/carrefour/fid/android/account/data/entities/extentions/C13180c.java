package com.carrefour.fid.android.account.data.entities.extentions;

import com.carrefour.fid.android.bff_data_shared.data.api.entities.AddressUserResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.account.data.entities.extentions.c */
public final class C13180c {
    @C12579k
    /* renamed from: a */
    public static final String m57139a(@C12579k AddressUserResponse addressUserResponse) {
        Intrinsics.checkNotNullParameter(addressUserResponse, "<this>");
        if (addressUserResponse.getAddress2() == null && addressUserResponse.getAddress3() == null) {
            return addressUserResponse.getAddress1();
        }
        String address1 = addressUserResponse.getAddress1();
        String address2 = addressUserResponse.getAddress2();
        String address3 = addressUserResponse.getAddress3();
        return address1 + " " + address2 + " " + address3;
    }

    @C12579k
    /* renamed from: b */
    public static final String m57140b(@C12579k AddressUserResponse addressUserResponse) {
        Intrinsics.checkNotNullParameter(addressUserResponse, "<this>");
        String postcode = addressUserResponse.getPostcode();
        String city = addressUserResponse.getCity();
        return postcode + " " + city;
    }

    /* renamed from: c */
    public static final boolean m57141c(@C12579k AddressUserResponse addressUserResponse, @C12580l AddressUserResponse addressUserResponse2) {
        String str;
        Intrinsics.checkNotNullParameter(addressUserResponse, "<this>");
        String address1 = addressUserResponse.getAddress1();
        if (addressUserResponse2 != null) {
            str = addressUserResponse2.getAddress1();
        } else {
            str = null;
        }
        if (!Intrinsics.areEqual((Object) address1, (Object) str) || !Intrinsics.areEqual((Object) addressUserResponse.getPostcode(), (Object) addressUserResponse2.getPostcode())) {
            return false;
        }
        return true;
    }
}
