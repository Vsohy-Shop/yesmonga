package com.carrefour.fid.android.categories.presentation.p067ui.department;

import android.content.Context;
import com.carrefour.fid.android.categories.domain.models.DepartmentModel;
import com.carrefour.fid.android.design.components.widgets.list.C37269i;
import com.carrefour.fid.android.design.components.widgets.list.itemcomponents.ListItemIconComponent;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.j */
public final class C39791j {
    @C12579k
    /* renamed from: a */
    public static final C37269i m162355a(@C12579k DepartmentModel departmentModel, @C12579k Context context, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(departmentModel, "<this>");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(aVar, "onItemClicked");
        return ListItemIconComponent.f93487f.mo113531c(context, departmentModel.mo131047n(), departmentModel.mo131046m(), aVar);
    }
}
