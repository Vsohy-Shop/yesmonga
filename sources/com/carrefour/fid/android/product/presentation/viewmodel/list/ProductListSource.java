package com.carrefour.fid.android.product.presentation.viewmodel.list;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.SearchParam;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/viewmodel/list/ProductListSource;", "Landroid/os/Parcelable;", "Department", "MixingBottomSheet", "Promo", "Query", "Search", "Lcom/carrefour/fid/android/product/presentation/viewmodel/list/ProductListSource$Department;", "Lcom/carrefour/fid/android/product/presentation/viewmodel/list/ProductListSource$MixingBottomSheet;", "Lcom/carrefour/fid/android/product/presentation/viewmodel/list/ProductListSource$Promo;", "Lcom/carrefour/fid/android/product/presentation/viewmodel/list/ProductListSource$Query;", "Lcom/carrefour/fid/android/product/presentation/viewmodel/list/ProductListSource$Search;", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public interface ProductListSource extends Parcelable {

    @C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000e\u001a\u00020\bHÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/viewmodel/list/ProductListSource$Department;", "Lcom/carrefour/fid/android/product/presentation/viewmodel/list/ProductListSource;", "Lcom/carrefour/fid/android/domain/models/category/ProductCategory;", "a", "productCategory", "b", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/domain/models/category/ProductCategory;", "d", "()Lcom/carrefour/fid/android/domain/models/category/ProductCategory;", "<init>", "(Lcom/carrefour/fid/android/domain/models/category/ProductCategory;)V", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class Department implements ProductListSource {
        @C12579k
        public static final Parcelable.Creator<Department> CREATOR = new C28194a();

        /* renamed from: b */
        public static final int f68291b = 8;
        @C12579k

        /* renamed from: a */
        public final ProductCategory f68292a;

        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.list.ProductListSource$Department$a */
        public static final class C28194a implements Parcelable.Creator<Department> {
            @C12579k
            /* renamed from: a */
            public final Department createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Department((ProductCategory) parcel.readParcelable(Department.class.getClassLoader()));
            }

            @C12579k
            /* renamed from: b */
            public final Department[] newArray(int i) {
                return new Department[i];
            }
        }

        public Department(@C12579k ProductCategory productCategory) {
            Intrinsics.checkNotNullParameter(productCategory, "productCategory");
            this.f68292a = productCategory;
        }

        /* renamed from: c */
        public static /* synthetic */ Department m118047c(Department department, ProductCategory productCategory, int i, Object obj) {
            if ((i & 1) != 0) {
                productCategory = department.f68292a;
            }
            return department.mo82058b(productCategory);
        }

        @C12579k
        /* renamed from: a */
        public final ProductCategory mo82057a() {
            return this.f68292a;
        }

        @C12579k
        /* renamed from: b */
        public final Department mo82058b(@C12579k ProductCategory productCategory) {
            Intrinsics.checkNotNullParameter(productCategory, "productCategory");
            return new Department(productCategory);
        }

        @C12579k
        /* renamed from: d */
        public final ProductCategory mo82059d() {
            return this.f68292a;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Department) && Intrinsics.areEqual((Object) this.f68292a, (Object) ((Department) obj).f68292a);
        }

        public int hashCode() {
            return this.f68292a.hashCode();
        }

        @C12579k
        public String toString() {
            ProductCategory productCategory = this.f68292a;
            return "Department(productCategory=" + productCategory + ")";
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeParcelable(this.f68292a, i);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0018\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003ø\u0001\u0000J\u001c\u0010\u0006\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001ø\u0001\u0000J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u000f\u001a\u00020\tHÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tHÖ\u0001R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/viewmodel/list/ProductListSource$MixingBottomSheet;", "Lcom/carrefour/fid/android/product/presentation/viewmodel/list/ProductListSource;", "", "Lcom/carrefour/fid/android/domain/models/product/Gtin;", "a", "gtins", "b", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/util/List;", "d", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class MixingBottomSheet implements ProductListSource {
        @C12579k
        public static final Parcelable.Creator<MixingBottomSheet> CREATOR = new C28195a();

        /* renamed from: b */
        public static final int f68293b = 8;
        @C12579k

        /* renamed from: a */
        public final List<Gtin> f68294a;

        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.list.ProductListSource$MixingBottomSheet$a */
        public static final class C28195a implements Parcelable.Creator<MixingBottomSheet> {
            @C12579k
            /* renamed from: a */
            public final MixingBottomSheet createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(parcel.readParcelable(MixingBottomSheet.class.getClassLoader()));
                }
                return new MixingBottomSheet(arrayList);
            }

            @C12579k
            /* renamed from: b */
            public final MixingBottomSheet[] newArray(int i) {
                return new MixingBottomSheet[i];
            }
        }

        public MixingBottomSheet(@C12579k List<Gtin> list) {
            Intrinsics.checkNotNullParameter(list, "gtins");
            this.f68294a = list;
        }

        /* renamed from: c */
        public static /* synthetic */ MixingBottomSheet m118053c(MixingBottomSheet mixingBottomSheet, List<Gtin> list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = mixingBottomSheet.f68294a;
            }
            return mixingBottomSheet.mo82070b(list);
        }

        @C12579k
        /* renamed from: a */
        public final List<Gtin> mo82069a() {
            return this.f68294a;
        }

        @C12579k
        /* renamed from: b */
        public final MixingBottomSheet mo82070b(@C12579k List<Gtin> list) {
            Intrinsics.checkNotNullParameter(list, "gtins");
            return new MixingBottomSheet(list);
        }

        @C12579k
        /* renamed from: d */
        public final List<Gtin> mo82071d() {
            return this.f68294a;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MixingBottomSheet) && Intrinsics.areEqual((Object) this.f68294a, (Object) ((MixingBottomSheet) obj).f68294a);
        }

        public int hashCode() {
            return this.f68294a.hashCode();
        }

        @C12579k
        public String toString() {
            List<Gtin> list = this.f68294a;
            return "MixingBottomSheet(gtins=" + list + ")";
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            List<Gtin> list = this.f68294a;
            parcel.writeInt(list.size());
            for (Gtin writeParcelable : list) {
                parcel.writeParcelable(writeParcelable, i);
            }
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/viewmodel/list/ProductListSource$Promo;", "Lcom/carrefour/fid/android/product/presentation/viewmodel/list/ProductListSource;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class Promo implements ProductListSource {
        @C12579k
        public static final Parcelable.Creator<Promo> CREATOR = new C28196a();
        @C12579k

        /* renamed from: a */
        public static final Promo f68295a = new Promo();

        /* renamed from: b */
        public static final int f68296b = 0;

        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.list.ProductListSource$Promo$a */
        public static final class C28196a implements Parcelable.Creator<Promo> {
            @C12579k
            /* renamed from: a */
            public final Promo createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Promo.f68295a;
            }

            @C12579k
            /* renamed from: b */
            public final Promo[] newArray(int i) {
                return new Promo[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\r\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/viewmodel/list/ProductListSource$Query;", "Lcom/carrefour/fid/android/product/presentation/viewmodel/list/ProductListSource;", "", "a", "query", "b", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class Query implements ProductListSource {
        @C12579k
        public static final Parcelable.Creator<Query> CREATOR = new C28197a();

        /* renamed from: b */
        public static final int f68297b = 0;
        @C12579k

        /* renamed from: a */
        public final String f68298a;

        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.list.ProductListSource$Query$a */
        public static final class C28197a implements Parcelable.Creator<Query> {
            @C12579k
            /* renamed from: a */
            public final Query createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Query(parcel.readString());
            }

            @C12579k
            /* renamed from: b */
            public final Query[] newArray(int i) {
                return new Query[i];
            }
        }

        public Query(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "query");
            this.f68298a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ Query m118061c(Query query, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = query.f68298a;
            }
            return query.mo82088b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo82087a() {
            return this.f68298a;
        }

        @C12579k
        /* renamed from: b */
        public final Query mo82088b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "query");
            return new Query(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo82089d() {
            return this.f68298a;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Query) && Intrinsics.areEqual((Object) this.f68298a, (Object) ((Query) obj).f68298a);
        }

        public int hashCode() {
            return this.f68298a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f68298a;
            return "Query(query=" + str + ")";
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.f68298a);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0002ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u0003\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u0010\u001a\u00020\nHÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nHÖ\u0001R \u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/viewmodel/list/ProductListSource$Search;", "Lcom/carrefour/fid/android/product/presentation/viewmodel/list/ProductListSource;", "Lcom/carrefour/fid/android/domain/models/product/SearchParam;", "a", "()Ljava/lang/String;", "searchParam", "b", "(Ljava/lang/String;)Lcom/carrefour/fid/android/product/presentation/viewmodel/list/ProductListSource$Search;", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "d", "<init>", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class Search implements ProductListSource {
        @C12579k
        public static final Parcelable.Creator<Search> CREATOR = new C28198a();

        /* renamed from: b */
        public static final int f68299b = 0;
        @C12579k

        /* renamed from: a */
        public final String f68300a;

        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.list.ProductListSource$Search$a */
        public static final class C28198a implements Parcelable.Creator<Search> {
            @C12579k
            /* renamed from: a */
            public final Search createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Search(((SearchParam) parcel.readParcelable(Search.class.getClassLoader())).mo118598i(), (DefaultConstructorMarker) null);
            }

            @C12579k
            /* renamed from: b */
            public final Search[] newArray(int i) {
                return new Search[i];
            }
        }

        public /* synthetic */ Search(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        /* renamed from: c */
        public static /* synthetic */ Search m118067c(Search search, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = search.f68300a;
            }
            return search.mo82100b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo82099a() {
            return this.f68300a;
        }

        @C12579k
        /* renamed from: b */
        public final Search mo82100b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "searchParam");
            return new Search(str, (DefaultConstructorMarker) null);
        }

        @C12579k
        /* renamed from: d */
        public final String mo82101d() {
            return this.f68300a;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Search) && SearchParam.m157481e(this.f68300a, ((Search) obj).f68300a);
        }

        public int hashCode() {
            return SearchParam.m157482g(this.f68300a);
        }

        @C12579k
        public String toString() {
            String h = SearchParam.m157483h(this.f68300a);
            return "Search(searchParam=" + h + ")";
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeParcelable(SearchParam.m157477a(this.f68300a), i);
        }

        public Search(String str) {
            Intrinsics.checkNotNullParameter(str, "searchParam");
            this.f68300a = str;
        }
    }
}
