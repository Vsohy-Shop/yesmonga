package com.google.android.material.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.d */
public class C31392d {

    /* renamed from: a */
    public static final ThreadLocal<Matrix> f75888a = new ThreadLocal<>();

    /* renamed from: b */
    public static final ThreadLocal<RectF> f75889b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m126855a(@C0359n0 ViewGroup viewGroup, @C0359n0 View view, @C0359n0 Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m126857c(viewGroup, view, rect);
    }

    /* renamed from: b */
    public static void m126856b(ViewParent viewParent, @C0359n0 View view, @C0359n0 Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m126856b(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }

    /* renamed from: c */
    public static void m126857c(@C0359n0 ViewGroup viewGroup, @C0359n0 View view, @C0359n0 Rect rect) {
        ThreadLocal<Matrix> threadLocal = f75888a;
        Matrix matrix = threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        m126856b(viewGroup, view, matrix);
        ThreadLocal<RectF> threadLocal2 = f75889b;
        RectF rectF = threadLocal2.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
