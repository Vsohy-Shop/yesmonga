package androidx.work.impl.model;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.collection.C1866a;
import androidx.lifecycle.LiveData;
import androidx.room.C20400v1;
import androidx.room.RoomDatabase;
import androidx.room.util.C20376a;
import androidx.room.util.C20378b;
import androidx.room.util.C20382e;
import androidx.sqlite.p031db.C20489i;
import androidx.work.C21091d;
import androidx.work.impl.model.C21249u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: androidx.work.impl.model.h */
public final class C21227h implements C21226g {

    /* renamed from: a */
    public final RoomDatabase f54771a;

    /* renamed from: androidx.work.impl.model.h$a */
    public class C21228a implements Callable<List<C21249u.C21252c>> {

        /* renamed from: a */
        public final /* synthetic */ C20489i f54772a;

        public C21228a(C20489i iVar) {
            this.f54772a = iVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0096 A[Catch:{ all -> 0x0105 }] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0098 A[Catch:{ all -> 0x0105 }] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00a5 A[Catch:{ all -> 0x0105 }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00a8 A[Catch:{ all -> 0x0105 }] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00bd A[Catch:{ all -> 0x0105 }] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00c0 A[Catch:{ all -> 0x0105 }] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00cb A[Catch:{ all -> 0x0105 }] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00dc A[Catch:{ all -> 0x0105 }] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00ef A[Catch:{ all -> 0x0105 }] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00f4 A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.List<androidx.work.impl.model.C21249u.C21252c> call() throws java.lang.Exception {
            /*
                r21 = this;
                r1 = r21
                androidx.work.impl.model.h r0 = androidx.work.impl.model.C21227h.this
                androidx.room.RoomDatabase r0 = r0.f54771a
                androidx.sqlite.db.i r2 = r1.f54772a
                r3 = 1
                r4 = 0
                android.database.Cursor r2 = androidx.room.util.C20378b.m95145f(r0, r2, r3, r4)
                java.lang.String r0 = "id"
                int r0 = androidx.room.util.C20376a.m95136d(r2, r0)     // Catch:{ all -> 0x0105 }
                java.lang.String r3 = "state"
                int r3 = androidx.room.util.C20376a.m95136d(r2, r3)     // Catch:{ all -> 0x0105 }
                java.lang.String r5 = "output"
                int r5 = androidx.room.util.C20376a.m95136d(r2, r5)     // Catch:{ all -> 0x0105 }
                java.lang.String r6 = "run_attempt_count"
                int r6 = androidx.room.util.C20376a.m95136d(r2, r6)     // Catch:{ all -> 0x0105 }
                java.lang.String r7 = "generation"
                int r7 = androidx.room.util.C20376a.m95136d(r2, r7)     // Catch:{ all -> 0x0105 }
                androidx.collection.a r8 = new androidx.collection.a     // Catch:{ all -> 0x0105 }
                r8.<init>()     // Catch:{ all -> 0x0105 }
                androidx.collection.a r9 = new androidx.collection.a     // Catch:{ all -> 0x0105 }
                r9.<init>()     // Catch:{ all -> 0x0105 }
            L_0x0038:
                boolean r10 = r2.moveToNext()     // Catch:{ all -> 0x0105 }
                if (r10 == 0) goto L_0x0067
                java.lang.String r10 = r2.getString(r0)     // Catch:{ all -> 0x0105 }
                java.lang.Object r11 = r8.get(r10)     // Catch:{ all -> 0x0105 }
                java.util.ArrayList r11 = (java.util.ArrayList) r11     // Catch:{ all -> 0x0105 }
                if (r11 != 0) goto L_0x0052
                java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0105 }
                r11.<init>()     // Catch:{ all -> 0x0105 }
                r8.put(r10, r11)     // Catch:{ all -> 0x0105 }
            L_0x0052:
                java.lang.String r10 = r2.getString(r0)     // Catch:{ all -> 0x0105 }
                java.lang.Object r11 = r9.get(r10)     // Catch:{ all -> 0x0105 }
                java.util.ArrayList r11 = (java.util.ArrayList) r11     // Catch:{ all -> 0x0105 }
                if (r11 != 0) goto L_0x0038
                java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0105 }
                r11.<init>()     // Catch:{ all -> 0x0105 }
                r9.put(r10, r11)     // Catch:{ all -> 0x0105 }
                goto L_0x0038
            L_0x0067:
                r10 = -1
                r2.moveToPosition(r10)     // Catch:{ all -> 0x0105 }
                androidx.work.impl.model.h r11 = androidx.work.impl.model.C21227h.this     // Catch:{ all -> 0x0105 }
                r11.mo63413d(r8)     // Catch:{ all -> 0x0105 }
                androidx.work.impl.model.h r11 = androidx.work.impl.model.C21227h.this     // Catch:{ all -> 0x0105 }
                r11.mo63412c(r9)     // Catch:{ all -> 0x0105 }
                java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0105 }
                int r12 = r2.getCount()     // Catch:{ all -> 0x0105 }
                r11.<init>(r12)     // Catch:{ all -> 0x0105 }
            L_0x007e:
                boolean r12 = r2.moveToNext()     // Catch:{ all -> 0x0105 }
                if (r12 == 0) goto L_0x0101
                if (r0 != r10) goto L_0x0088
            L_0x0086:
                r14 = r4
                goto L_0x0094
            L_0x0088:
                boolean r12 = r2.isNull(r0)     // Catch:{ all -> 0x0105 }
                if (r12 == 0) goto L_0x008f
                goto L_0x0086
            L_0x008f:
                java.lang.String r12 = r2.getString(r0)     // Catch:{ all -> 0x0105 }
                r14 = r12
            L_0x0094:
                if (r3 != r10) goto L_0x0098
                r15 = r4
                goto L_0x00a3
            L_0x0098:
                int r12 = r2.getInt(r3)     // Catch:{ all -> 0x0105 }
                androidx.work.impl.model.b0 r13 = androidx.work.impl.model.C21212b0.f54739a     // Catch:{ all -> 0x0105 }
                androidx.work.WorkInfo$State r12 = androidx.work.impl.model.C21212b0.m98013f(r12)     // Catch:{ all -> 0x0105 }
                r15 = r12
            L_0x00a3:
                if (r5 != r10) goto L_0x00a8
                r16 = r4
                goto L_0x00ba
            L_0x00a8:
                boolean r12 = r2.isNull(r5)     // Catch:{ all -> 0x0105 }
                if (r12 == 0) goto L_0x00b0
                r12 = r4
                goto L_0x00b4
            L_0x00b0:
                byte[] r12 = r2.getBlob(r5)     // Catch:{ all -> 0x0105 }
            L_0x00b4:
                androidx.work.d r12 = androidx.work.C21091d.m97587m(r12)     // Catch:{ all -> 0x0105 }
                r16 = r12
            L_0x00ba:
                r12 = 0
                if (r6 != r10) goto L_0x00c0
                r17 = r12
                goto L_0x00c6
            L_0x00c0:
                int r13 = r2.getInt(r6)     // Catch:{ all -> 0x0105 }
                r17 = r13
            L_0x00c6:
                if (r7 != r10) goto L_0x00cb
            L_0x00c8:
                r18 = r12
                goto L_0x00d0
            L_0x00cb:
                int r12 = r2.getInt(r7)     // Catch:{ all -> 0x0105 }
                goto L_0x00c8
            L_0x00d0:
                java.lang.String r12 = r2.getString(r0)     // Catch:{ all -> 0x0105 }
                java.lang.Object r12 = r8.get(r12)     // Catch:{ all -> 0x0105 }
                java.util.ArrayList r12 = (java.util.ArrayList) r12     // Catch:{ all -> 0x0105 }
                if (r12 != 0) goto L_0x00e1
                java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x0105 }
                r12.<init>()     // Catch:{ all -> 0x0105 }
            L_0x00e1:
                r19 = r12
                java.lang.String r12 = r2.getString(r0)     // Catch:{ all -> 0x0105 }
                java.lang.Object r12 = r9.get(r12)     // Catch:{ all -> 0x0105 }
                java.util.ArrayList r12 = (java.util.ArrayList) r12     // Catch:{ all -> 0x0105 }
                if (r12 != 0) goto L_0x00f4
                java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x0105 }
                r12.<init>()     // Catch:{ all -> 0x0105 }
            L_0x00f4:
                r20 = r12
                androidx.work.impl.model.u$c r12 = new androidx.work.impl.model.u$c     // Catch:{ all -> 0x0105 }
                r13 = r12
                r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0105 }
                r11.add(r12)     // Catch:{ all -> 0x0105 }
                goto L_0x007e
            L_0x0101:
                r2.close()
                return r11
            L_0x0105:
                r0 = move-exception
                r2.close()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.C21227h.C21228a.call():java.util.List");
        }
    }

    public C21227h(RoomDatabase roomDatabase) {
        this.f54771a = roomDatabase;
    }

    /* renamed from: h */
    public static List<Class<?>> m98050h() {
        return Collections.emptyList();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0093 A[Catch:{ all -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0095 A[Catch:{ all -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a2 A[Catch:{ all -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a5 A[Catch:{ all -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ba A[Catch:{ all -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bd A[Catch:{ all -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c8 A[Catch:{ all -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d9 A[Catch:{ all -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ec A[Catch:{ all -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f1 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<androidx.work.impl.model.C21249u.C21252c> mo63410a(androidx.sqlite.p031db.C20489i r22) {
        /*
            r21 = this;
            r1 = r21
            androidx.room.RoomDatabase r0 = r1.f54771a
            r0.mo60904d()
            androidx.room.RoomDatabase r0 = r1.f54771a
            r2 = 1
            r3 = 0
            r4 = r22
            android.database.Cursor r2 = androidx.room.util.C20378b.m95145f(r0, r4, r2, r3)
            java.lang.String r0 = "id"
            int r0 = androidx.room.util.C20376a.m95136d(r2, r0)     // Catch:{ all -> 0x0102 }
            java.lang.String r4 = "state"
            int r4 = androidx.room.util.C20376a.m95136d(r2, r4)     // Catch:{ all -> 0x0102 }
            java.lang.String r5 = "output"
            int r5 = androidx.room.util.C20376a.m95136d(r2, r5)     // Catch:{ all -> 0x0102 }
            java.lang.String r6 = "run_attempt_count"
            int r6 = androidx.room.util.C20376a.m95136d(r2, r6)     // Catch:{ all -> 0x0102 }
            java.lang.String r7 = "generation"
            int r7 = androidx.room.util.C20376a.m95136d(r2, r7)     // Catch:{ all -> 0x0102 }
            androidx.collection.a r8 = new androidx.collection.a     // Catch:{ all -> 0x0102 }
            r8.<init>()     // Catch:{ all -> 0x0102 }
            androidx.collection.a r9 = new androidx.collection.a     // Catch:{ all -> 0x0102 }
            r9.<init>()     // Catch:{ all -> 0x0102 }
        L_0x0039:
            boolean r10 = r2.moveToNext()     // Catch:{ all -> 0x0102 }
            if (r10 == 0) goto L_0x0068
            java.lang.String r10 = r2.getString(r0)     // Catch:{ all -> 0x0102 }
            java.lang.Object r11 = r8.get(r10)     // Catch:{ all -> 0x0102 }
            java.util.ArrayList r11 = (java.util.ArrayList) r11     // Catch:{ all -> 0x0102 }
            if (r11 != 0) goto L_0x0053
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0102 }
            r11.<init>()     // Catch:{ all -> 0x0102 }
            r8.put(r10, r11)     // Catch:{ all -> 0x0102 }
        L_0x0053:
            java.lang.String r10 = r2.getString(r0)     // Catch:{ all -> 0x0102 }
            java.lang.Object r11 = r9.get(r10)     // Catch:{ all -> 0x0102 }
            java.util.ArrayList r11 = (java.util.ArrayList) r11     // Catch:{ all -> 0x0102 }
            if (r11 != 0) goto L_0x0039
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0102 }
            r11.<init>()     // Catch:{ all -> 0x0102 }
            r9.put(r10, r11)     // Catch:{ all -> 0x0102 }
            goto L_0x0039
        L_0x0068:
            r10 = -1
            r2.moveToPosition(r10)     // Catch:{ all -> 0x0102 }
            r1.mo63413d(r8)     // Catch:{ all -> 0x0102 }
            r1.mo63412c(r9)     // Catch:{ all -> 0x0102 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0102 }
            int r12 = r2.getCount()     // Catch:{ all -> 0x0102 }
            r11.<init>(r12)     // Catch:{ all -> 0x0102 }
        L_0x007b:
            boolean r12 = r2.moveToNext()     // Catch:{ all -> 0x0102 }
            if (r12 == 0) goto L_0x00fe
            if (r0 != r10) goto L_0x0085
        L_0x0083:
            r14 = r3
            goto L_0x0091
        L_0x0085:
            boolean r12 = r2.isNull(r0)     // Catch:{ all -> 0x0102 }
            if (r12 == 0) goto L_0x008c
            goto L_0x0083
        L_0x008c:
            java.lang.String r12 = r2.getString(r0)     // Catch:{ all -> 0x0102 }
            r14 = r12
        L_0x0091:
            if (r4 != r10) goto L_0x0095
            r15 = r3
            goto L_0x00a0
        L_0x0095:
            int r12 = r2.getInt(r4)     // Catch:{ all -> 0x0102 }
            androidx.work.impl.model.b0 r13 = androidx.work.impl.model.C21212b0.f54739a     // Catch:{ all -> 0x0102 }
            androidx.work.WorkInfo$State r12 = androidx.work.impl.model.C21212b0.m98013f(r12)     // Catch:{ all -> 0x0102 }
            r15 = r12
        L_0x00a0:
            if (r5 != r10) goto L_0x00a5
            r16 = r3
            goto L_0x00b7
        L_0x00a5:
            boolean r12 = r2.isNull(r5)     // Catch:{ all -> 0x0102 }
            if (r12 == 0) goto L_0x00ad
            r12 = r3
            goto L_0x00b1
        L_0x00ad:
            byte[] r12 = r2.getBlob(r5)     // Catch:{ all -> 0x0102 }
        L_0x00b1:
            androidx.work.d r12 = androidx.work.C21091d.m97587m(r12)     // Catch:{ all -> 0x0102 }
            r16 = r12
        L_0x00b7:
            r12 = 0
            if (r6 != r10) goto L_0x00bd
            r17 = r12
            goto L_0x00c3
        L_0x00bd:
            int r13 = r2.getInt(r6)     // Catch:{ all -> 0x0102 }
            r17 = r13
        L_0x00c3:
            if (r7 != r10) goto L_0x00c8
        L_0x00c5:
            r18 = r12
            goto L_0x00cd
        L_0x00c8:
            int r12 = r2.getInt(r7)     // Catch:{ all -> 0x0102 }
            goto L_0x00c5
        L_0x00cd:
            java.lang.String r12 = r2.getString(r0)     // Catch:{ all -> 0x0102 }
            java.lang.Object r12 = r8.get(r12)     // Catch:{ all -> 0x0102 }
            java.util.ArrayList r12 = (java.util.ArrayList) r12     // Catch:{ all -> 0x0102 }
            if (r12 != 0) goto L_0x00de
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x0102 }
            r12.<init>()     // Catch:{ all -> 0x0102 }
        L_0x00de:
            r19 = r12
            java.lang.String r12 = r2.getString(r0)     // Catch:{ all -> 0x0102 }
            java.lang.Object r12 = r9.get(r12)     // Catch:{ all -> 0x0102 }
            java.util.ArrayList r12 = (java.util.ArrayList) r12     // Catch:{ all -> 0x0102 }
            if (r12 != 0) goto L_0x00f1
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x0102 }
            r12.<init>()     // Catch:{ all -> 0x0102 }
        L_0x00f1:
            r20 = r12
            androidx.work.impl.model.u$c r12 = new androidx.work.impl.model.u$c     // Catch:{ all -> 0x0102 }
            r13 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0102 }
            r11.add(r12)     // Catch:{ all -> 0x0102 }
            goto L_0x007b
        L_0x00fe:
            r2.close()
            return r11
        L_0x0102:
            r0 = move-exception
            r2.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.C21227h.mo63410a(androidx.sqlite.db.i):java.util.List");
    }

    /* renamed from: b */
    public LiveData<List<C21249u.C21252c>> mo63411b(C20489i iVar) {
        return this.f54771a.mo60912p().mo61015e(new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, false, new C21228a(iVar));
    }

    /* renamed from: c */
    public final void mo63412c(C1866a<String, ArrayList<C21091d>> aVar) {
        byte[] bArr;
        Set<String> keySet = aVar.keySet();
        if (!keySet.isEmpty()) {
            if (aVar.size() > 999) {
                C1866a aVar2 = new C1866a(999);
                int size = aVar.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    aVar2.put(aVar.mo6334j(i), aVar.mo6338o(i));
                    i++;
                    i2++;
                    if (i2 == 999) {
                        mo63412c(aVar2);
                        aVar2 = new C1866a(999);
                        i2 = 0;
                    }
                }
                if (i2 > 0) {
                    mo63412c(aVar2);
                    return;
                }
                return;
            }
            StringBuilder d = C20382e.m95158d();
            d.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
            int size2 = keySet.size();
            C20382e.m95155a(d, size2);
            d.append(")");
            C20400v1 d2 = C20400v1.m95183d(d.toString(), size2 + 0);
            int i3 = 1;
            for (String next : keySet) {
                if (next == null) {
                    d2.mo60800u3(i3);
                } else {
                    d2.mo60801v2(i3, next);
                }
                i3++;
            }
            Cursor f = C20378b.m95145f(this.f54771a, d2, false, (CancellationSignal) null);
            try {
                int d3 = C20376a.m95136d(f, "work_spec_id");
                if (d3 != -1) {
                    while (f.moveToNext()) {
                        ArrayList arrayList = aVar.get(f.getString(d3));
                        if (arrayList != null) {
                            if (f.isNull(0)) {
                                bArr = null;
                            } else {
                                bArr = f.getBlob(0);
                            }
                            arrayList.add(C21091d.m97587m(bArr));
                        }
                    }
                    f.close();
                }
            } finally {
                f.close();
            }
        }
    }

    /* renamed from: d */
    public final void mo63413d(C1866a<String, ArrayList<String>> aVar) {
        String str;
        Set<String> keySet = aVar.keySet();
        if (!keySet.isEmpty()) {
            if (aVar.size() > 999) {
                C1866a aVar2 = new C1866a(999);
                int size = aVar.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    aVar2.put(aVar.mo6334j(i), aVar.mo6338o(i));
                    i++;
                    i2++;
                    if (i2 == 999) {
                        mo63413d(aVar2);
                        aVar2 = new C1866a(999);
                        i2 = 0;
                    }
                }
                if (i2 > 0) {
                    mo63413d(aVar2);
                    return;
                }
                return;
            }
            StringBuilder d = C20382e.m95158d();
            d.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
            int size2 = keySet.size();
            C20382e.m95155a(d, size2);
            d.append(")");
            C20400v1 d2 = C20400v1.m95183d(d.toString(), size2 + 0);
            int i3 = 1;
            for (String next : keySet) {
                if (next == null) {
                    d2.mo60800u3(i3);
                } else {
                    d2.mo60801v2(i3, next);
                }
                i3++;
            }
            Cursor f = C20378b.m95145f(this.f54771a, d2, false, (CancellationSignal) null);
            try {
                int d3 = C20376a.m95136d(f, "work_spec_id");
                if (d3 != -1) {
                    while (f.moveToNext()) {
                        ArrayList arrayList = aVar.get(f.getString(d3));
                        if (arrayList != null) {
                            if (f.isNull(0)) {
                                str = null;
                            } else {
                                str = f.getString(0);
                            }
                            arrayList.add(str);
                        }
                    }
                    f.close();
                }
            } finally {
                f.close();
            }
        }
    }
}
