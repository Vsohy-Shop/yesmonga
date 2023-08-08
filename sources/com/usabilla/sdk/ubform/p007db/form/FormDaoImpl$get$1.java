package com.usabilla.sdk.ubform.p007db.form;

import android.database.sqlite.SQLiteDatabase;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroid/database/sqlite/SQLiteDatabase;", "it", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
/* renamed from: com.usabilla.sdk.ubform.db.form.FormDaoImpl$get$1 */
public final class FormDaoImpl$get$1 extends Lambda implements C11300l<SQLiteDatabase, String> {
    final /* synthetic */ String $formId;
    final /* synthetic */ FormDaoImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FormDaoImpl$get$1(FormDaoImpl formDaoImpl, String str) {
        super(1);
        this.this$0 = formDaoImpl;
        this.$formId = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        kotlin.p010io.C11133b.m42950a(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        throw r1;
     */
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String invoke(@org.jetbrains.annotations.C12579k android.database.sqlite.SQLiteDatabase r4) {
        /*
            r3 = this;
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            com.usabilla.sdk.ubform.db.form.FormDaoImpl r4 = r3.this$0
            android.database.sqlite.SQLiteDatabase r4 = r4.f26818a
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = r3.$formId
            r0[r1] = r2
            java.lang.String r1 = "SELECT * FROM forms WHERE id = ?"
            android.database.Cursor r4 = r4.rawQuery(r1, r0)
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = "form"
            int r0 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x0038 }
            java.lang.String r1 = "it.getString(it.getColumnIndex(FormTable.COLUMN_FORM))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch:{ all -> 0x0038 }
            goto L_0x0031
        L_0x002f:
            java.lang.String r0 = ""
        L_0x0031:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0038 }
            r1 = 0
            kotlin.p010io.C11133b.m42950a(r4, r1)
            return r0
        L_0x0038:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003a }
        L_0x003a:
            r1 = move-exception
            kotlin.p010io.C11133b.m42950a(r4, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.p007db.form.FormDaoImpl$get$1.invoke(android.database.sqlite.SQLiteDatabase):java.lang.String");
    }
}
