package com.carrefour.fid.android.catalogs.presentation.p065ui.details.tabs.list.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.catalogs.databinding.C39411b;
import com.carrefour.fid.android.catalogs.databinding.C39413d;
import com.carrefour.fid.android.catalogs.presentation.models.C39452e;
import com.carrefour.fid.android.catalogs.presentation.p065ui.details.tabs.list.C39513a;
import com.carrefour.fid.android.catalogs.presentation.p065ui.details.tabs.list.C39524e;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.details.tabs.list.adapter.a */
public final class C39514a extends RecyclerView.Adapter<RecyclerView.C20061e0> {
    @C12579k

    /* renamed from: a */
    public List<C39452e> f101031a;
    @C12579k

    /* renamed from: b */
    public C39513a f101032b;
    @C12580l

    /* renamed from: c */
    public C39524e f101033c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C39514a(List list, C39513a aVar, C39524e eVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, aVar, (i & 4) != 0 ? null : eVar);
    }

    public int getItemCount() {
        return this.f101031a.size() + (this.f101033c != null ? 1 : 0);
    }

    public int getItemViewType(int i) {
        return (i != 0 || this.f101033c == null) ? 1 : 0;
    }

    @C12579k
    /* renamed from: k */
    public final List<C39452e> mo130681k() {
        return this.f101031a;
    }

    /* renamed from: l */
    public final void mo130682l(@C12579k List<C39452e> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f101031a = list;
    }

    public void onBindViewHolder(@C12579k RecyclerView.C20061e0 e0Var, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(e0Var, "holder");
        if (e0Var instanceof C39520g) {
            if (this.f101033c != null) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            ((C39520g) e0Var).mo130689e(this.f101031a.get(i - i2), this.f101032b);
        } else if (e0Var instanceof C39517d) {
            ((C39517d) e0Var).mo130684d(this.f101033c);
        }
    }

    @C12579k
    public RecyclerView.C20061e0 onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        if (i == 0) {
            C39413d d = C39413d.m161543d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d, "inflate(\n               …      false\n            )");
            new C39517d(d);
        }
        C39411b d2 = C39411b.m161535d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d2, "inflate(\n            Lay…          false\n        )");
        return new C39520g(d2);
    }

    public C39514a(@C12579k List<C39452e> list, @C12579k C39513a aVar, @C12580l C39524e eVar) {
        Intrinsics.checkNotNullParameter(list, "productList");
        Intrinsics.checkNotNullParameter(aVar, "delegateData");
        this.f101031a = list;
        this.f101032b = aVar;
        this.f101033c = eVar;
    }
}
