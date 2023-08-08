package com.urbanairship.android.layout;

import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, mo22516d2 = {"Lcom/urbanairship/android/layout/ModelFactoryException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "urbanairship-layout_release"}, mo22517k = 1, mo22518mv = {1, 7, 1}, mo22520xi = 48)
public final class ModelFactoryException extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModelFactoryException(@C12579k String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "message");
    }
}
