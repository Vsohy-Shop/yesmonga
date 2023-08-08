package com.urbanairship.push;

import android.content.Context;
import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.core.app.C17180n4;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface AirshipNotificationManager {

    public enum PromptSupport {
        NOT_SUPPORTED,
        COMPAT,
        SUPPORTED
    }

    /* renamed from: com.urbanairship.push.AirshipNotificationManager$a */
    public class C9442a implements AirshipNotificationManager {

        /* renamed from: a */
        public final /* synthetic */ C17180n4 f25804a;

        /* renamed from: b */
        public final /* synthetic */ int f25805b;

        public C9442a(C17180n4 n4Var, int i) {
            this.f25804a = n4Var;
            this.f25805b = i;
        }

        /* renamed from: a */
        public boolean mo19147a() {
            return !this.f25804a.mo51597B().isEmpty();
        }

        /* renamed from: b */
        public boolean mo19148b() {
            return this.f25804a.mo51601a();
        }

        @C0359n0
        /* renamed from: d */
        public PromptSupport mo19149d() {
            if (Build.VERSION.SDK_INT < 33) {
                return PromptSupport.NOT_SUPPORTED;
            }
            if (this.f25805b >= 33) {
                return PromptSupport.SUPPORTED;
            }
            return PromptSupport.COMPAT;
        }
    }

    /* renamed from: c */
    static AirshipNotificationManager m35476c(@C0359n0 Context context) {
        return new C9442a(C17180n4.m79433p(context), context.getApplicationInfo().targetSdkVersion);
    }

    /* renamed from: a */
    boolean mo19147a();

    /* renamed from: b */
    boolean mo19148b();

    @C0359n0
    /* renamed from: d */
    PromptSupport mo19149d();
}
