package com.urbanairship;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.room.C20282b0;
import androidx.room.C20293d2;
import androidx.room.C20312g;
import androidx.room.C20352p0;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@C20312g
/* renamed from: com.urbanairship.s */
public abstract class C36066s {
    @C20352p0("DELETE FROM preferences WHERE (`_id` == :key)")
    /* renamed from: a */
    public abstract void mo107833a(@C0359n0 String str);

    @C20352p0("DELETE FROM preferences")
    /* renamed from: b */
    public abstract void mo107834b();

    @C20293d2
    @C20352p0("SELECT * FROM preferences")
    @C0359n0
    /* renamed from: c */
    public abstract List<C36065r> mo107835c();

    @C20293d2
    @C20352p0("SELECT _id FROM preferences")
    @C0359n0
    /* renamed from: d */
    public abstract List<String> mo107836d();

    @C20293d2
    @C20352p0("SELECT * FROM preferences WHERE (`_id` == :key)")
    @C0359n0
    /* renamed from: e */
    public abstract C36065r mo107837e(@C0359n0 String str);

    @C20282b0(onConflict = 1)
    @C20293d2
    /* renamed from: f */
    public abstract void mo107838f(@C0359n0 C36065r rVar);
}
