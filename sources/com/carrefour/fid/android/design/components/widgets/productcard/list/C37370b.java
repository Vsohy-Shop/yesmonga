package com.carrefour.fid.android.design.components.widgets.productcard.list;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.C20209t;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.design.components.widgets.productcard.C37353b;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.list.b */
public final class C37370b extends C20209t<C37369a, RecyclerView.C20061e0> {

    /* renamed from: f */
    public static final int f93916f = 8;
    @C12579k

    /* renamed from: c */
    public final C37353b f93917c;
    @C12579k

    /* renamed from: d */
    public List<? extends C37369a> f93918d = CollectionsKt__CollectionsKt.m40441E();
    @C12579k

    /* renamed from: e */
    public final GridLayoutManager.C20044c f93919e = new C37372b(this);

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.list.b$a */
    public static final class C37371a extends RecyclerView.C20061e0 {

        /* renamed from: a */
        public static final int f93920a = 0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37371a(@C12579k View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
        }
    }

    /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.list.b$b */
    public static final class C37372b extends GridLayoutManager.C20044c {

        /* renamed from: e */
        public final /* synthetic */ C37370b f93921e;

        public C37372b(C37370b bVar) {
            this.f93921e = bVar;
        }

        /* renamed from: f */
        public int mo59352f(int i) {
            if (i >= 0 && i <= CollectionsKt__CollectionsKt.m40443G(this.f93921e.getList())) {
                return this.f93921e.f93917c.mo113919j(this.f93921e.getList().get(i));
            }
            return 0;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37370b(@C12579k C37353b bVar) {
        super(bVar.mo113917h());
        Intrinsics.checkNotNullParameter(bVar, "viewBinder");
        this.f93917c = bVar;
        bVar.mo113920k(this);
    }

    public int getItemCount() {
        return getList().size();
    }

    public int getItemViewType(int i) {
        return getList().get(i).getType(C37353b.C37354a.f93883a);
    }

    @C12579k
    public final List<C37369a> getList() {
        List<C37369a> k = mo60667k();
        Intrinsics.checkNotNullExpressionValue(k, "currentList");
        return k;
    }

    public void onBindViewHolder(@C12579k RecyclerView.C20061e0 e0Var, int i) {
        Intrinsics.checkNotNullParameter(e0Var, "holder");
        this.f93917c.mo113913d(getList().get(i), e0Var, i);
    }

    @C12579k
    public RecyclerView.C20061e0 onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C37353b bVar = this.f93917c;
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View e = bVar.mo113914e(i, context);
        if (e != null) {
            e.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new C37371a(e);
        }
        C37353b bVar2 = this.f93917c;
        Context context2 = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
        return bVar2.mo113915f(i, context2);
    }

    @C12579k
    /* renamed from: q */
    public final GridLayoutManager.C20044c mo113945q() {
        return this.f93919e;
    }

    public final void setList(@C12579k List<? extends C37369a> list) {
        Intrinsics.checkNotNullParameter(list, "value");
        this.f93918d = list;
        mo60670n(list);
        notifyDataSetChanged();
    }
}
