package com.carrefour.fid.android.domain.models.product;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C8698y1;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.domain.models.offer.OfferFlag;
import com.carrefour.fid.android.domain.models.offer.ProductEcoScore;
import com.carrefour.fid.android.domain.models.offer.ProductNutriScore;
import com.urbanairship.util.C9647e0;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b7\b\b\u0018\u00002\u00020\u0001B¦\u0002\u0012\u0006\u0010,\u001a\u00020\u0002\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\b\u00100\u001a\u0004\u0018\u00010\f\u0012\u0006\u00101\u001a\u00020\u000e\u0012\u0006\u00102\u001a\u00020\u000e\u0012\u0006\u00103\u001a\u00020\u0011\u0012\u0006\u00104\u001a\u00020\u000e\u0012\u0006\u00105\u001a\u00020\u000e\u0012\u0006\u00106\u001a\u00020\u000e\u0012\u0006\u00107\u001a\u00020\u000e\u0012\b\u00108\u001a\u0004\u0018\u00010\u000e\u0012\b\u00109\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010:\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010;\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010<\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010=\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010>\u001a\u00020\u001d\u0012\b\u0010?\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010@\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\"0\u0007\u0012\b\u0010B\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010C\u001a\b\u0012\u0004\u0012\u00020%0\u0007\u0012\u000e\b\u0002\u0010D\u001a\b\u0012\u0004\u0012\u00020'0\u0007\u0012\u0006\u0010E\u001a\u00020\u001d\u0012\u0006\u0010F\u001a\u00020\u000e\u0012\u0006\u0010G\u001a\u00020\u001dø\u0001\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u0019\u0010\u0003\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000eHÆ\u0003J\u0019\u0010\u0012\u001a\u00020\u0011HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\t\u0010\u0013\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0014\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0015\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0016\u001a\u00020\u000eHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010\u001e\u001a\u00020\u001dHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u0007HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u001dHÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003J\t\u0010+\u001a\u00020\u001dHÆ\u0003Jâ\u0002\u0010H\u001a\u00020\u00002\b\b\u0002\u0010,\u001a\u00020\u00022\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\n\b\u0002\u00100\u001a\u0004\u0018\u00010\f2\b\b\u0002\u00101\u001a\u00020\u000e2\b\b\u0002\u00102\u001a\u00020\u000e2\b\b\u0002\u00103\u001a\u00020\u00112\b\b\u0002\u00104\u001a\u00020\u000e2\b\b\u0002\u00105\u001a\u00020\u000e2\b\b\u0002\u00106\u001a\u00020\u000e2\b\b\u0002\u00107\u001a\u00020\u000e2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010>\u001a\u00020\u001d2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010A\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010C\u001a\b\u0012\u0004\u0012\u00020%0\u00072\u000e\b\u0002\u0010D\u001a\b\u0012\u0004\u0012\u00020'0\u00072\b\b\u0002\u0010E\u001a\u00020\u001d2\b\b\u0002\u0010F\u001a\u00020\u000e2\b\b\u0002\u0010G\u001a\u00020\u001dHÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bH\u0010IJ\t\u0010J\u001a\u00020\u000eHÖ\u0001J\t\u0010L\u001a\u00020KHÖ\u0001J\u0013\u0010O\u001a\u00020\u001d2\b\u0010N\u001a\u0004\u0018\u00010MHÖ\u0003J\t\u0010P\u001a\u00020KHÖ\u0001J\u0019\u0010U\u001a\u00020T2\u0006\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020KHÖ\u0001R \u0010,\u001a\u00020\u00028\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0003\u0010V\u001a\u0004\bW\u0010\u0004R\u0019\u0010-\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010X\u001a\u0004\bY\u0010ZR\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010[\u001a\u0004\b\\\u0010]R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010[\u001a\u0004\b^\u0010]R\u0019\u00100\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0017\u0010_\u001a\u0004\b`\u0010aR\u0017\u00101\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0018\u0010V\u001a\u0004\bb\u0010\u0004R\u0017\u00102\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0019\u0010V\u001a\u0004\bc\u0010\u0004R \u00103\u001a\u00020\u00118\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\t\u0010V\u001a\u0004\bd\u0010\u0004R\u0017\u00104\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010V\u001a\u0004\be\u0010\u0004R\u0017\u00105\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\r\u0010V\u001a\u0004\bf\u0010\u0004R\u0017\u00106\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010V\u001a\u0004\bg\u0010\u0004R\u0017\u00107\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010V\u001a\u0004\bh\u0010\u0004R\u0019\u00108\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bf\u0010V\u001a\u0004\bi\u0010\u0004R\u0019\u00109\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bg\u0010V\u001a\u0004\bj\u0010\u0004R\u0019\u0010:\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bd\u0010V\u001a\u0004\bk\u0010\u0004R\u0019\u0010;\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bl\u0010V\u001a\u0004\bm\u0010\u0004R\u0019\u0010<\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bn\u0010V\u001a\u0004\bo\u0010\u0004R\u0019\u0010=\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bp\u0010V\u001a\u0004\bq\u0010\u0004R\u0017\u0010>\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\br\u0010d\u001a\u0004\bs\u0010tR\u0019\u0010?\u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u0019\u0010@\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\by\u0010V\u001a\u0004\bz\u0010\u0004R\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020\"0\u00078\u0006¢\u0006\f\n\u0004\b{\u0010[\u001a\u0004\b|\u0010]R\u0019\u0010B\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b}\u0010V\u001a\u0004\b~\u0010\u0004R\u001e\u0010C\u001a\b\u0012\u0004\u0012\u00020%0\u00078\u0006¢\u0006\r\n\u0004\b\u0010[\u001a\u0005\b\u0001\u0010]R\u001f\u0010D\u001a\b\u0012\u0004\u0012\u00020'0\u00078\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010[\u001a\u0005\b\u0001\u0010]R\u0019\u0010E\u001a\u00020\u001d8\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010d\u001a\u0005\b\u0001\u0010tR\u0019\u0010F\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010V\u001a\u0005\b\u0001\u0010\u0004R\u0019\u0010G\u001a\u00020\u001d8\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010d\u001a\u0005\b\u0001\u0010t\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0001"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/product/Product;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/domain/models/product/Gtin;", "a", "()Ljava/lang/String;", "Lcom/carrefour/fid/android/domain/models/category/ProductCategory;", "l", "", "Lcom/carrefour/fid/android/domain/models/offer/OfferFlag;", "v", "Lcom/carrefour/fid/android/domain/models/product/ProductPicture;", "w", "Lcom/carrefour/fid/android/domain/models/offer/ProductNutriScore;", "x", "", "y", "z", "Lcom/carrefour/fid/android/domain/models/product/ProductReference;", "A", "B", "b", "c", "d", "e", "f", "g", "h", "i", "j", "", "k", "Lcom/carrefour/fid/android/domain/models/offer/ProductEcoScore;", "m", "n", "Lcom/carrefour/fid/android/domain/models/product/NutritionalItem;", "o", "p", "Lcom/carrefour/fid/android/domain/models/product/AllergenType;", "q", "Lcom/carrefour/fid/android/domain/models/product/Traceability;", "r", "s", "t", "u", "gtin", "category", "flagsSortedByListPriority", "images", "nutriScore", "origin", "packaging", "ref", "name", "pricePerVolume", "pricePerVolumeUnit", "format", "storageMode", "warningAdvices", "consumerAdvice", "serviceCenterContact", "informationFlagFormat", "fullDescription", "isVerifiedAllergoBox", "ecoScore", "composition", "nutritional", "alcoholByVolumeLabel", "allergens", "traceabilities", "isNotFood", "brand", "containAlcohol", "C", "(Ljava/lang/String;Lcom/carrefour/fid/android/domain/models/category/ProductCategory;Ljava/util/List;Ljava/util/List;Lcom/carrefour/fid/android/domain/models/offer/ProductNutriScore;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/carrefour/fid/android/domain/models/offer/ProductEcoScore;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Z)Lcom/carrefour/fid/android/domain/models/product/Product;", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "P", "Lcom/carrefour/fid/android/domain/models/category/ProductCategory;", "H", "()Lcom/carrefour/fid/android/domain/models/category/ProductCategory;", "Ljava/util/List;", "M", "()Ljava/util/List;", "Q", "Lcom/carrefour/fid/android/domain/models/offer/ProductNutriScore;", "T", "()Lcom/carrefour/fid/android/domain/models/offer/ProductNutriScore;", "V", "W", "Z", "S", "X", "Y", "N", "b0", "d0", "J", "E0", "a0", "F0", "R", "G0", "O", "H0", "f0", "()Z", "I0", "Lcom/carrefour/fid/android/domain/models/offer/ProductEcoScore;", "L", "()Lcom/carrefour/fid/android/domain/models/offer/ProductEcoScore;", "J0", "I", "K0", "U", "L0", "E", "M0", "F", "N0", "c0", "O0", "e0", "P0", "G", "Q0", "K", "<init>", "(Ljava/lang/String;Lcom/carrefour/fid/android/domain/models/category/ProductCategory;Ljava/util/List;Ljava/util/List;Lcom/carrefour/fid/android/domain/models/offer/ProductNutriScore;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/carrefour/fid/android/domain/models/offer/ProductEcoScore;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class Product implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<Product> CREATOR = new C38089a();
    @C12580l

    /* renamed from: E0 */
    public final String f96257E0;
    @C12580l

    /* renamed from: F0 */
    public final String f96258F0;
    @C12580l

    /* renamed from: G0 */
    public final String f96259G0;

    /* renamed from: H0 */
    public final boolean f96260H0;
    @C12580l

    /* renamed from: I0 */
    public final ProductEcoScore f96261I0;
    @C12580l

    /* renamed from: J0 */
    public final String f96262J0;
    @C12579k

    /* renamed from: K0 */
    public final List<NutritionalItem> f96263K0;
    @C12580l

    /* renamed from: L0 */
    public final String f96264L0;
    @C12579k

    /* renamed from: M0 */
    public final List<AllergenType> f96265M0;
    @C12579k

    /* renamed from: N0 */
    public final List<Traceability> f96266N0;

    /* renamed from: O0 */
    public final boolean f96267O0;
    @C12579k

    /* renamed from: P0 */
    public final String f96268P0;

    /* renamed from: Q0 */
    public final boolean f96269Q0;
    @C12580l

    /* renamed from: X */
    public final String f96270X;
    @C12580l

    /* renamed from: Y */
    public final String f96271Y;
    @C12580l

    /* renamed from: Z */
    public final String f96272Z;
    @C12579k

    /* renamed from: a */
    public final String f96273a;
    @C12580l

    /* renamed from: b */
    public final ProductCategory f96274b;
    @C12579k

    /* renamed from: c */
    public final List<OfferFlag> f96275c;
    @C12579k

    /* renamed from: d */
    public final List<ProductPicture> f96276d;
    @C12580l

    /* renamed from: e */
    public final ProductNutriScore f96277e;
    @C12579k

    /* renamed from: f */
    public final String f96278f;
    @C12579k

    /* renamed from: g */
    public final String f96279g;
    @C12579k

    /* renamed from: v */
    public final String f96280v;
    @C12579k

    /* renamed from: w */
    public final String f96281w;
    @C12579k

    /* renamed from: x */
    public final String f96282x;
    @C12579k

    /* renamed from: y */
    public final String f96283y;
    @C12579k

    /* renamed from: z */
    public final String f96284z;

    /* renamed from: com.carrefour.fid.android.domain.models.product.Product$a */
    public static final class C38089a implements Parcelable.Creator<Product> {
        @C12579k
        /* renamed from: a */
        public final Product createFromParcel(@C12579k Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            String i = Gtin.CREATOR.createFromParcel(parcel2).mo118380i();
            ProductEcoScore productEcoScore = null;
            ProductCategory createFromParcel = parcel.readInt() == 0 ? null : ProductCategory.CREATOR.createFromParcel(parcel2);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i2 = 0; i2 != readInt; i2++) {
                arrayList.add(OfferFlag.valueOf(parcel.readString()));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i3 = 0; i3 != readInt2; i3++) {
                arrayList2.add(ProductPicture.CREATOR.createFromParcel(parcel2));
            }
            ProductNutriScore valueOf = parcel.readInt() == 0 ? null : ProductNutriScore.valueOf(parcel.readString());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String i4 = ProductReference.CREATOR.createFromParcel(parcel2).mo118587i();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                productEcoScore = ProductEcoScore.valueOf(parcel.readString());
            }
            ProductEcoScore productEcoScore2 = productEcoScore;
            String readString13 = parcel.readString();
            int readInt3 = parcel.readInt();
            String str = readString7;
            ArrayList arrayList3 = new ArrayList(readInt3);
            int i5 = 0;
            while (i5 != readInt3) {
                arrayList3.add(NutritionalItem.CREATOR.createFromParcel(parcel2));
                i5++;
                readInt3 = readInt3;
            }
            String readString14 = parcel.readString();
            int readInt4 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt4);
            ArrayList arrayList5 = arrayList3;
            int i6 = 0;
            while (i6 != readInt4) {
                arrayList4.add(AllergenType.valueOf(parcel.readString()));
                i6++;
                readInt4 = readInt4;
            }
            int readInt5 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(readInt5);
            ArrayList arrayList7 = arrayList4;
            int i7 = 0;
            while (i7 != readInt5) {
                arrayList6.add(Traceability.CREATOR.createFromParcel(parcel2));
                i7++;
                readInt5 = readInt5;
            }
            return new Product(i, createFromParcel, arrayList, arrayList2, valueOf, readString, readString2, i4, readString3, readString4, readString5, readString6, str, readString8, readString9, readString10, readString11, readString12, z, productEcoScore2, readString13, arrayList5, readString14, arrayList7, arrayList6, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, (DefaultConstructorMarker) null);
        }

        @C12579k
        /* renamed from: b */
        public final Product[] newArray(int i) {
            return new Product[i];
        }
    }

    public /* synthetic */ Product(String str, ProductCategory productCategory, List list, List list2, ProductNutriScore productNutriScore, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, ProductEcoScore productEcoScore, String str15, List list3, String str16, List list4, List list5, boolean z2, String str17, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, productCategory, list, list2, productNutriScore, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, z, productEcoScore, str15, list3, str16, list4, list5, z2, str17, z3);
    }

    /* renamed from: D */
    public static /* synthetic */ Product m157327D(Product product, String str, ProductCategory productCategory, List list, List list2, ProductNutriScore productNutriScore, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, ProductEcoScore productEcoScore, String str15, List list3, String str16, List list4, List list5, boolean z2, String str17, boolean z3, int i, Object obj) {
        Product product2 = product;
        int i2 = i;
        return product.mo118403C((i2 & 1) != 0 ? product2.f96273a : str, (i2 & 2) != 0 ? product2.f96274b : productCategory, (i2 & 4) != 0 ? product2.f96275c : list, (i2 & 8) != 0 ? product2.f96276d : list2, (i2 & 16) != 0 ? product2.f96277e : productNutriScore, (i2 & 32) != 0 ? product2.f96278f : str2, (i2 & 64) != 0 ? product2.f96279g : str3, (i2 & 128) != 0 ? product2.f96280v : str4, (i2 & 256) != 0 ? product2.f96281w : str5, (i2 & 512) != 0 ? product2.f96282x : str6, (i2 & 1024) != 0 ? product2.f96283y : str7, (i2 & 2048) != 0 ? product2.f96284z : str8, (i2 & 4096) != 0 ? product2.f96270X : str9, (i2 & 8192) != 0 ? product2.f96271Y : str10, (i2 & 16384) != 0 ? product2.f96272Z : str11, (i2 & 32768) != 0 ? product2.f96257E0 : str12, (i2 & 65536) != 0 ? product2.f96258F0 : str13, (i2 & 131072) != 0 ? product2.f96259G0 : str14, (i2 & 262144) != 0 ? product2.f96260H0 : z, (i2 & 524288) != 0 ? product2.f96261I0 : productEcoScore, (i2 & 1048576) != 0 ? product2.f96262J0 : str15, (i2 & 2097152) != 0 ? product2.f96263K0 : list3, (i2 & 4194304) != 0 ? product2.f96264L0 : str16, (i2 & 8388608) != 0 ? product2.f96265M0 : list4, (i2 & 16777216) != 0 ? product2.f96266N0 : list5, (i2 & C9647e0.f26435a) != 0 ? product2.f96267O0 : z2, (i2 & C8698y1.f23302n) != 0 ? product2.f96268P0 : str17, (i2 & C8698y1.f23301m) != 0 ? product2.f96269Q0 : z3);
    }

    @C12579k
    /* renamed from: A */
    public final String mo118401A() {
        return this.f96280v;
    }

    @C12579k
    /* renamed from: B */
    public final String mo118402B() {
        return this.f96281w;
    }

    @C12579k
    /* renamed from: C */
    public final Product mo118403C(@C12579k String str, @C12580l ProductCategory productCategory, @C12579k List<? extends OfferFlag> list, @C12579k List<ProductPicture> list2, @C12580l ProductNutriScore productNutriScore, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7, @C12579k String str8, @C12580l String str9, @C12580l String str10, @C12580l String str11, @C12580l String str12, @C12580l String str13, @C12580l String str14, boolean z, @C12580l ProductEcoScore productEcoScore, @C12580l String str15, @C12579k List<NutritionalItem> list3, @C12580l String str16, @C12579k List<? extends AllergenType> list4, @C12579k List<Traceability> list5, boolean z2, @C12579k String str17, boolean z3) {
        String str18 = str;
        Intrinsics.checkNotNullParameter(str18, "gtin");
        Intrinsics.checkNotNullParameter(list, "flagsSortedByListPriority");
        Intrinsics.checkNotNullParameter(list2, "images");
        Intrinsics.checkNotNullParameter(str2, "origin");
        Intrinsics.checkNotNullParameter(str3, "packaging");
        Intrinsics.checkNotNullParameter(str4, "ref");
        Intrinsics.checkNotNullParameter(str5, "name");
        Intrinsics.checkNotNullParameter(str6, "pricePerVolume");
        Intrinsics.checkNotNullParameter(str7, "pricePerVolumeUnit");
        Intrinsics.checkNotNullParameter(str8, "format");
        Intrinsics.checkNotNullParameter(list3, "nutritional");
        Intrinsics.checkNotNullParameter(list4, "allergens");
        Intrinsics.checkNotNullParameter(list5, "traceabilities");
        Intrinsics.checkNotNullParameter(str17, "brand");
        return new Product(str18, productCategory, list, list2, productNutriScore, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, z, productEcoScore, str15, list3, str16, list4, list5, z2, str17, z3, (DefaultConstructorMarker) null);
    }

    @C12580l
    /* renamed from: E */
    public final String mo118404E() {
        return this.f96264L0;
    }

    @C12579k
    /* renamed from: F */
    public final List<AllergenType> mo118405F() {
        return this.f96265M0;
    }

    @C12579k
    /* renamed from: G */
    public final String mo118406G() {
        return this.f96268P0;
    }

    @C12580l
    /* renamed from: H */
    public final ProductCategory mo118407H() {
        return this.f96274b;
    }

    @C12580l
    /* renamed from: I */
    public final String mo118408I() {
        return this.f96262J0;
    }

    @C12580l
    /* renamed from: J */
    public final String mo118409J() {
        return this.f96272Z;
    }

    /* renamed from: K */
    public final boolean mo118410K() {
        return this.f96269Q0;
    }

    @C12580l
    /* renamed from: L */
    public final ProductEcoScore mo118411L() {
        return this.f96261I0;
    }

    @C12579k
    /* renamed from: M */
    public final List<OfferFlag> mo118412M() {
        return this.f96275c;
    }

    @C12579k
    /* renamed from: N */
    public final String mo118413N() {
        return this.f96284z;
    }

    @C12580l
    /* renamed from: O */
    public final String mo118414O() {
        return this.f96259G0;
    }

    @C12579k
    /* renamed from: P */
    public final String mo118415P() {
        return this.f96273a;
    }

    @C12579k
    /* renamed from: Q */
    public final List<ProductPicture> mo118416Q() {
        return this.f96276d;
    }

    @C12580l
    /* renamed from: R */
    public final String mo118417R() {
        return this.f96258F0;
    }

    @C12579k
    /* renamed from: S */
    public final String mo118418S() {
        return this.f96281w;
    }

    @C12580l
    /* renamed from: T */
    public final ProductNutriScore mo118419T() {
        return this.f96277e;
    }

    @C12579k
    /* renamed from: U */
    public final List<NutritionalItem> mo118420U() {
        return this.f96263K0;
    }

    @C12579k
    /* renamed from: V */
    public final String mo118421V() {
        return this.f96278f;
    }

    @C12579k
    /* renamed from: W */
    public final String mo118422W() {
        return this.f96279g;
    }

    @C12579k
    /* renamed from: X */
    public final String mo118423X() {
        return this.f96282x;
    }

    @C12579k
    /* renamed from: Y */
    public final String mo118424Y() {
        return this.f96283y;
    }

    @C12579k
    /* renamed from: Z */
    public final String mo118425Z() {
        return this.f96280v;
    }

    @C12579k
    /* renamed from: a */
    public final String mo118426a() {
        return this.f96273a;
    }

    @C12580l
    /* renamed from: a0 */
    public final String mo118427a0() {
        return this.f96257E0;
    }

    @C12579k
    /* renamed from: b */
    public final String mo118428b() {
        return this.f96282x;
    }

    @C12580l
    /* renamed from: b0 */
    public final String mo118429b0() {
        return this.f96270X;
    }

    @C12579k
    /* renamed from: c */
    public final String mo118430c() {
        return this.f96283y;
    }

    @C12579k
    /* renamed from: c0 */
    public final List<Traceability> mo118431c0() {
        return this.f96266N0;
    }

    @C12579k
    /* renamed from: d */
    public final String mo118432d() {
        return this.f96284z;
    }

    @C12580l
    /* renamed from: d0 */
    public final String mo118433d0() {
        return this.f96271Y;
    }

    public int describeContents() {
        return 0;
    }

    @C12580l
    /* renamed from: e */
    public final String mo118435e() {
        return this.f96270X;
    }

    /* renamed from: e0 */
    public final boolean mo118436e0() {
        return this.f96267O0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Product)) {
            return false;
        }
        Product product = (Product) obj;
        return Gtin.m157311e(this.f96273a, product.f96273a) && Intrinsics.areEqual((Object) this.f96274b, (Object) product.f96274b) && Intrinsics.areEqual((Object) this.f96275c, (Object) product.f96275c) && Intrinsics.areEqual((Object) this.f96276d, (Object) product.f96276d) && this.f96277e == product.f96277e && Intrinsics.areEqual((Object) this.f96278f, (Object) product.f96278f) && Intrinsics.areEqual((Object) this.f96279g, (Object) product.f96279g) && ProductReference.m157469e(this.f96280v, product.f96280v) && Intrinsics.areEqual((Object) this.f96281w, (Object) product.f96281w) && Intrinsics.areEqual((Object) this.f96282x, (Object) product.f96282x) && Intrinsics.areEqual((Object) this.f96283y, (Object) product.f96283y) && Intrinsics.areEqual((Object) this.f96284z, (Object) product.f96284z) && Intrinsics.areEqual((Object) this.f96270X, (Object) product.f96270X) && Intrinsics.areEqual((Object) this.f96271Y, (Object) product.f96271Y) && Intrinsics.areEqual((Object) this.f96272Z, (Object) product.f96272Z) && Intrinsics.areEqual((Object) this.f96257E0, (Object) product.f96257E0) && Intrinsics.areEqual((Object) this.f96258F0, (Object) product.f96258F0) && Intrinsics.areEqual((Object) this.f96259G0, (Object) product.f96259G0) && this.f96260H0 == product.f96260H0 && this.f96261I0 == product.f96261I0 && Intrinsics.areEqual((Object) this.f96262J0, (Object) product.f96262J0) && Intrinsics.areEqual((Object) this.f96263K0, (Object) product.f96263K0) && Intrinsics.areEqual((Object) this.f96264L0, (Object) product.f96264L0) && Intrinsics.areEqual((Object) this.f96265M0, (Object) product.f96265M0) && Intrinsics.areEqual((Object) this.f96266N0, (Object) product.f96266N0) && this.f96267O0 == product.f96267O0 && Intrinsics.areEqual((Object) this.f96268P0, (Object) product.f96268P0) && this.f96269Q0 == product.f96269Q0;
    }

    @C12580l
    /* renamed from: f */
    public final String mo118438f() {
        return this.f96271Y;
    }

    /* renamed from: f0 */
    public final boolean mo118439f0() {
        return this.f96260H0;
    }

    @C12580l
    /* renamed from: g */
    public final String mo118440g() {
        return this.f96272Z;
    }

    @C12580l
    /* renamed from: h */
    public final String mo118441h() {
        return this.f96257E0;
    }

    public int hashCode() {
        int g = Gtin.m157312g(this.f96273a) * 31;
        ProductCategory productCategory = this.f96274b;
        int i = 0;
        int hashCode = (((((g + (productCategory == null ? 0 : productCategory.hashCode())) * 31) + this.f96275c.hashCode()) * 31) + this.f96276d.hashCode()) * 31;
        ProductNutriScore productNutriScore = this.f96277e;
        int hashCode2 = (((((((((((((((hashCode + (productNutriScore == null ? 0 : productNutriScore.hashCode())) * 31) + this.f96278f.hashCode()) * 31) + this.f96279g.hashCode()) * 31) + ProductReference.m157470g(this.f96280v)) * 31) + this.f96281w.hashCode()) * 31) + this.f96282x.hashCode()) * 31) + this.f96283y.hashCode()) * 31) + this.f96284z.hashCode()) * 31;
        String str = this.f96270X;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f96271Y;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f96272Z;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f96257E0;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f96258F0;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f96259G0;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        boolean z = this.f96260H0;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode8 + (z ? 1 : 0)) * 31;
        ProductEcoScore productEcoScore = this.f96261I0;
        int hashCode9 = (i2 + (productEcoScore == null ? 0 : productEcoScore.hashCode())) * 31;
        String str7 = this.f96262J0;
        int hashCode10 = (((hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.f96263K0.hashCode()) * 31;
        String str8 = this.f96264L0;
        if (str8 != null) {
            i = str8.hashCode();
        }
        int hashCode11 = (((((hashCode10 + i) * 31) + this.f96265M0.hashCode()) * 31) + this.f96266N0.hashCode()) * 31;
        boolean z3 = this.f96267O0;
        if (z3) {
            z3 = true;
        }
        int hashCode12 = (((hashCode11 + (z3 ? 1 : 0)) * 31) + this.f96268P0.hashCode()) * 31;
        boolean z4 = this.f96269Q0;
        if (!z4) {
            z2 = z4;
        }
        return hashCode12 + (z2 ? 1 : 0);
    }

    @C12580l
    /* renamed from: i */
    public final String mo118443i() {
        return this.f96258F0;
    }

    @C12580l
    /* renamed from: j */
    public final String mo118444j() {
        return this.f96259G0;
    }

    /* renamed from: k */
    public final boolean mo118445k() {
        return this.f96260H0;
    }

    @C12580l
    /* renamed from: l */
    public final ProductCategory mo118446l() {
        return this.f96274b;
    }

    @C12580l
    /* renamed from: m */
    public final ProductEcoScore mo118447m() {
        return this.f96261I0;
    }

    @C12580l
    /* renamed from: n */
    public final String mo118448n() {
        return this.f96262J0;
    }

    @C12579k
    /* renamed from: o */
    public final List<NutritionalItem> mo118449o() {
        return this.f96263K0;
    }

    @C12580l
    /* renamed from: p */
    public final String mo118450p() {
        return this.f96264L0;
    }

    @C12579k
    /* renamed from: q */
    public final List<AllergenType> mo118451q() {
        return this.f96265M0;
    }

    @C12579k
    /* renamed from: r */
    public final List<Traceability> mo118452r() {
        return this.f96266N0;
    }

    /* renamed from: s */
    public final boolean mo118453s() {
        return this.f96267O0;
    }

    @C12579k
    /* renamed from: t */
    public final String mo118454t() {
        return this.f96268P0;
    }

    @C12579k
    public String toString() {
        String h = Gtin.m157313h(this.f96273a);
        ProductCategory productCategory = this.f96274b;
        List<OfferFlag> list = this.f96275c;
        List<ProductPicture> list2 = this.f96276d;
        ProductNutriScore productNutriScore = this.f96277e;
        String str = this.f96278f;
        String str2 = this.f96279g;
        String h2 = ProductReference.m157471h(this.f96280v);
        String str3 = this.f96281w;
        String str4 = this.f96282x;
        String str5 = this.f96283y;
        String str6 = this.f96284z;
        String str7 = this.f96270X;
        String str8 = this.f96271Y;
        String str9 = this.f96272Z;
        String str10 = this.f96257E0;
        String str11 = this.f96258F0;
        String str12 = this.f96259G0;
        boolean z = this.f96260H0;
        ProductEcoScore productEcoScore = this.f96261I0;
        String str13 = this.f96262J0;
        List<NutritionalItem> list3 = this.f96263K0;
        String str14 = this.f96264L0;
        List<AllergenType> list4 = this.f96265M0;
        List<Traceability> list5 = this.f96266N0;
        boolean z2 = this.f96267O0;
        String str15 = this.f96268P0;
        boolean z3 = this.f96269Q0;
        return "Product(gtin=" + h + ", category=" + productCategory + ", flagsSortedByListPriority=" + list + ", images=" + list2 + ", nutriScore=" + productNutriScore + ", origin=" + str + ", packaging=" + str2 + ", ref=" + h2 + ", name=" + str3 + ", pricePerVolume=" + str4 + ", pricePerVolumeUnit=" + str5 + ", format=" + str6 + ", storageMode=" + str7 + ", warningAdvices=" + str8 + ", consumerAdvice=" + str9 + ", serviceCenterContact=" + str10 + ", informationFlagFormat=" + str11 + ", fullDescription=" + str12 + ", isVerifiedAllergoBox=" + z + ", ecoScore=" + productEcoScore + ", composition=" + str13 + ", nutritional=" + list3 + ", alcoholByVolumeLabel=" + str14 + ", allergens=" + list4 + ", traceabilities=" + list5 + ", isNotFood=" + z2 + ", brand=" + str15 + ", containAlcohol=" + z3 + ")";
    }

    /* renamed from: u */
    public final boolean mo118456u() {
        return this.f96269Q0;
    }

    @C12579k
    /* renamed from: v */
    public final List<OfferFlag> mo118457v() {
        return this.f96275c;
    }

    @C12579k
    /* renamed from: w */
    public final List<ProductPicture> mo118458w() {
        return this.f96276d;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Gtin.m157314j(this.f96273a, parcel, i);
        ProductCategory productCategory = this.f96274b;
        if (productCategory == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            productCategory.writeToParcel(parcel, i);
        }
        List<OfferFlag> list = this.f96275c;
        parcel.writeInt(list.size());
        for (OfferFlag name : list) {
            parcel.writeString(name.name());
        }
        List<ProductPicture> list2 = this.f96276d;
        parcel.writeInt(list2.size());
        for (ProductPicture writeToParcel : list2) {
            writeToParcel.writeToParcel(parcel, i);
        }
        ProductNutriScore productNutriScore = this.f96277e;
        if (productNutriScore == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(productNutriScore.name());
        }
        parcel.writeString(this.f96278f);
        parcel.writeString(this.f96279g);
        ProductReference.m157472j(this.f96280v, parcel, i);
        parcel.writeString(this.f96281w);
        parcel.writeString(this.f96282x);
        parcel.writeString(this.f96283y);
        parcel.writeString(this.f96284z);
        parcel.writeString(this.f96270X);
        parcel.writeString(this.f96271Y);
        parcel.writeString(this.f96272Z);
        parcel.writeString(this.f96257E0);
        parcel.writeString(this.f96258F0);
        parcel.writeString(this.f96259G0);
        parcel.writeInt(this.f96260H0 ? 1 : 0);
        ProductEcoScore productEcoScore = this.f96261I0;
        if (productEcoScore == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(productEcoScore.name());
        }
        parcel.writeString(this.f96262J0);
        List<NutritionalItem> list3 = this.f96263K0;
        parcel.writeInt(list3.size());
        for (NutritionalItem writeToParcel2 : list3) {
            writeToParcel2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f96264L0);
        List<AllergenType> list4 = this.f96265M0;
        parcel.writeInt(list4.size());
        for (AllergenType name2 : list4) {
            parcel.writeString(name2.name());
        }
        List<Traceability> list5 = this.f96266N0;
        parcel.writeInt(list5.size());
        for (Traceability writeToParcel3 : list5) {
            writeToParcel3.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f96267O0 ? 1 : 0);
        parcel.writeString(this.f96268P0);
        parcel.writeInt(this.f96269Q0 ? 1 : 0);
    }

    @C12580l
    /* renamed from: x */
    public final ProductNutriScore mo118460x() {
        return this.f96277e;
    }

    @C12579k
    /* renamed from: y */
    public final String mo118461y() {
        return this.f96278f;
    }

    @C12579k
    /* renamed from: z */
    public final String mo118462z() {
        return this.f96279g;
    }

    public Product(String str, ProductCategory productCategory, List<? extends OfferFlag> list, List<ProductPicture> list2, ProductNutriScore productNutriScore, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, ProductEcoScore productEcoScore, String str15, List<NutritionalItem> list3, String str16, List<? extends AllergenType> list4, List<Traceability> list5, boolean z2, String str17, boolean z3) {
        String str18 = str;
        List<? extends OfferFlag> list6 = list;
        List<ProductPicture> list7 = list2;
        String str19 = str2;
        String str20 = str3;
        String str21 = str4;
        String str22 = str5;
        String str23 = str6;
        String str24 = str7;
        String str25 = str8;
        List<NutritionalItem> list8 = list3;
        List<? extends AllergenType> list9 = list4;
        List<Traceability> list10 = list5;
        String str26 = str17;
        Intrinsics.checkNotNullParameter(str18, "gtin");
        Intrinsics.checkNotNullParameter(list6, "flagsSortedByListPriority");
        Intrinsics.checkNotNullParameter(list7, "images");
        Intrinsics.checkNotNullParameter(str19, "origin");
        Intrinsics.checkNotNullParameter(str20, "packaging");
        Intrinsics.checkNotNullParameter(str21, "ref");
        Intrinsics.checkNotNullParameter(str22, "name");
        Intrinsics.checkNotNullParameter(str23, "pricePerVolume");
        Intrinsics.checkNotNullParameter(str24, "pricePerVolumeUnit");
        Intrinsics.checkNotNullParameter(str25, "format");
        Intrinsics.checkNotNullParameter(list8, "nutritional");
        Intrinsics.checkNotNullParameter(list9, "allergens");
        Intrinsics.checkNotNullParameter(list10, "traceabilities");
        Intrinsics.checkNotNullParameter(str26, "brand");
        this.f96273a = str18;
        this.f96274b = productCategory;
        this.f96275c = list6;
        this.f96276d = list7;
        this.f96277e = productNutriScore;
        this.f96278f = str19;
        this.f96279g = str20;
        this.f96280v = str21;
        this.f96281w = str22;
        this.f96282x = str23;
        this.f96283y = str24;
        this.f96284z = str25;
        this.f96270X = str9;
        this.f96271Y = str10;
        this.f96272Z = str11;
        this.f96257E0 = str12;
        this.f96258F0 = str13;
        this.f96259G0 = str14;
        this.f96260H0 = z;
        this.f96261I0 = productEcoScore;
        this.f96262J0 = str15;
        this.f96263K0 = list8;
        this.f96264L0 = str16;
        this.f96265M0 = list9;
        this.f96266N0 = list10;
        this.f96267O0 = z2;
        this.f96268P0 = str26;
        this.f96269Q0 = z3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Product(String str, ProductCategory productCategory, List list, List list2, ProductNutriScore productNutriScore, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, ProductEcoScore productEcoScore, String str15, List list3, String str16, List list4, List list5, boolean z2, String str17, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, productCategory, list, list2, productNutriScore, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, (i & 262144) != 0 ? false : z, productEcoScore, str15, list3, str16, (i & 8388608) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list4, (i & 16777216) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list5, z2, str17, z3, (DefaultConstructorMarker) null);
    }
}
