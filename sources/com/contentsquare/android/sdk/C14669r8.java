package com.contentsquare.android.sdk;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.contentsquare.android.sdk.C14893yb;

/* renamed from: com.contentsquare.android.sdk.r8 */
public class C14669r8 {
    /* renamed from: a */
    public static C14249c8 m63250a(View view, C14893yb.C14895b bVar, C14450jc jcVar) {
        C14249c8 c8Var = new C14249c8();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        C14781ue ueVar = new C14781ue(new C14510lf());
        C14396h6 h6Var = new C14396h6();
        h6Var.mo35495c(view.getClass().getSimpleName());
        h6Var.mo35497e(ueVar.mo36586b(view));
        boolean z = false;
        h6Var.mo35494b(0);
        C14546n7 n7Var = new C14546n7();
        n7Var.mo35969c(view.getHeight());
        n7Var.mo35978l(view.getWidth());
        n7Var.mo35973g(iArr[0]);
        n7Var.mo35976j(iArr[1]);
        if (view.getVisibility() == 0) {
            z = true;
        }
        n7Var.mo35971e(z);
        if (m63253d(view, jcVar)) {
            n7Var.mo35974h(bVar.mo35541c(view));
        } else if (!jcVar.f35693a) {
            n7Var.mo35970d(m63252c(view));
            n7Var.mo35968b(m63254e(view));
        }
        c8Var.mo34845h(n7Var.mo35981o());
        c8Var.mo34843f(h6Var.mo35499g());
        c8Var.mo34840c(C14493l4.m62465b(view, "null"));
        return c8Var;
    }

    /* renamed from: b */
    public static String m63251b(int i) {
        return String.format("#%08X", new Object[]{Integer.valueOf(i)});
    }

    /* renamed from: c */
    public static String m63252c(View view) {
        Drawable background = view.getBackground();
        return background instanceof ColorDrawable ? m63251b(((ColorDrawable) background).getColor()) : "#00FFFFFF";
    }

    /* renamed from: d */
    public static boolean m63253d(View view, C14450jc jcVar) {
        return jcVar.f35694b ? view == jcVar.f35695c : !(view instanceof ViewGroup) || m63255f(view) || (view instanceof WebView);
    }

    /* renamed from: e */
    public static float m63254e(View view) {
        Drawable background = view.getBackground();
        if (!(view instanceof ViewGroup) || !(background instanceof ColorDrawable)) {
            return 1.0f;
        }
        return view.getAlpha();
    }

    /* renamed from: f */
    public static boolean m63255f(View view) {
        return view.getBackground() instanceof LayerDrawable;
    }
}
