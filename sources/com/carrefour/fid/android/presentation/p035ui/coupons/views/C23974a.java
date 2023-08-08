package com.carrefour.fid.android.presentation.p035ui.coupons.views;

import android.content.Context;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.databinding.C36768n;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.presentation.p035ui.coupons.helpers.C23815a;
import com.carrefour.fid.android.utils.C22711j;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.views.a */
public final class C23974a extends RecyclerView.C20061e0 {

    /* renamed from: c */
    public static final int f60169c = 8;
    @C12579k

    /* renamed from: a */
    public final C36768n f60170a;
    @C12579k

    /* renamed from: b */
    public Context f60171b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23974a(@C12579k C36768n nVar, @C12579k Context context) {
        super(nVar.getRoot());
        Intrinsics.checkNotNullParameter(nVar, "binding");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f60170a = nVar;
        this.f60171b = context;
    }

    @C12579k
    /* renamed from: c */
    public final C36768n mo70145c() {
        return this.f60170a;
    }

    @C12579k
    /* renamed from: d */
    public final Context mo70146d() {
        return this.f60171b;
    }

    /* renamed from: e */
    public final void mo70147e(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.f60171b = context;
    }

    /* renamed from: f */
    public final void mo70148f(@C12579k CouponModel couponModel) {
        Intrinsics.checkNotNullParameter(couponModel, "couponItem");
        C23815a aVar = C23815a.f59923a;
        int e = aVar.mo69747e(couponModel.mo121400P());
        TextView textView = this.f60170a.f91347e;
        String a = aVar.mo69743a(couponModel.mo121438z(), couponModel.mo121391G());
        String string = this.f60171b.getString(e);
        String E = couponModel.mo121389E();
        textView.setText(a + " " + string + " " + E);
        this.f60170a.f91346d.setText(String.valueOf(couponModel.mo121392H()));
        this.f60170a.f91345c.setImageBitmap(C22711j.m102880c(String.valueOf(couponModel.mo121392H()), 500, 100, 500, 99, C23975b.f60174c));
    }
}
