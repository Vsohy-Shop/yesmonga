package androidx.recyclerview.widget;

import androidx.annotation.C0359n0;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.b */
public final class C20104b implements C20211u {
    @C0359n0

    /* renamed from: a */
    public final RecyclerView.Adapter f51709a;

    public C20104b(@C0359n0 RecyclerView.Adapter adapter) {
        this.f51709a = adapter;
    }

    /* renamed from: a */
    public void mo60230a(int i, int i2) {
        this.f51709a.notifyItemRangeInserted(i, i2);
    }

    /* renamed from: b */
    public void mo60231b(int i, int i2) {
        this.f51709a.notifyItemRangeRemoved(i, i2);
    }

    /* renamed from: c */
    public void mo60232c(int i, int i2, Object obj) {
        this.f51709a.notifyItemRangeChanged(i, i2, obj);
    }

    /* renamed from: d */
    public void mo60233d(int i, int i2) {
        this.f51709a.notifyItemMoved(i, i2);
    }
}
