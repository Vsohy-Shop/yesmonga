package com.usabilla.sdk.ubform.screenshot;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class UbScreenshotActivity$fileProviderPath$2 extends Lambda implements C11289a<String> {
    final /* synthetic */ UbScreenshotActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UbScreenshotActivity$fileProviderPath$2(UbScreenshotActivity ubScreenshotActivity) {
        super(0);
        this.this$0 = ubScreenshotActivity;
    }

    @C12579k
    public final String invoke() {
        return Intrinsics.stringPlus(this.this$0.getPackageName(), ".usabilla.fileprovider");
    }
}
