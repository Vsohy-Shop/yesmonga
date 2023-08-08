package com.carrefour.fid.android.design.components.widgets.adapter;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.core.content.C17318d;
import androidx.core.content.res.C17465i;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.C22090i;
import com.bumptech.glide.load.resource.bitmap.C22414i0;
import com.bumptech.glide.load.resource.bitmap.C22429n;
import com.bumptech.glide.request.C22561h;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37057j1;
import com.carrefour.fid.android.design.components.extension.C37113e;
import com.carrefour.fid.android.design.components.utils.C37138e;
import com.carrefour.fid.android.design.components.widgets.C37409t;
import com.facebook.shimmer.C14943c;
import com.facebook.shimmer.C14949d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.design.components.widgets.adapter.b */
public final class C37192b extends RecyclerView.C20061e0 {
    @C12579k

    /* renamed from: a */
    public final C37057j1 f93290a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37192b(@C12579k C37057j1 j1Var) {
        super(j1Var.getRoot());
        Intrinsics.checkNotNullParameter(j1Var, "binding");
        this.f93290a = j1Var;
    }

    /* renamed from: c */
    public final void mo113272c(@C12579k C37409t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "product");
        ((C22090i) ((C22090i) C22038b.m100350E(this.f93290a.getRoot().getContext()).mo65605u(tVar.mo114049a()).mo66765T0(mo113275f())).mo66744H(mo113274e())).mo65688b(new C22561h().mo66802m1(new C22429n(), new C22414i0(this.f93290a.getRoot().getContext().getResources().getDimensionPixelSize(C36896b.C36903g.ds_radius_m)))).mo65675K1(this.f93290a.f92701b);
    }

    @C12579k
    /* renamed from: d */
    public final C37057j1 mo113273d() {
        return this.f93290a;
    }

    /* renamed from: e */
    public final Drawable mo113274e() {
        ImageView b = this.f93290a.getRoot();
        Drawable g = C17465i.m80175g(b.getResources(), C36896b.C36904h.ds_ic_missing_image, b.getContext().getTheme());
        if (g != null) {
            Resources resources = b.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "it.resources");
            Drawable a = C37113e.m152154a(g, (int) C37138e.m152212c(resources, C36896b.C36903g.ds_component_image_error_inset_size_s));
            if (a != null) {
                a.setTint(C17465i.m80173e(b.getResources(), C36896b.C36902f.ds_grey_20, this.f93290a.getRoot().getContext().getTheme()));
                return a;
            }
        }
        throw new IllegalStateException("Can't find drawable: R.drawable.ds_ic_missing_image");
    }

    /* renamed from: f */
    public final Drawable mo113275f() {
        C14949d dVar = new C14949d();
        dVar.mo37037d(((C14943c.C14946c) ((C14943c.C14946c) ((C14943c.C14946c) ((C14943c.C14946c) ((C14943c.C14946c) new C14943c.C14946c().mo37018l(2000)).mo37014h(1.0f)).mo37022p(1.0f)).mo37033z(C17318d.m79723f(this.f93290a.getRoot().getContext(), C36896b.C36902f.ds_grey_80)).mo37030A(C17318d.m79723f(this.f93290a.getRoot().getContext(), C36896b.C36902f.ds_grey_40)).mo37016j(0)).mo37013g(true)).mo37009a());
        return dVar;
    }
}
