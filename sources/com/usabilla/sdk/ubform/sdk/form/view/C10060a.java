package com.usabilla.sdk.ubform.sdk.form.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.IconCompat;
import androidx.viewpager.widget.C20784a;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.usabilla.sdk.ubform.sdk.page.view.PageView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.usabilla.sdk.ubform.sdk.form.view.a */
public final class C10060a extends C20784a {
    @C12579k

    /* renamed from: e */
    public final List<PageView<?>> f27662e = new ArrayList();

    /* renamed from: b */
    public void mo21372b(@C12579k ViewGroup viewGroup, int i, @C12579k Object obj) {
        Intrinsics.checkNotNullParameter(viewGroup, "container");
        Intrinsics.checkNotNullParameter(obj, IconCompat.f45868A);
        viewGroup.removeView((PageView) obj);
    }

    /* renamed from: e */
    public int mo21373e() {
        return this.f27662e.size();
    }

    /* renamed from: k */
    public boolean mo21375k(@C12579k View view, @C12579k Object obj) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(obj, IconCompat.f45868A);
        return view == obj;
    }

    /* renamed from: v */
    public final void mo21376v(@C12579k PageView<?> pageView) {
        Intrinsics.checkNotNullParameter(pageView, "pageView");
        this.f27662e.add(pageView);
    }

    @C12579k
    /* renamed from: w */
    public PageView<?> mo21374j(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "container");
        PageView<?> pageView = this.f27662e.get(i);
        viewGroup.addView(pageView);
        return pageView;
    }
}
