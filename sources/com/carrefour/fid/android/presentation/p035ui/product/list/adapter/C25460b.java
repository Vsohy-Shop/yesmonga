package com.carrefour.fid.android.presentation.p035ui.product.list.adapter;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.core.graphics.BlendModeCompat;
import androidx.core.graphics.C17584h;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.databinding.C36653b4;
import com.carrefour.fid.android.domain.models.CriteoFormatRenderingDomain;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.product.list.adapter.b */
public final class C25460b extends RecyclerView.Adapter<C25461a> {

    /* renamed from: e */
    public static final int f62674e = 8;
    @C12579k

    /* renamed from: a */
    public List<String> f62675a;
    @C12579k

    /* renamed from: b */
    public final CriteoFormatRenderingDomain f62676b;

    /* renamed from: c */
    public int f62677c;
    @C12579k

    /* renamed from: d */
    public final C11300l<Integer, C11079d2> f62678d;

    @C11363r0({"SMAP\nButterflyAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ButterflyAdapter.kt\ncom/carrefour/fid/android/presentation/ui/product/list/adapter/ButterflyAdapter$ButterflyViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.ui.product.list.adapter.b$a */
    public final class C25461a extends RecyclerView.C20061e0 {
        @C12579k

        /* renamed from: a */
        public final C36653b4 f62679a;

        /* renamed from: b */
        public final /* synthetic */ C25460b f62680b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25461a(@C12579k C25460b bVar, C36653b4 b4Var) {
            super(b4Var.getRoot());
            Intrinsics.checkNotNullParameter(b4Var, "binding");
            this.f62680b = bVar;
            this.f62679a = b4Var;
        }

        /* renamed from: e */
        public static final void m109926e(C25460b bVar, C25461a aVar, View view) {
            Intrinsics.checkNotNullParameter(bVar, "this$0");
            Intrinsics.checkNotNullParameter(aVar, "this$1");
            bVar.f62677c = aVar.getAdapterPosition();
            bVar.notifyDataSetChanged();
            bVar.f62678d.invoke(Integer.valueOf(bVar.f62677c));
        }

        /* renamed from: d */
        public final void mo74229d(@C12579k String str) {
            boolean z;
            Intrinsics.checkNotNullParameter(str, "buttonText");
            this.f62679a.f90605b.setText(str);
            if (getAdapterPosition() == this.f62680b.f62677c) {
                z = true;
            } else {
                z = false;
            }
            mo74231g(z);
            this.f62679a.f90605b.setOnClickListener(new C25459a(this.f62680b, this));
        }

        @C12579k
        /* renamed from: f */
        public final C36653b4 mo74230f() {
            return this.f62679a;
        }

        /* renamed from: g */
        public final void mo74231g(boolean z) {
            Integer num;
            Integer num2;
            ColorFilter colorFilter;
            if (z) {
                num = this.f62680b.f62676b.mo115732i();
            } else {
                num = this.f62680b.f62676b.mo115726d();
            }
            if (z) {
                num2 = this.f62680b.f62676b.mo115733j();
            } else {
                num2 = this.f62680b.f62676b.mo115728e();
            }
            Drawable background = this.f62679a.f90605b.getBackground();
            if (num != null) {
                colorFilter = C17584h.m80560a(num.intValue(), BlendModeCompat.SRC_ATOP);
            } else {
                colorFilter = null;
            }
            background.setColorFilter(colorFilter);
            if (num2 != null) {
                this.f62679a.f90605b.setTextColor(num2.intValue());
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25460b(List list, CriteoFormatRenderingDomain criteoFormatRenderingDomain, int i, C11300l lVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, criteoFormatRenderingDomain, i, lVar);
    }

    public int getItemCount() {
        return this.f62675a.size();
    }

    /* renamed from: o */
    public void onBindViewHolder(@C12579k C25461a aVar, int i) {
        Intrinsics.checkNotNullParameter(aVar, "holder");
        aVar.mo74229d(this.f62675a.get(i));
    }

    @C12579k
    /* renamed from: p */
    public C25461a onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C36653b4 d = C36653b4.m150343d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C25461a(this, d);
    }

    public C25460b(@C12579k List<String> list, @C12579k CriteoFormatRenderingDomain criteoFormatRenderingDomain, int i, @C12579k C11300l<? super Integer, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(criteoFormatRenderingDomain, "rendering");
        Intrinsics.checkNotNullParameter(lVar, C10108c.f27778C);
        this.f62675a = list;
        this.f62676b = criteoFormatRenderingDomain;
        this.f62677c = i;
        this.f62678d = lVar;
    }
}
