package com.carrefour.fid.android.presentation.p035ui.product.search.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.databinding.C36814r5;
import com.carrefour.fid.android.databinding.C36824s5;
import com.carrefour.fid.android.presentation.models.C38530v;
import com.carrefour.fid.android.presentation.models.SuggestionType;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.product.search.adapter.b */
public final class C25557b extends RecyclerView.Adapter<C25561e> {

    /* renamed from: c */
    public static final int f62816c = 8;
    @C12579k

    /* renamed from: a */
    public final C25558a f62817a;
    @C12579k

    /* renamed from: b */
    public final List<C38530v> f62818b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.search.adapter.b$a */
    public interface C25558a {
        /* renamed from: a */
        void mo74308a(@C12579k C38530v vVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25557b(C25558a aVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? new ArrayList() : list);
    }

    /* renamed from: m */
    public static final void m110116m(C25557b bVar, C38530v vVar, View view) {
        Intrinsics.checkNotNullParameter(bVar, "this$0");
        Intrinsics.checkNotNullParameter(vVar, "$suggestion");
        bVar.f62817a.mo74308a(vVar);
    }

    public int getItemCount() {
        return this.f62818b.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        return this.f62818b.get(i).mo122185l().mo121957q();
    }

    @C12579k
    public final List<C38530v> getList() {
        return this.f62818b;
    }

    /* renamed from: l */
    public void onBindViewHolder(@C12579k C25561e eVar, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(eVar, "holder");
        C38530v vVar = this.f62818b.get(i);
        String i2 = vVar.mo122182i();
        if (i2 == null || C11622t.isBlank(i2)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            eVar.mo74399d(vVar.mo122182i());
        } else {
            eVar.mo74398c(vVar.mo122184k());
        }
        eVar.itemView.setOnClickListener(new C25556a(this, vVar));
    }

    @C12579k
    /* renamed from: n */
    public C25561e onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        if (i == SuggestionType.HISTORY.mo121957q()) {
            C36814r5 d = C36814r5.m150981d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d, "inflate(\n               …, false\n                )");
            return new C25559c(d);
        }
        boolean z = true;
        if (!(i == SuggestionType.FREQUENT.mo121957q() || i == SuggestionType.SUGGESTION.mo121957q())) {
            z = false;
        }
        if (z) {
            C36824s5 d2 = C36824s5.m151019d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d2, "inflate(\n               …, false\n                )");
            return new C25560d(d2);
        }
        throw new Throwable("Invalid view type (" + i + ")");
    }

    /* renamed from: o */
    public final void mo74397o(@C12579k List<C38530v> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        List<C38530v> list2 = this.f62818b;
        list2.clear();
        list2.addAll(list);
        notifyDataSetChanged();
    }

    public C25557b(@C12579k C25558a aVar, @C12579k List<C38530v> list) {
        Intrinsics.checkNotNullParameter(aVar, C10108c.f27778C);
        Intrinsics.checkNotNullParameter(list, "list");
        this.f62817a = aVar;
        this.f62818b = list;
        setHasStableIds(true);
    }
}
