package com.carrefour.fid.android.data.entities.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.type.DepartmentCategoryType;
import com.carrefour.fid.android.core.type.DepartmentType;
import com.carrefour.fid.android.data.entities.APIMCategoriesResponse;
import com.carrefour.fid.android.domain.models.C38039i;
import com.carrefour.fid.android.shared.base.C28486g;
import com.carrefour.fid.android.shared.constant.C28547h2;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nAPIMDepartmentsMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 APIMDepartmentsMapper.kt\ncom/carrefour/fid/android/data/entities/mapper/APIMDepartmentsMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,48:1\n1#2:49\n1549#3:50\n1620#3,3:51\n*S KotlinDebug\n*F\n+ 1 APIMDepartmentsMapper.kt\ncom/carrefour/fid/android/data/entities/mapper/APIMDepartmentsMapper\n*L\n19#1:50\n19#1:51,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.data.entities.mapper.c */
public final class C36467c extends C28486g<C36468a, C38039i> {

    /* renamed from: b */
    public static final int f90159b = 0;

    /* renamed from: d */
    public final String mo111220d(String str) {
        String e = mo111221e(str);
        return C28547h2.f69315c + e;
    }

    /* renamed from: e */
    public final String mo111221e(String str) {
        return C11622t.replace$default(str, "/p_1500x1500/", "/p_96x96", false, 4, (Object) null);
    }

    @C12579k
    /* renamed from: f */
    public C38039i mo72340a(@C12579k C36468a aVar) {
        Long l;
        String str;
        String str2;
        int i;
        String str3;
        String str4;
        ArrayList arrayList;
        DepartmentType departmentType;
        String str5;
        String str6;
        DepartmentCategoryType departmentCategoryType;
        String str7;
        List<APIMCategoriesResponse> subNode;
        String picturePath;
        Intrinsics.checkNotNullParameter(aVar, "param");
        APIMCategoriesResponse e = aVar.mo111226e();
        String str8 = null;
        if (e != null) {
            l = Long.valueOf(e.getId());
        } else {
            l = null;
        }
        String valueOf = String.valueOf(l);
        APIMCategoriesResponse e2 = aVar.mo111226e();
        if (e2 != null) {
            str = e2.getName();
        } else {
            str = null;
        }
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        APIMCategoriesResponse e3 = aVar.mo111226e();
        if (e3 != null) {
            i = e3.getOrderNum();
        } else {
            i = -1;
        }
        int i2 = i;
        APIMCategoriesResponse e4 = aVar.mo111226e();
        if (e4 == null || (picturePath = e4.getPicturePath()) == null) {
            str3 = null;
        } else {
            str3 = mo111220d(picturePath);
        }
        if (str3 == null) {
            str4 = "";
        } else {
            str4 = str3;
        }
        APIMCategoriesResponse e5 = aVar.mo111226e();
        if (e5 == null || (subNode = e5.getSubNode()) == null) {
            arrayList = CollectionsKt__CollectionsKt.m40441E();
        } else {
            Iterable<APIMCategoriesResponse> iterable = subNode;
            ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (APIMCategoriesResponse aVar2 : iterable) {
                arrayList2.add(mo72340a(new C36468a(aVar2, aVar.mo111228f())));
            }
            arrayList = arrayList2;
        }
        if (aVar.mo111228f()) {
            departmentType = DepartmentType.SHOPS;
        } else {
            departmentType = DepartmentType.RAYON;
        }
        DepartmentType departmentType2 = departmentType;
        APIMCategoriesResponse e6 = aVar.mo111226e();
        if (e6 != null) {
            str5 = e6.getCopyOfId();
        } else {
            str5 = null;
        }
        APIMCategoriesResponse e7 = aVar.mo111226e();
        if (e7 != null) {
            str6 = e7.getType();
        } else {
            str6 = null;
        }
        if (Intrinsics.areEqual((Object) str6, (Object) "DUPLICATE")) {
            departmentCategoryType = DepartmentCategoryType.DUPLICATE;
        } else {
            departmentCategoryType = DepartmentCategoryType.RAYON;
        }
        DepartmentCategoryType departmentCategoryType2 = departmentCategoryType;
        APIMCategoriesResponse e8 = aVar.mo111226e();
        if (e8 != null) {
            str7 = e8.getType();
        } else {
            str7 = null;
        }
        if (Intrinsics.areEqual((Object) str7, (Object) "DUPLICATE")) {
            str8 = aVar.mo111226e().getFieldPathOrigin();
            if (str8 == null) {
                str8 = aVar.mo111226e().getFieldPath();
            }
        } else {
            APIMCategoriesResponse e9 = aVar.mo111226e();
            if (e9 != null) {
                str8 = e9.getFieldPath();
            }
        }
        return new C38039i(valueOf, str2, i2, str4, arrayList, departmentType2, departmentCategoryType2, str5, str8);
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.data.entities.mapper.c$a */
    public static final class C36468a {

        /* renamed from: c */
        public static final int f90160c = 8;
        @C12580l

        /* renamed from: a */
        public final APIMCategoriesResponse f90161a;

        /* renamed from: b */
        public final boolean f90162b;

        public C36468a(@C12580l APIMCategoriesResponse aPIMCategoriesResponse, boolean z) {
            this.f90161a = aPIMCategoriesResponse;
            this.f90162b = z;
        }

        /* renamed from: d */
        public static /* synthetic */ C36468a m149595d(C36468a aVar, APIMCategoriesResponse aPIMCategoriesResponse, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                aPIMCategoriesResponse = aVar.f90161a;
            }
            if ((i & 2) != 0) {
                z = aVar.f90162b;
            }
            return aVar.mo111225c(aPIMCategoriesResponse, z);
        }

        @C12580l
        /* renamed from: a */
        public final APIMCategoriesResponse mo111223a() {
            return this.f90161a;
        }

        /* renamed from: b */
        public final boolean mo111224b() {
            return this.f90162b;
        }

        @C12579k
        /* renamed from: c */
        public final C36468a mo111225c(@C12580l APIMCategoriesResponse aPIMCategoriesResponse, boolean z) {
            return new C36468a(aPIMCategoriesResponse, z);
        }

        @C12580l
        /* renamed from: e */
        public final APIMCategoriesResponse mo111226e() {
            return this.f90161a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C36468a)) {
                return false;
            }
            C36468a aVar = (C36468a) obj;
            return Intrinsics.areEqual((Object) this.f90161a, (Object) aVar.f90161a) && this.f90162b == aVar.f90162b;
        }

        /* renamed from: f */
        public final boolean mo111228f() {
            return this.f90162b;
        }

        public int hashCode() {
            APIMCategoriesResponse aPIMCategoriesResponse = this.f90161a;
            int hashCode = (aPIMCategoriesResponse == null ? 0 : aPIMCategoriesResponse.hashCode()) * 31;
            boolean z = this.f90162b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        @C12579k
        public String toString() {
            APIMCategoriesResponse aPIMCategoriesResponse = this.f90161a;
            boolean z = this.f90162b;
            return "Param(entity=" + aPIMCategoriesResponse + ", isShops=" + z + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C36468a(APIMCategoriesResponse aPIMCategoriesResponse, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(aPIMCategoriesResponse, (i & 2) != 0 ? false : z);
        }
    }
}
