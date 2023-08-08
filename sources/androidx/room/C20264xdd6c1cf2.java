package androidx.room;

import androidx.room.AutoClosingRoomOpenHelper;
import androidx.sqlite.p031db.C20466f;
import androidx.sqlite.p031db.C20492k;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"T", "Landroidx/sqlite/db/f;", "db", "a", "(Landroidx/sqlite/db/f;)Ljava/lang/Object;"}, mo22517k = 3, mo22518mv = {1, 7, 1})
/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeSqliteStatementWithRefCount$1 */
public final class C20264xdd6c1cf2 extends Lambda implements C11300l<C20466f, T> {
    final /* synthetic */ C11300l<C20492k, T> $block;
    final /* synthetic */ AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20264xdd6c1cf2(AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement autoClosingSupportSqliteStatement, C11300l<? super C20492k, ? extends T> lVar) {
        super(1);
        this.this$0 = autoClosingSupportSqliteStatement;
        this.$block = lVar;
    }

    /* renamed from: a */
    public final T invoke(@C12579k C20466f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "db");
        C20492k C2 = fVar.mo60750C2(this.this$0.f52230a);
        this.this$0.mo60792c(C2);
        return this.$block.invoke(C2);
    }
}
