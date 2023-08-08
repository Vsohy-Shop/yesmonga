package com.contentsquare.android.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.urbanairship.iam.events.C9175a;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.q7 */
public final class C14643q7 extends C14559nf {

    /* renamed from: b */
    public static final C14644a f36263b = new C14644a((DefaultConstructorMarker) null);

    /* renamed from: com.contentsquare.android.sdk.q7$a */
    public static final class C14644a {
        public C14644a() {
        }

        public /* synthetic */ C14644a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14643q7(Context context) {
        super(context, "cs");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: m */
    public final boolean mo36234m() {
        SharedPreferences.Editor edit = mo35996c().edit();
        SharedPreferences c = mo35996c();
        Intrinsics.checkNotNullExpressionValue(c, "sharedPreferences");
        for (Map.Entry key : c.getAll().entrySet()) {
            edit.remove((String) key.getKey());
        }
        edit.apply();
        return true;
    }
}
