package androidx.room;

import androidx.sqlite.p031db.C20466f;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/sqlite/db/f;", "db", "", "a", "(Landroidx/sqlite/db/f;)Ljava/lang/Long;"}, mo22517k = 3, mo22518mv = {1, 7, 1})
/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setMaximumSize$1 */
public final class C20256xd48b87d5 extends Lambda implements C11300l<C20466f, Long> {
    final /* synthetic */ long $numBytes;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20256xd48b87d5(long j) {
        super(1);
        this.$numBytes = j;
    }

    @C12579k
    /* renamed from: a */
    public final Long invoke(@C12579k C20466f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "db");
        return Long.valueOf(fVar.mo60773i1(this.$numBytes));
    }
}
