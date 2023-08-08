package androidx.work.impl;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.work.impl.z */
public final class C21369z {
    @C12579k

    /* renamed from: a */
    public static final String f55109a = "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ";
    @C12579k

    /* renamed from: b */
    public static final String f55110b = " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";

    /* renamed from: c */
    public static final long f55111c = TimeUnit.DAYS.toMillis(1);
}
