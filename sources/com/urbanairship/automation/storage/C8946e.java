package com.urbanairship.automation.storage;

import androidx.annotation.RestrictTo;
import androidx.room.C20277a0;
import androidx.room.C20348o;
import androidx.room.C20350o1;
import java.util.List;
import kotlinx.serialization.json.internal.C12361b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.automation.storage.e */
public class C8946e {
    @C20348o

    /* renamed from: a */
    public C8954h f23968a;
    @C20350o1(entityColumn = "parentScheduleId", parentColumn = "scheduleId")

    /* renamed from: b */
    public List<C8956j> f23969b;

    public C8946e(C8954h hVar, List<C8956j> list) {
        this.f23968a = hVar;
        this.f23969b = list;
    }

    @C20277a0
    public String toString() {
        return "FullSchedule{schedule=" + this.f23968a + ", triggers=" + this.f23969b + C12361b.f30259j;
    }
}
