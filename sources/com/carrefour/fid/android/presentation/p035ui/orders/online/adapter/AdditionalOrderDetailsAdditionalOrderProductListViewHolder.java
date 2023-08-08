package com.carrefour.fid.android.presentation.p035ui.orders.online.adapter;

import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.databinding.C36793p4;
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
@C11363r0({"SMAP\nOrdersOnlineDetailsViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersOnlineDetailsViewHolder.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/adapter/AdditionalOrderDetailsAdditionalOrderProductListViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,824:1\n1549#2:825\n1620#2,3:826\n*S KotlinDebug\n*F\n+ 1 OrdersOnlineDetailsViewHolder.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/adapter/AdditionalOrderDetailsAdditionalOrderProductListViewHolder\n*L\n747#1:825\n747#1:826,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.AdditionalOrderDetailsAdditionalOrderProductListViewHolder */
public final class AdditionalOrderDetailsAdditionalOrderProductListViewHolder extends C24896v {
    @C12579k

    /* renamed from: c */
    public static final C24845a f61599c = new C24845a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f61600d = 8;

    /* renamed from: e */
    public static final int f61601e = 8;
    @C12579k

    /* renamed from: b */
    public final C36793p4 f61602b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.AdditionalOrderDetailsAdditionalOrderProductListViewHolder$a */
    public static final class C24845a {
        public /* synthetic */ C24845a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24845a() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AdditionalOrderDetailsAdditionalOrderProductListViewHolder(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.databinding.C36793p4 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            android.widget.LinearLayout r0 = r3.getRoot()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.f61602b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.orders.online.adapter.AdditionalOrderDetailsAdditionalOrderProductListViewHolder.<init>(com.carrefour.fid.android.databinding.p4):void");
    }

    @SuppressLint({"SimpleDateFormat"})
    /* renamed from: c */
    public final void mo72581c(@C12579k C25230a.C25231a aVar, @C12580l C24881i.C24882a aVar2) {
        C24846x57518d7 additionalOrderDetailsAdditionalOrderProductListViewHolder$bind$1$2$1;
        Intrinsics.checkNotNullParameter(aVar, "additionalOrderProductModel");
        HubProductComponent hubProductComponent = this.f61602b.f91489b;
        String l = aVar.mo73511l();
        String j = aVar.mo73509j();
        String b = C28782t.m119105b(Double.valueOf(aVar.mo73508i()));
        int size = aVar.mo73512m().size();
        Iterable<OrdersOnlineDetailsProductModel> m = aVar.mo73512m();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(m, 10));
        for (OrdersOnlineDetailsProductModel d : m) {
            arrayList.add(new C37409t(C25199d.m108905d(d), (String) null, 2, (DefaultConstructorMarker) null));
        }
        String k = aVar.mo73510k();
        if (k != null) {
            additionalOrderDetailsAdditionalOrderProductListViewHolder$bind$1$2$1 = new C24846x57518d7(aVar2, k);
        } else {
            additionalOrderDetailsAdditionalOrderProductListViewHolder$bind$1$2$1 = null;
        }
        hubProductComponent.mo112884L(new C37422x.C37424b(l, j, b, size, arrayList, additionalOrderDetailsAdditionalOrderProductListViewHolder$bind$1$2$1));
        hubProductComponent.setOnClickListener(new C24847x57619ecb(aVar2, aVar));
    }

    @C12579k
    /* renamed from: d */
    public final C36793p4 mo72582d() {
        return this.f61602b;
    }
}
