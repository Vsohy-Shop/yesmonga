package androidx.work.impl.model;

import androidx.room.C20282b0;
import androidx.room.C20312g;
import androidx.room.C20352p0;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C20312g
/* renamed from: androidx.work.impl.model.z */
public interface C21275z {

    /* renamed from: androidx.work.impl.model.z$a */
    public static final class C21276a {
        /* renamed from: a */
        public static void m98288a(@C12579k C21275z zVar, @C12579k String str, @C12579k Set<String> set) {
            Intrinsics.checkNotNullParameter(str, "id");
            Intrinsics.checkNotNullParameter(set, "tags");
            for (String yVar : set) {
                zVar.mo63385c(new C21274y(yVar, str));
            }
        }
    }

    @C12579k
    @C20352p0("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=:id")
    /* renamed from: a */
    List<String> mo63383a(@C12579k String str);

    @C20352p0("DELETE FROM worktag WHERE work_spec_id=:id")
    /* renamed from: b */
    void mo63384b(@C12579k String str);

    @C20282b0(onConflict = 5)
    /* renamed from: c */
    void mo63385c(@C12579k C21274y yVar);

    @C12579k
    @C20352p0("SELECT work_spec_id FROM worktag WHERE tag=:tag")
    /* renamed from: d */
    List<String> mo63386d(@C12579k String str);

    /* renamed from: e */
    void mo63387e(@C12579k String str, @C12579k Set<String> set);
}
