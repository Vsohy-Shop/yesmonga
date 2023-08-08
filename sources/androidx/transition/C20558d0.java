package androidx.transition;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0347i0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.transition.C20538b0;

/* renamed from: androidx.transition.d0 */
public class C20558d0 {

    /* renamed from: a */
    public Context f52997a;

    /* renamed from: b */
    public int f52998b;

    /* renamed from: c */
    public ViewGroup f52999c;

    /* renamed from: d */
    public View f53000d;

    /* renamed from: e */
    public Runnable f53001e;

    /* renamed from: f */
    public Runnable f53002f;

    public C20558d0(@C0359n0 ViewGroup viewGroup) {
        this.f52998b = -1;
        this.f52999c = viewGroup;
    }

    @C0363p0
    /* renamed from: c */
    public static C20558d0 m95700c(@C0359n0 ViewGroup viewGroup) {
        return (C20558d0) viewGroup.getTag(C20538b0.C20545g.transition_current_scene);
    }

    @C0359n0
    /* renamed from: d */
    public static C20558d0 m95701d(@C0359n0 ViewGroup viewGroup, @C0347i0 int i, @C0359n0 Context context) {
        int i2 = C20538b0.C20545g.transition_scene_layoutid_cache;
        SparseArray sparseArray = (SparseArray) viewGroup.getTag(i2);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            viewGroup.setTag(i2, sparseArray);
        }
        C20558d0 d0Var = (C20558d0) sparseArray.get(i);
        if (d0Var != null) {
            return d0Var;
        }
        C20558d0 d0Var2 = new C20558d0(viewGroup, i, context);
        sparseArray.put(i, d0Var2);
        return d0Var2;
    }

    /* renamed from: g */
    public static void m95702g(@C0359n0 ViewGroup viewGroup, @C0363p0 C20558d0 d0Var) {
        viewGroup.setTag(C20538b0.C20545g.transition_current_scene, d0Var);
    }

    /* renamed from: a */
    public void mo61624a() {
        if (this.f52998b > 0 || this.f53000d != null) {
            mo61626e().removeAllViews();
            if (this.f52998b > 0) {
                LayoutInflater.from(this.f52997a).inflate(this.f52998b, this.f52999c);
            } else {
                this.f52999c.addView(this.f53000d);
            }
        }
        Runnable runnable = this.f53001e;
        if (runnable != null) {
            runnable.run();
        }
        m95702g(this.f52999c, this);
    }

    /* renamed from: b */
    public void mo61625b() {
        Runnable runnable;
        if (m95700c(this.f52999c) == this && (runnable = this.f53002f) != null) {
            runnable.run();
        }
    }

    @C0359n0
    /* renamed from: e */
    public ViewGroup mo61626e() {
        return this.f52999c;
    }

    /* renamed from: f */
    public boolean mo61627f() {
        return this.f52998b > 0;
    }

    /* renamed from: h */
    public void mo61628h(@C0363p0 Runnable runnable) {
        this.f53001e = runnable;
    }

    /* renamed from: i */
    public void mo61629i(@C0363p0 Runnable runnable) {
        this.f53002f = runnable;
    }

    public C20558d0(ViewGroup viewGroup, int i, Context context) {
        this.f52997a = context;
        this.f52999c = viewGroup;
        this.f52998b = i;
    }

    public C20558d0(@C0359n0 ViewGroup viewGroup, @C0359n0 View view) {
        this.f52998b = -1;
        this.f52999c = viewGroup;
        this.f53000d = view;
    }
}
