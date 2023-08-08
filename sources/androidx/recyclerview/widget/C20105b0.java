package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.b0 */
public class C20105b0 {
    /* renamed from: a */
    public static int m94002a(RecyclerView.C20055b0 b0Var, C20224y yVar, View view, View view2, RecyclerView.C20076o oVar, boolean z) {
        if (oVar.mo59922Y() == 0 || b0Var.mo59729d() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(oVar.mo59978u0(view) - oVar.mo59978u0(view2)) + 1;
        }
        return Math.min(yVar.mo60706o(), yVar.mo60695d(view2) - yVar.mo60698g(view));
    }

    /* renamed from: b */
    public static int m94003b(RecyclerView.C20055b0 b0Var, C20224y yVar, View view, View view2, RecyclerView.C20076o oVar, boolean z, boolean z2) {
        int i;
        if (oVar.mo59922Y() == 0 || b0Var.mo59729d() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(oVar.mo59978u0(view), oVar.mo59978u0(view2));
        int max = Math.max(oVar.mo59978u0(view), oVar.mo59978u0(view2));
        if (z2) {
            i = Math.max(0, (b0Var.mo59729d() - max) - 1);
        } else {
            i = Math.max(0, min);
        }
        if (!z) {
            return i;
        }
        return Math.round((((float) i) * (((float) Math.abs(yVar.mo60695d(view2) - yVar.mo60698g(view))) / ((float) (Math.abs(oVar.mo59978u0(view) - oVar.mo59978u0(view2)) + 1)))) + ((float) (yVar.mo60705n() - yVar.mo60698g(view))));
    }

    /* renamed from: c */
    public static int m94004c(RecyclerView.C20055b0 b0Var, C20224y yVar, View view, View view2, RecyclerView.C20076o oVar, boolean z) {
        if (oVar.mo59922Y() == 0 || b0Var.mo59729d() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return b0Var.mo59729d();
        }
        return (int) ((((float) (yVar.mo60695d(view2) - yVar.mo60698g(view))) / ((float) (Math.abs(oVar.mo59978u0(view) - oVar.mo59978u0(view2)) + 1))) * ((float) b0Var.mo59729d()));
    }
}
