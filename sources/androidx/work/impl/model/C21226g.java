package androidx.work.impl.model;

import androidx.lifecycle.LiveData;
import androidx.room.C20312g;
import androidx.room.C20347n1;
import androidx.sqlite.p031db.C20489i;
import androidx.work.impl.model.C21249u;
import java.util.List;
import org.jetbrains.annotations.C12579k;

@C20312g
/* renamed from: androidx.work.impl.model.g */
public interface C21226g {
    @C20347n1(observedEntities = {C21249u.class})
    @C12579k
    /* renamed from: a */
    List<C21249u.C21252c> mo63410a(@C12579k C20489i iVar);

    @C20347n1(observedEntities = {C21249u.class})
    @C12579k
    /* renamed from: b */
    LiveData<List<C21249u.C21252c>> mo63411b(@C12579k C20489i iVar);
}
