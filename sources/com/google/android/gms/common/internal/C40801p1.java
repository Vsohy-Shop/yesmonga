package com.google.android.gms.common.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.common.C41114p;

/* renamed from: com.google.android.gms.common.internal.p1 */
public final class C40801p1 extends C41114p {

    /* renamed from: a */
    public final /* synthetic */ C40747e f103909a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40801p1(C40747e eVar, Looper looper) {
        super(looper);
        this.f103909a = eVar;
    }

    /* renamed from: a */
    public static final void m165985a(Message message) {
        C40804q1 q1Var = (C40804q1) message.obj;
        q1Var.mo134377b();
        q1Var.mo134461e();
    }

    /* renamed from: b */
    public static final boolean m165986b(Message message) {
        int i = message.what;
        return i == 2 || i == 1 || i == 7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            com.google.android.gms.common.internal.e r0 = r7.f103909a
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f103814E
            int r0 = r0.get()
            int r1 = r8.arg1
            if (r0 == r1) goto L_0x0016
            boolean r0 = m165986b(r8)
            if (r0 == 0) goto L_0x0015
            m165985a(r8)
        L_0x0015:
            return
        L_0x0016:
            int r0 = r8.what
            r1 = 4
            r2 = 1
            r3 = 5
            if (r0 == r2) goto L_0x002e
            r4 = 7
            if (r0 == r4) goto L_0x002e
            if (r0 != r1) goto L_0x002a
            com.google.android.gms.common.internal.e r0 = r7.f103909a
            boolean r0 = r0.mo134330B()
            if (r0 == 0) goto L_0x002e
        L_0x002a:
            int r0 = r8.what
            if (r0 != r3) goto L_0x0036
        L_0x002e:
            com.google.android.gms.common.internal.e r0 = r7.f103909a
            boolean r0 = r0.mo134357e()
            if (r0 == 0) goto L_0x0120
        L_0x0036:
            int r0 = r8.what
            r4 = 8
            r5 = 3
            r6 = 0
            if (r0 != r1) goto L_0x007e
            com.google.android.gms.common.internal.e r0 = r7.f103909a
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            int r8 = r8.arg2
            r1.<init>(r8)
            r0.f103811B = r1
            com.google.android.gms.common.internal.e r8 = r7.f103909a
            boolean r8 = com.google.android.gms.common.internal.C40747e.m165799p0(r8)
            if (r8 == 0) goto L_0x005f
            com.google.android.gms.common.internal.e r8 = r7.f103909a
            boolean r0 = r8.f103812C
            if (r0 == 0) goto L_0x005b
            goto L_0x005f
        L_0x005b:
            r8.mo134367q0(r5, (android.os.IInterface) null)
            return
        L_0x005f:
            com.google.android.gms.common.internal.e r8 = r7.f103909a
            com.google.android.gms.common.ConnectionResult r0 = r8.f103811B
            if (r0 == 0) goto L_0x006c
            com.google.android.gms.common.ConnectionResult r8 = r8.f103811B
            goto L_0x0071
        L_0x006c:
            com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
            r8.<init>(r4)
        L_0x0071:
            com.google.android.gms.common.internal.e r0 = r7.f103909a
            com.google.android.gms.common.internal.e$c r0 = r0.f103830r
            r0.mo134010a(r8)
            com.google.android.gms.common.internal.e r0 = r7.f103909a
            r0.mo134346U(r8)
            return
        L_0x007e:
            if (r0 != r3) goto L_0x009f
            com.google.android.gms.common.internal.e r8 = r7.f103909a
            com.google.android.gms.common.ConnectionResult r0 = r8.f103811B
            if (r0 == 0) goto L_0x008d
            com.google.android.gms.common.ConnectionResult r8 = r8.f103811B
            goto L_0x0092
        L_0x008d:
            com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
            r8.<init>(r4)
        L_0x0092:
            com.google.android.gms.common.internal.e r0 = r7.f103909a
            com.google.android.gms.common.internal.e$c r0 = r0.f103830r
            r0.mo134010a(r8)
            com.google.android.gms.common.internal.e r0 = r7.f103909a
            r0.mo134346U(r8)
            return
        L_0x009f:
            if (r0 != r5) goto L_0x00be
            java.lang.Object r0 = r8.obj
            boolean r1 = r0 instanceof android.app.PendingIntent
            if (r1 == 0) goto L_0x00aa
            r6 = r0
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
        L_0x00aa:
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            int r8 = r8.arg2
            r0.<init>(r8, r6)
            com.google.android.gms.common.internal.e r8 = r7.f103909a
            com.google.android.gms.common.internal.e$c r8 = r8.f103830r
            r8.mo134010a(r0)
            com.google.android.gms.common.internal.e r8 = r7.f103909a
            r8.mo134346U(r0)
            return
        L_0x00be:
            r1 = 6
            if (r0 != r1) goto L_0x00e4
            com.google.android.gms.common.internal.e r0 = r7.f103909a
            r0.mo134367q0(r3, (android.os.IInterface) null)
            com.google.android.gms.common.internal.e r0 = r7.f103909a
            com.google.android.gms.common.internal.e$a r1 = r0.f103835w
            if (r1 == 0) goto L_0x00d7
            com.google.android.gms.common.internal.e$a r0 = r0.f103835w
            int r1 = r8.arg2
            r0.mo86926H0(r1)
        L_0x00d7:
            com.google.android.gms.common.internal.e r0 = r7.f103909a
            int r8 = r8.arg2
            r0.mo134347V(r8)
            com.google.android.gms.common.internal.e r8 = r7.f103909a
            com.google.android.gms.common.internal.C40747e.m165798o0(r8, r3, r2, r6)
            return
        L_0x00e4:
            r1 = 2
            if (r0 != r1) goto L_0x00f4
            com.google.android.gms.common.internal.e r0 = r7.f103909a
            boolean r0 = r0.mo134352a()
            if (r0 == 0) goto L_0x00f0
            goto L_0x00f4
        L_0x00f0:
            m165985a(r8)
            return
        L_0x00f4:
            boolean r0 = m165986b(r8)
            if (r0 == 0) goto L_0x0102
            java.lang.Object r8 = r8.obj
            com.google.android.gms.common.internal.q1 r8 = (com.google.android.gms.common.internal.C40804q1) r8
            r8.mo134459c()
            return
        L_0x0102:
            int r8 = r8.what
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Don't know how to handle message: "
            r0.append(r1)
            r0.append(r8)
            java.lang.Exception r8 = new java.lang.Exception
            r8.<init>()
            java.lang.String r1 = "GmsClient"
            java.lang.String r0 = r0.toString()
            android.util.Log.wtf(r1, r0, r8)
            return
        L_0x0120:
            m165985a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C40801p1.handleMessage(android.os.Message):void");
    }
}
