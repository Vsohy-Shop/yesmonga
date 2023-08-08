package com.contentsquare.android.sdk;

import android.util.LongSparseArray;
import com.contentsquare.android.sdk.C14925z9;
import java.util.HashMap;

/* renamed from: com.contentsquare.android.sdk.dd */
public class C14279dd {

    /* renamed from: a */
    public final C14453jf f35242a;

    /* renamed from: b */
    public final C14771u6 f35243b;

    /* renamed from: c */
    public final C14213b7 f35244c;

    /* renamed from: d */
    public final C14476k7 f35245d;

    /* renamed from: e */
    public final C14632q3 f35246e;

    /* renamed from: f */
    public final C14925z9 f35247f;

    /* renamed from: g */
    public final C14802vb f35248g;

    public C14279dd(C14476k7 k7Var, C14771u6 u6Var, C14213b7 b7Var, C14632q3 q3Var, C14925z9 z9Var, C14802vb vbVar) {
        this.f35242a = new C14453jf("SrEventsDispatcher");
        this.f35245d = k7Var;
        this.f35243b = u6Var;
        this.f35244c = b7Var;
        this.f35246e = q3Var;
        this.f35247f = z9Var;
        this.f35248g = vbVar;
    }

    /* renamed from: a */
    public void mo34974a() {
        LongSparseArray<C14754tf> a = this.f35248g.mo36636a();
        int i = 0;
        while (i < a.size()) {
            long keyAt = a.keyAt(i);
            C14754tf tfVar = a.get(keyAt);
            if (tfVar == null || mo34975b(tfVar.mo36541b(), tfVar.mo36542c(), mo34976c())) {
                this.f35248g.mo36637b(keyAt);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo34975b(String str, byte[] bArr, boolean z) {
        int g = this.f35245d.mo35757g();
        if (z && g != 1) {
            this.f35242a.mo35679i("can't send data because connection is not on WIFI", new Object[0]);
            return false;
        } else if (z || !(g == -1 || g == 0)) {
            HashMap hashMap = new HashMap();
            hashMap.put("Content-Encoding", "gzip");
            hashMap.put("Content-Type", "application/x-protobuf");
            hashMap.put("X-Proto-Schema-Version", "1");
            C14925z9.C14926a f = this.f35247f.mo36955f(str, bArr, hashMap);
            Throwable f2 = f.mo36967f();
            if (f2 != null) {
                this.f35242a.mo35678g(f2, "Failed to send the SR event data to the following service path: %s", str);
                return false;
            }
            this.f35246e.mo36197c(f);
            this.f35242a.mo35676e(this.f35246e.mo36195a());
            return true;
        } else {
            this.f35242a.mo35679i("can't send data because mobile connection is not available", new Object[0]);
            return false;
        }
    }

    /* renamed from: c */
    public final boolean mo34976c() {
        C14466k4 c = this.f35243b.mo36561c();
        if (c == null) {
            return false;
        }
        return !new C14922z7().mo36945a(c, this.f35244c.mo34676h(C14477k8.CLIENT_MODE_GOD_MODE, false)).mo35730h().mo35742g();
    }

    public C14279dd(C14476k7 k7Var, C14771u6 u6Var, C14213b7 b7Var, C14802vb vbVar) {
        this(k7Var, u6Var, b7Var, new C14632q3(new C14370g7()), new C14925z9(), vbVar);
    }
}
