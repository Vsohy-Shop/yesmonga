package com.carrefour.fid.android.product.presentation.p039ui.list;

import androidx.recyclerview.widget.GridLayoutManager;
import com.carrefour.fid.android.design.components.widgets.productcard.C37353b;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37369a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.y */
public final class C28086y extends GridLayoutManager.C20044c {
    @C12579k

    /* renamed from: e */
    public final C37353b f68029e;
    @C12579k

    /* renamed from: f */
    public final C28045e f68030f;

    public C28086y(@C12579k C37353b bVar, @C12579k C28045e eVar) {
        Intrinsics.checkNotNullParameter(bVar, "viewBinder");
        Intrinsics.checkNotNullParameter(eVar, "productCardAdapter");
        this.f68029e = bVar;
        this.f68030f = eVar;
    }

    /* renamed from: f */
    public int mo59352f(int i) {
        List k = this.f68030f.mo60667k();
        Intrinsics.checkNotNullExpressionValue(k, "productCardAdapter.currentList");
        if (i > CollectionsKt__CollectionsKt.m40443G(k)) {
            return 2;
        }
        C37353b bVar = this.f68029e;
        Object obj = k.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "uiModelList[position]");
        return bVar.mo113919j((C37369a) obj);
    }
}
