package com.usabilla.sdk.ubform.p007db.unsent;

import android.database.sqlite.SQLiteDatabase;
import com.usabilla.sdk.ubform.net.C9851c;
import com.usabilla.sdk.ubform.utils.ext.ExtensionDbKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.usabilla.sdk.ubform.db.unsent.UnsentFeedbackDaoImpl */
public final class UnsentFeedbackDaoImpl implements C9785a {
    @C12579k

    /* renamed from: a */
    public final SQLiteDatabase f26839a;

    public UnsentFeedbackDaoImpl(@C12579k SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "db");
        this.f26839a = sQLiteDatabase;
    }

    @C12579k
    /* renamed from: a */
    public C11907e<Integer> mo20061a(@C12579k C9851c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "feedbackItem");
        return ExtensionDbKt.m38298a(this.f26839a, new UnsentFeedbackDaoImpl$insert$1(cVar));
    }

    @C12579k
    /* renamed from: b */
    public C11907e<List<C9851c>> mo20062b() {
        return ExtensionDbKt.m38298a(this.f26839a, UnsentFeedbackDaoImpl$getAll$1.f26840f);
    }

    @C12579k
    /* renamed from: c */
    public C11907e<Integer> mo20063c(@C12579k List<C9851c> list) {
        Intrinsics.checkNotNullParameter(list, "listFeedback");
        return ExtensionDbKt.m38298a(this.f26839a, new UnsentFeedbackDaoImpl$delete$1(list, this));
    }
}
