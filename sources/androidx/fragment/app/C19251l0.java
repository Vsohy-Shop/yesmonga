package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.core.p027os.C17781e;
import androidx.core.view.C18024a2;
import androidx.core.view.C18196h2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.fragment.app.l0 */
public abstract class C19251l0 {

    /* renamed from: androidx.fragment.app.l0$a */
    public class C19252a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f49546a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f49547b;

        /* renamed from: c */
        public final /* synthetic */ ArrayList f49548c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f49549d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList f49550e;

        public C19252a(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f49546a = i;
            this.f49547b = arrayList;
            this.f49548c = arrayList2;
            this.f49549d = arrayList3;
            this.f49550e = arrayList4;
        }

        public void run() {
            for (int i = 0; i < this.f49546a; i++) {
                C18196h2.m82635t2((View) this.f49547b.get(i), (String) this.f49548c.get(i));
                C18196h2.m82635t2((View) this.f49549d.get(i), (String) this.f49550e.get(i));
            }
        }
    }

    /* renamed from: d */
    public static void m90286d(List<View> list, View view) {
        int size = list.size();
        if (!m90287g(list, view, size)) {
            if (C18196h2.m82649x0(view) != null) {
                list.add(view);
            }
            for (int i = size; i < list.size(); i++) {
                View view2 = list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m90287g(list, childAt, size) && C18196h2.m82649x0(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public static boolean m90287g(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m90288i(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    public abstract void mo57275a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo57276b(Object obj, ArrayList<View> arrayList);

    /* renamed from: c */
    public abstract void mo57277c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo57278e(Object obj);

    /* renamed from: f */
    public abstract Object mo57279f(Object obj);

    /* renamed from: h */
    public void mo57309h(View view, Rect rect) {
        if (C18196h2.m82521O0(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* renamed from: j */
    public abstract Object mo57280j(Object obj, Object obj2, Object obj3);

    /* renamed from: k */
    public abstract Object mo57281k(Object obj, Object obj2, Object obj3);

    /* renamed from: l */
    public ArrayList<String> mo57310l(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(C18196h2.m82649x0(view));
            C18196h2.m82635t2(view, (String) null);
        }
        return arrayList2;
    }

    /* renamed from: m */
    public abstract void mo57282m(Object obj, View view);

    /* renamed from: n */
    public abstract void mo57283n(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: o */
    public abstract void mo57284o(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: p */
    public abstract void mo57285p(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: q */
    public abstract void mo57286q(Object obj, Rect rect);

    /* renamed from: r */
    public abstract void mo57287r(Object obj, View view);

    /* renamed from: s */
    public void mo57288s(@C0359n0 Fragment fragment, @C0359n0 Object obj, @C0359n0 C17781e eVar, @C0359n0 Runnable runnable) {
        runnable.run();
    }

    /* renamed from: t */
    public void mo57311t(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String x0 = C18196h2.m82649x0(view2);
            arrayList4.add(x0);
            if (x0 != null) {
                C18196h2.m82635t2(view2, (String) null);
                String str = map.get(x0);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C18196h2.m82635t2(arrayList2.get(i2), x0);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        C18024a2.m81875a(view, new C19252a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: u */
    public abstract void mo57289u(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: v */
    public abstract void mo57290v(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: w */
    public abstract Object mo57291w(Object obj);
}
