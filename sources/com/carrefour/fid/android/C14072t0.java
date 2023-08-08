package com.carrefour.fid.android;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34417m1;

/* renamed from: com.carrefour.fid.android.t0 */
public interface C14072t0 extends C34417m1 {
    String getAddress1();

    ByteString getAddress1Bytes();

    String getAddress2();

    ByteString getAddress2Bytes();

    String getAddress3();

    ByteString getAddress3Bytes();

    String getAddressName();

    ByteString getAddressNameBytes();

    boolean getApproximateAddress();

    String getBuilding();

    ByteString getBuildingBytes();

    String getCategory();

    ByteString getCategoryBytes();

    String getCity();

    ByteString getCityBytes();

    String getCountry();

    ByteString getCountryBytes();

    String getDigitalCode();

    ByteString getDigitalCodeBytes();

    String getFloor();

    ByteString getFloorBytes();

    String getInformation();

    ByteString getInformationBytes();

    String getInterphone();

    ByteString getInterphoneBytes();

    int getKey();

    double getLatitude();

    boolean getLift();

    double getLongitude();

    @Deprecated
    String getPostalCode();

    @Deprecated
    ByteString getPostalCodeBytes();

    String getPostcode();

    ByteString getPostcodeBytes();

    boolean getPreference();
}
