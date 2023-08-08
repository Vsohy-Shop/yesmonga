package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C20207r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.google.android.material.datepicker.n */
public class C31321n extends LinearLayoutManager {

    /* renamed from: d1 */
    public static final float f75489d1 = 100.0f;

    /* renamed from: com.google.android.material.datepicker.n$a */
    public class C31322a extends C20207r {
        public C31322a(Context context) {
            super(context);
        }

        /* renamed from: w */
        public float mo60285w(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    public C31321n(Context context, int i, boolean z) {
        super(context, i, z);
    }

    /* renamed from: f2 */
    public void mo59403f2(RecyclerView recyclerView, RecyclerView.C20055b0 b0Var, int i) {
        C31322a aVar = new C31322a(recyclerView.getContext());
        aVar.mo59709q(i);
        mo59941g2(aVar);
    }
}
