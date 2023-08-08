package com.carrefour.fid.android.domain.models.catalog.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C40802q;
import com.usabilla.sdk.ubform.p007db.campaign.CampaignTable;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\b\u0018\u00002\u00020\u0001B©\u0001\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0002\u0012\b\b\u0002\u0010!\u001a\u00020\u0002¢\u0006\u0004\bF\u0010GJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0002HÆ\u0003J«\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u0002HÆ\u0001J\t\u0010#\u001a\u00020\u0002HÖ\u0001J\t\u0010%\u001a\u00020$HÖ\u0001J\u0013\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010*\u001a\u00020$HÖ\u0001J\u0019\u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020$HÖ\u0001R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b3\u00102R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b7\u00102R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b8\u00102R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b9\u00102R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\b:\u00102R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u00100\u001a\u0004\b<\u00102R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u00100\u001a\u0004\b=\u00102R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u00100\u001a\u0004\b>\u00102R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b?\u00104\u001a\u0004\b@\u00106R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u00100\u001a\u0004\bA\u00102R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u00100\u001a\u0004\b?\u00102R\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u00100\u001a\u0004\b;\u00102R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u00100\u001a\u0004\bE\u00102¨\u0006H"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/catalog/details/CatalogHeaderDetails;", "Landroid/os/Parcelable;", "", "a", "h", "", "i", "j", "k", "l", "m", "n", "o", "b", "c", "d", "e", "f", "g", "name", "validityStartDate", "stores", "validityEndDate", "lastModified", "startDate", "endDate", "speed", "storeFormat", "numberOfPage", "displayTargets", "slug", "order", "local", "id", "p", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "w", "()Ljava/lang/String;", "F", "Ljava/util/List;", "D", "()Ljava/util/List;", "E", "u", "B", "s", "v", "A", "C", "x", "y", "r", "z", "X", "Y", "Z", "t", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class CatalogHeaderDetails implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<CatalogHeaderDetails> CREATOR = new C37983a();
    @C12579k

    /* renamed from: X */
    public final String f95576X;
    @C12579k

    /* renamed from: Y */
    public final String f95577Y;
    @C12579k

    /* renamed from: Z */
    public final String f95578Z;
    @C12579k

    /* renamed from: a */
    public final String f95579a;
    @C12579k

    /* renamed from: b */
    public final String f95580b;
    @C12579k

    /* renamed from: c */
    public final List<String> f95581c;
    @C12579k

    /* renamed from: d */
    public final String f95582d;
    @C12579k

    /* renamed from: e */
    public final String f95583e;
    @C12579k

    /* renamed from: f */
    public final String f95584f;
    @C12579k

    /* renamed from: g */
    public final String f95585g;
    @C12579k

    /* renamed from: v */
    public final String f95586v;
    @C12579k

    /* renamed from: w */
    public final String f95587w;
    @C12579k

    /* renamed from: x */
    public final String f95588x;
    @C12579k

    /* renamed from: y */
    public final List<String> f95589y;
    @C12579k

    /* renamed from: z */
    public final String f95590z;

    /* renamed from: com.carrefour.fid.android.domain.models.catalog.details.CatalogHeaderDetails$a */
    public static final class C37983a implements Parcelable.Creator<CatalogHeaderDetails> {
        @C12579k
        /* renamed from: a */
        public final CatalogHeaderDetails createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CatalogHeaderDetails(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final CatalogHeaderDetails[] newArray(int i) {
            return new CatalogHeaderDetails[i];
        }
    }

    public CatalogHeaderDetails() {
        this((String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null);
    }

    /* renamed from: q */
    public static /* synthetic */ CatalogHeaderDetails m156267q(CatalogHeaderDetails catalogHeaderDetails, String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list2, String str10, String str11, String str12, String str13, int i, Object obj) {
        CatalogHeaderDetails catalogHeaderDetails2 = catalogHeaderDetails;
        int i2 = i;
        return catalogHeaderDetails.mo117170p((i2 & 1) != 0 ? catalogHeaderDetails2.f95579a : str, (i2 & 2) != 0 ? catalogHeaderDetails2.f95580b : str2, (i2 & 4) != 0 ? catalogHeaderDetails2.f95581c : list, (i2 & 8) != 0 ? catalogHeaderDetails2.f95582d : str3, (i2 & 16) != 0 ? catalogHeaderDetails2.f95583e : str4, (i2 & 32) != 0 ? catalogHeaderDetails2.f95584f : str5, (i2 & 64) != 0 ? catalogHeaderDetails2.f95585g : str6, (i2 & 128) != 0 ? catalogHeaderDetails2.f95586v : str7, (i2 & 256) != 0 ? catalogHeaderDetails2.f95587w : str8, (i2 & 512) != 0 ? catalogHeaderDetails2.f95588x : str9, (i2 & 1024) != 0 ? catalogHeaderDetails2.f95589y : list2, (i2 & 2048) != 0 ? catalogHeaderDetails2.f95590z : str10, (i2 & 4096) != 0 ? catalogHeaderDetails2.f95576X : str11, (i2 & 8192) != 0 ? catalogHeaderDetails2.f95577Y : str12, (i2 & 16384) != 0 ? catalogHeaderDetails2.f95578Z : str13);
    }

    @C12579k
    /* renamed from: A */
    public final String mo117146A() {
        return this.f95586v;
    }

    @C12579k
    /* renamed from: B */
    public final String mo117147B() {
        return this.f95584f;
    }

    @C12579k
    /* renamed from: C */
    public final String mo117148C() {
        return this.f95587w;
    }

    @C12579k
    /* renamed from: D */
    public final List<String> mo117149D() {
        return this.f95581c;
    }

    @C12579k
    /* renamed from: E */
    public final String mo117150E() {
        return this.f95582d;
    }

    @C12579k
    /* renamed from: F */
    public final String mo117151F() {
        return this.f95580b;
    }

    @C12579k
    /* renamed from: a */
    public final String mo117152a() {
        return this.f95579a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo117153b() {
        return this.f95588x;
    }

    @C12579k
    /* renamed from: c */
    public final List<String> mo117154c() {
        return this.f95589y;
    }

    @C12579k
    /* renamed from: d */
    public final String mo117155d() {
        return this.f95590z;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final String mo117157e() {
        return this.f95576X;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogHeaderDetails)) {
            return false;
        }
        CatalogHeaderDetails catalogHeaderDetails = (CatalogHeaderDetails) obj;
        return Intrinsics.areEqual((Object) this.f95579a, (Object) catalogHeaderDetails.f95579a) && Intrinsics.areEqual((Object) this.f95580b, (Object) catalogHeaderDetails.f95580b) && Intrinsics.areEqual((Object) this.f95581c, (Object) catalogHeaderDetails.f95581c) && Intrinsics.areEqual((Object) this.f95582d, (Object) catalogHeaderDetails.f95582d) && Intrinsics.areEqual((Object) this.f95583e, (Object) catalogHeaderDetails.f95583e) && Intrinsics.areEqual((Object) this.f95584f, (Object) catalogHeaderDetails.f95584f) && Intrinsics.areEqual((Object) this.f95585g, (Object) catalogHeaderDetails.f95585g) && Intrinsics.areEqual((Object) this.f95586v, (Object) catalogHeaderDetails.f95586v) && Intrinsics.areEqual((Object) this.f95587w, (Object) catalogHeaderDetails.f95587w) && Intrinsics.areEqual((Object) this.f95588x, (Object) catalogHeaderDetails.f95588x) && Intrinsics.areEqual((Object) this.f95589y, (Object) catalogHeaderDetails.f95589y) && Intrinsics.areEqual((Object) this.f95590z, (Object) catalogHeaderDetails.f95590z) && Intrinsics.areEqual((Object) this.f95576X, (Object) catalogHeaderDetails.f95576X) && Intrinsics.areEqual((Object) this.f95577Y, (Object) catalogHeaderDetails.f95577Y) && Intrinsics.areEqual((Object) this.f95578Z, (Object) catalogHeaderDetails.f95578Z);
    }

    @C12579k
    /* renamed from: f */
    public final String mo117159f() {
        return this.f95577Y;
    }

    @C12579k
    /* renamed from: g */
    public final String mo117160g() {
        return this.f95578Z;
    }

    @C12579k
    /* renamed from: h */
    public final String mo117161h() {
        return this.f95580b;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.f95579a.hashCode() * 31) + this.f95580b.hashCode()) * 31) + this.f95581c.hashCode()) * 31) + this.f95582d.hashCode()) * 31) + this.f95583e.hashCode()) * 31) + this.f95584f.hashCode()) * 31) + this.f95585g.hashCode()) * 31) + this.f95586v.hashCode()) * 31) + this.f95587w.hashCode()) * 31) + this.f95588x.hashCode()) * 31) + this.f95589y.hashCode()) * 31) + this.f95590z.hashCode()) * 31) + this.f95576X.hashCode()) * 31) + this.f95577Y.hashCode()) * 31) + this.f95578Z.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final List<String> mo117163i() {
        return this.f95581c;
    }

    @C12579k
    /* renamed from: j */
    public final String mo117164j() {
        return this.f95582d;
    }

    @C12579k
    /* renamed from: k */
    public final String mo117165k() {
        return this.f95583e;
    }

    @C12579k
    /* renamed from: l */
    public final String mo117166l() {
        return this.f95584f;
    }

    @C12579k
    /* renamed from: m */
    public final String mo117167m() {
        return this.f95585g;
    }

    @C12579k
    /* renamed from: n */
    public final String mo117168n() {
        return this.f95586v;
    }

    @C12579k
    /* renamed from: o */
    public final String mo117169o() {
        return this.f95587w;
    }

    @C12579k
    /* renamed from: p */
    public final CatalogHeaderDetails mo117170p(@C12579k String str, @C12579k String str2, @C12579k List<String> list, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7, @C12579k String str8, @C12579k String str9, @C12579k List<String> list2, @C12579k String str10, @C12579k String str11, @C12579k String str12, @C12579k String str13) {
        String str14 = str;
        Intrinsics.checkNotNullParameter(str14, "name");
        String str15 = str2;
        Intrinsics.checkNotNullParameter(str15, "validityStartDate");
        List<String> list3 = list;
        Intrinsics.checkNotNullParameter(list3, "stores");
        String str16 = str3;
        Intrinsics.checkNotNullParameter(str16, "validityEndDate");
        String str17 = str4;
        Intrinsics.checkNotNullParameter(str17, CampaignTable.f26812l);
        String str18 = str5;
        Intrinsics.checkNotNullParameter(str18, "startDate");
        String str19 = str6;
        Intrinsics.checkNotNullParameter(str19, "endDate");
        String str20 = str7;
        Intrinsics.checkNotNullParameter(str20, "speed");
        String str21 = str8;
        Intrinsics.checkNotNullParameter(str21, "storeFormat");
        String str22 = str9;
        Intrinsics.checkNotNullParameter(str22, "numberOfPage");
        List<String> list4 = list2;
        Intrinsics.checkNotNullParameter(list4, "displayTargets");
        String str23 = str10;
        Intrinsics.checkNotNullParameter(str23, "slug");
        String str24 = str11;
        Intrinsics.checkNotNullParameter(str24, "order");
        String str25 = str12;
        Intrinsics.checkNotNullParameter(str25, C40802q.f103911b);
        Intrinsics.checkNotNullParameter(str13, "id");
        return new CatalogHeaderDetails(str14, str15, list3, str16, str17, str18, str19, str20, str21, str22, list4, str23, str24, str25, str13);
    }

    @C12579k
    /* renamed from: r */
    public final List<String> mo117171r() {
        return this.f95589y;
    }

    @C12579k
    /* renamed from: s */
    public final String mo117172s() {
        return this.f95585g;
    }

    @C12579k
    /* renamed from: t */
    public final String mo117173t() {
        return this.f95578Z;
    }

    @C12579k
    public String toString() {
        String str = this.f95579a;
        String str2 = this.f95580b;
        List<String> list = this.f95581c;
        String str3 = this.f95582d;
        String str4 = this.f95583e;
        String str5 = this.f95584f;
        String str6 = this.f95585g;
        String str7 = this.f95586v;
        String str8 = this.f95587w;
        String str9 = this.f95588x;
        List<String> list2 = this.f95589y;
        String str10 = this.f95590z;
        String str11 = this.f95576X;
        String str12 = this.f95577Y;
        String str13 = this.f95578Z;
        return "CatalogHeaderDetails(name=" + str + ", validityStartDate=" + str2 + ", stores=" + list + ", validityEndDate=" + str3 + ", lastModified=" + str4 + ", startDate=" + str5 + ", endDate=" + str6 + ", speed=" + str7 + ", storeFormat=" + str8 + ", numberOfPage=" + str9 + ", displayTargets=" + list2 + ", slug=" + str10 + ", order=" + str11 + ", local=" + str12 + ", id=" + str13 + ")";
    }

    @C12579k
    /* renamed from: u */
    public final String mo117175u() {
        return this.f95583e;
    }

    @C12579k
    /* renamed from: v */
    public final String mo117176v() {
        return this.f95577Y;
    }

    @C12579k
    /* renamed from: w */
    public final String mo117177w() {
        return this.f95579a;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95579a);
        parcel.writeString(this.f95580b);
        parcel.writeStringList(this.f95581c);
        parcel.writeString(this.f95582d);
        parcel.writeString(this.f95583e);
        parcel.writeString(this.f95584f);
        parcel.writeString(this.f95585g);
        parcel.writeString(this.f95586v);
        parcel.writeString(this.f95587w);
        parcel.writeString(this.f95588x);
        parcel.writeStringList(this.f95589y);
        parcel.writeString(this.f95590z);
        parcel.writeString(this.f95576X);
        parcel.writeString(this.f95577Y);
        parcel.writeString(this.f95578Z);
    }

    @C12579k
    /* renamed from: x */
    public final String mo117179x() {
        return this.f95588x;
    }

    @C12579k
    /* renamed from: y */
    public final String mo117180y() {
        return this.f95576X;
    }

    @C12579k
    /* renamed from: z */
    public final String mo117181z() {
        return this.f95590z;
    }

    public CatalogHeaderDetails(@C12579k String str, @C12579k String str2, @C12579k List<String> list, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7, @C12579k String str8, @C12579k String str9, @C12579k List<String> list2, @C12579k String str10, @C12579k String str11, @C12579k String str12, @C12579k String str13) {
        String str14 = str;
        String str15 = str2;
        List<String> list3 = list;
        String str16 = str3;
        String str17 = str4;
        String str18 = str5;
        String str19 = str6;
        String str20 = str7;
        String str21 = str8;
        String str22 = str9;
        List<String> list4 = list2;
        String str23 = str10;
        String str24 = str11;
        String str25 = str12;
        String str26 = str13;
        Intrinsics.checkNotNullParameter(str14, "name");
        Intrinsics.checkNotNullParameter(str15, "validityStartDate");
        Intrinsics.checkNotNullParameter(list3, "stores");
        Intrinsics.checkNotNullParameter(str16, "validityEndDate");
        Intrinsics.checkNotNullParameter(str17, CampaignTable.f26812l);
        Intrinsics.checkNotNullParameter(str18, "startDate");
        Intrinsics.checkNotNullParameter(str19, "endDate");
        Intrinsics.checkNotNullParameter(str20, "speed");
        Intrinsics.checkNotNullParameter(str21, "storeFormat");
        Intrinsics.checkNotNullParameter(str22, "numberOfPage");
        Intrinsics.checkNotNullParameter(list4, "displayTargets");
        Intrinsics.checkNotNullParameter(str23, "slug");
        Intrinsics.checkNotNullParameter(str24, "order");
        Intrinsics.checkNotNullParameter(str25, C40802q.f103911b);
        Intrinsics.checkNotNullParameter(str26, "id");
        this.f95579a = str14;
        this.f95580b = str15;
        this.f95581c = list3;
        this.f95582d = str16;
        this.f95583e = str17;
        this.f95584f = str18;
        this.f95585g = str19;
        this.f95586v = str20;
        this.f95587w = str21;
        this.f95588x = str22;
        this.f95589y = list4;
        this.f95590z = str23;
        this.f95576X = str24;
        this.f95577Y = str25;
        this.f95578Z = str26;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CatalogHeaderDetails(java.lang.String r16, java.lang.String r17, java.util.List r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.util.List r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r15 = this;
            r0 = r31
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000c
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            goto L_0x000e
        L_0x000c:
            r1 = r16
        L_0x000e:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = new java.lang.String
            r2.<init>()
            goto L_0x001a
        L_0x0018:
            r2 = r17
        L_0x001a:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0023
            java.util.List r3 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0025
        L_0x0023:
            r3 = r18
        L_0x0025:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x002f
            java.lang.String r4 = new java.lang.String
            r4.<init>()
            goto L_0x0031
        L_0x002f:
            r4 = r19
        L_0x0031:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x003b
            java.lang.String r5 = new java.lang.String
            r5.<init>()
            goto L_0x003d
        L_0x003b:
            r5 = r20
        L_0x003d:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0047
            java.lang.String r6 = new java.lang.String
            r6.<init>()
            goto L_0x0049
        L_0x0047:
            r6 = r21
        L_0x0049:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x0053
            java.lang.String r7 = new java.lang.String
            r7.<init>()
            goto L_0x0055
        L_0x0053:
            r7 = r22
        L_0x0055:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x005f
            java.lang.String r8 = new java.lang.String
            r8.<init>()
            goto L_0x0061
        L_0x005f:
            r8 = r23
        L_0x0061:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x006b
            java.lang.String r9 = new java.lang.String
            r9.<init>()
            goto L_0x006d
        L_0x006b:
            r9 = r24
        L_0x006d:
            r10 = r0 & 512(0x200, float:7.175E-43)
            if (r10 == 0) goto L_0x0077
            java.lang.String r10 = new java.lang.String
            r10.<init>()
            goto L_0x0079
        L_0x0077:
            r10 = r25
        L_0x0079:
            r11 = r0 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x0082
            java.util.List r11 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0084
        L_0x0082:
            r11 = r26
        L_0x0084:
            r12 = r0 & 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L_0x008e
            java.lang.String r12 = new java.lang.String
            r12.<init>()
            goto L_0x0090
        L_0x008e:
            r12 = r27
        L_0x0090:
            r13 = r0 & 4096(0x1000, float:5.74E-42)
            if (r13 == 0) goto L_0x009a
            java.lang.String r13 = new java.lang.String
            r13.<init>()
            goto L_0x009c
        L_0x009a:
            r13 = r28
        L_0x009c:
            r14 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r14 == 0) goto L_0x00a6
            java.lang.String r14 = new java.lang.String
            r14.<init>()
            goto L_0x00a8
        L_0x00a6:
            r14 = r29
        L_0x00a8:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x00b2
            java.lang.String r0 = new java.lang.String
            r0.<init>()
            goto L_0x00b4
        L_0x00b2:
            r0 = r30
        L_0x00b4:
            r16 = r15
            r17 = r1
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r9
            r26 = r10
            r27 = r11
            r28 = r12
            r29 = r13
            r30 = r14
            r31 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.catalog.details.CatalogHeaderDetails.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
