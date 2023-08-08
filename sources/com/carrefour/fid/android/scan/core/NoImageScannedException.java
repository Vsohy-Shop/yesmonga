package com.carrefour.fid.android.scan.core;

import kotlin.C11076d0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/scan/core/NoImageScannedException;", "", "()V", "scan_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class NoImageScannedException extends Throwable {
    @C12579k

    /* renamed from: a */
    public static final NoImageScannedException f68397a = new NoImageScannedException();

    private NoImageScannedException() {
        super("Cannot process image, because the target image is null.");
    }
}
