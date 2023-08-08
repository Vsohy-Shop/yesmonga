package androidx.work.impl.model;

import androidx.lifecycle.LiveData;
import androidx.room.C20282b0;
import androidx.room.C20312g;
import androidx.room.C20352p0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C20312g
/* renamed from: androidx.work.impl.model.e */
public interface C21222e {
    @C12579k
    @C20352p0("SELECT long_value FROM Preference where `key`=:key")
    /* renamed from: a */
    LiveData<Long> mo63403a(@C12579k String str);

    @C20282b0(onConflict = 1)
    /* renamed from: b */
    void mo63404b(@C12579k C21221d dVar);

    @C12580l
    @C20352p0("SELECT long_value FROM Preference where `key`=:key")
    /* renamed from: c */
    Long mo63405c(@C12579k String str);
}
