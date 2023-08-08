package com.google.android.material.transition.platform;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.core.graphics.BlendModeCompat;
import androidx.core.graphics.C17584h;
import com.google.android.material.C31076a;
import com.google.android.material.internal.C31391c;
import com.google.android.material.shape.C31534o;
import com.google.android.material.shape.C31553s;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

@C0376v0(21)
/* renamed from: com.google.android.material.transition.platform.m */
public class C31804m extends SharedElementCallback {
    @C0363p0

    /* renamed from: f */
    public static WeakReference<View> f77580f;

    /* renamed from: a */
    public boolean f77581a = true;

    /* renamed from: b */
    public boolean f77582b = true;

    /* renamed from: c */
    public boolean f77583c = false;
    @C0363p0

    /* renamed from: d */
    public Rect f77584d;
    @C0363p0

    /* renamed from: e */
    public C31808d f77585e = new C31809e();

    /* renamed from: com.google.android.material.transition.platform.m$a */
    public class C31805a extends C31822u {

        /* renamed from: a */
        public final /* synthetic */ Window f77586a;

        public C31805a(Window window) {
            this.f77586a = window;
        }

        public void onTransitionEnd(Transition transition) {
            C31804m.m129016j(this.f77586a);
        }

        public void onTransitionStart(Transition transition) {
            C31804m.m129015i(this.f77586a);
        }
    }

    /* renamed from: com.google.android.material.transition.platform.m$b */
    public class C31806b extends C31822u {

        /* renamed from: a */
        public final /* synthetic */ Activity f77588a;

        public C31806b(Activity activity) {
            this.f77588a = activity;
        }

        public void onTransitionEnd(Transition transition) {
            View view;
            if (!(C31804m.f77580f == null || (view = (View) C31804m.f77580f.get()) == null)) {
                view.setAlpha(1.0f);
                WeakReference unused = C31804m.f77580f = null;
            }
            this.f77588a.finish();
            this.f77588a.overridePendingTransition(0, 0);
        }
    }

    /* renamed from: com.google.android.material.transition.platform.m$c */
    public class C31807c extends C31822u {

        /* renamed from: a */
        public final /* synthetic */ Window f77590a;

        public C31807c(Window window) {
            this.f77590a = window;
        }

        public void onTransitionStart(Transition transition) {
            C31804m.m129015i(this.f77590a);
        }
    }

    /* renamed from: com.google.android.material.transition.platform.m$d */
    public interface C31808d {
        @C0363p0
        /* renamed from: a */
        C31534o mo92288a(@C0359n0 View view);
    }

    /* renamed from: com.google.android.material.transition.platform.m$e */
    public static class C31809e implements C31808d {
        @C0363p0
        /* renamed from: a */
        public C31534o mo92288a(@C0359n0 View view) {
            if (view instanceof C31553s) {
                return ((C31553s) view).getShapeAppearanceModel();
            }
            return null;
        }
    }

    @C0363p0
    /* renamed from: f */
    public static Drawable m129014f(Window window) {
        return window.getDecorView().getBackground();
    }

    /* renamed from: i */
    public static void m129015i(Window window) {
        Drawable f = m129014f(window);
        if (f != null) {
            f.mutate().setColorFilter(C17584h.m80560a(0, BlendModeCompat.CLEAR));
        }
    }

    /* renamed from: j */
    public static void m129016j(Window window) {
        Drawable f = m129014f(window);
        if (f != null) {
            f.mutate().clearColorFilter();
        }
    }

    /* renamed from: p */
    public static void m129017p(Window window, C31793l lVar) {
        if (lVar.getDuration() >= 0) {
            window.setTransitionBackgroundFadeDuration(lVar.getDuration());
        }
    }

    @C0363p0
    /* renamed from: e */
    public C31808d mo92275e() {
        return this.f77585e;
    }

    /* renamed from: g */
    public boolean mo92276g() {
        return this.f77583c;
    }

