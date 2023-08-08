package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C20123e0;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.f0 */
public abstract class C20127f0<T2> extends C20123e0.C20125b<T2> {

    /* renamed from: a */
    public final RecyclerView.Adapter f51802a;

    public C20127f0(RecyclerView.Adapter adapter) {
        this.f51802a = adapter;
    }

    /* renamed from: a */
    public void mo60230a(int i, int i2) {
        this.f51802a.notifyItemRangeInserted(i, i2);
    }

    /* renamed from: b */
    public void mo60231b(int i, int i2) {
        this.f51802a.notifyItemRangeRemoved(i, i2);
    }

    /* renamed from: c */
    public void mo60232c(int i, int i2, Object obj) {
        this.f51802a.notifyItemRangeChanged(i, i2, obj);
    }

    /* renamed from: d */
    public void mo60233d(int i, int i2) {
        this.f51802a.notifyItemMoved(i, i2);
    }

    /* renamed from: h */
    public void mo60354h(int i, int i2) {
        this.f51802a.notifyItemRangeChanged(i, i2);
    }
}
