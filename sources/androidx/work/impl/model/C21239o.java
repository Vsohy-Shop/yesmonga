package androidx.work.impl.model;

import androidx.room.C20282b0;
import androidx.room.C20312g;
import androidx.room.C20352p0;
import java.util.List;
import org.jetbrains.annotations.C12579k;

@C20312g
/* renamed from: androidx.work.impl.model.o */
public interface C21239o {
    @C20282b0(onConflict = 5)
    /* renamed from: a */
    void mo63442a(@C12579k C21238n nVar);

    @C12579k
    @C20352p0("SELECT name FROM workname WHERE work_spec_id=:workSpecId")
    /* renamed from: b */
    List<String> mo63443b(@C12579k String str);

    @C12579k
    @C20352p0("SELECT work_spec_id FROM workname WHERE name=:name")
    /* renamed from: c */
    List<String> mo63444c(@C12579k String str);
}
