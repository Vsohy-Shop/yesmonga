package androidx.fragment.app;

import android.view.View;
import androidx.annotation.C0359n0;
import androidx.collection.C1866a;
import androidx.core.app.C17052c6;
import androidx.transition.C20643n;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.fragment.app.j0 */
public class C19241j0 {

    /* renamed from: a */
    public static final C19251l0 f49526a = new C19243k0();

    /* renamed from: b */
    public static final C19251l0 f49527b = m90216c();

    /* renamed from: a */
    public static void m90214a(Fragment fragment, Fragment fragment2, boolean z, C1866a<String, View> aVar, boolean z2) {
        C17052c6 c6Var;
        int i;
        if (z) {
            c6Var = fragment2.getEnterTransitionCallback();
        } else {
            c6Var = fragment.getEnterTransitionCallback();
        }
        if (c6Var != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (aVar == null) {
                i = 0;
            } else {
                i = aVar.size();
            }
            for (int i2 = 0; i2 < i; i2++) {
                arrayList2.add(aVar.mo6334j(i2));
                arrayList.add(aVar.mo6338o(i2));
            }
            if (z2) {
                c6Var.mo51249g(arrayList2, arrayList, (List<View>) null);
            } else {
                c6Var.mo51248f(arrayList2, arrayList, (List<View>) null);
            }
        }
    }

    /* renamed from: b */
    public static String m90215b(C1866a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(aVar.mo6338o(i))) {
                return aVar.mo6334j(i);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static C19251l0 m90216c() {
        try {
            return C20643n.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static void m90217d(@C0359n0 C1866a<String, String> aVar, @C0359n0 C1866a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.mo6338o(size))) {
                aVar.mo6336m(size);
            }
        }
    }

    /* renamed from: e */
    public static void m90218e(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    /* renamed from: f */
    public static boolean m90219f() {
        return (f49526a == null && f49527b == null) ? false : true;
    }
}
