package androidx.room.util;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.sqlite.p031db.C20458c;
import androidx.sqlite.p031db.C20489i;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C11395k;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11314h(name = "DBUtil")
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.room.util.b */
public final class C20378b {
    @C12580l
    /* renamed from: a */
    public static final CancellationSignal m95140a() {
        return C20458c.C20459a.m95347b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
        kotlin.p010io.C11133b.m42950a(r1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        throw r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m95141b(@org.jetbrains.annotations.C12579k androidx.sqlite.p031db.C20466f r6) {
        /*
            java.lang.String r0 = "db"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.util.List r0 = kotlin.collections.C10976s.m41417i()
            java.lang.String r1 = "SELECT name FROM sqlite_master WHERE type = 'trigger'"
            android.database.Cursor r1 = r6.mo60771h3(r1)
        L_0x000f:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x005e }
            r3 = 0
            if (r2 == 0) goto L_0x001e
            java.lang.String r2 = r1.getString(r3)     // Catch:{ all -> 0x005e }
            r0.add(r2)     // Catch:{ all -> 0x005e }
            goto L_0x000f
        L_0x001e:
            kotlin.d2 r2 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x005e }
            r2 = 0
            kotlin.p010io.C11133b.m42950a(r1, r2)
            java.util.List r0 = kotlin.collections.C10976s.m41409a(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x002e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005d
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r4 = "triggerName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            java.lang.String r4 = "room_fts_content_sync_"
            r5 = 2
            boolean r4 = kotlin.text.C11622t.startsWith$default(r1, r4, r3, r5, r2)
            if (r4 == 0) goto L_0x002e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "DROP TRIGGER IF EXISTS "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r6.mo60782s0(r1)
            goto L_0x002e
        L_0x005d:
            return
        L_0x005e:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r0 = move-exception
            kotlin.p010io.C11133b.m42950a(r1, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.C20378b.m95141b(androidx.sqlite.db.f):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        kotlin.p010io.C11133b.m42950a(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        throw r0;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m95142c(@org.jetbrains.annotations.C12579k androidx.sqlite.p031db.C20466f r2, @org.jetbrains.annotations.C12579k java.lang.String r3) {
        /*
            java.lang.String r0 = "db"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "tableName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "PRAGMA foreign_key_check(`"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "`)"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            android.database.Cursor r2 = r2.mo60771h3(r3)
            int r3 = r2.getCount()     // Catch:{ all -> 0x003b }
            if (r3 > 0) goto L_0x0031
            kotlin.d2 r3 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x003b }
            r3 = 0
            kotlin.p010io.C11133b.m42950a(r2, r3)
            return
        L_0x0031:
            java.lang.String r3 = m95143d(r2)     // Catch:{ all -> 0x003b }
            android.database.sqlite.SQLiteConstraintException r0 = new android.database.sqlite.SQLiteConstraintException     // Catch:{ all -> 0x003b }
            r0.<init>(r3)     // Catch:{ all -> 0x003b }
            throw r0     // Catch:{ all -> 0x003b }
        L_0x003b:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            kotlin.p010io.C11133b.m42950a(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.C20378b.m95142c(androidx.sqlite.db.f, java.lang.String):void");
    }

    /* renamed from: d */
    public static final String m95143d(Cursor cursor) {
        StringBuilder sb = new StringBuilder();
        int count = cursor.getCount();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor.moveToNext()) {
            if (cursor.isFirst()) {
                sb.append("Foreign key violation(s) detected in '");
                sb.append(cursor.getString(0));
                sb.append("'.\n");
            }
            String string = cursor.getString(3);
            if (!linkedHashMap.containsKey(string)) {
                Intrinsics.checkNotNullExpressionValue(string, "constraintIndex");
                String string2 = cursor.getString(2);
                Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(2)");
                linkedHashMap.put(string, string2);
            }
        }
        sb.append("Number of different violations discovered: ");
        sb.append(linkedHashMap.keySet().size());
        sb.append("\n");
        sb.append("Number of rows in violation: ");
        sb.append(count);
        sb.append("\n");
        sb.append("Violation(s) detected in the following constraint(s):\n");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            sb.append("\tParent Table = ");
            sb.append((String) entry.getValue());
            sb.append(", Foreign Key Constraint Index = ");
            sb.append((String) entry.getKey());
            sb.append("\n");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @C11395k(message = "This is only used in the generated code and shouldn't be called directly.")
    @C12579k
    /* renamed from: e */
    public static final Cursor m95144e(@C12579k RoomDatabase roomDatabase, @C12579k C20489i iVar, boolean z) {
        Intrinsics.checkNotNullParameter(roomDatabase, "db");
        Intrinsics.checkNotNullParameter(iVar, "sqLiteQuery");
        return m95145f(roomDatabase, iVar, z, (CancellationSignal) null);
    }

    @C12579k
    /* renamed from: f */
    public static final Cursor m95145f(@C12579k RoomDatabase roomDatabase, @C12579k C20489i iVar, boolean z, @C12580l CancellationSignal cancellationSignal) {
        int i;
        Intrinsics.checkNotNullParameter(roomDatabase, "db");
        Intrinsics.checkNotNullParameter(iVar, "sqLiteQuery");
        Cursor I = roomDatabase.mo60896I(iVar, cancellationSignal);
        if (!z || !(I instanceof AbstractWindowedCursor)) {
            return I;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) I;
        int count = abstractWindowedCursor.getCount();
        if (abstractWindowedCursor.hasWindow()) {
            i = abstractWindowedCursor.getWindow().getNumRows();
        } else {
            i = count;
        }
        if (i < count) {
            return C20376a.m95133a(I);
        }
        return I;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        kotlin.p010io.C11133b.m42950a(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        throw r1;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m95146g(@org.jetbrains.annotations.C12579k java.io.File r8) throws java.io.IOException {
        /*
            java.lang.String r0 = "databaseFile"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r8)
            java.nio.channels.FileChannel r8 = r0.getChannel()
            r0 = 4
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r0)     // Catch:{ all -> 0x003b }
            r2 = 60
            r4 = 4
            r6 = 1
            r1 = r8
            r1.tryLock(r2, r4, r6)     // Catch:{ all -> 0x003b }
            r1 = 60
            r8.position(r1)     // Catch:{ all -> 0x003b }
            int r1 = r8.read(r7)     // Catch:{ all -> 0x003b }
            if (r1 != r0) goto L_0x0033
            r7.rewind()     // Catch:{ all -> 0x003b }
            int r0 = r7.getInt()     // Catch:{ all -> 0x003b }
            r1 = 0
            kotlin.p010io.C11133b.m42950a(r8, r1)
            return r0
        L_0x0033:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x003b }
            java.lang.String r1 = "Bad database header, unable to read 4 bytes at offset 60"
            r0.<init>(r1)     // Catch:{ all -> 0x003b }
            throw r0     // Catch:{ all -> 0x003b }
        L_0x003b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003d }
        L_0x003d:
            r1 = move-exception
            kotlin.p010io.C11133b.m42950a(r8, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.C20378b.m95146g(java.io.File):int");
    }
}
