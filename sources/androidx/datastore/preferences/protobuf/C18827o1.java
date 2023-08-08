package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C18753i1;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.o1 */
public abstract class C18827o1 {

    /* renamed from: a */
    public static final C18827o1 f47969a = new C18829b();

    /* renamed from: b */
    public static final C18827o1 f47970b = new C18830c();

    /* renamed from: androidx.datastore.preferences.protobuf.o1$b */
    public static final class C18829b extends C18827o1 {

        /* renamed from: c */
        public static final Class<?> f47971c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public C18829b() {
            super();
        }

        /* renamed from: f */
        public static <E> List<E> m87090f(Object obj, long j) {
            return (List) C18923z3.m88368O(obj, j);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.datastore.preferences.protobuf.m1} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: androidx.datastore.preferences.protobuf.m1} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: androidx.datastore.preferences.protobuf.m1} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static <L> java.util.List<L> m87091g(java.lang.Object r3, long r4, int r6) {
            /*
                java.util.List r0 = m87090f(r3, r4)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002d
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.C18818n1
                if (r1 == 0) goto L_0x0014
                androidx.datastore.preferences.protobuf.m1 r0 = new androidx.datastore.preferences.protobuf.m1
                r0.<init>((int) r6)
                goto L_0x0029
            L_0x0014:
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.C18846q2
                if (r1 == 0) goto L_0x0024
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.C18753i1.C18770k
                if (r1 == 0) goto L_0x0024
                androidx.datastore.preferences.protobuf.i1$k r0 = (androidx.datastore.preferences.protobuf.C18753i1.C18770k) r0
                androidx.datastore.preferences.protobuf.i1$k r6 = r0.mo54630c(r6)
                r0 = r6
                goto L_0x0029
            L_0x0024:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
            L_0x0029:
                androidx.datastore.preferences.protobuf.C18923z3.m88413q0(r3, r4, r0)
                goto L_0x007f
            L_0x002d:
                java.lang.Class<?> r1 = f47971c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004b
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                r1.addAll(r0)
                androidx.datastore.preferences.protobuf.C18923z3.m88413q0(r3, r4, r1)
            L_0x0049:
                r0 = r1
                goto L_0x007f
            L_0x004b:
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.C18915y3
                if (r1 == 0) goto L_0x0062
                androidx.datastore.preferences.protobuf.m1 r1 = new androidx.datastore.preferences.protobuf.m1
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>((int) r2)
                androidx.datastore.preferences.protobuf.y3 r0 = (androidx.datastore.preferences.protobuf.C18915y3) r0
                r1.addAll(r0)
                androidx.datastore.preferences.protobuf.C18923z3.m88413q0(r3, r4, r1)
                goto L_0x0049
            L_0x0062:
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.C18846q2
                if (r1 == 0) goto L_0x007f
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.C18753i1.C18770k
                if (r1 == 0) goto L_0x007f
                r1 = r0
                androidx.datastore.preferences.protobuf.i1$k r1 = (androidx.datastore.preferences.protobuf.C18753i1.C18770k) r1
                boolean r2 = r1.mo54405T()
                if (r2 != 0) goto L_0x007f
                int r0 = r0.size()
                int r0 = r0 + r6
                androidx.datastore.preferences.protobuf.i1$k r0 = r1.mo54630c(r0)
                androidx.datastore.preferences.protobuf.C18923z3.m88413q0(r3, r4, r0)
            L_0x007f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18827o1.C18829b.m87091g(java.lang.Object, long, int):java.util.List");
        }

        /* renamed from: c */
        public void mo55209c(Object obj, long j) {
            Object obj2;
            List list = (List) C18923z3.m88368O(obj, j);
            if (list instanceof C18818n1) {
                obj2 = ((C18818n1) list).mo55031d0();
            } else if (!f47971c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof C18846q2) || !(list instanceof C18753i1.C18770k)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    C18753i1.C18770k kVar = (C18753i1.C18770k) list;
                    if (kVar.mo54405T()) {
                        kVar.mo54404J();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            C18923z3.m88413q0(obj, j, obj2);
        }

        /* renamed from: d */
        public <E> void mo55210d(Object obj, Object obj2, long j) {
            List f = m87090f(obj2, j);
            List g = m87091g(obj, j, f.size());
            int size = g.size();
            int size2 = f.size();
            if (size > 0 && size2 > 0) {
                g.addAll(f);
            }
            if (size > 0) {
                f = g;
            }
            C18923z3.m88413q0(obj, j, f);
        }

        /* renamed from: e */
        public <L> List<L> mo55211e(Object obj, long j) {
            return m87091g(obj, j, 10);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.o1$c */
    public static final class C18830c extends C18827o1 {
        public C18830c() {
            super();
        }

        /* renamed from: f */
        public static <E> C18753i1.C18770k<E> m87095f(Object obj, long j) {
            return (C18753i1.C18770k) C18923z3.m88368O(obj, j);
        }

        /* renamed from: c */
        public void mo55209c(Object obj, long j) {
            m87095f(obj, j).mo54404J();
        }

        /* renamed from: d */
        public <E> void mo55210d(Object obj, Object obj2, long j) {
            C18753i1.C18770k f = m87095f(obj, j);
            C18753i1.C18770k f2 = m87095f(obj2, j);
            int size = f.size();
            int size2 = f2.size();
            if (size > 0 && size2 > 0) {
                if (!f.mo54405T()) {
                    f = f.mo54630c(size2 + size);
                }
                f.addAll(f2);
            }
            if (size > 0) {
                f2 = f;
            }
            C18923z3.m88413q0(obj, j, f2);
        }

        /* renamed from: e */
        public <L> List<L> mo55211e(Object obj, long j) {
            int i;
            C18753i1.C18770k f = m87095f(obj, j);
            if (f.mo54405T()) {
                return f;
            }
            int size = f.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size * 2;
            }
            C18753i1.C18770k c = f.mo54630c(i);
            C18923z3.m88413q0(obj, j, c);
            return c;
        }
    }

    /* renamed from: a */
    public static C18827o1 m87085a() {
        return f47969a;
    }

    /* renamed from: b */
    public static C18827o1 m87086b() {
        return f47970b;
    }

    /* renamed from: c */
    public abstract void mo55209c(Object obj, long j);

    /* renamed from: d */
    public abstract <L> void mo55210d(Object obj, Object obj2, long j);

    /* renamed from: e */
    public abstract <L> List<L> mo55211e(Object obj, long j);

    public C18827o1() {
    }
}
