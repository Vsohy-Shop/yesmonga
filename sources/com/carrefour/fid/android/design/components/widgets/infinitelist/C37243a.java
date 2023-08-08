package com.carrefour.fid.android.design.components.widgets.infinitelist;

import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.widgets.infinitelist.a */
public abstract class C37243a extends RecyclerView.C20085t {

    /* renamed from: c */
    public static final int f93407c = 8;

    /* renamed from: a */
    public boolean f93408a = true;

    /* renamed from: b */
    public int f93409b;

    /* renamed from: b */
    public void mo30662b(@C12579k RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.mo30662b(recyclerView, i, i2);
        if (mo113407c() && i2 >= 0) {
            RecyclerView.C20076o layoutManager = recyclerView.getLayoutManager();
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null) {
                int itemCount = adapter.getItemCount();
                int A2 = linearLayoutManager.mo59365A2();
                if (itemCount < this.f93409b) {
                    this.f93408a = true;
                    this.f93409b = 0;
                }
                if (this.f93408a && itemCount > this.f93409b) {
                    this.f93408a = false;
                    this.f93409b = itemCount;
                }
                if (!this.f93408a && itemCount - A2 <= 5) {
                    mo113408d();
                    this.f93408a = true;
                }
            }
        }
    }

    /* renamed from: c */
    public abstract boolean mo113407c();

    /* renamed from: d */
    public abstract void mo113408d();
}
