package com.carrefour.fid.android.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\b\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u001d\u001a\u00020\t\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010 \u001a\u00020\t\u0012\b\b\u0002\u0010!\u001a\u00020\t\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\b\u0002\u0010%\u001a\u00020\u0015\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\bT\u0010UJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\r\u001a\u00020\tHÆ\u0003J\t\u0010\u000e\u001a\u00020\tHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0015HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J»\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u001d\u001a\u00020\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\t2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\b\b\u0002\u0010%\u001a\u00020\u00152\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010(\u001a\u00020\u0006HÖ\u0001J\t\u0010)\u001a\u00020\u0015HÖ\u0001J\u0013\u0010,\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010-\u001a\u00020\u0015HÖ\u0001J\u0019\u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u0015HÖ\u0001R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b6\u00105R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b7\u00105R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\b;\u0010:R\u0017\u0010\u001d\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u00108\u001a\u0004\b?\u0010:R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b6\u00108\u001a\u0004\b@\u0010:R\u0017\u0010 \u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b7\u0010<\u001a\u0004\bA\u0010>R\u0017\u0010!\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b?\u0010<\u001a\u0004\bB\u0010>R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b@\u00108\u001a\u0004\bC\u0010:R$\u0010#\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b;\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR*\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0017\u0010%\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0019\u0010&\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b<\u00108\u001a\u0004\bS\u0010:¨\u0006V"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/ProductListSettingsModel;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/presentation/models/DepartmentHeaderModel;", "a", "h", "i", "", "j", "k", "", "l", "m", "n", "o", "b", "c", "Lcom/carrefour/fid/android/presentation/models/SortModel;", "d", "", "Lcom/carrefour/fid/android/presentation/models/FacetModel;", "e", "", "f", "g", "level1Department", "level2Department", "level3Department", "departmentId", "queryId", "isPromo", "promoLabel", "promoQuery", "isSearch", "isFromProductSearchPage", "searchLabel", "sort", "facets", "start", "facilityServiceId", "p", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/presentation/models/DepartmentHeaderModel;", "u", "()Lcom/carrefour/fid/android/presentation/models/DepartmentHeaderModel;", "v", "w", "Ljava/lang/String;", "r", "()Ljava/lang/String;", "z", "Z", "E", "()Z", "x", "y", "F", "D", "A", "Lcom/carrefour/fid/android/presentation/models/SortModel;", "B", "()Lcom/carrefour/fid/android/presentation/models/SortModel;", "H", "(Lcom/carrefour/fid/android/presentation/models/SortModel;)V", "X", "Ljava/util/List;", "s", "()Ljava/util/List;", "G", "(Ljava/util/List;)V", "Y", "I", "C", "()I", "t", "<init>", "(Lcom/carrefour/fid/android/presentation/models/DepartmentHeaderModel;Lcom/carrefour/fid/android/presentation/models/DepartmentHeaderModel;Lcom/carrefour/fid/android/presentation/models/DepartmentHeaderModel;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lcom/carrefour/fid/android/presentation/models/SortModel;Ljava/util/List;ILjava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class ProductListSettingsModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<ProductListSettingsModel> CREATOR = new C38445a();

    /* renamed from: E0 */
    public static final int f97497E0 = 8;
    @C12580l

    /* renamed from: X */
    public List<FacetModel> f97498X;

    /* renamed from: Y */
    public final int f97499Y;
    @C12580l

    /* renamed from: Z */
    public final String f97500Z;
    @C12580l

    /* renamed from: a */
    public final DepartmentHeaderModel f97501a;
    @C12580l

    /* renamed from: b */
    public final DepartmentHeaderModel f97502b;
    @C12580l

    /* renamed from: c */
    public final DepartmentHeaderModel f97503c;
    @C12580l

    /* renamed from: d */
    public final String f97504d;
    @C12580l

    /* renamed from: e */
    public final String f97505e;

    /* renamed from: f */
    public final boolean f97506f;
    @C12580l

    /* renamed from: g */
    public final String f97507g;
    @C12580l

    /* renamed from: v */
    public final String f97508v;

    /* renamed from: w */
    public final boolean f97509w;

    /* renamed from: x */
    public final boolean f97510x;
    @C12580l

    /* renamed from: y */
    public final String f97511y;
    @C12580l

    /* renamed from: z */
    public SortModel f97512z;

    /* renamed from: com.carrefour.fid.android.presentation.models.ProductListSettingsModel$a */
    public static final class C38445a implements Parcelable.Creator<ProductListSettingsModel> {
        @C12579k
        /* renamed from: a */
        public final ProductListSettingsModel createFromParcel(@C12579k Parcel parcel) {
            ArrayList arrayList;
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            DepartmentHeaderModel createFromParcel = parcel.readInt() == 0 ? null : DepartmentHeaderModel.CREATOR.createFromParcel(parcel2);
            DepartmentHeaderModel createFromParcel2 = parcel.readInt() == 0 ? null : DepartmentHeaderModel.CREATOR.createFromParcel(parcel2);
            DepartmentHeaderModel createFromParcel3 = parcel.readInt() == 0 ? null : DepartmentHeaderModel.CREATOR.createFromParcel(parcel2);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int i = 0;
            boolean z = parcel.readInt() != 0;
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            String readString5 = parcel.readString();
            SortModel createFromParcel4 = parcel.readInt() == 0 ? null : SortModel.CREATOR.createFromParcel(parcel2);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                while (i != readInt) {
                    arrayList2.add(FacetModel.CREATOR.createFromParcel(parcel2));
                    i++;
                    readInt = readInt;
                }
                arrayList = arrayList2;
            }
            return new ProductListSettingsModel(createFromParcel, createFromParcel2, createFromParcel3, readString, readString2, z, readString3, readString4, z2, z3, readString5, createFromParcel4, arrayList, parcel.readInt(), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final ProductListSettingsModel[] newArray(int i) {
            return new ProductListSettingsModel[i];
        }
    }

    public ProductListSettingsModel() {
        this((DepartmentHeaderModel) null, (DepartmentHeaderModel) null, (DepartmentHeaderModel) null, (String) null, (String) null, false, (String) null, (String) null, false, false, (String) null, (SortModel) null, (List) null, 0, (String) null, 32767, (DefaultConstructorMarker) null);
    }

    /* renamed from: q */
    public static /* synthetic */ ProductListSettingsModel m159380q(ProductListSettingsModel productListSettingsModel, DepartmentHeaderModel departmentHeaderModel, DepartmentHeaderModel departmentHeaderModel2, DepartmentHeaderModel departmentHeaderModel3, String str, String str2, boolean z, String str3, String str4, boolean z2, boolean z3, String str5, SortModel sortModel, List list, int i, String str6, int i2, Object obj) {
        ProductListSettingsModel productListSettingsModel2 = productListSettingsModel;
        int i3 = i2;
        return productListSettingsModel.mo121851p((i3 & 1) != 0 ? productListSettingsModel2.f97501a : departmentHeaderModel, (i3 & 2) != 0 ? productListSettingsModel2.f97502b : departmentHeaderModel2, (i3 & 4) != 0 ? productListSettingsModel2.f97503c : departmentHeaderModel3, (i3 & 8) != 0 ? productListSettingsModel2.f97504d : str, (i3 & 16) != 0 ? productListSettingsModel2.f97505e : str2, (i3 & 32) != 0 ? productListSettingsModel2.f97506f : z, (i3 & 64) != 0 ? productListSettingsModel2.f97507g : str3, (i3 & 128) != 0 ? productListSettingsModel2.f97508v : str4, (i3 & 256) != 0 ? productListSettingsModel2.f97509w : z2, (i3 & 512) != 0 ? productListSettingsModel2.f97510x : z3, (i3 & 1024) != 0 ? productListSettingsModel2.f97511y : str5, (i3 & 2048) != 0 ? productListSettingsModel2.f97512z : sortModel, (i3 & 4096) != 0 ? productListSettingsModel2.f97498X : list, (i3 & 8192) != 0 ? productListSettingsModel2.f97499Y : i, (i3 & 16384) != 0 ? productListSettingsModel2.f97500Z : str6);
    }

    @C12580l
    /* renamed from: A */
    public final String mo121825A() {
        return this.f97511y;
    }

    @C12580l
    /* renamed from: B */
    public final SortModel mo121826B() {
        return this.f97512z;
    }

    /* renamed from: C */
    public final int mo121827C() {
        return this.f97499Y;
    }

    /* renamed from: D */
    public final boolean mo121828D() {
        return this.f97510x;
    }

    /* renamed from: E */
    public final boolean mo121829E() {
        return this.f97506f;
    }

    /* renamed from: F */
    public final boolean mo121830F() {
        return this.f97509w;
    }

    /* renamed from: G */
    public final void mo121831G(@C12580l List<FacetModel> list) {
        this.f97498X = list;
    }

    /* renamed from: H */
    public final void mo121832H(@C12580l SortModel sortModel) {
        this.f97512z = sortModel;
    }

    @C12580l
    /* renamed from: a */
    public final DepartmentHeaderModel mo121833a() {
        return this.f97501a;
    }

    /* renamed from: b */
    public final boolean mo121834b() {
        return this.f97510x;
    }

    @C12580l
    /* renamed from: c */
    public final String mo121835c() {
        return this.f97511y;
    }

    @C12580l
    /* renamed from: d */
    public final SortModel mo121836d() {
        return this.f97512z;
    }

    public int describeContents() {
        return 0;
    }

    @C12580l
    /* renamed from: e */
    public final List<FacetModel> mo121838e() {
        return this.f97498X;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductListSettingsModel)) {
            return false;
        }
        ProductListSettingsModel productListSettingsModel = (ProductListSettingsModel) obj;
        return Intrinsics.areEqual((Object) this.f97501a, (Object) productListSettingsModel.f97501a) && Intrinsics.areEqual((Object) this.f97502b, (Object) productListSettingsModel.f97502b) && Intrinsics.areEqual((Object) this.f97503c, (Object) productListSettingsModel.f97503c) && Intrinsics.areEqual((Object) this.f97504d, (Object) productListSettingsModel.f97504d) && Intrinsics.areEqual((Object) this.f97505e, (Object) productListSettingsModel.f97505e) && this.f97506f == productListSettingsModel.f97506f && Intrinsics.areEqual((Object) this.f97507g, (Object) productListSettingsModel.f97507g) && Intrinsics.areEqual((Object) this.f97508v, (Object) productListSettingsModel.f97508v) && this.f97509w == productListSettingsModel.f97509w && this.f97510x == productListSettingsModel.f97510x && Intrinsics.areEqual((Object) this.f97511y, (Object) productListSettingsModel.f97511y) && Intrinsics.areEqual((Object) this.f97512z, (Object) productListSettingsModel.f97512z) && Intrinsics.areEqual((Object) this.f97498X, (Object) productListSettingsModel.f97498X) && this.f97499Y == productListSettingsModel.f97499Y && Intrinsics.areEqual((Object) this.f97500Z, (Object) productListSettingsModel.f97500Z);
    }

    /* renamed from: f */
    public final int mo121840f() {
        return this.f97499Y;
    }

    @C12580l
    /* renamed from: g */
    public final String mo121841g() {
        return this.f97500Z;
    }

    @C12580l
    /* renamed from: h */
    public final DepartmentHeaderModel mo121842h() {
        return this.f97502b;
    }

    public int hashCode() {
        DepartmentHeaderModel departmentHeaderModel = this.f97501a;
        int i = 0;
        int hashCode = (departmentHeaderModel == null ? 0 : departmentHeaderModel.hashCode()) * 31;
        DepartmentHeaderModel departmentHeaderModel2 = this.f97502b;
        int hashCode2 = (hashCode + (departmentHeaderModel2 == null ? 0 : departmentHeaderModel2.hashCode())) * 31;
        DepartmentHeaderModel departmentHeaderModel3 = this.f97503c;
        int hashCode3 = (hashCode2 + (departmentHeaderModel3 == null ? 0 : departmentHeaderModel3.hashCode())) * 31;
        String str = this.f97504d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f97505e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.f97506f;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode5 + (z ? 1 : 0)) * 31;
        String str3 = this.f97507g;
        int hashCode6 = (i2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f97508v;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z3 = this.f97509w;
        if (z3) {
            z3 = true;
        }
        int i3 = (hashCode7 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f97510x;
        if (!z4) {
            z2 = z4;
        }
        int i4 = (i3 + (z2 ? 1 : 0)) * 31;
        String str5 = this.f97511y;
        int hashCode8 = (i4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        SortModel sortModel = this.f97512z;
        int hashCode9 = (hashCode8 + (sortModel == null ? 0 : sortModel.hashCode())) * 31;
        List<FacetModel> list = this.f97498X;
        int hashCode10 = (((hashCode9 + (list == null ? 0 : list.hashCode())) * 31) + Integer.hashCode(this.f97499Y)) * 31;
        String str6 = this.f97500Z;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode10 + i;
    }

    @C12580l
    /* renamed from: i */
    public final DepartmentHeaderModel mo121844i() {
        return this.f97503c;
    }

    @C12580l
    /* renamed from: j */
    public final String mo121845j() {
        return this.f97504d;
    }

    @C12580l
    /* renamed from: k */
    public final String mo121846k() {
        return this.f97505e;
    }

    /* renamed from: l */
    public final boolean mo121847l() {
        return this.f97506f;
    }

    @C12580l
    /* renamed from: m */
    public final String mo121848m() {
        return this.f97507g;
    }

    @C12580l
    /* renamed from: n */
    public final String mo121849n() {
        return this.f97508v;
    }

    /* renamed from: o */
    public final boolean mo121850o() {
        return this.f97509w;
    }

    @C12579k
    /* renamed from: p */
    public final ProductListSettingsModel mo121851p(@C12580l DepartmentHeaderModel departmentHeaderModel, @C12580l DepartmentHeaderModel departmentHeaderModel2, @C12580l DepartmentHeaderModel departmentHeaderModel3, @C12580l String str, @C12580l String str2, boolean z, @C12580l String str3, @C12580l String str4, boolean z2, boolean z3, @C12580l String str5, @C12580l SortModel sortModel, @C12580l List<FacetModel> list, int i, @C12580l String str6) {
        return new ProductListSettingsModel(departmentHeaderModel, departmentHeaderModel2, departmentHeaderModel3, str, str2, z, str3, str4, z2, z3, str5, sortModel, list, i, str6);
    }

    @C12580l
    /* renamed from: r */
    public final String mo121852r() {
        return this.f97504d;
    }

    @C12580l
    /* renamed from: s */
    public final List<FacetModel> mo121853s() {
        return this.f97498X;
    }

    @C12580l
    /* renamed from: t */
    public final String mo121854t() {
        return this.f97500Z;
    }

    @C12579k
    public String toString() {
        DepartmentHeaderModel departmentHeaderModel = this.f97501a;
        DepartmentHeaderModel departmentHeaderModel2 = this.f97502b;
        DepartmentHeaderModel departmentHeaderModel3 = this.f97503c;
        String str = this.f97504d;
        String str2 = this.f97505e;
        boolean z = this.f97506f;
        String str3 = this.f97507g;
        String str4 = this.f97508v;
        boolean z2 = this.f97509w;
        boolean z3 = this.f97510x;
        String str5 = this.f97511y;
        SortModel sortModel = this.f97512z;
        List<FacetModel> list = this.f97498X;
        int i = this.f97499Y;
        String str6 = this.f97500Z;
        return "ProductListSettingsModel(level1Department=" + departmentHeaderModel + ", level2Department=" + departmentHeaderModel2 + ", level3Department=" + departmentHeaderModel3 + ", departmentId=" + str + ", queryId=" + str2 + ", isPromo=" + z + ", promoLabel=" + str3 + ", promoQuery=" + str4 + ", isSearch=" + z2 + ", isFromProductSearchPage=" + z3 + ", searchLabel=" + str5 + ", sort=" + sortModel + ", facets=" + list + ", start=" + i + ", facilityServiceId=" + str6 + ")";
    }

    @C12580l
    /* renamed from: u */
    public final DepartmentHeaderModel mo121856u() {
        return this.f97501a;
    }

    @C12580l
    /* renamed from: v */
    public final DepartmentHeaderModel mo121857v() {
        return this.f97502b;
    }

    @C12580l
    /* renamed from: w */
    public final DepartmentHeaderModel mo121858w() {
        return this.f97503c;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        DepartmentHeaderModel departmentHeaderModel = this.f97501a;
        if (departmentHeaderModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            departmentHeaderModel.writeToParcel(parcel, i);
        }
        DepartmentHeaderModel departmentHeaderModel2 = this.f97502b;
        if (departmentHeaderModel2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            departmentHeaderModel2.writeToParcel(parcel, i);
        }
        DepartmentHeaderModel departmentHeaderModel3 = this.f97503c;
        if (departmentHeaderModel3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            departmentHeaderModel3.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f97504d);
        parcel.writeString(this.f97505e);
        parcel.writeInt(this.f97506f ? 1 : 0);
        parcel.writeString(this.f97507g);
        parcel.writeString(this.f97508v);
        parcel.writeInt(this.f97509w ? 1 : 0);
        parcel.writeInt(this.f97510x ? 1 : 0);
        parcel.writeString(this.f97511y);
        SortModel sortModel = this.f97512z;
        if (sortModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sortModel.writeToParcel(parcel, i);
        }
        List<FacetModel> list = this.f97498X;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (FacetModel writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.f97499Y);
        parcel.writeString(this.f97500Z);
    }

    @C12580l
    /* renamed from: x */
    public final String mo121860x() {
        return this.f97507g;
    }

    @C12580l
    /* renamed from: y */
    public final String mo121861y() {
        return this.f97508v;
    }

    @C12580l
    /* renamed from: z */
    public final String mo121862z() {
        return this.f97505e;
    }

    public ProductListSettingsModel(@C12580l DepartmentHeaderModel departmentHeaderModel, @C12580l DepartmentHeaderModel departmentHeaderModel2, @C12580l DepartmentHeaderModel departmentHeaderModel3, @C12580l String str, @C12580l String str2, boolean z, @C12580l String str3, @C12580l String str4, boolean z2, boolean z3, @C12580l String str5, @C12580l SortModel sortModel, @C12580l List<FacetModel> list, int i, @C12580l String str6) {
        this.f97501a = departmentHeaderModel;
        this.f97502b = departmentHeaderModel2;
        this.f97503c = departmentHeaderModel3;
        this.f97504d = str;
        this.f97505e = str2;
        this.f97506f = z;
        this.f97507g = str3;
        this.f97508v = str4;
        this.f97509w = z2;
        this.f97510x = z3;
        this.f97511y = str5;
        this.f97512z = sortModel;
        this.f97498X = list;
        this.f97499Y = i;
        this.f97500Z = str6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ProductListSettingsModel(com.carrefour.fid.android.presentation.models.DepartmentHeaderModel r17, com.carrefour.fid.android.presentation.models.DepartmentHeaderModel r18, com.carrefour.fid.android.presentation.models.DepartmentHeaderModel r19, java.lang.String r20, java.lang.String r21, boolean r22, java.lang.String r23, java.lang.String r24, boolean r25, boolean r26, java.lang.String r27, com.carrefour.fid.android.presentation.models.SortModel r28, java.util.List r29, int r30, java.lang.String r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            r16 = this;
            r0 = r32
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r17
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r18
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r19
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r20
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r21
        L_0x002a:
            r7 = r0 & 32
            r8 = 0
            if (r7 == 0) goto L_0x0031
            r7 = r8
            goto L_0x0033
        L_0x0031:
            r7 = r22
        L_0x0033:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x0039
            r9 = 0
            goto L_0x003b
        L_0x0039:
            r9 = r23
        L_0x003b:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0041
            r10 = 0
            goto L_0x0043
        L_0x0041:
            r10 = r24
        L_0x0043:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0049
            r11 = r8
            goto L_0x004b
        L_0x0049:
            r11 = r25
        L_0x004b:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0051
            r12 = r8
            goto L_0x0053
        L_0x0051:
            r12 = r26
        L_0x0053:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x0059
            r13 = 0
            goto L_0x005b
        L_0x0059:
            r13 = r27
        L_0x005b:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0061
            r14 = 0
            goto L_0x0063
        L_0x0061:
            r14 = r28
        L_0x0063:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x0069
            r15 = 0
            goto L_0x006b
        L_0x0069:
            r15 = r29
        L_0x006b:
            r2 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            r8 = r30
        L_0x0072:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0078
            r0 = 0
            goto L_0x007a
        L_0x0078:
            r0 = r31
        L_0x007a:
            r17 = r16
            r18 = r1
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r9
            r25 = r10
            r26 = r11
            r27 = r12
            r28 = r13
            r29 = r14
            r30 = r15
            r31 = r8
            r32 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.models.ProductListSettingsModel.<init>(com.carrefour.fid.android.presentation.models.DepartmentHeaderModel, com.carrefour.fid.android.presentation.models.DepartmentHeaderModel, com.carrefour.fid.android.presentation.models.DepartmentHeaderModel, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, com.carrefour.fid.android.presentation.models.SortModel, java.util.List, int, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
