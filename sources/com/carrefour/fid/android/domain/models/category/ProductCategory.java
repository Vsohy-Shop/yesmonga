package com.carrefour.fid.android.domain.models.category;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u000e¢\u0006\u0004\b;\u0010<J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bHÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bHÆ\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u000eHÆ\u0003J}\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\t2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u000eHÆ\u0001J\t\u0010\u001a\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\u0019\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0005HÖ\u0001R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b)\u0010(R\u0017\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b-\u0010(R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b.\u0010(R\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u00101R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u00104R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b8\u0006¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00104R#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006="}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/category/ProductCategory;", "Landroid/os/Parcelable;", "", "a", "b", "", "c", "d", "e", "Lcom/carrefour/fid/android/domain/models/category/CategoryType;", "f", "", "g", "h", "", "i", "id", "name", "level", "searchPath", "imageUrl", "type", "searchParam", "children", "categoryNamesByLevel", "j", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "q", "I", "p", "()I", "s", "o", "Lcom/carrefour/fid/android/domain/models/category/CategoryType;", "t", "()Lcom/carrefour/fid/android/domain/models/category/CategoryType;", "Ljava/util/List;", "r", "()Ljava/util/List;", "v", "m", "w", "Ljava/util/Map;", "l", "()Ljava/util/Map;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/domain/models/category/CategoryType;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class ProductCategory implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<ProductCategory> CREATOR = new C37991a();
    @C12579k

    /* renamed from: a */
    public final String f95620a;
    @C12579k

    /* renamed from: b */
    public final String f95621b;

    /* renamed from: c */
    public final int f95622c;
    @C12580l

    /* renamed from: d */
    public final String f95623d;
    @C12579k

    /* renamed from: e */
    public final String f95624e;
    @C12579k

    /* renamed from: f */
    public final CategoryType f95625f;
    @C12579k

    /* renamed from: g */
    public final List<String> f95626g;
    @C12579k

    /* renamed from: v */
    public final List<ProductCategory> f95627v;
    @C12579k

    /* renamed from: w */
    public final Map<Integer, String> f95628w;

    /* renamed from: com.carrefour.fid.android.domain.models.category.ProductCategory$a */
    public static final class C37991a implements Parcelable.Creator<ProductCategory> {
        @C12579k
        /* renamed from: a */
        public final ProductCategory createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            CategoryType valueOf = CategoryType.valueOf(parcel.readString());
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i = 0; i != readInt2; i++) {
                arrayList.add(ProductCategory.CREATOR.createFromParcel(parcel));
            }
            int readInt3 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt3);
            for (int i2 = 0; i2 != readInt3; i2++) {
                linkedHashMap.put(Integer.valueOf(parcel.readInt()), parcel.readString());
            }
            return new ProductCategory(readString, readString2, readInt, readString3, readString4, valueOf, createStringArrayList, arrayList, linkedHashMap);
        }

        @C12579k
        /* renamed from: b */
        public final ProductCategory[] newArray(int i) {
            return new ProductCategory[i];
        }
    }

    public ProductCategory(@C12579k String str, @C12579k String str2, int i, @C12580l String str3, @C12579k String str4, @C12579k CategoryType categoryType, @C12579k List<String> list, @C12579k List<ProductCategory> list2, @C12579k Map<Integer, String> map) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str4, "imageUrl");
        Intrinsics.checkNotNullParameter(categoryType, "type");
        Intrinsics.checkNotNullParameter(list, "searchParam");
        Intrinsics.checkNotNullParameter(list2, "children");
        Intrinsics.checkNotNullParameter(map, "categoryNamesByLevel");
        this.f95620a = str;
        this.f95621b = str2;
        this.f95622c = i;
        this.f95623d = str3;
        this.f95624e = str4;
        this.f95625f = categoryType;
        this.f95626g = list;
        this.f95627v = list2;
        this.f95628w = map;
    }

    /* renamed from: k */
    public static /* synthetic */ ProductCategory m156371k(ProductCategory productCategory, String str, String str2, int i, String str3, String str4, CategoryType categoryType, List list, List list2, Map map, int i2, Object obj) {
        ProductCategory productCategory2 = productCategory;
        int i3 = i2;
        return productCategory.mo117291j((i3 & 1) != 0 ? productCategory2.f95620a : str, (i3 & 2) != 0 ? productCategory2.f95621b : str2, (i3 & 4) != 0 ? productCategory2.f95622c : i, (i3 & 8) != 0 ? productCategory2.f95623d : str3, (i3 & 16) != 0 ? productCategory2.f95624e : str4, (i3 & 32) != 0 ? productCategory2.f95625f : categoryType, (i3 & 64) != 0 ? productCategory2.f95626g : list, (i3 & 128) != 0 ? productCategory2.f95627v : list2, (i3 & 256) != 0 ? productCategory2.f95628w : map);
    }

    @C12579k
    /* renamed from: a */
    public final String mo117279a() {
        return this.f95620a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo117280b() {
        return this.f95621b;
    }

    /* renamed from: c */
    public final int mo117281c() {
        return this.f95622c;
    }

    @C12580l
    /* renamed from: d */
    public final String mo117282d() {
        return this.f95623d;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final String mo117284e() {
        return this.f95624e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductCategory)) {
            return false;
        }
        ProductCategory productCategory = (ProductCategory) obj;
        return Intrinsics.areEqual((Object) this.f95620a, (Object) productCategory.f95620a) && Intrinsics.areEqual((Object) this.f95621b, (Object) productCategory.f95621b) && this.f95622c == productCategory.f95622c && Intrinsics.areEqual((Object) this.f95623d, (Object) productCategory.f95623d) && Intrinsics.areEqual((Object) this.f95624e, (Object) productCategory.f95624e) && this.f95625f == productCategory.f95625f && Intrinsics.areEqual((Object) this.f95626g, (Object) productCategory.f95626g) && Intrinsics.areEqual((Object) this.f95627v, (Object) productCategory.f95627v) && Intrinsics.areEqual((Object) this.f95628w, (Object) productCategory.f95628w);
    }

    @C12579k
    /* renamed from: f */
    public final CategoryType mo117286f() {
        return this.f95625f;
    }

    @C12579k
    /* renamed from: g */
    public final List<String> mo117287g() {
        return this.f95626g;
    }

    @C12579k
    /* renamed from: h */
    public final List<ProductCategory> mo117288h() {
        return this.f95627v;
    }

    public int hashCode() {
        int hashCode = ((((this.f95620a.hashCode() * 31) + this.f95621b.hashCode()) * 31) + Integer.hashCode(this.f95622c)) * 31;
        String str = this.f95623d;
        return ((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f95624e.hashCode()) * 31) + this.f95625f.hashCode()) * 31) + this.f95626g.hashCode()) * 31) + this.f95627v.hashCode()) * 31) + this.f95628w.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final Map<Integer, String> mo117290i() {
        return this.f95628w;
    }

    @C12579k
    /* renamed from: j */
    public final ProductCategory mo117291j(@C12579k String str, @C12579k String str2, int i, @C12580l String str3, @C12579k String str4, @C12579k CategoryType categoryType, @C12579k List<String> list, @C12579k List<ProductCategory> list2, @C12579k Map<Integer, String> map) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "name");
        String str5 = str4;
        Intrinsics.checkNotNullParameter(str5, "imageUrl");
        CategoryType categoryType2 = categoryType;
        Intrinsics.checkNotNullParameter(categoryType2, "type");
        List<String> list3 = list;
        Intrinsics.checkNotNullParameter(list3, "searchParam");
        List<ProductCategory> list4 = list2;
        Intrinsics.checkNotNullParameter(list4, "children");
        Map<Integer, String> map2 = map;
        Intrinsics.checkNotNullParameter(map2, "categoryNamesByLevel");
        return new ProductCategory(str, str2, i, str3, str5, categoryType2, list3, list4, map2);
    }

    @C12579k
    /* renamed from: l */
    public final Map<Integer, String> mo117292l() {
        return this.f95628w;
    }

    @C12579k
    /* renamed from: m */
    public final List<ProductCategory> mo117293m() {
        return this.f95627v;
    }

    @C12579k
    /* renamed from: n */
    public final String mo117294n() {
        return this.f95620a;
    }

    @C12579k
    /* renamed from: o */
    public final String mo117295o() {
        return this.f95624e;
    }

    /* renamed from: p */
    public final int mo117296p() {
        return this.f95622c;
    }

    @C12579k
    /* renamed from: q */
    public final String mo117297q() {
        return this.f95621b;
    }

    @C12579k
    /* renamed from: r */
    public final List<String> mo117298r() {
        return this.f95626g;
    }

    @C12580l
    /* renamed from: s */
    public final String mo117299s() {
        return this.f95623d;
    }

    @C12579k
    /* renamed from: t */
    public final CategoryType mo117300t() {
        return this.f95625f;
    }

    @C12579k
    public String toString() {
        String str = this.f95620a;
        String str2 = this.f95621b;
        int i = this.f95622c;
        String str3 = this.f95623d;
        String str4 = this.f95624e;
        CategoryType categoryType = this.f95625f;
        List<String> list = this.f95626g;
        List<ProductCategory> list2 = this.f95627v;
        Map<Integer, String> map = this.f95628w;
        return "ProductCategory(id=" + str + ", name=" + str2 + ", level=" + i + ", searchPath=" + str3 + ", imageUrl=" + str4 + ", type=" + categoryType + ", searchParam=" + list + ", children=" + list2 + ", categoryNamesByLevel=" + map + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95620a);
        parcel.writeString(this.f95621b);
        parcel.writeInt(this.f95622c);
        parcel.writeString(this.f95623d);
        parcel.writeString(this.f95624e);
        parcel.writeString(this.f95625f.name());
        parcel.writeStringList(this.f95626g);
        List<ProductCategory> list = this.f95627v;
        parcel.writeInt(list.size());
        for (ProductCategory writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        Map<Integer, String> map = this.f95628w;
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            parcel.writeInt(((Number) next.getKey()).intValue());
            parcel.writeString((String) next.getValue());
        }
    }
}
