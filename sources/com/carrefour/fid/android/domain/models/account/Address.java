package com.carrefour.fid.android.domain.models.account;

import android.os.Parcel;
import android.os.Parcelable;
import com.carrefour.fid.android.domain.models.AddressCategory;
import com.urbanairship.util.C9650g;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlin.text.StringsKt__IndentKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\b\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\b\b\u0002\u0010$\u001a\u00020\u0002\u0012\b\b\u0002\u0010%\u001a\u00020\u0002\u0012\b\b\u0002\u0010&\u001a\u00020\u0002\u0012\b\b\u0002\u0010'\u001a\u00020\u0002\u0012\b\b\u0002\u0010(\u001a\u00020\u0002\u0012\b\b\u0002\u0010)\u001a\u00020\u0002\u0012\b\b\u0002\u0010*\u001a\u00020\u0002\u0012\b\b\u0002\u0010+\u001a\u00020\u0002\u0012\b\b\u0002\u0010,\u001a\u00020\u0013\u0012\b\b\u0002\u0010-\u001a\u00020\u0002\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010/\u001a\u00020\u0002\u0012\b\b\u0002\u00100\u001a\u00020\u0002\u0012\u0006\u00101\u001a\u00020\u0019\u0012\b\b\u0002\u00102\u001a\u00020\u001b\u0012\b\b\u0002\u00103\u001a\u00020\u0013\u0012\b\b\u0002\u00104\u001a\u00020\u001e\u0012\b\b\u0002\u00105\u001a\u00020\u001e\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bj\u0010kJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u001b\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0013HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0002HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0019HÆ\u0003J\t\u0010\u001c\u001a\u00020\u001bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0013HÆ\u0003J\t\u0010\u001f\u001a\u00020\u001eHÆ\u0003J\t\u0010 \u001a\u00020\u001eHÆ\u0003J\u0012\u0010!\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u000b\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003JÞ\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00022\b\b\u0002\u0010&\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\u00022\b\b\u0002\u0010)\u001a\u00020\u00022\b\b\u0002\u0010*\u001a\u00020\u00022\b\b\u0002\u0010+\u001a\u00020\u00022\b\b\u0002\u0010,\u001a\u00020\u00132\b\b\u0002\u0010-\u001a\u00020\u00022\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010/\u001a\u00020\u00022\b\b\u0002\u00100\u001a\u00020\u00022\b\b\u0002\u00101\u001a\u00020\u00192\b\b\u0002\u00102\u001a\u00020\u001b2\b\b\u0002\u00103\u001a\u00020\u00132\b\b\u0002\u00104\u001a\u00020\u001e2\b\b\u0002\u00105\u001a\u00020\u001e2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b8\u00109J\t\u0010:\u001a\u00020\u0002HÖ\u0001J\t\u0010;\u001a\u00020\u001bHÖ\u0001J\u0013\u0010>\u001a\u00020\u00132\b\u0010=\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010?\u001a\u00020\u001bHÖ\u0001J\u0019\u0010D\u001a\u00020C2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\u001bHÖ\u0001R\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010E\u001a\u0004\bH\u0010GR\u0017\u0010&\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010E\u001a\u0004\bI\u0010GR\u0017\u0010'\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010E\u001a\u0004\bJ\u0010GR\u0017\u0010(\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010E\u001a\u0004\bK\u0010GR\u0017\u0010)\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010E\u001a\u0004\bL\u0010GR\u0017\u0010*\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010E\u001a\u0004\bM\u0010GR\u0017\u0010+\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bN\u0010E\u001a\u0004\bO\u0010GR\u0017\u0010,\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0003\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010-\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010E\u001a\u0004\bS\u0010GR\u0019\u0010.\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010E\u001a\u0004\bT\u0010GR\u0017\u0010/\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010E\u001a\u0004\bU\u0010GR\u0017\u00100\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bV\u0010E\u001a\u0004\bW\u0010GR\u0017\u00101\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0017\u00102\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bP\u0010J\u001a\u0004\b\\\u0010]R\u0017\u00103\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b^\u0010P\u001a\u0004\b_\u0010RR\u0017\u00104\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b`\u0010H\u001a\u0004\ba\u0010bR\u0017\u00105\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bc\u0010H\u001a\u0004\bd\u0010bR\u0019\u00106\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010\"R\u0019\u00107\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bh\u0010E\u001a\u0004\bi\u0010G¨\u0006l"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/account/Address;", "Landroid/os/Parcelable;", "", "w", "z", "", "countryArray", "A", "([Ljava/lang/String;)Ljava/lang/String;", "x", "y", "a", "l", "n", "o", "p", "q", "r", "s", "", "t", "b", "c", "d", "e", "Lcom/carrefour/fid/android/domain/models/AddressCategory;", "f", "", "g", "h", "", "i", "j", "k", "()Ljava/lang/Boolean;", "m", "country", "address3", "address2", "city", "address1", "postcode", "digitalCode", "interphone", "lift", "building", "floor", "information", "addressName", "category", "key", "preference", "longitude", "latitude", "approximateAddress", "qualityDQE", "u", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/domain/models/AddressCategory;IZDDLjava/lang/Boolean;Ljava/lang/String;)Lcom/carrefour/fid/android/domain/models/account/Address;", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "J", "()Ljava/lang/String;", "D", "C", "I", "B", "S", "K", "v", "N", "Z", "Q", "()Z", "G", "L", "M", "X", "E", "Y", "Lcom/carrefour/fid/android/domain/models/AddressCategory;", "H", "()Lcom/carrefour/fid/android/domain/models/AddressCategory;", "O", "()I", "E0", "T", "F0", "R", "()D", "G0", "P", "H0", "Ljava/lang/Boolean;", "F", "I0", "U", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/domain/models/AddressCategory;IZDDLjava/lang/Boolean;Ljava/lang/String;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nAddress.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Address.kt\ncom/carrefour/fid/android/domain/models/account/Address\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
@C12187d
public final class Address implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<Address> CREATOR = new C37943a();

    /* renamed from: E0 */
    public final boolean f95406E0;

    /* renamed from: F0 */
    public final double f95407F0;

    /* renamed from: G0 */
    public final double f95408G0;
    @C12580l

    /* renamed from: H0 */
    public final Boolean f95409H0;
    @C12580l

    /* renamed from: I0 */
    public final String f95410I0;
    @C12579k

    /* renamed from: X */
    public final String f95411X;
    @C12579k

    /* renamed from: Y */
    public final AddressCategory f95412Y;

    /* renamed from: Z */
    public final int f95413Z;
    @C12579k

    /* renamed from: a */
    public final String f95414a;
    @C12579k

    /* renamed from: b */
    public final String f95415b;
    @C12579k

    /* renamed from: c */
    public final String f95416c;
    @C12579k

    /* renamed from: d */
    public final String f95417d;
    @C12579k

    /* renamed from: e */
    public final String f95418e;
    @C12579k

    /* renamed from: f */
    public final String f95419f;
    @C12579k

    /* renamed from: g */
    public final String f95420g;
    @C12579k

    /* renamed from: v */
    public final String f95421v;

    /* renamed from: w */
    public final boolean f95422w;
    @C12579k

    /* renamed from: x */
    public final String f95423x;
    @C12580l

    /* renamed from: y */
    public final String f95424y;
    @C12579k

    /* renamed from: z */
    public final String f95425z;

    /* renamed from: com.carrefour.fid.android.domain.models.account.Address$a */
    public static final class C37943a implements Parcelable.Creator<Address> {
        @C12579k
        /* renamed from: a */
        public final Address createFromParcel(@C12579k Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            boolean z = true;
            boolean z2 = parcel.readInt() != 0;
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            AddressCategory valueOf2 = AddressCategory.valueOf(parcel.readString());
            int readInt = parcel.readInt();
            boolean z3 = parcel.readInt() != 0;
            double readDouble = parcel.readDouble();
            double readDouble2 = parcel.readDouble();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                valueOf = Boolean.valueOf(z);
            }
            return new Address(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, z2, readString9, readString10, readString11, readString12, valueOf2, readInt, z3, readDouble, readDouble2, valueOf, parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final Address[] newArray(int i) {
            return new Address[i];
        }
    }

    public Address(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7, @C12579k String str8, boolean z, @C12579k String str9, @C12580l String str10, @C12579k String str11, @C12579k String str12, @C12579k AddressCategory addressCategory, int i, boolean z2, double d, double d2, @C12580l Boolean bool, @C12580l String str13) {
        String str14 = str2;
        String str15 = str3;
        String str16 = str4;
        String str17 = str5;
        String str18 = str6;
        String str19 = str7;
        String str20 = str8;
        String str21 = str9;
        String str22 = str11;
        String str23 = str12;
        AddressCategory addressCategory2 = addressCategory;
        Intrinsics.checkNotNullParameter(str, "country");
        Intrinsics.checkNotNullParameter(str14, "address3");
        Intrinsics.checkNotNullParameter(str15, "address2");
        Intrinsics.checkNotNullParameter(str16, C9650g.f26444g);
        Intrinsics.checkNotNullParameter(str17, "address1");
        Intrinsics.checkNotNullParameter(str18, "postcode");
        Intrinsics.checkNotNullParameter(str19, "digitalCode");
        Intrinsics.checkNotNullParameter(str20, "interphone");
        Intrinsics.checkNotNullParameter(str21, "building");
        Intrinsics.checkNotNullParameter(str22, "information");
        Intrinsics.checkNotNullParameter(str23, "addressName");
        Intrinsics.checkNotNullParameter(addressCategory2, "category");
        this.f95414a = str;
        this.f95415b = str14;
        this.f95416c = str15;
        this.f95417d = str16;
        this.f95418e = str17;
        this.f95419f = str18;
        this.f95420g = str19;
        this.f95421v = str20;
        this.f95422w = z;
        this.f95423x = str21;
        this.f95424y = str10;
        this.f95425z = str22;
        this.f95411X = str23;
        this.f95412Y = addressCategory2;
        this.f95413Z = i;
        this.f95406E0 = z2;
        this.f95407F0 = d;
        this.f95408G0 = d2;
        this.f95409H0 = bool;
        this.f95410I0 = str13;
    }

    /* renamed from: v */
    public static /* synthetic */ Address m155867v(Address address, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, String str11, String str12, AddressCategory addressCategory, int i, boolean z2, double d, double d2, Boolean bool, String str13, int i2, Object obj) {
        Address address2 = address;
        int i3 = i2;
        return address.mo116721u((i3 & 1) != 0 ? address2.f95414a : str, (i3 & 2) != 0 ? address2.f95415b : str2, (i3 & 4) != 0 ? address2.f95416c : str3, (i3 & 8) != 0 ? address2.f95417d : str4, (i3 & 16) != 0 ? address2.f95418e : str5, (i3 & 32) != 0 ? address2.f95419f : str6, (i3 & 64) != 0 ? address2.f95420g : str7, (i3 & 128) != 0 ? address2.f95421v : str8, (i3 & 256) != 0 ? address2.f95422w : z, (i3 & 512) != 0 ? address2.f95423x : str9, (i3 & 1024) != 0 ? address2.f95424y : str10, (i3 & 2048) != 0 ? address2.f95425z : str11, (i3 & 4096) != 0 ? address2.f95411X : str12, (i3 & 8192) != 0 ? address2.f95412Y : addressCategory, (i3 & 16384) != 0 ? address2.f95413Z : i, (i3 & 32768) != 0 ? address2.f95406E0 : z2, (i3 & 65536) != 0 ? address2.f95407F0 : d, (i3 & 131072) != 0 ? address2.f95408G0 : d2, (i3 & 262144) != 0 ? address2.f95409H0 : bool, (i3 & 524288) != 0 ? address2.f95410I0 : str13);
    }

    @C12579k
    /* renamed from: A */
    public final String mo116676A(@C12579k String[] strArr) {
        String str;
        Intrinsics.checkNotNullParameter(strArr, "countryArray");
        int length = strArr.length;
        int i = 0;
        while (true) {
            str = null;
            if (i >= length) {
                break;
            }
            String str2 = strArr[i];
            if (C11622t.startsWith$default(str2, this.f95414a, false, 2, (Object) null)) {
                str = str2;
                break;
            }
            i++;
        }
        if (str == null) {
            str = "";
        }
        return this.f95419f + " " + this.f95417d + ", " + str;
    }

    @C12579k
    /* renamed from: B */
    public final String mo116677B() {
        return this.f95418e;
    }

    @C12579k
    /* renamed from: C */
    public final String mo116678C() {
        return this.f95416c;
    }

    @C12579k
    /* renamed from: D */
    public final String mo116679D() {
        return this.f95415b;
    }

    @C12579k
    /* renamed from: E */
    public final String mo116680E() {
        return this.f95411X;
    }

    @C12580l
    /* renamed from: F */
    public final Boolean mo116681F() {
        return this.f95409H0;
    }

    @C12579k
    /* renamed from: G */
    public final String mo116682G() {
        return this.f95423x;
    }

    @C12579k
    /* renamed from: H */
    public final AddressCategory mo116683H() {
        return this.f95412Y;
    }

    @C12579k
    /* renamed from: I */
    public final String mo116684I() {
        return this.f95417d;
    }

    @C12579k
    /* renamed from: J */
    public final String mo116685J() {
        return this.f95414a;
    }

    @C12579k
    /* renamed from: K */
    public final String mo116686K() {
        return this.f95420g;
    }

    @C12580l
    /* renamed from: L */
    public final String mo116687L() {
        return this.f95424y;
    }

    @C12579k
    /* renamed from: M */
    public final String mo116688M() {
        return this.f95425z;
    }

    @C12579k
    /* renamed from: N */
    public final String mo116689N() {
        return this.f95421v;
    }

    /* renamed from: O */
    public final int mo116690O() {
        return this.f95413Z;
    }

    /* renamed from: P */
    public final double mo116691P() {
        return this.f95408G0;
    }

    /* renamed from: Q */
    public final boolean mo116692Q() {
        return this.f95422w;
    }

    /* renamed from: R */
    public final double mo116693R() {
        return this.f95407F0;
    }

    @C12579k
    /* renamed from: S */
    public final String mo116694S() {
        return this.f95419f;
    }

    /* renamed from: T */
    public final boolean mo116695T() {
        return this.f95406E0;
    }

    @C12580l
    /* renamed from: U */
    public final String mo116696U() {
        return this.f95410I0;
    }

    @C12579k
    /* renamed from: a */
    public final String mo116697a() {
        return this.f95414a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo116698b() {
        return this.f95423x;
    }

    @C12580l
    /* renamed from: c */
    public final String mo116699c() {
        return this.f95424y;
    }

    @C12579k
    /* renamed from: d */
    public final String mo116700d() {
        return this.f95425z;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final String mo116702e() {
        return this.f95411X;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return Intrinsics.areEqual((Object) this.f95414a, (Object) address.f95414a) && Intrinsics.areEqual((Object) this.f95415b, (Object) address.f95415b) && Intrinsics.areEqual((Object) this.f95416c, (Object) address.f95416c) && Intrinsics.areEqual((Object) this.f95417d, (Object) address.f95417d) && Intrinsics.areEqual((Object) this.f95418e, (Object) address.f95418e) && Intrinsics.areEqual((Object) this.f95419f, (Object) address.f95419f) && Intrinsics.areEqual((Object) this.f95420g, (Object) address.f95420g) && Intrinsics.areEqual((Object) this.f95421v, (Object) address.f95421v) && this.f95422w == address.f95422w && Intrinsics.areEqual((Object) this.f95423x, (Object) address.f95423x) && Intrinsics.areEqual((Object) this.f95424y, (Object) address.f95424y) && Intrinsics.areEqual((Object) this.f95425z, (Object) address.f95425z) && Intrinsics.areEqual((Object) this.f95411X, (Object) address.f95411X) && this.f95412Y == address.f95412Y && this.f95413Z == address.f95413Z && this.f95406E0 == address.f95406E0 && Double.compare(this.f95407F0, address.f95407F0) == 0 && Double.compare(this.f95408G0, address.f95408G0) == 0 && Intrinsics.areEqual((Object) this.f95409H0, (Object) address.f95409H0) && Intrinsics.areEqual((Object) this.f95410I0, (Object) address.f95410I0);
    }

    @C12579k
    /* renamed from: f */
    public final AddressCategory mo116704f() {
        return this.f95412Y;
    }

    /* renamed from: g */
    public final int mo116705g() {
        return this.f95413Z;
    }

    /* renamed from: h */
    public final boolean mo116706h() {
        return this.f95406E0;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((this.f95414a.hashCode() * 31) + this.f95415b.hashCode()) * 31) + this.f95416c.hashCode()) * 31) + this.f95417d.hashCode()) * 31) + this.f95418e.hashCode()) * 31) + this.f95419f.hashCode()) * 31) + this.f95420g.hashCode()) * 31) + this.f95421v.hashCode()) * 31;
        boolean z = this.f95422w;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode2 = (((hashCode + (z ? 1 : 0)) * 31) + this.f95423x.hashCode()) * 31;
        String str = this.f95424y;
        int i = 0;
        int hashCode3 = (((((((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.f95425z.hashCode()) * 31) + this.f95411X.hashCode()) * 31) + this.f95412Y.hashCode()) * 31) + Integer.hashCode(this.f95413Z)) * 31;
        boolean z3 = this.f95406E0;
        if (!z3) {
            z2 = z3;
        }
        int hashCode4 = (((((hashCode3 + (z2 ? 1 : 0)) * 31) + Double.hashCode(this.f95407F0)) * 31) + Double.hashCode(this.f95408G0)) * 31;
        Boolean bool = this.f95409H0;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f95410I0;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode5 + i;
    }

    /* renamed from: i */
    public final double mo116708i() {
        return this.f95407F0;
    }

    /* renamed from: j */
    public final double mo116709j() {
        return this.f95408G0;
    }

    @C12580l
    /* renamed from: k */
    public final Boolean mo116710k() {
        return this.f95409H0;
    }

    @C12579k
    /* renamed from: l */
    public final String mo116711l() {
        return this.f95415b;
    }

    @C12580l
    /* renamed from: m */
    public final String mo116712m() {
        return this.f95410I0;
    }

    @C12579k
    /* renamed from: n */
    public final String mo116713n() {
        return this.f95416c;
    }

    @C12579k
    /* renamed from: o */
    public final String mo116714o() {
        return this.f95417d;
    }

    @C12579k
    /* renamed from: p */
    public final String mo116715p() {
        return this.f95418e;
    }

    @C12579k
    /* renamed from: q */
    public final String mo116716q() {
        return this.f95419f;
    }

    @C12579k
    /* renamed from: r */
    public final String mo116717r() {
        return this.f95420g;
    }

    @C12579k
    /* renamed from: s */
    public final String mo116718s() {
        return this.f95421v;
    }

    /* renamed from: t */
    public final boolean mo116719t() {
        return this.f95422w;
    }

    @C12579k
    public String toString() {
        String str = this.f95414a;
        String str2 = this.f95415b;
        String str3 = this.f95416c;
        String str4 = this.f95417d;
        String str5 = this.f95418e;
        String str6 = this.f95419f;
        String str7 = this.f95420g;
        String str8 = this.f95421v;
        boolean z = this.f95422w;
        String str9 = this.f95423x;
        String str10 = this.f95424y;
        String str11 = this.f95425z;
        String str12 = this.f95411X;
        AddressCategory addressCategory = this.f95412Y;
        int i = this.f95413Z;
        AddressCategory addressCategory2 = addressCategory;
        boolean z2 = this.f95406E0;
        double d = this.f95407F0;
        double d2 = this.f95408G0;
        Boolean bool = this.f95409H0;
        String str13 = this.f95410I0;
        return "Address(country=" + str + ", address3=" + str2 + ", address2=" + str3 + ", city=" + str4 + ", address1=" + str5 + ", postcode=" + str6 + ", digitalCode=" + str7 + ", interphone=" + str8 + ", lift=" + z + ", building=" + str9 + ", floor=" + str10 + ", information=" + str11 + ", addressName=" + str12 + ", category=" + addressCategory2 + ", key=" + i + ", preference=" + z2 + ", longitude=" + d + ", latitude=" + d2 + ", approximateAddress=" + bool + ", qualityDQE=" + str13 + ")";
    }

    @C12579k
    /* renamed from: u */
    public final Address mo116721u(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7, @C12579k String str8, boolean z, @C12579k String str9, @C12580l String str10, @C12579k String str11, @C12579k String str12, @C12579k AddressCategory addressCategory, int i, boolean z2, double d, double d2, @C12580l Boolean bool, @C12580l String str13) {
        String str14 = str;
        Intrinsics.checkNotNullParameter(str14, "country");
        Intrinsics.checkNotNullParameter(str2, "address3");
        Intrinsics.checkNotNullParameter(str3, "address2");
        Intrinsics.checkNotNullParameter(str4, C9650g.f26444g);
        Intrinsics.checkNotNullParameter(str5, "address1");
        Intrinsics.checkNotNullParameter(str6, "postcode");
        Intrinsics.checkNotNullParameter(str7, "digitalCode");
        Intrinsics.checkNotNullParameter(str8, "interphone");
        Intrinsics.checkNotNullParameter(str9, "building");
        Intrinsics.checkNotNullParameter(str11, "information");
        Intrinsics.checkNotNullParameter(str12, "addressName");
        Intrinsics.checkNotNullParameter(addressCategory, "category");
        return new Address(str14, str2, str3, str4, str5, str6, str7, str8, z, str9, str10, str11, str12, addressCategory, i, z2, d, d2, bool, str13);
    }

    @C12579k
    /* renamed from: w */
    public final String mo116722w() {
        String str = this.f95418e;
        String str2 = this.f95416c;
        String str3 = this.f95415b;
        return StringsKt__StringsKt.trim(str + " " + str2 + " " + str3).toString();
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        boolean booleanValue;
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95414a);
        parcel.writeString(this.f95415b);
        parcel.writeString(this.f95416c);
        parcel.writeString(this.f95417d);
        parcel.writeString(this.f95418e);
        parcel.writeString(this.f95419f);
        parcel.writeString(this.f95420g);
        parcel.writeString(this.f95421v);
        parcel.writeInt(this.f95422w ? 1 : 0);
        parcel.writeString(this.f95423x);
        parcel.writeString(this.f95424y);
        parcel.writeString(this.f95425z);
        parcel.writeString(this.f95411X);
        parcel.writeString(this.f95412Y.name());
        parcel.writeInt(this.f95413Z);
        parcel.writeInt(this.f95406E0 ? 1 : 0);
        parcel.writeDouble(this.f95407F0);
        parcel.writeDouble(this.f95408G0);
        Boolean bool = this.f95409H0;
        if (bool == null) {
            booleanValue = false;
        } else {
            parcel.writeInt(1);
            booleanValue = bool.booleanValue();
        }
        parcel.writeInt(booleanValue ? 1 : 0);
        parcel.writeString(this.f95410I0);
    }

    @C12579k
    /* renamed from: x */
    public final String mo116724x() {
        String w = mo116722w();
        String z = mo116726z();
        return w + ", " + z;
    }

    @C12579k
    /* renamed from: y */
    public final String mo116725y() {
        String w = mo116722w();
        String z = mo116726z();
        return StringsKt__IndentKt.trimMargin$default(w + "\n" + z, (String) null, 1, (Object) null);
    }

    @C12579k
    /* renamed from: z */
    public final String mo116726z() {
        String str = this.f95419f;
        String str2 = this.f95417d;
        return str + " " + str2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Address(java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, boolean r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, com.carrefour.fid.android.domain.models.AddressCategory r39, int r40, boolean r41, double r42, double r44, java.lang.Boolean r46, java.lang.String r47, int r48, kotlin.jvm.internal.DefaultConstructorMarker r49) {
        /*
            r25 = this;
            r0 = r48
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000d
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            r3 = r1
            goto L_0x000f
        L_0x000d:
            r3 = r26
        L_0x000f:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x001a
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            r4 = r1
            goto L_0x001c
        L_0x001a:
            r4 = r27
        L_0x001c:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0027
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            r5 = r1
            goto L_0x0029
        L_0x0027:
            r5 = r28
        L_0x0029:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0034
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            r6 = r1
            goto L_0x0036
        L_0x0034:
            r6 = r29
        L_0x0036:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0041
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            r7 = r1
            goto L_0x0043
        L_0x0041:
            r7 = r30
        L_0x0043:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x004e
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            r8 = r1
            goto L_0x0050
        L_0x004e:
            r8 = r31
        L_0x0050:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x005b
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            r9 = r1
            goto L_0x005d
        L_0x005b:
            r9 = r32
        L_0x005d:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0068
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            r10 = r1
            goto L_0x006a
        L_0x0068:
            r10 = r33
        L_0x006a:
            r1 = r0 & 256(0x100, float:3.59E-43)
            r2 = 0
            if (r1 == 0) goto L_0x0071
            r11 = r2
            goto L_0x0073
        L_0x0071:
            r11 = r34
        L_0x0073:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x007e
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            r12 = r1
            goto L_0x0080
        L_0x007e:
            r12 = r35
        L_0x0080:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x008b
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            r13 = r1
            goto L_0x008d
        L_0x008b:
            r13 = r36
        L_0x008d:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0098
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            r14 = r1
            goto L_0x009a
        L_0x0098:
            r14 = r37
        L_0x009a:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x00a5
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            r15 = r1
            goto L_0x00a7
        L_0x00a5:
            r15 = r38
        L_0x00a7:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x00ae
            r17 = r2
            goto L_0x00b0
        L_0x00ae:
            r17 = r40
        L_0x00b0:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00b9
            r18 = r2
            goto L_0x00bb
        L_0x00b9:
            r18 = r41
        L_0x00bb:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            r19 = 0
            if (r1 == 0) goto L_0x00c5
            r21 = r19
            goto L_0x00c7
        L_0x00c5:
            r21 = r42
        L_0x00c7:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00cf
            r23 = r19
            goto L_0x00d1
        L_0x00cf:
            r23 = r44
        L_0x00d1:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            r2 = 0
            if (r1 == 0) goto L_0x00d9
            r1 = r2
            goto L_0x00db
        L_0x00d9:
            r1 = r46
        L_0x00db:
            r16 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r16
            if (r0 == 0) goto L_0x00e3
            r0 = r2
            goto L_0x00e5
        L_0x00e3:
            r0 = r47
        L_0x00e5:
            r2 = r25
            r16 = r39
            r19 = r21
            r21 = r23
            r23 = r1
            r24 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.account.Address.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.carrefour.fid.android.domain.models.AddressCategory, int, boolean, double, double, java.lang.Boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
