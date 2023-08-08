package com.carrefour.fid.android.presentation.p035ui.orders.offline.adapter;

import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.databinding.C36644a5;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.C24801g;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.C24802h;
import com.carrefour.fid.android.shared.extension.C28782t;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nOrdersOfflineDetailsVATListViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersOfflineDetailsVATListViewHolder.kt\ncom/carrefour/fid/android/presentation/ui/orders/offline/adapter/OrdersOfflineDetailsVATListViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n262#2,2:39\n262#2,2:41\n262#2,2:43\n262#2,2:45\n1#3:47\n*S KotlinDebug\n*F\n+ 1 OrdersOfflineDetailsVATListViewHolder.kt\ncom/carrefour/fid/android/presentation/ui/orders/offline/adapter/OrdersOfflineDetailsVATListViewHolder\n*L\n26#1:39,2\n27#1:41,2\n29#1:43,2\n30#1:45,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.adapter.o */
public final class C24760o extends RecyclerView.C20061e0 {
    @C12579k

    /* renamed from: b */
    public static final C24761a f61433b = new C24761a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f61434c = 8;

    /* renamed from: d */
    public static final int f61435d = 5;
    @C12579k

    /* renamed from: a */
    public final C36644a5 f61436a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.adapter.o$a */
    public static final class C24761a {
        public /* synthetic */ C24761a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24761a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24760o(@C12579k C36644a5 a5Var) {
        super(a5Var.getRoot());
        Intrinsics.checkNotNullParameter(a5Var, "binding");
        this.f61436a = a5Var;
    }

    /* renamed from: c */
    public final void mo72287c(@C12579k C24801g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "item");
        RecyclerView recyclerView = this.f61436a.f90560e;
        recyclerView.setAdapter(new C24759n(CollectionsKt___CollectionsKt.m40572T5(gVar.mo72460h())));
        recyclerView.setLayoutManager(new LinearLayoutManager(this.itemView.getContext()));
        this.f61436a.f90562g.setText(C28782t.m119105b(Double.valueOf(gVar.mo72459g())));
        if (mo72289e(gVar.mo72460h())) {
            this.f61436a.f90563h.setText(C28782t.m119105b(Double.valueOf(gVar.mo72458f())));
            TextView textView = this.f61436a.f90563h;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.textHolderOrderO…eDetailsVatTotalAmountTax");
            textView.setVisibility(0);
            TextView textView2 = this.f61436a.f90558c;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.textHolderOrderO…eDetailsVatAmountTaxTitle");
            textView2.setVisibility(0);
            return;
        }
        TextView textView3 = this.f61436a.f90563h;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.textHolderOrderO…eDetailsVatTotalAmountTax");
        textView3.setVisibility(8);
        TextView textView4 = this.f61436a.f90558c;
        Intrinsics.checkNotNullExpressionValue(textView4, "binding.textHolderOrderO…eDetailsVatAmountTaxTitle");
        textView4.setVisibility(8);
    }

    @C12579k
    /* renamed from: d */
    public final C36644a5 mo72288d() {
        return this.f61436a;
    }

    /* renamed from: e */
    public final boolean mo72289e(List<C24802h> list) {
        Object obj;
        boolean z;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C24802h) obj).mo72469g() != null) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return obj != null;
    }
}
