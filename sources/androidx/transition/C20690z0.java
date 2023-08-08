package androidx.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.core.view.C18196h2;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: androidx.transition.z0 */
public class C20690z0 implements C20551b1 {

    /* renamed from: a */
    public C20691a f53362a;

    /* renamed from: androidx.transition.z0$a */
    public static class C20691a extends ViewGroup {

        /* renamed from: f */
        public static Method f53363f;

        /* renamed from: a */
        public ViewGroup f53364a;

        /* renamed from: b */
        public View f53365b;

        /* renamed from: c */
        public ArrayList<Drawable> f53366c = null;

        /* renamed from: d */
        public C20690z0 f53367d;

        /* renamed from: e */
        public boolean f53368e;

        static {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Class cls2 = Integer.TYPE;
                f53363f = cls.getDeclaredMethod("invalidateChildInParentFast", new Class[]{cls2, cls2, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        public C20691a(Context context, ViewGroup viewGroup, View view, C20690z0 z0Var) {
            super(context);
            this.f53364a = viewGroup;
            this.f53365b = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f53367d = z0Var;
        }

        /* renamed from: a */
        public void mo61935a(Drawable drawable) {
            mo61937c();
            if (this.f53366c == null) {
                this.f53366c = new ArrayList<>();
            }
            if (!this.f53366c.contains(drawable)) {
                this.f53366c.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* renamed from: b */
        public void mo61936b(View view) {
            mo61937c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f53364a || viewGroup.getParent() == null || !C18196h2.m82521O0(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f53364a.getLocationOnScreen(iArr2);
                    C18196h2.m82574e1(view, iArr[0] - iArr2[0]);
                    C18196h2.m82578f1(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        /* renamed from: c */
        public final void mo61937c() {
            if (this.f53368e) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        /* renamed from: d */
        public final void mo61938d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f53366c;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f53368e = true;
                    this.f53364a.removeView(this);
                }
            }
        }

        public void dispatchDraw(Canvas canvas) {
            int i;
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f53364a.getLocationOnScreen(iArr);
            this.f53365b.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f53365b.getWidth(), this.f53365b.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f53366c;
            if (arrayList == null) {
                i = 0;
            } else {
                i = arrayList.size();
            }
            for (int i2 = 0; i2 < i; i2++) {
                this.f53366c.get(i2).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: e */
        public final void mo61941e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f53364a.getLocationOnScreen(iArr2);
            this.f53365b.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: f */
        public ViewParent mo61942f(int i, int i2, Rect rect) {
            if (this.f53364a == null || f53363f == null) {
                return null;
            }
            try {
                mo61941e(new int[2]);
                f53363f.invoke(this.f53364a, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), rect});
                return null;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
                return null;
            }
        }

        /* renamed from: g */
        public void mo61943g(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f53366c;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback((Drawable.Callback) null);
                mo61938d();
            }
        }

        /* renamed from: h */
        public void mo61944h(View view) {
            super.removeView(view);
            mo61938d();
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f53364a == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f53364a != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                mo61941e(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }

        public void invalidateDrawable(@C0359n0 Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r1.f53366c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean verifyDrawable(@androidx.annotation.C0359n0 android.graphics.drawable.Drawable r2) {
            /*
                r1 = this;
                boolean r0 = super.verifyDrawable(r2)
                if (r0 != 0) goto L_0x0013
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.f53366c
                if (r0 == 0) goto L_0x0011
                boolean r2 = r0.contains(r2)
                if (r2 == 0) goto L_0x0011
                goto L_0x0013
            L_0x0011:
                r2 = 0
                goto L_0x0014
            L_0x0013:
                r2 = 1
            L_0x0014:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C20690z0.C20691a.verifyDrawable(android.graphics.drawable.Drawable):boolean");
        }
    }

    public C20690z0(Context context, ViewGroup viewGroup, View view) {
        this.f53362a = new C20691a(context, viewGroup, view, this);
    }

    /* renamed from: e */
    public static C20690z0 m96158e(View view) {
        ViewGroup f = m96159f(view);
        if (f == null) {
            return null;
        }
        int childCount = f.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = f.getChildAt(i);
            if (childAt instanceof C20691a) {
                return ((C20691a) childAt).f53367d;
            }
        }
        return new C20672s0(f.getContext(), f, view);
    }

    /* renamed from: f */
    public static ViewGroup m96159f(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo61604a(@C0359n0 Drawable drawable) {
        this.f53362a.mo61935a(drawable);
    }

    /* renamed from: b */
    public void mo61605b(@C0359n0 Drawable drawable) {
        this.f53362a.mo61943g(drawable);
    }
}