    /* renamed from: h */
    public boolean mo92277h() {
        return this.f77582b;
    }

    /* renamed from: k */
    public void mo92278k(@C0363p0 C31808d dVar) {
        this.f77585e = dVar;
    }

    /* renamed from: l */
    public void mo92279l(boolean z) {
        this.f77583c = z;
    }

    /* renamed from: m */
    public void mo92280m(boolean z) {
        this.f77582b = z;
    }

    /* renamed from: n */
    public final void mo92281n(Window window) {
        Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
        if (sharedElementEnterTransition instanceof C31793l) {
            C31793l lVar = (C31793l) sharedElementEnterTransition;
            if (!this.f77583c) {
                window.setSharedElementReenterTransition((Transition) null);
            }
            if (this.f77582b) {
                m129017p(window, lVar);
                lVar.addListener(new C31805a(window));
            }
        }
    }

    /* renamed from: o */
    public final void mo92282o(Activity activity, Window window) {
        Transition sharedElementReturnTransition = window.getSharedElementReturnTransition();
        if (sharedElementReturnTransition instanceof C31793l) {
            C31793l lVar = (C31793l) sharedElementReturnTransition;
            lVar.mo92234k0(true);
            lVar.addListener(new C31806b(activity));
            if (this.f77582b) {
                m129017p(window, lVar);
                lVar.addListener(new C31807c(window));
            }
        }
    }

    @C0363p0
    public Parcelable onCaptureSharedElementSnapshot(@C0359n0 View view, @C0359n0 Matrix matrix, @C0359n0 RectF rectF) {
        f77580f = new WeakReference<>(view);
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    @C0363p0
    public View onCreateSnapshotView(@C0359n0 Context context, @C0363p0 Parcelable parcelable) {
        WeakReference<View> weakReference;
        View view;
        C31534o a;
        View onCreateSnapshotView = super.onCreateSnapshotView(context, parcelable);
        if (!(onCreateSnapshotView == null || (weakReference = f77580f) == null || this.f77585e == null || (view = weakReference.get()) == null || (a = this.f77585e.mo92288a(view)) == null)) {
            onCreateSnapshotView.setTag(C31076a.C31084h.mtrl_motion_snapshot_view, a);
        }
        return onCreateSnapshotView;
    }

    public void onMapSharedElements(@C0359n0 List<String> list, @C0359n0 Map<String, View> map) {
        View view;
        Activity a;
        if (!list.isEmpty() && !map.isEmpty() && (view = map.get(list.get(0))) != null && (a = C31391c.m126854a(view.getContext())) != null) {
            Window window = a.getWindow();
            if (this.f77581a) {
                mo92281n(window);
            } else {
                mo92282o(a, window);
            }
        }
    }

    public void onSharedElementEnd(@C0359n0 List<String> list, @C0359n0 List<View> list2, @C0359n0 List<View> list3) {
        if (!list2.isEmpty()) {
            int i = C31076a.C31084h.mtrl_motion_snapshot_view;
            if (list2.get(0).getTag(i) instanceof View) {
                list2.get(0).setTag(i, (Object) null);
            }
        }
        if (!this.f77581a && !list2.isEmpty()) {
            this.f77584d = C31823v.m129117i(list2.get(0));
        }
        this.f77581a = false;
    }

    public void onSharedElementStart(@C0359n0 List<String> list, @C0359n0 List<View> list2, @C0359n0 List<View> list3) {
        if (!list2.isEmpty() && !list3.isEmpty()) {
            list2.get(0).setTag(C31076a.C31084h.mtrl_motion_snapshot_view, list3.get(0));
        }
        if (!this.f77581a && !list2.isEmpty() && this.f77584d != null) {
            View view = list2.get(0);
            view.measure(View.MeasureSpec.makeMeasureSpec(this.f77584d.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f77584d.height(), 1073741824));
            Rect rect = this.f77584d;
            view.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }
}
