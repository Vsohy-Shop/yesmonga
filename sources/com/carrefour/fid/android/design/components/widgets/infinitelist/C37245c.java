package com.carrefour.fid.android.design.components.widgets.infinitelist;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.design.components.databinding.C37073r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.widgets.infinitelist.c */
public final class C37245c extends RecyclerView.Adapter<C37246a> {

    /* renamed from: b */
    public static final int f93411b = 8;

    /* renamed from: a */
    public int f93412a;

    /* renamed from: com.carrefour.fid.android.design.components.widgets.infinitelist.c$a */
    public final class C37246a extends RecyclerView.C20061e0 {

        /* renamed from: a */
        public final /* synthetic */ C37245c f93413a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37246a(@C12579k C37245c cVar, C37073r rVar) {
            super(rVar.getRoot());
            Intrinsics.checkNotNullParameter(rVar, "binding");
            this.f93413a = cVar;
        }
    }

    public int getItemCount() {
        return this.f93412a;
    }

    /* renamed from: k */
    public void onBindViewHolder(@C12579k C37246a aVar, int i) {
        Intrinsics.checkNotNullParameter(aVar, "holder");
    }

    @C12579k
    /* renamed from: l */
    public C37246a onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C37073r d = C37073r.m152049d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(\n               …      false\n            )");
        return new C37246a(this, d);
    }

    /* renamed from: m */
    public final void mo113411m(boolean z) {
        this.f93412a = z ? 1 : 0;
        notifyDataSetChanged();
    }
}
