package com.carrefour.fid.android.product.presentation.p039ui.details.adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.request.C22561h;
import com.carrefour.fid.android.product.C27609f;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.ortiz.touchview.TouchImageView;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.h */
public final class C27778h extends RecyclerView.Adapter<C27779a> {
    @C12579k

    /* renamed from: a */
    public List<String> f67352a = CollectionsKt__CollectionsKt.m40441E();

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.h$a */
    public final class C27779a extends RecyclerView.C20061e0 {
        @C12579k

        /* renamed from: a */
        public final TouchImageView f67353a;

        /* renamed from: b */
        public final /* synthetic */ C27778h f67354b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27779a(@C12579k C27778h hVar, TouchImageView touchImageView) {
            super(touchImageView);
            Intrinsics.checkNotNullParameter(touchImageView, C40383c.f102945c);
            this.f67354b = hVar;
            this.f67353a = touchImageView;
        }

        @C12579k
        /* renamed from: c */
        public final TouchImageView mo80721c() {
            return this.f67353a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r3 != 2) goto L_0x0033;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m116725o(com.ortiz.touchview.TouchImageView r3, android.view.ViewGroup r4, android.view.View r5, android.view.MotionEvent r6) {
        /*
            java.lang.String r0 = "$this_apply"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "$parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r6.getPointerCount()
            r1 = 1
            r2 = 2
            if (r0 >= r2) goto L_0x001f
            boolean r0 = r5.canScrollHorizontally(r1)
            if (r0 == 0) goto L_0x0033
            r0 = -1
            boolean r3 = r3.canScrollHorizontally(r0)
            if (r3 == 0) goto L_0x0033
        L_0x001f:
            int r3 = r6.getAction()
            r6 = 0
            if (r3 == 0) goto L_0x002f
            if (r3 == r1) goto L_0x002b
            if (r3 == r2) goto L_0x002f
            goto L_0x0033
        L_0x002b:
            r4.requestDisallowInterceptTouchEvent(r6)
            goto L_0x0033
        L_0x002f:
            r4.requestDisallowInterceptTouchEvent(r1)
            r1 = r6
        L_0x0033:
            r5.performClick()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.adapter.C27778h.m116725o(com.ortiz.touchview.TouchImageView, android.view.ViewGroup, android.view.View, android.view.MotionEvent):boolean");
    }

    public int getItemCount() {
        return this.f67352a.size();
    }

    @C12579k
    /* renamed from: l */
    public final List<String> mo80717l() {
        return this.f67352a;
    }

    /* renamed from: m */
    public void onBindViewHolder(@C12579k C27779a aVar, int i) {
        Intrinsics.checkNotNullParameter(aVar, "holder");
        C22038b.m100350E(aVar.mo80721c().getContext()).mo65605u(this.f67352a.get(i)).mo65688b(new C22561h().mo66763S0(C27609f.C27617h.ic_product_placeholder)).mo65675K1(aVar.mo80721c());
    }

    @C12579k
    /* renamed from: n */
    public C27779a onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        TouchImageView touchImageView = new TouchImageView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        touchImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        touchImageView.setOnTouchListener(new C27777g(touchImageView, viewGroup));
        return new C27779a(this, touchImageView);
    }

    /* renamed from: p */
    public final void mo80720p(@C12579k List<String> list) {
        Intrinsics.checkNotNullParameter(list, "value");
        this.f67352a = list;
        notifyDataSetChanged();
    }
}
