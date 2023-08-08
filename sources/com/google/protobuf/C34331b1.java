package com.google.protobuf;

import com.google.protobuf.C34471v0;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.b1 */
public abstract class C34331b1 {

    /* renamed from: a */
    public static final C34331b1 f83207a = new C34333b();

    /* renamed from: b */
    public static final C34331b1 f83208b = new C34334c();

    /* renamed from: com.google.protobuf.b1$b */
    public static final class C34333b extends C34331b1 {

        /* renamed from: c */
        public static final Class<?> f83209c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public C34333b() {
            super();
        }

        /* renamed from: f */
        public static <E> List<E> m138917f(Object obj, long j) {
            return (List) C34341c3.m138967Q(obj, j);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.protobuf.z0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.protobuf.z0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.protobuf.z0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static <L> java.util.List<L> m138918g(java.lang.Object r3, long r4, int r6) {
            /*
                java.util.List r0 = m138917f(r3, r4)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002d
                boolean r1 = r0 instanceof com.google.protobuf.C34324a1
                if (r1 == 0) goto L_0x0014
                com.google.protobuf.z0 r0 = new com.google.protobuf.z0
                r0.<init>((int) r6)
                goto L_0x0029
            L_0x0014:
                boolean r1 = r0 instanceof com.google.protobuf.C34510z1
                if (r1 == 0) goto L_0x0024
                boolean r1 = r0 instanceof com.google.protobuf.C34471v0.C34488k
                if (r1 == 0) goto L_0x0024
                com.google.protobuf.v0$k r0 = (com.google.protobuf.C34471v0.C34488k) r0
                com.google.protobuf.v0$k r6 = r0.mo100962c(r6)
                r0 = r6
                goto L_0x0029
            L_0x0024:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
            L_0x0029:
                com.google.protobuf.C34341c3.m139016t0(r3, r4, r0)
                goto L_0x007f
            L_0x002d:
                java.lang.Class<?> r1 = f83209c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004b
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                r1.addAll(r0)
                com.google.protobuf.C34341c3.m139016t0(r3, r4, r1)
            L_0x0049:
                r0 = r1
                goto L_0x007f
            L_0x004b:
                boolean r1 = r0 instanceof com.google.protobuf.C34326a3
                if (r1 == 0) goto L_0x0062
                com.google.protobuf.z0 r1 = new com.google.protobuf.z0
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>((int) r2)
                com.google.protobuf.a3 r0 = (com.google.protobuf.C34326a3) r0
                r1.addAll(r0)
                com.google.protobuf.C34341c3.m139016t0(r3, r4, r1)
                goto L_0x0049
            L_0x0062:
                boolean r1 = r0 instanceof com.google.protobuf.C34510z1
                if (r1 == 0) goto L_0x007f
                boolean r1 = r0 instanceof com.google.protobuf.C34471v0.C34488k
                if (r1 == 0) goto L_0x007f
                r1 = r0
                com.google.protobuf.v0$k r1 = (com.google.protobuf.C34471v0.C34488k) r1
                boolean r2 = r1.mo100971T()
                if (r2 != 0) goto L_0x007f
                int r0 = r0.size()
                int r0 = r0 + r6
                com.google.protobuf.v0$k r0 = r1.mo100962c(r0)
                com.google.protobuf.C34341c3.m139016t0(r3, r4, r0)
            L_0x007f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34331b1.C34333b.m138918g(java.lang.Object, long, int):java.util.List");
        }

        /* renamed from: c */
        public void mo100957c(Object obj, long j) {
            Object obj2;
            List list = (List) C34341c3.m138967Q(obj, j);
            if (list instanceof C34324a1) {
                obj2 = ((C34324a1) list).mo100870d0();
            } else if (!f83209c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof C34510z1) || !(list instanceof C34471v0.C34488k)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    C34471v0.C34488k kVar = (C34471v0.C34488k) list;
                    if (kVar.mo100971T()) {
                        kVar.mo100970J();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            C34341c3.m139016t0(obj, j, obj2);
        }

        /* renamed from: d */
        public <E> void mo100958d(Object obj, Object obj2, long j) {
            List f = m138917f(obj2, j);
            List g = m138918g(obj, j, f.size());
            int size = g.size();
            int size2 = f.size();
            if (size > 0 && size2 > 0) {
                g.addAll(f);
            }
            if (size > 0) {
                f = g;
            }
            C34341c3.m139016t0(obj, j, f);
        }

        /* renamed from: e */
        public <L> List<L> mo100959e(Object obj, long j) {
            return m138918g(obj, j, 10);
        }
    }

    /* renamed from: com.google.protobuf.b1$c */
    public static final class C34334c extends C34331b1 {
        public C34334c() {
            super();
        }

        /* renamed from: f */
        public static <E> C34471v0.C34488k<E> m138922f(Object obj, long j) {
            return (C34471v0.C34488k) C34341c3.m138967Q(obj, j);
        }

        /* renamed from: c */
        public void mo100957c(Object obj, long j) {
            m138922f(obj, j).mo100970J();
        }

        /* renamed from: d */
        public <E> void mo100958d(Object obj, Object obj2, long j) {
            C34471v0.C34488k f = m138922f(obj, j);
            C34471v0.C34488k f2 = m138922f(obj2, j);
            int size = f.size();
            int size2 = f2.size();
            if (size > 0 && size2 > 0) {
                if (!f.mo100971T()) {
                    f = f.mo100962c(size2 + size);
                }
                f.addAll(f2);
            }
            if (size > 0) {
                f2 = f;
            }
            C34341c3.m139016t0(obj, j, f2);
        }

        /* renamed from: e */
        public <L> List<L> mo100959e(Object obj, long j) {
            int i;
            C34471v0.C34488k f = m138922f(obj, j);
            if (f.mo100971T()) {
                return f;
            }
            int size = f.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size * 2;
            }
            C34471v0.C34488k c = f.mo100962c(i);
            C34341c3.m139016t0(obj, j, c);
            return c;
        }
    }

    /* renamed from: a */
    public static C34331b1 m138912a() {
        return f83207a;
    }

    /* renamed from: b */
    public static C34331b1 m138913b() {
        return f83208b;
    }

    /* renamed from: c */
    public abstract void mo100957c(Object obj, long j);

    /* renamed from: d */
    public abstract <L> void mo100958d(Object obj, Object obj2, long j);

    /* renamed from: e */
    public abstract <L> List<L> mo100959e(Object obj, long j);

    public C34331b1() {
    }
}
