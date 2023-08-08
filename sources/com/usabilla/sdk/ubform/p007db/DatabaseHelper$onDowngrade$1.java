package com.usabilla.sdk.ubform.p007db;

import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.usabilla.sdk.ubform.db.DatabaseHelper$onDowngrade$1", mo22502f = "DatabaseHelper.kt", mo22503i = {0}, mo22504l = {56}, mo22505m = "invokeSuspend", mo22506n = {"it"}, mo22507s = {"L$0"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
/* renamed from: com.usabilla.sdk.ubform.db.DatabaseHelper$onDowngrade$1 */
public final class DatabaseHelper$onDowngrade$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ SQLiteDatabase $db;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DatabaseHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatabaseHelper$onDowngrade$1(SQLiteDatabase sQLiteDatabase, DatabaseHelper databaseHelper, C11045c<? super DatabaseHelper$onDowngrade$1> cVar) {
        super(2, cVar);
        this.$db = sQLiteDatabase;
        this.this$0 = databaseHelper;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new DatabaseHelper$onDowngrade$1(this.$db, this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        SQLiteDatabase sQLiteDatabase;
        Iterator it;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            SQLiteDatabase sQLiteDatabase2 = this.$db;
            if (sQLiteDatabase2 != null) {
                it = this.this$0.f26791a.iterator();
                sQLiteDatabase = sQLiteDatabase2;
            }
            return C11079d2.f28267a;
        } else if (i == 1) {
            it = (Iterator) this.L$1;
            sQLiteDatabase = (SQLiteDatabase) this.L$0;
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (it.hasNext()) {
            C11907e<C11079d2> f = ((C9773a) it.next()).mo20017f(sQLiteDatabase);
            this.L$0 = sQLiteDatabase;
            this.L$1 = it;
            this.label = 1;
            if (C11909g.m47503x(f, this) == h) {
                return h;
            }
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((DatabaseHelper$onDowngrade$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
