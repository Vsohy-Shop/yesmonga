package com.carrefour.fid.android.shared.p046io;

import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/io/GazStationPostTicketThrowable;", "", "", "moreInformation", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.io.GazStationPostTicketThrowable */
public final class GazStationPostTicketThrowable extends Throwable {

    /* renamed from: a */
    public static final int f70483a = 0;
    @C12580l
    private final String moreInformation;

    public GazStationPostTicketThrowable() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    @C12580l
    /* renamed from: a */
    public final String mo83796a() {
        return this.moreInformation;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GazStationPostTicketThrowable(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public GazStationPostTicketThrowable(@C12580l String str) {
        super("Error when sending error to server maybe they have already received the ticket");
        this.moreInformation = str;
    }
}
