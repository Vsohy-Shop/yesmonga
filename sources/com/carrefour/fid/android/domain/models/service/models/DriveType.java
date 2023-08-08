package com.carrefour.fid.android.domain.models.service.models;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.collections.C10975r0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/service/models/DriveType;", "", "", "id", "I", "r", "()I", "<init>", "(Ljava/lang/String;II)V", "a", "c", "d", "e", "f", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDriveType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DriveType.kt\ncom/carrefour/fid/android/domain/models/service/models/DriveType\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,16:1\n8811#2,2:17\n9071#2,4:19\n*S KotlinDebug\n*F\n+ 1 DriveType.kt\ncom/carrefour/fid/android/domain/models/service/models/DriveType\n*L\n10#1:17,2\n10#1:19,4\n*E\n"})
public enum DriveType {
    DRIVE_PEDESTRIAN(294),
    DRIVE_LOCKER(308),
    DRIVE_IN_STORE(309),
    DRIVE_PARKING(310);
    
    @C12579k

    /* renamed from: a */
    public static final C38128a f96568a = null;
    @C12579k

    /* renamed from: b */
    public static final Map<Integer, DriveType> f96569b = null;

    /* renamed from: id */
    private final int f96575id;

    /* renamed from: com.carrefour.fid.android.domain.models.service.models.DriveType$a */
    public static final class C38128a {
        public /* synthetic */ C38128a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12580l
        /* renamed from: a */
        public final DriveType mo119106a(int i) {
            return (DriveType) DriveType.f96569b.get(Integer.valueOf(i));
        }

        public C38128a() {
        }
    }

    /* access modifiers changed from: public */
    static {
        int i;
        f96568a = new C38128a((DefaultConstructorMarker) null);
        DriveType[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C11479u.m44447u(C10975r0.m41400j(values.length), 16));
        for (DriveType driveType : values) {
            linkedHashMap.put(Integer.valueOf(driveType.f96575id), driveType);
        }
        f96569b = linkedHashMap;
    }

    /* access modifiers changed from: public */
    DriveType(int i) {
        this.f96575id = i;
    }

    /* renamed from: r */
    public final int mo119105r() {
        return this.f96575id;
    }
}
