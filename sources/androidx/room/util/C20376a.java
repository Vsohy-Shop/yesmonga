package androidx.room.util;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.os.Build;
import androidx.annotation.C0344h1;
import androidx.annotation.RestrictTo;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;

@C11314h(name = "CursorUtil")
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.room.util.a */
public final class C20376a {

    /* renamed from: androidx.room.util.a$a */
    public static final class C20377a extends CursorWrapper {

        /* renamed from: a */
        public final /* synthetic */ String[] f52555a;

        /* renamed from: b */
        public final /* synthetic */ int[] f52556b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20377a(Cursor cursor, String[] strArr, int[] iArr) {
            super(cursor);
            this.f52555a = strArr;
            this.f52556b = iArr;
        }

        public int getColumnIndex(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "columnName");
            String[] strArr = this.f52555a;
            int[] iArr = this.f52556b;
            int length = strArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                if (C11622t.equals(strArr[i], str, true)) {
                    return iArr[i2];
                }
                i++;
                i2 = i3;
            }
            return super.getColumnIndex(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0071, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0072, code lost:
        kotlin.p010io.C11133b.m42950a(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0075, code lost:
        throw r1;
     */
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.database.Cursor m95133a(@org.jetbrains.annotations.C12579k android.database.Cursor r7) {
        /*
            java.lang.String r0 = "c"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            android.database.MatrixCursor r0 = new android.database.MatrixCursor     // Catch:{ all -> 0x006f }
            java.lang.String[] r1 = r7.getColumnNames()     // Catch:{ all -> 0x006f }
            int r2 = r7.getCount()     // Catch:{ all -> 0x006f }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x006f }
        L_0x0012:
            boolean r1 = r7.moveToNext()     // Catch:{ all -> 0x006f }
            r2 = 0
            if (r1 == 0) goto L_0x006b
            int r1 = r7.getColumnCount()     // Catch:{ all -> 0x006f }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x006f }
            int r3 = r7.getColumnCount()     // Catch:{ all -> 0x006f }
            r4 = 0
        L_0x0024:
            if (r4 >= r3) goto L_0x0067
            int r5 = r7.getType(r4)     // Catch:{ all -> 0x006f }
            if (r5 == 0) goto L_0x0062
            r6 = 1
            if (r5 == r6) goto L_0x0057
            r6 = 2
            if (r5 == r6) goto L_0x004c
            r6 = 3
            if (r5 == r6) goto L_0x0045
            r6 = 4
            if (r5 != r6) goto L_0x003f
            byte[] r5 = r7.getBlob(r4)     // Catch:{ all -> 0x006f }
            r1[r4] = r5     // Catch:{ all -> 0x006f }
            goto L_0x0064
        L_0x003f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006f }
            r0.<init>()     // Catch:{ all -> 0x006f }
            throw r0     // Catch:{ all -> 0x006f }
        L_0x0045:
            java.lang.String r5 = r7.getString(r4)     // Catch:{ all -> 0x006f }
            r1[r4] = r5     // Catch:{ all -> 0x006f }
            goto L_0x0064
        L_0x004c:
            double r5 = r7.getDouble(r4)     // Catch:{ all -> 0x006f }
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ all -> 0x006f }
            r1[r4] = r5     // Catch:{ all -> 0x006f }
            goto L_0x0064
        L_0x0057:
            long r5 = r7.getLong(r4)     // Catch:{ all -> 0x006f }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x006f }
            r1[r4] = r5     // Catch:{ all -> 0x006f }
            goto L_0x0064
        L_0x0062:
            r1[r4] = r2     // Catch:{ all -> 0x006f }
        L_0x0064:
            int r4 = r4 + 1
            goto L_0x0024
        L_0x0067:
            r0.addRow(r1)     // Catch:{ all -> 0x006f }
            goto L_0x0012
        L_0x006b:
            kotlin.p010io.C11133b.m42950a(r7, r2)
            return r0
        L_0x006f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r1 = move-exception
            kotlin.p010io.C11133b.m42950a(r7, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.C20376a.m95133a(android.database.Cursor):android.database.Cursor");
    }

    /* renamed from: b */
    public static final int m95134b(Cursor cursor, String str) {
        boolean z;
        if (Build.VERSION.SDK_INT > 25) {
            return -1;
        }
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        Intrinsics.checkNotNullExpressionValue(columnNames, "columnNames");
        return m95135c(columnNames, str);
    }

    @C0344h1(otherwise = 2)
    /* renamed from: c */
    public static final int m95135c(@C12579k String[] strArr, @C12579k String str) {
        Intrinsics.checkNotNullParameter(strArr, "columnNames");
        Intrinsics.checkNotNullParameter(str, "name");
        String str2 = '.' + str;
        String str3 = '.' + str + '`';
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str4 = strArr[i];
            int i3 = i2 + 1;
            if (str4.length() >= str.length() + 2) {
                if (C11622t.endsWith$default(str4, str2, false, 2, (Object) null)) {
                    return i2;
                }
                if (str4.charAt(0) == '`' && C11622t.endsWith$default(str4, str3, false, 2, (Object) null)) {
                    return i2;
                }
            }
            i++;
            i2 = i3;
        }
        return -1;
    }

    /* renamed from: d */
    public static final int m95136d(@C12579k Cursor cursor, @C12579k String str) {
        Intrinsics.checkNotNullParameter(cursor, "c");
        Intrinsics.checkNotNullParameter(str, "name");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex('`' + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return m95134b(cursor, str);
    }

    /* renamed from: e */
    public static final int m95137e(@C12579k Cursor cursor, @C12579k String str) {
        String str2;
        Intrinsics.checkNotNullParameter(cursor, "c");
        Intrinsics.checkNotNullParameter(str, "name");
        int d = m95136d(cursor, str);
        if (d >= 0) {
            return d;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            Intrinsics.checkNotNullExpressionValue(columnNames, "c.columnNames");
            str2 = ArraysKt___ArraysKt.m39174Mh(columnNames, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 63, (Object) null);
        } catch (Exception unused) {
            str2 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        kotlin.jvm.internal.C11322b0.m43481d(1);
        kotlin.p010io.C11133b.m42950a(r2, r3);
        kotlin.jvm.internal.C11322b0.m43480c(1);
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R m95138f(@org.jetbrains.annotations.C12579k android.database.Cursor r2, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super android.database.Cursor, ? extends R> r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 1
            java.lang.Object r3 = r3.invoke(r2)     // Catch:{ all -> 0x001a }
            kotlin.jvm.internal.C11322b0.m43481d(r0)
            r1 = 0
            kotlin.p010io.C11133b.m42950a(r2, r1)
            kotlin.jvm.internal.C11322b0.m43480c(r0)
            return r3
        L_0x001a:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x001c }
        L_0x001c:
            r1 = move-exception
            kotlin.jvm.internal.C11322b0.m43481d(r0)
            kotlin.p010io.C11133b.m42950a(r2, r3)
            kotlin.jvm.internal.C11322b0.m43480c(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.C20376a.m95138f(android.database.Cursor, kotlin.jvm.functions.l):java.lang.Object");
    }

    @C12579k
    /* renamed from: g */
    public static final Cursor m95139g(@C12579k Cursor cursor, @C12579k String[] strArr, @C12579k int[] iArr) {
        boolean z;
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(strArr, "columnNames");
        Intrinsics.checkNotNullParameter(iArr, "mapping");
        if (strArr.length == iArr.length) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C20377a(cursor, strArr, iArr);
        }
        throw new IllegalStateException("Expected columnNames.length == mapping.length".toString());
    }
}
