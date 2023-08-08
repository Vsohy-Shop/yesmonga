package com.urbanairship.automation.limits.storage;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.core.content.C17318d;
import androidx.room.C20316h;
import androidx.room.C20366s1;
import androidx.room.RoomDatabase;
import com.urbanairship.config.C9061a;
import java.io.File;

@C20316h(entities = {C8915a.class, C8922d.class}, version = 1)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class FrequencyLimitDatabase extends RoomDatabase {
    /* renamed from: Q */
    public static FrequencyLimitDatabase m33069Q(@C0359n0 Context context, @C0359n0 C9061a aVar) {
        return C20366s1.m95111a(context, FrequencyLimitDatabase.class, new File(C17318d.m79730m(context), aVar.mo17958a().f87128a + "_frequency_limits").getAbsolutePath()).mo60936p().mo60926f();
    }

    /* renamed from: R */
    public abstract C8916b mo17560R();
}
