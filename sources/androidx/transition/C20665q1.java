package androidx.transition;

import android.view.View;

/* renamed from: androidx.transition.q1 */
public abstract class C20665q1 extends C20636l0 {

    /* renamed from: a */
    public static final String f53317a = "android:visibilityPropagation:visibility";

    /* renamed from: b */
    public static final String f53318b = "android:visibilityPropagation:center";

    /* renamed from: c */
    public static final String[] f53319c = {f53317a, f53318b};

    /* renamed from: d */
    public static int m96106d(C20657p0 p0Var, int i) {
        int[] iArr;
        if (p0Var == null || (iArr = (int[]) p0Var.f53279a.get(f53318b)) == null) {
            return -1;
        }
        return iArr[i];
    }

    /* renamed from: a */
    public void mo61826a(C20657p0 p0Var) {
        View view = p0Var.f53280b;
        Integer num = (Integer) p0Var.f53279a.get(C20658p1.f53282l1);
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        p0Var.f53279a.put(f53317a, num);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = round;
        iArr[0] = round + (view.getWidth() / 2);
        int round2 = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = round2;
        iArr[1] = round2 + (view.getHeight() / 2);
        p0Var.f53279a.put(f53318b, iArr);
    }

    /* renamed from: b */
    public String[] mo61827b() {
        return f53319c;
    }

    /* renamed from: e */
    public int mo61878e(C20657p0 p0Var) {
        Integer num;
        if (p0Var == null || (num = (Integer) p0Var.f53279a.get(f53317a)) == null) {
            return 8;
        }
        return num.intValue();
    }

    /* renamed from: f */
    public int mo61879f(C20657p0 p0Var) {
        return m96106d(p0Var, 0);
    }

    /* renamed from: g */
    public int mo61880g(C20657p0 p0Var) {
        return m96106d(p0Var, 1);
    }
}
