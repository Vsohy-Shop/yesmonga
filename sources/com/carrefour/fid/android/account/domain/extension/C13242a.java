package com.carrefour.fid.android.account.domain.extension;

import com.carrefour.fid.android.account.domain.models.DQEAddressDomain;
import com.carrefour.fid.android.account.presentation.models.extension.C13315a;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.AccountResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.AddressUserResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.PhonesUserResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.ProfileInfoResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.ProfileResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.UserCardsResponse;
import com.carrefour.fid.android.domain.models.AddressCategory;
import com.carrefour.fid.android.domain.models.account.AccountInfo;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.account.CivilityTitle;
import com.carrefour.fid.android.domain.models.account.Phone;
import com.carrefour.fid.android.domain.models.account.UserCards;
import com.carrefour.fid.android.shared.extension.C28782t;
import com.carrefour.fid.android.shared.extension.StringKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAccountInfoDomain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountInfoDomain.kt\ncom/carrefour/fid/android/account/domain/extension/AccountInfoDomainKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n1549#2:173\n1620#2,3:174\n1549#2:177\n1620#2,3:178\n1549#2:181\n1620#2,3:182\n1864#2,3:185\n1549#2:188\n1620#2,3:189\n1549#2:192\n1620#2,3:193\n1549#2:196\n1620#2,3:197\n1#3:200\n*S KotlinDebug\n*F\n+ 1 AccountInfoDomain.kt\ncom/carrefour/fid/android/account/domain/extension/AccountInfoDomainKt\n*L\n32#1:173\n32#1:174,3\n33#1:177\n33#1:178,3\n35#1:181\n35#1:182,3\n78#1:185,3\n138#1:188\n138#1:189,3\n139#1:192\n139#1:193,3\n140#1:196\n140#1:197,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.account.domain.extension.a */
public final class C13242a {

