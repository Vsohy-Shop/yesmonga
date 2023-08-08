package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import androidx.core.view.C18196h2;
import androidx.recyclerview.C20030a;

/* renamed from: androidx.recyclerview.widget.p */
public class C20205p implements C20204o {

    /* renamed from: a */
    public static final C20204o f52131a = new C20205p();

    /* renamed from: e */
    public static float m94498e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != view) {
                float R = C18196h2.m82529R(childAt);
                if (R > f) {
                    f = R;
                }
            }
        }
        return f;
    }

    /* renamed from: a */
    public void mo60644a(View view) {
        int i = C20030a.C20035e.item_touch_helper_previous_elevation;
        Object tag = view.getTag(i);
        if (tag instanceof Float) {
            C18196h2.m82519N1(view, ((Float) tag).floatValue());
        }
        view.setTag(i, (Object) null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    /* renamed from: b */
    public void mo60645b(View view) {
    }

    /* renamed from: c */
    public void mo60646c(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
        if (z) {
            int i2 = C20030a.C20035e.item_touch_helper_previous_elevation;
            if (view.getTag(i2) == null) {
                Float valueOf = Float.valueOf(C18196h2.m82529R(view));
                C18196h2.m82519N1(view, m94498e(recyclerView, view) + 1.0f);
                view.setTag(i2, valueOf);
            }
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    /* renamed from: d */
    public void mo60647d(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
    }
}
