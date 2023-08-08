package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.annotation.C0329d0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.collection.C1866a;
import androidx.collection.C1875h;
import androidx.collection.C1886l;
import androidx.core.content.res.C17483q;
import androidx.core.view.C18196h2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/* renamed from: androidx.transition.h0 */
public abstract class C20606h0 implements Cloneable {

    /* renamed from: V0 */
    public static final String f53108V0 = "Transition";

    /* renamed from: W0 */
    public static final boolean f53109W0 = false;

    /* renamed from: X0 */
    public static final int f53110X0 = 1;

    /* renamed from: Y0 */
    public static final int f53111Y0 = 1;

    /* renamed from: Z0 */
    public static final int f53112Z0 = 2;

    /* renamed from: a1 */
    public static final int f53113a1 = 3;

    /* renamed from: b1 */
    public static final int f53114b1 = 4;

    /* renamed from: c1 */
    public static final int f53115c1 = 4;

    /* renamed from: d1 */
    public static final String f53116d1 = "instance";

    /* renamed from: e1 */
    public static final String f53117e1 = "name";

    /* renamed from: f1 */
    public static final String f53118f1 = "id";

    /* renamed from: g1 */
    public static final String f53119g1 = "itemId";

    /* renamed from: h1 */
    public static final int[] f53120h1 = {2, 1, 3, 4};

    /* renamed from: i1 */
    public static final C20684x f53121i1 = new C20607a();

    /* renamed from: j1 */
    public static ThreadLocal<C1866a<Animator, C20610d>> f53122j1 = new ThreadLocal<>();

    /* renamed from: E0 */
    public C20664q0 f53123E0 = new C20664q0();

    /* renamed from: F0 */
    public C20664q0 f53124F0 = new C20664q0();

    /* renamed from: G0 */
    public C20639m0 f53125G0 = null;

    /* renamed from: H0 */
    public int[] f53126H0 = f53120h1;

    /* renamed from: I0 */
    public ArrayList<C20657p0> f53127I0;

    /* renamed from: J0 */
    public ArrayList<C20657p0> f53128J0;

    /* renamed from: K0 */
    public boolean f53129K0 = false;

    /* renamed from: L0 */
    public ArrayList<Animator> f53130L0 = new ArrayList<>();

    /* renamed from: M0 */
    public int f53131M0 = 0;

    /* renamed from: N0 */
    public boolean f53132N0 = false;

    /* renamed from: O0 */
    public boolean f53133O0 = false;

    /* renamed from: P0 */
    public ArrayList<C20614h> f53134P0 = null;

    /* renamed from: Q0 */
    public ArrayList<Animator> f53135Q0 = new ArrayList<>();

    /* renamed from: R0 */
    public C20636l0 f53136R0;

    /* renamed from: S0 */
    public C20612f f53137S0;

    /* renamed from: T0 */
    public C1866a<String, String> f53138T0;

    /* renamed from: U0 */
    public C20684x f53139U0 = f53121i1;

    /* renamed from: X */
    public ArrayList<Integer> f53140X = null;

    /* renamed from: Y */
    public ArrayList<View> f53141Y = null;

    /* renamed from: Z */
    public ArrayList<Class<?>> f53142Z = null;

    /* renamed from: a */
    public String f53143a = getClass().getName();

    /* renamed from: b */
    public long f53144b = -1;

    /* renamed from: c */
    public long f53145c = -1;

    /* renamed from: d */
    public TimeInterpolator f53146d = null;

    /* renamed from: e */
    public ArrayList<Integer> f53147e = new ArrayList<>();

    /* renamed from: f */
    public ArrayList<View> f53148f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<String> f53149g = null;

    /* renamed from: v */
    public ArrayList<Class<?>> f53150v = null;

    /* renamed from: w */
    public ArrayList<Integer> f53151w = null;

    /* renamed from: x */
    public ArrayList<View> f53152x = null;

    /* renamed from: y */
    public ArrayList<Class<?>> f53153y = null;

    /* renamed from: z */
    public ArrayList<String> f53154z = null;

    /* renamed from: androidx.transition.h0$a */
    public class C20607a extends C20684x {
        /* renamed from: a */
        public Path mo61606a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: androidx.transition.h0$b */
    public class C20608b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C1866a f53155a;

        public C20608b(C1866a aVar) {
            this.f53155a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f53155a.remove(animator);
            C20606h0.this.f53130L0.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            C20606h0.this.f53130L0.add(animator);
        }
    }

    /* renamed from: androidx.transition.h0$c */
    public class C20609c extends AnimatorListenerAdapter {
        public C20609c() {
        }

        public void onAnimationEnd(Animator animator) {
            C20606h0.this.mo61700B();
            animator.removeListener(this);
        }
    }

    /* renamed from: androidx.transition.h0$d */
    public static class C20610d {

        /* renamed from: a */
        public View f53158a;

