package com.contentsquare.android.sdk;

import java.util.LinkedList;
import java.util.List;

/* renamed from: com.contentsquare.android.sdk.za */
public class C14927za {

    /* renamed from: a */
    public final int f37005a;

    /* renamed from: b */
    public final long f37006b;

    /* renamed from: c */
    public C14430id f37007c;

    public C14927za() {
        this(524288, 5000);
    }

    /* renamed from: a */
    public synchronized C14430id mo36973a(C14383gg ggVar) {
        C14430id idVar;
        idVar = this.f37007c;
        ggVar.mo35403f();
        this.f37007c = C14430id.m62114b(ggVar.mo35400c());
        return idVar;
    }

    /* renamed from: b */
    public synchronized List<C14430id> mo36974b(C14753te teVar, C14383gg ggVar) {
        LinkedList linkedList;
        linkedList = new LinkedList();
        mo36975c(ggVar, linkedList, teVar);
        List<C14374ga> b = teVar.mo36534b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            C14374ga gaVar = b.get(i);
            if (gaVar != null && !this.f37007c.mo35551f(gaVar, this.f37005a)) {
                ggVar.mo35403f();
                mo36976d(ggVar.mo35400c(), linkedList);
                this.f37007c.mo35550e(gaVar);
            }
        }
        return linkedList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36975c(com.contentsquare.android.sdk.C14383gg r10, java.util.List<com.contentsquare.android.sdk.C14430id> r11, com.contentsquare.android.sdk.C14753te r12) {
        /*
            r9 = this;
            java.lang.String r0 = r10.mo35400c()
            com.contentsquare.android.sdk.id r1 = r9.f37007c
            java.lang.String r1 = r1.mo35549c()
            boolean r1 = r1.equals(r0)
            r2 = 1
            r1 = r1 ^ r2
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r9.f37006b
            com.contentsquare.android.sdk.id r7 = r9.f37007c
            long r7 = r7.mo35552g()
            long r5 = r5 + r7
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            if (r1 == 0) goto L_0x0029
        L_0x0025:
            r9.mo36976d(r0, r11)
            goto L_0x0033
        L_0x0029:
            if (r2 == 0) goto L_0x0033
            r10.mo35403f()
            java.lang.String r0 = r10.mo35400c()
            goto L_0x0025
        L_0x0033:
            boolean r0 = r12.mo36533a()
            if (r0 == 0) goto L_0x004f
            long r0 = r12.mo36535c()
            r2 = 1
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 <= 0) goto L_0x004f
            com.contentsquare.android.sdk.yd r12 = new com.contentsquare.android.sdk.yd
            java.lang.String r10 = r10.mo35398a()
            r12.<init>(r10)
            r11.add(r12)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14927za.mo36975c(com.contentsquare.android.sdk.gg, java.util.List, com.contentsquare.android.sdk.te):void");
    }

    /* renamed from: d */
    public final void mo36976d(String str, List<C14430id> list) {
        if (!this.f37007c.mo35553h()) {
            list.add(this.f37007c);
        }
        this.f37007c = C14430id.m62114b(str);
    }

    public C14927za(int i, long j) {
        this.f37005a = i;
        this.f37006b = j;
        this.f37007c = C14430id.m62114b("");
    }
}
