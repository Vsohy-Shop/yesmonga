package com.carrefour.fid.android.domain.models.catalog;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C40802q;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u001f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\b\u0018\u00002\u00020\u0001B©\u0001\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0002\u0012\b\b\u0002\u0010!\u001a\u00020\u0002¢\u0006\u0004\bF\u0010GJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0002HÆ\u0003J«\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00022\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u0002HÆ\u0001J\t\u0010#\u001a\u00020\u0002HÖ\u0001J\t\u0010%\u001a\u00020$HÖ\u0001J\u0013\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010*\u001a\u00020$HÖ\u0001J\u0019\u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020$HÖ\u0001R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u00102R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b6\u00102R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b7\u00102R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u00103\u001a\u0004\b8\u00105R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b9\u00102R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\b:\u00102R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u00100\u001a\u0004\b<\u00102R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u00100\u001a\u0004\b=\u00102R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u00100\u001a\u0004\b?\u00102R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u00100\u001a\u0004\b>\u00102R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u00100\u001a\u0004\bA\u00102R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u00100\u001a\u0004\b@\u00102R\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u00100\u001a\u0004\b;\u00102R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u00100\u001a\u0004\bE\u00102¨\u0006H"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/catalog/Catalog;", "Landroid/os/Parcelable;", "", "a", "", "h", "i", "j", "k", "l", "m", "n", "o", "b", "c", "d", "e", "f", "g", "id", "displayTargets", "name", "validityStartDate", "stores", "validityEndDate", "startDate", "endDate", "speed", "storeFormat", "numberOfPage", "slug", "order", "local", "coverUrl", "p", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "u", "()Ljava/lang/String;", "Ljava/util/List;", "s", "()Ljava/util/List;", "w", "F", "D", "E", "B", "v", "t", "A", "x", "C", "y", "z", "X", "Y", "Z", "r", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class Catalog implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<Catalog> CREATOR = new C37975a();
    @C12579k

    /* renamed from: X */
    public final String f95548X;
    @C12579k

    /* renamed from: Y */
    public final String f95549Y;
    @C12579k

    /* renamed from: Z */
    public final String f95550Z;
    @C12579k

    /* renamed from: a */
    public final String f95551a;
    @C12579k

    /* renamed from: b */
    public final List<String> f95552b;
    @C12579k

    /* renamed from: c */
    public final String f95553c;
    @C12579k

    /* renamed from: d */
    public final String f95554d;
    @C12579k

    /* renamed from: e */
    public final List<String> f95555e;
    @C12579k

    /* renamed from: f */
    public final String f95556f;
    @C12579k

    /* renamed from: g */
    public final String f95557g;
    @C12579k

    /* renamed from: v */
    public final String f95558v;
    @C12579k

    /* renamed from: w */
    public final String f95559w;
    @C12579k

    /* renamed from: x */
    public final String f95560x;
    @C12579k

    /* renamed from: y */
    public final String f95561y;
    @C12579k

    /* renamed from: z */
    public final String f95562z;

    /* renamed from: com.carrefour.fid.android.domain.models.catalog.Catalog$a */
    public static final class C37975a implements Parcelable.Creator<Catalog> {
        @C12579k
        /* renamed from: a */
        public final Catalog createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Catalog(parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final Catalog[] newArray(int i) {
            return new Catalog[i];
        }
    }

    public Catalog() {
        this((String) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null);
    }

    /* renamed from: q */
    public static /* synthetic */ Catalog m156183q(Catalog catalog, String str, List list, String str2, String str3, List list2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, Object obj) {
        Catalog catalog2 = catalog;
        int i2 = i;
        return catalog.mo117068p((i2 & 1) != 0 ? catalog2.f95551a : str, (i2 & 2) != 0 ? catalog2.f95552b : list, (i2 & 4) != 0 ? catalog2.f95553c : str2, (i2 & 8) != 0 ? catalog2.f95554d : str3, (i2 & 16) != 0 ? catalog2.f95555e : list2, (i2 & 32) != 0 ? catalog2.f95556f : str4, (i2 & 64) != 0 ? catalog2.f95557g : str5, (i2 & 128) != 0 ? catalog2.f95558v : str6, (i2 & 256) != 0 ? catalog2.f95559w : str7, (i2 & 512) != 0 ? catalog2.f95560x : str8, (i2 & 1024) != 0 ? catalog2.f95561y : str9, (i2 & 2048) != 0 ? catalog2.f95562z : str10, (i2 & 4096) != 0 ? catalog2.f95548X : str11, (i2 & 8192) != 0 ? catalog2.f95549Y : str12, (i2 & 16384) != 0 ? catalog2.f95550Z : str13);
    }

    @C12579k
    /* renamed from: A */
    public final String mo117044A() {
        return this.f95559w;
    }

    @C12579k
    /* renamed from: B */
    public final String mo117045B() {
        return this.f95557g;
    }

    @C12579k
    /* renamed from: C */
    public final String mo117046C() {
        return this.f95560x;
    }

    @C12579k
    /* renamed from: D */
    public final List<String> mo117047D() {
        return this.f95555e;
    }

    @C12579k
    /* renamed from: E */
    public final String mo117048E() {
        return this.f95556f;
    }

    @C12579k
    /* renamed from: F */
    public final String mo117049F() {
        return this.f95554d;
    }

    @C12579k
    /* renamed from: a */
    public final String mo117050a() {
        return this.f95551a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo117051b() {
        return this.f95560x;
    }

    @C12579k
    /* renamed from: c */
    public final String mo117052c() {
        return this.f95561y;
    }

    @C12579k
    /* renamed from: d */
    public final String mo117053d() {
        return this.f95562z;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final String mo117055e() {
        return this.f95548X;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Catalog)) {
            return false;
        }
        Catalog catalog = (Catalog) obj;
        return Intrinsics.areEqual((Object) this.f95551a, (Object) catalog.f95551a) && Intrinsics.areEqual((Object) this.f95552b, (Object) catalog.f95552b) && Intrinsics.areEqual((Object) this.f95553c, (Object) catalog.f95553c) && Intrinsics.areEqual((Object) this.f95554d, (Object) catalog.f95554d) && Intrinsics.areEqual((Object) this.f95555e, (Object) catalog.f95555e) && Intrinsics.areEqual((Object) this.f95556f, (Object) catalog.f95556f) && Intrinsics.areEqual((Object) this.f95557g, (Object) catalog.f95557g) && Intrinsics.areEqual((Object) this.f95558v, (Object) catalog.f95558v) && Intrinsics.areEqual((Object) this.f95559w, (Object) catalog.f95559w) && Intrinsics.areEqual((Object) this.f95560x, (Object) catalog.f95560x) && Intrinsics.areEqual((Object) this.f95561y, (Object) catalog.f95561y) && Intrinsics.areEqual((Object) this.f95562z, (Object) catalog.f95562z) && Intrinsics.areEqual((Object) this.f95548X, (Object) catalog.f95548X) && Intrinsics.areEqual((Object) this.f95549Y, (Object) catalog.f95549Y) && Intrinsics.areEqual((Object) this.f95550Z, (Object) catalog.f95550Z);
    }

    @C12579k
    /* renamed from: f */
    public final String mo117057f() {
        return this.f95549Y;
    }

    @C12579k
    /* renamed from: g */
    public final String mo117058g() {
        return this.f95550Z;
    }

    @C12579k
    /* renamed from: h */
    public final List<String> mo117059h() {
        return this.f95552b;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.f95551a.hashCode() * 31) + this.f95552b.hashCode()) * 31) + this.f95553c.hashCode()) * 31) + this.f95554d.hashCode()) * 31) + this.f95555e.hashCode()) * 31) + this.f95556f.hashCode()) * 31) + this.f95557g.hashCode()) * 31) + this.f95558v.hashCode()) * 31) + this.f95559w.hashCode()) * 31) + this.f95560x.hashCode()) * 31) + this.f95561y.hashCode()) * 31) + this.f95562z.hashCode()) * 31) + this.f95548X.hashCode()) * 31) + this.f95549Y.hashCode()) * 31) + this.f95550Z.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final String mo117061i() {
        return this.f95553c;
    }

    @C12579k
    /* renamed from: j */
    public final String mo117062j() {
        return this.f95554d;
    }

    @C12579k
    /* renamed from: k */
    public final List<String> mo117063k() {
        return this.f95555e;
    }

    @C12579k
    /* renamed from: l */
    public final String mo117064l() {
        return this.f95556f;
    }

    @C12579k
    /* renamed from: m */
    public final String mo117065m() {
        return this.f95557g;
    }

    @C12579k
    /* renamed from: n */
    public final String mo117066n() {
        return this.f95558v;
    }

    @C12579k
    /* renamed from: o */
    public final String mo117067o() {
        return this.f95559w;
    }

    @C12579k
    /* renamed from: p */
    public final Catalog mo117068p(@C12579k String str, @C12579k List<String> list, @C12579k String str2, @C12579k String str3, @C12579k List<String> list2, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7, @C12579k String str8, @C12579k String str9, @C12579k String str10, @C12579k String str11, @C12579k String str12, @C12579k String str13) {
        String str14 = str;
        Intrinsics.checkNotNullParameter(str14, "id");
        List<String> list3 = list;
        Intrinsics.checkNotNullParameter(list3, "displayTargets");
        String str15 = str2;
        Intrinsics.checkNotNullParameter(str15, "name");
        String str16 = str3;
        Intrinsics.checkNotNullParameter(str16, "validityStartDate");
        List<String> list4 = list2;
        Intrinsics.checkNotNullParameter(list4, "stores");
        String str17 = str4;
        Intrinsics.checkNotNullParameter(str17, "validityEndDate");
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
        String str23 = str10;
        Intrinsics.checkNotNullParameter(str23, "slug");
        String str24 = str11;
        Intrinsics.checkNotNullParameter(str24, "order");
        String str25 = str12;
        Intrinsics.checkNotNullParameter(str25, C40802q.f103911b);
        Intrinsics.checkNotNullParameter(str13, "coverUrl");
        return new Catalog(str14, list3, str15, str16, list4, str17, str18, str19, str20, str21, str22, str23, str24, str25, str13);
    }

    @C12579k
    /* renamed from: r */
    public final String mo117069r() {
        return this.f95550Z;
    }

    @C12579k
    /* renamed from: s */
    public final List<String> mo117070s() {
        return this.f95552b;
    }

    @C12579k
    /* renamed from: t */
    public final String mo117071t() {
        return this.f95558v;
    }

    @C12579k
    public String toString() {
        String str = this.f95551a;
        List<String> list = this.f95552b;
        String str2 = this.f95553c;
        String str3 = this.f95554d;
        List<String> list2 = this.f95555e;
        String str4 = this.f95556f;
        String str5 = this.f95557g;
        String str6 = this.f95558v;
        String str7 = this.f95559w;
        String str8 = this.f95560x;
        String str9 = this.f95561y;
        String str10 = this.f95562z;
        String str11 = this.f95548X;
        String str12 = this.f95549Y;
        String str13 = this.f95550Z;
        return "Catalog(id=" + str + ", displayTargets=" + list + ", name=" + str2 + ", validityStartDate=" + str3 + ", stores=" + list2 + ", validityEndDate=" + str4 + ", startDate=" + str5 + ", endDate=" + str6 + ", speed=" + str7 + ", storeFormat=" + str8 + ", numberOfPage=" + str9 + ", slug=" + str10 + ", order=" + str11 + ", local=" + str12 + ", coverUrl=" + str13 + ")";
    }

    @C12579k
    /* renamed from: u */
    public final String mo117073u() {
        return this.f95551a;
    }

    @C12579k
    /* renamed from: v */
    public final String mo117074v() {
        return this.f95549Y;
    }

    @C12579k
    /* renamed from: w */
    public final String mo117075w() {
        return this.f95553c;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95551a);
        parcel.writeStringList(this.f95552b);
        parcel.writeString(this.f95553c);
        parcel.writeString(this.f95554d);
        parcel.writeStringList(this.f95555e);
        parcel.writeString(this.f95556f);
        parcel.writeString(this.f95557g);
        parcel.writeString(this.f95558v);
        parcel.writeString(this.f95559w);
        parcel.writeString(this.f95560x);
        parcel.writeString(this.f95561y);
        parcel.writeString(this.f95562z);
        parcel.writeString(this.f95548X);
        parcel.writeString(this.f95549Y);
        parcel.writeString(this.f95550Z);
    }

    @C12579k
    /* renamed from: x */
    public final String mo117077x() {
        return this.f95561y;
    }

    @C12579k
    /* renamed from: y */
    public final String mo117078y() {
        return this.f95548X;
    }

    @C12579k
    /* renamed from: z */
    public final String mo117079z() {
        return this.f95562z;
    }

    public Catalog(@C12579k String str, @C12579k List<String> list, @C12579k String str2, @C12579k String str3, @C12579k List<String> list2, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7, @C12579k String str8, @C12579k String str9, @C12579k String str10, @C12579k String str11, @C12579k String str12, @C12579k String str13) {
        String str14 = str;
        List<String> list3 = list;
        String str15 = str2;
        String str16 = str3;
        List<String> list4 = list2;
        String str17 = str4;
        String str18 = str5;
        String str19 = str6;
        String str20 = str7;
        String str21 = str8;
        String str22 = str9;
        String str23 = str10;
        String str24 = str11;
        String str25 = str12;
        String str26 = str13;
        Intrinsics.checkNotNullParameter(str14, "id");
        Intrinsics.checkNotNullParameter(list3, "displayTargets");
        Intrinsics.checkNotNullParameter(str15, "name");
        Intrinsics.checkNotNullParameter(str16, "validityStartDate");
        Intrinsics.checkNotNullParameter(list4, "stores");
        Intrinsics.checkNotNullParameter(str17, "validityEndDate");
        Intrinsics.checkNotNullParameter(str18, "startDate");
        Intrinsics.checkNotNullParameter(str19, "endDate");
        Intrinsics.checkNotNullParameter(str20, "speed");
        Intrinsics.checkNotNullParameter(str21, "storeFormat");
        Intrinsics.checkNotNullParameter(str22, "numberOfPage");
        Intrinsics.checkNotNullParameter(str23, "slug");
        Intrinsics.checkNotNullParameter(str24, "order");
        Intrinsics.checkNotNullParameter(str25, C40802q.f103911b);
        Intrinsics.checkNotNullParameter(str26, "coverUrl");
        this.f95551a = str14;
        this.f95552b = list3;
        this.f95553c = str15;
        this.f95554d = str16;
        this.f95555e = list4;
        this.f95556f = str17;
        this.f95557g = str18;
        this.f95558v = str19;
        this.f95559w = str20;
        this.f95560x = str21;
        this.f95561y = str22;
        this.f95562z = str23;
        this.f95548X = str24;
        this.f95549Y = str25;
        this.f95550Z = str26;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Catalog(java.lang.String r16, java.util.List r17, java.lang.String r18, java.lang.String r19, java.util.List r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
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
            if (r2 == 0) goto L_0x0017
            java.util.List r2 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0019
        L_0x0017:
            r2 = r17
        L_0x0019:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0023
            java.lang.String r3 = new java.lang.String
            r3.<init>()
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
            if (r5 == 0) goto L_0x003a
            java.util.List r5 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x003c
        L_0x003a:
            r5 = r20
        L_0x003c:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0046
            java.lang.String r6 = new java.lang.String
            r6.<init>()
            goto L_0x0048
        L_0x0046:
            r6 = r21
        L_0x0048:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x0052
            java.lang.String r7 = new java.lang.String
            r7.<init>()
            goto L_0x0054
        L_0x0052:
            r7 = r22
        L_0x0054:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x005e
            java.lang.String r8 = new java.lang.String
            r8.<init>()
            goto L_0x0060
        L_0x005e:
            r8 = r23
        L_0x0060:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x006a
            java.lang.String r9 = new java.lang.String
            r9.<init>()
            goto L_0x006c
        L_0x006a:
            r9 = r24
        L_0x006c:
            r10 = r0 & 512(0x200, float:7.175E-43)
            if (r10 == 0) goto L_0x0076
            java.lang.String r10 = new java.lang.String
            r10.<init>()
            goto L_0x0078
        L_0x0076:
            r10 = r25
        L_0x0078:
            r11 = r0 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x0082
            java.lang.String r11 = new java.lang.String
            r11.<init>()
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
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.catalog.Catalog.<init>(java.lang.String, java.util.List, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
