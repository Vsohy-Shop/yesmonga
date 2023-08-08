package com.urbanairship.automation.storage;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.collection.C1866a;
import androidx.room.C20357q;
import androidx.room.C20361r;
import androidx.room.C20400v1;
import androidx.room.RoomDatabase;
import androidx.room.util.C20376a;
import androidx.room.util.C20378b;
import androidx.room.util.C20382e;
import androidx.sqlite.p031db.C20492k;
import com.urbanairship.json.C9334f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: com.urbanairship.automation.storage.c */
public final class C8939c extends C8937a {

    /* renamed from: a */
    public final RoomDatabase f23955a;

    /* renamed from: b */
    public final C20361r<C8954h> f23956b;

    /* renamed from: c */
    public final C9334f f23957c = new C9334f();

    /* renamed from: d */
    public final C8945d f23958d = new C8945d();

    /* renamed from: e */
    public final C20361r<C8956j> f23959e;

    /* renamed from: f */
    public final C20357q<C8954h> f23960f;

    /* renamed from: g */
    public final C20357q<C8954h> f23961g;

    /* renamed from: h */
    public final C20357q<C8956j> f23962h;

    /* renamed from: com.urbanairship.automation.storage.c$a */
    public class C8940a extends C20361r<C8954h> {
        public C8940a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "INSERT OR REPLACE INTO `schedules` (`id`,`scheduleId`,`group`,`metadata`,`limit`,`priority`,`scheduleStart`,`scheduleEnd`,`editGracePeriod`,`interval`,`scheduleType`,`data`,`count`,`executionState`,`executionStateChangeDate`,`triggerContext`,`appState`,`screens`,`seconds`,`regionId`,`audience`,`campaigns`,`reportingContext`,`frequencyConstraintIds`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: t */
        public void mo17583i(C20492k kVar, C8954h hVar) {
            kVar.mo60790S2(1, (long) hVar.f24010a);
            String str = hVar.f24011b;
            if (str == null) {
                kVar.mo60800u3(2);
            } else {
                kVar.mo60801v2(2, str);
            }
            String str2 = hVar.f24012c;
            if (str2 == null) {
                kVar.mo60800u3(3);
            } else {
                kVar.mo60801v2(3, str2);
            }
            String b = C8939c.this.f23957c.mo18844b(hVar.f24013d);
            if (b == null) {
                kVar.mo60800u3(4);
            } else {
                kVar.mo60801v2(4, b);
            }
            kVar.mo60790S2(5, (long) hVar.f24014e);
            kVar.mo60790S2(6, (long) hVar.f24015f);
            kVar.mo60790S2(7, hVar.f24016g);
            kVar.mo60790S2(8, hVar.f24017h);
            kVar.mo60790S2(9, hVar.f24018i);
            kVar.mo60790S2(10, hVar.f24019j);
            String str3 = hVar.f24020k;
            if (str3 == null) {
                kVar.mo60800u3(11);
            } else {
                kVar.mo60801v2(11, str3);
            }
            String f = C8939c.this.f23957c.mo18848f(hVar.f24021l);
            if (f == null) {
                kVar.mo60800u3(12);
            } else {
                kVar.mo60801v2(12, f);
            }
            kVar.mo60790S2(13, (long) hVar.f24022m);
            kVar.mo60790S2(14, (long) hVar.f24023n);
            kVar.mo60790S2(15, hVar.f24024o);
            String f2 = C8939c.this.f23958d.mo17669f(hVar.f24025p);
            if (f2 == null) {
                kVar.mo60800u3(16);
            } else {
                kVar.mo60801v2(16, f2);
            }
            kVar.mo60790S2(17, (long) hVar.f24026q);
            String c = C8945d.m33316c(hVar.f24027r);
            if (c == null) {
                kVar.mo60800u3(18);
            } else {
                kVar.mo60801v2(18, c);
            }
            kVar.mo60790S2(19, hVar.f24028s);
            String str4 = hVar.f24029t;
            if (str4 == null) {
                kVar.mo60800u3(20);
            } else {
                kVar.mo60801v2(20, str4);
            }
            String b2 = C8939c.this.f23958d.mo17667b(hVar.f24030u);
            if (b2 == null) {
                kVar.mo60800u3(21);
            } else {
                kVar.mo60801v2(21, b2);
            }
            String f3 = C8939c.this.f23957c.mo18848f(hVar.f24031v);
            if (f3 == null) {
                kVar.mo60800u3(22);
            } else {
                kVar.mo60801v2(22, f3);
            }
            String f4 = C8939c.this.f23957c.mo18848f(hVar.f24032w);
            if (f4 == null) {
                kVar.mo60800u3(23);
            } else {
                kVar.mo60801v2(23, f4);
            }
            String c2 = C8945d.m33316c(hVar.f24033x);
            if (c2 == null) {
                kVar.mo60800u3(24);
            } else {
                kVar.mo60801v2(24, c2);
            }
        }
    }

    /* renamed from: com.urbanairship.automation.storage.c$b */
    public class C8941b extends C20361r<C8956j> {
        public C8941b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "INSERT OR REPLACE INTO `triggers` (`id`,`triggerType`,`goal`,`jsonPredicate`,`isCancellation`,`progress`,`parentScheduleId`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
        }

