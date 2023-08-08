package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.C0359n0;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: androidx.localbroadcastmanager.content.a */
public final class C19552a {

    /* renamed from: f */
    public static final String f49985f = "LocalBroadcastManager";

    /* renamed from: g */
    public static final boolean f49986g = false;

    /* renamed from: h */
    public static final int f49987h = 1;

    /* renamed from: i */
    public static final Object f49988i = new Object();

    /* renamed from: j */
    public static C19552a f49989j;

    /* renamed from: a */
    public final Context f49990a;

    /* renamed from: b */
    public final HashMap<BroadcastReceiver, ArrayList<C19555c>> f49991b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, ArrayList<C19555c>> f49992c = new HashMap<>();

    /* renamed from: d */
    public final ArrayList<C19554b> f49993d = new ArrayList<>();

    /* renamed from: e */
    public final Handler f49994e;

    /* renamed from: androidx.localbroadcastmanager.content.a$a */
    public class C19553a extends Handler {
        public C19553a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                C19552a.this.mo57833a();
            }
        }
    }

    /* renamed from: androidx.localbroadcastmanager.content.a$b */
    public static final class C19554b {

        /* renamed from: a */
        public final Intent f49996a;

        /* renamed from: b */
        public final ArrayList<C19555c> f49997b;

        public C19554b(Intent intent, ArrayList<C19555c> arrayList) {
            this.f49996a = intent;
            this.f49997b = arrayList;
        }
    }

    /* renamed from: androidx.localbroadcastmanager.content.a$c */
    public static final class C19555c {

        /* renamed from: a */
        public final IntentFilter f49998a;

        /* renamed from: b */
        public final BroadcastReceiver f49999b;

        /* renamed from: c */
        public boolean f50000c;

        /* renamed from: d */
        public boolean f50001d;

        public C19555c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f49998a = intentFilter;
            this.f49999b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f49999b);
            sb.append(" filter=");
            sb.append(this.f49998a);
            if (this.f50001d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public C19552a(Context context) {
        this.f49990a = context;
        this.f49994e = new C19553a(context.getMainLooper());
    }

    @C0359n0
    /* renamed from: b */
    public static C19552a m91036b(@C0359n0 Context context) {
        C19552a aVar;
        synchronized (f49988i) {
            if (f49989j == null) {
                f49989j = new C19552a(context.getApplicationContext());
            }
            aVar = f49989j;
        }
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r3 >= r1) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        r4 = r2[r3];
        r5 = r4.f49997b.size();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r6 >= r5) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        r7 = r4.f49997b.get(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r7.f50001d != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        r7.f49999b.onReceive(r10.f49990a, r4.f49996a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r3 = 0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo57833a() {
        /*
            r10 = this;
        L_0x0000:
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<androidx.localbroadcastmanager.content.a$c>> r0 = r10.f49991b
            monitor-enter(r0)
            java.util.ArrayList<androidx.localbroadcastmanager.content.a$b> r1 = r10.f49993d     // Catch:{ all -> 0x0044 }
            int r1 = r1.size()     // Catch:{ all -> 0x0044 }
            if (r1 > 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            return
        L_0x000d:
            androidx.localbroadcastmanager.content.a$b[] r2 = new androidx.localbroadcastmanager.content.C19552a.C19554b[r1]     // Catch:{ all -> 0x0044 }
            java.util.ArrayList<androidx.localbroadcastmanager.content.a$b> r3 = r10.f49993d     // Catch:{ all -> 0x0044 }
            r3.toArray(r2)     // Catch:{ all -> 0x0044 }
            java.util.ArrayList<androidx.localbroadcastmanager.content.a$b> r3 = r10.f49993d     // Catch:{ all -> 0x0044 }
            r3.clear()     // Catch:{ all -> 0x0044 }
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            r0 = 0
            r3 = r0
        L_0x001c:
            if (r3 >= r1) goto L_0x0000
            r4 = r2[r3]
            java.util.ArrayList<androidx.localbroadcastmanager.content.a$c> r5 = r4.f49997b
            int r5 = r5.size()
            r6 = r0
        L_0x0027:
            if (r6 >= r5) goto L_0x0041
            java.util.ArrayList<androidx.localbroadcastmanager.content.a$c> r7 = r4.f49997b
            java.lang.Object r7 = r7.get(r6)
            androidx.localbroadcastmanager.content.a$c r7 = (androidx.localbroadcastmanager.content.C19552a.C19555c) r7
            boolean r8 = r7.f50001d
            if (r8 != 0) goto L_0x003e
            android.content.BroadcastReceiver r7 = r7.f49999b
            android.content.Context r8 = r10.f49990a
            android.content.Intent r9 = r4.f49996a
            r7.onReceive(r8, r9)
        L_0x003e:
            int r6 = r6 + 1
            goto L_0x0027
        L_0x0041:
            int r3 = r3 + 1
            goto L_0x001c
        L_0x0044:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.localbroadcastmanager.content.C19552a.mo57833a():void");
    }

    /* renamed from: c */
    public void mo57834c(@C0359n0 BroadcastReceiver broadcastReceiver, @C0359n0 IntentFilter intentFilter) {
        synchronized (this.f49991b) {
            C19555c cVar = new C19555c(intentFilter, broadcastReceiver);
            ArrayList arrayList = this.f49991b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f49991b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = this.f49992c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.f49992c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013f, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0141, code lost:
        return false;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo57835d(@androidx.annotation.C0359n0 android.content.Intent r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<androidx.localbroadcastmanager.content.a$c>> r2 = r1.f49991b
            monitor-enter(r2)
            java.lang.String r10 = r23.getAction()     // Catch:{ all -> 0x0143 }
            android.content.Context r3 = r1.f49990a     // Catch:{ all -> 0x0143 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ all -> 0x0143 }
            java.lang.String r11 = r0.resolveTypeIfNeeded(r3)     // Catch:{ all -> 0x0143 }
            android.net.Uri r12 = r23.getData()     // Catch:{ all -> 0x0143 }
            java.lang.String r13 = r23.getScheme()     // Catch:{ all -> 0x0143 }
            java.util.Set r14 = r23.getCategories()     // Catch:{ all -> 0x0143 }
            int r3 = r23.getFlags()     // Catch:{ all -> 0x0143 }
            r3 = r3 & 8
            r9 = 1
            if (r3 == 0) goto L_0x002d
            r16 = r9
            goto L_0x002f
        L_0x002d:
            r16 = 0
        L_0x002f:
            if (r16 == 0) goto L_0x004e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0143 }
            r3.<init>()     // Catch:{ all -> 0x0143 }
            java.lang.String r4 = "Resolving type "
            r3.append(r4)     // Catch:{ all -> 0x0143 }
            r3.append(r11)     // Catch:{ all -> 0x0143 }
            java.lang.String r4 = " scheme "
            r3.append(r4)     // Catch:{ all -> 0x0143 }
            r3.append(r13)     // Catch:{ all -> 0x0143 }
            java.lang.String r4 = " of intent "
            r3.append(r4)     // Catch:{ all -> 0x0143 }
            r3.append(r0)     // Catch:{ all -> 0x0143 }
        L_0x004e:
            java.util.HashMap<java.lang.String, java.util.ArrayList<androidx.localbroadcastmanager.content.a$c>> r3 = r1.f49992c     // Catch:{ all -> 0x0143 }
            java.lang.String r4 = r23.getAction()     // Catch:{ all -> 0x0143 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x0143 }
            r8 = r3
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x0143 }
            if (r8 == 0) goto L_0x0140
            if (r16 == 0) goto L_0x006c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0143 }
            r3.<init>()     // Catch:{ all -> 0x0143 }
            java.lang.String r4 = "Action list: "
            r3.append(r4)     // Catch:{ all -> 0x0143 }
            r3.append(r8)     // Catch:{ all -> 0x0143 }
        L_0x006c:
            r3 = 0
            r7 = r3
            r6 = 0
        L_0x006f:
            int r3 = r8.size()     // Catch:{ all -> 0x0143 }
            if (r6 >= r3) goto L_0x0110
            java.lang.Object r3 = r8.get(r6)     // Catch:{ all -> 0x0143 }
            r5 = r3
            androidx.localbroadcastmanager.content.a$c r5 = (androidx.localbroadcastmanager.content.C19552a.C19555c) r5     // Catch:{ all -> 0x0143 }
            if (r16 == 0) goto L_0x008d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0143 }
            r3.<init>()     // Catch:{ all -> 0x0143 }
            java.lang.String r4 = "Matching against filter "
            r3.append(r4)     // Catch:{ all -> 0x0143 }
            android.content.IntentFilter r4 = r5.f49998a     // Catch:{ all -> 0x0143 }
            r3.append(r4)     // Catch:{ all -> 0x0143 }
        L_0x008d:
            boolean r3 = r5.f50000c     // Catch:{ all -> 0x0143 }
            if (r3 == 0) goto L_0x009d
            r18 = r6
            r20 = r8
            r19 = r10
            r21 = r11
            r10 = r7
            r11 = r9
            goto L_0x0104
        L_0x009d:
            android.content.IntentFilter r3 = r5.f49998a     // Catch:{ all -> 0x0143 }
            java.lang.String r17 = "LocalBroadcastManager"
            r4 = r10
            r15 = r5
            r5 = r11
            r18 = r6
            r6 = r13
            r19 = r10
            r10 = r7
            r7 = r12
            r20 = r8
            r8 = r14
            r21 = r11
            r11 = r9
            r9 = r17
            int r3 = r3.match(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0143 }
            if (r3 < 0) goto L_0x00db
            if (r16 == 0) goto L_0x00cc
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0143 }
            r4.<init>()     // Catch:{ all -> 0x0143 }
            java.lang.String r5 = "  Filter matched!  match=0x"
            r4.append(r5)     // Catch:{ all -> 0x0143 }
            java.lang.String r3 = java.lang.Integer.toHexString(r3)     // Catch:{ all -> 0x0143 }
            r4.append(r3)     // Catch:{ all -> 0x0143 }
        L_0x00cc:
            if (r10 != 0) goto L_0x00d4
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0143 }
            r7.<init>()     // Catch:{ all -> 0x0143 }
            goto L_0x00d5
        L_0x00d4:
            r7 = r10
        L_0x00d5:
            r7.add(r15)     // Catch:{ all -> 0x0143 }
            r15.f50000c = r11     // Catch:{ all -> 0x0143 }
            goto L_0x0105
        L_0x00db:
            if (r16 == 0) goto L_0x0104
            r4 = -4
            if (r3 == r4) goto L_0x00f5
            r4 = -3
            if (r3 == r4) goto L_0x00f2
            r4 = -2
            if (r3 == r4) goto L_0x00ef
            r4 = -1
            if (r3 == r4) goto L_0x00ec
            java.lang.String r3 = "unknown reason"
            goto L_0x00f7
        L_0x00ec:
            java.lang.String r3 = "type"
            goto L_0x00f7
        L_0x00ef:
            java.lang.String r3 = "data"
            goto L_0x00f7
        L_0x00f2:
            java.lang.String r3 = "action"
            goto L_0x00f7
        L_0x00f5:
            java.lang.String r3 = "category"
        L_0x00f7:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0143 }
            r4.<init>()     // Catch:{ all -> 0x0143 }
            java.lang.String r5 = "  Filter did not match: "
            r4.append(r5)     // Catch:{ all -> 0x0143 }
            r4.append(r3)     // Catch:{ all -> 0x0143 }
        L_0x0104:
            r7 = r10
        L_0x0105:
            int r6 = r18 + 1
            r9 = r11
            r10 = r19
            r8 = r20
            r11 = r21
            goto L_0x006f
        L_0x0110:
            r10 = r7
            r11 = r9
            if (r10 == 0) goto L_0x0140
            r3 = 0
        L_0x0115:
            int r4 = r10.size()     // Catch:{ all -> 0x0143 }
            if (r3 >= r4) goto L_0x0127
            java.lang.Object r4 = r10.get(r3)     // Catch:{ all -> 0x0143 }
            androidx.localbroadcastmanager.content.a$c r4 = (androidx.localbroadcastmanager.content.C19552a.C19555c) r4     // Catch:{ all -> 0x0143 }
            r5 = 0
            r4.f50000c = r5     // Catch:{ all -> 0x0143 }
            int r3 = r3 + 1
            goto L_0x0115
        L_0x0127:
            java.util.ArrayList<androidx.localbroadcastmanager.content.a$b> r3 = r1.f49993d     // Catch:{ all -> 0x0143 }
            androidx.localbroadcastmanager.content.a$b r4 = new androidx.localbroadcastmanager.content.a$b     // Catch:{ all -> 0x0143 }
            r4.<init>(r0, r10)     // Catch:{ all -> 0x0143 }
            r3.add(r4)     // Catch:{ all -> 0x0143 }
            android.os.Handler r0 = r1.f49994e     // Catch:{ all -> 0x0143 }
            boolean r0 = r0.hasMessages(r11)     // Catch:{ all -> 0x0143 }
            if (r0 != 0) goto L_0x013e
            android.os.Handler r0 = r1.f49994e     // Catch:{ all -> 0x0143 }
            r0.sendEmptyMessage(r11)     // Catch:{ all -> 0x0143 }
        L_0x013e:
            monitor-exit(r2)     // Catch:{ all -> 0x0143 }
            return r11
        L_0x0140:
            monitor-exit(r2)     // Catch:{ all -> 0x0143 }
            r0 = 0
            return r0
        L_0x0143:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0143 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.localbroadcastmanager.content.C19552a.mo57835d(android.content.Intent):boolean");
    }

    /* renamed from: e */
    public void mo57836e(@C0359n0 Intent intent) {
        if (mo57835d(intent)) {
            mo57833a();
        }
    }

    /* renamed from: f */
    public void mo57837f(@C0359n0 BroadcastReceiver broadcastReceiver) {
        synchronized (this.f49991b) {
            ArrayList remove = this.f49991b.remove(broadcastReceiver);
            if (remove != null) {
                for (int size = remove.size() - 1; size >= 0; size--) {
                    C19555c cVar = (C19555c) remove.get(size);
                    cVar.f50001d = true;
                    for (int i = 0; i < cVar.f49998a.countActions(); i++) {
                        String action = cVar.f49998a.getAction(i);
                        ArrayList arrayList = this.f49992c.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                C19555c cVar2 = (C19555c) arrayList.get(size2);
                                if (cVar2.f49999b == broadcastReceiver) {
                                    cVar2.f50001d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.f49992c.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }
}
