package com.google.firebase.messaging;

import androidx.annotation.C0323b0;
import androidx.collection.C1866a;
import com.google.android.gms.tasks.C31047k;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.v0 */
public class C33251v0 {

    /* renamed from: a */
    public final Executor f80843a;
    @C0323b0("this")

    /* renamed from: b */
    public final Map<String, C31047k<String>> f80844b = new C1866a();

    /* renamed from: com.google.firebase.messaging.v0$a */
    public interface C33252a {
        C31047k<String> start();
    }

    public C33251v0(Executor executor) {
        this.f80843a = executor;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ C31047k m134106c(String str, C31047k kVar) throws Exception {
        synchronized (this) {
            this.f80844b.remove(str);
        }
        return kVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        return r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.google.android.gms.tasks.C31047k<java.lang.String> mo96208b(java.lang.String r3, com.google.firebase.messaging.C33251v0.C33252a r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.Map<java.lang.String, com.google.android.gms.tasks.k<java.lang.String>> r0 = r2.f80844b     // Catch:{ all -> 0x004e }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x004e }
            com.google.android.gms.tasks.k r0 = (com.google.android.gms.tasks.C31047k) r0     // Catch:{ all -> 0x004e }
            r1 = 3
            if (r0 == 0) goto L_0x0023
            java.lang.String r4 = "FirebaseMessaging"
            boolean r4 = android.util.Log.isLoggable(r4, r1)     // Catch:{ all -> 0x004e }
            if (r4 == 0) goto L_0x0021
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x004e }
            r4.<init>()     // Catch:{ all -> 0x004e }
            java.lang.String r1 = "Joining ongoing request for: "
            r4.append(r1)     // Catch:{ all -> 0x004e }
            r4.append(r3)     // Catch:{ all -> 0x004e }
        L_0x0021:
            monitor-exit(r2)
            return r0
        L_0x0023:
            java.lang.String r0 = "FirebaseMessaging"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x0038
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x004e }
            r0.<init>()     // Catch:{ all -> 0x004e }
            java.lang.String r1 = "Making new request for: "
            r0.append(r1)     // Catch:{ all -> 0x004e }
            r0.append(r3)     // Catch:{ all -> 0x004e }
        L_0x0038:
            com.google.android.gms.tasks.k r4 = r4.start()     // Catch:{ all -> 0x004e }
            java.util.concurrent.Executor r0 = r2.f80843a     // Catch:{ all -> 0x004e }
            com.google.firebase.messaging.u0 r1 = new com.google.firebase.messaging.u0     // Catch:{ all -> 0x004e }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x004e }
            com.google.android.gms.tasks.k r4 = r4.mo87732p(r0, r1)     // Catch:{ all -> 0x004e }
            java.util.Map<java.lang.String, com.google.android.gms.tasks.k<java.lang.String>> r0 = r2.f80844b     // Catch:{ all -> 0x004e }
            r0.put(r3, r4)     // Catch:{ all -> 0x004e }
            monitor-exit(r2)
            return r4
        L_0x004e:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C33251v0.mo96208b(java.lang.String, com.google.firebase.messaging.v0$a):com.google.android.gms.tasks.k");
    }
}
