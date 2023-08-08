package com.usabilla.sdk.ubform.screenshot.annotation;

import android.content.Context;
import android.view.View;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;

public interface UbAnnotationMenu<T> {

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/screenshot/annotation/UbAnnotationMenu$Position;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
    public enum Position {
        HOVER,
        BOTTOM,
        ABOVE_KEYBOARD
    }

    @C12579k
    /* renamed from: a */
    View mo20390a(@C12579k Context context);

    /* renamed from: b */
    void mo20391b(@C12579k C11300l<? super T, C11079d2> lVar);

    @C12579k
    /* renamed from: c */
    C11300l<T, C11079d2> mo20392c();

    @C12579k
    Position getPosition();
}
