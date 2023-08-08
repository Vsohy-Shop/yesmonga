package com.google.android.gms.measurement.internal;

import android.util.Log;
import androidx.compose.p004ui.graphics.vector.C15369g;
import com.google.firebase.installations.C33124s;

/* renamed from: com.google.android.gms.measurement.internal.r3 */
public final class C30863r3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f73899a;

    /* renamed from: b */
    public final /* synthetic */ String f73900b;

    /* renamed from: c */
    public final /* synthetic */ Object f73901c;

    /* renamed from: d */
    public final /* synthetic */ Object f73902d;

    /* renamed from: e */
    public final /* synthetic */ Object f73903e;

    /* renamed from: f */
    public final /* synthetic */ C30899u3 f73904f;

    public C30863r3(C30899u3 u3Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f73904f = u3Var;
        this.f73899a = i;
        this.f73900b = str;
        this.f73901c = obj;
        this.f73902d = obj2;
        this.f73903e = obj3;
    }

    public final void run() {
        C30780k4 F = this.f73904f.f74136a.mo87103F();
        if (F.mo86876n()) {
            C30899u3 u3Var = this.f73904f;
            if (u3Var.f73975c == 0) {
                if (u3Var.f74136a.mo87130z().mo87076H()) {
                    C30899u3 u3Var2 = this.f73904f;
                    u3Var2.f74136a.mo86901b();
                    u3Var2.f73975c = C15369g.f37986l;
                } else {
                    C30899u3 u3Var3 = this.f73904f;
                    u3Var3.f74136a.mo86901b();
                    u3Var3.f73975c = C15369g.f37985k;
                }
            }
            C30899u3 u3Var4 = this.f73904f;
            if (u3Var4.f73976d < 0) {
                u3Var4.f74136a.mo87130z().mo87084q();
                u3Var4.f73976d = 76003;
            }
            char charAt = "01VDIWEA?".charAt(this.f73899a);
            C30899u3 u3Var5 = this.f73904f;
            String str = "2" + charAt + u3Var5.f73975c + u3Var5.f73976d + C33124s.f80355c + C30899u3.m124179A(true, this.f73900b, this.f73901c, this.f73902d, this.f73903e);
            if (str.length() > 1024) {
                str = this.f73900b.substring(0, 1024);
            }
            C30756i4 i4Var = F.f73648d;
            if (i4Var != null) {
                i4Var.mo87171b(str, 1);
                return;
            }
            return;
        }
        Log.println(6, this.f73904f.mo87486D(), "Persisted config not initialized. Not logging error/warn");
    }
}
