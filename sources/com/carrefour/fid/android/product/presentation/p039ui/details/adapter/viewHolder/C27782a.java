package com.carrefour.fid.android.product.presentation.p039ui.details.adapter.viewHolder;

import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.product.databinding.C27496k;
import com.carrefour.fid.android.product.presentation.models.Advice;
import com.carrefour.fid.android.shared.extension.StringKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.viewHolder.a */
public final class C27782a extends RecyclerView.C20061e0 {

    /* renamed from: b */
    public static final int f67359b = 8;
    @C12579k

    /* renamed from: a */
    public final C27496k f67360a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27782a(@C12579k C27496k kVar) {
        super(kVar.getRoot());
        Intrinsics.checkNotNullParameter(kVar, "binding");
        this.f67360a = kVar;
    }

    /* renamed from: c */
    public final void mo80726c(@C12579k Advice advice) {
        Intrinsics.checkNotNullParameter(advice, "productAdvice");
        if (!C11622t.isBlank(advice.mo80291f())) {
            TextView textView = this.f67360a.f66707c;
            textView.setVisibility(0);
            textView.setText(textView.getContext().getString(advice.mo80289e().mo80299q()));
            TextView textView2 = this.f67360a.f66706b;
            textView2.setVisibility(0);
            textView2.setText(StringKt.m118913V(advice.mo80291f()));
        }
    }

    @C12579k
    /* renamed from: d */
    public final C27496k mo80727d() {
        return this.f67360a;
    }
}
