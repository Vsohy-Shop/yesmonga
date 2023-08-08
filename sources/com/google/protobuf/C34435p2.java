package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.p2 */
public final class C34435p2 implements C34386j1 {

    /* renamed from: a */
    public final ProtoSyntax f83444a;

    /* renamed from: b */
    public final boolean f83445b;

    /* renamed from: c */
    public final int[] f83446c;

    /* renamed from: d */
    public final C34400k0[] f83447d;

    /* renamed from: e */
    public final C34412l1 f83448e;

    public C34435p2(ProtoSyntax protoSyntax, boolean z, int[] iArr, C34400k0[] k0VarArr, Object obj) {
        this.f83444a = protoSyntax;
        this.f83445b = z;
        this.f83446c = iArr;
        this.f83447d = k0VarArr;
        this.f83448e = (C34412l1) C34471v0.m140574e(obj, "defaultInstance");
    }

    /* renamed from: e */
    public static C34436a m140116e() {
        return new C34436a();
    }

    /* renamed from: f */
    public static C34436a m140117f(int i) {
        return new C34436a(i);
    }

    /* renamed from: a */
    public boolean mo101041a() {
        return this.f83445b;
    }

    /* renamed from: b */
    public C34412l1 mo101042b() {
        return this.f83448e;
    }

    /* renamed from: c */
    public int[] mo101493c() {
        return this.f83446c;
    }

    /* renamed from: d */
    public C34400k0[] mo101494d() {
        return this.f83447d;
    }

    public ProtoSyntax getSyntax() {
        return this.f83444a;
    }

    /* renamed from: com.google.protobuf.p2$a */
    public static final class C34436a {

        /* renamed from: a */
        public final List<C34400k0> f83449a;

        /* renamed from: b */
        public ProtoSyntax f83450b;

        /* renamed from: c */
        public boolean f83451c;

        /* renamed from: d */
        public boolean f83452d;

        /* renamed from: e */
        public int[] f83453e;

        /* renamed from: f */
        public Object f83454f;

        public C34436a() {
            this.f83453e = null;
            this.f83449a = new ArrayList();
        }

        /* renamed from: a */
        public C34435p2 mo101495a() {
            if (this.f83451c) {
                throw new IllegalStateException("Builder can only build once");
            } else if (this.f83450b != null) {
                this.f83451c = true;
                Collections.sort(this.f83449a);
                return new C34435p2(this.f83450b, this.f83452d, this.f83453e, (C34400k0[]) this.f83449a.toArray(new C34400k0[0]), this.f83454f);
            } else {
                throw new IllegalStateException("Must specify a proto syntax");
            }
        }

        /* renamed from: b */
        public void mo101496b(int[] iArr) {
            this.f83453e = iArr;
        }

        /* renamed from: c */
        public void mo101497c(Object obj) {
            this.f83454f = obj;
        }

        /* renamed from: d */
        public void mo101498d(C34400k0 k0Var) {
            if (!this.f83451c) {
                this.f83449a.add(k0Var);
                return;
            }
            throw new IllegalStateException("Builder can only build once");
        }

        /* renamed from: e */
        public void mo101499e(boolean z) {
            this.f83452d = z;
        }

        /* renamed from: f */
        public void mo101500f(ProtoSyntax protoSyntax) {
            this.f83450b = (ProtoSyntax) C34471v0.m140574e(protoSyntax, "syntax");
        }

        public C34436a(int i) {
            this.f83453e = null;
            this.f83449a = new ArrayList(i);
        }
    }
}
