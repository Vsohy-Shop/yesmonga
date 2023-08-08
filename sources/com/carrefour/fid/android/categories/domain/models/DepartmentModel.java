package com.carrefour.fid.android.categories.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.category.CategoryType;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b.\u0010/J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003J_\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u00062\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0015HÖ\u0001J\u0019\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b$\u0010#R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b%\u0010#R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b,\u0010#R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b-\u0010(¨\u00060"}, mo22516d2 = {"Lcom/carrefour/fid/android/categories/domain/models/DepartmentModel;", "Landroid/os/Parcelable;", "", "a", "b", "c", "", "d", "Lcom/carrefour/fid/android/domain/models/category/CategoryType;", "e", "f", "g", "id", "label", "imageUrl", "children", "type", "fieldPath", "searchParam", "h", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "l", "()Ljava/lang/String;", "n", "m", "Ljava/util/List;", "j", "()Ljava/util/List;", "Lcom/carrefour/fid/android/domain/models/category/CategoryType;", "p", "()Lcom/carrefour/fid/android/domain/models/category/CategoryType;", "k", "o", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/carrefour/fid/android/domain/models/category/CategoryType;Ljava/lang/String;Ljava/util/List;)V", "categories_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class DepartmentModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<DepartmentModel> CREATOR = new C39749a();

    /* renamed from: v */
    public static final int f101456v = 8;
    @C12579k

    /* renamed from: a */
    public final String f101457a;
    @C12579k

    /* renamed from: b */
    public final String f101458b;
    @C12579k

    /* renamed from: c */
    public final String f101459c;
    @C12579k

    /* renamed from: d */
    public final List<DepartmentModel> f101460d;
    @C12579k

    /* renamed from: e */
    public final CategoryType f101461e;
    @C12580l

    /* renamed from: f */
    public final String f101462f;
    @C12580l

    /* renamed from: g */
    public final List<String> f101463g;

    /* renamed from: com.carrefour.fid.android.categories.domain.models.DepartmentModel$a */
    public static final class C39749a implements Parcelable.Creator<DepartmentModel> {
        @C12579k
        /* renamed from: a */
        public final DepartmentModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(DepartmentModel.CREATOR.createFromParcel(parcel));
            }
            return new DepartmentModel(readString, readString2, readString3, arrayList, CategoryType.valueOf(parcel.readString()), parcel.readString(), parcel.createStringArrayList());
        }

        @C12579k
        /* renamed from: b */
        public final DepartmentModel[] newArray(int i) {
            return new DepartmentModel[i];
        }
    }

    public DepartmentModel(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k List<DepartmentModel> list, @C12579k CategoryType categoryType, @C12580l String str4, @C12580l List<String> list2) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "label");
        Intrinsics.checkNotNullParameter(str3, "imageUrl");
        Intrinsics.checkNotNullParameter(list, "children");
        Intrinsics.checkNotNullParameter(categoryType, "type");
        this.f101457a = str;
        this.f101458b = str2;
        this.f101459c = str3;
        this.f101460d = list;
        this.f101461e = categoryType;
        this.f101462f = str4;
        this.f101463g = list2;
    }

    /* renamed from: i */
    public static /* synthetic */ DepartmentModel m162199i(DepartmentModel departmentModel, String str, String str2, String str3, List<DepartmentModel> list, CategoryType categoryType, String str4, List<String> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = departmentModel.f101457a;
        }
        if ((i & 2) != 0) {
            str2 = departmentModel.f101458b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = departmentModel.f101459c;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            list = departmentModel.f101460d;
        }
        List<DepartmentModel> list3 = list;
        if ((i & 16) != 0) {
            categoryType = departmentModel.f101461e;
        }
        CategoryType categoryType2 = categoryType;
        if ((i & 32) != 0) {
            str4 = departmentModel.f101462f;
        }
        String str7 = str4;
        if ((i & 64) != 0) {
            list2 = departmentModel.f101463g;
        }
        return departmentModel.mo131041h(str, str5, str6, list3, categoryType2, str7, list2);
    }

    @C12579k
    /* renamed from: a */
    public final String mo131032a() {
        return this.f101457a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo131033b() {
        return this.f101458b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo131034c() {
        return this.f101459c;
    }

    @C12579k
    /* renamed from: d */
    public final List<DepartmentModel> mo131035d() {
        return this.f101460d;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final CategoryType mo131037e() {
        return this.f101461e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepartmentModel)) {
            return false;
        }
        DepartmentModel departmentModel = (DepartmentModel) obj;
        return Intrinsics.areEqual((Object) this.f101457a, (Object) departmentModel.f101457a) && Intrinsics.areEqual((Object) this.f101458b, (Object) departmentModel.f101458b) && Intrinsics.areEqual((Object) this.f101459c, (Object) departmentModel.f101459c) && Intrinsics.areEqual((Object) this.f101460d, (Object) departmentModel.f101460d) && this.f101461e == departmentModel.f101461e && Intrinsics.areEqual((Object) this.f101462f, (Object) departmentModel.f101462f) && Intrinsics.areEqual((Object) this.f101463g, (Object) departmentModel.f101463g);
    }

    @C12580l
    /* renamed from: f */
    public final String mo131039f() {
        return this.f101462f;
    }

    @C12580l
    /* renamed from: g */
    public final List<String> mo131040g() {
        return this.f101463g;
    }

    @C12579k
    /* renamed from: h */
    public final DepartmentModel mo131041h(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k List<DepartmentModel> list, @C12579k CategoryType categoryType, @C12580l String str4, @C12580l List<String> list2) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "label");
        Intrinsics.checkNotNullParameter(str3, "imageUrl");
        Intrinsics.checkNotNullParameter(list, "children");
        Intrinsics.checkNotNullParameter(categoryType, "type");
        return new DepartmentModel(str, str2, str3, list, categoryType, str4, list2);
    }

    public int hashCode() {
        int hashCode = ((((((((this.f101457a.hashCode() * 31) + this.f101458b.hashCode()) * 31) + this.f101459c.hashCode()) * 31) + this.f101460d.hashCode()) * 31) + this.f101461e.hashCode()) * 31;
        String str = this.f101462f;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.f101463g;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    /* renamed from: j */
    public final List<DepartmentModel> mo131043j() {
        return this.f101460d;
    }

    @C12580l
    /* renamed from: k */
    public final String mo131044k() {
        return this.f101462f;
    }

    @C12579k
    /* renamed from: l */
    public final String mo131045l() {
        return this.f101457a;
    }

    @C12579k
    /* renamed from: m */
    public final String mo131046m() {
        return this.f101459c;
    }

    @C12579k
    /* renamed from: n */
    public final String mo131047n() {
        return this.f101458b;
    }

    @C12580l
    /* renamed from: o */
    public final List<String> mo131048o() {
        return this.f101463g;
    }

    @C12579k
    /* renamed from: p */
    public final CategoryType mo131049p() {
        return this.f101461e;
    }

    @C12579k
    public String toString() {
        String str = this.f101457a;
        String str2 = this.f101458b;
        String str3 = this.f101459c;
        List<DepartmentModel> list = this.f101460d;
        CategoryType categoryType = this.f101461e;
        String str4 = this.f101462f;
        List<String> list2 = this.f101463g;
        return "DepartmentModel(id=" + str + ", label=" + str2 + ", imageUrl=" + str3 + ", children=" + list + ", type=" + categoryType + ", fieldPath=" + str4 + ", searchParam=" + list2 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f101457a);
        parcel.writeString(this.f101458b);
        parcel.writeString(this.f101459c);
        List<DepartmentModel> list = this.f101460d;
        parcel.writeInt(list.size());
        for (DepartmentModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f101461e.name());
        parcel.writeString(this.f101462f);
        parcel.writeStringList(this.f101463g);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DepartmentModel(String str, String str2, String str3, List list, CategoryType categoryType, String str4, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new String() : str, (i & 2) != 0 ? new String() : str2, str3, (i & 8) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, (i & 16) != 0 ? CategoryType.RAYON : categoryType, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : list2);
    }
}
