package com.usabilla.sdk.ubform.p007db.form;

import android.database.sqlite.SQLiteDatabase;
import com.usabilla.sdk.ubform.utils.ext.ExtensionDbKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.usabilla.sdk.ubform.db.form.FormDaoImpl */
public final class FormDaoImpl implements C9781a {
    @C12579k

    /* renamed from: a */
    public final SQLiteDatabase f26818a;

    public FormDaoImpl(@C12579k SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "db");
        this.f26818a = sQLiteDatabase;
    }

    @C12579k
    /* renamed from: a */
    public C11907e<Integer> mo20039a() {
        return ExtensionDbKt.m38298a(this.f26818a, FormDaoImpl$deleteAll$1.f26819f);
    }

    @C12579k
    /* renamed from: b */
    public C11907e<Integer> mo20040b(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "formId");
        Intrinsics.checkNotNullParameter(str2, "formStructure");
        return ExtensionDbKt.m38298a(this.f26818a, new FormDaoImpl$replace$1(str, str2));
    }

    @C12579k
    public C11907e<String> get(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "formId");
        return ExtensionDbKt.m38298a(this.f26818a, new FormDaoImpl$get$1(this, str));
    }
}
