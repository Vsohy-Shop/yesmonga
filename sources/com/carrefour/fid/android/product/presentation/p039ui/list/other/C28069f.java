package com.carrefour.fid.android.product.presentation.p039ui.list.other;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.product.databinding.C27501n;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.other.f */
public final class C28069f extends RecyclerView.Adapter<C28070a> {
    @C12579k

    /* renamed from: a */
    public List<ProductCategory> f68004a;
    @C12579k

    /* renamed from: b */
    public final C11300l<ProductCategory, C11079d2> f68005b;

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.list.other.f$a */
    public final class C28070a extends RecyclerView.C20061e0 {
        @C12579k

        /* renamed from: a */
        public final C27501n f68006a;

        /* renamed from: b */
        public final /* synthetic */ C28069f f68007b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28070a(@C12579k C28069f fVar, C27501n nVar) {
            super(nVar.getRoot());
            Intrinsics.checkNotNullParameter(nVar, "binding");
            this.f68007b = fVar;
            this.f68006a = nVar;
        }

        /* renamed from: e */
        public static final void m117601e(C28069f fVar, ProductCategory productCategory, View view) {
            Intrinsics.checkNotNullParameter(fVar, "this$0");
            Intrinsics.checkNotNullParameter(productCategory, "$departmentTag");
            fVar.f68005b.invoke(productCategory);
        }

        /* renamed from: d */
        public final void mo81649d(@C12579k ProductCategory productCategory) {
            Intrinsics.checkNotNullParameter(productCategory, "departmentTag");
            TextView textView = this.f68006a.f66725b;
            C28069f fVar = this.f68007b;
            textView.setText(productCategory.mo117297q());
            Intrinsics.checkNotNullExpressionValue(textView, "bind$lambda$1");
            String string = textView.getContext().getString(C27609f.C27627r.accessibility_open_product_list, new Object[]{productCategory.mo117297q()});
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…list, departmentTag.name)");
            ViewKt.m152121c(textView, string, false, 2, (Object) null);
            textView.setOnClickListener(new C28068e(fVar, productCategory));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C28069f(List list, C11300l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, lVar);
    }

    public int getItemCount() {
        return this.f68004a.size();
    }

    /* renamed from: l */
    public void onBindViewHolder(@C12579k C28070a aVar, int i) {
        Intrinsics.checkNotNullParameter(aVar, "holder");
        aVar.mo81649d(this.f68004a.get(i));
    }

    @C12579k
    /* renamed from: m */
    public C28070a onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C27501n d = C27501n.m115725d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(\n               …      false\n            )");
        return new C28070a(this, d);
    }

    public C28069f(@C12579k List<ProductCategory> list, @C12579k C11300l<? super ProductCategory, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(lVar, C10108c.f27778C);
        this.f68004a = list;
        this.f68005b = lVar;
    }
}
