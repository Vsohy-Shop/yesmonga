package com.onetrust.otpublishers.headless.p052UI.mobiledatautils;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.core.view.C18019a;
import androidx.core.view.C18196h2;
import androidx.core.view.accessibility.C18065l0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C31178a;
import com.onetrust.otpublishers.headless.C35265a;

/* renamed from: com.onetrust.otpublishers.headless.UI.mobiledatautils.c */
public class C35257c {

    /* renamed from: com.onetrust.otpublishers.headless.UI.mobiledatautils.c$a */
    public class C35258a extends C18019a {
        /* renamed from: g */
        public void mo19938g(View view, C18065l0 l0Var) {
            super.mo19938g(view, l0Var);
            l0Var.mo52598b(new C18065l0.C18066a(16, view.getResources().getText(C35265a.C35278m.str_ada_open_link)));
        }
    }

    @C0344h1
    /* renamed from: a */
    public static int m145350a(Context context) {
        if (context == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: c */
    public static void m145351c(@C0359n0 CheckBox checkBox, int i, int i2) {
        checkBox.setButtonTintList(new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{i, i2}));
    }

    /* renamed from: d */
    public static void m145352d(@C0359n0 TextView textView) {
        C18196h2.m82474B1(textView, new C35258a());
    }

    /* renamed from: e */
    public static boolean m145353e(int i, KeyEvent keyEvent) {
        return i == 4 && keyEvent.getAction() == 1;
    }

    /* renamed from: b */
    public void mo105528b(Context context, C31178a aVar) {
        FrameLayout frameLayout = (FrameLayout) aVar.findViewById(C35265a.C35273h.design_bottom_sheet);
        if (frameLayout != null) {
            BottomSheetBehavior i0 = BottomSheetBehavior.m125237i0(frameLayout);
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            int a = m145350a(context);
            if (layoutParams != null) {
                layoutParams.height = (a * 2) / 3;
            }
            frameLayout.setLayoutParams(layoutParams);
            i0.mo88418W0(3);
            i0.mo88414S0(frameLayout.getMeasuredHeight());
        }
    }
}
