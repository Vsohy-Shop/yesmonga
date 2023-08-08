package com.carrefour.fid.android.presentation.p035ui.orders.online.adapter;

import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.databinding.C36724i5;
import com.carrefour.fid.android.presentation.p035ui.orders.online.adapter.C24881i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.b0 */
public final class C24867b0 extends C24896v {
    @C12579k

    /* renamed from: c */
    public static final C24868a f61645c = new C24868a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f61646d = 8;

    /* renamed from: e */
    public static final int f61647e = 9;
    @C12579k

    /* renamed from: b */
    public final C36724i5 f61648b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.b0$a */
    public static final class C24868a {
        public /* synthetic */ C24868a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24868a() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C24867b0(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.databinding.C36724i5 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.getRoot()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.f61648b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.orders.online.adapter.C24867b0.<init>(com.carrefour.fid.android.databinding.i5):void");
    }

    /* renamed from: e */
    public static final void m108273e(C24881i.C24882a aVar, View view) {
        if (aVar != null) {
            aVar.mo72540l();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72616d(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25242j r12, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.presentation.p035ui.orders.online.adapter.C24881i.C24882a r13) {
        /*
            r11 = this;
            java.lang.String r0 = "returnableBagModel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            com.carrefour.fid.android.databinding.i5 r0 = r11.f61648b
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.getRoot()
            android.content.Context r0 = r0.getContext()
            com.carrefour.fid.android.databinding.i5 r1 = r11.f61648b
            com.carrefour.fid.android.databinding.q4 r1 = r1.f91018b
            android.widget.TextView r1 = r1.f91537b
            r2 = 4
            r1.setVisibility(r2)
            com.carrefour.fid.android.databinding.i5 r1 = r11.f61648b
            com.carrefour.fid.android.databinding.q4 r1 = r1.f91018b
            android.widget.TextView r1 = r1.f91538c
            r2 = 2131953305(0x7f130699, float:1.9543077E38)
            java.lang.String r2 = r0.getString(r2)
            r1.setText(r2)
            com.carrefour.fid.android.databinding.i5 r1 = r11.f61648b
            com.carrefour.fid.android.databinding.f5 r1 = r1.f91019c
            android.widget.TextView r1 = r1.f90819j
            r2 = 2131953308(0x7f13069c, float:1.9543083E38)
            java.lang.String r2 = r0.getString(r2)
            r1.setText(r2)
            com.carrefour.fid.android.databinding.i5 r1 = r11.f61648b
            com.carrefour.fid.android.databinding.f5 r1 = r1.f91019c
            android.widget.ImageView r1 = r1.f90814e
            r2 = 2131231635(0x7f080393, float:1.8079357E38)
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            r1.setImageDrawable(r2)
            com.carrefour.fid.android.databinding.i5 r1 = r11.f61648b
            android.widget.TextView r1 = r1.f91020d
            com.carrefour.fid.android.presentation.ui.orders.online.adapter.a0 r2 = new com.carrefour.fid.android.presentation.ui.orders.online.adapter.a0
            r2.<init>(r13)
            r1.setOnClickListener(r2)
            com.carrefour.fid.android.databinding.i5 r13 = r11.f61648b
            com.carrefour.fid.android.databinding.f5 r13 = r13.f91019c
            android.widget.TextView r13 = r13.f90815f
            r1 = 2131099842(0x7f0600c2, float:1.7812049E38)
            int r2 = r0.getColor(r1)
            r13.setTextColor(r2)
            java.lang.String r2 = "bind$lambda$1"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r2)
            double r2 = r12.mo73580a()
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            com.carrefour.fid.android.shared.extension.TextViewKt.m118962m(r13, r2)
            com.carrefour.fid.android.databinding.i5 r13 = r11.f61648b
            com.carrefour.fid.android.databinding.f5 r13 = r13.f91019c
            android.widget.TextView r13 = r13.f90820k
            int r2 = r12.mo73582d()
            if (r2 <= 0) goto L_0x00c5
            android.text.SpannableString r2 = new android.text.SpannableString
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r12.mo73582d()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r9 = 0
            r3[r9] = r4
            java.lang.String r12 = r12.mo73581b()
            r10 = 1
            r3[r10] = r12
            r12 = 2131953301(0x7f130695, float:1.954307E38)
            java.lang.String r12 = r0.getString(r12, r3)
            r2.<init>(r12)
            java.lang.String r4 = "x"
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            r3 = r2
            int r12 = kotlin.text.StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) r3, (java.lang.String) r4, (int) r5, (boolean) r6, (int) r7, (java.lang.Object) r8)
            int r12 = r12 + r10
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r3.<init>(r10)
            r4 = 18
            r2.setSpan(r3, r9, r12, r4)
            android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
            int r0 = androidx.core.content.C17318d.m79723f(r0, r1)
            r3.<init>(r0)
            r2.setSpan(r3, r9, r12, r4)
            goto L_0x00c7
        L_0x00c5:
            java.lang.String r2 = ""
        L_0x00c7:
            r13.setText(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.orders.online.adapter.C24867b0.mo72616d(com.carrefour.fid.android.presentation.ui.orders.online.model.j, com.carrefour.fid.android.presentation.ui.orders.online.adapter.i$a):void");
    }

    @C12579k
    /* renamed from: f */
    public final C36724i5 mo72617f() {
        return this.f61648b;
    }
}
