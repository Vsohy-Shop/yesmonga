package com.carrefour.fid.android.presentation.models.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.categories.domain.models.DepartmentModel;
import com.carrefour.fid.android.core.type.DepartmentType;
import com.carrefour.fid.android.domain.models.C38039i;
import com.carrefour.fid.android.domain.models.category.CategoryType;
import com.carrefour.fid.android.shared.base.C28486g;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.models.mapper.b */
public final class C38499b extends C28486g<C38039i, DepartmentModel> {

    /* renamed from: b */
    public static final int f97640b = 0;

    @C12579k
    /* renamed from: d */
    public DepartmentModel mo72340a(@C12579k C38039i iVar) {
        CategoryType categoryType;
        Intrinsics.checkNotNullParameter(iVar, "entity");
        String p = iVar.mo117757p();
        String s = iVar.mo117760s();
        String q = iVar.mo117758q();
        List<R> b = mo83406b(iVar.mo117754m());
        if (b == null) {
            b = CollectionsKt__CollectionsKt.m40441E();
        }
        List<R> list = b;
        if (iVar.mo117761t() == DepartmentType.RAYON) {
            categoryType = CategoryType.RAYON;
        } else {
            categoryType = CategoryType.OTHERS;
        }
        return new DepartmentModel(p, s, q, list, categoryType, iVar.mo117756o(), (List) null, 64, (DefaultConstructorMarker) null);
    }
}
