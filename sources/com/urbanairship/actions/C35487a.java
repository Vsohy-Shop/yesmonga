package com.urbanairship.actions;

import androidx.annotation.C0359n0;
import com.urbanairship.C36059m;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.urbanairship.actions.a */
public abstract class C35487a {

    /* renamed from: a */
    public static final int f87508a = 0;

    /* renamed from: b */
    public static final int f87509b = 1;

    /* renamed from: c */
    public static final int f87510c = 2;

    /* renamed from: d */
    public static final int f87511d = 3;

    /* renamed from: e */
    public static final int f87512e = 4;

    /* renamed from: f */
    public static final int f87513f = 5;

    /* renamed from: g */
    public static final int f87514g = 6;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.actions.a$a */
    public @interface C35488a {
    }

    /* renamed from: a */
    public boolean mo17301a(@C0359n0 C35489b bVar) {
        return true;
    }

    /* renamed from: b */
    public void mo106345b(@C0359n0 C35489b bVar, @C0359n0 C35495f fVar) {
    }

    /* renamed from: c */
    public void mo106320c(@C0359n0 C35489b bVar) {
    }

    @C0359n0
    /* renamed from: d */
    public abstract C35495f mo17302d(@C0359n0 C35489b bVar);

    @C0359n0
    /* renamed from: e */
    public final C35495f mo106346e(@C0359n0 C35489b bVar) {
        try {
            if (!mo17301a(bVar)) {
                C36059m.m148406b("Action %s is unable to accept arguments: %s", this, bVar);
                return C35495f.m146457e(2);
            }
            C36059m.m148413i("Running action: %s arguments: %s", this, bVar);
            mo106320c(bVar);
            C35495f d = mo17302d(bVar);
            if (d == null) {
                d = C35495f.m146456d();
            }
            mo106345b(bVar, d);
            return d;
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to run action %s", this);
            return C35495f.m146458f(e);
        }
    }

    /* renamed from: f */
    public boolean mo18905f() {
        return false;
    }
}
