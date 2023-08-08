package com.usabilla.sdk.ubform.utils.ext;

import android.database.sqlite.SQLiteDatabase;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;

public final class ExtensionDbKt {
    /* renamed from: a */
    public static final /* synthetic */ C11907e m38298a(SQLiteDatabase sQLiteDatabase, C11300l lVar) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "func");
        return C11909g.m47376J0(new ExtensionDbKt$inTransaction$1(sQLiteDatabase, lVar, (C11045c<? super ExtensionDbKt$inTransaction$1>) null));
    }
}
