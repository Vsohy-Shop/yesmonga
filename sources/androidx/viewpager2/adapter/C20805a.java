package androidx.viewpager2.adapter;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.core.view.C18196h2;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.viewpager2.adapter.a */
public final class C20805a extends RecyclerView.C20061e0 {
    public C20805a(@C0359n0 FrameLayout frameLayout) {
        super(frameLayout);
    }

    @C0359n0
    /* renamed from: c */
    public static C20805a m96600c(@C0359n0 ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(C18196h2.m82480D());
        frameLayout.setSaveEnabled(false);
        return new C20805a(frameLayout);
    }

    @C0359n0
    /* renamed from: d */
    public FrameLayout mo62444d() {
        return (FrameLayout) this.itemView;
    }
}
