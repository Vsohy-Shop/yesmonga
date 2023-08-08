package com.usabilla.sdk.ubform.screenshot.annotation;

import android.content.Context;
import android.view.View;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.usabilla.sdk.ubform.screenshot.annotation.d */
public interface C9893d<EVENT> {
    @C12579k
    /* renamed from: a */
    UbAnnotationMenu<EVENT> mo20454a();

    @C12579k
    /* renamed from: b */
    UbAnnotationFlowCommand mo20455b();

    /* renamed from: c */
    void mo20456c(@C12579k C11300l<? super Boolean, C11079d2> lVar);

    @C12580l
    /* renamed from: d */
    UbDraft mo20457d();

    /* renamed from: f */
    void mo20458f();

    @C12579k
    /* renamed from: g */
    View mo20459g(@C12579k Context context);

    int getIcon();

    @C12580l
    View getView();

    /* renamed from: h */
    void mo20462h();

    @C12579k
    /* renamed from: i */
    C11300l<Boolean, C11079d2> mo20463i();

    /* renamed from: k */
    void mo20464k();
}
