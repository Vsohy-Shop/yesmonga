package com.carrefour.fid.android.presentation.p035ui.product.search.adapter;

import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.base.components.BaseExpandableRecyclerView;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.product.search.adapter.e */
public abstract class C25561e extends BaseExpandableRecyclerView.C28473c {

    /* renamed from: c */
    public static final int f62823c = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25561e(@C12579k View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
    }

    /* renamed from: c */
    public abstract void mo74398c(@C12579k String str);

    /* renamed from: d */
    public abstract void mo74399d(@C12579k String str);
}
