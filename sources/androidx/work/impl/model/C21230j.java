package androidx.work.impl.model;

import androidx.room.C20282b0;
import androidx.room.C20312g;
import androidx.room.C20352p0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C20312g
/* renamed from: androidx.work.impl.model.j */
public interface C21230j {

    /* renamed from: androidx.work.impl.model.j$a */
    public static final class C21231a {
        @C12580l
        /* renamed from: a */
        public static C21229i m98069a(@C12579k C21230j jVar, @C12579k C21237m mVar) {
            Intrinsics.checkNotNullParameter(mVar, "id");
            return jVar.mo63425b(mVar.mo63437f(), mVar.mo63435e());
        }

        /* renamed from: b */
        public static void m98070b(@C12579k C21230j jVar, @C12579k C21237m mVar) {
            Intrinsics.checkNotNullParameter(mVar, "id");
            jVar.mo63429f(mVar.mo63437f(), mVar.mo63435e());
        }
    }

    @C12580l
    /* renamed from: a */
    C21229i mo63424a(@C12579k C21237m mVar);

    @C12580l
    @C20352p0("SELECT * FROM SystemIdInfo WHERE work_spec_id=:workSpecId AND generation=:generation")
    /* renamed from: b */
    C21229i mo63425b(@C12579k String str, int i);

    /* renamed from: c */
    void mo63426c(@C12579k C21237m mVar);

    @C12579k
    @C20352p0("SELECT DISTINCT work_spec_id FROM SystemIdInfo")
    /* renamed from: d */
    List<String> mo63427d();

    @C20282b0(onConflict = 1)
    /* renamed from: e */
    void mo63428e(@C12579k C21229i iVar);

    @C20352p0("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId AND generation=:generation")
    /* renamed from: f */
    void mo63429f(@C12579k String str, int i);

    @C20352p0("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId")
    /* renamed from: g */
    void mo63430g(@C12579k String str);
}
