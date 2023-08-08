package com.carrefour.fid.android.domain.models;

import androidx.compose.runtime.internal.C8567o;
import com.google.firebase.crashlytics.C32648f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.json.JSONObject;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.domain.models.m */
public final class C38049m {

    /* renamed from: c */
    public static final int f95935c = 8;
    @C12579k

    /* renamed from: a */
    public final String f95936a;
    @C12579k

    /* renamed from: b */
    public final JSONObject f95937b;

    public C38049m(@C12579k String str, @C12579k JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(str, "storeRef");
        Intrinsics.checkNotNullParameter(jSONObject, C32648f.f79206e);
        this.f95936a = str;
        this.f95937b = jSONObject;
    }

    /* renamed from: d */
    public static /* synthetic */ C38049m m156940d(C38049m mVar, String str, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mVar.f95936a;
        }
        if ((i & 2) != 0) {
            jSONObject = mVar.f95937b;
        }
        return mVar.mo117919c(str, jSONObject);
    }

    @C12579k
    /* renamed from: a */
    public final String mo117917a() {
        return this.f95936a;
    }

    @C12579k
    /* renamed from: b */
    public final JSONObject mo117918b() {
        return this.f95937b;
    }

    @C12579k
    /* renamed from: c */
    public final C38049m mo117919c(@C12579k String str, @C12579k JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(str, "storeRef");
        Intrinsics.checkNotNullParameter(jSONObject, C32648f.f79206e);
        return new C38049m(str, jSONObject);
    }

    @C12579k
    /* renamed from: e */
    public final JSONObject mo117920e() {
        return this.f95937b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38049m)) {
            return false;
        }
        C38049m mVar = (C38049m) obj;
        return Intrinsics.areEqual((Object) this.f95936a, (Object) mVar.f95936a) && Intrinsics.areEqual((Object) this.f95937b, (Object) mVar.f95937b);
    }

    @C12579k
    /* renamed from: f */
    public final String mo117922f() {
        return this.f95936a;
    }

    public int hashCode() {
        return (this.f95936a.hashCode() * 31) + this.f95937b.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f95936a;
        JSONObject jSONObject = this.f95937b;
        return "FeedbackModel(storeRef=" + str + ", params=" + jSONObject + ")";
    }
}
