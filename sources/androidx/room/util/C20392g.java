package androidx.room.util;

import android.database.Cursor;
import androidx.room.util.C20383f;
import androidx.sqlite.p031db.C20466f;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10975r0;
import kotlin.collections.C10976s;
import kotlin.collections.C10977s0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p010io.C11133b;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.room.util.g */
public final class C20392g {
    /* renamed from: a */
    public static final Map<String, C20383f.C20384a> m95173a(C20466f fVar, String str) {
        Throwable th;
        boolean z;
        Cursor h3 = fVar.mo60771h3("PRAGMA table_info(`" + str + "`)");
        try {
            if (h3.getColumnCount() <= 0) {
                Map<String, C20383f.C20384a> z2 = C10977s0.m41492z();
                C11133b.m42950a(h3, (Throwable) null);
                return z2;
            }
            int columnIndex = h3.getColumnIndex("name");
            int columnIndex2 = h3.getColumnIndex("type");
            int columnIndex3 = h3.getColumnIndex("notnull");
            int columnIndex4 = h3.getColumnIndex("pk");
            int columnIndex5 = h3.getColumnIndex("dflt_value");
            Map g = C10975r0.m41397g();
            while (h3.moveToNext()) {
                String string = h3.getString(columnIndex);
                String string2 = h3.getString(columnIndex2);
                if (h3.getInt(columnIndex3) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i = h3.getInt(columnIndex4);
                String string3 = h3.getString(columnIndex5);
                Intrinsics.checkNotNullExpressionValue(string, "name");
                Intrinsics.checkNotNullExpressionValue(string2, "type");
                C20383f.C20384a aVar = r11;
                C20383f.C20384a aVar2 = new C20383f.C20384a(string, string2, z, i, string3, 2);
                g.put(string, aVar);
            }
            Map<String, C20383f.C20384a> d = C10975r0.m41394d(g);
            C11133b.m42950a(h3, (Throwable) null);
            return d;
        } catch (Throwable th2) {
            Throwable th3 = th2;
            C11133b.m42950a(h3, th);
            throw th3;
        }
    }

    /* renamed from: b */
    public static final List<C20383f.C20389e> m95174b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        List i = C10976s.m41417i();
        while (cursor.moveToNext()) {
            int i2 = cursor.getInt(columnIndex);
            int i3 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(toColumnIndex)");
            i.add(new C20383f.C20389e(i2, i3, string, string2));
        }
        return CollectionsKt___CollectionsKt.m40659l5(C10976s.m41409a(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d8, code lost:
        kotlin.p010io.C11133b.m42950a(r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00db, code lost:
        throw r0;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Set<androidx.room.util.C20383f.C20388d> m95175c(androidx.sqlite.p031db.C20466f r13, java.lang.String r14) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "PRAGMA foreign_key_list(`"
            r0.append(r1)
            r0.append(r14)
            java.lang.String r14 = "`)"
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            android.database.Cursor r13 = r13.mo60771h3(r14)
            java.lang.String r14 = "id"
            int r14 = r13.getColumnIndex(r14)     // Catch:{ all -> 0x00d5 }
            java.lang.String r0 = "seq"
            int r0 = r13.getColumnIndex(r0)     // Catch:{ all -> 0x00d5 }
            java.lang.String r1 = "table"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ all -> 0x00d5 }
            java.lang.String r2 = "on_delete"
            int r2 = r13.getColumnIndex(r2)     // Catch:{ all -> 0x00d5 }
            java.lang.String r3 = "on_update"
            int r3 = r13.getColumnIndex(r3)     // Catch:{ all -> 0x00d5 }
            java.util.List r4 = m95174b(r13)     // Catch:{ all -> 0x00d5 }
            r5 = -1
            r13.moveToPosition(r5)     // Catch:{ all -> 0x00d5 }
            java.util.Set r5 = kotlin.collections.C10927c1.m40881d()     // Catch:{ all -> 0x00d5 }
        L_0x0044:
            boolean r6 = r13.moveToNext()     // Catch:{ all -> 0x00d5 }
            if (r6 == 0) goto L_0x00cc
            int r6 = r13.getInt(r0)     // Catch:{ all -> 0x00d5 }
            if (r6 == 0) goto L_0x0051
            goto L_0x0044
        L_0x0051:
            int r6 = r13.getInt(r14)     // Catch:{ all -> 0x00d5 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x00d5 }
            r11.<init>()     // Catch:{ all -> 0x00d5 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x00d5 }
            r12.<init>()     // Catch:{ all -> 0x00d5 }
            r7 = r4
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch:{ all -> 0x00d5 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x00d5 }
            r8.<init>()     // Catch:{ all -> 0x00d5 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x00d5 }
        L_0x006b:
            boolean r9 = r7.hasNext()     // Catch:{ all -> 0x00d5 }
            if (r9 == 0) goto L_0x0087
            java.lang.Object r9 = r7.next()     // Catch:{ all -> 0x00d5 }
            r10 = r9
            androidx.room.util.f$e r10 = (androidx.room.util.C20383f.C20389e) r10     // Catch:{ all -> 0x00d5 }
            int r10 = r10.mo61215q()     // Catch:{ all -> 0x00d5 }
            if (r10 != r6) goto L_0x0080
            r10 = 1
            goto L_0x0081
        L_0x0080:
            r10 = 0
        L_0x0081:
            if (r10 == 0) goto L_0x006b
            r8.add(r9)     // Catch:{ all -> 0x00d5 }
            goto L_0x006b
        L_0x0087:
            java.util.Iterator r6 = r8.iterator()     // Catch:{ all -> 0x00d5 }
        L_0x008b:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x00d5 }
            if (r7 == 0) goto L_0x00a6
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x00d5 }
            androidx.room.util.f$e r7 = (androidx.room.util.C20383f.C20389e) r7     // Catch:{ all -> 0x00d5 }
            java.lang.String r8 = r7.mo61214g()     // Catch:{ all -> 0x00d5 }
            r11.add(r8)     // Catch:{ all -> 0x00d5 }
            java.lang.String r7 = r7.mo61217w()     // Catch:{ all -> 0x00d5 }
            r12.add(r7)     // Catch:{ all -> 0x00d5 }
            goto L_0x008b
        L_0x00a6:
            androidx.room.util.f$d r6 = new androidx.room.util.f$d     // Catch:{ all -> 0x00d5 }
            java.lang.String r8 = r13.getString(r1)     // Catch:{ all -> 0x00d5 }
            java.lang.String r7 = "cursor.getString(tableColumnIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)     // Catch:{ all -> 0x00d5 }
            java.lang.String r9 = r13.getString(r2)     // Catch:{ all -> 0x00d5 }
            java.lang.String r7 = "cursor.getString(onDeleteColumnIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r7)     // Catch:{ all -> 0x00d5 }
            java.lang.String r10 = r13.getString(r3)     // Catch:{ all -> 0x00d5 }
            java.lang.String r7 = "cursor.getString(onUpdateColumnIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r7)     // Catch:{ all -> 0x00d5 }
            r7 = r6
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00d5 }
            r5.add(r6)     // Catch:{ all -> 0x00d5 }
            goto L_0x0044
        L_0x00cc:
            java.util.Set r14 = kotlin.collections.C10927c1.m40878a(r5)     // Catch:{ all -> 0x00d5 }
            r0 = 0
            kotlin.p010io.C11133b.m42950a(r13, r0)
            return r14
        L_0x00d5:
            r14 = move-exception
            throw r14     // Catch:{ all -> 0x00d7 }
        L_0x00d7:
            r0 = move-exception
            kotlin.p010io.C11133b.m42950a(r13, r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.C20392g.m95175c(androidx.sqlite.db.f, java.lang.String):java.util.Set");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a8, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a9, code lost:
        kotlin.p010io.C11133b.m42950a(r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ac, code lost:
        throw r14;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.room.util.C20383f.C20390f m95176d(androidx.sqlite.p031db.C20466f r12, java.lang.String r13, boolean r14) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "PRAGMA index_xinfo(`"
            r0.append(r1)
            r0.append(r13)
            java.lang.String r1 = "`)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.database.Cursor r12 = r12.mo60771h3(r0)
            java.lang.String r0 = "seqno"
            int r0 = r12.getColumnIndex(r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = "cid"
            int r1 = r12.getColumnIndex(r1)     // Catch:{ all -> 0x00a6 }
            java.lang.String r2 = "name"
            int r2 = r12.getColumnIndex(r2)     // Catch:{ all -> 0x00a6 }
            java.lang.String r3 = "desc"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ all -> 0x00a6 }
            r4 = 0
            r5 = -1
            if (r0 == r5) goto L_0x00a2
            if (r1 == r5) goto L_0x00a2
            if (r2 == r5) goto L_0x00a2
            if (r3 != r5) goto L_0x003d
            goto L_0x00a2
        L_0x003d:
            java.util.TreeMap r5 = new java.util.TreeMap     // Catch:{ all -> 0x00a6 }
            r5.<init>()     // Catch:{ all -> 0x00a6 }
            java.util.TreeMap r6 = new java.util.TreeMap     // Catch:{ all -> 0x00a6 }
            r6.<init>()     // Catch:{ all -> 0x00a6 }
        L_0x0047:
            boolean r7 = r12.moveToNext()     // Catch:{ all -> 0x00a6 }
            if (r7 == 0) goto L_0x007b
            int r7 = r12.getInt(r1)     // Catch:{ all -> 0x00a6 }
            if (r7 >= 0) goto L_0x0054
            goto L_0x0047
        L_0x0054:
            int r7 = r12.getInt(r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r8 = r12.getString(r2)     // Catch:{ all -> 0x00a6 }
            int r9 = r12.getInt(r3)     // Catch:{ all -> 0x00a6 }
            if (r9 <= 0) goto L_0x0065
            java.lang.String r9 = "DESC"
            goto L_0x0067
        L_0x0065:
            java.lang.String r9 = "ASC"
        L_0x0067:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00a6 }
            java.lang.String r11 = "columnName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r11)     // Catch:{ all -> 0x00a6 }
            r5.put(r10, r8)     // Catch:{ all -> 0x00a6 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00a6 }
            r6.put(r7, r9)     // Catch:{ all -> 0x00a6 }
            goto L_0x0047
        L_0x007b:
            java.util.Collection r0 = r5.values()     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = "columnsMap.values"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch:{ all -> 0x00a6 }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x00a6 }
            java.util.List r0 = kotlin.collections.CollectionsKt___CollectionsKt.m40557Q5(r0)     // Catch:{ all -> 0x00a6 }
            java.util.Collection r1 = r6.values()     // Catch:{ all -> 0x00a6 }
            java.lang.String r2 = "ordersMap.values"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch:{ all -> 0x00a6 }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x00a6 }
            java.util.List r1 = kotlin.collections.CollectionsKt___CollectionsKt.m40557Q5(r1)     // Catch:{ all -> 0x00a6 }
            androidx.room.util.f$f r2 = new androidx.room.util.f$f     // Catch:{ all -> 0x00a6 }
            r2.<init>(r13, r14, r0, r1)     // Catch:{ all -> 0x00a6 }
            kotlin.p010io.C11133b.m42950a(r12, r4)
            return r2
        L_0x00a2:
            kotlin.p010io.C11133b.m42950a(r12, r4)
            return r4
        L_0x00a6:
            r13 = move-exception
            throw r13     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            r14 = move-exception
            kotlin.p010io.C11133b.m42950a(r12, r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.C20392g.m95176d(androidx.sqlite.db.f, java.lang.String, boolean):androidx.room.util.f$f");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0078, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0079, code lost:
        kotlin.p010io.C11133b.m42950a(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007c, code lost:
        throw r0;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Set<androidx.room.util.C20383f.C20390f> m95177e(androidx.sqlite.p031db.C20466f r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "name"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "PRAGMA index_list(`"
            r1.append(r2)
            r1.append(r10)
            java.lang.String r10 = "`)"
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            android.database.Cursor r10 = r9.mo60771h3(r10)
            int r1 = r10.getColumnIndex(r0)     // Catch:{ all -> 0x0076 }
            java.lang.String r2 = "origin"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x0076 }
            java.lang.String r3 = "unique"
            int r3 = r10.getColumnIndex(r3)     // Catch:{ all -> 0x0076 }
            r4 = -1
            r5 = 0
            if (r1 == r4) goto L_0x0072
            if (r2 == r4) goto L_0x0072
            if (r3 != r4) goto L_0x0035
            goto L_0x0072
        L_0x0035:
            java.util.Set r4 = kotlin.collections.C10927c1.m40881d()     // Catch:{ all -> 0x0076 }
        L_0x0039:
            boolean r6 = r10.moveToNext()     // Catch:{ all -> 0x0076 }
            if (r6 == 0) goto L_0x006a
            java.lang.String r6 = r10.getString(r2)     // Catch:{ all -> 0x0076 }
            java.lang.String r7 = "c"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r6)     // Catch:{ all -> 0x0076 }
            if (r6 != 0) goto L_0x004c
            goto L_0x0039
        L_0x004c:
            java.lang.String r6 = r10.getString(r1)     // Catch:{ all -> 0x0076 }
            int r7 = r10.getInt(r3)     // Catch:{ all -> 0x0076 }
            r8 = 1
            if (r7 != r8) goto L_0x0058
            goto L_0x0059
        L_0x0058:
            r8 = 0
        L_0x0059:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)     // Catch:{ all -> 0x0076 }
            androidx.room.util.f$f r6 = m95176d(r9, r6, r8)     // Catch:{ all -> 0x0076 }
            if (r6 != 0) goto L_0x0066
            kotlin.p010io.C11133b.m42950a(r10, r5)
            return r5
        L_0x0066:
            r4.add(r6)     // Catch:{ all -> 0x0076 }
            goto L_0x0039
        L_0x006a:
            java.util.Set r9 = kotlin.collections.C10927c1.m40878a(r4)     // Catch:{ all -> 0x0076 }
            kotlin.p010io.C11133b.m42950a(r10, r5)
            return r9
        L_0x0072:
            kotlin.p010io.C11133b.m42950a(r10, r5)
            return r5
        L_0x0076:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r0 = move-exception
            kotlin.p010io.C11133b.m42950a(r10, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.C20392g.m95177e(androidx.sqlite.db.f, java.lang.String):java.util.Set");
    }

    @C12579k
    /* renamed from: f */
    public static final C20383f m95178f(@C12579k C20466f fVar, @C12579k String str) {
        Intrinsics.checkNotNullParameter(fVar, "database");
        Intrinsics.checkNotNullParameter(str, "tableName");
        return new C20383f(str, m95173a(fVar, str), m95175c(fVar, str), m95177e(fVar, str));
    }
}
