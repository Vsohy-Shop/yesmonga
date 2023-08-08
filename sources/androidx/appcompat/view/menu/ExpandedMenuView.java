package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.C0568g;
import androidx.appcompat.widget.C0722h1;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class ExpandedMenuView extends ListView implements C0568g.C0570b, C0587o, AdapterView.OnItemClickListener {

    /* renamed from: c */
    public static final int[] f1492c = {16842964, 16843049};

    /* renamed from: a */
    public C0568g f1493a;

    /* renamed from: b */
    public int f1494b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    /* renamed from: b */
    public boolean mo1857b(C0573j jVar) {
        return this.f1493a.mo2027O(jVar, 0);
    }

    /* renamed from: c */
    public void mo1858c(C0568g gVar) {
        this.f1493a = gVar;
    }

    public int getWindowAnimations() {
        return this.f1494b;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo1857b((C0573j) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0722h1 G = C0722h1.m3539G(context, attributeSet, f1492c, i, 0);
        if (G.mo3455C(0)) {
            setBackgroundDrawable(G.mo3466h(0));
        }
        if (G.mo3455C(1)) {
            setDivider(G.mo3466h(1));
        }
        G.mo3458I();
    }
}
