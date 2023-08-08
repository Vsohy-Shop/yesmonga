package com.carrefour.fid.android.product.presentation.p039ui.list;

import android.content.Context;
import android.content.res.Resources;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.design.components.widgets.productcard.C37353b;
import com.carrefour.fid.android.design.components.widgets.productcard.C37390r;
import com.carrefour.fid.android.design.components.widgets.productcard.list.divider.C37377b;
import com.carrefour.fid.android.shared.paging.C28850b;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.g */
public final class C28050g {
    @C12579k
    /* renamed from: a */
    public static final C28045e m117552a(@C12579k RecyclerView recyclerView, @C12579k Context context, @C12580l C37390r rVar) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Resources resources = recyclerView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        Resources.Theme theme = context.getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "context.theme");
        C37353b bVar = new C37353b(resources, theme, rVar);
        C28045e eVar = new C28045e(bVar, new C28850b());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 2);
        recyclerView.setAdapter(eVar);
        recyclerView.setLayoutManager(gridLayoutManager);
        C37377b bVar2 = new C37377b();
        bVar2.mo113962n(bVar);
        recyclerView.mo59589n(bVar2);
        gridLayoutManager.mo59319N3(new C28086y(bVar, eVar));
        return eVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C28045e m117553b(RecyclerView recyclerView, Context context, C37390r rVar, int i, Object obj) {
        if ((i & 2) != 0) {
            rVar = null;
        }
        return m117552a(recyclerView, context, rVar);
    }
}
