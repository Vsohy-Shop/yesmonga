package com.urbanairship;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.room.C20277a0;
import androidx.room.C20305f;
import androidx.room.C20340m0;
import androidx.room.C20351p;

@C20351p(tableName = "preferences")
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.r */
public class C36065r {
    @C20340m0
    @C0359n0
    @C20305f(name = "_id")

    /* renamed from: a */
    public String f89117a;
    @C20305f(name = "value")

    /* renamed from: b */
    public String f89118b;

    public C36065r(@C0359n0 String str, String str2) {
        this.f89117a = str;
        this.f89118b = str2;
    }

    @C20277a0
    /* renamed from: a */
    public String mo107831a() {
        return this.f89117a;
    }

    @C20277a0
    /* renamed from: b */
    public String mo107832b() {
        return this.f89118b;
    }
}
