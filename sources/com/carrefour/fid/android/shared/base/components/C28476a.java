package com.carrefour.fid.android.shared.base.components;

import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.shared.base.components.BaseExpandableRecyclerView;

/* renamed from: com.carrefour.fid.android.shared.base.components.a */
public final /* synthetic */ class C28476a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BaseExpandableRecyclerView.C28472b f68605a;

    /* renamed from: b */
    public final /* synthetic */ RecyclerView f68606b;

    public /* synthetic */ C28476a(BaseExpandableRecyclerView.C28472b bVar, RecyclerView recyclerView) {
        this.f68605a = bVar;
        this.f68606b = recyclerView;
    }

    public final void run() {
        BaseExpandableRecyclerView.m118359n(this.f68605a, this.f68606b);
    }
}
