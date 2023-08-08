package com.carrefour.fid.android.account.data.entities.extentions;

import com.carrefour.fid.android.UserAddress;
import com.carrefour.fid.android.UserCard;
import com.carrefour.fid.android.UserInfo;
import com.carrefour.fid.android.UserPhone;
import com.carrefour.fid.android.account.core.type.CivilityTitle;
import com.carrefour.fid.android.account.presentation.models.extension.C13315a;
import com.carrefour.fid.android.domain.models.AddressCategory;
import com.carrefour.fid.android.domain.models.account.AccountInfo;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.account.CivilityTitle;
import com.carrefour.fid.android.domain.models.account.Phone;
import com.carrefour.fid.android.domain.models.account.UserCards;
import com.carrefour.fid.android.shared.constant.C28573o0;
import com.google.protobuf.GeneratedMessageLite;
import com.urbanairship.util.C9650g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nProtoUserInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProtoUserInfo.kt\ncom/carrefour/fid/android/account/data/entities/extentions/ProtoUserInfoKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1549#2:118\n1620#2,3:119\n1549#2:122\n1620#2,3:123\n1549#2:126\n1620#2,3:127\n1549#2:131\n1620#2,3:132\n1549#2:135\n1620#2,3:136\n1549#2:139\n1620#2,3:140\n1#3:130\n*S KotlinDebug\n*F\n+ 1 ProtoUserInfo.kt\ncom/carrefour/fid/android/account/data/entities/extentions/ProtoUserInfoKt\n*L\n24#1:118\n24#1:119,3\n25#1:122\n25#1:123,3\n26#1:126\n26#1:127,3\n77#1:131\n77#1:132,3\n78#1:135\n78#1:136,3\n79#1:139\n79#1:140,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.account.data.entities.extentions.k */
public final class C13188k {

