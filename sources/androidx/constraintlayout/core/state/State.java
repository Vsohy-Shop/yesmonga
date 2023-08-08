package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.helpers.C16753a;
import androidx.constraintlayout.core.state.helpers.C16754b;
import androidx.constraintlayout.core.state.helpers.C16755c;
import androidx.constraintlayout.core.state.helpers.C16759f;
import androidx.constraintlayout.core.state.helpers.C16760g;
import androidx.constraintlayout.core.state.helpers.C16762h;
import java.util.ArrayList;
import java.util.HashMap;

public class State {

    /* renamed from: f */
    public static final int f42491f = -1;

    /* renamed from: g */
    public static final int f42492g = 0;

    /* renamed from: h */
    public static final int f42493h = 1;

    /* renamed from: i */
    public static final int f42494i = 2;

    /* renamed from: j */
    public static final Integer f42495j = 0;

    /* renamed from: a */
    public HashMap<Object, C16747c> f42496a = new HashMap<>();

    /* renamed from: b */
    public HashMap<Object, C16745a> f42497b = new HashMap<>();

    /* renamed from: c */
    public HashMap<String, ArrayList<String>> f42498c = new HashMap<>();

    /* renamed from: d */
    public final ConstraintReference f42499d;

    /* renamed from: e */
    public int f42500e;

    public enum Chain {
        SPREAD,
        SPREAD_INSIDE,
        PACKED
    }

    public enum Constraint {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BASELINE_TO_BASELINE,
        BASELINE_TO_TOP,
        BASELINE_TO_BOTTOM,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY,
        CIRCULAR_CONSTRAINT
    }

    public enum Direction {
        LEFT,
        RIGHT,
        START,
        END,
        f42528e,
        BOTTOM
    }

    /* renamed from: androidx.constraintlayout.core.state.State$Helper */
    public enum C16743Helper {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        FLOW
    }

