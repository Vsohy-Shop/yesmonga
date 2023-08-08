package androidx.transition;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

/* renamed from: androidx.transition.s */
public class C20671s {
    @C0363p0
    /* renamed from: a */
    public static C20652o m96126a(@C0359n0 View view, @C0359n0 ViewGroup viewGroup, @C0363p0 Matrix matrix) {
        if (Build.VERSION.SDK_INT == 28) {
            return C20663q.m96100b(view, viewGroup, matrix);
        }
        return C20666r.m96112b(view, viewGroup, matrix);
    }

    /* renamed from: b */
    public static void m96127b(View view) {
        if (Build.VERSION.SDK_INT == 28) {
            C20663q.m96104f(view);
        } else {
            C20666r.m96116f(view);
        }
    }
}
