package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.C20282b0;
import androidx.room.C20312g;
import androidx.room.C20352p0;
import androidx.work.C21091d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@C20312g
/* renamed from: androidx.work.impl.model.r */
public interface C21243r {
    @C20352p0("DELETE FROM WorkProgress")
    /* renamed from: a */
    void mo63448a();

    @C20352p0("DELETE from WorkProgress where work_spec_id=:workSpecId")
    /* renamed from: b */
    void mo63449b(@C12579k String str);

    @C12580l
    @C20352p0("SELECT progress FROM WorkProgress WHERE work_spec_id=:workSpecId")
    /* renamed from: c */
    C21091d mo63450c(@C12579k String str);

    @C20282b0(onConflict = 1)
    /* renamed from: d */
    void mo63451d(@C12579k C21242q qVar);
}
