package com.carrefour.fid.android.domain.models.catalog.productdetails;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\b\u0018\u00002\u00020\u0001B£\u0001\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0002\u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\"\u001a\u00020\u0002\u0012\b\b\u0002\u0010#\u001a\u00020\u0002¢\u0006\u0004\bI\u0010JJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0002HÆ\u0003J¥\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u0002HÆ\u0001J\t\u0010%\u001a\u00020\u0002HÖ\u0001J\t\u0010&\u001a\u00020\u000bHÖ\u0001J\u0013\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010+\u001a\u00020\u000bHÖ\u0001J\u0019\u00100\u001a\u00020/2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b4\u00103R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b5\u00103R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b6\u00103R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u00101\u001a\u0004\b7\u00103R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u00101\u001a\u0004\b8\u00103R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u00101\u001a\u0004\b9\u00103R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b:\u00103R\u0017\u0010\u001d\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b2\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u00101\u001a\u0004\b?\u00103R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u00101\u001a\u0004\bA\u00103R\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b@\u00103R\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u00101\u001a\u0004\bG\u00103R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u00101\u001a\u0004\b>\u00103¨\u0006K"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/catalog/productdetails/CatalogProduct;", "Landroid/os/Parcelable;", "", "a", "h", "i", "j", "k", "l", "m", "n", "", "o", "b", "c", "d", "", "Lcom/carrefour/fid/android/domain/models/catalog/productdetails/CatalogProductDescription;", "e", "f", "g", "id", "catalogID", "ean", "name", "brand", "price", "promoImage", "shelf", "pageNum", "subShelf", "unitPrice", "legalInfo", "description", "catalogEndDate", "imageUrl", "p", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "w", "()Ljava/lang/String;", "t", "v", "z", "r", "B", "C", "D", "I", "A", "()I", "x", "E", "y", "F", "X", "Ljava/util/List;", "u", "()Ljava/util/List;", "Y", "s", "Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class CatalogProduct implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<CatalogProduct> CREATOR = new C37987a();
    @C12579k

    /* renamed from: X */
    public final List<CatalogProductDescription> f95595X;
    @C12579k

    /* renamed from: Y */
    public final String f95596Y;
    @C12579k

    /* renamed from: Z */
    public final String f95597Z;
    @C12579k

    /* renamed from: a */
    public final String f95598a;
    @C12579k

    /* renamed from: b */
    public final String f95599b;
    @C12579k

    /* renamed from: c */
    public final String f95600c;
    @C12579k

    /* renamed from: d */
    public final String f95601d;
    @C12579k

    /* renamed from: e */
    public final String f95602e;
    @C12579k

    /* renamed from: f */
    public final String f95603f;
    @C12579k

    /* renamed from: g */
    public final String f95604g;
    @C12579k

    /* renamed from: v */
    public final String f95605v;

    /* renamed from: w */
    public final int f95606w;
    @C12579k

    /* renamed from: x */
    public final String f95607x;
    @C12579k

    /* renamed from: y */
    public final String f95608y;
    @C12579k

    /* renamed from: z */
    public final String f95609z;

    /* renamed from: com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct$a */
    public static final class C37987a implements Parcelable.Creator<CatalogProduct> {
        @C12579k
        /* renamed from: a */
        public final CatalogProduct createFromParcel(@C12579k Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            int readInt = parcel.readInt();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                arrayList.add(CatalogProductDescription.CREATOR.createFromParcel(parcel2));
                i++;
                readInt2 = readInt2;
            }
            return new CatalogProduct(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readInt, readString9, readString10, readString11, arrayList, parcel.readString(), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final CatalogProduct[] newArray(int i) {
            return new CatalogProduct[i];
        }
    }

    public CatalogProduct() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null);
    }

    /* renamed from: q */
    public static /* synthetic */ CatalogProduct m156317q(CatalogProduct catalogProduct, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, String str10, String str11, List list, String str12, String str13, int i2, Object obj) {
        CatalogProduct catalogProduct2 = catalogProduct;
        int i3 = i2;
        return catalogProduct.mo117232p((i3 & 1) != 0 ? catalogProduct2.f95598a : str, (i3 & 2) != 0 ? catalogProduct2.f95599b : str2, (i3 & 4) != 0 ? catalogProduct2.f95600c : str3, (i3 & 8) != 0 ? catalogProduct2.f95601d : str4, (i3 & 16) != 0 ? catalogProduct2.f95602e : str5, (i3 & 32) != 0 ? catalogProduct2.f95603f : str6, (i3 & 64) != 0 ? catalogProduct2.f95604g : str7, (i3 & 128) != 0 ? catalogProduct2.f95605v : str8, (i3 & 256) != 0 ? catalogProduct2.f95606w : i, (i3 & 512) != 0 ? catalogProduct2.f95607x : str9, (i3 & 1024) != 0 ? catalogProduct2.f95608y : str10, (i3 & 2048) != 0 ? catalogProduct2.f95609z : str11, (i3 & 4096) != 0 ? catalogProduct2.f95595X : list, (i3 & 8192) != 0 ? catalogProduct2.f95596Y : str12, (i3 & 16384) != 0 ? catalogProduct2.f95597Z : str13);
    }

    /* renamed from: A */
    public final int mo117208A() {
        return this.f95606w;
    }

    @C12579k
    /* renamed from: B */
    public final String mo117209B() {
        return this.f95603f;
    }

    @C12579k
    /* renamed from: C */
    public final String mo117210C() {
        return this.f95604g;
    }

    @C12579k
    /* renamed from: D */
    public final String mo117211D() {
        return this.f95605v;
    }

    @C12579k
    /* renamed from: E */
    public final String mo117212E() {
        return this.f95607x;
    }

    @C12579k
    /* renamed from: F */
    public final String mo117213F() {
        return this.f95608y;
    }

    @C12579k
    /* renamed from: a */
    public final String mo117214a() {
        return this.f95598a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo117215b() {
        return this.f95607x;
    }

    @C12579k
    /* renamed from: c */
    public final String mo117216c() {
        return this.f95608y;
    }

    @C12579k
    /* renamed from: d */
    public final String mo117217d() {
        return this.f95609z;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final List<CatalogProductDescription> mo117219e() {
        return this.f95595X;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogProduct)) {
            return false;
        }
        CatalogProduct catalogProduct = (CatalogProduct) obj;
        return Intrinsics.areEqual((Object) this.f95598a, (Object) catalogProduct.f95598a) && Intrinsics.areEqual((Object) this.f95599b, (Object) catalogProduct.f95599b) && Intrinsics.areEqual((Object) this.f95600c, (Object) catalogProduct.f95600c) && Intrinsics.areEqual((Object) this.f95601d, (Object) catalogProduct.f95601d) && Intrinsics.areEqual((Object) this.f95602e, (Object) catalogProduct.f95602e) && Intrinsics.areEqual((Object) this.f95603f, (Object) catalogProduct.f95603f) && Intrinsics.areEqual((Object) this.f95604g, (Object) catalogProduct.f95604g) && Intrinsics.areEqual((Object) this.f95605v, (Object) catalogProduct.f95605v) && this.f95606w == catalogProduct.f95606w && Intrinsics.areEqual((Object) this.f95607x, (Object) catalogProduct.f95607x) && Intrinsics.areEqual((Object) this.f95608y, (Object) catalogProduct.f95608y) && Intrinsics.areEqual((Object) this.f95609z, (Object) catalogProduct.f95609z) && Intrinsics.areEqual((Object) this.f95595X, (Object) catalogProduct.f95595X) && Intrinsics.areEqual((Object) this.f95596Y, (Object) catalogProduct.f95596Y) && Intrinsics.areEqual((Object) this.f95597Z, (Object) catalogProduct.f95597Z);
    }

    @C12579k
    /* renamed from: f */
    public final String mo117221f() {
        return this.f95596Y;
    }

    @C12579k
    /* renamed from: g */
    public final String mo117222g() {
        return this.f95597Z;
    }

    @C12579k
    /* renamed from: h */
    public final String mo117223h() {
        return this.f95599b;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.f95598a.hashCode() * 31) + this.f95599b.hashCode()) * 31) + this.f95600c.hashCode()) * 31) + this.f95601d.hashCode()) * 31) + this.f95602e.hashCode()) * 31) + this.f95603f.hashCode()) * 31) + this.f95604g.hashCode()) * 31) + this.f95605v.hashCode()) * 31) + Integer.hashCode(this.f95606w)) * 31) + this.f95607x.hashCode()) * 31) + this.f95608y.hashCode()) * 31) + this.f95609z.hashCode()) * 31) + this.f95595X.hashCode()) * 31) + this.f95596Y.hashCode()) * 31) + this.f95597Z.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final String mo117225i() {
        return this.f95600c;
    }

    @C12579k
    /* renamed from: j */
    public final String mo117226j() {
        return this.f95601d;
    }

    @C12579k
    /* renamed from: k */
    public final String mo117227k() {
        return this.f95602e;
    }

    @C12579k
    /* renamed from: l */
    public final String mo117228l() {
        return this.f95603f;
    }

    @C12579k
    /* renamed from: m */
    public final String mo117229m() {
        return this.f95604g;
    }

    @C12579k
    /* renamed from: n */
    public final String mo117230n() {
        return this.f95605v;
    }

    /* renamed from: o */
    public final int mo117231o() {
        return this.f95606w;
    }

    @C12579k
    /* renamed from: p */
    public final CatalogProduct mo117232p(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7, @C12579k String str8, int i, @C12579k String str9, @C12579k String str10, @C12579k String str11, @C12579k List<CatalogProductDescription> list, @C12579k String str12, @C12579k String str13) {
        String str14 = str;
        Intrinsics.checkNotNullParameter(str14, "id");
        String str15 = str2;
        Intrinsics.checkNotNullParameter(str15, "catalogID");
        String str16 = str3;
        Intrinsics.checkNotNullParameter(str16, "ean");
        String str17 = str4;
        Intrinsics.checkNotNullParameter(str17, "name");
        String str18 = str5;
        Intrinsics.checkNotNullParameter(str18, "brand");
        String str19 = str6;
        Intrinsics.checkNotNullParameter(str19, "price");
        String str20 = str7;
        Intrinsics.checkNotNullParameter(str20, "promoImage");
        String str21 = str8;
        Intrinsics.checkNotNullParameter(str21, "shelf");
        String str22 = str9;
        Intrinsics.checkNotNullParameter(str22, "subShelf");
        String str23 = str10;
        Intrinsics.checkNotNullParameter(str23, "unitPrice");
        String str24 = str11;
        Intrinsics.checkNotNullParameter(str24, "legalInfo");
        List<CatalogProductDescription> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "description");
        String str25 = str12;
        Intrinsics.checkNotNullParameter(str25, "catalogEndDate");
        Intrinsics.checkNotNullParameter(str13, "imageUrl");
        return new CatalogProduct(str14, str15, str16, str17, str18, str19, str20, str21, i, str22, str23, str24, list2, str25, str13);
    }

    @C12579k
    /* renamed from: r */
    public final String mo117233r() {
        return this.f95602e;
    }

    @C12579k
    /* renamed from: s */
    public final String mo117234s() {
        return this.f95596Y;
    }

    @C12579k
    /* renamed from: t */
    public final String mo117235t() {
        return this.f95599b;
    }

    @C12579k
    public String toString() {
        String str = this.f95598a;
        String str2 = this.f95599b;
        String str3 = this.f95600c;
        String str4 = this.f95601d;
        String str5 = this.f95602e;
        String str6 = this.f95603f;
        String str7 = this.f95604g;
        String str8 = this.f95605v;
        int i = this.f95606w;
        String str9 = this.f95607x;
        String str10 = this.f95608y;
        String str11 = this.f95609z;
        List<CatalogProductDescription> list = this.f95595X;
        String str12 = this.f95596Y;
        String str13 = this.f95597Z;
        return "CatalogProduct(id=" + str + ", catalogID=" + str2 + ", ean=" + str3 + ", name=" + str4 + ", brand=" + str5 + ", price=" + str6 + ", promoImage=" + str7 + ", shelf=" + str8 + ", pageNum=" + i + ", subShelf=" + str9 + ", unitPrice=" + str10 + ", legalInfo=" + str11 + ", description=" + list + ", catalogEndDate=" + str12 + ", imageUrl=" + str13 + ")";
    }

    @C12579k
    /* renamed from: u */
    public final List<CatalogProductDescription> mo117237u() {
        return this.f95595X;
    }

    @C12579k
    /* renamed from: v */
    public final String mo117238v() {
        return this.f95600c;
    }

    @C12579k
    /* renamed from: w */
    public final String mo117239w() {
        return this.f95598a;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95598a);
        parcel.writeString(this.f95599b);
        parcel.writeString(this.f95600c);
        parcel.writeString(this.f95601d);
        parcel.writeString(this.f95602e);
        parcel.writeString(this.f95603f);
        parcel.writeString(this.f95604g);
        parcel.writeString(this.f95605v);
        parcel.writeInt(this.f95606w);
        parcel.writeString(this.f95607x);
        parcel.writeString(this.f95608y);
        parcel.writeString(this.f95609z);
        List<CatalogProductDescription> list = this.f95595X;
        parcel.writeInt(list.size());
        for (CatalogProductDescription writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f95596Y);
        parcel.writeString(this.f95597Z);
    }

    @C12579k
    /* renamed from: x */
    public final String mo117241x() {
        return this.f95597Z;
    }

    @C12579k
    /* renamed from: y */
    public final String mo117242y() {
        return this.f95609z;
    }

    @C12579k
    /* renamed from: z */
    public final String mo117243z() {
        return this.f95601d;
    }

    public CatalogProduct(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7, @C12579k String str8, int i, @C12579k String str9, @C12579k String str10, @C12579k String str11, @C12579k List<CatalogProductDescription> list, @C12579k String str12, @C12579k String str13) {
        String str14 = str;
        String str15 = str2;
        String str16 = str3;
        String str17 = str4;
        String str18 = str5;
        String str19 = str6;
        String str20 = str7;
        String str21 = str8;
        String str22 = str9;
        String str23 = str10;
        String str24 = str11;
        List<CatalogProductDescription> list2 = list;
        String str25 = str12;
        String str26 = str13;
        Intrinsics.checkNotNullParameter(str14, "id");
        Intrinsics.checkNotNullParameter(str15, "catalogID");
        Intrinsics.checkNotNullParameter(str16, "ean");
        Intrinsics.checkNotNullParameter(str17, "name");
        Intrinsics.checkNotNullParameter(str18, "brand");
        Intrinsics.checkNotNullParameter(str19, "price");
        Intrinsics.checkNotNullParameter(str20, "promoImage");
        Intrinsics.checkNotNullParameter(str21, "shelf");
        Intrinsics.checkNotNullParameter(str22, "subShelf");
        Intrinsics.checkNotNullParameter(str23, "unitPrice");
        Intrinsics.checkNotNullParameter(str24, "legalInfo");
        Intrinsics.checkNotNullParameter(list2, "description");
        Intrinsics.checkNotNullParameter(str25, "catalogEndDate");
        Intrinsics.checkNotNullParameter(str26, "imageUrl");
        this.f95598a = str14;
        this.f95599b = str15;
        this.f95600c = str16;
        this.f95601d = str17;
        this.f95602e = str18;
        this.f95603f = str19;
        this.f95604g = str20;
        this.f95605v = str21;
        this.f95606w = i;
        this.f95607x = str22;
        this.f95608y = str23;
        this.f95609z = str24;
        this.f95595X = list2;
        this.f95596Y = str25;
        this.f95597Z = str26;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CatalogProduct(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, int r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.util.List r28, java.lang.String r29, java.lang.String r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
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
            if (r3 == 0) goto L_0x0024
            java.lang.String r3 = new java.lang.String
            r3.<init>()
            goto L_0x0026
        L_0x0024:
            r3 = r18
        L_0x0026:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0030
            java.lang.String r4 = new java.lang.String
            r4.<init>()
            goto L_0x0032
        L_0x0030:
            r4 = r19
        L_0x0032:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x003c
            java.lang.String r5 = new java.lang.String
            r5.<init>()
            goto L_0x003e
        L_0x003c:
            r5 = r20
        L_0x003e:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0048
            java.lang.String r6 = new java.lang.String
            r6.<init>()
            goto L_0x004a
        L_0x0048:
            r6 = r21
        L_0x004a:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x0054
            java.lang.String r7 = new java.lang.String
            r7.<init>()
            goto L_0x0056
        L_0x0054:
            r7 = r22
        L_0x0056:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0060
            java.lang.String r8 = new java.lang.String
            r8.<init>()
            goto L_0x0062
        L_0x0060:
            r8 = r23
        L_0x0062:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x0068
            r9 = 0
            goto L_0x006a
        L_0x0068:
            r9 = r24
        L_0x006a:
            r10 = r0 & 512(0x200, float:7.175E-43)
            if (r10 == 0) goto L_0x0074
            java.lang.String r10 = new java.lang.String
            r10.<init>()
            goto L_0x0076
        L_0x0074:
            r10 = r25
        L_0x0076:
            r11 = r0 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x0080
            java.lang.String r11 = new java.lang.String
            r11.<init>()
            goto L_0x0082
        L_0x0080:
            r11 = r26
        L_0x0082:
            r12 = r0 & 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L_0x008c
            java.lang.String r12 = new java.lang.String
            r12.<init>()
            goto L_0x008e
        L_0x008c:
            r12 = r27
        L_0x008e:
            r13 = r0 & 4096(0x1000, float:5.74E-42)
            if (r13 == 0) goto L_0x0097
            java.util.List r13 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0099
        L_0x0097:
            r13 = r28
        L_0x0099:
            r14 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r14 == 0) goto L_0x00a3
            java.lang.String r14 = new java.lang.String
            r14.<init>()
            goto L_0x00a5
        L_0x00a3:
            r14 = r29
        L_0x00a5:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x00af
            java.lang.String r0 = new java.lang.String
            r0.<init>()
            goto L_0x00b1
        L_0x00af:
            r0 = r30
        L_0x00b1:
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
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
