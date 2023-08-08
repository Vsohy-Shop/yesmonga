package com.usabilla.sdk.ubform.telemetry;

import com.carrefour.fid.android.shared.constant.C28534f;
import com.usabilla.sdk.ubform.AppInfo;
import com.usabilla.sdk.ubform.C9742a;
import com.usabilla.sdk.ubform.p007db.telemetry.TelemetryTable;
import com.usabilla.sdk.ubform.telemetry.C10096b;
import com.usabilla.sdk.ubform.utils.C10113b;
import com.usabilla.sdk.ubform.utils.ext.ExtensionJsonKt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.json.JSONObject;
import p073j$.time.ZoneOffset;

@C11076d0(mo22515d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B:\u0012\u0006\u0010\u001d\u001a\u00020\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u0016\u0012!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0004\b%\u0010&J1\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\t\u0010\bJ\b\u0010\u000b\u001a\u00020\nH\u0016J \u0010\u000f\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0003H\u0002R\u0014\u0010\u001d\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR/\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\n0\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010#¨\u0006'"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/telemetry/UbTelemetryRecorder;", "Lcom/usabilla/sdk/ubform/telemetry/e;", "T", "Lcom/usabilla/sdk/ubform/telemetry/TelemetryOption;", "recordingOption", "Lkotlin/Function1;", "block", "d", "(Lcom/usabilla/sdk/ubform/telemetry/TelemetryOption;Lkotlin/jvm/functions/l;)Ljava/lang/Object;", "a", "Lkotlin/d2;", "stop", "Ljava/io/Serializable;", "Lcom/usabilla/sdk/ubform/telemetry/b$b;", "data", "b", "", "newServerOption", "f", "Lcom/usabilla/sdk/ubform/AppInfo;", "appInfo", "c", "Lorg/json/JSONObject;", "e", "g", "desiredOption", "", "h", "I", "serverOptions", "Lorg/json/JSONObject;", "log", "Lkotlin/n0;", "name", "recorder", "Lkotlin/jvm/functions/l;", "callback", "<init>", "(ILorg/json/JSONObject;Lkotlin/jvm/functions/l;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class UbTelemetryRecorder implements C10110e {

    /* renamed from: a */
    public final int f27768a;
    @C12579k

    /* renamed from: b */
    public final JSONObject f27769b;
    @C12579k

    /* renamed from: c */
    public final C11300l<C10110e, C11079d2> f27770c;

    public UbTelemetryRecorder(int i, @C12579k JSONObject jSONObject, @C12579k C11300l<? super C10110e, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(jSONObject, TelemetryTable.f26835g);
        Intrinsics.checkNotNullParameter(lVar, C10108c.f27778C);
        this.f27768a = i;
        this.f27769b = jSONObject;
        this.f27770c = lVar;
    }

    /* renamed from: a */
    public <T> T mo21539a(@C12579k TelemetryOption telemetryOption, @C12579k C11300l<? super C10110e, ? extends T> lVar) {
        Intrinsics.checkNotNullParameter(telemetryOption, "recordingOption");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        T d = mo21542d(telemetryOption, lVar);
        stop();
        return d;
    }

    @C12579k
    /* renamed from: b */
    public <T extends Serializable> C10110e mo21540b(@C12579k C10096b.C10101b<T> bVar) {
        boolean z;
        String str;
        Intrinsics.checkNotNullParameter(bVar, "data");
        if (mo21546h(bVar.mo21551b())) {
            if (bVar instanceof C10096b.C10101b.C10105d) {
                z = true;
            } else {
                z = bVar instanceof C10096b.C10101b.C10107f;
            }
            if (z) {
                str = "a";
            } else if (bVar instanceof C10096b.C10101b.C10106e) {
                str = "n";
            } else if (bVar instanceof C10096b.C10101b.C10102a) {
                str = "d";
            } else if (bVar instanceof C10096b.C10101b.C10104c) {
                str = "m";
            } else if (bVar instanceof C10096b.C10101b.C10103b) {
                str = "i";
            } else {
                throw new NoWhenBranchMatchedException();
            }
            JSONObject a = ExtensionJsonKt.m38312a(this.f27769b, str);
            if (a == null) {
                a = new JSONObject();
            }
            this.f27769b.put(str, a.put(bVar.mo21550a(), bVar.mo21552c()));
        }
        return this;
    }

    /* renamed from: c */
    public void mo21541c(@C12579k AppInfo appInfo) {
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        mo21540b(new C10096b.C10101b.C10103b(C10108c.f27815r, appInfo.mo19778w()));
        mo21540b(new C10096b.C10101b.C10103b(C10108c.f27814q, appInfo.mo19777v()));
        mo21540b(new C10096b.C10101b.C10103b(C10108c.f27817t, Boolean.valueOf(appInfo.mo19776u())));
        mo21540b(new C10096b.C10101b.C10103b("device", appInfo.mo19782z()));
        mo21540b(new C10096b.C10101b.C10103b(C10108c.f27818u, appInfo.mo19746D()));
        mo21540b(new C10096b.C10101b.C10103b(C10108c.f27819v, Boolean.valueOf(appInfo.mo19747E())));
        mo21540b(new C10096b.C10101b.C10103b("screen", appInfo.mo19748F()));
        mo21540b(new C10096b.C10101b.C10103b(C10108c.f27821x, appInfo.mo19749G()));
        mo21540b(new C10096b.C10101b.C10103b(C10108c.f27822y, appInfo.mo19750H()));
        mo21540b(new C10096b.C10101b.C10103b(C10108c.f27823z, Long.valueOf(appInfo.mo19751I())));
        mo21540b(new C10096b.C10101b.C10103b(C10108c.f27776A, Long.valueOf(appInfo.mo19752J())));
        mo21540b(new C10096b.C10101b.C10104c(C10108c.f27810m, Long.valueOf(appInfo.mo19743A())));
        mo21540b(new C10096b.C10101b.C10104c(C10108c.f27811n, Long.valueOf(appInfo.mo19744B())));
        mo21540b(new C10096b.C10101b.C10104c(C10108c.f27812o, appInfo.mo19745C()));
        mo21540b(new C10096b.C10101b.C10104c(C10108c.f27813p, appInfo.mo19781y()));
    }

    /* renamed from: d */
    public <T> T mo21542d(@C12579k TelemetryOption telemetryOption, @C12579k C11300l<? super C10110e, ? extends T> lVar) {
        Intrinsics.checkNotNullParameter(telemetryOption, "recordingOption");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        mo21545g(telemetryOption);
        return lVar.invoke(this);
    }

    @C12579k
    /* renamed from: e */
    public JSONObject mo21543e() {
        return this.f27769b;
    }

    /* renamed from: f */
    public void mo21544f(int i) {
        TelemetryOption telemetryOption = TelemetryOption.METHOD;
        if ((telemetryOption.mo21522q() & i) != telemetryOption.mo21522q()) {
            TelemetryOption telemetryOption2 = TelemetryOption.PROPERTY;
            if ((telemetryOption2.mo21522q() & i) != telemetryOption2.mo21522q()) {
                this.f27769b.remove("a");
            }
        }
        TelemetryOption telemetryOption3 = TelemetryOption.NETWORK;
        if ((telemetryOption3.mo21522q() & i) != telemetryOption3.mo21522q()) {
            this.f27769b.remove("n");
        }
        TelemetryOption telemetryOption4 = TelemetryOption.MEMORY;
        if ((i & telemetryOption4.mo21522q()) != telemetryOption4.mo21522q()) {
            this.f27769b.remove("d");
        }
    }

    /* renamed from: g */
    public final void mo21545g(TelemetryOption telemetryOption) {
        StackTraceElement stackTraceElement;
        String className;
        if (mo21546h(telemetryOption)) {
            long currentTimeMillis = System.currentTimeMillis();
            String b = C10113b.m38276b(currentTimeMillis, (ZoneOffset) null, 2, (Object) null);
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement2 : stackTrace) {
                String className2 = stackTraceElement2.getClassName();
                Intrinsics.checkNotNullExpressionValue(className2, "it.className");
                if (!StringsKt__StringsKt.contains$default((CharSequence) className2, (CharSequence) C9742a.f26711b, false, 2, (Object) null)) {
                    arrayList.add(stackTraceElement2);
                }
            }
            String className3 = ((StackTraceElement) CollectionsKt___CollectionsKt.m40706w2(arrayList)).getClassName();
            int length = stackTrace.length;
            do {
                length--;
                if (length >= 0) {
                    stackTraceElement = stackTrace[length];
                    className = stackTraceElement.getClassName();
                    Intrinsics.checkNotNullExpressionValue(className, "it.className");
                } else {
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            } while (!StringsKt__StringsKt.contains$default((CharSequence) className, (CharSequence) C9742a.f26711b, false, 2, (Object) null));
            String methodName = stackTraceElement.getMethodName();
            C10096b.C10097a.C10100c cVar = new C10096b.C10097a.C10100c(b);
            this.f27769b.put(cVar.mo21548a(), cVar.mo21549b());
            C10096b.C10097a.C10098a aVar = new C10096b.C10097a.C10098a(String.valueOf(currentTimeMillis));
            this.f27769b.put(aVar.mo21548a(), aVar.mo21549b());
            Intrinsics.checkNotNullExpressionValue(className3, "origin");
            C10096b.C10097a.C10099b bVar = new C10096b.C10097a.C10099b(className3);
            this.f27769b.put(bVar.mo21548a(), bVar.mo21549b());
            if (telemetryOption == TelemetryOption.METHOD || telemetryOption == TelemetryOption.PROPERTY) {
                mo21540b(new C10096b.C10101b.C10105d(C10108c.f27807j, String.valueOf(currentTimeMillis)));
                mo21540b(new C10096b.C10101b.C10105d("name", methodName));
            }
        }
    }

    /* renamed from: h */
    public final boolean mo21546h(TelemetryOption telemetryOption) {
        if (this.f27768a == TelemetryOption.NO_TRACKING.mo21522q() || (telemetryOption.mo21522q() & this.f27768a) != telemetryOption.mo21522q()) {
            return false;
        }
        return true;
    }

    public void stop() {
        if (this.f27769b.length() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            C10096b.C10101b.C10105d dVar = new C10096b.C10101b.C10105d(C10108c.f27807j, String.valueOf(currentTimeMillis));
            JSONObject a = ExtensionJsonKt.m38312a(this.f27769b, "a");
            if (a != null) {
                a.put(dVar.mo21550a(), currentTimeMillis - Long.parseLong(a.get(dVar.mo21550a()).toString()));
            }
            this.f27770c.invoke(this);
        }
    }
}
