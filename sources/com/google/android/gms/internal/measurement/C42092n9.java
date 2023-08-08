package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C42092n9;
import com.google.android.gms.internal.measurement.C42177s9;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.n9 */
public class C42092n9<MessageType extends C42177s9<MessageType, BuilderType>, BuilderType extends C42092n9<MessageType, BuilderType>> extends C41930e8<MessageType, BuilderType> {

    /* renamed from: a */
    public final C42177s9 f106308a;

    /* renamed from: b */
    public C42177s9 f106309b;

    public C42092n9(MessageType messagetype) {
        this.f106308a = messagetype;
        if (!messagetype.mo137284y()) {
            this.f106309b = messagetype.mo137279m();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    /* renamed from: l */
    public static void m170601l(Object obj, Object obj2) {
        C41933eb.m169828a().mo136721b(obj.getClass()).mo136566d(obj, obj2);
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C42246wa mo137176f() {
        throw null;
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C41930e8 mo136717j(byte[] bArr, int i, int i2) throws zzll {
        mo137179o(bArr, 0, i2, C41931e9.f106096d);
        return this;
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C41930e8 mo136718k(byte[] bArr, int i, int i2, C41931e9 e9Var) throws zzll {
        mo137179o(bArr, 0, i2, e9Var);
        return this;
    }

    /* renamed from: m */
    public final C42092n9 mo136716i() {
        C42092n9 n9Var = (C42092n9) this.f106308a.mo136501A(5, (Object) null, (Object) null);
        n9Var.f106309b = mo137175N0();
        return n9Var;
    }

    /* renamed from: n */
    public final C42092n9 mo137178n(C42177s9 s9Var) {
        if (!this.f106308a.equals(s9Var)) {
            if (!this.f106309b.mo137284y()) {
                mo137183v();
            }
            m170601l(this.f106309b, s9Var);
        }
        return this;
    }

    /* renamed from: o */
    public final C42092n9 mo137179o(byte[] bArr, int i, int i2, C41931e9 e9Var) throws zzll {
        if (!this.f106309b.mo137284y()) {
            mo137183v();
        }
        try {
            C41933eb.m169828a().mo136721b(this.f106309b.getClass()).mo136571i(this.f106309b, bArr, 0, i2, new C42002i8(e9Var));
            return this;
        } catch (zzll e) {
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw zzll.m171377f();
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r3 != false) goto L_0x0030;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final MessageType mo137180s() {
        /*
            r5 = this;
            com.google.android.gms.internal.measurement.s9 r0 = r5.mo137175N0()
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.mo136501A(r1, r2, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            if (r3 != r1) goto L_0x0013
            goto L_0x0030
        L_0x0013:
            if (r3 == 0) goto L_0x0031
            com.google.android.gms.internal.measurement.eb r3 = com.google.android.gms.internal.measurement.C41933eb.m169828a()
            java.lang.Class r4 = r0.getClass()
            com.google.android.gms.internal.measurement.hb r3 = r3.mo136721b(r4)
            boolean r3 = r3.mo136569g(r0)
            if (r1 == r3) goto L_0x0029
            r1 = r2
            goto L_0x002a
        L_0x0029:
            r1 = r0
        L_0x002a:
            r4 = 2
            r0.mo136501A(r4, r1, r2)
            if (r3 == 0) goto L_0x0031
        L_0x0030:
            return r0
        L_0x0031:
            com.google.android.gms.internal.measurement.zznj r1 = new com.google.android.gms.internal.measurement.zznj
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C42092n9.mo137180s():com.google.android.gms.internal.measurement.s9");
    }

    /* renamed from: t */
    public MessageType mo137175N0() {
        if (!this.f106309b.mo137284y()) {
            return this.f106309b;
        }
        this.f106309b.mo137281u();
        return this.f106309b;
    }

    /* renamed from: u */
    public final void mo137182u() {
        if (!this.f106309b.mo137284y()) {
            mo137183v();
        }
    }

    /* renamed from: v */
    public void mo137183v() {
        C42177s9 m = this.f106308a.mo137279m();
        m170601l(m, this.f106309b);
        this.f106309b = m;
    }
}
