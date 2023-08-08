package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.impl.constraints.C21138b;
import androidx.work.impl.utils.taskexecutor.C21345b;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.constraints.trackers.o */
public final class C21172o {
    @C12579k

    /* renamed from: a */
    public final C21164h<Boolean> f54623a;
    @C12579k

    /* renamed from: b */
    public final C21158c f54624b;
    @C12579k

    /* renamed from: c */
    public final C21164h<C21138b> f54625c;
    @C12579k

    /* renamed from: d */
    public final C21164h<Boolean> f54626d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public C21172o(@C12579k Context context, @C12579k C21345b bVar) {
        this(context, bVar, (C21164h) null, (C21158c) null, (C21164h) null, (C21164h) null, 60, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(bVar, "taskExecutor");
    }

    @C12579k
    /* renamed from: a */
    public final C21164h<Boolean> mo63328a() {
        return this.f54623a;
    }

    @C12579k
    /* renamed from: b */
    public final C21158c mo63329b() {
        return this.f54624b;
    }

    @C12579k
    /* renamed from: c */
    public final C21164h<C21138b> mo63330c() {
        return this.f54625c;
    }

    @C12579k
    /* renamed from: d */
    public final C21164h<Boolean> mo63331d() {
        return this.f54626d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public C21172o(@C12579k Context context, @C12579k C21345b bVar, @C12579k C21164h<Boolean> hVar) {
        this(context, bVar, hVar, (C21158c) null, (C21164h) null, (C21164h) null, 56, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(bVar, "taskExecutor");
        Intrinsics.checkNotNullParameter(hVar, "batteryChargingTracker");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public C21172o(@C12579k Context context, @C12579k C21345b bVar, @C12579k C21164h<Boolean> hVar, @C12579k C21158c cVar) {
        this(context, bVar, hVar, cVar, (C21164h) null, (C21164h) null, 48, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(bVar, "taskExecutor");
        Intrinsics.checkNotNullParameter(hVar, "batteryChargingTracker");
        Intrinsics.checkNotNullParameter(cVar, "batteryNotLowTracker");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public C21172o(@C12579k Context context, @C12579k C21345b bVar, @C12579k C21164h<Boolean> hVar, @C12579k C21158c cVar, @C12579k C21164h<C21138b> hVar2) {
        this(context, bVar, hVar, cVar, hVar2, (C21164h) null, 32, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(bVar, "taskExecutor");
        Intrinsics.checkNotNullParameter(hVar, "batteryChargingTracker");
        Intrinsics.checkNotNullParameter(cVar, "batteryNotLowTracker");
        Intrinsics.checkNotNullParameter(hVar2, "networkStateTracker");
    }

    @C11315i
    public C21172o(@C12579k Context context, @C12579k C21345b bVar, @C12579k C21164h<Boolean> hVar, @C12579k C21158c cVar, @C12579k C21164h<C21138b> hVar2, @C12579k C21164h<Boolean> hVar3) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(bVar, "taskExecutor");
        Intrinsics.checkNotNullParameter(hVar, "batteryChargingTracker");
        Intrinsics.checkNotNullParameter(cVar, "batteryNotLowTracker");
        Intrinsics.checkNotNullParameter(hVar2, "networkStateTracker");
        Intrinsics.checkNotNullParameter(hVar3, "storageNotLowTracker");
        this.f54623a = hVar;
        this.f54624b = cVar;
        this.f54625c = hVar2;
        this.f54626d = hVar3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C21172o(android.content.Context r8, androidx.work.impl.utils.taskexecutor.C21345b r9, androidx.work.impl.constraints.trackers.C21164h r10, androidx.work.impl.constraints.trackers.C21158c r11, androidx.work.impl.constraints.trackers.C21164h r12, androidx.work.impl.constraints.trackers.C21164h r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r0 = r14 & 4
            java.lang.String r1 = "context.applicationContext"
            if (r0 == 0) goto L_0x0014
            androidx.work.impl.constraints.trackers.a r0 = new androidx.work.impl.constraints.trackers.a
            android.content.Context r3 = r8.getApplicationContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            r0.<init>(r3, r9)
            r3 = r0
            goto L_0x0015
        L_0x0014:
            r3 = r10
        L_0x0015:
            r0 = r14 & 8
            if (r0 == 0) goto L_0x0027
            androidx.work.impl.constraints.trackers.c r0 = new androidx.work.impl.constraints.trackers.c
            android.content.Context r4 = r8.getApplicationContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            r0.<init>(r4, r9)
            r4 = r0
            goto L_0x0028
        L_0x0027:
            r4 = r11
        L_0x0028:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x0039
            android.content.Context r0 = r8.getApplicationContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            androidx.work.impl.constraints.trackers.h r0 = androidx.work.impl.constraints.trackers.C21168k.m97877a(r0, r9)
            r5 = r0
            goto L_0x003a
        L_0x0039:
            r5 = r12
        L_0x003a:
            r0 = r14 & 32
            if (r0 == 0) goto L_0x004c
            androidx.work.impl.constraints.trackers.m r0 = new androidx.work.impl.constraints.trackers.m
            android.content.Context r6 = r8.getApplicationContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
            r0.<init>(r6, r9)
            r6 = r0
            goto L_0x004d
        L_0x004c:
            r6 = r13
        L_0x004d:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.constraints.trackers.C21172o.<init>(android.content.Context, androidx.work.impl.utils.taskexecutor.b, androidx.work.impl.constraints.trackers.h, androidx.work.impl.constraints.trackers.c, androidx.work.impl.constraints.trackers.h, androidx.work.impl.constraints.trackers.h, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
