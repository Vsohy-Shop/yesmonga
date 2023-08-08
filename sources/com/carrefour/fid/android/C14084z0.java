package com.carrefour.fid.android;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34417m1;
import java.util.List;

/* renamed from: com.carrefour.fid.android.z0 */
public interface C14084z0 extends C34417m1 {
    UserAddress getAddresses(int i);

    int getAddressesCount();

    List<UserAddress> getAddressesList();

    String getBirthDate();

    ByteString getBirthDateBytes();

    UserCard getCards(int i);

    int getCardsCount();

    List<UserCard> getCardsList();

    String getCgu();

    ByteString getCguBytes();

    String getCivility();

    ByteString getCivilityBytes();

    UserConsent getConsents(int i);

    int getConsentsCount();

    List<UserConsent> getConsentsList();

    long getDateOfSave();

    String getEmail();

    ByteString getEmailBytes();

    String getFirstName();

    ByteString getFirstNameBytes();

    String getLastModification();

    ByteString getLastModificationBytes();

    String getLastName();

    ByteString getLastNameBytes();

    UserPhone getPhones(int i);

    int getPhonesCount();

    List<UserPhone> getPhonesList();
}
