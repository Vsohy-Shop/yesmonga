package androidx.core.database;

import android.database.Cursor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.core.database.a */
public final class C17508a {
    @C12580l
    /* renamed from: a */
    public static final byte[] m80276a(@C12579k Cursor cursor, int i) {
        Intrinsics.checkNotNullParameter(cursor, "<this>");
        if (cursor.isNull(i)) {
            return null;
        }
        return cursor.getBlob(i);
    }

    @C12580l
    /* renamed from: b */
    public static final Double m80277b(@C12579k Cursor cursor, int i) {
        Intrinsics.checkNotNullParameter(cursor, "<this>");
        if (cursor.isNull(i)) {
            return null;
        }
        return Double.valueOf(cursor.getDouble(i));
    }

    @C12580l
    /* renamed from: c */
    public static final Float m80278c(@C12579k Cursor cursor, int i) {
        Intrinsics.checkNotNullParameter(cursor, "<this>");
        if (cursor.isNull(i)) {
            return null;
        }
        return Float.valueOf(cursor.getFloat(i));
    }

    @C12580l
    /* renamed from: d */
    public static final Integer m80279d(@C12579k Cursor cursor, int i) {
        Intrinsics.checkNotNullParameter(cursor, "<this>");
        if (cursor.isNull(i)) {
            return null;
        }
        return Integer.valueOf(cursor.getInt(i));
    }

    @C12580l
    /* renamed from: e */
    public static final Long m80280e(@C12579k Cursor cursor, int i) {
        Intrinsics.checkNotNullParameter(cursor, "<this>");
        if (cursor.isNull(i)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i));
    }

    @C12580l
    /* renamed from: f */
    public static final Short m80281f(@C12579k Cursor cursor, int i) {
        Intrinsics.checkNotNullParameter(cursor, "<this>");
        if (cursor.isNull(i)) {
            return null;
        }
        return Short.valueOf(cursor.getShort(i));
    }

    @C12580l
    /* renamed from: g */
    public static final String m80282g(@C12579k Cursor cursor, int i) {
        Intrinsics.checkNotNullParameter(cursor, "<this>");
        if (cursor.isNull(i)) {
            return null;
        }
        return cursor.getString(i);
    }
}
