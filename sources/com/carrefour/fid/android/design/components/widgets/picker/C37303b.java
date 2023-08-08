package com.carrefour.fid.android.design.components.widgets.picker;

import android.content.Context;
import android.content.res.Resources;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.divider.C37094b;
import com.carrefour.fid.android.design.components.utils.C37135b;
import com.carrefour.fid.android.design.components.utils.C37138e;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.design.components.widgets.picker.b */
public final class C37303b {
    @C12579k
    /* renamed from: a */
    public static final C37301a m153068a(@C12579k RecyclerView recyclerView, @C12579k Context context) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C37301a aVar = new C37301a();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 2);
        recyclerView.setAdapter(aVar);
        recyclerView.setLayoutManager(gridLayoutManager);
        Resources resources = recyclerView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        recyclerView.mo59589n(new C37094b(2, C37135b.m152206a(C37138e.m152212c(resources, C36896b.C36903g.ds_spacing_s)), true));
        return aVar;
    }
}
