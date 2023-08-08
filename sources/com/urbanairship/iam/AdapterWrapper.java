package com.urbanairship.iam;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0348i1;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36059m;
import com.urbanairship.iam.assets.Assets;
import com.urbanairship.json.JsonValue;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class AdapterWrapper {

    /* renamed from: a */
    public final String f24656a;

    /* renamed from: b */
    public final JsonValue f24657b;

    /* renamed from: c */
    public final JsonValue f24658c;

    /* renamed from: d */
    public final InAppMessage f24659d;

    /* renamed from: e */
    public final C9207l f24660e;

    /* renamed from: f */
    public final C9173e f24661f;

    /* renamed from: g */
    public boolean f24662g = false;

    public static class DisplayException extends Exception {
        public DisplayException(String str, Exception exc) {
            super(str, exc);
        }
    }

    public AdapterWrapper(@C0359n0 String str, @C0363p0 JsonValue jsonValue, @C0363p0 JsonValue jsonValue2, @C0359n0 InAppMessage inAppMessage, @C0359n0 C9207l lVar, @C0359n0 C9173e eVar) {
        this.f24656a = str;
        this.f24657b = jsonValue == null ? JsonValue.f25436b : jsonValue;
        this.f24658c = jsonValue2 == null ? JsonValue.f25436b : jsonValue2;
        this.f24659d = inAppMessage;
        this.f24660e = lVar;
        this.f24661f = eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m34062f() {
        try {
            this.f24661f.mo18370c(this.f24659d);
        } catch (Exception e) {
            C36059m.m148411g(e, "AdapterWrapper - Exception during onDisplayFinished().", new Object[0]);
        }
    }

    @C0348i1
    /* renamed from: b */
    public void mo18158b(@C0359n0 Context context) {
        C36059m.m148406b("Adapter finished for schedule %s", this.f24656a);
        try {
            this.f24660e.mo18457a(context);
        } catch (Exception e) {
            C36059m.m148411g(e, "AdapterWrapper - Exception during finish().", new Object[0]);
        }
    }

    /* renamed from: c */
    public void mo18159c(@C0359n0 Context context) throws DisplayException {
        C36059m.m148406b("Displaying message for schedule %s", this.f24656a);
        this.f24662g = true;
        try {
            this.f24660e.mo18322b(context, new DisplayHandler(this.f24656a, this.f24659d.mo18189u(), this.f24657b, this.f24658c));
            this.f24661f.mo18371d(this.f24659d);
        } catch (Exception e) {
            throw new DisplayException("Adapter onDisplay(Activity, boolean, DisplayHandler) unexpected exception", e);
        }
    }

    @C0353k0
    /* renamed from: d */
    public void mo18160d() {
        C36059m.m148406b("Display finished for schedule %s", this.f24656a);
        new Handler(Looper.getMainLooper()).post(new C9126a(this));
    }

    /* renamed from: e */
    public boolean mo18161e(@C0359n0 Context context) {
        try {
            if (!this.f24660e.mo18323d(context) || !this.f24661f.mo18369a()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            C36059m.m148411g(e, "AdapterWrapper - Exception during isReady(Activity).", new Object[0]);
            return false;
        }
    }

    /* renamed from: g */
    public int mo18162g(@C0359n0 Context context, @C0359n0 Assets assets) {
        try {
            C36059m.m148406b("Preparing message for schedule %s", this.f24656a);
            return this.f24660e.mo18458c(context, assets);
        } catch (Exception e) {
            C36059m.m148411g(e, "AdapterWrapper - Exception during prepare(Context).", new Object[0]);
            return 1;
        }
    }
}
