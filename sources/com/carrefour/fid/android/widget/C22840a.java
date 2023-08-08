package com.carrefour.fid.android.widget;

import android.hardware.Camera;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.widget.a */
public final class C22840a {
    /* renamed from: a */
    public static final void m103116a(@C12579k Camera camera) {
        Intrinsics.checkNotNullParameter(camera, "<this>");
        Camera.Parameters parameters = camera.getParameters();
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes.contains("continuous-picture")) {
            parameters.setFocusMode("continuous-picture");
        } else if (supportedFocusModes.contains("auto")) {
            parameters.setFocusMode("auto");
        }
        camera.setParameters(parameters);
    }
}
