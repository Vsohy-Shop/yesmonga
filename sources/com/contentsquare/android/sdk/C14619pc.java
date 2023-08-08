package com.contentsquare.android.sdk;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.util.C17994n;
import com.contentsquare.android.sdk.C14829w8;
import com.contentsquare.android.sdk.C14893yb;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.contentsquare.android.sdk.pc */
public class C14619pc implements C14893yb {

    /* renamed from: a */
    public final C14709se f36193a;

    /* renamed from: b */
    public final C14438j2 f36194b;

    /* renamed from: c */
    public final List<C17994n<Bitmap, int[]>> f36195c;

    /* renamed from: d */
    public int f36196d = 0;

    /* renamed from: e */
    public final C14453jf f36197e = new C14453jf("ViewBitmapProviderPixelCopy");

    /* renamed from: com.contentsquare.android.sdk.pc$a */
    public static class C14620a implements C14893yb.C14895b {

        /* renamed from: c */
        public static final Bitmap f36198c = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);

        /* renamed from: a */
        public final Bitmap f36199a;

        /* renamed from: b */
        public final C14829w8 f36200b = new C14829w8();

        public C14620a(Bitmap bitmap) {
            this.f36199a = bitmap;
        }

        /* renamed from: e */
        public static ByteArrayOutputStream m62969e(Bitmap bitmap) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
            return byteArrayOutputStream;
        }

        /* renamed from: a */
        public boolean mo35539a() {
            return true;
        }

        /* renamed from: b */
        public String mo35540b(View view) {
            return C14696s4.m63370b(this.f36199a);
        }

        /* renamed from: c */
        public String mo35541c(View view) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            if (this.f36200b.mo36729d(view.getWidth(), view.getHeight())) {
                if (this.f36200b.mo36730e(i, i2, view.getWidth(), view.getHeight(), 0, 0, this.f36199a.getWidth(), this.f36199a.getHeight())) {
                    return C14696s4.m63371c(m62969e(mo36165d(i, i2, view)).toByteArray());
                }
            }
            return C14696s4.m63371c(m62969e(f36198c).toByteArray());
        }

        /* renamed from: d */
        public final Bitmap mo36165d(int i, int i2, View view) {
            C14829w8.C14830a c = this.f36200b.mo36728c(i, i2, view.getWidth(), view.getHeight(), 0, 0, this.f36199a.getWidth(), this.f36199a.getHeight());
            if (c.f36773b == 0.0f) {
                return Bitmap.createBitmap(this.f36199a, i, i2, view.getWidth(), view.getHeight());
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            Bitmap bitmap = this.f36199a;
            Rect rect = c.f36772a;
            Bitmap createBitmap2 = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), c.f36772a.height());
            C14829w8 w8Var = this.f36200b;
            Rect rect2 = c.f36772a;
            Point b = w8Var.mo36727b(rect2.left, rect2.top, i, i2);
            new Canvas(createBitmap).drawBitmap(createBitmap2, (float) b.x, (float) b.y, (Paint) null);
            return createBitmap;
        }
    }

    public C14619pc(C14438j2 j2Var, C14709se seVar) {
        this.f36194b = j2Var;
        this.f36193a = seVar;
        this.f36195c = new ArrayList();
    }

    /* renamed from: d */
    public static C17994n<Window, View> m62959d(C14709se seVar) {
        Window window;
        Activity a = seVar.mo36415a();
        if (a == null || (window = a.getWindow()) == null) {
            return null;
        }
        return new C17994n<>(window, window.getDecorView());
    }

    /* renamed from: f */
    public static List<SurfaceView> m62960f(Window window) {
        View decorView = window.getDecorView();
        ArrayList arrayList = new ArrayList();
        m62963i(decorView, arrayList);
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m62961g(Bitmap bitmap, C17994n nVar, C14893yb.C14894a aVar, int i) {
        if (i == 0) {
            this.f36195c.add(new C17994n(bitmap, new int[2]));
            List<SurfaceView> f = m62960f((Window) nVar.f46482a);
            if (f.isEmpty()) {
                mo36164l(this.f36195c, aVar);
                return;
            }
            for (SurfaceView j : f) {
                mo36162j(aVar, j);
            }
            return;
        }
        aVar.mo34718d("Capture window failed: " + mo36161e(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m62962h(SurfaceView surfaceView, Bitmap bitmap, C14893yb.C14894a aVar, int i) {
        if (i == 0) {
            C14453jf jfVar = this.f36197e;
            jfVar.mo35676e("Successful captured SurfaceView: " + surfaceView);
            int[] iArr = new int[2];
            surfaceView.getLocationInWindow(iArr);
            this.f36195c.add(new C17994n(bitmap, iArr));
        } else {
            C14453jf jfVar2 = this.f36197e;
            jfVar2.mo35681l("Child SurfaceView capture failed: " + mo36161e(i), new Object[0]);
            this.f36196d = this.f36196d + -1;
        }
        if (this.f36195c.size() == this.f36196d) {
            mo36164l(this.f36195c, aVar);
        }
    }

    /* renamed from: i */
    public static void m62963i(View view, List<SurfaceView> list) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (!(childAt instanceof SurfaceView) || childAt.getWidth() <= 0 || childAt.getHeight() <= 0) {
                    m62963i(childAt, list);
                } else {
                    list.add((SurfaceView) childAt);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo35538a(C14893yb.C14894a aVar) {
        C17994n<Window, View> d = m62959d(this.f36193a);
        if (d == null || d.f46482a == null || d.f46483b == null) {
            aVar.mo34718d("window or decorView is null");
        } else {
            mo36163k(aVar, d);
        }
    }

    /* renamed from: e */
    public final String mo36161e(int i) {
        return i == 2 ? "Error timeout" : i == 3 ? "Error source no data" : i == 4 ? "Error source invalid" : i == 5 ? "Error destination invalid" : "Error Unknown";
    }

    /* renamed from: j */
    public final void mo36162j(C14893yb.C14894a aVar, SurfaceView surfaceView) {
        C14453jf jfVar = this.f36197e;
        jfVar.mo35676e("Start capturing SurfaceView: " + surfaceView);
        Bitmap createBitmap = Bitmap.createBitmap(surfaceView.getWidth(), surfaceView.getHeight(), Bitmap.Config.ARGB_8888);
        this.f36196d = this.f36196d + 1;
        this.f36194b.mo35583a(surfaceView, createBitmap, new C14598oc(this, surfaceView, createBitmap, aVar), surfaceView.getHandler());
    }

    /* renamed from: k */
    public final void mo36163k(C14893yb.C14894a aVar, C17994n<Window, View> nVar) {
        Bitmap createBitmap = Bitmap.createBitmap(((View) nVar.f46483b).getWidth(), ((View) nVar.f46483b).getHeight(), Bitmap.Config.ARGB_8888);
        this.f36196d++;
        this.f36194b.mo35584b((Window) nVar.f46482a, createBitmap, new C14551nc(this, createBitmap, nVar, aVar), ((View) nVar.f46483b).getHandler());
    }

    /* renamed from: l */
    public final void mo36164l(List<C17994n<Bitmap, int[]>> list, C14893yb.C14894a aVar) {
        Bitmap bitmap = (Bitmap) list.get(0).f46482a;
        for (int i = 1; i < list.size(); i++) {
            C14520m5.m62603a(bitmap, (Bitmap) list.get(i).f46482a, (float) ((int[]) list.get(i).f46483b)[0], (float) ((int[]) list.get(i).f46483b)[1]);
        }
        aVar.mo34717a(new C14620a(bitmap));
    }
}
