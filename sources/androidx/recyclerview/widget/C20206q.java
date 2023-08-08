package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: androidx.recyclerview.widget.q */
public class C20206q {

    /* renamed from: j */
    public static final int f52132j = -1;

    /* renamed from: k */
    public static final int f52133k = 1;

    /* renamed from: l */
    public static final int f52134l = Integer.MIN_VALUE;

    /* renamed from: m */
    public static final int f52135m = -1;

    /* renamed from: n */
    public static final int f52136n = 1;

    /* renamed from: a */
    public boolean f52137a = true;

    /* renamed from: b */
    public int f52138b;

    /* renamed from: c */
    public int f52139c;

    /* renamed from: d */
    public int f52140d;

    /* renamed from: e */
    public int f52141e;

    /* renamed from: f */
    public int f52142f = 0;

    /* renamed from: g */
    public int f52143g = 0;

    /* renamed from: h */
    public boolean f52144h;

    /* renamed from: i */
    public boolean f52145i;

    /* renamed from: a */
    public boolean mo60648a(RecyclerView.C20055b0 b0Var) {
        int i = this.f52139c;
        return i >= 0 && i < b0Var.mo59729d();
    }

    /* renamed from: b */
    public View mo60649b(RecyclerView.C20089w wVar) {
        View p = wVar.mo60049p(this.f52139c);
        this.f52139c += this.f52140d;
        return p;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f52138b + ", mCurrentPosition=" + this.f52139c + ", mItemDirection=" + this.f52140d + ", mLayoutDirection=" + this.f52141e + ", mStartLine=" + this.f52142f + ", mEndLine=" + this.f52143g + C12361b.f30259j;
    }
}
