package com.usabilla.sdk.ubform.screenshot;

import android.os.Environment;
import java.io.File;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, mo22516d2 = {"Ljava/io/File;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class UbScreenshotActivity$tempCameraFile$2 extends Lambda implements C11289a<File> {
    final /* synthetic */ UbScreenshotActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UbScreenshotActivity$tempCameraFile$2(UbScreenshotActivity ubScreenshotActivity) {
        super(0);
        this.this$0 = ubScreenshotActivity;
    }

    @C12580l
    /* renamed from: a */
    public final File invoke() {
        File externalFilesDir = this.this$0.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (externalFilesDir == null) {
            return null;
        }
        UbScreenshotActivity ubScreenshotActivity = this.this$0;
        return File.createTempFile(ubScreenshotActivity.f27101W0, ubScreenshotActivity.f27102X0, externalFilesDir);
    }
}
