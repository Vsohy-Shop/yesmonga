package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.j3 */
public final class C18778j3 implements C18904x1 {

    /* renamed from: a */
    public final ProtoSyntax f47888a;

    /* renamed from: b */
    public final boolean f47889b;

    /* renamed from: c */
    public final int[] f47890c;

    /* renamed from: d */
    public final C18865t0[] f47891d;

    /* renamed from: e */
    public final C18920z1 f47892e;

    public C18778j3(ProtoSyntax protoSyntax, boolean z, int[] iArr, C18865t0[] t0VarArr, Object obj) {
        this.f47888a = protoSyntax;
        this.f47889b = z;
        this.f47890c = iArr;
        this.f47891d = t0VarArr;
        this.f47892e = (C18920z1) C18753i1.m86341e(obj, "defaultInstance");
    }

    /* renamed from: e */
    public static C18779a m86399e() {
        return new C18779a();
    }

    /* renamed from: f */
    public static C18779a m86400f(int i) {
        return new C18779a(i);
    }

    /* renamed from: a */
    public boolean mo54861a() {
        return this.f47889b;
    }

    /* renamed from: b */
    public C18920z1 mo54862b() {
        return this.f47892e;
    }

    /* renamed from: c */
    public int[] mo54863c() {
        return this.f47890c;
    }

    /* renamed from: d */
    public C18865t0[] mo54864d() {
        return this.f47891d;
    }

    public ProtoSyntax getSyntax() {
        return this.f47888a;
    }

    /* renamed from: androidx.datastore.preferences.protobuf.j3$a */
    public static final class C18779a {

        /* renamed from: a */
        public final List<C18865t0> f47893a;

        /* renamed from: b */
        public ProtoSyntax f47894b;

        /* renamed from: c */
        public boolean f47895c;

        /* renamed from: d */
        public boolean f47896d;

        /* renamed from: e */
        public int[] f47897e;

        /* renamed from: f */
        public Object f47898f;

        public C18779a() {
            this.f47897e = null;
            this.f47893a = new ArrayList();
        }

        /* renamed from: a */
        public C18778j3 mo54866a() {
            if (this.f47895c) {
                throw new IllegalStateException("Builder can only build once");
            } else if (this.f47894b != null) {
                this.f47895c = true;
                Collections.sort(this.f47893a);
                return new C18778j3(this.f47894b, this.f47896d, this.f47897e, (C18865t0[]) this.f47893a.toArray(new C18865t0[0]), this.f47898f);
            } else {
                throw new IllegalStateException("Must specify a proto syntax");
            }
        }

        /* renamed from: b */
        public void mo54867b(int[] iArr) {
            this.f47897e = iArr;
        }

        /* renamed from: c */
        public void mo54868c(Object obj) {
            this.f47898f = obj;
        }

        /* renamed from: d */
        public void mo54869d(C18865t0 t0Var) {
            if (!this.f47895c) {
                this.f47893a.add(t0Var);
                return;
            }
            throw new IllegalStateException("Builder can only build once");
        }

        /* renamed from: e */
        public void mo54870e(boolean z) {
            this.f47896d = z;
        }

        /* renamed from: f */
        public void mo54871f(ProtoSyntax protoSyntax) {
            this.f47894b = (ProtoSyntax) C18753i1.m86341e(protoSyntax, "syntax");
        }

        public C18779a(int i) {
            this.f47897e = null;
            this.f47893a = new ArrayList(i);
        }
    }
}