        /* renamed from: t */
        public void mo17583i(C20492k kVar, C8956j jVar) {
            kVar.mo60790S2(1, (long) jVar.f24041a);
            kVar.mo60790S2(2, (long) jVar.f24042b);
            kVar.mo60788G0(3, jVar.f24043c);
            String d = C8939c.this.f23957c.mo18846d(jVar.f24044d);
            if (d == null) {
                kVar.mo60800u3(4);
            } else {
                kVar.mo60801v2(4, d);
            }
            kVar.mo60790S2(5, jVar.f24045e ? 1 : 0);
            kVar.mo60788G0(6, jVar.f24046f);
            String str = jVar.f24047g;
            if (str == null) {
                kVar.mo60800u3(7);
            } else {
                kVar.mo60801v2(7, str);
            }
        }
    }

    /* renamed from: com.urbanairship.automation.storage.c$c */
    public class C8942c extends C20357q<C8954h> {
        public C8942c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "DELETE FROM `schedules` WHERE `id` = ?";
        }

        /* renamed from: m */
        public void mo17586i(C20492k kVar, C8954h hVar) {
            kVar.mo60790S2(1, (long) hVar.f24010a);
        }
    }

    /* renamed from: com.urbanairship.automation.storage.c$d */
    public class C8943d extends C20357q<C8954h> {
        public C8943d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "UPDATE OR ABORT `schedules` SET `id` = ?,`scheduleId` = ?,`group` = ?,`metadata` = ?,`limit` = ?,`priority` = ?,`scheduleStart` = ?,`scheduleEnd` = ?,`editGracePeriod` = ?,`interval` = ?,`scheduleType` = ?,`data` = ?,`count` = ?,`executionState` = ?,`executionStateChangeDate` = ?,`triggerContext` = ?,`appState` = ?,`screens` = ?,`seconds` = ?,`regionId` = ?,`audience` = ?,`campaigns` = ?,`reportingContext` = ?,`frequencyConstraintIds` = ? WHERE `id` = ?";
        }

        /* renamed from: m */
        public void mo17586i(C20492k kVar, C8954h hVar) {
            kVar.mo60790S2(1, (long) hVar.f24010a);
            String str = hVar.f24011b;
            if (str == null) {
                kVar.mo60800u3(2);
            } else {
                kVar.mo60801v2(2, str);
            }
            String str2 = hVar.f24012c;
            if (str2 == null) {
                kVar.mo60800u3(3);
            } else {
                kVar.mo60801v2(3, str2);
            }
            String b = C8939c.this.f23957c.mo18844b(hVar.f24013d);
            if (b == null) {
                kVar.mo60800u3(4);
            } else {
                kVar.mo60801v2(4, b);
            }
            kVar.mo60790S2(5, (long) hVar.f24014e);
            kVar.mo60790S2(6, (long) hVar.f24015f);
            kVar.mo60790S2(7, hVar.f24016g);
            kVar.mo60790S2(8, hVar.f24017h);
            kVar.mo60790S2(9, hVar.f24018i);
            kVar.mo60790S2(10, hVar.f24019j);
            String str3 = hVar.f24020k;
            if (str3 == null) {
                kVar.mo60800u3(11);
            } else {
                kVar.mo60801v2(11, str3);
            }
            String f = C8939c.this.f23957c.mo18848f(hVar.f24021l);
            if (f == null) {
                kVar.mo60800u3(12);
            } else {
                kVar.mo60801v2(12, f);
            }
            kVar.mo60790S2(13, (long) hVar.f24022m);
            kVar.mo60790S2(14, (long) hVar.f24023n);
            kVar.mo60790S2(15, hVar.f24024o);
            String f2 = C8939c.this.f23958d.mo17669f(hVar.f24025p);
            if (f2 == null) {
                kVar.mo60800u3(16);
            } else {
                kVar.mo60801v2(16, f2);
            }
            kVar.mo60790S2(17, (long) hVar.f24026q);
            String c = C8945d.m33316c(hVar.f24027r);
            if (c == null) {
                kVar.mo60800u3(18);
            } else {
                kVar.mo60801v2(18, c);
            }
            kVar.mo60790S2(19, hVar.f24028s);
            String str4 = hVar.f24029t;
            if (str4 == null) {
                kVar.mo60800u3(20);
            } else {
                kVar.mo60801v2(20, str4);
            }
            String b2 = C8939c.this.f23958d.mo17667b(hVar.f24030u);
            if (b2 == null) {
                kVar.mo60800u3(21);
            } else {
                kVar.mo60801v2(21, b2);
            }
            String f3 = C8939c.this.f23957c.mo18848f(hVar.f24031v);
            if (f3 == null) {
                kVar.mo60800u3(22);
            } else {
                kVar.mo60801v2(22, f3);
            }
            String f4 = C8939c.this.f23957c.mo18848f(hVar.f24032w);
            if (f4 == null) {
                kVar.mo60800u3(23);
            } else {
                kVar.mo60801v2(23, f4);
            }
            String c2 = C8945d.m33316c(hVar.f24033x);
            if (c2 == null) {
                kVar.mo60800u3(24);
            } else {
                kVar.mo60801v2(24, c2);
            }
            kVar.mo60790S2(25, (long) hVar.f24010a);
        }
    }

    /* renamed from: com.urbanairship.automation.storage.c$e */
    public class C8944e extends C20357q<C8956j> {
        public C8944e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "UPDATE OR ABORT `triggers` SET `id` = ?,`triggerType` = ?,`goal` = ?,`jsonPredicate` = ?,`isCancellation` = ?,`progress` = ?,`parentScheduleId` = ? WHERE `id` = ?";
        }

        /* renamed from: m */
        public void mo17586i(C20492k kVar, C8956j jVar) {
            kVar.mo60790S2(1, (long) jVar.f24041a);
            kVar.mo60790S2(2, (long) jVar.f24042b);
            kVar.mo60788G0(3, jVar.f24043c);
            String d = C8939c.this.f23957c.mo18846d(jVar.f24044d);
            if (d == null) {
                kVar.mo60800u3(4);
            } else {
                kVar.mo60801v2(4, d);
            }
            kVar.mo60790S2(5, jVar.f24045e ? 1 : 0);
            kVar.mo60788G0(6, jVar.f24046f);
            String str = jVar.f24047g;
            if (str == null) {
                kVar.mo60800u3(7);
            } else {
                kVar.mo60801v2(7, str);
            }
            kVar.mo60790S2(8, (long) jVar.f24041a);
        }
    }

    public C8939c(RoomDatabase roomDatabase) {
        this.f23955a = roomDatabase;
        this.f23956b = new C8940a(roomDatabase);
        this.f23959e = new C8941b(roomDatabase);
        this.f23960f = new C8942c(roomDatabase);
        this.f23961g = new C8943d(roomDatabase);
        this.f23962h = new C8944e(roomDatabase);
    }

    /* renamed from: B */
    public static List<Class<?>> m33279B() {
        return Collections.emptyList();
    }

    /* renamed from: b */
    public void mo17638b(C8954h hVar) {
        this.f23955a.mo60904d();
        this.f23955a.mo60905e();
        try {
            this.f23960f.mo61150j(hVar);
            this.f23955a.mo60901O();
        } finally {
            this.f23955a.mo60908k();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0298 A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x029a A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02cc A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02d0 A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02ee A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02f3 A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0313 A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0317 A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0325 A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x032b A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0345 A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0349 A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x035f A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0363 A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0379 A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x037b A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x038b A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x039a A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x03a1 A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03a6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x022a A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x022e A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x023a A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x023e A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x024a A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x024e A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0288 A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x028c A[Catch:{ all -> 0x03e5 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.urbanairship.automation.storage.C8946e> mo17640d() {
        /*
            r33 = this;
            r1 = r33
            java.lang.String r0 = "SELECT * FROM schedules WHERE (executionState != 4) AND (scheduleEnd >= 0) AND (scheduleEnd <= strftime('%s', 'now') * 1000)"
            r2 = 0
            androidx.room.v1 r2 = androidx.room.C20400v1.m95183d(r0, r2)
            androidx.room.RoomDatabase r0 = r1.f23955a
            r0.mo60904d()
            androidx.room.RoomDatabase r0 = r1.f23955a
            r0.mo60905e()
            androidx.room.RoomDatabase r0 = r1.f23955a     // Catch:{ all -> 0x03f1 }
            r3 = 1
            r4 = 0
            android.database.Cursor r3 = androidx.room.util.C20378b.m95145f(r0, r2, r3, r4)     // Catch:{ all -> 0x03f1 }
            java.lang.String r0 = "id"
            int r0 = androidx.room.util.C20376a.m95137e(r3, r0)     // Catch:{ all -> 0x03e7 }
            java.lang.String r5 = "scheduleId"
            int r5 = androidx.room.util.C20376a.m95137e(r3, r5)     // Catch:{ all -> 0x03e7 }
            java.lang.String r6 = "group"
            int r6 = androidx.room.util.C20376a.m95137e(r3, r6)     // Catch:{ all -> 0x03e7 }
            java.lang.String r7 = "metadata"
            int r7 = androidx.room.util.C20376a.m95137e(r3, r7)     // Catch:{ all -> 0x03e7 }
            java.lang.String r8 = "limit"
            int r8 = androidx.room.util.C20376a.m95137e(r3, r8)     // Catch:{ all -> 0x03e7 }
            java.lang.String r9 = "priority"
            int r9 = androidx.room.util.C20376a.m95137e(r3, r9)     // Catch:{ all -> 0x03e7 }
            java.lang.String r10 = "scheduleStart"
            int r10 = androidx.room.util.C20376a.m95137e(r3, r10)     // Catch:{ all -> 0x03e7 }
            java.lang.String r11 = "scheduleEnd"
            int r11 = androidx.room.util.C20376a.m95137e(r3, r11)     // Catch:{ all -> 0x03e7 }
            java.lang.String r12 = "editGracePeriod"
            int r12 = androidx.room.util.C20376a.m95137e(r3, r12)     // Catch:{ all -> 0x03e7 }
            java.lang.String r13 = "interval"
            int r13 = androidx.room.util.C20376a.m95137e(r3, r13)     // Catch:{ all -> 0x03e7 }
            java.lang.String r14 = "scheduleType"
            int r14 = androidx.room.util.C20376a.m95137e(r3, r14)     // Catch:{ all -> 0x03e7 }
            java.lang.String r15 = "data"
            int r15 = androidx.room.util.C20376a.m95137e(r3, r15)     // Catch:{ all -> 0x03e7 }
            java.lang.String r4 = "count"
            int r4 = androidx.room.util.C20376a.m95137e(r3, r4)     // Catch:{ all -> 0x03e7 }
            r16 = r2
            java.lang.String r2 = "executionState"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03e5 }
            r17 = r2
            java.lang.String r2 = "executionStateChangeDate"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03e5 }
            r18 = r2
            java.lang.String r2 = "triggerContext"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03e5 }
            r19 = r2
            java.lang.String r2 = "appState"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03e5 }
            r20 = r2
            java.lang.String r2 = "screens"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03e5 }
            r21 = r2
            java.lang.String r2 = "seconds"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03e5 }
            r22 = r2
            java.lang.String r2 = "regionId"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03e5 }
            r23 = r2
            java.lang.String r2 = "audience"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03e5 }
            r24 = r2
            java.lang.String r2 = "campaigns"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03e5 }
            r25 = r2
            java.lang.String r2 = "reportingContext"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03e5 }
            r26 = r2
            java.lang.String r2 = "frequencyConstraintIds"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03e5 }
            r27 = r2
            androidx.collection.a r2 = new androidx.collection.a     // Catch:{ all -> 0x03e5 }
            r2.<init>()     // Catch:{ all -> 0x03e5 }
        L_0x00c8:
            boolean r28 = r3.moveToNext()     // Catch:{ all -> 0x03e5 }
            if (r28 == 0) goto L_0x00f4
            boolean r28 = r3.isNull(r5)     // Catch:{ all -> 0x03e5 }
            if (r28 != 0) goto L_0x00c8
            r28 = r4
            java.lang.String r4 = r3.getString(r5)     // Catch:{ all -> 0x03e5 }
            java.lang.Object r29 = r2.get(r4)     // Catch:{ all -> 0x03e5 }
            java.util.ArrayList r29 = (java.util.ArrayList) r29     // Catch:{ all -> 0x03e5 }
            if (r29 != 0) goto L_0x00ed
            r29 = r15
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x03e5 }
            r15.<init>()     // Catch:{ all -> 0x03e5 }
            r2.put(r4, r15)     // Catch:{ all -> 0x03e5 }
            goto L_0x00ef
        L_0x00ed:
            r29 = r15
        L_0x00ef:
            r4 = r28
            r15 = r29
            goto L_0x00c8
        L_0x00f4:
            r28 = r4
            r29 = r15
            r4 = -1
            r3.moveToPosition(r4)     // Catch:{ all -> 0x03e5 }
            r1.mo17660x(r2)     // Catch:{ all -> 0x03e5 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x03e5 }
            int r15 = r3.getCount()     // Catch:{ all -> 0x03e5 }
            r4.<init>(r15)     // Catch:{ all -> 0x03e5 }
        L_0x0108:
            boolean r15 = r3.moveToNext()     // Catch:{ all -> 0x03e5 }
            if (r15 == 0) goto L_0x03d3
            boolean r15 = r3.isNull(r0)     // Catch:{ all -> 0x03e5 }
            if (r15 == 0) goto L_0x020f
            boolean r15 = r3.isNull(r5)     // Catch:{ all -> 0x03e5 }
            if (r15 == 0) goto L_0x020f
            boolean r15 = r3.isNull(r6)     // Catch:{ all -> 0x03e5 }
            if (r15 == 0) goto L_0x020f
            boolean r15 = r3.isNull(r7)     // Catch:{ all -> 0x03e5 }
            if (r15 == 0) goto L_0x020f
            boolean r15 = r3.isNull(r8)     // Catch:{ all -> 0x03e5 }
            if (r15 == 0) goto L_0x020f
            boolean r15 = r3.isNull(r9)     // Catch:{ all -> 0x03e5 }
            if (r15 == 0) goto L_0x020f
            boolean r15 = r3.isNull(r10)     // Catch:{ all -> 0x03e5 }
            if (r15 == 0) goto L_0x020f
            boolean r15 = r3.isNull(r11)     // Catch:{ all -> 0x03e5 }
            if (r15 == 0) goto L_0x020f
            boolean r15 = r3.isNull(r12)     // Catch:{ all -> 0x03e5 }
            if (r15 == 0) goto L_0x020f
            boolean r15 = r3.isNull(r13)     // Catch:{ all -> 0x03e5 }
            if (r15 == 0) goto L_0x020f
            boolean r15 = r3.isNull(r14)     // Catch:{ all -> 0x03e5 }
            if (r15 == 0) goto L_0x020f
            r15 = r29
            boolean r29 = r3.isNull(r15)     // Catch:{ all -> 0x03e5 }
            if (r29 == 0) goto L_0x0211
            r29 = r4
            r4 = r28
            boolean r28 = r3.isNull(r4)     // Catch:{ all -> 0x03e5 }
            if (r28 == 0) goto L_0x0215
            r28 = r2
            r2 = r17
            boolean r17 = r3.isNull(r2)     // Catch:{ all -> 0x03e5 }
            if (r17 == 0) goto L_0x020c
            r17 = r2
            r2 = r18
            boolean r18 = r3.isNull(r2)     // Catch:{ all -> 0x03e5 }
            if (r18 == 0) goto L_0x0209
            r18 = r2
            r2 = r19
            boolean r19 = r3.isNull(r2)     // Catch:{ all -> 0x03e5 }
            if (r19 == 0) goto L_0x0206
            r19 = r2
            r2 = r20
            boolean r20 = r3.isNull(r2)     // Catch:{ all -> 0x03e5 }
            if (r20 == 0) goto L_0x0203
            r20 = r2
            r2 = r21
            boolean r21 = r3.isNull(r2)     // Catch:{ all -> 0x03e5 }
            if (r21 == 0) goto L_0x0200
            r21 = r2
            r2 = r22
            boolean r22 = r3.isNull(r2)     // Catch:{ all -> 0x03e5 }
            if (r22 == 0) goto L_0x01fd
            r22 = r2
            r2 = r23
            boolean r23 = r3.isNull(r2)     // Catch:{ all -> 0x03e5 }
            if (r23 == 0) goto L_0x01fa
            r23 = r2
            r2 = r24
            boolean r24 = r3.isNull(r2)     // Catch:{ all -> 0x03e5 }
            if (r24 == 0) goto L_0x01f7
            r24 = r2
            r2 = r25
            boolean r25 = r3.isNull(r2)     // Catch:{ all -> 0x03e5 }
            if (r25 == 0) goto L_0x01f4
            r25 = r2
            r2 = r26
            boolean r26 = r3.isNull(r2)     // Catch:{ all -> 0x03e5 }
            if (r26 == 0) goto L_0x01f1
            r26 = r2
            r2 = r27
            boolean r27 = r3.isNull(r2)     // Catch:{ all -> 0x03e5 }
            if (r27 != 0) goto L_0x01d3
            r27 = r2
            goto L_0x0217
        L_0x01d3:
            r31 = r0
            r0 = r2
            r30 = r4
            r2 = 0
            r32 = r17
            r17 = r6
            r6 = r23
            r23 = r7
            r7 = r24
            r24 = r22
            r22 = r21
            r21 = r20
            r20 = r19
            r19 = r18
            r18 = r32
            goto L_0x0385
        L_0x01f1:
            r26 = r2
            goto L_0x0217
        L_0x01f4:
            r25 = r2
            goto L_0x0217
        L_0x01f7:
            r24 = r2
            goto L_0x0217
        L_0x01fa:
            r23 = r2
            goto L_0x0217
        L_0x01fd:
            r22 = r2
            goto L_0x0217
        L_0x0200:
            r21 = r2
            goto L_0x0217
        L_0x0203:
            r20 = r2
            goto L_0x0217
        L_0x0206:
            r19 = r2
            goto L_0x0217
        L_0x0209:
            r18 = r2
            goto L_0x0217
        L_0x020c:
            r17 = r2
            goto L_0x0217
        L_0x020f:
            r15 = r29
        L_0x0211:
            r29 = r4
            r4 = r28
        L_0x0215:
            r28 = r2
        L_0x0217:
            com.urbanairship.automation.storage.h r2 = new com.urbanairship.automation.storage.h     // Catch:{ all -> 0x03e5 }
            r2.<init>()     // Catch:{ all -> 0x03e5 }
            r30 = r4
            int r4 = r3.getInt(r0)     // Catch:{ all -> 0x03e5 }
            r2.f24010a = r4     // Catch:{ all -> 0x03e5 }
            boolean r4 = r3.isNull(r5)     // Catch:{ all -> 0x03e5 }
            if (r4 == 0) goto L_0x022e
            r4 = 0
            r2.f24011b = r4     // Catch:{ all -> 0x03e5 }
            goto L_0x0234
        L_0x022e:
            java.lang.String r4 = r3.getString(r5)     // Catch:{ all -> 0x03e5 }
            r2.f24011b = r4     // Catch:{ all -> 0x03e5 }
        L_0x0234:
            boolean r4 = r3.isNull(r6)     // Catch:{ all -> 0x03e5 }
            if (r4 == 0) goto L_0x023e
            r4 = 0
            r2.f24012c = r4     // Catch:{ all -> 0x03e5 }
            goto L_0x0244
        L_0x023e:
            java.lang.String r4 = r3.getString(r6)     // Catch:{ all -> 0x03e5 }
            r2.f24012c = r4     // Catch:{ all -> 0x03e5 }
        L_0x0244:
            boolean r4 = r3.isNull(r7)     // Catch:{ all -> 0x03e5 }
            if (r4 == 0) goto L_0x024e
            r31 = r0
            r4 = 0
            goto L_0x0254
        L_0x024e:
            java.lang.String r4 = r3.getString(r7)     // Catch:{ all -> 0x03e5 }
            r31 = r0
        L_0x0254:
            com.urbanairship.json.f r0 = r1.f23957c     // Catch:{ all -> 0x03e5 }
            com.urbanairship.json.b r0 = r0.mo18843a(r4)     // Catch:{ all -> 0x03e5 }
            r2.f24013d = r0     // Catch:{ all -> 0x03e5 }
            int r0 = r3.getInt(r8)     // Catch:{ all -> 0x03e5 }
            r2.f24014e = r0     // Catch:{ all -> 0x03e5 }
            int r0 = r3.getInt(r9)     // Catch:{ all -> 0x03e5 }
            r2.f24015f = r0     // Catch:{ all -> 0x03e5 }
            r0 = r6
            r4 = r7
            long r6 = r3.getLong(r10)     // Catch:{ all -> 0x03e5 }
            r2.f24016g = r6     // Catch:{ all -> 0x03e5 }
            long r6 = r3.getLong(r11)     // Catch:{ all -> 0x03e5 }
            r2.f24017h = r6     // Catch:{ all -> 0x03e5 }
            long r6 = r3.getLong(r12)     // Catch:{ all -> 0x03e5 }
            r2.f24018i = r6     // Catch:{ all -> 0x03e5 }
            long r6 = r3.getLong(r13)     // Catch:{ all -> 0x03e5 }
            r2.f24019j = r6     // Catch:{ all -> 0x03e5 }
            boolean r6 = r3.isNull(r14)     // Catch:{ all -> 0x03e5 }
            if (r6 == 0) goto L_0x028c
            r6 = 0
            r2.f24020k = r6     // Catch:{ all -> 0x03e5 }
            goto L_0x0292
        L_0x028c:
            java.lang.String r6 = r3.getString(r14)     // Catch:{ all -> 0x03e5 }
            r2.f24020k = r6     // Catch:{ all -> 0x03e5 }
        L_0x0292:
            boolean r6 = r3.isNull(r15)     // Catch:{ all -> 0x03e5 }
            if (r6 == 0) goto L_0x029a
            r6 = 0
            goto L_0x029e
        L_0x029a:
            java.lang.String r6 = r3.getString(r15)     // Catch:{ all -> 0x03e5 }
        L_0x029e:
            com.urbanairship.json.f r7 = r1.f23957c     // Catch:{ all -> 0x03e5 }
            com.urbanairship.json.JsonValue r6 = r7.mo18847e(r6)     // Catch:{ all -> 0x03e5 }
            r2.f24021l = r6     // Catch:{ all -> 0x03e5 }
            r6 = r30
            int r7 = r3.getInt(r6)     // Catch:{ all -> 0x03e5 }
            r2.f24022m = r7     // Catch:{ all -> 0x03e5 }
            r7 = r17
            r17 = r0
            int r0 = r3.getInt(r7)     // Catch:{ all -> 0x03e5 }
            r2.f24023n = r0     // Catch:{ all -> 0x03e5 }
            r30 = r6
            r0 = r18
            r18 = r7
            long r6 = r3.getLong(r0)     // Catch:{ all -> 0x03e5 }
            r2.f24024o = r6     // Catch:{ all -> 0x03e5 }
            r6 = r19
            boolean r7 = r3.isNull(r6)     // Catch:{ all -> 0x03e5 }
            if (r7 == 0) goto L_0x02d0
            r19 = r0
            r7 = 0
            goto L_0x02d6
        L_0x02d0:
            java.lang.String r7 = r3.getString(r6)     // Catch:{ all -> 0x03e5 }
            r19 = r0
        L_0x02d6:
            com.urbanairship.automation.storage.d r0 = r1.f23958d     // Catch:{ all -> 0x03e5 }
            com.urbanairship.automation.d0 r0 = r0.mo17668e(r7)     // Catch:{ all -> 0x03e5 }
            r2.f24025p = r0     // Catch:{ all -> 0x03e5 }
            r0 = r20
            int r7 = r3.getInt(r0)     // Catch:{ all -> 0x03e5 }
            r2.f24026q = r7     // Catch:{ all -> 0x03e5 }
            r7 = r21
            boolean r20 = r3.isNull(r7)     // Catch:{ all -> 0x03e5 }
            if (r20 == 0) goto L_0x02f3
            r21 = r0
            r20 = 0
            goto L_0x02f9
        L_0x02f3:
            java.lang.String r20 = r3.getString(r7)     // Catch:{ all -> 0x03e5 }
            r21 = r0
        L_0x02f9:
            java.util.List r0 = com.urbanairship.automation.storage.C8945d.m33317d(r20)     // Catch:{ all -> 0x03e5 }
            r2.f24027r = r0     // Catch:{ all -> 0x03e5 }
            r20 = r6
            r0 = r22
            r22 = r7
            long r6 = r3.getLong(r0)     // Catch:{ all -> 0x03e5 }
            r2.f24028s = r6     // Catch:{ all -> 0x03e5 }
            r6 = r23
            boolean r7 = r3.isNull(r6)     // Catch:{ all -> 0x03e5 }
            if (r7 == 0) goto L_0x0317
            r7 = 0
            r2.f24029t = r7     // Catch:{ all -> 0x03e5 }
            goto L_0x031d
        L_0x0317:
            java.lang.String r7 = r3.getString(r6)     // Catch:{ all -> 0x03e5 }
            r2.f24029t = r7     // Catch:{ all -> 0x03e5 }
        L_0x031d:
            r7 = r24
            boolean r23 = r3.isNull(r7)     // Catch:{ all -> 0x03e5 }
            if (r23 == 0) goto L_0x032b
            r24 = r0
            r23 = r4
            r0 = 0
            goto L_0x0335
        L_0x032b:
            java.lang.String r23 = r3.getString(r7)     // Catch:{ all -> 0x03e5 }
            r24 = r0
            r0 = r23
            r23 = r4
        L_0x0335:
            com.urbanairship.automation.storage.d r4 = r1.f23958d     // Catch:{ all -> 0x03e5 }
            com.urbanairship.automation.b r0 = r4.mo17666a(r0)     // Catch:{ all -> 0x03e5 }
            r2.f24030u = r0     // Catch:{ all -> 0x03e5 }
            r0 = r25
            boolean r4 = r3.isNull(r0)     // Catch:{ all -> 0x03e5 }
            if (r4 == 0) goto L_0x0349
            r25 = r0
            r4 = 0
            goto L_0x034f
        L_0x0349:
            java.lang.String r4 = r3.getString(r0)     // Catch:{ all -> 0x03e5 }
            r25 = r0
        L_0x034f:
            com.urbanairship.json.f r0 = r1.f23957c     // Catch:{ all -> 0x03e5 }
            com.urbanairship.json.JsonValue r0 = r0.mo18847e(r4)     // Catch:{ all -> 0x03e5 }
            r2.f24031v = r0     // Catch:{ all -> 0x03e5 }
            r0 = r26
            boolean r4 = r3.isNull(r0)     // Catch:{ all -> 0x03e5 }
            if (r4 == 0) goto L_0x0363
            r26 = r0
            r4 = 0
            goto L_0x0369
        L_0x0363:
            java.lang.String r4 = r3.getString(r0)     // Catch:{ all -> 0x03e5 }
            r26 = r0
        L_0x0369:
            com.urbanairship.json.f r0 = r1.f23957c     // Catch:{ all -> 0x03e5 }
            com.urbanairship.json.JsonValue r0 = r0.mo18847e(r4)     // Catch:{ all -> 0x03e5 }
            r2.f24032w = r0     // Catch:{ all -> 0x03e5 }
            r0 = r27
            boolean r4 = r3.isNull(r0)     // Catch:{ all -> 0x03e5 }
            if (r4 == 0) goto L_0x037b
            r4 = 0
            goto L_0x037f
        L_0x037b:
            java.lang.String r4 = r3.getString(r0)     // Catch:{ all -> 0x03e5 }
        L_0x037f:
            java.util.List r4 = com.urbanairship.automation.storage.C8945d.m33317d(r4)     // Catch:{ all -> 0x03e5 }
            r2.f24033x = r4     // Catch:{ all -> 0x03e5 }
        L_0x0385:
            boolean r4 = r3.isNull(r5)     // Catch:{ all -> 0x03e5 }
            if (r4 != 0) goto L_0x039a
            java.lang.String r4 = r3.getString(r5)     // Catch:{ all -> 0x03e5 }
            r27 = r0
            r0 = r28
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x03e5 }
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ all -> 0x03e5 }
            goto L_0x039f
        L_0x039a:
            r27 = r0
            r0 = r28
            r4 = 0
        L_0x039f:
            if (r4 != 0) goto L_0x03a6
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x03e5 }
            r4.<init>()     // Catch:{ all -> 0x03e5 }
        L_0x03a6:
            r28 = r0
            com.urbanairship.automation.storage.e r0 = new com.urbanairship.automation.storage.e     // Catch:{ all -> 0x03e5 }
            r0.<init>(r2, r4)     // Catch:{ all -> 0x03e5 }
            r2 = r29
            r2.add(r0)     // Catch:{ all -> 0x03e5 }
            r4 = r2
            r29 = r15
            r2 = r28
            r28 = r30
            r0 = r31
            r32 = r23
            r23 = r6
            r6 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            r22 = r24
            r24 = r7
            r7 = r32
            goto L_0x0108
        L_0x03d3:
            r2 = r4
            androidx.room.RoomDatabase r0 = r1.f23955a     // Catch:{ all -> 0x03e5 }
            r0.mo60901O()     // Catch:{ all -> 0x03e5 }
            r3.close()     // Catch:{ all -> 0x03f1 }
            r16.release()     // Catch:{ all -> 0x03f1 }
            androidx.room.RoomDatabase r0 = r1.f23955a
            r0.mo60908k()
            return r2
        L_0x03e5:
            r0 = move-exception
            goto L_0x03ea
        L_0x03e7:
            r0 = move-exception
            r16 = r2
        L_0x03ea:
            r3.close()     // Catch:{ all -> 0x03f1 }
            r16.release()     // Catch:{ all -> 0x03f1 }
            throw r0     // Catch:{ all -> 0x03f1 }
        L_0x03f1:
            r0 = move-exception
            androidx.room.RoomDatabase r2 = r1.f23955a
            r2.mo60908k()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.automation.storage.C8939c.mo17640d():java.util.List");
    }

    /* renamed from: e */
    public List<C8956j> mo17641e(int i) {
        C20400v1 v1Var;
        String str;
        boolean z;
        C20400v1 d = C20400v1.m95183d("SELECT triggers.* FROM triggers JOIN schedules ON schedules.scheduleId = triggers.parentScheduleId AND (triggers.triggerType = ?) AND ((triggers.isCancellation = 1 AND + schedules.executionState IN (1,5,6))OR (triggers.isCancellation = 0 AND + schedules.executionState = 0))AND (schedules.scheduleStart < 0 OR schedules.scheduleStart <= strftime('%s', 'now') * 1000)", 1);
        d.mo60790S2(1, (long) i);
        this.f23955a.mo60904d();
        Cursor f = C20378b.m95145f(this.f23955a, d, false, (CancellationSignal) null);
        try {
            int e = C20376a.m95137e(f, "id");
            int e2 = C20376a.m95137e(f, "triggerType");
            int e3 = C20376a.m95137e(f, "goal");
            int e4 = C20376a.m95137e(f, "jsonPredicate");
            int e5 = C20376a.m95137e(f, "isCancellation");
            int e6 = C20376a.m95137e(f, "progress");
            int e7 = C20376a.m95137e(f, "parentScheduleId");
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                C8956j jVar = new C8956j();
                jVar.f24041a = f.getInt(e);
                jVar.f24042b = f.getInt(e2);
                v1Var = d;
                try {
                    jVar.f24043c = f.getDouble(e3);
                    if (f.isNull(e4)) {
                        str = null;
                    } else {
                        str = f.getString(e4);
                    }
                    jVar.f24044d = this.f23957c.mo18845c(str);
                    if (f.getInt(e5) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    jVar.f24045e = z;
                    jVar.f24046f = f.getDouble(e6);
                    if (f.isNull(e7)) {
                        jVar.f24047g = null;
                    } else {
                        jVar.f24047g = f.getString(e7);
                    }
                    arrayList.add(jVar);
                    d = v1Var;
                } catch (Throwable th) {
                    th = th;
                    f.close();
                    v1Var.release();
                    throw th;
                }
            }
            f.close();
            d.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            v1Var = d;
            f.close();
            v1Var.release();
            throw th;
        }
    }

    /* renamed from: f */
    public List<C8956j> mo17642f(int i, String str) {
        String str2;
        boolean z;
        String str3 = str;
        C20400v1 d = C20400v1.m95183d("SELECT triggers.* FROM triggers JOIN schedules ON schedules.scheduleId = triggers.parentScheduleId WHERE (schedules.scheduleId = ?)AND (triggers.triggerType = ?) AND ((triggers.isCancellation = 1 AND + schedules.executionState IN (1,5,6))OR (triggers.isCancellation = 0 AND + schedules.executionState = 0))AND (schedules.scheduleStart < 0 OR schedules.scheduleStart <= strftime('%s', 'now') * 1000)", 2);
        if (str3 == null) {
            d.mo60800u3(1);
        } else {
            d.mo60801v2(1, str3);
        }
        d.mo60790S2(2, (long) i);
        this.f23955a.mo60904d();
        Cursor f = C20378b.m95145f(this.f23955a, d, false, (CancellationSignal) null);
        try {
            int e = C20376a.m95137e(f, "id");
            int e2 = C20376a.m95137e(f, "triggerType");
            int e3 = C20376a.m95137e(f, "goal");
            int e4 = C20376a.m95137e(f, "jsonPredicate");
            int e5 = C20376a.m95137e(f, "isCancellation");
            int e6 = C20376a.m95137e(f, "progress");
            int e7 = C20376a.m95137e(f, "parentScheduleId");
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                C8956j jVar = new C8956j();
                jVar.f24041a = f.getInt(e);
                jVar.f24042b = f.getInt(e2);
                jVar.f24043c = f.getDouble(e3);
                if (f.isNull(e4)) {
                    str2 = null;
                } else {
                    str2 = f.getString(e4);
                }
                jVar.f24044d = this.f23957c.mo18845c(str2);
                if (f.getInt(e5) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                jVar.f24045e = z;
                jVar.f24046f = f.getDouble(e6);
                if (f.isNull(e7)) {
                    jVar.f24047g = null;
                } else {
                    jVar.f24047g = f.getString(e7);
                }
                arrayList.add(jVar);
            }
            return arrayList;
        } finally {
            f.close();
            d.release();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v43, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v46, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v49, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v52, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v55, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v57, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v59, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v61, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v39, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v76, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v77, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v78, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v79, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0266 A[Catch:{ all -> 0x0370 }] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x026a A[Catch:{ all -> 0x0370 }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0276 A[Catch:{ all -> 0x0370 }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0278 A[Catch:{ all -> 0x0370 }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02a2 A[Catch:{ all -> 0x0370 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02a4 A[Catch:{ all -> 0x0370 }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02c0 A[Catch:{ all -> 0x0370 }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02c2 A[Catch:{ all -> 0x0370 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02dc A[Catch:{ all -> 0x0370 }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02e0 A[Catch:{ all -> 0x0370 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02ef A[Catch:{ all -> 0x0370 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02f1 A[Catch:{ all -> 0x0370 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0305 A[Catch:{ all -> 0x0370 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0307 A[Catch:{ all -> 0x0370 }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x031b A[Catch:{ all -> 0x0370 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x031d A[Catch:{ all -> 0x0370 }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0331 A[Catch:{ all -> 0x0370 }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0333 A[Catch:{ all -> 0x0370 }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0343 A[Catch:{ all -> 0x0370 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0352 A[Catch:{ all -> 0x0370 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x020e A[Catch:{ all -> 0x0370 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0212 A[Catch:{ all -> 0x0370 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x021e A[Catch:{ all -> 0x0370 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0222 A[Catch:{ all -> 0x0370 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x022e A[Catch:{ all -> 0x0370 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0230 A[Catch:{ all -> 0x0370 }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.urbanairship.automation.storage.C8946e mo17643g(java.lang.String r31) {
        /*
            r30 = this;
            r1 = r30
            r0 = r31
            java.lang.String r2 = "SELECT * FROM schedules WHERE (scheduleId == ?)"
            r3 = 1
            androidx.room.v1 r2 = androidx.room.C20400v1.m95183d(r2, r3)
            if (r0 != 0) goto L_0x0011
            r2.mo60800u3(r3)
            goto L_0x0014
        L_0x0011:
            r2.mo60801v2(r3, r0)
        L_0x0014:
            androidx.room.RoomDatabase r0 = r1.f23955a
            r0.mo60904d()
            androidx.room.RoomDatabase r0 = r1.f23955a
            r0.mo60905e()
            androidx.room.RoomDatabase r0 = r1.f23955a     // Catch:{ all -> 0x037c }
            r4 = 0
            android.database.Cursor r3 = androidx.room.util.C20378b.m95145f(r0, r2, r3, r4)     // Catch:{ all -> 0x037c }
            java.lang.String r0 = "id"
            int r0 = androidx.room.util.C20376a.m95137e(r3, r0)     // Catch:{ all -> 0x0372 }
            java.lang.String r5 = "scheduleId"
            int r5 = androidx.room.util.C20376a.m95137e(r3, r5)     // Catch:{ all -> 0x0372 }
            java.lang.String r6 = "group"
            int r6 = androidx.room.util.C20376a.m95137e(r3, r6)     // Catch:{ all -> 0x0372 }
            java.lang.String r7 = "metadata"
            int r7 = androidx.room.util.C20376a.m95137e(r3, r7)     // Catch:{ all -> 0x0372 }
            java.lang.String r8 = "limit"
            int r8 = androidx.room.util.C20376a.m95137e(r3, r8)     // Catch:{ all -> 0x0372 }
            java.lang.String r9 = "priority"
            int r9 = androidx.room.util.C20376a.m95137e(r3, r9)     // Catch:{ all -> 0x0372 }
            java.lang.String r10 = "scheduleStart"
            int r10 = androidx.room.util.C20376a.m95137e(r3, r10)     // Catch:{ all -> 0x0372 }
            java.lang.String r11 = "scheduleEnd"
            int r11 = androidx.room.util.C20376a.m95137e(r3, r11)     // Catch:{ all -> 0x0372 }
            java.lang.String r12 = "editGracePeriod"
            int r12 = androidx.room.util.C20376a.m95137e(r3, r12)     // Catch:{ all -> 0x0372 }
            java.lang.String r13 = "interval"
            int r13 = androidx.room.util.C20376a.m95137e(r3, r13)     // Catch:{ all -> 0x0372 }
            java.lang.String r14 = "scheduleType"
            int r14 = androidx.room.util.C20376a.m95137e(r3, r14)     // Catch:{ all -> 0x0372 }
            java.lang.String r15 = "data"
            int r15 = androidx.room.util.C20376a.m95137e(r3, r15)     // Catch:{ all -> 0x0372 }
            java.lang.String r4 = "count"
            int r4 = androidx.room.util.C20376a.m95137e(r3, r4)     // Catch:{ all -> 0x0372 }
            r16 = r2
            java.lang.String r2 = "executionState"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x0370 }
            r17 = r2
            java.lang.String r2 = "executionStateChangeDate"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x0370 }
            r18 = r2
            java.lang.String r2 = "triggerContext"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x0370 }
            r19 = r2
            java.lang.String r2 = "appState"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x0370 }
            r20 = r2
            java.lang.String r2 = "screens"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x0370 }
            r21 = r2
            java.lang.String r2 = "seconds"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x0370 }
            r22 = r2
            java.lang.String r2 = "regionId"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x0370 }
            r23 = r2
            java.lang.String r2 = "audience"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x0370 }
            r24 = r2
            java.lang.String r2 = "campaigns"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x0370 }
            r25 = r2
            java.lang.String r2 = "reportingContext"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x0370 }
            r26 = r2
            java.lang.String r2 = "frequencyConstraintIds"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x0370 }
            r27 = r2
            androidx.collection.a r2 = new androidx.collection.a     // Catch:{ all -> 0x0370 }
            r2.<init>()     // Catch:{ all -> 0x0370 }
        L_0x00d2:
            boolean r28 = r3.moveToNext()     // Catch:{ all -> 0x0370 }
            if (r28 == 0) goto L_0x00fe
            boolean r28 = r3.isNull(r5)     // Catch:{ all -> 0x0370 }
            if (r28 != 0) goto L_0x00d2
            r28 = r4
            java.lang.String r4 = r3.getString(r5)     // Catch:{ all -> 0x0370 }
            java.lang.Object r29 = r2.get(r4)     // Catch:{ all -> 0x0370 }
            java.util.ArrayList r29 = (java.util.ArrayList) r29     // Catch:{ all -> 0x0370 }
            if (r29 != 0) goto L_0x00f7
            r29 = r15
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x0370 }
            r15.<init>()     // Catch:{ all -> 0x0370 }
            r2.put(r4, r15)     // Catch:{ all -> 0x0370 }
            goto L_0x00f9
        L_0x00f7:
            r29 = r15
        L_0x00f9:
            r4 = r28
            r15 = r29
            goto L_0x00d2
        L_0x00fe:
            r28 = r4
            r29 = r15
            r4 = -1
            r3.moveToPosition(r4)     // Catch:{ all -> 0x0370 }
            r1.mo17660x(r2)     // Catch:{ all -> 0x0370 }
            boolean r4 = r3.moveToFirst()     // Catch:{ all -> 0x0370 }
            if (r4 == 0) goto L_0x035e
            boolean r4 = r3.isNull(r0)     // Catch:{ all -> 0x0370 }
            if (r4 == 0) goto L_0x01f7
            boolean r4 = r3.isNull(r5)     // Catch:{ all -> 0x0370 }
            if (r4 == 0) goto L_0x01f7
            boolean r4 = r3.isNull(r6)     // Catch:{ all -> 0x0370 }
            if (r4 == 0) goto L_0x01f7
            boolean r4 = r3.isNull(r7)     // Catch:{ all -> 0x0370 }
            if (r4 == 0) goto L_0x01f7
            boolean r4 = r3.isNull(r8)     // Catch:{ all -> 0x0370 }
            if (r4 == 0) goto L_0x01f7
            boolean r4 = r3.isNull(r9)     // Catch:{ all -> 0x0370 }
            if (r4 == 0) goto L_0x01f7
            boolean r4 = r3.isNull(r10)     // Catch:{ all -> 0x0370 }
            if (r4 == 0) goto L_0x01f7
            boolean r4 = r3.isNull(r11)     // Catch:{ all -> 0x0370 }
            if (r4 == 0) goto L_0x01f7
            boolean r4 = r3.isNull(r12)     // Catch:{ all -> 0x0370 }
            if (r4 == 0) goto L_0x01f7
            boolean r4 = r3.isNull(r13)     // Catch:{ all -> 0x0370 }
            if (r4 == 0) goto L_0x01f7
            boolean r4 = r3.isNull(r14)     // Catch:{ all -> 0x0370 }
            if (r4 == 0) goto L_0x01f7
            r4 = r29
            boolean r15 = r3.isNull(r4)     // Catch:{ all -> 0x0370 }
            if (r15 == 0) goto L_0x01f4
            r15 = r28
            boolean r28 = r3.isNull(r15)     // Catch:{ all -> 0x0370 }
            if (r28 == 0) goto L_0x01fb
            r28 = r2
            r2 = r17
            boolean r17 = r3.isNull(r2)     // Catch:{ all -> 0x0370 }
            if (r17 == 0) goto L_0x01f1
            r17 = r2
            r2 = r18
            boolean r18 = r3.isNull(r2)     // Catch:{ all -> 0x0370 }
            if (r18 == 0) goto L_0x01ee
            r18 = r2
            r2 = r19
            boolean r19 = r3.isNull(r2)     // Catch:{ all -> 0x0370 }
            if (r19 == 0) goto L_0x01eb
            r19 = r2
            r2 = r20
            boolean r20 = r3.isNull(r2)     // Catch:{ all -> 0x0370 }
            if (r20 == 0) goto L_0x01e8
            r20 = r2
            r2 = r21
            boolean r21 = r3.isNull(r2)     // Catch:{ all -> 0x0370 }
            if (r21 == 0) goto L_0x01e5
            r21 = r2
            r2 = r22
            boolean r22 = r3.isNull(r2)     // Catch:{ all -> 0x0370 }
            if (r22 == 0) goto L_0x01e2
            r22 = r2
            r2 = r23
            boolean r23 = r3.isNull(r2)     // Catch:{ all -> 0x0370 }
            if (r23 == 0) goto L_0x01df
            r23 = r2
            r2 = r24
            boolean r24 = r3.isNull(r2)     // Catch:{ all -> 0x0370 }
            if (r24 == 0) goto L_0x01dc
            r24 = r2
            r2 = r25
            boolean r25 = r3.isNull(r2)     // Catch:{ all -> 0x0370 }
            if (r25 == 0) goto L_0x01d9
            r25 = r2
            r2 = r26
            boolean r26 = r3.isNull(r2)     // Catch:{ all -> 0x0370 }
            if (r26 == 0) goto L_0x01d6
            r26 = r2
            r2 = r27
            boolean r27 = r3.isNull(r2)     // Catch:{ all -> 0x0370 }
            if (r27 != 0) goto L_0x01d2
            r27 = r2
            goto L_0x01fd
        L_0x01d2:
            r2 = 0
            r4 = 0
            goto L_0x033d
        L_0x01d6:
            r26 = r2
            goto L_0x01fd
        L_0x01d9:
            r25 = r2
            goto L_0x01fd
        L_0x01dc:
            r24 = r2
            goto L_0x01fd
        L_0x01df:
            r23 = r2
            goto L_0x01fd
        L_0x01e2:
            r22 = r2
            goto L_0x01fd
        L_0x01e5:
            r21 = r2
            goto L_0x01fd
        L_0x01e8:
            r20 = r2
            goto L_0x01fd
        L_0x01eb:
            r19 = r2
            goto L_0x01fd
        L_0x01ee:
            r18 = r2
            goto L_0x01fd
        L_0x01f1:
            r17 = r2
            goto L_0x01fd
        L_0x01f4:
            r15 = r28
            goto L_0x01fb
        L_0x01f7:
            r15 = r28
            r4 = r29
        L_0x01fb:
            r28 = r2
        L_0x01fd:
            com.urbanairship.automation.storage.h r2 = new com.urbanairship.automation.storage.h     // Catch:{ all -> 0x0370 }
            r2.<init>()     // Catch:{ all -> 0x0370 }
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x0370 }
            r2.f24010a = r0     // Catch:{ all -> 0x0370 }
            boolean r0 = r3.isNull(r5)     // Catch:{ all -> 0x0370 }
            if (r0 == 0) goto L_0x0212
            r0 = 0
            r2.f24011b = r0     // Catch:{ all -> 0x0370 }
            goto L_0x0218
        L_0x0212:
            java.lang.String r0 = r3.getString(r5)     // Catch:{ all -> 0x0370 }
            r2.f24011b = r0     // Catch:{ all -> 0x0370 }
        L_0x0218:
            boolean r0 = r3.isNull(r6)     // Catch:{ all -> 0x0370 }
            if (r0 == 0) goto L_0x0222
            r0 = 0
            r2.f24012c = r0     // Catch:{ all -> 0x0370 }
            goto L_0x0228
        L_0x0222:
            java.lang.String r0 = r3.getString(r6)     // Catch:{ all -> 0x0370 }
            r2.f24012c = r0     // Catch:{ all -> 0x0370 }
        L_0x0228:
            boolean r0 = r3.isNull(r7)     // Catch:{ all -> 0x0370 }
            if (r0 == 0) goto L_0x0230
            r0 = 0
            goto L_0x0234
        L_0x0230:
            java.lang.String r0 = r3.getString(r7)     // Catch:{ all -> 0x0370 }
        L_0x0234:
            com.urbanairship.json.f r6 = r1.f23957c     // Catch:{ all -> 0x0370 }
            com.urbanairship.json.b r0 = r6.mo18843a(r0)     // Catch:{ all -> 0x0370 }
            r2.f24013d = r0     // Catch:{ all -> 0x0370 }
            int r0 = r3.getInt(r8)     // Catch:{ all -> 0x0370 }
            r2.f24014e = r0     // Catch:{ all -> 0x0370 }
            int r0 = r3.getInt(r9)     // Catch:{ all -> 0x0370 }
            r2.f24015f = r0     // Catch:{ all -> 0x0370 }
            long r6 = r3.getLong(r10)     // Catch:{ all -> 0x0370 }
            r2.f24016g = r6     // Catch:{ all -> 0x0370 }
            long r6 = r3.getLong(r11)     // Catch:{ all -> 0x0370 }
            r2.f24017h = r6     // Catch:{ all -> 0x0370 }
            long r6 = r3.getLong(r12)     // Catch:{ all -> 0x0370 }
            r2.f24018i = r6     // Catch:{ all -> 0x0370 }
            long r6 = r3.getLong(r13)     // Catch:{ all -> 0x0370 }
            r2.f24019j = r6     // Catch:{ all -> 0x0370 }
            boolean r0 = r3.isNull(r14)     // Catch:{ all -> 0x0370 }
            if (r0 == 0) goto L_0x026a
            r0 = 0
            r2.f24020k = r0     // Catch:{ all -> 0x0370 }
            goto L_0x0270
        L_0x026a:
            java.lang.String r0 = r3.getString(r14)     // Catch:{ all -> 0x0370 }
            r2.f24020k = r0     // Catch:{ all -> 0x0370 }
        L_0x0270:
            boolean r0 = r3.isNull(r4)     // Catch:{ all -> 0x0370 }
            if (r0 == 0) goto L_0x0278
            r0 = 0
            goto L_0x027c
        L_0x0278:
            java.lang.String r0 = r3.getString(r4)     // Catch:{ all -> 0x0370 }
        L_0x027c:
            com.urbanairship.json.f r4 = r1.f23957c     // Catch:{ all -> 0x0370 }
            com.urbanairship.json.JsonValue r0 = r4.mo18847e(r0)     // Catch:{ all -> 0x0370 }
            r2.f24021l = r0     // Catch:{ all -> 0x0370 }
            int r0 = r3.getInt(r15)     // Catch:{ all -> 0x0370 }
            r2.f24022m = r0     // Catch:{ all -> 0x0370 }
            r0 = r17
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x0370 }
            r2.f24023n = r0     // Catch:{ all -> 0x0370 }
            r0 = r18
            long r6 = r3.getLong(r0)     // Catch:{ all -> 0x0370 }
            r2.f24024o = r6     // Catch:{ all -> 0x0370 }
            r0 = r19
            boolean r4 = r3.isNull(r0)     // Catch:{ all -> 0x0370 }
            if (r4 == 0) goto L_0x02a4
            r0 = 0
            goto L_0x02a8
        L_0x02a4:
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x0370 }
        L_0x02a8:
            com.urbanairship.automation.storage.d r4 = r1.f23958d     // Catch:{ all -> 0x0370 }
            com.urbanairship.automation.d0 r0 = r4.mo17668e(r0)     // Catch:{ all -> 0x0370 }
            r2.f24025p = r0     // Catch:{ all -> 0x0370 }
            r0 = r20
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x0370 }
            r2.f24026q = r0     // Catch:{ all -> 0x0370 }
            r0 = r21
            boolean r4 = r3.isNull(r0)     // Catch:{ all -> 0x0370 }
            if (r4 == 0) goto L_0x02c2
            r0 = 0
            goto L_0x02c6
        L_0x02c2:
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x0370 }
        L_0x02c6:
            java.util.List r0 = com.urbanairship.automation.storage.C8945d.m33317d(r0)     // Catch:{ all -> 0x0370 }
            r2.f24027r = r0     // Catch:{ all -> 0x0370 }
            r0 = r22
            long r6 = r3.getLong(r0)     // Catch:{ all -> 0x0370 }
            r2.f24028s = r6     // Catch:{ all -> 0x0370 }
            r0 = r23
            boolean r4 = r3.isNull(r0)     // Catch:{ all -> 0x0370 }
            if (r4 == 0) goto L_0x02e0
            r4 = 0
            r2.f24029t = r4     // Catch:{ all -> 0x0370 }
            goto L_0x02e7
        L_0x02e0:
            r4 = 0
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x0370 }
            r2.f24029t = r0     // Catch:{ all -> 0x0370 }
        L_0x02e7:
            r0 = r24
            boolean r6 = r3.isNull(r0)     // Catch:{ all -> 0x0370 }
            if (r6 == 0) goto L_0x02f1
            r0 = r4
            goto L_0x02f5
        L_0x02f1:
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x0370 }
        L_0x02f5:
            com.urbanairship.automation.storage.d r6 = r1.f23958d     // Catch:{ all -> 0x0370 }
            com.urbanairship.automation.b r0 = r6.mo17666a(r0)     // Catch:{ all -> 0x0370 }
            r2.f24030u = r0     // Catch:{ all -> 0x0370 }
            r0 = r25
            boolean r6 = r3.isNull(r0)     // Catch:{ all -> 0x0370 }
            if (r6 == 0) goto L_0x0307
            r0 = r4
            goto L_0x030b
        L_0x0307:
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x0370 }
        L_0x030b:
            com.urbanairship.json.f r6 = r1.f23957c     // Catch:{ all -> 0x0370 }
            com.urbanairship.json.JsonValue r0 = r6.mo18847e(r0)     // Catch:{ all -> 0x0370 }
            r2.f24031v = r0     // Catch:{ all -> 0x0370 }
            r0 = r26
            boolean r6 = r3.isNull(r0)     // Catch:{ all -> 0x0370 }
            if (r6 == 0) goto L_0x031d
            r0 = r4
            goto L_0x0321
        L_0x031d:
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x0370 }
        L_0x0321:
            com.urbanairship.json.f r6 = r1.f23957c     // Catch:{ all -> 0x0370 }
            com.urbanairship.json.JsonValue r0 = r6.mo18847e(r0)     // Catch:{ all -> 0x0370 }
            r2.f24032w = r0     // Catch:{ all -> 0x0370 }
            r0 = r27
            boolean r6 = r3.isNull(r0)     // Catch:{ all -> 0x0370 }
            if (r6 == 0) goto L_0x0333
            r0 = r4
            goto L_0x0337
        L_0x0333:
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x0370 }
        L_0x0337:
            java.util.List r0 = com.urbanairship.automation.storage.C8945d.m33317d(r0)     // Catch:{ all -> 0x0370 }
            r2.f24033x = r0     // Catch:{ all -> 0x0370 }
        L_0x033d:
            boolean r0 = r3.isNull(r5)     // Catch:{ all -> 0x0370 }
            if (r0 != 0) goto L_0x0350
            java.lang.String r0 = r3.getString(r5)     // Catch:{ all -> 0x0370 }
            r4 = r28
            java.lang.Object r0 = r4.get(r0)     // Catch:{ all -> 0x0370 }
            r4 = r0
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ all -> 0x0370 }
        L_0x0350:
            if (r4 != 0) goto L_0x0357
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0370 }
            r4.<init>()     // Catch:{ all -> 0x0370 }
        L_0x0357:
            com.urbanairship.automation.storage.e r0 = new com.urbanairship.automation.storage.e     // Catch:{ all -> 0x0370 }
            r0.<init>(r2, r4)     // Catch:{ all -> 0x0370 }
            r4 = r0
            goto L_0x035f
        L_0x035e:
            r4 = 0
        L_0x035f:
            androidx.room.RoomDatabase r0 = r1.f23955a     // Catch:{ all -> 0x0370 }
            r0.mo60901O()     // Catch:{ all -> 0x0370 }
            r3.close()     // Catch:{ all -> 0x037c }
            r16.release()     // Catch:{ all -> 0x037c }
            androidx.room.RoomDatabase r0 = r1.f23955a
            r0.mo60908k()
            return r4
        L_0x0370:
            r0 = move-exception
            goto L_0x0375
        L_0x0372:
            r0 = move-exception
            r16 = r2
        L_0x0375:
            r3.close()     // Catch:{ all -> 0x037c }
            r16.release()     // Catch:{ all -> 0x037c }
            throw r0     // Catch:{ all -> 0x037c }
        L_0x037c:
            r0 = move-exception
            androidx.room.RoomDatabase r2 = r1.f23955a
            r2.mo60908k()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.automation.storage.C8939c.mo17643g(java.lang.String):com.urbanairship.automation.storage.e");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v43, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v46, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v49, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v52, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v55, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v57, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v59, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v61, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v41, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v76, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v77, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v78, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v79, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x023a A[Catch:{ all -> 0x037c }] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x023c A[Catch:{ all -> 0x037c }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0272 A[Catch:{ all -> 0x037c }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0276 A[Catch:{ all -> 0x037c }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0282 A[Catch:{ all -> 0x037c }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0284 A[Catch:{ all -> 0x037c }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02ae A[Catch:{ all -> 0x037c }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02b0 A[Catch:{ all -> 0x037c }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02cc A[Catch:{ all -> 0x037c }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02ce A[Catch:{ all -> 0x037c }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02e8 A[Catch:{ all -> 0x037c }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02ec A[Catch:{ all -> 0x037c }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02fb A[Catch:{ all -> 0x037c }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02fd A[Catch:{ all -> 0x037c }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0311 A[Catch:{ all -> 0x037c }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0313 A[Catch:{ all -> 0x037c }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0327 A[Catch:{ all -> 0x037c }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0329 A[Catch:{ all -> 0x037c }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x033d A[Catch:{ all -> 0x037c }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x033f A[Catch:{ all -> 0x037c }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x034f A[Catch:{ all -> 0x037c }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x035e A[Catch:{ all -> 0x037c }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x021a A[Catch:{ all -> 0x037c }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x021e A[Catch:{ all -> 0x037c }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x022a A[Catch:{ all -> 0x037c }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x022e A[Catch:{ all -> 0x037c }] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.urbanairship.automation.storage.C8946e mo17644h(java.lang.String r30, java.lang.String r31) {
        /*
            r29 = this;
            r1 = r29
            r0 = r30
            r2 = r31
            java.lang.String r3 = "SELECT * FROM schedules WHERE (scheduleId == ?) AND (scheduleType = ?)"
            r4 = 2
            androidx.room.v1 r3 = androidx.room.C20400v1.m95183d(r3, r4)
            r5 = 1
            if (r0 != 0) goto L_0x0014
            r3.mo60800u3(r5)
            goto L_0x0017
        L_0x0014:
            r3.mo60801v2(r5, r0)
        L_0x0017:
            if (r2 != 0) goto L_0x001d
            r3.mo60800u3(r4)
            goto L_0x0020
        L_0x001d:
            r3.mo60801v2(r4, r2)
        L_0x0020:
            androidx.room.RoomDatabase r0 = r1.f23955a
            r0.mo60904d()
            androidx.room.RoomDatabase r0 = r1.f23955a
            r0.mo60905e()
            androidx.room.RoomDatabase r0 = r1.f23955a     // Catch:{ all -> 0x0388 }
            r2 = 0
            android.database.Cursor r4 = androidx.room.util.C20378b.m95145f(r0, r3, r5, r2)     // Catch:{ all -> 0x0388 }
            java.lang.String r0 = "id"
            int r0 = androidx.room.util.C20376a.m95137e(r4, r0)     // Catch:{ all -> 0x037e }
            java.lang.String r5 = "scheduleId"
            int r5 = androidx.room.util.C20376a.m95137e(r4, r5)     // Catch:{ all -> 0x037e }
            java.lang.String r6 = "group"
            int r6 = androidx.room.util.C20376a.m95137e(r4, r6)     // Catch:{ all -> 0x037e }
            java.lang.String r7 = "metadata"
            int r7 = androidx.room.util.C20376a.m95137e(r4, r7)     // Catch:{ all -> 0x037e }
            java.lang.String r8 = "limit"
            int r8 = androidx.room.util.C20376a.m95137e(r4, r8)     // Catch:{ all -> 0x037e }
            java.lang.String r9 = "priority"
            int r9 = androidx.room.util.C20376a.m95137e(r4, r9)     // Catch:{ all -> 0x037e }
            java.lang.String r10 = "scheduleStart"
            int r10 = androidx.room.util.C20376a.m95137e(r4, r10)     // Catch:{ all -> 0x037e }
            java.lang.String r11 = "scheduleEnd"
            int r11 = androidx.room.util.C20376a.m95137e(r4, r11)     // Catch:{ all -> 0x037e }
            java.lang.String r12 = "editGracePeriod"
            int r12 = androidx.room.util.C20376a.m95137e(r4, r12)     // Catch:{ all -> 0x037e }
            java.lang.String r13 = "interval"
            int r13 = androidx.room.util.C20376a.m95137e(r4, r13)     // Catch:{ all -> 0x037e }
            java.lang.String r14 = "scheduleType"
            int r14 = androidx.room.util.C20376a.m95137e(r4, r14)     // Catch:{ all -> 0x037e }
            java.lang.String r15 = "data"
            int r15 = androidx.room.util.C20376a.m95137e(r4, r15)     // Catch:{ all -> 0x037e }
            java.lang.String r2 = "count"
            int r2 = androidx.room.util.C20376a.m95137e(r4, r2)     // Catch:{ all -> 0x037e }
            r16 = r3
            java.lang.String r3 = "executionState"
            int r3 = androidx.room.util.C20376a.m95137e(r4, r3)     // Catch:{ all -> 0x037c }
            r31 = r3
            java.lang.String r3 = "executionStateChangeDate"
            int r3 = androidx.room.util.C20376a.m95137e(r4, r3)     // Catch:{ all -> 0x037c }
            r17 = r3
            java.lang.String r3 = "triggerContext"
            int r3 = androidx.room.util.C20376a.m95137e(r4, r3)     // Catch:{ all -> 0x037c }
            r18 = r3
            java.lang.String r3 = "appState"
            int r3 = androidx.room.util.C20376a.m95137e(r4, r3)     // Catch:{ all -> 0x037c }
            r19 = r3
            java.lang.String r3 = "screens"
            int r3 = androidx.room.util.C20376a.m95137e(r4, r3)     // Catch:{ all -> 0x037c }
            r20 = r3
            java.lang.String r3 = "seconds"
            int r3 = androidx.room.util.C20376a.m95137e(r4, r3)     // Catch:{ all -> 0x037c }
            r21 = r3
            java.lang.String r3 = "regionId"
            int r3 = androidx.room.util.C20376a.m95137e(r4, r3)     // Catch:{ all -> 0x037c }
            r22 = r3
            java.lang.String r3 = "audience"
            int r3 = androidx.room.util.C20376a.m95137e(r4, r3)     // Catch:{ all -> 0x037c }
            r23 = r3
            java.lang.String r3 = "campaigns"
            int r3 = androidx.room.util.C20376a.m95137e(r4, r3)     // Catch:{ all -> 0x037c }
            r24 = r3
            java.lang.String r3 = "reportingContext"
            int r3 = androidx.room.util.C20376a.m95137e(r4, r3)     // Catch:{ all -> 0x037c }
            r25 = r3
            java.lang.String r3 = "frequencyConstraintIds"
            int r3 = androidx.room.util.C20376a.m95137e(r4, r3)     // Catch:{ all -> 0x037c }
            r26 = r3
            androidx.collection.a r3 = new androidx.collection.a     // Catch:{ all -> 0x037c }
            r3.<init>()     // Catch:{ all -> 0x037c }
        L_0x00de:
            boolean r27 = r4.moveToNext()     // Catch:{ all -> 0x037c }
            if (r27 == 0) goto L_0x010a
            boolean r27 = r4.isNull(r5)     // Catch:{ all -> 0x037c }
            if (r27 != 0) goto L_0x00de
            r27 = r2
            java.lang.String r2 = r4.getString(r5)     // Catch:{ all -> 0x037c }
            java.lang.Object r28 = r3.get(r2)     // Catch:{ all -> 0x037c }
            java.util.ArrayList r28 = (java.util.ArrayList) r28     // Catch:{ all -> 0x037c }
            if (r28 != 0) goto L_0x0103
            r28 = r15
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x037c }
            r15.<init>()     // Catch:{ all -> 0x037c }
            r3.put(r2, r15)     // Catch:{ all -> 0x037c }
            goto L_0x0105
        L_0x0103:
            r28 = r15
        L_0x0105:
            r2 = r27
            r15 = r28
            goto L_0x00de
        L_0x010a:
            r27 = r2
            r28 = r15
            r2 = -1
            r4.moveToPosition(r2)     // Catch:{ all -> 0x037c }
            r1.mo17660x(r3)     // Catch:{ all -> 0x037c }
            boolean r2 = r4.moveToFirst()     // Catch:{ all -> 0x037c }
            if (r2 == 0) goto L_0x036a
            boolean r2 = r4.isNull(r0)     // Catch:{ all -> 0x037c }
            if (r2 == 0) goto L_0x0203
            boolean r2 = r4.isNull(r5)     // Catch:{ all -> 0x037c }
            if (r2 == 0) goto L_0x0203
            boolean r2 = r4.isNull(r6)     // Catch:{ all -> 0x037c }
            if (r2 == 0) goto L_0x0203
            boolean r2 = r4.isNull(r7)     // Catch:{ all -> 0x037c }
            if (r2 == 0) goto L_0x0203
            boolean r2 = r4.isNull(r8)     // Catch:{ all -> 0x037c }
            if (r2 == 0) goto L_0x0203
            boolean r2 = r4.isNull(r9)     // Catch:{ all -> 0x037c }
            if (r2 == 0) goto L_0x0203
            boolean r2 = r4.isNull(r10)     // Catch:{ all -> 0x037c }
            if (r2 == 0) goto L_0x0203
            boolean r2 = r4.isNull(r11)     // Catch:{ all -> 0x037c }
            if (r2 == 0) goto L_0x0203
            boolean r2 = r4.isNull(r12)     // Catch:{ all -> 0x037c }
            if (r2 == 0) goto L_0x0203
            boolean r2 = r4.isNull(r13)     // Catch:{ all -> 0x037c }
            if (r2 == 0) goto L_0x0203
            boolean r2 = r4.isNull(r14)     // Catch:{ all -> 0x037c }
            if (r2 == 0) goto L_0x0203
            r2 = r28
            boolean r15 = r4.isNull(r2)     // Catch:{ all -> 0x037c }
            if (r15 == 0) goto L_0x0200
            r15 = r27
            boolean r27 = r4.isNull(r15)     // Catch:{ all -> 0x037c }
            if (r27 == 0) goto L_0x0207
            r27 = r3
            r3 = r31
            boolean r28 = r4.isNull(r3)     // Catch:{ all -> 0x037c }
            if (r28 == 0) goto L_0x01fd
            r31 = r3
            r3 = r17
            boolean r17 = r4.isNull(r3)     // Catch:{ all -> 0x037c }
            if (r17 == 0) goto L_0x01fa
            r17 = r3
            r3 = r18
            boolean r18 = r4.isNull(r3)     // Catch:{ all -> 0x037c }
            if (r18 == 0) goto L_0x01f7
            r18 = r3
            r3 = r19
            boolean r19 = r4.isNull(r3)     // Catch:{ all -> 0x037c }
            if (r19 == 0) goto L_0x01f4
            r19 = r3
            r3 = r20
            boolean r20 = r4.isNull(r3)     // Catch:{ all -> 0x037c }
            if (r20 == 0) goto L_0x01f1
            r20 = r3
            r3 = r21
            boolean r21 = r4.isNull(r3)     // Catch:{ all -> 0x037c }
            if (r21 == 0) goto L_0x01ee
            r21 = r3
            r3 = r22
            boolean r22 = r4.isNull(r3)     // Catch:{ all -> 0x037c }
            if (r22 == 0) goto L_0x01eb
            r22 = r3
            r3 = r23
            boolean r23 = r4.isNull(r3)     // Catch:{ all -> 0x037c }
            if (r23 == 0) goto L_0x01e8
            r23 = r3
            r3 = r24
            boolean r24 = r4.isNull(r3)     // Catch:{ all -> 0x037c }
            if (r24 == 0) goto L_0x01e5
            r24 = r3
            r3 = r25
            boolean r25 = r4.isNull(r3)     // Catch:{ all -> 0x037c }
            if (r25 == 0) goto L_0x01e2
            r25 = r3
            r3 = r26
            boolean r26 = r4.isNull(r3)     // Catch:{ all -> 0x037c }
            if (r26 != 0) goto L_0x01de
            r26 = r3
            goto L_0x0209
        L_0x01de:
            r2 = 0
            r3 = 0
            goto L_0x0349
        L_0x01e2:
            r25 = r3
            goto L_0x0209
        L_0x01e5:
            r24 = r3
            goto L_0x0209
        L_0x01e8:
            r23 = r3
            goto L_0x0209
        L_0x01eb:
            r22 = r3
            goto L_0x0209
        L_0x01ee:
            r21 = r3
            goto L_0x0209
        L_0x01f1:
            r20 = r3
            goto L_0x0209
        L_0x01f4:
            r19 = r3
            goto L_0x0209
        L_0x01f7:
            r18 = r3
            goto L_0x0209
        L_0x01fa:
            r17 = r3
            goto L_0x0209
        L_0x01fd:
            r31 = r3
            goto L_0x0209
        L_0x0200:
            r15 = r27
            goto L_0x0207
        L_0x0203:
            r15 = r27
            r2 = r28
        L_0x0207:
            r27 = r3
        L_0x0209:
            com.urbanairship.automation.storage.h r3 = new com.urbanairship.automation.storage.h     // Catch:{ all -> 0x037c }
            r3.<init>()     // Catch:{ all -> 0x037c }
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x037c }
            r3.f24010a = r0     // Catch:{ all -> 0x037c }
            boolean r0 = r4.isNull(r5)     // Catch:{ all -> 0x037c }
            if (r0 == 0) goto L_0x021e
            r0 = 0
            r3.f24011b = r0     // Catch:{ all -> 0x037c }
            goto L_0x0224
        L_0x021e:
            java.lang.String r0 = r4.getString(r5)     // Catch:{ all -> 0x037c }
            r3.f24011b = r0     // Catch:{ all -> 0x037c }
        L_0x0224:
            boolean r0 = r4.isNull(r6)     // Catch:{ all -> 0x037c }
            if (r0 == 0) goto L_0x022e
            r0 = 0
            r3.f24012c = r0     // Catch:{ all -> 0x037c }
            goto L_0x0234
        L_0x022e:
            java.lang.String r0 = r4.getString(r6)     // Catch:{ all -> 0x037c }
            r3.f24012c = r0     // Catch:{ all -> 0x037c }
        L_0x0234:
            boolean r0 = r4.isNull(r7)     // Catch:{ all -> 0x037c }
            if (r0 == 0) goto L_0x023c
            r0 = 0
            goto L_0x0240
        L_0x023c:
            java.lang.String r0 = r4.getString(r7)     // Catch:{ all -> 0x037c }
        L_0x0240:
            com.urbanairship.json.f r6 = r1.f23957c     // Catch:{ all -> 0x037c }
            com.urbanairship.json.b r0 = r6.mo18843a(r0)     // Catch:{ all -> 0x037c }
            r3.f24013d = r0     // Catch:{ all -> 0x037c }
            int r0 = r4.getInt(r8)     // Catch:{ all -> 0x037c }
            r3.f24014e = r0     // Catch:{ all -> 0x037c }
            int r0 = r4.getInt(r9)     // Catch:{ all -> 0x037c }
            r3.f24015f = r0     // Catch:{ all -> 0x037c }
            long r6 = r4.getLong(r10)     // Catch:{ all -> 0x037c }
            r3.f24016g = r6     // Catch:{ all -> 0x037c }
            long r6 = r4.getLong(r11)     // Catch:{ all -> 0x037c }
            r3.f24017h = r6     // Catch:{ all -> 0x037c }
            long r6 = r4.getLong(r12)     // Catch:{ all -> 0x037c }
            r3.f24018i = r6     // Catch:{ all -> 0x037c }
            long r6 = r4.getLong(r13)     // Catch:{ all -> 0x037c }
            r3.f24019j = r6     // Catch:{ all -> 0x037c }
            boolean r0 = r4.isNull(r14)     // Catch:{ all -> 0x037c }
            if (r0 == 0) goto L_0x0276
            r0 = 0
            r3.f24020k = r0     // Catch:{ all -> 0x037c }
            goto L_0x027c
        L_0x0276:
            java.lang.String r0 = r4.getString(r14)     // Catch:{ all -> 0x037c }
            r3.f24020k = r0     // Catch:{ all -> 0x037c }
        L_0x027c:
            boolean r0 = r4.isNull(r2)     // Catch:{ all -> 0x037c }
            if (r0 == 0) goto L_0x0284
            r0 = 0
            goto L_0x0288
        L_0x0284:
            java.lang.String r0 = r4.getString(r2)     // Catch:{ all -> 0x037c }
        L_0x0288:
            com.urbanairship.json.f r2 = r1.f23957c     // Catch:{ all -> 0x037c }
            com.urbanairship.json.JsonValue r0 = r2.mo18847e(r0)     // Catch:{ all -> 0x037c }
            r3.f24021l = r0     // Catch:{ all -> 0x037c }
            int r0 = r4.getInt(r15)     // Catch:{ all -> 0x037c }
            r3.f24022m = r0     // Catch:{ all -> 0x037c }
            r0 = r31
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x037c }
            r3.f24023n = r0     // Catch:{ all -> 0x037c }
            r0 = r17
            long r6 = r4.getLong(r0)     // Catch:{ all -> 0x037c }
            r3.f24024o = r6     // Catch:{ all -> 0x037c }
            r0 = r18
            boolean r2 = r4.isNull(r0)     // Catch:{ all -> 0x037c }
            if (r2 == 0) goto L_0x02b0
            r0 = 0
            goto L_0x02b4
        L_0x02b0:
            java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x037c }
        L_0x02b4:
            com.urbanairship.automation.storage.d r2 = r1.f23958d     // Catch:{ all -> 0x037c }
            com.urbanairship.automation.d0 r0 = r2.mo17668e(r0)     // Catch:{ all -> 0x037c }
            r3.f24025p = r0     // Catch:{ all -> 0x037c }
            r0 = r19
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x037c }
            r3.f24026q = r0     // Catch:{ all -> 0x037c }
            r0 = r20
            boolean r2 = r4.isNull(r0)     // Catch:{ all -> 0x037c }
            if (r2 == 0) goto L_0x02ce
            r0 = 0
            goto L_0x02d2
        L_0x02ce:
            java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x037c }
        L_0x02d2:
            java.util.List r0 = com.urbanairship.automation.storage.C8945d.m33317d(r0)     // Catch:{ all -> 0x037c }
            r3.f24027r = r0     // Catch:{ all -> 0x037c }
            r0 = r21
            long r6 = r4.getLong(r0)     // Catch:{ all -> 0x037c }
            r3.f24028s = r6     // Catch:{ all -> 0x037c }
            r0 = r22
            boolean r2 = r4.isNull(r0)     // Catch:{ all -> 0x037c }
            if (r2 == 0) goto L_0x02ec
            r2 = 0
            r3.f24029t = r2     // Catch:{ all -> 0x037c }
            goto L_0x02f3
        L_0x02ec:
            r2 = 0
            java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x037c }
            r3.f24029t = r0     // Catch:{ all -> 0x037c }
        L_0x02f3:
            r0 = r23
            boolean r6 = r4.isNull(r0)     // Catch:{ all -> 0x037c }
            if (r6 == 0) goto L_0x02fd
            r0 = r2
            goto L_0x0301
        L_0x02fd:
            java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x037c }
        L_0x0301:
            com.urbanairship.automation.storage.d r6 = r1.f23958d     // Catch:{ all -> 0x037c }
            com.urbanairship.automation.b r0 = r6.mo17666a(r0)     // Catch:{ all -> 0x037c }
            r3.f24030u = r0     // Catch:{ all -> 0x037c }
            r0 = r24
            boolean r6 = r4.isNull(r0)     // Catch:{ all -> 0x037c }
            if (r6 == 0) goto L_0x0313
            r0 = r2
            goto L_0x0317
        L_0x0313:
            java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x037c }
        L_0x0317:
            com.urbanairship.json.f r6 = r1.f23957c     // Catch:{ all -> 0x037c }
            com.urbanairship.json.JsonValue r0 = r6.mo18847e(r0)     // Catch:{ all -> 0x037c }
            r3.f24031v = r0     // Catch:{ all -> 0x037c }
            r0 = r25
            boolean r6 = r4.isNull(r0)     // Catch:{ all -> 0x037c }
            if (r6 == 0) goto L_0x0329
            r0 = r2
            goto L_0x032d
        L_0x0329:
            java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x037c }
        L_0x032d:
            com.urbanairship.json.f r6 = r1.f23957c     // Catch:{ all -> 0x037c }
            com.urbanairship.json.JsonValue r0 = r6.mo18847e(r0)     // Catch:{ all -> 0x037c }
            r3.f24032w = r0     // Catch:{ all -> 0x037c }
            r0 = r26
            boolean r6 = r4.isNull(r0)     // Catch:{ all -> 0x037c }
            if (r6 == 0) goto L_0x033f
            r0 = r2
            goto L_0x0343
        L_0x033f:
            java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x037c }
        L_0x0343:
            java.util.List r0 = com.urbanairship.automation.storage.C8945d.m33317d(r0)     // Catch:{ all -> 0x037c }
            r3.f24033x = r0     // Catch:{ all -> 0x037c }
        L_0x0349:
            boolean r0 = r4.isNull(r5)     // Catch:{ all -> 0x037c }
            if (r0 != 0) goto L_0x035c
            java.lang.String r0 = r4.getString(r5)     // Catch:{ all -> 0x037c }
            r2 = r27
            java.lang.Object r0 = r2.get(r0)     // Catch:{ all -> 0x037c }
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x037c }
        L_0x035c:
            if (r2 != 0) goto L_0x0363
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x037c }
            r2.<init>()     // Catch:{ all -> 0x037c }
        L_0x0363:
            com.urbanairship.automation.storage.e r0 = new com.urbanairship.automation.storage.e     // Catch:{ all -> 0x037c }
            r0.<init>(r3, r2)     // Catch:{ all -> 0x037c }
            r2 = r0
            goto L_0x036b
        L_0x036a:
            r2 = 0
        L_0x036b:
            androidx.room.RoomDatabase r0 = r1.f23955a     // Catch:{ all -> 0x037c }
            r0.mo60901O()     // Catch:{ all -> 0x037c }
            r4.close()     // Catch:{ all -> 0x0388 }
            r16.release()     // Catch:{ all -> 0x0388 }
            androidx.room.RoomDatabase r0 = r1.f23955a
            r0.mo60908k()
            return r2
        L_0x037c:
            r0 = move-exception
            goto L_0x0381
        L_0x037e:
            r0 = move-exception
            r16 = r3
        L_0x0381:
            r4.close()     // Catch:{ all -> 0x0388 }
            r16.release()     // Catch:{ all -> 0x0388 }
            throw r0     // Catch:{ all -> 0x0388 }
        L_0x0388:
            r0 = move-exception
            androidx.room.RoomDatabase r2 = r1.f23955a
            r2.mo60908k()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.automation.storage.C8939c.mo17644h(java.lang.String, java.lang.String):com.urbanairship.automation.storage.e");
    }

    /* renamed from: i */
    public int mo17645i() {
        int i = 0;
        C20400v1 d = C20400v1.m95183d("SELECT COUNT(*) FROM schedules", 0);
        this.f23955a.mo60904d();
        Cursor f = C20378b.m95145f(this.f23955a, d, false, (CancellationSignal) null);
        try {
            if (f.moveToFirst()) {
                i = f.getInt(0);
            }
            return i;
        } finally {
            f.close();
            d.release();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0298 A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x029a A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02cc A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02d0 A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02ee A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02f3 A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0313 A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0317 A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0325 A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x032b A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0345 A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0349 A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x035f A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0363 A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0379 A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x037b A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x038b A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x039a A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x03a1 A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03a6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x022a A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x022e A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x023a A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x023e A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x024a A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x024e A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0288 A[Catch:{ all -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x028c A[Catch:{ all -> 0x03e5 }] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.urbanairship.automation.storage.C8946e> mo17646j() {
        /*
            r33 = this;
            r1 = r33
            java.lang.String r0 = "SELECT * FROM schedules"
            r2 = 0
            androidx.room.v1 r2 = androidx.room.C20400v1.m95183d(r0, r2)
            androidx.room.RoomDatabase r0 = r1.f23955a
            r0.mo60904d()
            androidx.room.RoomDatabase r0 = r1.f23955a
            r0.mo60905e()
            androidx.room.RoomDatabase r0 = r1.f23955a     // Catch:{ all -> 0x03f1 }
            r3 = 1
            r4 = 0
            android.database.Cursor r3 = androidx.room.util.C20378b.m95145f(r0, r2, r3, r4)     // Catch:{ all -> 0x03f1 }
            java.lang.String r0 = "id"
            int r0 = androidx.room.util.C20376a.m95137e(r3, r0)     // Catch:{ all -> 0x03e7 }
            java.lang.String r5 = "scheduleId"
            int r5 = androidx.room.util.C20376a.m95137e(r3, r5)     // Catch:{ all -> 0x03e7 }
            java.lang.String r6 = "group"
            int r6 = androidx.room.util.C20376a.m95137e(r3, r6)     // Catch:{ all -> 0x03e7 }
            java.lang.String r7 = "metadata"
            int r7 = androidx.room.util.C20376a.m95137e(r3, r7)     // Catch:{ all -> 0x03e7 }
            java.lang.String r8 = "limit"
            int r8 = androidx.room.util.C20376a.m95137e(r3, r8)     // Catch:{ all -> 0x03e7 }
            java.lang.String r9 = "priority"
            int r9 = androidx.room.util.C20376a.m95137e(r3, r9)     // Catch:{ all -> 0x03e7 }
            java.lang.String r10 = "scheduleStart"
            int r10 = androidx.room.util.C20376a.m95137e(r3, r10)     // Catch:{ all -> 0x03e7 }
            java.lang.String r11 = "scheduleEnd"
            int r11 = androidx.room.util.C20376a.m95137e(r3, r11)     // Catch:{ all -> 0x03e7 }
            java.lang.String r12 = "editGracePeriod"
            int r12 = androidx.room.util.C20376a.m95137e(r3, r12)     // Catch:{ all -> 0x03e7 }
            java.lang.String r13 = "interval"
            int r13 = androidx.room.util.C20376a.m95137e(r3, r13)     // Catch:{ all -> 0x03e7 }
            java.lang.String r14 = "scheduleType"
            int r14 = androidx.room.util.C20376a.m95137e(r3, r14)     // Catch:{ all -> 0x03e7 }
            java.lang.String r15 = "data"
            int r15 = androidx.room.util.C20376a.m95137e(r3, r15)     // Catch:{ all -> 0x03e7 }
            java.lang.String r4 = "count"
            int r4 = androidx.room.util.C20376a.m95137e(r3, r4)     // Catch:{ all -> 0x03e7 }
            r16 = r2
            java.lang.String r2 = "executionState"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03e5 }
            r17 = r2
            java.lang.String r2 = "executionStateChangeDate"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03e5 }
            r18 = r2
            java.lang.String r2 = "triggerContext"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03e5 }
            r19 = r2
            java.lang.String r2 = "appState"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03e5 }
            r20 = r2
            java.lang.String r2 = "screens"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03e5 }
            r21 = r2
            java.lang.String r2 = "seconds"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03e5 }
            r22 = r2
            java.lang.String r2 = "regionId"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03e5 }
            r23 = r2
            java.lang.String r2 = "audience"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03e5 }
            r24 = r2
            java.lang.String r2 = "campaigns"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03e5 }
            r25 = r2
            java.lang.String r2 = "reportingContext"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03e5 }
            r26 = r2
            java.lang.String r2 = "frequencyConstraintIds"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03e5 }
            r27 = r2
            androidx.collection.a r2 = new androidx.collection.a     // Catch:{ all -> 0x03e5 }
            r2.<init>()     // Catch:{ all -> 0x03e5 }
        L_0x00c8:
            boolean r28 = r3.moveToNext()     // Catch:{ all -> 0x03e5 }
            if (r28 == 0) goto L_0x00f4
            boolean r28 = r3.isNull(r5)     // Catch:{ all -> 0x03e5 }
            if (r28 != 0) goto L_0x00c8
            r28 = r4
            java.lang.String r4 = r3.getString(r5)     // Catch:{ all -> 0x03e5 }
            java.lang.Object r29 = r2.get(r4)     // Catch:{ all -> 0x03e5 }
            java.util.ArrayList r29 = (java.util.ArrayList) r29     // Catch:{ all -> 0x03e5 }
            if (r29 != 0) goto L_0x00ed
            r29 = r15
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x03e5 }
            r15.<init>()     // Catch:{ all -> 0x03e5 }
            r2.put(r4, r15)     // Catch:{ all -> 0x03e5 }
            goto L_0x00ef
        L_0x00ed:
            r29 = r15
        L_0x00ef:
            r4 = r28
            r15 = r29
            goto L_0x00c8
        L_0x00f4:
            r28 = r4
            r29 = r15
            r4 = -1
            r3.moveToPosition(r4)     // Catch:{ all -> 0x03e5 }
            r1.mo17660x(r2)     // Catch:{ all -> 0x03e5 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x03e5 }
            int r15 = r3.getCount()     // Catch:{ all -> 0x03e5 }
            r4.<init>(r15)     // Catch:{ all -> 0x03e5 }
        L_0x0108:
            boolean r15 = r3.moveToNext()     // Catch:{ all -> 0x03e5 }
            if (r15 == 0) goto L_0x03d3
            boolean r15 = r3.isNull(r0)     // Catch:{ all -> 0x03e5 }
            if (r15 == 0) goto L_0x020f
            boolean r15 = r3.isNull(r5)     // Catch:{ all -> 0x03e5 }
            if (r15 == 0) goto L_0x020f
            boolean r15 = r3.isNull(r6)     // Catch:{ all -> 0x03e5 }
            if (r15 == 0) goto L_0x020f
            boolean r15 = r3.isNull(r7)     // Catch:{ all -> 0x03e5 }
            if (r15 == 0) goto L_0x020f
            boolean r15 = r3.isNull(r8)     // Catch:{ all -> 0x03e5 }
            if (r15 == 0) goto L_0x020f
            boolean r15 = r3.isNull(r9)     // Catch:{ all -> 0x03e5 }
            if (r15 == 0) goto L_0x020f
            boolean r15 = r3.isNull(r10)     // Catch:{ all -> 0x03e5 }
            if (r15 == 0) goto L_0x020f
            boolean r15 = r3.isNull(r11)     // Catch:{ all -> 0x03e5 }
            if (r15 == 0) goto L_0x020f
            boolean r15 = r3.isNull(r12)     // Catch:{ all -> 0x03e5 }
            if (r15 == 0) goto L_0x020f
            boolean r15 = r3.isNull(r13)     // Catch:{ all -> 0x03e5 }
            if (r15 == 0) goto L_0x020f
            boolean r15 = r3.isNull(r14)     // Catch:{ all -> 0x03e5 }
            if (r15 == 0) goto L_0x020f
            r15 = r29
            boolean r29 = r3.isNull(r15)     // Catch:{ all -> 0x03e5 }
            if (r29 == 0) goto L_0x0211
            r29 = r4
            r4 = r28
            boolean r28 = r3.isNull(r4)     // Catch:{ all -> 0x03e5 }
            if (r28 == 0) goto L_0x0215
            r28 = r2
            r2 = r17
            boolean r17 = r3.isNull(r2)     // Catch:{ all -> 0x03e5 }
            if (r17 == 0) goto L_0x020c
            r17 = r2
            r2 = r18
            boolean r18 = r3.isNull(r2)     // Catch:{ all -> 0x03e5 }
            if (r18 == 0) goto L_0x0209
            r18 = r2
            r2 = r19
            boolean r19 = r3.isNull(r2)     // Catch:{ all -> 0x03e5 }
            if (r19 == 0) goto L_0x0206
            r19 = r2
            r2 = r20
            boolean r20 = r3.isNull(r2)     // Catch:{ all -> 0x03e5 }
            if (r20 == 0) goto L_0x0203
            r20 = r2
            r2 = r21
            boolean r21 = r3.isNull(r2)     // Catch:{ all -> 0x03e5 }
            if (r21 == 0) goto L_0x0200
            r21 = r2
            r2 = r22
            boolean r22 = r3.isNull(r2)     // Catch:{ all -> 0x03e5 }
            if (r22 == 0) goto L_0x01fd
            r22 = r2
            r2 = r23
            boolean r23 = r3.isNull(r2)     // Catch:{ all -> 0x03e5 }
            if (r23 == 0) goto L_0x01fa
            r23 = r2
            r2 = r24
            boolean r24 = r3.isNull(r2)     // Catch:{ all -> 0x03e5 }
            if (r24 == 0) goto L_0x01f7
            r24 = r2
            r2 = r25
            boolean r25 = r3.isNull(r2)     // Catch:{ all -> 0x03e5 }
            if (r25 == 0) goto L_0x01f4
            r25 = r2
            r2 = r26
            boolean r26 = r3.isNull(r2)     // Catch:{ all -> 0x03e5 }
            if (r26 == 0) goto L_0x01f1
            r26 = r2
            r2 = r27
            boolean r27 = r3.isNull(r2)     // Catch:{ all -> 0x03e5 }
            if (r27 != 0) goto L_0x01d3
            r27 = r2
            goto L_0x0217
        L_0x01d3:
            r31 = r0
            r0 = r2
            r30 = r4
            r2 = 0
            r32 = r17
            r17 = r6
            r6 = r23
            r23 = r7
            r7 = r24
            r24 = r22
            r22 = r21
            r21 = r20
            r20 = r19
            r19 = r18
            r18 = r32
            goto L_0x0385
        L_0x01f1:
            r26 = r2
            goto L_0x0217
        L_0x01f4:
            r25 = r2
            goto L_0x0217
        L_0x01f7:
            r24 = r2
            goto L_0x0217
        L_0x01fa:
            r23 = r2
            goto L_0x0217
        L_0x01fd:
            r22 = r2
            goto L_0x0217
        L_0x0200:
            r21 = r2
            goto L_0x0217
        L_0x0203:
            r20 = r2
            goto L_0x0217
        L_0x0206:
            r19 = r2
            goto L_0x0217
        L_0x0209:
            r18 = r2
            goto L_0x0217
        L_0x020c:
            r17 = r2
            goto L_0x0217
        L_0x020f:
            r15 = r29
        L_0x0211:
            r29 = r4
            r4 = r28
        L_0x0215:
            r28 = r2
        L_0x0217:
            com.urbanairship.automation.storage.h r2 = new com.urbanairship.automation.storage.h     // Catch:{ all -> 0x03e5 }
            r2.<init>()     // Catch:{ all -> 0x03e5 }
            r30 = r4
            int r4 = r3.getInt(r0)     // Catch:{ all -> 0x03e5 }
            r2.f24010a = r4     // Catch:{ all -> 0x03e5 }
            boolean r4 = r3.isNull(r5)     // Catch:{ all -> 0x03e5 }
            if (r4 == 0) goto L_0x022e
            r4 = 0
            r2.f24011b = r4     // Catch:{ all -> 0x03e5 }
            goto L_0x0234
        L_0x022e:
            java.lang.String r4 = r3.getString(r5)     // Catch:{ all -> 0x03e5 }
            r2.f24011b = r4     // Catch:{ all -> 0x03e5 }
        L_0x0234:
            boolean r4 = r3.isNull(r6)     // Catch:{ all -> 0x03e5 }
            if (r4 == 0) goto L_0x023e
            r4 = 0
            r2.f24012c = r4     // Catch:{ all -> 0x03e5 }
            goto L_0x0244
        L_0x023e:
            java.lang.String r4 = r3.getString(r6)     // Catch:{ all -> 0x03e5 }
            r2.f24012c = r4     // Catch:{ all -> 0x03e5 }
        L_0x0244:
            boolean r4 = r3.isNull(r7)     // Catch:{ all -> 0x03e5 }
            if (r4 == 0) goto L_0x024e
            r31 = r0
            r4 = 0
            goto L_0x0254
        L_0x024e:
            java.lang.String r4 = r3.getString(r7)     // Catch:{ all -> 0x03e5 }
            r31 = r0
        L_0x0254:
            com.urbanairship.json.f r0 = r1.f23957c     // Catch:{ all -> 0x03e5 }
            com.urbanairship.json.b r0 = r0.mo18843a(r4)     // Catch:{ all -> 0x03e5 }
            r2.f24013d = r0     // Catch:{ all -> 0x03e5 }
            int r0 = r3.getInt(r8)     // Catch:{ all -> 0x03e5 }
            r2.f24014e = r0     // Catch:{ all -> 0x03e5 }
            int r0 = r3.getInt(r9)     // Catch:{ all -> 0x03e5 }
            r2.f24015f = r0     // Catch:{ all -> 0x03e5 }
            r0 = r6
            r4 = r7
            long r6 = r3.getLong(r10)     // Catch:{ all -> 0x03e5 }
            r2.f24016g = r6     // Catch:{ all -> 0x03e5 }
            long r6 = r3.getLong(r11)     // Catch:{ all -> 0x03e5 }
            r2.f24017h = r6     // Catch:{ all -> 0x03e5 }
            long r6 = r3.getLong(r12)     // Catch:{ all -> 0x03e5 }
            r2.f24018i = r6     // Catch:{ all -> 0x03e5 }
            long r6 = r3.getLong(r13)     // Catch:{ all -> 0x03e5 }
            r2.f24019j = r6     // Catch:{ all -> 0x03e5 }
            boolean r6 = r3.isNull(r14)     // Catch:{ all -> 0x03e5 }
            if (r6 == 0) goto L_0x028c
            r6 = 0
            r2.f24020k = r6     // Catch:{ all -> 0x03e5 }
            goto L_0x0292
        L_0x028c:
            java.lang.String r6 = r3.getString(r14)     // Catch:{ all -> 0x03e5 }
            r2.f24020k = r6     // Catch:{ all -> 0x03e5 }
        L_0x0292:
            boolean r6 = r3.isNull(r15)     // Catch:{ all -> 0x03e5 }
            if (r6 == 0) goto L_0x029a
            r6 = 0
            goto L_0x029e
        L_0x029a:
            java.lang.String r6 = r3.getString(r15)     // Catch:{ all -> 0x03e5 }
        L_0x029e:
            com.urbanairship.json.f r7 = r1.f23957c     // Catch:{ all -> 0x03e5 }
            com.urbanairship.json.JsonValue r6 = r7.mo18847e(r6)     // Catch:{ all -> 0x03e5 }
            r2.f24021l = r6     // Catch:{ all -> 0x03e5 }
            r6 = r30
            int r7 = r3.getInt(r6)     // Catch:{ all -> 0x03e5 }
            r2.f24022m = r7     // Catch:{ all -> 0x03e5 }
            r7 = r17
            r17 = r0
            int r0 = r3.getInt(r7)     // Catch:{ all -> 0x03e5 }
            r2.f24023n = r0     // Catch:{ all -> 0x03e5 }
            r30 = r6
            r0 = r18
            r18 = r7
            long r6 = r3.getLong(r0)     // Catch:{ all -> 0x03e5 }
            r2.f24024o = r6     // Catch:{ all -> 0x03e5 }
            r6 = r19
            boolean r7 = r3.isNull(r6)     // Catch:{ all -> 0x03e5 }
            if (r7 == 0) goto L_0x02d0
            r19 = r0
            r7 = 0
            goto L_0x02d6
        L_0x02d0:
            java.lang.String r7 = r3.getString(r6)     // Catch:{ all -> 0x03e5 }
            r19 = r0
        L_0x02d6:
            com.urbanairship.automation.storage.d r0 = r1.f23958d     // Catch:{ all -> 0x03e5 }
            com.urbanairship.automation.d0 r0 = r0.mo17668e(r7)     // Catch:{ all -> 0x03e5 }
            r2.f24025p = r0     // Catch:{ all -> 0x03e5 }
            r0 = r20
            int r7 = r3.getInt(r0)     // Catch:{ all -> 0x03e5 }
            r2.f24026q = r7     // Catch:{ all -> 0x03e5 }
            r7 = r21
            boolean r20 = r3.isNull(r7)     // Catch:{ all -> 0x03e5 }
            if (r20 == 0) goto L_0x02f3
            r21 = r0
            r20 = 0
            goto L_0x02f9
        L_0x02f3:
            java.lang.String r20 = r3.getString(r7)     // Catch:{ all -> 0x03e5 }
            r21 = r0
        L_0x02f9:
            java.util.List r0 = com.urbanairship.automation.storage.C8945d.m33317d(r20)     // Catch:{ all -> 0x03e5 }
            r2.f24027r = r0     // Catch:{ all -> 0x03e5 }
            r20 = r6
            r0 = r22
            r22 = r7
            long r6 = r3.getLong(r0)     // Catch:{ all -> 0x03e5 }
            r2.f24028s = r6     // Catch:{ all -> 0x03e5 }
            r6 = r23
            boolean r7 = r3.isNull(r6)     // Catch:{ all -> 0x03e5 }
            if (r7 == 0) goto L_0x0317
            r7 = 0
            r2.f24029t = r7     // Catch:{ all -> 0x03e5 }
            goto L_0x031d
        L_0x0317:
            java.lang.String r7 = r3.getString(r6)     // Catch:{ all -> 0x03e5 }
            r2.f24029t = r7     // Catch:{ all -> 0x03e5 }
        L_0x031d:
            r7 = r24
            boolean r23 = r3.isNull(r7)     // Catch:{ all -> 0x03e5 }
            if (r23 == 0) goto L_0x032b
            r24 = r0
            r23 = r4
            r0 = 0
            goto L_0x0335
        L_0x032b:
            java.lang.String r23 = r3.getString(r7)     // Catch:{ all -> 0x03e5 }
            r24 = r0
            r0 = r23
            r23 = r4
        L_0x0335:
            com.urbanairship.automation.storage.d r4 = r1.f23958d     // Catch:{ all -> 0x03e5 }
            com.urbanairship.automation.b r0 = r4.mo17666a(r0)     // Catch:{ all -> 0x03e5 }
            r2.f24030u = r0     // Catch:{ all -> 0x03e5 }
            r0 = r25
            boolean r4 = r3.isNull(r0)     // Catch:{ all -> 0x03e5 }
            if (r4 == 0) goto L_0x0349
            r25 = r0
            r4 = 0
            goto L_0x034f
        L_0x0349:
            java.lang.String r4 = r3.getString(r0)     // Catch:{ all -> 0x03e5 }
            r25 = r0
        L_0x034f:
            com.urbanairship.json.f r0 = r1.f23957c     // Catch:{ all -> 0x03e5 }
            com.urbanairship.json.JsonValue r0 = r0.mo18847e(r4)     // Catch:{ all -> 0x03e5 }
            r2.f24031v = r0     // Catch:{ all -> 0x03e5 }
            r0 = r26
            boolean r4 = r3.isNull(r0)     // Catch:{ all -> 0x03e5 }
            if (r4 == 0) goto L_0x0363
            r26 = r0
            r4 = 0
            goto L_0x0369
        L_0x0363:
            java.lang.String r4 = r3.getString(r0)     // Catch:{ all -> 0x03e5 }
            r26 = r0
        L_0x0369:
            com.urbanairship.json.f r0 = r1.f23957c     // Catch:{ all -> 0x03e5 }
            com.urbanairship.json.JsonValue r0 = r0.mo18847e(r4)     // Catch:{ all -> 0x03e5 }
            r2.f24032w = r0     // Catch:{ all -> 0x03e5 }
            r0 = r27
            boolean r4 = r3.isNull(r0)     // Catch:{ all -> 0x03e5 }
            if (r4 == 0) goto L_0x037b
            r4 = 0
            goto L_0x037f
        L_0x037b:
            java.lang.String r4 = r3.getString(r0)     // Catch:{ all -> 0x03e5 }
        L_0x037f:
            java.util.List r4 = com.urbanairship.automation.storage.C8945d.m33317d(r4)     // Catch:{ all -> 0x03e5 }
            r2.f24033x = r4     // Catch:{ all -> 0x03e5 }
        L_0x0385:
            boolean r4 = r3.isNull(r5)     // Catch:{ all -> 0x03e5 }
            if (r4 != 0) goto L_0x039a
            java.lang.String r4 = r3.getString(r5)     // Catch:{ all -> 0x03e5 }
            r27 = r0
            r0 = r28
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x03e5 }
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ all -> 0x03e5 }
            goto L_0x039f
        L_0x039a:
            r27 = r0
            r0 = r28
            r4 = 0
        L_0x039f:
            if (r4 != 0) goto L_0x03a6
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x03e5 }
            r4.<init>()     // Catch:{ all -> 0x03e5 }
        L_0x03a6:
            r28 = r0
            com.urbanairship.automation.storage.e r0 = new com.urbanairship.automation.storage.e     // Catch:{ all -> 0x03e5 }
            r0.<init>(r2, r4)     // Catch:{ all -> 0x03e5 }
            r2 = r29
            r2.add(r0)     // Catch:{ all -> 0x03e5 }
            r4 = r2
            r29 = r15
            r2 = r28
            r28 = r30
            r0 = r31
            r32 = r23
            r23 = r6
            r6 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            r22 = r24
            r24 = r7
            r7 = r32
            goto L_0x0108
        L_0x03d3:
            r2 = r4
            androidx.room.RoomDatabase r0 = r1.f23955a     // Catch:{ all -> 0x03e5 }
            r0.mo60901O()     // Catch:{ all -> 0x03e5 }
            r3.close()     // Catch:{ all -> 0x03f1 }
            r16.release()     // Catch:{ all -> 0x03f1 }
            androidx.room.RoomDatabase r0 = r1.f23955a
            r0.mo60908k()
            return r2
        L_0x03e5:
            r0 = move-exception
            goto L_0x03ea
        L_0x03e7:
            r0 = move-exception
            r16 = r2
        L_0x03ea:
            r3.close()     // Catch:{ all -> 0x03f1 }
            r16.release()     // Catch:{ all -> 0x03f1 }
            throw r0     // Catch:{ all -> 0x03f1 }
        L_0x03f1:
            r0 = move-exception
            androidx.room.RoomDatabase r2 = r1.f23955a
            r2.mo60908k()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.automation.storage.C8939c.mo17646j():java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x027f A[Catch:{ all -> 0x041a }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0283 A[Catch:{ all -> 0x041a }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02bd A[Catch:{ all -> 0x041a }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02c1 A[Catch:{ all -> 0x041a }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02cd A[Catch:{ all -> 0x041a }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02cf A[Catch:{ all -> 0x041a }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0301 A[Catch:{ all -> 0x041a }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0305 A[Catch:{ all -> 0x041a }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0323 A[Catch:{ all -> 0x041a }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0328 A[Catch:{ all -> 0x041a }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0348 A[Catch:{ all -> 0x041a }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x034c A[Catch:{ all -> 0x041a }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x035a A[Catch:{ all -> 0x041a }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0360 A[Catch:{ all -> 0x041a }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x037a A[Catch:{ all -> 0x041a }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x037e A[Catch:{ all -> 0x041a }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0394 A[Catch:{ all -> 0x041a }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0398 A[Catch:{ all -> 0x041a }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x03ae A[Catch:{ all -> 0x041a }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x03b0 A[Catch:{ all -> 0x041a }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x03c0 A[Catch:{ all -> 0x041a }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03cf A[Catch:{ all -> 0x041a }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03d6 A[Catch:{ all -> 0x041a }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x03db A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x025f A[Catch:{ all -> 0x041a }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0263 A[Catch:{ all -> 0x041a }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x026f A[Catch:{ all -> 0x041a }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0273 A[Catch:{ all -> 0x041a }] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.urbanairship.automation.storage.C8946e> mo17647k(java.util.Collection<java.lang.String> r34) {
        /*
            r33 = this;
            r1 = r33
            java.lang.StringBuilder r0 = androidx.room.util.C20382e.m95158d()
            java.lang.String r2 = "SELECT * FROM schedules WHERE (scheduleId IN ("
            r0.append(r2)
            int r2 = r34.size()
            androidx.room.util.C20382e.m95155a(r0, r2)
            java.lang.String r3 = "))"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            int r2 = r2 + 0
            androidx.room.v1 r2 = androidx.room.C20400v1.m95183d(r0, r2)
            java.util.Iterator r0 = r34.iterator()
            r3 = 1
            r4 = r3
        L_0x0027:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x003f
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L_0x0039
            r2.mo60800u3(r4)
            goto L_0x003c
        L_0x0039:
            r2.mo60801v2(r4, r5)
        L_0x003c:
            int r4 = r4 + 1
            goto L_0x0027
        L_0x003f:
            androidx.room.RoomDatabase r0 = r1.f23955a
            r0.mo60904d()
            androidx.room.RoomDatabase r0 = r1.f23955a
            r0.mo60905e()
            androidx.room.RoomDatabase r0 = r1.f23955a     // Catch:{ all -> 0x0426 }
            r4 = 0
            android.database.Cursor r3 = androidx.room.util.C20378b.m95145f(r0, r2, r3, r4)     // Catch:{ all -> 0x0426 }
            java.lang.String r0 = "id"
            int r0 = androidx.room.util.C20376a.m95137e(r3, r0)     // Catch:{ all -> 0x041c }
            java.lang.String r5 = "scheduleId"
            int r5 = androidx.room.util.C20376a.m95137e(r3, r5)     // Catch:{ all -> 0x041c }
            java.lang.String r6 = "group"
            int r6 = androidx.room.util.C20376a.m95137e(r3, r6)     // Catch:{ all -> 0x041c }
            java.lang.String r7 = "metadata"
            int r7 = androidx.room.util.C20376a.m95137e(r3, r7)     // Catch:{ all -> 0x041c }
            java.lang.String r8 = "limit"
            int r8 = androidx.room.util.C20376a.m95137e(r3, r8)     // Catch:{ all -> 0x041c }
            java.lang.String r9 = "priority"
            int r9 = androidx.room.util.C20376a.m95137e(r3, r9)     // Catch:{ all -> 0x041c }
            java.lang.String r10 = "scheduleStart"
            int r10 = androidx.room.util.C20376a.m95137e(r3, r10)     // Catch:{ all -> 0x041c }
            java.lang.String r11 = "scheduleEnd"
            int r11 = androidx.room.util.C20376a.m95137e(r3, r11)     // Catch:{ all -> 0x041c }
            java.lang.String r12 = "editGracePeriod"
            int r12 = androidx.room.util.C20376a.m95137e(r3, r12)     // Catch:{ all -> 0x041c }
            java.lang.String r13 = "interval"
            int r13 = androidx.room.util.C20376a.m95137e(r3, r13)     // Catch:{ all -> 0x041c }
            java.lang.String r14 = "scheduleType"
            int r14 = androidx.room.util.C20376a.m95137e(r3, r14)     // Catch:{ all -> 0x041c }
            java.lang.String r15 = "data"
            int r15 = androidx.room.util.C20376a.m95137e(r3, r15)     // Catch:{ all -> 0x041c }
            java.lang.String r4 = "count"
            int r4 = androidx.room.util.C20376a.m95137e(r3, r4)     // Catch:{ all -> 0x041c }
            r16 = r2
            java.lang.String r2 = "executionState"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x041a }
            r17 = r2
            java.lang.String r2 = "executionStateChangeDate"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x041a }
            r18 = r2
            java.lang.String r2 = "triggerContext"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x041a }
            r19 = r2
            java.lang.String r2 = "appState"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x041a }
            r20 = r2
            java.lang.String r2 = "screens"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x041a }
            r21 = r2
            java.lang.String r2 = "seconds"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x041a }
            r22 = r2
            java.lang.String r2 = "regionId"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x041a }
            r23 = r2
            java.lang.String r2 = "audience"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x041a }
            r24 = r2
            java.lang.String r2 = "campaigns"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x041a }
            r25 = r2
            java.lang.String r2 = "reportingContext"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x041a }
            r26 = r2
            java.lang.String r2 = "frequencyConstraintIds"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x041a }
            r27 = r2
            androidx.collection.a r2 = new androidx.collection.a     // Catch:{ all -> 0x041a }
            r2.<init>()     // Catch:{ all -> 0x041a }
        L_0x00fd:
            boolean r28 = r3.moveToNext()     // Catch:{ all -> 0x041a }
            if (r28 == 0) goto L_0x0129
            boolean r28 = r3.isNull(r5)     // Catch:{ all -> 0x041a }
            if (r28 != 0) goto L_0x00fd
            r28 = r4
            java.lang.String r4 = r3.getString(r5)     // Catch:{ all -> 0x041a }
            java.lang.Object r29 = r2.get(r4)     // Catch:{ all -> 0x041a }
            java.util.ArrayList r29 = (java.util.ArrayList) r29     // Catch:{ all -> 0x041a }
            if (r29 != 0) goto L_0x0122
            r29 = r15
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x041a }
            r15.<init>()     // Catch:{ all -> 0x041a }
            r2.put(r4, r15)     // Catch:{ all -> 0x041a }
            goto L_0x0124
        L_0x0122:
            r29 = r15
        L_0x0124:
            r4 = r28
            r15 = r29
            goto L_0x00fd
        L_0x0129:
            r28 = r4
            r29 = r15
            r4 = -1
            r3.moveToPosition(r4)     // Catch:{ all -> 0x041a }
            r1.mo17660x(r2)     // Catch:{ all -> 0x041a }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x041a }
            int r15 = r3.getCount()     // Catch:{ all -> 0x041a }
            r4.<init>(r15)     // Catch:{ all -> 0x041a }
        L_0x013d:
            boolean r15 = r3.moveToNext()     // Catch:{ all -> 0x041a }
            if (r15 == 0) goto L_0x0408
            boolean r15 = r3.isNull(r0)     // Catch:{ all -> 0x041a }
            if (r15 == 0) goto L_0x0244
            boolean r15 = r3.isNull(r5)     // Catch:{ all -> 0x041a }
            if (r15 == 0) goto L_0x0244
            boolean r15 = r3.isNull(r6)     // Catch:{ all -> 0x041a }
            if (r15 == 0) goto L_0x0244
            boolean r15 = r3.isNull(r7)     // Catch:{ all -> 0x041a }
            if (r15 == 0) goto L_0x0244
            boolean r15 = r3.isNull(r8)     // Catch:{ all -> 0x041a }
            if (r15 == 0) goto L_0x0244
            boolean r15 = r3.isNull(r9)     // Catch:{ all -> 0x041a }
            if (r15 == 0) goto L_0x0244
            boolean r15 = r3.isNull(r10)     // Catch:{ all -> 0x041a }
            if (r15 == 0) goto L_0x0244
            boolean r15 = r3.isNull(r11)     // Catch:{ all -> 0x041a }
            if (r15 == 0) goto L_0x0244
            boolean r15 = r3.isNull(r12)     // Catch:{ all -> 0x041a }
            if (r15 == 0) goto L_0x0244
            boolean r15 = r3.isNull(r13)     // Catch:{ all -> 0x041a }
            if (r15 == 0) goto L_0x0244
            boolean r15 = r3.isNull(r14)     // Catch:{ all -> 0x041a }
            if (r15 == 0) goto L_0x0244
            r15 = r29
            boolean r29 = r3.isNull(r15)     // Catch:{ all -> 0x041a }
            if (r29 == 0) goto L_0x0246
            r29 = r4
            r4 = r28
            boolean r28 = r3.isNull(r4)     // Catch:{ all -> 0x041a }
            if (r28 == 0) goto L_0x024a
            r28 = r2
            r2 = r17
            boolean r17 = r3.isNull(r2)     // Catch:{ all -> 0x041a }
            if (r17 == 0) goto L_0x0241
            r17 = r2
            r2 = r18
            boolean r18 = r3.isNull(r2)     // Catch:{ all -> 0x041a }
            if (r18 == 0) goto L_0x023e
            r18 = r2
            r2 = r19
            boolean r19 = r3.isNull(r2)     // Catch:{ all -> 0x041a }
            if (r19 == 0) goto L_0x023b
            r19 = r2
            r2 = r20
            boolean r20 = r3.isNull(r2)     // Catch:{ all -> 0x041a }
            if (r20 == 0) goto L_0x0238
            r20 = r2
            r2 = r21
            boolean r21 = r3.isNull(r2)     // Catch:{ all -> 0x041a }
            if (r21 == 0) goto L_0x0235
            r21 = r2
            r2 = r22
            boolean r22 = r3.isNull(r2)     // Catch:{ all -> 0x041a }
            if (r22 == 0) goto L_0x0232
            r22 = r2
            r2 = r23
            boolean r23 = r3.isNull(r2)     // Catch:{ all -> 0x041a }
            if (r23 == 0) goto L_0x022f
            r23 = r2
            r2 = r24
            boolean r24 = r3.isNull(r2)     // Catch:{ all -> 0x041a }
            if (r24 == 0) goto L_0x022c
            r24 = r2
            r2 = r25
            boolean r25 = r3.isNull(r2)     // Catch:{ all -> 0x041a }
            if (r25 == 0) goto L_0x0229
            r25 = r2
            r2 = r26
            boolean r26 = r3.isNull(r2)     // Catch:{ all -> 0x041a }
            if (r26 == 0) goto L_0x0226
            r26 = r2
            r2 = r27
            boolean r27 = r3.isNull(r2)     // Catch:{ all -> 0x041a }
            if (r27 != 0) goto L_0x0208
            r27 = r2
            goto L_0x024c
        L_0x0208:
            r31 = r0
            r0 = r2
            r30 = r4
            r2 = 0
            r32 = r17
            r17 = r6
            r6 = r23
            r23 = r7
            r7 = r24
            r24 = r22
            r22 = r21
            r21 = r20
            r20 = r19
            r19 = r18
            r18 = r32
            goto L_0x03ba
        L_0x0226:
            r26 = r2
            goto L_0x024c
        L_0x0229:
            r25 = r2
            goto L_0x024c
        L_0x022c:
            r24 = r2
            goto L_0x024c
        L_0x022f:
            r23 = r2
            goto L_0x024c
        L_0x0232:
            r22 = r2
            goto L_0x024c
        L_0x0235:
            r21 = r2
            goto L_0x024c
        L_0x0238:
            r20 = r2
            goto L_0x024c
        L_0x023b:
            r19 = r2
            goto L_0x024c
        L_0x023e:
            r18 = r2
            goto L_0x024c
        L_0x0241:
            r17 = r2
            goto L_0x024c
        L_0x0244:
            r15 = r29
        L_0x0246:
            r29 = r4
            r4 = r28
        L_0x024a:
            r28 = r2
        L_0x024c:
            com.urbanairship.automation.storage.h r2 = new com.urbanairship.automation.storage.h     // Catch:{ all -> 0x041a }
            r2.<init>()     // Catch:{ all -> 0x041a }
            r30 = r4
            int r4 = r3.getInt(r0)     // Catch:{ all -> 0x041a }
            r2.f24010a = r4     // Catch:{ all -> 0x041a }
            boolean r4 = r3.isNull(r5)     // Catch:{ all -> 0x041a }
            if (r4 == 0) goto L_0x0263
            r4 = 0
            r2.f24011b = r4     // Catch:{ all -> 0x041a }
            goto L_0x0269
        L_0x0263:
            java.lang.String r4 = r3.getString(r5)     // Catch:{ all -> 0x041a }
            r2.f24011b = r4     // Catch:{ all -> 0x041a }
        L_0x0269:
            boolean r4 = r3.isNull(r6)     // Catch:{ all -> 0x041a }
            if (r4 == 0) goto L_0x0273
            r4 = 0
            r2.f24012c = r4     // Catch:{ all -> 0x041a }
            goto L_0x0279
        L_0x0273:
            java.lang.String r4 = r3.getString(r6)     // Catch:{ all -> 0x041a }
            r2.f24012c = r4     // Catch:{ all -> 0x041a }
        L_0x0279:
            boolean r4 = r3.isNull(r7)     // Catch:{ all -> 0x041a }
            if (r4 == 0) goto L_0x0283
            r31 = r0
            r4 = 0
            goto L_0x0289
        L_0x0283:
            java.lang.String r4 = r3.getString(r7)     // Catch:{ all -> 0x041a }
            r31 = r0
        L_0x0289:
            com.urbanairship.json.f r0 = r1.f23957c     // Catch:{ all -> 0x041a }
            com.urbanairship.json.b r0 = r0.mo18843a(r4)     // Catch:{ all -> 0x041a }
            r2.f24013d = r0     // Catch:{ all -> 0x041a }
            int r0 = r3.getInt(r8)     // Catch:{ all -> 0x041a }
            r2.f24014e = r0     // Catch:{ all -> 0x041a }
            int r0 = r3.getInt(r9)     // Catch:{ all -> 0x041a }
            r2.f24015f = r0     // Catch:{ all -> 0x041a }
            r0 = r6
            r4 = r7
            long r6 = r3.getLong(r10)     // Catch:{ all -> 0x041a }
            r2.f24016g = r6     // Catch:{ all -> 0x041a }
            long r6 = r3.getLong(r11)     // Catch:{ all -> 0x041a }
            r2.f24017h = r6     // Catch:{ all -> 0x041a }
            long r6 = r3.getLong(r12)     // Catch:{ all -> 0x041a }
            r2.f24018i = r6     // Catch:{ all -> 0x041a }
            long r6 = r3.getLong(r13)     // Catch:{ all -> 0x041a }
            r2.f24019j = r6     // Catch:{ all -> 0x041a }
            boolean r6 = r3.isNull(r14)     // Catch:{ all -> 0x041a }
            if (r6 == 0) goto L_0x02c1
            r6 = 0
            r2.f24020k = r6     // Catch:{ all -> 0x041a }
            goto L_0x02c7
        L_0x02c1:
            java.lang.String r6 = r3.getString(r14)     // Catch:{ all -> 0x041a }
            r2.f24020k = r6     // Catch:{ all -> 0x041a }
        L_0x02c7:
            boolean r6 = r3.isNull(r15)     // Catch:{ all -> 0x041a }
            if (r6 == 0) goto L_0x02cf
            r6 = 0
            goto L_0x02d3
        L_0x02cf:
            java.lang.String r6 = r3.getString(r15)     // Catch:{ all -> 0x041a }
        L_0x02d3:
            com.urbanairship.json.f r7 = r1.f23957c     // Catch:{ all -> 0x041a }
            com.urbanairship.json.JsonValue r6 = r7.mo18847e(r6)     // Catch:{ all -> 0x041a }
            r2.f24021l = r6     // Catch:{ all -> 0x041a }
            r6 = r30
            int r7 = r3.getInt(r6)     // Catch:{ all -> 0x041a }
            r2.f24022m = r7     // Catch:{ all -> 0x041a }
            r7 = r17
            r17 = r0
            int r0 = r3.getInt(r7)     // Catch:{ all -> 0x041a }
            r2.f24023n = r0     // Catch:{ all -> 0x041a }
            r30 = r6
            r0 = r18
            r18 = r7
            long r6 = r3.getLong(r0)     // Catch:{ all -> 0x041a }
            r2.f24024o = r6     // Catch:{ all -> 0x041a }
            r6 = r19
            boolean r7 = r3.isNull(r6)     // Catch:{ all -> 0x041a }
            if (r7 == 0) goto L_0x0305
            r19 = r0
            r7 = 0
            goto L_0x030b
        L_0x0305:
            java.lang.String r7 = r3.getString(r6)     // Catch:{ all -> 0x041a }
            r19 = r0
        L_0x030b:
            com.urbanairship.automation.storage.d r0 = r1.f23958d     // Catch:{ all -> 0x041a }
            com.urbanairship.automation.d0 r0 = r0.mo17668e(r7)     // Catch:{ all -> 0x041a }
            r2.f24025p = r0     // Catch:{ all -> 0x041a }
            r0 = r20
            int r7 = r3.getInt(r0)     // Catch:{ all -> 0x041a }
            r2.f24026q = r7     // Catch:{ all -> 0x041a }
            r7 = r21
            boolean r20 = r3.isNull(r7)     // Catch:{ all -> 0x041a }
            if (r20 == 0) goto L_0x0328
            r21 = r0
            r20 = 0
            goto L_0x032e
        L_0x0328:
            java.lang.String r20 = r3.getString(r7)     // Catch:{ all -> 0x041a }
            r21 = r0
        L_0x032e:
            java.util.List r0 = com.urbanairship.automation.storage.C8945d.m33317d(r20)     // Catch:{ all -> 0x041a }
            r2.f24027r = r0     // Catch:{ all -> 0x041a }
            r20 = r6
            r0 = r22
            r22 = r7
            long r6 = r3.getLong(r0)     // Catch:{ all -> 0x041a }
            r2.f24028s = r6     // Catch:{ all -> 0x041a }
            r6 = r23
            boolean r7 = r3.isNull(r6)     // Catch:{ all -> 0x041a }
            if (r7 == 0) goto L_0x034c
            r7 = 0
            r2.f24029t = r7     // Catch:{ all -> 0x041a }
            goto L_0x0352
        L_0x034c:
            java.lang.String r7 = r3.getString(r6)     // Catch:{ all -> 0x041a }
            r2.f24029t = r7     // Catch:{ all -> 0x041a }
        L_0x0352:
            r7 = r24
            boolean r23 = r3.isNull(r7)     // Catch:{ all -> 0x041a }
            if (r23 == 0) goto L_0x0360
            r24 = r0
            r23 = r4
            r0 = 0
            goto L_0x036a
        L_0x0360:
            java.lang.String r23 = r3.getString(r7)     // Catch:{ all -> 0x041a }
            r24 = r0
            r0 = r23
            r23 = r4
        L_0x036a:
            com.urbanairship.automation.storage.d r4 = r1.f23958d     // Catch:{ all -> 0x041a }
            com.urbanairship.automation.b r0 = r4.mo17666a(r0)     // Catch:{ all -> 0x041a }
            r2.f24030u = r0     // Catch:{ all -> 0x041a }
            r0 = r25
            boolean r4 = r3.isNull(r0)     // Catch:{ all -> 0x041a }
            if (r4 == 0) goto L_0x037e
            r25 = r0
            r4 = 0
            goto L_0x0384
        L_0x037e:
            java.lang.String r4 = r3.getString(r0)     // Catch:{ all -> 0x041a }
            r25 = r0
        L_0x0384:
            com.urbanairship.json.f r0 = r1.f23957c     // Catch:{ all -> 0x041a }
            com.urbanairship.json.JsonValue r0 = r0.mo18847e(r4)     // Catch:{ all -> 0x041a }
            r2.f24031v = r0     // Catch:{ all -> 0x041a }
            r0 = r26
            boolean r4 = r3.isNull(r0)     // Catch:{ all -> 0x041a }
            if (r4 == 0) goto L_0x0398
            r26 = r0
            r4 = 0
            goto L_0x039e
        L_0x0398:
            java.lang.String r4 = r3.getString(r0)     // Catch:{ all -> 0x041a }
            r26 = r0
        L_0x039e:
            com.urbanairship.json.f r0 = r1.f23957c     // Catch:{ all -> 0x041a }
            com.urbanairship.json.JsonValue r0 = r0.mo18847e(r4)     // Catch:{ all -> 0x041a }
            r2.f24032w = r0     // Catch:{ all -> 0x041a }
            r0 = r27
            boolean r4 = r3.isNull(r0)     // Catch:{ all -> 0x041a }
            if (r4 == 0) goto L_0x03b0
            r4 = 0
            goto L_0x03b4
        L_0x03b0:
            java.lang.String r4 = r3.getString(r0)     // Catch:{ all -> 0x041a }
        L_0x03b4:
            java.util.List r4 = com.urbanairship.automation.storage.C8945d.m33317d(r4)     // Catch:{ all -> 0x041a }
            r2.f24033x = r4     // Catch:{ all -> 0x041a }
        L_0x03ba:
            boolean r4 = r3.isNull(r5)     // Catch:{ all -> 0x041a }
            if (r4 != 0) goto L_0x03cf
            java.lang.String r4 = r3.getString(r5)     // Catch:{ all -> 0x041a }
            r27 = r0
            r0 = r28
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x041a }
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ all -> 0x041a }
            goto L_0x03d4
        L_0x03cf:
            r27 = r0
            r0 = r28
            r4 = 0
        L_0x03d4:
            if (r4 != 0) goto L_0x03db
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x041a }
            r4.<init>()     // Catch:{ all -> 0x041a }
        L_0x03db:
            r28 = r0
            com.urbanairship.automation.storage.e r0 = new com.urbanairship.automation.storage.e     // Catch:{ all -> 0x041a }
            r0.<init>(r2, r4)     // Catch:{ all -> 0x041a }
            r2 = r29
            r2.add(r0)     // Catch:{ all -> 0x041a }
            r4 = r2
            r29 = r15
            r2 = r28
            r28 = r30
            r0 = r31
            r32 = r23
            r23 = r6
            r6 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            r22 = r24
            r24 = r7
            r7 = r32
            goto L_0x013d
        L_0x0408:
            r2 = r4
            androidx.room.RoomDatabase r0 = r1.f23955a     // Catch:{ all -> 0x041a }
            r0.mo60901O()     // Catch:{ all -> 0x041a }
            r3.close()     // Catch:{ all -> 0x0426 }
            r16.release()     // Catch:{ all -> 0x0426 }
            androidx.room.RoomDatabase r0 = r1.f23955a
            r0.mo60908k()
            return r2
        L_0x041a:
            r0 = move-exception
            goto L_0x041f
        L_0x041c:
            r0 = move-exception
            r16 = r2
        L_0x041f:
            r3.close()     // Catch:{ all -> 0x0426 }
            r16.release()     // Catch:{ all -> 0x0426 }
            throw r0     // Catch:{ all -> 0x0426 }
        L_0x0426:
            r0 = move-exception
            androidx.room.RoomDatabase r2 = r1.f23955a
            r2.mo60908k()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.automation.storage.C8939c.mo17647k(java.util.Collection):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0283 A[Catch:{ all -> 0x042e }] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0287 A[Catch:{ all -> 0x042e }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0293 A[Catch:{ all -> 0x042e }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0297 A[Catch:{ all -> 0x042e }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02d1 A[Catch:{ all -> 0x042e }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02d5 A[Catch:{ all -> 0x042e }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02e1 A[Catch:{ all -> 0x042e }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02e3 A[Catch:{ all -> 0x042e }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0315 A[Catch:{ all -> 0x042e }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0319 A[Catch:{ all -> 0x042e }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0337 A[Catch:{ all -> 0x042e }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x033c A[Catch:{ all -> 0x042e }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x035c A[Catch:{ all -> 0x042e }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0360 A[Catch:{ all -> 0x042e }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x036e A[Catch:{ all -> 0x042e }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0374 A[Catch:{ all -> 0x042e }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x038e A[Catch:{ all -> 0x042e }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0392 A[Catch:{ all -> 0x042e }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x03a8 A[Catch:{ all -> 0x042e }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x03ac A[Catch:{ all -> 0x042e }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x03c2 A[Catch:{ all -> 0x042e }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x03c4 A[Catch:{ all -> 0x042e }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03d4 A[Catch:{ all -> 0x042e }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03e3 A[Catch:{ all -> 0x042e }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x03ea A[Catch:{ all -> 0x042e }] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x03ef A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0273 A[Catch:{ all -> 0x042e }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0277 A[Catch:{ all -> 0x042e }] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.urbanairship.automation.storage.C8946e> mo17648l(java.util.Collection<java.lang.String> r33, java.lang.String r34) {
        /*
            r32 = this;
            r1 = r32
            r0 = r34
            java.lang.StringBuilder r2 = androidx.room.util.C20382e.m95158d()
            java.lang.String r3 = "SELECT * FROM schedules WHERE (scheduleId IN ("
            r2.append(r3)
            int r3 = r33.size()
            androidx.room.util.C20382e.m95155a(r2, r3)
            java.lang.String r4 = ")) AND (scheduleType = "
            r2.append(r4)
            java.lang.String r4 = "?"
            r2.append(r4)
            java.lang.String r4 = ")"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r4 = 1
            int r3 = r3 + r4
            androidx.room.v1 r2 = androidx.room.C20400v1.m95183d(r2, r3)
            java.util.Iterator r5 = r33.iterator()
            r6 = r4
        L_0x0032:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x004a
            java.lang.Object r7 = r5.next()
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L_0x0044
            r2.mo60800u3(r6)
            goto L_0x0047
        L_0x0044:
            r2.mo60801v2(r6, r7)
        L_0x0047:
            int r6 = r6 + 1
            goto L_0x0032
        L_0x004a:
            if (r0 != 0) goto L_0x0050
            r2.mo60800u3(r3)
            goto L_0x0053
        L_0x0050:
            r2.mo60801v2(r3, r0)
        L_0x0053:
            androidx.room.RoomDatabase r0 = r1.f23955a
            r0.mo60904d()
            androidx.room.RoomDatabase r0 = r1.f23955a
            r0.mo60905e()
            androidx.room.RoomDatabase r0 = r1.f23955a     // Catch:{ all -> 0x043a }
            r3 = 0
            android.database.Cursor r4 = androidx.room.util.C20378b.m95145f(r0, r2, r4, r3)     // Catch:{ all -> 0x043a }
            java.lang.String r0 = "id"
            int r0 = androidx.room.util.C20376a.m95137e(r4, r0)     // Catch:{ all -> 0x0430 }
            java.lang.String r5 = "scheduleId"
            int r5 = androidx.room.util.C20376a.m95137e(r4, r5)     // Catch:{ all -> 0x0430 }
            java.lang.String r6 = "group"
            int r6 = androidx.room.util.C20376a.m95137e(r4, r6)     // Catch:{ all -> 0x0430 }
            java.lang.String r7 = "metadata"
            int r7 = androidx.room.util.C20376a.m95137e(r4, r7)     // Catch:{ all -> 0x0430 }
            java.lang.String r8 = "limit"
            int r8 = androidx.room.util.C20376a.m95137e(r4, r8)     // Catch:{ all -> 0x0430 }
            java.lang.String r9 = "priority"
            int r9 = androidx.room.util.C20376a.m95137e(r4, r9)     // Catch:{ all -> 0x0430 }
            java.lang.String r10 = "scheduleStart"
            int r10 = androidx.room.util.C20376a.m95137e(r4, r10)     // Catch:{ all -> 0x0430 }
            java.lang.String r11 = "scheduleEnd"
            int r11 = androidx.room.util.C20376a.m95137e(r4, r11)     // Catch:{ all -> 0x0430 }
            java.lang.String r12 = "editGracePeriod"
            int r12 = androidx.room.util.C20376a.m95137e(r4, r12)     // Catch:{ all -> 0x0430 }
            java.lang.String r13 = "interval"
            int r13 = androidx.room.util.C20376a.m95137e(r4, r13)     // Catch:{ all -> 0x0430 }
            java.lang.String r14 = "scheduleType"
            int r14 = androidx.room.util.C20376a.m95137e(r4, r14)     // Catch:{ all -> 0x0430 }
            java.lang.String r15 = "data"
            int r15 = androidx.room.util.C20376a.m95137e(r4, r15)     // Catch:{ all -> 0x0430 }
            java.lang.String r3 = "count"
            int r3 = androidx.room.util.C20376a.m95137e(r4, r3)     // Catch:{ all -> 0x0430 }
            r16 = r2
            java.lang.String r2 = "executionState"
            int r2 = androidx.room.util.C20376a.m95137e(r4, r2)     // Catch:{ all -> 0x042e }
            r34 = r2
            java.lang.String r2 = "executionStateChangeDate"
            int r2 = androidx.room.util.C20376a.m95137e(r4, r2)     // Catch:{ all -> 0x042e }
            r17 = r2
            java.lang.String r2 = "triggerContext"
            int r2 = androidx.room.util.C20376a.m95137e(r4, r2)     // Catch:{ all -> 0x042e }
            r18 = r2
            java.lang.String r2 = "appState"
            int r2 = androidx.room.util.C20376a.m95137e(r4, r2)     // Catch:{ all -> 0x042e }
            r19 = r2
            java.lang.String r2 = "screens"
            int r2 = androidx.room.util.C20376a.m95137e(r4, r2)     // Catch:{ all -> 0x042e }
            r20 = r2
            java.lang.String r2 = "seconds"
            int r2 = androidx.room.util.C20376a.m95137e(r4, r2)     // Catch:{ all -> 0x042e }
            r21 = r2
            java.lang.String r2 = "regionId"
            int r2 = androidx.room.util.C20376a.m95137e(r4, r2)     // Catch:{ all -> 0x042e }
            r22 = r2
            java.lang.String r2 = "audience"
            int r2 = androidx.room.util.C20376a.m95137e(r4, r2)     // Catch:{ all -> 0x042e }
            r23 = r2
            java.lang.String r2 = "campaigns"
            int r2 = androidx.room.util.C20376a.m95137e(r4, r2)     // Catch:{ all -> 0x042e }
            r24 = r2
            java.lang.String r2 = "reportingContext"
            int r2 = androidx.room.util.C20376a.m95137e(r4, r2)     // Catch:{ all -> 0x042e }
            r25 = r2
            java.lang.String r2 = "frequencyConstraintIds"
            int r2 = androidx.room.util.C20376a.m95137e(r4, r2)     // Catch:{ all -> 0x042e }
            r26 = r2
            androidx.collection.a r2 = new androidx.collection.a     // Catch:{ all -> 0x042e }
            r2.<init>()     // Catch:{ all -> 0x042e }
        L_0x0111:
            boolean r27 = r4.moveToNext()     // Catch:{ all -> 0x042e }
            if (r27 == 0) goto L_0x013d
            boolean r27 = r4.isNull(r5)     // Catch:{ all -> 0x042e }
            if (r27 != 0) goto L_0x0111
            r27 = r3
            java.lang.String r3 = r4.getString(r5)     // Catch:{ all -> 0x042e }
            java.lang.Object r28 = r2.get(r3)     // Catch:{ all -> 0x042e }
            java.util.ArrayList r28 = (java.util.ArrayList) r28     // Catch:{ all -> 0x042e }
            if (r28 != 0) goto L_0x0136
            r28 = r15
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x042e }
            r15.<init>()     // Catch:{ all -> 0x042e }
            r2.put(r3, r15)     // Catch:{ all -> 0x042e }
            goto L_0x0138
        L_0x0136:
            r28 = r15
        L_0x0138:
            r3 = r27
            r15 = r28
            goto L_0x0111
        L_0x013d:
            r27 = r3
            r28 = r15
            r3 = -1
            r4.moveToPosition(r3)     // Catch:{ all -> 0x042e }
            r1.mo17660x(r2)     // Catch:{ all -> 0x042e }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x042e }
            int r15 = r4.getCount()     // Catch:{ all -> 0x042e }
            r3.<init>(r15)     // Catch:{ all -> 0x042e }
        L_0x0151:
            boolean r15 = r4.moveToNext()     // Catch:{ all -> 0x042e }
            if (r15 == 0) goto L_0x041c
            boolean r15 = r4.isNull(r0)     // Catch:{ all -> 0x042e }
            if (r15 == 0) goto L_0x0258
            boolean r15 = r4.isNull(r5)     // Catch:{ all -> 0x042e }
            if (r15 == 0) goto L_0x0258
            boolean r15 = r4.isNull(r6)     // Catch:{ all -> 0x042e }
            if (r15 == 0) goto L_0x0258
            boolean r15 = r4.isNull(r7)     // Catch:{ all -> 0x042e }
            if (r15 == 0) goto L_0x0258
            boolean r15 = r4.isNull(r8)     // Catch:{ all -> 0x042e }
            if (r15 == 0) goto L_0x0258
            boolean r15 = r4.isNull(r9)     // Catch:{ all -> 0x042e }
            if (r15 == 0) goto L_0x0258
            boolean r15 = r4.isNull(r10)     // Catch:{ all -> 0x042e }
            if (r15 == 0) goto L_0x0258
            boolean r15 = r4.isNull(r11)     // Catch:{ all -> 0x042e }
            if (r15 == 0) goto L_0x0258
            boolean r15 = r4.isNull(r12)     // Catch:{ all -> 0x042e }
            if (r15 == 0) goto L_0x0258
            boolean r15 = r4.isNull(r13)     // Catch:{ all -> 0x042e }
            if (r15 == 0) goto L_0x0258
            boolean r15 = r4.isNull(r14)     // Catch:{ all -> 0x042e }
            if (r15 == 0) goto L_0x0258
            r15 = r28
            boolean r28 = r4.isNull(r15)     // Catch:{ all -> 0x042e }
            if (r28 == 0) goto L_0x025a
            r28 = r3
            r3 = r27
            boolean r27 = r4.isNull(r3)     // Catch:{ all -> 0x042e }
            if (r27 == 0) goto L_0x025e
            r27 = r2
            r2 = r34
            boolean r29 = r4.isNull(r2)     // Catch:{ all -> 0x042e }
            if (r29 == 0) goto L_0x0255
            r34 = r2
            r2 = r17
            boolean r17 = r4.isNull(r2)     // Catch:{ all -> 0x042e }
            if (r17 == 0) goto L_0x0252
            r17 = r2
            r2 = r18
            boolean r18 = r4.isNull(r2)     // Catch:{ all -> 0x042e }
            if (r18 == 0) goto L_0x024f
            r18 = r2
            r2 = r19
            boolean r19 = r4.isNull(r2)     // Catch:{ all -> 0x042e }
            if (r19 == 0) goto L_0x024c
            r19 = r2
            r2 = r20
            boolean r20 = r4.isNull(r2)     // Catch:{ all -> 0x042e }
            if (r20 == 0) goto L_0x0249
            r20 = r2
            r2 = r21
            boolean r21 = r4.isNull(r2)     // Catch:{ all -> 0x042e }
            if (r21 == 0) goto L_0x0246
            r21 = r2
            r2 = r22
            boolean r22 = r4.isNull(r2)     // Catch:{ all -> 0x042e }
            if (r22 == 0) goto L_0x0243
            r22 = r2
            r2 = r23
            boolean r23 = r4.isNull(r2)     // Catch:{ all -> 0x042e }
            if (r23 == 0) goto L_0x0240
            r23 = r2
            r2 = r24
            boolean r24 = r4.isNull(r2)     // Catch:{ all -> 0x042e }
            if (r24 == 0) goto L_0x023d
            r24 = r2
            r2 = r25
            boolean r25 = r4.isNull(r2)     // Catch:{ all -> 0x042e }
            if (r25 == 0) goto L_0x023a
            r25 = r2
            r2 = r26
            boolean r26 = r4.isNull(r2)     // Catch:{ all -> 0x042e }
            if (r26 != 0) goto L_0x021c
            r26 = r2
            goto L_0x0260
        L_0x021c:
            r30 = r0
            r0 = r2
            r29 = r3
            r2 = 0
            r31 = r17
            r17 = r34
            r34 = r6
            r6 = r22
            r22 = r7
            r7 = r23
            r23 = r21
            r21 = r20
            r20 = r19
            r19 = r18
            r18 = r31
            goto L_0x03ce
        L_0x023a:
            r25 = r2
            goto L_0x0260
        L_0x023d:
            r24 = r2
            goto L_0x0260
        L_0x0240:
            r23 = r2
            goto L_0x0260
        L_0x0243:
            r22 = r2
            goto L_0x0260
        L_0x0246:
            r21 = r2
            goto L_0x0260
        L_0x0249:
            r20 = r2
            goto L_0x0260
        L_0x024c:
            r19 = r2
            goto L_0x0260
        L_0x024f:
            r18 = r2
            goto L_0x0260
        L_0x0252:
            r17 = r2
            goto L_0x0260
        L_0x0255:
            r34 = r2
            goto L_0x0260
        L_0x0258:
            r15 = r28
        L_0x025a:
            r28 = r3
            r3 = r27
        L_0x025e:
            r27 = r2
        L_0x0260:
            com.urbanairship.automation.storage.h r2 = new com.urbanairship.automation.storage.h     // Catch:{ all -> 0x042e }
            r2.<init>()     // Catch:{ all -> 0x042e }
            r29 = r3
            int r3 = r4.getInt(r0)     // Catch:{ all -> 0x042e }
            r2.f24010a = r3     // Catch:{ all -> 0x042e }
            boolean r3 = r4.isNull(r5)     // Catch:{ all -> 0x042e }
            if (r3 == 0) goto L_0x0277
            r3 = 0
            r2.f24011b = r3     // Catch:{ all -> 0x042e }
            goto L_0x027d
        L_0x0277:
            java.lang.String r3 = r4.getString(r5)     // Catch:{ all -> 0x042e }
            r2.f24011b = r3     // Catch:{ all -> 0x042e }
        L_0x027d:
            boolean r3 = r4.isNull(r6)     // Catch:{ all -> 0x042e }
            if (r3 == 0) goto L_0x0287
            r3 = 0
            r2.f24012c = r3     // Catch:{ all -> 0x042e }
            goto L_0x028d
        L_0x0287:
            java.lang.String r3 = r4.getString(r6)     // Catch:{ all -> 0x042e }
            r2.f24012c = r3     // Catch:{ all -> 0x042e }
        L_0x028d:
            boolean r3 = r4.isNull(r7)     // Catch:{ all -> 0x042e }
            if (r3 == 0) goto L_0x0297
            r30 = r0
            r3 = 0
            goto L_0x029d
        L_0x0297:
            java.lang.String r3 = r4.getString(r7)     // Catch:{ all -> 0x042e }
            r30 = r0
        L_0x029d:
            com.urbanairship.json.f r0 = r1.f23957c     // Catch:{ all -> 0x042e }
            com.urbanairship.json.b r0 = r0.mo18843a(r3)     // Catch:{ all -> 0x042e }
            r2.f24013d = r0     // Catch:{ all -> 0x042e }
            int r0 = r4.getInt(r8)     // Catch:{ all -> 0x042e }
            r2.f24014e = r0     // Catch:{ all -> 0x042e }
            int r0 = r4.getInt(r9)     // Catch:{ all -> 0x042e }
            r2.f24015f = r0     // Catch:{ all -> 0x042e }
            r0 = r6
            r3 = r7
            long r6 = r4.getLong(r10)     // Catch:{ all -> 0x042e }
            r2.f24016g = r6     // Catch:{ all -> 0x042e }
            long r6 = r4.getLong(r11)     // Catch:{ all -> 0x042e }
            r2.f24017h = r6     // Catch:{ all -> 0x042e }
            long r6 = r4.getLong(r12)     // Catch:{ all -> 0x042e }
            r2.f24018i = r6     // Catch:{ all -> 0x042e }
            long r6 = r4.getLong(r13)     // Catch:{ all -> 0x042e }
            r2.f24019j = r6     // Catch:{ all -> 0x042e }
            boolean r6 = r4.isNull(r14)     // Catch:{ all -> 0x042e }
            if (r6 == 0) goto L_0x02d5
            r6 = 0
            r2.f24020k = r6     // Catch:{ all -> 0x042e }
            goto L_0x02db
        L_0x02d5:
            java.lang.String r6 = r4.getString(r14)     // Catch:{ all -> 0x042e }
            r2.f24020k = r6     // Catch:{ all -> 0x042e }
        L_0x02db:
            boolean r6 = r4.isNull(r15)     // Catch:{ all -> 0x042e }
            if (r6 == 0) goto L_0x02e3
            r6 = 0
            goto L_0x02e7
        L_0x02e3:
            java.lang.String r6 = r4.getString(r15)     // Catch:{ all -> 0x042e }
        L_0x02e7:
            com.urbanairship.json.f r7 = r1.f23957c     // Catch:{ all -> 0x042e }
            com.urbanairship.json.JsonValue r6 = r7.mo18847e(r6)     // Catch:{ all -> 0x042e }
            r2.f24021l = r6     // Catch:{ all -> 0x042e }
            r6 = r29
            int r7 = r4.getInt(r6)     // Catch:{ all -> 0x042e }
            r2.f24022m = r7     // Catch:{ all -> 0x042e }
            r7 = r34
            r34 = r0
            int r0 = r4.getInt(r7)     // Catch:{ all -> 0x042e }
            r2.f24023n = r0     // Catch:{ all -> 0x042e }
            r29 = r6
            r0 = r17
            r17 = r7
            long r6 = r4.getLong(r0)     // Catch:{ all -> 0x042e }
            r2.f24024o = r6     // Catch:{ all -> 0x042e }
            r6 = r18
            boolean r7 = r4.isNull(r6)     // Catch:{ all -> 0x042e }
            if (r7 == 0) goto L_0x0319
            r18 = r0
            r7 = 0
            goto L_0x031f
        L_0x0319:
            java.lang.String r7 = r4.getString(r6)     // Catch:{ all -> 0x042e }
            r18 = r0
        L_0x031f:
            com.urbanairship.automation.storage.d r0 = r1.f23958d     // Catch:{ all -> 0x042e }
            com.urbanairship.automation.d0 r0 = r0.mo17668e(r7)     // Catch:{ all -> 0x042e }
            r2.f24025p = r0     // Catch:{ all -> 0x042e }
            r0 = r19
            int r7 = r4.getInt(r0)     // Catch:{ all -> 0x042e }
            r2.f24026q = r7     // Catch:{ all -> 0x042e }
            r7 = r20
            boolean r19 = r4.isNull(r7)     // Catch:{ all -> 0x042e }
            if (r19 == 0) goto L_0x033c
            r20 = r0
            r19 = 0
            goto L_0x0342
        L_0x033c:
            java.lang.String r19 = r4.getString(r7)     // Catch:{ all -> 0x042e }
            r20 = r0
        L_0x0342:
            java.util.List r0 = com.urbanairship.automation.storage.C8945d.m33317d(r19)     // Catch:{ all -> 0x042e }
            r2.f24027r = r0     // Catch:{ all -> 0x042e }
            r19 = r6
            r0 = r21
            r21 = r7
            long r6 = r4.getLong(r0)     // Catch:{ all -> 0x042e }
            r2.f24028s = r6     // Catch:{ all -> 0x042e }
            r6 = r22
            boolean r7 = r4.isNull(r6)     // Catch:{ all -> 0x042e }
            if (r7 == 0) goto L_0x0360
            r7 = 0
            r2.f24029t = r7     // Catch:{ all -> 0x042e }
            goto L_0x0366
        L_0x0360:
            java.lang.String r7 = r4.getString(r6)     // Catch:{ all -> 0x042e }
            r2.f24029t = r7     // Catch:{ all -> 0x042e }
        L_0x0366:
            r7 = r23
            boolean r22 = r4.isNull(r7)     // Catch:{ all -> 0x042e }
            if (r22 == 0) goto L_0x0374
            r23 = r0
            r22 = r3
            r0 = 0
            goto L_0x037e
        L_0x0374:
            java.lang.String r22 = r4.getString(r7)     // Catch:{ all -> 0x042e }
            r23 = r0
            r0 = r22
            r22 = r3
        L_0x037e:
            com.urbanairship.automation.storage.d r3 = r1.f23958d     // Catch:{ all -> 0x042e }
            com.urbanairship.automation.b r0 = r3.mo17666a(r0)     // Catch:{ all -> 0x042e }
            r2.f24030u = r0     // Catch:{ all -> 0x042e }
            r0 = r24
            boolean r3 = r4.isNull(r0)     // Catch:{ all -> 0x042e }
            if (r3 == 0) goto L_0x0392
            r24 = r0
            r3 = 0
            goto L_0x0398
        L_0x0392:
            java.lang.String r3 = r4.getString(r0)     // Catch:{ all -> 0x042e }
            r24 = r0
        L_0x0398:
            com.urbanairship.json.f r0 = r1.f23957c     // Catch:{ all -> 0x042e }
            com.urbanairship.json.JsonValue r0 = r0.mo18847e(r3)     // Catch:{ all -> 0x042e }
            r2.f24031v = r0     // Catch:{ all -> 0x042e }
            r0 = r25
            boolean r3 = r4.isNull(r0)     // Catch:{ all -> 0x042e }
            if (r3 == 0) goto L_0x03ac
            r25 = r0
            r3 = 0
            goto L_0x03b2
        L_0x03ac:
            java.lang.String r3 = r4.getString(r0)     // Catch:{ all -> 0x042e }
            r25 = r0
        L_0x03b2:
            com.urbanairship.json.f r0 = r1.f23957c     // Catch:{ all -> 0x042e }
            com.urbanairship.json.JsonValue r0 = r0.mo18847e(r3)     // Catch:{ all -> 0x042e }
            r2.f24032w = r0     // Catch:{ all -> 0x042e }
            r0 = r26
            boolean r3 = r4.isNull(r0)     // Catch:{ all -> 0x042e }
            if (r3 == 0) goto L_0x03c4
            r3 = 0
            goto L_0x03c8
        L_0x03c4:
            java.lang.String r3 = r4.getString(r0)     // Catch:{ all -> 0x042e }
        L_0x03c8:
            java.util.List r3 = com.urbanairship.automation.storage.C8945d.m33317d(r3)     // Catch:{ all -> 0x042e }
            r2.f24033x = r3     // Catch:{ all -> 0x042e }
        L_0x03ce:
            boolean r3 = r4.isNull(r5)     // Catch:{ all -> 0x042e }
            if (r3 != 0) goto L_0x03e3
            java.lang.String r3 = r4.getString(r5)     // Catch:{ all -> 0x042e }
            r26 = r0
            r0 = r27
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x042e }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x042e }
            goto L_0x03e8
        L_0x03e3:
            r26 = r0
            r0 = r27
            r3 = 0
        L_0x03e8:
            if (r3 != 0) goto L_0x03ef
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x042e }
            r3.<init>()     // Catch:{ all -> 0x042e }
        L_0x03ef:
            r27 = r0
            com.urbanairship.automation.storage.e r0 = new com.urbanairship.automation.storage.e     // Catch:{ all -> 0x042e }
            r0.<init>(r2, r3)     // Catch:{ all -> 0x042e }
            r2 = r28
            r2.add(r0)     // Catch:{ all -> 0x042e }
            r3 = r2
            r28 = r15
            r2 = r27
            r27 = r29
            r0 = r30
            r31 = r6
            r6 = r34
            r34 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r23
            r23 = r7
            r7 = r22
            r22 = r31
            goto L_0x0151
        L_0x041c:
            r2 = r3
            androidx.room.RoomDatabase r0 = r1.f23955a     // Catch:{ all -> 0x042e }
            r0.mo60901O()     // Catch:{ all -> 0x042e }
            r4.close()     // Catch:{ all -> 0x043a }
            r16.release()     // Catch:{ all -> 0x043a }
            androidx.room.RoomDatabase r0 = r1.f23955a
            r0.mo60908k()
            return r2
        L_0x042e:
            r0 = move-exception
            goto L_0x0433
        L_0x0430:
            r0 = move-exception
            r16 = r2
        L_0x0433:
            r4.close()     // Catch:{ all -> 0x043a }
            r16.release()     // Catch:{ all -> 0x043a }
            throw r0     // Catch:{ all -> 0x043a }
        L_0x043a:
            r0 = move-exception
            androidx.room.RoomDatabase r2 = r1.f23955a
            r2.mo60908k()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.automation.storage.C8939c.mo17648l(java.util.Collection, java.lang.String):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0292 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0296 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02a2 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02a4 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02d6 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02da A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02f8 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02fd A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x031d A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0321 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x032f A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0335 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x034f A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0353 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0369 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x036d A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0383 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0385 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0395 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x03a4 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x03ab A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03b0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0234 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0238 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0244 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0248 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0254 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0258 A[Catch:{ all -> 0x03ef }] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.urbanairship.automation.storage.C8946e> mo17649m(java.lang.String r34) {
        /*
            r33 = this;
            r1 = r33
            r0 = r34
            java.lang.String r2 = "SELECT * FROM schedules WHERE (scheduleType = ?)"
            r3 = 1
            androidx.room.v1 r2 = androidx.room.C20400v1.m95183d(r2, r3)
            if (r0 != 0) goto L_0x0011
            r2.mo60800u3(r3)
            goto L_0x0014
        L_0x0011:
            r2.mo60801v2(r3, r0)
        L_0x0014:
            androidx.room.RoomDatabase r0 = r1.f23955a
            r0.mo60904d()
            androidx.room.RoomDatabase r0 = r1.f23955a
            r0.mo60905e()
            androidx.room.RoomDatabase r0 = r1.f23955a     // Catch:{ all -> 0x03fb }
            r4 = 0
            android.database.Cursor r3 = androidx.room.util.C20378b.m95145f(r0, r2, r3, r4)     // Catch:{ all -> 0x03fb }
            java.lang.String r0 = "id"
            int r0 = androidx.room.util.C20376a.m95137e(r3, r0)     // Catch:{ all -> 0x03f1 }
            java.lang.String r5 = "scheduleId"
            int r5 = androidx.room.util.C20376a.m95137e(r3, r5)     // Catch:{ all -> 0x03f1 }
            java.lang.String r6 = "group"
            int r6 = androidx.room.util.C20376a.m95137e(r3, r6)     // Catch:{ all -> 0x03f1 }
            java.lang.String r7 = "metadata"
            int r7 = androidx.room.util.C20376a.m95137e(r3, r7)     // Catch:{ all -> 0x03f1 }
            java.lang.String r8 = "limit"
            int r8 = androidx.room.util.C20376a.m95137e(r3, r8)     // Catch:{ all -> 0x03f1 }
            java.lang.String r9 = "priority"
            int r9 = androidx.room.util.C20376a.m95137e(r3, r9)     // Catch:{ all -> 0x03f1 }
            java.lang.String r10 = "scheduleStart"
            int r10 = androidx.room.util.C20376a.m95137e(r3, r10)     // Catch:{ all -> 0x03f1 }
            java.lang.String r11 = "scheduleEnd"
            int r11 = androidx.room.util.C20376a.m95137e(r3, r11)     // Catch:{ all -> 0x03f1 }
            java.lang.String r12 = "editGracePeriod"
            int r12 = androidx.room.util.C20376a.m95137e(r3, r12)     // Catch:{ all -> 0x03f1 }
            java.lang.String r13 = "interval"
            int r13 = androidx.room.util.C20376a.m95137e(r3, r13)     // Catch:{ all -> 0x03f1 }
            java.lang.String r14 = "scheduleType"
            int r14 = androidx.room.util.C20376a.m95137e(r3, r14)     // Catch:{ all -> 0x03f1 }
            java.lang.String r15 = "data"
            int r15 = androidx.room.util.C20376a.m95137e(r3, r15)     // Catch:{ all -> 0x03f1 }
            java.lang.String r4 = "count"
            int r4 = androidx.room.util.C20376a.m95137e(r3, r4)     // Catch:{ all -> 0x03f1 }
            r16 = r2
            java.lang.String r2 = "executionState"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03ef }
            r17 = r2
            java.lang.String r2 = "executionStateChangeDate"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03ef }
            r18 = r2
            java.lang.String r2 = "triggerContext"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03ef }
            r19 = r2
            java.lang.String r2 = "appState"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03ef }
            r20 = r2
            java.lang.String r2 = "screens"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03ef }
            r21 = r2
            java.lang.String r2 = "seconds"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03ef }
            r22 = r2
            java.lang.String r2 = "regionId"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03ef }
            r23 = r2
            java.lang.String r2 = "audience"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03ef }
            r24 = r2
            java.lang.String r2 = "campaigns"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03ef }
            r25 = r2
            java.lang.String r2 = "reportingContext"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03ef }
            r26 = r2
            java.lang.String r2 = "frequencyConstraintIds"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03ef }
            r27 = r2
            androidx.collection.a r2 = new androidx.collection.a     // Catch:{ all -> 0x03ef }
            r2.<init>()     // Catch:{ all -> 0x03ef }
        L_0x00d2:
            boolean r28 = r3.moveToNext()     // Catch:{ all -> 0x03ef }
            if (r28 == 0) goto L_0x00fe
            boolean r28 = r3.isNull(r5)     // Catch:{ all -> 0x03ef }
            if (r28 != 0) goto L_0x00d2
            r28 = r4
            java.lang.String r4 = r3.getString(r5)     // Catch:{ all -> 0x03ef }
            java.lang.Object r29 = r2.get(r4)     // Catch:{ all -> 0x03ef }
            java.util.ArrayList r29 = (java.util.ArrayList) r29     // Catch:{ all -> 0x03ef }
            if (r29 != 0) goto L_0x00f7
            r29 = r15
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x03ef }
            r15.<init>()     // Catch:{ all -> 0x03ef }
            r2.put(r4, r15)     // Catch:{ all -> 0x03ef }
            goto L_0x00f9
        L_0x00f7:
            r29 = r15
        L_0x00f9:
            r4 = r28
            r15 = r29
            goto L_0x00d2
        L_0x00fe:
            r28 = r4
            r29 = r15
            r4 = -1
            r3.moveToPosition(r4)     // Catch:{ all -> 0x03ef }
            r1.mo17660x(r2)     // Catch:{ all -> 0x03ef }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x03ef }
            int r15 = r3.getCount()     // Catch:{ all -> 0x03ef }
            r4.<init>(r15)     // Catch:{ all -> 0x03ef }
        L_0x0112:
            boolean r15 = r3.moveToNext()     // Catch:{ all -> 0x03ef }
            if (r15 == 0) goto L_0x03dd
            boolean r15 = r3.isNull(r0)     // Catch:{ all -> 0x03ef }
            if (r15 == 0) goto L_0x0219
            boolean r15 = r3.isNull(r5)     // Catch:{ all -> 0x03ef }
            if (r15 == 0) goto L_0x0219
            boolean r15 = r3.isNull(r6)     // Catch:{ all -> 0x03ef }
            if (r15 == 0) goto L_0x0219
            boolean r15 = r3.isNull(r7)     // Catch:{ all -> 0x03ef }
            if (r15 == 0) goto L_0x0219
            boolean r15 = r3.isNull(r8)     // Catch:{ all -> 0x03ef }
            if (r15 == 0) goto L_0x0219
            boolean r15 = r3.isNull(r9)     // Catch:{ all -> 0x03ef }
            if (r15 == 0) goto L_0x0219
            boolean r15 = r3.isNull(r10)     // Catch:{ all -> 0x03ef }
            if (r15 == 0) goto L_0x0219
            boolean r15 = r3.isNull(r11)     // Catch:{ all -> 0x03ef }
            if (r15 == 0) goto L_0x0219
            boolean r15 = r3.isNull(r12)     // Catch:{ all -> 0x03ef }
            if (r15 == 0) goto L_0x0219
            boolean r15 = r3.isNull(r13)     // Catch:{ all -> 0x03ef }
            if (r15 == 0) goto L_0x0219
            boolean r15 = r3.isNull(r14)     // Catch:{ all -> 0x03ef }
            if (r15 == 0) goto L_0x0219
            r15 = r29
            boolean r29 = r3.isNull(r15)     // Catch:{ all -> 0x03ef }
            if (r29 == 0) goto L_0x021b
            r29 = r4
            r4 = r28
            boolean r28 = r3.isNull(r4)     // Catch:{ all -> 0x03ef }
            if (r28 == 0) goto L_0x021f
            r28 = r2
            r2 = r17
            boolean r17 = r3.isNull(r2)     // Catch:{ all -> 0x03ef }
            if (r17 == 0) goto L_0x0216
            r17 = r2
            r2 = r18
            boolean r18 = r3.isNull(r2)     // Catch:{ all -> 0x03ef }
            if (r18 == 0) goto L_0x0213
            r18 = r2
            r2 = r19
            boolean r19 = r3.isNull(r2)     // Catch:{ all -> 0x03ef }
            if (r19 == 0) goto L_0x0210
            r19 = r2
            r2 = r20
            boolean r20 = r3.isNull(r2)     // Catch:{ all -> 0x03ef }
            if (r20 == 0) goto L_0x020d
            r20 = r2
            r2 = r21
            boolean r21 = r3.isNull(r2)     // Catch:{ all -> 0x03ef }
            if (r21 == 0) goto L_0x020a
            r21 = r2
            r2 = r22
            boolean r22 = r3.isNull(r2)     // Catch:{ all -> 0x03ef }
            if (r22 == 0) goto L_0x0207
            r22 = r2
            r2 = r23
            boolean r23 = r3.isNull(r2)     // Catch:{ all -> 0x03ef }
            if (r23 == 0) goto L_0x0204
            r23 = r2
            r2 = r24
            boolean r24 = r3.isNull(r2)     // Catch:{ all -> 0x03ef }
            if (r24 == 0) goto L_0x0201
            r24 = r2
            r2 = r25
            boolean r25 = r3.isNull(r2)     // Catch:{ all -> 0x03ef }
            if (r25 == 0) goto L_0x01fe
            r25 = r2
            r2 = r26
            boolean r26 = r3.isNull(r2)     // Catch:{ all -> 0x03ef }
            if (r26 == 0) goto L_0x01fb
            r26 = r2
            r2 = r27
            boolean r27 = r3.isNull(r2)     // Catch:{ all -> 0x03ef }
            if (r27 != 0) goto L_0x01dd
            r27 = r2
            goto L_0x0221
        L_0x01dd:
            r31 = r0
            r0 = r2
            r30 = r4
            r2 = 0
            r32 = r17
            r17 = r6
            r6 = r23
            r23 = r7
            r7 = r24
            r24 = r22
            r22 = r21
            r21 = r20
            r20 = r19
            r19 = r18
            r18 = r32
            goto L_0x038f
        L_0x01fb:
            r26 = r2
            goto L_0x0221
        L_0x01fe:
            r25 = r2
            goto L_0x0221
        L_0x0201:
            r24 = r2
            goto L_0x0221
        L_0x0204:
            r23 = r2
            goto L_0x0221
        L_0x0207:
            r22 = r2
            goto L_0x0221
        L_0x020a:
            r21 = r2
            goto L_0x0221
        L_0x020d:
            r20 = r2
            goto L_0x0221
        L_0x0210:
            r19 = r2
            goto L_0x0221
        L_0x0213:
            r18 = r2
            goto L_0x0221
        L_0x0216:
            r17 = r2
            goto L_0x0221
        L_0x0219:
            r15 = r29
        L_0x021b:
            r29 = r4
            r4 = r28
        L_0x021f:
            r28 = r2
        L_0x0221:
            com.urbanairship.automation.storage.h r2 = new com.urbanairship.automation.storage.h     // Catch:{ all -> 0x03ef }
            r2.<init>()     // Catch:{ all -> 0x03ef }
            r30 = r4
            int r4 = r3.getInt(r0)     // Catch:{ all -> 0x03ef }
            r2.f24010a = r4     // Catch:{ all -> 0x03ef }
            boolean r4 = r3.isNull(r5)     // Catch:{ all -> 0x03ef }
            if (r4 == 0) goto L_0x0238
            r4 = 0
            r2.f24011b = r4     // Catch:{ all -> 0x03ef }
            goto L_0x023e
        L_0x0238:
            java.lang.String r4 = r3.getString(r5)     // Catch:{ all -> 0x03ef }
            r2.f24011b = r4     // Catch:{ all -> 0x03ef }
        L_0x023e:
            boolean r4 = r3.isNull(r6)     // Catch:{ all -> 0x03ef }
            if (r4 == 0) goto L_0x0248
            r4 = 0
            r2.f24012c = r4     // Catch:{ all -> 0x03ef }
            goto L_0x024e
        L_0x0248:
            java.lang.String r4 = r3.getString(r6)     // Catch:{ all -> 0x03ef }
            r2.f24012c = r4     // Catch:{ all -> 0x03ef }
        L_0x024e:
            boolean r4 = r3.isNull(r7)     // Catch:{ all -> 0x03ef }
            if (r4 == 0) goto L_0x0258
            r31 = r0
            r4 = 0
            goto L_0x025e
        L_0x0258:
            java.lang.String r4 = r3.getString(r7)     // Catch:{ all -> 0x03ef }
            r31 = r0
        L_0x025e:
            com.urbanairship.json.f r0 = r1.f23957c     // Catch:{ all -> 0x03ef }
            com.urbanairship.json.b r0 = r0.mo18843a(r4)     // Catch:{ all -> 0x03ef }
            r2.f24013d = r0     // Catch:{ all -> 0x03ef }
            int r0 = r3.getInt(r8)     // Catch:{ all -> 0x03ef }
            r2.f24014e = r0     // Catch:{ all -> 0x03ef }
            int r0 = r3.getInt(r9)     // Catch:{ all -> 0x03ef }
            r2.f24015f = r0     // Catch:{ all -> 0x03ef }
            r0 = r6
            r4 = r7
            long r6 = r3.getLong(r10)     // Catch:{ all -> 0x03ef }
            r2.f24016g = r6     // Catch:{ all -> 0x03ef }
            long r6 = r3.getLong(r11)     // Catch:{ all -> 0x03ef }
            r2.f24017h = r6     // Catch:{ all -> 0x03ef }
            long r6 = r3.getLong(r12)     // Catch:{ all -> 0x03ef }
            r2.f24018i = r6     // Catch:{ all -> 0x03ef }
            long r6 = r3.getLong(r13)     // Catch:{ all -> 0x03ef }
            r2.f24019j = r6     // Catch:{ all -> 0x03ef }
            boolean r6 = r3.isNull(r14)     // Catch:{ all -> 0x03ef }
            if (r6 == 0) goto L_0x0296
            r6 = 0
            r2.f24020k = r6     // Catch:{ all -> 0x03ef }
            goto L_0x029c
        L_0x0296:
            java.lang.String r6 = r3.getString(r14)     // Catch:{ all -> 0x03ef }
            r2.f24020k = r6     // Catch:{ all -> 0x03ef }
        L_0x029c:
            boolean r6 = r3.isNull(r15)     // Catch:{ all -> 0x03ef }
            if (r6 == 0) goto L_0x02a4
            r6 = 0
            goto L_0x02a8
        L_0x02a4:
            java.lang.String r6 = r3.getString(r15)     // Catch:{ all -> 0x03ef }
        L_0x02a8:
            com.urbanairship.json.f r7 = r1.f23957c     // Catch:{ all -> 0x03ef }
            com.urbanairship.json.JsonValue r6 = r7.mo18847e(r6)     // Catch:{ all -> 0x03ef }
            r2.f24021l = r6     // Catch:{ all -> 0x03ef }
            r6 = r30
            int r7 = r3.getInt(r6)     // Catch:{ all -> 0x03ef }
            r2.f24022m = r7     // Catch:{ all -> 0x03ef }
            r7 = r17
            r17 = r0
            int r0 = r3.getInt(r7)     // Catch:{ all -> 0x03ef }
            r2.f24023n = r0     // Catch:{ all -> 0x03ef }
            r30 = r6
            r0 = r18
            r18 = r7
            long r6 = r3.getLong(r0)     // Catch:{ all -> 0x03ef }
            r2.f24024o = r6     // Catch:{ all -> 0x03ef }
            r6 = r19
            boolean r7 = r3.isNull(r6)     // Catch:{ all -> 0x03ef }
            if (r7 == 0) goto L_0x02da
            r19 = r0
            r7 = 0
            goto L_0x02e0
        L_0x02da:
            java.lang.String r7 = r3.getString(r6)     // Catch:{ all -> 0x03ef }
            r19 = r0
        L_0x02e0:
            com.urbanairship.automation.storage.d r0 = r1.f23958d     // Catch:{ all -> 0x03ef }
            com.urbanairship.automation.d0 r0 = r0.mo17668e(r7)     // Catch:{ all -> 0x03ef }
            r2.f24025p = r0     // Catch:{ all -> 0x03ef }
            r0 = r20
            int r7 = r3.getInt(r0)     // Catch:{ all -> 0x03ef }
            r2.f24026q = r7     // Catch:{ all -> 0x03ef }
            r7 = r21
            boolean r20 = r3.isNull(r7)     // Catch:{ all -> 0x03ef }
            if (r20 == 0) goto L_0x02fd
            r21 = r0
            r20 = 0
            goto L_0x0303
        L_0x02fd:
            java.lang.String r20 = r3.getString(r7)     // Catch:{ all -> 0x03ef }
            r21 = r0
        L_0x0303:
            java.util.List r0 = com.urbanairship.automation.storage.C8945d.m33317d(r20)     // Catch:{ all -> 0x03ef }
            r2.f24027r = r0     // Catch:{ all -> 0x03ef }
            r20 = r6
            r0 = r22
            r22 = r7
            long r6 = r3.getLong(r0)     // Catch:{ all -> 0x03ef }
            r2.f24028s = r6     // Catch:{ all -> 0x03ef }
            r6 = r23
            boolean r7 = r3.isNull(r6)     // Catch:{ all -> 0x03ef }
            if (r7 == 0) goto L_0x0321
            r7 = 0
            r2.f24029t = r7     // Catch:{ all -> 0x03ef }
            goto L_0x0327
        L_0x0321:
            java.lang.String r7 = r3.getString(r6)     // Catch:{ all -> 0x03ef }
            r2.f24029t = r7     // Catch:{ all -> 0x03ef }
        L_0x0327:
            r7 = r24
            boolean r23 = r3.isNull(r7)     // Catch:{ all -> 0x03ef }
            if (r23 == 0) goto L_0x0335
            r24 = r0
            r23 = r4
            r0 = 0
            goto L_0x033f
        L_0x0335:
            java.lang.String r23 = r3.getString(r7)     // Catch:{ all -> 0x03ef }
            r24 = r0
            r0 = r23
            r23 = r4
        L_0x033f:
            com.urbanairship.automation.storage.d r4 = r1.f23958d     // Catch:{ all -> 0x03ef }
            com.urbanairship.automation.b r0 = r4.mo17666a(r0)     // Catch:{ all -> 0x03ef }
            r2.f24030u = r0     // Catch:{ all -> 0x03ef }
            r0 = r25
            boolean r4 = r3.isNull(r0)     // Catch:{ all -> 0x03ef }
            if (r4 == 0) goto L_0x0353
            r25 = r0
            r4 = 0
            goto L_0x0359
        L_0x0353:
            java.lang.String r4 = r3.getString(r0)     // Catch:{ all -> 0x03ef }
            r25 = r0
        L_0x0359:
            com.urbanairship.json.f r0 = r1.f23957c     // Catch:{ all -> 0x03ef }
            com.urbanairship.json.JsonValue r0 = r0.mo18847e(r4)     // Catch:{ all -> 0x03ef }
            r2.f24031v = r0     // Catch:{ all -> 0x03ef }
            r0 = r26
            boolean r4 = r3.isNull(r0)     // Catch:{ all -> 0x03ef }
            if (r4 == 0) goto L_0x036d
            r26 = r0
            r4 = 0
            goto L_0x0373
        L_0x036d:
            java.lang.String r4 = r3.getString(r0)     // Catch:{ all -> 0x03ef }
            r26 = r0
        L_0x0373:
            com.urbanairship.json.f r0 = r1.f23957c     // Catch:{ all -> 0x03ef }
            com.urbanairship.json.JsonValue r0 = r0.mo18847e(r4)     // Catch:{ all -> 0x03ef }
            r2.f24032w = r0     // Catch:{ all -> 0x03ef }
            r0 = r27
            boolean r4 = r3.isNull(r0)     // Catch:{ all -> 0x03ef }
            if (r4 == 0) goto L_0x0385
            r4 = 0
            goto L_0x0389
        L_0x0385:
            java.lang.String r4 = r3.getString(r0)     // Catch:{ all -> 0x03ef }
        L_0x0389:
            java.util.List r4 = com.urbanairship.automation.storage.C8945d.m33317d(r4)     // Catch:{ all -> 0x03ef }
            r2.f24033x = r4     // Catch:{ all -> 0x03ef }
        L_0x038f:
            boolean r4 = r3.isNull(r5)     // Catch:{ all -> 0x03ef }
            if (r4 != 0) goto L_0x03a4
            java.lang.String r4 = r3.getString(r5)     // Catch:{ all -> 0x03ef }
            r27 = r0
            r0 = r28
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x03ef }
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ all -> 0x03ef }
            goto L_0x03a9
        L_0x03a4:
            r27 = r0
            r0 = r28
            r4 = 0
        L_0x03a9:
            if (r4 != 0) goto L_0x03b0
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x03ef }
            r4.<init>()     // Catch:{ all -> 0x03ef }
        L_0x03b0:
            r28 = r0
            com.urbanairship.automation.storage.e r0 = new com.urbanairship.automation.storage.e     // Catch:{ all -> 0x03ef }
            r0.<init>(r2, r4)     // Catch:{ all -> 0x03ef }
            r2 = r29
            r2.add(r0)     // Catch:{ all -> 0x03ef }
            r4 = r2
            r29 = r15
            r2 = r28
            r28 = r30
            r0 = r31
            r32 = r23
            r23 = r6
            r6 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            r22 = r24
            r24 = r7
            r7 = r32
            goto L_0x0112
        L_0x03dd:
            r2 = r4
            androidx.room.RoomDatabase r0 = r1.f23955a     // Catch:{ all -> 0x03ef }
            r0.mo60901O()     // Catch:{ all -> 0x03ef }
            r3.close()     // Catch:{ all -> 0x03fb }
            r16.release()     // Catch:{ all -> 0x03fb }
            androidx.room.RoomDatabase r0 = r1.f23955a
            r0.mo60908k()
            return r2
        L_0x03ef:
            r0 = move-exception
            goto L_0x03f4
        L_0x03f1:
            r0 = move-exception
            r16 = r2
        L_0x03f4:
            r3.close()     // Catch:{ all -> 0x03fb }
            r16.release()     // Catch:{ all -> 0x03fb }
            throw r0     // Catch:{ all -> 0x03fb }
        L_0x03fb:
            r0 = move-exception
            androidx.room.RoomDatabase r2 = r1.f23955a
            r2.mo60908k()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.automation.storage.C8939c.mo17649m(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0292 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0296 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02a2 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02a4 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02d6 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02da A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02f8 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02fd A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x031d A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0321 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x032f A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0335 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x034f A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0353 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0369 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x036d A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0383 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0385 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0395 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x03a4 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x03ab A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03b0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0234 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0238 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0244 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0248 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0254 A[Catch:{ all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0258 A[Catch:{ all -> 0x03ef }] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.urbanairship.automation.storage.C8946e> mo17650n(java.lang.String r34) {
        /*
            r33 = this;
            r1 = r33
            r0 = r34
            java.lang.String r2 = "SELECT * FROM schedules WHERE (`group` == ?)"
            r3 = 1
            androidx.room.v1 r2 = androidx.room.C20400v1.m95183d(r2, r3)
            if (r0 != 0) goto L_0x0011
            r2.mo60800u3(r3)
            goto L_0x0014
        L_0x0011:
            r2.mo60801v2(r3, r0)
        L_0x0014:
            androidx.room.RoomDatabase r0 = r1.f23955a
            r0.mo60904d()
            androidx.room.RoomDatabase r0 = r1.f23955a
            r0.mo60905e()
            androidx.room.RoomDatabase r0 = r1.f23955a     // Catch:{ all -> 0x03fb }
            r4 = 0
            android.database.Cursor r3 = androidx.room.util.C20378b.m95145f(r0, r2, r3, r4)     // Catch:{ all -> 0x03fb }
            java.lang.String r0 = "id"
            int r0 = androidx.room.util.C20376a.m95137e(r3, r0)     // Catch:{ all -> 0x03f1 }
            java.lang.String r5 = "scheduleId"
            int r5 = androidx.room.util.C20376a.m95137e(r3, r5)     // Catch:{ all -> 0x03f1 }
            java.lang.String r6 = "group"
            int r6 = androidx.room.util.C20376a.m95137e(r3, r6)     // Catch:{ all -> 0x03f1 }
            java.lang.String r7 = "metadata"
            int r7 = androidx.room.util.C20376a.m95137e(r3, r7)     // Catch:{ all -> 0x03f1 }
            java.lang.String r8 = "limit"
            int r8 = androidx.room.util.C20376a.m95137e(r3, r8)     // Catch:{ all -> 0x03f1 }
            java.lang.String r9 = "priority"
            int r9 = androidx.room.util.C20376a.m95137e(r3, r9)     // Catch:{ all -> 0x03f1 }
            java.lang.String r10 = "scheduleStart"
            int r10 = androidx.room.util.C20376a.m95137e(r3, r10)     // Catch:{ all -> 0x03f1 }
            java.lang.String r11 = "scheduleEnd"
            int r11 = androidx.room.util.C20376a.m95137e(r3, r11)     // Catch:{ all -> 0x03f1 }
            java.lang.String r12 = "editGracePeriod"
            int r12 = androidx.room.util.C20376a.m95137e(r3, r12)     // Catch:{ all -> 0x03f1 }
            java.lang.String r13 = "interval"
            int r13 = androidx.room.util.C20376a.m95137e(r3, r13)     // Catch:{ all -> 0x03f1 }
            java.lang.String r14 = "scheduleType"
            int r14 = androidx.room.util.C20376a.m95137e(r3, r14)     // Catch:{ all -> 0x03f1 }
            java.lang.String r15 = "data"
            int r15 = androidx.room.util.C20376a.m95137e(r3, r15)     // Catch:{ all -> 0x03f1 }
            java.lang.String r4 = "count"
            int r4 = androidx.room.util.C20376a.m95137e(r3, r4)     // Catch:{ all -> 0x03f1 }
            r16 = r2
            java.lang.String r2 = "executionState"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03ef }
            r17 = r2
            java.lang.String r2 = "executionStateChangeDate"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03ef }
            r18 = r2
            java.lang.String r2 = "triggerContext"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03ef }
            r19 = r2
            java.lang.String r2 = "appState"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03ef }
            r20 = r2
            java.lang.String r2 = "screens"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03ef }
            r21 = r2
            java.lang.String r2 = "seconds"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03ef }
            r22 = r2
            java.lang.String r2 = "regionId"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03ef }
            r23 = r2
            java.lang.String r2 = "audience"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03ef }
            r24 = r2
            java.lang.String r2 = "campaigns"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03ef }
            r25 = r2
            java.lang.String r2 = "reportingContext"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03ef }
            r26 = r2
            java.lang.String r2 = "frequencyConstraintIds"
            int r2 = androidx.room.util.C20376a.m95137e(r3, r2)     // Catch:{ all -> 0x03ef }
            r27 = r2
            androidx.collection.a r2 = new androidx.collection.a     // Catch:{ all -> 0x03ef }
            r2.<init>()     // Catch:{ all -> 0x03ef }
        L_0x00d2:
            boolean r28 = r3.moveToNext()     // Catch:{ all -> 0x03ef }
            if (r28 == 0) goto L_0x00fe
            boolean r28 = r3.isNull(r5)     // Catch:{ all -> 0x03ef }
            if (r28 != 0) goto L_0x00d2
            r28 = r4
            java.lang.String r4 = r3.getString(r5)     // Catch:{ all -> 0x03ef }
            java.lang.Object r29 = r2.get(r4)     // Catch:{ all -> 0x03ef }
            java.util.ArrayList r29 = (java.util.ArrayList) r29     // Catch:{ all -> 0x03ef }
            if (r29 != 0) goto L_0x00f7
            r29 = r15
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x03ef }
            r15.<init>()     // Catch:{ all -> 0x03ef }
            r2.put(r4, r15)     // Catch:{ all -> 0x03ef }
            goto L_0x00f9
        L_0x00f7:
            r29 = r15
        L_0x00f9:
            r4 = r28
            r15 = r29
            goto L_0x00d2
        L_0x00fe:
            r28 = r4
            r29 = r15
            r4 = -1
            r3.moveToPosition(r4)     // Catch:{ all -> 0x03ef }
            r1.mo17660x(r2)     // Catch:{ all -> 0x03ef }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x03ef }
            int r15 = r3.getCount()     // Catch:{ all -> 0x03ef }
            r4.<init>(r15)     // Catch:{ all -> 0x03ef }
        L_0x0112:
            boolean r15 = r3.moveToNext()     // Catch:{ all -> 0x03ef }
            if (r15 == 0) goto L_0x03dd
            boolean r15 = r3.isNull(r0)     // Catch:{ all -> 0x03ef }
            if (r15 == 0) goto L_0x0219
            boolean r15 = r3.isNull(r5)     // Catch:{ all -> 0x03ef }
            if (r15 == 0) goto L_0x0219
            boolean r15 = r3.isNull(r6)     // Catch:{ all -> 0x03ef }
            if (r15 == 0) goto L_0x0219
            boolean r15 = r3.isNull(r7)     // Catch:{ all -> 0x03ef }
            if (r15 == 0) goto L_0x0219
            boolean r15 = r3.isNull(r8)     // Catch:{ all -> 0x03ef }
            if (r15 == 0) goto L_0x0219
            boolean r15 = r3.isNull(r9)     // Catch:{ all -> 0x03ef }
            if (r15 == 0) goto L_0x0219
            boolean r15 = r3.isNull(r10)     // Catch:{ all -> 0x03ef }
            if (r15 == 0) goto L_0x0219
            boolean r15 = r3.isNull(r11)     // Catch:{ all -> 0x03ef }
            if (r15 == 0) goto L_0x0219
            boolean r15 = r3.isNull(r12)     // Catch:{ all -> 0x03ef }
            if (r15 == 0) goto L_0x0219
            boolean r15 = r3.isNull(r13)     // Catch:{ all -> 0x03ef }
            if (r15 == 0) goto L_0x0219
            boolean r15 = r3.isNull(r14)     // Catch:{ all -> 0x03ef }
            if (r15 == 0) goto L_0x0219
            r15 = r29
            boolean r29 = r3.isNull(r15)     // Catch:{ all -> 0x03ef }
            if (r29 == 0) goto L_0x021b
            r29 = r4
            r4 = r28
            boolean r28 = r3.isNull(r4)     // Catch:{ all -> 0x03ef }
            if (r28 == 0) goto L_0x021f
            r28 = r2
            r2 = r17
            boolean r17 = r3.isNull(r2)     // Catch:{ all -> 0x03ef }
            if (r17 == 0) goto L_0x0216
            r17 = r2
            r2 = r18
            boolean r18 = r3.isNull(r2)     // Catch:{ all -> 0x03ef }
            if (r18 == 0) goto L_0x0213
            r18 = r2
            r2 = r19
            boolean r19 = r3.isNull(r2)     // Catch:{ all -> 0x03ef }
            if (r19 == 0) goto L_0x0210
            r19 = r2
            r2 = r20
            boolean r20 = r3.isNull(r2)     // Catch:{ all -> 0x03ef }
            if (r20 == 0) goto L_0x020d
            r20 = r2
            r2 = r21
            boolean r21 = r3.isNull(r2)     // Catch:{ all -> 0x03ef }
            if (r21 == 0) goto L_0x020a
            r21 = r2
            r2 = r22
            boolean r22 = r3.isNull(r2)     // Catch:{ all -> 0x03ef }
            if (r22 == 0) goto L_0x0207
            r22 = r2
            r2 = r23
            boolean r23 = r3.isNull(r2)     // Catch:{ all -> 0x03ef }
            if (r23 == 0) goto L_0x0204
            r23 = r2
            r2 = r24
            boolean r24 = r3.isNull(r2)     // Catch:{ all -> 0x03ef }
            if (r24 == 0) goto L_0x0201
            r24 = r2
            r2 = r25
            boolean r25 = r3.isNull(r2)     // Catch:{ all -> 0x03ef }
            if (r25 == 0) goto L_0x01fe
            r25 = r2
            r2 = r26
            boolean r26 = r3.isNull(r2)     // Catch:{ all -> 0x03ef }
            if (r26 == 0) goto L_0x01fb
            r26 = r2
            r2 = r27
            boolean r27 = r3.isNull(r2)     // Catch:{ all -> 0x03ef }
            if (r27 != 0) goto L_0x01dd
            r27 = r2
            goto L_0x0221
        L_0x01dd:
            r31 = r0
            r0 = r2
            r30 = r4
            r2 = 0
            r32 = r17
            r17 = r6
            r6 = r23
            r23 = r7
            r7 = r24
            r24 = r22
            r22 = r21
            r21 = r20
            r20 = r19
            r19 = r18
            r18 = r32
            goto L_0x038f
        L_0x01fb:
            r26 = r2
            goto L_0x0221
        L_0x01fe:
            r25 = r2
            goto L_0x0221
        L_0x0201:
            r24 = r2
            goto L_0x0221
        L_0x0204:
            r23 = r2
            goto L_0x0221
        L_0x0207:
            r22 = r2
            goto L_0x0221
        L_0x020a:
            r21 = r2
            goto L_0x0221
        L_0x020d:
            r20 = r2
            goto L_0x0221
        L_0x0210:
            r19 = r2
            goto L_0x0221
        L_0x0213:
            r18 = r2
            goto L_0x0221
        L_0x0216:
            r17 = r2
            goto L_0x0221
        L_0x0219:
            r15 = r29
        L_0x021b:
            r29 = r4
            r4 = r28
        L_0x021f:
            r28 = r2
        L_0x0221:
            com.urbanairship.automation.storage.h r2 = new com.urbanairship.automation.storage.h     // Catch:{ all -> 0x03ef }
            r2.<init>()     // Catch:{ all -> 0x03ef }
            r30 = r4
            int r4 = r3.getInt(r0)     // Catch:{ all -> 0x03ef }
            r2.f24010a = r4     // Catch:{ all -> 0x03ef }
            boolean r4 = r3.isNull(r5)     // Catch:{ all -> 0x03ef }
            if (r4 == 0) goto L_0x0238
            r4 = 0
            r2.f24011b = r4     // Catch:{ all -> 0x03ef }
            goto L_0x023e
        L_0x0238:
            java.lang.String r4 = r3.getString(r5)     // Catch:{ all -> 0x03ef }
            r2.f24011b = r4     // Catch:{ all -> 0x03ef }
        L_0x023e:
            boolean r4 = r3.isNull(r6)     // Catch:{ all -> 0x03ef }
            if (r4 == 0) goto L_0x0248
            r4 = 0
            r2.f24012c = r4     // Catch:{ all -> 0x03ef }
            goto L_0x024e
        L_0x0248:
            java.lang.String r4 = r3.getString(r6)     // Catch:{ all -> 0x03ef }
            r2.f24012c = r4     // Catch:{ all -> 0x03ef }
        L_0x024e:
            boolean r4 = r3.isNull(r7)     // Catch:{ all -> 0x03ef }
            if (r4 == 0) goto L_0x0258
            r31 = r0
            r4 = 0
            goto L_0x025e
        L_0x0258:
            java.lang.String r4 = r3.getString(r7)     // Catch:{ all -> 0x03ef }
            r31 = r0
        L_0x025e:
            com.urbanairship.json.f r0 = r1.f23957c     // Catch:{ all -> 0x03ef }
            com.urbanairship.json.b r0 = r0.mo18843a(r4)     // Catch:{ all -> 0x03ef }
            r2.f24013d = r0     // Catch:{ all -> 0x03ef }
            int r0 = r3.getInt(r8)     // Catch:{ all -> 0x03ef }
            r2.f24014e = r0     // Catch:{ all -> 0x03ef }
            int r0 = r3.getInt(r9)     // Catch:{ all -> 0x03ef }
            r2.f24015f = r0     // Catch:{ all -> 0x03ef }
            r0 = r6
            r4 = r7
            long r6 = r3.getLong(r10)     // Catch:{ all -> 0x03ef }
            r2.f24016g = r6     // Catch:{ all -> 0x03ef }
            long r6 = r3.getLong(r11)     // Catch:{ all -> 0x03ef }
            r2.f24017h = r6     // Catch:{ all -> 0x03ef }
            long r6 = r3.getLong(r12)     // Catch:{ all -> 0x03ef }
            r2.f24018i = r6     // Catch:{ all -> 0x03ef }
            long r6 = r3.getLong(r13)     // Catch:{ all -> 0x03ef }
            r2.f24019j = r6     // Catch:{ all -> 0x03ef }
            boolean r6 = r3.isNull(r14)     // Catch:{ all -> 0x03ef }
            if (r6 == 0) goto L_0x0296
            r6 = 0
            r2.f24020k = r6     // Catch:{ all -> 0x03ef }
            goto L_0x029c
        L_0x0296:
            java.lang.String r6 = r3.getString(r14)     // Catch:{ all -> 0x03ef }
            r2.f24020k = r6     // Catch:{ all -> 0x03ef }
        L_0x029c:
            boolean r6 = r3.isNull(r15)     // Catch:{ all -> 0x03ef }
            if (r6 == 0) goto L_0x02a4
            r6 = 0
            goto L_0x02a8
        L_0x02a4:
            java.lang.String r6 = r3.getString(r15)     // Catch:{ all -> 0x03ef }
        L_0x02a8:
            com.urbanairship.json.f r7 = r1.f23957c     // Catch:{ all -> 0x03ef }
            com.urbanairship.json.JsonValue r6 = r7.mo18847e(r6)     // Catch:{ all -> 0x03ef }
            r2.f24021l = r6     // Catch:{ all -> 0x03ef }
            r6 = r30
            int r7 = r3.getInt(r6)     // Catch:{ all -> 0x03ef }
            r2.f24022m = r7     // Catch:{ all -> 0x03ef }
            r7 = r17
            r17 = r0
            int r0 = r3.getInt(r7)     // Catch:{ all -> 0x03ef }
            r2.f24023n = r0     // Catch:{ all -> 0x03ef }
            r30 = r6
            r0 = r18
            r18 = r7
            long r6 = r3.getLong(r0)     // Catch:{ all -> 0x03ef }
            r2.f24024o = r6     // Catch:{ all -> 0x03ef }
            r6 = r19
            boolean r7 = r3.isNull(r6)     // Catch:{ all -> 0x03ef }
            if (r7 == 0) goto L_0x02da
            r19 = r0
            r7 = 0
            goto L_0x02e0
        L_0x02da:
            java.lang.String r7 = r3.getString(r6)     // Catch:{ all -> 0x03ef }
            r19 = r0
        L_0x02e0:
            com.urbanairship.automation.storage.d r0 = r1.f23958d     // Catch:{ all -> 0x03ef }
            com.urbanairship.automation.d0 r0 = r0.mo17668e(r7)     // Catch:{ all -> 0x03ef }
            r2.f24025p = r0     // Catch:{ all -> 0x03ef }
            r0 = r20
            int r7 = r3.getInt(r0)     // Catch:{ all -> 0x03ef }
            r2.f24026q = r7     // Catch:{ all -> 0x03ef }
            r7 = r21
            boolean r20 = r3.isNull(r7)     // Catch:{ all -> 0x03ef }
            if (r20 == 0) goto L_0x02fd
            r21 = r0
            r20 = 0
            goto L_0x0303
        L_0x02fd:
            java.lang.String r20 = r3.getString(r7)     // Catch:{ all -> 0x03ef }
            r21 = r0
        L_0x0303:
            java.util.List r0 = com.urbanairship.automation.storage.C8945d.m33317d(r20)     // Catch:{ all -> 0x03ef }
            r2.f24027r = r0     // Catch:{ all -> 0x03ef }
            r20 = r6
            r0 = r22
            r22 = r7
            long r6 = r3.getLong(r0)     // Catch:{ all -> 0x03ef }
            r2.f24028s = r6     // Catch:{ all -> 0x03ef }
            r6 = r23
            boolean r7 = r3.isNull(r6)     // Catch:{ all -> 0x03ef }
            if (r7 == 0) goto L_0x0321
            r7 = 0
            r2.f24029t = r7     // Catch:{ all -> 0x03ef }
            goto L_0x0327
        L_0x0321:
            java.lang.String r7 = r3.getString(r6)     // Catch:{ all -> 0x03ef }
            r2.f24029t = r7     // Catch:{ all -> 0x03ef }
        L_0x0327:
            r7 = r24
            boolean r23 = r3.isNull(r7)     // Catch:{ all -> 0x03ef }
            if (r23 == 0) goto L_0x0335
            r24 = r0
            r23 = r4
            r0 = 0
            goto L_0x033f
        L_0x0335:
            java.lang.String r23 = r3.getString(r7)     // Catch:{ all -> 0x03ef }
            r24 = r0
            r0 = r23
            r23 = r4
        L_0x033f:
            com.urbanairship.automation.storage.d r4 = r1.f23958d     // Catch:{ all -> 0x03ef }
            com.urbanairship.automation.b r0 = r4.mo17666a(r0)     // Catch:{ all -> 0x03ef }
            r2.f24030u = r0     // Catch:{ all -> 0x03ef }
            r0 = r25
            boolean r4 = r3.isNull(r0)     // Catch:{ all -> 0x03ef }
            if (r4 == 0) goto L_0x0353
            r25 = r0
            r4 = 0
            goto L_0x0359
        L_0x0353:
            java.lang.String r4 = r3.getString(r0)     // Catch:{ all -> 0x03ef }
            r25 = r0
        L_0x0359:
            com.urbanairship.json.f r0 = r1.f23957c     // Catch:{ all -> 0x03ef }
            com.urbanairship.json.JsonValue r0 = r0.mo18847e(r4)     // Catch:{ all -> 0x03ef }
            r2.f24031v = r0     // Catch:{ all -> 0x03ef }
            r0 = r26
            boolean r4 = r3.isNull(r0)     // Catch:{ all -> 0x03ef }
            if (r4 == 0) goto L_0x036d
            r26 = r0
            r4 = 0
            goto L_0x0373
        L_0x036d:
            java.lang.String r4 = r3.getString(r0)     // Catch:{ all -> 0x03ef }
            r26 = r0
        L_0x0373:
            com.urbanairship.json.f r0 = r1.f23957c     // Catch:{ all -> 0x03ef }
            com.urbanairship.json.JsonValue r0 = r0.mo18847e(r4)     // Catch:{ all -> 0x03ef }
            r2.f24032w = r0     // Catch:{ all -> 0x03ef }
            r0 = r27
            boolean r4 = r3.isNull(r0)     // Catch:{ all -> 0x03ef }
            if (r4 == 0) goto L_0x0385
            r4 = 0
            goto L_0x0389
        L_0x0385:
            java.lang.String r4 = r3.getString(r0)     // Catch:{ all -> 0x03ef }
        L_0x0389:
            java.util.List r4 = com.urbanairship.automation.storage.C8945d.m33317d(r4)     // Catch:{ all -> 0x03ef }
            r2.f24033x = r4     // Catch:{ all -> 0x03ef }
        L_0x038f:
            boolean r4 = r3.isNull(r5)     // Catch:{ all -> 0x03ef }
            if (r4 != 0) goto L_0x03a4
            java.lang.String r4 = r3.getString(r5)     // Catch:{ all -> 0x03ef }
            r27 = r0
            r0 = r28
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x03ef }
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ all -> 0x03ef }
            goto L_0x03a9
        L_0x03a4:
            r27 = r0
            r0 = r28
            r4 = 0
        L_0x03a9:
            if (r4 != 0) goto L_0x03b0
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x03ef }
            r4.<init>()     // Catch:{ all -> 0x03ef }
        L_0x03b0:
            r28 = r0
            com.urbanairship.automation.storage.e r0 = new com.urbanairship.automation.storage.e     // Catch:{ all -> 0x03ef }
            r0.<init>(r2, r4)     // Catch:{ all -> 0x03ef }
            r2 = r29
            r2.add(r0)     // Catch:{ all -> 0x03ef }
            r4 = r2
            r29 = r15
            r2 = r28
            r28 = r30
            r0 = r31
            r32 = r23
            r23 = r6
            r6 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            r22 = r24
            r24 = r7
            r7 = r32
            goto L_0x0112
        L_0x03dd:
            r2 = r4
            androidx.room.RoomDatabase r0 = r1.f23955a     // Catch:{ all -> 0x03ef }
            r0.mo60901O()     // Catch:{ all -> 0x03ef }
            r3.close()     // Catch:{ all -> 0x03fb }
            r16.release()     // Catch:{ all -> 0x03fb }
            androidx.room.RoomDatabase r0 = r1.f23955a
            r0.mo60908k()
            return r2
        L_0x03ef:
            r0 = move-exception
            goto L_0x03f4
        L_0x03f1:
            r0 = move-exception
            r16 = r2
        L_0x03f4:
            r3.close()     // Catch:{ all -> 0x03fb }
            r16.release()     // Catch:{ all -> 0x03fb }
            throw r0     // Catch:{ all -> 0x03fb }
        L_0x03fb:
            r0 = move-exception
            androidx.room.RoomDatabase r2 = r1.f23955a
            r2.mo60908k()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.automation.storage.C8939c.mo17650n(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0260 A[Catch:{ all -> 0x03f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0264 A[Catch:{ all -> 0x03f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x029e A[Catch:{ all -> 0x03f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02a2 A[Catch:{ all -> 0x03f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02ae A[Catch:{ all -> 0x03f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02b0 A[Catch:{ all -> 0x03f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02e2 A[Catch:{ all -> 0x03f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02e6 A[Catch:{ all -> 0x03f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0304 A[Catch:{ all -> 0x03f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0309 A[Catch:{ all -> 0x03f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0329 A[Catch:{ all -> 0x03f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x032d A[Catch:{ all -> 0x03f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x033b A[Catch:{ all -> 0x03f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0341 A[Catch:{ all -> 0x03f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x035b A[Catch:{ all -> 0x03f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x035f A[Catch:{ all -> 0x03f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0375 A[Catch:{ all -> 0x03f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0379 A[Catch:{ all -> 0x03f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x038f A[Catch:{ all -> 0x03f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0391 A[Catch:{ all -> 0x03f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x03a1 A[Catch:{ all -> 0x03f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x03b0 A[Catch:{ all -> 0x03f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03b7 A[Catch:{ all -> 0x03f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03bc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0240 A[Catch:{ all -> 0x03f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0244 A[Catch:{ all -> 0x03f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0250 A[Catch:{ all -> 0x03f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0254 A[Catch:{ all -> 0x03f9 }] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.urbanairship.automation.storage.C8946e> mo17651o(java.lang.String r33, java.lang.String r34) {
        /*
            r32 = this;
            r1 = r32
            r0 = r33
            r2 = r34
            java.lang.String r3 = "SELECT * FROM schedules WHERE (`group` == ?) AND (scheduleType = ?)"
            r4 = 2
            androidx.room.v1 r3 = androidx.room.C20400v1.m95183d(r3, r4)
            r5 = 1
            if (r0 != 0) goto L_0x0014
            r3.mo60800u3(r5)
            goto L_0x0017
        L_0x0014:
            r3.mo60801v2(r5, r0)
        L_0x0017:
            if (r2 != 0) goto L_0x001d
            r3.mo60800u3(r4)
            goto L_0x0020
        L_0x001d:
            r3.mo60801v2(r4, r2)
        L_0x0020:
            androidx.room.RoomDatabase r0 = r1.f23955a
            r0.mo60904d()
            androidx.room.RoomDatabase r0 = r1.f23955a
            r0.mo60905e()
            androidx.room.RoomDatabase r0 = r1.f23955a     // Catch:{ all -> 0x0405 }
            r2 = 0
            android.database.Cursor r4 = androidx.room.util.C20378b.m95145f(r0, r3, r5, r2)     // Catch:{ all -> 0x0405 }
            java.lang.String r0 = "id"
            int r0 = androidx.room.util.C20376a.m95137e(r4, r0)     // Catch:{ all -> 0x03fb }
            java.lang.String r5 = "scheduleId"
            int r5 = androidx.room.util.C20376a.m95137e(r4, r5)     // Catch:{ all -> 0x03fb }
            java.lang.String r6 = "group"
            int r6 = androidx.room.util.C20376a.m95137e(r4, r6)     // Catch:{ all -> 0x03fb }
            java.lang.String r7 = "metadata"
            int r7 = androidx.room.util.C20376a.m95137e(r4, r7)     // Catch:{ all -> 0x03fb }
            java.lang.String r8 = "limit"
            int r8 = androidx.room.util.C20376a.m95137e(r4, r8)     // Catch:{ all -> 0x03fb }
            java.lang.String r9 = "priority"
            int r9 = androidx.room.util.C20376a.m95137e(r4, r9)     // Catch:{ all -> 0x03fb }
            java.lang.String r10 = "scheduleStart"
            int r10 = androidx.room.util.C20376a.m95137e(r4, r10)     // Catch:{ all -> 0x03fb }
            java.lang.String r11 = "scheduleEnd"
            int r11 = androidx.room.util.C20376a.m95137e(r4, r11)     // Catch:{ all -> 0x03fb }
            java.lang.String r12 = "editGracePeriod"
            int r12 = androidx.room.util.C20376a.m95137e(r4, r12)     // Catch:{ all -> 0x03fb }
            java.lang.String r13 = "interval"
            int r13 = androidx.room.util.C20376a.m95137e(r4, r13)     // Catch:{ all -> 0x03fb }
            java.lang.String r14 = "scheduleType"
            int r14 = androidx.room.util.C20376a.m95137e(r4, r14)     // Catch:{ all -> 0x03fb }
            java.lang.String r15 = "data"
            int r15 = androidx.room.util.C20376a.m95137e(r4, r15)     // Catch:{ all -> 0x03fb }
            java.lang.String r2 = "count"
            int r2 = androidx.room.util.C20376a.m95137e(r4, r2)     // Catch:{ all -> 0x03fb }
            r16 = r3
            java.lang.String r3 = "executionState"
            int r3 = androidx.room.util.C20376a.m95137e(r4, r3)     // Catch:{ all -> 0x03f9 }
            r34 = r3
            java.lang.String r3 = "executionStateChangeDate"
            int r3 = androidx.room.util.C20376a.m95137e(r4, r3)     // Catch:{ all -> 0x03f9 }
            r17 = r3
            java.lang.String r3 = "triggerContext"
            int r3 = androidx.room.util.C20376a.m95137e(r4, r3)     // Catch:{ all -> 0x03f9 }
            r18 = r3
            java.lang.String r3 = "appState"
            int r3 = androidx.room.util.C20376a.m95137e(r4, r3)     // Catch:{ all -> 0x03f9 }
            r19 = r3
            java.lang.String r3 = "screens"
            int r3 = androidx.room.util.C20376a.m95137e(r4, r3)     // Catch:{ all -> 0x03f9 }
            r20 = r3
            java.lang.String r3 = "seconds"
            int r3 = androidx.room.util.C20376a.m95137e(r4, r3)     // Catch:{ all -> 0x03f9 }
            r21 = r3
            java.lang.String r3 = "regionId"
            int r3 = androidx.room.util.C20376a.m95137e(r4, r3)     // Catch:{ all -> 0x03f9 }
            r22 = r3
            java.lang.String r3 = "audience"
            int r3 = androidx.room.util.C20376a.m95137e(r4, r3)     // Catch:{ all -> 0x03f9 }
            r23 = r3
            java.lang.String r3 = "campaigns"
            int r3 = androidx.room.util.C20376a.m95137e(r4, r3)     // Catch:{ all -> 0x03f9 }
            r24 = r3
            java.lang.String r3 = "reportingContext"
            int r3 = androidx.room.util.C20376a.m95137e(r4, r3)     // Catch:{ all -> 0x03f9 }
            r25 = r3
            java.lang.String r3 = "frequencyConstraintIds"
            int r3 = androidx.room.util.C20376a.m95137e(r4, r3)     // Catch:{ all -> 0x03f9 }
            r26 = r3
            androidx.collection.a r3 = new androidx.collection.a     // Catch:{ all -> 0x03f9 }
            r3.<init>()     // Catch:{ all -> 0x03f9 }
        L_0x00de:
            boolean r27 = r4.moveToNext()     // Catch:{ all -> 0x03f9 }
            if (r27 == 0) goto L_0x010a
            boolean r27 = r4.isNull(r5)     // Catch:{ all -> 0x03f9 }
            if (r27 != 0) goto L_0x00de
            r27 = r2
            java.lang.String r2 = r4.getString(r5)     // Catch:{ all -> 0x03f9 }
            java.lang.Object r28 = r3.get(r2)     // Catch:{ all -> 0x03f9 }
            java.util.ArrayList r28 = (java.util.ArrayList) r28     // Catch:{ all -> 0x03f9 }
            if (r28 != 0) goto L_0x0103
            r28 = r15
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x03f9 }
            r15.<init>()     // Catch:{ all -> 0x03f9 }
            r3.put(r2, r15)     // Catch:{ all -> 0x03f9 }
            goto L_0x0105
        L_0x0103:
            r28 = r15
        L_0x0105:
            r2 = r27
            r15 = r28
            goto L_0x00de
        L_0x010a:
            r27 = r2
            r28 = r15
            r2 = -1
            r4.moveToPosition(r2)     // Catch:{ all -> 0x03f9 }
            r1.mo17660x(r3)     // Catch:{ all -> 0x03f9 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x03f9 }
            int r15 = r4.getCount()     // Catch:{ all -> 0x03f9 }
            r2.<init>(r15)     // Catch:{ all -> 0x03f9 }
        L_0x011e:
            boolean r15 = r4.moveToNext()     // Catch:{ all -> 0x03f9 }
            if (r15 == 0) goto L_0x03e8
            boolean r15 = r4.isNull(r0)     // Catch:{ all -> 0x03f9 }
            if (r15 == 0) goto L_0x0225
            boolean r15 = r4.isNull(r5)     // Catch:{ all -> 0x03f9 }
            if (r15 == 0) goto L_0x0225
            boolean r15 = r4.isNull(r6)     // Catch:{ all -> 0x03f9 }
            if (r15 == 0) goto L_0x0225
            boolean r15 = r4.isNull(r7)     // Catch:{ all -> 0x03f9 }
            if (r15 == 0) goto L_0x0225
            boolean r15 = r4.isNull(r8)     // Catch:{ all -> 0x03f9 }
            if (r15 == 0) goto L_0x0225
            boolean r15 = r4.isNull(r9)     // Catch:{ all -> 0x03f9 }
            if (r15 == 0) goto L_0x0225
            boolean r15 = r4.isNull(r10)     // Catch:{ all -> 0x03f9 }
            if (r15 == 0) goto L_0x0225
            boolean r15 = r4.isNull(r11)     // Catch:{ all -> 0x03f9 }
            if (r15 == 0) goto L_0x0225
            boolean r15 = r4.isNull(r12)     // Catch:{ all -> 0x03f9 }
            if (r15 == 0) goto L_0x0225
            boolean r15 = r4.isNull(r13)     // Catch:{ all -> 0x03f9 }
            if (r15 == 0) goto L_0x0225
            boolean r15 = r4.isNull(r14)     // Catch:{ all -> 0x03f9 }
            if (r15 == 0) goto L_0x0225
            r15 = r28
            boolean r28 = r4.isNull(r15)     // Catch:{ all -> 0x03f9 }
            if (r28 == 0) goto L_0x0227
            r28 = r2
            r2 = r27
            boolean r27 = r4.isNull(r2)     // Catch:{ all -> 0x03f9 }
            if (r27 == 0) goto L_0x022b
            r27 = r3
            r3 = r34
            boolean r29 = r4.isNull(r3)     // Catch:{ all -> 0x03f9 }
            if (r29 == 0) goto L_0x0222
            r34 = r3
            r3 = r17
            boolean r17 = r4.isNull(r3)     // Catch:{ all -> 0x03f9 }
            if (r17 == 0) goto L_0x021f
            r17 = r3
            r3 = r18
            boolean r18 = r4.isNull(r3)     // Catch:{ all -> 0x03f9 }
            if (r18 == 0) goto L_0x021c
            r18 = r3
            r3 = r19
            boolean r19 = r4.isNull(r3)     // Catch:{ all -> 0x03f9 }
            if (r19 == 0) goto L_0x0219
            r19 = r3
            r3 = r20
            boolean r20 = r4.isNull(r3)     // Catch:{ all -> 0x03f9 }
            if (r20 == 0) goto L_0x0216
            r20 = r3
            r3 = r21
            boolean r21 = r4.isNull(r3)     // Catch:{ all -> 0x03f9 }
            if (r21 == 0) goto L_0x0213
            r21 = r3
            r3 = r22
            boolean r22 = r4.isNull(r3)     // Catch:{ all -> 0x03f9 }
            if (r22 == 0) goto L_0x0210
            r22 = r3
            r3 = r23
            boolean r23 = r4.isNull(r3)     // Catch:{ all -> 0x03f9 }
            if (r23 == 0) goto L_0x020d
            r23 = r3
            r3 = r24
            boolean r24 = r4.isNull(r3)     // Catch:{ all -> 0x03f9 }
            if (r24 == 0) goto L_0x020a
            r24 = r3
            r3 = r25
            boolean r25 = r4.isNull(r3)     // Catch:{ all -> 0x03f9 }
            if (r25 == 0) goto L_0x0207
            r25 = r3
            r3 = r26
            boolean r26 = r4.isNull(r3)     // Catch:{ all -> 0x03f9 }
            if (r26 != 0) goto L_0x01e9
            r26 = r3
            goto L_0x022d
        L_0x01e9:
            r30 = r0
            r29 = r2
            r0 = r3
            r3 = 0
            r31 = r17
            r17 = r34
            r34 = r6
            r6 = r22
            r22 = r7
            r7 = r23
            r23 = r21
            r21 = r20
            r20 = r19
            r19 = r18
            r18 = r31
            goto L_0x039b
        L_0x0207:
            r25 = r3
            goto L_0x022d
        L_0x020a:
            r24 = r3
            goto L_0x022d
        L_0x020d:
            r23 = r3
            goto L_0x022d
        L_0x0210:
            r22 = r3
            goto L_0x022d
        L_0x0213:
            r21 = r3
            goto L_0x022d
        L_0x0216:
            r20 = r3
            goto L_0x022d
        L_0x0219:
            r19 = r3
            goto L_0x022d
        L_0x021c:
            r18 = r3
            goto L_0x022d
        L_0x021f:
            r17 = r3
            goto L_0x022d
        L_0x0222:
            r34 = r3
            goto L_0x022d
        L_0x0225:
            r15 = r28
        L_0x0227:
            r28 = r2
            r2 = r27
        L_0x022b:
            r27 = r3
        L_0x022d:
            com.urbanairship.automation.storage.h r3 = new com.urbanairship.automation.storage.h     // Catch:{ all -> 0x03f9 }
            r3.<init>()     // Catch:{ all -> 0x03f9 }
            r29 = r2
            int r2 = r4.getInt(r0)     // Catch:{ all -> 0x03f9 }
            r3.f24010a = r2     // Catch:{ all -> 0x03f9 }
            boolean r2 = r4.isNull(r5)     // Catch:{ all -> 0x03f9 }
            if (r2 == 0) goto L_0x0244
            r2 = 0
            r3.f24011b = r2     // Catch:{ all -> 0x03f9 }
            goto L_0x024a
        L_0x0244:
            java.lang.String r2 = r4.getString(r5)     // Catch:{ all -> 0x03f9 }
            r3.f24011b = r2     // Catch:{ all -> 0x03f9 }
        L_0x024a:
            boolean r2 = r4.isNull(r6)     // Catch:{ all -> 0x03f9 }
            if (r2 == 0) goto L_0x0254
            r2 = 0
            r3.f24012c = r2     // Catch:{ all -> 0x03f9 }
            goto L_0x025a
        L_0x0254:
            java.lang.String r2 = r4.getString(r6)     // Catch:{ all -> 0x03f9 }
            r3.f24012c = r2     // Catch:{ all -> 0x03f9 }
        L_0x025a:
            boolean r2 = r4.isNull(r7)     // Catch:{ all -> 0x03f9 }
            if (r2 == 0) goto L_0x0264
            r30 = r0
            r2 = 0
            goto L_0x026a
        L_0x0264:
            java.lang.String r2 = r4.getString(r7)     // Catch:{ all -> 0x03f9 }
            r30 = r0
        L_0x026a:
            com.urbanairship.json.f r0 = r1.f23957c     // Catch:{ all -> 0x03f9 }
            com.urbanairship.json.b r0 = r0.mo18843a(r2)     // Catch:{ all -> 0x03f9 }
            r3.f24013d = r0     // Catch:{ all -> 0x03f9 }
            int r0 = r4.getInt(r8)     // Catch:{ all -> 0x03f9 }
            r3.f24014e = r0     // Catch:{ all -> 0x03f9 }
            int r0 = r4.getInt(r9)     // Catch:{ all -> 0x03f9 }
            r3.f24015f = r0     // Catch:{ all -> 0x03f9 }
            r0 = r6
            r2 = r7
            long r6 = r4.getLong(r10)     // Catch:{ all -> 0x03f9 }
            r3.f24016g = r6     // Catch:{ all -> 0x03f9 }
            long r6 = r4.getLong(r11)     // Catch:{ all -> 0x03f9 }
            r3.f24017h = r6     // Catch:{ all -> 0x03f9 }
            long r6 = r4.getLong(r12)     // Catch:{ all -> 0x03f9 }
            r3.f24018i = r6     // Catch:{ all -> 0x03f9 }
            long r6 = r4.getLong(r13)     // Catch:{ all -> 0x03f9 }
            r3.f24019j = r6     // Catch:{ all -> 0x03f9 }
            boolean r6 = r4.isNull(r14)     // Catch:{ all -> 0x03f9 }
            if (r6 == 0) goto L_0x02a2
            r6 = 0
            r3.f24020k = r6     // Catch:{ all -> 0x03f9 }
            goto L_0x02a8
        L_0x02a2:
            java.lang.String r6 = r4.getString(r14)     // Catch:{ all -> 0x03f9 }
            r3.f24020k = r6     // Catch:{ all -> 0x03f9 }
        L_0x02a8:
            boolean r6 = r4.isNull(r15)     // Catch:{ all -> 0x03f9 }
            if (r6 == 0) goto L_0x02b0
            r6 = 0
            goto L_0x02b4
        L_0x02b0:
            java.lang.String r6 = r4.getString(r15)     // Catch:{ all -> 0x03f9 }
        L_0x02b4:
            com.urbanairship.json.f r7 = r1.f23957c     // Catch:{ all -> 0x03f9 }
            com.urbanairship.json.JsonValue r6 = r7.mo18847e(r6)     // Catch:{ all -> 0x03f9 }
            r3.f24021l = r6     // Catch:{ all -> 0x03f9 }
            r6 = r29
            int r7 = r4.getInt(r6)     // Catch:{ all -> 0x03f9 }
            r3.f24022m = r7     // Catch:{ all -> 0x03f9 }
            r7 = r34
            r34 = r0
            int r0 = r4.getInt(r7)     // Catch:{ all -> 0x03f9 }
            r3.f24023n = r0     // Catch:{ all -> 0x03f9 }
            r29 = r6
            r0 = r17
            r17 = r7
            long r6 = r4.getLong(r0)     // Catch:{ all -> 0x03f9 }
            r3.f24024o = r6     // Catch:{ all -> 0x03f9 }
            r6 = r18
            boolean r7 = r4.isNull(r6)     // Catch:{ all -> 0x03f9 }
            if (r7 == 0) goto L_0x02e6
            r18 = r0
            r7 = 0
            goto L_0x02ec
        L_0x02e6:
            java.lang.String r7 = r4.getString(r6)     // Catch:{ all -> 0x03f9 }
            r18 = r0
        L_0x02ec:
            com.urbanairship.automation.storage.d r0 = r1.f23958d     // Catch:{ all -> 0x03f9 }
            com.urbanairship.automation.d0 r0 = r0.mo17668e(r7)     // Catch:{ all -> 0x03f9 }
            r3.f24025p = r0     // Catch:{ all -> 0x03f9 }
            r0 = r19
            int r7 = r4.getInt(r0)     // Catch:{ all -> 0x03f9 }
            r3.f24026q = r7     // Catch:{ all -> 0x03f9 }
            r7 = r20
            boolean r19 = r4.isNull(r7)     // Catch:{ all -> 0x03f9 }
            if (r19 == 0) goto L_0x0309
            r20 = r0
            r19 = 0
            goto L_0x030f
        L_0x0309:
            java.lang.String r19 = r4.getString(r7)     // Catch:{ all -> 0x03f9 }
            r20 = r0
        L_0x030f:
            java.util.List r0 = com.urbanairship.automation.storage.C8945d.m33317d(r19)     // Catch:{ all -> 0x03f9 }
            r3.f24027r = r0     // Catch:{ all -> 0x03f9 }
            r19 = r6
            r0 = r21
            r21 = r7
            long r6 = r4.getLong(r0)     // Catch:{ all -> 0x03f9 }
            r3.f24028s = r6     // Catch:{ all -> 0x03f9 }
            r6 = r22
            boolean r7 = r4.isNull(r6)     // Catch:{ all -> 0x03f9 }
            if (r7 == 0) goto L_0x032d
            r7 = 0
            r3.f24029t = r7     // Catch:{ all -> 0x03f9 }
            goto L_0x0333
        L_0x032d:
            java.lang.String r7 = r4.getString(r6)     // Catch:{ all -> 0x03f9 }
            r3.f24029t = r7     // Catch:{ all -> 0x03f9 }
        L_0x0333:
            r7 = r23
            boolean r22 = r4.isNull(r7)     // Catch:{ all -> 0x03f9 }
            if (r22 == 0) goto L_0x0341
            r23 = r0
            r22 = r2
            r0 = 0
            goto L_0x034b
        L_0x0341:
            java.lang.String r22 = r4.getString(r7)     // Catch:{ all -> 0x03f9 }
            r23 = r0
            r0 = r22
            r22 = r2
        L_0x034b:
            com.urbanairship.automation.storage.d r2 = r1.f23958d     // Catch:{ all -> 0x03f9 }
            com.urbanairship.automation.b r0 = r2.mo17666a(r0)     // Catch:{ all -> 0x03f9 }
            r3.f24030u = r0     // Catch:{ all -> 0x03f9 }
            r0 = r24
            boolean r2 = r4.isNull(r0)     // Catch:{ all -> 0x03f9 }
            if (r2 == 0) goto L_0x035f
            r24 = r0
            r2 = 0
            goto L_0x0365
        L_0x035f:
            java.lang.String r2 = r4.getString(r0)     // Catch:{ all -> 0x03f9 }
            r24 = r0
        L_0x0365:
            com.urbanairship.json.f r0 = r1.f23957c     // Catch:{ all -> 0x03f9 }
            com.urbanairship.json.JsonValue r0 = r0.mo18847e(r2)     // Catch:{ all -> 0x03f9 }
            r3.f24031v = r0     // Catch:{ all -> 0x03f9 }
            r0 = r25
            boolean r2 = r4.isNull(r0)     // Catch:{ all -> 0x03f9 }
            if (r2 == 0) goto L_0x0379
            r25 = r0
            r2 = 0
            goto L_0x037f
        L_0x0379:
            java.lang.String r2 = r4.getString(r0)     // Catch:{ all -> 0x03f9 }
            r25 = r0
        L_0x037f:
            com.urbanairship.json.f r0 = r1.f23957c     // Catch:{ all -> 0x03f9 }
            com.urbanairship.json.JsonValue r0 = r0.mo18847e(r2)     // Catch:{ all -> 0x03f9 }
            r3.f24032w = r0     // Catch:{ all -> 0x03f9 }
            r0 = r26
            boolean r2 = r4.isNull(r0)     // Catch:{ all -> 0x03f9 }
            if (r2 == 0) goto L_0x0391
            r2 = 0
            goto L_0x0395
        L_0x0391:
            java.lang.String r2 = r4.getString(r0)     // Catch:{ all -> 0x03f9 }
        L_0x0395:
            java.util.List r2 = com.urbanairship.automation.storage.C8945d.m33317d(r2)     // Catch:{ all -> 0x03f9 }
            r3.f24033x = r2     // Catch:{ all -> 0x03f9 }
        L_0x039b:
            boolean r2 = r4.isNull(r5)     // Catch:{ all -> 0x03f9 }
            if (r2 != 0) goto L_0x03b0
            java.lang.String r2 = r4.getString(r5)     // Catch:{ all -> 0x03f9 }
            r26 = r0
            r0 = r27
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x03f9 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x03f9 }
            goto L_0x03b5
        L_0x03b0:
            r26 = r0
            r0 = r27
            r2 = 0
        L_0x03b5:
            if (r2 != 0) goto L_0x03bc
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x03f9 }
            r2.<init>()     // Catch:{ all -> 0x03f9 }
        L_0x03bc:
            r27 = r0
            com.urbanairship.automation.storage.e r0 = new com.urbanairship.automation.storage.e     // Catch:{ all -> 0x03f9 }
            r0.<init>(r3, r2)     // Catch:{ all -> 0x03f9 }
            r2 = r28
            r2.add(r0)     // Catch:{ all -> 0x03f9 }
            r28 = r15
            r3 = r27
            r27 = r29
            r0 = r30
            r31 = r6
            r6 = r34
            r34 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r23
            r23 = r7
            r7 = r22
            r22 = r31
            goto L_0x011e
        L_0x03e8:
            androidx.room.RoomDatabase r0 = r1.f23955a     // Catch:{ all -> 0x03f9 }
            r0.mo60901O()     // Catch:{ all -> 0x03f9 }
            r4.close()     // Catch:{ all -> 0x0405 }
            r16.release()     // Catch:{ all -> 0x0405 }
            androidx.room.RoomDatabase r0 = r1.f23955a
            r0.mo60908k()
            return r2
        L_0x03f9:
            r0 = move-exception
            goto L_0x03fe
        L_0x03fb:
            r0 = move-exception
            r16 = r3
        L_0x03fe:
            r4.close()     // Catch:{ all -> 0x0405 }
            r16.release()     // Catch:{ all -> 0x0405 }
            throw r0     // Catch:{ all -> 0x0405 }
        L_0x0405:
            r0 = move-exception
            androidx.room.RoomDatabase r2 = r1.f23955a
            r2.mo60908k()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.automation.storage.C8939c.mo17651o(java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x02ad A[Catch:{ all -> 0x040a }] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02b1 A[Catch:{ all -> 0x040a }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02bd A[Catch:{ all -> 0x040a }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02bf A[Catch:{ all -> 0x040a }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02f1 A[Catch:{ all -> 0x040a }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02f5 A[Catch:{ all -> 0x040a }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0313 A[Catch:{ all -> 0x040a }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0318 A[Catch:{ all -> 0x040a }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0338 A[Catch:{ all -> 0x040a }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x033c A[Catch:{ all -> 0x040a }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x034a A[Catch:{ all -> 0x040a }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0350 A[Catch:{ all -> 0x040a }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x036a A[Catch:{ all -> 0x040a }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x036e A[Catch:{ all -> 0x040a }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0384 A[Catch:{ all -> 0x040a }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0388 A[Catch:{ all -> 0x040a }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x039e A[Catch:{ all -> 0x040a }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x03a0 A[Catch:{ all -> 0x040a }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x03b0 A[Catch:{ all -> 0x040a }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x03bf A[Catch:{ all -> 0x040a }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x03c6 A[Catch:{ all -> 0x040a }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03cb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x024f A[Catch:{ all -> 0x040a }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0253 A[Catch:{ all -> 0x040a }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x025f A[Catch:{ all -> 0x040a }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0263 A[Catch:{ all -> 0x040a }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x026f A[Catch:{ all -> 0x040a }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0273 A[Catch:{ all -> 0x040a }] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.urbanairship.automation.storage.C8946e> mo17652p(int... r34) {
        /*
            r33 = this;
            r1 = r33
            r0 = r34
            java.lang.StringBuilder r2 = androidx.room.util.C20382e.m95158d()
            java.lang.String r3 = "SELECT * FROM schedules WHERE (executionState IN ("
            r2.append(r3)
            int r3 = r0.length
            androidx.room.util.C20382e.m95155a(r2, r3)
            java.lang.String r4 = "))"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r4 = 0
            int r3 = r3 + r4
            androidx.room.v1 r2 = androidx.room.C20400v1.m95183d(r2, r3)
            int r3 = r0.length
            r5 = 1
            r6 = r5
        L_0x0023:
            if (r4 >= r3) goto L_0x002f
            r7 = r0[r4]
            long r7 = (long) r7
            r2.mo60790S2(r6, r7)
            int r6 = r6 + r5
            int r4 = r4 + 1
            goto L_0x0023
        L_0x002f:
            androidx.room.RoomDatabase r0 = r1.f23955a
            r0.mo60904d()
            androidx.room.RoomDatabase r0 = r1.f23955a
            r0.mo60905e()
            androidx.room.RoomDatabase r0 = r1.f23955a     // Catch:{ all -> 0x0416 }
            r3 = 0
            android.database.Cursor r4 = androidx.room.util.C20378b.m95145f(r0, r2, r5, r3)     // Catch:{ all -> 0x0416 }
            java.lang.String r0 = "id"
            int r0 = androidx.room.util.C20376a.m95137e(r4, r0)     // Catch:{ all -> 0x040c }
            java.lang.String r5 = "scheduleId"
            int r5 = androidx.room.util.C20376a.m95137e(r4, r5)     // Catch:{ all -> 0x040c }
            java.lang.String r6 = "group"
            int r6 = androidx.room.util.C20376a.m95137e(r4, r6)     // Catch:{ all -> 0x040c }
            java.lang.String r7 = "metadata"
            int r7 = androidx.room.util.C20376a.m95137e(r4, r7)     // Catch:{ all -> 0x040c }
            java.lang.String r8 = "limit"
            int r8 = androidx.room.util.C20376a.m95137e(r4, r8)     // Catch:{ all -> 0x040c }
            java.lang.String r9 = "priority"
            int r9 = androidx.room.util.C20376a.m95137e(r4, r9)     // Catch:{ all -> 0x040c }
            java.lang.String r10 = "scheduleStart"
            int r10 = androidx.room.util.C20376a.m95137e(r4, r10)     // Catch:{ all -> 0x040c }
            java.lang.String r11 = "scheduleEnd"
            int r11 = androidx.room.util.C20376a.m95137e(r4, r11)     // Catch:{ all -> 0x040c }
            java.lang.String r12 = "editGracePeriod"
            int r12 = androidx.room.util.C20376a.m95137e(r4, r12)     // Catch:{ all -> 0x040c }
            java.lang.String r13 = "interval"
            int r13 = androidx.room.util.C20376a.m95137e(r4, r13)     // Catch:{ all -> 0x040c }
            java.lang.String r14 = "scheduleType"
            int r14 = androidx.room.util.C20376a.m95137e(r4, r14)     // Catch:{ all -> 0x040c }
            java.lang.String r15 = "data"
            int r15 = androidx.room.util.C20376a.m95137e(r4, r15)     // Catch:{ all -> 0x040c }
            java.lang.String r3 = "count"
            int r3 = androidx.room.util.C20376a.m95137e(r4, r3)     // Catch:{ all -> 0x040c }
            r16 = r2
            java.lang.String r2 = "executionState"
            int r2 = androidx.room.util.C20376a.m95137e(r4, r2)     // Catch:{ all -> 0x040a }
            r17 = r2
            java.lang.String r2 = "executionStateChangeDate"
            int r2 = androidx.room.util.C20376a.m95137e(r4, r2)     // Catch:{ all -> 0x040a }
            r18 = r2
            java.lang.String r2 = "triggerContext"
            int r2 = androidx.room.util.C20376a.m95137e(r4, r2)     // Catch:{ all -> 0x040a }
            r19 = r2
            java.lang.String r2 = "appState"
            int r2 = androidx.room.util.C20376a.m95137e(r4, r2)     // Catch:{ all -> 0x040a }
            r20 = r2
            java.lang.String r2 = "screens"
            int r2 = androidx.room.util.C20376a.m95137e(r4, r2)     // Catch:{ all -> 0x040a }
            r21 = r2
            java.lang.String r2 = "seconds"
            int r2 = androidx.room.util.C20376a.m95137e(r4, r2)     // Catch:{ all -> 0x040a }
            r22 = r2
            java.lang.String r2 = "regionId"
            int r2 = androidx.room.util.C20376a.m95137e(r4, r2)     // Catch:{ all -> 0x040a }
            r23 = r2
            java.lang.String r2 = "audience"
            int r2 = androidx.room.util.C20376a.m95137e(r4, r2)     // Catch:{ all -> 0x040a }
            r24 = r2
            java.lang.String r2 = "campaigns"
            int r2 = androidx.room.util.C20376a.m95137e(r4, r2)     // Catch:{ all -> 0x040a }
            r25 = r2
            java.lang.String r2 = "reportingContext"
            int r2 = androidx.room.util.C20376a.m95137e(r4, r2)     // Catch:{ all -> 0x040a }
            r26 = r2
            java.lang.String r2 = "frequencyConstraintIds"
            int r2 = androidx.room.util.C20376a.m95137e(r4, r2)     // Catch:{ all -> 0x040a }
            r27 = r2
            androidx.collection.a r2 = new androidx.collection.a     // Catch:{ all -> 0x040a }
            r2.<init>()     // Catch:{ all -> 0x040a }
        L_0x00ed:
            boolean r28 = r4.moveToNext()     // Catch:{ all -> 0x040a }
            if (r28 == 0) goto L_0x0119
            boolean r28 = r4.isNull(r5)     // Catch:{ all -> 0x040a }
            if (r28 != 0) goto L_0x00ed
            r28 = r3
            java.lang.String r3 = r4.getString(r5)     // Catch:{ all -> 0x040a }
            java.lang.Object r29 = r2.get(r3)     // Catch:{ all -> 0x040a }
            java.util.ArrayList r29 = (java.util.ArrayList) r29     // Catch:{ all -> 0x040a }
            if (r29 != 0) goto L_0x0112
            r29 = r15
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x040a }
            r15.<init>()     // Catch:{ all -> 0x040a }
            r2.put(r3, r15)     // Catch:{ all -> 0x040a }
            goto L_0x0114
        L_0x0112:
            r29 = r15
        L_0x0114:
            r3 = r28
            r15 = r29
            goto L_0x00ed
        L_0x0119:
            r28 = r3
            r29 = r15
            r3 = -1
            r4.moveToPosition(r3)     // Catch:{ all -> 0x040a }
            r1.mo17660x(r2)     // Catch:{ all -> 0x040a }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x040a }
            int r15 = r4.getCount()     // Catch:{ all -> 0x040a }
            r3.<init>(r15)     // Catch:{ all -> 0x040a }
        L_0x012d:
            boolean r15 = r4.moveToNext()     // Catch:{ all -> 0x040a }
            if (r15 == 0) goto L_0x03f8
            boolean r15 = r4.isNull(r0)     // Catch:{ all -> 0x040a }
            if (r15 == 0) goto L_0x0234
            boolean r15 = r4.isNull(r5)     // Catch:{ all -> 0x040a }
            if (r15 == 0) goto L_0x0234
            boolean r15 = r4.isNull(r6)     // Catch:{ all -> 0x040a }
            if (r15 == 0) goto L_0x0234
            boolean r15 = r4.isNull(r7)     // Catch:{ all -> 0x040a }
            if (r15 == 0) goto L_0x0234
            boolean r15 = r4.isNull(r8)     // Catch:{ all -> 0x040a }
            if (r15 == 0) goto L_0x0234
            boolean r15 = r4.isNull(r9)     // Catch:{ all -> 0x040a }
            if (r15 == 0) goto L_0x0234
            boolean r15 = r4.isNull(r10)     // Catch:{ all -> 0x040a }
            if (r15 == 0) goto L_0x0234
            boolean r15 = r4.isNull(r11)     // Catch:{ all -> 0x040a }
            if (r15 == 0) goto L_0x0234
            boolean r15 = r4.isNull(r12)     // Catch:{ all -> 0x040a }
            if (r15 == 0) goto L_0x0234
            boolean r15 = r4.isNull(r13)     // Catch:{ all -> 0x040a }
            if (r15 == 0) goto L_0x0234
            boolean r15 = r4.isNull(r14)     // Catch:{ all -> 0x040a }
            if (r15 == 0) goto L_0x0234
            r15 = r29
            boolean r29 = r4.isNull(r15)     // Catch:{ all -> 0x040a }
            if (r29 == 0) goto L_0x0236
            r29 = r3
            r3 = r28
            boolean r28 = r4.isNull(r3)     // Catch:{ all -> 0x040a }
            if (r28 == 0) goto L_0x023a
            r28 = r2
            r2 = r17
            boolean r17 = r4.isNull(r2)     // Catch:{ all -> 0x040a }
            if (r17 == 0) goto L_0x0231
            r17 = r2
            r2 = r18
            boolean r18 = r4.isNull(r2)     // Catch:{ all -> 0x040a }
            if (r18 == 0) goto L_0x022e
            r18 = r2
            r2 = r19
            boolean r19 = r4.isNull(r2)     // Catch:{ all -> 0x040a }
            if (r19 == 0) goto L_0x022b
            r19 = r2
            r2 = r20
            boolean r20 = r4.isNull(r2)     // Catch:{ all -> 0x040a }
            if (r20 == 0) goto L_0x0228
            r20 = r2
            r2 = r21
            boolean r21 = r4.isNull(r2)     // Catch:{ all -> 0x040a }
            if (r21 == 0) goto L_0x0225
            r21 = r2
            r2 = r22
            boolean r22 = r4.isNull(r2)     // Catch:{ all -> 0x040a }
            if (r22 == 0) goto L_0x0222
            r22 = r2
            r2 = r23
            boolean r23 = r4.isNull(r2)     // Catch:{ all -> 0x040a }
            if (r23 == 0) goto L_0x021f
            r23 = r2
            r2 = r24
            boolean r24 = r4.isNull(r2)     // Catch:{ all -> 0x040a }
            if (r24 == 0) goto L_0x021c
            r24 = r2
            r2 = r25
            boolean r25 = r4.isNull(r2)     // Catch:{ all -> 0x040a }
            if (r25 == 0) goto L_0x0219
            r25 = r2
            r2 = r26
            boolean r26 = r4.isNull(r2)     // Catch:{ all -> 0x040a }
            if (r26 == 0) goto L_0x0216
            r26 = r2
            r2 = r27
            boolean r27 = r4.isNull(r2)     // Catch:{ all -> 0x040a }
            if (r27 != 0) goto L_0x01f8
            r27 = r2
            goto L_0x023c
        L_0x01f8:
            r31 = r0
            r0 = r2
            r30 = r3
            r2 = 0
            r32 = r17
            r17 = r6
            r6 = r23
            r23 = r7
            r7 = r24
            r24 = r22
            r22 = r21
            r21 = r20
            r20 = r19
            r19 = r18
            r18 = r32
            goto L_0x03aa
        L_0x0216:
            r26 = r2
            goto L_0x023c
        L_0x0219:
            r25 = r2
            goto L_0x023c
        L_0x021c:
            r24 = r2
            goto L_0x023c
        L_0x021f:
            r23 = r2
            goto L_0x023c
        L_0x0222:
            r22 = r2
            goto L_0x023c
        L_0x0225:
            r21 = r2
            goto L_0x023c
        L_0x0228:
            r20 = r2
            goto L_0x023c
        L_0x022b:
            r19 = r2
            goto L_0x023c
        L_0x022e:
            r18 = r2
            goto L_0x023c
        L_0x0231:
            r17 = r2
            goto L_0x023c
        L_0x0234:
            r15 = r29
        L_0x0236:
            r29 = r3
            r3 = r28
        L_0x023a:
            r28 = r2
        L_0x023c:
            com.urbanairship.automation.storage.h r2 = new com.urbanairship.automation.storage.h     // Catch:{ all -> 0x040a }
            r2.<init>()     // Catch:{ all -> 0x040a }
            r30 = r3
            int r3 = r4.getInt(r0)     // Catch:{ all -> 0x040a }
            r2.f24010a = r3     // Catch:{ all -> 0x040a }
            boolean r3 = r4.isNull(r5)     // Catch:{ all -> 0x040a }
            if (r3 == 0) goto L_0x0253
            r3 = 0
            r2.f24011b = r3     // Catch:{ all -> 0x040a }
            goto L_0x0259
        L_0x0253:
            java.lang.String r3 = r4.getString(r5)     // Catch:{ all -> 0x040a }
            r2.f24011b = r3     // Catch:{ all -> 0x040a }
        L_0x0259:
            boolean r3 = r4.isNull(r6)     // Catch:{ all -> 0x040a }
            if (r3 == 0) goto L_0x0263
            r3 = 0
            r2.f24012c = r3     // Catch:{ all -> 0x040a }
            goto L_0x0269
        L_0x0263:
            java.lang.String r3 = r4.getString(r6)     // Catch:{ all -> 0x040a }
            r2.f24012c = r3     // Catch:{ all -> 0x040a }
        L_0x0269:
            boolean r3 = r4.isNull(r7)     // Catch:{ all -> 0x040a }
            if (r3 == 0) goto L_0x0273
            r31 = r0
            r3 = 0
            goto L_0x0279
        L_0x0273:
            java.lang.String r3 = r4.getString(r7)     // Catch:{ all -> 0x040a }
            r31 = r0
        L_0x0279:
            com.urbanairship.json.f r0 = r1.f23957c     // Catch:{ all -> 0x040a }
            com.urbanairship.json.b r0 = r0.mo18843a(r3)     // Catch:{ all -> 0x040a }
            r2.f24013d = r0     // Catch:{ all -> 0x040a }
            int r0 = r4.getInt(r8)     // Catch:{ all -> 0x040a }
            r2.f24014e = r0     // Catch:{ all -> 0x040a }
            int r0 = r4.getInt(r9)     // Catch:{ all -> 0x040a }
            r2.f24015f = r0     // Catch:{ all -> 0x040a }
            r0 = r6
            r3 = r7
            long r6 = r4.getLong(r10)     // Catch:{ all -> 0x040a }
            r2.f24016g = r6     // Catch:{ all -> 0x040a }
            long r6 = r4.getLong(r11)     // Catch:{ all -> 0x040a }
            r2.f24017h = r6     // Catch:{ all -> 0x040a }
            long r6 = r4.getLong(r12)     // Catch:{ all -> 0x040a }
            r2.f24018i = r6     // Catch:{ all -> 0x040a }
            long r6 = r4.getLong(r13)     // Catch:{ all -> 0x040a }
            r2.f24019j = r6     // Catch:{ all -> 0x040a }
            boolean r6 = r4.isNull(r14)     // Catch:{ all -> 0x040a }
            if (r6 == 0) goto L_0x02b1
            r6 = 0
            r2.f24020k = r6     // Catch:{ all -> 0x040a }
            goto L_0x02b7
        L_0x02b1:
            java.lang.String r6 = r4.getString(r14)     // Catch:{ all -> 0x040a }
            r2.f24020k = r6     // Catch:{ all -> 0x040a }
        L_0x02b7:
            boolean r6 = r4.isNull(r15)     // Catch:{ all -> 0x040a }
            if (r6 == 0) goto L_0x02bf
            r6 = 0
            goto L_0x02c3
        L_0x02bf:
            java.lang.String r6 = r4.getString(r15)     // Catch:{ all -> 0x040a }
        L_0x02c3:
            com.urbanairship.json.f r7 = r1.f23957c     // Catch:{ all -> 0x040a }
            com.urbanairship.json.JsonValue r6 = r7.mo18847e(r6)     // Catch:{ all -> 0x040a }
            r2.f24021l = r6     // Catch:{ all -> 0x040a }
            r6 = r30
            int r7 = r4.getInt(r6)     // Catch:{ all -> 0x040a }
            r2.f24022m = r7     // Catch:{ all -> 0x040a }
            r7 = r17
            r17 = r0
            int r0 = r4.getInt(r7)     // Catch:{ all -> 0x040a }
            r2.f24023n = r0     // Catch:{ all -> 0x040a }
            r30 = r6
            r0 = r18
            r18 = r7
            long r6 = r4.getLong(r0)     // Catch:{ all -> 0x040a }
            r2.f24024o = r6     // Catch:{ all -> 0x040a }
            r6 = r19
            boolean r7 = r4.isNull(r6)     // Catch:{ all -> 0x040a }
            if (r7 == 0) goto L_0x02f5
            r19 = r0
            r7 = 0
            goto L_0x02fb
        L_0x02f5:
            java.lang.String r7 = r4.getString(r6)     // Catch:{ all -> 0x040a }
            r19 = r0
        L_0x02fb:
            com.urbanairship.automation.storage.d r0 = r1.f23958d     // Catch:{ all -> 0x040a }
            com.urbanairship.automation.d0 r0 = r0.mo17668e(r7)     // Catch:{ all -> 0x040a }
            r2.f24025p = r0     // Catch:{ all -> 0x040a }
            r0 = r20
            int r7 = r4.getInt(r0)     // Catch:{ all -> 0x040a }
            r2.f24026q = r7     // Catch:{ all -> 0x040a }
            r7 = r21
            boolean r20 = r4.isNull(r7)     // Catch:{ all -> 0x040a }
            if (r20 == 0) goto L_0x0318
            r21 = r0
            r20 = 0
            goto L_0x031e
        L_0x0318:
            java.lang.String r20 = r4.getString(r7)     // Catch:{ all -> 0x040a }
            r21 = r0
        L_0x031e:
            java.util.List r0 = com.urbanairship.automation.storage.C8945d.m33317d(r20)     // Catch:{ all -> 0x040a }
            r2.f24027r = r0     // Catch:{ all -> 0x040a }
            r20 = r6
            r0 = r22
            r22 = r7
            long r6 = r4.getLong(r0)     // Catch:{ all -> 0x040a }
            r2.f24028s = r6     // Catch:{ all -> 0x040a }
            r6 = r23
            boolean r7 = r4.isNull(r6)     // Catch:{ all -> 0x040a }
            if (r7 == 0) goto L_0x033c
            r7 = 0
            r2.f24029t = r7     // Catch:{ all -> 0x040a }
            goto L_0x0342
        L_0x033c:
            java.lang.String r7 = r4.getString(r6)     // Catch:{ all -> 0x040a }
            r2.f24029t = r7     // Catch:{ all -> 0x040a }
        L_0x0342:
            r7 = r24
            boolean r23 = r4.isNull(r7)     // Catch:{ all -> 0x040a }
            if (r23 == 0) goto L_0x0350
            r24 = r0
            r23 = r3
            r0 = 0
            goto L_0x035a
        L_0x0350:
            java.lang.String r23 = r4.getString(r7)     // Catch:{ all -> 0x040a }
            r24 = r0
            r0 = r23
            r23 = r3
        L_0x035a:
            com.urbanairship.automation.storage.d r3 = r1.f23958d     // Catch:{ all -> 0x040a }
            com.urbanairship.automation.b r0 = r3.mo17666a(r0)     // Catch:{ all -> 0x040a }
            r2.f24030u = r0     // Catch:{ all -> 0x040a }
            r0 = r25
            boolean r3 = r4.isNull(r0)     // Catch:{ all -> 0x040a }
            if (r3 == 0) goto L_0x036e
            r25 = r0
            r3 = 0
            goto L_0x0374
        L_0x036e:
            java.lang.String r3 = r4.getString(r0)     // Catch:{ all -> 0x040a }
            r25 = r0
        L_0x0374:
            com.urbanairship.json.f r0 = r1.f23957c     // Catch:{ all -> 0x040a }
            com.urbanairship.json.JsonValue r0 = r0.mo18847e(r3)     // Catch:{ all -> 0x040a }
            r2.f24031v = r0     // Catch:{ all -> 0x040a }
            r0 = r26
            boolean r3 = r4.isNull(r0)     // Catch:{ all -> 0x040a }
            if (r3 == 0) goto L_0x0388
            r26 = r0
            r3 = 0
            goto L_0x038e
        L_0x0388:
            java.lang.String r3 = r4.getString(r0)     // Catch:{ all -> 0x040a }
            r26 = r0
        L_0x038e:
            com.urbanairship.json.f r0 = r1.f23957c     // Catch:{ all -> 0x040a }
            com.urbanairship.json.JsonValue r0 = r0.mo18847e(r3)     // Catch:{ all -> 0x040a }
            r2.f24032w = r0     // Catch:{ all -> 0x040a }
            r0 = r27
            boolean r3 = r4.isNull(r0)     // Catch:{ all -> 0x040a }
            if (r3 == 0) goto L_0x03a0
            r3 = 0
            goto L_0x03a4
        L_0x03a0:
            java.lang.String r3 = r4.getString(r0)     // Catch:{ all -> 0x040a }
        L_0x03a4:
            java.util.List r3 = com.urbanairship.automation.storage.C8945d.m33317d(r3)     // Catch:{ all -> 0x040a }
            r2.f24033x = r3     // Catch:{ all -> 0x040a }
        L_0x03aa:
            boolean r3 = r4.isNull(r5)     // Catch:{ all -> 0x040a }
            if (r3 != 0) goto L_0x03bf
            java.lang.String r3 = r4.getString(r5)     // Catch:{ all -> 0x040a }
            r27 = r0
            r0 = r28
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x040a }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x040a }
            goto L_0x03c4
        L_0x03bf:
            r27 = r0
            r0 = r28
            r3 = 0
        L_0x03c4:
            if (r3 != 0) goto L_0x03cb
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x040a }
            r3.<init>()     // Catch:{ all -> 0x040a }
        L_0x03cb:
            r28 = r0
            com.urbanairship.automation.storage.e r0 = new com.urbanairship.automation.storage.e     // Catch:{ all -> 0x040a }
            r0.<init>(r2, r3)     // Catch:{ all -> 0x040a }
            r2 = r29
            r2.add(r0)     // Catch:{ all -> 0x040a }
            r3 = r2
            r29 = r15
            r2 = r28
            r28 = r30
            r0 = r31
            r32 = r23
            r23 = r6
            r6 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            r22 = r24
            r24 = r7
            r7 = r32
            goto L_0x012d
        L_0x03f8:
            r2 = r3
            androidx.room.RoomDatabase r0 = r1.f23955a     // Catch:{ all -> 0x040a }
            r0.mo60901O()     // Catch:{ all -> 0x040a }
            r4.close()     // Catch:{ all -> 0x0416 }
            r16.release()     // Catch:{ all -> 0x0416 }
            androidx.room.RoomDatabase r0 = r1.f23955a
            r0.mo60908k()
            return r2
        L_0x040a:
            r0 = move-exception
            goto L_0x040f
        L_0x040c:
            r0 = move-exception
            r16 = r2
        L_0x040f:
            r4.close()     // Catch:{ all -> 0x0416 }
            r16.release()     // Catch:{ all -> 0x0416 }
            throw r0     // Catch:{ all -> 0x0416 }
        L_0x0416:
            r0 = move-exception
            androidx.room.RoomDatabase r2 = r1.f23955a
            r2.mo60908k()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.automation.storage.C8939c.mo17652p(int[]):java.util.List");
    }

    /* renamed from: r */
    public void mo17654r(C8954h hVar, List<C8956j> list) {
        this.f23955a.mo60904d();
        this.f23955a.mo60905e();
        try {
            this.f23956b.mo61158k(hVar);
            this.f23959e.mo61157j(list);
            this.f23955a.mo60901O();
        } finally {
            this.f23955a.mo60908k();
        }
    }

    /* renamed from: s */
    public void mo17655s(Collection<C8946e> collection) {
        this.f23955a.mo60905e();
        try {
            super.mo17655s(collection);
            this.f23955a.mo60901O();
        } finally {
            this.f23955a.mo60908k();
        }
    }

    /* renamed from: u */
    public void mo17657u(C8954h hVar, List<C8956j> list) {
        this.f23955a.mo60904d();
        this.f23955a.mo60905e();
        try {
            this.f23961g.mo61150j(hVar);
            this.f23962h.mo61151k(list);
            this.f23955a.mo60901O();
        } finally {
            this.f23955a.mo60908k();
        }
    }

    /* renamed from: w */
    public void mo17659w(List<C8956j> list) {
        this.f23955a.mo60904d();
        this.f23955a.mo60905e();
        try {
            this.f23962h.mo61151k(list);
            this.f23955a.mo60901O();
        } finally {
            this.f23955a.mo60908k();
        }
    }

    /* renamed from: x */
    public final void mo17660x(C1866a<String, ArrayList<C8956j>> aVar) {
        ArrayList arrayList;
        String str;
        boolean z;
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
                        mo17660x(aVar2);
                        aVar2 = new C1866a(999);
                        i2 = 0;
                    }
                }
                if (i2 > 0) {
                    mo17660x(aVar2);
                    return;
                }
                return;
            }
            StringBuilder d = C20382e.m95158d();
            d.append("SELECT `id`,`triggerType`,`goal`,`jsonPredicate`,`isCancellation`,`progress`,`parentScheduleId` FROM `triggers` WHERE `parentScheduleId` IN (");
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
            Cursor f = C20378b.m95145f(this.f23955a, d2, false, (CancellationSignal) null);
            try {
                int d3 = C20376a.m95136d(f, "parentScheduleId");
                if (d3 != -1) {
                    while (f.moveToNext()) {
                        if (!f.isNull(d3) && (arrayList = aVar.get(f.getString(d3))) != null) {
                            C8956j jVar = new C8956j();
                            jVar.f24041a = f.getInt(0);
                            jVar.f24042b = f.getInt(1);
                            jVar.f24043c = f.getDouble(2);
                            if (f.isNull(3)) {
                                str = null;
                            } else {
                                str = f.getString(3);
                            }
                            jVar.f24044d = this.f23957c.mo18845c(str);
                            if (f.getInt(4) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            jVar.f24045e = z;
                            jVar.f24046f = f.getDouble(5);
                            if (f.isNull(6)) {
                                jVar.f24047g = null;
                            } else {
                                jVar.f24047g = f.getString(6);
                            }
                            arrayList.add(jVar);
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