    /* renamed from: com.carrefour.fid.android.account.domain.extension.a$a */
    public /* synthetic */ class C13243a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.domain.models.AddressCategory[] r0 = com.carrefour.fid.android.domain.models.AddressCategory.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.AddressCategory r1 = com.carrefour.fid.android.domain.models.AddressCategory.BILLING     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.domain.models.AddressCategory r1 = com.carrefour.fid.android.domain.models.AddressCategory.DELIVERY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.domain.extension.C13242a.C13243a.<clinit>():void");
        }
    }

    @C12579k
    /* renamed from: a */
    public static final Address m57371a(@C12579k Address address, @C12580l DQEAddressDomain dQEAddressDomain) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        double d;
        double d2;
        String str9;
        Intrinsics.checkNotNullParameter(address, "<this>");
        int i = C13243a.$EnumSwitchMapping$0[address.mo116683H().ordinal()];
        if (i == 1) {
            if (dQEAddressDomain == null || (str = dQEAddressDomain.getCountry()) == null) {
                str = address.mo116685J();
            }
            String str10 = str;
            if (dQEAddressDomain == null || (str2 = dQEAddressDomain.getCity()) == null) {
                str2 = address.mo116684I();
            }
            String str11 = str2;
            if (dQEAddressDomain == null || (str3 = dQEAddressDomain.getAddress()) == null) {
                str3 = address.mo116677B();
            }
            String str12 = str3;
            if (dQEAddressDomain == null || (str4 = dQEAddressDomain.getPostalCode()) == null) {
                str4 = address.mo116694S();
            }
            return Address.m155867v(address, str10, (String) null, (String) null, str11, str12, str4, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (AddressCategory) null, 0, true, 0.0d, 0.0d, Boolean.valueOf(C13244b.m57380a(dQEAddressDomain)), (String) null, 753606, (Object) null);
        } else if (i == 2) {
            if (dQEAddressDomain == null || (str5 = dQEAddressDomain.getCountry()) == null) {
                str5 = address.mo116685J();
            }
            String str13 = str5;
            if (dQEAddressDomain == null || (str6 = dQEAddressDomain.getCity()) == null) {
                str6 = address.mo116684I();
            }
            String str14 = str6;
            if (dQEAddressDomain == null || (str7 = dQEAddressDomain.getAddress()) == null) {
                str7 = address.mo116677B();
            }
            String str15 = str7;
            if (dQEAddressDomain == null || (str8 = dQEAddressDomain.getPostalCode()) == null) {
                str8 = address.mo116694S();
            }
            String str16 = str8;
            boolean Q = address.mo116692Q();
            AddressCategory addressCategory = AddressCategory.DELIVERY;
            String N = address.mo116689N();
            String G = address.mo116682G();
            String K = address.mo116686K();
            String L = address.mo116687L();
            String M = address.mo116688M();
            if (dQEAddressDomain != null) {
                d = dQEAddressDomain.getLongitude();
            } else {
                d = address.mo116693R();
            }
            double d3 = d;
            if (dQEAddressDomain != null) {
                d2 = dQEAddressDomain.getLatitude();
            } else {
                d2 = address.mo116691P();
            }
            double d4 = d2;
            boolean a = C13244b.m57380a(dQEAddressDomain);
            if (dQEAddressDomain == null || (str9 = dQEAddressDomain.getDqeCodeDetail()) == null) {
                str9 = address.mo116696U();
            }
            return Address.m155867v(address, str13, (String) null, (String) null, str14, str15, str16, K, N, Q, G, L, M, (String) null, addressCategory, 0, true, d3, d4, Boolean.valueOf(a), str9, 20486, (Object) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @C12580l
    /* renamed from: b */
    public static final UserCards m57372b(@C12580l List<UserCards> list) {
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

    @C12579k
    /* renamed from: c */
    public static final AccountInfo m57373c(@C12580l AccountResponse accountResponse) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        CivilityTitle civilityTitle;
        String str9;
        String str10;
        List list;
        List list2;
        List list3;
        long j;
        String str11;
        ProfileInfoResponse profileInfoResponse;
        ProfileInfoResponse profileInfoResponse2;
        ProfileResponse accountInfoPojo;
        List<PhonesUserResponse> listPhones;
        ProfileInfoResponse profileInfoResponse3;
        ProfileResponse accountInfoPojo2;
        List<AddressUserResponse> listAddress;
        ProfileInfoResponse profileInfoResponse4;
        ProfileResponse accountInfoPojo3;
        List<UserCardsResponse> listCards;
        ProfileInfoResponse profileInfoResponse5;
        ProfileResponse accountInfoPojo4;
        ProfileInfoResponse profileInfoResponse6;
        ProfileResponse accountInfoPojo5;
        String civility;
        ProfileInfoResponse profileInfoResponse7;
        ProfileResponse accountInfoPojo6;
        ProfileInfoResponse profileInfoResponse8;
        ProfileResponse accountInfoPojo7;
        ProfileInfoResponse profileInfoResponse9;
        ProfileResponse accountInfoPojo8;
        ProfileInfoResponse profileInfoResponse10;
        ProfileResponse accountInfoPojo9;
        String str12 = null;
        if (accountResponse == null || (profileInfoResponse10 = accountResponse.getProfileInfoResponse()) == null || (accountInfoPojo9 = profileInfoResponse10.getAccountInfoPojo()) == null) {
            str = null;
        } else {
            str = accountInfoPojo9.getEmail();
        }
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        if (accountResponse == null || (profileInfoResponse9 = accountResponse.getProfileInfoResponse()) == null || (accountInfoPojo8 = profileInfoResponse9.getAccountInfoPojo()) == null) {
            str3 = null;
        } else {
            str3 = accountInfoPojo8.getFirstName();
        }
        if (str3 == null) {
            str4 = "";
        } else {
            str4 = str3;
        }
        if (accountResponse == null || (profileInfoResponse8 = accountResponse.getProfileInfoResponse()) == null || (accountInfoPojo7 = profileInfoResponse8.getAccountInfoPojo()) == null) {
            str5 = null;
        } else {
            str5 = accountInfoPojo7.getLastName();
        }
        if (str5 == null) {
            str6 = "";
        } else {
            str6 = str5;
        }
        if (accountResponse == null || (profileInfoResponse7 = accountResponse.getProfileInfoResponse()) == null || (accountInfoPojo6 = profileInfoResponse7.getAccountInfoPojo()) == null) {
            str7 = null;
        } else {
            str7 = accountInfoPojo6.getBirthdate();
        }
        if (str7 == null) {
            str8 = "";
        } else {
            str8 = str7;
        }
        if (accountResponse == null || (profileInfoResponse6 = accountResponse.getProfileInfoResponse()) == null || (accountInfoPojo5 = profileInfoResponse6.getAccountInfoPojo()) == null || (civility = accountInfoPojo5.getCivility()) == null) {
            civilityTitle = null;
        } else {
            civilityTitle = C13315a.m57652k(com.carrefour.fid.android.account.core.type.CivilityTitle.Companion.mo31119a(civility));
        }
        if (accountResponse == null || (profileInfoResponse5 = accountResponse.getProfileInfoResponse()) == null || (accountInfoPojo4 = profileInfoResponse5.getAccountInfoPojo()) == null) {
            str9 = null;
        } else {
            str9 = accountInfoPojo4.getCgu();
        }
        if (str9 == null) {
            str10 = "";
        } else {
            str10 = str9;
        }
        if (accountResponse == null || (profileInfoResponse4 = accountResponse.getProfileInfoResponse()) == null || (accountInfoPojo3 = profileInfoResponse4.getAccountInfoPojo()) == null || (listCards = accountInfoPojo3.getListCards()) == null) {
            list = null;
        } else {
            Iterable<UserCardsResponse> iterable = listCards;
            list = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (UserCardsResponse i : iterable) {
                list.add(m57379i(i));
            }
        }
        if (list == null) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        if (accountResponse == null || (profileInfoResponse3 = accountResponse.getProfileInfoResponse()) == null || (accountInfoPojo2 = profileInfoResponse3.getAccountInfoPojo()) == null || (listAddress = accountInfoPojo2.getListAddress()) == null) {
            list2 = null;
        } else {
            Iterable<AddressUserResponse> iterable2 = listAddress;
            list2 = new ArrayList(C10978t.m41495Y(iterable2, 10));
            for (AddressUserResponse d : iterable2) {
                list2.add(m57374d(d));
            }
        }
        if (list2 == null) {
            list2 = CollectionsKt__CollectionsKt.m40441E();
        }
        if (accountResponse == null || (profileInfoResponse2 = accountResponse.getProfileInfoResponse()) == null || (accountInfoPojo = profileInfoResponse2.getAccountInfoPojo()) == null || (listPhones = accountInfoPojo.getListPhones()) == null) {
            list3 = null;
        } else {
            Iterable<PhonesUserResponse> iterable3 = listPhones;
            list3 = new ArrayList(C10978t.m41495Y(iterable3, 10));
            for (PhonesUserResponse phonesUserResponse : iterable3) {
                list3.add(new Phone(phonesUserResponse.getNum(), phonesUserResponse.getPreference()));
            }
        }
        if (list3 == null) {
            list3 = CollectionsKt__CollectionsKt.m40441E();
        }
        if (accountResponse != null) {
            j = accountResponse.getDateOfSave();
        } else {
            j = 0;
        }
        if (!(accountResponse == null || (profileInfoResponse = accountResponse.getProfileInfoResponse()) == null)) {
            str12 = profileInfoResponse.getLastModification();
        }
        if (str12 == null) {
            str11 = "";
        } else {
            str11 = str12;
        }
        return new AccountInfo(str2, str4, str6, str8, civilityTitle, str10, list, list2, list3, j, str11);
    }

    @C12579k
    /* renamed from: d */
    public static final Address m57374d(@C12579k AddressUserResponse addressUserResponse) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Intrinsics.checkNotNullParameter(addressUserResponse, "<this>");
        String country = addressUserResponse.getCountry();
        String address1 = addressUserResponse.getAddress1();
        String address2 = addressUserResponse.getAddress2();
        if (address2 == null) {
            str = "";
        } else {
            str = address2;
        }
        String address3 = addressUserResponse.getAddress3();
        if (address3 == null) {
            str2 = "";
        } else {
            str2 = address3;
        }
        String city = addressUserResponse.getCity();
        boolean preference = addressUserResponse.getPreference();
        String postcode = addressUserResponse.getPostcode();
        boolean lift = addressUserResponse.getLift();
        AddressCategory valueOf = AddressCategory.valueOf(addressUserResponse.getCategory());
        int key = addressUserResponse.getKey();
        String building = addressUserResponse.getBuilding();
        if (building == null) {
            str3 = "";
        } else {
            str3 = building;
        }
        String digitalCode = addressUserResponse.getDigitalCode();
        if (digitalCode == null) {
            str4 = "";
        } else {
            str4 = digitalCode;
        }
        String interphone = addressUserResponse.getInterphone();
        if (interphone == null) {
            str5 = "";
        } else {
            str5 = interphone;
        }
        String floor = addressUserResponse.getFloor();
        String information = addressUserResponse.getInformation();
        if (information == null) {
            str6 = "";
        } else {
            str6 = information;
        }
        String addressName = addressUserResponse.getAddressName();
        if (addressName == null) {
            str7 = "";
        } else {
            str7 = addressName;
        }
        return new Address(country, str2, str, city, address1, postcode, str4, str5, lift, str3, floor, str6, str7, valueOf, key, preference, C28782t.m119111h(addressUserResponse.getLongitude()), C28782t.m119111h(addressUserResponse.getLatitude()), (Boolean) null, (String) null, 786432, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: e */
    public static final AccountResponse m57375e(@C12579k AccountInfo accountInfo) {
        String str;
        com.carrefour.fid.android.account.core.type.CivilityTitle l;
        Intrinsics.checkNotNullParameter(accountInfo, "<this>");
        long q = accountInfo.mo116662q();
        String t = accountInfo.mo116665t();
        String r = accountInfo.mo116663r();
        String s = accountInfo.mo116664s();
        String u = accountInfo.mo116667u();
        String n = accountInfo.mo116659n();
        CivilityTitle p = accountInfo.mo116661p();
        if (p == null || (l = C13315a.m57653l(p)) == null || (str = l.getValue()) == null) {
            str = new String();
        }
        String str2 = str;
        String o = accountInfo.mo116660o();
        Iterable<UserCards> w = accountInfo.mo116669w();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(w, 10));
        for (UserCards h : w) {
            arrayList.add(m57378h(h));
        }
        Iterable<Address> v = accountInfo.mo116668v();
        ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(v, 10));
        for (Address f : v) {
            arrayList2.add(m57376f(f));
        }
        Iterable<Phone> x = accountInfo.mo116671x();
        ArrayList arrayList3 = new ArrayList(C10978t.m41495Y(x, 10));
        for (Phone g : x) {
            arrayList3.add(m57377g(g));
        }
        return new AccountResponse(new ProfileInfoResponse(new ProfileResponse(r, s, u, n, str2, o, arrayList, arrayList2, arrayList3), t), q);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00bd  */
    @org.jetbrains.annotations.C12579k
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.carrefour.fid.android.bff_data_shared.data.api.entities.AddressUserResponse m57376f(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.account.Address r27) {
        /*
            java.lang.String r0 = "<this>"
            r1 = r27
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r3 = r27.mo116685J()
            java.lang.String r4 = r27.mo116684I()
            java.lang.String r5 = r27.mo116677B()
            boolean r9 = r27.mo116695T()
            java.lang.String r10 = r27.mo116694S()
            com.carrefour.fid.android.domain.models.AddressCategory r0 = r27.mo116683H()
            java.lang.String r12 = r0.name()
            boolean r11 = r27.mo116692Q()
            java.lang.String r0 = r27.mo116682G()
            int r2 = r0.length()
            r6 = 0
            r7 = 1
            if (r2 <= 0) goto L_0x0035
            r2 = r7
            goto L_0x0036
        L_0x0035:
            r2 = r6
        L_0x0036:
            r8 = 0
            if (r2 == 0) goto L_0x003b
            r15 = r0
            goto L_0x003c
        L_0x003b:
            r15 = r8
        L_0x003c:
            java.lang.String r0 = r27.mo116686K()
            int r2 = r0.length()
            if (r2 <= 0) goto L_0x0048
            r2 = r7
            goto L_0x0049
        L_0x0048:
            r2 = r6
        L_0x0049:
            if (r2 == 0) goto L_0x004e
            r16 = r0
            goto L_0x0050
        L_0x004e:
            r16 = r8
        L_0x0050:
            java.lang.String r0 = r27.mo116689N()
            int r2 = r0.length()
            if (r2 <= 0) goto L_0x005c
            r2 = r7
            goto L_0x005d
        L_0x005c:
            r2 = r6
        L_0x005d:
            if (r2 == 0) goto L_0x0061
            r14 = r0
            goto L_0x0062
        L_0x0061:
            r14 = r8
        L_0x0062:
            java.lang.String r0 = r27.mo116687L()
            if (r0 == 0) goto L_0x0076
            int r2 = r0.length()
            if (r2 <= 0) goto L_0x0070
            r2 = r7
            goto L_0x0071
        L_0x0070:
            r2 = r6
        L_0x0071:
            if (r2 == 0) goto L_0x0076
            r17 = r0
            goto L_0x0078
        L_0x0076:
            r17 = r8
        L_0x0078:
            java.lang.String r0 = r27.mo116688M()
            int r2 = r0.length()
            if (r2 <= 0) goto L_0x0084
            r2 = r7
            goto L_0x0085
        L_0x0084:
            r2 = r6
        L_0x0085:
            if (r2 == 0) goto L_0x008a
            r18 = r0
            goto L_0x008c
        L_0x008a:
            r18 = r8
        L_0x008c:
            double r19 = r27.mo116693R()
            java.lang.Double r0 = java.lang.Double.valueOf(r19)
            double r19 = r0.doubleValue()
            r21 = 0
            int r2 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r2 != 0) goto L_0x00a0
            r2 = r7
            goto L_0x00a1
        L_0x00a0:
            r2 = r6
        L_0x00a1:
            r2 = r2 ^ r7
            if (r2 == 0) goto L_0x00a5
            goto L_0x00a6
        L_0x00a5:
            r0 = r8
        L_0x00a6:
            double r19 = r27.mo116691P()
            java.lang.Double r2 = java.lang.Double.valueOf(r19)
            double r19 = r2.doubleValue()
            int r13 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r13 != 0) goto L_0x00b7
            r6 = r7
        L_0x00b7:
            r6 = r6 ^ r7
            if (r6 == 0) goto L_0x00bd
            r22 = r2
            goto L_0x00bf
        L_0x00bd:
            r22 = r8
        L_0x00bf:
            java.lang.Boolean r23 = r27.mo116681F()
            java.lang.String r24 = r27.mo116696U()
            com.carrefour.fid.android.bff_data_shared.data.api.entities.AddressUserResponse r1 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.AddressUserResponse
            r2 = r1
            r6 = 0
            r7 = 0
            r8 = 0
            r13 = 0
            r19 = 0
            r20 = 0
            r25 = 197688(0x30438, float:2.7702E-40)
            r26 = 0
            r21 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.domain.extension.C13242a.m57376f(com.carrefour.fid.android.domain.models.account.Address):com.carrefour.fid.android.bff_data_shared.data.api.entities.AddressUserResponse");
    }

    @C12579k
    /* renamed from: g */
    public static final PhonesUserResponse m57377g(@C12579k Phone phone) {
        Intrinsics.checkNotNullParameter(phone, "<this>");
        return new PhonesUserResponse(phone.mo116741e(), (String) null, (String) null, phone.mo116743f(), 0, 22, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: h */
    public static final UserCardsResponse m57378h(@C12579k UserCards userCards) {
        Intrinsics.checkNotNullParameter(userCards, "<this>");
        return new UserCardsResponse(userCards.mo116761i(), userCards.mo116763k(), userCards.mo116759h(), userCards.mo116762j(), userCards.mo116764l());
    }

    @C12579k
    /* renamed from: i */
    public static final UserCards m57379i(@C12579k UserCardsResponse userCardsResponse) {
        Intrinsics.checkNotNullParameter(userCardsResponse, "<this>");
        String date = userCardsResponse.getDate();
        return new UserCards(userCardsResponse.getNum(), date, userCardsResponse.isSecured(), userCardsResponse.getCategory(), userCardsResponse.getKey());
    }
}
