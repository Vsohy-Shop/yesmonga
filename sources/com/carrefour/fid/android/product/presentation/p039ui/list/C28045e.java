package com.carrefour.fid.android.product.presentation.p039ui.list;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.C20209t;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.core.paging.C36328a;
import com.carrefour.fid.android.design.components.widgets.productcard.C37353b;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37369a;
import com.carrefour.fid.android.shared.paging.C28850b;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.e */
public final class C28045e extends C20209t<C37369a, RecyclerView.C20061e0> {

    /* renamed from: f */
    public static final int f67948f = 8;
    @C12579k

    /* renamed from: c */
    public final C37353b f67949c;
    @C12579k

    /* renamed from: d */
    public final C28850b f67950d;
    @C12579k

    /* renamed from: e */
    public final GridLayoutManager.C20044c f67951e = new C28047b(this);

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.list.e$a */
    public static final class C28046a extends RecyclerView.C20061e0 {

        /* renamed from: a */
        public static final int f67952a = 0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28046a(@C12579k View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
        }
    }

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.list.e$b */
    public static final class C28047b extends GridLayoutManager.C20044c {

        /* renamed from: e */
        public final /* synthetic */ C28045e f67953e;

        public C28047b(C28045e eVar) {
            this.f67953e = eVar;
        }

        /* renamed from: f */
        public int mo59352f(int i) {
            if (i < 0) {
                return 0;
            }
            List k = this.f67953e.mo60667k();
            Intrinsics.checkNotNullExpressionValue(k, "currentList");
            if (i > CollectionsKt__CollectionsKt.m40443G(k)) {
                return 0;
            }
            C37353b p = this.f67953e.f67949c;
            Object obj = this.f67953e.mo60667k().get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "currentList[position]");
            return p.mo113919j((C37369a) obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28045e(@C12579k C37353b bVar, @C12579k C28850b bVar2) {
        super(bVar.mo113917h());
        Intrinsics.checkNotNullParameter(bVar, "viewBinder");
        Intrinsics.checkNotNullParameter(bVar2, "delegate");
        this.f67949c = bVar;
        this.f67950d = bVar2;
        bVar.mo113920k(this);
    }

    public int getItemViewType(int i) {
        List k = mo60667k();
        Intrinsics.checkNotNullExpressionValue(k, "currentList");
        C37369a aVar = (C37369a) CollectionsKt___CollectionsKt.m40559R2(k, i);
        if (aVar != null) {
            return aVar.getType(C37353b.C37354a.f93883a);
        }
        return 0;
    }

    public void onBindViewHolder(@C12579k RecyclerView.C20061e0 e0Var, int i) {
        Intrinsics.checkNotNullParameter(e0Var, "holder");
        this.f67950d.mo83962b(i);
        C37369a aVar = (C37369a) mo60668l(i);
        if (aVar != null) {
            this.f67949c.mo113913d(aVar, e0Var, i);
        }
    }

    @C12579k
    public RecyclerView.C20061e0 onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C37353b bVar = this.f67949c;
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View e = bVar.mo113914e(i, context);
        if (e != null) {
            e.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new C28046a(e);
        }
        C37353b bVar2 = this.f67949c;
        Context context2 = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
        return bVar2.mo113915f(i, context2);
    }

    @C12579k
    /* renamed from: q */
    public final C28850b mo81609q() {
        return this.f67950d;
    }

    @C12579k
    /* renamed from: r */
    public final GridLayoutManager.C20044c mo81610r() {
        return this.f67951e;
    }

    /* renamed from: s */
    public final void mo81611s() {
        this.f67950d.mo83963c();
    }

    /* renamed from: t */
    public final void mo81612t() {
        this.f67950d.mo83962b(0);
    }

    /* renamed from: u */
    public final void mo81613u(@C12579k C36328a<C37369a> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "data");
        mo60670n(aVar.mo108395h());
    }
}
