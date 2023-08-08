package com.carrefour.fid.android.presentation.p035ui.orders.online.adapter;

import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.databinding.C36684e5;
import com.carrefour.fid.android.design.components.widgets.C37409t;
import com.carrefour.fid.android.design.components.widgets.C37422x;
import com.carrefour.fid.android.design.components.widgets.HubProductComponent;
import com.carrefour.fid.android.presentation.p035ui.orders.online.adapter.C24881i;
import com.carrefour.fid.android.presentation.p035ui.orders.online.extension.C25199d;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25230a;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsProductModel;
import com.carrefour.fid.android.shared.extension.C28782t;
import java.util.ArrayList;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nOrdersOnlineDetailsViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersOnlineDetailsViewHolder.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/adapter/AdditionalOrderDetailsOriginalOrderProductListViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,824:1\n1549#2:825\n1620#2,3:826\n*S KotlinDebug\n*F\n+ 1 OrdersOnlineDetailsViewHolder.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/adapter/AdditionalOrderDetailsOriginalOrderProductListViewHolder\n*L\n708#1:825\n708#1:826,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.AdditionalOrderDetailsOriginalOrderProductListViewHolder */
public final class AdditionalOrderDetailsOriginalOrderProductListViewHolder extends C24896v {
    @C12579k

    /* renamed from: c */
    public static final C24849a f61607c = new C24849a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f61608d = 8;

    /* renamed from: e */
    public static final int f61609e = 7;
    @C12579k

    /* renamed from: b */
    public final C36684e5 f61610b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.AdditionalOrderDetailsOriginalOrderProductListViewHolder$a */
    public static final class C24849a {
        public /* synthetic */ C24849a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24849a() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AdditionalOrderDetailsOriginalOrderProductListViewHolder(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.databinding.C36684e5 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            android.widget.LinearLayout r0 = r3.getRoot()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.f61610b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.orders.online.adapter.AdditionalOrderDetailsOriginalOrderProductListViewHolder.<init>(com.carrefour.fid.android.databinding.e5):void");
    }

    @SuppressLint({"SimpleDateFormat"})
    /* renamed from: c */
    public final void mo72585c(@C12579k C25230a.C25233c cVar, @C12580l C24881i.C24882a aVar) {
        C24850x118cc6ad additionalOrderDetailsOriginalOrderProductListViewHolder$bind$1$2$1;
        Intrinsics.checkNotNullParameter(cVar, "originOrderProductModel");
        HubProductComponent hubProductComponent = this.f61610b.f90766b;
        String l = cVar.mo73533l();
        String j = cVar.mo73531j();
        String b = C28782t.m119105b(Double.valueOf(cVar.mo73530i()));
        int size = cVar.mo73534m().size();
        Iterable<OrdersOnlineDetailsProductModel> m = cVar.mo73534m();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(m, 10));
        for (OrdersOnlineDetailsProductModel d : m) {
            arrayList.add(new C37409t(C25199d.m108905d(d), (String) null, 2, (DefaultConstructorMarker) null));
        }
        String k = cVar.mo73532k();
        if (k != null) {
            additionalOrderDetailsOriginalOrderProductListViewHolder$bind$1$2$1 = new C24850x118cc6ad(aVar, k);
        } else {
            additionalOrderDetailsOriginalOrderProductListViewHolder$bind$1$2$1 = null;
        }
        hubProductComponent.mo112884L(new C37422x.C37424b(l, j, b, size, arrayList, additionalOrderDetailsOriginalOrderProductListViewHolder$bind$1$2$1));
        hubProductComponent.setOnClickListener(new C24851xbc16ca21(aVar, cVar));
    }

    @C12579k
    /* renamed from: d */
    public final C36684e5 mo72586d() {
        return this.f61610b;
    }
}
