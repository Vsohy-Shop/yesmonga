package androidx.room;

import androidx.sqlite.p031db.C20466f;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/sqlite/db/f;", "db", "", "a", "(Landroidx/sqlite/db/f;)Ljava/lang/Object;"}, mo22517k = 3, mo22518mv = {1, 7, 1})
/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$2 */
public final class C20259xff8530fd extends Lambda implements C11300l<C20466f, Object> {
    final /* synthetic */ int $version;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20259xff8530fd(int i) {
        super(1);
        this.$version = i;
    }

    @C12580l
    /* renamed from: a */
    public final Object invoke(@C12579k C20466f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "db");
        fVar.mo60785u2(this.$version);
        return null;
    }
}
