package androidx.compose.p004ui.viewinterop;

import android.view.View;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.nestedscroll.C15448b;
import androidx.compose.p004ui.layout.C15591p;
import androidx.compose.p004ui.node.LayoutNode;
import kotlin.math.C11409d;

/* renamed from: androidx.compose.ui.viewinterop.c */
public final class C16523c {

    /* renamed from: a */
    public static final int f40972a = Integer.MIN_VALUE;

    /* renamed from: e */
    public static final void m74854e(View view, LayoutNode layoutNode) {
        long f = C15591p.m69304f(layoutNode.mo44460v());
        int L0 = C11409d.m43851L0(C15094f.m64880p(f));
        int L02 = C11409d.m43851L0(C15094f.m64882r(f));
        view.layout(L0, L02, view.getMeasuredWidth() + L0, view.getMeasuredHeight() + L02);
    }

    /* renamed from: f */
    public static final float m74855f(int i) {
        return ((float) i) * ((float) -1);
    }

    /* renamed from: g */
    public static final float m74856g(float f) {
        return f * -1.0f;
    }

    /* renamed from: h */
    public static final int m74857h(int i) {
        if (i == 0) {
            return C15448b.f38435b.mo43964a();
        }
        return C15448b.f38435b.mo43965b();
    }
}
