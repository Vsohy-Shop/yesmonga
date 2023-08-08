package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: androidx.datastore.preferences.protobuf.w3 */
public final class C18900w3 {

    /* renamed from: f */
    public static final int f48110f = 8;

    /* renamed from: g */
    public static final C18900w3 f48111g = new C18900w3(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f48112a;

    /* renamed from: b */
    public int[] f48113b;

    /* renamed from: c */
    public Object[] f48114c;

    /* renamed from: d */
    public int f48115d;

    /* renamed from: e */
    public boolean f48116e;

    public C18900w3() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: c */
    public static boolean m87951c(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m87952d(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static C18900w3 m87953e() {
        return f48111g;
    }

    /* renamed from: h */
    public static int m87954h(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    /* renamed from: i */
    public static int m87955i(Object[] objArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + objArr[i3].hashCode();
        }
        return i2;
    }

    /* renamed from: o */
    public static C18900w3 m87956o(C18900w3 w3Var, C18900w3 w3Var2) {
        int i = w3Var.f48112a + w3Var2.f48112a;
        int[] copyOf = Arrays.copyOf(w3Var.f48113b, i);
        System.arraycopy(w3Var2.f48113b, 0, copyOf, w3Var.f48112a, w3Var2.f48112a);
        Object[] copyOf2 = Arrays.copyOf(w3Var.f48114c, i);
        System.arraycopy(w3Var2.f48114c, 0, copyOf2, w3Var.f48112a, w3Var2.f48112a);
        return new C18900w3(i, copyOf, copyOf2, true);
    }

    /* renamed from: p */
    public static C18900w3 m87957p() {
        return new C18900w3();
    }

    /* renamed from: u */
    public static void m87958u(int i, Object obj, Writer writer) throws IOException {
        int a = WireFormat.m85344a(i);
        int b = WireFormat.m85345b(i);
        if (b == 0) {
            writer.mo54248x(a, ((Long) obj).longValue());
        } else if (b == 1) {
            writer.mo54244t(a, ((Long) obj).longValue());
        } else if (b == 2) {
            writer.mo54220O(a, (ByteString) obj);
        } else if (b != 3) {
            if (b == 5) {
                writer.mo54227c(a, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(InvalidProtocolBufferException.m85088e());
        } else if (writer.mo54245u() == Writer.FieldOrder.ASCENDING) {
            writer.mo54206A(a);
            ((C18900w3) obj).mo55575w(writer);
            writer.mo54212G(a);
        } else {
            writer.mo54212G(a);
            ((C18900w3) obj).mo55575w(writer);
            writer.mo54206A(a);
        }
    }

    /* renamed from: a */
    public void mo55559a() {
        if (!this.f48116e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public final void mo55560b() {
        int i;
        int i2 = this.f48112a;
        int[] iArr = this.f48113b;
        if (i2 == iArr.length) {
            if (i2 < 4) {
                i = 8;
            } else {
                i = i2 >> 1;
            }
            int i3 = i2 + i;
            this.f48113b = Arrays.copyOf(iArr, i3);
            this.f48114c = Arrays.copyOf(this.f48114c, i3);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C18900w3)) {
            return false;
        }
        C18900w3 w3Var = (C18900w3) obj;
        int i = this.f48112a;
        if (i != w3Var.f48112a || !m87951c(this.f48113b, w3Var.f48113b, i) || !m87952d(this.f48114c, w3Var.f48114c, this.f48112a)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public int mo55562f() {
        int i;
        int i2 = this.f48115d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f48112a; i4++) {
            int i5 = this.f48113b[i4];
            int a = WireFormat.m85344a(i5);
            int b = WireFormat.m85345b(i5);
            if (b == 0) {
                i = CodedOutputStream.m84497a1(a, ((Long) this.f48114c[i4]).longValue());
            } else if (b == 1) {
                i = CodedOutputStream.m84520o0(a, ((Long) this.f48114c[i4]).longValue());
            } else if (b == 2) {
                i = CodedOutputStream.m84506g0(a, (ByteString) this.f48114c[i4]);
            } else if (b == 3) {
                i = (CodedOutputStream.m84492X0(a) * 2) + ((C18900w3) this.f48114c[i4]).mo55562f();
            } else if (b == 5) {
                i = CodedOutputStream.m84516m0(a, ((Integer) this.f48114c[i4]).intValue());
            } else {
                throw new IllegalStateException(InvalidProtocolBufferException.m85088e());
            }
            i3 += i;
        }
        this.f48115d = i3;
        return i3;
    }

    /* renamed from: g */
    public int mo55563g() {
        int i = this.f48115d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f48112a; i3++) {
            i2 += CodedOutputStream.m84479K0(WireFormat.m85344a(this.f48113b[i3]), (ByteString) this.f48114c[i3]);
        }
        this.f48115d = i2;
        return i2;
    }

    public int hashCode() {
        int i = this.f48112a;
        return ((((527 + i) * 31) + m87954h(this.f48113b, i)) * 31) + m87955i(this.f48114c, this.f48112a);
    }

    /* renamed from: j */
    public void mo55565j() {
        this.f48116e = false;
    }

    /* renamed from: k */
    public boolean mo55566k(int i, C18889w wVar) throws IOException {
        mo55559a();
        int a = WireFormat.m85344a(i);
        int b = WireFormat.m85345b(i);
        if (b == 0) {
            mo55571r(i, Long.valueOf(wVar.mo55482G()));
            return true;
        } else if (b == 1) {
            mo55571r(i, Long.valueOf(wVar.mo55477B()));
            return true;
        } else if (b == 2) {
            mo55571r(i, wVar.mo55524x());
            return true;
        } else if (b == 3) {
            C18900w3 w3Var = new C18900w3();
            w3Var.mo55567l(wVar);
            wVar.mo55500a(WireFormat.m85346c(a, 4));
            mo55571r(i, w3Var);
            return true;
        } else if (b == 4) {
            return false;
        } else {
            if (b == 5) {
                mo55571r(i, Integer.valueOf(wVar.mo55476A()));
                return true;
            }
            throw InvalidProtocolBufferException.m85088e();
        }
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: l */
    public final androidx.datastore.preferences.protobuf.C18900w3 mo55567l(androidx.datastore.preferences.protobuf.C18889w r2) throws java.io.IOException {
        /*
            r1 = this;
        L_0x0000:
            int r0 = r2.mo55498Y()
            if (r0 == 0) goto L_0x000c
            boolean r0 = r1.mo55566k(r0, r2)
            if (r0 != 0) goto L_0x0000
        L_0x000c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18900w3.mo55567l(androidx.datastore.preferences.protobuf.w):androidx.datastore.preferences.protobuf.w3");
    }

    /* renamed from: m */
    public C18900w3 mo55568m(int i, ByteString byteString) {
        mo55559a();
        if (i != 0) {
            mo55571r(WireFormat.m85346c(i, 2), byteString);
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    /* renamed from: n */
    public C18900w3 mo55569n(int i, int i2) {
        mo55559a();
        if (i != 0) {
            mo55571r(WireFormat.m85346c(i, 0), Long.valueOf((long) i2));
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    /* renamed from: q */
    public final void mo55570q(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f48112a; i2++) {
            C18690b2.m85580c(sb, i, String.valueOf(WireFormat.m85344a(this.f48113b[i2])), this.f48114c[i2]);
        }
    }

    /* renamed from: r */
    public void mo55571r(int i, Object obj) {
        mo55559a();
        mo55560b();
        int[] iArr = this.f48113b;
        int i2 = this.f48112a;
        iArr[i2] = i;
        this.f48114c[i2] = obj;
        this.f48112a = i2 + 1;
    }

    /* renamed from: s */
    public void mo55572s(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f48112a; i++) {
            codedOutputStream.mo53825Y1(WireFormat.m85344a(this.f48113b[i]), (ByteString) this.f48114c[i]);
        }
    }

    /* renamed from: t */
    public void mo55573t(Writer writer) throws IOException {
        if (writer.mo54245u() == Writer.FieldOrder.DESCENDING) {
            for (int i = this.f48112a - 1; i >= 0; i--) {
                writer.mo54226b(WireFormat.m85344a(this.f48113b[i]), this.f48114c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f48112a; i2++) {
            writer.mo54226b(WireFormat.m85344a(this.f48113b[i2]), this.f48114c[i2]);
        }
    }

    /* renamed from: v */
    public void mo55574v(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f48112a; i++) {
            int i2 = this.f48113b[i];
            int a = WireFormat.m85344a(i2);
            int b = WireFormat.m85345b(i2);
            if (b == 0) {
                codedOutputStream.mo53838g(a, ((Long) this.f48114c[i]).longValue());
            } else if (b == 1) {
                codedOutputStream.mo53851t(a, ((Long) this.f48114c[i]).longValue());
            } else if (b == 2) {
                codedOutputStream.mo53809O(a, (ByteString) this.f48114c[i]);
            } else if (b == 3) {
                codedOutputStream.mo53840g2(a, 3);
                ((C18900w3) this.f48114c[i]).mo55574v(codedOutputStream);
                codedOutputStream.mo53840g2(a, 4);
            } else if (b == 5) {
                codedOutputStream.mo53830c(a, ((Integer) this.f48114c[i]).intValue());
            } else {
                throw InvalidProtocolBufferException.m85088e();
            }
        }
    }

    /* renamed from: w */
    public void mo55575w(Writer writer) throws IOException {
        if (this.f48112a != 0) {
            if (writer.mo54245u() == Writer.FieldOrder.ASCENDING) {
                for (int i = 0; i < this.f48112a; i++) {
                    m87958u(this.f48113b[i], this.f48114c[i], writer);
                }
                return;
            }
            for (int i2 = this.f48112a - 1; i2 >= 0; i2--) {
                m87958u(this.f48113b[i2], this.f48114c[i2], writer);
            }
        }
    }

    public C18900w3(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f48115d = -1;
        this.f48112a = i;
        this.f48113b = iArr;
        this.f48114c = objArr;
        this.f48116e = z;
    }
}
