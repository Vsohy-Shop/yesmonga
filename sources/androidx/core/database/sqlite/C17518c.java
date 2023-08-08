package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.core.database.sqlite.c */
public final class C17518c {
    /* renamed from: a */
    public static final <T> T m80293a(@C12579k SQLiteDatabase sQLiteDatabase, boolean z, @C12579k C11300l<? super SQLiteDatabase, ? extends T> lVar) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "body");
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T invoke = lVar.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return invoke;
        } finally {
            C11322b0.m43481d(1);
            sQLiteDatabase.endTransaction();
            C11322b0.m43480c(1);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ Object m80294b(SQLiteDatabase sQLiteDatabase, boolean z, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "body");
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            Object invoke = lVar.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return invoke;
        } finally {
            C11322b0.m43481d(1);
            sQLiteDatabase.endTransaction();
            C11322b0.m43480c(1);
        }
    }
}
