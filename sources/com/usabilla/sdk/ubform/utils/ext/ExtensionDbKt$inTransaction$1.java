package com.usabilla.sdk.ubform.utils.ext;

import android.database.sqlite.SQLiteDatabase;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.usabilla.sdk.ubform.utils.ext.ExtensionDbKt$inTransaction$1", mo22502f = "ExtensionDb.kt", mo22503i = {}, mo22504l = {16, 16}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, mo22516d2 = {"T", "Lkotlinx/coroutines/flow/f;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class ExtensionDbKt$inTransaction$1 extends SuspendLambda implements C11304p<C11908f<Object>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11300l<SQLiteDatabase, Object> $func;
    final /* synthetic */ SQLiteDatabase $this_inTransaction;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExtensionDbKt$inTransaction$1(SQLiteDatabase sQLiteDatabase, C11300l<? super SQLiteDatabase, Object> lVar, C11045c<? super ExtensionDbKt$inTransaction$1> cVar) {
        super(2, cVar);
        this.$this_inTransaction = sQLiteDatabase;
        this.$func = lVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ExtensionDbKt$inTransaction$1 extensionDbKt$inTransaction$1 = new ExtensionDbKt$inTransaction$1(this.$this_inTransaction, this.$func, cVar);
        extensionDbKt$inTransaction$1.L$0 = obj;
        return extensionDbKt$inTransaction$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11908f<Object> fVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ExtensionDbKt$inTransaction$1) create(fVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Throwable th;
        Throwable th2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11908f fVar = (C11908f) this.L$0;
            this.$this_inTransaction.beginTransaction();
            Object obj2 = null;
            try {
                obj2 = this.$func.invoke(this.$this_inTransaction);
                this.$this_inTransaction.setTransactionSuccessful();
                this.$this_inTransaction.endTransaction();
                if (obj2 != null) {
                    this.label = 1;
                    if (fVar.emit(obj2, this) == h) {
                        return h;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                this.$this_inTransaction.endTransaction();
                if (obj2 != null) {
                    this.L$0 = th;
                    this.label = 2;
                    if (fVar.emit(obj2, this) == h) {
                        return h;
                    }
                    th2 = th;
                }
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else if (i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            th2 = (Throwable) this.L$0;
            C11661u0.m45747n(obj);
            th = th2;
            throw th;
        }
        return C11079d2.f28267a;
    }
}
