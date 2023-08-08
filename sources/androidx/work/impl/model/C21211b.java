package androidx.work.impl.model;

import androidx.room.C20282b0;
import androidx.room.C20312g;
import androidx.room.C20352p0;
import java.util.List;
import org.jetbrains.annotations.C12579k;

@C20312g
/* renamed from: androidx.work.impl.model.b */
public interface C21211b {
    @C20282b0(onConflict = 5)
    /* renamed from: a */
    void mo63389a(@C12579k C21207a aVar);

    @C12579k
    @C20352p0("SELECT work_spec_id FROM dependency WHERE prerequisite_id=:id")
    /* renamed from: b */
    List<String> mo63390b(@C12579k String str);

    @C20352p0("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=:id AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)")
    /* renamed from: c */
    boolean mo63391c(@C12579k String str);

    @C20352p0("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=:id")
    /* renamed from: d */
    boolean mo63392d(@C12579k String str);

    @C12579k
    @C20352p0("SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id")
    /* renamed from: e */
    List<String> mo63393e(@C12579k String str);
}
