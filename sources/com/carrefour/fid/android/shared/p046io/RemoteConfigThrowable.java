package com.carrefour.fid.android.shared.p046io;

import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/io/RemoteConfigThrowable;", "", "()V", "equals", "", "other", "", "hashCode", "", "shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.io.RemoteConfigThrowable */
public final class RemoteConfigThrowable extends Throwable {

    /* renamed from: a */
    public static final int f70557a = 0;

    public RemoteConfigThrowable() {
        super("Remote Config is not available");
    }

    public boolean equals(@C12580l Object obj) {
        return obj instanceof RemoteConfigThrowable;
    }

    public int hashCode() {
        return RemoteConfigThrowable.class.hashCode();
    }
}
