package com.carrefour.fid.android.presentation.models.extension;

import com.carrefour.fid.android.categories.domain.models.DepartmentModel;
import com.carrefour.fid.android.core.type.DepartmentCategoryType;
import com.carrefour.fid.android.core.type.DepartmentType;
import com.carrefour.fid.android.domain.models.category.CategoryType;
import com.carrefour.fid.android.presentation.models.DepartmentHeaderModel;
import java.util.ArrayList;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nDepartmentHeaderModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepartmentHeaderModel.kt\ncom/carrefour/fid/android/presentation/models/extension/DepartmentHeaderModelKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,20:1\n1549#2:21\n1620#2,3:22\n*S KotlinDebug\n*F\n+ 1 DepartmentHeaderModel.kt\ncom/carrefour/fid/android/presentation/models/extension/DepartmentHeaderModelKt\n*L\n13#1:21\n13#1:22,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.models.extension.h */
public final class C38472h {
    @C12579k
    /* renamed from: a */
    public static final DepartmentHeaderModel m159631a(@C12579k DepartmentModel departmentModel) {
        DepartmentType departmentType;
        Intrinsics.checkNotNullParameter(departmentModel, "<this>");
        String l = departmentModel.mo131045l();
        String n = departmentModel.mo131047n();
        Iterable<DepartmentModel> j = departmentModel.mo131043j();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(j, 10));
        for (DepartmentModel a : j) {
            arrayList.add(m159631a(a));
        }
        if (departmentModel.mo131049p() == CategoryType.RAYON) {
            departmentType = DepartmentType.RAYON;
        } else {
            departmentType = DepartmentType.SHOPS;
        }
        return new DepartmentHeaderModel(l, n, arrayList, departmentType, (DepartmentCategoryType) null, (String) null, departmentModel.mo131044k(), 48, (DefaultConstructorMarker) null);
    }
}
