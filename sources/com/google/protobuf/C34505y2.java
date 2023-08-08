package com.google.protobuf;

import com.google.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.protobuf.y2 */
public final class C34505y2 {

    /* renamed from: f */
    public static final int f83569f = 8;

    /* renamed from: g */
    public static final C34505y2 f83570g = new C34505y2(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f83571a;

    /* renamed from: b */
    public int[] f83572b;

    /* renamed from: c */
    public Object[] f83573c;

    /* renamed from: d */
    public int f83574d;

    /* renamed from: e */
    public boolean f83575e;

    public C34505y2() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: c */
    public static C34505y2 m140700c() {
        return f83570g;
    }

    /* renamed from: f */
    public static int m140701f(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    /* renamed from: g */
    public static int m140702g(Object[] objArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + objArr[i3].hashCode();
        }
        return i2;
    }

    /* renamed from: m */
    public static C34505y2 m140703m(C34505y2 y2Var, C34505y2 y2Var2) {
        int i = y2Var.f83571a + y2Var2.f83571a;
        int[] copyOf = Arrays.copyOf(y2Var.f83572b, i);
        System.arraycopy(y2Var2.f83572b, 0, copyOf, y2Var.f83571a, y2Var2.f83571a);
        Object[] copyOf2 = Arrays.copyOf(y2Var.f83573c, i);
        System.arraycopy(y2Var2.f83573c, 0, copyOf2, y2Var.f83571a, y2Var2.f83571a);
        return new C34505y2(i, copyOf, copyOf2, true);
    }

    /* renamed from: n */
    public static C34505y2 m140704n() {
        return new C34505y2();
    }

    /* renamed from: o */
    public static boolean m140705o(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    public static boolean m140706r(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: u */
    public static void m140707u(int i, Object obj, Writer writer) throws IOException {
        int a = WireFormat.m138721a(i);
        int b = WireFormat.m138722b(i);
        if (b == 0) {
            writer.mo100829x(a, ((Long) obj).longValue());
        } else if (b == 1) {
            writer.mo100825t(a, ((Long) obj).longValue());
        } else if (b == 2) {
            writer.mo100802P(a, (ByteString) obj);
        } else if (b != 3) {
            if (b == 5) {
                writer.mo100808c(a, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(InvalidProtocolBufferException.m138416f());
        } else if (writer.mo100826u() == Writer.FieldOrder.ASCENDING) {
            writer.mo100787A(a);
            ((C34505y2) obj).mo101722w(writer);
            writer.mo100793G(a);
        } else {
            writer.mo100793G(a);
            ((C34505y2) obj).mo101722w(writer);
            writer.mo100787A(a);
        }
    }

    /* renamed from: a */
    public void mo101706a() {
        if (!this.f83575e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public final void mo101707b() {
        int i;
        int i2 = this.f83571a;
        int[] iArr = this.f83572b;
        if (i2 == iArr.length) {
            if (i2 < 4) {
                i = 8;
            } else {
                i = i2 >> 1;
            }
            int i3 = i2 + i;
            this.f83572b = Arrays.copyOf(iArr, i3);
            this.f83573c = Arrays.copyOf(this.f83573c, i3);
        }
    }

    /* renamed from: d */
    public int mo101708d() {
        int i;
        int i2 = this.f83574d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f83571a; i4++) {
            int i5 = this.f83572b[i4];
            int a = WireFormat.m138721a(i5);
            int b = WireFormat.m138722b(i5);
            if (b == 0) {
                i = CodedOutputStream.m137371a1(a, ((Long) this.f83573c[i4]).longValue());
            } else if (b == 1) {
                i = CodedOutputStream.m137394o0(a, ((Long) this.f83573c[i4]).longValue());
            } else if (b == 2) {
                i = CodedOutputStream.m137380g0(a, (ByteString) this.f83573c[i4]);
            } else if (b == 3) {
                i = (CodedOutputStream.m137366X0(a) * 2) + ((C34505y2) this.f83573c[i4]).mo101708d();
            } else if (b == 5) {
                i = CodedOutputStream.m137390m0(a, ((Integer) this.f83573c[i4]).intValue());
            } else {
                throw new IllegalStateException(InvalidProtocolBufferException.m138416f());
            }
            i3 += i;
        }
        this.f83574d = i3;
        return i3;
    }

    /* renamed from: e */
    public int mo101709e() {
        int i = this.f83574d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f83571a; i3++) {
            i2 += CodedOutputStream.m137353K0(WireFormat.m138721a(this.f83572b[i3]), (ByteString) this.f83573c[i3]);
        }
        this.f83574d = i2;
        return i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C34505y2)) {
            return false;
        }
        C34505y2 y2Var = (C34505y2) obj;
        int i = this.f83571a;
        if (i != y2Var.f83571a || !m140706r(this.f83572b, y2Var.f83572b, i) || !m140705o(this.f83573c, y2Var.f83573c, this.f83571a)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public void mo101711h() {
        this.f83575e = false;
    }

    public int hashCode() {
        int i = this.f83571a;
        return ((((527 + i) * 31) + m140701f(this.f83572b, i)) * 31) + m140702g(this.f83573c, this.f83571a);
    }

    /* renamed from: i */
    public boolean mo101713i(int i, C34448s sVar) throws IOException {
        mo101706a();
        int a = WireFormat.m138721a(i);
        int b = WireFormat.m138722b(i);
        if (b == 0) {
            mo101718q(i, Long.valueOf(sVar.mo101509G()));
            return true;
        } else if (b == 1) {
            mo101718q(i, Long.valueOf(sVar.mo101504B()));
            return true;
        } else if (b == 2) {
            mo101718q(i, sVar.mo101551x());
            return true;
        } else if (b == 3) {
            C34505y2 y2Var = new C34505y2();
            y2Var.mo101714j(sVar);
            sVar.mo101527a(WireFormat.m138723c(a, 4));
            mo101718q(i, y2Var);
            return true;
        } else if (b == 4) {
            return false;
        } else {
            if (b == 5) {
                mo101718q(i, Integer.valueOf(sVar.mo101503A()));
                return true;
            }
            throw InvalidProtocolBufferException.m138416f();
        }
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: j */
    public final com.google.protobuf.C34505y2 mo101714j(com.google.protobuf.C34448s r2) throws java.io.IOException {
        /*
            r1 = this;
        L_0x0000:
            int r0 = r2.mo101525Y()
            if (r0 == 0) goto L_0x000c
            boolean r0 = r1.mo101713i(r0, r2)
            if (r0 != 0) goto L_0x0000
        L_0x000c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34505y2.mo101714j(com.google.protobuf.s):com.google.protobuf.y2");
    }

    /* renamed from: k */
    public C34505y2 mo101715k(int i, ByteString byteString) {
        mo101706a();
        if (i != 0) {
            mo101718q(WireFormat.m138723c(i, 2), byteString);
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    /* renamed from: l */
    public C34505y2 mo101716l(int i, int i2) {
        mo101706a();
        if (i != 0) {
            mo101718q(WireFormat.m138723c(i, 0), Long.valueOf((long) i2));
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    /* renamed from: p */
    public final void mo101717p(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f83571a; i2++) {
            C34421n1.m139914c(sb, i, String.valueOf(WireFormat.m138721a(this.f83572b[i2])), this.f83573c[i2]);
        }
    }

    /* renamed from: q */
    public void mo101718q(int i, Object obj) {
        mo101706a();
        mo101707b();
        int[] iArr = this.f83572b;
        int i2 = this.f83571a;
        iArr[i2] = i;
        this.f83573c[i2] = obj;
        this.f83571a = i2 + 1;
    }

    /* renamed from: s */
    public void mo101719s(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f83571a; i++) {
            codedOutputStream.mo99316Y1(WireFormat.m138721a(this.f83572b[i]), (ByteString) this.f83573c[i]);
        }
    }

    /* renamed from: t */
    public void mo101720t(Writer writer) throws IOException {
        if (writer.mo100826u() == Writer.FieldOrder.DESCENDING) {
            for (int i = this.f83571a - 1; i >= 0; i--) {
                writer.mo100807b(WireFormat.m138721a(this.f83572b[i]), this.f83573c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f83571a; i2++) {
            writer.mo100807b(WireFormat.m138721a(this.f83572b[i2]), this.f83573c[i2]);
        }
    }

    /* renamed from: v */
    public void mo101721v(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f83571a; i++) {
            int i2 = this.f83572b[i];
            int a = WireFormat.m138721a(i2);
            int b = WireFormat.m138722b(i2);
            if (b == 0) {
                codedOutputStream.mo99329g(a, ((Long) this.f83573c[i]).longValue());
            } else if (b == 1) {
                codedOutputStream.mo99342t(a, ((Long) this.f83573c[i]).longValue());
            } else if (b == 2) {
                codedOutputStream.mo99301P(a, (ByteString) this.f83573c[i]);
            } else if (b == 3) {
                codedOutputStream.mo99331g2(a, 3);
                ((C34505y2) this.f83573c[i]).mo101721v(codedOutputStream);
                codedOutputStream.mo99331g2(a, 4);
            } else if (b == 5) {
                codedOutputStream.mo99321c(a, ((Integer) this.f83573c[i]).intValue());
            } else {
                throw InvalidProtocolBufferException.m138416f();
            }
        }
    }

    /* renamed from: w */
    public void mo101722w(Writer writer) throws IOException {
        if (this.f83571a != 0) {
            if (writer.mo100826u() == Writer.FieldOrder.ASCENDING) {
                for (int i = 0; i < this.f83571a; i++) {
                    m140707u(this.f83572b[i], this.f83573c[i], writer);
                }
                return;
            }
            for (int i2 = this.f83571a - 1; i2 >= 0; i2--) {
                m140707u(this.f83572b[i2], this.f83573c[i2], writer);
            }
        }
    }

    public C34505y2(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f83574d = -1;
        this.f83571a = i;
        this.f83572b = iArr;
        this.f83573c = objArr;
        this.f83575e = z;
    }
}