    /* renamed from: androidx.constraintlayout.core.state.State$a */
    public static /* synthetic */ class C16744a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42539a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.core.state.State$Helper[] r0 = androidx.constraintlayout.core.state.State.C16743Helper.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f42539a = r0
                androidx.constraintlayout.core.state.State$Helper r1 = androidx.constraintlayout.core.state.State.C16743Helper.HORIZONTAL_CHAIN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f42539a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.state.State$Helper r1 = androidx.constraintlayout.core.state.State.C16743Helper.VERTICAL_CHAIN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f42539a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.state.State$Helper r1 = androidx.constraintlayout.core.state.State.C16743Helper.ALIGN_HORIZONTALLY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f42539a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.state.State$Helper r1 = androidx.constraintlayout.core.state.State.C16743Helper.ALIGN_VERTICALLY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f42539a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.core.state.State$Helper r1 = androidx.constraintlayout.core.state.State.C16743Helper.BARRIER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.State.C16744a.<clinit>():void");
        }
    }

    public State() {
        ConstraintReference constraintReference = new ConstraintReference(this);
        this.f42499d = constraintReference;
        this.f42500e = 0;
        this.f42496a.put(f42495j, constraintReference);
    }

    /* renamed from: A */
    public C16759f mo49302A(Object obj) {
        return mo49313k(obj, 1);
    }

    /* renamed from: B */
    public State mo49303B(Dimension dimension) {
        return mo49325x(dimension);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x014d, code lost:
        r1 = (androidx.constraintlayout.core.state.C16745a) r0.mo49240e();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo49304a(androidx.constraintlayout.core.widgets.C16798d r8) {
        /*
            r7 = this;
            r8.mo49846p2()
            androidx.constraintlayout.core.state.ConstraintReference r0 = r7.f42499d
            androidx.constraintlayout.core.state.Dimension r0 = r0.mo49228W()
            r1 = 0
            r0.mo49288j(r7, r8, r1)
            androidx.constraintlayout.core.state.ConstraintReference r0 = r7.f42499d
            androidx.constraintlayout.core.state.Dimension r0 = r0.mo49202E()
            r1 = 1
            r0.mo49288j(r7, r8, r1)
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.a> r0 = r7.f42497b
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0021:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x004b
            java.lang.Object r1 = r0.next()
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.a> r2 = r7.f42497b
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.core.state.a r2 = (androidx.constraintlayout.core.state.C16745a) r2
            androidx.constraintlayout.core.widgets.h r2 = r2.mo49329N0()
            if (r2 == 0) goto L_0x0021
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.c> r3 = r7.f42496a
            java.lang.Object r3 = r3.get(r1)
            androidx.constraintlayout.core.state.c r3 = (androidx.constraintlayout.core.state.C16747c) r3
            if (r3 != 0) goto L_0x0047
            androidx.constraintlayout.core.state.ConstraintReference r3 = r7.mo49308e(r1)
        L_0x0047:
            r3.mo49236c(r2)
            goto L_0x0021
        L_0x004b:
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.c> r0 = r7.f42496a
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0055:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0091
            java.lang.Object r1 = r0.next()
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.c> r2 = r7.f42496a
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.core.state.c r2 = (androidx.constraintlayout.core.state.C16747c) r2
            androidx.constraintlayout.core.state.ConstraintReference r3 = r7.f42499d
            if (r2 == r3) goto L_0x0055
            androidx.constraintlayout.core.state.helpers.e r3 = r2.mo49240e()
            boolean r3 = r3 instanceof androidx.constraintlayout.core.state.C16745a
            if (r3 == 0) goto L_0x0055
            androidx.constraintlayout.core.state.helpers.e r2 = r2.mo49240e()
            androidx.constraintlayout.core.state.a r2 = (androidx.constraintlayout.core.state.C16745a) r2
            androidx.constraintlayout.core.widgets.h r2 = r2.mo49329N0()
            if (r2 == 0) goto L_0x0055
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.c> r3 = r7.f42496a
            java.lang.Object r3 = r3.get(r1)
            androidx.constraintlayout.core.state.c r3 = (androidx.constraintlayout.core.state.C16747c) r3
            if (r3 != 0) goto L_0x008d
            androidx.constraintlayout.core.state.ConstraintReference r3 = r7.mo49308e(r1)
        L_0x008d:
            r3.mo49236c(r2)
            goto L_0x0055
        L_0x0091:
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.c> r0 = r7.f42496a
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x009b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00d7
            java.lang.Object r1 = r0.next()
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.c> r2 = r7.f42496a
            java.lang.Object r1 = r2.get(r1)
            androidx.constraintlayout.core.state.c r1 = (androidx.constraintlayout.core.state.C16747c) r1
            androidx.constraintlayout.core.state.ConstraintReference r2 = r7.f42499d
            if (r1 == r2) goto L_0x00d3
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r1.mo49234b()
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = r3.toString()
            r2.mo49560j1(r3)
            r3 = 0
            r2.mo49503S1(r3)
            androidx.constraintlayout.core.state.helpers.e r3 = r1.mo49240e()
            boolean r3 = r3 instanceof androidx.constraintlayout.core.state.helpers.C16759f
            if (r3 == 0) goto L_0x00cf
            r1.mo49232a()
        L_0x00cf:
            r8.mo49841a(r2)
            goto L_0x009b
        L_0x00d3:
            r1.mo49236c(r8)
            goto L_0x009b
        L_0x00d7:
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.a> r8 = r7.f42497b
            java.util.Set r8 = r8.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x00e1:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0125
            java.lang.Object r0 = r8.next()
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.a> r1 = r7.f42497b
            java.lang.Object r0 = r1.get(r0)
            androidx.constraintlayout.core.state.a r0 = (androidx.constraintlayout.core.state.C16745a) r0
            androidx.constraintlayout.core.widgets.h r1 = r0.mo49329N0()
            if (r1 == 0) goto L_0x0121
            java.util.ArrayList<java.lang.Object> r1 = r0.f42542l0
            java.util.Iterator r1 = r1.iterator()
        L_0x00ff:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x011d
            java.lang.Object r2 = r1.next()
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.c> r3 = r7.f42496a
            java.lang.Object r2 = r3.get(r2)
            androidx.constraintlayout.core.state.c r2 = (androidx.constraintlayout.core.state.C16747c) r2
            androidx.constraintlayout.core.widgets.h r3 = r0.mo49329N0()
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r2.mo49234b()
            r3.mo49809a(r2)
            goto L_0x00ff
        L_0x011d:
            r0.mo49232a()
            goto L_0x00e1
        L_0x0121:
            r0.mo49232a()
            goto L_0x00e1
        L_0x0125:
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.c> r8 = r7.f42496a
            java.util.Set r8 = r8.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x012f:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01a4
            java.lang.Object r0 = r8.next()
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.c> r1 = r7.f42496a
            java.lang.Object r0 = r1.get(r0)
            androidx.constraintlayout.core.state.c r0 = (androidx.constraintlayout.core.state.C16747c) r0
            androidx.constraintlayout.core.state.ConstraintReference r1 = r7.f42499d
            if (r0 == r1) goto L_0x012f
            androidx.constraintlayout.core.state.helpers.e r1 = r0.mo49240e()
            boolean r1 = r1 instanceof androidx.constraintlayout.core.state.C16745a
            if (r1 == 0) goto L_0x012f
            androidx.constraintlayout.core.state.helpers.e r1 = r0.mo49240e()
            androidx.constraintlayout.core.state.a r1 = (androidx.constraintlayout.core.state.C16745a) r1
            androidx.constraintlayout.core.widgets.h r2 = r1.mo49329N0()
            if (r2 == 0) goto L_0x012f
            java.util.ArrayList<java.lang.Object> r1 = r1.f42542l0
            java.util.Iterator r1 = r1.iterator()
        L_0x015f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x01a0
            java.lang.Object r3 = r1.next()
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.c> r4 = r7.f42496a
            java.lang.Object r4 = r4.get(r3)
            androidx.constraintlayout.core.state.c r4 = (androidx.constraintlayout.core.state.C16747c) r4
            if (r4 == 0) goto L_0x017b
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r4.mo49234b()
            r2.mo49809a(r3)
            goto L_0x015f
        L_0x017b:
            boolean r4 = r3 instanceof androidx.constraintlayout.core.state.C16747c
            if (r4 == 0) goto L_0x0189
            androidx.constraintlayout.core.state.c r3 = (androidx.constraintlayout.core.state.C16747c) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r3.mo49234b()
            r2.mo49809a(r3)
            goto L_0x015f
        L_0x0189:
            java.io.PrintStream r4 = java.lang.System.out
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "couldn't find reference for "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.println(r3)
            goto L_0x015f
        L_0x01a0:
            r0.mo49232a()
            goto L_0x012f
        L_0x01a4:
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.c> r8 = r7.f42496a
            java.util.Set r8 = r8.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x01ae:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01d2
            java.lang.Object r0 = r8.next()
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.c> r1 = r7.f42496a
            java.lang.Object r1 = r1.get(r0)
            androidx.constraintlayout.core.state.c r1 = (androidx.constraintlayout.core.state.C16747c) r1
            r1.mo49232a()
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.mo49234b()
            if (r1 == 0) goto L_0x01ae
            if (r0 == 0) goto L_0x01ae
            java.lang.String r0 = r0.toString()
            r1.f42750o = r0
            goto L_0x01ae
        L_0x01d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.State.mo49304a(androidx.constraintlayout.core.widgets.d):void");
    }

    /* renamed from: b */
    public C16755c mo49305b(Object obj, Direction direction) {
        ConstraintReference e = mo49308e(obj);
        if (e.mo49240e() == null || !(e.mo49240e() instanceof C16755c)) {
            C16755c cVar = new C16755c(this);
            cVar.mo49344Q0(direction);
            e.mo49266q0(cVar);
        }
        return (C16755c) e.mo49240e();
    }

    /* renamed from: c */
    public C16753a mo49306c(Object... objArr) {
        C16753a aVar = (C16753a) mo49315m((Object) null, C16743Helper.ALIGN_HORIZONTALLY);
        aVar.mo49328M0(objArr);
        return aVar;
    }

    /* renamed from: d */
    public C16754b mo49307d(Object... objArr) {
        C16754b bVar = (C16754b) mo49315m((Object) null, C16743Helper.ALIGN_VERTICALLY);
        bVar.mo49328M0(objArr);
        return bVar;
    }

    /* renamed from: e */
    public ConstraintReference mo49308e(Object obj) {
        C16747c cVar = this.f42496a.get(obj);
        if (cVar == null) {
            cVar = mo49309g(obj);
            this.f42496a.put(obj, cVar);
            cVar.mo49238d(obj);
        }
        if (cVar instanceof ConstraintReference) {
            return (ConstraintReference) cVar;
        }
        return null;
    }

    /* renamed from: f */
    public int mo48546f(Object obj) {
        if (obj instanceof Float) {
            return ((Float) obj).intValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    /* renamed from: g */
    public ConstraintReference mo49309g(Object obj) {
        return new ConstraintReference(this);
    }

    /* renamed from: h */
    public final String mo49310h() {
        StringBuilder sb = new StringBuilder();
        sb.append("__HELPER_KEY_");
        int i = this.f42500e;
        this.f42500e = i + 1;
        sb.append(i);
        sb.append("__");
        return sb.toString();
    }

    /* renamed from: i */
    public void mo49311i() {
        for (Object next : this.f42496a.keySet()) {
            ConstraintReference e = mo49308e(next);
            if (e instanceof ConstraintReference) {
                e.mo49280x0(next);
            }
        }
    }

    /* renamed from: j */
    public ArrayList<String> mo49312j(String str) {
        if (this.f42498c.containsKey(str)) {
            return this.f42498c.get(str);
        }
        return null;
    }

    /* renamed from: k */
    public C16759f mo49313k(Object obj, int i) {
        ConstraintReference e = mo49308e(obj);
        if (e.mo49240e() == null || !(e.mo49240e() instanceof C16759f)) {
            C16759f fVar = new C16759f(this);
            fVar.mo49352i(i);
            fVar.mo49238d(obj);
            e.mo49266q0(fVar);
        }
        return (C16759f) e.mo49240e();
    }

    /* renamed from: l */
    public State mo49314l(Dimension dimension) {
        return mo49323v(dimension);
    }

    /* renamed from: m */
    public C16745a mo49315m(Object obj, C16743Helper helper) {
        C16745a aVar;
        if (obj == null) {
            obj = mo49310h();
        }
        C16745a aVar2 = this.f42497b.get(obj);
        if (aVar2 == null) {
            int i = C16744a.f42539a[helper.ordinal()];
            if (i == 1) {
                aVar = new C16760g(this);
            } else if (i == 2) {
                aVar = new C16762h(this);
            } else if (i == 3) {
                aVar = new C16753a(this);
            } else if (i == 4) {
                aVar = new C16754b(this);
            } else if (i != 5) {
                aVar2 = new C16745a(this, helper);
                aVar2.mo49238d(obj);
                this.f42497b.put(obj, aVar2);
            } else {
                aVar = new C16755c(this);
            }
            aVar2 = aVar;
            aVar2.mo49238d(obj);
            this.f42497b.put(obj, aVar2);
        }
        return aVar2;
    }

    /* renamed from: n */
    public C16760g mo49316n() {
        return (C16760g) mo49315m((Object) null, C16743Helper.HORIZONTAL_CHAIN);
    }

    /* renamed from: o */
    public C16760g mo49317o(Object... objArr) {
        C16760g gVar = (C16760g) mo49315m((Object) null, C16743Helper.HORIZONTAL_CHAIN);
        gVar.mo49328M0(objArr);
        return gVar;
    }

    /* renamed from: p */
    public C16759f mo49318p(Object obj) {
        return mo49313k(obj, 0);
    }

    /* renamed from: q */
    public void mo49319q(Object obj, Object obj2) {
        ConstraintReference e = mo49308e(obj);
        if (e instanceof ConstraintReference) {
            e.mo49280x0(obj2);
        }
    }

    /* renamed from: r */
    public C16747c mo49320r(Object obj) {
        return this.f42496a.get(obj);
    }

    /* renamed from: s */
    public void mo48547s() {
        this.f42497b.clear();
        this.f42498c.clear();
    }

    /* renamed from: t */
    public boolean mo49321t(int i) {
        return this.f42499d.mo49202E().mo49289k(i);
    }

    /* renamed from: u */
    public boolean mo49322u(int i) {
        return this.f42499d.mo49228W().mo49289k(i);
    }

    /* renamed from: v */
    public State mo49323v(Dimension dimension) {
        this.f42499d.mo49268r0(dimension);
        return this;
    }

    /* renamed from: w */
    public void mo49324w(String str, String str2) {
        ArrayList arrayList;
        ConstraintReference e = mo49308e(str);
        if (e instanceof ConstraintReference) {
            e.mo49274u0(str2);
            if (!this.f42498c.containsKey(str2)) {
                arrayList = new ArrayList();
                this.f42498c.put(str2, arrayList);
            } else {
                arrayList = this.f42498c.get(str2);
            }
            arrayList.add(str);
        }
    }

    /* renamed from: x */
    public State mo49325x(Dimension dimension) {
        this.f42499d.mo49282y0(dimension);
        return this;
    }

    /* renamed from: y */
    public C16762h mo49326y() {
        return (C16762h) mo49315m((Object) null, C16743Helper.VERTICAL_CHAIN);
    }

    /* renamed from: z */
    public C16762h mo49327z(Object... objArr) {
        C16762h hVar = (C16762h) mo49315m((Object) null, C16743Helper.VERTICAL_CHAIN);
        hVar.mo49328M0(objArr);
        return hVar;
    }
}
