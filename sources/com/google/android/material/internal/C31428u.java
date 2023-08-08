package com.google.android.material.internal;

import android.annotation.SuppressLint;
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

/* renamed from: com.google.android.material.internal.u */
public class C31428u implements C31431w {

    /* renamed from: a */
    public C31429a f75966a;

    @SuppressLint({"ViewConstructor", "PrivateApi"})
    /* renamed from: com.google.android.material.internal.u$a */
    public static class C31429a extends ViewGroup {

        /* renamed from: f */
        public static Method f75967f;

        /* renamed from: a */
        public ViewGroup f75968a;

        /* renamed from: b */
        public View f75969b;

        /* renamed from: c */
        public ArrayList<Drawable> f75970c = null;

        /* renamed from: d */
        public C31428u f75971d;

        /* renamed from: e */
        public boolean f75972e;

        static {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Class cls2 = Integer.TYPE;
                f75967f = cls.getDeclaredMethod("invalidateChildInParentFast", new Class[]{cls2, cls2, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        public C31429a(Context context, ViewGroup viewGroup, View view, C31428u uVar) {
            super(context);
            this.f75968a = viewGroup;
            this.f75969b = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f75971d = uVar;
        }

        /* renamed from: a */
        public void mo90182a(Drawable drawable) {
            mo90184c();
            if (this.f75970c == null) {
                this.f75970c = new ArrayList<>();
            }
            if (!this.f75970c.contains(drawable)) {
                this.f75970c.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* renamed from: b */
        public void mo90183b(View view) {
            mo90184c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f75968a || viewGroup.getParent() == null || !C18196h2.m82521O0(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f75968a.getLocationOnScreen(iArr2);
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
        public final void mo90184c() {
            if (this.f75972e) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        /* renamed from: d */
        public final void mo90185d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f75970c;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f75972e = true;
                    this.f75968a.removeView(this);
                }
            }
        }

        public void dispatchDraw(Canvas canvas) {
            int i;
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f75968a.getLocationOnScreen(iArr);
            this.f75969b.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f75969b.getWidth(), this.f75969b.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f75970c;
            if (arrayList == null) {
                i = 0;
            } else {
                i = arrayList.size();
            }
            for (int i2 = 0; i2 < i; i2++) {
                this.f75970c.get(i2).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: e */
        public final void mo90188e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f75968a.getLocationOnScreen(iArr2);
            this.f75969b.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: f */
        public ViewParent mo90189f(int i, int i2, Rect rect) {
            if (this.f75968a == null || f75967f == null) {
                return null;
            }
            try {
                mo90188e(new int[2]);
                f75967f.invoke(this.f75968a, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), rect});
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
        public void mo90190g(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f75970c;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback((Drawable.Callback) null);
                mo90185d();
            }
        }

        /* renamed from: h */
        public void mo90191h(View view) {
            super.removeView(view);
            mo90185d();
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f75968a == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f75968a != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                mo90188e(iArr2);
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
            r0 = r1.f75970c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean verifyDrawable(@androidx.annotation.C0359n0 android.graphics.drawable.Drawable r2) {
            /*
                r1 = this;
                boolean r0 = super.verifyDrawable(r2)
                if (r0 != 0) goto L_0x0013
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.f75970c
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.C31428u.C31429a.verifyDrawable(android.graphics.drawable.Drawable):boolean");
        }
    }

    public C31428u(Context context, ViewGroup viewGroup, View view) {
        this.f75966a = new C31429a(context, viewGroup, view, this);
    }

    /* renamed from: e */
    public static C31428u m126991e(View view) {
        ViewGroup g = C31432x.m127012g(view);
        if (g == null) {
            return null;
        }
        int childCount = g.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = g.getChildAt(i);
            if (childAt instanceof C31429a) {
                return ((C31429a) childAt).f75971d;
            }
        }
        return new C31425r(g.getContext(), g, view);
    }

    /* renamed from: a */
    public void mo90180a(@C0359n0 Drawable drawable) {
        this.f75966a.mo90182a(drawable);
    }

    /* renamed from: b */
    public void mo90181b(@C0359n0 Drawable drawable) {
        this.f75966a.mo90190g(drawable);
    }
}
