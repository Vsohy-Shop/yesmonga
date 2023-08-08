package com.contentsquare.android.internal.features.sessionreplay.processing;

import android.app.Activity;
import android.view.Window;
import androidx.lifecycle.C19427i;
import androidx.lifecycle.C19475v;
import androidx.lifecycle.C19499w;
import com.contentsquare.android.sdk.C14227be;
import com.contentsquare.android.sdk.C14279dd;
import com.contentsquare.android.sdk.C14341fa;
import com.contentsquare.android.sdk.C14374ga;
import com.contentsquare.android.sdk.C14379gd;
import com.contentsquare.android.sdk.C14383gg;
import com.contentsquare.android.sdk.C14424i9;
import com.contentsquare.android.sdk.C14430id;
import com.contentsquare.android.sdk.C14453jf;
import com.contentsquare.android.sdk.C14487l;
import com.contentsquare.android.sdk.C14502lc;
import com.contentsquare.android.sdk.C14507le;
import com.contentsquare.android.sdk.C14531mc;
import com.contentsquare.android.sdk.C14565o2;
import com.contentsquare.android.sdk.C14602p;
import com.contentsquare.android.sdk.C14693s1;
import com.contentsquare.android.sdk.C14709se;
import com.contentsquare.android.sdk.C14742t9;
import com.contentsquare.android.sdk.C14753te;
import com.contentsquare.android.sdk.C14802vb;
import com.contentsquare.android.sdk.C14832wa;
import com.contentsquare.android.sdk.C14927za;
import com.contentsquare.android.sdk.C14930zc;
import java.util.ArrayList;
import java.util.List;

public class SessionReplayProcessor extends C14930zc.C14931a implements C14742t9.C14745c {

    /* renamed from: E0 */
    public final C14802vb f34980E0;

    /* renamed from: F0 */
    public C14507le f34981F0;

    /* renamed from: G0 */
    public final List<C14502lc> f34982G0;

    /* renamed from: H0 */
    public final C14602p f34983H0;

    /* renamed from: I0 */
    public final C19499w f34984I0;

    /* renamed from: J0 */
    public final C19475v f34985J0;

    /* renamed from: X */
    public final C14487l f34986X;

    /* renamed from: Y */
    public final C14927za f34987Y;

    /* renamed from: Z */
    public final C14279dd f34988Z;

    /* renamed from: b */
    public final C14531mc f34989b;

    /* renamed from: c */
    public final C14930zc f34990c;

    /* renamed from: d */
    public final C14424i9 f34991d;

    /* renamed from: e */
    public final C14565o2 f34992e;

    /* renamed from: f */
    public final C14341fa f34993f;

    /* renamed from: g */
    public final C14742t9 f34994g;

    /* renamed from: v */
    public final C14832wa f34995v;

    /* renamed from: w */
    public final C14693s1 f34996w;

    /* renamed from: x */
    public final C14383gg f34997x;

    /* renamed from: y */
    public final C14709se f34998y;