        /* renamed from: b */
        public String f53159b;

        /* renamed from: c */
        public C20657p0 f53160c;

        /* renamed from: d */
        public C20676t1 f53161d;

        /* renamed from: e */
        public C20606h0 f53162e;

        public C20610d(View view, String str, C20606h0 h0Var, C20676t1 t1Var, C20657p0 p0Var) {
            this.f53158a = view;
            this.f53159b = str;
            this.f53160c = p0Var;
            this.f53161d = t1Var;
            this.f53162e = h0Var;
        }
    }

    /* renamed from: androidx.transition.h0$e */
    public static class C20611e {
        /* renamed from: a */
        public static <T> ArrayList<T> m95866a(ArrayList<T> arrayList, T t) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(t)) {
                arrayList.add(t);
            }
            return arrayList;
        }

        /* renamed from: b */
        public static <T> ArrayList<T> m95867b(ArrayList<T> arrayList, T t) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(t);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    /* renamed from: androidx.transition.h0$f */
    public static abstract class C20612f {
        /* renamed from: a */
        public abstract Rect mo61771a(@C0359n0 C20606h0 h0Var);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.transition.h0$g */
    public @interface C20613g {
    }

    /* renamed from: androidx.transition.h0$h */
    public interface C20614h {
        /* renamed from: a */
        void mo61665a(@C0359n0 C20606h0 h0Var);

        /* renamed from: b */
        void mo61772b(@C0359n0 C20606h0 h0Var);

        /* renamed from: c */
        void mo61666c(@C0359n0 C20606h0 h0Var);

        /* renamed from: d */
        void mo61667d(@C0359n0 C20606h0 h0Var);

        /* renamed from: e */
        void mo61668e(@C0359n0 C20606h0 h0Var);
    }

    public C20606h0() {
    }

    /* renamed from: G */
    public static <T> ArrayList<T> m95788G(ArrayList<T> arrayList, T t, boolean z) {
        if (t == null) {
            return arrayList;
        }
        if (z) {
            return C20611e.m95866a(arrayList, t);
        }
        return C20611e.m95867b(arrayList, t);
    }

    /* renamed from: a0 */
    public static C1866a<Animator, C20610d> m95789a0() {
        C1866a<Animator, C20610d> aVar = f53122j1.get();
        if (aVar != null) {
            return aVar;
        }
        C1866a<Animator, C20610d> aVar2 = new C1866a<>();
        f53122j1.set(aVar2);
        return aVar2;
    }

    /* renamed from: j */
    public static void m95790j(C20664q0 q0Var, View view, C20657p0 p0Var) {
        q0Var.f53313a.put(view, p0Var);
        int id = view.getId();
        if (id >= 0) {
            if (q0Var.f53314b.indexOfKey(id) >= 0) {
                q0Var.f53314b.put(id, (Object) null);
            } else {
                q0Var.f53314b.put(id, view);
            }
        }
        String x0 = C18196h2.m82649x0(view);
        if (x0 != null) {
            if (q0Var.f53316d.containsKey(x0)) {
                q0Var.f53316d.put(x0, null);
            } else {
                q0Var.f53316d.put(x0, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (q0Var.f53315c.mo6225m(itemIdAtPosition) >= 0) {
                    View k = q0Var.f53315c.mo6223k(itemIdAtPosition);
                    if (k != null) {
                        C18196h2.m82528Q1(k, false);
                        q0Var.f53315c.mo6229t(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C18196h2.m82528Q1(view, true);
                q0Var.f53315c.mo6229t(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: k */
    public static boolean m95791k(int[] iArr, int i) {
        int i2 = iArr[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l0 */
    public static boolean m95792l0(int i) {
        return i >= 1 && i <= 4;
    }

    /* renamed from: o0 */
    public static boolean m95793o0(C20657p0 p0Var, C20657p0 p0Var2, String str) {
        Object obj = p0Var.f53279a.get(str);
        Object obj2 = p0Var2.f53279a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* renamed from: w0 */
    public static int[] m95794w0(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(trim)) {
                iArr[i] = 3;
            } else if ("instance".equalsIgnoreCase(trim)) {
                iArr[i] = 1;
            } else if ("name".equalsIgnoreCase(trim)) {
                iArr[i] = 2;
            } else if (f53119g1.equalsIgnoreCase(trim)) {
                iArr[i] = 4;
            } else if (trim.isEmpty()) {
                int[] iArr2 = new int[(iArr.length - 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                i--;
                iArr = iArr2;
            } else {
                throw new InflateException("Unknown match type in matchOrder: '" + trim + "'");
            }
            i++;
        }
        return iArr;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: A */
    public void mo61699A(ViewGroup viewGroup, C20664q0 q0Var, C20664q0 q0Var2, ArrayList<C20657p0> arrayList, ArrayList<C20657p0> arrayList2) {
        int i;
        boolean z;
        Animator x;
        View view;
        Animator animator;
        C20657p0 p0Var;
        C20657p0 p0Var2;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        C1866a<Animator, C20610d> a0 = m95789a0();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i2 = 0;
        while (i2 < size) {
            C20657p0 p0Var3 = arrayList.get(i2);
            C20657p0 p0Var4 = arrayList2.get(i2);
            if (p0Var3 != null && !p0Var3.f53281c.contains(this)) {
                p0Var3 = null;
            }
            if (p0Var4 != null && !p0Var4.f53281c.contains(this)) {
                p0Var4 = null;
            }
            if (!(p0Var3 == null && p0Var4 == null)) {
                if (p0Var3 == null || p0Var4 == null || mo61751k0(p0Var3, p0Var4)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (x = mo61637x(viewGroup2, p0Var3, p0Var4)) != null) {
                    if (p0Var4 != null) {
                        view = p0Var4.f53280b;
                        String[] i0 = mo61634i0();
                        if (i0 != null && i0.length > 0) {
                            p0Var2 = new C20657p0(view);
                            Animator animator3 = x;
                            i = size;
                            C20657p0 p0Var5 = q0Var2.f53313a.get(view);
                            if (p0Var5 != null) {
                                int i3 = 0;
                                while (i3 < i0.length) {
                                    Map<String, Object> map = p0Var2.f53279a;
                                    String str = i0[i3];
                                    map.put(str, p0Var5.f53279a.get(str));
                                    i3++;
                                    ArrayList<C20657p0> arrayList3 = arrayList2;
                                    i0 = i0;
                                }
                            }
                            int size2 = a0.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size2) {
                                    animator2 = animator3;
                                    break;
                                }
                                C20610d dVar = a0.get(a0.mo6334j(i4));
                                if (dVar.f53160c != null && dVar.f53158a == view && dVar.f53159b.equals(mo61734V()) && dVar.f53160c.equals(p0Var2)) {
                                    animator2 = null;
                                    break;
                                }
                                i4++;
                            }
                        } else {
                            i = size;
                            animator2 = x;
                            p0Var2 = null;
                        }
                        animator = animator2;
                        p0Var = p0Var2;
                    } else {
                        i = size;
                        view = p0Var3.f53280b;
                        animator = x;
                        p0Var = null;
                    }
                    if (animator != null) {
                        C20636l0 l0Var = this.f53136R0;
                        if (l0Var != null) {
                            long c = l0Var.mo61672c(viewGroup2, this, p0Var3, p0Var4);
                            sparseIntArray.put(this.f53135Q0.size(), (int) c);
                            j = Math.min(c, j);
                        }
                        a0.put(animator, new C20610d(view, mo61734V(), this, C20554c1.m95687d(viewGroup), p0Var));
                        this.f53135Q0.add(animator);
                        j = j;
                    }
                    i2++;
                    size = i;
                }
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator4 = this.f53135Q0.get(sparseIntArray.keyAt(i5));
                animator4.setStartDelay((((long) sparseIntArray.valueAt(i5)) - j) + animator4.getStartDelay());
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: B */
    public void mo61700B() {
        int i = this.f53131M0 - 1;
        this.f53131M0 = i;
        if (i == 0) {
            ArrayList<C20614h> arrayList = this.f53134P0;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f53134P0.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C20614h) arrayList2.get(i2)).mo61667d(this);
                }
            }
            for (int i3 = 0; i3 < this.f53123E0.f53315c.mo6213F(); i3++) {
                View G = this.f53123E0.f53315c.mo6214G(i3);
                if (G != null) {
                    C18196h2.m82528Q1(G, false);
                }
            }
            for (int i4 = 0; i4 < this.f53124F0.f53315c.mo6213F(); i4++) {
                View G2 = this.f53124F0.f53315c.mo6214G(i4);
                if (G2 != null) {
                    C18196h2.m82528Q1(G2, false);
                }
            }
            this.f53133O0 = true;
        }
    }

    @C0359n0
    /* renamed from: B0 */
    public C20606h0 mo61701B0(@C0329d0 int i) {
        if (i != 0) {
            this.f53147e.remove(Integer.valueOf(i));
        }
        return this;
    }

    @C0359n0
    /* renamed from: C */
    public C20606h0 mo61702C(@C0329d0 int i, boolean z) {
        this.f53140X = mo61707F(this.f53140X, i, z);
        return this;
    }

    @C0359n0
    /* renamed from: D */
    public C20606h0 mo61703D(@C0359n0 View view, boolean z) {
        this.f53141Y = mo61720N(this.f53141Y, view, z);
        return this;
    }

    @C0359n0
    /* renamed from: D0 */
    public C20606h0 mo61704D0(@C0359n0 View view) {
        this.f53148f.remove(view);
        return this;
    }

    @C0359n0
    /* renamed from: E */
    public C20606h0 mo61705E(@C0359n0 Class<?> cls, boolean z) {
        this.f53142Z = mo61717L(this.f53142Z, cls, z);
        return this;
    }

    @C0359n0
    /* renamed from: E0 */
    public C20606h0 mo61706E0(@C0359n0 Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.f53150v;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    /* renamed from: F */
    public final ArrayList<Integer> mo61707F(ArrayList<Integer> arrayList, int i, boolean z) {
        if (i <= 0) {
            return arrayList;
        }
        if (z) {
            return C20611e.m95866a(arrayList, Integer.valueOf(i));
        }
        return C20611e.m95867b(arrayList, Integer.valueOf(i));
    }

    @C0359n0
    /* renamed from: F0 */
    public C20606h0 mo61708F0(@C0359n0 String str) {
        ArrayList<String> arrayList = this.f53149g;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: G0 */
    public void mo61709G0(View view) {
        if (this.f53132N0) {
            if (!this.f53133O0) {
                for (int size = this.f53130L0.size() - 1; size >= 0; size--) {
                    C20533a.m95668c(this.f53130L0.get(size));
                }
                ArrayList<C20614h> arrayList = this.f53134P0;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f53134P0.clone();
                    int size2 = arrayList2.size();
                    for (int i = 0; i < size2; i++) {
                        ((C20614h) arrayList2.get(i)).mo61665a(this);
                    }
                }
            }
            this.f53132N0 = false;
        }
    }

    @C0359n0
    /* renamed from: H */
    public C20606h0 mo61710H(@C0329d0 int i, boolean z) {
        this.f53151w = mo61707F(this.f53151w, i, z);
        return this;
    }

    /* renamed from: H0 */
    public final void mo61711H0(Animator animator, C1866a<Animator, C20610d> aVar) {
        if (animator != null) {
            animator.addListener(new C20608b(aVar));
            mo61752l(animator);
        }
    }

    @C0359n0
    /* renamed from: I */
    public C20606h0 mo61712I(@C0359n0 View view, boolean z) {
        this.f53152x = mo61720N(this.f53152x, view, z);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: I0 */
    public void mo61713I0() {
        mo61731T0();
        C1866a<Animator, C20610d> a0 = m95789a0();
        Iterator<Animator> it = this.f53135Q0.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (a0.containsKey(next)) {
                mo61731T0();
                mo61711H0(next, a0);
            }
        }
        this.f53135Q0.clear();
        mo61700B();
    }

    @C0359n0
    /* renamed from: J */
    public C20606h0 mo61714J(@C0359n0 Class<?> cls, boolean z) {
        this.f53153y = mo61717L(this.f53153y, cls, z);
        return this;
    }

    /* renamed from: J0 */
    public void mo61715J0(boolean z) {
        this.f53129K0 = z;
    }

    @C0359n0
    /* renamed from: K */
    public C20606h0 mo61716K(@C0359n0 String str, boolean z) {
        this.f53154z = m95788G(this.f53154z, str, z);
        return this;
    }

    /* renamed from: L */
    public final ArrayList<Class<?>> mo61717L(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z) {
        if (cls == null) {
            return arrayList;
        }
        if (z) {
            return C20611e.m95866a(arrayList, cls);
        }
        return C20611e.m95867b(arrayList, cls);
    }

    @C0359n0
    /* renamed from: L0 */
    public C20606h0 mo61718L0(long j) {
        this.f53145c = j;
        return this;
    }

    /* renamed from: M0 */
    public void mo61719M0(@C0363p0 C20612f fVar) {
        this.f53137S0 = fVar;
    }

    /* renamed from: N */
    public final ArrayList<View> mo61720N(ArrayList<View> arrayList, View view, boolean z) {
        if (view == null) {
            return arrayList;
        }
        if (z) {
            return C20611e.m95866a(arrayList, view);
        }
        return C20611e.m95867b(arrayList, view);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: O */
    public void mo61721O(ViewGroup viewGroup) {
        C1866a<Animator, C20610d> a0 = m95789a0();
        int size = a0.size();
        if (viewGroup != null && size != 0) {
            C20676t1 d = C20554c1.m95687d(viewGroup);
            C1866a aVar = new C1866a((C1886l) a0);
            a0.clear();
            for (int i = size - 1; i >= 0; i--) {
                C20610d dVar = (C20610d) aVar.mo6338o(i);
                if (!(dVar.f53158a == null || d == null || !d.equals(dVar.f53161d))) {
                    ((Animator) aVar.mo6334j(i)).end();
                }
            }
        }
    }

    @C0359n0
    /* renamed from: O0 */
    public C20606h0 mo61722O0(@C0363p0 TimeInterpolator timeInterpolator) {
        this.f53146d = timeInterpolator;
        return this;
    }

    /* renamed from: P */
    public long mo61723P() {
        return this.f53145c;
    }

    /* renamed from: P0 */
    public void mo61724P0(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.f53126H0 = f53120h1;
            return;
        }
        int i = 0;
        while (i < iArr.length) {
            if (!m95792l0(iArr[i])) {
                throw new IllegalArgumentException("matches contains invalid value");
            } else if (!m95791k(iArr, i)) {
                i++;
            } else {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.f53126H0 = (int[]) iArr.clone();
    }

    /* renamed from: Q0 */
    public void mo61725Q0(@C0363p0 C20684x xVar) {
        if (xVar == null) {
            this.f53139U0 = f53121i1;
        } else {
            this.f53139U0 = xVar;
        }
    }

    @C0363p0
    /* renamed from: R */
    public Rect mo61726R() {
        C20612f fVar = this.f53137S0;
        if (fVar == null) {
            return null;
        }
        return fVar.mo61771a(this);
    }

    /* renamed from: R0 */
    public void mo61727R0(@C0363p0 C20636l0 l0Var) {
        this.f53136R0 = l0Var;
    }

    @C0363p0
    /* renamed from: S */
    public C20612f mo61728S() {
        return this.f53137S0;
    }

    @C0359n0
    /* renamed from: S0 */
    public C20606h0 mo61729S0(long j) {
        this.f53144b = j;
        return this;
    }

    @C0363p0
    /* renamed from: T */
    public TimeInterpolator mo61730T() {
        return this.f53146d;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: T0 */
    public void mo61731T0() {
        if (this.f53131M0 == 0) {
            ArrayList<C20614h> arrayList = this.f53134P0;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f53134P0.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((C20614h) arrayList2.get(i)).mo61772b(this);
                }
            }
            this.f53133O0 = false;
        }
        this.f53131M0++;
    }

    /* renamed from: U */
    public C20657p0 mo61732U(View view, boolean z) {
        ArrayList<C20657p0> arrayList;
        ArrayList<C20657p0> arrayList2;
        C20639m0 m0Var = this.f53125G0;
        if (m0Var != null) {
            return m0Var.mo61732U(view, z);
        }
        if (z) {
            arrayList = this.f53127I0;
        } else {
            arrayList = this.f53128J0;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            C20657p0 p0Var = arrayList.get(i);
            if (p0Var == null) {
                return null;
            }
            if (p0Var.f53280b == view) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return null;
        }
        if (z) {
            arrayList2 = this.f53128J0;
        } else {
            arrayList2 = this.f53127I0;
        }
        return arrayList2.get(i);
    }

    /* renamed from: U0 */
    public String mo61733U0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f53145c != -1) {
            str2 = str2 + "dur(" + this.f53145c + ") ";
        }
        if (this.f53144b != -1) {
            str2 = str2 + "dly(" + this.f53144b + ") ";
        }
        if (this.f53146d != null) {
            str2 = str2 + "interp(" + this.f53146d + ") ";
        }
        if (this.f53147e.size() <= 0 && this.f53148f.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f53147e.size() > 0) {
            for (int i = 0; i < this.f53147e.size(); i++) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f53147e.get(i);
            }
        }
        if (this.f53148f.size() > 0) {
            for (int i2 = 0; i2 < this.f53148f.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f53148f.get(i2);
            }
        }
        return str3 + ")";
    }

    @C0359n0
    /* renamed from: V */
    public String mo61734V() {
        return this.f53143a;
    }

    @C0359n0
    /* renamed from: Y */
    public C20684x mo61735Y() {
        return this.f53139U0;
    }

    @C0363p0
    /* renamed from: Z */
    public C20636l0 mo61736Z() {
        return this.f53136R0;
    }

    @C0359n0
    /* renamed from: b */
    public C20606h0 mo61737b(@C0359n0 C20614h hVar) {
        if (this.f53134P0 == null) {
            this.f53134P0 = new ArrayList<>();
        }
        this.f53134P0.add(hVar);
        return this;
    }

    /* renamed from: b0 */
    public long mo61738b0() {
        return this.f53144b;
    }

    @C0359n0
    /* renamed from: c */
    public C20606h0 mo61739c(@C0329d0 int i) {
        if (i != 0) {
            this.f53147e.add(Integer.valueOf(i));
        }
        return this;
    }

    @C0359n0
    /* renamed from: c0 */
    public List<Integer> mo61740c0() {
        return this.f53147e;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        for (int size = this.f53130L0.size() - 1; size >= 0; size--) {
            this.f53130L0.get(size).cancel();
        }
        ArrayList<C20614h> arrayList = this.f53134P0;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f53134P0.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((C20614h) arrayList2.get(i)).mo61668e(this);
            }
        }
    }

    @C0363p0
    /* renamed from: d0 */
    public List<String> mo61743d0() {
        return this.f53149g;
    }

    @C0359n0
    /* renamed from: e */
    public C20606h0 mo61744e(@C0359n0 View view) {
        this.f53148f.add(view);
        return this;
    }

    @C0359n0
    /* renamed from: f */
    public C20606h0 mo61745f(@C0359n0 Class<?> cls) {
        if (this.f53150v == null) {
            this.f53150v = new ArrayList<>();
        }
        this.f53150v.add(cls);
        return this;
    }

    @C0363p0
    /* renamed from: g0 */
    public List<Class<?>> mo61746g0() {
        return this.f53150v;
    }

    @C0359n0
    /* renamed from: h */
    public C20606h0 mo61747h(@C0359n0 String str) {
        if (this.f53149g == null) {
            this.f53149g = new ArrayList<>();
        }
        this.f53149g.add(str);
        return this;
    }

    @C0359n0
    /* renamed from: h0 */
    public List<View> mo61748h0() {
        return this.f53148f;
    }

    /* renamed from: i */
    public final void mo61749i(C1866a<View, C20657p0> aVar, C1866a<View, C20657p0> aVar2) {
        for (int i = 0; i < aVar.size(); i++) {
            C20657p0 o = aVar.mo6338o(i);
            if (mo61753m0(o.f53280b)) {
                this.f53127I0.add(o);
                this.f53128J0.add((Object) null);
            }
        }
        for (int i2 = 0; i2 < aVar2.size(); i2++) {
            C20657p0 o2 = aVar2.mo6338o(i2);
            if (mo61753m0(o2.f53280b)) {
                this.f53128J0.add(o2);
                this.f53127I0.add((Object) null);
            }
        }
    }

    @C0363p0
    /* renamed from: i0 */
    public String[] mo61634i0() {
        return null;
    }

    @C0363p0
    /* renamed from: j0 */
    public C20657p0 mo61750j0(@C0359n0 View view, boolean z) {
        C20664q0 q0Var;
        C20639m0 m0Var = this.f53125G0;
        if (m0Var != null) {
            return m0Var.mo61750j0(view, z);
        }
        if (z) {
            q0Var = this.f53123E0;
        } else {
            q0Var = this.f53124F0;
        }
        return q0Var.f53313a.get(view);
    }

    /* renamed from: k0 */
    public boolean mo61751k0(@C0363p0 C20657p0 p0Var, @C0363p0 C20657p0 p0Var2) {
        if (p0Var == null || p0Var2 == null) {
            return false;
        }
        String[] i0 = mo61634i0();
        if (i0 != null) {
            int length = i0.length;
            int i = 0;
            while (i < length) {
                if (!m95793o0(p0Var, p0Var2, i0[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String o0 : p0Var.f53279a.keySet()) {
            if (m95793o0(p0Var, p0Var2, o0)) {
            }
        }
        return false;
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: l */
    public void mo61752l(Animator animator) {
        if (animator == null) {
            mo61700B();
            return;
        }
        if (mo61723P() >= 0) {
            animator.setDuration(mo61723P());
        }
        if (mo61738b0() >= 0) {
            animator.setStartDelay(mo61738b0() + animator.getStartDelay());
        }
        if (mo61730T() != null) {
            animator.setInterpolator(mo61730T());
        }
        animator.addListener(new C20609c());
        animator.start();
    }

    /* renamed from: m */
    public abstract void mo61635m(@C0359n0 C20657p0 p0Var);

    /* renamed from: m0 */
    public boolean mo61753m0(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f53151w;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f53152x;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f53153y;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.f53153y.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f53154z != null && C18196h2.m82649x0(view) != null && this.f53154z.contains(C18196h2.m82649x0(view))) {
            return false;
        }
        if ((this.f53147e.size() == 0 && this.f53148f.size() == 0 && (((arrayList = this.f53150v) == null || arrayList.isEmpty()) && ((arrayList2 = this.f53149g) == null || arrayList2.isEmpty()))) || this.f53147e.contains(Integer.valueOf(id)) || this.f53148f.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f53149g;
        if (arrayList6 != null && arrayList6.contains(C18196h2.m82649x0(view))) {
            return true;
        }
        if (this.f53150v != null) {
            for (int i2 = 0; i2 < this.f53150v.size(); i2++) {
                if (this.f53150v.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: n */
    public final void mo61754n(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.f53151w;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.f53152x;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.f53153y;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i = 0;
                        while (i < size) {
                            if (!this.f53153y.get(i).isInstance(view)) {
                                i++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        C20657p0 p0Var = new C20657p0(view);
                        if (z) {
                            mo61636s(p0Var);
                        } else {
                            mo61635m(p0Var);
                        }
                        p0Var.f53281c.add(this);
                        mo61755o(p0Var);
                        if (z) {
                            m95790j(this.f53123E0, view, p0Var);
                        } else {
                            m95790j(this.f53124F0, view, p0Var);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f53140X;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.f53141Y;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class<?>> arrayList6 = this.f53142Z;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i2 = 0;
                                    while (i2 < size2) {
                                        if (!this.f53142Z.get(i2).isInstance(view)) {
                                            i2++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                    mo61754n(viewGroup.getChildAt(i3), z);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: o */
    public void mo61755o(C20657p0 p0Var) {
        String[] b;
        if (this.f53136R0 != null && !p0Var.f53279a.isEmpty() && (b = this.f53136R0.mo61827b()) != null) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= b.length) {
                    z = true;
                    break;
                } else if (!p0Var.f53279a.containsKey(b[i])) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                this.f53136R0.mo61826a(p0Var);
            }
        }
    }

    /* renamed from: q0 */
    public final void mo61756q0(C1866a<View, C20657p0> aVar, C1866a<View, C20657p0> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && mo61753m0(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && mo61753m0(view)) {
                C20657p0 p0Var = aVar.get(valueAt);
                C20657p0 p0Var2 = aVar2.get(view);
                if (!(p0Var == null || p0Var2 == null)) {
                    this.f53127I0.add(p0Var);
                    this.f53128J0.add(p0Var2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    /* renamed from: r0 */
    public final void mo61757r0(C1866a<View, C20657p0> aVar, C1866a<View, C20657p0> aVar2) {
        C20657p0 remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View j = aVar.mo6334j(size);
            if (j != null && mo61753m0(j) && (remove = aVar2.remove(j)) != null && mo61753m0(remove.f53280b)) {
                this.f53127I0.add(aVar.mo6336m(size));
                this.f53128J0.add(remove);
            }
        }
    }

    /* renamed from: s */
    public abstract void mo61636s(@C0359n0 C20657p0 p0Var);

    /* renamed from: s0 */
    public final void mo61758s0(C1866a<View, C20657p0> aVar, C1866a<View, C20657p0> aVar2, C1875h<View> hVar, C1875h<View> hVar2) {
        View k;
        int F = hVar.mo6213F();
        for (int i = 0; i < F; i++) {
            View G = hVar.mo6214G(i);
            if (G != null && mo61753m0(G) && (k = hVar2.mo6223k(hVar.mo6228s(i))) != null && mo61753m0(k)) {
                C20657p0 p0Var = aVar.get(G);
                C20657p0 p0Var2 = aVar2.get(k);
                if (!(p0Var == null || p0Var2 == null)) {
                    this.f53127I0.add(p0Var);
                    this.f53128J0.add(p0Var2);
                    aVar.remove(G);
                    aVar2.remove(k);
                }
            }
        }
    }

    /* renamed from: t */
    public void mo61759t(ViewGroup viewGroup, boolean z) {
        C1866a<String, String> aVar;
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        mo61761u(z);
        if ((this.f53147e.size() > 0 || this.f53148f.size() > 0) && (((arrayList = this.f53149g) == null || arrayList.isEmpty()) && ((arrayList2 = this.f53150v) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f53147e.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f53147e.get(i).intValue());
                if (findViewById != null) {
                    C20657p0 p0Var = new C20657p0(findViewById);
                    if (z) {
                        mo61636s(p0Var);
                    } else {
                        mo61635m(p0Var);
                    }
                    p0Var.f53281c.add(this);
                    mo61755o(p0Var);
                    if (z) {
                        m95790j(this.f53123E0, findViewById, p0Var);
                    } else {
                        m95790j(this.f53124F0, findViewById, p0Var);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f53148f.size(); i2++) {
                View view = this.f53148f.get(i2);
                C20657p0 p0Var2 = new C20657p0(view);
                if (z) {
                    mo61636s(p0Var2);
                } else {
                    mo61635m(p0Var2);
                }
                p0Var2.f53281c.add(this);
                mo61755o(p0Var2);
                if (z) {
                    m95790j(this.f53123E0, view, p0Var2);
                } else {
                    m95790j(this.f53124F0, view, p0Var2);
                }
            }
        } else {
            mo61754n(viewGroup, z);
        }
        if (!z && (aVar = this.f53138T0) != null) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList3.add(this.f53123E0.f53316d.remove(this.f53138T0.mo6334j(i3)));
            }
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) arrayList3.get(i4);
                if (view2 != null) {
                    this.f53123E0.f53316d.put(this.f53138T0.mo6338o(i4), view2);
                }
            }
        }
    }

    public String toString() {
        return mo61733U0("");
    }

    /* renamed from: u */
    public void mo61761u(boolean z) {
        if (z) {
            this.f53123E0.f53313a.clear();
            this.f53123E0.f53314b.clear();
            this.f53123E0.f53315c.mo6216c();
            return;
        }
        this.f53124F0.f53313a.clear();
        this.f53124F0.f53314b.clear();
        this.f53124F0.f53315c.mo6216c();
    }

    /* renamed from: u0 */
    public final void mo61762u0(C1866a<View, C20657p0> aVar, C1866a<View, C20657p0> aVar2, C1866a<String, View> aVar3, C1866a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i = 0; i < size; i++) {
            View o = aVar3.mo6338o(i);
            if (o != null && mo61753m0(o) && (view = aVar4.get(aVar3.mo6334j(i))) != null && mo61753m0(view)) {
                C20657p0 p0Var = aVar.get(o);
                C20657p0 p0Var2 = aVar2.get(view);
                if (!(p0Var == null || p0Var2 == null)) {
                    this.f53127I0.add(p0Var);
                    this.f53128J0.add(p0Var2);
                    aVar.remove(o);
                    aVar2.remove(view);
                }
            }
        }
    }

    /* renamed from: v */
    public C20606h0 clone() {
        try {
            C20606h0 h0Var = (C20606h0) super.clone();
            h0Var.f53135Q0 = new ArrayList<>();
            h0Var.f53123E0 = new C20664q0();
            h0Var.f53124F0 = new C20664q0();
            h0Var.f53127I0 = null;
            h0Var.f53128J0 = null;
            return h0Var;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: v0 */
    public final void mo61764v0(C20664q0 q0Var, C20664q0 q0Var2) {
        C1866a aVar = new C1866a((C1886l) q0Var.f53313a);
        C1866a aVar2 = new C1866a((C1886l) q0Var2.f53313a);
        int i = 0;
        while (true) {
            int[] iArr = this.f53126H0;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    mo61757r0(aVar, aVar2);
                } else if (i2 == 2) {
                    mo61762u0(aVar, aVar2, q0Var.f53316d, q0Var2.f53316d);
                } else if (i2 == 3) {
                    mo61756q0(aVar, aVar2, q0Var.f53314b, q0Var2.f53314b);
                } else if (i2 == 4) {
                    mo61758s0(aVar, aVar2, q0Var.f53315c, q0Var2.f53315c);
                }
                i++;
            } else {
                mo61749i(aVar, aVar2);
                return;
            }
        }
    }

    @C0363p0
    /* renamed from: x */
    public Animator mo61637x(@C0359n0 ViewGroup viewGroup, @C0363p0 C20657p0 p0Var, @C0363p0 C20657p0 p0Var2) {
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: x0 */
    public void mo61765x0(View view) {
        if (!this.f53133O0) {
            for (int size = this.f53130L0.size() - 1; size >= 0; size--) {
                C20533a.m95667b(this.f53130L0.get(size));
            }
            ArrayList<C20614h> arrayList = this.f53134P0;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f53134P0.clone();
                int size2 = arrayList2.size();
                for (int i = 0; i < size2; i++) {
                    ((C20614h) arrayList2.get(i)).mo61666c(this);
                }
            }
            this.f53132N0 = true;
        }
    }

    /* renamed from: y0 */
    public void mo61766y0(ViewGroup viewGroup) {
        C20610d dVar;
        boolean z;
        this.f53127I0 = new ArrayList<>();
        this.f53128J0 = new ArrayList<>();
        mo61764v0(this.f53123E0, this.f53124F0);
        C1866a<Animator, C20610d> a0 = m95789a0();
        int size = a0.size();
        C20676t1 d = C20554c1.m95687d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator j = a0.mo6334j(i);
            if (!(j == null || (dVar = a0.get(j)) == null || dVar.f53158a == null || !d.equals(dVar.f53161d))) {
                C20657p0 p0Var = dVar.f53160c;
                View view = dVar.f53158a;
                C20657p0 j0 = mo61750j0(view, true);
                C20657p0 U = mo61732U(view, true);
                if (j0 == null && U == null) {
                    U = this.f53124F0.f53313a.get(view);
                }
                if (!(j0 == null && U == null) && dVar.f53162e.mo61751k0(p0Var, U)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (j.isRunning() || j.isStarted()) {
                        j.cancel();
                    } else {
                        a0.remove(j);
                    }
                }
            }
        }
        mo61699A(viewGroup, this.f53123E0, this.f53124F0, this.f53127I0, this.f53128J0);
        mo61713I0();
    }

    @C0359n0
    /* renamed from: z0 */
    public C20606h0 mo61767z0(@C0359n0 C20614h hVar) {
        ArrayList<C20614h> arrayList = this.f53134P0;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(hVar);
        if (this.f53134P0.size() == 0) {
            this.f53134P0 = null;
        }
        return this;
    }

    @SuppressLint({"RestrictedApi"})
    public C20606h0(@C0359n0 Context context, @C0359n0 AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C20592g0.f53072c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long k = (long) C17483q.m80235k(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (k >= 0) {
            mo61718L0(k);
        }
        long k2 = (long) C17483q.m80235k(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (k2 > 0) {
            mo61729S0(k2);
        }
        int l = C17483q.m80236l(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (l > 0) {
            mo61722O0(AnimationUtils.loadInterpolator(context, l));
        }
        String m = C17483q.m80237m(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (m != null) {
            mo61724P0(m95794w0(m));
        }
        obtainStyledAttributes.recycle();
    }
}
