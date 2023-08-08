package com.carrefour.fid.android.shared.p046io;

import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/io/GazStationResponseThrowable;", "", "", "errorCode", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "moreInformation", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.io.GazStationResponseThrowable */
public final class GazStationResponseThrowable extends Throwable {

    /* renamed from: a */
    public static final int f70484a = 0;
    @C12580l
    private final String errorCode;

    public GazStationResponseThrowable() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    @C12580l
    /* renamed from: a */
    public final String mo83797a() {
        return this.errorCode;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GazStationResponseThrowable(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public GazStationResponseThrowable(@C12580l String str, @C12580l String str2) {
        super(str2);
        this.errorCode = str;
    }
}
