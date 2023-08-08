package com.contentsquare.android.sdk;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.contentsquare.android.sdk.C14829w8;

/* renamed from: com.contentsquare.android.sdk.fa */
public class C14341fa {

    /* renamed from: e */
    public static final C14453jf f35407e = new C14453jf("ViewLightConverter");

    /* renamed from: f */
    public static int f35408f = 0;

    /* renamed from: a */
    public final C14772u7 f35409a;

    /* renamed from: b */
    public final C14417i6 f35410b;

    /* renamed from: c */
    public final int[] f35411c = new int[2];

    /* renamed from: d */
    public final C14829w8 f35412d = new C14829w8();

    public C14341fa(C14772u7 u7Var, C14417i6 i6Var) {
        this.f35409a = u7Var;
        this.f35410b = i6Var;
    }

    /* renamed from: a */
    public static float m61630a(View view) {
        Drawable background = view.getBackground();
        if (!(view instanceof ViewGroup) || !(background instanceof ColorDrawable)) {
            return 1.0f;
        }
        return view.getAlpha();
    }

    /* renamed from: d */
    public static void m61631d(Context context, C14507le leVar) {
    }

    /* renamed from: e */
    public static void m61632e(View view, C14507le leVar) {
        leVar.mo35871w(view.getVisibility() == 0);
        leVar.mo35858k(m61630a(view));
        if (view instanceof ViewGroup) {
            leVar.mo35862o(((ViewGroup) view).getClipChildren());
        }
    }

    /* renamed from: f */
    public static void m61633f(C14507le leVar, TextView textView) {
        leVar.mo35866s(textView.getText());
        leVar.mo35854f(textView.getError());
        leVar.mo35861n(textView.getHint());
        Editable editableText = textView.getEditableText();
        if (editableText != null) {
            leVar.mo35855g(editableText.toString());
        }
    }

    /* renamed from: b */
    public final C14507le mo35177b(int i, int i2, int i3, int i4, View view, int i5, int i6, boolean z) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        View view2 = view;
        C14507le f = C14507le.f35873y.mo35881f();
        f.mo35860m(mo35179g(view2));
        mo35178c(i, i2, i3, i4, view, i5, i6, f);
        m61632e(view2, f);
        boolean e = this.f35410b.mo35525e(view2, z);
        f.mo35867t(e);
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            if (viewGroup.getClipChildren()) {
                int F = f.mo35835F();
                i10 = F;
                i9 = f.mo35836G();
                i8 = f.mo35842M();
                i7 = f.mo35832C();
            } else {
                i10 = i;
                i9 = i2;
                i8 = i3;
                i7 = i4;
            }
            int childCount = viewGroup.getChildCount();
            int i13 = 0;
            while (i13 < childCount) {
                View childAt = viewGroup.getChildAt(i13);
                childAt.getLocationInWindow(this.f35411c);
                if (childAt.getVisibility() == 0) {
                    C14829w8 w8Var = this.f35412d;
                    int[] iArr = this.f35411c;
                    if (w8Var.mo36730e(iArr[0], iArr[1], childAt.getWidth(), childAt.getHeight(), i10, i9, i8, i7)) {
                        int[] iArr2 = this.f35411c;
                        i11 = i13;
                        i12 = childCount;
                        C14507le b = mo35177b(i10, i9, i8, i7, childAt, iArr2[0], iArr2[1], e);
                        b.mo35852d(f.mo35837H());
                        b.mo35865r(f.mo35872x().size());
                        f.mo35872x().add(b);
                        i13 = i11 + 1;
                        childCount = i12;
                    }
                }
                i11 = i13;
                i12 = childCount;
                i13 = i11 + 1;
                childCount = i12;
            }
        } else {
            f.mo35872x().clear();
            if (view2 instanceof TextView) {
                m61633f(f, (TextView) view2);
            }
        }
        return f;
    }

    /* renamed from: c */
    public final void mo35178c(int i, int i2, int i3, int i4, View view, int i5, int i6, C14507le leVar) {
        C14507le leVar2 = leVar;
        C14829w8.C14830a c = this.f35412d.mo36728c(i5, i6, view.getWidth(), view.getHeight(), i, i2, i3, i4);
        leVar2.mo35870v(c.f36772a.left);
        leVar2.mo35873y(c.f36772a.top);
        leVar2.mo35830A(c.f36772a.width());
        leVar2.mo35859l(c.f36772a.height());
        leVar2.mo35850b(c.f36773b);
    }

    /* renamed from: g */
    public final long mo35179g(View view) {
        return (long) this.f35409a.mo36565a(view);
    }

    /* renamed from: h */
    public C14507le mo35180h(View view) {
        view.getLocationInWindow(this.f35411c);
        int[] iArr = this.f35411c;
        int i = iArr[0];
        int i2 = iArr[1];
        int width = i + view.getWidth();
        int height = view.getHeight() + this.f35411c[1];
        int[] iArr2 = this.f35411c;
        C14507le b = mo35177b(i, i2, width, height, view, iArr2[0], iArr2[1], this.f35410b.mo35524d());
        m61631d(view.getContext(), b);
        return b;
    }
}