    /* renamed from: z */
    public final C14453jf f34999z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SessionReplayProcessor(android.app.Application r23, com.contentsquare.android.sdk.C14930zc r24, com.contentsquare.android.sdk.C14417i6 r25, com.contentsquare.android.sdk.C14476k7 r26, com.contentsquare.android.sdk.C14709se r27, com.contentsquare.android.sdk.C14693s1 r28, com.contentsquare.android.sdk.C14487l r29, java.util.List<com.contentsquare.android.sdk.C14502lc> r30, com.contentsquare.android.sdk.C14602p r31, com.contentsquare.android.sdk.C14802vb r32, androidx.lifecycle.C19499w r33) {
        /*
            r22 = this;
            r0 = r25
            r1 = r22
            r3 = r24
            r11 = r27
            r6 = r28
            r12 = r29
            r15 = r30
            r16 = r31
            r17 = r32
            r19 = r33
            com.contentsquare.android.sdk.mc r4 = new com.contentsquare.android.sdk.mc
            r2 = r4
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r7 = android.os.Looper.getMainLooper()
            r5.<init>(r7)
            r7 = 200(0xc8, double:9.9E-322)
            r4.<init>(r5, r7)
            com.contentsquare.android.sdk.o2 r5 = new com.contentsquare.android.sdk.o2
            r4 = r5
            r14 = r23
            r7 = r24
            r5.<init>(r14, r7)
            com.contentsquare.android.sdk.fa r7 = new com.contentsquare.android.sdk.fa
            r5 = r7
            com.contentsquare.android.sdk.u7 r8 = new com.contentsquare.android.sdk.u7
            r8.<init>()
            r7.<init>(r8, r0)
            com.contentsquare.android.sdk.gg r8 = new com.contentsquare.android.sdk.gg
            r7 = r8
            android.content.Context r9 = r23.getApplicationContext()
            com.contentsquare.android.sdk.na r9 = com.contentsquare.android.sdk.C14549na.m62703a(r9)
            com.contentsquare.android.sdk.b7 r9 = r9.mo35986g()
            android.content.Context r10 = r23.getApplicationContext()
            com.contentsquare.android.sdk.na r10 = com.contentsquare.android.sdk.C14549na.m62703a(r10)
            com.contentsquare.android.sdk.u6 r10 = r10.mo35983c()
            r8.<init>(r9, r10)
            com.contentsquare.android.sdk.t9 r9 = new com.contentsquare.android.sdk.t9
            r8 = r9
            android.content.Context r10 = r23.getApplicationContext()
            r9.<init>(r10)
            com.contentsquare.android.sdk.wa r10 = new com.contentsquare.android.sdk.wa
            r9 = r10
            android.content.Context r13 = r23.getApplicationContext()
            com.contentsquare.android.sdk.na r13 = com.contentsquare.android.sdk.C14549na.m62703a(r13)
            com.contentsquare.android.sdk.b7 r13 = r13.mo35986g()
            r10.<init>(r13, r0)
            com.contentsquare.android.sdk.i9 r0 = new com.contentsquare.android.sdk.i9
            r10 = r0
            r0.<init>()
            com.contentsquare.android.sdk.za r0 = new com.contentsquare.android.sdk.za
            r13 = r0
            r0.<init>()
            com.contentsquare.android.sdk.dd r0 = new com.contentsquare.android.sdk.dd
            r14 = r0
            android.content.Context r18 = r23.getApplicationContext()
            com.contentsquare.android.sdk.na r18 = com.contentsquare.android.sdk.C14549na.m62703a(r18)
            r20 = r1
            com.contentsquare.android.sdk.u6 r1 = r18.mo35983c()
            android.content.Context r18 = r23.getApplicationContext()
            com.contentsquare.android.sdk.na r18 = com.contentsquare.android.sdk.C14549na.m62703a(r18)
            r27 = r2
            com.contentsquare.android.sdk.b7 r2 = r18.mo35986g()
            r21 = r3
            r28 = r4
            r3 = r26
            r4 = r32
            r0.<init>(r3, r1, r2, r4)
            com.contentsquare.android.sdk.jf r0 = new com.contentsquare.android.sdk.jf
            r18 = r0
            java.lang.String r1 = "SessionReplayProcessor"
            r0.<init>(r1)
            r2 = r27
            r4 = r28
            r1 = r20
            r3 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.internal.features.sessionreplay.processing.SessionReplayProcessor.<init>(android.app.Application, com.contentsquare.android.sdk.zc, com.contentsquare.android.sdk.i6, com.contentsquare.android.sdk.k7, com.contentsquare.android.sdk.se, com.contentsquare.android.sdk.s1, com.contentsquare.android.sdk.l, java.util.List, com.contentsquare.android.sdk.p, com.contentsquare.android.sdk.vb, androidx.lifecycle.w):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m60724i(C14430id idVar) {
        try {
            this.f34980E0.mo36638c(idVar);
            this.f34988Z.mo34974a();
        } catch (Exception e) {
            this.f34999z.mo35674c("Something went wrong while flushing.", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m60725l(List list) {
        try {
            this.f34980E0.mo36639d(list);
            this.f34988Z.mo34974a();
        } catch (Exception e) {
            this.f34999z.mo35674c("Something went wrong while trying to store or dispatch.", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m60726o(C14507le leVar, long j, C14742t9.C14746d dVar) {
        try {
            mo34436j(leVar, j, dVar);
        } catch (Exception e) {
            this.f34999z.mo35678g(e, "Something went wrong with createListOfDetectMutations.", new Object[0]);
        }
    }

    /* renamed from: a */
    public void mo34432a(C14742t9.C14746d dVar) {
        mo34439n(dVar);
    }

    /* renamed from: b */
    public void mo34433b(Window window) {
        try {
            this.f34989b.mo35921a(this.f34986X.mo35791k());
            this.f34994g.mo36507a(this.f34986X.mo35788h());
            this.f34986X.mo35796p();
            this.f34981F0 = this.f34993f.mo35180h(window.getDecorView());
            this.f34994g.mo36508b(window, this);
            this.f34999z.mo35676e("onDrawListener");
        } catch (Exception e) {
            this.f34999z.mo35674c("Something went wrong in onDrawListener.", e);
        }
    }

    /* renamed from: g */
    public final List<C14374ga> mo34434g(C14507le leVar, long j) {
        ArrayList arrayList = new ArrayList();
        for (C14502lc c : this.f34982G0) {
            arrayList.addAll(c.mo35239c(leVar, j));
        }
        return arrayList;
    }

    /* renamed from: h */
    public final void mo34435h() {
        for (C14502lc c : this.f34982G0) {
            c.mo35240c();
        }
    }

    /* renamed from: j */
    public void mo34436j(C14507le leVar, long j, C14742t9.C14746d dVar) {
        this.f34989b.mo35923c(true);
        this.f34995v.mo36738i(leVar, dVar, this.f34991d);
        dVar.mo36516f();
        List<C14374ga> g = mo34434g(leVar, j);
        if (!g.isEmpty()) {
            this.f34996w.mo36374f();
            if (this.f34996w.mo36372d()) {
                mo34435h();
                this.f34995v.mo36740k();
                this.f34995v.mo36732c();
            }
            mo34437k(new C14753te(g, this.f34996w.mo36372d(), this.f34996w.mo36371c(), this.f34996w.mo36370b(), this.f34996w.mo36369a()));
        }
        this.f34989b.mo35923c(false);
    }

    /* renamed from: k */
    public void mo34437k(C14753te teVar) {
        this.f34997x.mo35399b(teVar);
        List<C14430id> b = this.f34987Y.mo36974b(teVar, this.f34997x);
        if (!b.isEmpty()) {
            C14227be.m61069a(new C14141b(this, b));
        }
    }

    /* renamed from: m */
    public void mo34438m(boolean z) {
        this.f34983H0.mo36128b(z);
        Activity a = this.f34998y.mo36415a();
        if (a != null) {
            this.f34990c.mo36979b(a);
            this.f34990c.mo36982e();
        }
        this.f34992e.mo36026a();
        this.f34984I0.getLifecycle().mo57464a(this.f34985J0);
    }

    /* renamed from: n */
    public final void mo34439n(C14742t9.C14746d dVar) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.f34986X.mo35797q();
            if (this.f34981F0 != null) {
                this.f34999z.mo35676e("Switching to cpu thread");
                mo34441q(this.f34981F0, currentTimeMillis, dVar);
            }
        } catch (Exception e) {
            this.f34999z.mo35674c("Something went wrong on completeUiThreadProcess.", e);
        }
    }

    /* renamed from: p */
    public void mo34440p() {
        C14227be.m61069a(new C14142c(this, this.f34987Y.mo36973a(this.f34997x)));
    }

    /* renamed from: q */
    public void mo34441q(C14507le leVar, long j, C14742t9.C14746d dVar) {
        C14379gd.m61918a(new C14140a(this, leVar, j, dVar));
    }

    /* renamed from: r */
    public void mo34442r() {
        for (C14502lc a : this.f34982G0) {
            a.mo35238a();
        }
        this.f34992e.mo36027b();
        this.f34990c.mo36983f();
        this.f34995v.mo36740k();
        this.f34984I0.getLifecycle().mo57467d(this.f34985J0);
    }

    public SessionReplayProcessor(C14531mc mcVar, C14930zc zcVar, C14565o2 o2Var, C14341fa faVar, C14693s1 s1Var, C14383gg ggVar, C14742t9 t9Var, C14832wa waVar, C14424i9 i9Var, C14709se seVar, C14487l lVar, C14927za zaVar, C14279dd ddVar, List<C14502lc> list, C14602p pVar, C14802vb vbVar, C14453jf jfVar, C19499w wVar) {
        this.f34985J0 = new C19427i() {
            public void onStop(C19499w wVar) {
                SessionReplayProcessor.this.mo34440p();
            }
        };
        this.f34989b = mcVar;
        this.f34990c = zcVar;
        zcVar.mo36981d(this);
        zcVar.mo36980c(mcVar);
        this.f34995v = waVar;
        this.f34993f = faVar;
        this.f34992e = o2Var;
        this.f34996w = s1Var;
        this.f34997x = ggVar;
        this.f34994g = t9Var;
        this.f34991d = i9Var;
        this.f34998y = seVar;
        this.f34987Y = zaVar;
        this.f34988Z = ddVar;
        this.f34982G0 = list;
        this.f34983H0 = pVar;
        this.f34980E0 = vbVar;
        this.f34999z = jfVar;
        this.f34984I0 = wVar;
        this.f34986X = lVar;
    }
}
