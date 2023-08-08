package androidx.room;

import androidx.sqlite.p031db.C20466f;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 7, 1}, mo22520xi = 48)
/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$1 */
public /* synthetic */ class C20260x2da6dfee extends FunctionReferenceImpl implements C11300l<C20466f, Boolean> {

    /* renamed from: a */
    public static final C20260x2da6dfee f52246a = new C20260x2da6dfee();

    public C20260x2da6dfee() {
        super(1, C20466f.class, "yieldIfContendedSafely", "yieldIfContendedSafely()Z", 0);
    }

    @C12579k
    /* renamed from: d */
    public final Boolean invoke(@C12579k C20466f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "p0");
        return Boolean.valueOf(fVar.mo60765e3());
    }
}
