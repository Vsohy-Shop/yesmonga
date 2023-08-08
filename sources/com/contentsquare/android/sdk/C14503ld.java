package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14566o3;
import java.util.Collections;
import java.util.List;

/* renamed from: com.contentsquare.android.sdk.ld */
public abstract class C14503ld {

    /* renamed from: a */
    public static final C14503ld f35868a = new C14505b();

    /* renamed from: b */
    public static final C14503ld f35869b = new C14506c();

    /* renamed from: com.contentsquare.android.sdk.ld$b */
    public static final class C14505b extends C14503ld {

        /* renamed from: c */
        public static final Class<?> f35870c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public C14505b() {
            super();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.contentsquare.android.sdk.jb} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.contentsquare.android.sdk.jb} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.contentsquare.android.sdk.jb} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static <L> java.util.List<L> m62501f(java.lang.Object r3, long r4, int r6) {
            /*
                java.util.List r0 = m62502g(r3, r4)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002d
                boolean r1 = r0 instanceof com.contentsquare.android.sdk.C14308ec
                if (r1 == 0) goto L_0x0014
                com.contentsquare.android.sdk.jb r0 = new com.contentsquare.android.sdk.jb
                r0.<init>((int) r6)
                goto L_0x0029
            L_0x0014:
                boolean r1 = r0 instanceof com.contentsquare.android.sdk.C14548n9
                if (r1 == 0) goto L_0x0024
                boolean r1 = r0 instanceof com.contentsquare.android.sdk.C14566o3.C14575i
                if (r1 == 0) goto L_0x0024
                com.contentsquare.android.sdk.o3$i r0 = (com.contentsquare.android.sdk.C14566o3.C14575i) r0
                com.contentsquare.android.sdk.o3$i r6 = r0.mo34508b(r6)
                r0 = r6
                goto L_0x0029
            L_0x0024:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
            L_0x0029:
                com.contentsquare.android.sdk.C14634q4.m63042l(r3, r4, r0)
                goto L_0x007a
            L_0x002d:
                java.lang.Class<?> r1 = f35870c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004b
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                r1.addAll(r0)
            L_0x0046:
                com.contentsquare.android.sdk.C14634q4.m63042l(r3, r4, r1)
                r0 = r1
                goto L_0x007a
            L_0x004b:
                boolean r1 = r0 instanceof com.contentsquare.android.sdk.C14390h3
                if (r1 == 0) goto L_0x005f
                com.contentsquare.android.sdk.jb r1 = new com.contentsquare.android.sdk.jb
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>((int) r2)
                com.contentsquare.android.sdk.h3 r0 = (com.contentsquare.android.sdk.C14390h3) r0
                r1.addAll(r0)
                goto L_0x0046
            L_0x005f:
                boolean r1 = r0 instanceof com.contentsquare.android.sdk.C14548n9
                if (r1 == 0) goto L_0x007a
                boolean r1 = r0 instanceof com.contentsquare.android.sdk.C14566o3.C14575i
                if (r1 == 0) goto L_0x007a
                r1 = r0
                com.contentsquare.android.sdk.o3$i r1 = (com.contentsquare.android.sdk.C14566o3.C14575i) r1
                boolean r2 = r1.mo34822p()
                if (r2 != 0) goto L_0x007a
                int r0 = r0.size()
                int r0 = r0 + r6
                com.contentsquare.android.sdk.o3$i r0 = r1.mo34508b(r0)
                goto L_0x0029
            L_0x007a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14503ld.C14505b.m62501f(java.lang.Object, long, int):java.util.List");
        }

        /* renamed from: g */
        public static <E> List<E> m62502g(Object obj, long j) {
            return (List) C14634q4.m63030T(obj, j);
        }

        /* renamed from: b */
        public void mo35827b(Object obj, long j) {
            Object obj2;
            List list = (List) C14634q4.m63030T(obj, j);
            if (list instanceof C14308ec) {
                obj2 = ((C14308ec) list).mo35078a();
            } else if (!f35870c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof C14548n9) || !(list instanceof C14566o3.C14575i)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    C14566o3.C14575i iVar = (C14566o3.C14575i) list;
                    if (iVar.mo34822p()) {
                        iVar.mo34819c();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            C14634q4.m63042l(obj, j, obj2);
        }

        /* renamed from: c */
        public <E> void mo35828c(Object obj, Object obj2, long j) {
            List g = m62502g(obj2, j);
            List f = m62501f(obj, j, g.size());
            int size = f.size();
            int size2 = g.size();
            if (size > 0 && size2 > 0) {
                f.addAll(g);
            }
            if (size > 0) {
                g = f;
            }
            C14634q4.m63042l(obj, j, g);
        }

        /* renamed from: e */
        public <L> List<L> mo35829e(Object obj, long j) {
            return m62501f(obj, j, 10);
        }
    }

    /* renamed from: com.contentsquare.android.sdk.ld$c */
    public static final class C14506c extends C14503ld {
        public C14506c() {
            super();
        }

        /* renamed from: f */
        public static <E> C14566o3.C14575i<E> m62506f(Object obj, long j) {
            return (C14566o3.C14575i) C14634q4.m63030T(obj, j);
        }

        /* renamed from: b */
        public void mo35827b(Object obj, long j) {
            m62506f(obj, j).mo34819c();
        }

        /* renamed from: c */
        public <E> void mo35828c(Object obj, Object obj2, long j) {
            C14566o3.C14575i f = m62506f(obj, j);
            C14566o3.C14575i f2 = m62506f(obj2, j);
            int size = f.size();
            int size2 = f2.size();
            if (size > 0 && size2 > 0) {
                if (!f.mo34822p()) {
                    f = f.mo34508b(size2 + size);
                }
                f.addAll(f2);
            }
            if (size > 0) {
                f2 = f;
            }
            C14634q4.m63042l(obj, j, f2);
        }

        /* renamed from: e */
        public <L> List<L> mo35829e(Object obj, long j) {
            C14566o3.C14575i f = m62506f(obj, j);
            if (f.mo34822p()) {
                return f;
            }
            int size = f.size();
            C14566o3.C14575i b = f.mo34508b(size == 0 ? 10 : size * 2);
            C14634q4.m63042l(obj, j, b);
            return b;
        }
    }

    public C14503ld() {
    }

    /* renamed from: a */
    public static C14503ld m62496a() {
        return f35868a;
    }

    /* renamed from: d */
    public static C14503ld m62497d() {
        return f35869b;
    }

    /* renamed from: b */
    public abstract void mo35827b(Object obj, long j);

    /* renamed from: c */
    public abstract <L> void mo35828c(Object obj, Object obj2, long j);

    /* renamed from: e */
    public abstract <L> List<L> mo35829e(Object obj, long j);
}
