package com.carrefour.fid.android.presentation.p035ui.orders.online.adapter;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.databinding.C36823s4;
import com.carrefour.fid.android.design.components.widgets.C37409t;
import com.carrefour.fid.android.design.components.widgets.C37422x;
import com.carrefour.fid.android.design.components.widgets.HubProductComponent;
import com.carrefour.fid.android.presentation.p035ui.orders.online.adapter.C24881i;
import com.carrefour.fid.android.presentation.p035ui.orders.online.extension.C25199d;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25230a;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25234b;
import java.util.ArrayList;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nOrdersOnlineDetailsViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersOnlineDetailsViewHolder.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/adapter/AdditionalOrderDetailsMissingProductListViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,824:1\n800#2,11:825\n1549#2:836\n1620#2,3:837\n*S KotlinDebug\n*F\n+ 1 OrdersOnlineDetailsViewHolder.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/adapter/AdditionalOrderDetailsMissingProductListViewHolder\n*L\n668#1:825,11\n674#1:836\n674#1:837,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.AdditionalOrderDetailsMissingProductListViewHolder */
public final class AdditionalOrderDetailsMissingProductListViewHolder extends C24896v {
    @C12579k

    /* renamed from: c */
    public static final C24848a f61603c = new C24848a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f61604d = 8;

    /* renamed from: e */
    public static final int f61605e = 6;
    @C12579k

    /* renamed from: b */
    public final C36823s4 f61606b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.AdditionalOrderDetailsMissingProductListViewHolder$a */
    public static final class C24848a {
        public /* synthetic */ C24848a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24848a() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AdditionalOrderDetailsMissingProductListViewHolder(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.databinding.C36823s4 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            android.widget.LinearLayout r0 = r3.getRoot()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.f61606b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.orders.online.adapter.AdditionalOrderDetailsMissingProductListViewHolder.<init>(com.carrefour.fid.android.databinding.s4):void");
    }

    /* renamed from: c */
    public final void mo72583c(@C12579k C25230a.C25232b bVar, @C12580l C24881i.C24882a aVar) {
        Intrinsics.checkNotNullParameter(bVar, "missingProductModel");
        ArrayList<C25234b> arrayList = new ArrayList<>();
        for (Object next : bVar.mo73519g()) {
            if (next instanceof C25234b) {
                arrayList.add(next);
            }
        }
        HubProductComponent hubProductComponent = this.f61606b.f91634b;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(arrayList, 10));
        for (C25234b d : arrayList) {
            arrayList2.add(new C37409t(C25199d.m108905d(d), (String) null, 2, (DefaultConstructorMarker) null));
        }
        hubProductComponent.mo112884L(new C37422x.C37428f(size, arrayList2));
        hubProductComponent.setOnClickListener(new AdditionalOrderDetailsMissingProductListViewHolder$bind$1$2(aVar, bVar));
    }

    @C12579k
    /* renamed from: d */
    public final C36823s4 mo72584d() {
        return this.f61606b;
    }
}
