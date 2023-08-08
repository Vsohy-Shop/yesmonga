package com.google.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34417m1;
import java.util.List;

/* renamed from: com.google.type.q */
public interface C34622q extends C34417m1 {
    String getAddressLines(int i);

    ByteString getAddressLinesBytes(int i);

    int getAddressLinesCount();

    List<String> getAddressLinesList();

    String getAdministrativeArea();

    ByteString getAdministrativeAreaBytes();

    String getLanguageCode();

    ByteString getLanguageCodeBytes();

    String getLocality();

    ByteString getLocalityBytes();

    String getOrganization();

    ByteString getOrganizationBytes();

    String getPostalCode();

    ByteString getPostalCodeBytes();

    String getRecipients(int i);

    ByteString getRecipientsBytes(int i);

    int getRecipientsCount();

    List<String> getRecipientsList();

    String getRegionCode();

    ByteString getRegionCodeBytes();

    int getRevision();

    String getSortingCode();

    ByteString getSortingCodeBytes();

    String getSublocality();

    ByteString getSublocalityBytes();
}
