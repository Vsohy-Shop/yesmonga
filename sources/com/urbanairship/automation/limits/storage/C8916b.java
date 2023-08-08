package com.urbanairship.automation.limits.storage;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.room.C20282b0;
import androidx.room.C20293d2;
import androidx.room.C20312g;
import androidx.room.C20323i2;
import androidx.room.C20334l;
import androidx.room.C20352p0;
import java.util.Collection;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@C20312g
/* renamed from: com.urbanairship.automation.limits.storage.b */
public interface C8916b {
    @C20323i2
    /* renamed from: a */
    void mo17574a(@C0359n0 C8915a aVar);

    @C20282b0(onConflict = 5)
    /* renamed from: b */
    void mo17575b(@C0359n0 C8915a aVar);

    @C20334l
    @C20293d2
    /* renamed from: c */
    void mo17576c(C8915a aVar);

    @C20293d2
    @C20352p0("DELETE FROM constraints WHERE (constraintId IN (:constraintIds))")
    /* renamed from: d */
    void mo17577d(Collection<String> collection);

    @C20352p0("SELECT * FROM constraints")
    /* renamed from: e */
    List<C8915a> mo17578e();

    @C20352p0("SELECT * FROM occurrences WHERE parentConstraintId = :constraintId ORDER BY timeStamp ASC")
    /* renamed from: f */
    List<C8922d> mo17579f(String str);

    @C20282b0(onConflict = 1)
    /* renamed from: g */
    void mo17580g(@C0359n0 C8922d dVar);

    @C20352p0("SELECT * FROM constraints WHERE (constraintId IN (:constraintIds))")
    /* renamed from: h */
    List<C8915a> mo17581h(Collection<String> collection);
}
