package com.chuckerteam.chucker.api;

import android.content.Context;
import com.chuckerteam.chucker.api.RetentionManager;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.chuckerteam.chucker.api.b */
public final class C22869b {

    /* renamed from: a */
    public boolean f58451a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public C22869b(@C12579k Context context) {
        this(context, false, (RetentionManager.Period) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: a */
    public final boolean mo67324a() {
        return this.f58451a;
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "This fun will be removed in 4.x release as part of Throwable functionality removal.", replaceWith = @C11587t0(expression = "", imports = {}))
    /* renamed from: b */
    public final void mo67325b(@C12580l Object obj, @C12580l Object obj2) {
    }

    /* renamed from: c */
    public final void mo67326c(boolean z) {
        this.f58451a = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public C22869b(@C12579k Context context, boolean z) {
        this(context, z, (RetentionManager.Period) null, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    @C11315i
    public C22869b(@C12579k Context context, boolean z, @C12579k RetentionManager.Period period) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(period, "retentionPeriod");
        this.f58451a = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22869b(Context context, boolean z, RetentionManager.Period period, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? true : z, (i & 4) != 0 ? RetentionManager.Period.ONE_WEEK : period);
    }
}
