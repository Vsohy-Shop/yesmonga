package com.carrefour.fid.android.domain.models.account;

import android.os.Parcel;
import android.os.Parcelable;
import com.carrefour.fid.android.shared.constant.C28573o0;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\n\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\bA\u0010BJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\nHÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\nHÆ\u0003J\t\u0010\u0012\u001a\u00020\u0011HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0002HÆ\u0003J\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00022\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\b\b\u0002\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u0002HÆ\u0001J\t\u0010 \u001a\u00020\u0002HÖ\u0001J\t\u0010\"\u001a\u00020!HÖ\u0001J\u0013\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010'\u001a\u00020!HÖ\u0001J\u0019\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020!HÖ\u0001R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010-\u001a\u0004\b0\u0010/R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b1\u0010/R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b2\u0010/R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b6\u0010/R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u00109R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b:\u00109R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\n8\u0006¢\u0006\f\n\u0004\b8\u00107\u001a\u0004\b;\u00109R\u0017\u0010\u001d\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010-\u001a\u0004\b@\u0010/¨\u0006C"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/account/AccountInfo;", "Landroid/os/Parcelable;", "", "a", "d", "e", "f", "Lcom/carrefour/fid/android/domain/models/account/CivilityTitle;", "g", "h", "", "Lcom/carrefour/fid/android/domain/models/account/UserCards;", "i", "Lcom/carrefour/fid/android/domain/models/account/Address;", "j", "Lcom/carrefour/fid/android/domain/models/account/Phone;", "k", "", "b", "c", "email", "firstName", "lastName", "birthDate", "civility", "cgu", "listCards", "listAddress", "listPhone", "dateOfSave", "lastModification", "l", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "r", "()Ljava/lang/String;", "s", "u", "n", "Lcom/carrefour/fid/android/domain/models/account/CivilityTitle;", "p", "()Lcom/carrefour/fid/android/domain/models/account/CivilityTitle;", "o", "Ljava/util/List;", "w", "()Ljava/util/List;", "v", "x", "J", "q", "()J", "y", "t", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/domain/models/account/CivilityTitle;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JLjava/lang/String;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class AccountInfo implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<AccountInfo> CREATOR = new C37942a();
    @C12579k

    /* renamed from: a */
    public final String f95395a;
    @C12579k

    /* renamed from: b */
    public final String f95396b;
    @C12579k

    /* renamed from: c */
    public final String f95397c;
    @C12579k

    /* renamed from: d */
    public final String f95398d;
    @C12580l

    /* renamed from: e */
    public final CivilityTitle f95399e;
    @C12579k

    /* renamed from: f */
    public final String f95400f;
    @C12579k

    /* renamed from: g */
    public final List<UserCards> f95401g;
    @C12579k

    /* renamed from: v */
    public final List<Address> f95402v;
    @C12579k

    /* renamed from: w */
    public final List<Phone> f95403w;

    /* renamed from: x */
    public final long f95404x;
    @C12579k

    /* renamed from: y */
    public final String f95405y;

    /* renamed from: com.carrefour.fid.android.domain.models.account.AccountInfo$a */
    public static final class C37942a implements Parcelable.Creator<AccountInfo> {
        @C12579k
        /* renamed from: a */
        public final AccountInfo createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            CivilityTitle createFromParcel = parcel.readInt() == 0 ? null : CivilityTitle.CREATOR.createFromParcel(parcel);
            String readString5 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(UserCards.CREATOR.createFromParcel(parcel));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(Address.CREATOR.createFromParcel(parcel));
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt3);
            for (int i3 = 0; i3 != readInt3; i3++) {
                arrayList3.add(Phone.CREATOR.createFromParcel(parcel));
            }
            return new AccountInfo(readString, readString2, readString3, readString4, createFromParcel, readString5, arrayList, arrayList2, arrayList3, parcel.readLong(), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final AccountInfo[] newArray(int i) {
            return new AccountInfo[i];
        }
    }

    public AccountInfo() {
        this((String) null, (String) null, (String) null, (String) null, (CivilityTitle) null, (String) null, (List) null, (List) null, (List) null, 0, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    /* renamed from: m */
    public static /* synthetic */ AccountInfo m155841m(AccountInfo accountInfo, String str, String str2, String str3, String str4, CivilityTitle civilityTitle, String str5, List list, List list2, List list3, long j, String str6, int i, Object obj) {
        AccountInfo accountInfo2 = accountInfo;
        int i2 = i;
        return accountInfo.mo116658l((i2 & 1) != 0 ? accountInfo2.f95395a : str, (i2 & 2) != 0 ? accountInfo2.f95396b : str2, (i2 & 4) != 0 ? accountInfo2.f95397c : str3, (i2 & 8) != 0 ? accountInfo2.f95398d : str4, (i2 & 16) != 0 ? accountInfo2.f95399e : civilityTitle, (i2 & 32) != 0 ? accountInfo2.f95400f : str5, (i2 & 64) != 0 ? accountInfo2.f95401g : list, (i2 & 128) != 0 ? accountInfo2.f95402v : list2, (i2 & 256) != 0 ? accountInfo2.f95403w : list3, (i2 & 512) != 0 ? accountInfo2.f95404x : j, (i2 & 1024) != 0 ? accountInfo2.f95405y : str6);
    }

    @C12579k
    /* renamed from: a */
    public final String mo116644a() {
        return this.f95395a;
    }

    /* renamed from: b */
    public final long mo116645b() {
        return this.f95404x;
    }

    @C12579k
    /* renamed from: c */
    public final String mo116646c() {
        return this.f95405y;
    }

    @C12579k
    /* renamed from: d */
    public final String mo116647d() {
        return this.f95396b;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final String mo116649e() {
        return this.f95397c;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountInfo)) {
            return false;
        }
        AccountInfo accountInfo = (AccountInfo) obj;
        return Intrinsics.areEqual((Object) this.f95395a, (Object) accountInfo.f95395a) && Intrinsics.areEqual((Object) this.f95396b, (Object) accountInfo.f95396b) && Intrinsics.areEqual((Object) this.f95397c, (Object) accountInfo.f95397c) && Intrinsics.areEqual((Object) this.f95398d, (Object) accountInfo.f95398d) && this.f95399e == accountInfo.f95399e && Intrinsics.areEqual((Object) this.f95400f, (Object) accountInfo.f95400f) && Intrinsics.areEqual((Object) this.f95401g, (Object) accountInfo.f95401g) && Intrinsics.areEqual((Object) this.f95402v, (Object) accountInfo.f95402v) && Intrinsics.areEqual((Object) this.f95403w, (Object) accountInfo.f95403w) && this.f95404x == accountInfo.f95404x && Intrinsics.areEqual((Object) this.f95405y, (Object) accountInfo.f95405y);
    }

    @C12579k
    /* renamed from: f */
    public final String mo116651f() {
        return this.f95398d;
    }

    @C12580l
    /* renamed from: g */
    public final CivilityTitle mo116652g() {
        return this.f95399e;
    }

    @C12579k
    /* renamed from: h */
    public final String mo116653h() {
        return this.f95400f;
    }

    public int hashCode() {
        int hashCode = ((((((this.f95395a.hashCode() * 31) + this.f95396b.hashCode()) * 31) + this.f95397c.hashCode()) * 31) + this.f95398d.hashCode()) * 31;
        CivilityTitle civilityTitle = this.f95399e;
        return ((((((((((((hashCode + (civilityTitle == null ? 0 : civilityTitle.hashCode())) * 31) + this.f95400f.hashCode()) * 31) + this.f95401g.hashCode()) * 31) + this.f95402v.hashCode()) * 31) + this.f95403w.hashCode()) * 31) + Long.hashCode(this.f95404x)) * 31) + this.f95405y.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final List<UserCards> mo116655i() {
        return this.f95401g;
    }

    @C12579k
    /* renamed from: j */
    public final List<Address> mo116656j() {
        return this.f95402v;
    }

    @C12579k
    /* renamed from: k */
    public final List<Phone> mo116657k() {
        return this.f95403w;
    }

    @C12579k
    /* renamed from: l */
    public final AccountInfo mo116658l(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12580l CivilityTitle civilityTitle, @C12579k String str5, @C12579k List<UserCards> list, @C12579k List<Address> list2, @C12579k List<Phone> list3, long j, @C12579k String str6) {
        Intrinsics.checkNotNullParameter(str, "email");
        String str7 = str2;
        Intrinsics.checkNotNullParameter(str7, "firstName");
        String str8 = str3;
        Intrinsics.checkNotNullParameter(str8, "lastName");
        String str9 = str4;
        Intrinsics.checkNotNullParameter(str9, "birthDate");
        String str10 = str5;
        Intrinsics.checkNotNullParameter(str10, C28573o0.f69650b);
        List<UserCards> list4 = list;
        Intrinsics.checkNotNullParameter(list4, "listCards");
        List<Address> list5 = list2;
        Intrinsics.checkNotNullParameter(list5, "listAddress");
        List<Phone> list6 = list3;
        Intrinsics.checkNotNullParameter(list6, "listPhone");
        String str11 = str6;
        Intrinsics.checkNotNullParameter(str11, "lastModification");
        return new AccountInfo(str, str7, str8, str9, civilityTitle, str10, list4, list5, list6, j, str11);
    }

    @C12579k
    /* renamed from: n */
    public final String mo116659n() {
        return this.f95398d;
    }

    @C12579k
    /* renamed from: o */
    public final String mo116660o() {
        return this.f95400f;
    }

    @C12580l
    /* renamed from: p */
    public final CivilityTitle mo116661p() {
        return this.f95399e;
    }

    /* renamed from: q */
    public final long mo116662q() {
        return this.f95404x;
    }

    @C12579k
    /* renamed from: r */
    public final String mo116663r() {
        return this.f95395a;
    }

    @C12579k
    /* renamed from: s */
    public final String mo116664s() {
        return this.f95396b;
    }

    @C12579k
    /* renamed from: t */
    public final String mo116665t() {
        return this.f95405y;
    }

    @C12579k
    public String toString() {
        String str = this.f95395a;
        String str2 = this.f95396b;
        String str3 = this.f95397c;
        String str4 = this.f95398d;
        CivilityTitle civilityTitle = this.f95399e;
        String str5 = this.f95400f;
        List<UserCards> list = this.f95401g;
        List<Address> list2 = this.f95402v;
        List<Phone> list3 = this.f95403w;
        long j = this.f95404x;
        String str6 = this.f95405y;
        return "AccountInfo(email=" + str + ", firstName=" + str2 + ", lastName=" + str3 + ", birthDate=" + str4 + ", civility=" + civilityTitle + ", cgu=" + str5 + ", listCards=" + list + ", listAddress=" + list2 + ", listPhone=" + list3 + ", dateOfSave=" + j + ", lastModification=" + str6 + ")";
    }

    @C12579k
    /* renamed from: u */
    public final String mo116667u() {
        return this.f95397c;
    }

    @C12579k
    /* renamed from: v */
    public final List<Address> mo116668v() {
        return this.f95402v;
    }

    @C12579k
    /* renamed from: w */
    public final List<UserCards> mo116669w() {
        return this.f95401g;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95395a);
        parcel.writeString(this.f95396b);
        parcel.writeString(this.f95397c);
        parcel.writeString(this.f95398d);
        CivilityTitle civilityTitle = this.f95399e;
        if (civilityTitle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            civilityTitle.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f95400f);
        List<UserCards> list = this.f95401g;
        parcel.writeInt(list.size());
        for (UserCards writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        List<Address> list2 = this.f95402v;
        parcel.writeInt(list2.size());
        for (Address writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, i);
        }
        List<Phone> list3 = this.f95403w;
        parcel.writeInt(list3.size());
        for (Phone writeToParcel3 : list3) {
            writeToParcel3.writeToParcel(parcel, i);
        }
        parcel.writeLong(this.f95404x);
        parcel.writeString(this.f95405y);
    }

    @C12579k
    /* renamed from: x */
    public final List<Phone> mo116671x() {
        return this.f95403w;
    }

    public AccountInfo(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12580l CivilityTitle civilityTitle, @C12579k String str5, @C12579k List<UserCards> list, @C12579k List<Address> list2, @C12579k List<Phone> list3, long j, @C12579k String str6) {
        Intrinsics.checkNotNullParameter(str, "email");
        Intrinsics.checkNotNullParameter(str2, "firstName");
        Intrinsics.checkNotNullParameter(str3, "lastName");
        Intrinsics.checkNotNullParameter(str4, "birthDate");
        Intrinsics.checkNotNullParameter(str5, C28573o0.f69650b);
        Intrinsics.checkNotNullParameter(list, "listCards");
        Intrinsics.checkNotNullParameter(list2, "listAddress");
        Intrinsics.checkNotNullParameter(list3, "listPhone");
        Intrinsics.checkNotNullParameter(str6, "lastModification");
        this.f95395a = str;
        this.f95396b = str2;
        this.f95397c = str3;
        this.f95398d = str4;
        this.f95399e = civilityTitle;
        this.f95400f = str5;
        this.f95401g = list;
        this.f95402v = list2;
        this.f95403w = list3;
        this.f95404x = j;
        this.f95405y = str6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AccountInfo(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, com.carrefour.fid.android.domain.models.account.CivilityTitle r17, java.lang.String r18, java.util.List r19, java.util.List r20, java.util.List r21, long r22, java.lang.String r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r12 = this;
            r0 = r25
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000c
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            goto L_0x000d
        L_0x000c:
            r1 = r13
        L_0x000d:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0017
            java.lang.String r2 = new java.lang.String
            r2.<init>()
            goto L_0x0018
        L_0x0017:
            r2 = r14
        L_0x0018:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0022
            java.lang.String r3 = new java.lang.String
            r3.<init>()
            goto L_0x0023
        L_0x0022:
            r3 = r15
        L_0x0023:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x002d
            java.lang.String r4 = new java.lang.String
            r4.<init>()
            goto L_0x002f
        L_0x002d:
            r4 = r16
        L_0x002f:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x0035
            r5 = 0
            goto L_0x0037
        L_0x0035:
            r5 = r17
        L_0x0037:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0041
            java.lang.String r6 = new java.lang.String
            r6.<init>()
            goto L_0x0043
        L_0x0041:
            r6 = r18
        L_0x0043:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x004c
            java.util.List r7 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x004e
        L_0x004c:
            r7 = r19
        L_0x004e:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0057
            java.util.List r8 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0059
        L_0x0057:
            r8 = r20
        L_0x0059:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x0062
            java.util.List r9 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0064
        L_0x0062:
            r9 = r21
        L_0x0064:
            r10 = r0 & 512(0x200, float:7.175E-43)
            if (r10 == 0) goto L_0x006b
            r10 = 0
            goto L_0x006d
        L_0x006b:
            r10 = r22
        L_0x006d:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = new java.lang.String
            r0.<init>()
            goto L_0x0079
        L_0x0077:
            r0 = r24
        L_0x0079:
            r13 = r12
            r14 = r1
            r15 = r2
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r9
            r23 = r10
            r25 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.account.AccountInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.carrefour.fid.android.domain.models.account.CivilityTitle, java.lang.String, java.util.List, java.util.List, java.util.List, long, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
