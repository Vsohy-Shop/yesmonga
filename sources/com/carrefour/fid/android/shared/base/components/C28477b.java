package com.carrefour.fid.android.shared.base.components;

import android.view.View;
import com.carrefour.fid.android.shared.base.components.BaseExpandableRecyclerView;

/* renamed from: com.carrefour.fid.android.shared.base.components.b */
public final /* synthetic */ class C28477b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ BaseExpandableRecyclerView.C28473c f68607a;

    /* renamed from: b */
    public final /* synthetic */ BaseExpandableRecyclerView f68608b;

    public /* synthetic */ C28477b(BaseExpandableRecyclerView.C28473c cVar, BaseExpandableRecyclerView baseExpandableRecyclerView) {
        this.f68607a = cVar;
        this.f68608b = baseExpandableRecyclerView;
    }

    public final void onClick(View view) {
        BaseExpandableRecyclerView.m118360y(this.f68607a, this.f68608b, view);
    }
}