    /* renamed from: com.carrefour.fid.android.account.data.entities.extentions.k$a */
    public /* synthetic */ class C13189a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.account.core.type.CivilityTitle[] r0 = com.carrefour.fid.android.account.core.type.CivilityTitle.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.account.core.type.CivilityTitle r1 = com.carrefour.fid.android.account.core.type.CivilityTitle.MR     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.account.core.type.CivilityTitle r1 = com.carrefour.fid.android.account.core.type.CivilityTitle.MRS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.entities.extentions.C13188k.C13189a.<clinit>():void");
        }
    }

    @C12579k
    /* renamed from: a */
    public static final AccountInfo m57161a(@C12579k UserInfo userInfo) {
        boolean z;
        CivilityTitle civilityTitle;
        Intrinsics.checkNotNullParameter(userInfo, "<this>");
        String email = userInfo.getEmail();
        String firstName = userInfo.getFirstName();
        String lastName = userInfo.getLastName();
        String birthDate = userInfo.getBirthDate();
        String civility = userInfo.getCivility();
        if (civility == null || civility.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            CivilityTitle.C13168a aVar = com.carrefour.fid.android.account.core.type.CivilityTitle.Companion;
            String civility2 = userInfo.getCivility();
            Intrinsics.checkNotNullExpressionValue(civility2, "this.civility");
            civilityTitle = m57163c(aVar.mo31119a(civility2));
        } else {
            civilityTitle = null;
        }
        com.carrefour.fid.android.domain.models.account.CivilityTitle civilityTitle2 = civilityTitle;
        String cgu = userInfo.getCgu();
        long dateOfSave = userInfo.getDateOfSave();
        String lastModification = userInfo.getLastModification();
        List<UserCard> cardsList = userInfo.getCardsList();
        Intrinsics.checkNotNullExpressionValue(cardsList, "this.cardsList");
        Iterable<UserCard> iterable = cardsList;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (UserCard userCard : iterable) {
            Intrinsics.checkNotNullExpressionValue(userCard, "it");
            arrayList.add(m57164d(userCard));
        }
        List<UserAddress> addressesList = userInfo.getAddressesList();
        Intrinsics.checkNotNullExpressionValue(addressesList, "this.addressesList");
        Iterable<UserAddress> iterable2 = addressesList;
        ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(iterable2, 10));
        for (UserAddress userAddress : iterable2) {
            Intrinsics.checkNotNullExpressionValue(userAddress, "it");
            arrayList2.add(m57162b(userAddress));
        }
        List<UserPhone> phonesList = userInfo.getPhonesList();
        Intrinsics.checkNotNullExpressionValue(phonesList, "this.phonesList");
        Iterable iterable3 = phonesList;
        ArrayList arrayList3 = new ArrayList(C10978t.m41495Y(iterable3, 10));
        for (Iterator it = iterable3.iterator(); it.hasNext(); it = it) {
            UserPhone userPhone = (UserPhone) it.next();
            String number = userPhone.getNumber();
            Intrinsics.checkNotNullExpressionValue(number, "it.number");
            arrayList3.add(new Phone(number, userPhone.getPreference()));
        }
        Intrinsics.checkNotNullExpressionValue(email, "email");
        Intrinsics.checkNotNullExpressionValue(firstName, "firstName");
        Intrinsics.checkNotNullExpressionValue(lastName, "lastName");
        Intrinsics.checkNotNullExpressionValue(birthDate, "birthDate");
        Intrinsics.checkNotNullExpressionValue(cgu, C28573o0.f69650b);
        Intrinsics.checkNotNullExpressionValue(lastModification, "lastModification");
        return new AccountInfo(email, firstName, lastName, birthDate, civilityTitle2, cgu, arrayList, arrayList2, arrayList3, dateOfSave, lastModification);
    }

    @C12579k
    /* renamed from: b */
    public static final Address m57162b(@C12579k UserAddress userAddress) {
        Intrinsics.checkNotNullParameter(userAddress, "<this>");
        String country = userAddress.getCountry();
        String city = userAddress.getCity();
        String address1 = userAddress.getAddress1();
        String address2 = userAddress.getAddress2();
        String address3 = userAddress.getAddress3();
        boolean preference = userAddress.getPreference();
        String postcode = userAddress.getPostcode();
        boolean lift = userAddress.getLift();
        String category = userAddress.getCategory();
        Intrinsics.checkNotNullExpressionValue(category, "this.category");
        AddressCategory valueOf = AddressCategory.valueOf(category);
        int key = userAddress.getKey();
        String building = userAddress.getBuilding();
        String str = building;
        String digitalCode = userAddress.getDigitalCode();
        String str2 = building;
        String interphone = userAddress.getInterphone();
        String str3 = postcode;
        String information = userAddress.getInformation();
        String str4 = postcode;
        String addressName = userAddress.getAddressName();
        String str5 = interphone;
        double longitude = userAddress.getLongitude();
        double latitude = userAddress.getLatitude();
        boolean approximateAddress = userAddress.getApproximateAddress();
        Intrinsics.checkNotNullExpressionValue(country, "country");
        Intrinsics.checkNotNullExpressionValue(address3, "address3");
        Intrinsics.checkNotNullExpressionValue(address2, "address2");
        Intrinsics.checkNotNullExpressionValue(city, C9650g.f26444g);
        Intrinsics.checkNotNullExpressionValue(address1, "address1");
        Intrinsics.checkNotNullExpressionValue(str3, "postcode");
        Intrinsics.checkNotNullExpressionValue(digitalCode, "digitalCode");
        Intrinsics.checkNotNullExpressionValue(interphone, "interphone");
        Intrinsics.checkNotNullExpressionValue(str2, "building");
        Intrinsics.checkNotNullExpressionValue(information, "information");
        Intrinsics.checkNotNullExpressionValue(addressName, "addressName");
        return new Address(country, address3, address2, city, address1, str4, digitalCode, str5, lift, str, userAddress.getFloor(), information, addressName, valueOf, key, preference, longitude, latitude, Boolean.valueOf(approximateAddress), (String) null, 524288, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static final com.carrefour.fid.android.domain.models.account.CivilityTitle m57163c(com.carrefour.fid.android.account.core.type.CivilityTitle civilityTitle) {
        int i = C13189a.$EnumSwitchMapping$0[civilityTitle.ordinal()];
        if (i == 1) {
            return com.carrefour.fid.android.domain.models.account.CivilityTitle.MR;
        }
        if (i == 2) {
            return com.carrefour.fid.android.domain.models.account.CivilityTitle.MRS;
        }
        throw new NoWhenBranchMatchedException();
    }

    @C12579k
    /* renamed from: d */
    public static final UserCards m57164d(@C12579k UserCard userCard) {
        Intrinsics.checkNotNullParameter(userCard, "<this>");
        String date = userCard.getDate();
        String num = userCard.getNum();
        String category = userCard.getCategory();
        boolean isSecured = userCard.getIsSecured();
        int key = userCard.getKey();
        Intrinsics.checkNotNullExpressionValue(num, "num");
        Intrinsics.checkNotNullExpressionValue(date, "date");
        Intrinsics.checkNotNullExpressionValue(category, "category");
        return new UserCards(num, date, isSecured, category, key);
    }

    @C12579k
    /* renamed from: e */
    public static final UserAddress m57165e(@C12579k Address address) {
        boolean z;
        Intrinsics.checkNotNullParameter(address, "<this>");
        UserAddress.C13131b S0 = UserAddress.newBuilder().mo30937I0(address.mo116685J()).mo30935G0(address.mo116684I()).mo30976q0(address.mo116677B()).mo30978s0(address.mo116678C()).mo30980v0(address.mo116679D()).mo30966c1(address.mo116695T()).mo30962a1(address.mo116694S()).mo30955W0(address.mo116692Q()).mo30933E0(address.mo116683H().name()).mo30952U0(address.mo116690O()).mo30931B0(address.mo116682G()).mo30939L0(address.mo116686K()).mo30948S0(address.mo116689N());
        String L = address.mo116687L();
        if (L == null) {
            L = "";
        }
        UserAddress.C13131b V0 = S0.mo30941O0(L).mo30944Q0(address.mo116688M()).mo30982x0(address.mo116680E()).mo30956X0(address.mo116693R()).mo30954V0(address.mo116691P());
        Boolean F = address.mo116681F();
        if (F != null) {
            z = F.booleanValue();
        } else {
            z = false;
        }
        GeneratedMessageLite B = V0.mo30984z0(z).mo100473g();
        Intrinsics.checkNotNullExpressionValue(B, "newBuilder()\n    .setCou…ss ?: false)\n    .build()");
        return (UserAddress) B;
    }

    @C12579k
    /* renamed from: f */
    public static final UserCard m57166f(@C12579k UserCards userCards) {
        Intrinsics.checkNotNullParameter(userCards, "<this>");
        GeneratedMessageLite B = UserCard.newBuilder().mo31000Z(userCards.mo116761i()).mo31004d0(userCards.mo116763k()).mo30998V(userCards.mo116759h()).mo31002b0(userCards.mo116764l()).mo31003c0(userCards.mo116762j()).mo100473g();
        Intrinsics.checkNotNullExpressionValue(B, "newBuilder()\n    .setDat…ey(this.key)\n    .build()");
        return (UserCard) B;
    }

    @C12579k
    /* renamed from: g */
    public static final UserInfo m57167g(@C12579k AccountInfo accountInfo) {
        String str;
        com.carrefour.fid.android.account.core.type.CivilityTitle l;
        Intrinsics.checkNotNullParameter(accountInfo, "<this>");
        UserInfo.C13137b M0 = UserInfo.newBuilder().mo31078Y0(accountInfo.mo116663r()).mo31082a1(accountInfo.mo116664s()).mo31089e1(accountInfo.mo116667u()).mo31060M0(accountInfo.mo116659n());
        com.carrefour.fid.android.domain.models.account.CivilityTitle p = accountInfo.mo116661p();
        if (p == null || (l = C13315a.m57653l(p)) == null) {
            str = null;
        } else {
            str = l.getValue();
        }
        UserInfo.C13137b c1 = M0.mo31070T0(str).mo31066R0(accountInfo.mo116660o()).mo31076X0(accountInfo.mo116662q()).mo31086c1(accountInfo.mo116665t());
        Iterable<UserCards> w = accountInfo.mo116669w();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(w, 10));
        for (UserCards f : w) {
            arrayList.add(m57166f(f));
        }
        c1.mo31073V(arrayList);
        Iterable<Address> v = accountInfo.mo116668v();
        ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(v, 10));
        for (Address e : v) {
            arrayList2.add(m57165e(e));
        }
        c1.mo31071U(arrayList2);
        Iterable<Phone> x = accountInfo.mo116671x();
        ArrayList arrayList3 = new ArrayList(C10978t.m41495Y(x, 10));
        for (Phone h : x) {
            arrayList3.add(m57168h(h));
        }
        c1.mo31079Z(arrayList3);
        GeneratedMessageLite B = c1.mo100473g();
        Intrinsics.checkNotNullExpressionValue(B, "builder.build()");
        return (UserInfo) B;
    }

    @C12579k
    /* renamed from: h */
    public static final UserPhone m57168h(@C12579k Phone phone) {
        Intrinsics.checkNotNullParameter(phone, "<this>");
        GeneratedMessageLite B = UserPhone.newBuilder().mo31115S(phone.mo116741e()).mo31117U(phone.mo116743f()).mo100473g();
        Intrinsics.checkNotNullExpressionValue(B, "newBuilder()\n    .setNum….preference)\n    .build()");
        return (UserPhone) B;
    }
}
