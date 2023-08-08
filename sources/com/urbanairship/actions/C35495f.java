package com.urbanairship.actions;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.urbanairship.actions.f */
public final class C35495f {

    /* renamed from: d */
    public static final int f87533d = 1;

    /* renamed from: e */
    public static final int f87534e = 2;

    /* renamed from: f */
    public static final int f87535f = 3;

    /* renamed from: g */
    public static final int f87536g = 4;
    @C0363p0

    /* renamed from: a */
    public final Exception f87537a;
    @C0359n0

    /* renamed from: b */
    public final ActionValue f87538b;

    /* renamed from: c */
    public final int f87539c;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.actions.f$a */
    public @interface C35496a {
    }

    public C35495f(@C0363p0 ActionValue actionValue, @C0363p0 Exception exc, int i) {
        this.f87538b = actionValue == null ? new ActionValue() : actionValue;
        this.f87537a = exc;
        this.f87539c = i;
    }

    @C0359n0
    /* renamed from: d */
    public static C35495f m146456d() {
        return new C35495f((ActionValue) null, (Exception) null, 1);
    }

    @C0359n0
    /* renamed from: e */
    public static C35495f m146457e(int i) {
        return new C35495f((ActionValue) null, (Exception) null, i);
    }

    @C0359n0
    /* renamed from: f */
    public static C35495f m146458f(@C0363p0 Exception exc) {
        return new C35495f((ActionValue) null, exc, 4);
    }

    @C0359n0
    /* renamed from: g */
    public static C35495f m146459g(@C0363p0 ActionValue actionValue) {
        return new C35495f(actionValue, (Exception) null, 1);
    }

    @C0363p0
    /* renamed from: a */
    public Exception mo106369a() {
        return this.f87537a;
    }

    /* renamed from: b */
    public int mo106370b() {
        return this.f87539c;
    }

    @C0359n0
    /* renamed from: c */
    public ActionValue mo106371c() {
        return this.f87538b;
    }
}
