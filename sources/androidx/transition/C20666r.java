package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.view.C18196h2;
import androidx.transition.C20538b0;

@SuppressLint({"ViewConstructor"})
/* renamed from: androidx.transition.r */
public class C20666r extends ViewGroup implements C20652o {

    /* renamed from: a */
    public ViewGroup f53320a;

    /* renamed from: b */
    public View f53321b;

    /* renamed from: c */
    public final View f53322c;

    /* renamed from: d */
    public int f53323d;
    @C0363p0

    /* renamed from: e */
    public Matrix f53324e;

    /* renamed from: f */
    public final ViewTreeObserver.OnPreDrawListener f53325f = new C20667a();

    /* renamed from: androidx.transition.r$a */
    public class C20667a implements ViewTreeObserver.OnPreDrawListener {
        public C20667a() {
        }

        public boolean onPreDraw() {
            View view;
            C18196h2.m82610n1(C20666r.this);
            C20666r rVar = C20666r.this;
            ViewGroup viewGroup = rVar.f53320a;
            if (viewGroup == null || (view = rVar.f53321b) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            C18196h2.m82610n1(C20666r.this.f53320a);
            C20666r rVar2 = C20666r.this;
            rVar2.f53320a = null;
            rVar2.f53321b = null;
            return true;
        }
    }

    public C20666r(View view) {
        super(view.getContext());
        this.f53322c = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, (Paint) null);
    }

    /* renamed from: b */
    public static C20666r m96112b(View view, ViewGroup viewGroup, Matrix matrix) {
        int i;
        C20656p pVar;
        if (view.getParent() instanceof ViewGroup) {
            C20656p b = C20656p.m96069b(viewGroup);
            C20666r e = m96115e(view);
            if (e == null || (pVar = (C20656p) e.getParent()) == b) {
                i = 0;
            } else {
                i = e.f53323d;
                pVar.removeView(e);
                e = null;
            }
            if (e == null) {
                if (matrix == null) {
                    matrix = new Matrix();
                    m96113c(view, viewGroup, matrix);
                }
                e = new C20666r(view);
                e.mo61881h(matrix);
                if (b == null) {
                    b = new C20656p(viewGroup);
                } else {
                    b.mo61859g();
                }
                m96114d(viewGroup, b);
                m96114d(viewGroup, e);
                b.mo61857a(e);
                e.f53323d = i;
            } else if (matrix != null) {
                e.mo61881h(matrix);
            }
            e.f53323d++;
            return e;
        }
        throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
    }

    /* renamed from: c */
    public static void m96113c(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        C20554c1.m95693j(viewGroup2, matrix);
        matrix.preTranslate((float) (-viewGroup2.getScrollX()), (float) (-viewGroup2.getScrollY()));
        C20554c1.m95694k(viewGroup, matrix);
    }

    /* renamed from: d */
    public static void m96114d(View view, View view2) {
        C20554c1.m95690g(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    /* renamed from: e */
    public static C20666r m96115e(View view) {
        return (C20666r) view.getTag(C20538b0.C20545g.ghost_view);
    }

    /* renamed from: f */
    public static void m96116f(View view) {
        C20666r e = m96115e(view);
        if (e != null) {
            int i = e.f53323d - 1;
            e.f53323d = i;
            if (i <= 0) {
                ((C20656p) e.getParent()).removeView(e);
            }
        }
    }

    /* renamed from: g */
    public static void m96117g(@C0359n0 View view, @C0363p0 C20666r rVar) {
        view.setTag(C20538b0.C20545g.ghost_view, rVar);
    }

    /* renamed from: a */
    public void mo61852a(ViewGroup viewGroup, View view) {
        this.f53320a = viewGroup;
        this.f53321b = view;
    }

    /* renamed from: h */
    public void mo61881h(@C0359n0 Matrix matrix) {
        this.f53324e = matrix;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m96117g(this.f53322c, this);
        this.f53322c.getViewTreeObserver().addOnPreDrawListener(this.f53325f);
        C20554c1.m95692i(this.f53322c, 4);
        if (this.f53322c.getParent() != null) {
            ((View) this.f53322c.getParent()).invalidate();
        }
    }

    public void onDetachedFromWindow() {
        this.f53322c.getViewTreeObserver().removeOnPreDrawListener(this.f53325f);
        C20554c1.m95692i(this.f53322c, 0);
        m96117g(this.f53322c, (C20666r) null);
        if (this.f53322c.getParent() != null) {
            ((View) this.f53322c.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        C20557d.m95699a(canvas, true);
        canvas.setMatrix(this.f53324e);
        C20554c1.m95692i(this.f53322c, 0);
        this.f53322c.invalidate();
        C20554c1.m95692i(this.f53322c, 4);
        drawChild(canvas, this.f53322c, getDrawingTime());
        C20557d.m95699a(canvas, false);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void setVisibility(int i) {
        int i2;
        super.setVisibility(i);
        if (m96115e(this.f53322c) == this) {
            if (i == 0) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            C20554c1.m95692i(this.f53322c, i2);
        }
    }
}
