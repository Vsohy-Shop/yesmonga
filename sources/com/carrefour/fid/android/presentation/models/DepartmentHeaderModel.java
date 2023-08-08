package com.carrefour.fid.android.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.type.DepartmentCategoryType;
import com.carrefour.fid.android.core.type.DepartmentType;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b1\u00102J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003JY\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0016HÖ\u0001J\u0019\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b%\u0010$R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b/\u0010$R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b0\u0010$¨\u00063"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/DepartmentHeaderModel;", "Landroid/os/Parcelable;", "", "a", "b", "", "c", "Lcom/carrefour/fid/android/core/type/DepartmentType;", "d", "Lcom/carrefour/fid/android/core/type/DepartmentCategoryType;", "e", "f", "g", "id", "label", "children", "type", "categoryType", "copyOfId", "fieldPath", "h", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "o", "Ljava/util/List;", "k", "()Ljava/util/List;", "Lcom/carrefour/fid/android/core/type/DepartmentType;", "p", "()Lcom/carrefour/fid/android/core/type/DepartmentType;", "Lcom/carrefour/fid/android/core/type/DepartmentCategoryType;", "j", "()Lcom/carrefour/fid/android/core/type/DepartmentCategoryType;", "l", "m", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/carrefour/fid/android/core/type/DepartmentType;Lcom/carrefour/fid/android/core/type/DepartmentCategoryType;Ljava/lang/String;Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class DepartmentHeaderModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<DepartmentHeaderModel> CREATOR = new C38426a();

    /* renamed from: v */
    public static final int f97397v = 8;
    @C12579k

    /* renamed from: a */
    public final String f97398a;
    @C12579k

    /* renamed from: b */
    public final String f97399b;
    @C12579k

    /* renamed from: c */
    public final List<DepartmentHeaderModel> f97400c;
    @C12579k

    /* renamed from: d */
    public final DepartmentType f97401d;
    @C12579k

    /* renamed from: e */
    public final DepartmentCategoryType f97402e;
    @C12580l

    /* renamed from: f */
    public final String f97403f;
    @C12580l

    /* renamed from: g */
    public final String f97404g;

    /* renamed from: com.carrefour.fid.android.presentation.models.DepartmentHeaderModel$a */
    public static final class C38426a implements Parcelable.Creator<DepartmentHeaderModel> {
        @C12579k
        /* renamed from: a */
        public final DepartmentHeaderModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(DepartmentHeaderModel.CREATOR.createFromParcel(parcel));
            }
            return new DepartmentHeaderModel(readString, readString2, arrayList, DepartmentType.valueOf(parcel.readString()), DepartmentCategoryType.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final DepartmentHeaderModel[] newArray(int i) {
            return new DepartmentHeaderModel[i];
        }
    }

    public DepartmentHeaderModel() {
        this((String) null, (String) null, (List) null, (DepartmentType) null, (DepartmentCategoryType) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* renamed from: i */
    public static /* synthetic */ DepartmentHeaderModel m159173i(DepartmentHeaderModel departmentHeaderModel, String str, String str2, List<DepartmentHeaderModel> list, DepartmentType departmentType, DepartmentCategoryType departmentCategoryType, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = departmentHeaderModel.f97398a;
        }
        if ((i & 2) != 0) {
            str2 = departmentHeaderModel.f97399b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            list = departmentHeaderModel.f97400c;
        }
        List<DepartmentHeaderModel> list2 = list;
        if ((i & 8) != 0) {
            departmentType = departmentHeaderModel.f97401d;
        }
        DepartmentType departmentType2 = departmentType;
        if ((i & 16) != 0) {
            departmentCategoryType = departmentHeaderModel.f97402e;
        }
        DepartmentCategoryType departmentCategoryType2 = departmentCategoryType;
        if ((i & 32) != 0) {
            str3 = departmentHeaderModel.f97403f;
        }
        String str6 = str3;
        if ((i & 64) != 0) {
            str4 = departmentHeaderModel.f97404g;
        }
        return departmentHeaderModel.mo121556h(str, str5, list2, departmentType2, departmentCategoryType2, str6, str4);
    }

    @C12579k
    /* renamed from: a */
    public final String mo121547a() {
        return this.f97398a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo121548b() {
        return this.f97399b;
    }

    @C12579k
    /* renamed from: c */
    public final List<DepartmentHeaderModel> mo121549c() {
        return this.f97400c;
    }

    @C12579k
    /* renamed from: d */
    public final DepartmentType mo121550d() {
        return this.f97401d;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final DepartmentCategoryType mo121552e() {
        return this.f97402e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepartmentHeaderModel)) {
            return false;
        }
        DepartmentHeaderModel departmentHeaderModel = (DepartmentHeaderModel) obj;
        return Intrinsics.areEqual((Object) this.f97398a, (Object) departmentHeaderModel.f97398a) && Intrinsics.areEqual((Object) this.f97399b, (Object) departmentHeaderModel.f97399b) && Intrinsics.areEqual((Object) this.f97400c, (Object) departmentHeaderModel.f97400c) && this.f97401d == departmentHeaderModel.f97401d && this.f97402e == departmentHeaderModel.f97402e && Intrinsics.areEqual((Object) this.f97403f, (Object) departmentHeaderModel.f97403f) && Intrinsics.areEqual((Object) this.f97404g, (Object) departmentHeaderModel.f97404g);
    }

    @C12580l
    /* renamed from: f */
    public final String mo121554f() {
        return this.f97403f;
    }

    @C12580l
    /* renamed from: g */
    public final String mo121555g() {
        return this.f97404g;
    }

    @C12579k
    /* renamed from: h */
    public final DepartmentHeaderModel mo121556h(@C12579k String str, @C12579k String str2, @C12579k List<DepartmentHeaderModel> list, @C12579k DepartmentType departmentType, @C12579k DepartmentCategoryType departmentCategoryType, @C12580l String str3, @C12580l String str4) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "label");
        Intrinsics.checkNotNullParameter(list, "children");
        Intrinsics.checkNotNullParameter(departmentType, "type");
        Intrinsics.checkNotNullParameter(departmentCategoryType, "categoryType");
        return new DepartmentHeaderModel(str, str2, list, departmentType, departmentCategoryType, str3, str4);
    }

    public int hashCode() {
        int hashCode = ((((((((this.f97398a.hashCode() * 31) + this.f97399b.hashCode()) * 31) + this.f97400c.hashCode()) * 31) + this.f97401d.hashCode()) * 31) + this.f97402e.hashCode()) * 31;
        String str = this.f97403f;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f97404g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    /* renamed from: j */
    public final DepartmentCategoryType mo121558j() {
        return this.f97402e;
    }

    @C12579k
    /* renamed from: k */
    public final List<DepartmentHeaderModel> mo121559k() {
        return this.f97400c;
    }

    @C12580l
    /* renamed from: l */
    public final String mo121560l() {
        return this.f97403f;
    }

    @C12580l
    /* renamed from: m */
    public final String mo121561m() {
        return this.f97404g;
    }

    @C12579k
    /* renamed from: n */
    public final String mo121562n() {
        return this.f97398a;
    }

    @C12579k
    /* renamed from: o */
    public final String mo121563o() {
        return this.f97399b;
    }

    @C12579k
    /* renamed from: p */
    public final DepartmentType mo121564p() {
        return this.f97401d;
    }

    @C12579k
    public String toString() {
        String str = this.f97398a;
        String str2 = this.f97399b;
        List<DepartmentHeaderModel> list = this.f97400c;
        DepartmentType departmentType = this.f97401d;
        DepartmentCategoryType departmentCategoryType = this.f97402e;
        String str3 = this.f97403f;
        String str4 = this.f97404g;
        return "DepartmentHeaderModel(id=" + str + ", label=" + str2 + ", children=" + list + ", type=" + departmentType + ", categoryType=" + departmentCategoryType + ", copyOfId=" + str3 + ", fieldPath=" + str4 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f97398a);
        parcel.writeString(this.f97399b);
        List<DepartmentHeaderModel> list = this.f97400c;
        parcel.writeInt(list.size());
        for (DepartmentHeaderModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f97401d.name());
        parcel.writeString(this.f97402e.name());
        parcel.writeString(this.f97403f);
        parcel.writeString(this.f97404g);
    }

    public DepartmentHeaderModel(@C12579k String str, @C12579k String str2, @C12579k List<DepartmentHeaderModel> list, @C12579k DepartmentType departmentType, @C12579k DepartmentCategoryType departmentCategoryType, @C12580l String str3, @C12580l String str4) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "label");
        Intrinsics.checkNotNullParameter(list, "children");
        Intrinsics.checkNotNullParameter(departmentType, "type");
        Intrinsics.checkNotNullParameter(departmentCategoryType, "categoryType");
        this.f97398a = str;
        this.f97399b = str2;
        this.f97400c = list;
        this.f97401d = departmentType;
        this.f97402e = departmentCategoryType;
        this.f97403f = str3;
        this.f97404g = str4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DepartmentHeaderModel(java.lang.String r6, java.lang.String r7, java.util.List r8, com.carrefour.fid.android.core.type.DepartmentType r9, com.carrefour.fid.android.core.type.DepartmentCategoryType r10, java.lang.String r11, java.lang.String r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            if (r14 == 0) goto L_0x0009
            java.lang.String r6 = new java.lang.String
            r6.<init>()
        L_0x0009:
            r14 = r13 & 2
            if (r14 == 0) goto L_0x0012
            java.lang.String r7 = new java.lang.String
            r7.<init>()
        L_0x0012:
            r14 = r7
            r7 = r13 & 4
            if (r7 == 0) goto L_0x001b
            java.util.List r8 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x001b:
            r0 = r8
            r7 = r13 & 8
            if (r7 == 0) goto L_0x0022
            com.carrefour.fid.android.core.type.DepartmentType r9 = com.carrefour.fid.android.core.type.DepartmentType.RAYON
        L_0x0022:
            r1 = r9
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0029
            com.carrefour.fid.android.core.type.DepartmentCategoryType r10 = com.carrefour.fid.android.core.type.DepartmentCategoryType.RAYON
        L_0x0029:
            r2 = r10
            r7 = r13 & 32
            r8 = 0
            if (r7 == 0) goto L_0x0031
            r3 = r8
            goto L_0x0032
        L_0x0031:
            r3 = r11
        L_0x0032:
            r7 = r13 & 64
            if (r7 == 0) goto L_0x0038
            r4 = r8
            goto L_0x0039
        L_0x0038:
            r4 = r12
        L_0x0039:
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r0
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.models.DepartmentHeaderModel.<init>(java.lang.String, java.lang.String, java.util.List, com.carrefour.fid.android.core.type.DepartmentType, com.carrefour.fid.android.core.type.DepartmentCategoryType, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
