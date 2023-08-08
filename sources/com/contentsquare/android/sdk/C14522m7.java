package com.contentsquare.android.sdk;

import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.contentsquare.android.sdk.m7 */
public class C14522m7 {

    /* renamed from: a */
    public boolean f35923a = false;

    /* renamed from: b */
    public int f35924b;

    /* renamed from: c */
    public C14250c9 f35925c;

    /* renamed from: d */
    public int f35926d;

    /* renamed from: e */
    public double f35927e;

    /* renamed from: f */
    public double f35928f;

    /* renamed from: a */
    public Boolean mo35905a() {
        C14250c9 c9Var = this.f35925c;
        if (c9Var == null) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(c9Var.mo34853a().contains(">WebView") || this.f35925c.mo34853a().contains(">RNCWebView") || this.f35925c.mo34853a().contains(">FlutterView"));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GestureResult{unresponsive=");
        sb.append(this.f35923a);
        sb.append(", gesture=");
        sb.append(this.f35924b);
        sb.append(", pathDescriptor=");
        C14250c9 c9Var = this.f35925c;
        sb.append(c9Var != null ? c9Var.mo34853a() : "");
        sb.append(", fingerDirection=");
        sb.append(this.f35926d);
        sb.append(", gestureDistance=");
        sb.append(this.f35927e);
        sb.append(", gestureVelocity=");
        sb.append(this.f35928f);
        sb.append(C12361b.f30259j);
        return sb.toString();
    }
}
