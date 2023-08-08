package com.carrefour.fid.android.presentation.models.extension;

import android.content.Context;
import com.carrefour.fid.android.presentation.models.SortModel;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.presentation.models.extension.q */
public final class C38482q {
    @C12579k
    /* renamed from: a */
    public static final String m159663a(@C12579k SortModel sortModel, @C12579k Context context) {
        Intrinsics.checkNotNullParameter(sortModel, "<this>");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        int q = sortModel.mo121944f().mo121950q();
        Object[] objArr = new Object[1];
        SortModel.SortOrder e = sortModel.mo121942e();
        if (e == null) {
            e = SortModel.SortOrder.ASC;
        }
        objArr[0] = context.getString(e.mo121948q());
        String string = context.getString(q, objArr);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(\n    v…rtOrder.ASC.resourceId)\n)");
        return string;
    }
}
