package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.offer.OfferFlag;
import com.carrefour.fid.android.domain.models.offer.ProductNutriScore;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u0011\u0012\u0006\u0010 \u001a\u00020\u0011\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\u0006\u0010\"\u001a\u00020\u0011¢\u0006\u0004\bH\u0010IJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0011HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0011HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0011HÆ\u0003J©\u0001\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u0011HÆ\u0001J\t\u0010$\u001a\u00020\u0004HÖ\u0001J\t\u0010&\u001a\u00020%HÖ\u0001J\u0013\u0010)\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010*\u001a\u00020%HÖ\u0001J\u0019\u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020%HÖ\u0001R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105R\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u00106\u001a\u0004\b7\u00108R\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\b9\u00108R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b=\u00105R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b>\u00105R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b;\u00103\u001a\u0004\b?\u00105R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b=\u00103\u001a\u0004\b@\u00105R\u0017\u0010\u001f\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b>\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010 \u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b?\u0010A\u001a\u0004\bD\u0010CR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b@\u00103\u001a\u0004\bE\u00105R\u0017\u0010\"\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bF\u0010A\u001a\u0004\bG\u0010C¨\u0006J"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/ProductDomain;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/domain/models/ProductCategoryDomain;", "a", "", "f", "", "Lcom/carrefour/fid/android/domain/models/offer/OfferFlag;", "g", "Lcom/carrefour/fid/android/domain/models/ProductPictureDomain;", "h", "Lcom/carrefour/fid/android/domain/models/offer/ProductNutriScore;", "i", "j", "k", "l", "m", "", "b", "c", "d", "e", "category", "ean", "flagsSortedByListPriority", "images", "nutriScore", "origin", "packaging", "ref", "title", "isVariableWeight", "isNotFood", "brand", "containAlcohol", "n", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/domain/models/ProductCategoryDomain;", "q", "()Lcom/carrefour/fid/android/domain/models/ProductCategoryDomain;", "Ljava/lang/String;", "s", "()Ljava/lang/String;", "Ljava/util/List;", "t", "()Ljava/util/List;", "u", "Lcom/carrefour/fid/android/domain/models/offer/ProductNutriScore;", "v", "()Lcom/carrefour/fid/android/domain/models/offer/ProductNutriScore;", "w", "x", "y", "z", "Z", "B", "()Z", "A", "p", "X", "r", "<init>", "(Lcom/carrefour/fid/android/domain/models/ProductCategoryDomain;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/carrefour/fid/android/domain/models/offer/ProductNutriScore;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Z)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class ProductDomain implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<ProductDomain> CREATOR = new C37935a();

    /* renamed from: Y */
    public static final int f95355Y = 8;

    /* renamed from: X */
    public final boolean f95356X;
    @C12580l

    /* renamed from: a */
    public final ProductCategoryDomain f95357a;
    @C12580l

    /* renamed from: b */
    public final String f95358b;
    @C12580l

    /* renamed from: c */
    public final List<OfferFlag> f95359c;
    @C12580l

    /* renamed from: d */
    public final List<ProductPictureDomain> f95360d;
    @C12580l

    /* renamed from: e */
    public final ProductNutriScore f95361e;
    @C12580l

    /* renamed from: f */
    public final String f95362f;
    @C12580l

    /* renamed from: g */
    public final String f95363g;
    @C12580l

    /* renamed from: v */
    public final String f95364v;
    @C12580l

    /* renamed from: w */
    public final String f95365w;

    /* renamed from: x */
    public final boolean f95366x;

    /* renamed from: y */
    public final boolean f95367y;
    @C12579k

    /* renamed from: z */
    public final String f95368z;

    /* renamed from: com.carrefour.fid.android.domain.models.ProductDomain$a */
    public static final class C37935a implements Parcelable.Creator<ProductDomain> {
        @C12579k
        /* renamed from: a */
        public final ProductDomain createFromParcel(@C12579k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            ProductNutriScore productNutriScore = null;
            ProductCategoryDomain createFromParcel = parcel.readInt() == 0 ? null : ProductCategoryDomain.CREATOR.createFromParcel(parcel2);
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(OfferFlag.valueOf(parcel.readString()));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList2.add(ProductPictureDomain.CREATOR.createFromParcel(parcel2));
                }
            }
            if (parcel.readInt() != 0) {
                productNutriScore = ProductNutriScore.valueOf(parcel.readString());
            }
            return new ProductDomain(createFromParcel, readString, arrayList, arrayList2, productNutriScore, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
        }

        @C12579k
        /* renamed from: b */
        public final ProductDomain[] newArray(int i) {
            return new ProductDomain[i];
        }
    }

    public ProductDomain(@C12580l ProductCategoryDomain productCategoryDomain, @C12580l String str, @C12580l List<? extends OfferFlag> list, @C12580l List<ProductPictureDomain> list2, @C12580l ProductNutriScore productNutriScore, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, boolean z, boolean z2, @C12579k String str6, boolean z3) {
        Intrinsics.checkNotNullParameter(str6, "brand");
        this.f95357a = productCategoryDomain;
        this.f95358b = str;
        this.f95359c = list;
        this.f95360d = list2;
        this.f95361e = productNutriScore;
        this.f95362f = str2;
        this.f95363g = str3;
        this.f95364v = str4;
        this.f95365w = str5;
        this.f95366x = z;
        this.f95367y = z2;
        this.f95368z = str6;
        this.f95356X = z3;
    }

    /* renamed from: o */
    public static /* synthetic */ ProductDomain m155761o(ProductDomain productDomain, ProductCategoryDomain productCategoryDomain, String str, List list, List list2, ProductNutriScore productNutriScore, String str2, String str3, String str4, String str5, boolean z, boolean z2, String str6, boolean z3, int i, Object obj) {
        ProductDomain productDomain2 = productDomain;
        int i2 = i;
        return productDomain.mo116540n((i2 & 1) != 0 ? productDomain2.f95357a : productCategoryDomain, (i2 & 2) != 0 ? productDomain2.f95358b : str, (i2 & 4) != 0 ? productDomain2.f95359c : list, (i2 & 8) != 0 ? productDomain2.f95360d : list2, (i2 & 16) != 0 ? productDomain2.f95361e : productNutriScore, (i2 & 32) != 0 ? productDomain2.f95362f : str2, (i2 & 64) != 0 ? productDomain2.f95363g : str3, (i2 & 128) != 0 ? productDomain2.f95364v : str4, (i2 & 256) != 0 ? productDomain2.f95365w : str5, (i2 & 512) != 0 ? productDomain2.f95366x : z, (i2 & 1024) != 0 ? productDomain2.f95367y : z2, (i2 & 2048) != 0 ? productDomain2.f95368z : str6, (i2 & 4096) != 0 ? productDomain2.f95356X : z3);
    }

    /* renamed from: A */
    public final boolean mo116522A() {
        return this.f95367y;
    }

    /* renamed from: B */
    public final boolean mo116523B() {
        return this.f95366x;
    }

    @C12580l
    /* renamed from: a */
    public final ProductCategoryDomain mo116524a() {
        return this.f95357a;
    }

    /* renamed from: b */
    public final boolean mo116525b() {
        return this.f95366x;
    }

    /* renamed from: c */
    public final boolean mo116526c() {
        return this.f95367y;
    }

    @C12579k
    /* renamed from: d */
    public final String mo116527d() {
        return this.f95368z;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo116529e() {
        return this.f95356X;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDomain)) {
            return false;
        }
        ProductDomain productDomain = (ProductDomain) obj;
        return Intrinsics.areEqual((Object) this.f95357a, (Object) productDomain.f95357a) && Intrinsics.areEqual((Object) this.f95358b, (Object) productDomain.f95358b) && Intrinsics.areEqual((Object) this.f95359c, (Object) productDomain.f95359c) && Intrinsics.areEqual((Object) this.f95360d, (Object) productDomain.f95360d) && this.f95361e == productDomain.f95361e && Intrinsics.areEqual((Object) this.f95362f, (Object) productDomain.f95362f) && Intrinsics.areEqual((Object) this.f95363g, (Object) productDomain.f95363g) && Intrinsics.areEqual((Object) this.f95364v, (Object) productDomain.f95364v) && Intrinsics.areEqual((Object) this.f95365w, (Object) productDomain.f95365w) && this.f95366x == productDomain.f95366x && this.f95367y == productDomain.f95367y && Intrinsics.areEqual((Object) this.f95368z, (Object) productDomain.f95368z) && this.f95356X == productDomain.f95356X;
    }

    @C12580l
    /* renamed from: f */
    public final String mo116531f() {
        return this.f95358b;
    }

    @C12580l
    /* renamed from: g */
    public final List<OfferFlag> mo116532g() {
        return this.f95359c;
    }

    @C12580l
    /* renamed from: h */
    public final List<ProductPictureDomain> mo116533h() {
        return this.f95360d;
    }

    public int hashCode() {
        ProductCategoryDomain productCategoryDomain = this.f95357a;
        int i = 0;
        int hashCode = (productCategoryDomain == null ? 0 : productCategoryDomain.hashCode()) * 31;
        String str = this.f95358b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<OfferFlag> list = this.f95359c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<ProductPictureDomain> list2 = this.f95360d;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ProductNutriScore productNutriScore = this.f95361e;
        int hashCode5 = (hashCode4 + (productNutriScore == null ? 0 : productNutriScore.hashCode())) * 31;
        String str2 = this.f95362f;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95363g;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f95364v;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f95365w;
        if (str5 != null) {
            i = str5.hashCode();
        }
        int i2 = (hashCode8 + i) * 31;
        boolean z = this.f95366x;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f95367y;
        if (z3) {
            z3 = true;
        }
        int hashCode9 = (((i3 + (z3 ? 1 : 0)) * 31) + this.f95368z.hashCode()) * 31;
        boolean z4 = this.f95356X;
        if (!z4) {
            z2 = z4;
        }
        return hashCode9 + (z2 ? 1 : 0);
    }

    @C12580l
    /* renamed from: i */
    public final ProductNutriScore mo116535i() {
        return this.f95361e;
    }

    @C12580l
    /* renamed from: j */
    public final String mo116536j() {
        return this.f95362f;
    }

    @C12580l
    /* renamed from: k */
    public final String mo116537k() {
        return this.f95363g;
    }

    @C12580l
    /* renamed from: l */
    public final String mo116538l() {
        return this.f95364v;
    }

    @C12580l
    /* renamed from: m */
    public final String mo116539m() {
        return this.f95365w;
    }

    @C12579k
    /* renamed from: n */
    public final ProductDomain mo116540n(@C12580l ProductCategoryDomain productCategoryDomain, @C12580l String str, @C12580l List<? extends OfferFlag> list, @C12580l List<ProductPictureDomain> list2, @C12580l ProductNutriScore productNutriScore, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, boolean z, boolean z2, @C12579k String str6, boolean z3) {
        String str7 = str6;
        Intrinsics.checkNotNullParameter(str7, "brand");
        return new ProductDomain(productCategoryDomain, str, list, list2, productNutriScore, str2, str3, str4, str5, z, z2, str7, z3);
    }

    @C12579k
    /* renamed from: p */
    public final String mo116541p() {
        return this.f95368z;
    }

    @C12580l
    /* renamed from: q */
    public final ProductCategoryDomain mo116542q() {
        return this.f95357a;
    }

    /* renamed from: r */
    public final boolean mo116543r() {
        return this.f95356X;
    }

    @C12580l
    /* renamed from: s */
    public final String mo116544s() {
        return this.f95358b;
    }

    @C12580l
    /* renamed from: t */
    public final List<OfferFlag> mo116545t() {
        return this.f95359c;
    }

    @C12579k
    public String toString() {
        ProductCategoryDomain productCategoryDomain = this.f95357a;
        String str = this.f95358b;
        List<OfferFlag> list = this.f95359c;
        List<ProductPictureDomain> list2 = this.f95360d;
        ProductNutriScore productNutriScore = this.f95361e;
        String str2 = this.f95362f;
        String str3 = this.f95363g;
        String str4 = this.f95364v;
        String str5 = this.f95365w;
        boolean z = this.f95366x;
        boolean z2 = this.f95367y;
        String str6 = this.f95368z;
        boolean z3 = this.f95356X;
        return "ProductDomain(category=" + productCategoryDomain + ", ean=" + str + ", flagsSortedByListPriority=" + list + ", images=" + list2 + ", nutriScore=" + productNutriScore + ", origin=" + str2 + ", packaging=" + str3 + ", ref=" + str4 + ", title=" + str5 + ", isVariableWeight=" + z + ", isNotFood=" + z2 + ", brand=" + str6 + ", containAlcohol=" + z3 + ")";
    }

    @C12580l
    /* renamed from: u */
    public final List<ProductPictureDomain> mo116547u() {
        return this.f95360d;
    }

    @C12580l
    /* renamed from: v */
    public final ProductNutriScore mo116548v() {
        return this.f95361e;
    }

    @C12580l
    /* renamed from: w */
    public final String mo116549w() {
        return this.f95362f;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        ProductCategoryDomain productCategoryDomain = this.f95357a;
        if (productCategoryDomain == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            productCategoryDomain.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f95358b);
        List<OfferFlag> list = this.f95359c;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (OfferFlag name : list) {
                parcel.writeString(name.name());
            }
        }
        List<ProductPictureDomain> list2 = this.f95360d;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (ProductPictureDomain writeToParcel : list2) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        ProductNutriScore productNutriScore = this.f95361e;
        if (productNutriScore == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(productNutriScore.name());
        }
        parcel.writeString(this.f95362f);
        parcel.writeString(this.f95363g);
        parcel.writeString(this.f95364v);
        parcel.writeString(this.f95365w);
        parcel.writeInt(this.f95366x ? 1 : 0);
        parcel.writeInt(this.f95367y ? 1 : 0);
        parcel.writeString(this.f95368z);
        parcel.writeInt(this.f95356X ? 1 : 0);
    }

    @C12580l
    /* renamed from: x */
    public final String mo116551x() {
        return this.f95363g;
    }

    @C12580l
    /* renamed from: y */
    public final String mo116552y() {
        return this.f95364v;
    }

    @C12580l
    /* renamed from: z */
    public final String mo116553z() {
        return this.f95365w;
    }
}
