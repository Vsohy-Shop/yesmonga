package com.carrefour.fid.android.presentation.p035ui.orders.offline.adapter;

import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.databinding.C36863w4;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.adapter.C24744e;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.C24797c;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.C24799e;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.DownloadReceipt;
import com.carrefour.fid.android.shared.constant.C28561l1;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.adapter.j */
public final class C24752j extends RecyclerView.C20061e0 {
    @C12579k

    /* renamed from: b */
    public static final C24753a f61417b = new C24753a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f61418c = 8;

    /* renamed from: d */
    public static final int f61419d = 0;
    @C12579k

    /* renamed from: e */
    public static final List<String> f61420e = CollectionsKt__CollectionsKt.m40452P(C28561l1.f69522o, "06", "08", "14", "18", "20", "21", "44", "74", "91", "92", "93");
    @C12579k

    /* renamed from: a */
    public final C36863w4 f61421a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.adapter.j$a */
    public static final class C24753a {
        public /* synthetic */ C24753a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final List<String> mo72279a() {
            return C24752j.f61420e;
        }

        public C24753a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24752j(@C12579k C36863w4 w4Var) {
        super(w4Var.getRoot());
        Intrinsics.checkNotNullParameter(w4Var, "binding");
        this.f61421a = w4Var;
    }

    /* renamed from: g */
    public static final void m107933g(C24744e.C24745a aVar, View view) {
        Intrinsics.checkNotNullParameter(aVar, "$adapterCallback");
        aVar.mo72228a(DownloadReceipt.BillReceipt.f61487b);
    }

    /* renamed from: h */
    public static final void m107934h(C24744e.C24745a aVar, View view) {
        Intrinsics.checkNotNullParameter(aVar, "$adapterCallback");
        aVar.mo72228a(DownloadReceipt.BankReceipt.f61485b);
    }

    /* renamed from: f */
    public final void mo72277f(@C12579k C24797c cVar, @C12580l C24799e eVar, @C12579k C24744e.C24745a aVar) {
        String str;
        Intrinsics.checkNotNullParameter(cVar, "item");
        Intrinsics.checkNotNullParameter(aVar, "adapterCallback");
        this.f61421a.f91854e.setText(cVar.mo72416m());
        this.f61421a.f91853d.setText(cVar.mo72413j());
        this.f61421a.f91852c.setOnClickListener(new C24750h(aVar));
        Iterable iterable = f61420e;
        if (eVar != null) {
            str = eVar.mo72426h();
        } else {
            str = null;
        }
        if (CollectionsKt___CollectionsKt.m40558R1(iterable, str)) {
            this.f61421a.f91851b.setVisibility(0);
            this.f61421a.f91851b.setOnClickListener(new C24751i(aVar));
            return;
        }
        this.f61421a.f91851b.setVisibility(8);
    }

    @C12579k
    /* renamed from: i */
    public final C36863w4 mo72278i() {
        return this.f61421a;
    }
}
