package com.carrefour.fid.android.presentation.p035ui.orders.offline.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.databinding.C36744k5;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.C24803i;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.OrderDetailParam;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.adapter.d */
public final class C24742d extends RecyclerView.Adapter<C24764q> {

    /* renamed from: c */
    public static final int f61401c = 8;
    @C12579k

    /* renamed from: a */
    public final C24743a f61402a;
    @C12579k

    /* renamed from: b */
    public final List<C24803i> f61403b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.adapter.d$a */
    public interface C24743a {
        /* renamed from: a */
        void mo72250a(@C12579k OrderDetailParam orderDetailParam);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24742d(C24743a aVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? new ArrayList() : list);
    }

    /* renamed from: m */
    public static final void m107919m(C24742d dVar, C24803i iVar, View view) {
        Intrinsics.checkNotNullParameter(dVar, "this$0");
        Intrinsics.checkNotNullParameter(iVar, "$order");
        dVar.f61402a.mo72250a(iVar.mo72483j());
    }

    public int getItemCount() {
        return this.f61403b.size();
    }

    public long getItemId(int i) {
        return (long) this.f61403b.get(i).hashCode();
    }

    /* renamed from: l */
    public void onBindViewHolder(@C12579k C24764q qVar, int i) {
        Intrinsics.checkNotNullParameter(qVar, "holder");
        C24803i iVar = this.f61403b.get(i);
        qVar.mo72292c(iVar);
        qVar.itemView.setOnClickListener(new C24741c(this, iVar));
    }

    @C12579k
    /* renamed from: n */
    public C24764q onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C36744k5 d = C36744k5.m150705d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(\n               …      false\n            )");
        return new C24764q(d);
    }

    /* renamed from: o */
    public final void mo72269o(@C12579k List<C24803i> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        List<C24803i> list2 = this.f61403b;
        list2.clear();
        list2.addAll(list);
        notifyDataSetChanged();
    }

    public C24742d(@C12579k C24743a aVar, @C12579k List<C24803i> list) {
        Intrinsics.checkNotNullParameter(aVar, C10108c.f27778C);
        Intrinsics.checkNotNullParameter(list, "list");
        this.f61402a = aVar;
        this.f61403b = list;
        setHasStableIds(true);
    }
}
