package com.carrefour.fid.android.presentation.p035ui.product.filter.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.databinding.C36794p5;
import com.carrefour.fid.android.presentation.models.TermModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nProductListFiltersFacetTermAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductListFiltersFacetTermAdapter.kt\ncom/carrefour/fid/android/presentation/ui/product/filter/adapter/ProductListFiltersFacetTermAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,64:1\n1855#2,2:65\n1747#2,3:67\n1855#2,2:70\n1855#2,2:72\n*S KotlinDebug\n*F\n+ 1 ProductListFiltersFacetTermAdapter.kt\ncom/carrefour/fid/android/presentation/ui/product/filter/adapter/ProductListFiltersFacetTermAdapter\n*L\n16#1:65,2\n33#1:67,3\n50#1:70,2\n56#1:72,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.filter.adapter.d */
public final class C25434d extends RecyclerView.Adapter<C25435e> {

    /* renamed from: c */
    public static final int f62584c = 8;
    @C12579k

    /* renamed from: a */
    public final List<TermModel> f62585a;
    @C12579k

    /* renamed from: b */
    public final List<TermModel> f62586b;

    public C25434d() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: n */
    public static final void m109779n(C25434d dVar, TermModel termModel, int i, View view) {
        Intrinsics.checkNotNullParameter(dVar, "this$0");
        Intrinsics.checkNotNullParameter(termModel, "$term");
        if (!dVar.f62586b.remove(termModel)) {
            dVar.f62586b.add(termModel);
        }
        dVar.notifyItemChanged(i);
    }

    public int getItemCount() {
        return this.f62585a.size();
    }

    public long getItemId(int i) {
        return (long) this.f62585a.get(i).hashCode();
    }

    /* renamed from: l */
    public final void mo74125l() {
        for (TermModel termModel : this.f62585a) {
            termModel.mo121968i(this.f62586b.contains(termModel));
        }
        this.f62586b.clear();
        for (TermModel termModel2 : this.f62585a) {
            if (termModel2.mo121965g()) {
                this.f62586b.add(termModel2);
            }
        }
        notifyDataSetChanged();
    }

    /* renamed from: m */
    public void onBindViewHolder(@C12579k C25435e eVar, int i) {
        Intrinsics.checkNotNullParameter(eVar, "holder");
        TermModel termModel = this.f62585a.get(i);
        Iterable iterable = this.f62586b;
        boolean z = false;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (Intrinsics.areEqual((Object) ((TermModel) it.next()).mo121966h(), (Object) termModel.mo121966h())) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        eVar.mo74128c(termModel, z);
        eVar.itemView.setOnClickListener(new C25433c(this, termModel, i));
    }

    @C12579k
    /* renamed from: o */
    public C25435e onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C36794p5 d = C36794p5.m150905d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(\n            Lay…, parent, false\n        )");
        return new C25435e(d);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25434d(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list);
    }

    public C25434d(@C12579k List<TermModel> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f62585a = list;
        this.f62586b = new ArrayList();
        for (TermModel termModel : list) {
            if (termModel.mo121965g()) {
                this.f62586b.add(termModel);
            }
        }
        setHasStableIds(true);
    }
}
