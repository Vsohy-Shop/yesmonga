package com.usabilla.sdk.ubform.telemetry;

import com.usabilla.sdk.ubform.AppInfo;
import com.usabilla.sdk.ubform.telemetry.C10096b;
import java.io.Serializable;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.json.JSONObject;

/* renamed from: com.usabilla.sdk.ubform.telemetry.e */
public interface C10110e {
    /* renamed from: a */
    <T> T mo21539a(@C12579k TelemetryOption telemetryOption, @C12579k C11300l<? super C10110e, ? extends T> lVar);

    @C12579k
    /* renamed from: b */
    <T extends Serializable> C10110e mo21540b(@C12579k C10096b.C10101b<T> bVar);

    /* renamed from: c */
    void mo21541c(@C12579k AppInfo appInfo);

    /* renamed from: d */
    <T> T mo21542d(@C12579k TelemetryOption telemetryOption, @C12579k C11300l<? super C10110e, ? extends T> lVar);

    @C12579k
    /* renamed from: e */
    JSONObject mo21543e();

    /* renamed from: f */
    void mo21544f(int i);

    void stop();
}
