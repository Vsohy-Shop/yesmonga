package androidx.camera.camera2.impl;

import androidx.annotation.C0359n0;
import androidx.camera.core.impl.C1580w0;
import androidx.camera.core.impl.C1583y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.camera.camera2.impl.d */
public final class C1008d extends C1580w0<C1007c> {

    /* renamed from: androidx.camera.camera2.impl.d$a */
    public static final class C1009a {

        /* renamed from: a */
        public final List<C1007c> f3077a = new ArrayList();

        public C1009a(List<C1007c> list) {
            for (C1007c add : list) {
                this.f3077a.add(add);
            }
        }

        @C0359n0
        /* renamed from: a */
        public List<C1007c> mo4108a() {
            return this.f3077a;
        }

        @C0359n0
        /* renamed from: b */
        public List<C1583y> mo4109b() {
            ArrayList arrayList = new ArrayList();
            for (C1007c a : this.f3077a) {
                C1583y a2 = a.mo4101a();
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            return arrayList;
        }

        @C0359n0
        /* renamed from: c */
        public List<C1583y> mo4110c() {
            ArrayList arrayList = new ArrayList();
            for (C1007c b : this.f3077a) {
                C1583y b2 = b.mo4102b();
                if (b2 != null) {
                    arrayList.add(b2);
                }
            }
            return arrayList;
        }

        @C0359n0
        /* renamed from: d */
        public List<C1583y> mo4111d() {
            ArrayList arrayList = new ArrayList();
            for (C1007c c : this.f3077a) {
                C1583y c2 = c.mo4103c();
                if (c2 != null) {
                    arrayList.add(c2);
                }
            }
            return arrayList;
        }

        @C0359n0
        /* renamed from: e */
        public List<C1583y> mo4112e() {
            ArrayList arrayList = new ArrayList();
            for (C1007c d : this.f3077a) {
                C1583y d2 = d.mo4104d();
                if (d2 != null) {
                    arrayList.add(d2);
                }
            }
            return arrayList;
        }
    }

    public C1008d(@C0359n0 C1007c... cVarArr) {
        mo5542a(Arrays.asList(cVarArr));
    }

    @C0359n0
    /* renamed from: e */
    public static C1008d m4389e() {
        return new C1008d(new C1007c[0]);
    }

    @C0359n0
    /* renamed from: b */
    public C1580w0<C1007c> clone() {
        C1008d e = m4389e();
        e.mo5542a(mo5543c());
        return e;
    }

    @C0359n0
    /* renamed from: d */
    public C1009a mo4107d() {
        return new C1009a(mo5543c());
    }
}
