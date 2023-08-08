package com.carrefour.fid.android.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.ProductCategoryDomain;
import com.carrefour.fid.android.domain.models.ProductPictureDomain;
import com.carrefour.fid.android.domain.models.offer.OfferFlag;
import com.carrefour.fid.android.domain.models.offer.ProductNutriScore;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u000e\u0010\u0018\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0012\u0010\u001b\u001a\u000e\u0012\b\u0012\u00060\nj\u0002`\u000b\u0018\u00010\u0007\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010!\u001a\u00020\u0013\u0012\u0006\u0010\"\u001a\u00020\u0013\u0012\u0006\u0010#\u001a\u00020\u0005\u0012\u0006\u0010$\u001a\u00020\u0013¢\u0006\u0004\bI\u0010JJ\u0011\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0015\u0010\f\u001a\u000e\u0012\b\u0012\u00060\nj\u0002`\u000b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0013HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0013HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0013HÆ\u0003J³\u0001\u0010%\u001a\u00020\u00002\u0010\b\u0002\u0010\u0018\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\b\u0012\u00060\nj\u0002`\u000b\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010!\u001a\u00020\u00132\b\b\u0002\u0010\"\u001a\u00020\u00132\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010$\u001a\u00020\u0013HÆ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\t\u0010(\u001a\u00020'HÖ\u0001J\u0013\u0010+\u001a\u00020\u00132\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010,\u001a\u00020'HÖ\u0001J\u0019\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u001a\u001a\u00020'HÖ\u0001R\u001f\u0010\u0018\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u00104\u001a\u0004\b5\u00106R\u001f\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u00107\u001a\u0004\b8\u00109R#\u0010\u001b\u001a\u000e\u0012\b\u0012\u00060\nj\u0002`\u000b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u00107\u001a\u0004\b:\u00109R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0017\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b>\u00106R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b?\u00106R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b<\u00104\u001a\u0004\b@\u00106R\u0019\u0010 \u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b>\u00104\u001a\u0004\bA\u00106R\u0017\u0010!\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b?\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\"\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b@\u0010B\u001a\u0004\bE\u0010DR\u0017\u0010#\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bA\u00104\u001a\u0004\bF\u00106R\u0017\u0010$\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bG\u0010B\u001a\u0004\bH\u0010D¨\u0006K"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/ProductModel;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/domain/models/ProductCategoryDomain;", "Lcom/carrefour/fid/android/presentation/models/ProductCategoryModel;", "a", "", "f", "", "Lcom/carrefour/fid/android/domain/models/offer/OfferFlag;", "g", "Lcom/carrefour/fid/android/domain/models/ProductPictureDomain;", "Lcom/carrefour/fid/android/presentation/models/ProductPictureModel;", "h", "Lcom/carrefour/fid/android/domain/models/offer/ProductNutriScore;", "i", "j", "k", "l", "m", "", "b", "c", "d", "e", "category", "ean", "flags", "images", "nutriScore", "origin", "packaging", "ref", "title", "isVariableWeight", "isNotFood", "brand", "containAlcohol", "n", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/domain/models/ProductCategoryDomain;", "q", "()Lcom/carrefour/fid/android/domain/models/ProductCategoryDomain;", "Ljava/lang/String;", "s", "()Ljava/lang/String;", "Ljava/util/List;", "t", "()Ljava/util/List;", "u", "Lcom/carrefour/fid/android/domain/models/offer/ProductNutriScore;", "v", "()Lcom/carrefour/fid/android/domain/models/offer/ProductNutriScore;", "w", "x", "y", "z", "Z", "B", "()Z", "A", "p", "X", "r", "<init>", "(Lcom/carrefour/fid/android/domain/models/ProductCategoryDomain;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/carrefour/fid/android/domain/models/offer/ProductNutriScore;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Z)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class ProductModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<ProductModel> CREATOR = new C38446a();

    /* renamed from: Y */
    public static final int f97513Y = 8;

    /* renamed from: X */
    public final boolean f97514X;
    @C12580l

    /* renamed from: a */
    public final ProductCategoryDomain f97515a;
    @C12580l

    /* renamed from: b */
    public final String f97516b;
    @C12580l

    /* renamed from: c */
    public final List<OfferFlag> f97517c;
    @C12580l

    /* renamed from: d */
    public final List<ProductPictureDomain> f97518d;
    @C12580l

    /* renamed from: e */
    public final ProductNutriScore f97519e;
    @C12580l

    /* renamed from: f */
    public final String f97520f;
    @C12580l

    /* renamed from: g */
    public final String f97521g;
    @C12580l

    /* renamed from: v */
    public final String f97522v;
    @C12580l

    /* renamed from: w */
    public final String f97523w;

    /* renamed from: x */
    public final boolean f97524x;

    /* renamed from: y */
    public final boolean f97525y;
    @C12579k

    /* renamed from: z */
    public final String f97526z;

    /* renamed from: com.carrefour.fid.android.presentation.models.ProductModel$a */
    public static final class C38446a implements Parcelable.Creator<ProductModel> {
        @C12579k
        /* renamed from: a */
        public final ProductModel createFromParcel(@C12579k Parcel parcel) {
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
            return new ProductModel(createFromParcel, readString, arrayList, arrayList2, productNutriScore, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
        }

        @C12579k
        /* renamed from: b */
        public final ProductModel[] newArray(int i) {
            return new ProductModel[i];
        }
    }

    public ProductModel(@C12580l ProductCategoryDomain productCategoryDomain, @C12580l String str, @C12580l List<? extends OfferFlag> list, @C12580l List<ProductPictureDomain> list2, @C12580l ProductNutriScore productNutriScore, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, boolean z, boolean z2, @C12579k String str6, boolean z3) {
        Intrinsics.checkNotNullParameter(str6, "brand");
        this.f97515a = productCategoryDomain;
        this.f97516b = str;
        this.f97517c = list;
        this.f97518d = list2;
        this.f97519e = productNutriScore;
        this.f97520f = str2;
        this.f97521g = str3;
        this.f97522v = str4;
        this.f97523w = str5;
        this.f97524x = z;
        this.f97525y = z2;
        this.f97526z = str6;
        this.f97514X = z3;
    }

    /* renamed from: o */
    public static /* synthetic */ ProductModel m159416o(ProductModel productModel, ProductCategoryDomain productCategoryDomain, String str, List list, List list2, ProductNutriScore productNutriScore, String str2, String str3, String str4, String str5, boolean z, boolean z2, String str6, boolean z3, int i, Object obj) {
        ProductModel productModel2 = productModel;
        int i2 = i;
        return productModel.mo121885n((i2 & 1) != 0 ? productModel2.f97515a : productCategoryDomain, (i2 & 2) != 0 ? productModel2.f97516b : str, (i2 & 4) != 0 ? productModel2.f97517c : list, (i2 & 8) != 0 ? productModel2.f97518d : list2, (i2 & 16) != 0 ? productModel2.f97519e : productNutriScore, (i2 & 32) != 0 ? productModel2.f97520f : str2, (i2 & 64) != 0 ? productModel2.f97521g : str3, (i2 & 128) != 0 ? productModel2.f97522v : str4, (i2 & 256) != 0 ? productModel2.f97523w : str5, (i2 & 512) != 0 ? productModel2.f97524x : z, (i2 & 1024) != 0 ? productModel2.f97525y : z2, (i2 & 2048) != 0 ? productModel2.f97526z : str6, (i2 & 4096) != 0 ? productModel2.f97514X : z3);
    }

    /* renamed from: A */
    public final boolean mo121867A() {
        return this.f97525y;
    }

    /* renamed from: B */
    public final boolean mo121868B() {
        return this.f97524x;
    }

    @C12580l
    /* renamed from: a */
    public final ProductCategoryDomain mo121869a() {
        return this.f97515a;
    }

    /* renamed from: b */
    public final boolean mo121870b() {
        return this.f97524x;
    }

    /* renamed from: c */
    public final boolean mo121871c() {
        return this.f97525y;
    }

    @C12579k
    /* renamed from: d */
    public final String mo121872d() {
        return this.f97526z;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo121874e() {
        return this.f97514X;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductModel)) {
            return false;
        }
        ProductModel productModel = (ProductModel) obj;
        return Intrinsics.areEqual((Object) this.f97515a, (Object) productModel.f97515a) && Intrinsics.areEqual((Object) this.f97516b, (Object) productModel.f97516b) && Intrinsics.areEqual((Object) this.f97517c, (Object) productModel.f97517c) && Intrinsics.areEqual((Object) this.f97518d, (Object) productModel.f97518d) && this.f97519e == productModel.f97519e && Intrinsics.areEqual((Object) this.f97520f, (Object) productModel.f97520f) && Intrinsics.areEqual((Object) this.f97521g, (Object) productModel.f97521g) && Intrinsics.areEqual((Object) this.f97522v, (Object) productModel.f97522v) && Intrinsics.areEqual((Object) this.f97523w, (Object) productModel.f97523w) && this.f97524x == productModel.f97524x && this.f97525y == productModel.f97525y && Intrinsics.areEqual((Object) this.f97526z, (Object) productModel.f97526z) && this.f97514X == productModel.f97514X;
    }

    @C12580l
    /* renamed from: f */
    public final String mo121876f() {
        return this.f97516b;
    }

    @C12580l
    /* renamed from: g */
    public final List<OfferFlag> mo121877g() {
        return this.f97517c;
    }

    @C12580l
    /* renamed from: h */
    public final List<ProductPictureDomain> mo121878h() {
        return this.f97518d;
    }

    public int hashCode() {
        ProductCategoryDomain productCategoryDomain = this.f97515a;
        int i = 0;
        int hashCode = (productCategoryDomain == null ? 0 : productCategoryDomain.hashCode()) * 31;
        String str = this.f97516b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<OfferFlag> list = this.f97517c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<ProductPictureDomain> list2 = this.f97518d;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ProductNutriScore productNutriScore = this.f97519e;
        int hashCode5 = (hashCode4 + (productNutriScore == null ? 0 : productNutriScore.hashCode())) * 31;
        String str2 = this.f97520f;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f97521g;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f97522v;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f97523w;
        if (str5 != null) {
            i = str5.hashCode();
        }
        int i2 = (hashCode8 + i) * 31;
        boolean z = this.f97524x;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f97525y;
        if (z3) {
            z3 = true;
        }
        int hashCode9 = (((i3 + (z3 ? 1 : 0)) * 31) + this.f97526z.hashCode()) * 31;
        boolean z4 = this.f97514X;
        if (!z4) {
            z2 = z4;
        }
        return hashCode9 + (z2 ? 1 : 0);
    }

    @C12580l
    /* renamed from: i */
    public final ProductNutriScore mo121880i() {
        return this.f97519e;
    }

    @C12580l
    /* renamed from: j */
    public final String mo121881j() {
        return this.f97520f;
    }

    @C12580l
    /* renamed from: k */
    public final String mo121882k() {
        return this.f97521g;
    }

    @C12580l
    /* renamed from: l */
    public final String mo121883l() {
        return this.f97522v;
    }

    @C12580l
    /* renamed from: m */
    public final String mo121884m() {
        return this.f97523w;
    }

    @C12579k
    /* renamed from: n */
    public final ProductModel mo121885n(@C12580l ProductCategoryDomain productCategoryDomain, @C12580l String str, @C12580l List<? extends OfferFlag> list, @C12580l List<ProductPictureDomain> list2, @C12580l ProductNutriScore productNutriScore, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, boolean z, boolean z2, @C12579k String str6, boolean z3) {
        String str7 = str6;
        Intrinsics.checkNotNullParameter(str7, "brand");
        return new ProductModel(productCategoryDomain, str, list, list2, productNutriScore, str2, str3, str4, str5, z, z2, str7, z3);
    }

    @C12579k
    /* renamed from: p */
    public final String mo121886p() {
        return this.f97526z;
    }

    @C12580l
    /* renamed from: q */
    public final ProductCategoryDomain mo121887q() {
        return this.f97515a;
    }

    /* renamed from: r */
    public final boolean mo121888r() {
        return this.f97514X;
    }

    @C12580l
    /* renamed from: s */
    public final String mo121889s() {
        return this.f97516b;
    }

    @C12580l
    /* renamed from: t */
    public final List<OfferFlag> mo121890t() {
        return this.f97517c;
    }

    @C12579k
    public String toString() {
        ProductCategoryDomain productCategoryDomain = this.f97515a;
        String str = this.f97516b;
        List<OfferFlag> list = this.f97517c;
        List<ProductPictureDomain> list2 = this.f97518d;
        ProductNutriScore productNutriScore = this.f97519e;
        String str2 = this.f97520f;
        String str3 = this.f97521g;
        String str4 = this.f97522v;
        String str5 = this.f97523w;
        boolean z = this.f97524x;
        boolean z2 = this.f97525y;
        String str6 = this.f97526z;
        boolean z3 = this.f97514X;
        return "ProductModel(category=" + productCategoryDomain + ", ean=" + str + ", flags=" + list + ", images=" + list2 + ", nutriScore=" + productNutriScore + ", origin=" + str2 + ", packaging=" + str3 + ", ref=" + str4 + ", title=" + str5 + ", isVariableWeight=" + z + ", isNotFood=" + z2 + ", brand=" + str6 + ", containAlcohol=" + z3 + ")";
    }

    @C12580l
    /* renamed from: u */
    public final List<ProductPictureDomain> mo121892u() {
        return this.f97518d;
    }

    @C12580l
    /* renamed from: v */
    public final ProductNutriScore mo121893v() {
        return this.f97519e;
    }

    @C12580l
    /* renamed from: w */
    public final String mo121894w() {
        return this.f97520f;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        ProductCategoryDomain productCategoryDomain = this.f97515a;
        if (productCategoryDomain == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            productCategoryDomain.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f97516b);
        List<OfferFlag> list = this.f97517c;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (OfferFlag name : list) {
                parcel.writeString(name.name());
            }
        }
        List<ProductPictureDomain> list2 = this.f97518d;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (ProductPictureDomain writeToParcel : list2) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        ProductNutriScore productNutriScore = this.f97519e;
        if (productNutriScore == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(productNutriScore.name());
        }
        parcel.writeString(this.f97520f);
        parcel.writeString(this.f97521g);
        parcel.writeString(this.f97522v);
        parcel.writeString(this.f97523w);
        parcel.writeInt(this.f97524x ? 1 : 0);
        parcel.writeInt(this.f97525y ? 1 : 0);
        parcel.writeString(this.f97526z);
        parcel.writeInt(this.f97514X ? 1 : 0);
    }

    @C12580l
    /* renamed from: x */
    public final String mo121896x() {
        return this.f97521g;
    }

    @C12580l
    /* renamed from: y */
    public final String mo121897y() {
        return this.f97522v;
    }

    @C12580l
    /* renamed from: z */
    public final String mo121898z() {
        return this.f97523w;
    }
}
