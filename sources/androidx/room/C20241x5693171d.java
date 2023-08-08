package androidx.room;

import androidx.sqlite.p031db.C20466f;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 7, 1}, mo22520xi = 48)
/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1 */
public /* synthetic */ class C20241x5693171d extends FunctionReferenceImpl implements C11300l<C20466f, Boolean> {

    /* renamed from: a */
    public static final C20241x5693171d f52236a = new C20241x5693171d();

    public C20241x5693171d() {
        super(1, C20466f.class, "inTransaction", "inTransaction()Z", 0);
    }

    @C12579k
    /* renamed from: d */
    public final Boolean invoke(@C12579k C20466f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "p0");
        return Boolean.valueOf(fVar.mo60748A3());
    }
}
