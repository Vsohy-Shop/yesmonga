package com.urbanairship.iam.layout;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.core.util.C17992m;
import com.urbanairship.android.layout.C35699j;
import com.urbanairship.android.layout.info.C35696x;
import com.urbanairship.iam.C9166d;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;

/* renamed from: com.urbanairship.iam.layout.e */
public class C9219e implements C9166d {

    /* renamed from: c */
    public static final String f25096c = "layout";

    /* renamed from: a */
    public final JsonValue f25097a;

    /* renamed from: b */
    public final C35696x f25098b;

    public C9219e(@C0359n0 JsonValue jsonValue, @C0359n0 C35696x xVar) {
        this.f25097a = jsonValue;
        this.f25098b = xVar;
    }

    @C0359n0
    /* renamed from: a */
    public static C9219e m34616a(@C0359n0 JsonValue jsonValue) throws JsonException {
        C35696x xVar = new C35696x(jsonValue.mo18749A().mo18801A("layout").mo18749A());
        if (C35699j.m147208c(xVar)) {
            return new C9219e(jsonValue, xVar);
        }
        throw new JsonException("Invalid payload.");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: b */
    public C35696x mo18512b() {
        return this.f25098b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C17992m.m81740a(this.f25097a, ((C9219e) obj).f25097a);
    }

    public int hashCode() {
        return C17992m.m81741b(this.f25097a);
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return this.f25097a;
    }
}
