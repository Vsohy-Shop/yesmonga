package com.chuckerteam.chucker.api;

import android.content.Context;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class RetentionManager {

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, mo22516d2 = {"Lcom/chuckerteam/chucker/api/RetentionManager$Period;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "com.github.ChuckerTeam.Chucker.library-no-op"}, mo22517k = 1, mo22518mv = {1, 5, 1})
    public enum Period {
        ONE_HOUR,
        ONE_DAY,
        ONE_WEEK,
        FOREVER
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public RetentionManager(@C12579k Context context) {
        this(context, (Object) null, 2, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: a */
    public final synchronized void mo67322a() {
    }

    @C11315i
    public RetentionManager(@C12579k Context context, @C12580l Object obj) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RetentionManager(Context context, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : obj);
    }
}
